public class cyt extends cya {
   public cyt(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      cuc $$2 = cuc.l;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cry) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuf.vs)) {
                  return false;
               }

               if (!$$2.e()) {
                  return false;
               }

               dpg $$6 = $$5.a(kn.X, dpg.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.e() && !$$3.e();
   }

   public cuc a(cxy $$0, jl.a $$1) {
      cuc $$2 = cuc.l;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.g() instanceof cry) {
               $$2 = $$5;
            } else if ($$5.a(cuf.vs)) {
               $$3 = $$5.s();
            }
         }
      }

      if ($$3.e()) {
         return $$3;
      } else {
         $$3.b(kn.X, $$2.a(kn.X));
         $$3.b(kn.Y, ((cry)$$2.g()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.l;
   }
}
