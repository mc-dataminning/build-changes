import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class any {
   private static final Map<Pair<iv<cpt>, bqs>, cry> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cpu.b, bqs.f), csg.pC);
      $$0.put(Pair.of(cpu.b, bqs.e), csg.pD);
      $$0.put(Pair.of(cpu.b, bqs.d), csg.pE);
      $$0.put(Pair.of(cpu.b, bqs.c), csg.pF);
      $$0.put(Pair.of(cpu.c, bqs.f), csg.pG);
      $$0.put(Pair.of(cpu.c, bqs.e), csg.pH);
      $$0.put(Pair.of(cpu.c, bqs.d), csg.pI);
      $$0.put(Pair.of(cpu.c, bqs.c), csg.pJ);
      $$0.put(Pair.of(cpu.d, bqs.f), csg.pO);
      $$0.put(Pair.of(cpu.d, bqs.e), csg.pP);
      $$0.put(Pair.of(cpu.d, bqs.d), csg.pQ);
      $$0.put(Pair.of(cpu.d, bqs.c), csg.pR);
      $$0.put(Pair.of(cpu.g, bqs.f), csg.pS);
      $$0.put(Pair.of(cpu.g, bqs.e), csg.pT);
      $$0.put(Pair.of(cpu.g, bqs.d), csg.pU);
      $$0.put(Pair.of(cpu.g, bqs.c), csg.pV);
      $$0.put(Pair.of(cpu.e, bqs.f), csg.pK);
      $$0.put(Pair.of(cpu.e, bqs.e), csg.pL);
      $$0.put(Pair.of(cpu.e, bqs.d), csg.pM);
      $$0.put(Pair.of(cpu.e, bqs.c), csg.pN);
      $$0.put(Pair.of(cpu.f, bqs.f), csg.oo);
   });
   private static final List<ake<cui>> b = List.of(
      cuj.a, cuj.b, cuj.c, cuj.d, cuj.e, cuj.f, cuj.g, cuj.h, cuj.i, cuj.j, cuj.k, cuj.l, cuj.m, cuj.n, cuj.o, cuj.p, cuj.q, cuj.r
   );
   private static final List<ake<cug>> c = List.of(cuh.a, cuh.b, cuh.c, cuh.d, cuh.e, cuh.f, cuh.g, cuh.h, cuh.i, cuh.j);
   private static final ToIntFunction<ake<cui>> d = ac.g(b);
   private static final ToIntFunction<ake<cug>> e = ac.g(c);

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ec)$$0x.getSource(), ((ec)$$0x.getSource()).h()))
      );
   }

   private static int a(ec $$0, ckl $$1) {
      czu $$2 = $$1.dN();
      je<cuf> $$3 = je.a();
      ji<cui> $$4 = $$2.H_().d(ld.aO);
      ji<cug> $$5 = $$2.H_().d(ld.aN);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cuf($$5.e($$4x), $$4.e($$3x))))
         );
      im $$6 = $$1.dn().a($$1.cF(), 5);
      ji<cpt> $$7 = $$0.v().d(ld.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cuf $$12 : $$3) {
         for (cpt $$13 : $$7) {
            if ($$13 != cpu.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               cgl $$17 = new cgl($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bqs $$18 : bqs.values()) {
                  cry $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     csd $$20 = new csd($$19);
                     $$20.b(jz.B, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cps) {
                        cps $$21 = (cps)$$19;
                        if ($$21.h().a(cpu.f)) {
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

      $$0.a(() -> ws.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
