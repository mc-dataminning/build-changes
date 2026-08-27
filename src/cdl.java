import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cdl {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bws<? extends bwr<? super cdk>>> e = ImmutableList.of(bws.c, bws.f, bws.d, bws.x);
   static final List<bvm<?>> f = ImmutableList.of(
      bvm.n, bvm.h, bvm.B, bvm.E, bvm.o, bvm.m, bvm.aT, bvm.aY, bvm.aU, bvm.aV, bvm.aW, bvm.aX, new bvm[]{bvm.aZ, bvm.x, bvm.y, bvm.t}
   );

   protected static bnk<?> a(bnk<cdk> $$0) {
      b($$0);
      c($$0);
      $$0.a(Set.of(cgt.a));
      $$0.b(cgt.k);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<cdk> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), new bph(45, 90), new cdl.a(20, 100)));
   }

   private static void c(bnk<cdk> $$0) {
      $$0.a(
         cgt.k,
         ImmutableList.of(
            Pair.of(0, bqn.a($$0x -> $$0x.dO().c(bvm.B))),
            Pair.of(1, bqq.a()),
            Pair.of(2, new cdn()),
            Pair.of(3, new cdo()),
            Pair.of(4, new cdm()),
            Pair.of(5, new cdp()),
            Pair.of(6, new bpy(ImmutableList.of(Pair.of(new bol(20, 100), 1), Pair.of(bpt.a(0.6F), 2))))
         ),
         Set.of()
      );
   }

   public static class a extends bpl {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(and $$0, bmm $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(arr.cq);
         $$1.b(bmw.p);
      }

      @Override
      protected void b(and $$0, bmm $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bmw.a);
         if ($$1.dO().a(bvm.o)) {
            $$1.dO().a(bvm.aU, avr.a, 60L);
         }
      }
   }
}
