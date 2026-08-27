public class cyr extends cxo {
   public cyr(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ctq $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dec.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dec.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awf.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(ctt.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public ctq a(cpl $$0, iz.a $$1) {
      ctq $$2 = new ctq(ctt.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         ctq $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dmc $$5 = dmc.a($$4.g());
            if ($$5 != null) {
               $$2.b(kb.G, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cya<?> ap_() {
      return cya.n;
   }
}
