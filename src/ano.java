import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ano {
   private static final Map<Pair<in<cpi>, bqh>, crn> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cpj.b, bqh.f), crv.pB);
      $$0.put(Pair.of(cpj.b, bqh.e), crv.pC);
      $$0.put(Pair.of(cpj.b, bqh.d), crv.pD);
      $$0.put(Pair.of(cpj.b, bqh.c), crv.pE);
      $$0.put(Pair.of(cpj.c, bqh.f), crv.pF);
      $$0.put(Pair.of(cpj.c, bqh.e), crv.pG);
      $$0.put(Pair.of(cpj.c, bqh.d), crv.pH);
      $$0.put(Pair.of(cpj.c, bqh.c), crv.pI);
      $$0.put(Pair.of(cpj.d, bqh.f), crv.pN);
      $$0.put(Pair.of(cpj.d, bqh.e), crv.pO);
      $$0.put(Pair.of(cpj.d, bqh.d), crv.pP);
      $$0.put(Pair.of(cpj.d, bqh.c), crv.pQ);
      $$0.put(Pair.of(cpj.g, bqh.f), crv.pR);
      $$0.put(Pair.of(cpj.g, bqh.e), crv.pS);
      $$0.put(Pair.of(cpj.g, bqh.d), crv.pT);
      $$0.put(Pair.of(cpj.g, bqh.c), crv.pU);
      $$0.put(Pair.of(cpj.e, bqh.f), crv.pJ);
      $$0.put(Pair.of(cpj.e, bqh.e), crv.pK);
      $$0.put(Pair.of(cpj.e, bqh.d), crv.pL);
      $$0.put(Pair.of(cpj.e, bqh.c), crv.pM);
      $$0.put(Pair.of(cpj.f, bqh.f), crv.on);
   });
   private static final List<aju<ctw>> b = List.of(
      ctx.a, ctx.b, ctx.c, ctx.d, ctx.e, ctx.f, ctx.g, ctx.h, ctx.i, ctx.j, ctx.k, ctx.l, ctx.m, ctx.n, ctx.o, ctx.p
   );
   private static final List<aju<ctu>> c = List.of(ctv.a, ctv.b, ctv.c, ctv.d, ctv.e, ctv.f, ctv.g, ctv.h, ctv.i, ctv.j);
   private static final ToIntFunction<aju<ctw>> d = ac.g(b);
   private static final ToIntFunction<aju<ctu>> e = ac.g(c);

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dv)$$0x.getSource(), ((dv)$$0x.getSource()).h()))
      );
   }

   private static int a(dv $$0, cka $$1) {
      czg $$2 = $$1.dM();
      iw<ctt> $$3 = iw.a();
      ja<ctw> $$4 = $$2.H_().d(ku.aM);
      ja<ctu> $$5 = $$2.H_().d(ku.aL);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ctt($$5.e($$4x), $$4.e($$3x))))
         );
      id $$6 = $$1.dm().a($$1.cE(), 5);
      ja<cpi> $$7 = $$0.v().d(ku.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (ctt $$12 : $$3) {
         for (cpi $$13 : $$7) {
            if ($$13 != cpj.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cga $$17 = new cga($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.e(true);

               for (bqh $$18 : bqh.values()) {
                  crn $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     crs $$20 = new crs($$19);
                     $$20.b(jr.B, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cph) {
                        cph $$21 = (cph)$$19;
                        if ($$21.h().a(cpj.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
                           $$17.n(true);
                           continue;
                        }
                     }

                     $$17.j(true);
                  }
               }

               $$2.b($$17);
               $$11++;
            }
         }

         $$10++;
      }

      $$0.a(() -> wi.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
