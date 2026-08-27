import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwa {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bgb f = bgb.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bvz $$0, aru $$1) {
      $$0.dM().a(bsa.R, f.a($$1));
   }

   protected static bjz<?> a(bjz<bvz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bvz> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bkl(2.0F), new blv(45, 90), new blz(), new bkw(bsa.O), new bkw(bsa.R)));
   }

   private static void c(bjz<bvz> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(0, new bkk(bim.O, 1.0F)),
            Pair.of(1, new bld($$0x -> 1.25F)),
            Pair.of(2, bnb.a(bwa::b, $$0x -> $$0x.dM().c(bsa.B))),
            Pair.of(3, bnm.a(6, 1.0F)),
            Pair.of(
               4,
               new bmm(
                  ImmutableMap.of(bsa.m, bsb.b),
                  ImmutableList.of(Pair.of(bmh.a(1.0F), 1), Pair.of(bmw.a(1.0F, 3), 1), Pair.of(new bkx(), 3), Pair.of(boc.a(bii::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsa.S, bsb.b), Pair.of(bsa.W, bsb.b))
      );
   }

   private static void d(bjz<bvz> $$0) {
      $$0.a(
         ccy.t,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bld($$0x -> 1.25F)),
            Pair.of(2, bnb.a(bwa::b, $$0x -> $$0x.dM().c(bsa.B))),
            Pair.of(3, bnm.a(8, 1.5F)),
            Pair.of(
               5,
               new ble(
                  ImmutableMap.of(bsa.m, bsb.b),
                  ImmutableSet.of(),
                  ble.a.a,
                  ble.b.b,
                  ImmutableList.of(Pair.of(bmh.c(0.75F), 1), Pair.of(bmh.a(1.0F, true), 1), Pair.of(bmw.a(1.0F, 3), 1), Pair.of(boc.a(bii::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsa.S, bsb.b), Pair.of(bsa.W, bsb.a))
      );
   }

   private static void e(bjz<bvz> $$0) {
      $$0.a(
         ccy.u,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, bnb.a(bwa::b, $$0x -> $$0x.dM().c(bsa.B))),
            Pair.of(2, bnn.a(8, 1.0F)),
            Pair.of(3, bnp.a(csn.sm)),
            Pair.of(4, new bmm(ImmutableList.of(Pair.of(bmh.a(1.0F), 2), Pair.of(bmw.a(1.0F, 3), 1), Pair.of(new bkx(), 2), Pair.of(boc.a(bii::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bsa.S, bsb.b), Pair.of(bsa.X, bsb.a))
      );
   }

   private static void f(bjz<bvz> $$0) {
      $$0.a(
         ccy.q,
         ImmutableList.of(Pair.of(0, new blr(f, aow.iK)), Pair.of(1, new bls<>(f, 2, 4, 1.5F, $$0x -> aow.iJ, apl.bK, 0.5F, bwa::a))),
         ImmutableSet.of(Pair.of(bsa.N, bsb.b), Pair.of(bsa.r, bsb.b), Pair.of(bsa.R, bsb.b), Pair.of(bsa.W, bsb.b))
      );
   }

   private static void g(bjz<bvz> $$0) {
      $$0.a(ccy.s, 0, ImmutableList.of(bne.a(), new bwb(aow.iL, aow.iG)), bsa.o);
   }

   private static <E extends bja> boolean a(E $$0, gu $$1) {
      cpm $$2 = $$0.dK();
      gu $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dfa $$4 = $$2.a_($$1);
         dfa $$5 = $$2.a_($$3);
         if (!$$4.a(apl.bK) && !$$5.a(apl.bK)) {
            eao $$6 = eax.a($$2, $$1.j());
            eao $$7 = eax.a($$2, $$3.j());
            return $$6 != eao.e && (!$$4.i() || $$7 != eao.e) ? blt.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bvz $$0) {
      return !bks.a($$0);
   }

   public static void a(bvz $$0) {
      $$0.dM().a(ImmutableList.of(ccy.s, ccy.u, ccy.q, ccy.t, ccy.b));
   }

   public static cly a() {
      return bvz.bT;
   }
}
