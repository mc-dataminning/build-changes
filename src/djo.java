import com.mojang.serialization.MapCodec;

public abstract class djo extends djh {
   protected djo(doy.d $$0) {
      super($$0);
   }

   private static boolean b(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.c();
      doz $$4 = $$1.a_($$3);
      if ($$4.a(dca.dN) && $$4.c(djg.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = ekj.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends djo> a();

   private static boolean c(doz $$0, cza $$1, ib $$2) {
      ib $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(avh.a);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dca.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            doz $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ib $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dca.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dca.dN))));
               }
            }
         }
      }
   }
}
