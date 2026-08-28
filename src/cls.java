import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cls {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cep<? extends ceo<? super clr>>> e = ImmutableList.of(cep.c, cep.f, cep.d, cep.z);
   static final List<cdi<?>> f = ImmutableList.of(
      cdi.n, cdi.h, cdi.B, cdi.E, cdi.o, cdi.m, cdi.aU, cdi.aZ, cdi.aV, cdi.aW, cdi.aX, cdi.aY, new cdi[]{cdi.ba, cdi.bb, cdi.x, cdi.y, cdi.t}
   );
   private static final int g = 100;

   protected static bvg<?> a(clr $$0, bvg<clr> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cpg.a));
      $$1.b(cpg.k);
      $$1.f();
      return $$1;
   }

   private static void a(bvg<clr> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new bxd(45, 90)));
   }

   private static void b(bvg<clr> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, byj.a($$0x -> $$0x.dX().c(cdi.B))),
            Pair.of(1, byj.a(clr::gp)),
            Pair.of(2, new cls.a(20, 40)),
            Pair.of(3, new bxu(ImmutableList.of(Pair.of(new bwh(20, 100), 1), Pair.of(bxp.a(0.6F), 2))))
         )
      );
   }

   private static void b(clr $$0, bvg<clr> $$1) {
      $$1.a(
         cpg.k,
         ImmutableList.of(
            Pair.of(0, bym.a(ceo.a($$0, 100).negate())), Pair.of(1, new clv()), Pair.of(2, new clu()), Pair.of(3, new clw()), Pair.of(4, new clx())
         ),
         ImmutableSet.of(Pair.of(cdi.o, cdj.a), Pair.of(cdi.m, cdj.b))
      );
   }

   static void a(clr $$0) {
      $$0.dX().a(ImmutableList.of(cpg.k, cpg.b));
   }

   public static class a extends bxh {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arg $$0, buh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awd.cM);
         $$1.b(bur.p);
      }

      @Override
      protected void b(arg $$0, buh $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bur.a);
         if ($$1.dX().a(cdi.o)) {
            $$1.dX().a(cdi.aV, bah.a, 60L);
         }
      }
   }
}
