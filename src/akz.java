import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class akz {
   private static final Map<Pair<ckj, bma>, cmt> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ckk.b, bma.f), cnb.pz);
      $$0.put(Pair.of(ckk.b, bma.e), cnb.pA);
      $$0.put(Pair.of(ckk.b, bma.d), cnb.pB);
      $$0.put(Pair.of(ckk.b, bma.c), cnb.pC);
      $$0.put(Pair.of(ckk.c, bma.f), cnb.pD);
      $$0.put(Pair.of(ckk.c, bma.e), cnb.pE);
      $$0.put(Pair.of(ckk.c, bma.d), cnb.pF);
      $$0.put(Pair.of(ckk.c, bma.c), cnb.pG);
      $$0.put(Pair.of(ckk.d, bma.f), cnb.pL);
      $$0.put(Pair.of(ckk.d, bma.e), cnb.pM);
      $$0.put(Pair.of(ckk.d, bma.d), cnb.pN);
      $$0.put(Pair.of(ckk.d, bma.c), cnb.pO);
      $$0.put(Pair.of(ckk.g, bma.f), cnb.pP);
      $$0.put(Pair.of(ckk.g, bma.e), cnb.pQ);
      $$0.put(Pair.of(ckk.g, bma.d), cnb.pR);
      $$0.put(Pair.of(ckk.g, bma.c), cnb.pS);
      $$0.put(Pair.of(ckk.e, bma.f), cnb.pH);
      $$0.put(Pair.of(ckk.e, bma.e), cnb.pI);
      $$0.put(Pair.of(ckk.e, bma.d), cnb.pJ);
      $$0.put(Pair.of(ckk.e, bma.c), cnb.pK);
      $$0.put(Pair.of(ckk.f, bma.f), cnb.on);
   });
   private static final List<ahf<cpe>> b = List.of(
      cpf.a, cpf.b, cpf.c, cpf.d, cpf.e, cpf.f, cpf.g, cpf.h, cpf.i, cpf.j, cpf.k, cpf.l, cpf.m, cpf.n, cpf.o, cpf.p
   );
   private static final List<ahf<cpc>> c = List.of(cpd.a, cpd.b, cpd.c, cpd.d, cpd.e, cpd.f, cpd.g, cpd.h, cpd.i, cpd.j);
   private static final ToIntFunction<ahf<cpe>> d = ac.e(b);
   private static final ToIntFunction<ahf<cpc>> e = ac.e(c);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ds)$$0x.getSource(), ((ds)$$0x.getSource()).h()))
      );
   }

   private static int a(ds $$0, cfi $$1) {
      ctp $$2 = $$1.dM();
      iq<cpb> $$3 = iq.a();
      it<cpe> $$4 = $$2.I_().d(ke.aJ);
      it<cpc> $$5 = $$2.I_().d(ke.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cpb($$5.d($$4x), $$4.d($$3x))))
         );
      hx $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = ckk.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cpb $$11 : $$3) {
         for (ckj $$12 : ckk.values()) {
            if ($$12 != ckk.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cbk $$16 = new cbk($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bma $$17 : bma.values()) {
                  cmt $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cmy $$19 = new cmy($$18);
                     cpb.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cki) {
                        cki $$20 = (cki)$$18;
                        if ($$20.d() == ckk.f) {
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
