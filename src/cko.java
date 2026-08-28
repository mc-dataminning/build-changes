import javax.annotation.Nullable;

public class cko extends ckm {
   public cko(bwb<? extends cko> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected awj u() {
      return awk.hA;
   }

   @Override
   protected awj gQ() {
      return awk.hB;
   }

   @Override
   protected awj l_() {
      return awk.hD;
   }

   @Nullable
   @Override
   protected awj gs() {
      return awk.hE;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.hF;
   }

   @Override
   public boolean a(cig $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cko) && !($$0 instanceof ckp) ? false : this.gY() && ((ckn)$$0).gY();
      }
   }

   @Override
   protected void gX() {
      this.a(awk.hG, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      bwb<? extends ckn> $$2 = $$1 instanceof ckp ? bwb.aF : bwb.I;
      ckn $$3 = $$2.a($$0, bwa.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
