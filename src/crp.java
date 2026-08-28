import java.util.UUID;
import javax.annotation.Nullable;

public class crp extends bwf implements byc {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private int d;
   private boolean e;
   private int f = 22;
   private boolean g;
   @Nullable
   private bxe h;
   @Nullable
   private UUID i;

   public crp(bwo<? extends crp> $$0, dja $$1) {
      super($$0, $$1);
   }

   public crp(dja $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bxe $$6) {
      this(bwo.T, $$0);
      this.d = $$5;
      this.a($$6);
      this.w($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akn.a $$0) {
   }

   public void a(@Nullable bxe $$0) {
      this.h = $$0;
      this.i = $$0 == null ? null : $$0.cG();
   }

   @Nullable
   public bxe f() {
      if (this.h == null && this.i != null && this.dV() instanceof arq) {
         bwf $$0 = ((arq)this.dV()).b(this.i);
         if ($$0 instanceof bxe) {
            this.h = (bxe)$$0;
         }
      }

      return this.h;
   }

   @Override
   protected void a(tz $$0) {
      this.d = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.i = $$0.a("Owner");
      }
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("Warmup", this.d);
      if (this.i != null) {
         $$0.a("Owner", this.i);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.g) {
            this.f--;
            if (this.f == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dA() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$2 = this.dC() + 0.05 + this.ae.j();
                  double $$3 = this.dG() + (this.ae.j() * 2.0 - 1.0) * (double)this.dq() * 0.5;
                  double $$4 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ae.j() * 0.3;
                  double $$6 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  this.dV().a(lx.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.d < 0) {
         if (this.d == -8) {
            for (bxe $$8 : this.dV().a(bxe.class, this.cR().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.e) {
            this.dV().a(this, (byte)4);
            this.e = true;
         }

         if (--this.f < 0) {
            this.at();
         }
      }
   }

   private void c(bxe $$0) {
      bxe $$1 = this.f();
      if ($$0.bK() && !$$0.cC() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dW().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            buu $$2 = this.dW().c(this, (bwf)$$1);
            if (this.dV() instanceof arq $$3 && $$0.a($$3, $$2, 6.0F)) {
               dfs.a($$3, (bwf)$$0, $$2);
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
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.iZ, this.dm(), 1.0F, this.ae.i() * 0.2F + 0.85F, false);
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
   public boolean a(arq $$0, buu $$1, float $$2) {
      return false;
   }
}
