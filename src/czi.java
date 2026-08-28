public class czi extends cyb {
   public czi(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cud $$4 = $$0.a($$3, $$2);
               if ($$4.e()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cug.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cug.ow)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cud a(cxz $$0, jl.a $$1) {
      cud $$2 = $$0.a(1, 1);
      if (!$$2.a(cug.vr)) {
         return cud.l;
      } else {
         cud $$3 = new cud(cug.vq, 8);
         $$3.b(kn.G, $$2.a(kn.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.j;
   }
}
