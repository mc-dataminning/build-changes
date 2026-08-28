import com.mojang.serialization.MapCodec;

public abstract class dmy extends dmr {
   protected dmy(dsj.d $$0) {
      super($$0);
   }

   private static boolean b(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsk $$4 = $$1.a_($$3);
      if ($$4.a(dfj.dN) && $$4.c(dmq.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = eny.a($$1, $$0, $$2, $$4, $$3, jf.b, $$4.b($$1, $$3));
         return $$5 < $$1.Q();
      }
   }

   @Override
   protected abstract MapCodec<? extends dmy> a();

   private static boolean c(dsk $$0, dci $$1, ja $$2) {
      ja $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awc.a);
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dfj.j.o());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dsk $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ja $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dfj.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dfj.dN))));
               }
            }
         }
      }
   }
}
