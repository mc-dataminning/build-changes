import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgg {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bpo f = bpo.a(5, 16);
   private static final ImmutableList<cdj<? extends cdi<? super cgf>>> g = ImmutableList.of(cdj.c, cdj.f, cdj.t, cdj.o);
   private static final ImmutableList<ccc<?>> h = ImmutableList.of(
      ccc.Z, ccc.x, ccc.y, ccc.m, ccc.n, ccc.E, ccc.t, ccc.h, ccc.O, ccc.P, ccc.Q, ccc.R, new ccc[]{ccc.r, ccc.K}
   );

   protected static void a(cgf $$0, aym $$1) {
   }

   public static bua.b<cgf> a() {
      return bua.a(h, g);
   }

   protected static bua<?> a(bua<cgf> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cgf> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new cgg.a(4.0F), new bvx(45, 90), new bwb(), new bux(ccc.P), new bux(ccc.Q)));
   }

   private static void c(bua<cgf> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, new bul(bsj.o)),
            Pair.of(
               2,
               new bwo(
                  ImmutableList.of(Pair.of(new bve($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bye.a(Predicate.not(cgf::u), buo.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bwi(bpo.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bwo(
                  ImmutableMap.of(ccc.m, ccd.b),
                  ImmutableList.of(
                     Pair.of(bye.a(Predicate.not(cgf::u), bwj.a(2.0F)), 1),
                     Pair.of(bye.a(Predicate.not(cgf::u), bwy.a(2.0F, 3)), 1),
                     Pair.of(new cgg.b(20), 1),
                     Pair.of(new bvb(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgf $$0) {
      $$0.dT().a(ImmutableList.of(cnw.b));
   }

   public static Predicate<cua> b() {
      return $$0 -> $$0.a(awd.ah);
   }

   public static class a extends bum<cgf> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqk $$0, cgf $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bur<cgf> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqk $$0, cgf $$1) {
         return !$$1.be() && $$1.gB() >= (long)this.c && !$$1.fZ() && $$1.aE() && !$$1.cR() && $$1.gn();
      }

      protected void a(aqk $$0, cgf $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
