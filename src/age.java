import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class age {
   private static final Map<Pair<cdk, bfo>, cfu> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cdl.b, bfo.f), cgc.oO);
      $$0.put(Pair.of(cdl.b, bfo.e), cgc.oP);
      $$0.put(Pair.of(cdl.b, bfo.d), cgc.oQ);
      $$0.put(Pair.of(cdl.b, bfo.c), cgc.oR);
      $$0.put(Pair.of(cdl.c, bfo.f), cgc.oS);
      $$0.put(Pair.of(cdl.c, bfo.e), cgc.oT);
      $$0.put(Pair.of(cdl.c, bfo.d), cgc.oU);
      $$0.put(Pair.of(cdl.c, bfo.c), cgc.oV);
      $$0.put(Pair.of(cdl.d, bfo.f), cgc.pa);
      $$0.put(Pair.of(cdl.d, bfo.e), cgc.pb);
      $$0.put(Pair.of(cdl.d, bfo.d), cgc.pc);
      $$0.put(Pair.of(cdl.d, bfo.c), cgc.pd);
      $$0.put(Pair.of(cdl.g, bfo.f), cgc.pe);
      $$0.put(Pair.of(cdl.g, bfo.e), cgc.pf);
      $$0.put(Pair.of(cdl.g, bfo.d), cgc.pg);
      $$0.put(Pair.of(cdl.g, bfo.c), cgc.ph);
      $$0.put(Pair.of(cdl.e, bfo.f), cgc.oW);
      $$0.put(Pair.of(cdl.e, bfo.e), cgc.oX);
      $$0.put(Pair.of(cdl.e, bfo.d), cgc.oY);
      $$0.put(Pair.of(cdl.e, bfo.c), cgc.oZ);
      $$0.put(Pair.of(cdl.f, bfo.f), cgc.nC);
   });
   private static final List<acp<cie>> b = List.of(
      cif.a, cif.b, cif.c, cif.d, cif.e, cif.f, cif.g, cif.h, cif.i, cif.j, cif.k, cif.l, cif.m, cif.n, cif.o, cif.p
   );
   private static final List<acp<cic>> c = List.of(cid.a, cid.b, cid.c, cid.d, cid.e, cid.f, cid.g, cid.h, cid.i, cid.j);
   private static final ToIntFunction<acp<cie>> d = ac.e(b);
   private static final ToIntFunction<acp<cic>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, byo $$1) {
      cmm $$2 = $$1.dI();
      hn<cib> $$3 = hn.a();
      hr<cie> $$4 = $$2.B_().d(jc.aE);
      hr<cic> $$5 = $$2.B_().d(jc.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cib($$5.d($$4x), $$4.d($$3x))))
         );
      gu $$6 = $$1.di().a($$1.cB(), 5);
      int $$7 = cdl.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cib $$11 : $$3) {
         for (cdk $$12 : cdl.values()) {
            if ($$12 != cdl.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bux $$16 = new bux($$2, $$13, $$14, $$15);
               $$16.a_(180.0F);
               $$16.e(true);

               for (bfo $$17 : bfo.values()) {
                  cfu $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cfz $$19 = new cfz($$18);
                     cib.a($$2.B_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cdj) {
                        cdj $$20 = (cdj)$$18;
                        if ($$20.d() == cdl.f) {
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

      $$0.a(() -> sw.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
