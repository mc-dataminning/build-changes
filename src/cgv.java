import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cgv {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bzy<? extends bzx<? super cgu>>> e = ImmutableList.of(bzy.c, bzy.f, bzy.d, bzy.z);
   static final List<byr<?>> f = ImmutableList.of(
      byr.n, byr.h, byr.B, byr.E, byr.o, byr.m, byr.aU, byr.aZ, byr.aV, byr.aW, byr.aX, byr.aY, new byr[]{byr.ba, byr.bb, byr.x, byr.y, byr.t}
   );

   protected static bqp<?> a(bqp<cgu> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckh.a));
      $$0.b(ckh.k);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<cgu> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new bsm(45, 90)));
   }

   private static void c(bqp<cgu> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, bts.a($$0x -> $$0x.dP().c(byr.B))),
            Pair.of(1, bts.a(cgu::go)),
            Pair.of(2, new cgv.a(20, 40)),
            Pair.of(3, new btd(ImmutableList.of(Pair.of(new brq(20, 100), 1), Pair.of(bsy.a(0.6F), 2))))
         )
      );
   }

   private static void d(bqp<cgu> $$0) {
      $$0.a(
         ckh.k,
         ImmutableList.of(Pair.of(0, btv.a()), Pair.of(1, new cgy()), Pair.of(2, new cgx()), Pair.of(3, new cgz()), Pair.of(4, new cha())),
         ImmutableSet.of(Pair.of(byr.o, bys.a), Pair.of(byr.m, bys.b))
      );
   }

   static void a(cgu $$0) {
      $$0.dP().a(ImmutableList.of(ckh.k, ckh.b));
   }

   public static class a extends bsq {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(apf $$0, bpq $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(aty.cH);
         $$1.b(bpz.p);
      }

      @Override
      protected void b(apf $$0, bpq $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bpz.a);
         if ($$1.dP().a(byr.o)) {
            $$1.dP().a(byr.aV, axy.a, 60L);
         }
      }
   }
}
