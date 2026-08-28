import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aod {
   private static final Map<Pair<jj<crt>, bsn>, ctx> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cru.b, bsn.f), cuf.pC);
      $$0.put(Pair.of(cru.b, bsn.e), cuf.pD);
      $$0.put(Pair.of(cru.b, bsn.d), cuf.pE);
      $$0.put(Pair.of(cru.b, bsn.c), cuf.pF);
      $$0.put(Pair.of(cru.c, bsn.f), cuf.pG);
      $$0.put(Pair.of(cru.c, bsn.e), cuf.pH);
      $$0.put(Pair.of(cru.c, bsn.d), cuf.pI);
      $$0.put(Pair.of(cru.c, bsn.c), cuf.pJ);
      $$0.put(Pair.of(cru.d, bsn.f), cuf.pO);
      $$0.put(Pair.of(cru.d, bsn.e), cuf.pP);
      $$0.put(Pair.of(cru.d, bsn.d), cuf.pQ);
      $$0.put(Pair.of(cru.d, bsn.c), cuf.pR);
      $$0.put(Pair.of(cru.g, bsn.f), cuf.pS);
      $$0.put(Pair.of(cru.g, bsn.e), cuf.pT);
      $$0.put(Pair.of(cru.g, bsn.d), cuf.pU);
      $$0.put(Pair.of(cru.g, bsn.c), cuf.pV);
      $$0.put(Pair.of(cru.e, bsn.f), cuf.pK);
      $$0.put(Pair.of(cru.e, bsn.e), cuf.pL);
      $$0.put(Pair.of(cru.e, bsn.d), cuf.pM);
      $$0.put(Pair.of(cru.e, bsn.c), cuf.pN);
      $$0.put(Pair.of(cru.f, bsn.f), cuf.oo);
   });
   private static final List<akj<cwj>> b = List.of(
      cwk.a, cwk.b, cwk.c, cwk.d, cwk.e, cwk.f, cwk.g, cwk.h, cwk.i, cwk.j, cwk.k, cwk.l, cwk.m, cwk.n, cwk.o, cwk.p, cwk.q, cwk.r
   );
   private static final List<akj<cwh>> c = List.of(cwi.a, cwi.b, cwi.c, cwi.d, cwi.e, cwi.f, cwi.g, cwi.h, cwi.i, cwi.j);
   private static final ToIntFunction<akj<cwj>> d = ac.g(b);
   private static final ToIntFunction<akj<cwh>> e = ac.g(c);

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((eq)$$0x.getSource(), ((eq)$$0x.getSource()).h()))
      );
   }

   private static int a(eq $$0, cmk $$1) {
      dcf $$2 = $$1.dQ();
      js<cwg> $$3 = js.a();
      jw<cwj> $$4 = $$2.H_().d(lr.aW);
      jw<cwh> $$5 = $$2.H_().d(lr.aV);
      $$4.t()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.t()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwg($$5.e($$4x), $$4.e($$3x))))
         );
      ja $$6 = $$1.dq().a($$1.cI(), 5);
      jw<crt> $$7 = $$0.v().d(lr.ay);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwg $$12 : $$3) {
         for (crt $$13 : $$7) {
            if ($$13 != cru.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               cij $$17 = new cij($$2, $$14, $$15, $$16);
               $$17.s(180.0F);
               $$17.f(true);

               for (bsn $$18 : bsn.values()) {
                  ctx $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuc $$20 = new cuc($$19);
                     $$20.b(kn.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crs) {
                        crs $$21 = (crs)$$19;
                        if ($$21.h().a(cru.f)) {
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
