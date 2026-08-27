import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ajn {
   private static final Map<Pair<chu, bjy>, cke> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(chv.b, bjy.f), ckm.oO);
      $$0.put(Pair.of(chv.b, bjy.e), ckm.oP);
      $$0.put(Pair.of(chv.b, bjy.d), ckm.oQ);
      $$0.put(Pair.of(chv.b, bjy.c), ckm.oR);
      $$0.put(Pair.of(chv.c, bjy.f), ckm.oS);
      $$0.put(Pair.of(chv.c, bjy.e), ckm.oT);
      $$0.put(Pair.of(chv.c, bjy.d), ckm.oU);
      $$0.put(Pair.of(chv.c, bjy.c), ckm.oV);
      $$0.put(Pair.of(chv.d, bjy.f), ckm.pa);
      $$0.put(Pair.of(chv.d, bjy.e), ckm.pb);
      $$0.put(Pair.of(chv.d, bjy.d), ckm.pc);
      $$0.put(Pair.of(chv.d, bjy.c), ckm.pd);
      $$0.put(Pair.of(chv.g, bjy.f), ckm.pe);
      $$0.put(Pair.of(chv.g, bjy.e), ckm.pf);
      $$0.put(Pair.of(chv.g, bjy.d), ckm.pg);
      $$0.put(Pair.of(chv.g, bjy.c), ckm.ph);
      $$0.put(Pair.of(chv.e, bjy.f), ckm.oW);
      $$0.put(Pair.of(chv.e, bjy.e), ckm.oX);
      $$0.put(Pair.of(chv.e, bjy.d), ckm.oY);
      $$0.put(Pair.of(chv.e, bjy.c), ckm.oZ);
      $$0.put(Pair.of(chv.f, bjy.f), ckm.nC);
   });
   private static final List<afv<cmo>> b = List.of(
      cmp.a, cmp.b, cmp.c, cmp.d, cmp.e, cmp.f, cmp.g, cmp.h, cmp.i, cmp.j, cmp.k, cmp.l, cmp.m, cmp.n, cmp.o, cmp.p
   );
   private static final List<afv<cmm>> c = List.of(cmn.a, cmn.b, cmn.c, cmn.d, cmn.e, cmn.f, cmn.g, cmn.h, cmn.i, cmn.j);
   private static final ToIntFunction<afv<cmo>> d = ac.e(b);
   private static final ToIntFunction<afv<cmm>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).i()))
      );
   }

   private static int a(du $$0, ccx $$1) {
      cqz $$2 = $$1.dL();
      il<cml> $$3 = il.a();
      io<cmo> $$4 = $$2.H_().d(jz.aF);
      io<cmm> $$5 = $$2.H_().d(jz.aE);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cml($$5.d($$4x), $$4.d($$3x))))
         );
      ht $$6 = $$1.dl().a($$1.cD(), 5);
      int $$7 = chv.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cml $$11 : $$3) {
         for (chu $$12 : chv.values()) {
            if ($$12 != chv.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bzg $$16 = new bzg($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bjy $$17 : bjy.values()) {
                  cke $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     ckj $$19 = new ckj($$18);
                     cml.a($$2.H_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cht) {
                        cht $$20 = (cht)$$18;
                        if ($$20.d() == chv.f) {
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

      $$0.a(() -> ui.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
