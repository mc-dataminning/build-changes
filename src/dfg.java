public class dfg extends def {
   public dfg(dec $$0) {
      super($$0);
   }

   public boolean a(ded $$0, djx $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cye) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(dac.wD)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dxs $$6 = $$5.a(kk.am, dxs.a);
                  if (!$$6.b().isEmpty()) {
                     return false;
                  }

                  $$2 = true;
               }
            }
         }

         return $$2 && $$3;
      }
   }

   public czy a(ded $$0, jh.a $$1) {
      czy $$2 = czy.k;
      czy $$3 = czy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cye) {
               $$2 = $$5;
            } else if ($$5.a(dac.wD)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kk.am, $$2.a(kk.am));
         $$3.b(kk.an, ((cye)$$2.h()).a());
         return $$3;
      }
   }

   @Override
   public dez<dfg> a() {
      return dez.l;
   }
}
