import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dbp {
   public static final alb<dbk> a = a("protection");
   public static final alb<dbk> b = a("fire_protection");
   public static final alb<dbk> c = a("feather_falling");
   public static final alb<dbk> d = a("blast_protection");
   public static final alb<dbk> e = a("projectile_protection");
   public static final alb<dbk> f = a("respiration");
   public static final alb<dbk> g = a("aqua_affinity");
   public static final alb<dbk> h = a("thorns");
   public static final alb<dbk> i = a("depth_strider");
   public static final alb<dbk> j = a("frost_walker");
   public static final alb<dbk> k = a("binding_curse");
   public static final alb<dbk> l = a("soul_speed");
   public static final alb<dbk> m = a("swift_sneak");
   public static final alb<dbk> n = a("sharpness");
   public static final alb<dbk> o = a("smite");
   public static final alb<dbk> p = a("bane_of_arthropods");
   public static final alb<dbk> q = a("knockback");
   public static final alb<dbk> r = a("fire_aspect");
   public static final alb<dbk> s = a("looting");
   public static final alb<dbk> t = a("sweeping_edge");
   public static final alb<dbk> u = a("efficiency");
   public static final alb<dbk> v = a("silk_touch");
   public static final alb<dbk> w = a("unbreaking");
   public static final alb<dbk> x = a("fortune");
   public static final alb<dbk> y = a("power");
   public static final alb<dbk> z = a("punch");
   public static final alb<dbk> A = a("flame");
   public static final alb<dbk> B = a("infinity");
   public static final alb<dbk> C = a("luck_of_the_sea");
   public static final alb<dbk> D = a("lure");
   public static final alb<dbk> E = a("loyalty");
   public static final alb<dbk> F = a("impaling");
   public static final alb<dbk> G = a("riptide");
   public static final alb<dbk> H = a("channeling");
   public static final alb<dbk> I = a("multishot");
   public static final alb<dbk> J = a("quick_charge");
   public static final alb<dbk> K = a("piercing");
   public static final alb<dbk> L = a("density");
   public static final alb<dbk> M = a("breach");
   public static final alb<dbk> N = a("wind_burst");
   public static final alb<dbk> O = a("mending");
   public static final alb<dbk> P = a("vanishing_curse");

   public static void a(qt<dbk> $$0) {
      jo<bsi> $$1 = $$0.a(lv.s);
      jo<dbk> $$2 = $$0.a(lv.aM);
      jo<cvk> $$3 = $$0.a(lv.K);
      jo<dhj> $$4 = $$0.a(lv.f);
      jo<btv<?>> $$5 = $$0.a(lv.z);
      a(
         $$0,
         a,
         dbk.a(dbk.a($$3.b(axc.bJ), 10, 4, dbk.a(1, 11), dbk.a(12, 11), 1, btx.i))
            .a($$2.b(aww.b))
            .a(dbl.c, new dbu(dbr.b(1.0F)), ewl.a(bk.a.a().a(ed.b(awv.d))))
      );
      a(
         $$0,
         b,
         dbk.a(dbk.a($$3.b(axc.bJ), 5, 4, dbk.a(10, 8), dbk.a(18, 8), 2, btx.i))
            .a($$2.b(aww.b))
            .a(dbl.c, new dbu(dbr.b(2.0F)), ewf.a(ewl.a(bk.a.a().a(ed.a(awv.i)).a(ed.b(awv.d)))))
            .a(dbl.l, new dca(alc.b("enchantment.fire_protection"), bvr.h, dbr.b(-0.15F), bvp.a.b))
      );
      a(
         $$0,
         c,
         dbk.a(dbk.a($$3.b(axc.bF), 5, 4, dbk.a(5, 6), dbk.a(11, 6), 2, btx.i)).a(dbl.c, new dbu(dbr.b(3.0F)), ewl.a(bk.a.a().a(ed.a(awv.m)).a(ed.b(awv.d))))
      );
      a(
         $$0,
         d,
         dbk.a(dbk.a($$3.b(axc.bJ), 2, 4, dbk.a(5, 8), dbk.a(13, 8), 4, btx.i))
            .a($$2.b(aww.b))
            .a(dbl.c, new dbu(dbr.b(2.0F)), ewl.a(bk.a.a().a(ed.a(awv.l)).a(ed.b(awv.d))))
            .a(dbl.l, new dca(alc.b("enchantment.blast_protection"), bvr.i, dbr.b(0.15F), bvp.a.a))
      );
      a(
         $$0,
         e,
         dbk.a(dbk.a($$3.b(axc.bJ), 5, 4, dbk.a(3, 6), dbk.a(9, 6), 2, btx.i))
            .a($$2.b(aww.b))
            .a(dbl.c, new dbu(dbr.b(2.0F)), ewl.a(bk.a.a().a(ed.a(awv.j)).a(ed.b(awv.d))))
      );
      a(
         $$0,
         f,
         dbk.a(dbk.a($$3.b(axc.bI), 2, 3, dbk.a(10, 10), dbk.a(40, 10), 4, btx.h))
            .a(dbl.l, new dca(alc.b("enchantment.respiration"), bvr.w, dbr.b(1.0F), bvp.a.a))
      );
      a(
         $$0,
         g,
         dbk.a(dbk.a($$3.b(axc.bI), 2, 1, dbk.a(1), dbk.a(41), 4, btx.h)).a(dbl.l, new dca(alc.b("enchantment.aqua_affinity"), bvr.C, dbr.b(4.0F), bvp.a.c))
      );
      a(
         $$0,
         h,
         dbk.a(dbk.a($$3.b(axc.bJ), $$3.b(axc.bH), 1, 3, dbk.a(10, 20), dbk.a(60, 20), 8, btx.a))
            .a(dbl.i, dbo.c, dbo.a, dbv.a(new dbx(dbr.a(1.0F), dbr.a(5.0F), $$1.b(bsj.P)), new dbz(dbr.a(2.0F))), ewx.a(exm.a(dbr.b(0.15F))))
      );
      a(
         $$0,
         i,
         dbk.a(dbk.a($$3.b(axc.bF), 2, 3, dbk.a(10, 10), dbk.a(25, 10), 4, btx.e))
            .a($$2.b(aww.c))
            .a(dbl.l, new dca(alc.b("enchantment.depth_strider"), bvr.F, dbr.b(0.33333334F), bvp.a.a))
      );
      a(
         $$0,
         j,
         dbk.a(dbk.a($$3.b(axc.bF), 2, 2, dbk.a(10, 10), dbk.a(25, 10), 4, btx.e))
            .a($$2.b(aww.c))
            .a(dbl.d, dby.a, ewl.a(bk.a.a().a(ed.a(awv.E)).a(ed.b(awv.d))))
            .a(
               dbl.n,
               new dck(
                  new dbr.a(dbr.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dbr.a(1.0F),
                  new ki(0, -1, 0),
                  Optional.of(ebr.a(ebr.a(new ki(0, 1, 0), awt.cB), ebr.a(dhl.G), ebr.a(eqq.c), ebr.f())),
                  ehv.a(dhl.kI),
                  Optional.of(dzl.i)
               ),
               ewv.a(eth.b.a, bv.a.a().a(bt.a.a().a(true)))
            )
      );
      a($$0, k, dbk.a(dbk.a($$3.b(axc.bU), 1, 1, dbk.a(25), dbk.a(50), 8, btx.i)).a(dbl.E));
      bv.a $$6 = bv.a.a().a(5).a(bt.a.a().f(false).a(true)).a(dj.b(dh.c.b(1.0E-5F))).c(df.a.a().a(aw.a.a().a($$4, awt.aO)));
      a(
         $$0,
         l,
         dbk.a(dbk.a($$3.b(axc.bF), 1, 3, dbk.a(10, 10), dbk.a(25, 10), 8, btx.e))
            .a(
               dbl.n,
               new dca(alc.b("enchantment.soul_speed"), bvr.v, dbr.a(0.0405F, 0.0105F), bvp.a.a),
               ewf.a(
                  ewp.a(ewv.a(eth.b.a, bv.a.a().a(bv.a.a()))),
                  ewg.a(
                     ewf.a(
                        ewm.c(),
                        ewv.a(eth.b.a, bv.a.a().a(bt.a.a().f(false))),
                        ewg.a(ewv.a(eth.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, awt.aO)))), ewv.a(eth.b.a, bv.a.a().a(bt.a.a().a(false)).b()))
                     ),
                     ewf.a(ewm.d(), ewv.a(eth.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, awt.aO))).a(bt.a.a().f(false))))
                  )
               )
            )
            .a(dbl.n, new dca(alc.b("enchantment.soul_speed"), bvr.u, dbr.a(1.0F), bvp.a.a), ewv.a(eth.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, awt.aO)))))
            .a(
               dbl.n,
               new dbz(dbr.a(1.0F)),
               ewf.a(ewx.a(exm.a(dbr.a(0.04F))), ewv.a(eth.b.a, bv.a.a().a(bt.a.a().a(true)).c(df.a.a().a(aw.a.a().a($$4, awt.aO)))))
            )
            .a(dbl.o, new dco(ln.M, dco.b(), dco.a(0.1F), dco.b(-0.2F), dco.a(bqq.a(0.1F)), bqq.a(1.0F)), ewv.a(eth.b.a, $$6))
            .a(dbl.o, new dch(awe.xR, bqq.a(0.6F), bqz.b(0.6F, 1.0F)), ewf.a(ewx.a(0.35F), ewv.a(eth.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dbk.a(dbk.a($$3.b(axc.bG), 1, 3, dbk.a(25, 25), dbk.a(75, 25), 8, btx.f))
            .a(dbl.l, new dca(alc.b("enchantment.swift_sneak"), bvr.z, dbr.b(0.15F), bvp.a.a))
      );
      a($$0, n, dbk.a(dbk.a($$3.b(axc.bM), $$3.b(axc.bK), 10, 5, dbk.a(1, 11), dbk.a(21, 11), 1, btx.b)).a($$2.b(aww.f)).a(dbl.e, new dbu(dbr.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dbk.a(dbk.a($$3.b(axc.bN), $$3.b(axc.bK), 5, 5, dbk.a(5, 8), dbk.a(25, 8), 2, btx.b))
            .a($$2.b(aww.f))
            .a(dbl.e, new dbu(dbr.b(2.5F)), ewv.a(eth.b.a, bv.a.a().a(by.a($$5, awx.D))))
      );
      a(
         $$0,
         p,
         dbk.a(dbk.a($$3.b(axc.bN), $$3.b(axc.bK), 5, 5, dbk.a(5, 8), dbk.a(25, 8), 2, btx.b))
            .a($$2.b(aww.f))
            .a(dbl.e, new dbu(dbr.b(2.5F)), ewv.a(eth.b.a, bv.a.a().a(by.a($$5, awx.C))))
            .a(
               dbl.i,
               dbo.a,
               dbo.c,
               new dbw(jr.a(bsx.b), dbr.a(1.5F), dbr.a(1.5F, 0.5F), dbr.a(3.0F), dbr.a(3.0F)),
               ewv.a(eth.b.a, bv.a.a().a(by.a($$5, awx.C))).and(ewl.a(bk.a.a().a(true)))
            )
      );
      a($$0, q, dbk.a(dbk.a($$3.b(axc.bK), 5, 2, dbk.a(5, 20), dbk.a(55, 20), 2, btx.b)).a(dbl.g, new dbu(dbr.b(1.0F))));
      a(
         $$0,
         r,
         dbk.a(dbk.a($$3.b(axc.bL), $$3.b(axc.bK), 2, 2, dbk.a(10, 20), dbk.a(60, 20), 4, btx.b))
            .a(dbl.i, dbo.a, dbo.c, new dcf(dbr.b(4.0F)), ewl.a(bk.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dbk.a(dbk.a($$3.b(axc.bK), 2, 3, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b))
            .a(dbl.m, dbo.a, dbo.c, new dbu(dbr.b(0.01F)), ewv.a(eth.b.b, bv.a.a().a(by.a($$5, btv.by))))
      );
      a(
         $$0,
         t,
         dbk.a(dbk.a($$3.b(axc.bK), 2, 3, dbk.a(5, 9), dbk.a(20, 9), 4, btx.b))
            .a(dbl.l, new dca(alc.b("enchantment.sweeping_edge"), bvr.D, new dbr.c(dbr.b(1.0F), dbr.a(2.0F, 1.0F)), bvp.a.a))
      );
      a(
         $$0,
         u,
         dbk.a(dbk.a($$3.b(axc.bO), 10, 5, dbk.a(1, 10), dbk.a(51, 10), 1, btx.b))
            .a(dbl.l, new dca(alc.b("enchantment.efficiency"), bvr.t, new dbr.d(1.0F), bvp.a.a))
      );
      a($$0, v, dbk.a(dbk.a($$3.b(axc.bP), 1, 1, dbk.a(15), dbk.a(65), 8, btx.b)).a($$2.b(aww.g)).a(dbl.x, new dcn(dbr.a(0.0F))));
      a(
         $$0,
         w,
         dbk.a(dbk.a($$3.b(axc.bS), 5, 3, dbk.a(5, 8), dbk.a(55, 8), 2, btx.a))
            .a(dbl.k, new dci(new dbr.c(dbr.b(2.0F), dbr.a(10.0F, 5.0F))), ewz.a(cs.a.a().a($$3, axc.bJ)))
            .a(dbl.k, new dci(new dbr.c(dbr.b(1.0F), dbr.a(2.0F, 1.0F))), ewp.a(ewz.a(cs.a.a().a($$3, axc.bJ))))
      );
      a($$0, x, dbk.a(dbk.a($$3.b(axc.bP), 2, 3, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b)).a($$2.b(aww.g)));
      a(
         $$0,
         y,
         dbk.a(dbk.a($$3.b(axc.bT), 10, 5, dbk.a(1, 10), dbk.a(16, 10), 1, btx.b)).a(dbl.e, new dbu(dbr.b(0.5F)), ewv.a(eth.b.c, bv.a.a().a($$5, awx.f).b()))
      );
      a(
         $$0,
         z,
         dbk.a(dbk.a($$3.b(axc.bT), 2, 2, dbk.a(12, 20), dbk.a(37, 20), 4, btx.b)).a(dbl.g, new dbu(dbr.b(1.0F)), ewv.a(eth.b.c, bv.a.a().a($$5, awx.f).b()))
      );
      a($$0, A, dbk.a(dbk.a($$3.b(axc.bT), 2, 1, dbk.a(20), dbk.a(50), 4, btx.b)).a(dbl.r, new dcf(dbr.a(100.0F))));
      a(
         $$0,
         B,
         dbk.a(dbk.a($$3.b(axc.bT), 1, 1, dbk.a(20), dbk.a(50), 8, btx.b)).a($$2.b(aww.d)).a(dbl.p, new dcn(dbr.a(0.0F)), ewz.a(cs.a.a().a($$3, cvt.ox)))
      );
      a($$0, C, dbk.a(dbk.a($$3.b(axc.bQ), 2, 3, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b)).a(dbl.w, new dbu(dbr.b(1.0F))));
      a($$0, D, dbk.a(dbk.a($$3.b(axc.bQ), 2, 3, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b)).a(dbl.v, new dbu(dbr.b(5.0F))));
      a($$0, E, dbk.a(dbk.a($$3.b(axc.bR), 5, 3, dbk.a(12, 7), dbk.a(50), 2, btx.b)).a(dbl.u, new dbu(dbr.b(1.0F))));
      a(
         $$0,
         F,
         dbk.a(dbk.a($$3.b(axc.bR), 2, 5, dbk.a(1, 8), dbk.a(21, 8), 4, btx.b))
            .a($$2.b(aww.f))
            .a(dbl.e, new dbu(dbr.b(2.5F)), ewv.a(eth.b.a, bv.a.a().a(by.a($$5, awx.B)).b()))
      );
      a(
         $$0,
         G,
         dbk.a(dbk.a($$3.b(axc.bR), 2, 3, dbk.a(17, 7), dbk.a(50), 4, btx.d))
            .a($$2.b(aww.h))
            .b(dbl.F, new dbu(dbr.a(1.5F, 0.75F)))
            .b(dbl.C, List.of(awe.zJ, awe.zK, awe.zL))
      );
      a(
         $$0,
         H,
         dbk.a(dbk.a($$3.b(axc.bR), 1, 1, dbk.a(25), dbk.a(50), 8, btx.b))
            .a(
               dbl.i,
               dbo.a,
               dbo.c,
               dbv.a(new dcp(jr.a(btv.am.r()), false), new dch(awe.zN, bqq.a(5.0F), bqq.a(1.0F))),
               ewf.a(exc.c().b(true), ewv.a(eth.b.a, bv.a.a().a(df.a.a().b(true))), ewv.a(eth.b.c, bv.a.a().a($$5, btv.bf)))
            )
            .a(
               dbl.j,
               dbv.a(new dcp(jr.a(btv.am.r()), false), new dch(awe.zN, bqq.a(5.0F), bqq.a(1.0F))),
               ewf.a(exc.c().b(true), ewv.a(eth.b.a, bv.a.a().a($$5, btv.bf)), ewq.a(df.a.a().b(true)), ewr.a(dhl.ss))
            )
      );
      a(
         $$0,
         I,
         dbk.a(dbk.a($$3.b(axc.bV), 2, 1, dbk.a(20), dbk.a(50), 4, btx.b)).a($$2.b(aww.e)).a(dbl.t, new dbu(dbr.b(2.0F))).a(dbl.s, new dbu(dbr.b(10.0F)))
      );
      a(
         $$0,
         J,
         dbk.a(dbk.a($$3.b(axc.bV), 5, 3, dbk.a(12, 20), dbk.a(50), 2, btx.b, btx.c))
            .b(dbl.A, new dbu(dbr.b(-0.25F)))
            .b(
               dbl.B,
               List.of(
                  new cud.a(Optional.of(awe.gs), Optional.empty(), Optional.of(awe.gp)),
                  new cud.a(Optional.of(awe.gt), Optional.empty(), Optional.of(awe.gp)),
                  new cud.a(Optional.of(awe.gu), Optional.empty(), Optional.of(awe.gp))
               )
            )
      );
      a($$0, K, dbk.a(dbk.a($$3.b(axc.bV), 10, 4, dbk.a(1, 10), dbk.a(50), 1, btx.b)).a($$2.b(aww.e)).a(dbl.q, new dbu(dbr.b(1.0F))));
      a($$0, L, dbk.a(dbk.a($$3.b(axc.bX), 5, 5, dbk.a(5, 8), dbk.a(25, 8), 2, btx.b)).a($$2.b(aww.f)).a(dbl.f, new dbu(dbr.b(0.5F))));
      a($$0, M, dbk.a(dbk.a($$3.b(axc.bX), 2, 4, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b)).a($$2.b(aww.f)).a(dbl.h, new dbu(dbr.b(-0.15F))));
      a(
         $$0,
         N,
         dbk.a(dbk.a($$3.b(axc.bX), 2, 3, dbk.a(15, 9), dbk.a(65, 9), 4, btx.b))
            .a(
               dbl.i,
               dbo.a,
               dbo.a,
               new dce(
                  false,
                  Optional.empty(),
                  Optional.of(dbr.a(List.of(1.2F, 1.75F, 2.2F), dbr.a(1.5F, 0.35F))),
                  $$4.a(awt.cz).map(Function.identity()),
                  eys.c,
                  dbr.a(3.5F),
                  false,
                  deg.a.e,
                  ln.A,
                  ln.z,
                  awe.Cw
               ),
               ewv.a(eth.b.c, bv.a.a().a(bt.a.a().f(false)).a(dj.d(dh.c.b(1.5))))
            )
      );
      a($$0, O, dbk.a(dbk.a($$3.b(axc.bS), 2, 1, dbk.a(25, 25), dbk.a(75, 25), 4, btx.a)).a(dbl.z, new dcg(dbr.a(2.0F))));
      a($$0, P, dbk.a(dbk.a($$3.b(axc.bW), 1, 1, dbk.a(25), dbk.a(50), 8, btx.a)).a(dbl.D));
   }

   private static void a(qt<dbk> $$0, alb<dbk> $$1, dbk.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alb<dbk> a(String $$0) {
      return alb.a(lv.aM, alc.b($$0));
   }
}
