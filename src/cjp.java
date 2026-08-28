import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjp {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bsu f = bsu.a(5, 16);
   private static final ImmutableList<cgr<? extends cgq<? super cjo>>> g = ImmutableList.of(cgr.c, cgr.f, cgr.t, cgr.o);
   private static final ImmutableList<cfk<?>> h = ImmutableList.of(
      cfk.Z, cfk.x, cfk.y, cfk.m, cfk.n, cfk.E, cfk.t, cfk.h, cfk.O, cfk.P, cfk.Q, cfk.R, new cfk[]{cfk.r, cfk.K}
   );

   protected static void a(cjo $$0, bam $$1) {
   }

   public static bxi.b<cjo> a() {
      return bxi.a(h, g);
   }

   protected static bxi<?> a(bxi<cjo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjo> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new cjp.a(4.0F), new bzf(45, 90), new bzj(), new byf(cfk.P), new byf(cfk.Q)));
   }

   private static void c(bxi<cjo> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, new bxt(bvr.t)),
            Pair.of(
               2,
               new bzw(
                  ImmutableList.of(Pair.of(new bym($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cbm.a(Predicate.not(cjo::t), bxw.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bzq(bsu.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bzw(
                  ImmutableMap.of(cfk.m, cfl.b),
                  ImmutableList.of(
                     Pair.of(cbm.a(Predicate.not(cjo::t), bzr.a(2.0F)), 1),
                     Pair.of(cbm.a(Predicate.not(cjo::t), cag.a(2.0F, 3)), 1),
                     Pair.of(new cjp.b(20), 1),
                     Pair.of(new byj(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cjo $$0) {
      $$0.ec().a(ImmutableList.of(cro.b));
   }

   public static Predicate<cxp> b() {
      return $$0 -> $$0.a(ayd.am);
   }

   public static class a extends bxu<cjo> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ash $$0, cjo $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxz<cjo> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ash $$0, cjo $$1) {
         return !$$1.bj() && $$1.gE() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cY() && $$1.go();
      }

      protected void a(ash $$0, cjo $$1, long $$2) {
         if ($$1.gr()) {
            $$1.gC();
         } else if (!$$1.gl()) {
            $$1.gB();
         }
      }
   }
}
