import com.mojang.serialization.MapCodec;

public abstract class drj extends drc {
   protected drj(dwx.d $$0) {
      super($$0);
   }

   private static boolean b(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwy $$4 = $$1.a_($$3);
      if ($$4.a(djp.ea) && $$4.c(drb.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = esr.a($$0, $$4, jn.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends drj> a();

   private static boolean c(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awv.a);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djp.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dwy $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ji $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(djp.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
