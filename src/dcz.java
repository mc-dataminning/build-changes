public class dcz extends ddf {
   public dcz(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.c(kj.V)) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(axk.bR)) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$3 && $$2;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      int $$2 = 0;
      cyy $$3 = cyy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.c(kj.V)) {
               if (!$$3.f()) {
                  return cyy.k;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(axk.bR)) {
                  return cyy.k;
               }

               $$2++;
            }
         }
      }

      dci $$6 = $$3.a(kj.V);
      if (!$$3.f() && $$2 >= 1 && $$6 != null) {
         dci $$7 = $$6.b();
         if ($$7 == null) {
            return cyy.k;
         } else {
            cyy $$8 = $$3.c($$2);
            $$8.b(kj.V, $$7);
            return $$8;
         }
      } else {
         return cyy.k;
      }
   }

   @Override
   public jn<cyy> a(ddd $$0) {
      jn<cyy> $$1 = jn.a($$0.a(), cyy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cyy $$3 = $$0.a($$2);
         cyy $$4 = $$3.h().i();
         if (!$$4.f()) {
            $$1.set($$2, $$4);
         } else if ($$3.c(kj.V)) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public ddz<dcz> a() {
      return ddz.d;
   }
}
