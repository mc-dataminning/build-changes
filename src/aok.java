import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aok {
   private static final Map<Pair<jm<cse>, bsx>, cuj> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csf.b, bsx.f), cur.pC);
      $$0.put(Pair.of(csf.b, bsx.e), cur.pD);
      $$0.put(Pair.of(csf.b, bsx.d), cur.pE);
      $$0.put(Pair.of(csf.b, bsx.c), cur.pF);
      $$0.put(Pair.of(csf.c, bsx.f), cur.pG);
      $$0.put(Pair.of(csf.c, bsx.e), cur.pH);
      $$0.put(Pair.of(csf.c, bsx.d), cur.pI);
      $$0.put(Pair.of(csf.c, bsx.c), cur.pJ);
      $$0.put(Pair.of(csf.d, bsx.f), cur.pO);
      $$0.put(Pair.of(csf.d, bsx.e), cur.pP);
      $$0.put(Pair.of(csf.d, bsx.d), cur.pQ);
      $$0.put(Pair.of(csf.d, bsx.c), cur.pR);
      $$0.put(Pair.of(csf.g, bsx.f), cur.pS);
      $$0.put(Pair.of(csf.g, bsx.e), cur.pT);
      $$0.put(Pair.of(csf.g, bsx.d), cur.pU);
      $$0.put(Pair.of(csf.g, bsx.c), cur.pV);
      $$0.put(Pair.of(csf.e, bsx.f), cur.pK);
      $$0.put(Pair.of(csf.e, bsx.e), cur.pL);
      $$0.put(Pair.of(csf.e, bsx.d), cur.pM);
      $$0.put(Pair.of(csf.e, bsx.c), cur.pN);
      $$0.put(Pair.of(csf.f, bsx.f), cur.oo);
   });
   private static final List<akp<cwy>> b = List.of(
      cwz.a, cwz.b, cwz.c, cwz.d, cwz.e, cwz.f, cwz.g, cwz.h, cwz.i, cwz.j, cwz.k, cwz.l, cwz.m, cwz.n, cwz.o, cwz.p, cwz.q, cwz.r
   );
   private static final List<akp<cww>> c = List.of(cwx.a, cwx.b, cwx.c, cwx.d, cwx.e, cwx.f, cwx.g, cwx.h, cwx.i, cwx.j);
   private static final ToIntFunction<akp<cwy>> d = ad.g(b);
   private static final ToIntFunction<akp<cww>> e = ad.g(c);

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).h()))
      );
   }

   private static int a(et $$0, cmv $$1) {
      dcu $$2 = $$1.dQ();
      jv<cwv> $$3 = jv.a();
      jz<cwy> $$4 = $$2.H_().d(lu.aX);
      jz<cww> $$5 = $$2.H_().d(lu.aW);
      $$4.t()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.t()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwv($$5.e($$4x), $$4.e($$3x))))
         );
      jd $$6 = $$1.dq().a($$1.cI(), 5);
      jz<cse> $$7 = $$0.v().d(lu.az);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwv $$12 : $$3) {
         for (cse $$13 : $$7) {
            if ($$13 != csf.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               ciu $$17 = new ciu($$2, $$14, $$15, $$16);
               $$17.s(180.0F);
               $$17.g(true);

               for (bsx $$18 : bsx.values()) {
                  cuj $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuo $$20 = new cuo($$19);
                     $$20.b(kq.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csd) {
                        csd $$21 = (csd)$$19;
                        if ($$21.h().a(csf.f)) {
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

      $$0.a(() -> wy.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
