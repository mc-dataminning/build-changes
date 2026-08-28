import javax.annotation.Nullable;

public class cia extends chy {
   public cia(btq<? extends cia> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected awc w() {
      return awd.hg;
   }

   @Override
   protected awc gP() {
      return awd.hh;
   }

   @Override
   protected awc n_() {
      return awd.hj;
   }

   @Nullable
   @Override
   protected awc gq() {
      return awd.hk;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.hl;
   }

   @Override
   public boolean a(cfv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cia) && !($$0 instanceof cib) ? false : this.gY() && ((chz)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awd.hm, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      btq<? extends chz> $$2 = $$1 instanceof cib ? btq.at : btq.z;
      chz $$3 = $$2.a($$0, btp.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
