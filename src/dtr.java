import com.mojang.serialization.MapCodec;

public abstract class dtr extends dtk {
   protected dtr(dzn.d $$0) {
      super($$0);
   }

   private static boolean b(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.d();
      dzo $$4 = $$1.a_($$3);
      if ($$4.a(dlw.ea) && $$4.c(dtj.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = evm.a($$0, $$4, ja.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dtr> a();

   private static boolean c(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axf.a);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dlw.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            dzo $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iu $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dlw.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
