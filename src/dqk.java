import com.mojang.serialization.Codec;

public class dqk extends drc<dsx> {
   public dqk(Codec<dsx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dsx> $$0) {
      ctt $$1 = $$0.b();
      dsx $$2 = $$0.f();
      auf $$3 = $$0.d();
      int $$4 = $$2.a().size();
      int[] $$5 = new int[$$4];
      int $$6 = 0;

      for (int $$7 = 0; $$7 < $$4; $$7++) {
         $$5[$$7] = $$2.a().get($$7).a().a($$3);
         $$6 += $$5[$$7];
      }

      if ($$6 == 0) {
         return false;
      } else {
         hv.a $$8 = $$0.e().j();
         hv.a $$9 = $$8.j().c($$2.b());

         for (int $$10 = 0; $$10 < $$6; $$10++) {
            if (!$$2.c().test($$1, $$9)) {
               a($$5, $$6, $$10, $$2.d());
               break;
            }

            $$9.c($$2.b());
         }

         for (int $$11 = 0; $$11 < $$4; $$11++) {
            int $$12 = $$5[$$11];
            if ($$12 != 0) {
               dsx.a $$13 = $$2.a().get($$11);

               for (int $$14 = 0; $$14 < $$12; $$14++) {
                  $$1.a($$8, $$13.b().a($$3, $$8), 2);
                  $$8.c($$2.b());
               }
            }
         }

         return true;
      }
   }

   private static void a(int[] $$0, int $$1, int $$2, boolean $$3) {
      int $$4 = $$1 - $$2;
      int $$5 = $$3 ? 1 : -1;
      int $$6 = $$3 ? 0 : $$0.length - 1;
      int $$7 = $$3 ? $$0.length : -1;

      for (int $$8 = $$6; $$8 != $$7 && $$4 > 0; $$8 += $$5) {
         int $$9 = $$0[$$8];
         int $$10 = Math.min($$9, $$4);
         $$4 -= $$10;
         $$0[$$8] -= $$10;
      }
   }
}
