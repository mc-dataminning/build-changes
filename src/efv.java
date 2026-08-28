import com.mojang.serialization.Codec;

public class efv extends efx<eii> {
   public efv(Codec<eii> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eii> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dgy $$0, ji $$1, boolean $$2) {
      ji.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               ji $$7 = $$3.g($$1).e($$5, $$6, $$4);
               djl $$8 = $$6 == -1 ? djn.cv : djn.a;
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
