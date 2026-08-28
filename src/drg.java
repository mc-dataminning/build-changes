import com.mojang.serialization.MapCodec;

public abstract class drg extends dqz {
   protected drg(dwu.d $$0) {
      super($$0);
   }

   private static boolean b(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.d();
      dwv $$4 = $$1.a_($$3);
      if ($$4.a(djm.ea) && $$4.c(dqy.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = eso.a($$0, $$4, jn.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends drg> a();

   private static boolean c(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awu.a);
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, djm.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dwv $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ji $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(djm.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
