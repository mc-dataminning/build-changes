public class dak extends csv {
   public static final int a = 6;
   public static final int b = 64;
   private static final hc[] c = hc.values();

   protected dak(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cpv $$0, gw $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, csw.aP.n(), 2);
         $$0.a(null, $$1, ape.xj, apf.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cpv $$0, gw $$1) {
      return gw.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hc $$2 : c) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dfj $$3 = $$0.a_($$2);
            eam $$4 = $$0.b_($$2);
            if (!$$4.a(apy.a)) {
               return false;
            } else {
               if ($$3.b() instanceof ctb $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cxi) {
                  $$0.a($$2, csw.a.n(), 3);
               } else {
                  if (!$$3.a(csw.mc) && !$$3.a(csw.md) && !$$3.a(csw.bw) && !$$3.a(csw.bx)) {
                     return false;
                  }

                  dcv $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, csw.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
