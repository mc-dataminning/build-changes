import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewu extends eya {
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
   final eya p;
   private tf q = tf.c("connect.connecting");
   private long s = -1L;
   final tf t;

   private ewu(eya $$0, tf $$1) {
      super(eqd.a);
      this.p = $$0;
      this.t = $$1;
   }

   public static void a(eya $$0, eql $$1, fjy $$2, fix $$3, boolean $$4) {
      if ($$1.y instanceof ewu) {
         k.error("Attempt to connect while already connecting");
      } else {
         ewu $$5 = new ewu($$0, $$4 ? fnd.a : te.q);
         $$1.z();
         $$1.aR();
         $$1.a(fjm.a($$3 != null ? $$3.b : $$2.a()));
         $$1.aZ().a(fne.c.b, $$3.b, $$3.a);
         $$1.a($$5);
         $$5.a($$1, $$2, $$3);
      }
   }

   private void a(final eql $$0, final fjy $$1, @Nullable final fix $$2) {
      k.info("Connecting to {}, {}", $$1.a(), $$1.b());
      Thread $$3 = new Thread("Server Connector #" + c.incrementAndGet()) {
         @Override
         public void run() {
            InetSocketAddress $$0 = null;

            try {
               if (ewu.this.o) {
                  return;
               }

               Optional<InetSocketAddress> $$1 = fka.a.a($$1).map(fjx::d);
               if (ewu.this.o) {
                  return;
               }

               if ($$1.isEmpty()) {
                  $$0.execute(() -> $$0.a(new exc(ewu.this.p, ewu.this.t, ewu.b)));
                  return;
               }

               $$0 = $$1.get();
               sg $$2;
               synchronized (ewu.this) {
                  if (ewu.this.o) {
                     return;
                  }

                  $$2 = new sg(uy.b);
                  $$2.a($$0.aN().l());
                  ewu.this.n = sg.a($$0, $$0.m.au(), $$2);
               }

               ewu.this.n.syncUninterruptibly();
               synchronized (ewu.this) {
                  if (ewu.this.o) {
                     $$2.a(ewu.a);
                     return;
                  }

                  ewu.this.m = $$2;
               }

               ewu.this.m.a($$0.getHostName(), $$0.getPort(), new fim(ewu.this.m, $$0, $$2, ewu.this.p, false, null, ewu.this::a));
               ewu.this.m.a(new adh($$0.V().c(), $$0.V().b()));
            } catch (Exception var9) {
               if (ewu.this.o) {
                  return;
               }

               Exception $$6;
               if (var9.getCause() instanceof Exception $$5) {
                  $$6 = $$5;
               } else {
                  $$6 = var9;
               }

               ewu.k.error("Couldn't connect to server", var9);
               String $$8 = $$0 == null
                  ? $$6.getMessage()
                  : $$6.getMessage().replaceAll($$0.getHostName() + ":" + $$0.getPort(), "").replaceAll($$0.toString(), "");
               $$0.execute(() -> $$0.a(new exc(ewu.this.p, ewu.this.t, tf.a("disconnect.genericReason", $$8))));
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
   public boolean ay_() {
      return false;
   }

   @Override
   protected void aC_() {
      this.d(esg.a(te.e, $$0 -> {
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
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.s > 2000L) {
         this.s = $$4;
         this.f.aV().c(tf.c("narrator.joining"));
      }

      $$0.a(this.i, this.q, this.g / 2, this.h / 2 - 50, 16777215);
   }
}
