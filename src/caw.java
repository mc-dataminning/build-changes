import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class caw {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> a(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cak(0.8F)),
         Pair.of(0, byo.a()),
         Pair.of(0, new byw(45, 90)),
         Pair.of(0, new cay()),
         Pair.of(0, caz.a()),
         Pair.of(0, bzj.a()),
         Pair.of(0, bzt.a()),
         Pair.of(0, cat.a($$0.b(), cfb.c)),
         Pair.of(0, cat.a($$0.c(), cfb.d)),
         Pair.of(1, new bza()),
         Pair.of(2, bzd.a()),
         Pair.of(3, new byv($$1)),
         new Pair[]{
            Pair.of(5, byk.a($$1, false, 4)),
            Pair.of(6, bxj.a($$0.c(), cfb.c, cfb.d, true, Optional.empty())),
            Pair.of(7, new byi($$1)),
            Pair.of(8, cbc.a($$1)),
            Pair.of(10, bxj.a($$0x -> $$0x.a(chf.n), cfb.b, false, Optional.of((byte)14))),
            Pair.of(10, bxj.a($$0x -> $$0x.a(chf.o), cfb.e, true, Optional.of((byte)14))),
            Pair.of(10, bxm.a()),
            Pair.of(10, bzk.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> b(cpd $$0, float $$1) {
      cbb $$2;
      if ($$0 == cpd.g) {
         $$2 = new cba();
      } else {
         $$2 = new cbb();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new bzn(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cah.a(cfb.c, 0.4F, 4), 2),
                  Pair.of(cai.a(cfb.c, 0.4F, 1, 10), 5),
                  Pair.of(caj.a(cfb.f, $$1, 1, 6, cfb.c), 5),
                  Pair.of(new byl(), $$0 == cpd.g ? 2 : 5),
                  Pair.of(new cas(), $$0 == cpd.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bzy(400, 1600)),
         Pair.of(10, bzs.a(bvi.bS, 4)),
         Pair.of(2, bzw.a(cfb.c, $$1, 9, 100, 1200)),
         Pair.of(3, new byf(100)),
         Pair.of(99, car.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new bza(80, 120)),
         a(),
         Pair.of(5, bzc.a()),
         Pair.of(
            5,
            new bzn(
               ImmutableMap.of(cfb.i, cfc.b),
               ImmutableList.of(
                  Pair.of(byn.a(bvi.bD, 8, cfb.q, $$0, 2), 2),
                  Pair.of(byn.a(bvi.u, 8, cfb.q, $$0, 2), 1),
                  Pair.of(cau.a($$0), 1),
                  Pair.of(bzx.a($$0, 2), 1),
                  Pair.of(new byp($$0), 2),
                  Pair.of(new bya(20, 40), 2)
               )
            )
         ),
         Pair.of(99, car.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> c(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bzw.a(cfb.b, $$1, 1, 150, 1200)),
         Pair.of(3, cat.a($$0x -> $$0x.a(chf.n), cfb.b)),
         Pair.of(3, new caa()),
         Pair.of(
            5,
            new bzn(
               ImmutableMap.of(cfb.b, cfc.b),
               ImmutableList.of(Pair.of(bzo.a($$1), 1), Pair.of(bym.a($$1), 4), Pair.of(byh.a($$1, 4), 2), Pair.of(new bya(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, car.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> d(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cam.a(ImmutableList.of(Pair.of(cah.a(cfb.e, 0.4F, 40), 2), Pair.of(cab.a(), 2)))),
         Pair.of(10, new bzy(400, 1600)),
         Pair.of(10, bzs.a(bvi.bS, 4)),
         Pair.of(2, bzw.a(cfb.e, $$1, 6, 100, 200)),
         Pair.of(3, new byf(100)),
         Pair.of(3, cat.a($$0x -> $$0x.a(chf.o), cfb.e)),
         Pair.of(3, new bye(ImmutableMap.of(), ImmutableSet.of(cfb.q), bye.a.a, bye.b.a, ImmutableList.of(Pair.of(new cal(), 1)))),
         a(),
         Pair.of(99, car.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> e(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new bzn(
               ImmutableList.of(
                  Pair.of(byn.a(bvi.bD, 8, cfb.q, $$1, 2), 2),
                  Pair.of(byn.a(bvi.bD, 8, bus::Y_, bus::Y_, cfb.r, $$1, 2), 1),
                  Pair.of(byn.a(bvi.u, 8, cfb.q, $$1, 2), 1),
                  Pair.of(cau.a($$1), 1),
                  Pair.of(bzx.a($$1, 2), 1),
                  Pair.of(new byp($$1), 1),
                  Pair.of(new bya(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new byf(100)),
         Pair.of(3, bzs.a(bvi.bS, 4)),
         Pair.of(3, new bzy(400, 1600)),
         Pair.of(3, new bye(ImmutableMap.of(), ImmutableSet.of(cfb.q), bye.a.a, bye.b.a, ImmutableList.of(Pair.of(new cal(), 1)))),
         Pair.of(3, new bye(ImmutableMap.of(), ImmutableSet.of(cfb.r), bye.a.a, bye.b.a, ImmutableList.of(Pair.of(new cax(), 1)))),
         a(),
         Pair.of(99, car.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> f(cpd $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cav.a()), Pair.of(1, bzu.b(cfb.A, $$2, 6, false)), Pair.of(1, bzu.b(cfb.y, $$2, 6, false)), Pair.of(3, cau.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> g(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, bzm.a()),
         Pair.of(0, cam.a(ImmutableList.of(Pair.of(bzw.a(cfb.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cau.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, bzl.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> h(cpd $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cbd.a(cbd.a(caw::b), cam.a(ImmutableList.of(Pair.of(byz.a($$1), 5), Pair.of(cau.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bxu(600, 600)),
         Pair.of(2, cbd.a(cbd.a(caw::a), byq.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, bzl.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxr<? super cpa>>> i(cpd $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bzr.a(15, 3)), Pair.of(1, byq.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bxr<bvx>> a() {
      return Pair.of(
         5,
         new bzn(
            ImmutableList.of(
               Pair.of(bzp.a(bvi.u, 8.0F), 8),
               Pair.of(bzp.a(bvi.bD, 8.0F), 2),
               Pair.of(bzp.a(bvi.bS, 8.0F), 2),
               Pair.of(bzp.a(bwa.b, 8.0F), 1),
               Pair.of(bzp.a(bwa.f, 8.0F), 1),
               Pair.of(bzp.a(bwa.d, 8.0F), 1),
               Pair.of(bzp.a(bwa.e, 8.0F), 1),
               Pair.of(bzp.a(bwa.g, 8.0F), 1),
               Pair.of(bzp.a(bwa.a, 8.0F), 1),
               Pair.of(new bya(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bxr<bvx>> b() {
      return Pair.of(5, new bzn(ImmutableList.of(Pair.of(bzp.a(bvi.bD, 8.0F), 2), Pair.of(bzp.a(bvi.bS, 8.0F), 2), Pair.of(new bya(30, 60), 8))));
   }

   private static boolean a(arx $$0, bvx $$1) {
      crb $$2 = $$0.d($$1.dw());
      return $$2 != null && $$2.u() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arx $$0, bvx $$1) {
      crb $$2 = $$0.d($$1.dw());
      return $$2 != null && $$2.e();
   }
}
