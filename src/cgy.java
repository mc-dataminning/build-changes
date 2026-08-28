import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqd e = bqd.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgx $$0, azf $$1) {
      $$0.dS().a(ccr.S, e.a($$1));
   }

   protected static bup<?> a(bup<cgx> $$0) {
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

   private static void b(bup<cgx> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bvb(2.0F), new bwm(45, 90), new bwq(), new bvm(ccr.P), new bvm(ccr.S)));
   }

   private static void c(bup<cgx> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(0, new bva(bsy.R)),
            Pair.of(1, new bvt($$0x -> 1.25F)),
            Pair.of(2, bxs.a(cgy::b, $$0x -> $$0x.dS().c(ccr.B))),
            Pair.of(3, byd.a(6, 1.0F)),
            Pair.of(
               4,
               new bxd(
                  ImmutableMap.of(ccr.m, ccs.b),
                  ImmutableList.of(Pair.of(bwy.a(1.0F), 1), Pair.of(bxn.a(1.0F, 3), 1), Pair.of(new bvn(), 3), Pair.of(byt.a(bss::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccr.T, ccs.b), Pair.of(ccr.X, ccs.b))
      );
   }

   private static void d(bup<cgx> $$0) {
      $$0.a(
         cok.t,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, new bvt($$0x -> 1.25F)),
            Pair.of(2, bxs.a(cgy::b, $$0x -> $$0x.dS().c(ccr.B))),
            Pair.of(3, byd.a(8, 1.5F)),
            Pair.of(
               5,
               new bvu(
                  ImmutableMap.of(ccr.m, ccs.b),
                  ImmutableSet.of(),
                  bvu.a.a,
                  bvu.b.b,
                  ImmutableList.of(Pair.of(bwy.c(0.75F), 1), Pair.of(bwy.a(1.0F, true), 1), Pair.of(bxn.a(1.0F, 3), 1), Pair.of(byt.a(bss::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccr.T, ccs.b), Pair.of(ccr.X, ccs.a))
      );
   }

   private static void e(bup<cgx> $$0) {
      $$0.a(
         cok.u,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, bxs.a(cgy::b, $$0x -> $$0x.dS().c(ccr.B))),
            Pair.of(2, bye.a(8, 1.0F)),
            Pair.of(3, byg.a(dez.tn)),
            Pair.of(4, new bxd(ImmutableList.of(Pair.of(bwy.a(1.0F), 2), Pair.of(bxn.a(1.0F, 3), 1), Pair.of(new bvn(), 2), Pair.of(byt.a(bss::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(ccr.T, ccs.b), Pair.of(ccr.Y, ccs.a))
      );
   }

   private static void f(bup<cgx> $$0) {
      $$0.a(
         cok.q,
         ImmutableList.of(Pair.of(0, new bwh(e, avz.jR)), Pair.of(1, new bwi<>(e, 2, 4, 3.5714288F, $$0x -> avz.jQ, awo.bR, 0.5F, cgy::a))),
         ImmutableSet.of(Pair.of(ccr.O, ccs.b), Pair.of(ccr.r, ccs.b), Pair.of(ccr.S, ccs.b), Pair.of(ccr.X, ccs.b))
      );
   }

   private static void g(bup<cgx> $$0) {
      $$0.a(cok.s, 0, ImmutableList.of(bxv.a(), new cgz(avz.jS, avz.jN)), ccr.o);
   }

   private static <E extends btp> boolean a(E $$0, iz $$1) {
      dbw $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsa $$4 = $$2.a_($$1);
         dsa $$5 = $$2.a_($$3);
         if (!$$4.a(awo.bR) && !$$5.a(awo.bR)) {
            eom $$6 = new eom($$0.dP(), $$0);
            eok $$7 = eop.a($$6, $$1.j());
            eok $$8 = eop.a($$6, $$3.j());
            return $$7 != eok.e && (!$$4.i() || $$8 != eok.e) ? bwj.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgx $$0) {
      return !bvi.a($$0);
   }

   public static void a(cgx $$0) {
      $$0.dS().a(ImmutableList.of(cok.s, cok.u, cok.q, cok.t, cok.b));
   }

   public static Predicate<cun> a() {
      return $$0 -> $$0.a(awx.al);
   }
}
