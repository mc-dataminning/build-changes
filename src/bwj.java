import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class bwj {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bgl f = bgl.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(bwi $$0, ase $$1) {
      $$0.dN().a(bsj.R, f.a($$1));
   }

   protected static bki<?> a(bki<bwi> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bwi> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bku(2.0F), new bme(45, 90), new bmi(), new blf(bsj.O), new blf(bsj.R)));
   }

   private static void c(bki<bwi> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(0, new bkt(biw.O, 1.0F)),
            Pair.of(1, new blm($$0x -> 1.25F)),
            Pair.of(2, bnk.a(bwj::b, $$0x -> $$0x.dN().c(bsj.B))),
            Pair.of(3, bnv.a(6, 1.0F)),
            Pair.of(
               4,
               new bmv(
                  ImmutableMap.of(bsj.m, bsk.b),
                  ImmutableList.of(Pair.of(bmq.a(1.0F), 1), Pair.of(bnf.a(1.0F, 3), 1), Pair.of(new blg(), 3), Pair.of(bol.a(bis::aA), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsj.S, bsk.b), Pair.of(bsj.W, bsk.b))
      );
   }

   private static void d(bki<bwi> $$0) {
      $$0.a(
         cdh.t,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(1, new blm($$0x -> 1.25F)),
            Pair.of(2, bnk.a(bwj::b, $$0x -> $$0x.dN().c(bsj.B))),
            Pair.of(3, bnv.a(8, 1.5F)),
            Pair.of(
               5,
               new bln(
                  ImmutableMap.of(bsj.m, bsk.b),
                  ImmutableSet.of(),
                  bln.a.a,
                  bln.b.b,
                  ImmutableList.of(Pair.of(bmq.c(0.75F), 1), Pair.of(bmq.a(1.0F, true), 1), Pair.of(bnf.a(1.0F, 3), 1), Pair.of(bol.a(bis::ba), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bsj.S, bsk.b), Pair.of(bsj.W, bsk.a))
      );
   }

   private static void e(bki<bwi> $$0) {
      $$0.a(
         cdh.u,
         ImmutableList.of(
            Pair.of(0, bmy.a(biw.bt, 6.0F, bgl.a(30, 60))),
            Pair.of(1, bnk.a(bwj::b, $$0x -> $$0x.dN().c(bsj.B))),
            Pair.of(2, bnw.a(8, 1.0F)),
            Pair.of(3, bny.a(csy.sm)),
            Pair.of(4, new bmv(ImmutableList.of(Pair.of(bmq.a(1.0F), 2), Pair.of(bnf.a(1.0F, 3), 1), Pair.of(new blg(), 2), Pair.of(bol.a(bis::aA), 1))))
         ),
         ImmutableSet.of(Pair.of(bsj.S, bsk.b), Pair.of(bsj.X, bsk.a))
      );
   }

   private static void f(bki<bwi> $$0) {
      $$0.a(
         cdh.q,
         ImmutableList.of(Pair.of(0, new bma(f, apf.iK)), Pair.of(1, new bmb<>(f, 2, 4, 1.5F, $$0x -> apf.iJ, apu.bK, 0.5F, bwj::a))),
         ImmutableSet.of(Pair.of(bsj.N, bsk.b), Pair.of(bsj.r, bsk.b), Pair.of(bsj.R, bsk.b), Pair.of(bsj.W, bsk.b))
      );
   }

   private static void g(bki<bwi> $$0) {
      $$0.a(cdh.s, 0, ImmutableList.of(bnn.a(), new bwk(apf.iL, apf.iG)), bsj.o);
   }

   private static <E extends bjk> boolean a(E $$0, gw $$1) {
      cpx $$2 = $$0.dL();
      gw $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dfl $$4 = $$2.a_($$1);
         dfl $$5 = $$2.a_($$3);
         if (!$$4.a(apu.bK) && !$$5.a(apu.bK)) {
            eaz $$6 = ebi.a($$2, $$1.j());
            eaz $$7 = ebi.a($$2, $$3.j());
            return $$6 != eaz.e && (!$$4.i() || $$7 != eaz.e) ? bmc.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(bwi $$0) {
      return !blb.a($$0);
   }

   public static void a(bwi $$0) {
      $$0.dN().a(ImmutableList.of(cdh.s, cdh.u, cdh.q, cdh.t, cdh.b));
   }

   public static cmi a() {
      return bwi.bT;
   }
}
