public class cmx extends clw {
   public cmx(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cja $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(csr.cf.k()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(csr.cg.k()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(apw.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cjd.oC) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = new cja(cjd.va, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cja $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dat $$5 = dat.a($$4.d());
            if ($$5 != null) {
               ckk.a($$2, $$5.a());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.n;
   }
}
