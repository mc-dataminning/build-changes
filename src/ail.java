import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ail {
   private static final Map<Pair<cgl, biq>, civ> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgm.b, biq.f), cjd.oO);
      $$0.put(Pair.of(cgm.b, biq.e), cjd.oP);
      $$0.put(Pair.of(cgm.b, biq.d), cjd.oQ);
      $$0.put(Pair.of(cgm.b, biq.c), cjd.oR);
      $$0.put(Pair.of(cgm.c, biq.f), cjd.oS);
      $$0.put(Pair.of(cgm.c, biq.e), cjd.oT);
      $$0.put(Pair.of(cgm.c, biq.d), cjd.oU);
      $$0.put(Pair.of(cgm.c, biq.c), cjd.oV);
      $$0.put(Pair.of(cgm.d, biq.f), cjd.pa);
      $$0.put(Pair.of(cgm.d, biq.e), cjd.pb);
      $$0.put(Pair.of(cgm.d, biq.d), cjd.pc);
      $$0.put(Pair.of(cgm.d, biq.c), cjd.pd);
      $$0.put(Pair.of(cgm.g, biq.f), cjd.pe);
      $$0.put(Pair.of(cgm.g, biq.e), cjd.pf);
      $$0.put(Pair.of(cgm.g, biq.d), cjd.pg);
      $$0.put(Pair.of(cgm.g, biq.c), cjd.ph);
      $$0.put(Pair.of(cgm.e, biq.f), cjd.oW);
      $$0.put(Pair.of(cgm.e, biq.e), cjd.oX);
      $$0.put(Pair.of(cgm.e, biq.d), cjd.oY);
      $$0.put(Pair.of(cgm.e, biq.c), cjd.oZ);
      $$0.put(Pair.of(cgm.f, biq.f), cjd.nC);
   });
   private static final List<aet<clf>> b = List.of(
      clg.a, clg.b, clg.c, clg.d, clg.e, clg.f, clg.g, clg.h, clg.i, clg.j, clg.k, clg.l, clg.m, clg.n, clg.o, clg.p
   );
   private static final List<aet<cld>> c = List.of(cle.a, cle.b, cle.c, cle.d, cle.e, cle.f, cle.g, cle.h, cle.i, cle.j);
   private static final ToIntFunction<aet<clf>> d = ac.e(b);
   private static final ToIntFunction<aet<cld>> e = ac.e(c);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dt)$$0x.getSource(), ((dt)$$0x.getSource()).h()))
      );
   }

   private static int a(dt $$0, cbp $$1) {
      cpq $$2 = $$1.dK();
      hp<clc> $$3 = hp.a();
      ht<clf> $$4 = $$2.B_().d(je.aE);
      ht<cld> $$5 = $$2.B_().d(je.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new clc($$5.d($$4x), $$4.d($$3x))))
         );
      gw $$6 = $$1.dk().a($$1.cD(), 5);
      int $$7 = cgm.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (clc $$11 : $$3) {
         for (cgl $$12 : cgm.values()) {
            if ($$12 != cgm.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bxy $$16 = new bxy($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (biq $$17 : biq.values()) {
                  civ $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cja $$19 = new cja($$18);
                     clc.a($$2.B_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgk) {
                        cgk $$20 = (cgk)$$18;
                        if ($$20.d() == cgm.f) {
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

      $$0.a(() -> ti.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
