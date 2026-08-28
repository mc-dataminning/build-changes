public class del extends der {
   public del(deo $$0) {
      super($$0);
   }

   public boolean a(dep $$0, dkj $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            dak $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kl.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axv.bT)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public dak a(dep $$0, ji.a $$1) {
      int $$2 = 0;
      dak $$3 = dak.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         dak $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kl.V)) {
               if (!$$3.f()) {
                  return dak.l;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axv.bT)) {
                  return dak.l;
               }

               $$2++;
            }
         }
      }

      ddu $$6 = $$3.a(kl.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         ddu $$7 = $$6.b();
         if ($$7 == null) {
            return dak.l;
         } else {
            dak $$8 = $$3.c($$2);
            $$8.b(kl.V, $$7);
            return $$8;
         }
      } else {
         return dak.l;
      }
   }

   @Override
   public jp<dak> a(dep $$0) {
      jp<dak> $$1 = jp.a($$0.a(), dak.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         dak $$3 = $$0.a($$2);
         dak $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kl.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public dfl<del> a() {
      return dfl.d;
   }
}
