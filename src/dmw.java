import com.mojang.serialization.MapCodec;

public abstract class dmw extends dmp {
   protected dmw(dsg.d $$0) {
      super($$0);
   }

   private static boolean b(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsh $$4 = $$1.a_($$3);
      if ($$4.a(dfh.dN) && $$4.c(dmo.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = ens.a($$1, $$0, $$2, $$4, $$3, jf.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dmw> a();

   private static boolean c(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awa.a);
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfh.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dsh $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ja $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dfh.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dfh.dN))));
               }
            }
         }
      }
   }
}
