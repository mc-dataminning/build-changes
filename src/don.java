import com.mojang.serialization.MapCodec;

public abstract class don extends dog {
   protected don(dtz.d $$0) {
      super($$0);
   }

   private static boolean b(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.d();
      dua $$4 = $$1.a_($$3);
      if ($$4.a(dgx.dN) && $$4.c(dof.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eps.a($$0, $$4, jj.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends don> a();

   private static boolean c(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awy.a);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dgx.j.o());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dua $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               je $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dgx.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf($$1.a_($$6.d()).a(dgx.dN))));
               }
            }
         }
      }
   }
}
