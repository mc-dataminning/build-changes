import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aow {
   private static final Map<Pair<jn<ctd>, btr>, cvg> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cte.b, btr.f), cvo.pD);
      $$0.put(Pair.of(cte.b, btr.e), cvo.pE);
      $$0.put(Pair.of(cte.b, btr.d), cvo.pF);
      $$0.put(Pair.of(cte.b, btr.c), cvo.pG);
      $$0.put(Pair.of(cte.c, btr.f), cvo.pH);
      $$0.put(Pair.of(cte.c, btr.e), cvo.pI);
      $$0.put(Pair.of(cte.c, btr.d), cvo.pJ);
      $$0.put(Pair.of(cte.c, btr.c), cvo.pK);
      $$0.put(Pair.of(cte.d, btr.f), cvo.pP);
      $$0.put(Pair.of(cte.d, btr.e), cvo.pQ);
      $$0.put(Pair.of(cte.d, btr.d), cvo.pR);
      $$0.put(Pair.of(cte.d, btr.c), cvo.pS);
      $$0.put(Pair.of(cte.g, btr.f), cvo.pT);
      $$0.put(Pair.of(cte.g, btr.e), cvo.pU);
      $$0.put(Pair.of(cte.g, btr.d), cvo.pV);
      $$0.put(Pair.of(cte.g, btr.c), cvo.pW);
      $$0.put(Pair.of(cte.e, btr.f), cvo.pL);
      $$0.put(Pair.of(cte.e, btr.e), cvo.pM);
      $$0.put(Pair.of(cte.e, btr.d), cvo.pN);
      $$0.put(Pair.of(cte.e, btr.c), cvo.pO);
      $$0.put(Pair.of(cte.f, btr.f), cvo.op);
   });
   private static final List<ala<cxt>> b = List.of(
      cxu.a, cxu.b, cxu.c, cxu.d, cxu.e, cxu.f, cxu.g, cxu.h, cxu.i, cxu.j, cxu.k, cxu.l, cxu.m, cxu.n, cxu.o, cxu.p, cxu.q, cxu.r
   );
   private static final List<ala<cxr>> c = List.of(cxs.a, cxs.b, cxs.c, cxs.d, cxs.e, cxs.f, cxs.g, cxs.h, cxs.i, cxs.j);
   private static final ToIntFunction<ala<cxt>> d = ad.g(b);
   private static final ToIntFunction<ala<cxr>> e = ad.g(c);

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).h()))
      );
   }

   private static int a(et $$0, cnp $$1) {
      dds $$2 = $$1.dS();
      jw<cxq> $$3 = jw.a();
      ka<cxt> $$4 = $$2.F_().d(lv.aX);
      ka<cxr> $$5 = $$2.F_().d(lv.aW);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cxq($$5.e($$4x), $$4.e($$3x))))
         );
      je $$6 = $$1.ds().a($$1.cL(), 5);
      ka<ctd> $$7 = $$0.v().d(lv.az);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cxq $$12 : $$3) {
         for (ctd $$13 : $$7) {
            if ($$13 != cte.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               cjo $$17 = new cjo($$2, $$14, $$15, $$16);
               $$17.v(180.0F);
               $$17.f(true);

               for (btr $$18 : btr.values()) {
                  cvg $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cvl $$20 = new cvl($$19);
                     $$20.b(kr.M, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof ctc) {
                        ctc $$21 = (ctc)$$19;
                        if ($$21.h().a(cte.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
                           $$17.p(true);
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

      $$0.a(() -> xd.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
