import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cij {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bro f = bro.a(5, 16);
   private static final ImmutableList<cfl<? extends cfk<? super cii>>> g = ImmutableList.of(cfl.c, cfl.f, cfl.t, cfl.o);
   private static final ImmutableList<cee<?>> h = ImmutableList.of(
      cee.Z, cee.x, cee.y, cee.m, cee.n, cee.E, cee.t, cee.h, cee.O, cee.P, cee.Q, cee.R, new cee[]{cee.r, cee.K}
   );

   protected static void a(cii $$0, azs $$1) {
   }

   public static bwc.b<cii> a() {
      return bwc.a(h, g);
   }

   protected static bwc<?> a(bwc<cii> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cii> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new cij.a(4.0F), new bxz(45, 90), new byd(), new bwz(cee.P), new bwz(cee.Q)));
   }

   private static void c(bwc<cii> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, new bwn(bul.o)),
            Pair.of(
               2,
               new byq(
                  ImmutableList.of(Pair.of(new bxg($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(cag.a(Predicate.not(cii::t), bwq.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byk(bro.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byq(
                  ImmutableMap.of(cee.m, cef.b),
                  ImmutableList.of(
                     Pair.of(cag.a(Predicate.not(cii::t), byl.a(2.0F)), 1),
                     Pair.of(cag.a(Predicate.not(cii::t), bza.a(2.0F, 3)), 1),
                     Pair.of(new cij.b(20), 1),
                     Pair.of(new bxd(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cii $$0) {
      $$0.ed().a(ImmutableList.of(cqe.b));
   }

   public static Predicate<cwb> b() {
      return $$0 -> $$0.a(axj.ak);
   }

   public static class a extends bwo<cii> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arn $$0, cii $$1, long $$2) {
         $$1.gJ();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwt<cii> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arn $$0, cii $$1) {
         return !$$1.bk() && $$1.gK() >= (long)this.c && !$$1.M_() && $$1.aK() && !$$1.cZ() && $$1.gu();
      }

      protected void a(arn $$0, cii $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gI();
         } else if (!$$1.gr()) {
            $$1.gH();
         }
      }
   }
}
