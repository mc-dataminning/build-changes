import com.mojang.serialization.Codec;
import java.util.List;

public class ekd extends ekm<emy> {
   private static final ebp a = ebp.a(dng.L);
   private final ebg b = dng.L.m();
   private final ebg c = dng.ki.m();
   private final ebg d = dng.bc.m();
   private final ebg ap = dng.J.m();

   public ekd(Codec<emy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emy> $$0) {
      dky $$1 = $$0.b();
      iw $$2 = $$0.e();
      $$2 = $$2.d();

      while ($$1.v($$2) && $$2.v() > $$1.K_() + 2) {
         $$2 = $$2.e();
      }

      if (!a.a($$1.a_($$2))) {
         return false;
      } else {
         for (int $$3 = -2; $$3 <= 2; $$3++) {
            for (int $$4 = -2; $$4 <= 2; $$4++) {
               if ($$1.v($$2.b($$3, -1, $$4)) && $$1.v($$2.b($$3, -2, $$4))) {
                  return false;
               }
            }
         }

         for (int $$5 = -2; $$5 <= 0; $$5++) {
            for (int $$6 = -2; $$6 <= 2; $$6++) {
               for (int $$7 = -2; $$7 <= 2; $$7++) {
                  $$1.a($$2.b($$6, $$5, $$7), this.d, 2);
               }
            }
         }

         $$1.a($$2, this.ap, 2);

         for (jc $$8 : jc.c.a) {
            $$1.a($$2.a($$8), this.ap, 2);
         }

         iw $$9 = $$2.e();
         $$1.a($$9, this.b, 2);

         for (jc $$10 : jc.c.a) {
            $$1.a($$9.a($$10), this.b, 2);
         }

         for (int $$11 = -2; $$11 <= 2; $$11++) {
            for (int $$12 = -2; $$12 <= 2; $$12++) {
               if ($$11 == -2 || $$11 == 2 || $$12 == -2 || $$12 == 2) {
                  $$1.a($$2.b($$11, 1, $$12), this.d, 2);
               }
            }
         }

         $$1.a($$2.b(2, 1, 0), this.c, 2);
         $$1.a($$2.b(-2, 1, 0), this.c, 2);
         $$1.a($$2.b(0, 1, 2), this.c, 2);
         $$1.a($$2.b(0, 1, -2), this.c, 2);

         for (int $$13 = -1; $$13 <= 1; $$13++) {
            for (int $$14 = -1; $$14 <= 1; $$14++) {
               if ($$13 == 0 && $$14 == 0) {
                  $$1.a($$2.b($$13, 4, $$14), this.d, 2);
               } else {
                  $$1.a($$2.b($$13, 4, $$14), this.c, 2);
               }
            }
         }

         for (int $$15 = 1; $$15 <= 3; $$15++) {
            $$1.a($$2.b(-1, $$15, -1), this.d, 2);
            $$1.a($$2.b(-1, $$15, 1), this.d, 2);
            $$1.a($$2.b(1, $$15, -1), this.d, 2);
            $$1.a($$2.b(1, $$15, 1), this.d, 2);
         }

         List<iw> $$17 = List.of($$2, $$2.i(), $$2.g(), $$2.h(), $$2.f());
         azz $$18 = $$0.d();
         b($$1, ag.a($$17, $$18).c(1));
         b($$1, ag.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(dky $$0, iw $$1) {
      $$0.a($$1, dng.M.m(), 3);
      $$0.a($$1, dyg.O).ifPresent($$1x -> $$1x.a(faf.aX, $$1.a()));
   }
}
