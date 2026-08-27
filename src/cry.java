public class cry extends crr {
   public cry(crr.a $$0, bmd... $$1) {
      super($$0, crs.b, $$1);
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

   public static void a(bmo $$0, ctx $$1, hx $$2, int $$3) {
      if ($$0.aC()) {
         djp $$4 = cxa.kI.o();
         int $$5 = Math.min(16, 2 + $$3);
         hx.a $$6 = new hx.a();

         for (hx $$7 : hx.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dj(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               djp $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  djp $$9 = $$1.a_($$7);
                  if ($$9 == dad.b() && $$4.a((cua)$$1, $$7) && $$1.a($$4, $$7, emh.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, cxa.kI, aup.a($$0.eg(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(crr $$0) {
      return super.a($$0) && $$0 != crv.i;
   }
}
