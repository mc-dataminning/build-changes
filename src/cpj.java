import com.google.common.annotations.VisibleForTesting;

public class cpj extends coi {
   private static final int b = 300;
   private static final akn<Boolean> c = akr.a(cpj.class, akp.k);
   public static final String a = "StrayConversionTime";
   private static final int d = -1;
   private int e;
   private int f;

   public cpj(bxe<? extends cpj> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gu() {
      return this.ar().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean x() {
      return this.gu();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bJ() && !this.gj()) {
         if (this.av) {
            if (this.gu()) {
               this.f--;
               if (this.f < 0) {
                  this.gv();
               }
            } else {
               this.e++;
               if (this.e >= 140) {
                  this.b(300);
               }
            }
         } else {
            this.e = -1;
            this.w(false);
         }
      }

      super.h();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gu() ? this.f : -1);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      int $$1 = $$0.b("StrayConversionTime", -1);
      if ($$1 != -1) {
         this.b($$1);
      } else {
         this.w(false);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.f = $$0;
      this.w(true);
   }

   protected void gv() {
      this.a(bxe.bt, bwp.a(this, true, true), $$0 -> {
         if (!this.ba()) {
            this.dV().a(null, 1048, this.dv(), 0);
         }
      });
   }

   @Override
   public boolean dJ() {
      return false;
   }

   @Override
   protected awq u() {
      return awr.xR;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.yc;
   }

   @Override
   protected awq l_() {
      return awr.xT;
   }

   @Override
   awq m() {
      return awr.ye;
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof com $$4 && $$4.x()) {
         $$4.gu();
         this.a($$0, dae.vv);
      }
   }
}
