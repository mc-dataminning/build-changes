public class col extends cok {
   public col(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            clo $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(ars.aM)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(clr.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public clo a(chh $$0, it $$1) {
      dfy.a $$2 = new dfy.a($$0.a(1).d(), $$0.a(3).d(), $$0.a(5).d(), $$0.a(7).d());
      return dfy.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cox<?> as_() {
      return cox.w;
   }
}
