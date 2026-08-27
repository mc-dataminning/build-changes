import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class amr {
   private static final Map<Pair<cmk, bnv>, cou> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cml.b, bnv.f), cpc.pB);
      $$0.put(Pair.of(cml.b, bnv.e), cpc.pC);
      $$0.put(Pair.of(cml.b, bnv.d), cpc.pD);
      $$0.put(Pair.of(cml.b, bnv.c), cpc.pE);
      $$0.put(Pair.of(cml.c, bnv.f), cpc.pF);
      $$0.put(Pair.of(cml.c, bnv.e), cpc.pG);
      $$0.put(Pair.of(cml.c, bnv.d), cpc.pH);
      $$0.put(Pair.of(cml.c, bnv.c), cpc.pI);
      $$0.put(Pair.of(cml.d, bnv.f), cpc.pN);
      $$0.put(Pair.of(cml.d, bnv.e), cpc.pO);
      $$0.put(Pair.of(cml.d, bnv.d), cpc.pP);
      $$0.put(Pair.of(cml.d, bnv.c), cpc.pQ);
      $$0.put(Pair.of(cml.g, bnv.f), cpc.pR);
      $$0.put(Pair.of(cml.g, bnv.e), cpc.pS);
      $$0.put(Pair.of(cml.g, bnv.d), cpc.pT);
      $$0.put(Pair.of(cml.g, bnv.c), cpc.pU);
      $$0.put(Pair.of(cml.e, bnv.f), cpc.pJ);
      $$0.put(Pair.of(cml.e, bnv.e), cpc.pK);
      $$0.put(Pair.of(cml.e, bnv.d), cpc.pL);
      $$0.put(Pair.of(cml.e, bnv.c), cpc.pM);
      $$0.put(Pair.of(cml.f, bnv.f), cpc.on);
   });
   private static final List<aix<crd>> b = List.of(
      cre.a, cre.b, cre.c, cre.d, cre.e, cre.f, cre.g, cre.h, cre.i, cre.j, cre.k, cre.l, cre.m, cre.n, cre.o, cre.p
   );
   private static final List<aix<crb>> c = List.of(crc.a, crc.b, crc.c, crc.d, crc.e, crc.f, crc.g, crc.h, crc.i, crc.j);
   private static final ToIntFunction<aix<crd>> d = ac.e(b);
   private static final ToIntFunction<aix<crb>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, chh $$1) {
      cvn $$2 = $$1.dM();
      is<cra> $$3 = is.a();
      iv<crd> $$4 = $$2.I_().d(kg.aJ);
      iv<crb> $$5 = $$2.I_().d(kg.aI);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cra($$5.e($$4x), $$4.e($$3x))))
         );
      hz $$6 = $$1.dm().a($$1.cE(), 5);
      int $$7 = cml.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cra $$11 : $$3) {
         for (cmk $$12 : cml.values()) {
            if ($$12 != cml.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cdi $$16 = new cdi($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bnv $$17 : bnv.values()) {
                  cou $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     coz $$19 = new coz($$18);
                     cra.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cmj) {
                        cmj $$20 = (cmj)$$18;
                        if ($$20.d() == cml.f) {
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
