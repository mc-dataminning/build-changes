public class daf extends csq {
   public static final int a = 6;
   public static final int b = 64;
   private static final hc[] c = hc.values();

   protected daf(dfd.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cpq $$0, gw $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, csr.aP.n(), 2);
         $$0.a(null, $$1, aoz.xj, apa.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cpq $$0, gw $$1) {
      return gw.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hc $$2 : c) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dfe $$3 = $$0.a_($$2);
            eah $$4 = $$0.b_($$2);
            if (!$$4.a(apt.a)) {
               return false;
            } else {
               if ($$3.b() instanceof csw $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cxd) {
                  $$0.a($$2, csr.a.n(), 3);
               } else {
                  if (!$$3.a(csr.mc) && !$$3.a(csr.md) && !$$3.a(csr.bw) && !$$3.a(csr.bx)) {
                     return false;
                  }

                  dcq $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, csr.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
