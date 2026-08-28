public class czf extends cym {
   public czf(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (dey.a($$5.g()) instanceof dlx) {
               $$2++;
            } else {
               if (!($$5.g() instanceof cti)) {
                  return false;
               }

               $$3++;
            }

            if ($$3 > 1 || $$2 > 1) {
               return false;
            }
         }
      }

      return $$2 == 1 && $$3 == 1;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      cuo $$2 = cuo.l;
      cti $$3 = (cti)cur.ri;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            cuj $$6 = $$5.g();
            if (dey.a($$6) instanceof dlx) {
               $$2 = $$5;
            } else if ($$6 instanceof cti) {
               $$3 = (cti)$$6;
            }
         }
      }

      dey $$7 = dlx.a($$3.c());
      return $$2.a($$7, 1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.m;
   }
}
