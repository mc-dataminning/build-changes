public class cls extends clr {
   public cls(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            ciw $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(apr.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(ciz.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public ciw a(ceq $$0, ht $$1) {
      dcz.a $$2 = new dcz.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dcz.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.w;
   }
}
