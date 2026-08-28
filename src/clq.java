import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clq {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bun f = bun.a(5, 16);
   private static final ImmutableList<cio<? extends cin<? super clp>>> g = ImmutableList.of(cio.c, cio.f, cio.t, cio.o);
   private static final ImmutableList<chh<?>> h = ImmutableList.of(
      chh.aa, chh.y, chh.z, chh.n, chh.o, chh.F, chh.u, chh.h, chh.P, chh.Q, chh.R, chh.S, new chh[]{chh.s, chh.L}
   );

   protected static void a(clp $$0, bai $$1) {
   }

   public static bzf.b<clp> a() {
      return bzf.a(h, g);
   }

   protected static bzf<?> a(bzf<clp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<clp> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new clq.a(4.0F), new cbc(45, 90), new cbg(), new cac(chh.Q), new cac(chh.R)));
   }

   private static void c(bzf<clp> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, new bzq(bxn.u)),
            Pair.of(
               2,
               new cbt(
                  ImmutableList.of(Pair.of(new caj($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(cdj.a(Predicate.not(clp::t), bzt.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cbn(bun.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cbt(
                  ImmutableMap.of(chh.n, chi.b),
                  ImmutableList.of(
                     Pair.of(cdj.a(Predicate.not(clp::t), cbo.a(2.0F)), 1),
                     Pair.of(cdj.a(Predicate.not(clp::t), ccd.a(2.0F, 3)), 1),
                     Pair.of(new clq.b(20), 1),
                     Pair.of(new cag(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(clp $$0) {
      $$0.ec().a(ImmutableList.of(cuc.b));
   }

   public static Predicate<dak> b() {
      return $$0 -> $$0.a(axv.am);
   }

   public static class a extends bzr<clp> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(asb $$0, clp $$1, long $$2) {
         $$1.gJ();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bzw<clp> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(asb $$0, clp $$1) {
         return !$$1.bi() && $$1.gK() >= (long)this.c && !$$1.T_() && $$1.aH() && !$$1.cX() && $$1.gu();
      }

      protected void a(asb $$0, clp $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gI();
         } else if (!$$1.gr()) {
            $$1.gH();
         }
      }
   }
}
