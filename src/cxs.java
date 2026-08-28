public class cxs extends cxy {
   public cxs(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      int $$2 = 0;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cud.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cud.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cua a(cxw $$0, jl.a $$1) {
      int $$2 = 0;
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cud.ua)) {
               if (!$$3.e()) {
                  return cua.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cud.tZ)) {
                  return cua.l;
               }

               $$2++;
            }
         }
      }

      cxi $$6 = $$3.a(kn.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxi $$7 = $$6.b();
         if ($$7 == null) {
            return cua.l;
         } else {
            cua $$8 = $$3.c($$2);
            $$8.b(kn.J, $$7);
            return $$8;
         }
      } else {
         return cua.l;
      }
   }

   public js<cua> a(cxw $$0) {
      js<cua> $$1 = js.a($$0.a(), cua.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cua $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cua($$3.g().u()));
         } else if ($$3.g() instanceof cvy) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
