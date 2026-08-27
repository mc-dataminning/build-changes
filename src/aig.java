import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aig {
   private static final Map<Pair<cgh, bil>, cir> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgi.b, bil.f), ciz.oO);
      $$0.put(Pair.of(cgi.b, bil.e), ciz.oP);
      $$0.put(Pair.of(cgi.b, bil.d), ciz.oQ);
      $$0.put(Pair.of(cgi.b, bil.c), ciz.oR);
      $$0.put(Pair.of(cgi.c, bil.f), ciz.oS);
      $$0.put(Pair.of(cgi.c, bil.e), ciz.oT);
      $$0.put(Pair.of(cgi.c, bil.d), ciz.oU);
      $$0.put(Pair.of(cgi.c, bil.c), ciz.oV);
      $$0.put(Pair.of(cgi.d, bil.f), ciz.pa);
      $$0.put(Pair.of(cgi.d, bil.e), ciz.pb);
      $$0.put(Pair.of(cgi.d, bil.d), ciz.pc);
      $$0.put(Pair.of(cgi.d, bil.c), ciz.pd);
      $$0.put(Pair.of(cgi.g, bil.f), ciz.pe);
      $$0.put(Pair.of(cgi.g, bil.e), ciz.pf);
      $$0.put(Pair.of(cgi.g, bil.d), ciz.pg);
      $$0.put(Pair.of(cgi.g, bil.c), ciz.ph);
      $$0.put(Pair.of(cgi.e, bil.f), ciz.oW);
      $$0.put(Pair.of(cgi.e, bil.e), ciz.oX);
      $$0.put(Pair.of(cgi.e, bil.d), ciz.oY);
      $$0.put(Pair.of(cgi.e, bil.c), ciz.oZ);
      $$0.put(Pair.of(cgi.f, bil.f), ciz.nC);
   });
   private static final List<aeo<clb>> b = List.of(
      clc.a, clc.b, clc.c, clc.d, clc.e, clc.f, clc.g, clc.h, clc.i, clc.j, clc.k, clc.l, clc.m, clc.n, clc.o, clc.p
   );
   private static final List<aeo<ckz>> c = List.of(cla.a, cla.b, cla.c, cla.d, cla.e, cla.f, cla.g, cla.h, cla.i, cla.j);
   private static final ToIntFunction<aeo<clb>> d = ac.e(b);
   private static final ToIntFunction<aeo<ckz>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cbl $$1) {
      cpk $$2 = $$1.dK();
      ho<cky> $$3 = ho.a();
      hs<clb> $$4 = $$2.B_().d(jd.aE);
      hs<ckz> $$5 = $$2.B_().d(jd.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cky($$5.d($$4x), $$4.d($$3x))))
         );
      gv $$6 = $$1.dk().a($$1.cD(), 5);
      int $$7 = cgi.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cky $$11 : $$3) {
         for (cgh $$12 : cgi.values()) {
            if ($$12 != cgi.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bxu $$16 = new bxu($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bil $$17 : bil.values()) {
                  cir $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     ciw $$19 = new ciw($$18);
                     cky.a($$2.B_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgg) {
                        cgg $$20 = (cgg)$$18;
                        if ($$20.d() == cgi.f) {
                           $$16.b($$11.a().a().a($$11.b()).e().f(" ").b($$11.b().a().e()));
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

      $$0.a(() -> te.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
