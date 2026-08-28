import com.mojang.serialization.Codec;

public class egm extends ego<eiz> {
   public egm(Codec<eiz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<eiz> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dhr $$0, jh $$1, boolean $$2) {
      jh.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               jh $$7 = $$3.g($$1).e($$5, $$6, $$4);
               dke $$8 = $$6 == -1 ? dkg.cv : dkg.a;
               if (!$$0.a_($$7).a($$8)) {
                  if ($$2) {
                     $$0.a($$7, true, null);
                  }

                  $$0.a($$7, $$8.m(), 3);
               }
            }
         }
      }
   }
}
