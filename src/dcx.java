public class dcx extends ddf {
   public dcx(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cxw $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cyy $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cyu $$7 = $$6.h();
               if (!($$7 instanceof cxe)) {
                  return false;
               }

               cxe $$8 = (cxe)$$7;
               if ($$2 == null) {
                  $$2 = $$8.a();
               } else if ($$2 != $$8.a()) {
                  return false;
               }

               int $$10 = $$6.a(kj.am, dwn.a).b().size();
               if ($$10 > 6) {
                  return false;
               }

               if ($$10 > 0) {
                  if ($$4) {
                     return false;
                  }

                  $$4 = true;
               } else {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               }
            }
         }

         return $$4 && $$3;
      }
   }

   public cyy a(ddd $$0, jg.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cyy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kj.am, dwn.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cyy.k;
   }

   @Override
   public jn<cyy> a(ddd $$0) {
      jn<cyy> $$1 = jn.a($$0.a(), cyy.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cyy $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cyy $$4 = $$3.h().i();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kj.am, dwn.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public ddz<dcx> a() {
      return ddz.k;
   }
}
