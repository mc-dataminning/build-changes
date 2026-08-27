public class cwq extends cwv {
   public cwq(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      int $$2 = 0;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(ctc.ua)) {
               if (!$$3.d()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctc.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.d() && $$2 > 0;
   }

   public csz a(cou $$0, iy.a $$1) {
      int $$2 = 0;
      csz $$3 = csz.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(ctc.ua)) {
               if (!$$3.d()) {
                  return csz.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctc.tZ)) {
                  return csz.i;
               }

               $$2++;
            }
         }
      }

      cwg $$6 = $$3.a(ka.H);
      if (!$$3.d() && $$2 >= 1 && $$6 != null) {
         cwg $$7 = $$6.b();
         if ($$7 == null) {
            return csz.i;
         } else {
            csz $$8 = $$3.c($$2);
            $$8.b(ka.H, $$7);
            return $$8;
         }
      } else {
         return csz.i;
      }
   }

   public jf<csz> a(cou $$0) {
      jf<csz> $$1 = jf.a($$0.b(), csz.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         csz $$3 = $$0.a($$2);
         if ($$3.f().u()) {
            $$1.set($$2, new csz($$3.f().t()));
         } else if ($$3.f() instanceof cuv) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
