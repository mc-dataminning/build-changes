import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwt {
   public static final int a = 20;
   public static final int b = 7;
   private static final bgp i = bgp.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bgp p = bgp.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bgp q = bgp.a(600, 6000);
   private static final bgp r = bgp.a(100, 300);
   private static final bty s = bty.a().a($$0 -> !$$0.ag().equals(bja.U) && $$0.dL().B_().a($$0.cG()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(bws $$0, ash $$1) {
      $$0.dN().a(bsn.R, p.a($$1));
      $$0.dN().a(bsn.U, q.a($$1));
   }

   protected static bkm<?> a(bkm<bws> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bws> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bnw(0.8F), new bky(2.0F), new bmi(45, 90), new bmm(), new blj(bsn.O), new blj(bsn.R), new blj(bsn.U)));
   }

   private static void c(bkm<bws> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(0, new bkx(bja.U, 1.0F)),
            Pair.of(1, new blq($$0x -> 1.25F)),
            Pair.of(2, bla.a(i, 1.25F)),
            Pair.of(3, new bmz(ImmutableList.of(Pair.of(bmu.a(1.0F), 2), Pair.of(bnj.a(1.0F, 3), 2), Pair.of(new bln(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bsn.V, bso.b), Pair.of(bsn.S, bso.b))
      );
   }

   private static void d(bkm<bws> $$0) {
      $$0.a(
         cdl.q,
         ImmutableList.of(Pair.of(0, new bme(p, apg.jW)), Pair.of(1, new bmg<>(p, 5, 5, 1.5F, $$0x -> $$0x.go() ? apg.jR : apg.jH))),
         ImmutableSet.of(Pair.of(bsn.N, bso.b), Pair.of(bsn.r, bso.b), Pair.of(bsn.m, bso.b), Pair.of(bsn.R, bso.b))
      );
   }

   private static void e(bkm<bws> $$0) {
      $$0.a(
         cdl.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bms(
                  $$0x -> $$0x.go() ? r : q, s, 3.0F, $$0x -> $$0x.m_() ? 1.0 : 2.5, $$0x -> $$0x.go() ? apg.jU : apg.jK, $$0x -> $$0x.go() ? apg.jV : apg.jL
               )
            ),
            Pair.of(1, new bmr<>($$0x -> $$0x.go() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.go() ? apg.jT : apg.jJ))
         ),
         ImmutableSet.of(Pair.of(bsn.N, bso.b), Pair.of(bsn.r, bso.b), Pair.of(bsn.U, bso.b))
      );
   }

   public static void a(bws $$0) {
      $$0.dN().a(ImmutableList.of(cdl.r, cdl.q, cdl.b));
   }

   public static cmm a() {
      return cmm.a(cjo.oI);
   }
}
