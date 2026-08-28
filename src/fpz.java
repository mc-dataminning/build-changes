import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpz extends fra {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long s = 2000L;
   public static final xi a = xi.c("connect.aborted");
   public static final xi b = xi.a("disconnect.genericReason", xi.c("disconnect.unknownHost"));
   @Nullable
   volatile wc u;
   @Nullable
   ChannelFuture v;
   volatile boolean w;
   final fra x;
   private xi y = xi.c("connect.connecting");
   private long z = -1L;
   final xi A;

   private fpz(fra $$0, xi $$1) {
      super(fiz.a);
      this.x = $$0;
      this.A = $$1;
   }

   public static void a(fra $$0, fji $$1, gdz $$2, gcw $$3, boolean $$4, @Nullable gda $$5) {
      if ($$1.z instanceof fpz) {
         d.error("Attempt to connect while already connecting");
      } else {
         xi $$6;
         if ($$5 != null) {
            $$6 = xh.q;
         } else if ($$4) {
            $$6 = ghk.a;
         } else {
            $$6 = xh.r;
         }

         fpz $$9 = new fpz($$0, $$6);
         if ($$5 != null) {
            $$9.a(xi.c("connect.transferring"));
         }

         $$1.y();
         $$1.aV();
         $$1.a(gdn.a($$3.b));
         $$1.bd().a(ghl.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fji $$0, final gdz $$1, final gcw $$2, @Nullable final gda $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fpz.this.w) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = geb.a.a($$1).map(gdy::d);
               if (fpz.this.w) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fqh(fpz.this.x, fpz.this.A, fpz.b)));
                  return;
               }

               $$0 = $$1.get();
               wc $$2;
               synchronized (fpz.this) {
                  if (fpz.this.w) {
                     return;
                  }

                  $$2 = new wc(zq.b);
                  $$2.a($$0.aQ().n());
                  fpz.this.v = wc.a($$0, $$0.n.aC(), $$2);
               }

               fpz.this.v.syncUninterruptibly();
               synchronized (fpz.this) {
                  if (fpz.this.w) {
                     $$2.a(fpz.a);
                     return;
                  }

                  fpz.this.u = $$2;
                  $$0.af().a($$2, a($$2.b()));
               }

               fpz.this.u
                  .a($$0.getHostName(), $$0.getPort(), ajk.b, ajk.d, new gch(fpz.this.u, $$0, $$2, fpz.this.x, false, null, fpz.this::a, $$3), $$3 != null);
               fpz.this.u.a(new ajn($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fpz.this.w) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fpz.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fqh(fpz.this.x, fpz.this.A, xi.a("disconnect.genericReason", $$8))));
            }
         }

         private static hbg.c a(gcw.a $$0x) {
            return switch ($$0) {
               case a -> hbg.c.b;
               case b -> hbg.c.c;
               case c -> hbg.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(xi $$0) {
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
      this.c(flh.a(xh.e, $$0 -> {
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
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.z > 2000L) {
         this.z = $$4;
         this.m.aZ().c(xi.c("narrator.joining"));
      }

      $$0.a(this.p, this.y, this.n / 2, this.o / 2 - 50, 16777215);
   }
}
