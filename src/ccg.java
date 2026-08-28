import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ccg {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> a(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new cbu(0.8F)),
         Pair.of(0, bzy.a()),
         Pair.of(0, new cag(45, 90)),
         Pair.of(0, new cci()),
         Pair.of(0, ccj.a()),
         Pair.of(0, cat.a()),
         Pair.of(0, cbd.a()),
         Pair.of(0, ccd.a($$0.a().b(), cgl.c)),
         Pair.of(0, ccd.a($$0.a().c(), cgl.d)),
         Pair.of(1, new cak()),
         Pair.of(2, can.a()),
         Pair.of(3, new caf($$1)),
         new Pair[]{
            Pair.of(5, bzu.a($$1, false, 4)),
            Pair.of(6, byt.a($$0.a().c(), cgl.c, cgl.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new bzs($$1)),
            Pair.of(8, ccm.a($$1)),
            Pair.of(10, byt.a($$0x -> $$0x.a(cip.n), cgl.b, false, Optional.of((byte)14), ccg::a)),
            Pair.of(10, byt.a($$0x -> $$0x.a(cip.o), cgl.e, true, Optional.of((byte)14))),
            Pair.of(10, byw.a()),
            Pair.of(10, cau.a())
         }
      );
   }

   private static boolean a(arq $$0, iv $$1) {
      eao $$2 = $$0.a_($$1);
      return $$2.a(axc.T) && !$$2.c(dmf.c);
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> b(jf<cqy> $$0, float $$1) {
      ccl $$2;
      if ($$0.a(cqy.g)) {
         $$2 = new cck();
      } else {
         $$2 = new ccl();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cax(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(cbr.a(cgl.c, 0.4F, 4), 2),
                  Pair.of(cbs.a(cgl.c, 0.4F, 1, 10), 5),
                  Pair.of(cbt.a(cgl.f, $$1, 1, 6, cgl.c), 5),
                  Pair.of(new bzv(), $$0.a(cqy.g) ? 2 : 5),
                  Pair.of(new ccc(), $$0.a(cqy.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cbi(400, 1600)),
         Pair.of(10, cbc.a(bwr.bS, 4)),
         Pair.of(2, cbg.a(cgl.c, $$1, 9, 100, 1200)),
         Pair.of(3, new bzp(100)),
         Pair.of(99, ccb.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cak(80, 120)),
         a(),
         Pair.of(5, cam.a()),
         Pair.of(
            5,
            new cax(
               ImmutableMap.of(cgl.i, cgm.b),
               ImmutableList.of(
                  Pair.of(bzx.a(bwr.bD, 8, cgl.r, $$0, 2), 2),
                  Pair.of(bzx.a(bwr.u, 8, cgl.r, $$0, 2), 1),
                  Pair.of(cce.a($$0), 1),
                  Pair.of(cbh.a($$0, 2), 1),
                  Pair.of(new bzz($$0), 2),
                  Pair.of(new bzk(20, 40), 2)
               )
            )
         ),
         Pair.of(99, ccb.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> c(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbg.a(cgl.b, $$1, 1, 150, 1200)),
         Pair.of(3, ccd.a($$0x -> $$0x.a(cip.n), cgl.b)),
         Pair.of(3, new cbk()),
         Pair.of(
            5,
            new cax(
               ImmutableMap.of(cgl.b, cgm.b),
               ImmutableList.of(Pair.of(cay.a($$1), 1), Pair.of(bzw.a($$1), 4), Pair.of(bzr.a($$1, 4), 2), Pair.of(new bzk(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, ccb.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> d(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbw.a(ImmutableList.of(Pair.of(cbr.a(cgl.e, 0.4F, 40), 2), Pair.of(cbl.a(), 2)))),
         Pair.of(10, new cbi(400, 1600)),
         Pair.of(10, cbc.a(bwr.bS, 4)),
         Pair.of(2, cbg.a(cgl.e, $$1, 6, 100, 200)),
         Pair.of(3, new bzp(100)),
         Pair.of(3, ccd.a($$0x -> $$0x.a(cip.o), cgl.e)),
         Pair.of(3, new bzo(ImmutableMap.of(), ImmutableSet.of(cgl.r), bzo.a.a, bzo.b.a, ImmutableList.of(Pair.of(new cbv(), 1)))),
         a(),
         Pair.of(99, ccb.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> e(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cax(
               ImmutableList.of(
                  Pair.of(bzx.a(bwr.bD, 8, cgl.r, $$1, 2), 2),
                  Pair.of(bzx.a(bwr.bD, 8, bvy::T_, bvy::T_, cgl.s, $$1, 2), 1),
                  Pair.of(bzx.a(bwr.u, 8, cgl.r, $$1, 2), 1),
                  Pair.of(cce.a($$1), 1),
                  Pair.of(cbh.a($$1, 2), 1),
                  Pair.of(new bzz($$1), 1),
                  Pair.of(new bzk(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new bzp(100)),
         Pair.of(3, cbc.a(bwr.bS, 4)),
         Pair.of(3, new cbi(400, 1600)),
         Pair.of(3, new bzo(ImmutableMap.of(), ImmutableSet.of(cgl.r), bzo.a.a, bzo.b.a, ImmutableList.of(Pair.of(new cbv(), 1)))),
         Pair.of(3, new bzo(ImmutableMap.of(), ImmutableSet.of(cgl.s), bzo.a.a, bzo.b.a, ImmutableList.of(Pair.of(new cch(), 1)))),
         a(),
         Pair.of(99, ccb.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> f(jf<cqy> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, ccf.a()), Pair.of(1, cbe.b(cgl.B, $$2, 6, false)), Pair.of(1, cbe.b(cgl.z, $$2, 6, false)), Pair.of(3, cce.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> g(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, caw.a()),
         Pair.of(0, cbw.a(ImmutableList.of(Pair.of(cbg.a(cgl.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cce.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cav.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> h(jf<cqy> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, ccn.a(ccn.a(ccg::b), cbw.a(ImmutableList.of(Pair.of(caj.a($$1), 5), Pair.of(cce.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bze(600, 600)),
         Pair.of(2, ccn.a(ccn.a(ccg::a), caa.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cav.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzb<? super cqv>>> i(jf<cqy> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cbb.a(15, 3)), Pair.of(1, caa.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bzb<bxj>> a() {
      return Pair.of(
         5,
         new cax(
            ImmutableList.of(
               Pair.of(caz.a(bwr.u, 8.0F), 8),
               Pair.of(caz.a(bwr.bD, 8.0F), 2),
               Pair.of(caz.a(bwr.bS, 8.0F), 2),
               Pair.of(caz.a(bxm.b, 8.0F), 1),
               Pair.of(caz.a(bxm.f, 8.0F), 1),
               Pair.of(caz.a(bxm.d, 8.0F), 1),
               Pair.of(caz.a(bxm.e, 8.0F), 1),
               Pair.of(caz.a(bxm.g, 8.0F), 1),
               Pair.of(caz.a(bxm.a, 8.0F), 1),
               Pair.of(new bzk(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bzb<bxj>> b() {
      return Pair.of(5, new cax(ImmutableList.of(Pair.of(caz.a(bwr.bD, 8.0F), 2), Pair.of(caz.a(bwr.bS, 8.0F), 2), Pair.of(new bzk(30, 60), 8))));
   }

   private static boolean a(arq $$0, bxj $$1) {
      csz $$2 = $$0.d($$1.du());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(arq $$0, bxj $$1) {
      csz $$2 = $$0.d($$1.du());
      return $$2 != null && $$2.e();
   }
}
