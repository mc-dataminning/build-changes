public class czz extends csk {
   public static final int a = 6;
   public static final int b = 64;
   private static final hb[] c = hb.values();

   protected czz(dex.d $$0) {
      super($$0);
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cpk $$0, gv $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, csl.aP.n(), 2);
         $$0.a(null, $$1, aou.xe, aov.e, 1.0F, 1.0F);
      }
   }

   private boolean b(cpk $$0, gv $$1) {
      return gv.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (hb $$2 : c) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dey $$3 = $$0.a_($$2);
            eab $$4 = $$0.b_($$2);
            if (!$$4.a(apo.a)) {
               return false;
            } else {
               if ($$3.b() instanceof csq $$6 && !$$6.a(null, $$0, $$2, $$3).b()) {
                  return true;
               }

               if ($$3.b() instanceof cwx) {
                  $$0.a($$2, csl.a.n(), 3);
               } else {
                  if (!$$3.a(csl.mc) && !$$3.a(csl.md) && !$$3.a(csl.bw) && !$$3.a(csl.bx)) {
                     return false;
                  }

                  dck $$7 = $$3.t() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, csl.a.n(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
