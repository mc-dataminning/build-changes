import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoy {
   private static final Map<Pair<ji<csd>, bsz>, cui> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cse.b, bsz.f), cuq.pC);
      $$0.put(Pair.of(cse.b, bsz.e), cuq.pD);
      $$0.put(Pair.of(cse.b, bsz.d), cuq.pE);
      $$0.put(Pair.of(cse.b, bsz.c), cuq.pF);
      $$0.put(Pair.of(cse.c, bsz.f), cuq.pG);
      $$0.put(Pair.of(cse.c, bsz.e), cuq.pH);
      $$0.put(Pair.of(cse.c, bsz.d), cuq.pI);
      $$0.put(Pair.of(cse.c, bsz.c), cuq.pJ);
      $$0.put(Pair.of(cse.d, bsz.f), cuq.pO);
      $$0.put(Pair.of(cse.d, bsz.e), cuq.pP);
      $$0.put(Pair.of(cse.d, bsz.d), cuq.pQ);
      $$0.put(Pair.of(cse.d, bsz.c), cuq.pR);
      $$0.put(Pair.of(cse.g, bsz.f), cuq.pS);
      $$0.put(Pair.of(cse.g, bsz.e), cuq.pT);
      $$0.put(Pair.of(cse.g, bsz.d), cuq.pU);
      $$0.put(Pair.of(cse.g, bsz.c), cuq.pV);
      $$0.put(Pair.of(cse.e, bsz.f), cuq.pK);
      $$0.put(Pair.of(cse.e, bsz.e), cuq.pL);
      $$0.put(Pair.of(cse.e, bsz.d), cuq.pM);
      $$0.put(Pair.of(cse.e, bsz.c), cuq.pN);
      $$0.put(Pair.of(cse.f, bsz.f), cuq.oo);
   });
   private static final List<ald<cwu>> b = List.of(
      cwv.a, cwv.b, cwv.c, cwv.d, cwv.e, cwv.f, cwv.g, cwv.h, cwv.i, cwv.j, cwv.k, cwv.l, cwv.m, cwv.n, cwv.o, cwv.p, cwv.q, cwv.r
   );
   private static final List<ald<cws>> c = List.of(cwt.a, cwt.b, cwt.c, cwt.d, cwt.e, cwt.f, cwt.g, cwt.h, cwt.i, cwt.j);
   private static final ToIntFunction<ald<cwu>> d = ac.g(b);
   private static final ToIntFunction<ald<cws>> e = ac.g(c);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ep)$$0x.getSource(), ((ep)$$0x.getSource()).h()))
      );
   }

   private static int a(ep $$0, cmv $$1) {
      dbw $$2 = $$1.dP();
      jr<cwr> $$3 = jr.a();
      jv<cwu> $$4 = $$2.H_().d(lq.aP);
      jv<cws> $$5 = $$2.H_().d(lq.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwr($$5.e($$4x), $$4.e($$3x))))
         );
      iz $$6 = $$1.dp().a($$1.cH(), 5);
      jv<csd> $$7 = $$0.v().d(lq.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwr $$12 : $$3) {
         for (csd $$13 : $$7) {
            if ($$13 != cse.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               civ $$17 = new civ($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bsz $$18 : bsz.values()) {
                  cui $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cun $$20 = new cun($$19);
                     $$20.b(km.J, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csc) {
                        csc $$21 = (csc)$$19;
                        if ($$21.h().a(cse.f)) {
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
