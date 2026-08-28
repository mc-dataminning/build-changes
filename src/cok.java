import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cok {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxd<?> a(coj $$0, bxd<coj> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(crj.a));
      $$1.b(crj.b);
      $$1.f();
      return $$1;
   }

   protected static void a(coj $$0) {
      jp $$1 = jp.a($$0.dV().ah(), $$0.dv());
      $$0.eb().a(cff.b, $$1);
   }

   private static void b(coj $$0, bxd<coj> $$1) {
      $$1.a(crj.a, 0, ImmutableList.of(new bza(45, 90), new bze(), bys.a(), cak.a()));
   }

   private static void c(coj $$0, bxd<coj> $$1) {
      $$1.a(crj.b, 10, ImmutableList.of(cag.a(cok::a), a(), b(), bzw.a(bvm.bS, 4)));
   }

   private static void d(coj $$0, bxd<coj> $$1) {
      $$1.a(crj.k, 10, ImmutableList.of(caj.a(($$1x, $$2) -> !a($$1x, (cof)$$0, $$2)), bzz.a(1.0F), bzb.a(20)), cff.o);
   }

   private static bzr<coj> a() {
      return new bzr<>(
         ImmutableList.of(
            Pair.of(bzt.a(bvm.bS, 8.0F), 1),
            Pair.of(bzt.a(bvm.aS, 8.0F), 1),
            Pair.of(bzt.a(bvm.aT, 8.0F), 1),
            Pair.of(bzt.a(8.0F), 1),
            Pair.of(new bye(30, 60), 1)
         )
      );
   }

   private static bzr<coj> b() {
      return new bzr<>(
         ImmutableList.of(
            Pair.of(bzm.a(0.6F), 2),
            Pair.of(byr.a(bvm.aS, 8, cff.q, 0.6F, 2), 2),
            Pair.of(byr.a(bvm.aT, 8, cff.q, 0.6F, 2), 2),
            Pair.of(cam.a(cff.b, 0.6F, 2, 100), 2),
            Pair.of(cal.a(cff.b, 0.6F, 5), 2),
            Pair.of(new bye(30, 60), 1)
         )
      );
   }

   protected static void b(coj $$0) {
      bxd<coj> $$1 = $$0.eb();
      crj $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crj.k, crj.b));
      crj $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cff.o));
   }

   private static boolean a(ash $$0, cof $$1, bwb $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bwb> a(ash $$0, cof $$1) {
      Optional<bwb> $$2 = bxw.a($$1, cff.ab);
      if ($$2.isPresent() && cgl.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bwb> $$3 = $$1.eb().c(cff.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cff.M);
      }
   }

   protected static void a(ash $$0, coj $$1, bwb $$2) {
      if (!($$2 instanceof cof)) {
         coh.a($$0, $$1, $$2);
      }
   }

   protected static void a(coj $$0, bwb $$1) {
      $$0.eb().b(cff.E);
      $$0.eb().a(cff.ab, $$1.cG(), 600L);
   }

   protected static void c(coj $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(coj $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == crj.k) {
            $$0.gs();
         }
      });
   }
}
