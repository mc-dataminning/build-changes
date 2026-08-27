import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cho {
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

   protected static bqq<?> a(chn $$0, bqq<chn> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ckj.a));
      $$1.b(ckj.b);
      $$1.f();
      return $$1;
   }

   protected static void a(chn $$0) {
      ik $$1 = ik.a($$0.dM().ad(), $$0.dm());
      $$0.dP().a(bys.b, $$1);
   }

   private static void b(chn $$0, bqq<chn> $$1) {
      $$1.a(ckj.a, 0, ImmutableList.of(new bsn(45, 90), new bsr(), bsf.a(), btx.a()));
   }

   private static void c(chn $$0, bqq<chn> $$1) {
      $$1.a(ckj.b, 10, ImmutableList.of(btt.a(cho::a), a(), b(), btj.a(bpd.by, 4)));
   }

   private static void d(chn $$0, bqq<chn> $$1) {
      $$1.a(ckj.k, 10, ImmutableList.of(btw.a($$1x -> !a((chj)$$0, $$1x)), btm.a(1.0F), bso.a(20)), bys.o);
   }

   private static bte<chn> a() {
      return new bte<>(
         ImmutableList.of(
            Pair.of(btg.a(bpd.by, 8.0F), 1),
            Pair.of(btg.a(bpd.aA, 8.0F), 1),
            Pair.of(btg.a(bpd.aB, 8.0F), 1),
            Pair.of(btg.a(8.0F), 1),
            Pair.of(new brr(30, 60), 1)
         )
      );
   }

   private static bte<chn> b() {
      return new bte<>(
         ImmutableList.of(
            Pair.of(bsz.a(0.6F), 2),
            Pair.of(bse.a(bpd.aA, 8, bys.q, 0.6F, 2), 2),
            Pair.of(bse.a(bpd.aB, 8, bys.q, 0.6F, 2), 2),
            Pair.of(btz.a(bys.b, 0.6F, 2, 100), 2),
            Pair.of(bty.a(bys.b, 0.6F, 5), 2),
            Pair.of(new brr(30, 60), 1)
         )
      );
   }

   protected static void b(chn $$0) {
      bqq<chn> $$1 = $$0.dP();
      ckj $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ckj.k, ckj.b));
      ckj $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bys.o));
   }

   private static boolean a(chj $$0, bpp $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bpp> a(chj $$0) {
      Optional<bpp> $$1 = brj.a($$0, bys.ab);
      if ($$1.isPresent() && bzy.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bpp> $$2 = a($$0, bys.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(bys.M);
      }
   }

   private static Optional<? extends bpp> a(chj $$0, bys<? extends bpp> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(chn $$0, bpp $$1) {
      if (!($$1 instanceof chj)) {
         chl.a($$0, $$1);
      }
   }

   protected static void b(chn $$0, bpp $$1) {
      $$0.dP().b(bys.E);
      $$0.dP().a(bys.ab, $$1.cw(), 600L);
   }

   protected static void c(chn $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(chn $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == ckj.k) {
            $$0.gu();
         }
      });
   }
}
