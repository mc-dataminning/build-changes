public class cqd extends cqc {
   public cqd(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cng $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(asq.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cnj.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cng a(ciz $$0, iu $$1) {
      dht.a $$2 = new dht.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dht.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cqo<?> at_() {
      return cqo.w;
   }
}
