public class daq extends dak {
   public daq(dah $$0) {
      super($$0);
   }

   public boolean a(dai $$0, dff $$1) {
      int $$2 = 0;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwj.uB)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cwf a(dai $$0, js.a $$1) {
      int $$2 = 0;
      cwf $$3 = cwf.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwf $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.b(ku.L)) {
               if (!$$3.f()) {
                  return cwf.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cwj.uB)) {
                  return cwf.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cwf.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public day<?> aq_() {
      return day.e;
   }
}
