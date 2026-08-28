import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cos {
   public static final int a = 8;
   public static final int b = 4;
   private static final btb c = bam.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final btb j = btb.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bxr<?> a(bxr<cor> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<cor> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new bzo(45, 90), new bzs()));
   }

   private static void c(bxr<cor> $$0) {
      $$0.a(
         crz.b,
         10,
         ImmutableList.of(
            byh.a(cft.ax, 200),
            new byc(bwb.aj, 0.6F, 2),
            cam.a(cft.ax, 1.0F, 8, true),
            cau.a(cos::a),
            cbv.a(cor::x, cam.b(cft.ar, 0.4F, 8, false)),
            cai.a(8.0F, btb.a(30, 60)),
            byf.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bxr<cor> $$0) {
      $$0.a(
         crz.k,
         10,
         ImmutableList.of(
            byh.a(cft.ax, 200), new byc(bwb.aj, 0.6F, 2), can.a(1.0F), cbv.a(cor::x, bzp.a(40)), cbv.a(bvi::n_, bzp.a(15)), cax.a(), byu.a(cos::h, cft.p)
         ),
         cft.p
      );
   }

   private static void e(bxr<cor> $$0) {
      $$0.a(crz.n, 10, ImmutableList.of(cam.b(cft.A, 1.3F, 15, false), a(), cai.a(8.0F, btb.a(30, 60)), byu.a(cos::d, cft.A)), cft.A);
   }

   private static caf<cor> a() {
      return new caf<>(ImmutableList.of(Pair.of(caa.a(0.4F), 2), Pair.of(cap.a(0.4F, 3), 2), Pair.of(new bys(30, 60), 1)));
   }

   protected static void a(cor $$0) {
      bxr<cor> $$1 = $$0.eb();
      crz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crz.k, crz.n, crz.b));
      crz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cft.p));
   }

   protected static void a(cor $$0, bwr $$1) {
      if (!$$0.n_()) {
         if ($$1.aq() == bwb.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cor $$0, bwr $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cor $$0, bwr $$1) {
      bxr<cor> $$3 = $$0.eb();
      bwr $$2 = byk.a($$0, $$3.c(cft.A), $$1);
      $$2 = byk.a($$0, $$3.c(cft.p), $$2);
      d($$0, $$2);
   }

   private static void d(cor $$0, bwr $$1) {
      $$0.eb().b(cft.p);
      $$0.eb().b(cft.n);
      $$0.eb().a(cft.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bwr> a(arn $$0, cor $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cft.l) : Optional.empty();
   }

   static boolean a(cor $$0, jj $$1) {
      Optional<jj> $$2 = $$0.eb().c(cft.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cor $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cor $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cft.at).orElse(0);
         int $$2 = $$0.eb().c(cft.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arn $$0, cor $$1, bwr $$2) {
      bxr<cor> $$3 = $$1.eb();
      $$3.b(cft.ay);
      $$3.b(cft.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arn $$0, cor $$1, bwr $$2) {
      if (!$$1.eb().c(crz.n) || $$2.aq() != bwb.aR) {
         if ($$2.aq() != bwb.aj) {
            if (!byk.a($$1, $$2, 4.0)) {
               if (cgz.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cor $$0, bwr $$1) {
      bxr<cor> $$2 = $$0.eb();
      $$2.b(cft.F);
      $$2.b(cft.s);
      $$2.a(cft.p, $$1, 200L);
   }

   private static void f(cor $$0, bwr $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cor $$0, bwr $$1) {
      if (!c($$0)) {
         Optional<bwr> $$2 = $$0.eb().c(cft.p);
         bwr $$3 = byk.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awj> b(cor $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awj a(cor $$0, crz $$1) {
      if ($$1 == crz.n || $$0.gq()) {
         return awk.mS;
      } else if ($$1 == crz.k) {
         return awk.mN;
      } else {
         return g($$0) ? awk.mS : awk.mM;
      }
   }

   private static List<cor> f(cor $$0) {
      return $$0.eb().c(cft.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cor $$0) {
      return $$0.eb().a(cft.ax);
   }

   private static boolean h(cor $$0) {
      return $$0.eb().a(cft.s);
   }

   protected static boolean c(cor $$0) {
      return $$0.eb().a(cft.ay);
   }
}
