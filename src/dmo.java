import com.mojang.serialization.MapCodec;

public abstract class dmo extends dmh {
   protected dmo(drz.d $$0) {
      super($$0);
   }

   private static boolean b(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.c();
      dsa $$4 = $$1.a_($$3);
      if ($$4.a(dez.dN) && $$4.c(dmg.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = enk.a($$1, $$0, $$2, $$4, $$3, je.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dmo> a();

   private static boolean c(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awu.a);
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dez.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dsa $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               iz $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dez.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dez.dN))));
               }
            }
         }
      }
   }
}
