public class cxy extends cwv {
   public cxy(cwt $$0) {
      super($$0);
   }

   public boolean a(cou $$0, dad $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         csz $$7 = $$0.a($$6);
         if (!$$7.d()) {
            if ($$7.a(ddg.cf.q()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(ddg.cg.q()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(avz.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(ctc.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public csz a(cou $$0, iy.a $$1) {
      csz $$2 = new csz(ctc.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         csz $$4 = $$0.a($$3);
         if (!$$4.d()) {
            dlg $$5 = dlg.a($$4.f());
            if ($$5 != null) {
               $$2.b(ka.F, $$5.b());
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
   public cxh<?> ao_() {
      return cxh.n;
   }
}
