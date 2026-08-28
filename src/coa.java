import java.util.UUID;
import javax.annotation.Nullable;

public class coa extends btj implements bvd {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private buf i;
   @Nullable
   private UUID j;

   public coa(btq<? extends coa> $$0, dds $$1) {
      super($$0, $$1);
   }

   public coa(dds $$0, double $$1, double $$2, double $$3, float $$4, int $$5, buf $$6) {
      this(btq.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.v($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(akk.a $$0) {
   }

   public void a(@Nullable buf $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cD();
   }

   @Nullable
   public buf m() {
      if (this.i == null && this.j != null && this.dS() instanceof arg) {
         btj $$0 = ((arg)this.dS()).a(this.j);
         if ($$0 instanceof buf) {
            this.i = (buf)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(uf $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(uf $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.dx() + (this.af.j() * 2.0 - 1.0) * (double)this.dn() * 0.5;
                  double $$2 = this.dz() + 0.05 + this.af.j();
                  double $$3 = this.dD() + (this.af.j() * 2.0 - 1.0) * (double)this.dn() * 0.5;
                  double $$4 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.af.j() * 0.3;
                  double $$6 = (this.af.j() * 2.0 - 1.0) * 0.3;
                  this.dS().a(ln.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (buf $$8 : this.dS().a(buf.class, this.cO().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dS().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.as();
         }
      }
   }

   private void c(buf $$0) {
      buf $$1 = this.m();
      if ($$0.bI() && !$$0.cz() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dT().q(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            bsb $$2 = this.dT().c(this, (btj)$$1);
            if ($$0.a($$2, 6.0F) && this.dS() instanceof arg $$3) {
               day.a($$3, (btj)$$0, $$2);
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
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.iC, this.di(), 1.0F, this.af.i() * 0.2F + 0.85F, false);
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
