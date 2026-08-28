import javax.annotation.Nullable;

public class cni extends cme {
   public cni(bvq<? extends cni> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static boolean a(bvq<cni> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      jh $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dkn.rk));

      return b($$0, $$1, $$2, $$3, $$4) && (bvp.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected axe u() {
      return axf.zL;
   }

   @Override
   protected axe e(btz $$0) {
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
   protected cqd a(cxo $$0, float $$1, @Nullable cxo $$2) {
      cqd $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqf) {
         ((cqf)$$3).a(new buo(buq.b, 600));
      }

      return $$3;
   }
}
