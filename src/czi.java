public class czi extends cyp {
   public czi(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      cuo $$2 = cuo.l;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
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

               dpw $$6 = $$5.a(kq.Y, dpw.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cuo a(cyn $$0, jo.a $$1) {
      cuo $$2 = cuo.l;
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
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
         $$3.b(kq.Y, $$2.a(kq.Y));
         $$3.b(kq.Z, ((csj)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czc<?> ap_() {
      return czc.l;
   }
}
