import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cfo {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bys<? extends byr<? super cfn>>> e = ImmutableList.of(bys.c, bys.f, bys.d, bys.z);
   static final List<bxl<?>> f = ImmutableList.of(
      bxl.n, bxl.h, bxl.B, bxl.E, bxl.o, bxl.m, bxl.aU, bxl.aZ, bxl.aV, bxl.aW, bxl.aX, bxl.aY, new bxl[]{bxl.ba, bxl.bb, bxl.x, bxl.y, bxl.t}
   );

   protected static bpj<?> a(bpj<cfn> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciy.a));
      $$0.b(ciy.k);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cfn> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new brg(45, 90)));
   }

   private static void c(bpj<cfn> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsm.a($$0x -> $$0x.dO().c(bxl.B))),
            Pair.of(1, bsm.a(cfn::gh)),
            Pair.of(2, new cfo.a(20, 40)),
            Pair.of(3, new brx(ImmutableList.of(Pair.of(new bqk(20, 100), 1), Pair.of(brs.a(0.6F), 2))))
         )
      );
   }

   private static void d(bpj<cfn> $$0) {
      $$0.a(
         ciy.k,
         ImmutableList.of(Pair.of(0, bsp.a()), Pair.of(1, new cfr()), Pair.of(2, new cfq()), Pair.of(3, new cfs()), Pair.of(4, new cft())),
         ImmutableSet.of(Pair.of(bxl.o, bxm.a), Pair.of(bxl.m, bxm.b))
      );
   }

   static void a(cfn $$0) {
      $$0.dO().a(ImmutableList.of(ciy.k, ciy.b));
   }

   public static class a extends brk {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aow $$0, bok $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(atl.cF);
         $$1.b(bot.p);
      }

      @Override
      protected void b(aow $$0, bok $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bot.a);
         if ($$1.dO().a(bxl.o)) {
            $$1.dO().a(bxl.aV, axk.a, 60L);
         }
      }
   }
}
