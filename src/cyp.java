public class cyp extends cyo {
   public cyp(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      if (!this.a($$0.f(), $$0.g())) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cuq $$3 = $$0.a($$2);
            switch ($$2) {
               case 1:
               case 3:
               case 5:
               case 7:
                  if (!$$3.a(awy.bq)) {
                     return false;
                  }
                  break;
               case 2:
               case 4:
               case 6:
               default:
                  if (!$$3.a(cut.a)) {
                     return false;
                  }
            }
         }

         return true;
      }
   }

   public cuq a(cql $$0, jk.a $$1) {
      dqm $$2 = new dqm($$0.a(1).g(), $$0.a(3).g(), $$0.a(5).g(), $$0.a(7).g());
      return dpy.a($$2);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 == 3 && $$1 == 3;
   }

   @Override
   public cza<?> ao_() {
      return cza.w;
   }
}
