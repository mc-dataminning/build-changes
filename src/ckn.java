public class ckn extends cjj {
   public ckn(bsy<? extends ckn> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsy<ckn> $$0, dcl $$1, btr $$2, iz $$3, azf $$4) {
      iz $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dez.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btr.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avy v() {
      return avz.zj;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.zl;
   }

   @Override
   protected avy o_() {
      return avz.zk;
   }

   @Override
   avy u() {
      return avz.zm;
   }

   @Override
   protected cnb b(cun $$0, float $$1) {
      cnb $$2 = super.b($$0, $$1);
      if ($$2 instanceof cnd) {
         ((cnd)$$2).a(new bsa(bsc.b, 600));
      }

      return $$2;
   }
}
