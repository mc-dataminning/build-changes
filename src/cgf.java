import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cgf {
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

   protected static bpj<?> a(cge $$0, bpj<cge> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ciy.a));
      $$1.b(ciy.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cge $$0) {
      ii $$1 = ii.a($$0.dM().ad(), $$0.dm());
      $$0.dO().a(bxl.b, $$1);
   }

   private static void b(cge $$0, bpj<cge> $$1) {
      $$1.a(ciy.a, 0, ImmutableList.of(new brg(45, 90), new brk(), bqy.a(), bsq.a()));
   }

   private static void c(cge $$0, bpj<cge> $$1) {
      $$1.a(ciy.b, 10, ImmutableList.of(bsm.a(cgf::a), a(), b(), bsc.a(bnw.bw, 4)));
   }

   private static void d(cge $$0, bpj<cge> $$1) {
      $$1.a(ciy.k, 10, ImmutableList.of(bsp.a($$1x -> !a((cga)$$0, $$1x)), bsf.a(1.0F), brh.a(20)), bxl.o);
   }

   private static brx<cge> a() {
      return new brx<>(
         ImmutableList.of(
            Pair.of(brz.a(bnw.bw, 8.0F), 1),
            Pair.of(brz.a(bnw.ay, 8.0F), 1),
            Pair.of(brz.a(bnw.az, 8.0F), 1),
            Pair.of(brz.a(8.0F), 1),
            Pair.of(new bqk(30, 60), 1)
         )
      );
   }

   private static brx<cge> b() {
      return new brx<>(
         ImmutableList.of(
            Pair.of(brs.a(0.6F), 2),
            Pair.of(bqx.a(bnw.ay, 8, bxl.q, 0.6F, 2), 2),
            Pair.of(bqx.a(bnw.az, 8, bxl.q, 0.6F, 2), 2),
            Pair.of(bss.a(bxl.b, 0.6F, 2, 100), 2),
            Pair.of(bsr.a(bxl.b, 0.6F, 5), 2),
            Pair.of(new bqk(30, 60), 1)
         )
      );
   }

   protected static void b(cge $$0) {
      bpj<cge> $$1 = $$0.dO();
      ciy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ciy.k, ciy.b));
      ciy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bxl.o));
   }

   private static boolean a(cga $$0, boi $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends boi> a(cga $$0) {
      Optional<boi> $$1 = bqc.a($$0, bxl.ab);
      if ($$1.isPresent() && byr.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends boi> $$2 = a($$0, bxl.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bxl.M);
      }
   }

   private static Optional<? extends boi> a(cga $$0, bxl<? extends boi> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cge $$0, boi $$1) {
      if (!($$1 instanceof cga)) {
         cgc.a($$0, $$1);
      }
   }

   protected static void b(cge $$0, boi $$1) {
      $$0.dO().b(bxl.E);
      $$0.dO().a(bxl.ab, $$1.cw(), 600L);
   }

   protected static void c(cge $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cge $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == ciy.k) {
            $$0.gn();
         }
      });
   }
}
