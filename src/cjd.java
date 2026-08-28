import javax.annotation.Nullable;

public class cjd extends cjb {
   public cjd(bus<? extends cjd> $$0, dgi $$1) {
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
   protected avz e(btb $$0) {
      return awa.hF;
   }

   @Override
   public boolean a(cgy $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjd) && !($$0 instanceof cje) ? false : this.hb() && ((cjc)$$0).hb();
      }
   }

   @Override
   protected void ha() {
      this.a(awa.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      bus<? extends cjc> $$2 = $$1 instanceof cje ? bus.aF : bus.I;
      cjc $$3 = $$2.a($$0, bur.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
