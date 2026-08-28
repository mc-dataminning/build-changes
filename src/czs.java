public class czs extends cyo {
   public czs(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      if ($$0.f() == 3 && $$0.g() == 3) {
         for (int $$2 = 0; $$2 < $$0.f(); $$2++) {
            for (int $$3 = 0; $$3 < $$0.g(); $$3++) {
               cuq $$4 = $$0.a($$2 + $$3 * $$0.f());
               if ($$4.e()) {
                  return false;
               }

               if ($$2 == 1 && $$3 == 1) {
                  if (!$$4.a(cut.vr)) {
                     return false;
                  }
               } else if (!$$4.a(cut.ov)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public cuq a(cql $$0, jk.a $$1) {
      cuq $$2 = $$0.a(1 + $$0.f());
      if (!$$2.a(cut.vr)) {
         return cuq.l;
      } else {
         cuq $$3 = new cuq(cut.vq, 8);
         $$3.b(km.G, $$2.a(km.G));
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cza<?> ao_() {
      return cza.j;
   }
}
