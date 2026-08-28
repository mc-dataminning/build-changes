import javax.annotation.Nullable;

public class cpw extends cos {
   public cpw(bxn<? extends cpw> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxn<cpw> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      iw $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dnq.rx));

      return b($$0, $$1, $$2, $$3, $$4) && (bxm.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awx s() {
      return awy.Aq;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.As;
   }

   @Override
   protected awx j_() {
      return awy.Ar;
   }

   @Override
   awx p() {
      return awy.At;
   }

   @Override
   protected csq a(dak $$0, float $$1, @Nullable dak $$2) {
      csq $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cst) {
         ((cst)$$3).a(new bwi(bwk.b, 600));
      }

      return $$3;
   }
}
