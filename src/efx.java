import com.mojang.serialization.Codec;

public class efx extends efz<eik> {
   public efx(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eik> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dha $$0, ji $$1, boolean $$2) {
      ji.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               ji $$7 = $$3.g($$1).e($$5, $$6, $$4);
               djn $$8 = $$6 == -1 ? djp.cv : djp.a;
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
