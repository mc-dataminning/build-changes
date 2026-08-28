import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoy {
   private static final Map<Pair<ji<cse>, bta>, cuj> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csf.b, bta.f), cur.pC);
      $$0.put(Pair.of(csf.b, bta.e), cur.pD);
      $$0.put(Pair.of(csf.b, bta.d), cur.pE);
      $$0.put(Pair.of(csf.b, bta.c), cur.pF);
      $$0.put(Pair.of(csf.c, bta.f), cur.pG);
      $$0.put(Pair.of(csf.c, bta.e), cur.pH);
      $$0.put(Pair.of(csf.c, bta.d), cur.pI);
      $$0.put(Pair.of(csf.c, bta.c), cur.pJ);
      $$0.put(Pair.of(csf.d, bta.f), cur.pO);
      $$0.put(Pair.of(csf.d, bta.e), cur.pP);
      $$0.put(Pair.of(csf.d, bta.d), cur.pQ);
      $$0.put(Pair.of(csf.d, bta.c), cur.pR);
      $$0.put(Pair.of(csf.g, bta.f), cur.pS);
      $$0.put(Pair.of(csf.g, bta.e), cur.pT);
      $$0.put(Pair.of(csf.g, bta.d), cur.pU);
      $$0.put(Pair.of(csf.g, bta.c), cur.pV);
      $$0.put(Pair.of(csf.e, bta.f), cur.pK);
      $$0.put(Pair.of(csf.e, bta.e), cur.pL);
      $$0.put(Pair.of(csf.e, bta.d), cur.pM);
      $$0.put(Pair.of(csf.e, bta.c), cur.pN);
      $$0.put(Pair.of(csf.f, bta.f), cur.oo);
   });
   private static final List<ald<cwv>> b = List.of(
      cww.a, cww.b, cww.c, cww.d, cww.e, cww.f, cww.g, cww.h, cww.i, cww.j, cww.k, cww.l, cww.m, cww.n, cww.o, cww.p, cww.q, cww.r
   );
   private static final List<ald<cwt>> c = List.of(cwu.a, cwu.b, cwu.c, cwu.d, cwu.e, cwu.f, cwu.g, cwu.h, cwu.i, cwu.j);
   private static final ToIntFunction<ald<cwv>> d = ac.g(b);
   private static final ToIntFunction<ald<cwt>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cmw $$1) {
      dbx $$2 = $$1.dP();
      jr<cws> $$3 = jr.a();
      jv<cwv> $$4 = $$2.H_().d(lq.aP);
      jv<cwt> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cws($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<cse> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cws $$12 : $$3) {
         for (cse $$13 : $$7) {
            if ($$13 != csf.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               ciw $$17 = new ciw($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bta $$18 : bta.values()) {
                  cuj $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuo $$20 = new cuo($$19);
                     $$20.b(km.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csd) {
                        csd $$21 = (csd)$$19;
                        if ($$21.h().a(csf.f)) {
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

      $$0.a(() -> xo.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
