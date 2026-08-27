import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ake {
   private static final Map<Pair<ciz, bla>, clj> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cja.b, bla.f), clr.pz);
      $$0.put(Pair.of(cja.b, bla.e), clr.pA);
      $$0.put(Pair.of(cja.b, bla.d), clr.pB);
      $$0.put(Pair.of(cja.b, bla.c), clr.pC);
      $$0.put(Pair.of(cja.c, bla.f), clr.pD);
      $$0.put(Pair.of(cja.c, bla.e), clr.pE);
      $$0.put(Pair.of(cja.c, bla.d), clr.pF);
      $$0.put(Pair.of(cja.c, bla.c), clr.pG);
      $$0.put(Pair.of(cja.d, bla.f), clr.pL);
      $$0.put(Pair.of(cja.d, bla.e), clr.pM);
      $$0.put(Pair.of(cja.d, bla.d), clr.pN);
      $$0.put(Pair.of(cja.d, bla.c), clr.pO);
      $$0.put(Pair.of(cja.g, bla.f), clr.pP);
      $$0.put(Pair.of(cja.g, bla.e), clr.pQ);
      $$0.put(Pair.of(cja.g, bla.d), clr.pR);
      $$0.put(Pair.of(cja.g, bla.c), clr.pS);
      $$0.put(Pair.of(cja.e, bla.f), clr.pH);
      $$0.put(Pair.of(cja.e, bla.e), clr.pI);
      $$0.put(Pair.of(cja.e, bla.d), clr.pJ);
      $$0.put(Pair.of(cja.e, bla.c), clr.pK);
      $$0.put(Pair.of(cja.f, bla.f), clr.on);
   });
   private static final List<agl<cnt>> b = List.of(
      cnu.a, cnu.b, cnu.c, cnu.d, cnu.e, cnu.f, cnu.g, cnu.h, cnu.i, cnu.j, cnu.k, cnu.l, cnu.m, cnu.n, cnu.o, cnu.p
   );
   private static final List<agl<cnr>> c = List.of(cns.a, cns.b, cns.c, cns.d, cns.e, cns.f, cns.g, cns.h, cns.i, cns.j);
   private static final ToIntFunction<agl<cnt>> d = ac.e(b);
   private static final ToIntFunction<agl<cnr>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, cdz $$1) {
      csf $$2 = $$1.dN();
      ip<cnq> $$3 = ip.a();
      is<cnt> $$4 = $$2.I_().d(kd.aG);
      is<cnr> $$5 = $$2.I_().d(kd.aF);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cnq($$5.d($$4x), $$4.d($$3x))))
         );
      hx $$6 = $$1.dn().a($$1.cE(), 5);
      int $$7 = cja.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cnq $$11 : $$3) {
         for (ciz $$12 : cja.values()) {
            if ($$12 != cja.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cai $$16 = new cai($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bla $$17 : bla.values()) {
                  clj $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     clo $$19 = new clo($$18);
                     cnq.a($$2.I_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof ciy) {
                        ciy $$20 = (ciy)$$18;
                        if ($$20.d() == cja.f) {
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

      $$0.a(() -> uv.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
