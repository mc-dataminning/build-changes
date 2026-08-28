public class cxu extends cya {
   public cxu(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      int $$2 = 0;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuf.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuf.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cuc a(cxy $$0, jl.a $$1) {
      int $$2 = 0;
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cuf.ua)) {
               if (!$$3.e()) {
                  return cuc.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cuf.tZ)) {
                  return cuc.l;
               }

               $$2++;
            }
         }
      }

      cxk $$6 = $$3.a(kn.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxk $$7 = $$6.b();
         if ($$7 == null) {
            return cuc.l;
         } else {
            cuc $$8 = $$3.c($$2);
            $$8.b(kn.J, $$7);
            return $$8;
         }
      } else {
         return cuc.l;
      }
   }

   public js<cuc> a(cxy $$0) {
      js<cuc> $$1 = js.a($$0.a(), cuc.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cuc $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cuc($$3.g().u()));
         } else if ($$3.g() instanceof cwa) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
