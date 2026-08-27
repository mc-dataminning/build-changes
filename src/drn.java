import com.mojang.serialization.Codec;
import java.util.List;

public class drn extends dru<duf> {
   private static final djq a = djq.a(cws.I);
   private final djh b = cws.I.o();
   private final djh c = cws.jF.o();
   private final djh d = cws.aV.o();
   private final djh an = cws.G.o();

   public drn(Codec<duf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<duf> $$0) {
      cuk $$1 = $$0.b();
      hx $$2 = $$0.e();
      $$2 = $$2.c();

      while ($$1.u($$2) && $$2.v() > $$1.J_() + 2) {
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

         for (ic $$8 : ic.c.a) {
            $$1.a($$2.a($$8), this.an, 2);
         }

         hx $$9 = $$2.d();
         $$1.a($$9, this.b, 2);

         for (ic $$10 : ic.c.a) {
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

         List<hx> $$17 = List.of($$2, $$2.h(), $$2.f(), $$2.g(), $$2.e());
         auv $$18 = $$0.d();
         b($$1, ac.a($$17, $$18).c(1));
         b($$1, ac.a($$17, $$18).c(2));
         return true;
      }
   }

   private static void b(cuk $$0, hx $$1) {
      $$0.a($$1, cws.J.o(), 3);
      $$0.a($$1, dgx.N).ifPresent($$1x -> $$1x.a(egu.aO, $$1.a()));
   }
}
