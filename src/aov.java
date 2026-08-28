import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aov {
   private static final Map<Pair<ji<csa>, bsw>, cuf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csb.b, bsw.f), cun.pC);
      $$0.put(Pair.of(csb.b, bsw.e), cun.pD);
      $$0.put(Pair.of(csb.b, bsw.d), cun.pE);
      $$0.put(Pair.of(csb.b, bsw.c), cun.pF);
      $$0.put(Pair.of(csb.c, bsw.f), cun.pG);
      $$0.put(Pair.of(csb.c, bsw.e), cun.pH);
      $$0.put(Pair.of(csb.c, bsw.d), cun.pI);
      $$0.put(Pair.of(csb.c, bsw.c), cun.pJ);
      $$0.put(Pair.of(csb.d, bsw.f), cun.pO);
      $$0.put(Pair.of(csb.d, bsw.e), cun.pP);
      $$0.put(Pair.of(csb.d, bsw.d), cun.pQ);
      $$0.put(Pair.of(csb.d, bsw.c), cun.pR);
      $$0.put(Pair.of(csb.g, bsw.f), cun.pS);
      $$0.put(Pair.of(csb.g, bsw.e), cun.pT);
      $$0.put(Pair.of(csb.g, bsw.d), cun.pU);
      $$0.put(Pair.of(csb.g, bsw.c), cun.pV);
      $$0.put(Pair.of(csb.e, bsw.f), cun.pK);
      $$0.put(Pair.of(csb.e, bsw.e), cun.pL);
      $$0.put(Pair.of(csb.e, bsw.d), cun.pM);
      $$0.put(Pair.of(csb.e, bsw.c), cun.pN);
      $$0.put(Pair.of(csb.f, bsw.f), cun.oo);
   });
   private static final List<ala<cwr>> b = List.of(
      cws.a, cws.b, cws.c, cws.d, cws.e, cws.f, cws.g, cws.h, cws.i, cws.j, cws.k, cws.l, cws.m, cws.n, cws.o, cws.p, cws.q, cws.r
   );
   private static final List<ala<cwp>> c = List.of(cwq.a, cwq.b, cwq.c, cwq.d, cwq.e, cwq.f, cwq.g, cwq.h, cwq.i, cwq.j);
   private static final ToIntFunction<ala<cwr>> d = ac.g(b);
   private static final ToIntFunction<ala<cwp>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cms $$1) {
      dbt $$2 = $$1.dP();
      jr<cwo> $$3 = jr.a();
      jv<cwr> $$4 = $$2.H_().d(lq.aP);
      jv<cwp> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwo($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<csa> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwo $$12 : $$3) {
         for (csa $$13 : $$7) {
            if ($$13 != csb.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cis $$17 = new cis($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bsw $$18 : bsw.values()) {
                  cuf $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuk $$20 = new cuk($$19);
                     $$20.b(km.J, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crz) {
                        crz $$21 = (crz)$$19;
                        if ($$21.h().a(csb.f)) {
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

      $$0.a(() -> xl.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
