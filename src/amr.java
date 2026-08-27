import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class amr {
   private static final Map<Pair<cmo, bnx>, coy> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cmp.b, bnx.f), cpg.pB);
      $$0.put(Pair.of(cmp.b, bnx.e), cpg.pC);
      $$0.put(Pair.of(cmp.b, bnx.d), cpg.pD);
      $$0.put(Pair.of(cmp.b, bnx.c), cpg.pE);
      $$0.put(Pair.of(cmp.c, bnx.f), cpg.pF);
      $$0.put(Pair.of(cmp.c, bnx.e), cpg.pG);
      $$0.put(Pair.of(cmp.c, bnx.d), cpg.pH);
      $$0.put(Pair.of(cmp.c, bnx.c), cpg.pI);
      $$0.put(Pair.of(cmp.d, bnx.f), cpg.pN);
      $$0.put(Pair.of(cmp.d, bnx.e), cpg.pO);
      $$0.put(Pair.of(cmp.d, bnx.d), cpg.pP);
      $$0.put(Pair.of(cmp.d, bnx.c), cpg.pQ);
      $$0.put(Pair.of(cmp.g, bnx.f), cpg.pR);
      $$0.put(Pair.of(cmp.g, bnx.e), cpg.pS);
      $$0.put(Pair.of(cmp.g, bnx.d), cpg.pT);
      $$0.put(Pair.of(cmp.g, bnx.c), cpg.pU);
      $$0.put(Pair.of(cmp.e, bnx.f), cpg.pJ);
      $$0.put(Pair.of(cmp.e, bnx.e), cpg.pK);
      $$0.put(Pair.of(cmp.e, bnx.d), cpg.pL);
      $$0.put(Pair.of(cmp.e, bnx.c), cpg.pM);
      $$0.put(Pair.of(cmp.f, bnx.f), cpg.on);
   });
   private static final List<aix<crh>> b = List.of(
      cri.a, cri.b, cri.c, cri.d, cri.e, cri.f, cri.g, cri.h, cri.i, cri.j, cri.k, cri.l, cri.m, cri.n, cri.o, cri.p
   );
   private static final List<aix<crf>> c = List.of(crg.a, crg.b, crg.c, crg.d, crg.e, crg.f, crg.g, crg.h, crg.i, crg.j);
   private static final ToIntFunction<aix<crh>> d = ac.e(b);
   private static final ToIntFunction<aix<crf>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, chl $$1) {
      cvr $$2 = $$1.dM();
      is<cre> $$3 = is.a();
      iv<crh> $$4 = $$2.I_().d(kg.aJ);
      iv<crf> $$5 = $$2.I_().d(kg.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cre($$5.e($$4x), $$4.e($$3x))))
         );
      hz $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = cmp.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cre $$11 : $$3) {
         for (cmo $$12 : cmp.values()) {
            if ($$12 != cmp.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cdm $$16 = new cdm($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bnx $$17 : bnx.values()) {
                  coy $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cpd $$19 = new cpd($$18);
                     cre.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cmn) {
                        cmn $$20 = (cmn)$$18;
                        if ($$20.d() == cmp.f) {
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

      $$0.a(() -> vq.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
