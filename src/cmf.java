import com.google.common.annotations.VisibleForTesting;

public class cmf extends clf {
   private static final int b = 300;
   private static final ajx<Boolean> c = akb.a(cmf.class, ajz.k);
   public static final String a = "StrayConversionTime";
   private int d;
   private int bY;

   public cmf(bur<? extends cmf> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public boolean gr() {
      return this.au().a(c);
   }

   public void x(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean gq() {
      return this.gr();
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && !this.gc()) {
         if (this.av) {
            if (this.gr()) {
               this.bY--;
               if (this.bY < 0) {
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
            this.x(false);
         }
      }

      super.h();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("StrayConversionTime", this.gr() ? this.bY : -1);
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

   protected void gs() {
      this.a(bur.bs, buf.a(this, true, true), $$0 -> {
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
   protected avz u() {
      return awa.xB;
   }

   @Override
   protected avz e(bta $$0) {
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
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clj $$4 && $$4.gq()) {
         $$4.gr();
         this.a($$0, cwt.vk);
      }
   }
}
