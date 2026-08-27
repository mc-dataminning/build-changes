import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfk {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final box e = box.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cfj $$0, ayg $$1) {
      $$0.dQ().a(cbd.S, e.a($$1));
   }

   protected static btb<?> a(btb<cfj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cfj> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new btn(2.0F), new buy(45, 90), new bvc(), new bty(cbd.P), new bty(cbd.S)));
   }

   private static void c(btb<cfj> $$0) {
      $$0.a(
         cmw.b,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(0, new btm(brn.R)),
            Pair.of(1, new buf($$0x -> 1.25F)),
            Pair.of(2, bwe.a(cfk::b, $$0x -> $$0x.dQ().c(cbd.B))),
            Pair.of(3, bwp.a(6, 1.0F)),
            Pair.of(
               4,
               new bvp(
                  ImmutableMap.of(cbd.m, cbe.b),
                  ImmutableList.of(Pair.of(bvk.a(1.0F), 1), Pair.of(bvz.a(1.0F, 3), 1), Pair.of(new btz(), 3), Pair.of(bxf.a(brh::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbd.T, cbe.b), Pair.of(cbd.X, cbe.b))
      );
   }

   private static void d(btb<cfj> $$0) {
      $$0.a(
         cmw.t,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(1, new buf($$0x -> 1.25F)),
            Pair.of(2, bwe.a(cfk::b, $$0x -> $$0x.dQ().c(cbd.B))),
            Pair.of(3, bwp.a(8, 1.5F)),
            Pair.of(
               5,
               new bug(
                  ImmutableMap.of(cbd.m, cbe.b),
                  ImmutableSet.of(),
                  bug.a.a,
                  bug.b.b,
                  ImmutableList.of(Pair.of(bvk.c(0.75F), 1), Pair.of(bvk.a(1.0F, true), 1), Pair.of(bvz.a(1.0F, 3), 1), Pair.of(bxf.a(brh::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbd.T, cbe.b), Pair.of(cbd.X, cbe.a))
      );
   }

   private static void e(btb<cfj> $$0) {
      $$0.a(
         cmw.u,
         ImmutableList.of(
            Pair.of(0, bvs.a(brn.bx, 6.0F, box.a(30, 60))),
            Pair.of(1, bwe.a(cfk::b, $$0x -> $$0x.dQ().c(cbd.B))),
            Pair.of(2, bwq.a(8, 1.0F)),
            Pair.of(3, bws.a(ddg.tn)),
            Pair.of(4, new bvp(ImmutableList.of(Pair.of(bvk.a(1.0F), 2), Pair.of(bvz.a(1.0F, 3), 1), Pair.of(new btz(), 2), Pair.of(bxf.a(brh::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(cbd.T, cbe.b), Pair.of(cbd.Y, cbe.a))
      );
   }

   private static void f(btb<cfj> $$0) {
      $$0.a(
         cmw.q,
         ImmutableList.of(Pair.of(0, new but(e, avc.jM)), Pair.of(1, new buu<>(e, 2, 4, 3.5714288F, $$0x -> avc.jL, avr.bR, 0.5F, cfk::a))),
         ImmutableSet.of(Pair.of(cbd.O, cbe.b), Pair.of(cbd.r, cbe.b), Pair.of(cbd.S, cbe.b), Pair.of(cbd.X, cbe.b))
      );
   }

   private static void g(btb<cfj> $$0) {
      $$0.a(cmw.s, 0, ImmutableList.of(bwh.a(), new cfl(avc.jN, avc.jI)), cbd.o);
   }

   private static <E extends bsc> boolean a(E $$0, in $$1) {
      dad $$2 = $$0.dN();
      in $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dqh $$4 = $$2.a_($$1);
         dqh $$5 = $$2.a_($$3);
         if (!$$4.a(avr.bR) && !$$5.a(avr.bR)) {
            emt $$6 = new emt($$0.dN(), $$0);
            emr $$7 = emw.a($$6, $$1.j());
            emr $$8 = emw.a($$6, $$3.j());
            return $$7 != emr.e && (!$$4.i() || $$8 != emr.e) ? buv.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cfj $$0) {
      return !btu.a($$0);
   }

   public static void a(cfj $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.s, cmw.u, cmw.q, cmw.t, cmw.b));
   }

   public static Predicate<csz> a() {
      return $$0 -> $$0.a(avz.al);
   }
}
