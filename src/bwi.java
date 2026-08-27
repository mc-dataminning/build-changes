import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwi {
   public static final int a = 20;
   public static final int b = 7;
   private static final bge i = bge.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bge p = bge.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bge q = bge.a(600, 6000);
   private static final bge r = bge.a(100, 300);
   private static final btn s = btn.a().a($$0 -> !$$0.ag().equals(bip.U) && $$0.dK().w_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwh $$0, arx $$1) {
      $$0.dM().a(bsc.R, p.a($$1));
      $$0.dM().a(bsc.U, q.a($$1));
   }

   protected static bkb<?> a(bkb<bwh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bwh> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bnl(0.8F), new bkn(2.0F), new blx(45, 90), new bmb(), new bky(bsc.O), new bky(bsc.R), new bky(bsc.U)));
   }

   private static void c(bkb<bwh> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(0, new bkm(bip.U, 1.0F)),
            Pair.of(1, new blf($$0x -> 1.25F)),
            Pair.of(2, bkp.a(i, 1.25F)),
            Pair.of(3, new bmo(ImmutableList.of(Pair.of(bmj.a(1.0F), 2), Pair.of(bmy.a(1.0F, 3), 2), Pair.of(new blc(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bsc.V, bsd.b), Pair.of(bsc.S, bsd.b))
      );
   }

   private static void d(bkb<bwh> $$0) {
      $$0.a(
         cda.q,
         ImmutableList.of(Pair.of(0, new blt(p, aoz.jW)), Pair.of(1, new blv<>(p, 5, 5, 1.5F, $$0x -> $$0x.gk() ? aoz.jR : aoz.jH))),
         ImmutableSet.of(Pair.of(bsc.N, bsd.b), Pair.of(bsc.r, bsd.b), Pair.of(bsc.m, bsd.b), Pair.of(bsc.R, bsd.b))
      );
   }

   private static void e(bkb<bwh> $$0) {
      $$0.a(
         cda.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bmh(
                  $$0x -> $$0x.gk() ? r : q, s, 3.0F, $$0x -> $$0x.i_() ? 1.0 : 2.5, $$0x -> $$0x.gk() ? aoz.jU : aoz.jK, $$0x -> $$0x.gk() ? aoz.jV : aoz.jL
               )
            ),
            Pair.of(1, new bmg<>($$0x -> $$0x.gk() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gk() ? aoz.jT : aoz.jJ))
         ),
         ImmutableSet.of(Pair.of(bsc.N, bsd.b), Pair.of(bsc.r, bsd.b), Pair.of(bsc.U, bsd.b))
      );
   }

   public static void a(bwh $$0) {
      $$0.dM().a(ImmutableList.of(cda.r, cda.q, cda.b));
   }

   public static cmb a() {
      return cmb.a(cjd.oI);
   }
}
