import java.util.List;
import java.util.Map.Entry;

public class bir extends bil {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cbp k;

   public bir(cpq $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bip.J, $$0);
      this.e($$1, $$2, $$3);
      this.r((float)(this.ag.j() * 360.0));
      this.o((this.ag.j() * 0.2F - 0.1F) * 2.0, this.ag.j() * 0.2 * 2.0, (this.ag.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bir(bip<? extends bir> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected bil.b aU() {
      return bil.b.a;
   }

   @Override
   protected void a_() {
   }

   @Override
   public void l() {
      super.l();
      this.K = this.dp();
      this.L = this.dr();
      this.M = this.dv();
      if (this.a(apt.a)) {
         this.p();
      } else if (!this.aT()) {
         this.f(this.dn().b(0.0, -0.03, 0.0));
      }

      if (this.dK().b_(this.dk()).a(apt.b)) {
         this.o((double)((this.ag.i() - this.ag.i()) * 0.2F), 0.2F, (double)((this.ag.i() - this.ag.i()) * 0.2F));
      }

      if (!this.dK().b(this.cG())) {
         this.m(this.dp(), (this.cG().b + this.cG().e) / 2.0, this.dv());
      }

      if (this.ah % 20 == 1) {
         this.o();
      }

      if (this.k != null && (this.k.G_() || this.k.eu())) {
         this.k = null;
      }

      if (this.k != null) {
         ehi $$0 = new ehi(this.k.dp() - this.dp(), this.k.dr() + (double)this.k.cH() / 2.0 - this.dr(), this.k.dv() - this.dv());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.f(this.dn().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(bjh.a, this.dn());
      float $$3 = 0.98F;
      if (this.aA()) {
         $$3 = this.dK().a_(this.aG()).b().h() * 0.98F;
      }

      this.f(this.dn().d((double)$$3, 0.98, (double)$$3));
      if (this.aA()) {
         this.f(this.dn().d(1.0, -0.9, 1.0));
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

   private void o() {
      if (this.k == null || this.k.f(this) > 64.0) {
         this.k = this.dK().a(this, 8.0);
      }

      if (this.dK() instanceof akn) {
         for (bir $$1 : this.dK().a(djc.a(bir.class), this.cG().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(akn $$0, ehi $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bir($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(akn $$0, ehi $$1, int $$2) {
      ehd $$3 = ehd.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.y_().a(40);
      List<bir> $$5 = $$0.a(djc.a(bir.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bir $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bir $$0) {
      return $$0 != this && a($$0, this.ah(), this.i);
   }

   private static boolean a(bir $$0, int $$1, int $$2) {
      return !$$0.dF() && ($$0.ah() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bir $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ak();
   }

   private void p() {
      ehi $$0 = this.dn();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bg() {
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dK().B) {
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
   public void b(qu $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(qu $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cbp $$0) {
      if (!this.dK().B) {
         if ($$0.bV == 0) {
            $$0.bV = 2;
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

   private int a(cbp $$0, int $$1) {
      Entry<biq, cja> $$2 = cnl.a(cnn.L, $$0, cja::j);
      if ($$2 != null) {
         cja $$3 = $$2.getValue();
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

   public int j() {
      return this.i;
   }

   public int m() {
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
   public va<ws> U() {
      return new wu(this);
   }

   @Override
   public apa da() {
      return apa.i;
   }
}
