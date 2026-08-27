import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aka {
   private static final Map<Pair<ciu, bkv>, cle> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(civ.b, bkv.f), clm.pz);
      $$0.put(Pair.of(civ.b, bkv.e), clm.pA);
      $$0.put(Pair.of(civ.b, bkv.d), clm.pB);
      $$0.put(Pair.of(civ.b, bkv.c), clm.pC);
      $$0.put(Pair.of(civ.c, bkv.f), clm.pD);
      $$0.put(Pair.of(civ.c, bkv.e), clm.pE);
      $$0.put(Pair.of(civ.c, bkv.d), clm.pF);
      $$0.put(Pair.of(civ.c, bkv.c), clm.pG);
      $$0.put(Pair.of(civ.d, bkv.f), clm.pL);
      $$0.put(Pair.of(civ.d, bkv.e), clm.pM);
      $$0.put(Pair.of(civ.d, bkv.d), clm.pN);
      $$0.put(Pair.of(civ.d, bkv.c), clm.pO);
      $$0.put(Pair.of(civ.g, bkv.f), clm.pP);
      $$0.put(Pair.of(civ.g, bkv.e), clm.pQ);
      $$0.put(Pair.of(civ.g, bkv.d), clm.pR);
      $$0.put(Pair.of(civ.g, bkv.c), clm.pS);
      $$0.put(Pair.of(civ.e, bkv.f), clm.pH);
      $$0.put(Pair.of(civ.e, bkv.e), clm.pI);
      $$0.put(Pair.of(civ.e, bkv.d), clm.pJ);
      $$0.put(Pair.of(civ.e, bkv.c), clm.pK);
      $$0.put(Pair.of(civ.f, bkv.f), clm.on);
   });
   private static final List<agh<cno>> b = List.of(
      cnp.a, cnp.b, cnp.c, cnp.d, cnp.e, cnp.f, cnp.g, cnp.h, cnp.i, cnp.j, cnp.k, cnp.l, cnp.m, cnp.n, cnp.o, cnp.p
   );
   private static final List<agh<cnm>> c = List.of(cnn.a, cnn.b, cnn.c, cnn.d, cnn.e, cnn.f, cnn.g, cnn.h, cnn.i, cnn.j);
   private static final ToIntFunction<agh<cno>> d = ac.e(b);
   private static final ToIntFunction<agh<cnm>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).i()))
      );
   }

   private static int a(du $$0, cdu $$1) {
      csa $$2 = $$1.dN();
      il<cnl> $$3 = il.a();
      io<cno> $$4 = $$2.H_().d(jz.aG);
      io<cnm> $$5 = $$2.H_().d(jz.aF);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cnl($$5.d($$4x), $$4.d($$3x))))
         );
      ht $$6 = $$1.dn().a($$1.cE(), 5);
      int $$7 = civ.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cnl $$11 : $$3) {
         for (ciu $$12 : civ.values()) {
            if ($$12 != civ.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               cad $$16 = new cad($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bkv $$17 : bkv.values()) {
                  cle $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     clj $$19 = new clj($$18);
                     cnl.a($$2.H_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cit) {
                        cit $$20 = (cit)$$18;
                        if ($$20.d() == civ.f) {
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

      $$0.a(() -> ur.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
