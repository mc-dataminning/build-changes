import javax.annotation.Nullable;

public class cje extends cjc {
   public cje(but<? extends cje> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected avz u() {
      return awa.hA;
   }

   @Override
   protected avz gT() {
      return awa.hB;
   }

   @Override
   protected avz o_() {
      return awa.hD;
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.hE;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.hF;
   }

   @Override
   public boolean a(cgz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cje) && !($$0 instanceof cjf) ? false : this.hb() && ((cjd)$$0).hb();
      }
   }

   @Override
   protected void ha() {
      this.a(awa.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      but<? extends cjd> $$2 = $$1 instanceof cjf ? but.aF : but.I;
      cjd $$3 = $$2.a($$0, bus.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
