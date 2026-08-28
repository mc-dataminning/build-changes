import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgv {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqa e = bqa.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgu $$0, azc $$1) {
      $$0.dS().a(cco.S, e.a($$1));
   }

   protected static bum<?> a(bum<cgu> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cgu> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new buy(2.0F), new bwj(45, 90), new bwn(), new bvj(cco.P), new bvj(cco.S)));
   }

   private static void c(bum<cgu> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(0, new bux(bsv.R)),
            Pair.of(1, new bvq($$0x -> 1.25F)),
            Pair.of(2, bxp.a(cgv::b, $$0x -> $$0x.dS().c(cco.B))),
            Pair.of(3, bya.a(6, 1.0F)),
            Pair.of(
               4,
               new bxa(
                  ImmutableMap.of(cco.m, ccp.b),
                  ImmutableList.of(Pair.of(bwv.a(1.0F), 1), Pair.of(bxk.a(1.0F, 3), 1), Pair.of(new bvk(), 3), Pair.of(byq.a(bsp::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cco.T, ccp.b), Pair.of(cco.X, ccp.b))
      );
   }

   private static void d(bum<cgu> $$0) {
      $$0.a(
         coh.t,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(1, new bvq($$0x -> 1.25F)),
            Pair.of(2, bxp.a(cgv::b, $$0x -> $$0x.dS().c(cco.B))),
            Pair.of(3, bya.a(8, 1.5F)),
            Pair.of(
               5,
               new bvr(
                  ImmutableMap.of(cco.m, ccp.b),
                  ImmutableSet.of(),
                  bvr.a.a,
                  bvr.b.b,
                  ImmutableList.of(Pair.of(bwv.c(0.75F), 1), Pair.of(bwv.a(1.0F, true), 1), Pair.of(bxk.a(1.0F, 3), 1), Pair.of(byq.a(bsp::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cco.T, ccp.b), Pair.of(cco.X, ccp.a))
      );
   }

   private static void e(bum<cgu> $$0) {
      $$0.a(
         coh.u,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(1, bxp.a(cgv::b, $$0x -> $$0x.dS().c(cco.B))),
            Pair.of(2, byb.a(8, 1.0F)),
            Pair.of(3, byd.a(dew.tn)),
            Pair.of(4, new bxa(ImmutableList.of(Pair.of(bwv.a(1.0F), 2), Pair.of(bxk.a(1.0F, 3), 1), Pair.of(new bvk(), 2), Pair.of(byq.a(bsp::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(cco.T, ccp.b), Pair.of(cco.Y, ccp.a))
      );
   }

   private static void f(bum<cgu> $$0) {
      $$0.a(
         coh.q,
         ImmutableList.of(Pair.of(0, new bwe(e, avw.jR)), Pair.of(1, new bwf<>(e, 2, 4, 3.5714288F, $$0x -> avw.jQ, awl.bR, 0.5F, cgv::a))),
         ImmutableSet.of(Pair.of(cco.O, ccp.b), Pair.of(cco.r, ccp.b), Pair.of(cco.S, ccp.b), Pair.of(cco.X, ccp.b))
      );
   }

   private static void g(bum<cgu> $$0) {
      $$0.a(coh.s, 0, ImmutableList.of(bxs.a(), new cgw(avw.jS, avw.jN)), cco.o);
   }

   private static <E extends btm> boolean a(E $$0, iz $$1) {
      dbt $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         drx $$4 = $$2.a_($$1);
         drx $$5 = $$2.a_($$3);
         if (!$$4.a(awl.bR) && !$$5.a(awl.bR)) {
            eoj $$6 = new eoj($$0.dP(), $$0);
            eoh $$7 = eom.a($$6, $$1.j());
            eoh $$8 = eom.a($$6, $$3.j());
            return $$7 != eoh.e && (!$$4.i() || $$8 != eoh.e) ? bwg.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgu $$0) {
      return !bvf.a($$0);
   }

   public static void a(cgu $$0) {
      $$0.dS().a(ImmutableList.of(coh.s, coh.u, coh.q, coh.t, coh.b));
   }

   public static Predicate<cuk> a() {
      return $$0 -> $$0.a(awu.al);
   }
}
