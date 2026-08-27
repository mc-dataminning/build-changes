public class dab extends csm {
   public static final int a = 6;
   public static final int b = 64;
   private static final ha[] c = ha.values();

   protected dab(dez.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cpm $$0, gu $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, csn.aP.n(), 2);
         $$0.a(null, $$1, aow.xe, aox.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cpm $$0, gu $$1) {
      return gu.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ha $$2 : c) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dfa $$3 = $$0.a_($$2);
            ead $$4 = $$0.b_($$2);
            if (!$$4.a(apq.a)) {
               return false;
            } else {
               if ($$3.b() instanceof css $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cwz) {
                  $$0.a($$2, csn.a.n(), 3);
               } else {
                  if (!$$3.a(csn.mc) && !$$3.a(csn.md) && !$$3.a(csn.bw) && !$$3.a(csn.bx)) {
                     return false;
                  }

                  dcm $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, csn.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
