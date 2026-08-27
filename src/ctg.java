public class ctg extends ctf {
   public ctg(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cqk $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(auv.aR)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cqn.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cqk a(cme $$0, iz $$1) {
      dkw.a $$2 = new dkw.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dkw.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public ctr<?> ar_() {
      return ctr.w;
   }
}
