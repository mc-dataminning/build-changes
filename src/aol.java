import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aol {
   private static final Map<Pair<jm<csg>, bsy>, cul> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(csh.b, bsy.f), cut.pC);
      $$0.put(Pair.of(csh.b, bsy.e), cut.pD);
      $$0.put(Pair.of(csh.b, bsy.d), cut.pE);
      $$0.put(Pair.of(csh.b, bsy.c), cut.pF);
      $$0.put(Pair.of(csh.c, bsy.f), cut.pG);
      $$0.put(Pair.of(csh.c, bsy.e), cut.pH);
      $$0.put(Pair.of(csh.c, bsy.d), cut.pI);
      $$0.put(Pair.of(csh.c, bsy.c), cut.pJ);
      $$0.put(Pair.of(csh.d, bsy.f), cut.pO);
      $$0.put(Pair.of(csh.d, bsy.e), cut.pP);
      $$0.put(Pair.of(csh.d, bsy.d), cut.pQ);
      $$0.put(Pair.of(csh.d, bsy.c), cut.pR);
      $$0.put(Pair.of(csh.g, bsy.f), cut.pS);
      $$0.put(Pair.of(csh.g, bsy.e), cut.pT);
      $$0.put(Pair.of(csh.g, bsy.d), cut.pU);
      $$0.put(Pair.of(csh.g, bsy.c), cut.pV);
      $$0.put(Pair.of(csh.e, bsy.f), cut.pK);
      $$0.put(Pair.of(csh.e, bsy.e), cut.pL);
      $$0.put(Pair.of(csh.e, bsy.d), cut.pM);
      $$0.put(Pair.of(csh.e, bsy.c), cut.pN);
      $$0.put(Pair.of(csh.f, bsy.f), cut.oo);
   });
   private static final List<akq<cxa>> b = List.of(
      cxb.a, cxb.b, cxb.c, cxb.d, cxb.e, cxb.f, cxb.g, cxb.h, cxb.i, cxb.j, cxb.k, cxb.l, cxb.m, cxb.n, cxb.o, cxb.p, cxb.q, cxb.r
   );
   private static final List<akq<cwy>> c = List.of(cwz.a, cwz.b, cwz.c, cwz.d, cwz.e, cwz.f, cwz.g, cwz.h, cwz.i, cwz.j);
   private static final ToIntFunction<akq<cxa>> d = ad.g(b);
   private static final ToIntFunction<akq<cwy>> e = ad.g(c);

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).h()))
      );
   }

   private static int a(et $$0, cmx $$1) {
      dcw $$2 = $$1.dP();
      jv<cwx> $$3 = jv.a();
      jz<cxa> $$4 = $$2.H_().d(lu.aX);
      jz<cwy> $$5 = $$2.H_().d(lu.aW);
      $$4.t()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.t()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cwx($$5.e($$4x), $$4.e($$3x))))
         );
      jd $$6 = $$1.dp().a($$1.cI(), 5);
      jz<csg> $$7 = $$0.v().d(lu.az);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cwx $$12 : $$3) {
         for (csg $$13 : $$7) {
            if ($$13 != csh.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               ciw $$17 = new ciw($$2, $$14, $$15, $$16);
               $$17.t(180.0F);
               $$17.f(true);

               for (bsy $$18 : bsy.values()) {
                  cul $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cuq $$20 = new cuq($$19);
                     $$20.b(kq.K, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof csf) {
                        csf $$21 = (csf)$$19;
                        if ($$21.h().a(csh.f)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
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

      $$0.a(() -> wz.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
