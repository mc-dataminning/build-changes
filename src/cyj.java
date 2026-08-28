public class cyj extends cyo {
   public cyj(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      int $$2 = 0;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cut.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cut.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuq a(cql $$0, jk.a $$1) {
      int $$2 = 0;
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cut.ua)) {
               if (!$$3.e()) {
                  return cuq.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cut.tZ)) {
                  return cuq.l;
               }

               $$2++;
            }
         }
      }

      cxz $$6 = $$3.a(km.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxz $$7 = $$6.b();
         if ($$7 == null) {
            return cuq.l;
         } else {
            cuq $$8 = $$3.c($$2);
            $$8.b(km.J, $$7);
            return $$8;
         }
      } else {
         return cuq.l;
      }
   }

   public jr<cuq> a(cql $$0) {
      jr<cuq> $$1 = jr.a($$0.b(), cuq.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuq $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cuq($$3.g().u()));
         } else if ($$3.g() instanceof cwo) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cza<?> ao_() {
      return cza.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
