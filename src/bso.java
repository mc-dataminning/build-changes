import java.util.List;
import java.util.Optional;

public class bso extends bsd {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cmh k;

   public bso(dcd $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bsj.M, $$0);
      this.a_($$1, $$2, $$3);
      this.s((float)(this.ah.j() * 360.0));
      this.o((this.ah.j() * 0.2F - 0.1F) * 2.0, this.ah.j() * 0.2 * 2.0, (this.ah.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bso(bsj<? extends bso> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.a;
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected double aY() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.L = this.du();
      this.M = this.dw();
      this.N = this.dA();
      if (this.a(awa.a)) {
         this.v();
      } else {
         this.ba();
      }

      if (this.dP().b_(this.dp()).a(awa.b)) {
         this.o((double)((this.ah.i() - this.ah.i()) * 0.2F), 0.2F, (double)((this.ah.i() - this.ah.i()) * 0.2F));
      }

      if (!this.dP().b(this.cK())) {
         this.m(this.du(), (this.cK().b + this.cK().e) / 2.0, this.dA());
      }

      if (this.ai % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.N_() || this.k.ex())) {
         this.k = null;
      }

      if (this.k != null) {
         evz $$0 = new evz(this.k.du() - this.du(), this.k.dw() + (double)this.k.cL() / 2.0 - this.dw(), this.k.dA() - this.dA());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.ds().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(btd.a, this.ds());
      float $$3 = 0.98F;
      if (this.aE()) {
         $$3 = this.dP().a_(this.aK()).b().h() * 0.98F;
      }

      this.h(this.ds().d((double)$$3, 0.98, (double)$$3));
      if (this.aE()) {
         this.h(this.ds().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.ao();
      }
   }

   @Override
   protected ja aK() {
      return this.e(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dP().a(this, 8.0);
      }

      if (this.dP() instanceof aqk) {
         for (bso $$1 : this.dP().a(dwo.a(bso.class), this.cK().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aqk $$0, evz $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bso($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aqk $$0, evz $$1, int $$2) {
      evu $$3 = evu.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<bso> $$5 = $$0.a(dwo.a(bso.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bso $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bso $$0) {
      return $$0 != this && a($$0, this.al(), this.i);
   }

   private static boolean a(bso $$0, int $$1, int $$2) {
      return !$$0.dK() && ($$0.al() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bso $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ao();
   }

   private void v() {
      evz $$0 = this.ds();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bn() {
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dP().B) {
         return true;
      } else {
         this.bv();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.ao();
         }

         return true;
      }
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(tx $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cmh $$0) {
      if ($$0 instanceof aql $$1) {
         if ($$0.ci == 0) {
            $$0.ci = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.i);
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.j--;
            if (this.j == 0) {
               this.ao();
            }
         }
      }
   }

   private int a(aql $$0, int $$1) {
      Optional<czi> $$2 = czl.a(czk.B, $$0, cua::m);
      if ($$2.isPresent()) {
         cua $$3 = $$2.get().a();
         int $$4 = czl.c($$0.z(), $$3, $$1);
         int $$5 = Math.min($$4, $$3.n());
         $$3.b($$3.n() - $$5);
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

   public int p() {
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
   public boolean ct() {
      return false;
   }

   @Override
   public zb<abn> dl() {
      return new abp(this);
   }

   @Override
   public avg de() {
      return avg.i;
   }
}
