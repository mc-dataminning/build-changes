import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dbr {
   public static final alg<dbm> a = a("protection");
   public static final alg<dbm> b = a("fire_protection");
   public static final alg<dbm> c = a("feather_falling");
   public static final alg<dbm> d = a("blast_protection");
   public static final alg<dbm> e = a("projectile_protection");
   public static final alg<dbm> f = a("respiration");
   public static final alg<dbm> g = a("aqua_affinity");
   public static final alg<dbm> h = a("thorns");
   public static final alg<dbm> i = a("depth_strider");
   public static final alg<dbm> j = a("frost_walker");
   public static final alg<dbm> k = a("binding_curse");
   public static final alg<dbm> l = a("soul_speed");
   public static final alg<dbm> m = a("swift_sneak");
   public static final alg<dbm> n = a("sharpness");
   public static final alg<dbm> o = a("smite");
   public static final alg<dbm> p = a("bane_of_arthropods");
   public static final alg<dbm> q = a("knockback");
   public static final alg<dbm> r = a("fire_aspect");
   public static final alg<dbm> s = a("looting");
   public static final alg<dbm> t = a("sweeping_edge");
   public static final alg<dbm> u = a("efficiency");
   public static final alg<dbm> v = a("silk_touch");
   public static final alg<dbm> w = a("unbreaking");
   public static final alg<dbm> x = a("fortune");
   public static final alg<dbm> y = a("power");
   public static final alg<dbm> z = a("punch");
   public static final alg<dbm> A = a("flame");
   public static final alg<dbm> B = a("infinity");
   public static final alg<dbm> C = a("luck_of_the_sea");
   public static final alg<dbm> D = a("lure");
   public static final alg<dbm> E = a("loyalty");
   public static final alg<dbm> F = a("impaling");
   public static final alg<dbm> G = a("riptide");
   public static final alg<dbm> H = a("channeling");
   public static final alg<dbm> I = a("multishot");
   public static final alg<dbm> J = a("quick_charge");
   public static final alg<dbm> K = a("piercing");
   public static final alg<dbm> L = a("density");
   public static final alg<dbm> M = a("breach");
   public static final alg<dbm> N = a("wind_burst");
   public static final alg<dbm> O = a("mending");
   public static final alg<dbm> P = a("vanishing_curse");

   public static void a(qx<dbm> $$0) {
      jq<bsr> $$1 = $$0.a(ly.s);
      jq<dbm> $$2 = $$0.a(ly.aM);
      jq<cvt> $$3 = $$0.a(ly.K);
      jq<dhy> $$4 = $$0.a(ly.f);
      jq<bug<?>> $$5 = $$0.a(ly.z);
      a(
         $$0,
         a,
         dbm.a(dbm.a($$3.b(axi.bS), 10, 4, dbm.a(1, 11), dbm.a(12, 11), 1, bui.i))
            .a($$2.b(axc.b))
            .a(dbn.c, new dbw(dbt.b(1.0F)), exa.a(bk.a.a().a(ef.b(axb.d))))
      );
      a(
         $$0,
         b,
         dbm.a(dbm.a($$3.b(axi.bS), 5, 4, dbm.a(10, 8), dbm.a(18, 8), 2, bui.i))
            .a($$2.b(axc.b))
            .a(dbn.c, new dbw(dbt.b(2.0F)), ewu.a(exa.a(bk.a.a().a(ef.a(axb.i)).a(ef.b(axb.d)))))
            .a(dbn.l, new dcc(alh.b("enchantment.fire_protection"), bwd.h, dbt.b(-0.15F), bwb.a.b))
      );
      a(
         $$0,
         c,
         dbm.a(dbm.a($$3.b(axi.bO), 5, 4, dbm.a(5, 6), dbm.a(11, 6), 2, bui.i)).a(dbn.c, new dbw(dbt.b(3.0F)), exa.a(bk.a.a().a(ef.a(axb.m)).a(ef.b(axb.d))))
      );
      a(
         $$0,
         d,
         dbm.a(dbm.a($$3.b(axi.bS), 2, 4, dbm.a(5, 8), dbm.a(13, 8), 4, bui.i))
            .a($$2.b(axc.b))
            .a(dbn.c, new dbw(dbt.b(2.0F)), exa.a(bk.a.a().a(ef.a(axb.l)).a(ef.b(axb.d))))
            .a(dbn.l, new dcc(alh.b("enchantment.blast_protection"), bwd.i, dbt.b(0.15F), bwb.a.a))
      );
      a(
         $$0,
         e,
         dbm.a(dbm.a($$3.b(axi.bS), 5, 4, dbm.a(3, 6), dbm.a(9, 6), 2, bui.i))
            .a($$2.b(axc.b))
            .a(dbn.c, new dbw(dbt.b(2.0F)), exa.a(bk.a.a().a(ef.a(axb.j)).a(ef.b(axb.d))))
      );
      a(
         $$0,
         f,
         dbm.a(dbm.a($$3.b(axi.bR), 2, 3, dbm.a(10, 10), dbm.a(40, 10), 4, bui.h))
            .a(dbn.l, new dcc(alh.b("enchantment.respiration"), bwd.w, dbt.b(1.0F), bwb.a.a))
      );
      a(
         $$0,
         g,
         dbm.a(dbm.a($$3.b(axi.bR), 2, 1, dbm.a(1), dbm.a(41), 4, bui.h)).a(dbn.l, new dcc(alh.b("enchantment.aqua_affinity"), bwd.C, dbt.b(4.0F), bwb.a.c))
      );
      a(
         $$0,
         h,
         dbm.a(dbm.a($$3.b(axi.bS), $$3.b(axi.bQ), 1, 3, dbm.a(10, 20), dbm.a(60, 20), 8, bui.a))
            .a(dbn.i, dbq.c, dbq.a, dbx.a(new dbz(dbt.a(1.0F), dbt.a(5.0F), $$1.b(bss.P)), new dcb(dbt.a(2.0F))), exm.a(eyb.a(dbt.b(0.15F))))
      );
      a(
         $$0,
         i,
         dbm.a(dbm.a($$3.b(axi.bO), 2, 3, dbm.a(10, 10), dbm.a(25, 10), 4, bui.e))
            .a($$2.b(axc.c))
            .a(dbn.l, new dcc(alh.b("enchantment.depth_strider"), bwd.F, dbt.b(0.33333334F), bwb.a.a))
      );
      a(
         $$0,
         j,
         dbm.a(dbm.a($$3.b(axi.bO), 2, 2, dbm.a(10, 10), dbm.a(25, 10), 4, bui.e))
            .a($$2.b(axc.c))
            .a(dbn.d, dca.a, exa.a(bk.a.a().a(ef.a(axb.E)).a(ef.b(axb.d))))
            .a(
               dbn.n,
               new dcm(
                  new dbt.a(dbt.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dbt.a(1.0F),
                  new kk(0, -1, 0),
                  Optional.of(ecg.a(ecg.a(new kk(0, 1, 0), awz.cC), ecg.a(dia.G), ecg.a(erf.c), ecg.f())),
                  eik.a(dia.kI),
                  Optional.of(eaa.i)
               ),
               exk.a(etw.b.a, bv.a.a().a(bt.a.a().a(true)))
            )
      );
      a($$0, k, dbm.a(dbm.a($$3.b(axi.cd), 1, 1, dbm.a(25), dbm.a(50), 8, bui.i)).a(dbn.E));
      bv.a $$6 = bv.a.a().a(5).a(bt.a.a().f(false).a(true)).a(dk.b(di.c.b(1.0E-5F))).c(dg.a.a().a(aw.a.a().a($$4, awz.aO)));
      ewu.a $$7 = ewu.a(
         exe.a(exk.a(etw.b.a, bv.a.a().a(bv.a.a()))),
         ewv.a(
            ewu.a(
               exb.c(),
               exk.a(etw.b.a, bv.a.a().a(bt.a.a().f(false))),
               ewv.a(exk.a(etw.b.a, bv.a.a().c(dg.a.a().a(aw.a.a().a($$4, awz.aO)))), exk.a(etw.b.a, bv.a.a().a(bt.a.a().a(false)).b()))
            ),
            ewu.a(exb.d(), exk.a(etw.b.a, bv.a.a().c(dg.a.a().a(aw.a.a().a($$4, awz.aO))).a(bt.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dbm.a(dbm.a($$3.b(axi.bO), 1, 3, dbm.a(10, 10), dbm.a(25, 10), 8, bui.e))
            .a(
               dbn.n,
               dbx.a(
                  new dcc(alh.b("enchantment.soul_speed"), bwd.v, dbt.a(0.0405F, 0.0105F), bwb.a.a),
                  new dcc(alh.b("enchantment.soul_speed"), bwd.u, dbt.a(1.0F), bwb.a.a)
               ),
               $$7
            )
            .a(
               dbn.n,
               new dcb(dbt.a(1.0F)),
               ewu.a(exm.a(eyb.a(dbt.a(0.04F))), exk.a(etw.b.a, bv.a.a().a(bt.a.a().a(true)).c(dg.a.a().a(aw.a.a().a($$4, awz.aO)))))
            )
            .a(dbn.o, new dcq(lq.M, dcq.b(), dcq.a(0.1F), dcq.b(-0.2F), dcq.a(bqz.a(0.1F)), bqz.a(1.0F)), exk.a(etw.b.a, $$6))
            .a(dbn.o, new dcj(awk.xP, bqz.a(0.6F), bri.b(0.6F, 1.0F)), ewu.a(exm.a(0.35F), exk.a(etw.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dbm.a(dbm.a($$3.b(axi.bP), 1, 3, dbm.a(25, 25), dbm.a(75, 25), 8, bui.f))
            .a(dbn.l, new dcc(alh.b("enchantment.swift_sneak"), bwd.z, dbt.b(0.15F), bwb.a.a))
      );
      a($$0, n, dbm.a(dbm.a($$3.b(axi.bV), $$3.b(axi.bT), 10, 5, dbm.a(1, 11), dbm.a(21, 11), 1, bui.b)).a($$2.b(axc.f)).a(dbn.e, new dbw(dbt.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dbm.a(dbm.a($$3.b(axi.bW), $$3.b(axi.bT), 5, 5, dbm.a(5, 8), dbm.a(25, 8), 2, bui.b))
            .a($$2.b(axc.f))
            .a(dbn.e, new dbw(dbt.b(2.5F)), exk.a(etw.b.a, bv.a.a().a(by.a($$5, axd.D))))
      );
      a(
         $$0,
         p,
         dbm.a(dbm.a($$3.b(axi.bW), $$3.b(axi.bT), 5, 5, dbm.a(5, 8), dbm.a(25, 8), 2, bui.b))
            .a($$2.b(axc.f))
            .a(dbn.e, new dbw(dbt.b(2.5F)), exk.a(etw.b.a, bv.a.a().a(by.a($$5, axd.C))))
            .a(
               dbn.i,
               dbq.a,
               dbq.c,
               new dby(jt.a(btg.b), dbt.a(1.5F), dbt.a(1.5F, 0.5F), dbt.a(3.0F), dbt.a(3.0F)),
               exk.a(etw.b.a, bv.a.a().a(by.a($$5, axd.C))).and(exa.a(bk.a.a().a(true)))
            )
      );
      a($$0, q, dbm.a(dbm.a($$3.b(axi.bT), 5, 2, dbm.a(5, 20), dbm.a(55, 20), 2, bui.b)).a(dbn.g, new dbw(dbt.b(1.0F))));
      a(
         $$0,
         r,
         dbm.a(dbm.a($$3.b(axi.bU), $$3.b(axi.bT), 2, 2, dbm.a(10, 20), dbm.a(60, 20), 4, bui.b))
            .a(dbn.i, dbq.a, dbq.c, new dch(dbt.b(4.0F)), exa.a(bk.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dbm.a(dbm.a($$3.b(axi.bT), 2, 3, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b))
            .a(dbn.m, dbq.a, dbq.c, new dbw(dbt.b(0.01F)), exk.a(etw.b.b, bv.a.a().a(by.a($$5, bug.by))))
      );
      a(
         $$0,
         t,
         dbm.a(dbm.a($$3.b(axi.bT), 2, 3, dbm.a(5, 9), dbm.a(20, 9), 4, bui.b))
            .a(dbn.l, new dcc(alh.b("enchantment.sweeping_edge"), bwd.D, new dbt.c(dbt.b(1.0F), dbt.a(2.0F, 1.0F)), bwb.a.a))
      );
      a(
         $$0,
         u,
         dbm.a(dbm.a($$3.b(axi.bX), 10, 5, dbm.a(1, 10), dbm.a(51, 10), 1, bui.b))
            .a(dbn.l, new dcc(alh.b("enchantment.efficiency"), bwd.t, new dbt.d(1.0F), bwb.a.a))
      );
      a($$0, v, dbm.a(dbm.a($$3.b(axi.bY), 1, 1, dbm.a(15), dbm.a(65), 8, bui.b)).a($$2.b(axc.g)).a(dbn.x, new dcp(dbt.a(0.0F))));
      a(
         $$0,
         w,
         dbm.a(dbm.a($$3.b(axi.cb), 5, 3, dbm.a(5, 8), dbm.a(55, 8), 2, bui.a))
            .a(dbn.k, new dck(new dbt.c(dbt.b(2.0F), dbt.a(10.0F, 5.0F))), exo.a(ct.a.a().a($$3, axi.bS)))
            .a(dbn.k, new dck(new dbt.c(dbt.b(1.0F), dbt.a(2.0F, 1.0F))), exe.a(exo.a(ct.a.a().a($$3, axi.bS))))
      );
      a($$0, x, dbm.a(dbm.a($$3.b(axi.bY), 2, 3, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b)).a($$2.b(axc.g)));
      a(
         $$0,
         y,
         dbm.a(dbm.a($$3.b(axi.cc), 10, 5, dbm.a(1, 10), dbm.a(16, 10), 1, bui.b)).a(dbn.e, new dbw(dbt.b(0.5F)), exk.a(etw.b.c, bv.a.a().a($$5, axd.f).b()))
      );
      a(
         $$0,
         z,
         dbm.a(dbm.a($$3.b(axi.cc), 2, 2, dbm.a(12, 20), dbm.a(37, 20), 4, bui.b)).a(dbn.g, new dbw(dbt.b(1.0F)), exk.a(etw.b.c, bv.a.a().a($$5, axd.f).b()))
      );
      a($$0, A, dbm.a(dbm.a($$3.b(axi.cc), 2, 1, dbm.a(20), dbm.a(50), 4, bui.b)).a(dbn.r, new dch(dbt.a(100.0F))));
      a(
         $$0,
         B,
         dbm.a(dbm.a($$3.b(axi.cc), 1, 1, dbm.a(20), dbm.a(50), 8, bui.b)).a($$2.b(axc.d)).a(dbn.p, new dcp(dbt.a(0.0F)), exo.a(ct.a.a().a($$3, cwb.ox)))
      );
      a($$0, C, dbm.a(dbm.a($$3.b(axi.bZ), 2, 3, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b)).a(dbn.w, new dbw(dbt.b(1.0F))));
      a($$0, D, dbm.a(dbm.a($$3.b(axi.bZ), 2, 3, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b)).a(dbn.v, new dbw(dbt.b(5.0F))));
      a($$0, E, dbm.a(dbm.a($$3.b(axi.ca), 5, 3, dbm.a(12, 7), dbm.a(50), 2, bui.b)).a(dbn.u, new dbw(dbt.b(1.0F))));
      a(
         $$0,
         F,
         dbm.a(dbm.a($$3.b(axi.ca), 2, 5, dbm.a(1, 8), dbm.a(21, 8), 4, bui.b))
            .a($$2.b(axc.f))
            .a(dbn.e, new dbw(dbt.b(2.5F)), exk.a(etw.b.a, bv.a.a().a(by.a($$5, axd.B)).b()))
      );
      a(
         $$0,
         G,
         dbm.a(dbm.a($$3.b(axi.ca), 2, 3, dbm.a(17, 7), dbm.a(50), 4, bui.d))
            .a($$2.b(axc.h))
            .b(dbn.F, new dbw(dbt.a(1.5F, 0.75F)))
            .b(dbn.C, List.of(awk.zH, awk.zI, awk.zJ))
      );
      a(
         $$0,
         H,
         dbm.a(dbm.a($$3.b(axi.ca), 1, 1, dbm.a(25), dbm.a(50), 8, bui.b))
            .a(
               dbn.i,
               dbq.a,
               dbq.c,
               dbx.a(new dcr(jt.a(bug.am.r()), false), new dcj(awk.zL, bqz.a(5.0F), bqz.a(1.0F))),
               ewu.a(exr.c().b(true), exk.a(etw.b.a, bv.a.a().a(dg.a.a().b(true))), exk.a(etw.b.c, bv.a.a().a($$5, bug.bf)))
            )
            .a(
               dbn.j,
               dbx.a(new dcr(jt.a(bug.am.r()), false), new dcj(awk.zL, bqz.a(5.0F), bqz.a(1.0F))),
               ewu.a(exr.c().b(true), exk.a(etw.b.a, bv.a.a().a($$5, bug.bf)), exf.a(dg.a.a().b(true)), exg.a(dia.ss))
            )
      );
      a(
         $$0,
         I,
         dbm.a(dbm.a($$3.b(axi.ce), 2, 1, dbm.a(20), dbm.a(50), 4, bui.b)).a($$2.b(axc.e)).a(dbn.t, new dbw(dbt.b(2.0F))).a(dbn.s, new dbw(dbt.b(10.0F)))
      );
      a(
         $$0,
         J,
         dbm.a(dbm.a($$3.b(axi.ce), 5, 3, dbm.a(12, 20), dbm.a(50), 2, bui.b, bui.c))
            .b(dbn.A, new dbw(dbt.b(-0.25F)))
            .b(
               dbn.B,
               List.of(
                  new cuo.a(Optional.of(awk.gs), Optional.empty(), Optional.of(awk.gp)),
                  new cuo.a(Optional.of(awk.gt), Optional.empty(), Optional.of(awk.gp)),
                  new cuo.a(Optional.of(awk.gu), Optional.empty(), Optional.of(awk.gp))
               )
            )
      );
      a($$0, K, dbm.a(dbm.a($$3.b(axi.ce), 10, 4, dbm.a(1, 10), dbm.a(50), 1, bui.b)).a($$2.b(axc.e)).a(dbn.q, new dbw(dbt.b(1.0F))));
      a($$0, L, dbm.a(dbm.a($$3.b(axi.cg), 5, 5, dbm.a(5, 8), dbm.a(25, 8), 2, bui.b)).a($$2.b(axc.f)).a(dbn.f, new dbw(dbt.b(0.5F))));
      a($$0, M, dbm.a(dbm.a($$3.b(axi.cg), 2, 4, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b)).a($$2.b(axc.f)).a(dbn.h, new dbw(dbt.b(-0.15F))));
      a(
         $$0,
         N,
         dbm.a(dbm.a($$3.b(axi.cg), 2, 3, dbm.a(15, 9), dbm.a(65, 9), 4, bui.b))
            .a(
               dbn.i,
               dbq.a,
               dbq.a,
               new dcg(
                  false,
                  Optional.empty(),
                  Optional.of(dbt.a(List.of(1.2F, 1.75F, 2.2F), dbt.a(1.5F, 0.35F))),
                  $$4.a(awz.cA).map(Function.identity()),
                  ezh.c,
                  dbt.a(3.5F),
                  false,
                  dev.a.e,
                  lq.A,
                  lq.z,
                  awk.Cu
               ),
               exk.a(etw.b.c, bv.a.a().a(bt.a.a().f(false)).a(dk.d(di.c.b(1.5))))
            )
      );
      a($$0, O, dbm.a(dbm.a($$3.b(axi.cb), 2, 1, dbm.a(25, 25), dbm.a(75, 25), 4, bui.a)).a(dbn.z, new dci(dbt.a(2.0F))));
      a($$0, P, dbm.a(dbm.a($$3.b(axi.cf), 1, 1, dbm.a(25), dbm.a(50), 8, bui.a)).a(dbn.D));
   }

   private static void a(qx<dbm> $$0, alg<dbm> $$1, dbm.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alg<dbm> a(String $$0) {
      return alg.a(ly.aM, alh.b($$0));
   }
}
