import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cdl {
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

   protected static bmv<?> a(cdk $$0, bmv<cdk> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cgd.a));
      $$1.b(cgd.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cdk $$0) {
      id $$1 = id.a($$0.dM().ad(), $$0.dm());
      $$0.dO().a(bux.b, $$1);
   }

   private static void b(cdk $$0, bmv<cdk> $$1) {
      $$1.a(cgd.a, 0, ImmutableList.of(new bos(45, 90), new bow(), bok.a(), bqc.a()));
   }

   private static void c(cdk $$0, bmv<cdk> $$1) {
      $$1.a(cgd.b, 10, ImmutableList.of(bpy.a(cdl::a), a(), b(), bpo.a(blj.bv, 4)));
   }

   private static void d(cdk $$0, bmv<cdk> $$1) {
      $$1.a(cgd.k, 10, ImmutableList.of(bqb.a($$1x -> !a((cdg)$$0, $$1x)), bpr.a(1.0F), bot.a(20)), bux.o);
   }

   private static bpj<cdk> a() {
      return new bpj<>(
         ImmutableList.of(
            Pair.of(bpl.a(blj.bv, 8.0F), 1),
            Pair.of(bpl.a(blj.ax, 8.0F), 1),
            Pair.of(bpl.a(blj.ay, 8.0F), 1),
            Pair.of(bpl.a(8.0F), 1),
            Pair.of(new bnw(30, 60), 1)
         )
      );
   }

   private static bpj<cdk> b() {
      return new bpj<>(
         ImmutableList.of(
            Pair.of(bpe.a(0.6F), 2),
            Pair.of(boj.a(blj.ax, 8, bux.q, 0.6F, 2), 2),
            Pair.of(boj.a(blj.ay, 8, bux.q, 0.6F, 2), 2),
            Pair.of(bqe.a(bux.b, 0.6F, 2, 100), 2),
            Pair.of(bqd.a(bux.b, 0.6F, 5), 2),
            Pair.of(new bnw(30, 60), 1)
         )
      );
   }

   protected static void b(cdk $$0) {
      bmv<cdk> $$1 = $$0.dO();
      cgd $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgd.k, cgd.b));
      cgd $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bux.o));
   }

   private static boolean a(cdg $$0, blv $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends blv> a(cdg $$0) {
      Optional<blv> $$1 = bno.a($$0, bux.aa);
      if ($$1.isPresent() && bwc.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends blv> $$2 = a($$0, bux.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bux.L);
      }
   }

   private static Optional<? extends blv> a(cdg $$0, bux<? extends blv> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cdk $$0, blv $$1) {
      if (!($$1 instanceof cdg)) {
         cdi.a($$0, $$1);
      }
   }

   protected static void b(cdk $$0, blv $$1) {
      $$0.dO().b(bux.E);
      $$0.dO().a(bux.aa, $$1.cw(), 600L);
   }

   protected static void c(cdk $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cdk $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == cgd.k) {
            $$0.gl();
         }
      });
   }
}
