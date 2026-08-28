import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqo extends frp {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xl a = xl.c("connect.aborted");
   public static final xl b = xl.a("disconnect.genericReason", xl.c("disconnect.unknownHost"));
   @Nullable
   volatile wf u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final frp x;
   private xl y = xl.c("connect.connecting");
   private long z = -1L;
   final xl A;

   private fqo(frp $$0, xl $$1) {
      super(fjo.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(frp $$0, fjx $$1, gep $$2, gdm $$3, boolean $$4, @Nullable gdq $$5) {
      if ($$1.z instanceof fqo) {
         d.error("Attempt to connect while already connecting");
      } else {
         xl $$6;
         if ($$5 != null) {
            $$6 = xk.q;
         } else if ($$4) {
            $$6 = gia.a;
         } else {
            $$6 = xk.r;
         }

         fqo $$9 = new fqo($$0, $$6);
         if ($$5 != null) {
            $$9.a(xl.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(ged.a($$3.b));
         $$1.bd().a(gib.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fjx $$0, final gep $$1, final gdm $$2, @Nullable final gdq $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fqo.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = ger.a.a($$1).map(geo::d);
               if (fqo.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fqw(fqo.this.x, fqo.this.A, fqo.b)));
                  return;
               }

               $$0 = $$1.get();
               wf $$2;
               synchronized (fqo.this) {
                  if (fqo.this.w) {
                     return;
                  }

                  $$2 = new wf(zt.b);
                  $$2.a($$0.aQ().n());
                  fqo.this.v = wf.a($$0, $$0.n.aC(), $$2);
               }

               fqo.this.v.syncUninterruptibly();
               synchronized (fqo.this) {
                  if (fqo.this.w) {
                     $$2.a(fqo.a);
                     return;
                  }

                  fqo.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fqo.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajn.b, ajn.d, new gcx(fqo.this.u, $$0, $$2, fqo.this.x, false, null, fqo.this::a, $$3), $$3 != null);
               fqo.this.u.a(new ajq($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fqo.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fqo.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fqw(fqo.this.x, fqo.this.A, xl.a("disconnect.genericReason", $$8))));
            }
         }

         private static hbw.c a(gdm.a $$0x) {
            return switch ($$0) {
               case a -> hbw.c.b;
               case b -> hbw.c.c;
               case c -> hbw.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xl $$0) {
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
   protected void aS_() {
      this.c(flw.a(xk.e, $$0 -> {
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
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xl.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
