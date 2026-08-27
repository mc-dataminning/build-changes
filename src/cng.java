public class cng extends cnf {
   public cng(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            ckj $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(ara.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(ckm.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public ckj a(cgd $$0, ip $$1) {
      dem.a $$2 = new dem.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dem.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cnq<?> aq_() {
      return cnq.w;
   }
}
