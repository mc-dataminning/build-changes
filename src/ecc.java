import com.mojang.serialization.Codec;

public class ecc extends ece<eep> {
   public ecc(Codec<eep> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eep> $$0) {
      a($$0.b(), $$0.e(), false);
      return true;
   }

   public static void a(ddl $$0, jd $$1, boolean $$2) {
      jd.a $$3 = $$1.k();

      for (int $$4 = -2; $$4 <= 2; $$4++) {
         for (int $$5 = -2; $$5 <= 2; $$5++) {
            for (int $$6 = -1; $$6 < 3; $$6++) {
               jd $$7 = $$3.g($$1).e($$5, $$6, $$4);
               dfy $$8 = $$6 == -1 ? dga.co : dga.a;
               if (!$$0.a_($$7).a($$8)) {
                  if ($$2) {
                     $$0.a($$7, true, null);
                  }

                  $$0.a($$7, $$8.o(), 3);
               }
            }
         }
      }
   }
}
