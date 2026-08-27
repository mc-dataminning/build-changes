public class crs extends crx {
   public crs(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      int $$2 = 0;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpg.tX)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpg.tW)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.v() && $$2 > 0;
   }

   public cpd a(ckv $$0, iw $$1) {
      int $$2 = 0;
      cpd $$3 = cpd.h;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cpg.tX)) {
               if (!$$3.b()) {
                  return cpd.h;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cpg.tW)) {
                  return cpd.h;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.v() && $$2 >= 1 && cqy.d($$3) < 2) {
         cpd $$6 = new cpd(cpg.tX, $$2);
         sw $$7 = $$3.w().h();
         $$7.a("generation", cqy.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return cpd.h;
      }
   }

   public is<cpd> a(ckv $$0) {
      is<cpd> $$1 = is.a($$0.b(), cpd.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cpd $$3 = $$0.a($$2);
         if ($$3.d().s()) {
            $$1.set($$2, new cpd($$3.d().r()));
         } else if ($$3.d() instanceof cqy) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public csj<?> at_() {
      return csj.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
