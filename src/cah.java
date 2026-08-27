import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cah {
   public static final int a = 8;
   public static final int b = 4;
   private static final bgl c = asw.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bgl j = bgl.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bki<?> a(bki<cag> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<cag> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bme(45, 90), new bmi()));
   }

   private static void c(bki<cag> $$0) {
      $$0.a(
         cdh.b,
         10,
         ImmutableList.of(
            bky.a(bsj.av, 200),
            new bkt(biw.W, 0.6F),
            bnc.a(bsj.av, 1.0F, 8, true),
            bnk.a(cah::d),
            bol.a(cag::t, bnc.b(bsj.ap, 0.4F, 8, false)),
            bmy.a(8.0F, bgl.a(30, 60)),
            bkw.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bki<cag> $$0) {
      $$0.a(
         cdh.k,
         10,
         ImmutableList.of(
            bky.a(bsj.av, 200), new bkt(biw.W, 0.6F), bnd.a(1.0F), bol.a(cag::t, bmf.a(40)), bol.a(bin::m_, bmf.a(15)), bnn.a(), bll.a(cah::i, bsj.o)
         ),
         bsj.o
      );
   }

   private static void e(bki<cag> $$0) {
      $$0.a(cdh.n, 10, ImmutableList.of(bnc.b(bsj.z, 1.3F, 15, false), a(), bmy.a(8.0F, bgl.a(30, 60)), bll.a(cah::e, bsj.z)), bsj.z);
   }

   private static bmv<cag> a() {
      return new bmv<>(ImmutableList.of(Pair.of(bmq.a(0.4F), 2), Pair.of(bnf.a(0.4F, 3), 2), Pair.of(new blj(30, 60), 1)));
   }

   protected static void a(cag $$0) {
      bki<cag> $$1 = $$0.dN();
      cdh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdh.k, cdh.n, cdh.b));
      cdh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsj.o));
   }

   protected static void a(cag $$0, bji $$1) {
      if (!$$0.m_()) {
         if ($$1.ag() == biw.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cag $$0, bji $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cag $$0, bji $$1) {
      bki<cag> $$3 = $$0.dN();
      bji $$2 = blb.a($$0, $$3.c(bsj.z), $$1);
      $$2 = blb.a($$0, $$3.c(bsj.o), $$2);
      e($$0, $$2);
   }

   private static void e(cag $$0, bji $$1) {
      $$0.dN().b(bsj.o);
      $$0.dN().b(bsj.m);
      $$0.dN().a(bsj.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bji> d(cag $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(bsj.l) : Optional.empty();
   }

   static boolean a(cag $$0, gw $$1) {
      Optional<gw> $$2 = $$0.dN().c(bsj.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cag $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cag $$0) {
      if ($$0.m_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(bsj.ar).orElse(0);
         int $$2 = $$0.dN().c(bsj.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cag $$0, bji $$1) {
      bki<cag> $$2 = $$0.dN();
      $$2.b(bsj.aw);
      $$2.b(bsj.r);
      if ($$0.m_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cag $$0, bji $$1) {
      if (!$$0.dN().c(cdh.n) || $$1.ag() != biw.aw) {
         if ($$1.ag() != biw.W) {
            if (!blb.a($$0, $$1, 4.0)) {
               if (btn.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cag $$0, bji $$1) {
      bki<cag> $$2 = $$0.dN();
      $$2.b(bsj.E);
      $$2.b(bsj.r);
      $$2.a(bsj.o, $$1, 200L);
   }

   private static void h(cag $$0, bji $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cag $$0, bji $$1) {
      if (!c($$0)) {
         Optional<bji> $$2 = $$0.dN().c(bsj.o);
         bji $$3 = blb.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<ape> b(cag $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static ape a(cag $$0, cdh $$1) {
      if ($$1 == cdh.n || $$0.y()) {
         return apf.kS;
      } else if ($$1 == cdh.k) {
         return apf.kN;
      } else {
         return h($$0) ? apf.kS : apf.kM;
      }
   }

   private static List<cag> g(cag $$0) {
      return $$0.dN().c(bsj.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cag $$0) {
      return $$0.dN().a(bsj.av);
   }

   private static boolean i(cag $$0) {
      return $$0.dN().a(bsj.r);
   }

   protected static boolean c(cag $$0) {
      return $$0.dN().a(bsj.aw);
   }
}
