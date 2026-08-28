import com.mojang.serialization.MapCodec;

public abstract class dvp extends dvi {
   protected dvp(ebp.d $$0) {
      super($$0);
   }

   private static boolean b(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.d();
      ebq $$4 = $$1.a_($$3);
      if ($$4.a(dnq.ed) && $$4.c(dvh.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = exr.a($$0, $$4, jc.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dvp> a();

   private static boolean c(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axs.a);
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dnq.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            ebq $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dnq.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
