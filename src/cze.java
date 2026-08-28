public class cze extends czk {
   public cze(czh $$0) {
      super($$0);
   }

   public boolean a(czi $$0, dds $$1) {
      int $$2 = 0;
      cvl $$3 = cvl.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvl $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.a(cvo.ub)) {
               if (!$$3.f()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvo.ua)) {
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
            if ($$5.a(cvo.ub)) {
               if (!$$3.f()) {
                  return cvl.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cvo.ua)) {
                  return cvl.k;
               }

               $$2++;
            }
         }
      }

      cyu $$6 = $$3.a(kr.L);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         cyu $$7 = $$6.b();
         if ($$7 == null) {
            return cvl.k;
         } else {
            cvl $$8 = $$3.c($$2);
            $$8.b(kr.L, $$7);
            return $$8;
         }
      } else {
         return cvl.k;
      }
   }

   public jw<cvl> a(czi $$0) {
      jw<cvl> $$1 = jw.a($$0.a(), cvl.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvl $$3 = $$0.a($$2);
         if ($$3.h().v()) {
            $$1.set($$2, new cvl($$3.h().u()));
         } else if ($$3.h() instanceof cxk) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public czy<?> as_() {
      return czy.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
