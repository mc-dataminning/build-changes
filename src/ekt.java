import com.mojang.serialization.Codec;

public class ekt extends ekw<eni> {
   public ekt(Codec<eni> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eni> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(dla $$0, iw $$1, boolean $$2) {
      iw.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               iw $$7 = $$3.g($$1).e($$5, $$6, $$4);
               dno $$8 = $$6 == -1 ? dnq.cy : dnq.a;
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
