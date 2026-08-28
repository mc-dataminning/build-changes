import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoe {
   private static final Map<Pair<jj<crq>, bsk>, ctv> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(crr.b, bsk.f), cud.pC);
      $$0.put(Pair.of(crr.b, bsk.e), cud.pD);
      $$0.put(Pair.of(crr.b, bsk.d), cud.pE);
      $$0.put(Pair.of(crr.b, bsk.c), cud.pF);
      $$0.put(Pair.of(crr.c, bsk.f), cud.pG);
      $$0.put(Pair.of(crr.c, bsk.e), cud.pH);
      $$0.put(Pair.of(crr.c, bsk.d), cud.pI);
      $$0.put(Pair.of(crr.c, bsk.c), cud.pJ);
      $$0.put(Pair.of(crr.d, bsk.f), cud.pO);
      $$0.put(Pair.of(crr.d, bsk.e), cud.pP);
      $$0.put(Pair.of(crr.d, bsk.d), cud.pQ);
      $$0.put(Pair.of(crr.d, bsk.c), cud.pR);
      $$0.put(Pair.of(crr.g, bsk.f), cud.pS);
      $$0.put(Pair.of(crr.g, bsk.e), cud.pT);
      $$0.put(Pair.of(crr.g, bsk.d), cud.pU);
      $$0.put(Pair.of(crr.g, bsk.c), cud.pV);
      $$0.put(Pair.of(crr.e, bsk.f), cud.pK);
      $$0.put(Pair.of(crr.e, bsk.e), cud.pL);
      $$0.put(Pair.of(crr.e, bsk.d), cud.pM);
      $$0.put(Pair.of(crr.e, bsk.c), cud.pN);
      $$0.put(Pair.of(crr.f, bsk.f), cud.oo);
   });
   private static final List<akj<cwh>> b = List.of(
      cwi.a, cwi.b, cwi.c, cwi.d, cwi.e, cwi.f, cwi.g, cwi.h, cwi.i, cwi.j, cwi.k, cwi.l, cwi.m, cwi.n, cwi.o, cwi.p, cwi.q, cwi.r
   );
   private static final List<akj<cwf>> c = List.of(cwg.a, cwg.b, cwg.c, cwg.d, cwg.e, cwg.f, cwg.g, cwg.h, cwg.i, cwg.j);
   private static final ToIntFunction<akj<cwh>> d = ac.g(b);
   private static final ToIntFunction<akj<cwf>> e = ac.g(c);

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).h()))
      );
   }

   private static int a(eq $$0, cmh $$1) {
      dcd $$2 = $$1.dP();
      js<cwe> $$3 = js.a();
      jw<cwh> $$4 = $$2.H_().d(lr.aW);
      jw<cwf> $$5 = $$2.H_().d(lr.aV);
      $$4.t()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.t()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwe($$5.e($$4x), $$4.e($$3x))))
         );
      ja $$6 = $$1.dp().a($$1.cH(), 5);
      jw<crq> $$7 = $$0.v().d(lr.ay);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwe $$12 : $$3) {
         for (crq $$13 : $$7) {
            if ($$13 != crr.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               cig $$17 = new cig($$2, $$14, $$15, $$16);
               $$17.s(180.0F);
               $$17.f(true);

               for (bsk $$18 : bsk.values()) {
                  ctv $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cua $$20 = new cua($$19);
                     $$20.b(kn.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crp) {
                        crp $$21 = (crp)$$19;
                        if ($$21.h().a(crr.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
                           $$17.o(true);
                           continue;
                        }
                     }

                     $$17.k(true);
                  }
               }

               $$2.b($$17);
               $$11++;
            }
         }

         $$10++;
      }

      $$0.a(() -> wu.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
