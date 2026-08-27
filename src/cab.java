import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cab {
   public static final int a = 20;
   public static final int b = 7;
   private static final bjn i = bjn.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.0F;
   private static final float l = 1.25F;
   private static final float m = 1.25F;
   private static final float n = 2.0F;
   private static final float o = 1.25F;
   private static final bjn p = bjn.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 1.5F;
   private static final bjn q = bjn.a(600, 6000);
   private static final bjn r = bjn.a(100, 300);
   private static final bxd s = bxd.a().a($$0 -> !$$0.ai().equals(bmc.W) && $$0.dL().D_().a($$0.cH()));
   private static final float t = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(caa $$0, auw $$1) {
      $$0.dN().a(bvq.S, p.a($$1));
      $$0.dN().a(bvq.V, q.a($$1));
   }

   protected static bno<?> a(bno<caa> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<caa> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), new boa(2.0F), new bpl(45, 90), new bpp(), new bol(bvq.P), new bol(bvq.S), new bol(bvq.V)));
   }

   private static void c(bno<caa> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(0, new bnz(bmc.W, 1.0F)),
            Pair.of(1, new bos($$0x -> 1.25F)),
            Pair.of(2, boc.a(i, 1.25F)),
            Pair.of(3, new bqc(ImmutableList.of(Pair.of(bpx.a(1.0F), 2), Pair.of(bqm.a(1.0F, 3), 2), Pair.of(new bop(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(bvq.W, bvr.b), Pair.of(bvq.T, bvr.b))
      );
   }

   private static void d(bno<caa> $$0) {
      $$0.a(
         chc.q,
         ImmutableList.of(Pair.of(0, new bpg(p, art.kO)), Pair.of(1, new bpi<>(p, 5, 5, 1.5F, $$0x -> $$0x.gp() ? art.kJ : art.kz))),
         ImmutableSet.of(Pair.of(bvq.O, bvr.b), Pair.of(bvq.r, bvr.b), Pair.of(bvq.m, bvr.b), Pair.of(bvq.S, bvr.b))
      );
   }

   private static void e(bno<caa> $$0) {
      $$0.a(
         chc.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bpv(
                  $$0x -> $$0x.gp() ? r : q, s, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gp() ? art.kM : art.kC, $$0x -> $$0x.gp() ? art.kN : art.kD
               )
            ),
            Pair.of(1, new bpu<>($$0x -> $$0x.gp() ? r.a() : q.a(), 4, 7, 1.25F, s, 20, $$0x -> $$0x.gp() ? art.kL : art.kB))
         ),
         ImmutableSet.of(Pair.of(bvq.O, bvr.b), Pair.of(bvq.r, bvr.b), Pair.of(bvq.V, bvr.b))
      );
   }

   public static void a(caa $$0) {
      $$0.dN().a(ImmutableList.of(chc.r, chc.q, chc.b));
   }

   public static cqh a() {
      return cqh.a(cnj.pv);
   }
}
