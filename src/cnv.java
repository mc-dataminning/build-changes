public class cnv extends cno {
   public cnv(cno.a $$0, biv... $$1) {
      super($$0, cnp.b, $$1);
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

   public static void a(bjg $$0, cpv $$1, gw $$2, int $$3) {
      if ($$0.aA()) {
         dfj $$4 = csw.kI.n();
         int $$5 = Math.min(16, 2 + $$3);
         gw.a $$6 = new gw.a();

         for (gw $$7 : gw.a($$2.b(-$$5, -1, -$$5), $$2.b($$5, -1, $$5))) {
            if ($$7.a($$0.dj(), (double)$$5)) {
               $$6.d($$7.u(), $$7.v() + 1, $$7.w());
               dfj $$8 = $$1.a_($$6);
               if ($$8.i()) {
                  dfj $$9 = $$1.a_($$7);
                  if ($$9 == cvw.a() && $$4.a((cpy)$$1, $$7) && $$1.a($$4, $$7, ehs.a())) {
                     $$1.b($$7, $$4);
                     $$1.a($$7, csw.kI, arw.a($$0.ef(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean a(cno $$0) {
      return super.a($$0) && $$0 != cns.i;
   }
}
