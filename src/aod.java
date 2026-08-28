import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aod {
   private static final Map<Pair<jj<cru>, bso>, cty> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(crv.b, bso.f), cug.pC);
      $$0.put(Pair.of(crv.b, bso.e), cug.pD);
      $$0.put(Pair.of(crv.b, bso.d), cug.pE);
      $$0.put(Pair.of(crv.b, bso.c), cug.pF);
      $$0.put(Pair.of(crv.c, bso.f), cug.pG);
      $$0.put(Pair.of(crv.c, bso.e), cug.pH);
      $$0.put(Pair.of(crv.c, bso.d), cug.pI);
      $$0.put(Pair.of(crv.c, bso.c), cug.pJ);
      $$0.put(Pair.of(crv.d, bso.f), cug.pO);
      $$0.put(Pair.of(crv.d, bso.e), cug.pP);
      $$0.put(Pair.of(crv.d, bso.d), cug.pQ);
      $$0.put(Pair.of(crv.d, bso.c), cug.pR);
      $$0.put(Pair.of(crv.g, bso.f), cug.pS);
      $$0.put(Pair.of(crv.g, bso.e), cug.pT);
      $$0.put(Pair.of(crv.g, bso.d), cug.pU);
      $$0.put(Pair.of(crv.g, bso.c), cug.pV);
      $$0.put(Pair.of(crv.e, bso.f), cug.pK);
      $$0.put(Pair.of(crv.e, bso.e), cug.pL);
      $$0.put(Pair.of(crv.e, bso.d), cug.pM);
      $$0.put(Pair.of(crv.e, bso.c), cug.pN);
      $$0.put(Pair.of(crv.f, bso.f), cug.oo);
   });
   private static final List<akj<cwk>> b = List.of(
      cwl.a, cwl.b, cwl.c, cwl.d, cwl.e, cwl.f, cwl.g, cwl.h, cwl.i, cwl.j, cwl.k, cwl.l, cwl.m, cwl.n, cwl.o, cwl.p, cwl.q, cwl.r
   );
   private static final List<akj<cwi>> c = List.of(cwj.a, cwj.b, cwj.c, cwj.d, cwj.e, cwj.f, cwj.g, cwj.h, cwj.i, cwj.j);
   private static final ToIntFunction<akj<cwk>> d = ac.g(b);
   private static final ToIntFunction<akj<cwi>> e = ac.g(c);

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).h()))
      );
   }

   private static int a(eq $$0, cml $$1) {
      dcg $$2 = $$1.dR();
      js<cwh> $$3 = js.a();
      jw<cwk> $$4 = $$2.H_().d(lr.aW);
      jw<cwi> $$5 = $$2.H_().d(lr.aV);
      $$4.t()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.t()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwh($$5.e($$4x), $$4.e($$3x))))
         );
      ja $$6 = $$1.dr().a($$1.cJ(), 5);
      jw<cru> $$7 = $$0.v().d(lr.ay);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwh $$12 : $$3) {
         for (cru $$13 : $$7) {
            if ($$13 != crv.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               cik $$17 = new cik($$2, $$14, $$15, $$16);
               $$17.s(180.0F);
               $$17.g(true);

               for (bso $$18 : bso.values()) {
                  cty $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cud $$20 = new cud($$19);
                     $$20.b(kn.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crt) {
                        crt $$21 = (crt)$$19;
                        if ($$21.h().a(crv.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
                           $$17.p(true);
                           continue;
                        }
                     }

                     $$17.l(true);
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
