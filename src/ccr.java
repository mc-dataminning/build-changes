import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ccr {
   private static final float d = 0.4F;
   public static final int a = 5;
   public static final int b = 2;
   public static final float c = 0.5F;

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> a(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, new ccf(0.8F)),
         Pair.of(0, caj.a()),
         Pair.of(0, new car(45, 90)),
         Pair.of(0, new cct()),
         Pair.of(0, ccu.a()),
         Pair.of(0, cbe.a()),
         Pair.of(0, cbo.a()),
         Pair.of(0, cco.a($$0.a().b(), cgw.c)),
         Pair.of(0, cco.a($$0.a().c(), cgw.d)),
         Pair.of(1, new cav()),
         Pair.of(2, cay.a()),
         Pair.of(3, new caq($$1)),
         new Pair[]{
            Pair.of(5, caf.a($$1, false, 4)),
            Pair.of(6, bze.a($$0.a().c(), cgw.c, cgw.d, true, Optional.empty(), ($$0x, $$1x) -> true)),
            Pair.of(7, new cad($$1)),
            Pair.of(8, ccx.a($$1)),
            Pair.of(10, bze.a($$0x -> $$0x.a(cja.n), cgw.b, false, Optional.of((byte)14), ccr::a)),
            Pair.of(10, bze.a($$0x -> $$0x.a(cja.o), cgw.e, true, Optional.of((byte)14))),
            Pair.of(10, bzh.a()),
            Pair.of(10, cbf.a())
         }
      );
   }

   private static boolean a(ars $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      return $$2.a(axe.T) && !$$2.c(dmv.c);
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> b(jf<crm> $$0, float $$1) {
      ccw $$2;
      if ($$0.a(crm.g)) {
         $$2 = new ccv();
      } else {
         $$2 = new ccw();
      }

      return ImmutableList.of(
         b(),
         Pair.of(
            5,
            new cbi(
               ImmutableList.of(
                  Pair.of($$2, 7),
                  Pair.of(ccc.a(cgw.c, 0.4F, 4), 2),
                  Pair.of(ccd.a(cgw.c, 0.4F, 1, 10), 5),
                  Pair.of(cce.a(cgw.f, $$1, 1, 6, cgw.c), 5),
                  Pair.of(new cag(), $$0.a(crm.g) ? 2 : 5),
                  Pair.of(new ccn(), $$0.a(crm.g) ? 4 : 7)
               )
            )
         ),
         Pair.of(10, new cbt(400, 1600)),
         Pair.of(10, cbn.a(bxc.bT, 4)),
         Pair.of(2, cbr.a(cgw.c, $$1, 9, 100, 1200)),
         Pair.of(3, new caa(100)),
         Pair.of(99, ccm.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> a(float $$0) {
      return ImmutableList.of(
         Pair.of(0, new cav(80, 120)),
         a(),
         Pair.of(5, cax.a()),
         Pair.of(
            5,
            new cbi(
               ImmutableMap.of(cgw.i, cgx.b),
               ImmutableList.of(
                  Pair.of(cai.a(bxc.bE, 8, cgw.r, $$0, 2), 2),
                  Pair.of(cai.a(bxc.v, 8, cgw.r, $$0, 2), 1),
                  Pair.of(ccp.a($$0), 1),
                  Pair.of(cbs.a($$0, 2), 1),
                  Pair.of(new cak($$0), 2),
                  Pair.of(new bzv(20, 40), 2)
               )
            )
         ),
         Pair.of(99, ccm.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> c(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cbr.a(cgw.b, $$1, 1, 150, 1200)),
         Pair.of(3, cco.a($$0x -> $$0x.a(cja.n), cgw.b)),
         Pair.of(3, new cbv()),
         Pair.of(
            5,
            new cbi(
               ImmutableMap.of(cgw.b, cgx.b),
               ImmutableList.of(Pair.of(cbj.a($$1), 1), Pair.of(cah.a($$1), 4), Pair.of(cac.a($$1, 4), 2), Pair.of(new bzv(20, 40), 2))
            )
         ),
         b(),
         Pair.of(99, ccm.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> d(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(2, cch.a(ImmutableList.of(Pair.of(ccc.a(cgw.e, 0.4F, 40), 2), Pair.of(cbw.a(), 2)))),
         Pair.of(10, new cbt(400, 1600)),
         Pair.of(10, cbn.a(bxc.bT, 4)),
         Pair.of(2, cbr.a(cgw.e, $$1, 6, 100, 200)),
         Pair.of(3, new caa(100)),
         Pair.of(3, cco.a($$0x -> $$0x.a(cja.o), cgw.e)),
         Pair.of(3, new bzz(ImmutableMap.of(), ImmutableSet.of(cgw.r), bzz.a.a, bzz.b.a, ImmutableList.of(Pair.of(new ccg(), 1)))),
         a(),
         Pair.of(99, ccm.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> e(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(
            2,
            new cbi(
               ImmutableList.of(
                  Pair.of(cai.a(bxc.bE, 8, cgw.r, $$1, 2), 2),
                  Pair.of(cai.a(bxc.bE, 8, bwj::X_, bwj::X_, cgw.s, $$1, 2), 1),
                  Pair.of(cai.a(bxc.v, 8, cgw.r, $$1, 2), 1),
                  Pair.of(ccp.a($$1), 1),
                  Pair.of(cbs.a($$1, 2), 1),
                  Pair.of(new cak($$1), 1),
                  Pair.of(new bzv(30, 60), 1)
               )
            )
         ),
         Pair.of(3, new caa(100)),
         Pair.of(3, cbn.a(bxc.bT, 4)),
         Pair.of(3, new cbt(400, 1600)),
         Pair.of(3, new bzz(ImmutableMap.of(), ImmutableSet.of(cgw.r), bzz.a.a, bzz.b.a, ImmutableList.of(Pair.of(new ccg(), 1)))),
         Pair.of(3, new bzz(ImmutableMap.of(), ImmutableSet.of(cgw.s), bzz.a.a, bzz.b.a, ImmutableList.of(Pair.of(new ccs(), 1)))),
         a(),
         Pair.of(99, ccm.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> f(jf<crm> $$0, float $$1) {
      float $$2 = $$1 * 1.5F;
      return ImmutableList.of(
         Pair.of(0, ccq.a()), Pair.of(1, cbp.b(cgw.B, $$2, 6, false)), Pair.of(1, cbp.b(cgw.z, $$2, 6, false)), Pair.of(3, ccp.a($$2, 2, 2)), b()
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> g(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, cbh.a()),
         Pair.of(0, cch.a(ImmutableList.of(Pair.of(cbr.a(cgw.e, $$1 * 1.5F, 2, 150, 200), 6), Pair.of(ccp.a($$1 * 1.5F), 2)))),
         b(),
         Pair.of(99, cbg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> h(jf<crm> $$0, float $$1) {
      return ImmutableList.of(
         Pair.of(0, ccy.a(ccy.a(ccr::b), cch.a(ImmutableList.of(Pair.of(cau.a($$1), 5), Pair.of(ccp.a($$1 * 1.1F), 2))))),
         Pair.of(0, new bzp(600, 600)),
         Pair.of(2, ccy.a(ccy.a(ccr::a), cal.a(24, $$1 * 1.4F, 1))),
         b(),
         Pair.of(99, cbg.a())
      );
   }

   public static ImmutableList<Pair<Integer, ? extends bzm<? super crj>>> i(jf<crm> $$0, float $$1) {
      int $$2 = 2;
      return ImmutableList.of(Pair.of(0, cbm.a(15, 3)), Pair.of(1, cal.a(32, $$1 * 1.25F, 2)), b());
   }

   private static Pair<Integer, bzm<bxu>> a() {
      return Pair.of(
         5,
         new cbi(
            ImmutableList.of(
               Pair.of(cbk.a(bxc.v, 8.0F), 8),
               Pair.of(cbk.a(bxc.bE, 8.0F), 2),
               Pair.of(cbk.a(bxc.bT, 8.0F), 2),
               Pair.of(cbk.a(bxx.b, 8.0F), 1),
               Pair.of(cbk.a(bxx.f, 8.0F), 1),
               Pair.of(cbk.a(bxx.d, 8.0F), 1),
               Pair.of(cbk.a(bxx.e, 8.0F), 1),
               Pair.of(cbk.a(bxx.g, 8.0F), 1),
               Pair.of(cbk.a(bxx.a, 8.0F), 1),
               Pair.of(new bzv(30, 60), 2)
            )
         )
      );
   }

   private static Pair<Integer, bzm<bxu>> b() {
      return Pair.of(5, new cbi(ImmutableList.of(Pair.of(cbk.a(bxc.bE, 8.0F), 2), Pair.of(cbk.a(bxc.bT, 8.0F), 2), Pair.of(new bzv(30, 60), 8))));
   }

   private static boolean a(ars $$0, bxu $$1) {
      ctn $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
   }

   private static boolean b(ars $$0, bxu $$1) {
      ctn $$2 = $$0.d($$1.dv());
      return $$2 != null && $$2.e();
   }
}
