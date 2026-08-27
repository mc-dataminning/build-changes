import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aio {
   private static final Map<Pair<cgq, biv>, cja> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgr.b, biv.f), cji.oO);
      $$0.put(Pair.of(cgr.b, biv.e), cji.oP);
      $$0.put(Pair.of(cgr.b, biv.d), cji.oQ);
      $$0.put(Pair.of(cgr.b, biv.c), cji.oR);
      $$0.put(Pair.of(cgr.c, biv.f), cji.oS);
      $$0.put(Pair.of(cgr.c, biv.e), cji.oT);
      $$0.put(Pair.of(cgr.c, biv.d), cji.oU);
      $$0.put(Pair.of(cgr.c, biv.c), cji.oV);
      $$0.put(Pair.of(cgr.d, biv.f), cji.pa);
      $$0.put(Pair.of(cgr.d, biv.e), cji.pb);
      $$0.put(Pair.of(cgr.d, biv.d), cji.pc);
      $$0.put(Pair.of(cgr.d, biv.c), cji.pd);
      $$0.put(Pair.of(cgr.g, biv.f), cji.pe);
      $$0.put(Pair.of(cgr.g, biv.e), cji.pf);
      $$0.put(Pair.of(cgr.g, biv.d), cji.pg);
      $$0.put(Pair.of(cgr.g, biv.c), cji.ph);
      $$0.put(Pair.of(cgr.e, biv.f), cji.oW);
      $$0.put(Pair.of(cgr.e, biv.e), cji.oX);
      $$0.put(Pair.of(cgr.e, biv.d), cji.oY);
      $$0.put(Pair.of(cgr.e, biv.c), cji.oZ);
      $$0.put(Pair.of(cgr.f, biv.f), cji.nC);
   });
   private static final List<aew<clk>> b = List.of(
      cll.a, cll.b, cll.c, cll.d, cll.e, cll.f, cll.g, cll.h, cll.i, cll.j, cll.k, cll.l, cll.m, cll.n, cll.o, cll.p
   );
   private static final List<aew<cli>> c = List.of(clj.a, clj.b, clj.c, clj.d, clj.e, clj.f, clj.g, clj.h, clj.i, clj.j);
   private static final ToIntFunction<aew<clk>> d = ac.e(b);
   private static final ToIntFunction<aew<cli>> e = ac.e(c);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).h()))
      );
   }

   private static int a(dt $$0, cbu $$1) {
      cpv $$2 = $$1.dL();
      hp<clh> $$3 = hp.a();
      ht<clk> $$4 = $$2.G_().d(je.aE);
      ht<cli> $$5 = $$2.G_().d(je.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new clh($$5.d($$4x), $$4.d($$3x))))
         );
      gw $$6 = $$1.dl().a($$1.cE(), 5);
      int $$7 = cgr.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (clh $$11 : $$3) {
         for (cgq $$12 : cgr.values()) {
            if ($$12 != cgr.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               byd $$16 = new byd($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (biv $$17 : biv.values()) {
                  cja $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cjf $$19 = new cjf($$18);
                     clh.a($$2.G_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgp) {
                        cgp $$20 = (cgp)$$18;
                        if ($$20.d() == cgr.f) {
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

      $$0.a(() -> tl.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
