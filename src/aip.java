import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aip {
   private static final Map<Pair<cgs, bix>, cjc> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgt.b, bix.f), cjk.oO);
      $$0.put(Pair.of(cgt.b, bix.e), cjk.oP);
      $$0.put(Pair.of(cgt.b, bix.d), cjk.oQ);
      $$0.put(Pair.of(cgt.b, bix.c), cjk.oR);
      $$0.put(Pair.of(cgt.c, bix.f), cjk.oS);
      $$0.put(Pair.of(cgt.c, bix.e), cjk.oT);
      $$0.put(Pair.of(cgt.c, bix.d), cjk.oU);
      $$0.put(Pair.of(cgt.c, bix.c), cjk.oV);
      $$0.put(Pair.of(cgt.d, bix.f), cjk.pa);
      $$0.put(Pair.of(cgt.d, bix.e), cjk.pb);
      $$0.put(Pair.of(cgt.d, bix.d), cjk.pc);
      $$0.put(Pair.of(cgt.d, bix.c), cjk.pd);
      $$0.put(Pair.of(cgt.g, bix.f), cjk.pe);
      $$0.put(Pair.of(cgt.g, bix.e), cjk.pf);
      $$0.put(Pair.of(cgt.g, bix.d), cjk.pg);
      $$0.put(Pair.of(cgt.g, bix.c), cjk.ph);
      $$0.put(Pair.of(cgt.e, bix.f), cjk.oW);
      $$0.put(Pair.of(cgt.e, bix.e), cjk.oX);
      $$0.put(Pair.of(cgt.e, bix.d), cjk.oY);
      $$0.put(Pair.of(cgt.e, bix.c), cjk.oZ);
      $$0.put(Pair.of(cgt.f, bix.f), cjk.nC);
   });
   private static final List<aex<clm>> b = List.of(
      cln.a, cln.b, cln.c, cln.d, cln.e, cln.f, cln.g, cln.h, cln.i, cln.j, cln.k, cln.l, cln.m, cln.n, cln.o, cln.p
   );
   private static final List<aex<clk>> c = List.of(cll.a, cll.b, cll.c, cll.d, cll.e, cll.f, cll.g, cll.h, cll.i, cll.j);
   private static final ToIntFunction<aex<clm>> d = ac.e(b);
   private static final ToIntFunction<aex<clk>> e = ac.e(c);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).h()))
      );
   }

   private static int a(dt $$0, cbw $$1) {
      cpx $$2 = $$1.dL();
      hp<clj> $$3 = hp.a();
      ht<clm> $$4 = $$2.G_().d(je.aE);
      ht<clk> $$5 = $$2.G_().d(je.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new clj($$5.d($$4x), $$4.d($$3x))))
         );
      gw $$6 = $$1.dl().a($$1.cD(), 5);
      int $$7 = cgt.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (clj $$11 : $$3) {
         for (cgs $$12 : cgt.values()) {
            if ($$12 != cgt.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               byf $$16 = new byf($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bix $$17 : bix.values()) {
                  cjc $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cjh $$19 = new cjh($$18);
                     clj.a($$2.G_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgr) {
                        cgr $$20 = (cgr)$$18;
                        if ($$20.d() == cgt.f) {
                           $$16.b($$11.a().a().a($$11.b()).e().f(" ").b($$11.b().a().e()));
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

      $$0.a(() -> tn.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
