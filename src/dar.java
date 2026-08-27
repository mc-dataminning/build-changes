import com.mojang.serialization.MapCodec;

public abstract class dar extends dak {
   protected dar(dfc.d $$0) {
      super($$0);
   }

   private static boolean b(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfd $$4 = $$1.a_($$3);
      if ($$4.a(cte.dN) && $$4.c(daj.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = dzx.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   @Override
   protected abstract MapCodec<? extends dar> a();

   private static boolean c(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(aqa.a);
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cte.j.o());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dfd $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               gw $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cte.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cte.dN))));
               }
            }
         }
      }
   }
}
