import com.mojang.serialization.MapCodec;

public abstract class dcj extends dcc {
   protected dcj(dgv.d $$0) {
      super($$0);
   }

   private static boolean b(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.c();
      dgw $$4 = $$1.a_($$3);
      if ($$4.a(cuv.dN) && $$4.c(dcb.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = ebx.a($$1, $$0, $$2, $$4, $$3, hx.b, $$4.b($$1, $$3));
         return $$5 < $$1.M();
      }
   }

   @Override
   protected abstract MapCodec<? extends dcj> a();

   private static boolean c(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(arh.a);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cuv.j.o());
      } else {
         if ($$1.z($$2.c()) >= 9) {
            dgw $$4 = this.o();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               ht $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(cuv.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(cuv.dN))));
               }
            }
         }
      }
   }
}
