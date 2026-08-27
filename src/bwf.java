import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwf {
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
   private static final btk s = btk.a().a($$0 -> !$$0.ag().equals(bim.U) && $$0.dK().w_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwe $$0, aru $$1) {
      $$0.dM().a(brz.R, p.a($$1));
      $$0.dM().a(brz.U, q.a($$1));
   }

   protected static bjy<?> a(bjy<bwe> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bwe> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bni(0.8F), new bkk(2.0F), new blu(45, 90), new bly(), new bkv(brz.O), new bkv(brz.R), new bkv(brz.U)));
   }

   private static void c(bjy<bwe> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(0, new bkj(bim.U, 1.0F)),
            Pair.of(1, new blc($$0x -> 1.25F)),
            Pair.of(2, bkm.a(i, 1.25F)),
            Pair.of(3, new bml(ImmutableList.of(Pair.of(bmg.a(1.0F), 2), Pair.of(bmv.a(1.0F, 3), 2), Pair.of(new bkz(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(brz.V, bsa.b), Pair.of(brz.S, bsa.b))
      );
   }

   private static void d(bjy<bwe> $$0) {
      $$0.a(
         ccx.q,
         ImmutableList.of(Pair.of(0, new blq(p, aow.jW)), Pair.of(1, new bls<>(p, 5, 5, 1.5F, $$0x -> $$0x.gk() ? aow.jR : aow.jH))),
         ImmutableSet.of(Pair.of(brz.N, bsa.b), Pair.of(brz.r, bsa.b), Pair.of(brz.m, bsa.b), Pair.of(brz.R, bsa.b))
      );
   }

   private static void e(bjy<bwe> $$0) {
      $$0.a(
         ccx.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bme(
                  $$0x -> $$0x.gk() ? r : q, s, 3.0F, $$0x -> $$0x.i_() ? 1.0 : 2.5, $$0x -> $$0x.gk() ? aow.jU : aow.jK, $$0x -> $$0x.gk() ? aow.jV : aow.jL
               )
            ),
            Pair.of(1, new bmd<>($$0x -> $$0x.gk() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gk() ? aow.jT : aow.jJ))
         ),
         ImmutableSet.of(Pair.of(brz.N, bsa.b), Pair.of(brz.r, bsa.b), Pair.of(brz.U, bsa.b))
      );
   }

   public static void a(bwe $$0) {
      $$0.dM().a(ImmutableList.of(ccx.r, ccx.q, ccx.b));
   }

   public static clx a() {
      return clx.a(cja.oI);
   }
}
