import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ciq {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brs e = brs.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cip $$0, azv $$1) {
      $$0.ee().a(cei.S, e.a($$1));
   }

   protected static bwg<?> a(bwg<cip> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cip> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bws(2.0F), new byd(45, 90), new byh(), new bxd(cei.P), new bxd(cei.S)));
   }

   private static void c(bwg<cip> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(0, new bwr(bup.R)),
            Pair.of(1, new bxk($$0x -> 1.25F)),
            Pair.of(2, bzj.a(ciq::b, $$0x -> $$0x.ee().c(cei.B))),
            Pair.of(3, bzu.a(6, 1.0F)),
            Pair.of(
               4,
               new byu(
                  ImmutableMap.of(cei.m, cej.b),
                  ImmutableList.of(Pair.of(byp.a(1.0F), 1), Pair.of(bze.a(1.0F, 3), 1), Pair.of(new bxe(), 3), Pair.of(cak.a(bui::aL), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cei.T, cej.b), Pair.of(cei.X, cej.b))
      );
   }

   private static void d(bwg<cip> $$0) {
      $$0.a(
         cqi.t,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(1, new bxk($$0x -> 1.25F)),
            Pair.of(2, bzj.a(ciq::b, $$0x -> $$0x.ee().c(cei.B))),
            Pair.of(3, bzu.a(8, 1.5F)),
            Pair.of(
               5,
               new bxl(
                  ImmutableMap.of(cei.m, cej.b),
                  ImmutableSet.of(),
                  bxl.a.a,
                  bxl.b.b,
                  ImmutableList.of(Pair.of(byp.c(0.75F), 1), Pair.of(byp.a(1.0F, true), 1), Pair.of(bze.a(1.0F, 3), 1), Pair.of(cak.a(bui::bo), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cei.T, cej.b), Pair.of(cei.X, cej.a))
      );
   }

   private static void e(bwg<cip> $$0) {
      $$0.a(
         cqi.u,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(1, bzj.a(ciq::b, $$0x -> $$0x.ee().c(cei.B))),
            Pair.of(2, bzv.a(8, 1.0F)),
            Pair.of(3, bzx.a(dil.tn)),
            Pair.of(4, new byu(ImmutableList.of(Pair.of(byp.a(1.0F), 2), Pair.of(bze.a(1.0F, 3), 1), Pair.of(new bxe(), 2), Pair.of(cak.a(bui::aL), 1))))
         ),
         ImmutableSet.of(Pair.of(cei.T, cej.b), Pair.of(cei.Y, cej.a))
      );
   }

   private static void f(bwg<cip> $$0) {
      $$0.a(
         cqi.q,
         ImmutableList.of(Pair.of(0, new bxy(e, awo.jS)), Pair.of(1, new bxz<>(e, 2, 4, 3.5714288F, $$0x -> awo.jR, axd.bS, 0.5F, ciq::a))),
         ImmutableSet.of(Pair.of(cei.O, cej.b), Pair.of(cei.r, cej.b), Pair.of(cei.S, cej.b), Pair.of(cei.X, cej.b))
      );
   }

   private static void g(bwg<cip> $$0) {
      $$0.a(cqi.s, 0, ImmutableList.of(bzm.a(), new cir(awo.jT, awo.jO)), cei.o);
   }

   private static <E extends bvg> boolean a(E $$0, jh $$1) {
      dff $$2 = $$0.dY();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dvo $$4 = $$2.a_($$1);
         dvo $$5 = $$2.a_($$3);
         if (!$$4.a(axd.bS) && !$$5.a(axd.bS)) {
            esh $$6 = new esh($$0.dY(), $$0);
            esf $$7 = esk.a($$6, $$1.k());
            esf $$8 = esk.a($$6, $$3.k());
            return $$7 != esf.e && (!$$4.l() || $$8 != esf.e) ? bya.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cip $$0) {
      return !bwz.a($$0);
   }

   public static void a(cip $$0) {
      $$0.ee().a(ImmutableList.of(cqi.s, cqi.u, cqi.q, cqi.t, cqi.b));
   }

   public static Predicate<cwf> a() {
      return $$0 -> $$0.a(axm.ap);
   }
}
