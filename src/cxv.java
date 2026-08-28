public class cxv extends cyb {
   public cxv(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      int $$2 = 0;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cug.ua)) {
               if (!$$3.e()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cug.tZ)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.e() && $$2 > 0;
   }

   public cud a(cxz $$0, jl.a $$1) {
      int $$2 = 0;
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(cug.ua)) {
               if (!$$3.e()) {
                  return cud.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cug.tZ)) {
                  return cud.l;
               }

               $$2++;
            }
         }
      }

      cxl $$6 = $$3.a(kn.J);
      if (!$$3.e() && $$2 >= 1 && $$6 != null) {
         cxl $$7 = $$6.b();
         if ($$7 == null) {
            return cud.l;
         } else {
            cud $$8 = $$3.c($$2);
            $$8.b(kn.J, $$7);
            return $$8;
         }
      } else {
         return cud.l;
      }
   }

   public js<cud> a(cxz $$0) {
      js<cud> $$1 = js.a($$0.a(), cud.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cud $$3 = $$0.a($$2);
         if ($$3.g().v()) {
            $$1.set($$2, new cud($$3.g().u()));
         } else if ($$3.g() instanceof cwb) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
