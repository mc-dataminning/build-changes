import com.mojang.serialization.MapCodec;

public abstract class dml extends dme {
   protected dml(drw.d $$0) {
      super($$0);
   }

   private static boolean b(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.c();
      drx $$4 = $$1.a_($$3);
      if ($$4.a(dew.dN) && $$4.c(dmd.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = enh.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dml> a();

   private static boolean c(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awr.a);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dew.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            drx $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iz $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dew.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dew.dN))));
               }
            }
         }
      }
   }
}
