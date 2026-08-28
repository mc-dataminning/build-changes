import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgu {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqb f = bqb.a(5, 16);
   private static final ImmutableList<cdx<? extends cdw<? super cgt>>> g = ImmutableList.of(cdx.c, cdx.f, cdx.t, cdx.o);
   private static final ImmutableList<ccq<?>> h = ImmutableList.of(
      ccq.Z, ccq.x, ccq.y, ccq.m, ccq.n, ccq.E, ccq.t, ccq.h, ccq.O, ccq.P, ccq.Q, ccq.R, new ccq[]{ccq.r, ccq.K}
   );

   protected static void a(cgt $$0, ayv $$1) {
   }

   public static buo.b<cgt> a() {
      return buo.a(h, g);
   }

   protected static buo<?> a(buo<cgt> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgt> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new cgu.a(4.0F), new bwl(45, 90), new bwp(), new bvl(ccq.P), new bvl(ccq.Q)));
   }

   private static void c(buo<cgt> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, new buz(bsw.o)),
            Pair.of(
               2,
               new bxc(
                  ImmutableList.of(Pair.of(new bvs($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bys.a(Predicate.not(cgt::t), bvc.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bww(bqb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxc(
                  ImmutableMap.of(ccq.m, ccr.b),
                  ImmutableList.of(
                     Pair.of(bys.a(Predicate.not(cgt::t), bwx.a(2.0F)), 1),
                     Pair.of(bys.a(Predicate.not(cgt::t), bxm.a(2.0F, 3)), 1),
                     Pair.of(new cgu.b(20), 1),
                     Pair.of(new bvp(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgt $$0) {
      $$0.dU().a(ImmutableList.of(cok.b));
   }

   public static Predicate<cuo> b() {
      return $$0 -> $$0.a(awm.ah);
   }

   public static class a extends bva<cgt> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqt $$0, cgt $$1, long $$2) {
         $$1.gz();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvf<cgt> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqt $$0, cgt $$1) {
         return !$$1.bf() && $$1.gA() >= (long)this.c && !$$1.fY() && $$1.aF() && !$$1.cS() && $$1.gm();
      }

      protected void a(aqt $$0, cgt $$1, long $$2) {
         if ($$1.gp()) {
            $$1.gy();
         } else if (!$$1.gj()) {
            $$1.gx();
         }
      }
   }
}
