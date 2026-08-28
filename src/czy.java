public class czy extends cyr {
   public czy(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.g(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.f(); $$3++) {
               cuq $$4 = $$0.a($$3, $$2);
               if ($$4.e()) {
                  return false;
               }

               if ($$3 == 1 && $$2 == 1) {
                  if (!$$4.a(cut.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cut.ow)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuq a(cyp $$0, jo.a $$1) {
      cuq $$2 = $$0.a(1, 1);
      if (!$$2.a(cut.vr)) {
         return cuq.l;
      } else {
         cuq $$3 = new cuq(cut.vq, 8);
         $$3.b(kq.G, $$2.a(kq.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public cze<?> at_() {
      return cze.j;
   }
}
