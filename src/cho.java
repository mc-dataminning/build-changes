import javax.annotation.Nullable;

public class cho extends chi {
   public cho(bta<? extends cho> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected avz v() {
      return awa.px;
   }

   @Override
   protected avz gO() {
      return awa.py;
   }

   @Override
   protected avz o_() {
      return awa.pA;
   }

   @Nullable
   @Override
   protected avz gx() {
      return awa.pB;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.pC;
   }

   @Override
   protected void gW() {
      this.a(awa.pD, 0.4F, 1.0F);
   }

   @Override
   protected void gq() {
      this.a(awa.pz, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      return bta.at.a((dby)$$0);
   }
}
