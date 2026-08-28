public class czi extends cyp {
   public czi(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dfb.a($$5.g()) instanceof dma) {
               $$2++;
            } else {
               if (!($$5.g() instanceof ctl)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cur a(cqm $$0, jk.a $$1) {
      cur $$2 = cur.l;
      ctl $$3 = (ctl)cuu.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cum $$6 = $$5.g();
            if (dfb.a($$6) instanceof dma) {
               $$2 = $$5;
            } else if ($$6 instanceof ctl) {
               $$3 = (ctl)$$6;
            }
         }
      }

      dfb $$7 = dma.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czb<?> ao_() {
      return czb.m;
   }
}
