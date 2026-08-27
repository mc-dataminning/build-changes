import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aii {
   private static final Map<Pair<cgi, bin>, cis> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cgj.b, bin.f), cja.oO);
      $$0.put(Pair.of(cgj.b, bin.e), cja.oP);
      $$0.put(Pair.of(cgj.b, bin.d), cja.oQ);
      $$0.put(Pair.of(cgj.b, bin.c), cja.oR);
      $$0.put(Pair.of(cgj.c, bin.f), cja.oS);
      $$0.put(Pair.of(cgj.c, bin.e), cja.oT);
      $$0.put(Pair.of(cgj.c, bin.d), cja.oU);
      $$0.put(Pair.of(cgj.c, bin.c), cja.oV);
      $$0.put(Pair.of(cgj.d, bin.f), cja.pa);
      $$0.put(Pair.of(cgj.d, bin.e), cja.pb);
      $$0.put(Pair.of(cgj.d, bin.d), cja.pc);
      $$0.put(Pair.of(cgj.d, bin.c), cja.pd);
      $$0.put(Pair.of(cgj.g, bin.f), cja.pe);
      $$0.put(Pair.of(cgj.g, bin.e), cja.pf);
      $$0.put(Pair.of(cgj.g, bin.d), cja.pg);
      $$0.put(Pair.of(cgj.g, bin.c), cja.ph);
      $$0.put(Pair.of(cgj.e, bin.f), cja.oW);
      $$0.put(Pair.of(cgj.e, bin.e), cja.oX);
      $$0.put(Pair.of(cgj.e, bin.d), cja.oY);
      $$0.put(Pair.of(cgj.e, bin.c), cja.oZ);
      $$0.put(Pair.of(cgj.f, bin.f), cja.nC);
   });
   private static final List<aeq<clc>> b = List.of(
      cld.a, cld.b, cld.c, cld.d, cld.e, cld.f, cld.g, cld.h, cld.i, cld.j, cld.k, cld.l, cld.m, cld.n, cld.o, cld.p
   );
   private static final List<aeq<cla>> c = List.of(clb.a, clb.b, clb.c, clb.d, clb.e, clb.f, clb.g, clb.h, clb.i, clb.j);
   private static final ToIntFunction<aeq<clc>> d = ac.e(b);
   private static final ToIntFunction<aeq<cla>> e = ac.e(c);

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((dr)$$0x.getSource(), ((dr)$$0x.getSource()).h()))
      );
   }

   private static int a(dr $$0, cbm $$1) {
      cpl $$2 = $$1.dK();
      hn<ckz> $$3 = hn.a();
      hr<clc> $$4 = $$2.B_().d(jc.aE);
      hr<cla> $$5 = $$2.B_().d(jc.aD);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ckz($$5.d($$4x), $$4.d($$3x))))
         );
      gu $$6 = $$1.dk().a($$1.cD(), 5);
      int $$7 = cgj.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (ckz $$11 : $$3) {
         for (cgi $$12 : cgj.values()) {
            if ($$12 != cgj.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bxv $$16 = new bxv($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bin $$17 : bin.values()) {
                  cis $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     cix $$19 = new cix($$18);
                     ckz.a($$2.B_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cgh) {
                        cgh $$20 = (cgh)$$18;
                        if ($$20.d() == cgj.f) {
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
