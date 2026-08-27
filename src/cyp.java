public class cyp extends cxm {
   public cyp(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cto $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dea.cf.q()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dea.cg.q()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awe.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(ctr.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cto a(cpj $$0, iz.a $$1) {
      cto $$2 = new cto(ctr.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cto $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dma $$5 = dma.a($$4.g());
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
   public cxy<?> ao_() {
      return cxy.n;
   }
}
