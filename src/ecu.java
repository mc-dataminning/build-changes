import com.mojang.serialization.Codec;
import java.util.List;

public class ecu extends edc<efn> {
   private static final duj a = duj.a(dgx.I);
   private final dua b = dgx.I.o();
   private final dua c = dgx.jF.o();
   private final dua d = dgx.aV.o();
   private final dua ao = dgx.G.o();

   public ecu(Codec<efn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efn> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      $$2 = $$2.d();

      while ($$1.u($$2) && $$2.v() > $$1.G_() + 2) {
         $$2 = $$2.e();
      }

      if (!a.a($$1.a_($$2))) {
         return false;
      } else {
         for (int $$3 = -2; $$3 <= 2; $$3++) {
            for (int $$4 = -2; $$4 <= 2; $$4++) {
               if ($$1.u($$2.b($$3, -1, $$4)) && $$1.u($$2.b($$3, -2, $$4))) {
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

         $$1.a($$2, this.ao, 2);

         for (jj $$8 : jj.c.a) {
            $$1.a($$2.a($$8), this.ao, 2);
         }

         je $$9 = $$2.e();
         $$1.a($$9, this.b, 2);

         for (jj $$10 : jj.c.a) {
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

         List<je> $$17 = List.of($$2, $$2.i(), $$2.g(), $$2.h(), $$2.f());
         azk $$18 = $$0.d();
         b($$1, ad.a($$17, $$18).c(1));
         b($$1, ad.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(dep $$0, je $$1) {
      $$0.a($$1, dgx.J.o(), 3);
      $$0.a($$1, drg.N).ifPresent($$1x -> $$1x.a(esp.aS, $$1.a()));
   }
}
