import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ana {
   private static final Map<Pair<il<cnx>, bpd>, cqf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cny.b, bpd.f), cqn.pB);
      $$0.put(Pair.of(cny.b, bpd.e), cqn.pC);
      $$0.put(Pair.of(cny.b, bpd.d), cqn.pD);
      $$0.put(Pair.of(cny.b, bpd.c), cqn.pE);
      $$0.put(Pair.of(cny.c, bpd.f), cqn.pF);
      $$0.put(Pair.of(cny.c, bpd.e), cqn.pG);
      $$0.put(Pair.of(cny.c, bpd.d), cqn.pH);
      $$0.put(Pair.of(cny.c, bpd.c), cqn.pI);
      $$0.put(Pair.of(cny.d, bpd.f), cqn.pN);
      $$0.put(Pair.of(cny.d, bpd.e), cqn.pO);
      $$0.put(Pair.of(cny.d, bpd.d), cqn.pP);
      $$0.put(Pair.of(cny.d, bpd.c), cqn.pQ);
      $$0.put(Pair.of(cny.g, bpd.f), cqn.pR);
      $$0.put(Pair.of(cny.g, bpd.e), cqn.pS);
      $$0.put(Pair.of(cny.g, bpd.d), cqn.pT);
      $$0.put(Pair.of(cny.g, bpd.c), cqn.pU);
      $$0.put(Pair.of(cny.e, bpd.f), cqn.pJ);
      $$0.put(Pair.of(cny.e, bpd.e), cqn.pK);
      $$0.put(Pair.of(cny.e, bpd.d), cqn.pL);
      $$0.put(Pair.of(cny.e, bpd.c), cqn.pM);
      $$0.put(Pair.of(cny.f, bpd.f), cqn.on);
   });
   private static final List<ajg<csp>> b = List.of(
      csq.a, csq.b, csq.c, csq.d, csq.e, csq.f, csq.g, csq.h, csq.i, csq.j, csq.k, csq.l, csq.m, csq.n, csq.o, csq.p
   );
   private static final List<ajg<csn>> c = List.of(cso.a, cso.b, cso.c, cso.d, cso.e, cso.f, cso.g, cso.h, cso.i, cso.j);
   private static final ToIntFunction<ajg<csp>> d = ac.g(b);
   private static final ToIntFunction<ajg<csn>> e = ac.g(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, cis $$1) {
      cwz $$2 = $$1.dM();
      iu<csm> $$3 = iu.a();
      iy<csp> $$4 = $$2.H_().d(kj.aK);
      iy<csn> $$5 = $$2.H_().d(kj.aJ);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new csm($$5.e($$4x), $$4.e($$3x))))
         );
      ib $$6 = $$1.dm().a($$1.cE(), 5);
      iy<cnx> $$7 = $$0.v().d(kj.at);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (csm $$12 : $$3) {
         for (cnx $$13 : $$7) {
            if ($$13 != cny.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cet $$17 = new cet($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.e(true);

               for (bpd $$18 : bpd.values()) {
                  cqf $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cqk $$20 = new cqk($$19);
                     csm.a($$2.H_(), $$20, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cnw) {
                        cnw $$21 = (cnw)$$19;
                        if ($$21.f().a(cny.f)) {
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

      $$0.a(() -> vu.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
