import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ccf {
   public static final int a = 8;
   public static final int b = 4;
   private static final bii c = aul.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bii j = bii.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bmg<?> a(bmg<cce> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<cce> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new boc(45, 90), new bog()));
   }

   private static void c(bmg<cce> $$0) {
      $$0.a(
         cff.b,
         10,
         ImmutableList.of(
            bmw.a(buh.av, 200),
            new bmr(bku.W, 0.6F),
            bpa.a(buh.av, 1.0F, 8, true),
            bpi.a(ccf::d),
            bqj.a(cce::w, bpa.b(buh.ap, 0.4F, 8, false)),
            bow.a(8.0F, bii.a(30, 60)),
            bmu.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bmg<cce> $$0) {
      $$0.a(
         cff.k,
         10,
         ImmutableList.of(
            bmw.a(buh.av, 200), new bmr(bku.W, 0.6F), bpb.a(1.0F), bqj.a(cce::w, bod.a(40)), bqj.a(bkl::n_, bod.a(15)), bpl.a(), bnj.a(ccf::i, buh.o)
         ),
         buh.o
      );
   }

   private static void e(bmg<cce> $$0) {
      $$0.a(cff.n, 10, ImmutableList.of(bpa.b(buh.z, 1.3F, 15, false), a(), bow.a(8.0F, bii.a(30, 60)), bnj.a(ccf::e, buh.z)), buh.z);
   }

   private static bot<cce> a() {
      return new bot<>(ImmutableList.of(Pair.of(boo.a(0.4F), 2), Pair.of(bpd.a(0.4F, 3), 2), Pair.of(new bnh(30, 60), 1)));
   }

   protected static void a(cce $$0) {
      bmg<cce> $$1 = $$0.dP();
      cff $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cff.k, cff.n, cff.b));
      cff $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(buh.o));
   }

   protected static void a(cce $$0, blg $$1) {
      if (!$$0.n_()) {
         if ($$1.ai() == bku.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cce $$0, blg $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cce $$0, blg $$1) {
      bmg<cce> $$3 = $$0.dP();
      blg $$2 = bmz.a($$0, $$3.c(buh.z), $$1);
      $$2 = bmz.a($$0, $$3.c(buh.o), $$2);
      e($$0, $$2);
   }

   private static void e(cce $$0, blg $$1) {
      $$0.dP().b(buh.o);
      $$0.dP().b(buh.m);
      $$0.dP().a(buh.z, $$1, (long)c.a($$0.dN().z));
   }

   private static Optional<? extends blg> d(cce $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(buh.l) : Optional.empty();
   }

   static boolean a(cce $$0, ht $$1) {
      Optional<ht> $$2 = $$0.dP().c(buh.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cce $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cce $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(buh.ar).orElse(0);
         int $$2 = $$0.dP().c(buh.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cce $$0, blg $$1) {
      bmg<cce> $$2 = $$0.dP();
      $$2.b(buh.aw);
      $$2.b(buh.r);
      if ($$0.n_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cce $$0, blg $$1) {
      if (!$$0.dP().c(cff.n) || $$1.ai() != bku.aw) {
         if ($$1.ai() != bku.W) {
            if (!bmz.a($$0, $$1, 4.0)) {
               if (bvl.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cce $$0, blg $$1) {
      bmg<cce> $$2 = $$0.dP();
      $$2.b(buh.E);
      $$2.b(buh.r);
      $$2.a(buh.o, $$1, 200L);
   }

   private static void h(cce $$0, blg $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cce $$0, blg $$1) {
      if (!c($$0)) {
         Optional<blg> $$2 = $$0.dP().c(buh.o);
         blg $$3 = bmz.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aqq> b(cce $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static aqq a(cce $$0, cff $$1) {
      if ($$1 == cff.n || $$0.A()) {
         return aqr.lm;
      } else if ($$1 == cff.k) {
         return aqr.lh;
      } else {
         return h($$0) ? aqr.lm : aqr.lg;
      }
   }

   private static List<cce> g(cce $$0) {
      return $$0.dP().c(buh.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cce $$0) {
      return $$0.dP().a(buh.av);
   }

   private static boolean i(cce $$0) {
      return $$0.dP().a(buh.r);
   }

   protected static boolean c(cce $$0) {
      return $$0.dP().a(buh.aw);
   }
}
