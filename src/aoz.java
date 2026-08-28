import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoz {
   private static final Map<Pair<ji<csh>, btd>, cum> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csi.b, btd.f), cuu.pC);
      $$0.put(Pair.of(csi.b, btd.e), cuu.pD);
      $$0.put(Pair.of(csi.b, btd.d), cuu.pE);
      $$0.put(Pair.of(csi.b, btd.c), cuu.pF);
      $$0.put(Pair.of(csi.c, btd.f), cuu.pG);
      $$0.put(Pair.of(csi.c, btd.e), cuu.pH);
      $$0.put(Pair.of(csi.c, btd.d), cuu.pI);
      $$0.put(Pair.of(csi.c, btd.c), cuu.pJ);
      $$0.put(Pair.of(csi.d, btd.f), cuu.pO);
      $$0.put(Pair.of(csi.d, btd.e), cuu.pP);
      $$0.put(Pair.of(csi.d, btd.d), cuu.pQ);
      $$0.put(Pair.of(csi.d, btd.c), cuu.pR);
      $$0.put(Pair.of(csi.g, btd.f), cuu.pS);
      $$0.put(Pair.of(csi.g, btd.e), cuu.pT);
      $$0.put(Pair.of(csi.g, btd.d), cuu.pU);
      $$0.put(Pair.of(csi.g, btd.c), cuu.pV);
      $$0.put(Pair.of(csi.e, btd.f), cuu.pK);
      $$0.put(Pair.of(csi.e, btd.e), cuu.pL);
      $$0.put(Pair.of(csi.e, btd.d), cuu.pM);
      $$0.put(Pair.of(csi.e, btd.c), cuu.pN);
      $$0.put(Pair.of(csi.f, btd.f), cuu.oo);
   });
   private static final List<ale<cwy>> b = List.of(
      cwz.a, cwz.b, cwz.c, cwz.d, cwz.e, cwz.f, cwz.g, cwz.h, cwz.i, cwz.j, cwz.k, cwz.l, cwz.m, cwz.n, cwz.o, cwz.p, cwz.q, cwz.r
   );
   private static final List<ale<cww>> c = List.of(cwx.a, cwx.b, cwx.c, cwx.d, cwx.e, cwx.f, cwx.g, cwx.h, cwx.i, cwx.j);
   private static final ToIntFunction<ale<cwy>> d = ac.g(b);
   private static final ToIntFunction<ale<cww>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cmz $$1) {
      dca $$2 = $$1.dP();
      jr<cwv> $$3 = jr.a();
      jv<cwy> $$4 = $$2.H_().d(lq.aP);
      jv<cww> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwv($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<csh> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwv $$12 : $$3) {
         for (csh $$13 : $$7) {
            if ($$13 != csi.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               ciz $$17 = new ciz($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (btd $$18 : btd.values()) {
                  cum $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cur $$20 = new cur($$19);
                     $$20.b(km.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csg) {
                        csg $$21 = (csg)$$19;
                        if ($$21.h().a(csi.f)) {
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
