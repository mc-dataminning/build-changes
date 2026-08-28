import com.google.common.annotations.VisibleForTesting;

public class cna extends cma {
   private static final int b = 300;
   private static final alc<Boolean> c = alg.a(cna.class, ale.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bZ;

   public cna(bvm<? extends cna> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean go() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean gn() {
      return this.go();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.fZ()) {
         if (this.av) {
            if (this.go()) {
               this.bZ--;
               if (this.bZ < 0) {
                  this.gp();
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
      $$0.a("StrayConversionTime", this.go() ? this.bZ : -1);
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

   protected void gp() {
      this.a(bvm.bs, bva.a(this, true, true), $$0 -> {
         if (!this.bb()) {
            this.dV().a(null, 1048, this.dv(), 0);
         }
      });
   }

   @Override
   public boolean dJ() {
      return false;
   }

   @Override
   protected axe u() {
      return axf.xu;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.xF;
   }

   @Override
   protected axe o_() {
      return axf.xw;
   }

   @Override
   axe p() {
      return axf.xH;
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cme $$4 && $$4.gn()) {
         $$4.go();
         this.a($$0, cxo.vb);
      }
   }
}
