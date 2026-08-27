import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enz extends ger {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int y = 80;
   private static final int z = 95;
   private static final int A = 1;
   private final eya B;
   private final enc C;
   private final tf D;
   private final RateLimiter E;
   private esg F;
   private final String G;
   private final enz.a H;
   @Nullable
   private volatile tf I;
   private volatile tf J = tf.c("mco.download.preparing");
   @Nullable
   private volatile String K;
   private volatile boolean L;
   private volatile boolean M = true;
   private volatile boolean N;
   private volatile boolean O;
   @Nullable
   private Long P;
   @Nullable
   private Long Q;
   private long R;
   private int S;
   private static final String[] T = new String[]{"", ".", ". .", ". . ."};
   private int U;
   private boolean V;
   private final BooleanConsumer W;

   public enz(eya $$0, enc $$1, String $$2, BooleanConsumer $$3) {
      super(eqd.a);
      this.W = $$3;
      this.B = $$0;
      this.G = $$2;
      this.C = $$1;
      this.H = new enz.a();
      this.D = tf.c("mco.download.title");
      this.E = RateLimiter.create(0.1F);
   }

   @Override
   public void aC_() {
      this.F = this.d(esg.a(te.e, $$0 -> {
         this.L = true;
         this.E();
      }).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.C();
   }

   private void C() {
      if (!this.N) {
         if (!this.V && this.a(this.C.a) >= 5368709120L) {
            tf $$0 = tf.a("mco.download.confirmation.line1", elr.b(5368709120L));
            tf $$1 = tf.c("mco.download.confirmation.line2");
            this.f.a(new eoc($$0x -> {
               this.V = true;
               this.f.a(this);
               this.F();
            }, eoc.a.a, $$0, $$1, false));
         } else {
            this.F();
         }
      }
   }

   private long a(String $$0) {
      els $$1 = new els();
      return $$1.a($$0);
   }

   @Override
   public void c() {
      super.c();
      this.S++;
      if (this.J != null && this.E.tryAcquire(1)) {
         tf $$0 = this.D();
         this.f.aV().c($$0);
      }
   }

   private tf D() {
      List<tf> $$0 = Lists.newArrayList();
      $$0.add(this.D);
      $$0.add(this.J);
      if (this.K != null) {
         $$0.add(tf.b(this.K + "%"));
         $$0.add(tf.b(elr.b(this.R) + "/s"));
      }

      if (this.I != null) {
         $$0.add(this.I);
      }

      return te.a($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.L = true;
         this.E();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      if (this.N && this.W != null && this.I == null) {
         this.W.accept(true);
      }

      this.f.a(this.B);
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.D, this.g / 2, 20, 16777215);
      $$0.a(this.i, this.J, this.g / 2, 50, 16777215);
      if (this.M) {
         this.c($$0);
      }

      if (this.H.a != 0L && !this.L) {
         this.d($$0);
         this.e($$0);
      }

      if (this.I != null) {
         $$0.a(this.i, this.I, this.g / 2, 110, 16711680);
      }
   }

   private void c(erv $$0) {
      int $$1 = this.i.a(this.J);
      if (this.S % 10 == 0) {
         this.U++;
      }

      $$0.a(this.i, T[this.U % T.length], this.g / 2 + $$1 / 2 + 5, 50, 16777215, false);
   }

   private void d(erv $$0) {
      double $$1 = Math.min((double)this.H.a / (double)this.H.b, 1.0);
      this.K = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -2501934);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, tf.a("mco.download.percent", this.K), this.g / 2, 84, 16777215);
   }

   private void e(erv $$0) {
      if (this.S % 20 == 0) {
         if (this.P != null) {
            long $$1 = ac.b() - this.Q;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.R = 1000L * (this.H.a - this.P) / $$1;
            this.a($$0, this.R);
         }

         this.P = this.H.a;
         this.Q = ac.b();
      } else {
         this.a($$0, this.R);
      }
   }

   private void a(erv $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.K);
         $$0.a(this.i, tf.a("mco.download.speed", elr.b($$1)), this.g / 2 + $$2 / 2 + 15, 84, 16777215, false);
      }
   }

   private void F() {
      new Thread(() -> {
         try {
            try {
               if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                  this.J = tf.c("mco.download.failed");
                  return;
               }

               if (this.L) {
                  this.G();
                  return;
               }

               this.J = tf.a("mco.download.downloading", this.G);
               els $$0 = new els();
               $$0.a(this.C.a);
               $$0.a(this.C, this.G, this.H, this.f.l());

               while (!$$0.b()) {
                  if ($$0.c()) {
                     $$0.a();
                     this.I = tf.c("mco.download.failed");
                     this.F.b(te.d);
                     return;
                  }

                  if ($$0.d()) {
                     if (!this.O) {
                        this.J = tf.c("mco.download.extracting");
                     }

                     this.O = true;
                  }

                  if (this.L) {
                     $$0.a();
                     this.G();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var8) {
                     a.error("Failed to check Realms backup download status");
                  }
               }

               this.N = true;
               this.J = tf.c("mco.download.done");
               this.F.b(te.d);
               return;
            } catch (InterruptedException var9) {
               a.error("Could not acquire upload lock");
            } catch (Exception var10) {
               this.I = tf.c("mco.download.failed");
               a.info("Exception while downloading world", var10);
            }
         } finally {
            if (!b.isHeldByCurrentThread()) {
               return;
            } else {
               b.unlock();
               this.M = false;
               this.N = true;
            }
         }
      }).start();
   }

   private void G() {
      this.J = tf.c("mco.download.cancelled");
   }

   public static class a {
      public volatile long a;
      public volatile long b;
   }
}
