import java.util.UUID;
import javax.annotation.Nullable;

public class cfs extends blv implements bni {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bml i;
   @Nullable
   private UUID j;

   public cfs(blz<? extends cfs> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cfs(ctp $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bml $$6) {
      this(blz.I, $$0);
      this.e = $$5;
      this.a($$6);
      this.r($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void c_() {
   }

   public void a(@Nullable bml $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cw();
   }

   @Nullable
   public bml q() {
      if (this.i == null && this.j != null && this.dM() instanceof and) {
         blv $$0 = ((and)this.dM()).a(this.j);
         if ($$0 instanceof bml) {
            this.i = (bml)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(sn $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(sn $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dr() + (this.ag.j() * 2.0 - 1.0) * (double)this.dg() * 0.5;
                  double $$2 = this.dt() + 0.05 + this.ag.j();
                  double $$3 = this.dx() + (this.ag.j() * 2.0 - 1.0) * (double)this.dg() * 0.5;
                  double $$4 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ag.j() * 0.3;
                  double $$6 = (this.ag.j() * 2.0 - 1.0) * 0.3;
                  this.dM().a(jx.g, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (bml $$8 : this.dM().a(bml.class, this.cH().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dM().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.am();
         }
      }
   }

   private void c(bml $$0) {
      bml $$1 = this.q();
      if ($$0.bx() && !$$0.cr() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dN().o(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            $$0.a(this.dN().c(this, $$1), 6.0F);
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.hX, this.db(), 1.0F, this.ag.i() * 0.2F + 0.85F, false);
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
}
