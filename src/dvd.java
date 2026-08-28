import com.mojang.serialization.MapCodec;

public abstract class dvd extends duw {
   protected dvd(ebd.d $$0) {
      super($$0);
   }

   private static boolean b(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.d();
      ebe $$4 = $$1.a_($$3);
      if ($$4.a(dne.ed) && $$4.c(duv.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = exf.a($$0, $$4, jb.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dvd> a();

   private static boolean c(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axj.a);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dne.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            ebe $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iv $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dne.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
