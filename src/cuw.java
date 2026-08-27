public class cuw extends cvb {
   public cuw(cuz $$0) {
      super($$0);
   }

   public boolean a(cnf $$0, cyx $$1) {
      int $$2 = 0;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crm.tZ)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crm.tY)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public crj a(cnf $$0, iz $$1) {
      int $$2 = 0;
      crj $$3 = crj.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crj $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(crm.tZ)) {
               if (!$$3.d()) {
                  return crj.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(crm.tY)) {
                  return crj.i;
               }

               $$2++;
            }
         }
      }

      cum $$6 = $$3.a(jp.A);
      if (!$$3.d() && $$2 >= 1 && $$6 != null) {
         cum $$7 = $$6.a();
         if ($$7 == null) {
            return crj.i;
         } else {
            crj $$8 = $$3.c($$2);
            $$8.b(jp.A, $$7);
            return $$8;
         }
      } else {
         return crj.i;
      }
   }

   public iu<crj> a(cnf $$0) {
      iu<crj> $$1 = iu.a($$0.b(), crj.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         crj $$3 = $$0.a($$2);
         if ($$3.f().w()) {
            $$1.set($$2, new crj($$3.f().v()));
         } else if ($$3.f() instanceof cte) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cvn<?> ap_() {
      return cvn.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
