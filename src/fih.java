import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fih extends fjo {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger d = LogUtils.getLogger();
   private static final long o = 2000L;
   public static final wg a = wg.c("connect.aborted");
   public static final wg b = wg.a("disconnect.genericReason", wg.c("disconnect.unknownHost"));
   @Nullable
   volatile ve p;
   @Nullable
   ChannelFuture q;
   volatile boolean r;
   final fjo s;
   private wg u = wg.c("connect.connecting");
   private long v = -1L;
   final wg w;

   private fih(fjo $$0, wg $$1) {
      super(fbh.a);
      this.s = $$0;
      this.w = $$1;
   }

   public static void a(fjo $$0, fbp $$1, fvy $$2, fuv $$3, boolean $$4, @Nullable fuz $$5) {
      if ($$1.y instanceof fih) {
         d.error("Attempt to connect while already connecting");
      } else {
         wg $$6;
         if ($$5 != null) {
            $$6 = wf.q;
         } else if ($$4) {
            $$6 = fzi.a;
         } else {
            $$6 = wf.r;
         }

         fih $$9 = new fih($$0, $$6);
         if ($$5 != null) {
            $$9.a(wg.c("connect.transferring"));
         }

         $$1.y();
         $$1.aT();
         $$1.a(fvm.a($$3.b));
         $$1.bc().a(fzj.c.b, $$3.b, $$3.a);
         $$1.a($$9);
         $$9.a($$1, $$2, $$3, $$5);
      }
   }

   private void a(final fbp $$0, final fvy $$1, final fuv $$2, @Nullable final fuz $$3) {
      d.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$4 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fih.this.r) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fwa.a.a($$1).map(fvx::d);
               if (fih.this.r) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fip(fih.this.s, fih.this.w, fih.b)));
                  return;
               }

               $$0 = $$1.get();
               ve $$2;
               synchronized (fih.this) {
                  if (fih.this.r) {
                     return;
                  }

                  $$2 = new ve(yo.b);
                  $$2.a($$0.aP().n());
                  fih.this.q = ve.a($$0, $$0.m.az(), $$2);
               }

               fih.this.q.syncUninterruptibly();
               synchronized (fih.this) {
                  if (fih.this.r) {
                     $$2.a(fih.a);
                     return;
                  }

                  fih.this.p = $$2;
                  $$0.ae().a($$2, a($$2.b()));
               }

               fih.this.p
                  .a($$0.getHostName(), $$0.getPort(), ahx.a, ahx.b, new fug(fih.this.p, $$0, $$2, fih.this.s, false, null, fih.this::a, $$3), $$3 != null);
               fih.this.p.a(new aia($$0.X().c(), $$0.X().b()));
            } catch (Exception var9) {
               if (fih.this.r) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fih.d.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fip(fih.this.s, fih.this.w, wg.a("disconnect.genericReason", $$8))));
            }
         }

         private static goc.c a(fuv.a $$0x) {
            return switch ($$0) {
               case a -> goc.c.b;
               case b -> goc.c.c;
               case c -> goc.c.a;
            };
         }
      };
      $$4.setUncaughtExceptionHandler(new r(d));
      $$4.start();
   }

   private void a(wg $$0) {
      this.u = $$0;
   }

   @Override
   public void e() {
      if (this.p != null) {
         if (this.p.i()) {
            this.p.b();
         } else {
            this.p.n();
         }
      }
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.c(fdp.a(wf.e, $$0 -> {
         synchronized (this) {
            this.r = true;
            if (this.q != null) {
               this.q.cancel(true);
               this.q = null;
            }

            if (this.p != null) {
               this.p.a(a);
            }
         }

         this.j.a(this.s);
      }).a(this.k / 2 - 100, this.l / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.v > 2000L) {
         this.v = $$4;
         this.j.aY().c(wg.c("narrator.joining"));
      }

      $$0.a(this.m, this.u, this.k / 2, this.l / 2 - 50, 16777215);
   }
}
