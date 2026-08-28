import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brd e = brd.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(chx $$0, azn $$1) {
      $$0.dY().a(cdq.S, e.a($$1));
   }

   protected static bvo<?> a(bvo<chx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<chx> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new bwa(2.0F), new bxl(45, 90), new bxp(), new bwl(cdq.P), new bwl(cdq.S)));
   }

   private static void c(bvo<chx> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(0, new bvz(bty.R)),
            Pair.of(1, new bws($$0x -> 1.25F)),
            Pair.of(2, byr.a(chy::b, $$0x -> $$0x.dY().c(cdq.B))),
            Pair.of(3, bzc.a(6, 1.0F)),
            Pair.of(
               4,
               new byc(
                  ImmutableMap.of(cdq.m, cdr.b),
                  ImmutableList.of(Pair.of(bxx.a(1.0F), 1), Pair.of(bym.a(1.0F, 3), 1), Pair.of(new bwm(), 3), Pair.of(bzs.a(btr::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdq.T, cdr.b), Pair.of(cdq.X, cdr.b))
      );
   }

   private static void d(bvo<chx> $$0) {
      $$0.a(
         cpp.t,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, new bws($$0x -> 1.25F)),
            Pair.of(2, byr.a(chy::b, $$0x -> $$0x.dY().c(cdq.B))),
            Pair.of(3, bzc.a(8, 1.5F)),
            Pair.of(
               5,
               new bwt(
                  ImmutableMap.of(cdq.m, cdr.b),
                  ImmutableSet.of(),
                  bwt.a.a,
                  bwt.b.b,
                  ImmutableList.of(Pair.of(bxx.c(0.75F), 1), Pair.of(bxx.a(1.0F, true), 1), Pair.of(bym.a(1.0F, 3), 1), Pair.of(bzs.a(btr::bl), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdq.T, cdr.b), Pair.of(cdq.X, cdr.a))
      );
   }

   private static void e(bvo<chx> $$0) {
      $$0.a(
         cpp.u,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, byr.a(chy::b, $$0x -> $$0x.dY().c(cdq.B))),
            Pair.of(2, bzd.a(8, 1.0F)),
            Pair.of(3, bzf.a(dho.tn)),
            Pair.of(4, new byc(ImmutableList.of(Pair.of(bxx.a(1.0F), 2), Pair.of(bym.a(1.0F, 3), 1), Pair.of(new bwm(), 2), Pair.of(bzs.a(btr::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cdq.T, cdr.b), Pair.of(cdq.Y, cdr.a))
      );
   }

   private static void f(bvo<chx> $$0) {
      $$0.a(
         cpp.q,
         ImmutableList.of(Pair.of(0, new bxg(e, awg.jS)), Pair.of(1, new bxh<>(e, 2, 4, 3.5714288F, $$0x -> awg.jR, awv.bS, 0.5F, chy::a))),
         ImmutableSet.of(Pair.of(cdq.O, cdr.b), Pair.of(cdq.r, cdr.b), Pair.of(cdq.S, cdr.b), Pair.of(cdq.X, cdr.b))
      );
   }

   private static void g(bvo<chx> $$0) {
      $$0.a(cpp.s, 0, ImmutableList.of(byu.a(), new chz(awg.jT, awg.jO)), cdq.o);
   }

   private static <E extends bup> boolean a(E $$0, jf $$1) {
      dej $$2 = $$0.dS();
      jf $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dus $$4 = $$2.a_($$1);
         dus $$5 = $$2.a_($$3);
         if (!$$4.a(awv.bS) && !$$5.a(awv.bS)) {
            erm $$6 = new erm($$0.dS(), $$0);
            erk $$7 = erp.a($$6, $$1.k());
            erk $$8 = erp.a($$6, $$3.k());
            return $$7 != erk.e && (!$$4.l() || $$8 != erk.e) ? bxi.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(chx $$0) {
      return !bwh.a($$0);
   }

   public static void a(chx $$0) {
      $$0.dY().a(ImmutableList.of(cpp.s, cpp.u, cpp.q, cpp.t, cpp.b));
   }

   public static Predicate<cvs> a() {
      return $$0 -> $$0.a(axe.al);
   }
}
