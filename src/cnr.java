import com.google.common.annotations.VisibleForTesting;

public class cnr extends cmr {
   private static final int b = 300;
   private static final akg<Boolean> c = akk.a(cnr.class, aki.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bE;

   public cnr(bwb<? extends cnr> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gq() {
      return this.au().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean x() {
      return this.gq();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && !this.gf()) {
         if (this.av) {
            if (this.gq()) {
               this.bE--;
               if (this.bE < 0) {
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
            this.w(false);
         }
      }

      super.h();
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.bE : -1);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bE = $$0;
      this.w(true);
   }

   protected void gr() {
      this.a(bwb.br, bvm.a(this, true, true), $$0 -> {
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
   protected awj u() {
      return awk.xL;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.xW;
   }

   @Override
   protected awj l_() {
      return awk.xN;
   }

   @Override
   awj m() {
      return awk.xY;
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmv $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyc.vo);
      }
   }
}
