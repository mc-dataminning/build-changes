import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cor {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<chi<? extends chh<? super coq>>> e = ImmutableList.of(chi.c, chi.f, chi.d, chi.z);
   static final List<cgb<?>> f = ImmutableList.of(
      cgb.o, cgb.h, cgb.C, cgb.F, cgb.p, cgb.n, cgb.aV, cgb.ba, cgb.aW, cgb.aX, cgb.aY, cgb.aZ, new cgb[]{cgb.bb, cgb.bc, cgb.y, cgb.z, cgb.u}
   );
   private static final int g = 100;

   protected static bxz<?> a(coq $$0, bxz<coq> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(csl.a));
      $$1.b(csl.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxz<coq> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new bzw(45, 90)));
   }

   private static void b(bxz<coq> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, cbc.a(($$0x, $$1) -> $$1.eb().c(cgb.C))),
            Pair.of(1, cbc.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cor.a(20, 40)),
            Pair.of(3, new can(ImmutableList.of(Pair.of(new bza(20, 100), 1), Pair.of(cai.a(0.6F), 2))))
         )
      );
   }

   private static void b(coq $$0, bxz<coq> $$1) {
      $$1.a(
         csl.k,
         ImmutableList.of(
            Pair.of(0, cbf.a(chh.a($$0, 100).negate()::test)), Pair.of(1, new cou()), Pair.of(2, new cot()), Pair.of(3, new cov()), Pair.of(4, new cow())
         ),
         ImmutableSet.of(Pair.of(cgb.p, cgc.a), Pair.of(cgb.n, cgc.b))
      );
   }

   static void a(coq $$0) {
      $$0.eb().a(ImmutableList.of(csl.k, csl.b));
   }

   public static class a extends caa {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aro $$0, bxb $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awl.cM);
         $$1.b(bxl.p);
      }

      @Override
      protected void b(aro $$0, bxb $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bxl.a);
         if ($$1.eb().a(cgb.p)) {
            $$1.eb().a(cgb.aW, bas.a, 60L);
         }
      }
   }
}
