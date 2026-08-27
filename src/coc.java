public class coc extends cok {
   public coc(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      ckc $$2 = null;
      clo $$3 = null;
      clo $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         clo $$6 = $$0.a($$5);
         if (!$$6.b()) {
            clj $$7 = $$6.d();
            if (!($$7 instanceof cje)) {
               return false;
            }

            cje $$8 = (cje)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dey.c($$6);
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

   public clo a(chh $$0, it $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         clo $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dey.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return clo.b;
   }

   public ip<clo> a(chh $$0) {
      ip<clo> $$1 = ip.a($$0.b(), clo.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clo $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new clo($$3.d().s()));
            } else if ($$3.u() && dey.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cox<?> as_() {
      return cox.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
