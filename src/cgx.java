import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgx {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqb e = bqb.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgw $$0, ayv $$1) {
      $$0.dU().a(ccq.S, e.a($$1));
   }

   protected static buo<?> a(buo<cgw> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgw> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bva(2.0F), new bwl(45, 90), new bwp(), new bvl(ccq.P), new bvl(ccq.S)));
   }

   private static void c(buo<cgw> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(0, new buz(bsw.R)),
            Pair.of(1, new bvs($$0x -> 1.25F)),
            Pair.of(2, bxr.a(cgx::b, $$0x -> $$0x.dU().c(ccq.B))),
            Pair.of(3, byc.a(6, 1.0F)),
            Pair.of(
               4,
               new bxc(
                  ImmutableMap.of(ccq.m, ccr.b),
                  ImmutableList.of(Pair.of(bwx.a(1.0F), 1), Pair.of(bxm.a(1.0F, 3), 1), Pair.of(new bvm(), 3), Pair.of(bys.a(bsq::aF), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccq.T, ccr.b), Pair.of(ccq.X, ccr.b))
      );
   }

   private static void d(buo<cgw> $$0) {
      $$0.a(
         cok.t,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, new bvs($$0x -> 1.25F)),
            Pair.of(2, bxr.a(cgx::b, $$0x -> $$0x.dU().c(ccq.B))),
            Pair.of(3, byc.a(8, 1.5F)),
            Pair.of(
               5,
               new bvt(
                  ImmutableMap.of(ccq.m, ccr.b),
                  ImmutableSet.of(),
                  bvt.a.a,
                  bvt.b.b,
                  ImmutableList.of(Pair.of(bwx.c(0.75F), 1), Pair.of(bwx.a(1.0F, true), 1), Pair.of(bxm.a(1.0F, 3), 1), Pair.of(bys.a(bsq::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccq.T, ccr.b), Pair.of(ccq.X, ccr.a))
      );
   }

   private static void e(buo<cgw> $$0) {
      $$0.a(
         cok.u,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, bxr.a(cgx::b, $$0x -> $$0x.dU().c(ccq.B))),
            Pair.of(2, byd.a(8, 1.0F)),
            Pair.of(3, byf.a(dfy.tn)),
            Pair.of(4, new bxc(ImmutableList.of(Pair.of(bwx.a(1.0F), 2), Pair.of(bxm.a(1.0F, 3), 1), Pair.of(new bvm(), 2), Pair.of(bys.a(bsq::aF), 1))))
         ),
         ImmutableSet.of(Pair.of(ccq.T, ccr.b), Pair.of(ccq.Y, ccr.a))
      );
   }

   private static void f(buo<cgw> $$0) {
      $$0.a(
         cok.q,
         ImmutableList.of(Pair.of(0, new bwg(e, avo.jR)), Pair.of(1, new bwh<>(e, 2, 4, 3.5714288F, $$0x -> avo.jQ, awd.bR, 0.5F, cgx::a))),
         ImmutableSet.of(Pair.of(ccq.O, ccr.b), Pair.of(ccq.r, ccr.b), Pair.of(ccq.S, ccr.b), Pair.of(ccq.X, ccr.b))
      );
   }

   private static void g(buo<cgw> $$0) {
      $$0.a(cok.s, 0, ImmutableList.of(bxu.a(), new cgy(avo.jS, avo.jN)), ccq.o);
   }

   private static <E extends btn> boolean a(E $$0, jd $$1) {
      dcu $$2 = $$0.dQ();
      jd $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dta $$4 = $$2.a_($$1);
         dta $$5 = $$2.a_($$3);
         if (!$$4.a(awd.bR) && !$$5.a(awd.bR)) {
            epr $$6 = new epr($$0.dQ(), $$0);
            epp $$7 = epu.a($$6, $$1.j());
            epp $$8 = epu.a($$6, $$3.j());
            return $$7 != epp.e && (!$$4.i() || $$8 != epp.e) ? bwi.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgw $$0) {
      return !bvh.a($$0);
   }

   public static void a(cgw $$0) {
      $$0.dU().a(ImmutableList.of(cok.s, cok.u, cok.q, cok.t, cok.b));
   }

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awm.al);
   }
}
