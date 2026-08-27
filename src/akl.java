import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class akl {
   private static final Map<Pair<cjs, blk>, cmc> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cjt.b, blk.f), cmk.pz);
      $$0.put(Pair.of(cjt.b, blk.e), cmk.pA);
      $$0.put(Pair.of(cjt.b, blk.d), cmk.pB);
      $$0.put(Pair.of(cjt.b, blk.c), cmk.pC);
      $$0.put(Pair.of(cjt.c, blk.f), cmk.pD);
      $$0.put(Pair.of(cjt.c, blk.e), cmk.pE);
      $$0.put(Pair.of(cjt.c, blk.d), cmk.pF);
      $$0.put(Pair.of(cjt.c, blk.c), cmk.pG);
      $$0.put(Pair.of(cjt.d, blk.f), cmk.pL);
      $$0.put(Pair.of(cjt.d, blk.e), cmk.pM);
      $$0.put(Pair.of(cjt.d, blk.d), cmk.pN);
      $$0.put(Pair.of(cjt.d, blk.c), cmk.pO);
      $$0.put(Pair.of(cjt.g, blk.f), cmk.pP);
      $$0.put(Pair.of(cjt.g, blk.e), cmk.pQ);
      $$0.put(Pair.of(cjt.g, blk.d), cmk.pR);
      $$0.put(Pair.of(cjt.g, blk.c), cmk.pS);
      $$0.put(Pair.of(cjt.e, blk.f), cmk.pH);
      $$0.put(Pair.of(cjt.e, blk.e), cmk.pI);
      $$0.put(Pair.of(cjt.e, blk.d), cmk.pJ);
      $$0.put(Pair.of(cjt.e, blk.c), cmk.pK);
      $$0.put(Pair.of(cjt.f, blk.f), cmk.on);
   });
   private static final List<ags<com>> b = List.of(
      coo.a, coo.b, coo.c, coo.d, coo.e, coo.f, coo.g, coo.h, coo.i, coo.j, coo.k, coo.l, coo.m, coo.n, coo.o, coo.p
   );
   private static final List<ags<cok>> c = List.of(col.a, col.b, col.c, col.d, col.e, col.f, col.g, col.h, col.i, col.j);
   private static final ToIntFunction<ags<com>> d = ac.e(b);
   private static final ToIntFunction<ags<cok>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cer $$1) {
      csy $$2 = $$1.dM();
      io<coj> $$3 = io.a();
      ir<com> $$4 = $$2.I_().d(kc.aI);
      ir<cok> $$5 = $$2.I_().d(kc.aH);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new coj($$5.d($$4x), $$4.d($$3x))))
         );
      hv $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = cjt.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (coj $$11 : $$3) {
         for (cjs $$12 : cjt.values()) {
            if ($$12 != cjt.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cau $$16 = new cau($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (blk $$17 : blk.values()) {
                  cmc $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cmh $$19 = new cmh($$18);
                     coj.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cjr) {
                        cjr $$20 = (cjr)$$18;
                        if ($$20.d() == cjt.f) {
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

      $$0.a(() -> vb.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
