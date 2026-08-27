import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class anm {
   private static final Map<Pair<il<coz>, bqc>, cre> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cpa.b, bqc.f), crm.pB);
      $$0.put(Pair.of(cpa.b, bqc.e), crm.pC);
      $$0.put(Pair.of(cpa.b, bqc.d), crm.pD);
      $$0.put(Pair.of(cpa.b, bqc.c), crm.pE);
      $$0.put(Pair.of(cpa.c, bqc.f), crm.pF);
      $$0.put(Pair.of(cpa.c, bqc.e), crm.pG);
      $$0.put(Pair.of(cpa.c, bqc.d), crm.pH);
      $$0.put(Pair.of(cpa.c, bqc.c), crm.pI);
      $$0.put(Pair.of(cpa.d, bqc.f), crm.pN);
      $$0.put(Pair.of(cpa.d, bqc.e), crm.pO);
      $$0.put(Pair.of(cpa.d, bqc.d), crm.pP);
      $$0.put(Pair.of(cpa.d, bqc.c), crm.pQ);
      $$0.put(Pair.of(cpa.g, bqc.f), crm.pR);
      $$0.put(Pair.of(cpa.g, bqc.e), crm.pS);
      $$0.put(Pair.of(cpa.g, bqc.d), crm.pT);
      $$0.put(Pair.of(cpa.g, bqc.c), crm.pU);
      $$0.put(Pair.of(cpa.e, bqc.f), crm.pJ);
      $$0.put(Pair.of(cpa.e, bqc.e), crm.pK);
      $$0.put(Pair.of(cpa.e, bqc.d), crm.pL);
      $$0.put(Pair.of(cpa.e, bqc.c), crm.pM);
      $$0.put(Pair.of(cpa.f, bqc.f), crm.on);
   });
   private static final List<ajs<ctn>> b = List.of(
      cto.a, cto.b, cto.c, cto.d, cto.e, cto.f, cto.g, cto.h, cto.i, cto.j, cto.k, cto.l, cto.m, cto.n, cto.o, cto.p
   );
   private static final List<ajs<ctl>> c = List.of(ctm.a, ctm.b, ctm.c, ctm.d, ctm.e, ctm.f, ctm.g, ctm.h, ctm.i, ctm.j);
   private static final ToIntFunction<ajs<ctn>> d = ac.g(b);
   private static final ToIntFunction<ajs<ctl>> e = ac.g(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, cjt $$1) {
      cyx $$2 = $$1.dM();
      iu<ctk> $$3 = iu.a();
      iy<ctn> $$4 = $$2.H_().d(ks.aL);
      iy<ctl> $$5 = $$2.H_().d(ks.aK);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ctk($$5.e($$4x), $$4.e($$3x))))
         );
      ib $$6 = $$1.dm().a($$1.cE(), 5);
      iy<coz> $$7 = $$0.v().d(ks.at);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (ctk $$12 : $$3) {
         for (coz $$13 : $$7) {
            if ($$13 != cpa.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cft $$17 = new cft($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.e(true);

               for (bqc $$18 : bqc.values()) {
                  cre $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     crj $$20 = new crj($$19);
                     $$20.b(jp.B, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof coy) {
                        coy $$21 = (coy)$$19;
                        if ($$21.h().a(cpa.f)) {
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

      $$0.a(() -> wg.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
