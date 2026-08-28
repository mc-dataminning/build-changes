import javax.annotation.Nullable;

public class ckd extends ciz {
   public ckd(bsn<? extends ckd> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsn<ckd> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      ja $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfk.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btg.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avg v() {
      return avh.zm;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.zo;
   }

   @Override
   protected avg n_() {
      return avh.zn;
   }

   @Override
   avg t() {
      return avh.zp;
   }

   @Override
   protected cmr a(cud $$0, float $$1, @Nullable cud $$2) {
      cmr $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cmt) {
         ((cmt)$$3).a(new brp(brr.b, 600));
      }

      return $$3;
   }
}
