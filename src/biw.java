import java.util.List;
import java.util.Map.Entry;

public class biw extends biq {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cbu k;

   public biw(cpv $$0, double $$1, double $$2, double $$3, int $$4) {
      this(biu.J, $$0);
      this.e($$1, $$2, $$3);
      this.r((float)(this.ag.j() * 360.0));
      this.o((this.ag.j() * 0.2F - 0.1F) * 2.0, this.ag.j() * 0.2 * 2.0, (this.ag.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public biw(biu<? extends biw> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected biq.b aU() {
      return biq.b.a;
   }

   @Override
   protected void a_() {
   }

   @Override
   public void l() {
      super.l();
      this.K = this.dq();
      this.L = this.ds();
      this.M = this.dw();
      if (this.a(apy.a)) {
         this.v();
      } else if (!this.aT()) {
         this.f(this.do().b(0.0, -0.03, 0.0));
      }

      if (this.dL().b_(this.dl()).a(apy.b)) {
         this.o((double)((this.ag.i() - this.ag.i()) * 0.2F), 0.2F, (double)((this.ag.i() - this.ag.i()) * 0.2F));
      }

      if (!this.dL().b(this.cG())) {
         this.m(this.dq(), (this.cG().b + this.cG().e) / 2.0, this.dw());
      }

      if (this.ah % 20 == 1) {
         this.t();
      }

      if (this.k != null && (this.k.M_() || this.k.ev())) {
         this.k = null;
      }

      if (this.k != null) {
         ehn $$0 = new ehn(this.k.dq() - this.dq(), this.k.ds() + (double)this.k.cH() / 2.0 - this.ds(), this.k.dw() - this.dw());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.f(this.do().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(bjm.a, this.do());
      float $$3 = 0.98F;
      if (this.aA()) {
         $$3 = this.dL().a_(this.aG()).b().h() * 0.98F;
      }

      this.f(this.do().d((double)$$3, 0.98, (double)$$3));
      if (this.aA()) {
         this.f(this.do().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.ak();
      }
   }

   @Override
   protected gw aG() {
      return this.d(0.999999F);
   }

   private void t() {
      if (this.k == null || this.k.f(this) > 64.0) {
         this.k = this.dL().a(this, 8.0);
      }

      if (this.dL() instanceof akr) {
         for (biw $$1 : this.dL().a(djh.a(biw.class), this.cG().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(akr $$0, ehn $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new biw($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(akr $$0, ehn $$1, int $$2) {
      ehi $$3 = ehi.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.D_().a(40);
      List<biw> $$5 = $$0.a(djh.a(biw.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         biw $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(biw $$0) {
      return $$0 != this && a($$0, this.ah(), this.i);
   }

   private static boolean a(biw $$0, int $$1, int $$2) {
      return !$$0.dG() && ($$0.ah() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(biw $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ak();
   }

   private void v() {
      ehn $$0 = this.do();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bg() {
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dL().B) {
         return true;
      } else {
         this.bo();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.ak();
         }

         return true;
      }
   }

   @Override
   public void b(qy $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(qy $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cbu $$0) {
      if (!this.dL().B) {
         if ($$0.bX == 0) {
            $$0.bX = 2;
            $$0.a(this, 1);
            int $$1 = this.a($$0, this.i);
            if ($$1 > 0) {
               $$0.d($$1);
            }

            this.j--;
            if (this.j == 0) {
               this.ak();
            }
         }
      }
   }

   private int a(cbu $$0, int $$1) {
      Entry<biv, cjf> $$2 = cnq.a(cns.L, $$0, cjf::j);
      if ($$2 != null) {
         cjf $$3 = $$2.getValue();
         int $$4 = Math.min(this.d(this.i), $$3.k());
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
   public boolean cp() {
      return false;
   }

   @Override
   public ve<wx> di() {
      return new wz(this);
   }

   @Override
   public apf da() {
      return apf.i;
   }
}
