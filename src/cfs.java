public class cfs extends cep {
   public cfs(bol<? extends cfs> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static boolean a(bol<cfs> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      ib $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(czh.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bpb.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected ato y() {
      return atp.yF;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.yH;
   }

   @Override
   protected ato n_() {
      return atp.yG;
   }

   @Override
   ato w() {
      return atp.yI;
   }

   @Override
   protected cig b(cpq $$0, float $$1) {
      cig $$2 = super.b($$0, $$1);
      if ($$2 instanceof cii) {
         ((cii)$$2).a(new bns(bnu.b, 600));
      }

      return $$2;
   }
}
