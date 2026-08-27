import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cgu {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bpy<?> a(cgt $$0, bpy<cgt> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cjn.a));
      $$1.b(cjn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cgt $$0) {
      ik $$1 = ik.a($$0.dJ().ad(), $$0.dj());
      $$0.dM().a(bya.b, $$1);
   }

   private static void b(cgt $$0, bpy<cgt> $$1) {
      $$1.a(cjn.a, 0, ImmutableList.of(new brv(45, 90), new brz(), brn.a(), btf.a()));
   }

   private static void c(cgt $$0, bpy<cgt> $$1) {
      $$1.a(cjn.b, 10, ImmutableList.of(btb.a(cgu::a), a(), b(), bsr.a(bol.bw, 4)));
   }

   private static void d(cgt $$0, bpy<cgt> $$1) {
      $$1.a(cjn.k, 10, ImmutableList.of(bte.a($$1x -> !a((cgp)$$0, $$1x)), bsu.a(1.0F), brw.a(20)), bya.o);
   }

   private static bsm<cgt> a() {
      return new bsm<>(
         ImmutableList.of(
            Pair.of(bso.a(bol.bw, 8.0F), 1),
            Pair.of(bso.a(bol.ay, 8.0F), 1),
            Pair.of(bso.a(bol.az, 8.0F), 1),
            Pair.of(bso.a(8.0F), 1),
            Pair.of(new bqz(30, 60), 1)
         )
      );
   }

   private static bsm<cgt> b() {
      return new bsm<>(
         ImmutableList.of(
            Pair.of(bsh.a(0.6F), 2),
            Pair.of(brm.a(bol.ay, 8, bya.q, 0.6F, 2), 2),
            Pair.of(brm.a(bol.az, 8, bya.q, 0.6F, 2), 2),
            Pair.of(bth.a(bya.b, 0.6F, 2, 100), 2),
            Pair.of(btg.a(bya.b, 0.6F, 5), 2),
            Pair.of(new bqz(30, 60), 1)
         )
      );
   }

   protected static void b(cgt $$0) {
      bpy<cgt> $$1 = $$0.dM();
      cjn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cjn.k, cjn.b));
      cjn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bya.o));
   }

   private static boolean a(cgp $$0, box $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends box> a(cgp $$0) {
      Optional<box> $$1 = bqr.a($$0, bya.ab);
      if ($$1.isPresent() && bzg.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends box> $$2 = a($$0, bya.l);
         return $$2.isPresent() ? $$2 : $$0.dM().c(bya.M);
      }
   }

   private static Optional<? extends box> a(cgp $$0, bya<? extends box> $$1) {
      return $$0.dM().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cgt $$0, box $$1) {
      if (!($$1 instanceof cgp)) {
         cgr.a($$0, $$1);
      }
   }

   protected static void b(cgt $$0, box $$1) {
      $$0.dM().b(bya.E);
      $$0.dM().a(bya.ab, $$1.ct(), 600L);
   }

   protected static void c(cgt $$0) {
      if ((double)$$0.dJ().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cgt $$0) {
      $$0.dM().g().ifPresent($$1 -> {
         if ($$1 == cjn.k) {
            $$0.gs();
         }
      });
   }
}
