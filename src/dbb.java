import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dbb {
   public static final ala<daw> a = a("protection");
   public static final ala<daw> b = a("fire_protection");
   public static final ala<daw> c = a("feather_falling");
   public static final ala<daw> d = a("blast_protection");
   public static final ala<daw> e = a("projectile_protection");
   public static final ala<daw> f = a("respiration");
   public static final ala<daw> g = a("aqua_affinity");
   public static final ala<daw> h = a("thorns");
   public static final ala<daw> i = a("depth_strider");
   public static final ala<daw> j = a("frost_walker");
   public static final ala<daw> k = a("binding_curse");
   public static final ala<daw> l = a("soul_speed");
   public static final ala<daw> m = a("swift_sneak");
   public static final ala<daw> n = a("sharpness");
   public static final ala<daw> o = a("smite");
   public static final ala<daw> p = a("bane_of_arthropods");
   public static final ala<daw> q = a("knockback");
   public static final ala<daw> r = a("fire_aspect");
   public static final ala<daw> s = a("looting");
   public static final ala<daw> t = a("sweeping_edge");
   public static final ala<daw> u = a("efficiency");
   public static final ala<daw> v = a("silk_touch");
   public static final ala<daw> w = a("unbreaking");
   public static final ala<daw> x = a("fortune");
   public static final ala<daw> y = a("power");
   public static final ala<daw> z = a("punch");
   public static final ala<daw> A = a("flame");
   public static final ala<daw> B = a("infinity");
   public static final ala<daw> C = a("luck_of_the_sea");
   public static final ala<daw> D = a("lure");
   public static final ala<daw> E = a("loyalty");
   public static final ala<daw> F = a("impaling");
   public static final ala<daw> G = a("riptide");
   public static final ala<daw> H = a("channeling");
   public static final ala<daw> I = a("multishot");
   public static final ala<daw> J = a("quick_charge");
   public static final ala<daw> K = a("piercing");
   public static final ala<daw> L = a("density");
   public static final ala<daw> M = a("breach");
   public static final ala<daw> N = a("wind_burst");
   public static final ala<daw> O = a("mending");
   public static final ala<daw> P = a("vanishing_curse");

   public static void a(qt<daw> $$0) {
      jo<bsd> $$1 = $$0.a(lv.s);
      jo<daw> $$2 = $$0.a(lv.aL);
      jo<cvg> $$3 = $$0.a(lv.K);
      jo<dgv> $$4 = $$0.a(lv.f);
      jo<btq<?>> $$5 = $$0.a(lv.z);
      a(
         $$0,
         a,
         daw.a(daw.a($$3.b(axb.bJ), 10, 4, daw.a(1, 11), daw.a(12, 11), 1, bts.i))
            .a($$2.b(awv.b))
            .a(dax.c, new dbg(dbd.b(1.0F)), evx.a(bk.a.a().a(ed.b(awu.d))))
      );
      a(
         $$0,
         b,
         daw.a(daw.a($$3.b(axb.bJ), 5, 4, daw.a(10, 8), daw.a(18, 8), 2, bts.i))
            .a($$2.b(awv.b))
            .a(dax.c, new dbg(dbd.b(2.0F)), evr.a(evx.a(bk.a.a().a(ed.a(awu.i)).a(ed.b(awu.d)))))
            .a(dax.l, new dbm(alb.b("enchantment.fire_protection"), bvm.h, dbd.b(-0.15F), bvk.a.b))
      );
      a(
         $$0,
         c,
         daw.a(daw.a($$3.b(axb.bF), 5, 4, daw.a(5, 6), daw.a(11, 6), 2, bts.i)).a(dax.c, new dbg(dbd.b(3.0F)), evx.a(bk.a.a().a(ed.a(awu.m)).a(ed.b(awu.d))))
      );
      a(
         $$0,
         d,
         daw.a(daw.a($$3.b(axb.bJ), 2, 4, daw.a(5, 8), daw.a(13, 8), 4, bts.i))
            .a($$2.b(awv.b))
            .a(dax.c, new dbg(dbd.b(2.0F)), evx.a(bk.a.a().a(ed.a(awu.l)).a(ed.b(awu.d))))
            .a(dax.l, new dbm(alb.b("enchantment.blast_protection"), bvm.i, dbd.b(0.15F), bvk.a.a))
      );
      a(
         $$0,
         e,
         daw.a(daw.a($$3.b(axb.bJ), 5, 4, daw.a(3, 6), daw.a(9, 6), 2, bts.i))
            .a($$2.b(awv.b))
            .a(dax.c, new dbg(dbd.b(2.0F)), evx.a(bk.a.a().a(ed.a(awu.j)).a(ed.b(awu.d))))
      );
      a(
         $$0,
         f,
         daw.a(daw.a($$3.b(axb.bI), 2, 3, daw.a(10, 10), daw.a(40, 10), 4, bts.h))
            .a(dax.l, new dbm(alb.b("enchantment.respiration"), bvm.w, dbd.b(1.0F), bvk.a.a))
      );
      a(
         $$0,
         g,
         daw.a(daw.a($$3.b(axb.bI), 2, 1, daw.a(1), daw.a(41), 4, bts.h)).a(dax.l, new dbm(alb.b("enchantment.aqua_affinity"), bvm.C, dbd.b(4.0F), bvk.a.c))
      );
      a(
         $$0,
         h,
         daw.a(daw.a($$3.b(axb.bJ), $$3.b(axb.bH), 1, 3, daw.a(10, 20), daw.a(60, 20), 8, bts.a))
            .a(dax.i, dba.c, dba.a, dbh.a(new dbj(dbd.a(1.0F), dbd.a(5.0F), $$1.b(bse.P)), new dbl(dbd.a(2.0F))), ewj.a(ewy.a(dbd.b(0.15F))))
      );
      a(
         $$0,
         i,
         daw.a(daw.a($$3.b(axb.bF), 2, 3, daw.a(10, 10), daw.a(25, 10), 4, bts.e))
            .a($$2.b(awv.c))
            .a(dax.l, new dbm(alb.b("enchantment.depth_strider"), bvm.F, dbd.b(0.33333334F), bvk.a.a))
      );
      a(
         $$0,
         j,
         daw.a(daw.a($$3.b(axb.bF), 2, 2, daw.a(10, 10), daw.a(25, 10), 4, bts.e))
            .a($$2.b(awv.c))
            .a(dax.d, dbk.a, evx.a(bk.a.a().a(ed.a(awu.E)).a(ed.b(awu.d))))
            .a(
               dax.n,
               new dbw(
                  new dbd.a(dbd.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dbd.a(1.0F),
                  new ki(0, -1, 0),
                  Optional.of(ebd.a(ebd.a(new ki(0, 1, 0), aws.cB), ebd.a(dgx.G), ebd.a(eqc.c), ebd.f())),
                  ehh.a(dgx.kI),
                  Optional.of(dyx.i)
               ),
               ewh.a(est.b.a, bv.a.a().a(bt.a.a().a(true)))
            )
      );
      a($$0, k, daw.a(daw.a($$3.b(axb.bU), 1, 1, daw.a(25), daw.a(50), 8, bts.i)).a(dax.E));
      bv.a $$6 = bv.a.a().a(5).a(bt.a.a().f(false).a(true)).a(dj.b(dh.c.b(1.0E-5F))).c(df.a.a().a(aw.a.a().a($$4, aws.aO)));
      a(
         $$0,
         l,
         daw.a(daw.a($$3.b(axb.bF), 1, 3, daw.a(10, 10), daw.a(25, 10), 8, bts.e))
            .a(
               dax.n,
               new dbm(alb.b("enchantment.soul_speed"), bvm.v, dbd.a(0.0405F, 0.0105F), bvk.a.a),
               evr.a(
                  ewb.a(ewh.a(est.b.a, bv.a.a().a(bv.a.a()))),
                  evs.a(
                     evr.a(
                        evy.c(),
                        ewh.a(est.b.a, bv.a.a().a(bt.a.a().f(false))),
                        evs.a(ewh.a(est.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, aws.aO)))), ewh.a(est.b.a, bv.a.a().a(bt.a.a().a(false)).b()))
                     ),
                     evr.a(evy.d(), ewh.a(est.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, aws.aO))).a(bt.a.a().f(false))))
                  )
               )
            )
            .a(dax.n, new dbm(alb.b("enchantment.soul_speed"), bvm.u, dbd.a(1.0F), bvk.a.a), ewh.a(est.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a($$4, aws.aO)))))
            .a(
               dax.n,
               new dbl(dbd.a(1.0F)),
               evr.a(ewj.a(ewy.a(dbd.a(0.04F))), ewh.a(est.b.a, bv.a.a().a(bt.a.a().a(true)).c(df.a.a().a(aw.a.a().a($$4, aws.aO)))))
            )
            .a(dax.o, new dca(ln.M, dca.b(), dca.a(0.1F), dca.b(-0.2F), dca.a(bql.a(0.1F)), bql.a(1.0F)), ewh.a(est.b.a, $$6))
            .a(dax.o, new dbt(awd.xR, bql.a(0.6F), bqu.b(0.6F, 1.0F)), evr.a(ewj.a(0.35F), ewh.a(est.b.a, $$6)))
      );
      a(
         $$0,
         m,
         daw.a(daw.a($$3.b(axb.bG), 1, 3, daw.a(25, 25), daw.a(75, 25), 8, bts.f))
            .a(dax.l, new dbm(alb.b("enchantment.swift_sneak"), bvm.z, dbd.b(0.15F), bvk.a.a))
      );
      a($$0, n, daw.a(daw.a($$3.b(axb.bM), $$3.b(axb.bK), 10, 5, daw.a(1, 11), daw.a(21, 11), 1, bts.b)).a($$2.b(awv.f)).a(dax.e, new dbg(dbd.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         daw.a(daw.a($$3.b(axb.bN), $$3.b(axb.bK), 5, 5, daw.a(5, 8), daw.a(25, 8), 2, bts.b))
            .a($$2.b(awv.f))
            .a(dax.e, new dbg(dbd.b(2.5F)), ewh.a(est.b.a, bv.a.a().a(by.a($$5, aww.D))))
      );
      a(
         $$0,
         p,
         daw.a(daw.a($$3.b(axb.bN), $$3.b(axb.bK), 5, 5, daw.a(5, 8), daw.a(25, 8), 2, bts.b))
            .a($$2.b(awv.f))
            .a(dax.e, new dbg(dbd.b(2.5F)), ewh.a(est.b.a, bv.a.a().a(by.a($$5, aww.C))))
            .a(
               dax.i,
               dba.a,
               dba.c,
               new dbi(jr.a(bss.b), dbd.a(1.5F), dbd.a(1.5F, 0.5F), dbd.a(3.0F), dbd.a(3.0F)),
               ewh.a(est.b.a, bv.a.a().a(by.a($$5, aww.C))).and(evx.a(bk.a.a().a(true)))
            )
      );
      a($$0, q, daw.a(daw.a($$3.b(axb.bK), 5, 2, daw.a(5, 20), daw.a(55, 20), 2, bts.b)).a(dax.g, new dbg(dbd.b(1.0F))));
      a(
         $$0,
         r,
         daw.a(daw.a($$3.b(axb.bL), $$3.b(axb.bK), 2, 2, daw.a(10, 20), daw.a(60, 20), 4, bts.b))
            .a(dax.i, dba.a, dba.c, new dbr(dbd.b(4.0F)), evx.a(bk.a.a().a(true)))
      );
      a(
         $$0,
         s,
         daw.a(daw.a($$3.b(axb.bK), 2, 3, daw.a(15, 9), daw.a(65, 9), 4, bts.b))
            .a(dax.m, dba.a, dba.c, new dbg(dbd.b(0.01F)), ewh.a(est.b.b, bv.a.a().a(by.a($$5, btq.by))))
      );
      a(
         $$0,
         t,
         daw.a(daw.a($$3.b(axb.bK), 2, 3, daw.a(5, 9), daw.a(20, 9), 4, bts.b))
            .a(dax.l, new dbm(alb.b("enchantment.sweeping_edge"), bvm.D, new dbd.c(dbd.b(1.0F), dbd.a(2.0F, 1.0F)), bvk.a.a))
      );
      a(
         $$0,
         u,
         daw.a(daw.a($$3.b(axb.bO), 10, 5, daw.a(1, 10), daw.a(51, 10), 1, bts.b))
            .a(dax.l, new dbm(alb.b("enchantment.efficiency"), bvm.t, new dbd.d(1.0F), bvk.a.a))
      );
      a($$0, v, daw.a(daw.a($$3.b(axb.bP), 1, 1, daw.a(15), daw.a(65), 8, bts.b)).a($$2.b(awv.g)).a(dax.x, new dbz(dbd.a(0.0F))));
      a(
         $$0,
         w,
         daw.a(daw.a($$3.b(axb.bS), 5, 3, daw.a(5, 8), daw.a(55, 8), 2, bts.a))
            .a(dax.k, new dbu(new dbd.c(dbd.b(2.0F), dbd.a(10.0F, 5.0F))), ewl.a(cs.a.a().a($$3, axb.bJ)))
            .a(dax.k, new dbu(new dbd.c(dbd.b(1.0F), dbd.a(2.0F, 1.0F))), ewb.a(ewl.a(cs.a.a().a($$3, axb.bJ))))
      );
      a($$0, x, daw.a(daw.a($$3.b(axb.bP), 2, 3, daw.a(15, 9), daw.a(65, 9), 4, bts.b)).a($$2.b(awv.g)));
      a(
         $$0,
         y,
         daw.a(daw.a($$3.b(axb.bT), 10, 5, daw.a(1, 10), daw.a(16, 10), 1, bts.b)).a(dax.e, new dbg(dbd.b(0.5F)), ewh.a(est.b.c, bv.a.a().a($$5, aww.f).b()))
      );
      a(
         $$0,
         z,
         daw.a(daw.a($$3.b(axb.bT), 2, 2, daw.a(12, 20), daw.a(37, 20), 4, bts.b)).a(dax.g, new dbg(dbd.b(1.0F)), ewh.a(est.b.c, bv.a.a().a($$5, aww.f).b()))
      );
      a($$0, A, daw.a(daw.a($$3.b(axb.bT), 2, 1, daw.a(20), daw.a(50), 4, bts.b)).a(dax.r, new dbr(dbd.a(100.0F))));
      a(
         $$0,
         B,
         daw.a(daw.a($$3.b(axb.bT), 1, 1, daw.a(20), daw.a(50), 8, bts.b)).a($$2.b(awv.d)).a(dax.p, new dbz(dbd.a(0.0F)), ewl.a(cs.a.a().a($$3, cvo.ox)))
      );
      a($$0, C, daw.a(daw.a($$3.b(axb.bQ), 2, 3, daw.a(15, 9), daw.a(65, 9), 4, bts.b)).a(dax.w, new dbg(dbd.b(1.0F))));
      a($$0, D, daw.a(daw.a($$3.b(axb.bQ), 2, 3, daw.a(15, 9), daw.a(65, 9), 4, bts.b)).a(dax.v, new dbg(dbd.b(5.0F))));
      a($$0, E, daw.a(daw.a($$3.b(axb.bR), 5, 3, daw.a(12, 7), daw.a(50), 2, bts.b)).a(dax.u, new dbg(dbd.b(1.0F))));
      a(
         $$0,
         F,
         daw.a(daw.a($$3.b(axb.bR), 2, 5, daw.a(1, 8), daw.a(21, 8), 4, bts.b))
            .a($$2.b(awv.f))
            .a(dax.e, new dbg(dbd.b(2.5F)), ewh.a(est.b.a, bv.a.a().a(by.a($$5, aww.B)).b()))
      );
      a(
         $$0,
         G,
         daw.a(daw.a($$3.b(axb.bR), 2, 3, daw.a(17, 7), daw.a(50), 4, bts.d))
            .a($$2.b(awv.h))
            .b(dax.F, new dbg(dbd.a(1.5F, 0.75F)))
            .b(dax.C, List.of(awd.zJ, awd.zK, awd.zL))
      );
      a(
         $$0,
         H,
         daw.a(daw.a($$3.b(axb.bR), 1, 1, daw.a(25), daw.a(50), 8, bts.b))
            .a(
               dax.i,
               dba.a,
               dba.c,
               dbh.a(new dcb(jr.a(btq.am.r()), false), new dbt(awd.zN, bql.a(5.0F), bql.a(1.0F))),
               evr.a(ewo.c().b(true), ewh.a(est.b.a, bv.a.a().a(df.a.a().b(true))), ewh.a(est.b.c, bv.a.a().a($$5, btq.bf)))
            )
            .a(
               dax.j,
               dbh.a(new dcb(jr.a(btq.am.r()), false), new dbt(awd.zN, bql.a(5.0F), bql.a(1.0F))),
               evr.a(ewo.c().b(true), ewh.a(est.b.a, bv.a.a().a($$5, btq.bf)), ewc.a(df.a.a().b(true)), ewd.a(dgx.ss))
            )
      );
      a(
         $$0,
         I,
         daw.a(daw.a($$3.b(axb.bV), 2, 1, daw.a(20), daw.a(50), 4, bts.b)).a($$2.b(awv.e)).a(dax.t, new dbg(dbd.b(2.0F))).a(dax.s, new dbg(dbd.b(10.0F)))
      );
      a(
         $$0,
         J,
         daw.a(daw.a($$3.b(axb.bV), 5, 3, daw.a(12, 20), daw.a(50), 2, bts.b, bts.c))
            .b(dax.A, new dbg(dbd.b(-0.25F)))
            .b(
               dax.B,
               List.of(
                  new cty.a(Optional.of(awd.gs), Optional.empty(), Optional.of(awd.gp)),
                  new cty.a(Optional.of(awd.gt), Optional.empty(), Optional.of(awd.gp)),
                  new cty.a(Optional.of(awd.gu), Optional.empty(), Optional.of(awd.gp))
               )
            )
      );
      a($$0, K, daw.a(daw.a($$3.b(axb.bV), 10, 4, daw.a(1, 10), daw.a(50), 1, bts.b)).a($$2.b(awv.e)).a(dax.q, new dbg(dbd.b(1.0F))));
      a($$0, L, daw.a(daw.a($$3.b(axb.bX), 5, 5, daw.a(5, 8), daw.a(25, 8), 2, bts.b)).a($$2.b(awv.f)).a(dax.f, new dbg(dbd.b(0.5F))));
      a($$0, M, daw.a(daw.a($$3.b(axb.bX), 2, 4, daw.a(15, 9), daw.a(65, 9), 4, bts.b)).a($$2.b(awv.f)).a(dax.h, new dbg(dbd.b(-0.15F))));
      a(
         $$0,
         N,
         daw.a(daw.a($$3.b(axb.bX), 2, 3, daw.a(15, 9), daw.a(65, 9), 4, bts.b))
            .a(
               dax.i,
               dba.a,
               dba.a,
               new dbq(
                  false,
                  Optional.empty(),
                  Optional.of(dbd.a(List.of(1.2F, 1.75F, 2.2F), dbd.a(1.5F, 0.35F))),
                  $$4.a(aws.cz).map(Function.identity()),
                  eye.c,
                  dbd.a(3.5F),
                  false,
                  dds.a.e,
                  ln.A,
                  ln.z,
                  awd.Cw
               ),
               ewh.a(est.b.c, bv.a.a().a(bt.a.a().f(false)).a(dj.d(dh.c.b(1.5))))
            )
      );
      a($$0, O, daw.a(daw.a($$3.b(axb.bS), 2, 1, daw.a(25, 25), daw.a(75, 25), 4, bts.a)).a(dax.z, new dbs(dbd.a(2.0F))));
      a($$0, P, daw.a(daw.a($$3.b(axb.bW), 1, 1, daw.a(25), daw.a(50), 8, bts.a)).a(dax.D));
   }

   private static void a(qt<daw> $$0, ala<daw> $$1, daw.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static ala<daw> a(String $$0) {
      return ala.a(lv.aL, alb.b($$0));
   }
}
