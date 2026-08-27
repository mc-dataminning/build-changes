import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwe {
   public static final int a = 20;
   public static final int b = 7;
   private static final bfz i = bfz.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bfz p = bfz.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bfz q = bfz.a(600, 6000);
   private static final bfz r = bfz.a(100, 300);
   private static final btj s = btj.a().a($$0 -> !$$0.ag().equals(bik.U) && $$0.dK().w_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwd $$0, art $$1) {
      $$0.dM().a(bry.R, p.a($$1));
      $$0.dM().a(bry.U, q.a($$1));
   }

   protected static bjx<?> a(bjx<bwd> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bwd> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bnh(0.8F), new bkj(2.0F), new blt(45, 90), new blx(), new bku(bry.O), new bku(bry.R), new bku(bry.U)));
   }

   private static void c(bjx<bwd> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(0, new bki(bik.U, 1.0F)),
            Pair.of(1, new blb($$0x -> 1.25F)),
            Pair.of(2, bkl.a(i, 1.25F)),
            Pair.of(3, new bmk(ImmutableList.of(Pair.of(bmf.a(1.0F), 2), Pair.of(bmu.a(1.0F, 3), 2), Pair.of(new bky(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bry.V, brz.b), Pair.of(bry.S, brz.b))
      );
   }

   private static void d(bjx<bwd> $$0) {
      $$0.a(
         ccw.q,
         ImmutableList.of(Pair.of(0, new blp(p, aou.jW)), Pair.of(1, new blr<>(p, 5, 5, 1.5F, $$0x -> $$0x.gj() ? aou.jR : aou.jH))),
         ImmutableSet.of(Pair.of(bry.N, brz.b), Pair.of(bry.r, brz.b), Pair.of(bry.m, brz.b), Pair.of(bry.R, brz.b))
      );
   }

   private static void e(bjx<bwd> $$0) {
      $$0.a(
         ccw.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bmd(
                  $$0x -> $$0x.gj() ? r : q, s, 3.0F, $$0x -> $$0x.i_() ? 1.0 : 2.5, $$0x -> $$0x.gj() ? aou.jU : aou.jK, $$0x -> $$0x.gj() ? aou.jV : aou.jL
               )
            ),
            Pair.of(1, new bmc<>($$0x -> $$0x.gj() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gj() ? aou.jT : aou.jJ))
         ),
         ImmutableSet.of(Pair.of(bry.N, brz.b), Pair.of(bry.r, brz.b), Pair.of(bry.U, brz.b))
      );
   }

   public static void a(bwd $$0) {
      $$0.dM().a(ImmutableList.of(ccw.r, ccw.q, ccw.b));
   }

   public static clw a() {
      return clw.a(ciz.oI);
   }
}
