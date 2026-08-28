import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dcb {
   public static final alk<dbw> a = a("protection");
   public static final alk<dbw> b = a("fire_protection");
   public static final alk<dbw> c = a("feather_falling");
   public static final alk<dbw> d = a("blast_protection");
   public static final alk<dbw> e = a("projectile_protection");
   public static final alk<dbw> f = a("respiration");
   public static final alk<dbw> g = a("aqua_affinity");
   public static final alk<dbw> h = a("thorns");
   public static final alk<dbw> i = a("depth_strider");
   public static final alk<dbw> j = a("frost_walker");
   public static final alk<dbw> k = a("binding_curse");
   public static final alk<dbw> l = a("soul_speed");
   public static final alk<dbw> m = a("swift_sneak");
   public static final alk<dbw> n = a("sharpness");
   public static final alk<dbw> o = a("smite");
   public static final alk<dbw> p = a("bane_of_arthropods");
   public static final alk<dbw> q = a("knockback");
   public static final alk<dbw> r = a("fire_aspect");
   public static final alk<dbw> s = a("looting");
   public static final alk<dbw> t = a("sweeping_edge");
   public static final alk<dbw> u = a("efficiency");
   public static final alk<dbw> v = a("silk_touch");
   public static final alk<dbw> w = a("unbreaking");
   public static final alk<dbw> x = a("fortune");
   public static final alk<dbw> y = a("power");
   public static final alk<dbw> z = a("punch");
   public static final alk<dbw> A = a("flame");
   public static final alk<dbw> B = a("infinity");
   public static final alk<dbw> C = a("luck_of_the_sea");
   public static final alk<dbw> D = a("lure");
   public static final alk<dbw> E = a("loyalty");
   public static final alk<dbw> F = a("impaling");
   public static final alk<dbw> G = a("riptide");
   public static final alk<dbw> H = a("channeling");
   public static final alk<dbw> I = a("multishot");
   public static final alk<dbw> J = a("quick_charge");
   public static final alk<dbw> K = a("piercing");
   public static final alk<dbw> L = a("density");
   public static final alk<dbw> M = a("breach");
   public static final alk<dbw> N = a("wind_burst");
   public static final alk<dbw> O = a("mending");
   public static final alk<dbw> P = a("vanishing_curse");

   public static void a(rb<dbw> $$0) {
      jr<bta> $$1 = $$0.a(ma.s);
      jr<dbw> $$2 = $$0.a(ma.aM);
      jr<cwb> $$3 = $$0.a(ma.K);
      jr<dij> $$4 = $$0.a(ma.f);
      jr<bup<?>> $$5 = $$0.a(ma.z);
      a(
         $$0,
         a,
         dbw.a(dbw.a($$3.b(axm.bX), 10, 4, dbw.a(1, 11), dbw.a(12, 11), 1, bur.i))
            .a($$2.b(axg.b))
            .a(dbx.c, new dcg(dcd.b(1.0F)), exk.a(bl.a.a().a(eg.b(axf.d))))
      );
      a(
         $$0,
         b,
         dbw.a(dbw.a($$3.b(axm.bX), 5, 4, dbw.a(10, 8), dbw.a(18, 8), 2, bur.i))
            .a($$2.b(axg.b))
            .a(dbx.c, new dcg(dcd.b(2.0F)), exe.a(exk.a(bl.a.a().a(eg.a(axf.i)).a(eg.b(axf.d)))))
            .a(dbx.l, new dcm(all.b("enchantment.fire_protection"), bwm.h, dcd.b(-0.15F), bwk.a.b))
      );
      a(
         $$0,
         c,
         dbw.a(dbw.a($$3.b(axm.bT), 5, 4, dbw.a(5, 6), dbw.a(11, 6), 2, bur.i)).a(dbx.c, new dcg(dcd.b(3.0F)), exk.a(bl.a.a().a(eg.a(axf.m)).a(eg.b(axf.d))))
      );
      a(
         $$0,
         d,
         dbw.a(dbw.a($$3.b(axm.bX), 2, 4, dbw.a(5, 8), dbw.a(13, 8), 4, bur.i))
            .a($$2.b(axg.b))
            .a(dbx.c, new dcg(dcd.b(2.0F)), exk.a(bl.a.a().a(eg.a(axf.l)).a(eg.b(axf.d))))
            .a(dbx.l, new dcm(all.b("enchantment.blast_protection"), bwm.i, dcd.b(0.15F), bwk.a.a))
      );
      a(
         $$0,
         e,
         dbw.a(dbw.a($$3.b(axm.bX), 5, 4, dbw.a(3, 6), dbw.a(9, 6), 2, bur.i))
            .a($$2.b(axg.b))
            .a(dbx.c, new dcg(dcd.b(2.0F)), exk.a(bl.a.a().a(eg.a(axf.j)).a(eg.b(axf.d))))
      );
      a(
         $$0,
         f,
         dbw.a(dbw.a($$3.b(axm.bW), 2, 3, dbw.a(10, 10), dbw.a(40, 10), 4, bur.h))
            .a(dbx.l, new dcm(all.b("enchantment.respiration"), bwm.w, dcd.b(1.0F), bwk.a.a))
      );
      a(
         $$0,
         g,
         dbw.a(dbw.a($$3.b(axm.bW), 2, 1, dbw.a(1), dbw.a(41), 4, bur.h)).a(dbx.l, new dcm(all.b("enchantment.aqua_affinity"), bwm.C, dcd.b(4.0F), bwk.a.c))
      );
      a(
         $$0,
         h,
         dbw.a(dbw.a($$3.b(axm.bX), $$3.b(axm.bV), 1, 3, dbw.a(10, 20), dbw.a(60, 20), 8, bur.a))
            .a(dbx.i, dca.c, dca.a, dch.a(new dcj(dcd.a(1.0F), dcd.a(5.0F), $$1.b(btb.P)), new dcl(dcd.a(2.0F))), exw.a(eyl.a(dcd.b(0.15F))))
      );
      a(
         $$0,
         i,
         dbw.a(dbw.a($$3.b(axm.bT), 2, 3, dbw.a(10, 10), dbw.a(25, 10), 4, bur.e))
            .a($$2.b(axg.c))
            .a(dbx.l, new dcm(all.b("enchantment.depth_strider"), bwm.F, dcd.b(0.33333334F), bwk.a.a))
      );
      a(
         $$0,
         j,
         dbw.a(dbw.a($$3.b(axm.bT), 2, 2, dbw.a(10, 10), dbw.a(25, 10), 4, bur.e))
            .a($$2.b(axg.c))
            .a(dbx.d, dck.a, exk.a(bl.a.a().a(eg.a(axf.E)).a(eg.b(axf.d))))
            .a(
               dbx.n,
               new dcw(
                  new dcd.a(dcd.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dcd.a(1.0F),
                  new kl(0, -1, 0),
                  Optional.of(ecq.a(ecq.a(new kl(0, 1, 0), axd.cC), ecq.a(dil.G), ecq.a(erp.c), ecq.f())),
                  eiu.a(dil.kI),
                  Optional.of(eak.i)
               ),
               exu.a(eug.b.a, bw.a.a().a(bu.a.a().a(true)))
            )
      );
      a($$0, k, dbw.a(dbw.a($$3.b(axm.ci), 1, 1, dbw.a(25), dbw.a(50), 8, bur.i)).a(dbx.E));
      bw.a $$6 = bw.a.a().a(5).a(bu.a.a().f(false).a(true)).a(dl.b(dj.c.b(1.0E-5F))).c(dh.a.a().a(ax.a.a().a($$4, axd.aP)));
      exe.a $$7 = exe.a(
         exo.a(exu.a(eug.b.a, bw.a.a().a(bw.a.a()))),
         exf.a(
            exe.a(
               exl.c(),
               exu.a(eug.b.a, bw.a.a().a(bu.a.a().f(false))),
               exf.a(exu.a(eug.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axd.aP)))), exu.a(eug.b.a, bw.a.a().a(bu.a.a().a(false)).b()))
            ),
            exe.a(exl.d(), exu.a(eug.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axd.aP))).a(bu.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dbw.a(dbw.a($$3.b(axm.bT), 1, 3, dbw.a(10, 10), dbw.a(25, 10), 8, bur.e))
            .a(
               dbx.n,
               dch.a(
                  new dcm(all.b("enchantment.soul_speed"), bwm.v, dcd.a(0.0405F, 0.0105F), bwk.a.a),
                  new dcm(all.b("enchantment.soul_speed"), bwm.u, dcd.a(1.0F), bwk.a.a)
               ),
               $$7
            )
            .a(
               dbx.n,
               new dcl(dcd.a(1.0F)),
               exe.a(exw.a(eyl.a(dcd.a(0.04F))), exu.a(eug.b.a, bw.a.a().a(bu.a.a().a(true)).c(dh.a.a().a(ax.a.a().a($$4, axd.aP)))))
            )
            .a(dbx.o, new dda(ls.M, dda.b(), dda.a(0.1F), dda.b(-0.2F), dda.a(bri.a(0.1F)), bri.a(1.0F)), exu.a(eug.b.a, $$6))
            .a(dbx.o, new dct(awo.xP, bri.a(0.6F), brr.b(0.6F, 1.0F)), exe.a(exw.a(0.35F), exu.a(eug.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dbw.a(dbw.a($$3.b(axm.bU), 1, 3, dbw.a(25, 25), dbw.a(75, 25), 8, bur.f))
            .a(dbx.l, new dcm(all.b("enchantment.swift_sneak"), bwm.z, dcd.b(0.15F), bwk.a.a))
      );
      a($$0, n, dbw.a(dbw.a($$3.b(axm.ca), $$3.b(axm.bY), 10, 5, dbw.a(1, 11), dbw.a(21, 11), 1, bur.b)).a($$2.b(axg.f)).a(dbx.e, new dcg(dcd.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dbw.a(dbw.a($$3.b(axm.cb), $$3.b(axm.bY), 5, 5, dbw.a(5, 8), dbw.a(25, 8), 2, bur.b))
            .a($$2.b(axg.f))
            .a(dbx.e, new dcg(dcd.b(2.5F)), exu.a(eug.b.a, bw.a.a().a(bz.a($$5, axh.D))))
      );
      a(
         $$0,
         p,
         dbw.a(dbw.a($$3.b(axm.cb), $$3.b(axm.bY), 5, 5, dbw.a(5, 8), dbw.a(25, 8), 2, bur.b))
            .a($$2.b(axg.f))
            .a(dbx.e, new dcg(dcd.b(2.5F)), exu.a(eug.b.a, bw.a.a().a(bz.a($$5, axh.C))))
            .a(
               dbx.i,
               dca.a,
               dca.c,
               new dci(ju.a(btp.b), dcd.a(1.5F), dcd.a(1.5F, 0.5F), dcd.a(3.0F), dcd.a(3.0F)),
               exu.a(eug.b.a, bw.a.a().a(bz.a($$5, axh.C))).and(exk.a(bl.a.a().a(true)))
            )
      );
      a($$0, q, dbw.a(dbw.a($$3.b(axm.bY), 5, 2, dbw.a(5, 20), dbw.a(55, 20), 2, bur.b)).a(dbx.g, new dcg(dcd.b(1.0F))));
      a(
         $$0,
         r,
         dbw.a(dbw.a($$3.b(axm.bZ), $$3.b(axm.bY), 2, 2, dbw.a(10, 20), dbw.a(60, 20), 4, bur.b))
            .a(dbx.i, dca.a, dca.c, new dcr(dcd.b(4.0F)), exk.a(bl.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dbw.a(dbw.a($$3.b(axm.bY), 2, 3, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b))
            .a(dbx.m, dca.a, dca.c, new dcg(dcd.b(0.01F)), exu.a(eug.b.b, bw.a.a().a(bz.a($$5, bup.by))))
      );
      a(
         $$0,
         t,
         dbw.a(dbw.a($$3.b(axm.bY), 2, 3, dbw.a(5, 9), dbw.a(20, 9), 4, bur.b))
            .a(dbx.l, new dcm(all.b("enchantment.sweeping_edge"), bwm.D, new dcd.c(dcd.b(1.0F), dcd.a(2.0F, 1.0F)), bwk.a.a))
      );
      a(
         $$0,
         u,
         dbw.a(dbw.a($$3.b(axm.cc), 10, 5, dbw.a(1, 10), dbw.a(51, 10), 1, bur.b))
            .a(dbx.l, new dcm(all.b("enchantment.efficiency"), bwm.t, new dcd.d(1.0F), bwk.a.a))
      );
      a($$0, v, dbw.a(dbw.a($$3.b(axm.cd), 1, 1, dbw.a(15), dbw.a(65), 8, bur.b)).a($$2.b(axg.g)).a(dbx.x, new dcz(dcd.a(0.0F))));
      a(
         $$0,
         w,
         dbw.a(dbw.a($$3.b(axm.cg), 5, 3, dbw.a(5, 8), dbw.a(55, 8), 2, bur.a))
            .a(dbx.k, new dcu(new dcd.c(dcd.b(2.0F), dcd.a(10.0F, 5.0F))), exy.a(cu.a.a().a($$3, axm.bX)))
            .a(dbx.k, new dcu(new dcd.c(dcd.b(1.0F), dcd.a(2.0F, 1.0F))), exo.a(exy.a(cu.a.a().a($$3, axm.bX))))
      );
      a($$0, x, dbw.a(dbw.a($$3.b(axm.cd), 2, 3, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b)).a($$2.b(axg.g)));
      a(
         $$0,
         y,
         dbw.a(dbw.a($$3.b(axm.ch), 10, 5, dbw.a(1, 10), dbw.a(16, 10), 1, bur.b)).a(dbx.e, new dcg(dcd.b(0.5F)), exu.a(eug.b.c, bw.a.a().a($$5, axh.f).b()))
      );
      a(
         $$0,
         z,
         dbw.a(dbw.a($$3.b(axm.ch), 2, 2, dbw.a(12, 20), dbw.a(37, 20), 4, bur.b)).a(dbx.g, new dcg(dcd.b(1.0F)), exu.a(eug.b.c, bw.a.a().a($$5, axh.f).b()))
      );
      a($$0, A, dbw.a(dbw.a($$3.b(axm.ch), 2, 1, dbw.a(20), dbw.a(50), 4, bur.b)).a(dbx.r, new dcr(dcd.a(100.0F))));
      a(
         $$0,
         B,
         dbw.a(dbw.a($$3.b(axm.ch), 1, 1, dbw.a(20), dbw.a(50), 8, bur.b)).a($$2.b(axg.d)).a(dbx.p, new dcz(dcd.a(0.0F)), exy.a(cu.a.a().a($$3, cwj.ox)))
      );
      a($$0, C, dbw.a(dbw.a($$3.b(axm.ce), 2, 3, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b)).a(dbx.w, new dcg(dcd.b(1.0F))));
      a($$0, D, dbw.a(dbw.a($$3.b(axm.ce), 2, 3, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b)).a(dbx.v, new dcg(dcd.b(5.0F))));
      a($$0, E, dbw.a(dbw.a($$3.b(axm.cf), 5, 3, dbw.a(12, 7), dbw.a(50), 2, bur.b)).a(dbx.u, new dcg(dcd.b(1.0F))));
      a(
         $$0,
         F,
         dbw.a(dbw.a($$3.b(axm.cf), 2, 5, dbw.a(1, 8), dbw.a(21, 8), 4, bur.b))
            .a($$2.b(axg.f))
            .a(dbx.e, new dcg(dcd.b(2.5F)), exu.a(eug.b.a, bw.a.a().a(bz.a($$5, axh.B)).b()))
      );
      a(
         $$0,
         G,
         dbw.a(dbw.a($$3.b(axm.cf), 2, 3, dbw.a(17, 7), dbw.a(50), 4, bur.d))
            .a($$2.b(axg.h))
            .b(dbx.F, new dcg(dcd.a(1.5F, 0.75F)))
            .b(dbx.C, List.of(awo.zH, awo.zI, awo.zJ))
      );
      a(
         $$0,
         H,
         dbw.a(dbw.a($$3.b(axm.cf), 1, 1, dbw.a(25), dbw.a(50), 8, bur.b))
            .a(
               dbx.i,
               dca.a,
               dca.c,
               dch.a(new ddb(ju.a(bup.am.r()), false), new dct(awo.zL, bri.a(5.0F), bri.a(1.0F))),
               exe.a(eyb.c().b(true), exu.a(eug.b.a, bw.a.a().a(dh.a.a().b(true))), exu.a(eug.b.c, bw.a.a().a($$5, bup.bf)))
            )
            .a(
               dbx.j,
               dch.a(new ddb(ju.a(bup.am.r()), false), new dct(awo.zL, bri.a(5.0F), bri.a(1.0F))),
               exe.a(eyb.c().b(true), exu.a(eug.b.a, bw.a.a().a($$5, bup.bf)), exp.a(dh.a.a().b(true)), exq.a(dil.ss))
            )
      );
      a(
         $$0,
         I,
         dbw.a(dbw.a($$3.b(axm.cj), 2, 1, dbw.a(20), dbw.a(50), 4, bur.b)).a($$2.b(axg.e)).a(dbx.t, new dcg(dcd.b(2.0F))).a(dbx.s, new dcg(dcd.b(10.0F)))
      );
      a(
         $$0,
         J,
         dbw.a(dbw.a($$3.b(axm.cj), 5, 3, dbw.a(12, 20), dbw.a(50), 2, bur.b, bur.c))
            .b(dbx.A, new dcg(dcd.b(-0.25F)))
            .b(
               dbx.B,
               List.of(
                  new cuw.a(Optional.of(awo.gs), Optional.empty(), Optional.of(awo.gp)),
                  new cuw.a(Optional.of(awo.gt), Optional.empty(), Optional.of(awo.gp)),
                  new cuw.a(Optional.of(awo.gu), Optional.empty(), Optional.of(awo.gp))
               )
            )
      );
      a($$0, K, dbw.a(dbw.a($$3.b(axm.cj), 10, 4, dbw.a(1, 10), dbw.a(50), 1, bur.b)).a($$2.b(axg.e)).a(dbx.q, new dcg(dcd.b(1.0F))));
      a($$0, L, dbw.a(dbw.a($$3.b(axm.cl), 5, 5, dbw.a(5, 8), dbw.a(25, 8), 2, bur.b)).a($$2.b(axg.f)).a(dbx.f, new dcg(dcd.b(0.5F))));
      a($$0, M, dbw.a(dbw.a($$3.b(axm.cl), 2, 4, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b)).a($$2.b(axg.f)).a(dbx.h, new dcg(dcd.b(-0.15F))));
      a(
         $$0,
         N,
         dbw.a(dbw.a($$3.b(axm.cl), 2, 3, dbw.a(15, 9), dbw.a(65, 9), 4, bur.b))
            .a(
               dbx.i,
               dca.a,
               dca.a,
               new dcq(
                  false,
                  Optional.empty(),
                  Optional.of(dcd.a(List.of(1.2F, 1.75F, 2.2F), dcd.a(1.5F, 0.35F))),
                  $$4.a(axd.cA).map(Function.identity()),
                  ezr.c,
                  dcd.a(3.5F),
                  false,
                  dff.a.e,
                  ls.A,
                  ls.z,
                  awo.Cu
               ),
               exu.a(eug.b.c, bw.a.a().a(bu.a.a().f(false)).a(dl.d(dj.c.b(1.5))))
            )
      );
      a($$0, O, dbw.a(dbw.a($$3.b(axm.cg), 2, 1, dbw.a(25, 25), dbw.a(75, 25), 4, bur.a)).a(dbx.z, new dcs(dcd.a(2.0F))));
      a($$0, P, dbw.a(dbw.a($$3.b(axm.ck), 1, 1, dbw.a(25), dbw.a(50), 8, bur.a)).a(dbx.D));
   }

   private static void a(rb<dbw> $$0, alk<dbw> $$1, dbw.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alk<dbw> a(String $$0) {
      return alk.a(ma.aM, all.b($$0));
   }
}
