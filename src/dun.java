import com.mojang.serialization.MapCodec;

public abstract class dun extends dug {
   protected dun(ean.d $$0) {
      super($$0);
   }

   private static boolean b(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.d();
      eao $$4 = $$1.a_($$3);
      if ($$4.a(dmo.ed) && $$4.c(duf.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = ewm.a($$0, $$4, jb.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dun> a();

   private static boolean c(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axh.a);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmo.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            eao $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iv $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dmo.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
