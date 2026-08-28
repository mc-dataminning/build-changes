import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cim {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bro e = bro.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cil $$0, azs $$1) {
      $$0.ed().a(cee.S, e.a($$1));
   }

   protected static bwc<?> a(bwc<cil> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cil> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bwo(2.0F), new bxz(45, 90), new byd(), new bwz(cee.P), new bwz(cee.S)));
   }

   private static void c(bwc<cil> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(0, new bwn(bul.R)),
            Pair.of(1, new bxg($$0x -> 1.25F)),
            Pair.of(2, bzf.a(cim::b, $$0x -> $$0x.ed().c(cee.B))),
            Pair.of(3, bzq.a(6, 1.0F)),
            Pair.of(
               4,
               new byq(
                  ImmutableMap.of(cee.m, cef.b),
                  ImmutableList.of(Pair.of(byl.a(1.0F), 1), Pair.of(bza.a(1.0F, 3), 1), Pair.of(new bxa(), 3), Pair.of(cag.a(bue::aK), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cee.T, cef.b), Pair.of(cee.X, cef.b))
      );
   }

   private static void d(bwc<cil> $$0) {
      $$0.a(
         cqe.t,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, new bxg($$0x -> 1.25F)),
            Pair.of(2, bzf.a(cim::b, $$0x -> $$0x.ed().c(cee.B))),
            Pair.of(3, bzq.a(8, 1.5F)),
            Pair.of(
               5,
               new bxh(
                  ImmutableMap.of(cee.m, cef.b),
                  ImmutableSet.of(),
                  bxh.a.a,
                  bxh.b.b,
                  ImmutableList.of(Pair.of(byl.c(0.75F), 1), Pair.of(byl.a(1.0F, true), 1), Pair.of(bza.a(1.0F, 3), 1), Pair.of(cag.a(bue::bn), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cee.T, cef.b), Pair.of(cee.X, cef.a))
      );
   }

   private static void e(bwc<cil> $$0) {
      $$0.a(
         cqe.u,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, bzf.a(cim::b, $$0x -> $$0x.ed().c(cee.B))),
            Pair.of(2, bzr.a(8, 1.0F)),
            Pair.of(3, bzt.a(dig.tn)),
            Pair.of(4, new byq(ImmutableList.of(Pair.of(byl.a(1.0F), 2), Pair.of(bza.a(1.0F, 3), 1), Pair.of(new bxa(), 2), Pair.of(cag.a(bue::aK), 1))))
         ),
         ImmutableSet.of(Pair.of(cee.T, cef.b), Pair.of(cee.Y, cef.a))
      );
   }

   private static void f(bwc<cil> $$0) {
      $$0.a(
         cqe.q,
         ImmutableList.of(Pair.of(0, new bxu(e, awl.jS)), Pair.of(1, new bxv<>(e, 2, 4, 3.5714288F, $$0x -> awl.jR, axa.bS, 0.5F, cim::a))),
         ImmutableSet.of(Pair.of(cee.O, cef.b), Pair.of(cee.r, cef.b), Pair.of(cee.S, cef.b), Pair.of(cee.X, cef.b))
      );
   }

   private static void g(bwc<cil> $$0) {
      $$0.a(cqe.s, 0, ImmutableList.of(bzi.a(), new cin(awl.jT, awl.jO)), cee.o);
   }

   private static <E extends bvc> boolean a(E $$0, jh $$1) {
      dfb $$2 = $$0.dX();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dvj $$4 = $$2.a_($$1);
         dvj $$5 = $$2.a_($$3);
         if (!$$4.a(axa.bS) && !$$5.a(axa.bS)) {
            esd $$6 = new esd($$0.dX(), $$0);
            esb $$7 = esg.a($$6, $$1.k());
            esb $$8 = esg.a($$6, $$3.k());
            return $$7 != esb.e && (!$$4.l() || $$8 != esb.e) ? bxw.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cil $$0) {
      return !bwv.a($$0);
   }

   public static void a(cil $$0) {
      $$0.ed().a(ImmutableList.of(cqe.s, cqe.u, cqe.q, cqe.t, cqe.b));
   }

   public static Predicate<cwb> a() {
      return $$0 -> $$0.a(axj.ao);
   }
}
