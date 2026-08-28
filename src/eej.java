import com.mojang.serialization.Codec;

public class eej extends eel<egw> {
   public eej(Codec<egw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(een<egw> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dfr $$0, jh $$1, boolean $$2) {
      jh.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               jh $$7 = $$3.g($$1).e($$5, $$6, $$4);
               die $$8 = $$6 == -1 ? dig.co : dig.a;
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
