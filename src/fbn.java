import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbn extends fct {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final vd a = vd.c("connect.aborted");
   public static final vd b = vd.a("disconnect.genericReason", vd.c("disconnect.unknownHost"));
   @Nullable
   volatile ue m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final fct p;
   private vd q = vd.c("connect.connecting");
   private long r = -1L;
   final vd t;

   private fbn(fct $$0, vd $$1) {
      super(eus.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(fct $$0, eva $$1, fox $$2, fnv $$3, boolean $$4) {
      if ($$1.y instanceof fbn) {
         k.error("Attempt to connect while already connecting");
      } else {
         fbn $$5 = new fbn($$0, $$4 ? fsi.a : vc.q);
         $$1.y();
         $$1.aQ();
         $$1.a(fok.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aY().a(fsj.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eva $$0, final fox $$1, @Nullable final fnv $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (fbn.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = foz.a.a($$1).map(fow::d);
               if (fbn.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new fbv(fbn.this.p, fbn.this.t, fbn.b)));
                  return;
               }

               $$0 = $$1.get();
               ue $$2;
               synchronized (fbn.this) {
                  if (fbn.this.o) {
                     return;
                  }

                  $$2 = new ue(xe.b);
                  $$2.a($$0.aM().l());
                  fbn.this.n = ue.a($$0, $$0.m.aw(), $$2);
               }

               fbn.this.n.syncUninterruptibly();
               synchronized (fbn.this) {
                  if (fbn.this.o) {
                     $$2.a(fbn.a);
                     return;
                  }

                  fbn.this.m = $$2;
               }

               fbn.this.m.a($$0.getHostName(), $$0.getPort(), new fnj(fbn.this.m, $$0, $$2, fbn.this.p, false, null, fbn.this::a));
               fbn.this.m.a(new afr($$0.U().c(), $$0.U().b()));
            } catch (Exception var9) {
               if (fbn.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               fbn.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new fbv(fbn.this.p, fbn.this.t, vd.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(vd $$0) {
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
      this.d(ewy.a(vc.e, $$0 -> {
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
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.r > 2000L) {
         this.r = $$4;
         this.f.aU().c(vd.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
