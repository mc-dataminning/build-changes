import java.util.List;
import java.util.Map.Entry;

public class bon extends bof {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cia k;

   public bon(cwe $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bol.L, $$0);
      this.a_($$1, $$2, $$3);
      this.r((float)(this.af.j() * 360.0));
      this.o((this.af.j() * 0.2F - 0.1F) * 2.0, this.af.j() * 0.2 * 2.0, (this.af.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bon(bol<? extends bon> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   protected void c_() {
   }

   @Override
   public void l() {
      super.l();
      this.J = this.do();
      this.K = this.dq();
      this.L = this.du();
      if (this.a(auj.a)) {
         this.w();
      } else if (!this.aV()) {
         this.g(this.dm().b(0.0, -0.03, 0.0));
      }

      if (this.dJ().b_(this.dj()).a(auj.b)) {
         this.o((double)((this.af.i() - this.af.i()) * 0.2F), 0.2F, (double)((this.af.i() - this.af.i()) * 0.2F));
      }

      if (!this.dJ().b(this.cE())) {
         this.m(this.do(), (this.cE().b + this.cE().e) / 2.0, this.du());
      }

      if (this.ag % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.P_() || this.k.ev())) {
         this.k = null;
      }

      if (this.k != null) {
         eov $$0 = new eov(this.k.do() - this.do(), this.k.dq() + (double)this.k.cF() / 2.0 - this.dq(), this.k.du() - this.du());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.g(this.dm().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(bpc.a, this.dm());
      float $$3 = 0.98F;
      if (this.aC()) {
         $$3 = this.dJ().a_(this.aI()).b().h() * 0.98F;
      }

      this.g(this.dm().d((double)$$3, 0.98, (double)$$3));
      if (this.aC()) {
         this.g(this.dm().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.am();
      }
   }

   @Override
   protected ib aI() {
      return this.d(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.f(this) > 64.0) {
         this.k = this.dJ().a(this, 8.0);
      }

      if (this.dJ() instanceof apa) {
         for (bon $$1 : this.dJ().a(dqf.a(bon.class), this.cE().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(apa $$0, eov $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bon($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(apa $$0, eov $$1, int $$2) {
      eoq $$3 = eoq.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.F_().a(40);
      List<bon> $$5 = $$0.a(dqf.a(bon.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bon $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bon $$0) {
      return $$0 != this && a($$0, this.aj(), this.i);
   }

   private static boolean a(bon $$0, int $$1, int $$2) {
      return !$$0.dE() && ($$0.aj() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bon $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.am();
   }

   private void w() {
      eov $$0 = this.dm();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bi() {
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dJ().B) {
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
   public void b(sy $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(sy $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cia $$0) {
      if (!this.dJ().B) {
         if ($$0.cc == 0) {
            $$0.cc = 2;
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

   private int a(cia $$0, int $$1) {
      Entry<bom, cpq> $$2 = cua.a(cuc.L, $$0, cpq::k);
      if ($$2 != null) {
         cpq $$3 = $$2.getValue();
         int $$4 = Math.min(this.d($$1), $$3.l());
         $$3.b($$3.l() - $$4);
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
   public boolean cn() {
      return false;
   }

   @Override
   public xz<aai> df() {
      return new aak(this);
   }

   @Override
   public atq cY() {
      return atq.i;
   }
}
