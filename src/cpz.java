import java.util.UUID;
import javax.annotation.Nullable;

public class cpz extends bvb implements bww {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private int d;
   private boolean e;
   private int f = 22;
   private boolean g;
   @Nullable
   private bvx h;
   @Nullable
   private UUID i;

   public cpz(bvi<? extends cpz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cpz(dgz $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bvx $$6) {
      this(bvi.U, $$0);
      this.d = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akw.a $$0) {
   }

   public void a(@Nullable bvx $$0) {
      this.h = $$0;
      this.i = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public bvx l() {
      if (this.h == null && this.i != null && this.dW() instanceof arx) {
         bvb $$0 = ((arx)this.dW()).a(this.i);
         if ($$0 instanceof bvx) {
            this.h = (bvx)$$0;
         }
      }

      return this.h;
   }

   @Override
   protected void a(um $$0) {
      this.d = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.i = $$0.a("Owner");
      }
   }

   @Override
   protected void b(um $$0) {
      $$0.a("Warmup", this.d);
      if (this.i != null) {
         $$0.a("Owner", this.i);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.g) {
            this.f--;
            if (this.f == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dB() + (this.ae.j() * 2.0 - 1.0) * (double)this.dr() * 0.5;
                  double $$2 = this.dD() + 0.05 + this.ae.j();
                  double $$3 = this.dH() + (this.ae.j() * 2.0 - 1.0) * (double)this.dr() * 0.5;
                  double $$4 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ae.j() * 0.3;
                  double $$6 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  this.dW().a(ls.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.d < 0) {
         if (this.d == -8) {
            for (bvx $$8 : this.dW().a(bvx.class, this.cR().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.e) {
            this.dW().a(this, (byte)4);
            this.e = true;
         }

         if (--this.f < 0) {
            this.at();
         }
      }
   }

   private void c(bvx $$0) {
      bvx $$1 = this.l();
      if ($$0.bL() && !$$0.cC() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dX().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            btr $$2 = this.dX().c(this, (bvb)$$1);
            if (this.dW() instanceof arx $$3 && $$0.a($$3, $$2, 6.0F)) {
               dds.a($$3, (bvb)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.g = true;
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.iW, this.dn(), 1.0F, this.ae.i() * 0.2F + 0.85F, false);
         }
      }
   }

   public float a(float $$0) {
      if (!this.g) {
         return 0.0F;
      } else {
         int $$1 = this.f - 2;
         return $$1 <= 0 ? 1.0F : 1.0F - ((float)$$1 - $$0) / 20.0F;
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }
}
