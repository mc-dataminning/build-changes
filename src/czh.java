public class czh extends cyb {
   public czh(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cud $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfk.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfk.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awf.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cug.ot) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cud a(cxz $$0, jl.a $$1) {
      cud $$2 = new cud(cug.vX, 1);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cud $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnk $$5 = dnk.a($$4.g());
            if ($$5 != null) {
               $$2.b(kn.H, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.n;
   }
}
