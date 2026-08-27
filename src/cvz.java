public class cvz extends cvy {
   public cvz(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            csd $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(avw.aR)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(csg.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public csd a(cnx $$0, jj $$1) {
      doh $$2 = new doh($$0.a(1).f(), $$0.a(3).f(), $$0.a(5).f(), $$0.a(7).f());
      return dnt.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.w;
   }
}
