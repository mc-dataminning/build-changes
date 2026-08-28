import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cku {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final btr f = btr.a(5, 16);
   private static final ImmutableList<chs<? extends chr<? super ckt>>> g = ImmutableList.of(chs.c, chs.f, chs.t, chs.o);
   private static final ImmutableList<cgl<?>> h = ImmutableList.of(
      cgl.aa, cgl.y, cgl.z, cgl.n, cgl.o, cgl.F, cgl.u, cgl.h, cgl.P, cgl.Q, cgl.R, cgl.S, new cgl[]{cgl.s, cgl.L}
   );

   protected static void a(ckt $$0, azv $$1) {
   }

   public static byj.b<ckt> a() {
      return byj.a(h, g);
   }

   protected static byj<?> a(byj<ckt> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<ckt> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cbu(0.8F), new cku.a(4.0F), new cag(45, 90), new cak(), new bzg(cgl.Q), new bzg(cgl.R)));
   }

   private static void c(byj<ckt> $$0) {
      $$0.a(
         ctg.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new byu(bwr.t)),
            Pair.of(
               2,
               new cax(
                  ImmutableList.of(Pair.of(new bzn($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(ccn.a(Predicate.not(ckt::t), byx.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new car(btr.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cax(
                  ImmutableMap.of(cgl.n, cgm.b),
                  ImmutableList.of(
                     Pair.of(ccn.a(Predicate.not(ckt::t), cas.a(2.0F)), 1),
                     Pair.of(ccn.a(Predicate.not(ckt::t), cbh.a(2.0F, 3)), 1),
                     Pair.of(new cku.b(20), 1),
                     Pair.of(new bzk(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(ckt $$0) {
      $$0.eb().a(ImmutableList.of(ctg.b));
   }

   public static Predicate<czn> b() {
      return $$0 -> $$0.a(axk.al);
   }

   public static class a extends byv<ckt> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arq $$0, ckt $$1, long $$2) {
         $$1.gI();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bza<ckt> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arq $$0, ckt $$1) {
         return !$$1.bh() && $$1.gJ() >= (long)this.c && !$$1.O_() && $$1.aH() && !$$1.cW() && $$1.gt();
      }

      protected void a(arq $$0, ckt $$1, long $$2) {
         if ($$1.gw()) {
            $$1.gH();
         } else if (!$$1.gq()) {
            $$1.gG();
         }
      }
   }
}
