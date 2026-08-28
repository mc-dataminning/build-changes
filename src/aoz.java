import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aoz {
   private static final Map<Pair<jo<ctm>, btz>, cvn> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ctn.i, btz.f), cvw.pD);
      $$0.put(Pair.of(ctn.i, btz.e), cvw.pE);
      $$0.put(Pair.of(ctn.i, btz.d), cvw.pF);
      $$0.put(Pair.of(ctn.i, btz.c), cvw.pG);
      $$0.put(Pair.of(ctn.j, btz.f), cvw.pH);
      $$0.put(Pair.of(ctn.j, btz.e), cvw.pI);
      $$0.put(Pair.of(ctn.j, btz.d), cvw.pJ);
      $$0.put(Pair.of(ctn.j, btz.c), cvw.pK);
      $$0.put(Pair.of(ctn.k, btz.f), cvw.pP);
      $$0.put(Pair.of(ctn.k, btz.e), cvw.pQ);
      $$0.put(Pair.of(ctn.k, btz.d), cvw.pR);
      $$0.put(Pair.of(ctn.k, btz.c), cvw.pS);
      $$0.put(Pair.of(ctn.n, btz.f), cvw.pT);
      $$0.put(Pair.of(ctn.n, btz.e), cvw.pU);
      $$0.put(Pair.of(ctn.n, btz.d), cvw.pV);
      $$0.put(Pair.of(ctn.n, btz.c), cvw.pW);
      $$0.put(Pair.of(ctn.l, btz.f), cvw.pL);
      $$0.put(Pair.of(ctn.l, btz.e), cvw.pM);
      $$0.put(Pair.of(ctn.l, btz.d), cvw.pN);
      $$0.put(Pair.of(ctn.l, btz.c), cvw.pO);
      $$0.put(Pair.of(ctn.m, btz.f), cvw.op);
   });
   private static final List<ald<cxx>> b = List.of(
      cxy.a, cxy.b, cxy.c, cxy.d, cxy.e, cxy.f, cxy.g, cxy.h, cxy.i, cxy.j, cxy.k, cxy.l, cxy.m, cxy.n, cxy.o, cxy.p, cxy.q, cxy.r
   );
   private static final List<ald<cxv>> c = List.of(cxw.a, cxw.b, cxw.c, cxw.d, cxw.e, cxw.f, cxw.g, cxw.h, cxw.i, cxw.j);
   private static final ToIntFunction<ald<cxx>> d = ad.g(b);
   private static final ToIntFunction<ald<cxv>> e = ad.g(c);

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((eu)$$0x.getSource(), ((eu)$$0x.getSource()).h()))
      );
   }

   private static int a(eu $$0, cnx $$1) {
      dej $$2 = $$1.dS();
      jx<cxu> $$3 = jx.a();
      kb<cxx> $$4 = $$2.G_().e(lw.aZ);
      kb<cxv> $$5 = $$2.G_().e(lw.aY);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cxu($$5.e($$4x), $$4.e($$3x))))
         );
      jf $$6 = $$1.ds().a($$1.cL(), 5);
      kb<ctm> $$7 = $$0.v().e(lw.az);
      int $$8 = $$7.d() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cxu $$12 : $$3) {
         for (ctm $$13 : $$7) {
            if ($$13 != ctn.h.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.d()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.d() * 10);
               cjw $$17 = new cjw($$2, $$14, $$15, $$16);
               $$17.v(180.0F);
               $$17.f(true);

               for (btz $$18 : btz.values()) {
                  cvn $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cvs $$20 = new cvs($$19);
                     $$20.b(ks.P, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof ctl) {
                        ctl $$21 = (ctl)$$19;
                        if ($$21.g().a(ctn.m)) {
                           $$17.b($$12.a().a().a($$12.b()).f().f(" ").b($$12.b().a().e()));
                           $$17.p(true);
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

      $$0.a(() -> xe.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
