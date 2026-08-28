import com.mojang.serialization.MapCodec;

public abstract class dpe extends dox {
   protected dpe(dur.d $$0) {
      super($$0);
   }

   private static boolean b(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.d();
      dus $$4 = $$1.a_($$3);
      if ($$4.a(dho.dN) && $$4.c(dow.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eqk.a($$0, $$4, jk.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dpe> a();

   private static boolean c(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axb.a);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dho.j.n());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dus $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jf $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dho.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf($$1.a_($$6.d()).a(dho.dN))));
               }
            }
         }
      }
   }
}
