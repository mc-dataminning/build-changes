import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvn extends bva {
   private static final int a = 6000;
   private static final int b = 20;
   private static final int c = 8;
   private static final int d = 40;
   private static final double e = 0.5;
   private int f;
   private int g = 5;
   private int h;
   private int i = 1;
   @Nullable
   private cpr j;
   private final bvt k = new bvt(this);

   public bvn(dgz $$0, double $$1, double $$2, double $$3, int $$4) {
      this(bvi.V, $$0);
      this.a_($$1, $$2, $$3);
      if (!this.dU().C) {
         this.w((float)(this.ae.j() * 360.0));
         this.n((this.ae.j() * 0.2F - 0.1F) * 2.0, this.ae.j() * 0.2 * 2.0, (this.ae.j() * 0.2F - 0.1F) * 2.0);
      }

      this.h = $$4;
   }

   public bvn(bvi<? extends bvn> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   protected double bd() {
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
         if (this.a(awv.a)) {
            this.n();
         } else if (!$$0) {
            this.bf();
         }

         if (this.dU().b_(this.du()).a(awv.b)) {
            this.n((double)((this.ae.i() - this.ae.i()) * 0.2F), 0.2F, (double)((this.ae.i() - this.ae.i()) * 0.2F));
         }

         if (this.af % 20 == 1) {
            this.m();
         }

         this.j();
         if (this.j == null && !this.dU().C && $$0) {
            this.m(this.dz(), (this.cQ().b + this.cQ().e) / 2.0, this.dF());
            this.ar = true;
         }

         double $$1 = this.dx().e;
         this.a(bwc.a, this.dx());
         this.aK();
         float $$2 = 0.98F;
         if (this.aJ()) {
            $$2 = this.dU().a_(this.aQ()).b().g() * 0.98F;
         }

         this.i(this.dx().c((double)$$2));
         if (this.R && $$1 < -this.be()) {
            this.i(new fbx(this.dx().d, -$$1 * 0.4, this.dx().f));
            this.ar = true;
         }

         this.f++;
         if (this.f >= 6000) {
            this.at();
         }
      }
   }

   private void j() {
      if (this.j == null || this.j.g(this) > 64.0) {
         cpr $$0 = this.dU().a(this, 8.0);
         if ($$0 != null && !$$0.U_() && !$$0.eF()) {
            this.j = $$0;
         } else {
            this.j = null;
         }
      }

      if (this.j != null) {
         fbx $$1 = new fbx(this.j.dz() - this.dz(), this.j.dB() + (double)this.j.cR() / 2.0 - this.dB(), this.j.dF() - this.dF());
         double $$2 = $$1.h();
         double $$3 = 1.0 - Math.sqrt($$2) / 8.0;
         this.i(this.dx().e($$1.d().c($$3 * $$3 * 0.1)));
      }
   }

   @Override
   public ji aQ() {
      return this.f(0.999999F);
   }

   private void m() {
      if (this.dU() instanceof ard) {
         for (bvn $$1 : this.dU().a(ecb.a(bvn.class), this.cQ().g(0.5), this::a)) {
            this.b($$1);
         }
      }
   }

   public static void a(ard $$0, fbx $$1, int $$2) {
      while ($$2 > 0) {
         int $$3 = b($$2);
         $$2 -= $$3;
         if (!b($$0, $$1, $$3)) {
            $$0.b(new bvn($$0, $$1.a(), $$1.b(), $$1.c(), $$3));
         }
      }
   }

   private static boolean b(ard $$0, fbx $$1, int $$2) {
      fbs $$3 = fbs.a($$1, 1.0, 1.0, 1.0);
      int $$4 = $$0.C_().a(40);
      List<bvn> $$5 = $$0.a(ecb.a(bvn.class), $$3, $$2x -> a($$2x, $$4, $$2));
      if (!$$5.isEmpty()) {
         bvn $$6 = $$5.get(0);
         $$6.i++;
         $$6.f = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean a(bvn $$0) {
      return $$0 != this && a($$0, this.ar(), this.h);
   }

   private static boolean a(bvn $$0, int $$1, int $$2) {
      return !$$0.dP() && ($$0.ar() - $$1) % 40 == 0 && $$0.h == $$2;
   }

   private void b(bvn $$0) {
      this.i = this.i + $$0.i;
      this.f = Math.min(this.f, $$0.f);
      $$0.at();
   }

   private void n() {
      fbx $$0 = this.dx();
      this.n($$0.d * 0.99F, Math.min($$0.e + 5.0E-4F, 0.06F), $$0.f * 0.99F);
   }

   @Override
   protected void bq() {
   }

   @Override
   public final boolean b(btp $$0) {
      return !this.d($$0);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else {
         this.bB();
         this.g = (int)((float)this.g - $$2);
         if (this.g <= 0) {
            this.at();
         }

         return true;
      }
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Health", (short)this.g);
      $$0.a("Age", (short)this.f);
      $$0.a("Value", (short)this.h);
      $$0.a("Count", this.i);
   }

   @Override
   public void a(tq $$0) {
      this.g = $$0.g("Health");
      this.f = $$0.g("Age");
      this.h = $$0.g("Value");
      this.i = Math.max($$0.h("Count"), 1);
   }

   @Override
   public void a_(cpr $$0) {
      if ($$0 instanceof are $$1) {
         if ($$0.bW == 0) {
            $$0.bW = 2;
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

   private int a(are $$0, int $$1) {
      Optional<ddq> $$2 = ddt.a(dds.z, $$0, cxh::n);
      if ($$2.isPresent()) {
         cxh $$3 = $$2.get().a();
         int $$4 = ddt.c($$0.y(), $$3, $$1);
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
      return this.h;
   }

   public int g() {
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
   public boolean cA() {
      return false;
   }

   @Override
   public awb dl() {
      return awb.i;
   }

   @Override
   public bvt N_() {
      return this.k;
   }
}
