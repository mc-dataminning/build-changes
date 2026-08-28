import com.mojang.serialization.MapCodec;

public abstract class dsr extends dsk {
   protected dsr(dyl.d $$0) {
      super($$0);
   }

   private static boolean b(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.d();
      dym $$4 = $$1.a_($$3);
      if ($$4.a(dkw.ea) && $$4.c(dsj.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = euk.a($$0, $$4, jo.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dsr> a();

   private static boolean c(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(axf.a);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dkw.j.m());
      } else {
         if ($$1.A($$2.d()) >= 9) {
            dym $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jj $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dkw.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.b(c, Boolean.valueOf(o($$1.a_($$6.d())))));
               }
            }
         }
      }
   }
}
