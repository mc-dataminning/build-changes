import com.mojang.serialization.MapCodec;

public abstract class dlr extends dlk {
   protected dlr(drc.d $$0) {
      super($$0);
   }

   private static boolean b(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.c();
      drd $$4 = $$1.a_($$3);
      if ($$4.a(dec.dN) && $$4.c(dlj.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = emn.a($$1, $$0, $$2, $$4, $$3, it.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends dlr> a();

   private static boolean c(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(awc.a);
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dec.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            drd $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               io $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dec.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(dec.dN))));
               }
            }
         }
      }
   }
}
