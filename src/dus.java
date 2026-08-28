import com.mojang.serialization.MapCodec;

public abstract class dus extends dul {
   protected dus(eas.d $$0) {
      super($$0);
   }

   private static boolean b(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.d();
      eat $$4 = $$1.a_($$3);
      if ($$4.a(dmt.ed) && $$4.c(duk.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = ewr.a($$0, $$4, jb.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dus> a();

   private static boolean c(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axh.a);
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dmt.j.m());
      } else {
         if ($$1.B($$2.d()) >= 9) {
            eat $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iv $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dmt.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
