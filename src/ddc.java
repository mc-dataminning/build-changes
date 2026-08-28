public class ddc extends dcb {
   public ddc(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() != 2) {
         return false;
      } else {
         boolean $$2 = false;
         boolean $$3 = false;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if ($$5.h() instanceof cwc) {
                  if ($$3) {
                     return false;
                  }

                  $$3 = true;
               } else {
                  if (!$$5.a(cyc.ww)) {
                     return false;
                  }

                  if ($$2) {
                     return false;
                  }

                  dvb $$6 = $$5.a(kx.ak, dvb.a);
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

   public cxy a(dbz $$0, ju.a $$1) {
      cxy $$2 = cxy.k;
      cxy $$3 = cxy.k;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if ($$5.h() instanceof cwc) {
               $$2 = $$5;
            } else if ($$5.a(cyc.ww)) {
               $$3 = $$5.v();
            }
         }
      }

      if ($$3.f()) {
         return $$3;
      } else {
         $$3.b(kx.ak, $$2.a(kx.ak));
         $$3.b(kx.al, ((cwc)$$2.h()).b());
         return $$3;
      }
   }

   @Override
   public dcv<ddc> a() {
      return dcv.l;
   }
}
