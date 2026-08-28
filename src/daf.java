import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class daf {
   public static final akp<daa> a = a("protection");
   public static final akp<daa> b = a("fire_protection");
   public static final akp<daa> c = a("feather_falling");
   public static final akp<daa> d = a("blast_protection");
   public static final akp<daa> e = a("projectile_protection");
   public static final akp<daa> f = a("respiration");
   public static final akp<daa> g = a("aqua_affinity");
   public static final akp<daa> h = a("thorns");
   public static final akp<daa> i = a("depth_strider");
   public static final akp<daa> j = a("frost_walker");
   public static final akp<daa> k = a("binding_curse");
   public static final akp<daa> l = a("soul_speed");
   public static final akp<daa> m = a("swift_sneak");
   public static final akp<daa> n = a("sharpness");
   public static final akp<daa> o = a("smite");
   public static final akp<daa> p = a("bane_of_arthropods");
   public static final akp<daa> q = a("knockback");
   public static final akp<daa> r = a("fire_aspect");
   public static final akp<daa> s = a("looting");
   public static final akp<daa> t = a("sweeping_edge");
   public static final akp<daa> u = a("efficiency");
   public static final akp<daa> v = a("silk_touch");
   public static final akp<daa> w = a("unbreaking");
   public static final akp<daa> x = a("fortune");
   public static final akp<daa> y = a("power");
   public static final akp<daa> z = a("punch");
   public static final akp<daa> A = a("flame");
   public static final akp<daa> B = a("infinity");
   public static final akp<daa> C = a("luck_of_the_sea");
   public static final akp<daa> D = a("lure");
   public static final akp<daa> E = a("loyalty");
   public static final akp<daa> F = a("impaling");
   public static final akp<daa> G = a("riptide");
   public static final akp<daa> H = a("channeling");
   public static final akp<daa> I = a("multishot");
   public static final akp<daa> J = a("quick_charge");
   public static final akp<daa> K = a("piercing");
   public static final akp<daa> L = a("density");
   public static final akp<daa> M = a("breach");
   public static final akp<daa> N = a("wind_burst");
   public static final akp<daa> O = a("mending");
   public static final akp<daa> P = a("vanishing_curse");

   public static void a(qp<daa> $$0) {
      jn<brl> $$1 = $$0.a(lu.s);
      jn<daa> $$2 = $$0.a(lu.aL);
      jn<cuj> $$3 = $$0.a(lu.K);
      jn<dfw> $$4 = $$0.a(lu.f);
      a(
         $$0,
         a,
         daa.a(daa.a($$3.b(awm.bC), 10, 4, daa.a(1, 11), daa.a(12, 11), 1, bsy.i))
            .a($$2.b(awg.b))
            .a(dab.c, new daj(dah.b(1.0F)), eup.a(bk.a.a().a(ed.b(awf.d))))
      );
      a(
         $$0,
         b,
         daa.a(daa.a($$3.b(awm.bC), 5, 4, daa.a(10, 8), daa.a(18, 8), 2, bsy.i))
            .a($$2.b(awg.b))
            .a(dab.c, new daj(dah.b(2.0F)), euj.a(eup.a(bk.a.a().a(ed.a(awf.i)).a(ed.b(awf.d)))))
            .a(dab.l, new dap(akq.b("enchantment.fire_protection"), buu.h, dah.b(-0.15F), bus.a.b))
      );
      a(
         $$0,
         c,
         daa.a(daa.a($$3.b(awm.by), 5, 4, daa.a(5, 6), daa.a(11, 6), 2, bsy.i)).a(dab.c, new daj(dah.b(3.0F)), eup.a(bk.a.a().a(ed.a(awf.m)).a(ed.b(awf.d))))
      );
      a(
         $$0,
         d,
         daa.a(daa.a($$3.b(awm.bC), 2, 4, daa.a(5, 8), daa.a(13, 8), 4, bsy.i))
            .a($$2.b(awg.b))
            .a(dab.c, new daj(dah.b(2.0F)), eup.a(bk.a.a().a(ed.a(awf.l)).a(ed.b(awf.d))))
            .a(dab.l, new dap(akq.b("enchantment.blast_protection"), buu.i, dah.b(0.15F), bus.a.a))
      );
      a(
         $$0,
         e,
         daa.a(daa.a($$3.b(awm.bC), 5, 4, daa.a(3, 6), daa.a(9, 6), 2, bsy.i))
            .a($$2.b(awg.b))
            .a(dab.c, new daj(dah.b(2.0F)), eup.a(bk.a.a().a(ed.a(awf.j)).a(ed.b(awf.d))))
      );
      a(
         $$0,
         f,
         daa.a(daa.a($$3.b(awm.bB), 2, 3, daa.a(10, 10), daa.a(40, 10), 4, bsy.h))
            .a(dab.l, new dap(akq.b("enchantment.respiration"), buu.w, dah.b(1.0F), bus.a.a))
      );
      a(
         $$0,
         g,
         daa.a(daa.a($$3.b(awm.bB), 2, 1, daa.a(1), daa.a(41), 4, bsy.h)).a(dab.l, new dap(akq.b("enchantment.aqua_affinity"), buu.C, dah.b(4.0F), bus.a.c))
      );
      a(
         $$0,
         h,
         daa.a(daa.a($$3.b(awm.bC), $$3.b(awm.bA), 1, 3, daa.a(10, 20), daa.a(60, 20), 8, bsy.a))
            .a(dab.i, dae.c, dae.a, dak.a(new dam(dah.a(1.0F), dah.a(5.0F), $$1.b(brm.O)), new dao(dah.a(2.0F))), evb.a(evq.a(dah.b(0.15F))))
      );
      a(
         $$0,
         i,
         daa.a(daa.a($$3.b(awm.by), 2, 3, daa.a(10, 10), daa.a(25, 10), 4, bsy.e))
            .a($$2.b(awg.c))
            .a(dab.l, new dap(akq.b("enchantment.depth_strider"), buu.E, dah.b(0.33333334F), bus.a.a))
      );
      a(
         $$0,
         j,
         daa.a(daa.a($$3.b(awm.by), 2, 2, daa.a(10, 10), daa.a(25, 10), 4, bsy.e))
            .a($$2.b(awg.c))
            .a(dab.d, dan.a, eup.a(bk.a.a().a(ed.a(awf.E)).a(ed.b(awf.d))))
            .a(
               dab.n,
               new daz(
                  new dah.a(dah.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dah.a(1.0F),
                  new kh(0, -1, 0),
                  Optional.of(eac.a(eac.a(new kh(0, 1, 0), awd.cB), eac.a(dfy.G), eac.a(eoz.c), eac.f())),
                  egf.a(dfy.kI),
                  Optional.of(dxw.i)
               ),
               euz.a(erl.b.a, bv.a.a().a(bt.a.a().a(true)))
            )
      );
      a($$0, k, daa.a(daa.a($$3.b(awm.bN), 1, 1, daa.a(25), daa.a(50), 8, bsy.i)).a(dab.E));
      bv.a $$5 = bv.a.a().a(5).a(bt.a.a().f(false).a(true)).a(dj.b(dh.c.b(1.0E-5F))).c(df.a.a().a(aw.a.a().a(awd.aN)));
      a(
         $$0,
         l,
         daa.a(daa.a($$3.b(awm.by), 1, 3, daa.a(10, 10), daa.a(25, 10), 8, bsy.e))
            .a(
               dab.n,
               new dap(akq.b("enchantment.soul_speed"), buu.v, dah.a(0.0405F, 0.0105F), bus.a.a),
               euj.a(
                  eut.a(euz.a(erl.b.a, bv.a.a().a(bv.a.a()))),
                  euk.a(
                     euj.a(
                        euq.c(),
                        euz.a(erl.b.a, bv.a.a().a(bt.a.a().f(false))),
                        euk.a(euz.a(erl.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a(awd.aN)))), euz.a(erl.b.a, bv.a.a().a(bt.a.a().a(false)).b()))
                     ),
                     euj.a(euq.d(), euz.a(erl.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a(awd.aN))).a(bt.a.a().f(false))))
                  )
               )
            )
            .a(dab.n, new dap(akq.b("enchantment.soul_speed"), buu.u, dah.a(1.0F), bus.a.a), euz.a(erl.b.a, bv.a.a().c(df.a.a().a(aw.a.a().a(awd.aN)))))
            .a(dab.n, new dao(dah.a(1.0F)), euj.a(evb.a(evq.a(dah.a(0.04F))), euz.a(erl.b.a, bv.a.a().a(bt.a.a().a(true)).c(df.a.a().a(aw.a.a().a(awd.aN))))))
            .a(dab.o, new dbd(lm.M, dbd.b(), dbd.a(0.1F), dbd.b(-0.2F), dbd.a(bpr.a(0.1F)), bpr.a(1.0F)), euz.a(erl.b.a, $$5))
            .a(dab.o, new daw(avo.xQ, bpr.a(0.6F), bqa.b(0.6F, 1.0F)), euj.a(evb.a(0.35F), euz.a(erl.b.a, $$5)))
      );
      a(
         $$0,
         m,
         daa.a(daa.a($$3.b(awm.bz), 1, 3, daa.a(25, 25), daa.a(75, 25), 8, bsy.f))
            .a(dab.l, new dap(akq.b("enchantment.swift_sneak"), buu.z, dah.b(0.15F), bus.a.a))
      );
      a($$0, n, daa.a(daa.a($$3.b(awm.bG), $$3.b(awm.bD), 10, 5, daa.a(1, 11), daa.a(21, 11), 1, bsy.b)).a($$2.b(awg.f)).a(dab.e, new daj(dah.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         daa.a(daa.a($$3.b(awm.bG), $$3.b(awm.bD), 5, 5, daa.a(5, 8), daa.a(25, 8), 2, bsy.b))
            .a($$2.b(awg.f))
            .a(dab.e, new daj(dah.b(2.5F)), euz.a(erl.b.a, bv.a.a().a(by.a(awh.D))))
      );
      a(
         $$0,
         p,
         daa.a(daa.a($$3.b(awm.bG), $$3.b(awm.bD), 5, 5, daa.a(5, 8), daa.a(25, 8), 2, bsy.b))
            .a($$2.b(awg.f))
            .a(dab.e, new daj(dah.b(2.5F)), euz.a(erl.b.a, bv.a.a().a(by.a(awh.C))))
            .a(
               dab.i,
               dae.a,
               dae.c,
               new dal(jq.a(bsa.b), dah.a(1.5F), dah.a(1.5F, 0.5F), dah.a(3.0F), dah.a(3.0F)),
               euz.a(erl.b.a, bv.a.a().a(by.a(awh.C))).and(eup.a(bk.a.a().a(true)))
            )
      );
      a($$0, q, daa.a(daa.a($$3.b(awm.bD), 5, 2, daa.a(5, 20), daa.a(55, 20), 2, bsy.b)).a(dab.g, new daj(dah.b(1.0F))));
      a(
         $$0,
         r,
         daa.a(daa.a($$3.b(awm.bE), $$3.b(awm.bD), 2, 2, daa.a(10, 20), daa.a(60, 20), 4, bsy.b))
            .a(dab.i, dae.a, dae.c, new dau(dah.b(4.0F)), eup.a(bk.a.a().a(true)))
            .a(
               dab.j,
               dak.a(new dbb(cxb.a.a(dgl.g, true), kh.g, Optional.of(dxw.c)), new dao(dah.a(1.0F))),
               euu.a(df.a.a().a(aw.a.a().a(awd.cA).a(eb.a.a().a(dtq.r, false))).a(cd.a.a().a(eoz.a)))
            )
      );
      a(
         $$0,
         s,
         daa.a(daa.a($$3.b(awm.bD), 2, 3, daa.a(15, 9), daa.a(65, 9), 4, bsy.b))
            .a(dab.m, dae.a, dae.c, new daj(dah.b(0.01F)), euz.a(erl.b.b, bv.a.a().a(by.a(bsw.by))))
      );
      a(
         $$0,
         t,
         daa.a(daa.a($$3.b(awm.bD), 2, 3, daa.a(5, 9), daa.a(20, 9), 4, bsy.b))
            .a(dab.l, new dap(akq.b("enchantment.sweeping_edge"), buu.D, new dah.c(dah.b(1.0F), dah.a(2.0F, 1.0F)), bus.a.a))
      );
      a(
         $$0,
         u,
         daa.a(daa.a($$3.b(awm.bH), 10, 5, daa.a(1, 10), daa.a(51, 10), 1, bsy.b))
            .a(dab.l, new dap(akq.b("enchantment.efficiency"), buu.t, new dah.d(1.0F), bus.a.a))
      );
      a($$0, v, daa.a(daa.a($$3.b(awm.bI), 1, 1, daa.a(15), daa.a(65), 8, bsy.b)).a($$2.b(awg.g)).a(dab.x, new dbc(dah.a(0.0F))));
      a(
         $$0,
         w,
         daa.a(daa.a($$3.b(awm.bL), 5, 3, daa.a(5, 8), daa.a(55, 8), 2, bsy.a))
            .a(dab.k, new dax(new dah.c(dah.b(2.0F), dah.a(10.0F, 5.0F))), evd.a(cs.a.a().a(awm.bC)))
            .a(dab.k, new dax(new dah.c(dah.b(1.0F), dah.a(2.0F, 1.0F))), eut.a(evd.a(cs.a.a().a(awm.bC))))
      );
      a($$0, x, daa.a(daa.a($$3.b(awm.bI), 2, 3, daa.a(15, 9), daa.a(65, 9), 4, bsy.b)).a($$2.b(awg.g)));
      a($$0, y, daa.a(daa.a($$3.b(awm.bM), 10, 5, daa.a(1, 10), daa.a(16, 10), 1, bsy.b)).a(dab.e, new daj(dah.b(0.5F)), euz.a(erl.b.c, bv.a.a().a(awh.f).b())));
      a($$0, z, daa.a(daa.a($$3.b(awm.bM), 2, 2, daa.a(12, 20), daa.a(37, 20), 4, bsy.b)).a(dab.g, new daj(dah.b(1.0F)), euz.a(erl.b.c, bv.a.a().a(awh.f).b())));
      a($$0, A, daa.a(daa.a($$3.b(awm.bM), 2, 1, daa.a(20), daa.a(50), 4, bsy.b)).a(dab.r, new dau(dah.a(100.0F))));
      a($$0, B, daa.a(daa.a($$3.b(awm.bM), 1, 1, daa.a(20), daa.a(50), 8, bsy.b)).a($$2.b(awg.d)).a(dab.p, new dbc(dah.a(0.0F)), evd.a(cs.a.a().a(cur.ow))));
      a($$0, C, daa.a(daa.a($$3.b(awm.bJ), 2, 3, daa.a(15, 9), daa.a(65, 9), 4, bsy.b)).a(dab.w, new daj(dah.b(1.0F))));
      a($$0, D, daa.a(daa.a($$3.b(awm.bJ), 2, 3, daa.a(15, 9), daa.a(65, 9), 4, bsy.b)).a(dab.v, new daj(dah.b(5.0F))));
      a($$0, E, daa.a(daa.a($$3.b(awm.bK), 5, 3, daa.a(12, 7), daa.a(50), 2, bsy.b)).a(dab.u, new daj(dah.b(1.0F))));
      a(
         $$0,
         F,
         daa.a(daa.a($$3.b(awm.bK), 2, 5, daa.a(1, 8), daa.a(21, 8), 4, bsy.b))
            .a($$2.b(awg.f))
            .a(dab.e, new daj(dah.b(2.5F)), euz.a(erl.b.a, bv.a.a().a(by.a(awh.B)).b()))
      );
      a(
         $$0,
         G,
         daa.a(daa.a($$3.b(awm.bK), 2, 3, daa.a(17, 7), daa.a(50), 4, bsy.d))
            .a($$2.b(awg.h))
            .b(dab.F, new daj(dah.a(1.5F, 0.75F)))
            .b(dab.C, List.of(avo.zD, avo.zE, avo.zF))
      );
      a(
         $$0,
         H,
         daa.a(daa.a($$3.b(awm.bK), 1, 1, daa.a(25), daa.a(50), 8, bsy.b))
            .a(
               dab.i,
               dae.a,
               dae.c,
               dak.a(new dbe(jq.a(bsw.am.r()), false), new daw(avo.zH, bpr.a(5.0F), bpr.a(1.0F))),
               euj.a(evg.c().b(true), euz.a(erl.b.a, bv.a.a().a(df.a.a().b(true))), euz.a(erl.b.c, bv.a.a().a(bsw.bf)))
            )
            .a(
               dab.j,
               dak.a(new dbe(jq.a(bsw.am.r()), false), new daw(avo.zH, bpr.a(5.0F), bpr.a(1.0F))),
               euj.a(evg.c().b(true), euz.a(erl.b.a, bv.a.a().a(bsw.bf)), euu.a(df.a.a().b(true)), euv.a(dfy.ss))
            )
      );
      a(
         $$0,
         I,
         daa.a(daa.a($$3.b(awm.bO), 2, 1, daa.a(20), daa.a(50), 4, bsy.b)).a($$2.b(awg.e)).a(dab.t, new daj(dah.b(2.0F))).a(dab.s, new daj(dah.b(10.0F)))
      );
      a(
         $$0,
         J,
         daa.a(daa.a($$3.b(awm.bO), 5, 3, daa.a(12, 20), daa.a(50), 2, bsy.b, bsy.c))
            .b(dab.A, new daj(dah.b(-0.25F)))
            .b(
               dab.B,
               List.of(
                  new cta.a(Optional.of(avo.gr), Optional.empty(), Optional.of(avo.go)),
                  new cta.a(Optional.of(avo.gs), Optional.empty(), Optional.of(avo.go)),
                  new cta.a(Optional.of(avo.gt), Optional.empty(), Optional.of(avo.go))
               )
            )
      );
      a($$0, K, daa.a(daa.a($$3.b(awm.bO), 10, 4, daa.a(1, 10), daa.a(50), 1, bsy.b)).a($$2.b(awg.e)).a(dab.q, new daj(dah.b(1.0F))));
      a($$0, L, daa.a(daa.a($$3.b(awm.bQ), 5, 5, daa.a(5, 8), daa.a(25, 8), 2, bsy.b)).a($$2.b(awg.f)).a(dab.f, new daj(dah.b(0.5F))));
      a($$0, M, daa.a(daa.a($$3.b(awm.bQ), 2, 4, daa.a(15, 9), daa.a(65, 9), 4, bsy.b)).a($$2.b(awg.f)).a(dab.h, new daj(dah.b(-0.15F))));
      a(
         $$0,
         N,
         daa.a(daa.a($$3.b(awm.bQ), 2, 3, daa.a(15, 9), daa.a(65, 9), 4, bsy.b))
            .a(
               dab.i,
               dae.a,
               dae.a,
               new dat(
                  false,
                  Optional.empty(),
                  Optional.of(dah.a(0.5F, 0.25F)),
                  $$4.a(awd.cy).map(Function.identity()),
                  eww.b,
                  dah.a(3.5F),
                  false,
                  dcu.a.e,
                  lm.A,
                  lm.z,
                  avo.Cq
               ),
               euz.a(erl.b.b, bv.a.a().a(bt.a.a().f(false)).a(dj.d(dh.c.b(1.5))))
            )
      );
      a($$0, O, daa.a(daa.a($$3.b(awm.bL), 2, 1, daa.a(25, 25), daa.a(75, 25), 4, bsy.a)).a(dab.z, new dav(dah.a(2.0F))));
      a($$0, P, daa.a(daa.a($$3.b(awm.bP), 1, 1, daa.a(25), daa.a(50), 8, bsy.a)).a(dab.D));
   }

   private static void a(qp<daa> $$0, akp<daa> $$1, daa.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akp<daa> a(String $$0) {
      return akp.a(lu.aL, akq.b($$0));
   }
}
