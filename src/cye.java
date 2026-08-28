public class cye extends cyl {
   public cye(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      ctg $$2 = null;
      cun $$3 = null;
      cun $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cun $$6 = $$0.a($$5);
         if (!$$6.e()) {
            cui $$7 = $$6.g();
            if (!($$7 instanceof csi)) {
               return false;
            }

            csi $$8 = (csi)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(km.W, dow.a).b().size();
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

   public cun a(cqi $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cun $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(km.W, dow.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cun.l;
   }

   public jr<cun> a(cqi $$0) {
      jr<cun> $$1 = jr.a($$0.b(), cun.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cun $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cun($$3.g().u()));
            } else if (!$$3.a(km.W, dow.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
