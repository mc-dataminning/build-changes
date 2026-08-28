import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpc {
   public static final int a = 8;
   public static final int b = 4;
   private static final btj c = bao.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final btj j = btj.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxz<?> a(bxz<cpb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<cpb> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new bzw(45, 90), new caa()));
   }

   private static void c(bxz<cpb> $$0) {
      $$0.a(
         csl.b,
         10,
         ImmutableList.of(
            byp.a(cgb.ax, 200),
            new byk(bwj.aj, 0.6F, 2),
            cau.a(cgb.ax, 1.0F, 8, true),
            cbc.a(cpc::a),
            ccd.a(cpb::x, cau.b(cgb.ar, 0.4F, 8, false)),
            caq.a(8.0F, btj.a(30, 60)),
            byn.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxz<cpb> $$0) {
      $$0.a(
         csl.k,
         10,
         ImmutableList.of(
            byp.a(cgb.ax, 200), new byk(bwj.aj, 0.6F, 2), cav.a(1.0F), ccd.a(cpb::x, bzx.a(40)), ccd.a(bvq::n_, bzx.a(15)), cbf.a(), bzc.a(cpc::h, cgb.p)
         ),
         cgb.p
      );
   }

   private static void e(bxz<cpb> $$0) {
      $$0.a(csl.n, 10, ImmutableList.of(cau.b(cgb.A, 1.3F, 15, false), a(), caq.a(8.0F, btj.a(30, 60)), bzc.a(cpc::d, cgb.A)), cgb.A);
   }

   private static can<cpb> a() {
      return new can<>(ImmutableList.of(Pair.of(cai.a(0.4F), 2), Pair.of(cax.a(0.4F, 3), 2), Pair.of(new bza(30, 60), 1)));
   }

   protected static void a(cpb $$0) {
      bxz<cpb> $$1 = $$0.eb();
      csl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csl.k, csl.n, csl.b));
      csl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgb.p));
   }

   protected static void a(cpb $$0, bwz $$1) {
      if (!$$0.n_()) {
         if ($$1.aq() == bwj.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cpb $$0, bwz $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cpb $$0, bwz $$1) {
      bxz<cpb> $$3 = $$0.eb();
      bwz $$2 = bys.a($$0, $$3.c(cgb.A), $$1);
      $$2 = bys.a($$0, $$3.c(cgb.p), $$2);
      d($$0, $$2);
   }

   private static void d(cpb $$0, bwz $$1) {
      $$0.eb().b(cgb.p);
      $$0.eb().b(cgb.n);
      $$0.eb().a(cgb.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bwz> a(aro $$0, cpb $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cgb.l) : Optional.empty();
   }

   static boolean a(cpb $$0, iu $$1) {
      Optional<iu> $$2 = $$0.eb().c(cgb.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cpb $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cpb $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cgb.at).orElse(0);
         int $$2 = $$0.eb().c(cgb.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(aro $$0, cpb $$1, bwz $$2) {
      bxz<cpb> $$3 = $$1.eb();
      $$3.b(cgb.ay);
      $$3.b(cgb.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(aro $$0, cpb $$1, bwz $$2) {
      if (!$$1.eb().c(csl.n) || $$2.aq() != bwj.aR) {
         if ($$2.aq() != bwj.aj) {
            if (!bys.a($$1, $$2, 4.0)) {
               if (chh.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cpb $$0, bwz $$1) {
      bxz<cpb> $$2 = $$0.eb();
      $$2.b(cgb.F);
      $$2.b(cgb.s);
      $$2.a(cgb.p, $$1, 200L);
   }

   private static void f(cpb $$0, bwz $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cpb $$0, bwz $$1) {
      if (!c($$0)) {
         Optional<bwz> $$2 = $$0.eb().c(cgb.p);
         bwz $$3 = bys.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awk> b(cpb $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awk a(cpb $$0, csl $$1) {
      if ($$1 == csl.n || $$0.gq()) {
         return awl.mS;
      } else if ($$1 == csl.k) {
         return awl.mN;
      } else {
         return g($$0) ? awl.mS : awl.mM;
      }
   }

   private static List<cpb> f(cpb $$0) {
      return $$0.eb().c(cgb.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cpb $$0) {
      return $$0.eb().a(cgb.ax);
   }

   private static boolean h(cpb $$0) {
      return $$0.eb().a(cgb.s);
   }

   protected static boolean c(cpb $$0) {
      return $$0.eb().a(cgb.ay);
   }
}
