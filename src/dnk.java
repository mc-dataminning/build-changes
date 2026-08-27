import com.mojang.serialization.Codec;
import java.util.List;

public class dnk extends dnr<dqc> {
   private static final dfn a = dfn.a(csr.I);
   private final dfe b = csr.I.n();
   private final dfe c = csr.jF.n();
   private final dfe d = csr.aV.n();
   private final dfe an = csr.G.n();

   public dnk(Codec<dqc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqc> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      $$2 = $$2.c();

      while ($$1.t($$2) && $$2.v() > $$1.C_() + 2) {
         $$2 = $$2.d();
      }

      if (!a.a($$1.a_($$2))) {
         return false;
      } else {
         for (int $$3 = -2; $$3 <= 2; $$3++) {
            for (int $$4 = -2; $$4 <= 2; $$4++) {
               if ($$1.t($$2.b($$3, -1, $$4)) && $$1.t($$2.b($$3, -2, $$4))) {
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

         $$1.a($$2, this.an, 2);

         for (hc $$8 : hc.c.a) {
            $$1.a($$2.a($$8), this.an, 2);
         }

         gw $$9 = $$2.d();
         $$1.a($$9, this.b, 2);

         for (hc $$10 : hc.c.a) {
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

         List<gw> $$17 = List.of($$2, $$2.h(), $$2.f(), $$2.g(), $$2.e());
         arx $$18 = $$0.d();
         b($$1, ac.a($$17, $$18).c(1));
         b($$1, ac.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(cqk $$0, gw $$1) {
      $$0.a($$1, csr.J.n(), 3);
      $$0.a($$1, dcs.N).ifPresent($$1x -> $$1x.a(ecj.aC, $$1.a()));
   }
}
