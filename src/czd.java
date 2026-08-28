public class czd extends cyl {
   public czd(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      cun $$2 = cun.l;
      cun $$3 = cun.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csi) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuq.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dow $$6 = $$5.a(km.W, dow.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cun a(cqi $$0, jk.a $$1) {
      cun $$2 = cun.l;
      cun $$3 = cun.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof csi) {
               $$2 = $$5;
            } else if ($$5.a(cuq.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(km.W, $$2.a(km.W));
         $$3.b(km.X, ((csi)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.l;
   }
}
