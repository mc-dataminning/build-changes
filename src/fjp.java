import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletionException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public class fjp extends hlf implements fgz {
   private static final int b = 200;
   private static final int c = 80;
   private static final int C = 95;
   private static final int D = 1;
   private static final String[] E = new String[]{"", ".", ". .", ". . ."};
   private static final wp F = wp.c("mco.upload.verifying");
   private final fji G;
   private final evh H;
   @Nullable
   private final fkk I;
   private final long J;
   private final int K;
   final AtomicReference<fgy> a = new AtomicReference<>();
   private final fgp L;
   private final RateLimiter M;
   @Nullable
   private volatile wp[] N;
   private volatile wp O = wp.c("mco.upload.preparing");
   @Nullable
   private volatile String P;
   private volatile boolean Q;
   private volatile boolean R;
   private volatile boolean S = true;
   private volatile boolean T;
   @Nullable
   private fou U;
   @Nullable
   private fou V;
   private int W;
   private final fsi X = new fsi(this);

   public fjp(@Nullable fkk $$0, long $$1, int $$2, fji $$3, evh $$4) {
      super(flb.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
      this.G = $$3;
      this.H = $$4;
      this.L = new fgp();
      this.M = RateLimiter.create(0.1F);
   }

   @Override
   public void aR_() {
      this.U = this.X.b(fou.a(wo.k, $$0x -> this.E()).a());
      this.U.k = false;
      this.V = this.X.b(fou.a(wo.e, $$0x -> this.F()).a());
      if (!this.T) {
         if (this.G.b == -1) {
            this.T = true;
            this.H();
         } else {
            List<fki> $$0 = new ArrayList<>();
            if (this.I != null) {
               $$0.add(this.I);
            }

            $$0.add(new fkp(this.J, this.G.b, () -> {
               if (!this.T) {
                  this.T = true;
                  this.m.execute(() -> {
                     this.m.a(this);
                     this.H();
                  });
               }
            }));
            this.m.a(new fjb(this.G, $$0.toArray(new fki[0])));
         }
      }

      this.X.a($$1 -> {
         fos var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   private void E() {
      this.m.a(new fiv(new fgg(new fuo()), this.J));
   }

   private void F() {
      this.Q = true;
      fgy $$0 = this.a.get();
      if ($$0 != null) {
         $$0.b();
      } else {
         this.m.a(this.G);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.S) {
            this.F();
         } else {
            this.E();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.R && this.L.c() && this.L.d() && this.V != null) {
         this.O = F;
         this.V.j = false;
      }

      $$0.a(this.p, this.O, this.n / 2, 50, -1);
      if (this.S) {
         $$0.b(this.p, E[this.W / 10 % E.length], this.n / 2 + this.p.a(this.O) / 2 + 5, 50, -1);
      }

      if (this.L.c() && !this.Q) {
         this.c($$0);
         this.d($$0);
      }

      wp[] $$4 = this.N;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.p, $$4[$$5], this.n / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(fof $$0) {
      double $$1 = this.L.e();
      this.P = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, wp.a("mco.upload.percent", this.P), this.n / 2, 84, -1);
   }

   private void d(fof $$0) {
      this.a($$0, this.L.g());
   }

   private void a(fof $$0, long $$1) {
      String $$2 = this.P;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.p.b($$2);
         String $$4 = "(" + fgh.b($$1) + "/s)";
         $$0.b(this.p, $$4, this.n / 2 + $$3 / 2 + 15, 84, -1);
      }
   }

   @Override
   public void e() {
      super.e();
      this.W++;
      this.L.f();
      if (this.M.tryAcquire(1)) {
         wp $$0 = this.G();
         this.m.aY().c($$0);
      }
   }

   private wp G() {
      List<wp> $$0 = Lists.newArrayList();
      $$0.add(this.O);
      if (this.P != null) {
         $$0.add(wp.a("mco.upload.percent", this.P));
      }

      wp[] $$1 = this.N;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return wo.a($$0);
   }

   private void H() {
      Path $$0 = this.m.q.toPath().resolve("saves").resolve(this.H.a());
      fhs $$1 = fhs.a(this.H.g(), this.H.l().c());
      fgy $$2 = new fgy($$0, $$1, this.m.X(), this.J, this.K, this);
      if (!this.a.compareAndSet(null, $$2)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         $$2.a().handleAsync(($$0x, $$1x) -> {
            if ($$1x != null) {
               if ($$1x instanceof CompletionException $$2x) {
                  $$1x = $$2x.getCause();
               }

               if ($$1x instanceof fgt $$3) {
                  if ($$3.a() != null) {
                     this.O = $$3.a();
                  }

                  this.a($$3.b());
               } else {
                  this.O = wp.a("mco.upload.failed", $$1x.getMessage());
               }
            } else {
               this.O = wp.c("mco.upload.done");
               if (this.U != null) {
                  this.U.b(wo.d);
               }
            }

            this.R = true;
            this.S = false;
            if (this.U != null) {
               this.U.k = true;
            }

            if (this.V != null) {
               this.V.k = false;
            }

            this.a.set(null);
            return null;
         }, this.m);
      }
   }

   private void a(@Nullable wp... $$0) {
      this.N = $$0;
   }

   @Override
   public fgp b() {
      return this.L;
   }

   @Override
   public void d() {
      this.O = wp.a("mco.upload.uploading", this.H.b());
   }
}
