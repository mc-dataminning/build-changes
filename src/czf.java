public class czf extends cxy {
   public czf(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cua $$4 = $$0.a($$3, $$2);
               if ($$4.e()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cud.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cud.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cua a(cxw $$0, jl.a $$1) {
      cua $$2 = $$0.a(1, 1);
      if (!$$2.a(cud.vr)) {
         return cua.l;
      } else {
         cua $$3 = new cua(cud.vq, 8);
         $$3.b(kn.G, $$2.a(kn.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.j;
   }
}
