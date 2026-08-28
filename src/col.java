import com.google.common.annotations.VisibleForTesting;

public class col extends cnl {
   private static final int b = 300;
   private static final akj<Boolean> c = akn.a(col.class, akl.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bG;

   public col(bwo<? extends col> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gr() {
      return this.au().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean x() {
      return this.gr();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && !this.gg()) {
         if (this.av) {
            if (this.gr()) {
               this.bG--;
               if (this.bG < 0) {
                  this.gs();
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gr() ? this.bG : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bG = $$0;
      this.w(true);
   }

   protected void gs() {
      this.a(bwo.bs, bvz.a(this, true, true), $$0 -> {
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
   protected awm u() {
      return awn.xR;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.yc;
   }

   @Override
   protected awm l_() {
      return awn.xT;
   }

   @Override
   awm m() {
      return awn.ye;
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnp $$4 && $$4.x()) {
         $$4.gr();
         this.a($$0, czh.vv);
      }
   }
}
