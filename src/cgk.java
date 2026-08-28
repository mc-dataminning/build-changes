import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgk {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bps f = bps.a(5, 16);
   private static final ImmutableList<cdn<? extends cdm<? super cgj>>> g = ImmutableList.of(cdn.c, cdn.f, cdn.t, cdn.o);
   private static final ImmutableList<ccg<?>> h = ImmutableList.of(
      ccg.Z, ccg.x, ccg.y, ccg.m, ccg.n, ccg.E, ccg.t, ccg.h, ccg.O, ccg.P, ccg.Q, ccg.R, new ccg[]{ccg.r, ccg.K}
   );

   protected static void a(cgj $$0, ayo $$1) {
   }

   public static bue.b<cgj> a() {
      return bue.a(h, g);
   }

   protected static bue<?> a(bue<cgj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<cgj> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), new cgk.a(4.0F), new bwb(45, 90), new bwf(), new bvb(ccg.P), new bvb(ccg.Q)));
   }

   private static void c(bue<cgj> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(1, new bup(bsn.o)),
            Pair.of(
               2,
               new bws(
                  ImmutableList.of(Pair.of(new bvi($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(byi.a(Predicate.not(cgj::t), bus.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwm(bps.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bws(
                  ImmutableMap.of(ccg.m, cch.b),
                  ImmutableList.of(
                     Pair.of(byi.a(Predicate.not(cgj::t), bwn.a(2.0F)), 1),
                     Pair.of(byi.a(Predicate.not(cgj::t), bxc.a(2.0F, 3)), 1),
                     Pair.of(new cgk.b(20), 1),
                     Pair.of(new bvf(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgj $$0) {
      $$0.dV().a(ImmutableList.of(coa.b));
   }

   public static Predicate<cud> b() {
      return $$0 -> $$0.a(awf.ah);
   }

   public static class a extends buq<cgj> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqm $$0, cgj $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends buv<cgj> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqm $$0, cgj $$1) {
         return !$$1.bg() && $$1.gB() >= (long)this.c && !$$1.fZ() && $$1.aG() && !$$1.cT() && $$1.gn();
      }

      protected void a(aqm $$0, cgj $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
