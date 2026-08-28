public class cko extends cjk {
   public cko(bsz<? extends cko> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsz<cko> $$0, dcm $$1, bts $$2, iz $$3, azg $$4) {
      iz $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfa.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bts.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avy v() {
      return avz.zj;
   }

   @Override
   protected avy d(brm $$0) {
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
   protected cnc b(cuo $$0, float $$1) {
      cnc $$2 = super.b($$0, $$1);
      if ($$2 instanceof cne) {
         ((cne)$$2).a(new bsb(bsd.b, 600));
      }

      return $$2;
   }
}
