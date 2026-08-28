public class czq extends czk {
   public czq(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      int $$2 = 0;
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvo.rV)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvo.ul)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 > 0;
   }

   public cvl a(czi $$0, jp.a $$1) {
      int $$2 = 0;
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvo.rV)) {
               if (!$$3.f()) {
                  return cvl.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvo.ul)) {
                  return cvl.k;
               }

               $$2++;
            }
         }
      }

      return !$$3.f() && $$2 >= 1 ? $$3.c($$2 + 1) : cvl.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }

   @Override
   public czy<?> as_() {
      return czy.e;
   }
}
