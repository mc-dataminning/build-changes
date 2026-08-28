import com.mojang.serialization.Codec;
import java.util.List;

public class ekb extends ekk<emw> {
   private static final ebn a = ebn.a(dne.L);
   private final ebe b = dne.L.m();
   private final ebe c = dne.ki.m();
   private final ebe d = dne.bc.m();
   private final ebe ap = dne.J.m();

   public ekb(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
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

         for (jb $$8 : jb.c.a) {
            $$1.a($$2.a($$8), this.ap, 2);
         }

         iv $$9 = $$2.e();
         $$1.a($$9, this.b, 2);

         for (jb $$10 : jb.c.a) {
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

         List<iv> $$17 = List.of($$2, $$2.i(), $$2.g(), $$2.h(), $$2.f());
         azx $$18 = $$0.d();
         b($$1, ag.a($$17, $$18).c(1));
         b($$1, ag.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(dkw $$0, iv $$1) {
      $$0.a($$1, dne.M.m(), 3);
      $$0.a($$1, dye.O).ifPresent($$1x -> $$1x.a(fad.aX, $$1.a()));
   }
}
