import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwo extends bwa {
   protected static final akh<Integer> a = akl.a(bwo.class, akj.b);
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i = 1;
   @Nullable
   private cqs j;
   private final bwu k = new bwu(this);

   public bwo(dip $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bwj.V, $$0);
      this.a_($$1, $$2, $$3);
      if (!this.dV().C) {
         this.w((float)(this.ae.j() * 360.0));
         this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      }

      this.c($$4);
   }

   public bwo(bwj<? extends bwo> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(a, 0);
   }

   @Override
   protected double bd() {
      return 0.03;
   }

   @Override
   public void h() {
      this.k.e();
      if (this.ak && this.dV().C) {
         this.ak = false;
      } else {
         super.h();
         boolean $$0 = !this.dV().b(this.cR());
         if (this.a(axf.a)) {
            this.n();
         } else if (!$$0) {
            this.bf();
         }

         if (this.dV().b_(this.dv()).a(axf.b)) {
            this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
         }

         if (this.af % 20 == 1) {
            this.m();
         }

         this.j();
         if (this.j == null && !this.dV().C && $$0) {
            this.m(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
            this.ar = true;
         }

         double $$1 = this.dy().e;
         this.a(bxd.a, this.dy());
         this.aK();
         float $$2 = 0.98F;
         if (this.aJ()) {
            $$2 = this.dV().a_(this.aQ()).b().g() * 0.98F;
         }

         this.i(this.dy().c((double)$$2));
         if (this.R && $$1 < -this.be()) {
            this.i(new fdw(this.dy().d, -$$1 * 0.4, this.dy().f));
         }

         this.g++;
         if (this.g >= 6000) {
            this.at();
         }
      }
   }

   private void j() {
      if (this.j == null || this.j.g(this) > 64.0) {
         cqs $$0 = this.dV().a(this, 8.0);
         if ($$0 != null && !$$0.U_() && !$$0.eG()) {
            this.j = $$0;
         } else {
            this.j = null;
         }
      }

      if (this.j != null) {
         fdw $$1 = new fdw(this.j.dA() - this.dA(), this.j.dC() + (double)this.j.cS() / 2.0 - this.dC(), this.j.dG() - this.dG());
         double $$2 = $$1.h();
         double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
         this.i(this.dy().e($$1.d().c($$3 * $$3 * 0.1)));
      }
   }

   @Override
   public iu aQ() {
      return this.f(0.999999F);
   }

   private void m() {
      if (this.dV() instanceof aro) {
         for (bwo $$1 : this.dV().a(eea.a(bwo.class), this.cR().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aro $$0, fdw $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bwo($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aro $$0, fdw $$1, int $$2) {
      fdr $$3 = fdr.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.C_().a(40);
      List<bwo> $$5 = $$0.a(eea.a(bwo.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bwo $$6 = $$5.get(0);
         $$6.i++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bwo $$0) {
      return $$0 != this && a($$0, this.ar(), this.f());
   }

   private static boolean a(bwo $$0, int $$1, int $$2) {
      return !$$0.dQ() && ($$0.ar() - $$1) % 40 == 0 && $$0.f() == $$2;
   }

   private void b(bwo $$0) {
      this.i = this.i + $$0.i;
      this.g = Math.min(this.g, $$0.g);
      $$0.at();
   }

   private void n() {
      fdw $$0 = this.dy();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void br() {
   }

   @Override
   public final boolean b(bup $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bC();
         this.h = (int)((float)this.h - $$2);
         if (this.h <= 0) {
            this.at();
         }

         return true;
      }
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.f());
      $$0.a("Count", this.i);
   }

   @Override
   public void a(tx $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.c($$0.g("Value"));
      this.i = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void a_(cqs $$0) {
      if ($$0 instanceof arp $$1) {
         if ($$0.bW == 0) {
            $$0.bW = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.f());
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.i--;
            if (this.i == 0) {
               this.at();
            }
         }
      }
   }

   private int a(arp $$0, int $$1) {
      Optional<dfe> $$2 = dfh.a(dfg.z, $$0, cys::n);
      if ($$2.isPresent()) {
         cys $$3 = $$2.get().a();
         int $$4 = dfh.c($$0.y(), $$3, $$1);
         int $$5 = Math.min($$4, $$3.o());
         $$3.b($$3.o() - $$5);
         if ($$5 > 0) {
            int $$6 = $$1 - $$5 * $$1 / $$4;
            if ($$6 > 0) {
               return this.a($$0, $$6);
            }
         }

         return 0;
      } else {
         return $$1;
      }
   }

   public int f() {
      return this.al.a(a);
   }

   private void c(int $$0) {
      this.al.a(a, $$0);
   }

   public int g() {
      int $$0 = this.f();
      if ($$0 >= 2477) {
         return 10;
      } else if ($$0 >= 1237) {
         return 9;
      } else if ($$0 >= 617) {
         return 8;
      } else if ($$0 >= 307) {
         return 7;
      } else if ($$0 >= 149) {
         return 6;
      } else if ($$0 >= 73) {
         return 5;
      } else if ($$0 >= 37) {
         return 4;
      } else if ($$0 >= 17) {
         return 3;
      } else if ($$0 >= 7) {
         return 2;
      } else {
         return $$0 >= 3 ? 1 : 0;
      }
   }

   public static int b(int $$0) {
      if ($$0 >= 2477) {
         return 2477;
      } else if ($$0 >= 1237) {
         return 1237;
      } else if ($$0 >= 617) {
         return 617;
      } else if ($$0 >= 307) {
         return 307;
      } else if ($$0 >= 149) {
         return 149;
      } else if ($$0 >= 73) {
         return 73;
      } else if ($$0 >= 37) {
         return 37;
      } else if ($$0 >= 17) {
         return 17;
      } else if ($$0 >= 7) {
         return 7;
      } else {
         return $$0 >= 3 ? 3 : 1;
      }
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public awm dm() {
      return awm.i;
   }

   @Override
   public bwu N_() {
      return this.k;
   }
}
