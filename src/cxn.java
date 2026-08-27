public class cxn extends cxm {
   public cxn(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cto $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awe.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(ctr.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cto a(cpj $$0, iz.a $$1) {
      dpk $$2 = new dpk($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return dow.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.w;
   }
}
