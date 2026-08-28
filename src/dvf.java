import com.mojang.serialization.MapCodec;

public abstract class dvf extends duy {
   protected dvf(ebf.d $$0) {
      super($$0);
   }

   private static boolean b(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebg $$4 = $$1.a_($$3);
      if ($$4.a(dng.ed) && $$4.c(dux.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = exh.a($$0, $$4, jc.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dvf> a();

   private static boolean c(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axl.a);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dng.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            ebg $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dng.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
