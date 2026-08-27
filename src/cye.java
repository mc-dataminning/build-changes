public class cye extends cxm {
   public cye(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      cto $$2 = cto.i;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crj) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctr.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dnx $$6 = $$5.a(kb.W, dnx.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cto a(cpj $$0, iz.a $$1) {
      cto $$2 = cto.i;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof crj) {
               $$2 = $$5;
            } else if ($$5.a(ctr.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(kb.W, $$2.a(kb.W));
         $$3.b(kb.X, ((crj)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.l;
   }
}
