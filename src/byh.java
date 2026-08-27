import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byh {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final bii f = bii.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(byg $$0, ats $$1) {
      $$0.dP().a(buh.R, f.a($$1));
   }

   protected static bmg<?> a(bmg<byg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<byg> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bms(2.0F), new boc(45, 90), new bog(), new bnd(buh.O), new bnd(buh.R)));
   }

   private static void c(bmg<byg> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(0, new bmr(bku.O, 1.0F)),
            Pair.of(1, new bnk($$0x -> 1.25F)),
            Pair.of(2, bpi.a(byh::b, $$0x -> $$0x.dP().c(buh.B))),
            Pair.of(3, bpt.a(6, 1.0F)),
            Pair.of(
               4,
               new bot(
                  ImmutableMap.of(buh.m, bui.b),
                  ImmutableList.of(Pair.of(boo.a(1.0F), 1), Pair.of(bpd.a(1.0F, 3), 1), Pair.of(new bne(), 3), Pair.of(bqj.a(bkq::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(buh.S, bui.b), Pair.of(buh.W, bui.b))
      );
   }

   private static void d(bmg<byg> $$0) {
      $$0.a(
         cff.t,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(1, new bnk($$0x -> 1.25F)),
            Pair.of(2, bpi.a(byh::b, $$0x -> $$0x.dP().c(buh.B))),
            Pair.of(3, bpt.a(8, 1.5F)),
            Pair.of(
               5,
               new bnl(
                  ImmutableMap.of(buh.m, bui.b),
                  ImmutableSet.of(),
                  bnl.a.a,
                  bnl.b.b,
                  ImmutableList.of(Pair.of(boo.c(0.75F), 1), Pair.of(boo.a(1.0F, true), 1), Pair.of(bpd.a(1.0F, 3), 1), Pair.of(bqj.a(bkq::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(buh.S, bui.b), Pair.of(buh.W, bui.a))
      );
   }

   private static void e(bmg<byg> $$0) {
      $$0.a(
         cff.u,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(1, bpi.a(byh::b, $$0x -> $$0x.dP().c(buh.B))),
            Pair.of(2, bpu.a(8, 1.0F)),
            Pair.of(3, bpw.a(cvc.tn)),
            Pair.of(4, new bot(ImmutableList.of(Pair.of(boo.a(1.0F), 2), Pair.of(bpd.a(1.0F, 3), 1), Pair.of(new bne(), 2), Pair.of(bqj.a(bkq::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(buh.S, bui.b), Pair.of(buh.X, bui.a))
      );
   }

   private static void f(bmg<byg> $$0) {
      $$0.a(
         cff.q,
         ImmutableList.of(Pair.of(0, new bny(f, aqr.je)), Pair.of(1, new bnz<>(f, 2, 4, 1.5F, $$0x -> aqr.jd, arg.bK, 0.5F, byh::a))),
         ImmutableSet.of(Pair.of(buh.N, bui.b), Pair.of(buh.r, bui.b), Pair.of(buh.R, bui.b), Pair.of(buh.W, bui.b))
      );
   }

   private static void g(bmg<byg> $$0) {
      $$0.a(cff.s, 0, ImmutableList.of(bpl.a(), new byi(aqr.jf, aqr.ja)), buh.o);
   }

   private static <E extends bli> boolean a(E $$0, ht $$1) {
      csa $$2 = $$0.dN();
      ht $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dhi $$4 = $$2.a_($$1);
         dhi $$5 = $$2.a_($$3);
         if (!$$4.a(arg.bK) && !$$5.a(arg.bK)) {
            edd $$6 = edm.a($$2, $$1.j());
            edd $$7 = edm.a($$2, $$3.j());
            return $$6 != edd.e && (!$$4.i() || $$7 != edd.e) ? boa.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(byg $$0) {
      return !bmz.a($$0);
   }

   public static void a(byg $$0) {
      $$0.dP().a(ImmutableList.of(cff.s, cff.u, cff.q, cff.t, cff.b));
   }

   public static cok a() {
      return byg.bT;
   }
}
