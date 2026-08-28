public class czh extends cya {
   public czh(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cuc $$4 = $$0.a($$3, $$2);
               if ($$4.e()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cuf.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cuf.ow)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuc a(cxy $$0, jl.a $$1) {
      cuc $$2 = $$0.a(1, 1);
      if (!$$2.a(cuf.vr)) {
         return cuc.l;
      } else {
         cuc $$3 = new cuc(cuf.vq, 8);
         $$3.b(kn.G, $$2.a(kn.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.j;
   }
}
