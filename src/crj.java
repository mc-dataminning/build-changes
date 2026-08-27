public class crj extends crc {
   public crj(crc.a $$0, blu... $$1) {
      super($$0, crd.b, $$1);
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

   public static void a(bmf $$0, cti $$1, hx $$2, int $$3) {
      if ($$0.aC()) {
         dja $$4 = cwl.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hx.a $$6 = new hx.a();

         for (hx $$7 : hx.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dja $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dja $$9 = $$1.a_($$7);
                  if ($$9 == czo.b() && $$4.a((ctl)$$1, $$7) && $$1.a($$4, $$7, elr.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cwl.kI, aui.a($$0.eg(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(crc $$0) {
      return super.a($$0) && $$0 != crg.i;
   }
}
