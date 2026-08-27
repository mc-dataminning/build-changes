public class cxt extends cxn {
   public cxt(cxn.a $$0, bqs... $$1) {
      super($$0, avw.bb, $$1);
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

   public static void a(bre $$0, czu $$1, im $$2, int $$3) {
      if ($$0.aC()) {
         dpy $$4 = dcx.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         im.a $$6 = new im.a();

         for (im $$7 : im.c($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dl(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dpy $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dpy $$9 = $$1.a_($$7);
                  if ($$9 == dga.b() && $$4.a((czx)$$1, $$7) && $$1.a($$4, $$7, etk.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, dcx.kI, axw.a($$0.ej(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cxn $$0) {
      return super.a($$0) && $$0 != cxq.i;
   }
}
