import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ana {
   private static final Map<Pair<il<cnz>, bpe>, cqh> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(coa.b, bpe.f), cqp.pB);
      $$0.put(Pair.of(coa.b, bpe.e), cqp.pC);
      $$0.put(Pair.of(coa.b, bpe.d), cqp.pD);
      $$0.put(Pair.of(coa.b, bpe.c), cqp.pE);
      $$0.put(Pair.of(coa.c, bpe.f), cqp.pF);
      $$0.put(Pair.of(coa.c, bpe.e), cqp.pG);
      $$0.put(Pair.of(coa.c, bpe.d), cqp.pH);
      $$0.put(Pair.of(coa.c, bpe.c), cqp.pI);
      $$0.put(Pair.of(coa.d, bpe.f), cqp.pN);
      $$0.put(Pair.of(coa.d, bpe.e), cqp.pO);
      $$0.put(Pair.of(coa.d, bpe.d), cqp.pP);
      $$0.put(Pair.of(coa.d, bpe.c), cqp.pQ);
      $$0.put(Pair.of(coa.g, bpe.f), cqp.pR);
      $$0.put(Pair.of(coa.g, bpe.e), cqp.pS);
      $$0.put(Pair.of(coa.g, bpe.d), cqp.pT);
      $$0.put(Pair.of(coa.g, bpe.c), cqp.pU);
      $$0.put(Pair.of(coa.e, bpe.f), cqp.pJ);
      $$0.put(Pair.of(coa.e, bpe.e), cqp.pK);
      $$0.put(Pair.of(coa.e, bpe.d), cqp.pL);
      $$0.put(Pair.of(coa.e, bpe.c), cqp.pM);
      $$0.put(Pair.of(coa.f, bpe.f), cqp.on);
   });
   private static final List<ajg<csr>> b = List.of(
      css.a, css.b, css.c, css.d, css.e, css.f, css.g, css.h, css.i, css.j, css.k, css.l, css.m, css.n, css.o, css.p
   );
   private static final List<ajg<csp>> c = List.of(csq.a, csq.b, csq.c, csq.d, csq.e, csq.f, csq.g, csq.h, csq.i, csq.j);
   private static final ToIntFunction<ajg<csr>> d = ac.g(b);
   private static final ToIntFunction<ajg<csp>> e = ac.g(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).h()))
      );
   }

   private static int a(du $$0, ciu $$1) {
      cxb $$2 = $$1.dM();
      iu<cso> $$3 = iu.a();
      iy<csr> $$4 = $$2.H_().d(kj.aK);
      iy<csp> $$5 = $$2.H_().d(kj.aJ);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cso($$5.e($$4x), $$4.e($$3x))))
         );
      ib $$6 = $$1.dm().a($$1.cE(), 5);
      iy<cnz> $$7 = $$0.v().d(kj.at);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cso $$12 : $$3) {
         for (cnz $$13 : $$7) {
            if ($$13 != coa.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               ceu $$17 = new ceu($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.e(true);

               for (bpe $$18 : bpe.values()) {
                  cqh $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cqm $$20 = new cqm($$19);
                     cso.a($$2.H_(), $$20, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cny) {
                        cny $$21 = (cny)$$19;
                        if ($$21.f().a(coa.f)) {
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
