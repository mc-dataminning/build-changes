import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cgx {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bzz<? extends bzy<? super cgw>>> e = ImmutableList.of(bzz.c, bzz.f, bzz.d, bzz.z);
   static final List<bys<?>> f = ImmutableList.of(
      bys.n, bys.h, bys.B, bys.E, bys.o, bys.m, bys.aU, bys.aZ, bys.aV, bys.aW, bys.aX, bys.aY, new bys[]{bys.ba, bys.bb, bys.x, bys.y, bys.t}
   );

   protected static bqq<?> a(bqq<cgw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckj.a));
      $$0.b(ckj.k);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<cgw> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new bsn(45, 90)));
   }

   private static void c(bqq<cgw> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, btt.a($$0x -> $$0x.dP().c(bys.B))),
            Pair.of(1, btt.a(cgw::go)),
            Pair.of(2, new cgx.a(20, 40)),
            Pair.of(3, new bte(ImmutableList.of(Pair.of(new brr(20, 100), 1), Pair.of(bsz.a(0.6F), 2))))
         )
      );
   }

   private static void d(bqq<cgw> $$0) {
      $$0.a(
         ckj.k,
         ImmutableList.of(Pair.of(0, btw.a()), Pair.of(1, new cha()), Pair.of(2, new cgz()), Pair.of(3, new chb()), Pair.of(4, new chc())),
         ImmutableSet.of(Pair.of(bys.o, byt.a), Pair.of(bys.m, byt.b))
      );
   }

   static void a(cgw $$0) {
      $$0.dP().a(ImmutableList.of(ckj.k, ckj.b));
   }

   public static class a extends bsr {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(apf $$0, bpr $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(aty.cL);
         $$1.b(bqa.p);
      }

      @Override
      protected void b(apf $$0, bpr $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bqa.a);
         if ($$1.dP().a(bys.o)) {
            $$1.dP().a(bys.aV, axy.a, 60L);
         }
      }
   }
}
