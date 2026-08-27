import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bpl e = bpl.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cfy $$0, ayt $$1) {
      $$0.dZ().a(cbr.S, e.a($$1));
   }

   protected static btp<?> a(btp<cfy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cfy> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bub(2.0F), new bvm(45, 90), new bvq(), new bum(cbr.P), new bum(cbr.S)));
   }

   private static void c(btp<cfy> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(0, new bua(bsb.T)),
            Pair.of(1, new but($$0x -> 1.25F)),
            Pair.of(2, bws.a(cfz::b, $$0x -> $$0x.dZ().c(cbr.B))),
            Pair.of(3, bxd.a(6, 1.0F)),
            Pair.of(
               4,
               new bwd(
                  ImmutableMap.of(cbr.m, cbs.b),
                  ImmutableList.of(Pair.of(bvy.a(1.0F), 1), Pair.of(bwn.a(1.0F, 3), 1), Pair.of(new bun(), 3), Pair.of(bxt.a(brv::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbr.T, cbs.b), Pair.of(cbr.X, cbs.b))
      );
   }

   private static void d(btp<cfy> $$0) {
      $$0.a(
         cnq.t,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, new but($$0x -> 1.25F)),
            Pair.of(2, bws.a(cfz::b, $$0x -> $$0x.dZ().c(cbr.B))),
            Pair.of(3, bxd.a(8, 1.5F)),
            Pair.of(
               5,
               new buu(
                  ImmutableMap.of(cbr.m, cbs.b),
                  ImmutableSet.of(),
                  buu.a.a,
                  buu.b.b,
                  ImmutableList.of(Pair.of(bvy.c(0.75F), 1), Pair.of(bvy.a(1.0F, true), 1), Pair.of(bwn.a(1.0F, 3), 1), Pair.of(bxt.a(brv::bl), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbr.T, cbs.b), Pair.of(cbr.X, cbs.a))
      );
   }

   private static void e(btp<cfy> $$0) {
      $$0.a(
         cnq.u,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, bws.a(cfz::b, $$0x -> $$0x.dZ().c(cbr.B))),
            Pair.of(2, bxe.a(8, 1.0F)),
            Pair.of(3, bxg.a(dfe.uL)),
            Pair.of(4, new bwd(ImmutableList.of(Pair.of(bvy.a(1.0F), 2), Pair.of(bwn.a(1.0F, 3), 1), Pair.of(new bun(), 2), Pair.of(bxt.a(brv::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(cbr.T, cbs.b), Pair.of(cbr.Y, cbs.a))
      );
   }

   private static void f(btp<cfy> $$0) {
      $$0.a(
         cnq.q,
         ImmutableList.of(Pair.of(0, new bvh(e, avo.ke)), Pair.of(1, new bvi<>(e, 2, 4, 3.5714288F, $$0x -> avo.kd, awe.bU, 0.5F, cfz::a))),
         ImmutableSet.of(Pair.of(cbr.O, cbs.b), Pair.of(cbr.r, cbs.b), Pair.of(cbr.S, cbs.b), Pair.of(cbr.X, cbs.b))
      );
   }

   private static void g(btp<cfy> $$0) {
      $$0.a(cnq.s, 0, ImmutableList.of(bwv.a(), new cga(avo.kf, avo.ka)), cbr.o);
   }

   private static <E extends bsq> boolean a(E $$0, ir $$1) {
      dca $$2 = $$0.dU();
      ir $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dtc $$4 = $$2.a_($$1);
         dtc $$5 = $$2.a_($$3);
         if (!$$4.a(awe.bU) && !$$5.a(awe.bU)) {
            epx $$6 = new epx($$0.dU(), $$0);
            epv $$7 = eqa.a($$6, $$1.j());
            epv $$8 = eqa.a($$6, $$3.j());
            return $$7 != epv.e && (!$$4.i() || $$8 != epv.e) ? bvj.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cfy $$0) {
      return !bui.a($$0);
   }

   public static void a(cfy $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.s, cnq.u, cnq.q, cnq.t, cnq.b));
   }

   public static Predicate<cuh> a() {
      return $$0 -> $$0.a(awm.al);
   }
}
