public class cxb extends cvy {
   public cxb(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         csd $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if ($$7.a(dcx.cf.p()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dcx.cg.p()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(avw.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(csg.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public csd a(cnx $$0, jj $$1) {
      csd $$2 = new csd(csg.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         csd $$4 = $$0.a($$3);
         if (!$$4.d()) {
            dkx $$5 = dkx.a($$4.f());
            if ($$5 != null) {
               $$2.b(jz.y, $$5.b());
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
   public cwk<?> ao_() {
      return cwk.n;
   }
}
