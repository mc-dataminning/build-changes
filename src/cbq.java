import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class cbq {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final blh e = blh.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 1.5F;
   private static final float i = 1.25F;

   protected static void a(cbp $$0, awp $$1) {
      $$0.dO().a(bxl.S, e.a($$1));
   }

   protected static bpj<?> a(bpj<cbp> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbp> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bpv(2.0F), new brg(45, 90), new brk(), new bqg(bxl.P), new bqg(bxl.S)));
   }

   private static void c(bpj<cbp> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(0, new bpu(bnw.Q)),
            Pair.of(1, new bqn($$0x -> 1.25F)),
            Pair.of(2, bsm.a(cbq::b, $$0x -> $$0x.dO().c(bxl.B))),
            Pair.of(3, bsx.a(6, 1.0F)),
            Pair.of(
               4,
               new brx(
                  ImmutableMap.of(bxl.m, bxm.b),
                  ImmutableList.of(Pair.of(brs.a(1.0F), 1), Pair.of(bsh.a(1.0F, 3), 1), Pair.of(new bqh(), 3), Pair.of(btn.a(bnq::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bxl.T, bxm.b), Pair.of(bxl.X, bxm.b))
      );
   }

   private static void d(bpj<cbp> $$0) {
      $$0.a(
         ciy.t,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, new bqn($$0x -> 1.25F)),
            Pair.of(2, bsm.a(cbq::b, $$0x -> $$0x.dO().c(bxl.B))),
            Pair.of(3, bsx.a(8, 1.5F)),
            Pair.of(
               5,
               new bqo(
                  ImmutableMap.of(bxl.m, bxm.b),
                  ImmutableSet.of(),
                  bqo.a.a,
                  bqo.b.b,
                  ImmutableList.of(Pair.of(brs.c(0.75F), 1), Pair.of(brs.a(1.0F, true), 1), Pair.of(bsh.a(1.0F, 3), 1), Pair.of(btn.a(bnq::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bxl.T, bxm.b), Pair.of(bxl.X, bxm.a))
      );
   }

   private static void e(bpj<cbp> $$0) {
      $$0.a(
         ciy.u,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, bsm.a(cbq::b, $$0x -> $$0x.dO().c(bxl.B))),
            Pair.of(2, bsy.a(8, 1.0F)),
            Pair.of(3, bta.a(cyu.tn)),
            Pair.of(4, new brx(ImmutableList.of(Pair.of(brs.a(1.0F), 2), Pair.of(bsh.a(1.0F, 3), 1), Pair.of(new bqh(), 2), Pair.of(btn.a(bnq::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bxl.T, bxm.b), Pair.of(bxl.Y, bxm.a))
      );
   }

   private static void f(bpj<cbp> $$0) {
      $$0.a(
         ciy.q,
         ImmutableList.of(Pair.of(0, new brb(e, atl.jD)), Pair.of(1, new brc<>(e, 2, 4, 1.5F, $$0x -> atl.jC, aua.bK, 0.5F, cbq::a))),
         ImmutableSet.of(Pair.of(bxl.O, bxm.b), Pair.of(bxl.r, bxm.b), Pair.of(bxl.S, bxm.b), Pair.of(bxl.X, bxm.b))
      );
   }

   private static void g(bpj<cbp> $$0) {
      $$0.a(ciy.s, 0, ImmutableList.of(bsp.a(), new cbr(atl.jE, atl.jz)), bxl.o);
   }

   private static <E extends bok> boolean a(E $$0, hz $$1) {
      cvr $$2 = $$0.dM();
      hz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dlj $$4 = $$2.a_($$1);
         dlj $$5 = $$2.a_($$3);
         if (!$$4.a(aua.bK) && !$$5.a(aua.bK)) {
            ehh $$6 = ehq.a($$2, $$1.j());
            ehh $$7 = ehq.a($$2, $$3.j());
            return $$6 != ehh.e && (!$$4.i() || $$7 != ehh.e) ? brd.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cbp $$0) {
      return !bqc.a($$0);
   }

   public static void a(cbp $$0) {
      $$0.dO().a(ImmutableList.of(ciy.s, ciy.u, ciy.q, ciy.t, ciy.b));
   }

   public static csc a() {
      return cbp.bT;
   }
}
