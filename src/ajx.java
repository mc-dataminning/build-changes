import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class ajx {
   private static final Map<Pair<cim, bkn>, ckw> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(cin.b, bkn.f), cle.oO);
      $$0.put(Pair.of(cin.b, bkn.e), cle.oP);
      $$0.put(Pair.of(cin.b, bkn.d), cle.oQ);
      $$0.put(Pair.of(cin.b, bkn.c), cle.oR);
      $$0.put(Pair.of(cin.c, bkn.f), cle.oS);
      $$0.put(Pair.of(cin.c, bkn.e), cle.oT);
      $$0.put(Pair.of(cin.c, bkn.d), cle.oU);
      $$0.put(Pair.of(cin.c, bkn.c), cle.oV);
      $$0.put(Pair.of(cin.d, bkn.f), cle.pa);
      $$0.put(Pair.of(cin.d, bkn.e), cle.pb);
      $$0.put(Pair.of(cin.d, bkn.d), cle.pc);
      $$0.put(Pair.of(cin.d, bkn.c), cle.pd);
      $$0.put(Pair.of(cin.g, bkn.f), cle.pe);
      $$0.put(Pair.of(cin.g, bkn.e), cle.pf);
      $$0.put(Pair.of(cin.g, bkn.d), cle.pg);
      $$0.put(Pair.of(cin.g, bkn.c), cle.ph);
      $$0.put(Pair.of(cin.e, bkn.f), cle.oW);
      $$0.put(Pair.of(cin.e, bkn.e), cle.oX);
      $$0.put(Pair.of(cin.e, bkn.d), cle.oY);
      $$0.put(Pair.of(cin.e, bkn.c), cle.oZ);
      $$0.put(Pair.of(cin.f, bkn.f), cle.nC);
   });
   private static final List<agf<cng>> b = List.of(
      cnh.a, cnh.b, cnh.c, cnh.d, cnh.e, cnh.f, cnh.g, cnh.h, cnh.i, cnh.j, cnh.k, cnh.l, cnh.m, cnh.n, cnh.o, cnh.p
   );
   private static final List<agf<cne>> c = List.of(cnf.a, cnf.b, cnf.c, cnf.d, cnf.e, cnf.f, cnf.g, cnf.h, cnf.i, cnf.j);
   private static final ToIntFunction<agf<cng>> d = ac.e(b);
   private static final ToIntFunction<agf<cne>> e = ac.e(c);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((du)$$0x.getSource(), ((du)$$0x.getSource()).i()))
      );
   }

   private static int a(du $$0, cdm $$1) {
      crs $$2 = $$1.dL();
      il<cnd> $$3 = il.a();
      io<cng> $$4 = $$2.H_().d(jz.aG);
      io<cne> $$5 = $$2.H_().d(jz.aF);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.c($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.c($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cnd($$5.d($$4x), $$4.d($$3x))))
         );
      ht $$6 = $$1.dl().a($$1.cD(), 5);
      int $$7 = cin.values().length - 1;
      double $$8 = 3.0;
      int $$9 = 0;
      int $$10 = 0;

      for (cnd $$11 : $$3) {
         for (cim $$12 : cin.values()) {
            if ($$12 != cin.a) {
               double $$13 = (double)$$6.u() + 0.5 - (double)($$9 % $$5.b()) * 3.0;
               double $$14 = (double)$$6.v() + 0.5 + (double)($$10 % $$7) * 3.0;
               double $$15 = (double)$$6.w() + 0.5 + (double)($$9 / $$5.b() * 10);
               bzv $$16 = new bzv($$2, $$13, $$14, $$15);
               $$16.r(180.0F);
               $$16.e(true);

               for (bkn $$17 : bkn.values()) {
                  ckw $$18 = a.get(Pair.of($$12, $$17));
                  if ($$18 != null) {
                     clb $$19 = new clb($$18);
                     cnd.a($$2.H_(), $$19, $$11);
                     $$16.a($$17, $$19);
                     if ($$18 instanceof cil) {
                        cil $$20 = (cil)$$18;
                        if ($$20.d() == cin.f) {
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
