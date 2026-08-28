import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuh extends fvi {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final wp a = wp.c("connect.aborted");
   public static final wp b = wp.a("disconnect.genericReason", wp.c("disconnect.unknownHost"));
   @Nullable
   volatile vi u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fvi x;
   private wp y = wp.c("connect.connecting");
   private long z = -1L;
   final wp A;

   private fuh(fvi $$0, wp $$1) {
      super(flx.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fvi $$0, fmg $$1, giq $$2, ghn $$3, boolean $$4, @Nullable ghr $$5) {
      if ($$1.z instanceof fuh) {
         d.error("Attempt to connect while already connecting");
      } else {
         wp $$6;
         if ($$5 != null) {
            $$6 = wo.q;
         } else if ($$4) {
            $$6 = gmc.a;
         } else {
            $$6 = wo.r;
         }

         fuh $$9 = new fuh($$0, $$6);
         if ($$5 != null) {
            $$9.a(wp.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(gie.a($$3.b));
         $$1.bc().a(gmd.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fmg $$0, final giq $$1, final ghn $$2, @Nullable final ghr $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fuh.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gis.a.a($$1).map(gip::d);
               if (fuh.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fup(fuh.this.x, fuh.this.A, fuh.b)));
                  return;
               }

               $$0 = $$1.get();
               vi $$2;
               synchronized (fuh.this) {
                  if (fuh.this.w) {
                     return;
                  }

                  $$2 = new vi(yx.b);
                  $$2.a($$0.aQ().n());
                  fuh.this.v = vi.a($$0, $$0.n.aD(), $$2);
               }

               fuh.this.v.syncUninterruptibly();
               synchronized (fuh.this) {
                  if (fuh.this.w) {
                     $$2.a(fuh.a);
                     return;
                  }

                  fuh.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fuh.this.u
                  .a($$0.getHostName(), $$0.getPort(), aiw.b, aiw.d, new ggx(fuh.this.u, $$0, $$2, fuh.this.x, false, null, fuh.this::a, $$3), $$3 != null);
               fuh.this.u.a(new aiz($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fuh.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fuh.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fup(fuh.this.x, fuh.this.A, wp.a("disconnect.genericReason", $$8))));
            }
         }

         private static hiu.c a(ghn.a $$0x) {
            return switch ($$0) {
               case a -> hiu.c.b;
               case b -> hiu.c.c;
               case c -> hiu.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wp $$0) {
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
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aR_() {
      this.c(fpq.a(wo.e, $$0 -> {
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

         this.m.a(this.x);
      }).a(this.n / 2 - 100, this.o / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wp.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
