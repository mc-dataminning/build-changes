import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cjn {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bsj e = bsj.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cjm $$0, azh $$1) {
      $$0.ea().a(cfc.S, e.a($$1));
   }

   protected static bxa<?> a(bxa<cjm> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cjm> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new bxm(2.0F), new byx(45, 90), new bzb(), new bxx(cfc.P), new bxx(cfc.S)));
   }

   private static void c(bxa<cjm> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(0, new bxl(bvi.ab)),
            Pair.of(1, new bye($$0x -> 1.25F)),
            Pair.of(2, cad.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ea().c(cfc.B))),
            Pair.of(3, cao.a(6, 1.0F)),
            Pair.of(
               4,
               new bzo(
                  ImmutableMap.of(cfc.m, cfd.b),
                  ImmutableList.of(Pair.of(bzj.a(1.0F), 1), Pair.of(bzy.a(1.0F, 3), 1), Pair.of(new bxy(), 3), Pair.of(cbe.a(bva::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfc.T, cfd.b), Pair.of(cfc.X, cfd.b))
      );
   }

   private static void d(bxa<cjm> $$0) {
      $$0.a(
         cri.t,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, new bye($$0x -> 1.25F)),
            Pair.of(2, cad.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ea().c(cfc.B))),
            Pair.of(3, cao.a(8, 1.5F)),
            Pair.of(
               5,
               new byf(
                  ImmutableMap.of(cfc.m, cfd.b),
                  ImmutableSet.of(),
                  byf.a.a,
                  byf.b.b,
                  ImmutableList.of(Pair.of(bzj.c(0.75F), 1), Pair.of(bzj.a(1.0F, true), 1), Pair.of(bzy.a(1.0F, 3), 1), Pair.of(cbe.a(bva::bj), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cfc.T, cfd.b), Pair.of(cfc.X, cfd.a))
      );
   }

   private static void e(bxa<cjm> $$0) {
      $$0.a(
         cri.u,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, cad.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.ea().c(cfc.B))),
            Pair.of(2, cap.a(8, 1.0F)),
            Pair.of(3, car.a(dkg.tR)),
            Pair.of(4, new bzo(ImmutableList.of(Pair.of(bzj.a(1.0F), 2), Pair.of(bzy.a(1.0F, 3), 1), Pair.of(new bxy(), 2), Pair.of(cbe.a(bva::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cfc.T, cfd.b), Pair.of(cfc.Y, cfd.a))
      );
   }

   private static void f(bxa<cjm> $$0) {
      $$0.a(
         cri.q,
         ImmutableList.of(Pair.of(0, new bys(e, awa.kr)), Pair.of(1, new byt<>(e, 2, 4, 3.5714288F, $$0x -> awa.kq, awp.bU, 0.5F, cjn::a))),
         ImmutableSet.of(Pair.of(cfc.O, cfd.b), Pair.of(cfc.r, cfd.b), Pair.of(cfc.S, cfd.b), Pair.of(cfc.X, cfd.b))
      );
   }

   private static void g(bxa<cjm> $$0) {
      $$0.a(cri.s, 0, ImmutableList.of(cag.a(), new cjo(awa.ks, awa.kn)), cfc.o);
   }

   private static <E extends bwa> boolean a(E $$0, ji $$1) {
      dgz $$2 = $$0.dU();
      ji $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dxq $$4 = $$2.a_($$1);
         dxq $$5 = $$2.a_($$3);
         if (!$$4.a(awp.bU) && !$$5.a(awp.bU)) {
            eup $$6 = new eup($$0.dU(), $$0);
            eun $$7 = eus.a($$6, $$1.k());
            eun $$8 = eus.a($$6, $$3.k());
            return $$7 != eun.e && (!$$4.l() || $$8 != eun.e) ? byu.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cjm $$0) {
      return !bxt.a($$0);
   }

   public static void a(cjm $$0) {
      $$0.ea().a(ImmutableList.of(cri.s, cri.u, cri.q, cri.t, cri.b));
   }

   public static Predicate<cxh> a() {
      return $$0 -> $$0.a(awy.ao);
   }
}
