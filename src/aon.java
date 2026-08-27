import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aon {
   private static final Map<Pair<ja<cru>, bsc>, cuc> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(crv.b, bsc.f), cuk.qV);
      $$0.put(Pair.of(crv.b, bsc.e), cuk.qW);
      $$0.put(Pair.of(crv.b, bsc.d), cuk.qX);
      $$0.put(Pair.of(crv.b, bsc.c), cuk.qY);
      $$0.put(Pair.of(crv.c, bsc.f), cuk.qZ);
      $$0.put(Pair.of(crv.c, bsc.e), cuk.ra);
      $$0.put(Pair.of(crv.c, bsc.d), cuk.rb);
      $$0.put(Pair.of(crv.c, bsc.c), cuk.rc);
      $$0.put(Pair.of(crv.d, bsc.f), cuk.rh);
      $$0.put(Pair.of(crv.d, bsc.e), cuk.ri);
      $$0.put(Pair.of(crv.d, bsc.d), cuk.rj);
      $$0.put(Pair.of(crv.d, bsc.c), cuk.rk);
      $$0.put(Pair.of(crv.g, bsc.f), cuk.rl);
      $$0.put(Pair.of(crv.g, bsc.e), cuk.rm);
      $$0.put(Pair.of(crv.g, bsc.d), cuk.rn);
      $$0.put(Pair.of(crv.g, bsc.c), cuk.ro);
      $$0.put(Pair.of(crv.e, bsc.f), cuk.rd);
      $$0.put(Pair.of(crv.e, bsc.e), cuk.re);
      $$0.put(Pair.of(crv.e, bsc.d), cuk.rf);
      $$0.put(Pair.of(crv.e, bsc.c), cuk.rg);
      $$0.put(Pair.of(crv.f, bsc.f), cuk.pE);
   });
   private static final List<aks<cwx>> b = List.of(
      cwy.a, cwy.b, cwy.c, cwy.d, cwy.e, cwy.f, cwy.g, cwy.h, cwy.i, cwy.j, cwy.k, cwy.l, cwy.m, cwy.n, cwy.o, cwy.p, cwy.q, cwy.r
   );
   private static final List<aks<cwv>> c = List.of(cww.a, cww.b, cww.c, cww.d, cww.e, cww.f, cww.g, cww.h, cww.i, cww.j);
   private static final ToIntFunction<aks<cwx>> d = ad.g(b);
   private static final ToIntFunction<aks<cwv>> e = ad.g(c);

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((eh)$$0x.getSource(), ((eh)$$0x.getSource()).h()))
      );
   }

   private static int a(eh $$0, cly $$1) {
      dca $$2 = $$1.dU();
      jj<cwu> $$3 = jj.a();
      jn<cwx> $$4 = $$2.I_().d(li.aP);
      jn<cwv> $$5 = $$2.I_().d(li.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwu($$5.e($$4x), $$4.e($$3x))))
         );
      ir $$6 = $$1.du().a($$1.cM(), 5);
      jn<cru> $$7 = $$0.v().d(li.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwu $$12 : $$3) {
         for (cru $$13 : $$7) {
            if ($$13 != crv.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               chw $$17 = new chw($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bsc $$18 : bsc.values()) {
                  cuc $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuh $$20 = new cuh($$19);
                     $$20.b(ke.I, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crt) {
                        crt $$21 = (crt)$$19;
                        if ($$21.h().a(crv.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").a($$12.b().a().e()));
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

      $$0.a(() -> xe.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
