import javax.annotation.Nullable;

public class cnv extends cmr {
   public cnv(bwb<? extends cnv> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static boolean a(bwb<cnv> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      jj $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dkw.rt));

      return b($$0, $$1, $$2, $$3, $$4) && (bwa.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awj u() {
      return awk.Ak;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Am;
   }

   @Override
   protected awj l_() {
      return awk.Al;
   }

   @Override
   awj m() {
      return awk.An;
   }

   @Override
   protected cqp a(cxy $$0, float $$1, @Nullable cxy $$2) {
      cqp $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cqr) {
         ((cqr)$$3).a(new buw(buy.b, 600));
      }

      return $$3;
   }
}
