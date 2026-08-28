import com.mojang.serialization.Codec;

public class eir extends eit<ele> {
   public eir(Codec<ele> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ele> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(djg $$0, iu $$1, boolean $$2) {
      iu.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               iu $$7 = $$3.g($$1).e($$5, $$6, $$4);
               dlu $$8 = $$6 == -1 ? dlw.cv : dlw.a;
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
