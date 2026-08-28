import com.google.common.annotations.VisibleForTesting;

public class cob extends cnb {
   private static final int b = 300;
   private static final akh<Boolean> c = akl.a(cob.class, akj.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bF;

   public cob(bwj<? extends cob> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
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
               this.bF--;
               if (this.bF < 0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gq() ? this.bF : -1);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bF = $$0;
      this.w(true);
   }

   protected void gr() {
      this.a(bwj.bs, bvu.a(this, true, true), $$0 -> {
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
   protected awk u() {
      return awl.xL;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.xW;
   }

   @Override
   protected awk l_() {
      return awl.xN;
   }

   @Override
   awk m() {
      return awl.xY;
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnf $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyw.vo);
      }
   }
}
