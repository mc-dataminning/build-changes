import java.util.List;
import java.util.Optional;

public class bsr extends bsg {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   private cmk k;

   public bsr(dcf $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bsm.M, $$0);
      this.a_($$1, $$2, $$3);
      this.s((float)(this.ah.j() * 360.0));
      this.o((this.ah.j() * 0.2F - 0.1F) * 2.0, this.ah.j() * 0.2 * 2.0, (this.ah.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bsr(bsm<? extends bsr> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected double aZ() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.L = this.dv();
      this.M = this.dx();
      this.N = this.dB();
      if (this.a(awc.a)) {
         this.v();
      } else {
         this.bb();
      }

      if (this.dQ().b_(this.dq()).a(awc.b)) {
         this.o((double)((this.ah.i() - this.ah.i()) * 0.2F), 0.2F, (double)((this.ah.i() - this.ah.i()) * 0.2F));
      }

      if (!this.dQ().b(this.cL())) {
         this.m(this.dv(), (this.cL().b + this.cL().e) / 2.0, this.dB());
      }

      if (this.ai % 20 == 1) {
         this.u();
      }

      if (this.k != null && (this.k.N_() || this.k.ey())) {
         this.k = null;
      }

      if (this.k != null) {
         ewf $$0 = new ewf(this.k.dv() - this.dv(), this.k.dx() + (double)this.k.cM() / 2.0 - this.dx(), this.k.dB() - this.dB());
         double $$1 = $$0.g();
         if ($$1 < 64.0) {
            double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
            this.i(this.dt().e($$0.d().a($$2 * $$2 * 0.1)));
         }
      }

      this.a(btg.a, this.dt());
      float $$3 = 0.98F;
      if (this.aF()) {
         $$3 = this.dQ().a_(this.aL()).b().h() * 0.98F;
      }

      this.i(this.dt().d((double)$$3, 0.98, (double)$$3));
      if (this.aF()) {
         this.i(this.dt().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.ap();
      }
   }

   @Override
   protected ja aL() {
      return this.e(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.g(this) > 64.0) {
         this.k = this.dQ().a(this, 8.0);
      }

      if (this.dQ() instanceof aqm) {
         for (bsr $$1 : this.dQ().a(dwu.a(bsr.class), this.cL().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(aqm $$0, ewf $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bsr($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aqm $$0, ewf $$1, int $$2) {
      ewa $$3 = ewa.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.E_().a(40);
      List<bsr> $$5 = $$0.a(dwu.a(bsr.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bsr $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bsr $$0) {
      return $$0 != this && a($$0, this.am(), this.i);
   }

   private static boolean a(bsr $$0, int $$1, int $$2) {
      return !$$0.dL() && ($$0.am() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bsr $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ap();
   }

   private void v() {
      ewf $$0 = this.dt();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void bo() {
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dQ().B) {
         return true;
      } else {
         this.bw();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.ap();
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
   public void b_(cmk $$0) {
      if ($$0 instanceof aqn $$1) {
         if ($$0.ci == 0) {
            $$0.ci = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.i);
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.j--;
            if (this.j == 0) {
               this.ap();
            }
         }
      }
   }

   private int a(aqn $$0, int $$1) {
      Optional<czk> $$2 = czn.a(czm.z, $$0, cuc::m);
      if ($$2.isPresent()) {
         cuc $$3 = $$2.get().a();
         int $$4 = czn.c($$0.z(), $$3, $$1);
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
   public boolean cu() {
      return false;
   }

   @Override
   public zb<abn> dm() {
      return new abp(this);
   }

   @Override
   public avi df() {
      return avi.i;
   }
}
