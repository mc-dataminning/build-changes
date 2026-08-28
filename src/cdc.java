import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cdc {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> a(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new ccq(0.8F)),
         Pair.of(0, cau.a()),
         Pair.of(0, new cbc(45, 90)),
         Pair.of(0, new cde()),
         Pair.of(0, cdf.a()),
         Pair.of(0, cbp.a()),
         Pair.of(0, cbz.a()),
         Pair.of(0, ccz.a($$0.a().b(), chh.c)),
         Pair.of(0, ccz.a($$0.a().c(), chh.d)),
         Pair.of(1, new cbg()),
         Pair.of(2, cbj.a()),
         Pair.of(3, new cbb($$1)),
         new Pair[]{
            Pair.of(5, caq.a($$1, false, 4)),
            Pair.of(6, bzp.a($$0.a().c(), chh.c, chh.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new cao($$1)),
            Pair.of(8, cdi.a($$1)),
            Pair.of(10, bzp.a($$0x -> $$0x.a(cjl.n), chh.b, false, Optional.of((byte)14), cdc::a)),
            Pair.of(10, bzp.a($$0x -> $$0x.a(cjl.o), chh.e, true, Optional.of((byte)14))),
            Pair.of(10, bzs.a()),
            Pair.of(10, cbq.a())
         }
      );
   }

   private static boolean a(asb $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return $$2.a(axn.T) && !$$2.c(dnh.c);
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> b(jg<crx> $$0, float $$1) {
      cdh $$2;
      if ($$0.a(crx.g)) {
         $$2 = new cdg();
      } else {
         $$2 = new cdh();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cbt(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(ccn.a(chh.c, 0.4F, 4), 2),
                  Pair.of(cco.a(chh.c, 0.4F, 1, 10), 5),
                  Pair.of(ccp.a(chh.f, $$1, 1, 6, chh.c), 5),
                  Pair.of(new car(), $$0.a(crx.g) ? 2 : 5),
                  Pair.of(new ccy(), $$0.a(crx.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cce(400, 1600)),
         Pair.of(10, cby.a(bxn.bT, 4)),
         Pair.of(2, ccc.a(chh.c, $$1, 9, 100, 1200)),
         Pair.of(3, new cal(100)),
         Pair.of(99, ccx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cbg(80, 120)),
         a(),
         Pair.of(5, cbi.a()),
         Pair.of(
            5,
            new cbt(
               ImmutableMap.of(chh.i, chi.b),
               ImmutableList.of(
                  Pair.of(cat.a(bxn.bE, 8, chh.r, $$0, 2), 2),
                  Pair.of(cat.a(bxn.v, 8, chh.r, $$0, 2), 1),
                  Pair.of(cda.a($$0), 1),
                  Pair.of(ccd.a($$0, 2), 1),
                  Pair.of(new cav($$0), 2),
                  Pair.of(new cag(20, 40), 2)
               )
            )
         ),
         Pair.of(99, ccx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> c(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, ccc.a(chh.b, $$1, 1, 150, 1200)),
         Pair.of(3, ccz.a($$0x -> $$0x.a(cjl.n), chh.b)),
         Pair.of(3, new ccg()),
         Pair.of(
            5,
            new cbt(
               ImmutableMap.of(chh.b, chi.b),
               ImmutableList.of(Pair.of(cbu.a($$1), 1), Pair.of(cas.a($$1), 4), Pair.of(can.a($$1, 4), 2), Pair.of(new cag(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, ccx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> d(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, ccs.a(ImmutableList.of(Pair.of(ccn.a(chh.e, 0.4F, 40), 2), Pair.of(cch.a(), 2)))),
         Pair.of(10, new cce(400, 1600)),
         Pair.of(10, cby.a(bxn.bT, 4)),
         Pair.of(2, ccc.a(chh.e, $$1, 6, 100, 200)),
         Pair.of(3, new cal(100)),
         Pair.of(3, ccz.a($$0x -> $$0x.a(cjl.o), chh.e)),
         Pair.of(3, new cak(ImmutableMap.of(), ImmutableSet.of(chh.r), cak.a.a, cak.b.a, ImmutableList.of(Pair.of(new ccr(), 1)))),
         a(),
         Pair.of(99, ccx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> e(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cbt(
               ImmutableList.of(
                  Pair.of(cat.a(bxn.bE, 8, chh.r, $$1, 2), 2),
                  Pair.of(cat.a(bxn.bE, 8, bwu::Y_, bwu::Y_, chh.s, $$1, 2), 1),
                  Pair.of(cat.a(bxn.v, 8, chh.r, $$1, 2), 1),
                  Pair.of(cda.a($$1), 1),
                  Pair.of(ccd.a($$1, 2), 1),
                  Pair.of(new cav($$1), 1),
                  Pair.of(new cag(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new cal(100)),
         Pair.of(3, cby.a(bxn.bT, 4)),
         Pair.of(3, new cce(400, 1600)),
         Pair.of(3, new cak(ImmutableMap.of(), ImmutableSet.of(chh.r), cak.a.a, cak.b.a, ImmutableList.of(Pair.of(new ccr(), 1)))),
         Pair.of(3, new cak(ImmutableMap.of(), ImmutableSet.of(chh.s), cak.a.a, cak.b.a, ImmutableList.of(Pair.of(new cdd(), 1)))),
         a(),
         Pair.of(99, ccx.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> f(jg<crx> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, cdb.a()), Pair.of(1, cca.b(chh.B, $$2, 6, false)), Pair.of(1, cca.b(chh.z, $$2, 6, false)), Pair.of(3, cda.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> g(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cbs.a()),
         Pair.of(0, ccs.a(ImmutableList.of(Pair.of(ccc.a(chh.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(cda.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> h(jg<crx> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cdj.a(cdj.a(cdc::b), ccs.a(ImmutableList.of(Pair.of(cbf.a($$1), 5), Pair.of(cda.a($$1 * 1.1F), 2))))),
         Pair.of(0, new caa(600, 600)),
         Pair.of(2, cdj.a(cdj.a(cdc::a), caw.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cbr.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzx<? super cru>>> i(jg<crx> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cbx.a(15, 3)), Pair.of(1, caw.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bzx<byf>> a() {
      return Pair.of(
         5,
         new cbt(
            ImmutableList.of(
               Pair.of(cbv.a(bxn.v, 8.0F), 8),
               Pair.of(cbv.a(bxn.bE, 8.0F), 2),
               Pair.of(cbv.a(bxn.bT, 8.0F), 2),
               Pair.of(cbv.a(byi.b, 8.0F), 1),
               Pair.of(cbv.a(byi.f, 8.0F), 1),
               Pair.of(cbv.a(byi.d, 8.0F), 1),
               Pair.of(cbv.a(byi.e, 8.0F), 1),
               Pair.of(cbv.a(byi.g, 8.0F), 1),
               Pair.of(cbv.a(byi.a, 8.0F), 1),
               Pair.of(new cag(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bzx<byf>> b() {
      return Pair.of(5, new cbt(ImmutableList.of(Pair.of(cbv.a(bxn.bE, 8.0F), 2), Pair.of(cbv.a(bxn.bT, 8.0F), 2), Pair.of(new cag(30, 60), 8))));
   }

   private static boolean a(asb $$0, byf $$1) {
      cty $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(asb $$0, byf $$1) {
      cty $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
