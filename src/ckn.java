import javax.annotation.Nullable;

public class ckn extends cjj {
   public ckn(bsw<? extends ckn> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsw<ckn> $$0, ddj $$1, btp $$2, jd $$3, ayv $$4) {
      jd $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfy.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btp.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avn v() {
      return avo.zm;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.zo;
   }

   @Override
   protected avn n_() {
      return avo.zn;
   }

   @Override
   avn t() {
      return avo.zp;
   }

   @Override
   protected cnb a(cuo $$0, float $$1, @Nullable cuo $$2) {
      cnb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cnd) {
         ((cnd)$$3).a(new bry(bsa.b, 600));
      }

      return $$3;
   }
}
