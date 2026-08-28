import javax.annotation.Nullable;

public class cpa extends cnv {
   public cpa(bwr<? extends cpa> $$0, djm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwr<cpa> $$0, dkd $$1, bwq $$2, iv $$3, azv $$4) {
      iv $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dmt.rx));

      return b($$0, $$1, $$2, $$3, $$4) && (bwq.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awm u() {
      return awn.Aq;
   }

   @Override
   protected awm e(bux $$0) {
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
   protected cru a(czn $$0, float $$1, @Nullable czn $$2) {
      cru $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof crx) {
         ((crx)$$3).a(new bvm(bvo.b, 600));
      }

      return $$3;
   }
}
