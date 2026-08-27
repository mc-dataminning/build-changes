public class cxf extends cwz {
   public cxf(cwz.a $$0, bqh... $$1) {
      super($$0, avm.bb, $$1);
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

   public static void a(bqt $$0, czg $$1, id $$2, int $$3) {
      if ($$0.aC()) {
         dpi $$4 = dcj.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         id.a $$6 = new id.a();

         for (id $$7 : id.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dpi $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dpi $$9 = $$1.a_($$7);
                  if ($$9 == dfm.b() && $$4.a((czj)$$1, $$7) && $$1.a($$4, $$7, eso.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dcj.kI, axm.a($$0.ei(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cwz $$0) {
      return super.a($$0) && $$0 != cxc.i;
   }
}
