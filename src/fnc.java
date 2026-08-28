import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnc extends fod {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger r = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wz a = wz.c("connect.aborted");
   public static final wz b = wz.a("disconnect.genericReason", wz.c("disconnect.unknownHost"));
   @Nullable
   volatile vt u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fod x;
   private wz y = wz.c("connect.connecting");
   private long z = -1L;
   final wz A;

   private fnc(fod $$0, wz $$1) {
      super(fgg.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fod $$0, fgo $$1, gax $$2, fzt $$3, boolean $$4, @Nullable fzy $$5) {
      if ($$1.y instanceof fnc) {
         r.error("Attempt to connect while already connecting");
      } else {
         wz $$6;
         if ($$5 != null) {
            $$6 = wy.q;
         } else if ($$4) {
            $$6 = gei.a;
         } else {
            $$6 = wy.r;
         }

         fnc $$9 = new fnc($$0, $$6);
         if ($$5 != null) {
            $$9.a(wz.c("connect.transferring"));
         }

         $$1.y();
         $$1.aR();
         $$1.a(gal.a($$3.b));
         $$1.aZ().a(gej.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fgo $$0, final gax $$1, final fzt $$2, @Nullable final fzy $$3) {
      r.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fnc.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gaz.a.a($$1).map(gaw::d);
               if (fnc.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fnk(fnc.this.x, fnc.this.A, fnc.b)));
                  return;
               }

               $$0 = $$1.get();
               vt $$2;
               synchronized (fnc.this) {
                  if (fnc.this.w) {
                     return;
                  }

                  $$2 = new vt(zh.b);
                  $$2.a($$0.aN().n());
                  fnc.this.v = vt.a($$0, $$0.m.aA(), $$2);
               }

               fnc.this.v.syncUninterruptibly();
               synchronized (fnc.this) {
                  if (fnc.this.w) {
                     $$2.a(fnc.a);
                     return;
                  }

                  fnc.this.u = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fnc.this.u
                  .a($$0.getHostName(), $$0.getPort(), aiv.b, aiv.d, new fze(fnc.this.u, $$0, $$2, fnc.this.x, false, null, fnc.this::a, $$3), $$3 != null);
               fnc.this.u.a(new aiy($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fnc.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fnc.r.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fnk(fnc.this.x, fnc.this.A, wz.a("disconnect.genericReason", $$8))));
            }
         }

         private static gtg.c a(fzt.a $$0x) {
            return switch ($$0) {
               case a -> gtg.c.b;
               case b -> gtg.c.c;
               case c -> gtg.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(r));
      $$4.start();
   }

   private void a(wz $$0) {
      this.y = $$0;
   }

   @Override
   public void e() {
      if (this.u != null) {
         if (this.u.i()) {
            this.u.b();
         } else {
            this.u.n();
         }
      }
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.c(fim.a(wy.e, $$0 -> {
         synchronized (this) {
            this.w = true;
            if (this.v != null) {
               this.v.cancel(true);
               this.v = null;
            }

            if (this.u != null) {
               this.u.a(a);
            }
         }

         this.l.a(this.x);
      }).a(this.m / 2 - 100, this.n / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.l.aV().c(wz.c("narrator.joining"));
      }

      $$0.a(this.o, this.y, this.m / 2, this.n / 2 - 50, 16777215);
   }
}
