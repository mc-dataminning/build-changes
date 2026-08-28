import com.mojang.serialization.MapCodec;

public abstract class dpp extends dpi {
   protected dpp(dvc.d $$0) {
      super($$0);
   }

   private static boolean b(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.d();
      dvd $$4 = $$1.a_($$3);
      if ($$4.a(dia.dN) && $$4.c(dph.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eqv.a($$0, $$4, jl.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dpp> a();

   private static boolean c(dvd $$0, dey $$1, jg $$2) {
      jg $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axf.a);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dia.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dvd $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jg $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dia.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf($$1.a_($$6.d()).a(dia.dN))));
               }
            }
         }
      }
   }
}
