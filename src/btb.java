import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class btb {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bdi f = bdi.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bta $$0, apf $$1) {
      $$0.dK().a(bpb.R, f.a($$1));
   }

   protected static bha<?> a(bha<bta> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<bta> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bhm(2.0F), new biw(45, 90), new bja(), new bhx(bpb.O), new bhx(bpb.R)));
   }

   private static void c(bha<bta> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(0, new bhl(bfn.O, 1.0F)),
            Pair.of(1, new bie($$0x -> 1.25F)),
            Pair.of(2, bkc.a(btb::b, $$0x -> $$0x.dK().c(bpb.B))),
            Pair.of(3, bkn.a(6, 1.0F)),
            Pair.of(
               4,
               new bjn(
                  ImmutableMap.of(bpb.m, bpc.b),
                  ImmutableList.of(Pair.of(bji.a(1.0F), 1), Pair.of(bjx.a(1.0F, 3), 1), Pair.of(new bhy(), 3), Pair.of(bld.a(bfj::ay), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bpb.S, bpc.b), Pair.of(bpb.W, bpc.b))
      );
   }

   private static void d(bha<bta> $$0) {
      $$0.a(
         bzz.t,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(1, new bie($$0x -> 1.25F)),
            Pair.of(2, bkc.a(btb::b, $$0x -> $$0x.dK().c(bpb.B))),
            Pair.of(3, bkn.a(8, 1.5F)),
            Pair.of(
               5,
               new bif(
                  ImmutableMap.of(bpb.m, bpc.b),
                  ImmutableSet.of(),
                  bif.a.a,
                  bif.b.b,
                  ImmutableList.of(Pair.of(bji.c(0.75F), 1), Pair.of(bji.a(1.0F, true), 1), Pair.of(bjx.a(1.0F, 3), 1), Pair.of(bld.a(bfj::aY), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bpb.S, bpc.b), Pair.of(bpb.W, bpc.a))
      );
   }

   private static void e(bha<bta> $$0) {
      $$0.a(
         bzz.u,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(1, bkc.a(btb::b, $$0x -> $$0x.dK().c(bpb.B))),
            Pair.of(2, bko.a(8, 1.0F)),
            Pair.of(3, bkq.a(cpo.sm)),
            Pair.of(4, new bjn(ImmutableList.of(Pair.of(bji.a(1.0F), 2), Pair.of(bjx.a(1.0F, 3), 1), Pair.of(new bhy(), 2), Pair.of(bld.a(bfj::ay), 1))))
         ),
         ImmutableSet.of(Pair.of(bpb.S, bpc.b), Pair.of(bpb.X, bpc.a))
      );
   }

   private static void f(bha<bta> $$0) {
      $$0.a(
         bzz.q,
         ImmutableList.of(Pair.of(0, new bis(f, amh.iK)), Pair.of(1, new bit<>(f, 2, 4, 1.5F, $$0x -> amh.iJ, amw.bI, 0.5F, btb::a))),
         ImmutableSet.of(Pair.of(bpb.N, bpc.b), Pair.of(bpb.r, bpc.b), Pair.of(bpb.R, bpc.b), Pair.of(bpb.W, bpc.b))
      );
   }

   private static void g(bha<bta> $$0) {
      $$0.a(bzz.s, 0, ImmutableList.of(bkf.a(), new btc(amh.iL, amh.iG)), bpb.o);
   }

   private static <E extends bgb> boolean a(E $$0, gu $$1) {
      cmm $$2 = $$0.dI();
      gu $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dcb $$4 = $$2.a_($$1);
         dcb $$5 = $$2.a_($$3);
         if (!$$4.a(amw.bI) && !$$5.a(amw.bI)) {
            dxp $$6 = dxy.a($$2, $$1.j());
            dxp $$7 = dxy.a($$2, $$3.j());
            return $$6 != dxp.e && (!$$4.i() || $$7 != dxp.e) ? biu.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bta $$0) {
      return !bht.a($$0);
   }

   public static void a(bta $$0) {
      $$0.dK().a(ImmutableList.of(bzz.s, bzz.u, bzz.q, bzz.t, bzz.b));
   }

   public static ciz a() {
      return bta.bT;
   }
}
