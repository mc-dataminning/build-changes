import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgz {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqh f = bqh.a(5, 16);
   private static final ImmutableList<cec<? extends ceb<? super cgy>>> g = ImmutableList.of(cec.c, cec.f, cec.t, cec.o);
   private static final ImmutableList<ccv<?>> h = ImmutableList.of(
      ccv.Z, ccv.x, ccv.y, ccv.m, ccv.n, ccv.E, ccv.t, ccv.h, ccv.O, ccv.P, ccv.Q, ccv.R, new ccv[]{ccv.r, ccv.K}
   );

   protected static void a(cgy $$0, azh $$1) {
   }

   public static but.b<cgy> a() {
      return but.a(h, g);
   }

   protected static but<?> a(but<cgy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<cgy> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), new cgz.a(4.0F), new bwq(45, 90), new bwu(), new bvq(ccv.P), new bvq(ccv.Q)));
   }

   private static void c(but<cgy> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(1, new bve(btc.o)),
            Pair.of(
               2,
               new bxh(
                  ImmutableList.of(Pair.of(new bvx($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byx.a(Predicate.not(cgy::u), bvh.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bxb(bqh.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxh(
                  ImmutableMap.of(ccv.m, ccw.b),
                  ImmutableList.of(
                     Pair.of(byx.a(Predicate.not(cgy::u), bxc.a(2.0F)), 1),
                     Pair.of(byx.a(Predicate.not(cgy::u), bxr.a(2.0F, 3)), 1),
                     Pair.of(new cgz.b(20), 1),
                     Pair.of(new bvu(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgy $$0) {
      $$0.dS().a(ImmutableList.of(cop.b));
   }

   public static Predicate<cur> b() {
      return $$0 -> $$0.a(awy.ah);
   }

   public static class a extends bvf<cgy> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arf $$0, cgy $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvk<cgy> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arf $$0, cgy $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(arf $$0, cgy $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
