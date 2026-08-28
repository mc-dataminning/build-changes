import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgy {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqg f = bqg.a(5, 16);
   private static final ImmutableList<ceb<? extends cea<? super cgx>>> g = ImmutableList.of(ceb.c, ceb.f, ceb.t, ceb.o);
   private static final ImmutableList<ccu<?>> h = ImmutableList.of(
      ccu.Z, ccu.x, ccu.y, ccu.m, ccu.n, ccu.E, ccu.t, ccu.h, ccu.O, ccu.P, ccu.Q, ccu.R, new ccu[]{ccu.r, ccu.K}
   );

   protected static void a(cgx $$0, azh $$1) {
   }

   public static bus.b<cgx> a() {
      return bus.a(h, g);
   }

   protected static bus<?> a(bus<cgx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cgx> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), new cgy.a(4.0F), new bwp(45, 90), new bwt(), new bvp(ccu.P), new bvp(ccu.Q)));
   }

   private static void c(bus<cgx> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, new bvd(btb.o)),
            Pair.of(
               2,
               new bxg(
                  ImmutableList.of(Pair.of(new bvw($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(byw.a(Predicate.not(cgx::u), bvg.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bxa(bqg.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxg(
                  ImmutableMap.of(ccu.m, ccv.b),
                  ImmutableList.of(
                     Pair.of(byw.a(Predicate.not(cgx::u), bxb.a(2.0F)), 1),
                     Pair.of(byw.a(Predicate.not(cgx::u), bxq.a(2.0F, 3)), 1),
                     Pair.of(new cgy.b(20), 1),
                     Pair.of(new bvt(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cgx $$0) {
      $$0.dS().a(ImmutableList.of(coo.b));
   }

   public static Predicate<cuq> b() {
      return $$0 -> $$0.a(awy.ah);
   }

   public static class a extends bve<cgx> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arf $$0, cgx $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvj<cgx> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arf $$0, cgx $$1) {
         return !$$1.be() && $$1.gE() >= (long)this.c && !$$1.gd() && $$1.aE() && !$$1.cR() && $$1.gq();
      }

      protected void a(arf $$0, cgx $$1, long $$2) {
         if ($$1.gy()) {
            $$1.gC();
         } else if (!$$1.gn()) {
            $$1.gB();
         }
      }
   }
}
