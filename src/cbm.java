import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbm {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final blf e = blf.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 1.5F;
   private static final float i = 1.25F;

   protected static void a(cbl $$0, awo $$1) {
      $$0.dO().a(bxh.S, e.a($$1));
   }

   protected static bpf<?> a(bpf<cbl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cbl> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bpr(2.0F), new brc(45, 90), new brg(), new bqc(bxh.P), new bqc(bxh.S)));
   }

   private static void c(bpf<cbl> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(0, new bpq(bnu.Q)),
            Pair.of(1, new bqj($$0x -> 1.25F)),
            Pair.of(2, bsi.a(cbm::b, $$0x -> $$0x.dO().c(bxh.B))),
            Pair.of(3, bst.a(6, 1.0F)),
            Pair.of(
               4,
               new brt(
                  ImmutableMap.of(bxh.m, bxi.b),
                  ImmutableList.of(Pair.of(bro.a(1.0F), 1), Pair.of(bsd.a(1.0F, 3), 1), Pair.of(new bqd(), 3), Pair.of(btj.a(bno::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bxh.T, bxi.b), Pair.of(bxh.X, bxi.b))
      );
   }

   private static void d(bpf<cbl> $$0) {
      $$0.a(
         ciu.t,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, new bqj($$0x -> 1.25F)),
            Pair.of(2, bsi.a(cbm::b, $$0x -> $$0x.dO().c(bxh.B))),
            Pair.of(3, bst.a(8, 1.5F)),
            Pair.of(
               5,
               new bqk(
                  ImmutableMap.of(bxh.m, bxi.b),
                  ImmutableSet.of(),
                  bqk.a.a,
                  bqk.b.b,
                  ImmutableList.of(Pair.of(bro.c(0.75F), 1), Pair.of(bro.a(1.0F, true), 1), Pair.of(bsd.a(1.0F, 3), 1), Pair.of(btj.a(bno::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bxh.T, bxi.b), Pair.of(bxh.X, bxi.a))
      );
   }

   private static void e(bpf<cbl> $$0) {
      $$0.a(
         ciu.u,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, bsi.a(cbm::b, $$0x -> $$0x.dO().c(bxh.B))),
            Pair.of(2, bsu.a(8, 1.0F)),
            Pair.of(3, bsw.a(cyq.tn)),
            Pair.of(4, new brt(ImmutableList.of(Pair.of(bro.a(1.0F), 2), Pair.of(bsd.a(1.0F, 3), 1), Pair.of(new bqd(), 2), Pair.of(btj.a(bno::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bxh.T, bxi.b), Pair.of(bxh.Y, bxi.a))
      );
   }

   private static void f(bpf<cbl> $$0) {
      $$0.a(
         ciu.q,
         ImmutableList.of(Pair.of(0, new bqx(e, atk.jC)), Pair.of(1, new bqy<>(e, 2, 4, 1.5F, $$0x -> atk.jB, atz.bK, 0.5F, cbm::a))),
         ImmutableSet.of(Pair.of(bxh.O, bxi.b), Pair.of(bxh.r, bxi.b), Pair.of(bxh.S, bxi.b), Pair.of(bxh.X, bxi.b))
      );
   }

   private static void g(bpf<cbl> $$0) {
      $$0.a(ciu.s, 0, ImmutableList.of(bsl.a(), new cbn(atk.jD, atk.jy)), bxh.o);
   }

   private static <E extends boi> boolean a(E $$0, hz $$1) {
      cvn $$2 = $$0.dM();
      hz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dlf $$4 = $$2.a_($$1);
         dlf $$5 = $$2.a_($$3);
         if (!$$4.a(atz.bK) && !$$5.a(atz.bK)) {
            eha $$6 = ehj.a($$2, $$1.j());
            eha $$7 = ehj.a($$2, $$3.j());
            return $$6 != eha.e && (!$$4.i() || $$7 != eha.e) ? bqz.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cbl $$0) {
      return !bpy.a($$0);
   }

   public static void a(cbl $$0) {
      $$0.dO().a(ImmutableList.of(ciu.s, ciu.u, ciu.q, ciu.t, ciu.b));
   }

   public static cry a() {
      return cbl.bT;
   }
}
