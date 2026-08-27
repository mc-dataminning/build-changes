import java.util.List;
import java.util.Map.Entry;

public class bqu extends bql {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private ckl k;

   public bqu(czu $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bqr.M, $$0);
      this.a_($$1, $$2, $$3);
      this.r((float)(this.ah.j() * 360.0));
      this.o((this.ah.j() * 0.2F - 0.1F) * 2.0, this.ah.j() * 0.2 * 2.0, (this.ah.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bqu(bqr<? extends bqu> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   protected double aW() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.L = this.ds();
      this.M = this.du();
      this.N = this.dy();
      if (this.a(avt.a)) {
         this.v();
      } else {
         this.aY();
      }

      if (this.dN().b_(this.dn()).a(avt.b)) {
         this.o((double)((this.ah.i() - this.ah.i()) * 0.2F), 0.2F, (double)((this.ah.i() - this.ah.i()) * 0.2F));
      }

      if (!this.dN().b(this.cI())) {
         this.m(this.ds(), (this.cI().b + this.cI().e) / 2.0, this.dy());
      }

      if (this.ai % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.N_() || this.k.ez())) {
         this.k = null;
      }

      if (this.k != null) {
         etf $$0 = new etf(this.k.ds() - this.ds(), this.k.du() + (double)this.k.cJ() / 2.0 - this.du(), this.k.dy() - this.dy());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.g(this.dq().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(brj.a, this.dq());
      float $$3 = 0.98F;
      if (this.aC()) {
         $$3 = this.dN().a_(this.aI()).b().h() * 0.98F;
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
   protected im aI() {
      return this.d(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dN().a(this, 8.0);
      }

      if (this.dN() instanceof aqe) {
         for (bqu $$1 : this.dN().a(duf.a(bqu.class), this.cI().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aqe $$0, etf $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bqu($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aqe $$0, etf $$1, int $$2) {
      eta $$3 = eta.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<bqu> $$5 = $$0.a(duf.a(bqu.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bqu $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bqu $$0) {
      return $$0 != this && a($$0, this.aj(), this.i);
   }

   private static boolean a(bqu $$0, int $$1, int $$2) {
      return !$$0.dI() && ($$0.aj() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bqu $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.am();
   }

   private void v() {
      etf $$0 = this.dq();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bl() {
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dN().B) {
         return true;
      } else {
         this.bt();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.am();
         }

         return true;
      }
   }

   @Override
   public void b(ty $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(ty $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(ckl $$0) {
      if (!this.dN().B) {
         if ($$0.ch == 0) {
            $$0.ch = 2;
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

   private int a(ckl $$0, int $$1) {
      Entry<bqs, csd> $$2 = cxo.a(cxq.L, $$0, csd::l);
      if ($$2 != null) {
         csd $$3 = $$2.getValue();
         int $$4 = Math.min(this.d($$1), $$3.m());
         $$3.b($$3.m() - $$4);
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

   public int p() {
      return this.i;
   }

   public int r() {
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
   public boolean cr() {
      return false;
   }

   @Override
   public yz<abk> dj() {
      return new abm(this);
   }

   @Override
   public ava dc() {
      return ava.i;
   }
}
