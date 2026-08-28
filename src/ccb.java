import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ccb {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> a(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cbp(0.8F)),
         Pair.of(0, bzt.a()),
         Pair.of(0, new cab(45, 90)),
         Pair.of(0, new ccd()),
         Pair.of(0, cce.a()),
         Pair.of(0, cao.a()),
         Pair.of(0, cay.a()),
         Pair.of(0, cby.a($$0.a().b(), cgg.c)),
         Pair.of(0, cby.a($$0.a().c(), cgg.d)),
         Pair.of(1, new caf()),
         Pair.of(2, cai.a()),
         Pair.of(3, new caa($$1)),
         new Pair[]{
            Pair.of(5, bzp.a($$1, false, 4)),
            Pair.of(6, byo.a($$0.a().c(), cgg.c, cgg.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new bzn($$1)),
            Pair.of(8, cch.a($$1)),
            Pair.of(10, byo.a($$0x -> $$0x.a(cik.n), cgg.b, false, Optional.of((byte)14), ccb::a)),
            Pair.of(10, byo.a($$0x -> $$0x.a(cik.o), cgg.e, true, Optional.of((byte)14))),
            Pair.of(10, byr.a()),
            Pair.of(10, cap.a())
         }
      );
   }

   private static boolean a(arq $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return $$2.a(axc.T) && !$$2.c(dly.c);
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> b(je<cqr> $$0, float $$1) {
      ccg $$2;
      if ($$0.a(cqr.g)) {
         $$2 = new ccf();
      } else {
         $$2 = new ccg();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cas(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cbm.a(cgg.c, 0.4F, 4), 2),
                  Pair.of(cbn.a(cgg.c, 0.4F, 1, 10), 5),
                  Pair.of(cbo.a(cgg.f, $$1, 1, 6, cgg.c), 5),
                  Pair.of(new bzq(), $$0.a(cqr.g) ? 2 : 5),
                  Pair.of(new cbx(), $$0.a(cqr.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cbd(400, 1600)),
         Pair.of(10, cax.a(bwo.bS, 4)),
         Pair.of(2, cbb.a(cgg.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bzk(100)),
         Pair.of(99, cbw.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new caf(80, 120)),
         a(),
         Pair.of(5, cah.a()),
         Pair.of(
            5,
            new cas(
               ImmutableMap.of(cgg.i, cgh.b),
               ImmutableList.of(
                  Pair.of(bzs.a(bwo.bD, 8, cgg.r, $$0, 2), 2),
                  Pair.of(bzs.a(bwo.u, 8, cgg.r, $$0, 2), 1),
                  Pair.of(cbz.a($$0), 1),
                  Pair.of(cbc.a($$0, 2), 1),
                  Pair.of(new bzu($$0), 2),
                  Pair.of(new bzf(20, 40), 2)
               )
            )
         ),
         Pair.of(99, cbw.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> c(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbb.a(cgg.b, $$1, 1, 150, 1200)),
         Pair.of(3, cby.a($$0x -> $$0x.a(cik.n), cgg.b)),
         Pair.of(3, new cbf()),
         Pair.of(
            5,
            new cas(
               ImmutableMap.of(cgg.b, cgh.b),
               ImmutableList.of(Pair.of(cat.a($$1), 1), Pair.of(bzr.a($$1), 4), Pair.of(bzm.a($$1, 4), 2), Pair.of(new bzf(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, cbw.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> d(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbr.a(ImmutableList.of(Pair.of(cbm.a(cgg.e, 0.4F, 40), 2), Pair.of(cbg.a(), 2)))),
         Pair.of(10, new cbd(400, 1600)),
         Pair.of(10, cax.a(bwo.bS, 4)),
         Pair.of(2, cbb.a(cgg.e, $$1, 6, 100, 200)),
         Pair.of(3, new bzk(100)),
         Pair.of(3, cby.a($$0x -> $$0x.a(cik.o), cgg.e)),
         Pair.of(3, new bzj(ImmutableMap.of(), ImmutableSet.of(cgg.r), bzj.a.a, bzj.b.a, ImmutableList.of(Pair.of(new cbq(), 1)))),
         a(),
         Pair.of(99, cbw.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> e(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cas(
               ImmutableList.of(
                  Pair.of(bzs.a(bwo.bD, 8, cgg.r, $$1, 2), 2),
                  Pair.of(bzs.a(bwo.bD, 8, bvv::T_, bvv::T_, cgg.s, $$1, 2), 1),
                  Pair.of(bzs.a(bwo.u, 8, cgg.r, $$1, 2), 1),
                  Pair.of(cbz.a($$1), 1),
                  Pair.of(cbc.a($$1, 2), 1),
                  Pair.of(new bzu($$1), 1),
                  Pair.of(new bzf(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bzk(100)),
         Pair.of(3, cax.a(bwo.bS, 4)),
         Pair.of(3, new cbd(400, 1600)),
         Pair.of(3, new bzj(ImmutableMap.of(), ImmutableSet.of(cgg.r), bzj.a.a, bzj.b.a, ImmutableList.of(Pair.of(new cbq(), 1)))),
         Pair.of(3, new bzj(ImmutableMap.of(), ImmutableSet.of(cgg.s), bzj.a.a, bzj.b.a, ImmutableList.of(Pair.of(new ccc(), 1)))),
         a(),
         Pair.of(99, cbw.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> f(je<cqr> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cca.a()), Pair.of(1, caz.b(cgg.B, $$2, 6, false)), Pair.of(1, caz.b(cgg.z, $$2, 6, false)), Pair.of(3, cbz.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> g(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, car.a()),
         Pair.of(0, cbr.a(ImmutableList.of(Pair.of(cbb.a(cgg.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cbz.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, caq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> h(je<cqr> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cci.a(cci.a(ccb::b), cbr.a(ImmutableList.of(Pair.of(cae.a($$1), 5), Pair.of(cbz.a($$1 * 1.1F), 2))))),
         Pair.of(0, new byz(600, 600)),
         Pair.of(2, cci.a(cci.a(ccb::a), bzv.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, caq.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends byw<? super cqo>>> i(je<cqr> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, caw.a(15, 3)), Pair.of(1, bzv.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, byw<bxe>> a() {
      return Pair.of(
         5,
         new cas(
            ImmutableList.of(
               Pair.of(cau.a(bwo.u, 8.0F), 8),
               Pair.of(cau.a(bwo.bD, 8.0F), 2),
               Pair.of(cau.a(bwo.bS, 8.0F), 2),
               Pair.of(cau.a(bxh.b, 8.0F), 1),
               Pair.of(cau.a(bxh.f, 8.0F), 1),
               Pair.of(cau.a(bxh.d, 8.0F), 1),
               Pair.of(cau.a(bxh.e, 8.0F), 1),
               Pair.of(cau.a(bxh.g, 8.0F), 1),
               Pair.of(cau.a(bxh.a, 8.0F), 1),
               Pair.of(new bzf(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, byw<bxe>> b() {
      return Pair.of(5, new cas(ImmutableList.of(Pair.of(cau.a(bwo.bD, 8.0F), 2), Pair.of(cau.a(bwo.bS, 8.0F), 2), Pair.of(new bzf(30, 60), 8))));
   }

   private static boolean a(arq $$0, bxe $$1) {
      css $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arq $$0, bxe $$1) {
      css $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
