import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class akv {
   private static final Map<Pair<ckc, blu>, cmm> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ckd.b, blu.f), cmu.pz);
      $$0.put(Pair.of(ckd.b, blu.e), cmu.pA);
      $$0.put(Pair.of(ckd.b, blu.d), cmu.pB);
      $$0.put(Pair.of(ckd.b, blu.c), cmu.pC);
      $$0.put(Pair.of(ckd.c, blu.f), cmu.pD);
      $$0.put(Pair.of(ckd.c, blu.e), cmu.pE);
      $$0.put(Pair.of(ckd.c, blu.d), cmu.pF);
      $$0.put(Pair.of(ckd.c, blu.c), cmu.pG);
      $$0.put(Pair.of(ckd.d, blu.f), cmu.pL);
      $$0.put(Pair.of(ckd.d, blu.e), cmu.pM);
      $$0.put(Pair.of(ckd.d, blu.d), cmu.pN);
      $$0.put(Pair.of(ckd.d, blu.c), cmu.pO);
      $$0.put(Pair.of(ckd.g, blu.f), cmu.pP);
      $$0.put(Pair.of(ckd.g, blu.e), cmu.pQ);
      $$0.put(Pair.of(ckd.g, blu.d), cmu.pR);
      $$0.put(Pair.of(ckd.g, blu.c), cmu.pS);
      $$0.put(Pair.of(ckd.e, blu.f), cmu.pH);
      $$0.put(Pair.of(ckd.e, blu.e), cmu.pI);
      $$0.put(Pair.of(ckd.e, blu.d), cmu.pJ);
      $$0.put(Pair.of(ckd.e, blu.c), cmu.pK);
      $$0.put(Pair.of(ckd.f, blu.f), cmu.on);
   });
   private static final List<ahc<cox>> b = List.of(
      coy.a, coy.b, coy.c, coy.d, coy.e, coy.f, coy.g, coy.h, coy.i, coy.j, coy.k, coy.l, coy.m, coy.n, coy.o, coy.p
   );
   private static final List<ahc<cov>> c = List.of(cow.a, cow.b, cow.c, cow.d, cow.e, cow.f, cow.g, cow.h, cow.i, cow.j);
   private static final ToIntFunction<ahc<cox>> d = ac.e(b);
   private static final ToIntFunction<ahc<cov>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cfb $$1) {
      cti $$2 = $$1.dM();
      iq<cou> $$3 = iq.a();
      it<cox> $$4 = $$2.I_().d(ke.aJ);
      it<cov> $$5 = $$2.I_().d(ke.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cou($$5.d($$4x), $$4.d($$3x))))
         );
      hx $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = ckd.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cou $$11 : $$3) {
         for (ckc $$12 : ckd.values()) {
            if ($$12 != ckd.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cbe $$16 = new cbe($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (blu $$17 : blu.values()) {
                  cmm $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cmr $$19 = new cmr($$18);
                     cou.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof ckb) {
                        ckb $$20 = (ckb)$$18;
                        if ($$20.d() == ckd.f) {
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

      $$0.a(() -> vd.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
