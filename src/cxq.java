public class cxq extends cxy {
   public cxq(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      cst $$2 = null;
      cua $$3 = null;
      cua $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cua $$6 = $$0.a($$5);
         if (!$$6.e()) {
            ctv $$7 = $$6.g();
            if (!($$7 instanceof crv)) {
               return false;
            }

            crv $$8 = (crv)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kn.X, dpe.a).b().size();
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

   public cua a(cxw $$0, jl.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cua $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(kn.X, dpe.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cua.l;
   }

   public js<cua> a(cxw $$0) {
      js<cua> $$1 = js.a($$0.a(), cua.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cua $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cua($$3.g().u()));
            } else if (!$$3.a(kn.X, dpe.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
