public class cxz extends cxy {
   public cxz(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
            cua $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awd.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cud.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cua a(cxw $$0, jl.a $$1) {
      dqr $$2 = new dqr($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return dqd.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.w;
   }
}
