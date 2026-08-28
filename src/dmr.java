import com.mojang.serialization.MapCodec;

public abstract class dmr extends dmk {
   protected dmr(dsc.d $$0) {
      super($$0);
   }

   private static boolean b(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsd $$4 = $$1.a_($$3);
      if ($$4.a(dfc.dN) && $$4.c(dmj.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = enn.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dmr> a();

   private static boolean c(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awv.a);
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfc.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dsd $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iz $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dfc.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dfc.dN))));
               }
            }
         }
      }
   }
}
