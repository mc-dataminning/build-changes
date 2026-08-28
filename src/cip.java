import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cip {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bru f = bru.a(5, 16);
   private static final ImmutableList<cfr<? extends cfq<? super cio>>> g = ImmutableList.of(cfr.c, cfr.f, cfr.t, cfr.o);
   private static final ImmutableList<cek<?>> h = ImmutableList.of(
      cek.Z, cek.x, cek.y, cek.m, cek.n, cek.E, cek.t, cek.h, cek.O, cek.P, cek.Q, cek.R, new cek[]{cek.r, cek.K}
   );

   protected static void a(cio $$0, azh $$1) {
   }

   public static bwi.b<cio> a() {
      return bwi.a(h, g);
   }

   protected static bwi<?> a(bwi<cio> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cio> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new cip.a(4.0F), new byf(45, 90), new byj(), new bxf(cek.P), new bxf(cek.Q)));
   }

   private static void c(bwi<cio> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, new bwt(bur.t)),
            Pair.of(
               2,
               new byw(
                  ImmutableList.of(Pair.of(new bxm($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(cam.a(Predicate.not(cio::t), bww.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byq(bru.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byw(
                  ImmutableMap.of(cek.m, cel.b),
                  ImmutableList.of(
                     Pair.of(cam.a(Predicate.not(cio::t), byr.a(2.0F)), 1),
                     Pair.of(cam.a(Predicate.not(cio::t), bzg.a(2.0F, 3)), 1),
                     Pair.of(new cip.b(20), 1),
                     Pair.of(new bxj(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cio $$0) {
      $$0.eb().a(ImmutableList.of(cqn.b));
   }

   public static Predicate<cwo> b() {
      return $$0 -> $$0.a(awy.ak);
   }

   public static class a extends bwu<cio> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ard $$0, cio $$1, long $$2) {
         $$1.gH();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bwz<cio> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ard $$0, cio $$1) {
         return !$$1.bj() && $$1.gI() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cX() && $$1.gs();
      }

      protected void a(ard $$0, cio $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gG();
         } else if (!$$1.gp()) {
            $$1.gF();
         }
      }
   }
}
