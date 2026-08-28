import com.google.common.annotations.VisibleForTesting;

public class cot extends cns {
   private static final int b = 300;
   private static final akj<Boolean> c = akn.a(cot.class, akl.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bG;

   public cot(bwr<? extends cot> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gt() {
      return this.ar().a(c);
   }

   public void w(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean x() {
      return this.gt();
   }

   @Override
   public void h() {
      if (!this.dU().C && this.bI() && !this.gi()) {
         if (this.av) {
            if (this.gt()) {
               this.bG--;
               if (this.bG < 0) {
                  this.gu();
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
      $$0.a("StrayConversionTime", this.gt() ? this.bG : -1);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.f("StrayConversionTime") > -1) {
         this.b($$0.f("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bG = $$0;
      this.w(true);
   }

   protected void gu() {
      this.a(bwr.bs, bwc.a(this, true, true), $$0 -> {
         if (!this.aZ()) {
            this.dU().a(null, 1048, this.du(), 0);
         }
      });
   }

   @Override
   public boolean dI() {
      return false;
   }

   @Override
   protected awm u() {
      return awn.xR;
   }

   @Override
   protected awm e(bux $$0) {
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
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnw $$4 && $$4.x()) {
         $$4.gt();
         this.a($$0, czo.vv);
      }
   }
}
