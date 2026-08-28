import java.util.UUID;
import javax.annotation.Nullable;

public class csv extends bxe implements bzd {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private static final int d = 0;
   private int e = 0;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private byf i;
   @Nullable
   private UUID j;

   public csv(bxn<? extends csv> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public csv(dkj $$0, double $$1, double $$2, double $$3, float $$4, int $$5, byf $$6) {
      this(bxn.U, $$0);
      this.e = $$5;
      this.a($$6);
      this.w($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(aky.a $$0) {
   }

   public void a(@Nullable byf $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public byf f() {
      if (this.i == null && this.j != null && this.dV() instanceof asb) {
         bxe $$0 = ((asb)this.dV()).b(this.j);
         if ($$0 instanceof byf) {
            this.i = (byf)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(ua $$0) {
      this.e = $$0.b("Warmup", 0);
      this.j = $$0.<UUID>a("Owner", ka.a).orElse(null);
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("Warmup", this.e);
      $$0.b("Owner", ka.a, this.j);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dA() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$2 = this.dC() + 0.05 + this.ae.j();
                  double $$3 = this.dG() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$4 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ae.j() * 0.3;
                  double $$6 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  this.dV().a(lz.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (byf $$8 : this.dV().a(byf.class, this.cR().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dV().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.aq();
         }
      }
   }

   private void c(byf $$0) {
      byf $$1 = this.f();
      if ($$0.bJ() && !$$0.cC() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dW().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bvt $$2 = this.dW().c(this, (bxe)$$1);
            if (this.dV() instanceof asb $$3 && $$0.a($$3, $$2, 6.0F)) {
               dgz.a($$3, (bxe)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.ba()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.iZ, this.dm(), 1.0F, this.ae.i() * 0.2F + 0.85F, false);
         }
      }
   }

   public float a(float $$0) {
      if (!this.h) {
         return 0.0F;
      } else {
         int $$1 = this.g - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ((float)$$1 - $$0) / 20.0F;
      }
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }
}
