import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chv {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bra e = bra.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(chu $$0, azl $$1) {
      $$0.dX().a(cdn.S, e.a($$1));
   }

   protected static bvl<?> a(bvl<chu> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chu> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new bvx(2.0F), new bxi(45, 90), new bxm(), new bwi(cdn.P), new bwi(cdn.S)));
   }

   private static void c(bvl<chu> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(0, new bvw(btv.R)),
            Pair.of(1, new bwp($$0x -> 1.25F)),
            Pair.of(2, byo.a(chv::b, $$0x -> $$0x.dX().c(cdn.B))),
            Pair.of(3, byz.a(6, 1.0F)),
            Pair.of(
               4,
               new bxz(
                  ImmutableMap.of(cdn.m, cdo.b),
                  ImmutableList.of(Pair.of(bxu.a(1.0F), 1), Pair.of(byj.a(1.0F, 3), 1), Pair.of(new bwj(), 3), Pair.of(bzp.a(bto::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdn.T, cdo.b), Pair.of(cdn.X, cdo.b))
      );
   }

   private static void d(bvl<chu> $$0) {
      $$0.a(
         cpm.t,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, new bwp($$0x -> 1.25F)),
            Pair.of(2, byo.a(chv::b, $$0x -> $$0x.dX().c(cdn.B))),
            Pair.of(3, byz.a(8, 1.5F)),
            Pair.of(
               5,
               new bwq(
                  ImmutableMap.of(cdn.m, cdo.b),
                  ImmutableSet.of(),
                  bwq.a.a,
                  bwq.b.b,
                  ImmutableList.of(Pair.of(bxu.c(0.75F), 1), Pair.of(bxu.a(1.0F, true), 1), Pair.of(byj.a(1.0F, 3), 1), Pair.of(bzp.a(bto::bl), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cdn.T, cdo.b), Pair.of(cdn.X, cdo.a))
      );
   }

   private static void e(bvl<chu> $$0) {
      $$0.a(
         cpm.u,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, byo.a(chv::b, $$0x -> $$0x.dX().c(cdn.B))),
            Pair.of(2, bza.a(8, 1.0F)),
            Pair.of(3, bzc.a(dhl.tn)),
            Pair.of(4, new bxz(ImmutableList.of(Pair.of(bxu.a(1.0F), 2), Pair.of(byj.a(1.0F, 3), 1), Pair.of(new bwj(), 2), Pair.of(bzp.a(bto::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cdn.T, cdo.b), Pair.of(cdn.Y, cdo.a))
      );
   }

   private static void f(bvl<chu> $$0) {
      $$0.a(
         cpm.q,
         ImmutableList.of(Pair.of(0, new bxd(e, awe.jS)), Pair.of(1, new bxe<>(e, 2, 4, 3.5714288F, $$0x -> awe.jR, awt.bS, 0.5F, chv::a))),
         ImmutableSet.of(Pair.of(cdn.O, cdo.b), Pair.of(cdn.r, cdo.b), Pair.of(cdn.S, cdo.b), Pair.of(cdn.X, cdo.b))
      );
   }

   private static void g(bvl<chu> $$0) {
      $$0.a(cpm.s, 0, ImmutableList.of(byr.a(), new chw(awe.jT, awe.jO)), cdn.o);
   }

   private static <E extends bum> boolean a(E $$0, je $$1) {
      deg $$2 = $$0.dS();
      je $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         duo $$4 = $$2.a_($$1);
         duo $$5 = $$2.a_($$3);
         if (!$$4.a(awt.bS) && !$$5.a(awt.bS)) {
            eri $$6 = new eri($$0.dS(), $$0);
            erg $$7 = erl.a($$6, $$1.k());
            erg $$8 = erl.a($$6, $$3.k());
            return $$7 != erg.e && (!$$4.l() || $$8 != erg.e) ? bxf.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(chu $$0) {
      return !bwe.a($$0);
   }

   public static void a(chu $$0) {
      $$0.dX().a(ImmutableList.of(cpm.s, cpm.u, cpm.q, cpm.t, cpm.b));
   }

   public static Predicate<cvp> a() {
      return $$0 -> $$0.a(axc.al);
   }
}
