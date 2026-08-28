import java.util.List;
import java.util.Optional;

public class bvw extends bvk {
   private static final int a = 6000;
   private static final int b = 20;
   private static final int c = 8;
   private static final int d = 40;
   private static final double e = 0.5;
   private int f;
   private int g = 5;
   private int h;
   private int i = 1;
   private cpx j;

   public bvw(dhi $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bvr.W, $$0);
      this.a_($$1, $$2, $$3);
      this.v((float)(this.ae.j() * 360.0));
      this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      this.h = $$4;
   }

   public bvw(bvr<? extends bvw> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.a;
   }

   @Override
   protected void a(alg.a $$0) {
   }

   @Override
   protected double bd() {
      return 0.03;
   }

   @Override
   public void h() {
      super.h();
      this.K = this.dB();
      this.L = this.dD();
      this.M = this.dH();
      if (this.a(aya.a)) {
         this.s();
      } else {
         this.bf();
      }

      if (this.dW().b_(this.dw()).a(aya.b)) {
         this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
      }

      if (!this.dW().b(this.cR())) {
         this.m(this.dB(), (this.cR().b + this.cR().e) / 2.0, this.dH());
      }

      if (this.af % 20 == 1) {
         this.p();
      }

      if (this.j != null && (this.j.aa_() || this.j.eF())) {
         this.j = null;
      }

      if (this.j != null) {
         fby $$0 = new fby(this.j.dB() - this.dB(), this.j.dD() + (double)this.j.cS() / 2.0 - this.dD(), this.j.dH() - this.dH());
         double $$1 = $$0.h();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.dz().e($$0.d().c($$2 * $$2 * 0.1)));
         }
      }

      this.a(bwk.a, this.dz());
      this.aK();
      float $$3 = 0.98F;
      if (this.aJ()) {
         $$3 = this.dW().a_(this.aQ()).b().g() * 0.98F;
      }

      this.h(this.dz().d((double)$$3, 0.98, (double)$$3));
      if (this.aJ()) {
         this.h(this.dz().d(1.0, -0.9, 1.0));
      }

      this.f++;
      if (this.f >= 6000) {
         this.at();
      }
   }

   @Override
   public jh aQ() {
      return this.e(0.999999F);
   }

   private void p() {
      if (this.j == null || this.j.g(this) > 64.0) {
         this.j = this.dW().a(this, 8.0);
      }

      if (this.dW() instanceof ash) {
         for (bvw $$1 : this.dW().a(ecf.a(bvw.class), this.cR().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(ash $$0, fby $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bvw($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(ash $$0, fby $$1, int $$2) {
      fbt $$3 = fbt.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.H_().a(40);
      List<bvw> $$5 = $$0.a(ecf.a(bvw.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bvw $$6 = $$5.get(0);
         $$6.i++;
         $$6.f = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bvw $$0) {
      return $$0 != this && a($$0, this.ar(), this.h);
   }

   private static boolean a(bvw $$0, int $$1, int $$2) {
      return !$$0.dR() && ($$0.ar() - $$1) % 40 == 0 && $$0.h == $$2;
   }

   private void b(bvw $$0) {
      this.i = this.i + $$0.i;
      this.f = Math.min(this.f, $$0.f);
      $$0.at();
   }

   private void s() {
      fby $$0 = this.dz();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bs() {
   }

   @Override
   public final boolean b(bua $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(ash $$0, bua $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bD();
         this.g = (int)((float)this.g - $$2);
         if (this.g <= 0) {
            this.at();
         }

         return true;
      }
   }

   @Override
   public void b(ux $$0) {
      $$0.a("Health", (short)this.g);
      $$0.a("Age", (short)this.f);
      $$0.a("Value", (short)this.h);
      $$0.a("Count", this.i);
   }

   @Override
   public void a(ux $$0) {
      this.g = $$0.g("Health");
      this.f = $$0.g("Age");
      this.h = $$0.g("Value");
      this.i = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void a_(cpx $$0) {
      if ($$0 instanceof asi $$1) {
         if ($$0.ci == 0) {
            $$0.ci = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.h);
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

   private int a(asi $$0, int $$1) {
      Optional<ddy> $$2 = deb.a(dea.z, $$0, cxp::n);
      if ($$2.isPresent()) {
         cxp $$3 = $$2.get().a();
         int $$4 = deb.c($$0.y(), $$3, $$1);
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

   public int l() {
      return this.h;
   }

   public int m() {
      if (this.h >= 2477) {
         return 10;
      } else if (this.h >= 1237) {
         return 9;
      } else if (this.h >= 617) {
         return 8;
      } else if (this.h >= 307) {
         return 7;
      } else if (this.h >= 149) {
         return 6;
      } else if (this.h >= 73) {
         return 5;
      } else if (this.h >= 37) {
         return 4;
      } else if (this.h >= 17) {
         return 3;
      } else if (this.h >= 7) {
         return 2;
      } else {
         return this.h >= 3 ? 1 : 0;
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
   public aac<acr> a(asf $$0) {
      return new act(this, $$0);
   }

   @Override
   public axg dn() {
      return axg.i;
   }
}
