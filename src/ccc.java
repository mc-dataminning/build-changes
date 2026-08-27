import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ccc {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final blw f = blw.a(5, 16);
   private static final ImmutableList<bzh<? extends bzg<? super ccb>>> g = ImmutableList.of(bzh.c, bzh.f, bzh.t, bzh.o);
   private static final ImmutableList<bya<?>> h = ImmutableList.of(
      bya.Z, bya.x, bya.y, bya.m, bya.n, bya.E, bya.t, bya.h, bya.O, bya.P, bya.Q, bya.R, new bya[]{bya.r, bya.K}
   );

   protected static void a(ccb $$0, awt $$1) {
   }

   public static bpy.b<ccb> a() {
      return bpy.a(h, g);
   }

   protected static bpy<?> a(bpy<ccb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<ccb> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new ccc.a(4.0F), new brv(45, 90), new brz(), new bqv(bya.P), new bqv(bya.Q)));
   }

   private static void c(bpy<ccb> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, new bqj(bol.n)),
            Pair.of(
               2,
               new bsm(
                  ImmutableList.of(Pair.of(new brc($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(buc.a(Predicate.not(ccb::w), bqm.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bsg(blw.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bsm(
                  ImmutableMap.of(bya.m, byb.b),
                  ImmutableList.of(
                     Pair.of(buc.a(Predicate.not(ccb::w), bsh.a(2.0F)), 1),
                     Pair.of(buc.a(Predicate.not(ccb::w), bsw.a(2.0F, 3)), 1),
                     Pair.of(new ccc.b(20), 1),
                     Pair.of(new bqz(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(ccb $$0) {
      $$0.dM().a(ImmutableList.of(cjn.b));
   }

   public static csp b() {
      return ccb.bV;
   }

   public static class a extends bqk {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(apa $$0, bpf $$1, long $$2) {
         if ($$1 instanceof ccb $$3) {
            $$3.gy();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bqp<ccb> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(apa $$0, ccb $$1) {
         return !$$1.aZ() && $$1.gz() >= (long)this.c && !$$1.fZ() && $$1.aC() && !$$1.cL() && $$1.gl();
      }

      protected void a(apa $$0, ccb $$1, long $$2) {
         if ($$1.gt()) {
            $$1.gx();
         } else if (!$$1.gi()) {
            $$1.gw();
         }
      }
   }
}
