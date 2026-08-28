import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cpy {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cif<? extends cie<? super cpx>>> e = ImmutableList.of(cif.c, cif.f, cif.d, cif.z);
   static final List<cgy<?>> f = ImmutableList.of(
      cgy.o, cgy.h, cgy.C, cgy.F, cgy.p, cgy.n, cgy.aV, cgy.ba, cgy.aW, cgy.aX, cgy.aY, cgy.aZ, new cgy[]{cgy.bb, cgy.bc, cgy.y, cgy.z, cgy.u}
   );
   private static final int g = 100;

   protected static byw<?> a(cpx $$0, byw<cpx> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(ctt.a));
      $$1.b(ctt.k);
      $$1.f();
      return $$1;
   }

   private static void a(byw<cpx> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new cat(45, 90)));
   }

   private static void b(byw<cpx> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbz.a(($$0x, $$1) -> $$1.ec().c(cgy.C))),
            Pair.of(1, cbz.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cpy.a(20, 40)),
            Pair.of(3, new cbk(ImmutableList.of(Pair.of(new bzx(20, 100), 1), Pair.of(cbf.a(0.6F), 2))))
         )
      );
   }

   private static void b(cpx $$0, byw<cpx> $$1) {
      $$1.a(
         ctt.k,
         ImmutableList.of(
            Pair.of(0, ccc.a(cie.a($$0, 100).negate()::test)), Pair.of(1, new cqb()), Pair.of(2, new cqa()), Pair.of(3, new cqc()), Pair.of(4, new cqd())
         ),
         ImmutableSet.of(Pair.of(cgy.p, cgz.a), Pair.of(cgy.n, cgz.b))
      );
   }

   static void a(cpx $$0) {
      $$0.ec().a(ImmutableList.of(ctt.k, ctt.b));
   }

   public static class a extends cax {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aru $$0, bxy $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awr.cM);
         $$1.b(byi.p);
      }

      @Override
      protected void b(aru $$0, bxy $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(byi.a);
         if ($$1.ec().a(cgy.p)) {
            $$1.ec().a(cgy.aW, bay.a, 60L);
         }
      }
   }
}
