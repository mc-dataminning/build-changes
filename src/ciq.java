import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciq {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final brv f = brv.a(5, 16);
   private static final ImmutableList<cfs<? extends cfr<? super cip>>> g = ImmutableList.of(cfs.c, cfs.f, cfs.t, cfs.o);
   private static final ImmutableList<cel<?>> h = ImmutableList.of(
      cel.Z, cel.x, cel.y, cel.m, cel.n, cel.E, cel.t, cel.h, cel.O, cel.P, cel.Q, cel.R, new cel[]{cel.r, cel.K}
   );

   protected static void a(cip $$0, azh $$1) {
   }

   public static bwj.b<cip> a() {
      return bwj.a(h, g);
   }

   protected static bwj<?> a(bwj<cip> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqo.a));
      $$0.b(cqo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cip> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new bzu(0.8F), new ciq.a(4.0F), new byg(45, 90), new byk(), new bxg(cel.P), new bxg(cel.Q)));
   }

   private static void c(bwj<cip> $$0) {
      $$0.a(
         cqo.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bR, 6.0F, brv.a(30, 60))),
            Pair.of(1, new bwu(bus.t)),
            Pair.of(
               2,
               new byx(
                  ImmutableList.of(Pair.of(new bxn($$0x -> 2.5F, $$0x -> $$0x.e_() ? 2.5 : 3.5), 1), Pair.of(can.a(Predicate.not(cip::t), bwx.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new byr(brv.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new byx(
                  ImmutableMap.of(cel.m, cem.b),
                  ImmutableList.of(
                     Pair.of(can.a(Predicate.not(cip::t), bys.a(2.0F)), 1),
                     Pair.of(can.a(Predicate.not(cip::t), bzh.a(2.0F, 3)), 1),
                     Pair.of(new ciq.b(20), 1),
                     Pair.of(new bxk(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cip $$0) {
      $$0.eb().a(ImmutableList.of(cqo.b));
   }

   public static Predicate<cwp> b() {
      return $$0 -> $$0.a(awy.ak);
   }

   public static class a extends bwv<cip> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(ard $$0, cip $$1, long $$2) {
         $$1.gH();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bxa<cip> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ard $$0, cip $$1) {
         return !$$1.bj() && $$1.gI() >= (long)this.c && !$$1.P_() && $$1.aJ() && !$$1.cX() && $$1.gs();
      }

      protected void a(ard $$0, cip $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gG();
         } else if (!$$1.gp()) {
            $$1.gF();
         }
      }
   }
}
