import javax.annotation.Nullable;

public class cna extends clw {
   public cna(bvi<? extends cna> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvi<cna> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dkf.rr));

      return b($$0, $$1, $$2, $$3, $$4) && (bvh.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awu u() {
      return awv.Ab;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.Ad;
   }

   @Override
   protected awu o_() {
      return awv.Ac;
   }

   @Override
   awu p() {
      return awv.Ae;
   }

   @Override
   protected cpv a(cxg $$0, float $$1, @Nullable cxg $$2) {
      cpv $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpx) {
         ((cpx)$$3).a(new bug(bui.b, 600));
      }

      return $$3;
   }
}
