import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aiq {
   private static final Map<Pair<cgw, bjb>, cjg> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgx.b, bjb.f), cjo.oO);
      $$0.put(Pair.of(cgx.b, bjb.e), cjo.oP);
      $$0.put(Pair.of(cgx.b, bjb.d), cjo.oQ);
      $$0.put(Pair.of(cgx.b, bjb.c), cjo.oR);
      $$0.put(Pair.of(cgx.c, bjb.f), cjo.oS);
      $$0.put(Pair.of(cgx.c, bjb.e), cjo.oT);
      $$0.put(Pair.of(cgx.c, bjb.d), cjo.oU);
      $$0.put(Pair.of(cgx.c, bjb.c), cjo.oV);
      $$0.put(Pair.of(cgx.d, bjb.f), cjo.pa);
      $$0.put(Pair.of(cgx.d, bjb.e), cjo.pb);
      $$0.put(Pair.of(cgx.d, bjb.d), cjo.pc);
      $$0.put(Pair.of(cgx.d, bjb.c), cjo.pd);
      $$0.put(Pair.of(cgx.g, bjb.f), cjo.pe);
      $$0.put(Pair.of(cgx.g, bjb.e), cjo.pf);
      $$0.put(Pair.of(cgx.g, bjb.d), cjo.pg);
      $$0.put(Pair.of(cgx.g, bjb.c), cjo.ph);
      $$0.put(Pair.of(cgx.e, bjb.f), cjo.oW);
      $$0.put(Pair.of(cgx.e, bjb.e), cjo.oX);
      $$0.put(Pair.of(cgx.e, bjb.d), cjo.oY);
      $$0.put(Pair.of(cgx.e, bjb.c), cjo.oZ);
      $$0.put(Pair.of(cgx.f, bjb.f), cjo.nC);
   });
   private static final List<aey<clq>> b = List.of(
      clr.a, clr.b, clr.c, clr.d, clr.e, clr.f, clr.g, clr.h, clr.i, clr.j, clr.k, clr.l, clr.m, clr.n, clr.o, clr.p
   );
   private static final List<aey<clo>> c = List.of(clp.a, clp.b, clp.c, clp.d, clp.e, clp.f, clp.g, clp.h, clp.i, clp.j);
   private static final ToIntFunction<aey<clq>> d = ac.e(b);
   private static final ToIntFunction<aey<clo>> e = ac.e(c);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).h()))
      );
   }

   private static int a(dt $$0, cca $$1) {
      cqb $$2 = $$1.dL();
      hn<cln> $$3 = hn.a();
      hq<clq> $$4 = $$2.G_().d(jc.aF);
      hq<clo> $$5 = $$2.G_().d(jc.aE);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cln($$5.d($$4x), $$4.d($$3x))))
         );
      gw $$6 = $$1.dl().a($$1.cD(), 5);
      int $$7 = cgx.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cln $$11 : $$3) {
         for (cgw $$12 : cgx.values()) {
            if ($$12 != cgx.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               byj $$16 = new byj($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bjb $$17 : bjb.values()) {
                  cjg $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cjl $$19 = new cjl($$18);
                     cln.a($$2.G_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgv) {
                        cgv $$20 = (cgv)$$18;
                        if ($$20.d() == cgx.f) {
                           $$16.b($$11.a().a().a($$11.b()).f().f(" ").b($$11.b().a().e()));
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
