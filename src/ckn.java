public class ckn extends ckg {
   public ckn(ckg.a $$0, bfo... $$1) {
      super($$0, ckh.b, $$1);
   }

   @Override
   public int a(int $$0) {
      return $$0 * 10;
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + 15;
   }

   @Override
   public boolean b() {
      return true;
   }

   @Override
   public int a() {
      return 2;
   }

   public static void a(bfz $$0, cmm $$1, gu $$2, int $$3) {
      if ($$0.ay()) {
         dcb $$4 = cpo.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         gu.a $$6 = new gu.a();

         for (gu $$7 : gu.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dg(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dcb $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dcb $$9 = $$1.a_($$7);
                  if ($$9 == cso.a() && $$4.a((cmp)$$1, $$7) && $$1.a($$4, $$7, een.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cpo.kI, apa.a($$0.ec(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(ckg $$0) {
      return super.a($$0) && $$0 != ckk.i;
   }
}
