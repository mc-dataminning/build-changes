public class dae extends czk {
   public dae(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      cvl $$2 = cvl.k;
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cti) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvo.vu)) {
                  return false;
               }

               if (!$$2.f()) {
                  return false;
               }

               dqv $$6 = $$5.a(kr.aa, dqv.a);
               if (!$$6.b().isEmpty()) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.f() && !$$3.f();
   }

   public cvl a(czi $$0, jp.a $$1) {
      cvl $$2 = cvl.k;
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cti) {
               $$2 = $$5;
            } else if ($$5.a(cvo.vu)) {
               $$3 = $$5.u();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kr.aa, $$2.a(kr.aa));
         $$3.b(kr.ab, ((cti)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public czy<?> as_() {
      return czy.l;
   }
}
