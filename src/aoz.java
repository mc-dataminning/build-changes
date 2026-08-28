import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoz {
   private static final Map<Pair<ji<csg>, btc>, cul> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csh.b, btc.f), cut.pC);
      $$0.put(Pair.of(csh.b, btc.e), cut.pD);
      $$0.put(Pair.of(csh.b, btc.d), cut.pE);
      $$0.put(Pair.of(csh.b, btc.c), cut.pF);
      $$0.put(Pair.of(csh.c, btc.f), cut.pG);
      $$0.put(Pair.of(csh.c, btc.e), cut.pH);
      $$0.put(Pair.of(csh.c, btc.d), cut.pI);
      $$0.put(Pair.of(csh.c, btc.c), cut.pJ);
      $$0.put(Pair.of(csh.d, btc.f), cut.pO);
      $$0.put(Pair.of(csh.d, btc.e), cut.pP);
      $$0.put(Pair.of(csh.d, btc.d), cut.pQ);
      $$0.put(Pair.of(csh.d, btc.c), cut.pR);
      $$0.put(Pair.of(csh.g, btc.f), cut.pS);
      $$0.put(Pair.of(csh.g, btc.e), cut.pT);
      $$0.put(Pair.of(csh.g, btc.d), cut.pU);
      $$0.put(Pair.of(csh.g, btc.c), cut.pV);
      $$0.put(Pair.of(csh.e, btc.f), cut.pK);
      $$0.put(Pair.of(csh.e, btc.e), cut.pL);
      $$0.put(Pair.of(csh.e, btc.d), cut.pM);
      $$0.put(Pair.of(csh.e, btc.c), cut.pN);
      $$0.put(Pair.of(csh.f, btc.f), cut.oo);
   });
   private static final List<ale<cwx>> b = List.of(
      cwy.a, cwy.b, cwy.c, cwy.d, cwy.e, cwy.f, cwy.g, cwy.h, cwy.i, cwy.j, cwy.k, cwy.l, cwy.m, cwy.n, cwy.o, cwy.p, cwy.q, cwy.r
   );
   private static final List<ale<cwv>> c = List.of(cww.a, cww.b, cww.c, cww.d, cww.e, cww.f, cww.g, cww.h, cww.i, cww.j);
   private static final ToIntFunction<ale<cwx>> d = ac.g(b);
   private static final ToIntFunction<ale<cwv>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cmy $$1) {
      dbz $$2 = $$1.dP();
      jr<cwu> $$3 = jr.a();
      jv<cwx> $$4 = $$2.H_().d(lq.aP);
      jv<cwv> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwu($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<csg> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwu $$12 : $$3) {
         for (csg $$13 : $$7) {
            if ($$13 != csh.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               ciy $$17 = new ciy($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (btc $$18 : btc.values()) {
                  cul $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuq $$20 = new cuq($$19);
                     $$20.b(km.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csf) {
                        csf $$21 = (csf)$$19;
                        if ($$21.h().a(csh.f)) {
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

      $$0.a(() -> xp.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
