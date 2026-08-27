import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcg extends fdm {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vg a = vg.c("connect.aborted");
   public static final vg b = vg.a("disconnect.genericReason", vg.c("disconnect.unknownHost"));
   @Nullable
   volatile uh m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fdm p;
   private vg q = vg.c("connect.connecting");
   private long r = -1L;
   final vg t;

   private fcg(fdm $$0, vg $$1) {
      super(evj.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fdm $$0, evr $$1, fpr $$2, fop $$3, boolean $$4) {
      if ($$1.y instanceof fcg) {
         k.error("Attempt to connect while already connecting");
      } else {
         fcg $$5 = new fcg($$0, $$4 ? ftc.a : vf.q);
         $$1.y();
         $$1.aR();
         $$1.a(fpf.a($$3 != null ? $$3.b : $$2.a()));
         $$1.ba().a(ftd.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final evr $$0, final fpr $$1, @Nullable final fop $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fcg.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fpt.a.a($$1).map(fpq::d);
               if (fcg.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fco(fcg.this.p, fcg.this.t, fcg.b)));
                  return;
               }

               $$0 = $$1.get();
               uh $$2;
               synchronized (fcg.this) {
                  if (fcg.this.o) {
                     return;
                  }

                  $$2 = new uh(xh.b);
                  $$2.a($$0.aN().l());
                  fcg.this.n = uh.a($$0, $$0.m.aw(), $$2);
               }

               fcg.this.n.syncUninterruptibly();
               synchronized (fcg.this) {
                  if (fcg.this.o) {
                     $$2.a(fcg.a);
                     return;
                  }

                  fcg.this.m = $$2;
                  $$0.ac().a($$2, $$2 != null ? a($$2.b()) : ghu.c.a);
               }

               fcg.this.m.a($$0.getHostName(), $$0.getPort(), new fod(fcg.this.m, $$0, $$2, fcg.this.p, false, null, fcg.this::a));
               fcg.this.m.a(new afv($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (fcg.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fcg.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fco(fcg.this.p, fcg.this.t, vg.a("disconnect.genericReason", $$8))));
            }
         }

         private static ghu.c a(fop.a $$0x) {
            return switch ($$0) {
               case a -> ghu.c.b;
               case b -> ghu.c.c;
               case c -> ghu.c.a;
            };
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(vg $$0) {
      this.q = $$0;
   }

   @Override
   public void e() {
      if (this.m != null) {
         if (this.m.k()) {
            this.m.d();
         } else {
            this.m.p();
         }
      }
   }

   @Override
   public boolean aN_() {
      return false;
   }

   @Override
   protected void aP_() {
      this.d(exr.a(vf.e, $$0 -> {
         synchronized (this) {
            this.o = true;
            if (this.n != null) {
               this.n.cancel(true);
               this.n = null;
            }

            if (this.m != null) {
               this.m.a(a);
            }
         }

         this.f.a(this.p);
      }).a(this.g / 2 - 100, this.h / 4 + 120 + 12, 200, 20).a());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aW().c(vg.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
