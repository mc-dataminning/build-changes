import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbo {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> a(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cbc(0.8F)),
         Pair.of(0, bzg.a()),
         Pair.of(0, new bzo(45, 90)),
         Pair.of(0, new cbq()),
         Pair.of(0, cbr.a()),
         Pair.of(0, cab.a()),
         Pair.of(0, cal.a()),
         Pair.of(0, cbl.a($$0.a().b(), cft.c)),
         Pair.of(0, cbl.a($$0.a().c(), cft.d)),
         Pair.of(1, new bzs()),
         Pair.of(2, bzv.a()),
         Pair.of(3, new bzn($$1)),
         new Pair[]{
            Pair.of(5, bzc.a($$1, false, 4)),
            Pair.of(6, byb.a($$0.a().c(), cft.c, cft.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new bza($$1)),
            Pair.of(8, cbu.a($$1)),
            Pair.of(10, byb.a($$0x -> $$0x.a(chx.n), cft.b, false, Optional.of((byte)14), cbo::a)),
            Pair.of(10, byb.a($$0x -> $$0x.a(chx.o), cft.e, true, Optional.of((byte)14))),
            Pair.of(10, bye.a()),
            Pair.of(10, cac.a())
         }
      );
   }

   private static boolean a(arn $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      return $$2.a(awz.T) && !$$2.c(dkn.c);
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> b(js<cpx> $$0, float $$1) {
      cbt $$2;
      if ($$0.a(cpx.g)) {
         $$2 = new cbs();
      } else {
         $$2 = new cbt();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new caf(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(caz.a(cft.c, 0.4F, 4), 2),
                  Pair.of(cba.a(cft.c, 0.4F, 1, 10), 5),
                  Pair.of(cbb.a(cft.f, $$1, 1, 6, cft.c), 5),
                  Pair.of(new bzd(), $$0.a(cpx.g) ? 2 : 5),
                  Pair.of(new cbk(), $$0.a(cpx.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new caq(400, 1600)),
         Pair.of(10, cak.a(bwb.bR, 4)),
         Pair.of(2, cao.a(cft.c, $$1, 9, 100, 1200)),
         Pair.of(3, new byx(100)),
         Pair.of(99, cbj.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bzs(80, 120)),
         a(),
         Pair.of(5, bzu.a()),
         Pair.of(
            5,
            new caf(
               ImmutableMap.of(cft.i, cfu.b),
               ImmutableList.of(
                  Pair.of(bzf.a(bwb.bC, 8, cft.r, $$0, 2), 2),
                  Pair.of(bzf.a(bwb.u, 8, cft.r, $$0, 2), 1),
                  Pair.of(cbm.a($$0), 1),
                  Pair.of(cap.a($$0, 2), 1),
                  Pair.of(new bzh($$0), 2),
                  Pair.of(new bys(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cbj.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> c(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cao.a(cft.b, $$1, 1, 150, 1200)),
         Pair.of(3, cbl.a($$0x -> $$0x.a(chx.n), cft.b)),
         Pair.of(3, new cas()),
         Pair.of(
            5,
            new caf(
               ImmutableMap.of(cft.b, cfu.b),
               ImmutableList.of(Pair.of(cag.a($$1), 1), Pair.of(bze.a($$1), 4), Pair.of(byz.a($$1, 4), 2), Pair.of(new bys(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cbj.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> d(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbe.a(ImmutableList.of(Pair.of(caz.a(cft.e, 0.4F, 40), 2), Pair.of(cat.a(), 2)))),
         Pair.of(10, new caq(400, 1600)),
         Pair.of(10, cak.a(bwb.bR, 4)),
         Pair.of(2, cao.a(cft.e, $$1, 6, 100, 200)),
         Pair.of(3, new byx(100)),
         Pair.of(3, cbl.a($$0x -> $$0x.a(chx.o), cft.e)),
         Pair.of(3, new byw(ImmutableMap.of(), ImmutableSet.of(cft.r), byw.a.a, byw.b.a, ImmutableList.of(Pair.of(new cbd(), 1)))),
         a(),
         Pair.of(99, cbj.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> e(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new caf(
               ImmutableList.of(
                  Pair.of(bzf.a(bwb.bC, 8, cft.r, $$1, 2), 2),
                  Pair.of(bzf.a(bwb.bC, 8, bvi::S_, bvi::S_, cft.s, $$1, 2), 1),
                  Pair.of(bzf.a(bwb.u, 8, cft.r, $$1, 2), 1),
                  Pair.of(cbm.a($$1), 1),
                  Pair.of(cap.a($$1, 2), 1),
                  Pair.of(new bzh($$1), 1),
                  Pair.of(new bys(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new byx(100)),
         Pair.of(3, cak.a(bwb.bR, 4)),
         Pair.of(3, new caq(400, 1600)),
         Pair.of(3, new byw(ImmutableMap.of(), ImmutableSet.of(cft.r), byw.a.a, byw.b.a, ImmutableList.of(Pair.of(new cbd(), 1)))),
         Pair.of(3, new byw(ImmutableMap.of(), ImmutableSet.of(cft.s), byw.a.a, byw.b.a, ImmutableList.of(Pair.of(new cbp(), 1)))),
         a(),
         Pair.of(99, cbj.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> f(js<cpx> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cbn.a()), Pair.of(1, cam.b(cft.B, $$2, 6, false)), Pair.of(1, cam.b(cft.z, $$2, 6, false)), Pair.of(3, cbm.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> g(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cae.a()),
         Pair.of(0, cbe.a(ImmutableList.of(Pair.of(cao.a(cft.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cbm.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cad.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> h(js<cpx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cbv.a(cbv.a(cbo::b), cbe.a(ImmutableList.of(Pair.of(bzr.a($$1), 5), Pair.of(cbm.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bym(600, 600)),
         Pair.of(2, cbv.a(cbv.a(cbo::a), bzi.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cad.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byj<? super cpu>>> i(js<cpx> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, caj.a(15, 3)), Pair.of(1, bzi.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, byj<bwr>> a() {
      return Pair.of(
         5,
         new caf(
            ImmutableList.of(
               Pair.of(cah.a(bwb.u, 8.0F), 8),
               Pair.of(cah.a(bwb.bC, 8.0F), 2),
               Pair.of(cah.a(bwb.bR, 8.0F), 2),
               Pair.of(cah.a(bwu.b, 8.0F), 1),
               Pair.of(cah.a(bwu.f, 8.0F), 1),
               Pair.of(cah.a(bwu.d, 8.0F), 1),
               Pair.of(cah.a(bwu.e, 8.0F), 1),
               Pair.of(cah.a(bwu.g, 8.0F), 1),
               Pair.of(cah.a(bwu.a, 8.0F), 1),
               Pair.of(new bys(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, byj<bwr>> b() {
      return Pair.of(5, new caf(ImmutableList.of(Pair.of(cah.a(bwb.bC, 8.0F), 2), Pair.of(cah.a(bwb.bR, 8.0F), 2), Pair.of(new bys(30, 60), 8))));
   }

   private static boolean a(arn $$0, bwr $$1) {
      crv $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.u() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arn $$0, bwr $$1) {
      crv $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
