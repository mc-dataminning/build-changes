import com.mojang.serialization.MapCodec;

public abstract class dnh extends dna {
   protected dnh(dtb.d $$0) {
      super($$0);
   }

   private static boolean b(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.c();
      dtc $$4 = $$1.a_($$3);
      if ($$4.a(dfe.eB) && $$4.c(dmz.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eov.a($$1, $$0, $$2, $$4, $$3, iw.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dnh> a();

   private static boolean c(dtc $$0, dcd $$1, ir $$2) {
      ir $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awj.a);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, ($$1.z_() ? dfe.n : dfe.m).n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dtc $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ir $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               dtc $$7 = $$1.a_($$6);
               if ($$4.a(dfe.l) && $$3.a(20) == 0 && $$7.a(dfe.k) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4);
               }

               if (($$7.a(dfe.m) || $$7.a(dfe.n)) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dfe.eB))));
               }
            }
         }
      }
   }
}
