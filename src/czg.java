public class czg extends cya {
   public czg(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuc $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfj.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfj.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awf.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cuf.ot) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuc a(cxy $$0, jl.a $$1) {
      cuc $$2 = new cuc(cuf.vX, 1);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cuc $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnj $$5 = dnj.a($$4.g());
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
   public cyn<?> ap_() {
      return cyn.n;
   }
}
