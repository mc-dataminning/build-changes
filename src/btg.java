import java.util.List;
import java.util.Map.Entry;

public class btg extends bsv {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cmy k;

   public btg(dbz $$0, double $$1, double $$2, double $$3, int $$4) {
      this(btb.M, $$0);
      this.a_($$1, $$2, $$3);
      this.r((float)(this.ah.j() * 360.0));
      this.o((this.ah.j() * 0.2F - 0.1F) * 2.0, this.ah.j() * 0.2 * 2.0, (this.ah.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public btg(btb<? extends btg> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected bsv.b bb() {
      return bsv.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
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
      if (this.a(awv.a)) {
         this.v();
      } else {
         this.ba();
      }

      if (this.dP().b_(this.dp()).a(awv.b)) {
         this.o((double)((this.ah.i() - this.ah.i()) * 0.2F), 0.2F, (double)((this.ah.i() - this.ah.i()) * 0.2F));
      }

      if (!this.dP().b(this.cK())) {
         this.m(this.du(), (this.cK().b + this.cK().e) / 2.0, this.dA());
      }

      if (this.ai % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.N_() || this.k.eB())) {
         this.k = null;
      }

      if (this.k != null) {
         evs $$0 = new evs(this.k.du() - this.du(), this.k.dw() + (double)this.k.cL() / 2.0 - this.dw(), this.k.dA() - this.dA());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.ds().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(btv.a, this.ds());
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
   protected iz aK() {
      return this.d(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dP().a(this, 8.0);
      }

      if (this.dP() instanceof arf) {
         for (btg $$1 : this.dP().a(dwk.a(btg.class), this.cK().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(arf $$0, evs $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new btg($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(arf $$0, evs $$1, int $$2) {
      evn $$3 = evn.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<btg> $$5 = $$0.a(dwk.a(btg.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         btg $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(btg $$0) {
      return $$0 != this && a($$0, this.al(), this.i);
   }

   private static boolean a(btg $$0, int $$1, int $$2) {
      return !$$0.dK() && ($$0.al() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(btg $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ao();
   }

   private void v() {
      evs $$0 = this.ds();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bn() {
   }

   @Override
   public boolean a(bro $$0, float $$1) {
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
   public void b(us $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(us $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cmy $$0) {
      if (!this.dP().B) {
         if ($$0.cg == 0) {
            $$0.cg = 2;
            $$0.a(this, 1);
            int $$1 = this.a($$0, this.i);
            if ($$1 > 0) {
               $$0.d($$1);
            }

            this.j--;
            if (this.j == 0) {
               this.ao();
            }
         }
      }
   }

   private int a(cmy $$0, int $$1) {
      Entry<btc, cuq> $$2 = dac.a(dae.O, $$0, cuq::m);
      if ($$2 != null) {
         cuq $$3 = $$2.getValue();
         int $$4 = Math.min(this.d($$1), $$3.n());
         $$3.b($$3.n() - $$4);
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
   public zw<aci> dl() {
      return new ack(this);
   }

   @Override
   public awb de() {
      return awb.i;
   }
}
