import com.mojang.serialization.MapCodec;

public abstract class dgv extends dgo {
   protected dgv(dmd.d $$0) {
      super($$0);
   }

   private static boolean b(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.c();
      dme $$4 = $$1.a_($$3);
      if ($$4.a(czh.dN) && $$4.c(dgn.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = ehi.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
         return $$5 < $$1.O();
      }
   }

   @Override
   protected abstract MapCodec<? extends dgv> a();

   private static boolean c(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(auj.a);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, czh.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dme $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ib $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(czh.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(czh.dN))));
               }
            }
         }
      }
   }
}
