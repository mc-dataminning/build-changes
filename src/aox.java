import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.datafixers.util.Pair;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class aox {
   private static final Map<Pair<jn<ctj>, btw>, cvk> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(Pair.of(ctk.i, btw.f), cvt.pD);
      $$0.put(Pair.of(ctk.i, btw.e), cvt.pE);
      $$0.put(Pair.of(ctk.i, btw.d), cvt.pF);
      $$0.put(Pair.of(ctk.i, btw.c), cvt.pG);
      $$0.put(Pair.of(ctk.j, btw.f), cvt.pH);
      $$0.put(Pair.of(ctk.j, btw.e), cvt.pI);
      $$0.put(Pair.of(ctk.j, btw.d), cvt.pJ);
      $$0.put(Pair.of(ctk.j, btw.c), cvt.pK);
      $$0.put(Pair.of(ctk.k, btw.f), cvt.pP);
      $$0.put(Pair.of(ctk.k, btw.e), cvt.pQ);
      $$0.put(Pair.of(ctk.k, btw.d), cvt.pR);
      $$0.put(Pair.of(ctk.k, btw.c), cvt.pS);
      $$0.put(Pair.of(ctk.n, btw.f), cvt.pT);
      $$0.put(Pair.of(ctk.n, btw.e), cvt.pU);
      $$0.put(Pair.of(ctk.n, btw.d), cvt.pV);
      $$0.put(Pair.of(ctk.n, btw.c), cvt.pW);
      $$0.put(Pair.of(ctk.l, btw.f), cvt.pL);
      $$0.put(Pair.of(ctk.l, btw.e), cvt.pM);
      $$0.put(Pair.of(ctk.l, btw.d), cvt.pN);
      $$0.put(Pair.of(ctk.l, btw.c), cvt.pO);
      $$0.put(Pair.of(ctk.m, btw.f), cvt.op);
   });
   private static final List<alb<cxu>> b = List.of(
      cxv.a, cxv.b, cxv.c, cxv.d, cxv.e, cxv.f, cxv.g, cxv.h, cxv.i, cxv.j, cxv.k, cxv.l, cxv.m, cxv.n, cxv.o, cxv.p, cxv.q, cxv.r
   );
   private static final List<alb<cxs>> c = List.of(cxt.a, cxt.b, cxt.c, cxt.d, cxt.e, cxt.f, cxt.g, cxt.h, cxt.i, cxt.j);
   private static final ToIntFunction<alb<cxu>> d = ad.g(b);
   private static final ToIntFunction<alb<cxs>> e = ad.g(c);

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((et)$$0x.getSource(), ((et)$$0x.getSource()).h()))
      );
   }

   private static int a(et $$0, cnu $$1) {
      deg $$2 = $$1.dS();
      jw<cxr> $$3 = jw.a();
      ka<cxu> $$4 = $$2.F_().d(lv.aY);
      ka<cxs> $$5 = $$2.F_().d(lv.aX);
      $$4.s()
         .sorted(Comparator.comparing($$1x -> d.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> e.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new cxr($$5.e($$4x), $$4.e($$3x))))
         );
      je $$6 = $$1.ds().a($$1.cL(), 5);
      ka<ctj> $$7 = $$0.v().d(lv.az);
      int $$8 = $$7.c() - 1;
      double $$9 = 3.0;
      int $$10 = 0;
      int $$11 = 0;

      for (cxr $$12 : $$3) {
         for (ctj $$13 : $$7) {
            if ($$13 != ctk.h.a()) {
               double $$14 = (double)$$6.u() + 0.5 - (double)($$10 % $$5.c()) * 3.0;
               double $$15 = (double)$$6.v() + 0.5 + (double)($$11 % $$8) * 3.0;
               double $$16 = (double)$$6.w() + 0.5 + (double)($$10 / $$5.c() * 10);
               cjt $$17 = new cjt($$2, $$14, $$15, $$16);
               $$17.v(180.0F);
               $$17.f(true);

               for (btw $$18 : btw.values()) {
                  cvk $$19 = a.get(Pair.of($$13, $$18));
                  if ($$19 != null) {
                     cvp $$20 = new cvp($$19);
                     $$20.b(kr.P, $$12);
                     $$17.a($$18, $$20);
                     if ($$19 instanceof cti) {
                        cti $$21 = (cti)$$19;
                        if ($$21.g().a(ctk.m)) {
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

      $$0.a(() -> xd.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
