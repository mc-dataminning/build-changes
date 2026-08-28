import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgj {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bpr f = bpr.a(5, 16);
   private static final ImmutableList<cdm<? extends cdl<? super cgi>>> g = ImmutableList.of(cdm.c, cdm.f, cdm.t, cdm.o);
   private static final ImmutableList<ccf<?>> h = ImmutableList.of(
      ccf.Z, ccf.x, ccf.y, ccf.m, ccf.n, ccf.E, ccf.t, ccf.h, ccf.O, ccf.P, ccf.Q, ccf.R, new ccf[]{ccf.r, ccf.K}
   );

   protected static void a(cgi $$0, ayo $$1) {
   }

   public static bud.b<cgi> a() {
      return bud.a(h, g);
   }

   protected static bud<?> a(bud<cgi> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cgi> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new cgj.a(4.0F), new bwa(45, 90), new bwe(), new bva(ccf.P), new bva(ccf.Q)));
   }

   private static void c(bud<cgi> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(1, new buo(bsm.o)),
            Pair.of(
               2,
               new bwr(
                  ImmutableList.of(Pair.of(new bvh($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byh.a(Predicate.not(cgi::u), bur.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwl(bpr.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bwr(
                  ImmutableMap.of(ccf.m, ccg.b),
                  ImmutableList.of(
                     Pair.of(byh.a(Predicate.not(cgi::u), bwm.a(2.0F)), 1),
                     Pair.of(byh.a(Predicate.not(cgi::u), bxb.a(2.0F, 3)), 1),
                     Pair.of(new cgj.b(20), 1),
                     Pair.of(new bve(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgi $$0) {
      $$0.dU().a(ImmutableList.of(cnz.b));
   }

   public static Predicate<cuc> b() {
      return $$0 -> $$0.a(awf.ah);
   }

   public static class a extends bup<cgi> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqm $$0, cgi $$1, long $$2) {
         $$1.gB();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends buu<cgi> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqm $$0, cgi $$1) {
         return !$$1.bf() && $$1.gC() >= (long)this.c && !$$1.ga() && $$1.aF() && !$$1.cS() && $$1.go();
      }

      protected void a(aqm $$0, cgi $$1, long $$2) {
         if ($$1.gw()) {
            $$1.gA();
         } else if (!$$1.gl()) {
            $$1.gz();
         }
      }
   }
}
