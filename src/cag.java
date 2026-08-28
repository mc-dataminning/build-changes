import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cag {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> a(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new bzu(0.8F)),
         Pair.of(0, bxy.a()),
         Pair.of(0, new byg(45, 90)),
         Pair.of(0, new cai()),
         Pair.of(0, caj.a()),
         Pair.of(0, byt.a()),
         Pair.of(0, bzd.a()),
         Pair.of(0, cad.a($$0.b(), cel.c)),
         Pair.of(0, cad.a($$0.c(), cel.d)),
         Pair.of(1, new byk()),
         Pair.of(2, byn.a()),
         Pair.of(3, new byf($$1)),
         new Pair[]{
            Pair.of(5, bxu.a($$1, false, 4)),
            Pair.of(6, bwt.a($$0.c(), cel.c, cel.d, true, Optional.empty())),
            Pair.of(7, new bxs($$1)),
            Pair.of(8, cam.a($$1)),
            Pair.of(10, bwt.a($$0x -> $$0x.a(cgp.n), cel.b, false, Optional.of((byte)14))),
            Pair.of(10, bwt.a($$0x -> $$0x.a(cgp.o), cel.e, true, Optional.of((byte)14))),
            Pair.of(10, bww.a()),
            Pair.of(10, byu.a())
         }
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> b(coi $$0, float $$1) {
      cal $$2;
      if ($$0 == coi.g) {
         $$2 = new cak();
      } else {
         $$2 = new cal();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new byx(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(bzr.a(cel.c, 0.4F, 4), 2),
                  Pair.of(bzs.a(cel.c, 0.4F, 1, 10), 5),
                  Pair.of(bzt.a(cel.f, $$1, 1, 6, cel.c), 5),
                  Pair.of(new bxv(), $$0 == coi.g ? 2 : 5),
                  Pair.of(new cac(), $$0 == coi.g ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new bzi(400, 1600)),
         Pair.of(10, bzc.a(bus.bO, 4)),
         Pair.of(2, bzg.a(cel.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bxp(100)),
         Pair.of(99, cab.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new byk(80, 120)),
         a(),
         Pair.of(5, bym.a()),
         Pair.of(
            5,
            new byx(
               ImmutableMap.of(cel.i, cem.b),
               ImmutableList.of(
                  Pair.of(bxx.a(bus.bz, 8, cel.q, $$0, 2), 2),
                  Pair.of(bxx.a(bus.u, 8, cel.q, $$0, 2), 1),
                  Pair.of(cae.a($$0), 1),
                  Pair.of(bzh.a($$0, 2), 1),
                  Pair.of(new bxz($$0), 2),
                  Pair.of(new bxk(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cab.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> c(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bzg.a(cel.b, $$1, 1, 150, 1200)),
         Pair.of(3, cad.a($$0x -> $$0x.a(cgp.n), cel.b)),
         Pair.of(3, new bzk()),
         Pair.of(
            5,
            new byx(
               ImmutableMap.of(cel.b, cem.b),
               ImmutableList.of(Pair.of(byy.a($$1), 1), Pair.of(bxw.a($$1), 4), Pair.of(bxr.a($$1, 4), 2), Pair.of(new bxk(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cab.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> d(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, bzw.a(ImmutableList.of(Pair.of(bzr.a(cel.e, 0.4F, 40), 2), Pair.of(bzl.a(), 2)))),
         Pair.of(10, new bzi(400, 1600)),
         Pair.of(10, bzc.a(bus.bO, 4)),
         Pair.of(2, bzg.a(cel.e, $$1, 6, 100, 200)),
         Pair.of(3, new bxp(100)),
         Pair.of(3, cad.a($$0x -> $$0x.a(cgp.o), cel.e)),
         Pair.of(3, new bxo(ImmutableMap.of(), ImmutableSet.of(cel.q), bxo.a.a, bxo.b.a, ImmutableList.of(Pair.of(new bzv(), 1)))),
         a(),
         Pair.of(99, cab.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> e(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new byx(
               ImmutableList.of(
                  Pair.of(bxx.a(bus.bz, 8, cel.q, $$1, 2), 2),
                  Pair.of(bxx.a(bus.bz, 8, buc::W_, buc::W_, cel.r, $$1, 2), 1),
                  Pair.of(bxx.a(bus.u, 8, cel.q, $$1, 2), 1),
                  Pair.of(cae.a($$1), 1),
                  Pair.of(bzh.a($$1, 2), 1),
                  Pair.of(new bxz($$1), 1),
                  Pair.of(new bxk(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bxp(100)),
         Pair.of(3, bzc.a(bus.bO, 4)),
         Pair.of(3, new bzi(400, 1600)),
         Pair.of(3, new bxo(ImmutableMap.of(), ImmutableSet.of(cel.q), bxo.a.a, bxo.b.a, ImmutableList.of(Pair.of(new bzv(), 1)))),
         Pair.of(3, new bxo(ImmutableMap.of(), ImmutableSet.of(cel.r), bxo.a.a, bxo.b.a, ImmutableList.of(Pair.of(new cah(), 1)))),
         a(),
         Pair.of(99, cab.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> f(coi $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, caf.a()), Pair.of(1, bze.b(cel.A, $$2, 6, false)), Pair.of(1, bze.b(cel.y, $$2, 6, false)), Pair.of(3, cae.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> g(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, byw.a()),
         Pair.of(0, bzw.a(ImmutableList.of(Pair.of(bzg.a(cel.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cae.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, byv.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> h(coi $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, can.a(can.a(cag::b), bzw.a(ImmutableList.of(Pair.of(byj.a($$1), 5), Pair.of(cae.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bxe(600, 600)),
         Pair.of(2, can.a(can.a(cag::a), bya.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, byv.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bxb<? super cof>>> i(coi $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, bzb.a(15, 3)), Pair.of(1, bya.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bxb<bvh>> a() {
      return Pair.of(
         5,
         new byx(
            ImmutableList.of(
               Pair.of(byz.a(bus.u, 8.0F), 8),
               Pair.of(byz.a(bus.bz, 8.0F), 2),
               Pair.of(byz.a(bus.bO, 8.0F), 2),
               Pair.of(byz.a(bvk.b, 8.0F), 1),
               Pair.of(byz.a(bvk.f, 8.0F), 1),
               Pair.of(byz.a(bvk.d, 8.0F), 1),
               Pair.of(byz.a(bvk.e, 8.0F), 1),
               Pair.of(byz.a(bvk.g, 8.0F), 1),
               Pair.of(byz.a(bvk.a, 8.0F), 1),
               Pair.of(new bxk(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bxb<bvh>> b() {
      return Pair.of(5, new byx(ImmutableList.of(Pair.of(byz.a(bus.bz, 8.0F), 2), Pair.of(byz.a(bus.bO, 8.0F), 2), Pair.of(new bxk(30, 60), 8))));
   }

   private static boolean a(arp $$0, bvh $$1) {
      cqh $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.u() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arp $$0, bvh $$1) {
      cqh $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
