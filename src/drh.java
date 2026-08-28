import com.mojang.serialization.MapCodec;

public abstract class drh extends dra {
   protected drh(dwv.d $$0) {
      super($$0);
   }

   private static boolean b(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.d();
      dww $$4 = $$1.a_($$3);
      if ($$4.a(djn.ea) && $$4.c(dqz.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = esp.a($$0, $$4, jn.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends drh> a();

   private static boolean c(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awv.a);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djn.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dww $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ji $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(djn.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
