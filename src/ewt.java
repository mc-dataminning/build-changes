import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewt extends exz {
   private static final AtomicInteger c = new AtomicInteger(0);
   static final Logger k = LogUtils.getLogger();
   private static final long l = 2000L;
   public static final tf a = tf.c("connect.aborted");
   public static final tf b = tf.a("disconnect.genericReason", tf.c("disconnect.unknownHost"));
   @Nullable
   volatile sg m;
   @Nullable
   ChannelFuture n;
   volatile boolean o;
   final exz p;
   private tf q = tf.c("connect.connecting");
   private long s = -1L;
   final tf t;

   private ewt(exz $$0, tf $$1) {
      super(eqe.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(exz $$0, eqm $$1, fjp $$2, fis $$3, boolean $$4) {
      if ($$1.B instanceof ewt) {
         k.error("Attempt to connect while already connecting");
      } else {
         ewt $$5 = new ewt($$0, $$4 ? fmu.a : te.q);
         $$1.z();
         $$1.aR();
         $$1.a(fjf.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fmv.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eqm $$0, final fjp $$1, @Nullable final fis $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ewt.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fjr.a.a($$1).map(fjo::d);
               if (ewt.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new exb(ewt.this.p, ewt.this.t, ewt.b)));
                  return;
               }

               $$0 = $$1.get();
               sg $$2;
               synchronized (ewt.this) {
                  if (ewt.this.o) {
                     return;
                  }

                  $$2 = new sg(uy.b);
                  $$2.a($$0.s);
                  ewt.this.n = sg.a($$0, $$0.m.at(), $$2);
               }

               ewt.this.n.syncUninterruptibly();
               synchronized (ewt.this) {
                  if (ewt.this.o) {
                     $$2.a(ewt.a);
                     return;
                  }

                  ewt.this.m = $$2;
               }

               ewt.this.m.a($$0.getHostName(), $$0.getPort(), new fih(ewt.this.m, $$0, $$2, ewt.this.p, false, null, ewt.this::a));
               ewt.this.m.a(new adh($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (ewt.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ewt.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new exb(ewt.this.p, ewt.this.t, tf.a("disconnect.genericReason", $$8))));
            }
         }
      };
      $$3.setUncaughtExceptionHandler(new r(k));
      $$3.start();
   }

   private void a(tf $$0) {
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
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      this.d(esh.a(te.e, $$0 -> {
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(tf.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
