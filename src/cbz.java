import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbz {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> a(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cbn(0.8F)),
         Pair.of(0, bzr.a()),
         Pair.of(0, new bzz(45, 90)),
         Pair.of(0, new ccb()),
         Pair.of(0, ccc.a()),
         Pair.of(0, cam.a()),
         Pair.of(0, caw.a()),
         Pair.of(0, cbw.a($$0.a().b(), cge.c)),
         Pair.of(0, cbw.a($$0.a().c(), cge.d)),
         Pair.of(1, new cad()),
         Pair.of(2, cag.a()),
         Pair.of(3, new bzy($$1)),
         new Pair[]{
            Pair.of(5, bzn.a($$1, false, 4)),
            Pair.of(6, bym.a($$0.a().c(), cge.c, cge.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new bzl($$1)),
            Pair.of(8, ccf.a($$1)),
            Pair.of(10, bym.a($$0x -> $$0x.a(cii.n), cge.b, false, Optional.of((byte)14), cbz::a)),
            Pair.of(10, bym.a($$0x -> $$0x.a(cii.o), cge.e, true, Optional.of((byte)14))),
            Pair.of(10, byp.a()),
            Pair.of(10, can.a())
         }
      );
   }

   private static boolean a(arq $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return $$2.a(axc.T) && !$$2.c(dlt.c);
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> b(je<cqn> $$0, float $$1) {
      cce $$2;
      if ($$0.a(cqn.g)) {
         $$2 = new ccd();
      } else {
         $$2 = new cce();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new caq(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cbk.a(cge.c, 0.4F, 4), 2),
                  Pair.of(cbl.a(cge.c, 0.4F, 1, 10), 5),
                  Pair.of(cbm.a(cge.f, $$1, 1, 6, cge.c), 5),
                  Pair.of(new bzo(), $$0.a(cqn.g) ? 2 : 5),
                  Pair.of(new cbv(), $$0.a(cqn.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cbb(400, 1600)),
         Pair.of(10, cav.a(bwm.bS, 4)),
         Pair.of(2, caz.a(cge.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bzi(100)),
         Pair.of(99, cbu.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cad(80, 120)),
         a(),
         Pair.of(5, caf.a()),
         Pair.of(
            5,
            new caq(
               ImmutableMap.of(cge.i, cgf.b),
               ImmutableList.of(
                  Pair.of(bzq.a(bwm.bD, 8, cge.r, $$0, 2), 2),
                  Pair.of(bzq.a(bwm.u, 8, cge.r, $$0, 2), 1),
                  Pair.of(cbx.a($$0), 1),
                  Pair.of(cba.a($$0, 2), 1),
                  Pair.of(new bzs($$0), 2),
                  Pair.of(new bzd(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cbu.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> c(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, caz.a(cge.b, $$1, 1, 150, 1200)),
         Pair.of(3, cbw.a($$0x -> $$0x.a(cii.n), cge.b)),
         Pair.of(3, new cbd()),
         Pair.of(
            5,
            new caq(
               ImmutableMap.of(cge.b, cgf.b),
               ImmutableList.of(Pair.of(car.a($$1), 1), Pair.of(bzp.a($$1), 4), Pair.of(bzk.a($$1, 4), 2), Pair.of(new bzd(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cbu.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> d(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbp.a(ImmutableList.of(Pair.of(cbk.a(cge.e, 0.4F, 40), 2), Pair.of(cbe.a(), 2)))),
         Pair.of(10, new cbb(400, 1600)),
         Pair.of(10, cav.a(bwm.bS, 4)),
         Pair.of(2, caz.a(cge.e, $$1, 6, 100, 200)),
         Pair.of(3, new bzi(100)),
         Pair.of(3, cbw.a($$0x -> $$0x.a(cii.o), cge.e)),
         Pair.of(3, new bzh(ImmutableMap.of(), ImmutableSet.of(cge.r), bzh.a.a, bzh.b.a, ImmutableList.of(Pair.of(new cbo(), 1)))),
         a(),
         Pair.of(99, cbu.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> e(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new caq(
               ImmutableList.of(
                  Pair.of(bzq.a(bwm.bD, 8, cge.r, $$1, 2), 2),
                  Pair.of(bzq.a(bwm.bD, 8, bvt::S_, bvt::S_, cge.s, $$1, 2), 1),
                  Pair.of(bzq.a(bwm.u, 8, cge.r, $$1, 2), 1),
                  Pair.of(cbx.a($$1), 1),
                  Pair.of(cba.a($$1, 2), 1),
                  Pair.of(new bzs($$1), 1),
                  Pair.of(new bzd(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bzi(100)),
         Pair.of(3, cav.a(bwm.bS, 4)),
         Pair.of(3, new cbb(400, 1600)),
         Pair.of(3, new bzh(ImmutableMap.of(), ImmutableSet.of(cge.r), bzh.a.a, bzh.b.a, ImmutableList.of(Pair.of(new cbo(), 1)))),
         Pair.of(3, new bzh(ImmutableMap.of(), ImmutableSet.of(cge.s), bzh.a.a, bzh.b.a, ImmutableList.of(Pair.of(new cca(), 1)))),
         a(),
         Pair.of(99, cbu.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> f(je<cqn> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cby.a()), Pair.of(1, cax.b(cge.B, $$2, 6, false)), Pair.of(1, cax.b(cge.z, $$2, 6, false)), Pair.of(3, cbx.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> g(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cap.a()),
         Pair.of(0, cbp.a(ImmutableList.of(Pair.of(caz.a(cge.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cbx.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cao.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> h(je<cqn> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, ccg.a(ccg.a(cbz::b), cbp.a(ImmutableList.of(Pair.of(cac.a($$1), 5), Pair.of(cbx.a($$1 * 1.1F), 2))))),
         Pair.of(0, new byx(600, 600)),
         Pair.of(2, ccg.a(ccg.a(cbz::a), bzt.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cao.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byu<? super cqk>>> i(je<cqn> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cau.a(15, 3)), Pair.of(1, bzt.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, byu<bxc>> a() {
      return Pair.of(
         5,
         new caq(
            ImmutableList.of(
               Pair.of(cas.a(bwm.u, 8.0F), 8),
               Pair.of(cas.a(bwm.bD, 8.0F), 2),
               Pair.of(cas.a(bwm.bS, 8.0F), 2),
               Pair.of(cas.a(bxf.b, 8.0F), 1),
               Pair.of(cas.a(bxf.f, 8.0F), 1),
               Pair.of(cas.a(bxf.d, 8.0F), 1),
               Pair.of(cas.a(bxf.e, 8.0F), 1),
               Pair.of(cas.a(bxf.g, 8.0F), 1),
               Pair.of(cas.a(bxf.a, 8.0F), 1),
               Pair.of(new bzd(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, byu<bxc>> b() {
      return Pair.of(5, new caq(ImmutableList.of(Pair.of(cas.a(bwm.bD, 8.0F), 2), Pair.of(cas.a(bwm.bS, 8.0F), 2), Pair.of(new bzd(30, 60), 8))));
   }

   private static boolean a(arq $$0, bxc $$1) {
      csn $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arq $$0, bxc $$1) {
      csn $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
