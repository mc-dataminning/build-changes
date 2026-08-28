import javax.annotation.Nullable;

public class cjt extends cjr {
   public cjt(bvi<? extends cjt> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected awu u() {
      return awv.hA;
   }

   @Override
   protected awu gP() {
      return awv.hB;
   }

   @Override
   protected awu o_() {
      return awv.hD;
   }

   @Nullable
   @Override
   protected awu gq() {
      return awv.hE;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.hF;
   }

   @Override
   public boolean a(cho $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjt) && !($$0 instanceof cju) ? false : this.gX() && ((cjs)$$0).gX();
      }
   }

   @Override
   protected void gW() {
      this.a(awv.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      bvi<? extends cjs> $$2 = $$1 instanceof cju ? bvi.aG : bvi.J;
      cjs $$3 = $$2.a($$0, bvh.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
