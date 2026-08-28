import java.util.List;
import java.util.Optional;

public class bua extends bto {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cnu k;

   public bua(deg $$0, double $$1, double $$2, double $$3, int $$4) {
      this(btv.M, $$0);
      this.a_($$1, $$2, $$3);
      this.v((float)(this.af.j() * 360.0));
      this.n((this.af.j() * 0.2F - 0.1F) * 2.0, this.af.j() * 0.2 * 2.0, (this.af.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bua(btv<? extends bua> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected bto.b bf() {
      return bto.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected double bc() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.L = this.dx();
      this.M = this.dz();
      this.N = this.dD();
      if (this.a(awz.a)) {
         this.t();
      } else {
         this.be();
      }

      if (this.dS().b_(this.ds()).a(awz.b)) {
         this.n((double)((this.af.i() - this.af.i()) * 0.2F), 0.2F, (double)((this.af.i() - this.af.i()) * 0.2F));
      }

      if (!this.dS().b(this.cO())) {
         this.m(this.dx(), (this.cO().b + this.cO().e) / 2.0, this.dD());
      }

      if (this.ag % 20 == 1) {
         this.q();
      }

      if (this.k != null && (this.k.P_() || this.k.eB())) {
         this.k = null;
      }

      if (this.k != null) {
         eys $$0 = new eys(this.k.dx() - this.dx(), this.k.dz() + (double)this.k.cP() / 2.0 - this.dz(), this.k.dD() - this.dD());
         double $$1 = $$0.h();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.dv().e($$0.d().c($$2 * $$2 * 0.1)));
         }
      }

      this.a(buo.a, this.dv());
      if (!this.dS().w_()) {
         this.aI();
      }

      float $$3 = 0.98F;
      if (this.aH()) {
         $$3 = this.dS().a_(this.aO()).b().h() * 0.98F;
      }

      this.h(this.dv().d((double)$$3, 0.98, (double)$$3));
      if (this.aH()) {
         this.h(this.dv().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.as();
      }
   }

   @Override
   public je aO() {
      return this.e(0.999999F);
   }

   private void q() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dS().a(this, 8.0);
      }

      if (this.dS() instanceof arh) {
         for (bua $$1 : this.dS().a(dyz.a(bua.class), this.cO().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(arh $$0, eys $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bua($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(arh $$0, eys $$1, int $$2) {
      eyn $$3 = eyn.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.C_().a(40);
      List<bua> $$5 = $$0.a(dyz.a(bua.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bua $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bua $$0) {
      return $$0 != this && a($$0, this.ap(), this.i);
   }

   private static boolean a(bua $$0, int $$1, int $$2) {
      return !$$0.dN() && ($$0.ap() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bua $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.as();
   }

   private void t() {
      eys $$0 = this.dv();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void br() {
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dS().B) {
         return true;
      } else {
         this.bA();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.as();
         }

         return true;
      }
   }

   @Override
   public void b(uf $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(uf $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cnu $$0) {
      if ($$0 instanceof ari $$1) {
         if ($$0.ce == 0) {
            $$0.ce = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.i);
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.j--;
            if (this.j == 0) {
               this.as();
            }
         }
      }
   }

   private int a(ari $$0, int $$1) {
      Optional<dbj> $$2 = dbm.a(dbl.z, $$0, cvp::n);
      if ($$2.isPresent()) {
         cvp $$3 = $$2.get().a();
         int $$4 = dbm.c($$0.B(), $$3, $$1);
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

   public int m() {
      return this.i;
   }

   public int o() {
      if (this.i >= 2477) {
         return 10;
      } else if (this.i >= 1237) {
         return 9;
      } else if (this.i >= 617) {
         return 8;
      } else if (this.i >= 307) {
         return 7;
      } else if (this.i >= 149) {
         return 6;
      } else if (this.i >= 73) {
         return 5;
      } else if (this.i >= 37) {
         return 4;
      } else if (this.i >= 17) {
         return 3;
      } else if (this.i >= 7) {
         return 2;
      } else {
         return this.i >= 3 ? 1 : 0;
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
   public boolean cy() {
      return false;
   }

   @Override
   public zk<abz> a(arg $$0) {
      return new acb(this, $$0);
   }

   @Override
   public awf di() {
      return awf.i;
   }
}
