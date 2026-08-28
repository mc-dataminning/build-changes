public class cze extends cym {
   public cze(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      cuo $$2 = cuo.l;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csj) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cur.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dox $$6 = $$5.a(km.X, dox.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cuo a(cqj $$0, jk.a $$1) {
      cuo $$2 = cuo.l;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csj) {
               $$2 = $$5;
            } else if ($$5.a(cur.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.X, $$2.a(km.X));
         $$3.b(km.Y, ((csj)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.l;
   }
}
