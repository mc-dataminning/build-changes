import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwp {
   public static final int a = 20;
   public static final int b = 7;
   private static final bgl i = bgl.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bgl p = bgl.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bgl q = bgl.a(600, 6000);
   private static final bgl r = bgl.a(100, 300);
   private static final btu s = btu.a().a($$0 -> !$$0.ag().equals(biw.U) && $$0.dL().B_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bwo $$0, ase $$1) {
      $$0.dN().a(bsj.R, p.a($$1));
      $$0.dN().a(bsj.U, q.a($$1));
   }

   protected static bki<?> a(bki<bwo> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bwo> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bns(0.8F), new bku(2.0F), new bme(45, 90), new bmi(), new blf(bsj.O), new blf(bsj.R), new blf(bsj.U)));
   }

   private static void c(bki<bwo> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(0, new bkt(biw.U, 1.0F)),
            Pair.of(1, new blm($$0x -> 1.25F)),
            Pair.of(2, bkw.a(i, 1.25F)),
            Pair.of(3, new bmv(ImmutableList.of(Pair.of(bmq.a(1.0F), 2), Pair.of(bnf.a(1.0F, 3), 2), Pair.of(new blj(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bsj.V, bsk.b), Pair.of(bsj.S, bsk.b))
      );
   }

   private static void d(bki<bwo> $$0) {
      $$0.a(
         cdh.q,
         ImmutableList.of(Pair.of(0, new bma(p, apf.jW)), Pair.of(1, new bmc<>(p, 5, 5, 1.5F, $$0x -> $$0x.gn() ? apf.jR : apf.jH))),
         ImmutableSet.of(Pair.of(bsj.N, bsk.b), Pair.of(bsj.r, bsk.b), Pair.of(bsj.m, bsk.b), Pair.of(bsj.R, bsk.b))
      );
   }

   private static void e(bki<bwo> $$0) {
      $$0.a(
         cdh.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bmo(
                  $$0x -> $$0x.gn() ? r : q, s, 3.0F, $$0x -> $$0x.m_() ? 1.0 : 2.5, $$0x -> $$0x.gn() ? apf.jU : apf.jK, $$0x -> $$0x.gn() ? apf.jV : apf.jL
               )
            ),
            Pair.of(1, new bmn<>($$0x -> $$0x.gn() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gn() ? apf.jT : apf.jJ))
         ),
         ImmutableSet.of(Pair.of(bsj.N, bsk.b), Pair.of(bsj.r, bsk.b), Pair.of(bsj.U, bsk.b))
      );
   }

   public static void a(bwo $$0) {
      $$0.dN().a(ImmutableList.of(cdh.r, cdh.q, cdh.b));
   }

   public static cmi a() {
      return cmi.a(cjk.oI);
   }
}
