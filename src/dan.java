public class dan extends dav {
   public dan(das $$0) {
      super($$0);
   }

   public boolean a(dat $$0, dgj $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         cvn $$2 = null;
         boolean $$3 = false;
         boolean $$4 = false;

         for (int $$5 = 0; $$5 < $$0.a(); $$5++) {
            cwq $$6 = $$0.a($$5);
            if (!$$6.f()) {
               cwm $$7 = $$6.h();
               if (!($$7 instanceof cut)) {
                  return false;
               }

               cut $$8 = (cut)$$7;
               if ($$2 == null) {
                  $$2 = $$8.b();
               } else if ($$2 != $$8.b()) {
                  return false;
               }

               int $$10 = $$6.a(kv.ai, dtr.a).b().size();
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

   public cwq a(dat $$0, jt.a $$1) {
      for (int $$2 = 0; $$2 < $$0.a(); $$2++) {
         cwq $$3 = $$0.a($$2);
         if (!$$3.f()) {
            int $$4 = $$3.a(kv.ai, dtr.a).b().size();
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cwq.j;
   }

   @Override
   public ka<cwq> a(dat $$0) {
      ka<cwq> $$1 = ka.a($$0.a(), cwq.j);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwq $$3 = $$0.a($$2);
         if (!$$3.f()) {
            cwq $$4 = $$3.h().k();
            if (!$$4.f()) {
               $$1.set($$2, $$4);
            } else if (!$$3.a(kv.ai, dtr.a).b().isEmpty()) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public dbp<dan> a() {
      return dbp.k;
   }
}
