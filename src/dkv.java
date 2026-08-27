import com.mojang.serialization.MapCodec;

public abstract class dkv extends dko {
   protected dkv(dqg.d $$0) {
      super($$0);
   }

   private static boolean b(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.c();
      dqh $$4 = $$1.a_($$3);
      if ($$4.a(ddg.dN) && $$4.c(dkn.c) == 1) {
         return true;
      } else if ($$4.u().e() == 8) {
         return false;
      } else {
         int $$5 = elr.a($$1, $$0, $$2, $$4, $$3, is.b, $$4.b($$1, $$3));
         return $$5 < $$1.P();
      }
   }

   @Override
   protected abstract MapCodec<? extends dkv> a();

   private static boolean c(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.c();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(avw.a);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, ddg.j.n());
      } else {
         if ($$1.A($$2.c()) >= 9) {
            dqh $$4 = this.n();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               in $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(ddg.j) && c($$4, $$1, $$6)) {
                  $$1.b($$6, $$4.a(c, Boolean.valueOf($$1.a_($$6.c()).a(ddg.dN))));
               }
            }
         }
      }
   }
}
