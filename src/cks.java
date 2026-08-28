import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cks {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final btm e = btm.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ckr $$0, azv $$1) {
      $$0.eb().a(cge.T, e.a($$1));
   }

   protected static byc<?> a(byc<ckr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckr> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new byo(2.0F), new bzz(45, 90), new cad(), new byz(cge.Q), new byz(cge.T)));
   }

   private static void c(byc<ckr> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(0, new byn(bwm.ab)),
            Pair.of(1, new bzg($$0x -> 1.25F)),
            Pair.of(2, cbf.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cge.C))),
            Pair.of(3, cbq.a(6, 1.0F)),
            Pair.of(
               4,
               new caq(
                  ImmutableMap.of(cge.n, cgf.b),
                  ImmutableList.of(Pair.of(cal.a(1.0F), 1), Pair.of(cba.a(1.0F, 3), 1), Pair.of(new bza(), 3), Pair.of(ccg.a(bwd::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cge.U, cgf.b), Pair.of(cge.Y, cgf.b))
      );
   }

   private static void d(byc<ckr> $$0) {
      $$0.a(
         csr.t,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, new bzg($$0x -> 1.25F)),
            Pair.of(2, cbf.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cge.C))),
            Pair.of(3, cbq.a(8, 1.5F)),
            Pair.of(
               5,
               new bzh(
                  ImmutableMap.of(cge.n, cgf.b),
                  ImmutableSet.of(),
                  bzh.a.a,
                  bzh.b.b,
                  ImmutableList.of(Pair.of(cal.c(0.75F), 1), Pair.of(cal.a(1.0F, true), 1), Pair.of(cba.a(1.0F, 3), 1), Pair.of(ccg.a(bwd::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cge.U, cgf.b), Pair.of(cge.Y, cgf.a))
      );
   }

   private static void e(byc<ckr> $$0) {
      $$0.a(
         csr.u,
         ImmutableList.of(
            Pair.of(0, cat.a(bwm.bS, 6.0F, btm.a(30, 60))),
            Pair.of(1, cbf.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cge.C))),
            Pair.of(2, cbr.a(8, 1.0F)),
            Pair.of(3, cbt.a(dmc.tU)),
            Pair.of(4, new caq(ImmutableList.of(Pair.of(cal.a(1.0F), 2), Pair.of(cba.a(1.0F, 3), 1), Pair.of(new bza(), 2), Pair.of(ccg.a(bwd::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cge.U, cgf.b), Pair.of(cge.Z, cgf.a))
      );
   }

   private static void f(byc<ckr> $$0) {
      $$0.a(
         csr.q,
         ImmutableList.of(Pair.of(0, new bzu(e, awn.ks)), Pair.of(1, new bzv<>(e, 2, 4, 3.5714288F, $$0x -> awn.kr, axc.bU, 0.5F, cks::a))),
         ImmutableSet.of(Pair.of(cge.P, cgf.b), Pair.of(cge.s, cgf.b), Pair.of(cge.T, cgf.b), Pair.of(cge.Y, cgf.b))
      );
   }

   private static void g(byc<ckr> $$0) {
      $$0.a(csr.s, 0, ImmutableList.of(cbi.a(), new ckv(awn.kt, awn.ko)), cge.p);
   }

   private static <E extends bxe> boolean a(E $$0, iu $$1) {
      div $$2 = $$0.dV();
      iu $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dzz $$4 = $$2.a_($$1);
         dzz $$5 = $$2.a_($$3);
         if (!$$4.a(axc.bU) && !$$5.a(axc.bU)) {
            ewz $$6 = new ewz($$0.dV(), $$0);
            ewx $$7 = exc.a($$6, $$1.k());
            ewx $$8 = exc.a($$6, $$3.k());
            return $$7 != ewx.e && (!$$4.l() || $$8 != ewx.e) ? bzw.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ckr $$0) {
      return !byv.a($$0);
   }

   public static void a(ckr $$0) {
      $$0.eb().a(ImmutableList.of(csr.s, csr.u, csr.q, csr.t, csr.b));
   }

   public static Predicate<cyy> a() {
      return $$0 -> $$0.a(axk.ao);
   }
}
