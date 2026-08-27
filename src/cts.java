public class cts extends ctm {
   public cts(ctm.a $$0, bnx... $$1) {
      super($$0, aui.ba, $$1);
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

   public static void a(boi $$0, cvr $$1, hz $$2, int $$3) {
      if ($$0.aC()) {
         dlj $$4 = cyu.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hz.a $$6 = new hz.a();

         for (hz $$7 : hz.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dk(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dlj $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dlj $$9 = $$1.a_($$7);
                  if ($$9 == dbx.b() && $$4.a((cvu)$$1, $$7) && $$1.a($$4, $$7, eoe.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cyu.kI, awi.a($$0.eh(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(ctm $$0) {
      return super.a($$0) && $$0 != ctp.i;
   }
}
