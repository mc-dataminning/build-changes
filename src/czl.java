public class czl extends czk {
   public czl(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cvl $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(axb.bu)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cvo.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cvl a(czi $$0, jp.a $$1) {
      dsk $$2 = new dsk($$0.a(1).h(), $$0.a(3).h(), $$0.a(5).h(), $$0.a(7).h());
      return dru.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public czy<?> as_() {
      return czy.v;
   }
}
