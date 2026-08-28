public class ckq extends cjm {
   public ckq(btb<? extends ckq> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public static boolean a(btb<ckq> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      iz $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dfc.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (btu.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected avz v() {
      return awa.zj;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.zl;
   }

   @Override
   protected avz o_() {
      return awa.zk;
   }

   @Override
   avz u() {
      return awa.zm;
   }

   @Override
   protected cne b(cuq $$0, float $$1) {
      cne $$2 = super.b($$0, $$1);
      if ($$2 instanceof cng) {
         ((cng)$$2).a(new bsd(bsf.b, 600));
      }

      return $$2;
   }
}
