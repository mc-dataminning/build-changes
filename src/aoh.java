import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoh {
   private static final Map<Pair<ix<crg>, bsd>, ctl> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(crh.b, bsd.f), ctt.pC);
      $$0.put(Pair.of(crh.b, bsd.e), ctt.pD);
      $$0.put(Pair.of(crh.b, bsd.d), ctt.pE);
      $$0.put(Pair.of(crh.b, bsd.c), ctt.pF);
      $$0.put(Pair.of(crh.c, bsd.f), ctt.pG);
      $$0.put(Pair.of(crh.c, bsd.e), ctt.pH);
      $$0.put(Pair.of(crh.c, bsd.d), ctt.pI);
      $$0.put(Pair.of(crh.c, bsd.c), ctt.pJ);
      $$0.put(Pair.of(crh.d, bsd.f), ctt.pO);
      $$0.put(Pair.of(crh.d, bsd.e), ctt.pP);
      $$0.put(Pair.of(crh.d, bsd.d), ctt.pQ);
      $$0.put(Pair.of(crh.d, bsd.c), ctt.pR);
      $$0.put(Pair.of(crh.g, bsd.f), ctt.pS);
      $$0.put(Pair.of(crh.g, bsd.e), ctt.pT);
      $$0.put(Pair.of(crh.g, bsd.d), ctt.pU);
      $$0.put(Pair.of(crh.g, bsd.c), ctt.pV);
      $$0.put(Pair.of(crh.e, bsd.f), ctt.pK);
      $$0.put(Pair.of(crh.e, bsd.e), ctt.pL);
      $$0.put(Pair.of(crh.e, bsd.d), ctt.pM);
      $$0.put(Pair.of(crh.e, bsd.c), ctt.pN);
      $$0.put(Pair.of(crh.f, bsd.f), ctt.oo);
   });
   private static final List<akm<cvx>> b = List.of(
      cvy.a, cvy.b, cvy.c, cvy.d, cvy.e, cvy.f, cvy.g, cvy.h, cvy.i, cvy.j, cvy.k, cvy.l, cvy.m, cvy.n, cvy.o, cvy.p, cvy.q, cvy.r
   );
   private static final List<akm<cvv>> c = List.of(cvw.a, cvw.b, cvw.c, cvw.d, cvw.e, cvw.f, cvw.g, cvw.h, cvw.i, cvw.j);
   private static final ToIntFunction<akm<cvx>> d = ac.g(b);
   private static final ToIntFunction<akm<cvv>> e = ac.g(c);

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ee)$$0x.getSource(), ((ee)$$0x.getSource()).h()))
      );
   }

   private static int a(ee $$0, cly $$1) {
      daz $$2 = $$1.dP();
      jg<cvu> $$3 = jg.a();
      jk<cvx> $$4 = $$2.H_().d(lf.aP);
      jk<cvv> $$5 = $$2.H_().d(lf.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cvu($$5.e($$4x), $$4.e($$3x))))
         );
      io $$6 = $$1.dp().a($$1.cH(), 5);
      jk<crg> $$7 = $$0.v().d(lf.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cvu $$12 : $$3) {
         for (crg $$13 : $$7) {
            if ($$13 != crh.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               chy $$17 = new chy($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bsd $$18 : bsd.values()) {
                  ctl $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     ctq $$20 = new ctq($$19);
                     $$20.b(kb.J, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crf) {
                        crf $$21 = (crf)$$19;
                        if ($$21.h().a(crh.f)) {
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

      $$0.a(() -> wx.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
