import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cnt {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cgq<? extends cgp<? super cns>>> e = ImmutableList.of(cgq.c, cgq.f, cgq.d, cgq.z);
   static final List<cfj<?>> f = ImmutableList.of(
      cfj.n, cfj.h, cfj.B, cfj.E, cfj.o, cfj.m, cfj.aU, cfj.aZ, cfj.aV, cfj.aW, cfj.aX, cfj.aY, new cfj[]{cfj.ba, cfj.bb, cfj.x, cfj.y, cfj.t}
   );
   private static final int g = 100;

   protected static bxh<?> a(cns $$0, bxh<cns> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(crn.a));
      $$1.b(crn.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxh<cns> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new bze(45, 90)));
   }

   private static void b(bxh<cns> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, cak.a(($$0x, $$1) -> $$1.eb().c(cfj.B))),
            Pair.of(1, cak.a(($$0x, $$1) -> $$1.gm())),
            Pair.of(2, new cnt.a(20, 40)),
            Pair.of(3, new bzv(ImmutableList.of(Pair.of(new byi(20, 100), 1), Pair.of(bzq.a(0.6F), 2))))
         )
      );
   }

   private static void b(cns $$0, bxh<cns> $$1) {
      $$1.a(
         crn.k,
         ImmutableList.of(
            Pair.of(0, can.a(cgp.a($$0, 100).negate()::test)), Pair.of(1, new cnw()), Pair.of(2, new cnv()), Pair.of(3, new cnx()), Pair.of(4, new cny())
         ),
         ImmutableSet.of(Pair.of(cfj.o, cfk.a), Pair.of(cfj.m, cfk.b))
      );
   }

   static void a(cns $$0) {
      $$0.eb().a(ImmutableList.of(crn.k, crn.b));
   }

   public static class a extends bzi {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ash $$0, bwh $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(axf.cM);
         $$1.b(bwr.p);
      }

      @Override
      protected void b(ash $$0, bwh $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bwr.a);
         if ($$1.eb().a(cfj.o)) {
            $$1.eb().a(cfj.aV, bbk.a, 60L);
         }
      }
   }
}
