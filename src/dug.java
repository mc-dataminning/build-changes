import com.mojang.serialization.MapCodec;

public abstract class dug extends dtz {
   protected dug(eag.d $$0) {
      super($$0);
   }

   private static boolean b(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.d();
      eah $$4 = $$1.a_($$3);
      if ($$4.a(dmh.ed) && $$4.c(dty.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = ewf.a($$0, $$4, ja.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dug> a();

   private static boolean c(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axh.a);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmh.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            eah $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iu $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dmh.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
