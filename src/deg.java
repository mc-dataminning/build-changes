import com.mojang.serialization.MapCodec;

public abstract class deg extends ddz {
   protected deg(djg.d $$0) {
      super($$0);
   }

   private static boolean b(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.c();
      djh $$4 = $$1.a_($$3);
      if ($$4.a(cws.dN) && $$4.c(ddy.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eei.a($$1, $$0, $$2, $$4, $$3, ic.b, $$4.b($$1, $$3));
         return $$5 < $$1.O();
      }
   }

   @Override
   protected abstract MapCodec<? extends deg> a();

   private static boolean c(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(asm.a);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cws.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            djh $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               hx $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cws.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cws.dN))));
               }
            }
         }
      }
   }
}
