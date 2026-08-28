import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqv extends frw {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xj a = xj.c("connect.aborted");
   public static final xj b = xj.a("disconnect.genericReason", xj.c("disconnect.unknownHost"));
   @Nullable
   volatile wd u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final frw x;
   private xj y = xj.c("connect.connecting");
   private long z = -1L;
   final xj A;

   private fqv(frw $$0, xj $$1) {
      super(fjv.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(frw $$0, fke $$1, gey $$2, gdv $$3, boolean $$4, @Nullable gdz $$5) {
      if ($$1.z instanceof fqv) {
         d.error("Attempt to connect while already connecting");
      } else {
         xj $$6;
         if ($$5 != null) {
            $$6 = xi.q;
         } else if ($$4) {
            $$6 = gij.a;
         } else {
            $$6 = xi.r;
         }

         fqv $$9 = new fqv($$0, $$6);
         if ($$5 != null) {
            $$9.a(xj.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(gem.a($$3.b));
         $$1.bd().a(gik.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fke $$0, final gey $$1, final gdv $$2, @Nullable final gdz $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fqv.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = gfa.a.a($$1).map(gex::d);
               if (fqv.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new frd(fqv.this.x, fqv.this.A, fqv.b)));
                  return;
               }

               $$0 = $$1.get();
               wd $$2;
               synchronized (fqv.this) {
                  if (fqv.this.w) {
                     return;
                  }

                  $$2 = new wd(zr.b);
                  $$2.a($$0.aQ().n());
                  fqv.this.v = wd.a($$0, $$0.n.aC(), $$2);
               }

               fqv.this.v.syncUninterruptibly();
               synchronized (fqv.this) {
                  if (fqv.this.w) {
                     $$2.a(fqv.a);
                     return;
                  }

                  fqv.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fqv.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajl.b, ajl.d, new gdg(fqv.this.u, $$0, $$2, fqv.this.x, false, null, fqv.this::a, $$3), $$3 != null);
               fqv.this.u.a(new ajo($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fqv.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fqv.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new frd(fqv.this.x, fqv.this.A, xj.a("disconnect.genericReason", $$8))));
            }
         }

         private static hch.c a(gdv.a $$0x) {
            return switch ($$0) {
               case a -> hch.c.b;
               case b -> hch.c.c;
               case c -> hch.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xj $$0) {
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
      this.c(fmd.a(xi.e, $$0 -> {
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
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xj.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
