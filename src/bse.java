import java.util.List;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class bse extends brv {
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i;
   private int j = 1;
   @Nullable
   private bse.c k;

   public bse(dca $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bsb.O, $$0);
      this.a_($$1, $$2, $$3);
      this.r((float)(this.al.j() * 360.0));
      this.o((this.al.j() * 0.2F - 0.1F) * 2.0, this.al.j() * 0.2 * 2.0, (this.al.j() * 0.2F - 0.1F) * 2.0);
      this.i = $$4;
   }

   public bse(bsb<? extends bse> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected double bc() {
      return 0.03;
   }

   @Override
   public void l() {
      super.l();
      this.M = this.dz();
      this.N = this.dB();
      this.O = this.dF();
      if (this.a(awj.a)) {
         this.w();
      } else {
         this.be();
      }

      if (this.dU().b_(this.du()).a(awj.b)) {
         this.o((double)((this.al.i() - this.al.i()) * 0.2F), 0.2F, (double)((this.al.i() - this.al.i()) * 0.2F));
      }

      if (!this.dU().b(this.cP())) {
         this.m(this.dz(), (this.cP().b + this.cP().e) / 2.0, this.dF());
      }

      if (this.am % 20 == 1) {
         this.u();
      }

      if (this.k != null) {
         if (this.k.b()) {
            ewu $$0 = this.k.a().a(this.dz(), this.dB(), this.dF());
            double $$1 = $$0.g();
            if ($$1 < 64.0) {
               double $$2 = 1.0 - Math.sqrt($$1) / 8.0;
               this.g(this.dx().e($$0.d().a($$2 * $$2 * 0.1)));
            }
         } else {
            this.k = null;
         }
      }

      this.a(bst.a, this.dx());
      float $$3 = 0.98F;
      if (this.aE()) {
         $$3 = this.dU().a_(this.aN()).b().h() * 0.98F;
      }

      this.g(this.dx().d((double)$$3, 0.98, (double)$$3));
      if (this.aE()) {
         this.g(this.dx().d(1.0, -0.9, 1.0));
      }

      this.g++;
      if (this.g >= 6000) {
         this.ao();
      }
   }

   @Override
   protected ir aN() {
      return this.d(0.999999F);
   }

   private void u() {
      if (this.k == null || this.k.a().c(this.dz(), this.dB(), this.dF()) > 64.0) {
         cly $$0 = this.dU().a(this, 8.0);
         if ($$0 != null) {
            this.k = new bse.b($$0);
         }
      }

      if (this.dU() instanceof aqt) {
         for (bse $$2 : this.dU().a(dxj.a(bse.class), this.cP().g(0.5), this::a)) {
            this.b($$2);
         }
      }
   }

   public static void a(aqt $$0, ewu $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bse($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(aqt $$0, ewu $$1, int $$2) {
      ewp $$3 = ewp.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.F_().a(40);
      List<bse> $$5 = $$0.a(dxj.a(bse.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bse $$6 = $$5.get(0);
         $$6.j++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bse $$0) {
      return $$0 != this && a($$0, this.al(), this.i);
   }

   private static boolean a(bse $$0, int $$1, int $$2) {
      return !$$0.dP() && ($$0.al() - $$1) % 40 == 0 && $$0.i == $$2;
   }

   private void b(bse $$0) {
      this.j = this.j + $$0.j;
      this.g = Math.min(this.g, $$0.g);
      $$0.ao();
   }

   private void w() {
      ewu $$0 = this.dx();
      this.o($$0.c * 0.99F, Math.min($$0.d + 5.0E-4F, 0.06F), $$0.e * 0.99F);
   }

   @Override
   protected void br() {
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.dU().C) {
         return true;
      } else {
         this.bA();
         this.h = (int)((float)this.h - $$1);
         if (this.h <= 0) {
            this.ao();
         }

         return true;
      }
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.i);
      $$0.a("Count", this.j);
   }

   @Override
   public void a(uk $$0) {
      this.h = $$0.g("Health");
      this.g = $$0.g("Age");
      this.i = $$0.g("Value");
      this.j = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void b_(cly $$0) {
      if (!this.dU().C) {
         if ($$0.cv == 0) {
            $$0.cv = 2;
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

   private int a(cly $$0, int $$1) {
      Entry<bsc, cuh> $$2 = dae.a(dag.M, $$0, cuh::l);
      if ($$2 != null) {
         cuh $$3 = $$2.getValue();
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
      return this.i * this.j;
   }

   public int t() {
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
   public boolean cy() {
      return false;
   }

   @Override
   public zl<abw> dq() {
      return new aby(this);
   }

   public void a(ir $$0) {
      bse.a $$1 = new bse.a($$0);
      if (this.k == null || this.k.a().f(this.ds()) > $$1.a().f(this.ds())) {
         this.k = $$1;
      }
   }

   @Override
   public avq dj() {
      return avq.i;
   }

   static class a implements bse.c {
      private final ir a;

      a(ir $$0) {
         this.a = $$0;
      }

      @Override
      public ewu a() {
         return ewu.b(this.a);
      }

      @Override
      public boolean b() {
         return true;
      }
   }

   static class b implements bse.c {
      private final cly a;

      b(cly $$0) {
         this.a = $$0;
      }

      @Override
      public ewu a() {
         return new ewu(this.a.dz(), this.a.dB() + (double)this.a.cQ() / 2.0, this.a.dF());
      }

      @Override
      public boolean b() {
         return !this.a.O_() && !this.a.eJ();
      }
   }

   interface c {
      ewu a();

      boolean b();
   }
}
