import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ccl {
   public static final int a = 20;
   public static final int b = 7;
   private static final blw i = blw.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final blw o = blw.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final blw p = blw.a(600, 6000);
   private static final blw q = blw.a(100, 300);
   private static final bzn r = bzn.a().a($$0 -> !$$0.ai().equals(bol.W) && $$0.dJ().D_().a($$0.cE()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cck $$0, awt $$1) {
      $$0.dM().a(bya.S, o.a($$1));
      $$0.dM().a(bya.V, p.a($$1));
   }

   protected static bpy<?> a(bpy<cck> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cck> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new bqk(2.0F), new brv(45, 90), new brz(), new bqv(bya.P), new bqv(bya.S), new bqv(bya.V)));
   }

   private static void c(bpy<cck> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(0, new bqj(bol.W)),
            Pair.of(1, new brc($$0x -> 1.25F)),
            Pair.of(2, bqm.a(i, 1.25F)),
            Pair.of(3, new bsm(ImmutableList.of(Pair.of(bsh.a(1.0F), 2), Pair.of(bsw.a(1.0F, 3), 2), Pair.of(new bqz(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bya.W, byb.b), Pair.of(bya.T, byb.b))
      );
   }

   private static void d(bpy<cck> $$0) {
      $$0.a(
         cjn.q,
         ImmutableList.of(Pair.of(0, new brq(o, atp.kP)), Pair.of(1, new brs<>(o, 5, 5, 1.5F, $$0x -> $$0x.gv() ? atp.kK : atp.kA))),
         ImmutableSet.of(Pair.of(bya.O, byb.b), Pair.of(bya.r, byb.b), Pair.of(bya.m, byb.b), Pair.of(bya.S, byb.b))
      );
   }

   private static void e(bpy<cck> $$0) {
      $$0.a(
         cjn.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bsf(
                  $$0x -> $$0x.gv() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gv() ? atp.kN : atp.kD, $$0x -> $$0x.gv() ? atp.kO : atp.kE
               )
            ),
            Pair.of(1, new bse<>($$0x -> $$0x.gv() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gv() ? atp.kM : atp.kC))
         ),
         ImmutableSet.of(Pair.of(bya.O, byb.b), Pair.of(bya.r, byb.b), Pair.of(bya.V, byb.b))
      );
   }

   public static void a(cck $$0) {
      $$0.dM().a(ImmutableList.of(cjn.r, cjn.q, cjn.b));
   }

   public static csp a() {
      return csp.a(cpt.pv);
   }
}
