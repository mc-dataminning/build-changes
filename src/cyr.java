public class cyr extends cyq {
   public cyr(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cuh $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awm.br)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cuk.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cuh a(cpw $$0, jc.a $$1) {
      drj $$2 = new drj($$0.a(1).f(), $$0.a(3).f(), $$0.a(5).f(), $$0.a(7).f());
      return dqs.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cze<?> ao_() {
      return cze.y;
   }
}
