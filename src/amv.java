import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class amv {
   private static final Map<Pair<il<cnd>, bom>, cpl> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cne.b, bom.f), cpt.pB);
      $$0.put(Pair.of(cne.b, bom.e), cpt.pC);
      $$0.put(Pair.of(cne.b, bom.d), cpt.pD);
      $$0.put(Pair.of(cne.b, bom.c), cpt.pE);
      $$0.put(Pair.of(cne.c, bom.f), cpt.pF);
      $$0.put(Pair.of(cne.c, bom.e), cpt.pG);
      $$0.put(Pair.of(cne.c, bom.d), cpt.pH);
      $$0.put(Pair.of(cne.c, bom.c), cpt.pI);
      $$0.put(Pair.of(cne.d, bom.f), cpt.pN);
      $$0.put(Pair.of(cne.d, bom.e), cpt.pO);
      $$0.put(Pair.of(cne.d, bom.d), cpt.pP);
      $$0.put(Pair.of(cne.d, bom.c), cpt.pQ);
      $$0.put(Pair.of(cne.g, bom.f), cpt.pR);
      $$0.put(Pair.of(cne.g, bom.e), cpt.pS);
      $$0.put(Pair.of(cne.g, bom.d), cpt.pT);
      $$0.put(Pair.of(cne.g, bom.c), cpt.pU);
      $$0.put(Pair.of(cne.e, bom.f), cpt.pJ);
      $$0.put(Pair.of(cne.e, bom.e), cpt.pK);
      $$0.put(Pair.of(cne.e, bom.d), cpt.pL);
      $$0.put(Pair.of(cne.e, bom.c), cpt.pM);
      $$0.put(Pair.of(cne.f, bom.f), cpt.on);
   });
   private static final List<ajb<cru>> b = List.of(
      crv.a, crv.b, crv.c, crv.d, crv.e, crv.f, crv.g, crv.h, crv.i, crv.j, crv.k, crv.l, crv.m, crv.n, crv.o, crv.p
   );
   private static final List<ajb<crs>> c = List.of(crt.a, crt.b, crt.c, crt.d, crt.e, crt.f, crt.g, crt.h, crt.i, crt.j);
   private static final ToIntFunction<ajb<cru>> d = ac.g(b);
   private static final ToIntFunction<ajb<crs>> e = ac.g(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, cia $$1) {
      cwe $$2 = $$1.dJ();
      iu<crr> $$3 = iu.a();
      ix<cru> $$4 = $$2.I_().d(ki.aK);
      ix<crs> $$5 = $$2.I_().d(ki.aJ);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new crr($$5.e($$4x), $$4.e($$3x))))
         );
      ib $$6 = $$1.dj().a($$1.cB(), 5);
      ix<cnd> $$7 = $$0.v().d(ki.at);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (crr $$12 : $$3) {
         for (cnd $$13 : $$7) {
            if ($$13 != cne.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               ceb $$17 = new ceb($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.e(true);

               for (bom $$18 : bom.values()) {
                  cpl $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cpq $$20 = new cpq($$19);
                     crr.a($$2.I_(), $$20, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cnc) {
                        cnc $$21 = (cnc)$$19;
                        if ($$21.f().a(cne.f)) {
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

      $$0.a(() -> vs.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
