import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwg {
   public static final int a = 20;
   public static final int b = 7;
   private static final bgb i = bgb.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bgb p = bgb.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bgb q = bgb.a(600, 6000);
   private static final bgb r = bgb.a(100, 300);
   private static final btl s = btl.a().a($$0 -> !$$0.ag().equals(bim.U) && $$0.dK().w_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwf $$0, aru $$1) {
      $$0.dM().a(bsa.R, p.a($$1));
      $$0.dM().a(bsa.U, q.a($$1));
   }

   protected static bjz<?> a(bjz<bwf> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bwf> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bnj(0.8F), new bkl(2.0F), new blv(45, 90), new blz(), new bkw(bsa.O), new bkw(bsa.R), new bkw(bsa.U)));
   }

   private static void c(bjz<bwf> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(0, new bkk(bim.U, 1.0F)),
            Pair.of(1, new bld($$0x -> 1.25F)),
            Pair.of(2, bkn.a(i, 1.25F)),
            Pair.of(3, new bmm(ImmutableList.of(Pair.of(bmh.a(1.0F), 2), Pair.of(bmw.a(1.0F, 3), 2), Pair.of(new bla(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bsa.V, bsb.b), Pair.of(bsa.S, bsb.b))
      );
   }

   private static void d(bjz<bwf> $$0) {
      $$0.a(
         ccy.q,
         ImmutableList.of(Pair.of(0, new blr(p, aow.jW)), Pair.of(1, new blt<>(p, 5, 5, 1.5F, $$0x -> $$0x.gj() ? aow.jR : aow.jH))),
         ImmutableSet.of(Pair.of(bsa.N, bsb.b), Pair.of(bsa.r, bsb.b), Pair.of(bsa.m, bsb.b), Pair.of(bsa.R, bsb.b))
      );
   }

   private static void e(bjz<bwf> $$0) {
      $$0.a(
         ccy.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bmf(
                  $$0x -> $$0x.gj() ? r : q, s, 3.0F, $$0x -> $$0x.i_() ? 1.0 : 2.5, $$0x -> $$0x.gj() ? aow.jU : aow.jK, $$0x -> $$0x.gj() ? aow.jV : aow.jL
               )
            ),
            Pair.of(1, new bme<>($$0x -> $$0x.gj() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gj() ? aow.jT : aow.jJ))
         ),
         ImmutableSet.of(Pair.of(bsa.N, bsb.b), Pair.of(bsa.r, bsb.b), Pair.of(bsa.U, bsb.b))
      );
   }

   public static void a(bwf $$0) {
      $$0.dM().a(ImmutableList.of(ccy.r, ccy.q, ccy.b));
   }

   public static cly a() {
      return cly.a(cjb.oI);
   }
}
