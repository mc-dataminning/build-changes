import java.util.List;
import java.util.Optional;

public class bux extends bul {
   private static final int a = 6000;
   private static final int b = 20;
   private static final int c = 8;
   private static final int d = 40;
   private static final double e = 0.5;
   private int f;
   private int g = 5;
   private int h;
   private int i = 1;
   private cou j;

   public bux(dfm $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bus.U, $$0);
      this.a_($$1, $$2, $$3);
      this.v((float)(this.ae.j() * 360.0));
      this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      this.h = $$4;
   }

   public bux(bus<? extends bux> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   @Override
   protected void a(akq.a $$0) {
   }

   @Override
   protected double bd() {
      return 0.03;
   }

   @Override
   public void h() {
      super.h();
      this.K = this.dA();
      this.L = this.dC();
      this.M = this.dG();
      if (this.a(axi.a)) {
         this.q();
      } else {
         this.bf();
      }

      if (this.dV().b_(this.dv()).a(axi.b)) {
         this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
      }

      if (!this.dV().b(this.cR())) {
         this.m(this.dA(), (this.cR().b + this.cR().e) / 2.0, this.dG());
      }

      if (this.af % 20 == 1) {
         this.n();
      }

      if (this.j != null && (this.j.Y_() || this.j.eE())) {
         this.j = null;
      }

      if (this.j != null) {
         ezy $$0 = new ezy(this.j.dA() - this.dA(), this.j.dC() + (double)this.j.cS() / 2.0 - this.dC(), this.j.dG() - this.dG());
         double $$1 = $$0.h();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.h(this.dy().e($$0.d().c($$2 * $$2 * 0.1)));
         }
      }

      this.a(bvl.a, this.dy());
      this.aK();
      float $$3 = 0.98F;
      if (this.aJ()) {
         $$3 = this.dV().a_(this.aQ()).b().g() * 0.98F;
      }

      this.h(this.dy().d((double)$$3, 0.98, (double)$$3));
      if (this.aJ()) {
         this.h(this.dy().d(1.0, -0.9, 1.0));
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

   private void n() {
      if (this.j == null || this.j.g(this) > 64.0) {
         this.j = this.dV().a(this, 8.0);
      }

      if (this.dV() instanceof arp) {
         for (bux $$1 : this.dV().a(eaf.a(bux.class), this.cR().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(arp $$0, ezy $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bux($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(arp $$0, ezy $$1, int $$2) {
      ezt $$3 = ezt.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.G_().a(40);
      List<bux> $$5 = $$0.a(eaf.a(bux.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bux $$6 = $$5.get(0);
         $$6.i++;
         $$6.f = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bux $$0) {
      return $$0 != this && a($$0, this.ar(), this.h);
   }

   private static boolean a(bux $$0, int $$1, int $$2) {
      return !$$0.dQ() && ($$0.ar() - $$1) % 40 == 0 && $$0.h == $$2;
   }

   private void b(bux $$0) {
      this.i = this.i + $$0.i;
      this.f = Math.min(this.f, $$0.f);
      $$0.at();
   }

   private void q() {
      ezy $$0 = this.dy();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bs() {
   }

   @Override
   public final boolean b(btb $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
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
   public void b(ul $$0) {
      $$0.a("Health", (short)this.g);
      $$0.a("Age", (short)this.f);
      $$0.a("Value", (short)this.h);
      $$0.a("Count", this.i);
   }

   @Override
   public void a(ul $$0) {
      this.g = $$0.g("Health");
      this.f = $$0.g("Age");
      this.h = $$0.g("Value");
      this.i = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void a_(cou $$0) {
      if ($$0 instanceof arq $$1) {
         if ($$0.ch == 0) {
            $$0.ch = 2;
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

   private int a(arq $$0, int $$1) {
      Optional<dcc> $$2 = dcf.a(dce.z, $$0, cwm::n);
      if ($$2.isPresent()) {
         cwm $$3 = $$2.get().a();
         int $$4 = dcf.c($$0.y(), $$3, $$1);
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

   public int j() {
      return this.h;
   }

   public int l() {
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
   public zq<acf> a(arn $$0) {
      return new ach(this, $$0);
   }

   @Override
   public awo dm() {
      return awo.i;
   }
}
