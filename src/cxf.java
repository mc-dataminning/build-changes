public class cxf extends cxm {
   public cxf(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      csh $$2 = null;
      cto $$3 = null;
      cto $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cto $$6 = $$0.a($$5);
         if (!$$6.e()) {
            ctj $$7 = $$6.g();
            if (!($$7 instanceof crj)) {
               return false;
            }

            crj $$8 = (crj)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kb.W, dnx.a).b().size();
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

   public cto a(cpj $$0, iz.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cto $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(kb.W, dnx.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cto.i;
   }

   public jg<cto> a(cpj $$0) {
      jg<cto> $$1 = jg.a($$0.b(), cto.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cto $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().u()) {
               $$1.set($$2, new cto($$3.g().t()));
            } else if (!$$3.a(kb.W, dnx.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
