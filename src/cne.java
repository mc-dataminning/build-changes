import com.google.common.annotations.VisibleForTesting;

public class cne extends cme {
   private static final int b = 300;
   private static final alc<Boolean> c = alg.a(cne.class, ale.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bZ;

   public cne(bvq<? extends cne> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gq() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean gp() {
      return this.gq();
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && !this.gb()) {
         if (this.av) {
            if (this.gq()) {
               this.bZ--;
               if (this.bZ < 0) {
                  this.gr();
               }
            } else {
               this.d++;
               if (this.d >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.d = -1;
            this.x(false);
         }
      }

      super.h();
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.bZ : -1);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bZ = $$0;
      this.x(true);
   }

   protected void gr() {
      this.a(bvq.bs, bve.a(this, true, true), $$0 -> {
         if (!this.bb()) {
            this.dW().a(null, 1048, this.dw(), 0);
         }
      });
   }

   @Override
   public boolean dK() {
      return false;
   }

   @Override
   protected axe u() {
      return axf.xv;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.xG;
   }

   @Override
   protected axe o_() {
      return axf.xx;
   }

   @Override
   axe p() {
      return axf.xI;
   }

   @Override
   protected void a(ash $$0, btz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmi $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxs.vb);
      }
   }
}
