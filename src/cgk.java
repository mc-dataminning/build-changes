public class cgk extends cfh {
   public cgk(bpc<? extends cgk> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public static boolean a(bpc<cgk> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      ib $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(dac.qP));

      return b($$0, $$1, $$2, $$3, $$4) && (bps.a($$2) || $$1.h($$5.d()));
   }

   @Override
   protected atx v() {
      return aty.yI;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.yK;
   }

   @Override
   protected atx n_() {
      return aty.yJ;
   }

   @Override
   atx s() {
      return aty.yL;
   }

   @Override
   protected ciy b(cqk $$0, float $$1) {
      ciy $$2 = super.b($$0, $$1);
      if ($$2 instanceof cja) {
         ((cja)$$2).a(new boj(bol.b, 600));
      }

      return $$2;
   }
}
