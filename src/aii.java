import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aii {
   private static final Map<Pair<cgj, bin>, cit> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgk.b, bin.f), cjb.oO);
      $$0.put(Pair.of(cgk.b, bin.e), cjb.oP);
      $$0.put(Pair.of(cgk.b, bin.d), cjb.oQ);
      $$0.put(Pair.of(cgk.b, bin.c), cjb.oR);
      $$0.put(Pair.of(cgk.c, bin.f), cjb.oS);
      $$0.put(Pair.of(cgk.c, bin.e), cjb.oT);
      $$0.put(Pair.of(cgk.c, bin.d), cjb.oU);
      $$0.put(Pair.of(cgk.c, bin.c), cjb.oV);
      $$0.put(Pair.of(cgk.d, bin.f), cjb.pa);
      $$0.put(Pair.of(cgk.d, bin.e), cjb.pb);
      $$0.put(Pair.of(cgk.d, bin.d), cjb.pc);
      $$0.put(Pair.of(cgk.d, bin.c), cjb.pd);
      $$0.put(Pair.of(cgk.g, bin.f), cjb.pe);
      $$0.put(Pair.of(cgk.g, bin.e), cjb.pf);
      $$0.put(Pair.of(cgk.g, bin.d), cjb.pg);
      $$0.put(Pair.of(cgk.g, bin.c), cjb.ph);
      $$0.put(Pair.of(cgk.e, bin.f), cjb.oW);
      $$0.put(Pair.of(cgk.e, bin.e), cjb.oX);
      $$0.put(Pair.of(cgk.e, bin.d), cjb.oY);
      $$0.put(Pair.of(cgk.e, bin.c), cjb.oZ);
      $$0.put(Pair.of(cgk.f, bin.f), cjb.nC);
   });
   private static final List<aeq<cld>> b = List.of(
      cle.a, cle.b, cle.c, cle.d, cle.e, cle.f, cle.g, cle.h, cle.i, cle.j, cle.k, cle.l, cle.m, cle.n, cle.o, cle.p
   );
   private static final List<aeq<clb>> c = List.of(clc.a, clc.b, clc.c, clc.d, clc.e, clc.f, clc.g, clc.h, clc.i, clc.j);
   private static final ToIntFunction<aeq<cld>> d = ac.e(b);
   private static final ToIntFunction<aeq<clb>> e = ac.e(c);

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dr)$$0x.getSource(), ((dr)$$0x.getSource()).h()))
      );
   }

   private static int a(dr $$0, cbn $$1) {
      cpm $$2 = $$1.dK();
      hn<cla> $$3 = hn.a();
      hr<cld> $$4 = $$2.B_().d(jc.aE);
      hr<clb> $$5 = $$2.B_().d(jc.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cla($$5.d($$4x), $$4.d($$3x))))
         );
      gu $$6 = $$1.dk().a($$1.cD(), 5);
      int $$7 = cgk.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cla $$11 : $$3) {
         for (cgj $$12 : cgk.values()) {
            if ($$12 != cgk.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bxw $$16 = new bxw($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bin $$17 : bin.values()) {
                  cit $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     ciy $$19 = new ciy($$18);
                     cla.a($$2.B_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgi) {
                        cgi $$20 = (cgi)$$18;
                        if ($$20.d() == cgk.f) {
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

      $$0.a(() -> tf.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
