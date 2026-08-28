import com.google.common.annotations.VisibleForTesting;

public class cmh extends clh {
   private static final int b = 300;
   private static final ajy<Boolean> c = akc.a(cmh.class, aka.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bY;

   public cmh(but<? extends cmh> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gu() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean gt() {
      return this.gu();
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bL() && !this.gf()) {
         if (this.av) {
            if (this.gu()) {
               this.bY--;
               if (this.bY < 0) {
                  this.gv();
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
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gu() ? this.bY : -1);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("StrayConversionTime", 99) && $$0.h("StrayConversionTime") > -1) {
         this.b($$0.h("StrayConversionTime"));
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.bY = $$0;
      this.x(true);
   }

   protected void gv() {
      this.a(but.br, buh.a(this, true, true), $$0 -> {
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
   protected avz u() {
      return awa.xB;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.xM;
   }

   @Override
   protected avz o_() {
      return awa.xD;
   }

   @Override
   avz p() {
      return awa.xO;
   }

   @Override
   protected void a(ard $$0, btc $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cll $$4 && $$4.gt()) {
         $$4.gu();
         this.a($$0, cwu.vk);
      }
   }
}
