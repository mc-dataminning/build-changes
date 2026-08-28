import java.util.List;
import java.util.Optional;

public class bul extends btz {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private coh k;

   public bul(dev $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bug.M, $$0);
      this.a_($$1, $$2, $$3);
      this.v((float)(this.af.j() * 360.0));
      this.n((this.af.j() * 0.2F - 0.1F) * 2.0, this.af.j() * 0.2 * 2.0, (this.af.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bul(bug<? extends bul> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected double be() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.L = this.dC();
      this.M = this.dE();
      this.N = this.dI();
      if (this.a(axf.a)) {
         this.t();
      } else {
         this.bg();
      }

      if (this.dX().b_(this.dx()).a(axf.b)) {
         this.n((double)((this.af.i() - this.af.i()) * 0.2F), 0.2F, (double)((this.af.i() - this.af.i()) * 0.2F));
      }

      if (!this.dX().b(this.cS())) {
         this.m(this.dC(), (this.cS().b + this.cS().e) / 2.0, this.dI());
      }

      if (this.ag % 20 == 1) {
         this.q();
      }

      if (this.k != null && (this.k.R_() || this.k.eH())) {
         this.k = null;
      }

      if (this.k != null) {
         ezh $$0 = new ezh(this.k.dC() - this.dC(), this.k.dE() + (double)this.k.cT() / 2.0 - this.dE(), this.k.dI() - this.dI());
         double $$1 = $$0.h();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.dA().e($$0.d().c($$2 * $$2 * 0.1)));
         }
      }

      this.a(buz.a, this.dA());
      this.aK();
      float $$3 = 0.98F;
      if (this.aJ()) {
         $$3 = this.dX().a_(this.aQ()).b().g() * 0.98F;
      }

      this.h(this.dA().d((double)$$3, 0.98, (double)$$3));
      if (this.aJ()) {
         this.h(this.dA().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.au();
      }
   }

   @Override
   public jg aQ() {
      return this.e(0.999999F);
   }

   private void q() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dX().a(this, 8.0);
      }

      if (this.dX() instanceof arm) {
         for (bul $$1 : this.dX().a(dzo.a(bul.class), this.cS().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(arm $$0, ezh $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bul($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(arm $$0, ezh $$1, int $$2) {
      ezc $$3 = ezc.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<bul> $$5 = $$0.a(dzo.a(bul.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bul $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bul $$0) {
      return $$0 != this && a($$0, this.ar(), this.i);
   }

   private static boolean a(bul $$0, int $$1, int $$2) {
      return !$$0.dS() && ($$0.ar() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bul $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.au();
   }

   private void t() {
      ezh $$0 = this.dA();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bt() {
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dX().C) {
         return true;
      } else {
         this.bE();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.au();
         }

         return true;
      }
   }

   @Override
   public void b(uj $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(uj $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(coh $$0) {
      if ($$0 instanceof arn $$1) {
         if ($$0.cf == 0) {
            $$0.cf = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.i);
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.j--;
            if (this.j == 0) {
               this.au();
            }
         }
      }
   }

   private int a(arn $$0, int $$1) {
      Optional<dbl> $$2 = dbo.a(dbn.z, $$0, cvx::n);
      if ($$2.isPresent()) {
         cvx $$3 = $$2.get().a();
         int $$4 = dbo.c($$0.B(), $$3, $$1);
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
   public boolean cC() {
      return false;
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new acf(this, $$0);
   }

   @Override
   public awl dn() {
      return awl.i;
   }
}
