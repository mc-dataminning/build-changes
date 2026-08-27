import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ala {
   private static final Map<Pair<cks, bmd>, cnb> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ckt.b, bmd.f), cnj.pB);
      $$0.put(Pair.of(ckt.b, bmd.e), cnj.pC);
      $$0.put(Pair.of(ckt.b, bmd.d), cnj.pD);
      $$0.put(Pair.of(ckt.b, bmd.c), cnj.pE);
      $$0.put(Pair.of(ckt.c, bmd.f), cnj.pF);
      $$0.put(Pair.of(ckt.c, bmd.e), cnj.pG);
      $$0.put(Pair.of(ckt.c, bmd.d), cnj.pH);
      $$0.put(Pair.of(ckt.c, bmd.c), cnj.pI);
      $$0.put(Pair.of(ckt.d, bmd.f), cnj.pN);
      $$0.put(Pair.of(ckt.d, bmd.e), cnj.pO);
      $$0.put(Pair.of(ckt.d, bmd.d), cnj.pP);
      $$0.put(Pair.of(ckt.d, bmd.c), cnj.pQ);
      $$0.put(Pair.of(ckt.g, bmd.f), cnj.pR);
      $$0.put(Pair.of(ckt.g, bmd.e), cnj.pS);
      $$0.put(Pair.of(ckt.g, bmd.d), cnj.pT);
      $$0.put(Pair.of(ckt.g, bmd.c), cnj.pU);
      $$0.put(Pair.of(ckt.e, bmd.f), cnj.pJ);
      $$0.put(Pair.of(ckt.e, bmd.e), cnj.pK);
      $$0.put(Pair.of(ckt.e, bmd.d), cnj.pL);
      $$0.put(Pair.of(ckt.e, bmd.c), cnj.pM);
      $$0.put(Pair.of(ckt.f, bmd.f), cnj.on);
   });
   private static final List<ahg<cpm>> b = List.of(
      cpn.a, cpn.b, cpn.c, cpn.d, cpn.e, cpn.f, cpn.g, cpn.h, cpn.i, cpn.j, cpn.k, cpn.l, cpn.m, cpn.n, cpn.o, cpn.p
   );
   private static final List<ahg<cpk>> c = List.of(cpl.a, cpl.b, cpl.c, cpl.d, cpl.e, cpl.f, cpl.g, cpl.h, cpl.i, cpl.j);
   private static final ToIntFunction<ahg<cpm>> d = ac.e(b);
   private static final ToIntFunction<ahg<cpk>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cfq $$1) {
      ctx $$2 = $$1.dL();
      iq<cpj> $$3 = iq.a();
      it<cpm> $$4 = $$2.I_().d(ke.aJ);
      it<cpk> $$5 = $$2.I_().d(ke.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cpj($$5.d($$4x), $$4.d($$3x))))
         );
      hx $$6 = $$1.dl().a($$1.cE(), 5);
      int $$7 = ckt.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cpj $$11 : $$3) {
         for (cks $$12 : ckt.values()) {
            if ($$12 != ckt.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cbr $$16 = new cbr($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bmd $$17 : bmd.values()) {
                  cnb $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cng $$19 = new cng($$18);
                     cpj.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof ckr) {
                        ckr $$20 = (ckr)$$18;
                        if ($$20.d() == ckt.f) {
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

      $$0.a(() -> vg.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
