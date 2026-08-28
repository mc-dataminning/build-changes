import javax.annotation.Nullable;

public class clm extends clk {
   public clm(bwr<? extends clm> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected awm u() {
      return awn.hD;
   }

   @Override
   protected awm gT() {
      return awn.hE;
   }

   @Override
   protected awm l_() {
      return awn.hG;
   }

   @Nullable
   @Override
   protected awm gv() {
      return awn.hH;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.hI;
   }

   @Override
   public boolean a(ciz $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clm) && !($$0 instanceof cln) ? false : this.hb() && ((cll)$$0).hb();
      }
   }

   @Override
   protected void ha() {
      this.a(awn.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      bwr<? extends cll> $$2 = $$1 instanceof cln ? bwr.aF : bwr.I;
      cll $$3 = $$2.a($$0, bwq.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
