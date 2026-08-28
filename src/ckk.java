import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ckk {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<cdj<? extends cdi<? super ckj>>> e = ImmutableList.of(cdj.c, cdj.f, cdj.d, cdj.z);
   static final List<ccc<?>> f = ImmutableList.of(
      ccc.n, ccc.h, ccc.B, ccc.E, ccc.o, ccc.m, ccc.aU, ccc.aZ, ccc.aV, ccc.aW, ccc.aX, ccc.aY, new ccc[]{ccc.ba, ccc.bb, ccc.x, ccc.y, ccc.t}
   );

   protected static bua<?> a(bua<ckj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnw.a));
      $$0.b(cnw.k);
      $$0.f();
      return $$0;
   }

   private static void b(bua<ckj> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new bvx(45, 90)));
   }

   private static void c(bua<ckj> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bxd.a($$0x -> $$0x.dT().c(ccc.B))),
            Pair.of(1, bxd.a(ckj::go)),
            Pair.of(2, new ckk.a(20, 40)),
            Pair.of(3, new bwo(ImmutableList.of(Pair.of(new bvb(20, 100), 1), Pair.of(bwj.a(0.6F), 2))))
         )
      );
   }

   private static void d(bua<ckj> $$0) {
      $$0.a(
         cnw.k,
         ImmutableList.of(Pair.of(0, bxg.a()), Pair.of(1, new ckn()), Pair.of(2, new ckm()), Pair.of(3, new cko()), Pair.of(4, new ckp())),
         ImmutableSet.of(Pair.of(ccc.o, ccd.a), Pair.of(ccc.m, ccd.b))
      );
   }

   static void a(ckj $$0) {
      $$0.dT().a(ImmutableList.of(cnw.k, cnw.b));
   }

   public static class a extends bwb {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(aqk $$0, bta $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(avf.cM);
         $$1.b(btk.p);
      }

      @Override
      protected void b(aqk $$0, bta $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(btk.a);
         if ($$1.dT().a(ccc.o)) {
            $$1.dT().a(ccc.aV, azh.a, 60L);
         }
      }
   }
}
