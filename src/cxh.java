public class cxh extends cxm {
   public cxh(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      int $$2 = 0;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctr.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctr.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cto a(cpj $$0, iz.a $$1) {
      int $$2 = 0;
      cto $$3 = cto.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctr.ua)) {
               if (!$$3.e()) {
                  return cto.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctr.tZ)) {
                  return cto.i;
               }

               $$2++;
            }
         }
      }

      cwx $$6 = $$3.a(kb.I);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cwx $$7 = $$6.b();
         if ($$7 == null) {
            return cto.i;
         } else {
            cto $$8 = $$3.c($$2);
            $$8.b(kb.I, $$7);
            return $$8;
         }
      } else {
         return cto.i;
      }
   }

   public jg<cto> a(cpj $$0) {
      jg<cto> $$1 = jg.a($$0.b(), cto.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cto $$3 = $$0.a($$2);
         if ($$3.g().u()) {
            $$1.set($$2, new cto($$3.g().t()));
         } else if ($$3.g() instanceof cvm) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cxy<?> ao_() {
      return cxy.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
