import com.mojang.serialization.MapCodec;

public abstract class dpb extends dou {
   protected dpb(dun.d $$0) {
      super($$0);
   }

   private static boolean b(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.d();
      duo $$4 = $$1.a_($$3);
      if ($$4.a(dhl.dN) && $$4.c(dot.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eqg.a($$0, $$4, jj.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dpb> a();

   private static boolean c(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awz.a);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dhl.j.o());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            duo $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               je $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dhl.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf($$1.a_($$6.d()).a(dhl.dN))));
               }
            }
         }
      }
   }
}
