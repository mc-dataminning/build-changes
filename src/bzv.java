import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bzv {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bjn f = bjn.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bzu $$0, auw $$1) {
      $$0.dN().a(bvq.S, f.a($$1));
   }

   protected static bno<?> a(bno<bzu> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bno<bzu> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new boa(2.0F), new bpl(45, 90), new bpp(), new bol(bvq.P), new bol(bvq.S)));
   }

   private static void c(bno<bzu> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(0, new bnz(bmc.Q, 1.0F)),
            Pair.of(1, new bos($$0x -> 1.25F)),
            Pair.of(2, bqr.a(bzv::b, $$0x -> $$0x.dN().c(bvq.B))),
            Pair.of(3, brc.a(6, 1.0F)),
            Pair.of(
               4,
               new bqc(
                  ImmutableMap.of(bvq.m, bvr.b),
                  ImmutableList.of(Pair.of(bpx.a(1.0F), 1), Pair.of(bqm.a(1.0F, 3), 1), Pair.of(new bom(), 3), Pair.of(brs.a(blw::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvq.T, bvr.b), Pair.of(bvq.X, bvr.b))
      );
   }

   private static void d(bno<bzu> $$0) {
      $$0.a(
         chc.t,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, new bos($$0x -> 1.25F)),
            Pair.of(2, bqr.a(bzv::b, $$0x -> $$0x.dN().c(bvq.B))),
            Pair.of(3, brc.a(8, 1.5F)),
            Pair.of(
               5,
               new bot(
                  ImmutableMap.of(bvq.m, bvr.b),
                  ImmutableSet.of(),
                  bot.a.a,
                  bot.b.b,
                  ImmutableList.of(Pair.of(bpx.c(0.75F), 1), Pair.of(bpx.a(1.0F, true), 1), Pair.of(bqm.a(1.0F, 3), 1), Pair.of(brs.a(blw::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bvq.T, bvr.b), Pair.of(bvq.X, bvr.a))
      );
   }

   private static void e(bno<bzu> $$0) {
      $$0.a(
         chc.u,
         ImmutableList.of(
            Pair.of(0, bqf.a(bmc.bw, 6.0F, bjn.a(30, 60))),
            Pair.of(1, bqr.a(bzv::b, $$0x -> $$0x.dN().c(bvq.B))),
            Pair.of(2, brd.a(8, 1.0F)),
            Pair.of(3, brf.a(cxa.tn)),
            Pair.of(4, new bqc(ImmutableList.of(Pair.of(bpx.a(1.0F), 2), Pair.of(bqm.a(1.0F, 3), 1), Pair.of(new bom(), 2), Pair.of(brs.a(blw::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bvq.T, bvr.b), Pair.of(bvq.Y, bvr.a))
      );
   }

   private static void f(bno<bzu> $$0) {
      $$0.a(
         chc.q,
         ImmutableList.of(Pair.of(0, new bpg(f, art.jC)), Pair.of(1, new bph<>(f, 2, 4, 1.5F, $$0x -> art.jB, asi.bK, 0.5F, bzv::a))),
         ImmutableSet.of(Pair.of(bvq.O, bvr.b), Pair.of(bvq.r, bvr.b), Pair.of(bvq.S, bvr.b), Pair.of(bvq.X, bvr.b))
      );
   }

   private static void g(bno<bzu> $$0) {
      $$0.a(chc.s, 0, ImmutableList.of(bqu.a(), new bzw(art.jD, art.jy)), bvq.o);
   }

   private static <E extends bmq> boolean a(E $$0, hx $$1) {
      ctx $$2 = $$0.dL();
      hx $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         djp $$4 = $$2.a_($$1);
         djp $$5 = $$2.a_($$3);
         if (!$$4.a(asi.bK) && !$$5.a(asi.bK)) {
            efk $$6 = eft.a($$2, $$1.j());
            efk $$7 = eft.a($$2, $$3.j());
            return $$6 != efk.e && (!$$4.i() || $$7 != efk.e) ? bpi.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bzu $$0) {
      return !boh.a($$0);
   }

   public static void a(bzu $$0) {
      $$0.dN().a(ImmutableList.of(chc.s, chc.u, chc.q, chc.t, chc.b));
   }

   public static cqh a() {
      return bzu.bU;
   }
}
