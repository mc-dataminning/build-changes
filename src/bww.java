import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bww extends bwi {
   protected static final akj<Integer> a = akn.a(bww.class, akl.b);
   private static final int b = 6000;
   private static final int c = 20;
   private static final int d = 8;
   private static final int e = 40;
   private static final double f = 0.5;
   private int g;
   private int h = 5;
   private int i = 1;
   @Nullable
   private crj j;
   private final bxe k = new bxe(this);

   public bww(djh $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bwr.V, $$0);
      this.a_($$1, $$2, $$3);
      if (!this.dU().C) {
         this.w((float)(this.ae.j() * 360.0));
         this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      }

      this.c($$4);
   }

   public bww(bwr<? extends bww> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, 0);
   }

   @Override
   protected double bb() {
      return 0.03;
   }

   @Override
   public void h() {
      this.k.e();
      if (this.ak && this.dU().C) {
         this.ak = false;
      } else {
         super.h();
         boolean $$0 = !this.dU().b(this.cQ());
         if (this.a(axh.a)) {
            this.n();
         } else if (!$$0) {
            this.bd();
         }

         if (this.dU().b_(this.du()).a(axh.b)) {
            this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
         }

         if (this.af % 20 == 1) {
            this.m();
         }

         this.j();
         if (this.j == null && !this.dU().C && $$0) {
            this.l(this.dz(), (this.cQ().b + this.cQ().e) / 2.0, this.dF());
            this.ar = true;
         }

         double $$1 = this.dx().e;
         this.a(bxn.a, this.dx());
         this.aI();
         float $$2 = 0.98F;
         if (this.aH()) {
            $$2 = this.dU().a_(this.aO()).b().g() * 0.98F;
         }

         this.i(this.dx().c((double)$$2));
         if (this.R && $$1 < -this.bc()) {
            this.i(new fex(this.dx().d, -$$1 * 0.4, this.dx().f));
         }

         this.g++;
         if (this.g >= 6000) {
            this.aq();
         }
      }
   }

   private void j() {
      if (this.j == null || this.j.g(this) > 64.0) {
         crj $$0 = this.dU().a(this, 8.0);
         if ($$0 != null && !$$0.V_() && !$$0.eG()) {
            this.j = $$0;
         } else {
            this.j = null;
         }
      }

      if (this.j != null) {
         fex $$1 = new fex(this.j.dz() - this.dz(), this.j.dB() + (double)this.j.cR() / 2.0 - this.dB(), this.j.dF() - this.dF());
         double $$2 = $$1.h();
         double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
         this.i(this.dx().e($$1.d().c($$3 * $$3 * 0.1)));
      }
   }

   @Override
   public iv aO() {
      return this.f(0.999999F);
   }

   private void m() {
      if (this.dU() instanceof arq) {
         for (bww $$1 : this.dU().a(efa.a(bww.class), this.cQ().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(arq $$0, fex $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bww($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(arq $$0, fex $$1, int $$2) {
      fes $$3 = fes.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.C_().a(40);
      List<bww> $$5 = $$0.a(efa.a(bww.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bww $$6 = $$5.get(0);
         $$6.i++;
         $$6.g = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bww $$0) {
      return $$0 != this && a($$0, this.ao(), this.f());
   }

   private static boolean a(bww $$0, int $$1, int $$2) {
      return !$$0.dP() && ($$0.ao() - $$1) % 40 == 0 && $$0.f() == $$2;
   }

   private void b(bww $$0) {
      this.i = this.i + $$0.i;
      this.g = Math.min(this.g, $$0.g);
      $$0.aq();
   }

   private void n() {
      fex $$0 = this.dx();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bp() {
   }

   @Override
   public final boolean b(bux $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bA();
         this.h = (int)((float)this.h - $$2);
         if (this.h <= 0) {
            this.aq();
         }

         return true;
      }
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Health", (short)this.h);
      $$0.a("Age", (short)this.g);
      $$0.a("Value", (short)this.f());
      $$0.a("Count", this.i);
   }

   @Override
   public void a(tz $$0) {
      this.h = $$0.e("Health");
      this.g = $$0.e("Age");
      this.c($$0.e("Value"));
      this.i = Math.max($$0.f("Count"), 1);
   }

   @Override
   public void a_(crj $$0) {
      if ($$0 instanceof arr $$1) {
         if ($$0.bX == 0) {
            $$0.bX = 2;
            $$0.a(this, 1);
            int $$3 = this.a($$1, this.f());
            if ($$3 > 0) {
               $$0.d($$3);
            }

            this.i--;
            if (this.i == 0) {
               this.aq();
            }
         }
      }
   }

   private int a(arr $$0, int $$1) {
      Optional<dfw> $$2 = dfz.a(dfy.z, $$0, czk::n);
      if ($$2.isPresent()) {
         czk $$3 = $$2.get().a();
         int $$4 = dfz.c($$0.y(), $$3, $$1);
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

   public int f() {
      return this.al.a(a);
   }

   private void c(int $$0) {
      this.al.a(a, $$0);
   }

   public int g() {
      int $$0 = this.f();
      if ($$0 >= 2477) {
         return 10;
      } else if ($$0 >= 1237) {
         return 9;
      } else if ($$0 >= 617) {
         return 8;
      } else if ($$0 >= 307) {
         return 7;
      } else if ($$0 >= 149) {
         return 6;
      } else if ($$0 >= 73) {
         return 5;
      } else if ($$0 >= 37) {
         return 4;
      } else if ($$0 >= 17) {
         return 3;
      } else if ($$0 >= 7) {
         return 2;
      } else {
         return $$0 >= 3 ? 1 : 0;
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
   public boolean cA() {
      return false;
   }

   @Override
   public awo dl() {
      return awo.i;
   }

   @Override
   public bxe N_() {
      return this.k;
   }
}
