import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbu extends fda {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vf a = vf.c("connect.aborted");
   public static final vf b = vf.a("disconnect.genericReason", vf.c("disconnect.unknownHost"));
   @Nullable
   volatile ug m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fda p;
   private vf q = vf.c("connect.connecting");
   private long r = -1L;
   final vf t;

   private fbu(fda $$0, vf $$1) {
      super(euz.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fda $$0, evh $$1, fpe $$2, foc $$3, boolean $$4) {
      if ($$1.y instanceof fbu) {
         k.error("Attempt to connect while already connecting");
      } else {
         fbu $$5 = new fbu($$0, $$4 ? fsp.a : ve.q);
         $$1.y();
         $$1.aR();
         $$1.a(fos.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fsq.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final evh $$0, final fpe $$1, @Nullable final foc $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fbu.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fpg.a.a($$1).map(fpd::d);
               if (fbu.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fcc(fbu.this.p, fbu.this.t, fbu.b)));
                  return;
               }

               $$0 = $$1.get();
               ug $$2;
               synchronized (fbu.this) {
                  if (fbu.this.o) {
                     return;
                  }

                  $$2 = new ug(xg.b);
                  $$2.a($$0.aN().l());
                  fbu.this.n = ug.a($$0, $$0.m.aw(), $$2);
               }

               fbu.this.n.syncUninterruptibly();
               synchronized (fbu.this) {
                  if (fbu.this.o) {
                     $$2.a(fbu.a);
                     return;
                  }

                  fbu.this.m = $$2;
                  $$0.ac().a($$2, $$2 != null ? a($$2.b()) : ghf.c.a);
               }

               fbu.this.m.a($$0.getHostName(), $$0.getPort(), new fnq(fbu.this.m, $$0, $$2, fbu.this.p, false, null, fbu.this::a));
               fbu.this.m.a(new afu($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (fbu.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fbu.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fcc(fbu.this.p, fbu.this.t, vf.a("disconnect.genericReason", $$8))));
            }
         }

         private static ghf.c a(foc.a $$0x) {
            return switch ($$0) {
               case a -> ghf.c.b;
               case b -> ghf.c.c;
               case c -> ghf.c.a;
            };
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(vf $$0) {
      this.q = $$0;
   }

   @Override
   public void d() {
      if (this.m != null) {
         if (this.m.k()) {
            this.m.d();
         } else {
            this.m.p();
         }
      }
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Override
   protected void aN_() {
      this.d(exf.a(ve.e, $$0 -> {
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
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aV().c(vf.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
