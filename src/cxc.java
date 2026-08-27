public class cxc extends cpn {
   public static final int a = 6;
   public static final int b = 64;
   private static final ha[] c = ha.values();

   protected cxc(dca.d $$0) {
      super($$0);
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cmm $$0, gu $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cpo.aP.n(), 2);
         $$0.c(2001, $$1, cpn.i(cpo.G.n()));
      }
   }

   private boolean b(cmm $$0, gu $$1) {
      return gu.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ha $$2 : c) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dcb $$3 = $$0.a_($$2);
            dxe $$4 = $$0.b_($$2);
            if (!$$4.a(anb.a)) {
               return false;
            } else {
               if ($$3.b() instanceof cpt $$6 && !$$6.c($$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cua) {
                  $$0.a($$2, cpo.a.n(), 3);
               } else {
                  if (!$$3.a(cpo.mc) && !$$3.a(cpo.md) && !$$3.a(cpo.bw) && !$$3.a(cpo.bx)) {
                     return false;
                  }

                  czn $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, cpo.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
