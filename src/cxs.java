public class cxs extends cya {
   public cxs(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      csv $$2 = null;
      cuc $$3 = null;
      cuc $$4 = null;

      for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
         cuc $$6 = $$0.a($$5);
         if (!$$6.e()) {
            ctx $$7 = $$6.g();
            if (!($$7 instanceof cry)) {
               return false;
            }

            cry $$8 = (cry)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = $$6.a(kn.X, dpg.a).b().size();
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

   public cuc a(cxy $$0, jl.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cuc $$3 = $$0.a($$2);
         if (!$$3.e()) {
            int $$4 = $$3.a(kn.X, dpg.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cuc.l;
   }

   public js<cuc> a(cxy $$0) {
      js<cuc> $$1 = js.a($$0.a(), cuc.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuc $$3 = $$0.a($$2);
         if (!$$3.e()) {
            if ($$3.g().v()) {
               $$1.set($$2, new cuc($$3.g().u()));
            } else if (!$$3.a(kn.X, dpg.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
