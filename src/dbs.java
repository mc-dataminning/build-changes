import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dbs {
   public static final ald<dbn> a = a("protection");
   public static final ald<dbn> b = a("fire_protection");
   public static final ald<dbn> c = a("feather_falling");
   public static final ald<dbn> d = a("blast_protection");
   public static final ald<dbn> e = a("projectile_protection");
   public static final ald<dbn> f = a("respiration");
   public static final ald<dbn> g = a("aqua_affinity");
   public static final ald<dbn> h = a("thorns");
   public static final ald<dbn> i = a("depth_strider");
   public static final ald<dbn> j = a("frost_walker");
   public static final ald<dbn> k = a("binding_curse");
   public static final ald<dbn> l = a("soul_speed");
   public static final ald<dbn> m = a("swift_sneak");
   public static final ald<dbn> n = a("sharpness");
   public static final ald<dbn> o = a("smite");
   public static final ald<dbn> p = a("bane_of_arthropods");
   public static final ald<dbn> q = a("knockback");
   public static final ald<dbn> r = a("fire_aspect");
   public static final ald<dbn> s = a("looting");
   public static final ald<dbn> t = a("sweeping_edge");
   public static final ald<dbn> u = a("efficiency");
   public static final ald<dbn> v = a("silk_touch");
   public static final ald<dbn> w = a("unbreaking");
   public static final ald<dbn> x = a("fortune");
   public static final ald<dbn> y = a("power");
   public static final ald<dbn> z = a("punch");
   public static final ald<dbn> A = a("flame");
   public static final ald<dbn> B = a("infinity");
   public static final ald<dbn> C = a("luck_of_the_sea");
   public static final ald<dbn> D = a("lure");
   public static final ald<dbn> E = a("loyalty");
   public static final ald<dbn> F = a("impaling");
   public static final ald<dbn> G = a("riptide");
   public static final ald<dbn> H = a("channeling");
   public static final ald<dbn> I = a("multishot");
   public static final ald<dbn> J = a("quick_charge");
   public static final ald<dbn> K = a("piercing");
   public static final ald<dbn> L = a("density");
   public static final ald<dbn> M = a("breach");
   public static final ald<dbn> N = a("wind_burst");
   public static final ald<dbn> O = a("mending");
   public static final ald<dbn> P = a("vanishing_curse");

   public static void a(qu<dbn> $$0) {
      jp<bsl> $$1 = $$0.a(lw.s);
      jp<dbn> $$2 = $$0.a(lw.aN);
      jp<cvn> $$3 = $$0.a(lw.K);
      jp<dhm> $$4 = $$0.a(lw.f);
      jp<bty<?>> $$5 = $$0.a(lw.z);
      a(
         $$0,
         a,
         dbn.a(dbn.a($$3.b(axe.bJ), 10, 4, dbn.a(1, 11), dbn.a(12, 11), 1, bua.i))
            .a($$2.b(awy.b))
            .a(dbo.c, new dbx(dbu.b(1.0F)), ewp.a(bk.a.a().a(ee.b(awx.d))))
      );
      a(
         $$0,
         b,
         dbn.a(dbn.a($$3.b(axe.bJ), 5, 4, dbn.a(10, 8), dbn.a(18, 8), 2, bua.i))
            .a($$2.b(awy.b))
            .a(dbo.c, new dbx(dbu.b(2.0F)), ewj.a(ewp.a(bk.a.a().a(ee.a(awx.i)).a(ee.b(awx.d)))))
            .a(dbo.l, new dcd(ale.b("enchantment.fire_protection"), bvu.h, dbu.b(-0.15F), bvs.a.b))
      );
      a(
         $$0,
         c,
         dbn.a(dbn.a($$3.b(axe.bF), 5, 4, dbn.a(5, 6), dbn.a(11, 6), 2, bua.i)).a(dbo.c, new dbx(dbu.b(3.0F)), ewp.a(bk.a.a().a(ee.a(awx.m)).a(ee.b(awx.d))))
      );
      a(
         $$0,
         d,
         dbn.a(dbn.a($$3.b(axe.bJ), 2, 4, dbn.a(5, 8), dbn.a(13, 8), 4, bua.i))
            .a($$2.b(awy.b))
            .a(dbo.c, new dbx(dbu.b(2.0F)), ewp.a(bk.a.a().a(ee.a(awx.l)).a(ee.b(awx.d))))
            .a(dbo.l, new dcd(ale.b("enchantment.blast_protection"), bvu.i, dbu.b(0.15F), bvs.a.a))
      );
      a(
         $$0,
         e,
         dbn.a(dbn.a($$3.b(axe.bJ), 5, 4, dbn.a(3, 6), dbn.a(9, 6), 2, bua.i))
            .a($$2.b(awy.b))
            .a(dbo.c, new dbx(dbu.b(2.0F)), ewp.a(bk.a.a().a(ee.a(awx.j)).a(ee.b(awx.d))))
      );
      a(
         $$0,
         f,
         dbn.a(dbn.a($$3.b(axe.bI), 2, 3, dbn.a(10, 10), dbn.a(40, 10), 4, bua.h))
            .a(dbo.l, new dcd(ale.b("enchantment.respiration"), bvu.w, dbu.b(1.0F), bvs.a.a))
      );
      a(
         $$0,
         g,
         dbn.a(dbn.a($$3.b(axe.bI), 2, 1, dbn.a(1), dbn.a(41), 4, bua.h)).a(dbo.l, new dcd(ale.b("enchantment.aqua_affinity"), bvu.C, dbu.b(4.0F), bvs.a.c))
      );
      a(
         $$0,
         h,
         dbn.a(dbn.a($$3.b(axe.bJ), $$3.b(axe.bH), 1, 3, dbn.a(10, 20), dbn.a(60, 20), 8, bua.a))
            .a(dbo.i, dbr.c, dbr.a, dby.a(new dca(dbu.a(1.0F), dbu.a(5.0F), $$1.b(bsm.P)), new dcc(dbu.a(2.0F))), exb.a(exq.a(dbu.b(0.15F))))
      );
      a(
         $$0,
         i,
         dbn.a(dbn.a($$3.b(axe.bF), 2, 3, dbn.a(10, 10), dbn.a(25, 10), 4, bua.e))
            .a($$2.b(awy.c))
            .a(dbo.l, new dcd(ale.b("enchantment.depth_strider"), bvu.F, dbu.b(0.33333334F), bvs.a.a))
      );
      a(
         $$0,
         j,
         dbn.a(dbn.a($$3.b(axe.bF), 2, 2, dbn.a(10, 10), dbn.a(25, 10), 4, bua.e))
            .a($$2.b(awy.c))
            .a(dbo.d, dcb.a, ewp.a(bk.a.a().a(ee.a(awx.E)).a(ee.b(awx.d))))
            .a(
               dbo.n,
               new dcn(
                  new dbu.a(dbu.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dbu.a(1.0F),
                  new kj(0, -1, 0),
                  Optional.of(ebv.a(ebv.a(new kj(0, 1, 0), awv.cB), ebv.a(dho.G), ebv.a(equ.c), ebv.f())),
                  ehz.a(dho.kI),
                  Optional.of(dzp.i)
               ),
               ewz.a(etl.b.a, bv.a.a().a(bt.a.a().a(true)))
            )
      );
      a($$0, k, dbn.a(dbn.a($$3.b(axe.bU), 1, 1, dbn.a(25), dbn.a(50), 8, bua.i)).a(dbo.E));
      bv.a $$6 = bv.a.a().a(5).a(bt.a.a().f(false).a(true)).a(dj.b(dh.c.b(1.0E-5F))).c(df.a.a().a(aw.a.a().a($$4, awv.aO)));
      ewj.a $$7 = ewj.a(
         ewt.a(ewz.a(etl.b.a, bv.a.a().a(bv.a.a()))),
         ewk.a(
            ewj.a(
               ewq.c(),
               ewz.a(etl.b.a, bv.a.a().a(bt.a.a().f(false))),
               ewk.a(ewz.a(etl.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, awv.aO)))), ewz.a(etl.b.a, bv.a.a().a(bt.a.a().a(false)).b()))
            ),
            ewj.a(ewq.d(), ewz.a(etl.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, awv.aO))).a(bt.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dbn.a(dbn.a($$3.b(axe.bF), 1, 3, dbn.a(10, 10), dbn.a(25, 10), 8, bua.e))
            .a(
               dbo.n,
               dby.a(
                  new dcd(ale.b("enchantment.soul_speed"), bvu.v, dbu.a(0.0405F, 0.0105F), bvs.a.a),
                  new dcd(ale.b("enchantment.soul_speed"), bvu.u, dbu.a(1.0F), bvs.a.a)
               ),
               $$7
            )
            .a(
               dbo.n,
               new dcc(dbu.a(1.0F)),
               ewj.a(exb.a(exq.a(dbu.a(0.04F))), ewz.a(etl.b.a, bv.a.a().a(bt.a.a().a(true)).c(df.a.a().a(aw.a.a().a($$4, awv.aO)))))
            )
            .a(dbo.o, new dcr(lo.M, dcr.b(), dcr.a(0.1F), dcr.b(-0.2F), dcr.a(bqt.a(0.1F)), bqt.a(1.0F)), ewz.a(etl.b.a, $$6))
            .a(dbo.o, new dck(awg.xR, bqt.a(0.6F), brc.b(0.6F, 1.0F)), ewj.a(exb.a(0.35F), ewz.a(etl.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dbn.a(dbn.a($$3.b(axe.bG), 1, 3, dbn.a(25, 25), dbn.a(75, 25), 8, bua.f))
            .a(dbo.l, new dcd(ale.b("enchantment.swift_sneak"), bvu.z, dbu.b(0.15F), bvs.a.a))
      );
      a($$0, n, dbn.a(dbn.a($$3.b(axe.bM), $$3.b(axe.bK), 10, 5, dbn.a(1, 11), dbn.a(21, 11), 1, bua.b)).a($$2.b(awy.f)).a(dbo.e, new dbx(dbu.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dbn.a(dbn.a($$3.b(axe.bN), $$3.b(axe.bK), 5, 5, dbn.a(5, 8), dbn.a(25, 8), 2, bua.b))
            .a($$2.b(awy.f))
            .a(dbo.e, new dbx(dbu.b(2.5F)), ewz.a(etl.b.a, bv.a.a().a(by.a($$5, awz.D))))
      );
      a(
         $$0,
         p,
         dbn.a(dbn.a($$3.b(axe.bN), $$3.b(axe.bK), 5, 5, dbn.a(5, 8), dbn.a(25, 8), 2, bua.b))
            .a($$2.b(awy.f))
            .a(dbo.e, new dbx(dbu.b(2.5F)), ewz.a(etl.b.a, bv.a.a().a(by.a($$5, awz.C))))
            .a(
               dbo.i,
               dbr.a,
               dbr.c,
               new dbz(js.a(bta.b), dbu.a(1.5F), dbu.a(1.5F, 0.5F), dbu.a(3.0F), dbu.a(3.0F)),
               ewz.a(etl.b.a, bv.a.a().a(by.a($$5, awz.C))).and(ewp.a(bk.a.a().a(true)))
            )
      );
      a($$0, q, dbn.a(dbn.a($$3.b(axe.bK), 5, 2, dbn.a(5, 20), dbn.a(55, 20), 2, bua.b)).a(dbo.g, new dbx(dbu.b(1.0F))));
      a(
         $$0,
         r,
         dbn.a(dbn.a($$3.b(axe.bL), $$3.b(axe.bK), 2, 2, dbn.a(10, 20), dbn.a(60, 20), 4, bua.b))
            .a(dbo.i, dbr.a, dbr.c, new dci(dbu.b(4.0F)), ewp.a(bk.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dbn.a(dbn.a($$3.b(axe.bK), 2, 3, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b))
            .a(dbo.m, dbr.a, dbr.c, new dbx(dbu.b(0.01F)), ewz.a(etl.b.b, bv.a.a().a(by.a($$5, bty.by))))
      );
      a(
         $$0,
         t,
         dbn.a(dbn.a($$3.b(axe.bK), 2, 3, dbn.a(5, 9), dbn.a(20, 9), 4, bua.b))
            .a(dbo.l, new dcd(ale.b("enchantment.sweeping_edge"), bvu.D, new dbu.c(dbu.b(1.0F), dbu.a(2.0F, 1.0F)), bvs.a.a))
      );
      a(
         $$0,
         u,
         dbn.a(dbn.a($$3.b(axe.bO), 10, 5, dbn.a(1, 10), dbn.a(51, 10), 1, bua.b))
            .a(dbo.l, new dcd(ale.b("enchantment.efficiency"), bvu.t, new dbu.d(1.0F), bvs.a.a))
      );
      a($$0, v, dbn.a(dbn.a($$3.b(axe.bP), 1, 1, dbn.a(15), dbn.a(65), 8, bua.b)).a($$2.b(awy.g)).a(dbo.x, new dcq(dbu.a(0.0F))));
      a(
         $$0,
         w,
         dbn.a(dbn.a($$3.b(axe.bS), 5, 3, dbn.a(5, 8), dbn.a(55, 8), 2, bua.a))
            .a(dbo.k, new dcl(new dbu.c(dbu.b(2.0F), dbu.a(10.0F, 5.0F))), exd.a(cs.a.a().a($$3, axe.bJ)))
            .a(dbo.k, new dcl(new dbu.c(dbu.b(1.0F), dbu.a(2.0F, 1.0F))), ewt.a(exd.a(cs.a.a().a($$3, axe.bJ))))
      );
      a($$0, x, dbn.a(dbn.a($$3.b(axe.bP), 2, 3, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b)).a($$2.b(awy.g)));
      a(
         $$0,
         y,
         dbn.a(dbn.a($$3.b(axe.bT), 10, 5, dbn.a(1, 10), dbn.a(16, 10), 1, bua.b)).a(dbo.e, new dbx(dbu.b(0.5F)), ewz.a(etl.b.c, bv.a.a().a($$5, awz.f).b()))
      );
      a(
         $$0,
         z,
         dbn.a(dbn.a($$3.b(axe.bT), 2, 2, dbn.a(12, 20), dbn.a(37, 20), 4, bua.b)).a(dbo.g, new dbx(dbu.b(1.0F)), ewz.a(etl.b.c, bv.a.a().a($$5, awz.f).b()))
      );
      a($$0, A, dbn.a(dbn.a($$3.b(axe.bT), 2, 1, dbn.a(20), dbn.a(50), 4, bua.b)).a(dbo.r, new dci(dbu.a(100.0F))));
      a(
         $$0,
         B,
         dbn.a(dbn.a($$3.b(axe.bT), 1, 1, dbn.a(20), dbn.a(50), 8, bua.b)).a($$2.b(awy.d)).a(dbo.p, new dcq(dbu.a(0.0F)), exd.a(cs.a.a().a($$3, cvw.ox)))
      );
      a($$0, C, dbn.a(dbn.a($$3.b(axe.bQ), 2, 3, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b)).a(dbo.w, new dbx(dbu.b(1.0F))));
      a($$0, D, dbn.a(dbn.a($$3.b(axe.bQ), 2, 3, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b)).a(dbo.v, new dbx(dbu.b(5.0F))));
      a($$0, E, dbn.a(dbn.a($$3.b(axe.bR), 5, 3, dbn.a(12, 7), dbn.a(50), 2, bua.b)).a(dbo.u, new dbx(dbu.b(1.0F))));
      a(
         $$0,
         F,
         dbn.a(dbn.a($$3.b(axe.bR), 2, 5, dbn.a(1, 8), dbn.a(21, 8), 4, bua.b))
            .a($$2.b(awy.f))
            .a(dbo.e, new dbx(dbu.b(2.5F)), ewz.a(etl.b.a, bv.a.a().a(by.a($$5, awz.B)).b()))
      );
      a(
         $$0,
         G,
         dbn.a(dbn.a($$3.b(axe.bR), 2, 3, dbn.a(17, 7), dbn.a(50), 4, bua.d))
            .a($$2.b(awy.h))
            .b(dbo.F, new dbx(dbu.a(1.5F, 0.75F)))
            .b(dbo.C, List.of(awg.zJ, awg.zK, awg.zL))
      );
      a(
         $$0,
         H,
         dbn.a(dbn.a($$3.b(axe.bR), 1, 1, dbn.a(25), dbn.a(50), 8, bua.b))
            .a(
               dbo.i,
               dbr.a,
               dbr.c,
               dby.a(new dcs(js.a(bty.am.r()), false), new dck(awg.zN, bqt.a(5.0F), bqt.a(1.0F))),
               ewj.a(exg.c().b(true), ewz.a(etl.b.a, bv.a.a().a(df.a.a().b(true))), ewz.a(etl.b.c, bv.a.a().a($$5, bty.bf)))
            )
            .a(
               dbo.j,
               dby.a(new dcs(js.a(bty.am.r()), false), new dck(awg.zN, bqt.a(5.0F), bqt.a(1.0F))),
               ewj.a(exg.c().b(true), ewz.a(etl.b.a, bv.a.a().a($$5, bty.bf)), ewu.a(df.a.a().b(true)), ewv.a(dho.ss))
            )
      );
      a(
         $$0,
         I,
         dbn.a(dbn.a($$3.b(axe.bV), 2, 1, dbn.a(20), dbn.a(50), 4, bua.b)).a($$2.b(awy.e)).a(dbo.t, new dbx(dbu.b(2.0F))).a(dbo.s, new dbx(dbu.b(10.0F)))
      );
      a(
         $$0,
         J,
         dbn.a(dbn.a($$3.b(axe.bV), 5, 3, dbn.a(12, 20), dbn.a(50), 2, bua.b, bua.c))
            .b(dbo.A, new dbx(dbu.b(-0.25F)))
            .b(
               dbo.B,
               List.of(
                  new cug.a(Optional.of(awg.gs), Optional.empty(), Optional.of(awg.gp)),
                  new cug.a(Optional.of(awg.gt), Optional.empty(), Optional.of(awg.gp)),
                  new cug.a(Optional.of(awg.gu), Optional.empty(), Optional.of(awg.gp))
               )
            )
      );
      a($$0, K, dbn.a(dbn.a($$3.b(axe.bV), 10, 4, dbn.a(1, 10), dbn.a(50), 1, bua.b)).a($$2.b(awy.e)).a(dbo.q, new dbx(dbu.b(1.0F))));
      a($$0, L, dbn.a(dbn.a($$3.b(axe.bX), 5, 5, dbn.a(5, 8), dbn.a(25, 8), 2, bua.b)).a($$2.b(awy.f)).a(dbo.f, new dbx(dbu.b(0.5F))));
      a($$0, M, dbn.a(dbn.a($$3.b(axe.bX), 2, 4, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b)).a($$2.b(awy.f)).a(dbo.h, new dbx(dbu.b(-0.15F))));
      a(
         $$0,
         N,
         dbn.a(dbn.a($$3.b(axe.bX), 2, 3, dbn.a(15, 9), dbn.a(65, 9), 4, bua.b))
            .a(
               dbo.i,
               dbr.a,
               dbr.a,
               new dch(
                  false,
                  Optional.empty(),
                  Optional.of(dbu.a(List.of(1.2F, 1.75F, 2.2F), dbu.a(1.5F, 0.35F))),
                  $$4.a(awv.cz).map(Function.identity()),
                  eyw.c,
                  dbu.a(3.5F),
                  false,
                  dej.a.e,
                  lo.A,
                  lo.z,
                  awg.Cw
               ),
               ewz.a(etl.b.c, bv.a.a().a(bt.a.a().f(false)).a(dj.d(dh.c.b(1.5))))
            )
      );
      a($$0, O, dbn.a(dbn.a($$3.b(axe.bS), 2, 1, dbn.a(25, 25), dbn.a(75, 25), 4, bua.a)).a(dbo.z, new dcj(dbu.a(2.0F))));
      a($$0, P, dbn.a(dbn.a($$3.b(axe.bW), 1, 1, dbn.a(25), dbn.a(50), 8, bua.a)).a(dbo.D));
   }

   private static void a(qu<dbn> $$0, ald<dbn> $$1, dbn.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static ald<dbn> a(String $$0) {
      return ald.a(lw.aN, ale.b($$0));
   }
}
