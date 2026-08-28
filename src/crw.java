import java.util.UUID;
import javax.annotation.Nullable;

public class crw extends bwi implements byh {
   public static final int a = 20;
   public static final int b = 2;
   public static final int c = 14;
   private int d;
   private boolean e;
   private int f = 22;
   private boolean g;
   @Nullable
   private bxj h;
   @Nullable
   private UUID i;

   public crw(bwr<? extends crw> $$0, djh $$1) {
      super($$0, $$1);
   }

   public crw(djh $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bxj $$6) {
      this(bwr.T, $$0);
      this.d = $$5;
      this.a($$6);
      this.w($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akn.a $$0) {
   }

   public void a(@Nullable bxj $$0) {
      this.h = $$0;
      this.i = $$0 == null ? null : $$0.cF();
   }

   @Nullable
   public bxj f() {
      if (this.h == null && this.i != null && this.dU() instanceof arq) {
         bwi $$0 = ((arq)this.dU()).b(this.i);
         if ($$0 instanceof bxj) {
            this.h = (bxj)$$0;
         }
      }

      return this.h;
   }

   @Override
   protected void a(tz $$0) {
      this.d = $$0.f("Warmup");
      this.i = $$0.<UUID>a("Owner", jz.a).orElse(null);
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("Warmup", this.d);
      $$0.b("Owner", jz.a, this.i);
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         if (this.g) {
            this.f--;
            if (this.f == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dz() + (this.ae.j() * 2.0 - 1.0) * (double)this.dp() * 0.5;
                  double $$2 = this.dB() + 0.05 + this.ae.j();
                  double $$3 = this.dF() + (this.ae.j() * 2.0 - 1.0) * (double)this.dp() * 0.5;
                  double $$4 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ae.j() * 0.3;
                  double $$6 = (this.ae.j() * 2.0 - 1.0) * 0.3;
                  this.dU().a(ly.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.d < 0) {
         if (this.d == -8) {
            for (bxj $$8 : this.dU().a(bxj.class, this.cQ().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.e) {
            this.dU().a(this, (byte)4);
            this.e = true;
         }

         if (--this.f < 0) {
            this.aq();
         }
      }
   }

   private void c(bxj $$0) {
      bxj $$1 = this.f();
      if ($$0.bI() && !$$0.cB() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dV().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bux $$2 = this.dV().c(this, (bwi)$$1);
            if (this.dU() instanceof arq $$3 && $$0.a($$3, $$2, 6.0F)) {
               dfz.a($$3, (bwi)$$0, $$2);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.g = true;
         if (!this.aZ()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.iZ, this.dl(), 1.0F, this.ae.i() * 0.2F + 0.85F, false);
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
   public boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
