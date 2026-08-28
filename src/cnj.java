import javax.annotation.Nullable;

public class cnj extends cmf {
   public cnj(bvr<? extends cnj> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvr<cnj> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dko.rk));

      return b($$0, $$1, $$2, $$3, $$4) && (bvq.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected axe u() {
      return axf.zL;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.zN;
   }

   @Override
   protected axe o_() {
      return axf.zM;
   }

   @Override
   axe p() {
      return axf.zO;
   }

   @Override
   protected cqe a(cxp $$0, float $$1, @Nullable cxp $$2) {
      cqe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqg) {
         ((cqg)$$3).a(new bup(bur.b, 600));
      }

      return $$3;
   }
}
