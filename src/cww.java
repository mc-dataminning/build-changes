public class cww extends cwv {
   public cww(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            csz $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(avz.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(ctc.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public csz a(cou $$0, iy.a $$1) {
      doq $$2 = new doq($$0.a(1).f(), $$0.a(3).f(), $$0.a(5).f(), $$0.a(7).f());
      return doc.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.w;
   }
}
