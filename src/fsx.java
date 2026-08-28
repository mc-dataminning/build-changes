import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsx extends fty {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xv a = xv.c("connect.aborted");
   public static final xv b = xv.a("disconnect.genericReason", xv.c("disconnect.unknownHost"));
   @Nullable
   volatile wp u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fty x;
   private xv y = xv.c("connect.connecting");
   private long z = -1L;
   final xv A;

   private fsx(fty $$0, xv $$1) {
      super(flx.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fty $$0, fmg $$1, ghc $$2, gfz $$3, boolean $$4, @Nullable ggd $$5) {
      if ($$1.z instanceof fsx) {
         d.error("Attempt to connect while already connecting");
      } else {
         xv $$6;
         if ($$5 != null) {
            $$6 = xu.q;
         } else if ($$4) {
            $$6 = gko.a;
         } else {
            $$6 = xu.r;
         }

         fsx $$9 = new fsx($$0, $$6);
         if ($$5 != null) {
            $$9.a(xv.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(ggq.a($$3.b));
         $$1.bd().a(gkp.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fmg $$0, final ghc $$1, final gfz $$2, @Nullable final ggd $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fsx.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ghe.a.a($$1).map(ghb::d);
               if (fsx.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ftf(fsx.this.x, fsx.this.A, fsx.b)));
                  return;
               }

               $$0 = $$1.get();
               wp $$2;
               synchronized (fsx.this) {
                  if (fsx.this.w) {
                     return;
                  }

                  $$2 = new wp(aad.b);
                  $$2.a($$0.aQ().n());
                  fsx.this.v = wp.a($$0, $$0.n.aD(), $$2);
               }

               fsx.this.v.syncUninterruptibly();
               synchronized (fsx.this) {
                  if (fsx.this.w) {
                     $$2.a(fsx.a);
                     return;
                  }

                  fsx.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fsx.this.u
                  .a($$0.getHostName(), $$0.getPort(), akb.b, akb.d, new gfj(fsx.this.u, $$0, $$2, fsx.this.x, false, null, fsx.this::a, $$3), $$3 != null);
               fsx.this.u.a(new ake($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fsx.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fsx.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ftf(fsx.this.x, fsx.this.A, xv.a("disconnect.genericReason", $$8))));
            }
         }

         private static heo.c a(gfz.a $$0x) {
            return switch ($$0) {
               case a -> heo.c.b;
               case b -> heo.c.c;
               case c -> heo.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xv $$0) {
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
   public boolean aH_() {
      return false;
   }

   @Override
   protected void aT_() {
      this.c(fof.a(xu.e, $$0 -> {
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
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xv.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
