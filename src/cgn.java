import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bps e = bps.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgm $$0, ayo $$1) {
      $$0.dV().a(ccg.S, e.a($$1));
   }

   protected static bue<?> a(bue<cgm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<cgm> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new buq(2.0F), new bwb(45, 90), new bwf(), new bvb(ccg.P), new bvb(ccg.S)));
   }

   private static void c(bue<cgm> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(0, new bup(bsn.R)),
            Pair.of(1, new bvi($$0x -> 1.25F)),
            Pair.of(2, bxh.a(cgn::b, $$0x -> $$0x.dV().c(ccg.B))),
            Pair.of(3, bxs.a(6, 1.0F)),
            Pair.of(
               4,
               new bws(
                  ImmutableMap.of(ccg.m, cch.b),
                  ImmutableList.of(Pair.of(bwn.a(1.0F), 1), Pair.of(bxc.a(1.0F, 3), 1), Pair.of(new bvc(), 3), Pair.of(byi.a(bsh::aG), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccg.T, cch.b), Pair.of(ccg.X, cch.b))
      );
   }

   private static void d(bue<cgm> $$0) {
      $$0.a(
         coa.t,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(1, new bvi($$0x -> 1.25F)),
            Pair.of(2, bxh.a(cgn::b, $$0x -> $$0x.dV().c(ccg.B))),
            Pair.of(3, bxs.a(8, 1.5F)),
            Pair.of(
               5,
               new bvj(
                  ImmutableMap.of(ccg.m, cch.b),
                  ImmutableSet.of(),
                  bvj.a.a,
                  bvj.b.b,
                  ImmutableList.of(Pair.of(bwn.c(0.75F), 1), Pair.of(bwn.a(1.0F, true), 1), Pair.of(bxc.a(1.0F, 3), 1), Pair.of(byi.a(bsh::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccg.T, cch.b), Pair.of(ccg.X, cch.a))
      );
   }

   private static void e(bue<cgm> $$0) {
      $$0.a(
         coa.u,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(1, bxh.a(cgn::b, $$0x -> $$0x.dV().c(ccg.B))),
            Pair.of(2, bxt.a(8, 1.0F)),
            Pair.of(3, bxv.a(dfk.tn)),
            Pair.of(4, new bws(ImmutableList.of(Pair.of(bwn.a(1.0F), 2), Pair.of(bxc.a(1.0F, 3), 1), Pair.of(new bvc(), 2), Pair.of(byi.a(bsh::aG), 1))))
         ),
         ImmutableSet.of(Pair.of(ccg.T, cch.b), Pair.of(ccg.Y, cch.a))
      );
   }

   private static void f(bue<cgm> $$0) {
      $$0.a(
         coa.q,
         ImmutableList.of(Pair.of(0, new bvw(e, avh.jR)), Pair.of(1, new bvx<>(e, 2, 4, 3.5714288F, $$0x -> avh.jQ, avw.bR, 0.5F, cgn::a))),
         ImmutableSet.of(Pair.of(ccg.O, cch.b), Pair.of(ccg.r, cch.b), Pair.of(ccg.S, cch.b), Pair.of(ccg.X, cch.b))
      );
   }

   private static void g(bue<cgm> $$0) {
      $$0.a(coa.s, 0, ImmutableList.of(bxk.a(), new cgo(avh.jS, avh.jN)), ccg.o);
   }

   private static <E extends bte> boolean a(E $$0, ja $$1) {
      dcg $$2 = $$0.dR();
      ja $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsl $$4 = $$2.a_($$1);
         dsl $$5 = $$2.a_($$3);
         if (!$$4.a(avw.bR) && !$$5.a(avw.bR)) {
            epc $$6 = new epc($$0.dR(), $$0);
            epa $$7 = epf.a($$6, $$1.j());
            epa $$8 = epf.a($$6, $$3.j());
            return $$7 != epa.e && (!$$4.i() || $$8 != epa.e) ? bvy.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgm $$0) {
      return !bux.a($$0);
   }

   public static void a(cgm $$0) {
      $$0.dV().a(ImmutableList.of(coa.s, coa.u, coa.q, coa.t, coa.b));
   }

   public static Predicate<cud> a() {
      return $$0 -> $$0.a(awf.al);
   }
}
