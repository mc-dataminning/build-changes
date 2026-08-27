import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewz extends eyf {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final ti a = ti.c("connect.aborted");
   public static final ti b = ti.a("disconnect.genericReason", ti.c("disconnect.unknownHost"));
   @Nullable
   volatile sj m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final eyf p;
   private ti q = ti.c("connect.connecting");
   private long s = -1L;
   final ti t;

   private ewz(eyf $$0, ti $$1) {
      super(eqi.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(eyf $$0, eqq $$1, fkd $$2, fjc $$3, boolean $$4) {
      if ($$1.y instanceof ewz) {
         k.error("Attempt to connect while already connecting");
      } else {
         ewz $$5 = new ewz($$0, $$4 ? fni.a : th.q);
         $$1.z();
         $$1.aR();
         $$1.a(fjr.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fnj.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eqq $$0, final fkd $$1, @Nullable final fjc $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ewz.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fkf.a.a($$1).map(fkc::d);
               if (ewz.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new exh(ewz.this.p, ewz.this.t, ewz.b)));
                  return;
               }

               $$0 = $$1.get();
               sj $$2;
               synchronized (ewz.this) {
                  if (ewz.this.o) {
                     return;
                  }

                  $$2 = new sj(vb.b);
                  $$2.a($$0.aN().l());
                  ewz.this.n = sj.a($$0, $$0.m.au(), $$2);
               }

               ewz.this.n.syncUninterruptibly();
               synchronized (ewz.this) {
                  if (ewz.this.o) {
                     $$2.a(ewz.a);
                     return;
                  }

                  ewz.this.m = $$2;
               }

               ewz.this.m.a($$0.getHostName(), $$0.getPort(), new fir(ewz.this.m, $$0, $$2, ewz.this.p, false, null, ewz.this::a));
               ewz.this.m.a(new adk($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (ewz.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ewz.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new exh(ewz.this.p, ewz.this.t, ti.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(ti $$0) {
      this.q = $$0;
   }

   @Override
   public void c() {
      if (this.m != null) {
         if (this.m.k()) {
            this.m.d();
         } else {
            this.m.p();
         }
      }
   }

   @Override
   public boolean at_() {
      return false;
   }

   @Override
   protected void aD_() {
      this.d(esl.a(th.e, $$0 -> {
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
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(ti.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
