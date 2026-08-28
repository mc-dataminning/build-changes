import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftl extends fum {
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
   final fum x;
   private wp y = wp.c("connect.connecting");
   private long z = -1L;
   final wp A;

   private ftl(fum $$0, wp $$1) {
      super(flb.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fum $$0, flk $$1, ghs $$2, ggp $$3, boolean $$4, @Nullable ggt $$5) {
      if ($$1.z instanceof ftl) {
         d.error("Attempt to connect while already connecting");
      } else {
         wp $$6;
         if ($$5 != null) {
            $$6 = wo.q;
         } else if ($$4) {
            $$6 = gle.a;
         } else {
            $$6 = wo.r;
         }

         ftl $$9 = new ftl($$0, $$6);
         if ($$5 != null) {
            $$9.a(wp.c("connect.transferring"));
         }

         $$1.y();
         $$1.aU();
         $$1.a(ghg.a($$3.b));
         $$1.bc().a(glf.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final flk $$0, final ghs $$1, final ggp $$2, @Nullable final ggt $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ftl.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ghu.a.a($$1).map(ghr::d);
               if (ftl.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new ftt(ftl.this.x, ftl.this.A, ftl.b)));
                  return;
               }

               $$0 = $$1.get();
               vi $$2;
               synchronized (ftl.this) {
                  if (ftl.this.w) {
                     return;
                  }

                  $$2 = new vi(yx.b);
                  $$2.a($$0.aQ().n());
                  ftl.this.v = vi.a($$0, $$0.n.aD(), $$2);
               }

               ftl.this.v.syncUninterruptibly();
               synchronized (ftl.this) {
                  if (ftl.this.w) {
                     $$2.a(ftl.a);
                     return;
                  }

                  ftl.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               ftl.this.u
                  .a($$0.getHostName(), $$0.getPort(), aix.b, aix.d, new gfz(ftl.this.u, $$0, $$2, ftl.this.x, false, null, ftl.this::a, $$3), $$3 != null);
               ftl.this.u.a(new aja($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (ftl.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ftl.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new ftt(ftl.this.x, ftl.this.A, wp.a("disconnect.genericReason", $$8))));
            }
         }

         private static hhw.c a(ggp.a $$0x) {
            return switch ($$0) {
               case a -> hhw.c.b;
               case b -> hhw.c.c;
               case c -> hhw.c.a;
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
      this.c(fou.a(wo.e, $$0 -> {
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
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = af.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aY().c(wp.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
