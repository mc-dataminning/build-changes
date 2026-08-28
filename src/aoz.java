import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoz {
   private static final Map<Pair<ji<csf>, btb>, cuk> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csg.b, btb.f), cus.pC);
      $$0.put(Pair.of(csg.b, btb.e), cus.pD);
      $$0.put(Pair.of(csg.b, btb.d), cus.pE);
      $$0.put(Pair.of(csg.b, btb.c), cus.pF);
      $$0.put(Pair.of(csg.c, btb.f), cus.pG);
      $$0.put(Pair.of(csg.c, btb.e), cus.pH);
      $$0.put(Pair.of(csg.c, btb.d), cus.pI);
      $$0.put(Pair.of(csg.c, btb.c), cus.pJ);
      $$0.put(Pair.of(csg.d, btb.f), cus.pO);
      $$0.put(Pair.of(csg.d, btb.e), cus.pP);
      $$0.put(Pair.of(csg.d, btb.d), cus.pQ);
      $$0.put(Pair.of(csg.d, btb.c), cus.pR);
      $$0.put(Pair.of(csg.g, btb.f), cus.pS);
      $$0.put(Pair.of(csg.g, btb.e), cus.pT);
      $$0.put(Pair.of(csg.g, btb.d), cus.pU);
      $$0.put(Pair.of(csg.g, btb.c), cus.pV);
      $$0.put(Pair.of(csg.e, btb.f), cus.pK);
      $$0.put(Pair.of(csg.e, btb.e), cus.pL);
      $$0.put(Pair.of(csg.e, btb.d), cus.pM);
      $$0.put(Pair.of(csg.e, btb.c), cus.pN);
      $$0.put(Pair.of(csg.f, btb.f), cus.oo);
   });
   private static final List<ale<cww>> b = List.of(
      cwx.a, cwx.b, cwx.c, cwx.d, cwx.e, cwx.f, cwx.g, cwx.h, cwx.i, cwx.j, cwx.k, cwx.l, cwx.m, cwx.n, cwx.o, cwx.p, cwx.q, cwx.r
   );
   private static final List<ale<cwu>> c = List.of(cwv.a, cwv.b, cwv.c, cwv.d, cwv.e, cwv.f, cwv.g, cwv.h, cwv.i, cwv.j);
   private static final ToIntFunction<ale<cww>> d = ac.g(b);
   private static final ToIntFunction<ale<cwu>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cmx $$1) {
      dby $$2 = $$1.dP();
      jr<cwt> $$3 = jr.a();
      jv<cww> $$4 = $$2.H_().d(lq.aP);
      jv<cwu> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwt($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<csf> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwt $$12 : $$3) {
         for (csf $$13 : $$7) {
            if ($$13 != csg.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cix $$17 = new cix($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (btb $$18 : btb.values()) {
                  cuk $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cup $$20 = new cup($$19);
                     $$20.b(km.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cse) {
                        cse $$21 = (cse)$$19;
                        if ($$21.h().a(csg.f)) {
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
