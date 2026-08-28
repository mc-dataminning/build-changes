import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cmo {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cfl<? extends cfk<? super cmn>>> e = ImmutableList.of(cfl.c, cfl.f, cfl.d, cfl.z);
   static final List<cee<?>> f = ImmutableList.of(
      cee.n, cee.h, cee.B, cee.E, cee.o, cee.m, cee.aU, cee.aZ, cee.aV, cee.aW, cee.aX, cee.aY, new cee[]{cee.ba, cee.bb, cee.x, cee.y, cee.t}
   );
   private static final int g = 100;

   protected static bwc<?> a(cmn $$0, bwc<cmn> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cqe.a));
      $$1.b(cqe.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwc<cmn> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new bxz(45, 90)));
   }

   private static void b(bwc<cmn> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, bzf.a($$0x -> $$0x.ed().c(cee.B))),
            Pair.of(1, bzf.a(cmn::gv)),
            Pair.of(2, new cmo.a(20, 40)),
            Pair.of(3, new byq(ImmutableList.of(Pair.of(new bxd(20, 100), 1), Pair.of(byl.a(0.6F), 2))))
         )
      );
   }

   private static void b(cmn $$0, bwc<cmn> $$1) {
      $$1.a(
         cqe.k,
         ImmutableList.of(
            Pair.of(0, bzi.a(cfk.a($$0, 100).negate())), Pair.of(1, new cmr()), Pair.of(2, new cmq()), Pair.of(3, new cms()), Pair.of(4, new cmt())
         ),
         ImmutableSet.of(Pair.of(cee.o, cef.a), Pair.of(cee.m, cef.b))
      );
   }

   static void a(cmn $$0) {
      $$0.ed().a(ImmutableList.of(cqe.k, cqe.b));
   }

   public static class a extends byd {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arn $$0, bvc $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awl.cM);
         $$1.b(bvm.p);
      }

      @Override
      protected void b(arn $$0, bvc $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bvm.a);
         if ($$1.ed().a(cee.o)) {
            $$1.ed().a(cee.aV, bap.a, 60L);
         }
      }
   }
}
