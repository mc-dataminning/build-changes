import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bxq {
   public static final int a = 20;
   public static final int b = 7;
   private static final bhm i = bhm.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bhm p = bhm.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bhm q = bhm.a(600, 6000);
   private static final bhm r = bhm.a(100, 300);
   private static final buv s = buv.a().a($$0 -> !$$0.ag().equals(bjx.U) && $$0.dL().C_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bxp $$0, ate $$1) {
      $$0.dN().a(btk.R, p.a($$1));
      $$0.dN().a(btk.U, q.a($$1));
   }

   protected static blj<?> a(blj<bxp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bxp> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bot(0.8F), new blv(2.0F), new bnf(45, 90), new bnj(), new bmg(btk.O), new bmg(btk.R), new bmg(btk.U)));
   }

   private static void c(blj<bxp> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(0, new blu(bjx.U, 1.0F)),
            Pair.of(1, new bmn($$0x -> 1.25F)),
            Pair.of(2, blx.a(i, 1.25F)),
            Pair.of(3, new bnw(ImmutableList.of(Pair.of(bnr.a(1.0F), 2), Pair.of(bog.a(1.0F, 3), 2), Pair.of(new bmk(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(btk.V, btl.b), Pair.of(btk.S, btl.b))
      );
   }

   private static void d(blj<bxp> $$0) {
      $$0.a(
         cei.q,
         ImmutableList.of(Pair.of(0, new bnb(p, aqd.jY)), Pair.of(1, new bnd<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? aqd.jT : aqd.jJ))),
         ImmutableSet.of(Pair.of(btk.N, btl.b), Pair.of(btk.r, btl.b), Pair.of(btk.m, btl.b), Pair.of(btk.R, btl.b))
      );
   }

   private static void e(blj<bxp> $$0) {
      $$0.a(
         cei.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bnp(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.n_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? aqd.jW : aqd.jM, $$0x -> $$0x.go() ? aqd.jX : aqd.jN
               )
            ),
            Pair.of(1, new bno<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? aqd.jV : aqd.jL))
         ),
         ImmutableSet.of(Pair.of(btk.N, btl.b), Pair.of(btk.r, btl.b), Pair.of(btk.U, btl.b))
      );
   }

   public static void a(bxp $$0) {
      $$0.dN().a(ImmutableList.of(cei.r, cei.q, cei.b));
   }

   public static cnk a() {
      return cnk.a(ckm.oI);
   }
}
