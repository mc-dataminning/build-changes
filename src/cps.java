import com.google.common.annotations.VisibleForTesting;

public class cps extends cos {
   private static final int b = 300;
   private static final aku<Boolean> c = aky.a(cps.class, akw.k);
   public static final String a = "StrayConversionTime";
   private static final int d = -1;
   private int e;
   private int f;

   public cps(bxn<? extends cps> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gx() {
      return this.ar().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean gw() {
      return this.gx();
   }

   @Override
   public void g() {
      if (!this.dV().C && this.bJ() && !this.gj()) {
         if (this.av) {
            if (this.gx()) {
               this.f--;
               if (this.f < 0) {
                  this.gy();
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

      super.g();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gx() ? this.f : -1);
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

   protected void gy() {
      this.a(bxn.bt, bwy.a(this, true, true), $$0 -> {
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
   protected awx s() {
      return awy.xR;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.yc;
   }

   @Override
   protected awx j_() {
      return awy.xT;
   }

   @Override
   awx p() {
      return awy.ye;
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cow $$4 && $$4.gw()) {
         $$4.gx();
         this.a($$0, dao.vv);
      }
   }
}
