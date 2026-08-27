import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aog {
   private static final Map<Pair<ix<cre>, bsb>, ctj> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(crf.b, bsb.f), ctr.pC);
      $$0.put(Pair.of(crf.b, bsb.e), ctr.pD);
      $$0.put(Pair.of(crf.b, bsb.d), ctr.pE);
      $$0.put(Pair.of(crf.b, bsb.c), ctr.pF);
      $$0.put(Pair.of(crf.c, bsb.f), ctr.pG);
      $$0.put(Pair.of(crf.c, bsb.e), ctr.pH);
      $$0.put(Pair.of(crf.c, bsb.d), ctr.pI);
      $$0.put(Pair.of(crf.c, bsb.c), ctr.pJ);
      $$0.put(Pair.of(crf.d, bsb.f), ctr.pO);
      $$0.put(Pair.of(crf.d, bsb.e), ctr.pP);
      $$0.put(Pair.of(crf.d, bsb.d), ctr.pQ);
      $$0.put(Pair.of(crf.d, bsb.c), ctr.pR);
      $$0.put(Pair.of(crf.g, bsb.f), ctr.pS);
      $$0.put(Pair.of(crf.g, bsb.e), ctr.pT);
      $$0.put(Pair.of(crf.g, bsb.d), ctr.pU);
      $$0.put(Pair.of(crf.g, bsb.c), ctr.pV);
      $$0.put(Pair.of(crf.e, bsb.f), ctr.pK);
      $$0.put(Pair.of(crf.e, bsb.e), ctr.pL);
      $$0.put(Pair.of(crf.e, bsb.d), ctr.pM);
      $$0.put(Pair.of(crf.e, bsb.c), ctr.pN);
      $$0.put(Pair.of(crf.f, bsb.f), ctr.oo);
   });
   private static final List<akl<cvv>> b = List.of(
      cvw.a, cvw.b, cvw.c, cvw.d, cvw.e, cvw.f, cvw.g, cvw.h, cvw.i, cvw.j, cvw.k, cvw.l, cvw.m, cvw.n, cvw.o, cvw.p, cvw.q, cvw.r
   );
   private static final List<akl<cvt>> c = List.of(cvu.a, cvu.b, cvu.c, cvu.d, cvu.e, cvu.f, cvu.g, cvu.h, cvu.i, cvu.j);
   private static final ToIntFunction<akl<cvv>> d = ac.g(b);
   private static final ToIntFunction<akl<cvt>> e = ac.g(c);

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ee)$$0x.getSource(), ((ee)$$0x.getSource()).h()))
      );
   }

   private static int a(ee $$0, clw $$1) {
      dax $$2 = $$1.dP();
      jg<cvs> $$3 = jg.a();
      jk<cvv> $$4 = $$2.H_().d(lf.aP);
      jk<cvt> $$5 = $$2.H_().d(lf.aO);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cvs($$5.e($$4x), $$4.e($$3x))))
         );
      io $$6 = $$1.dp().a($$1.cH(), 5);
      jk<cre> $$7 = $$0.v().d(lf.au);
      int $$8 = $$7.b() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cvs $$12 : $$3) {
         for (cre $$13 : $$7) {
            if ($$13 != crf.a.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.b()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.b() * 10);
               chw $$17 = new chw($$2, $$14, $$15, $$16);
               $$17.r(180.0F);
               $$17.f(true);

               for (bsb $$18 : bsb.values()) {
                  ctj $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cto $$20 = new cto($$19);
                     $$20.b(kb.J, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof crd) {
                        crd $$21 = (crd)$$19;
                        if ($$21.h().a(crf.f)) {
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
