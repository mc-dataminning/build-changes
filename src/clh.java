import javax.annotation.Nullable;

public class clh extends ckd {
   public clh(btq<? extends clh> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static boolean a(btq<clh> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      je $$5 = $$3;

      do {
         $$5 = $$5.d();
      } while ($$1.a_($$5).a(dgx.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btp.a($$2) || $$1.h($$5.e()));
   }

   @Override
   protected awc w() {
      return awd.zs;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.zu;
   }

   @Override
   protected awc n_() {
      return awd.zt;
   }

   @Override
   awc t() {
      return awd.zv;
   }

   @Override
   protected cnw a(cvl $$0, float $$1, @Nullable cvl $$2) {
      cnw $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cny) {
         ((cny)$$3).a(new bsq(bss.b, 600));
      }

      return $$3;
   }
}
