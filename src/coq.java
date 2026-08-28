import javax.annotation.Nullable;

public class coq extends cnl {
   public coq(bwo<? extends coq> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwo<coq> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      iu $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dmh.rx));

      return b($$0, $$1, $$2, $$3, $$4) && (bwn.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awm u() {
      return awn.Aq;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.As;
   }

   @Override
   protected awm l_() {
      return awn.Ar;
   }

   @Override
   awm m() {
      return awn.At;
   }

   @Override
   protected crk a(czd $$0, float $$1, @Nullable czd $$2) {
      crk $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof crn) {
         ((crn)$$3).a(new bvj(bvl.b, 600));
      }

      return $$3;
   }
}
