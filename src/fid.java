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

public class fid extends hff implements ffo {
   private static final int b = 200;
   private static final int c = 80;
   private static final int B = 95;
   private static final int C = 1;
   private static final String[] D = new String[]{"", ".", ". .", ". . ."};
   private static final xl E = xl.c("mco.upload.verifying");
   private final fhw F;
   private final etv G;
   @Nullable
   private final fiy H;
   private final long I;
   private final int J;
   final AtomicReference<ffn> a = new AtomicReference<>();
   private final ffe K;
   private final RateLimiter L;
   @Nullable
   private volatile xl[] M;
   private volatile xl N = xl.c("mco.upload.preparing");
   @Nullable
   private volatile String O;
   private volatile boolean P;
   private volatile boolean Q;
   private volatile boolean R = true;
   private volatile boolean S;
   @Nullable
   private flw T;
   @Nullable
   private flw U;
   private int V;
   private final fpl W = new fpl(this);

   public fid(@Nullable fiy $$0, long $$1, int $$2, fhw $$3, etv $$4) {
      super(fjo.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
      this.F = $$3;
      this.G = $$4;
      this.K = new ffe();
      this.L = RateLimiter.create(0.1F);
   }

   @Override
   public void aS_() {
      this.T = this.W.b(flw.a(xk.k, $$0x -> this.D()).a());
      this.T.k = false;
      this.U = this.W.b(flw.a(xk.e, $$0x -> this.E()).a());
      if (!this.S) {
         if (this.F.b == -1) {
            this.S = true;
            this.G();
         } else {
            List<fiw> $$0 = new ArrayList<>();
            if (this.H != null) {
               $$0.add(this.H);
            }

            $$0.add(new fjd(this.I, this.F.b, () -> {
               if (!this.S) {
                  this.S = true;
                  this.m.execute(() -> {
                     this.m.a(this);
                     this.G();
                  });
               }
            }));
            this.m.a(new fhp(this.F, $$0.toArray(new fiw[0])));
         }
      }

      this.W.a($$1 -> {
         flu var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.W.a();
   }

   private void D() {
      this.m.a(new fhj(new fev(new frr()), this.I));
   }

   private void E() {
      this.P = true;
      ffn $$0 = this.a.get();
      if ($$0 != null) {
         $$0.b();
      } else {
         this.m.a(this.F);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.R) {
            this.E();
         } else {
            this.D();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.Q && this.K.c() && this.K.d() && this.U != null) {
         this.N = E;
         this.U.j = false;
      }

      $$0.a(this.p, this.N, this.n / 2, 50, -1);
      if (this.R) {
         $$0.a(this.p, D[this.V / 10 % D.length], this.n / 2 + this.p.a(this.N) / 2 + 5, 50, -1, false);
      }

      if (this.K.c() && !this.P) {
         this.c($$0);
         this.d($$0);
      }

      xl[] $$4 = this.M;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.p, $$4[$$5], this.n / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(flj $$0) {
      double $$1 = this.K.e();
      this.O = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, xl.a("mco.upload.percent", this.O), this.n / 2, 84, -1);
   }

   private void d(flj $$0) {
      this.a($$0, this.K.g());
   }

   private void a(flj $$0, long $$1) {
      String $$2 = this.O;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.p.b($$2);
         String $$4 = "(" + few.b($$1) + "/s)";
         $$0.a(this.p, $$4, this.n / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      this.K.f();
      if (this.L.tryAcquire(1)) {
         xl $$0 = this.F();
         this.m.aZ().c($$0);
      }
   }

   private xl F() {
      List<xl> $$0 = Lists.newArrayList();
      $$0.add(this.N);
      if (this.O != null) {
         $$0.add(xl.a("mco.upload.percent", this.O));
      }

      xl[] $$1 = this.M;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return xk.a($$0);
   }

   private void G() {
      Path $$0 = this.m.q.toPath().resolve("saves").resolve(this.G.a());
      fgg $$1 = fgg.a(this.G.g(), this.G.l().c());
      ffn $$2 = new ffn($$0, $$1, this.m.X(), this.I, this.J, this);
      if (!this.a.compareAndSet(null, $$2)) {
         throw new IllegalStateException("Tried to start uploading but was already uploading");
      } else {
         $$2.a().handleAsync(($$0x, $$1x) -> {
            if ($$1x != null) {
               if ($$1x instanceof CompletionException $$2x) {
                  $$1x = $$2x.getCause();
               }

               if ($$1x instanceof ffi $$3) {
                  if ($$3.a() != null) {
                     this.N = $$3.a();
                  }

                  this.a($$3.b());
               } else {
                  this.N = xl.a("mco.upload.failed", $$1x.getMessage());
               }
            } else {
               this.N = xl.c("mco.upload.done");
               if (this.T != null) {
                  this.T.b(xk.d);
               }
            }

            this.Q = true;
            this.R = false;
            if (this.T != null) {
               this.T.k = true;
            }

            if (this.U != null) {
               this.U.k = false;
            }

            this.a.set(null);
            return null;
         }, this.m);
      }
   }

   private void a(@Nullable xl... $$0) {
      this.M = $$0;
   }

   @Override
   public ffe b() {
      return this.K;
   }

   @Override
   public void d() {
      this.N = xl.a("mco.upload.uploading", this.G.b());
   }
}
