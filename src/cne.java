import javax.annotation.Nullable;

public class cne extends cma {
   public cne(bvm<? extends cne> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvm<cne> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dkg.rk));

      return b($$0, $$1, $$2, $$3, $$4) && (bvl.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected axe u() {
      return axf.zK;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.zM;
   }

   @Override
   protected axe o_() {
      return axf.zL;
   }

   @Override
   axe p() {
      return axf.zN;
   }

   @Override
   protected cpz a(cxk $$0, float $$1, @Nullable cxk $$2) {
      cpz $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqb) {
         ((cqb)$$3).a(new buk(bum.b, 600));
      }

      return $$3;
   }
}
