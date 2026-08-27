import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aob {
   private static final Map<Pair<iw<cqp>, bro>, csu> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cqq.b, bro.f), ctc.pC);
      $$0.put(Pair.of(cqq.b, bro.e), ctc.pD);
      $$0.put(Pair.of(cqq.b, bro.d), ctc.pE);
      $$0.put(Pair.of(cqq.b, bro.c), ctc.pF);
      $$0.put(Pair.of(cqq.c, bro.f), ctc.pG);
      $$0.put(Pair.of(cqq.c, bro.e), ctc.pH);
      $$0.put(Pair.of(cqq.c, bro.d), ctc.pI);
      $$0.put(Pair.of(cqq.c, bro.c), ctc.pJ);
      $$0.put(Pair.of(cqq.d, bro.f), ctc.pO);
      $$0.put(Pair.of(cqq.d, bro.e), ctc.pP);
      $$0.put(Pair.of(cqq.d, bro.d), ctc.pQ);
      $$0.put(Pair.of(cqq.d, bro.c), ctc.pR);
      $$0.put(Pair.of(cqq.g, bro.f), ctc.pS);
      $$0.put(Pair.of(cqq.g, bro.e), ctc.pT);
      $$0.put(Pair.of(cqq.g, bro.d), ctc.pU);
      $$0.put(Pair.of(cqq.g, bro.c), ctc.pV);
      $$0.put(Pair.of(cqq.e, bro.f), ctc.pK);
      $$0.put(Pair.of(cqq.e, bro.e), ctc.pL);
      $$0.put(Pair.of(cqq.e, bro.d), ctc.pM);
      $$0.put(Pair.of(cqq.e, bro.c), ctc.pN);
      $$0.put(Pair.of(cqq.f, bro.f), ctc.oo);
   });
   private static final List<akg<cve>> b = List.of(
      cvf.a, cvf.b, cvf.c, cvf.d, cvf.e, cvf.f, cvf.g, cvf.h, cvf.i, cvf.j, cvf.k, cvf.l, cvf.m, cvf.n, cvf.o, cvf.p, cvf.q, cvf.r
   );
   private static final List<akg<cvc>> c = List.of(cvd.a, cvd.b, cvd.c, cvd.d, cvd.e, cvd.f, cvd.g, cvd.h, cvd.i, cvd.j);
   private static final ToIntFunction<akg<cve>> d = ac.g(b);
   private static final ToIntFunction<akg<cvc>> e = ac.g(c);

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ed)$$0x.getSource(), ((ed)$$0x.getSource()).h()))
      );
   }

   private static int a(ed $$0, clh $$1) {
      dad $$2 = $$1.dN();
      jf<cvb> $$3 = jf.a();
      jj<cve> $$4 = $$2.H_().d(le.aP);
      jj<cvc> $$5 = $$2.H_().d(le.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cvb($$5.e($$4x), $$4.e($$3x))))
         );
      in $$6 = $$1.dn().a($$1.cF(), 5);
      jj<cqp> $$7 = $$0.v().d(le.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cvb $$12 : $$3) {
         for (cqp $$13 : $$7) {
            if ($$13 != cqq.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               chh $$17 = new chh($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bro $$18 : bro.values()) {
                  csu $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     csz $$20 = new csz($$19);
                     $$20.b(ka.I, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cqo) {
                        cqo $$21 = (cqo)$$19;
                        if ($$21.h().a(cqq.f)) {
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

      $$0.a(() -> wu.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
