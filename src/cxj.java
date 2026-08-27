public class cxj extends cxo {
   public cxj(cxm $$0) {
      super($$0);
   }

   public boolean a(cpl $$0, daz $$1) {
      int $$2 = 0;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctt.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctt.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public ctq a(cpl $$0, iz.a $$1) {
      int $$2 = 0;
      ctq $$3 = ctq.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ctq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(ctt.ua)) {
               if (!$$3.e()) {
                  return ctq.i;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(ctt.tZ)) {
                  return ctq.i;
               }

               $$2++;
            }
         }
      }

      cwz $$6 = $$3.a(kb.I);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cwz $$7 = $$6.b();
         if ($$7 == null) {
            return ctq.i;
         } else {
            ctq $$8 = $$3.c($$2);
            $$8.b(kb.I, $$7);
            return $$8;
         }
      } else {
         return ctq.i;
      }
   }

   public jg<ctq> a(cpl $$0) {
      jg<ctq> $$1 = jg.a($$0.b(), ctq.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ctq $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new ctq($$3.g().u()));
         } else if ($$3.g() instanceof cvo) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cya<?> ap_() {
      return cya.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
