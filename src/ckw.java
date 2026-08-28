import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckw {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bto e = bto.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ckv $$0, azv $$1) {
      $$0.ec().a(cgg.T, e.a($$1));
   }

   protected static bye<?> a(bye<ckv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bye<ckv> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new byq(2.0F), new cab(45, 90), new caf(), new bzb(cgg.Q), new bzb(cgg.T)));
   }

   private static void c(bye<ckv> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(0, new byp(bwo.ab)),
            Pair.of(1, new bzi($$0x -> 1.25F)),
            Pair.of(2, cbh.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgg.C))),
            Pair.of(3, cbs.a(6, 1.0F)),
            Pair.of(
               4,
               new cas(
                  ImmutableMap.of(cgg.n, cgh.b),
                  ImmutableList.of(Pair.of(can.a(1.0F), 1), Pair.of(cbc.a(1.0F, 3), 1), Pair.of(new bzc(), 3), Pair.of(cci.a(bwf::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgg.U, cgh.b), Pair.of(cgg.Y, cgh.b))
      );
   }

   private static void d(bye<ckv> $$0) {
      $$0.a(
         csw.t,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, new bzi($$0x -> 1.25F)),
            Pair.of(2, cbh.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgg.C))),
            Pair.of(3, cbs.a(8, 1.5F)),
            Pair.of(
               5,
               new bzj(
                  ImmutableMap.of(cgg.n, cgh.b),
                  ImmutableSet.of(),
                  bzj.a.a,
                  bzj.b.b,
                  ImmutableList.of(Pair.of(can.c(0.75F), 1), Pair.of(can.a(1.0F, true), 1), Pair.of(cbc.a(1.0F, 3), 1), Pair.of(cci.a(bwf::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgg.U, cgh.b), Pair.of(cgg.Y, cgh.a))
      );
   }

   private static void e(bye<ckv> $$0) {
      $$0.a(
         csw.u,
         ImmutableList.of(
            Pair.of(0, cav.a(bwo.bS, 6.0F, bto.a(30, 60))),
            Pair.of(1, cbh.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ec().c(cgg.C))),
            Pair.of(2, cbt.a(8, 1.0F)),
            Pair.of(3, cbv.a(dmh.tX)),
            Pair.of(4, new cas(ImmutableList.of(Pair.of(can.a(1.0F), 2), Pair.of(cbc.a(1.0F, 3), 1), Pair.of(new bzc(), 2), Pair.of(cci.a(bwf::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cgg.U, cgh.b), Pair.of(cgg.Z, cgh.a))
      );
   }

   private static void f(bye<ckv> $$0) {
      $$0.a(
         csw.q,
         ImmutableList.of(Pair.of(0, new bzw(e, awn.kv)), Pair.of(1, new bzx<>(e, 2, 4, 3.5714288F, $$0x -> awn.ku, axc.bV, 0.5F, ckw::a))),
         ImmutableSet.of(Pair.of(cgg.P, cgh.b), Pair.of(cgg.s, cgh.b), Pair.of(cgg.T, cgh.b), Pair.of(cgg.Y, cgh.b))
      );
   }

   private static void g(bye<ckv> $$0) {
      $$0.a(csw.s, 0, ImmutableList.of(cbk.a(), new ckz(awn.kw, awn.kr)), cgg.p);
   }

   private static <E extends bxg> boolean a(E $$0, iu $$1) {
      dja $$2 = $$0.dV();
      iu $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         eah $$4 = $$2.a_($$1);
         eah $$5 = $$2.a_($$3);
         if (!$$4.a(axc.bV) && !$$5.a(axc.bV)) {
            exh $$6 = new exh($$0.dV(), $$0);
            exf $$7 = exk.a($$6, $$1.k());
            exf $$8 = exk.a($$6, $$3.k());
            return $$7 != exf.e && (!$$4.l() || $$8 != exf.e) ? bzy.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ckv $$0) {
      return !byx.a($$0);
   }

   public static void a(ckv $$0) {
      $$0.ec().a(ImmutableList.of(csw.s, csw.u, csw.q, csw.t, csw.b));
   }

   public static Predicate<czd> a() {
      return $$0 -> $$0.a(axk.ap);
   }
}
