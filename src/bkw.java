import java.util.List;
import java.util.Map.Entry;

public class bkw extends bkq {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cdu k;

   public bkw(csa $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bku.J, $$0);
      this.a_($$1, $$2, $$3);
      this.r((float)(this.ag.j() * 360.0));
      this.o((this.ag.j() * 0.2F - 0.1F) * 2.0, this.ag.j() * 0.2 * 2.0, (this.ag.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bkw(bku<? extends bkw> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   protected void b_() {
   }

   @Override
   public void l() {
      super.l();
      this.K = this.ds();
      this.L = this.du();
      this.M = this.dy();
      if (this.a(arl.a)) {
         this.w();
      } else if (!this.aV()) {
         this.g(this.dq().b(0.0, -0.03, 0.0));
      }

      if (this.dN().b_(this.dn()).a(arl.b)) {
         this.o((double)((this.ag.i() - this.ag.i()) * 0.2F), 0.2F, (double)((this.ag.i() - this.ag.i()) * 0.2F));
      }

      if (!this.dN().b(this.cH())) {
         this.m(this.ds(), (this.cH().b + this.cH().e) / 2.0, this.dy());
      }

      if (this.ah % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.O_() || this.k.ex())) {
         this.k = null;
      }

      if (this.k != null) {
         eju $$0 = new eju(this.k.ds() - this.ds(), this.k.du() + (double)this.k.cI() / 2.0 - this.du(), this.k.dy() - this.dy());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.g(this.dq().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(blm.a, this.dq());
      float $$3 = 0.98F;
      if (this.aC()) {
         $$3 = this.dN().a_(this.aI()).b().i() * 0.98F;
      }

      this.g(this.dq().d((double)$$3, 0.98, (double)$$3));
      if (this.aC()) {
         this.g(this.dq().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.am();
      }
   }

   @Override
   protected ht aI() {
      return this.d(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.f(this) > 64.0) {
         this.k = this.dN().a(this, 8.0);
      }

      if (this.dN() instanceof ame) {
         for (bkw $$1 : this.dN().a(dlg.a(bkw.class), this.cH().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(ame $$0, eju $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bkw($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(ame $$0, eju $$1, int $$2) {
      ejp $$3 = ejp.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<bkw> $$5 = $$0.a(dlg.a(bkw.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bkw $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bkw $$0) {
      return $$0 != this && a($$0, this.aj(), this.i);
   }

   private static boolean a(bkw $$0, int $$1, int $$2) {
      return !$$0.dI() && ($$0.aj() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bkw $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.am();
   }

   private void w() {
      eju $$0 = this.dq();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bi() {
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dN().B) {
         return true;
      } else {
         this.bq();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(rz $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(rz $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cdu $$0) {
      if (!this.dN().B) {
         if ($$0.bX == 0) {
            $$0.bX = 2;
            $$0.a(this, 1);
            int $$1 = this.a($$0, this.i);
            if ($$1 > 0) {
               $$0.d($$1);
            }

            this.j--;
            if (this.j == 0) {
               this.am();
            }
         }
      }
   }

   private int a(cdu $$0, int $$1) {
      Entry<bkv, clj> $$2 = cpw.a(cpy.L, $$0, clj::j);
      if ($$2 != null) {
         clj $$3 = $$2.getValue();
         int $$4 = Math.min(this.d($$1), $$3.k());
         $$3.b($$3.k() - $$4);
         int $$5 = $$1 - this.c($$4);
         return $$5 > 0 ? this.a($$0, $$5) : 0;
      } else {
         return $$1;
      }
   }

   private int c(int $$0) {
      return $$0 / 2;
   }

   private int d(int $$0) {
      return $$0 * 2;
   }

   public int q() {
      return this.i;
   }

   public int s() {
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
   public boolean cq() {
      return false;
   }

   @Override
   public wk<yd> dk() {
      return new yf(this);
   }

   @Override
   public aqs dc() {
      return aqs.i;
   }
}
