import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fnf extends fon {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long r = 2000L;
   public static final xe a = xe.c("connect.aborted");
   public static final xe b = xe.a("disconnect.genericReason", xe.c("disconnect.unknownHost"));
   @Nullable
   volatile wc s;
   @Nullable
   ChannelFuture u;
   volatile boolean v;
   final fon w;
   private xe x = xe.c("connect.connecting");
   private long y = -1L;
   final xe z;

   private fnf(fon $$0, xe $$1) {
      super(fgb.a);
      this.w = $$0;
      this.z = $$1;
   }

   public static void a(fon $$0, fgj $$1, gbe $$2, gab $$3, boolean $$4, @Nullable gaf $$5) {
      if ($$1.y instanceof fnf) {
         d.error("Attempt to connect while already connecting");
      } else {
         xe $$6;
         if ($$5 != null) {
            $$6 = xd.q;
         } else if ($$4) {
            $$6 = gep.a;
         } else {
            $$6 = xd.r;
         }

         fnf $$9 = new fnf($$0, $$6);
         if ($$5 != null) {
            $$9.a(xe.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gas.a($$3.b));
         $$1.bd().a(geq.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fgj $$0, final gbe $$1, final gab $$2, @Nullable final gaf $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fnf.this.v) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gbg.a.a($$1).map(gbd::d);
               if (fnf.this.v) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fnn(fnf.this.w, fnf.this.z, fnf.b)));
                  return;
               }

               $$0 = $$1.get();
               wc $$2;
               synchronized (fnf.this) {
                  if (fnf.this.v) {
                     return;
                  }

                  $$2 = new wc(zm.b);
                  $$2.a($$0.aQ().n());
                  fnf.this.u = wc.a($$0, $$0.m.az(), $$2);
               }

               fnf.this.u.syncUninterruptibly();
               synchronized (fnf.this) {
                  if (fnf.this.v) {
                     $$2.a(fnf.a);
                     return;
                  }

                  fnf.this.s = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fnf.this.s
                  .a($$0.getHostName(), $$0.getPort(), aix.a, aix.b, new fzm(fnf.this.s, $$0, $$2, fnf.this.w, false, null, fnf.this::a, $$3), $$3 != null);
               fnf.this.s.a(new aja($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fnf.this.v) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fnf.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fnn(fnf.this.w, fnf.this.z, xe.a("disconnect.genericReason", $$8))));
            }
         }

         private static gts.c a(gab.a $$0x) {
            return switch ($$0) {
               case a -> gts.c.b;
               case b -> gts.c.c;
               case c -> gts.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xe $$0) {
      this.x = $$0;
   }

   @Override
   public void e() {
      if (this.s != null) {
         if (this.s.i()) {
            this.s.b();
         } else {
            this.s.n();
         }
      }
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.c(fin.a(xd.e, $$0 -> {
         synchronized (this) {
            this.v = true;
            if (this.u != null) {
               this.u.cancel(true);
               this.u = null;
            }

            if (this.s != null) {
               this.s.a(a);
            }
         }

         this.m.a(this.w);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.b();
      if ($$4 - this.y > 2000L) {
         this.y = $$4;
         this.m.aZ().c(xe.c("narrator.joining"));
      }

      $$0.a(this.p, this.x, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
