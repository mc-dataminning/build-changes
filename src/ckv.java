import java.util.UUID;
import javax.annotation.Nullable;

public class ckv extends bql implements bsc {
   public static final int b = 20;
   public static final int c = 2;
   public static final int d = 14;
   private int e;
   private boolean f;
   private int g = 22;
   private boolean h;
   @Nullable
   private bre i;
   @Nullable
   private UUID j;

   public ckv(bqr<? extends ckv> $$0, czu $$1) {
      super($$0, $$1);
   }

   public ckv(czu $$0, double $$1, double $$2, double $$3, float $$4, int $$5, bre $$6) {
      this(bqr.K, $$0);
      this.e = $$5;
      this.a($$6);
      this.r($$4 * (180.0F / (float)Math.PI));
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   public void a(@Nullable bre $$0) {
      this.i = $$0;
      this.j = $$0 == null ? null : $$0.cx();
   }

   @Nullable
   public bre p() {
      if (this.i == null && this.j != null && this.dN() instanceof aqe) {
         bql $$0 = ((aqe)this.dN()).a(this.j);
         if ($$0 instanceof bre) {
            this.i = (bre)$$0;
         }
      }

      return this.i;
   }

   @Override
   protected void a(ty $$0) {
      this.e = $$0.h("Warmup");
      if ($$0.b("Owner")) {
         this.j = $$0.a("Owner");
      }
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("Warmup", this.e);
      if (this.j != null) {
         $$0.a("Owner", this.j);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         if (this.h) {
            this.g--;
            if (this.g == 14) {
               for (int $$0 = 0; $$0 < 12; $$0++) {
                  double $$1 = this.ds() + (this.ah.j() * 2.0 - 1.0) * (double)this.dh() * 0.5;
                  double $$2 = this.du() + 0.05 + this.ah.j();
                  double $$3 = this.dy() + (this.ah.j() * 2.0 - 1.0) * (double)this.dh() * 0.5;
                  double $$4 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  double $$5 = 0.3 + this.ah.j() * 0.3;
                  double $$6 = (this.ah.j() * 2.0 - 1.0) * 0.3;
                  this.dN().a(kw.f, $$1, $$2 + 1.0, $$3, $$4, $$5, $$6);
               }
            }
         }
      } else if (--this.e < 0) {
         if (this.e == -8) {
            for (bre $$8 : this.dN().a(bre.class, this.cI().c(0.2, 0.0, 0.2))) {
               this.c($$8);
            }
         }

         if (!this.f) {
            this.dN().a(this, (byte)4);
            this.f = true;
         }

         if (--this.g < 0) {
            this.am();
         }
      }
   }

   private void c(bre $$0) {
      bre $$1 = this.p();
      if ($$0.bB() && !$$0.cs() && $$0 != $$1) {
         if ($$1 == null) {
            $$0.a(this.dO().o(), 6.0F);
         } else {
            if ($$1.s($$0)) {
               return;
            }

            $$0.a(this.dO().c(this, (bql)$$1), 6.0F);
         }
      }
   }

   @Override
   public void b(byte $$0) {
      super.b($$0);
      if ($$0 == 4) {
         this.h = true;
         if (!this.aU()) {
            this.dN().a(this.ds(), this.du(), this.dy(), auz.iw, this.dc(), 1.0F, this.ah.i() * 0.2F + 0.85F, false);
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
