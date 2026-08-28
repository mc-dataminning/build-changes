import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpc extends fqd {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xd a = xd.c("connect.aborted");
   public static final xd b = xd.a("disconnect.genericReason", xd.c("disconnect.unknownHost"));
   @Nullable
   volatile vx u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fqd x;
   private xd y = xd.c("connect.connecting");
   private long z = -1L;
   final xd A;

   private fpc(fqd $$0, xd $$1) {
      super(fic.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fqd $$0, fil $$1, gcy $$2, gbv $$3, boolean $$4, @Nullable gbz $$5) {
      if ($$1.z instanceof fpc) {
         d.error("Attempt to connect while already connecting");
      } else {
         xd $$6;
         if ($$5 != null) {
            $$6 = xc.q;
         } else if ($$4) {
            $$6 = ggj.a;
         } else {
            $$6 = xc.r;
         }

         fpc $$9 = new fpc($$0, $$6);
         if ($$5 != null) {
            $$9.a(xd.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(gcm.a($$3.b));
         $$1.bd().a(ggk.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fil $$0, final gcy $$1, final gbv $$2, @Nullable final gbz $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fpc.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gda.a.a($$1).map(gcx::d);
               if (fpc.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fpk(fpc.this.x, fpc.this.A, fpc.b)));
                  return;
               }

               $$0 = $$1.get();
               vx $$2;
               synchronized (fpc.this) {
                  if (fpc.this.w) {
                     return;
                  }

                  $$2 = new vx(zl.b);
                  $$2.a($$0.aR().n());
                  fpc.this.v = vx.a($$0, $$0.n.aC(), $$2);
               }

               fpc.this.v.syncUninterruptibly();
               synchronized (fpc.this) {
                  if (fpc.this.w) {
                     $$2.a(fpc.a);
                     return;
                  }

                  fpc.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fpc.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajf.b, ajf.d, new gbg(fpc.this.u, $$0, $$2, fpc.this.x, false, null, fpc.this::a, $$3), $$3 != null);
               fpc.this.u.a(new aji($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fpc.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fpc.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fpk(fpc.this.x, fpc.this.A, xd.a("disconnect.genericReason", $$8))));
            }
         }

         private static hab.c a(gbv.a $$0x) {
            return switch ($$0) {
               case a -> hab.c.b;
               case b -> hab.c.c;
               case c -> hab.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xd $$0) {
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
   protected void aR_() {
      this.c(fkk.a(xc.e, $$0 -> {
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
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ad.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xd.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
