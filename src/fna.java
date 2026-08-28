import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fna extends fob {
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
   final fob x;
   private wz y = wz.c("connect.connecting");
   private long z = -1L;
   final wz A;

   private fna(fob $$0, wz $$1) {
      super(fge.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fob $$0, fgm $$1, gav $$2, fzr $$3, boolean $$4, @Nullable fzw $$5) {
      if ($$1.y instanceof fna) {
         r.error("Attempt to connect while already connecting");
      } else {
         wz $$6;
         if ($$5 != null) {
            $$6 = wy.q;
         } else if ($$4) {
            $$6 = geg.a;
         } else {
            $$6 = wy.r;
         }

         fna $$9 = new fna($$0, $$6);
         if ($$5 != null) {
            $$9.a(wz.c("connect.transferring"));
         }

         $$1.y();
         $$1.aR();
         $$1.a(gaj.a($$3.b));
         $$1.aZ().a(geh.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fgm $$0, final gav $$1, final fzr $$2, @Nullable final fzw $$3) {
      r.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fna.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gax.a.a($$1).map(gau::d);
               if (fna.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fni(fna.this.x, fna.this.A, fna.b)));
                  return;
               }

               $$0 = $$1.get();
               vt $$2;
               synchronized (fna.this) {
                  if (fna.this.w) {
                     return;
                  }

                  $$2 = new vt(zh.b);
                  $$2.a($$0.aN().n());
                  fna.this.v = vt.a($$0, $$0.m.az(), $$2);
               }

               fna.this.v.syncUninterruptibly();
               synchronized (fna.this) {
                  if (fna.this.w) {
                     $$2.a(fna.a);
                     return;
                  }

                  fna.this.u = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fna.this.u
                  .a($$0.getHostName(), $$0.getPort(), aiv.b, aiv.d, new fzc(fna.this.u, $$0, $$2, fna.this.x, false, null, fna.this::a, $$3), $$3 != null);
               fna.this.u.a(new aiy($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fna.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fna.r.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fni(fna.this.x, fna.this.A, wz.a("disconnect.genericReason", $$8))));
            }
         }

         private static gte.c a(fzr.a $$0x) {
            return switch ($$0) {
               case a -> gte.c.b;
               case b -> gte.c.c;
               case c -> gte.c.a;
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
      this.c(fik.a(wy.e, $$0 -> {
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
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.l.aV().c(wz.c("narrator.joining"));
      }

      $$0.a(this.o, this.y, this.m / 2, this.n / 2 - 50, 16777215);
   }
}
