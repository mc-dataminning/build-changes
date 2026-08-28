public class cyf extends cym {
   public cyf(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      cth $$2 = null;
      cuo $$3 = null;
      cuo $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cuo $$6 = $$0.a($$5);
         if (!$$6.e()) {
            cuj $$7 = $$6.g();
            if (!($$7 instanceof csj)) {
               return false;
            }

            csj $$8 = (csj)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(km.X, dox.a).b().size();
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cuo $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(km.X, dox.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cuo.l;
   }

   public jr<cuo> a(cqj $$0) {
      jr<cuo> $$1 = jr.a($$0.b(), cuo.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuo $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cuo($$3.g().u()));
            } else if (!$$3.a(km.X, dox.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
