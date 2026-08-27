import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwc {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bge f = bge.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bwb $$0, arx $$1) {
      $$0.dM().a(bsc.R, f.a($$1));
   }

   protected static bkb<?> a(bkb<bwb> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bwb> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bkn(2.0F), new blx(45, 90), new bmb(), new bky(bsc.O), new bky(bsc.R)));
   }

   private static void c(bkb<bwb> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(0, new bkm(bip.O, 1.0F)),
            Pair.of(1, new blf($$0x -> 1.25F)),
            Pair.of(2, bnd.a(bwc::b, $$0x -> $$0x.dM().c(bsc.B))),
            Pair.of(3, bno.a(6, 1.0F)),
            Pair.of(
               4,
               new bmo(
                  ImmutableMap.of(bsc.m, bsd.b),
                  ImmutableList.of(Pair.of(bmj.a(1.0F), 1), Pair.of(bmy.a(1.0F, 3), 1), Pair.of(new bkz(), 3), Pair.of(boe.a(bil::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsc.S, bsd.b), Pair.of(bsc.W, bsd.b))
      );
   }

   private static void d(bkb<bwb> $$0) {
      $$0.a(
         cda.t,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(1, new blf($$0x -> 1.25F)),
            Pair.of(2, bnd.a(bwc::b, $$0x -> $$0x.dM().c(bsc.B))),
            Pair.of(3, bno.a(8, 1.5F)),
            Pair.of(
               5,
               new blg(
                  ImmutableMap.of(bsc.m, bsd.b),
                  ImmutableSet.of(),
                  blg.a.a,
                  blg.b.b,
                  ImmutableList.of(Pair.of(bmj.c(0.75F), 1), Pair.of(bmj.a(1.0F, true), 1), Pair.of(bmy.a(1.0F, 3), 1), Pair.of(boe.a(bil::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsc.S, bsd.b), Pair.of(bsc.W, bsd.a))
      );
   }

   private static void e(bkb<bwb> $$0) {
      $$0.a(
         cda.u,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(1, bnd.a(bwc::b, $$0x -> $$0x.dM().c(bsc.B))),
            Pair.of(2, bnp.a(8, 1.0F)),
            Pair.of(3, bnr.a(csr.sm)),
            Pair.of(4, new bmo(ImmutableList.of(Pair.of(bmj.a(1.0F), 2), Pair.of(bmy.a(1.0F, 3), 1), Pair.of(new bkz(), 2), Pair.of(boe.a(bil::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bsc.S, bsd.b), Pair.of(bsc.X, bsd.a))
      );
   }

   private static void f(bkb<bwb> $$0) {
      $$0.a(
         cda.q,
         ImmutableList.of(Pair.of(0, new blt(f, aoz.iK)), Pair.of(1, new blu<>(f, 2, 4, 1.5F, $$0x -> aoz.iJ, apo.bK, 0.5F, bwc::a))),
         ImmutableSet.of(Pair.of(bsc.N, bsd.b), Pair.of(bsc.r, bsd.b), Pair.of(bsc.R, bsd.b), Pair.of(bsc.W, bsd.b))
      );
   }

   private static void g(bkb<bwb> $$0) {
      $$0.a(cda.s, 0, ImmutableList.of(bng.a(), new bwd(aoz.iL, aoz.iG)), bsc.o);
   }

   private static <E extends bjd> boolean a(E $$0, gw $$1) {
      cpq $$2 = $$0.dK();
      gw $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dfe $$4 = $$2.a_($$1);
         dfe $$5 = $$2.a_($$3);
         if (!$$4.a(apo.bK) && !$$5.a(apo.bK)) {
            eas $$6 = ebb.a($$2, $$1.j());
            eas $$7 = ebb.a($$2, $$3.j());
            return $$6 != eas.e && (!$$4.i() || $$7 != eas.e) ? blv.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bwb $$0) {
      return !bku.a($$0);
   }

   public static void a(bwb $$0) {
      $$0.dM().a(ImmutableList.of(cda.s, cda.u, cda.q, cda.t, cda.b));
   }

   public static cmb a() {
      return bwb.bT;
   }
}
