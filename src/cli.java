import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cli {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final buc e = buc.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(clh $$0, azx $$1) {
      $$0.ec().a(cgw.T, e.a($$1));
   }

   protected static byu<?> a(byu<clh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<clh> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new bzg(2.0F), new car(45, 90), new cav(), new bzr(cgw.Q), new bzr(cgw.T)));
   }

   private static void c(byu<clh> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(0, new bzf(bxc.ac)),
            Pair.of(1, new bzy($$0x -> 1.25F)),
            Pair.of(2, cbx.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgw.C))),
            Pair.of(3, cci.a(6, 1.0F)),
            Pair.of(
               4,
               new cbi(
                  ImmutableMap.of(cgw.n, cgx.b),
                  ImmutableList.of(Pair.of(cbd.a(1.0F), 1), Pair.of(cbs.a(1.0F, 3), 1), Pair.of(new bzs(), 3), Pair.of(ccy.a(bwt::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgw.U, cgx.b), Pair.of(cgw.Y, cgx.b))
      );
   }

   private static void d(byu<clh> $$0) {
      $$0.a(
         ctr.t,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, new bzy($$0x -> 1.25F)),
            Pair.of(2, cbx.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgw.C))),
            Pair.of(3, cci.a(8, 1.5F)),
            Pair.of(
               5,
               new bzz(
                  ImmutableMap.of(cgw.n, cgx.b),
                  ImmutableSet.of(),
                  bzz.a.a,
                  bzz.b.b,
                  ImmutableList.of(Pair.of(cbd.c(0.75F), 1), Pair.of(cbd.a(1.0F, true), 1), Pair.of(cbs.a(1.0F, 3), 1), Pair.of(ccy.a(bwt::bi), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgw.U, cgx.b), Pair.of(cgw.Y, cgx.a))
      );
   }

   private static void e(byu<clh> $$0) {
      $$0.a(
         ctr.u,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, cbx.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgw.C))),
            Pair.of(2, ccj.a(8, 1.0F)),
            Pair.of(3, ccl.a(dne.tX)),
            Pair.of(4, new cbi(ImmutableList.of(Pair.of(cbd.a(1.0F), 2), Pair.of(cbs.a(1.0F, 3), 1), Pair.of(new bzs(), 2), Pair.of(ccy.a(bwt::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cgw.U, cgx.b), Pair.of(cgw.Z, cgx.a))
      );
   }

   private static void f(byu<clh> $$0) {
      $$0.a(
         ctr.q,
         ImmutableList.of(Pair.of(0, new cam(e, awp.kv)), Pair.of(1, new can<>(e, 2, 4, 3.5714288F, $$0x -> awp.ku, axe.bV, 0.5F, cli::a))),
         ImmutableSet.of(Pair.of(cgw.P, cgx.b), Pair.of(cgw.s, cgx.b), Pair.of(cgw.T, cgx.b), Pair.of(cgw.Y, cgx.b))
      );
   }

   private static void g(byu<clh> $$0) {
      $$0.a(ctr.s, 0, ImmutableList.of(cca.a(), new cll(awp.kw, awp.kr)), cgw.p);
   }

   private static <E extends bxw> boolean a(E $$0, iv $$1) {
      djx $$2 = $$0.dV();
      iv $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         ebe $$4 = $$2.a_($$1);
         ebe $$5 = $$2.a_($$3);
         if (!$$4.a(axe.bV) && !$$5.a(axe.bV)) {
            eyh $$6 = new eyh($$0.dV(), $$0);
            eyf $$7 = eyk.a($$6, $$1.k());
            eyf $$8 = eyk.a($$6, $$3.k());
            return $$7 != eyf.e && (!$$4.l() || $$8 != eyf.e) ? cao.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(clh $$0) {
      return !bzn.a($$0);
   }

   public static void a(clh $$0) {
      $$0.ec().a(ImmutableList.of(ctr.s, ctr.u, ctr.q, ctr.t, ctr.b));
   }

   public static Predicate<czy> a() {
      return $$0 -> $$0.a(axm.ap);
   }
}
