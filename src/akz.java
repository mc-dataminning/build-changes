import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class akz {
   private static final Map<Pair<cki, blz>, cms> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ckj.b, blz.f), cna.pz);
      $$0.put(Pair.of(ckj.b, blz.e), cna.pA);
      $$0.put(Pair.of(ckj.b, blz.d), cna.pB);
      $$0.put(Pair.of(ckj.b, blz.c), cna.pC);
      $$0.put(Pair.of(ckj.c, blz.f), cna.pD);
      $$0.put(Pair.of(ckj.c, blz.e), cna.pE);
      $$0.put(Pair.of(ckj.c, blz.d), cna.pF);
      $$0.put(Pair.of(ckj.c, blz.c), cna.pG);
      $$0.put(Pair.of(ckj.d, blz.f), cna.pL);
      $$0.put(Pair.of(ckj.d, blz.e), cna.pM);
      $$0.put(Pair.of(ckj.d, blz.d), cna.pN);
      $$0.put(Pair.of(ckj.d, blz.c), cna.pO);
      $$0.put(Pair.of(ckj.g, blz.f), cna.pP);
      $$0.put(Pair.of(ckj.g, blz.e), cna.pQ);
      $$0.put(Pair.of(ckj.g, blz.d), cna.pR);
      $$0.put(Pair.of(ckj.g, blz.c), cna.pS);
      $$0.put(Pair.of(ckj.e, blz.f), cna.pH);
      $$0.put(Pair.of(ckj.e, blz.e), cna.pI);
      $$0.put(Pair.of(ckj.e, blz.d), cna.pJ);
      $$0.put(Pair.of(ckj.e, blz.c), cna.pK);
      $$0.put(Pair.of(ckj.f, blz.f), cna.on);
   });
   private static final List<ahf<cpd>> b = List.of(
      cpe.a, cpe.b, cpe.c, cpe.d, cpe.e, cpe.f, cpe.g, cpe.h, cpe.i, cpe.j, cpe.k, cpe.l, cpe.m, cpe.n, cpe.o, cpe.p
   );
   private static final List<ahf<cpb>> c = List.of(cpc.a, cpc.b, cpc.c, cpc.d, cpc.e, cpc.f, cpc.g, cpc.h, cpc.i, cpc.j);
   private static final ToIntFunction<ahf<cpd>> d = ac.e(b);
   private static final ToIntFunction<ahf<cpb>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cfh $$1) {
      cto $$2 = $$1.dM();
      iq<cpa> $$3 = iq.a();
      it<cpd> $$4 = $$2.I_().d(ke.aJ);
      it<cpb> $$5 = $$2.I_().d(ke.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cpa($$5.d($$4x), $$4.d($$3x))))
         );
      hx $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = ckj.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cpa $$11 : $$3) {
         for (cki $$12 : ckj.values()) {
            if ($$12 != ckj.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cbj $$16 = new cbj($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (blz $$17 : blz.values()) {
                  cms $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cmx $$19 = new cmx($$18);
                     cpa.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof ckh) {
                        ckh $$20 = (ckh)$$18;
                        if ($$20.d() == ckj.f) {
                           $$16.b($$11.a().a().a($$11.b()).f().f(" ").b($$11.b().a().e()));
                           $$16.n(true);
                           continue;
                        }
                     }

                     $$16.j(true);
                  }
               }

               $$2.b($$16);
               $$10++;
            }
         }

         $$9++;
      }

      $$0.a(() -> vf.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
