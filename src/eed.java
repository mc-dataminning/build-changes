import com.mojang.serialization.Codec;

public class eed extends eef<egq> {
   public eed(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dfl $$0, jg $$1, boolean $$2) {
      jg.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               jg $$7 = $$3.g($$1).e($$5, $$6, $$4);
               dhy $$8 = $$6 == -1 ? dia.co : dia.a;
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
