import com.mojang.serialization.Codec;
import java.util.List;

public class ebw extends ece<eep> {
   private static final dtl a = dtl.a(dga.I);
   private final dtc b = dga.I.o();
   private final dtc c = dga.jF.o();
   private final dtc d = dga.aV.o();
   private final dtc ao = dga.G.o();

   public ebw(Codec<eep> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecg<eep> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      $$2 = $$2.d();

      while ($$1.u($$2) && $$2.v() > $$1.I_() + 2) {
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

         for (ji $$8 : ji.c.a) {
            $$1.a($$2.a($$8), this.ao, 2);
         }

         jd $$9 = $$2.e();
         $$1.a($$9, this.b, 2);

         for (ji $$10 : ji.c.a) {
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

         List<jd> $$17 = List.of($$2, $$2.i(), $$2.g(), $$2.h(), $$2.f());
         ayw $$18 = $$0.d();
         b($$1, ad.a($$17, $$18).c(1));
         b($$1, ad.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(dds $$0, jd $$1) {
      $$0.a($$1, dga.J.o(), 3);
      $$0.a($$1, dqj.N).ifPresent($$1x -> $$1x.a(ern.bd, $$1.a()));
   }
}
