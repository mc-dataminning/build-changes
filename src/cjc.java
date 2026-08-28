import javax.annotation.Nullable;

public class cjc extends cja {
   public cjc(bur<? extends cjc> $$0, dgh $$1) {
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
   protected avz e(bta $$0) {
      return awa.hF;
   }

   @Override
   public boolean a(cgx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjc) && !($$0 instanceof cjd) ? false : this.hb() && ((cjb)$$0).hb();
      }
   }

   @Override
   protected void ha() {
      this.a(awa.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bub a(ard $$0, bub $$1) {
      bur<? extends cjb> $$2 = $$1 instanceof cjd ? bur.aF : bur.I;
      cjb $$3 = $$2.a($$0, buq.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
