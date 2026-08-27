import com.mojang.serialization.Codec;
import java.util.List;

public class dzq extends dzx<eci> {
   private static final drk a = drk.a(dea.I);
   private final drb b = dea.I.n();
   private final drb c = dea.jF.n();
   private final drb d = dea.aV.n();
   private final drb an = dea.G.n();

   public dzq(Codec<eci> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eci> $$0) {
      dbs $$1 = $$0.b();
      io $$2 = $$0.e();
      $$2 = $$2.c();

      while ($$1.u($$2) && $$2.v() > $$1.I_() + 2) {
         $$2 = $$2.d();
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

         $$1.a($$2, this.an, 2);

         for (it $$8 : it.c.a) {
            $$1.a($$2.a($$8), this.an, 2);
         }

         io $$9 = $$2.d();
         $$1.a($$9, this.b, 2);

         for (it $$10 : it.c.a) {
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

         List<io> $$17 = List.of($$2, $$2.h(), $$2.f(), $$2.g(), $$2.e());
         ayk $$18 = $$0.d();
         b($$1, ac.a($$17, $$18).c(1));
         b($$1, ac.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(dbs $$0, io $$1) {
      $$0.a($$1, dea.J.n(), 3);
      $$0.a($$1, doi.N).ifPresent($$1x -> $$1x.a(epd.bb, $$1.a()));
   }
}
