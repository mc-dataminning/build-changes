public class cwe extends cvb {
   public cwe(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         crj $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if ($$7.a(dca.cf.p()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dca.cg.p()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(avk.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(crm.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public crj a(cnf $$0, iz $$1) {
      crj $$2 = new crj(crm.vS, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         crj $$4 = $$0.a($$3);
         if (!$$4.d()) {
            djz $$5 = djz.a($$4.f());
            if ($$5 != null) {
               $$2.b(jp.y, $$5.b());
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
   public cvn<?> ap_() {
      return cvn.n;
   }
}
