import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cej {
   public static final int a = 20;
   public static final int b = 7;
   private static final bnq i = bnq.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bnq o = bnq.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bnq p = bnq.a(600, 6000);
   private static final bnq q = bnq.a(100, 300);
   private static final cbj r = cbj.a().a($$0 -> !$$0.ai().equals(bqg.X) && $$0.dM().C_().a($$0.cH()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cei $$0, axt $$1) {
      $$0.dP().a(bzw.S, o.a($$1));
      $$0.dP().a(bzw.V, p.a($$1));
   }

   protected static bru<?> a(bru<cei> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cei> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new bsg(2.0F), new btr(45, 90), new btv(), new bsr(bzw.P), new bsr(bzw.S), new bsr(bzw.V)));
   }

   private static void c(bru<cei> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(0, new bsf(bqg.X)),
            Pair.of(1, new bsy($$0x -> 1.25F)),
            Pair.of(2, bsi.a(i, 1.25F)),
            Pair.of(3, new bui(ImmutableList.of(Pair.of(bud.a(1.0F), 2), Pair.of(bus.a(1.0F, 3), 2), Pair.of(new bsv(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bzw.W, bzx.b), Pair.of(bzw.T, bzx.b))
      );
   }

   private static void d(bru<cei> $$0) {
      $$0.a(
         clp.q,
         ImmutableList.of(Pair.of(0, new btm(o, auo.kY)), Pair.of(1, new bto<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gx() ? auo.kT : auo.kJ))),
         ImmutableSet.of(Pair.of(bzw.O, bzx.b), Pair.of(bzw.r, bzx.b), Pair.of(bzw.m, bzx.b), Pair.of(bzw.S, bzx.b))
      );
   }

   private static void e(bru<cei> $$0) {
      $$0.a(
         clp.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bub(
                  $$0x -> $$0x.gx() ? q : p, r, 3.0F, $$0x -> $$0x.p_() ? 1.0 : 2.5, $$0x -> $$0x.gx() ? auo.kW : auo.kM, $$0x -> $$0x.gx() ? auo.kX : auo.kN
               )
            ),
            Pair.of(1, new bua<>($$0x -> $$0x.gx() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gx() ? auo.kV : auo.kL))
         ),
         ImmutableSet.of(Pair.of(bzw.O, bzx.b), Pair.of(bzw.r, bzx.b), Pair.of(bzw.V, bzx.b))
      );
   }

   public static void a(cei $$0) {
      $$0.dP().a(ImmutableList.of(clp.r, clp.q, clp.b));
   }

   public static cvp a() {
      return cvp.a(crv.pv);
   }
}
