import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dci {
   public static final ali<dcd> a = a("protection");
   public static final ali<dcd> b = a("fire_protection");
   public static final ali<dcd> c = a("feather_falling");
   public static final ali<dcd> d = a("blast_protection");
   public static final ali<dcd> e = a("projectile_protection");
   public static final ali<dcd> f = a("respiration");
   public static final ali<dcd> g = a("aqua_affinity");
   public static final ali<dcd> h = a("thorns");
   public static final ali<dcd> i = a("depth_strider");
   public static final ali<dcd> j = a("frost_walker");
   public static final ali<dcd> k = a("binding_curse");
   public static final ali<dcd> l = a("soul_speed");
   public static final ali<dcd> m = a("swift_sneak");
   public static final ali<dcd> n = a("sharpness");
   public static final ali<dcd> o = a("smite");
   public static final ali<dcd> p = a("bane_of_arthropods");
   public static final ali<dcd> q = a("knockback");
   public static final ali<dcd> r = a("fire_aspect");
   public static final ali<dcd> s = a("looting");
   public static final ali<dcd> t = a("sweeping_edge");
   public static final ali<dcd> u = a("efficiency");
   public static final ali<dcd> v = a("silk_touch");
   public static final ali<dcd> w = a("unbreaking");
   public static final ali<dcd> x = a("fortune");
   public static final ali<dcd> y = a("power");
   public static final ali<dcd> z = a("punch");
   public static final ali<dcd> A = a("flame");
   public static final ali<dcd> B = a("infinity");
   public static final ali<dcd> C = a("luck_of_the_sea");
   public static final ali<dcd> D = a("lure");
   public static final ali<dcd> E = a("loyalty");
   public static final ali<dcd> F = a("impaling");
   public static final ali<dcd> G = a("riptide");
   public static final ali<dcd> H = a("channeling");
   public static final ali<dcd> I = a("multishot");
   public static final ali<dcd> J = a("quick_charge");
   public static final ali<dcd> K = a("piercing");
   public static final ali<dcd> L = a("density");
   public static final ali<dcd> M = a("breach");
   public static final ali<dcd> N = a("wind_burst");
   public static final ali<dcd> O = a("mending");
   public static final ali<dcd> P = a("vanishing_curse");

   public static void a(qz<dcd> $$0) {
      jr<btd> $$1 = $$0.a(ma.s);
      jr<dcd> $$2 = $$0.a(ma.aM);
      jr<cwi> $$3 = $$0.a(ma.K);
      jr<diq> $$4 = $$0.a(ma.f);
      jr<bus<?>> $$5 = $$0.a(ma.z);
      a(
         $$0,
         a,
         dcd.a(dcd.a($$3.b(axl.bX), 10, 4, dcd.a(1, 11), dcd.a(12, 11), 1, buu.i))
            .a($$2.b(axf.b))
            .a(dce.c, new dcn(dck.b(1.0F)), exr.a(bl.a.a().a(eg.b(axe.d))))
      );
      a(
         $$0,
         b,
         dcd.a(dcd.a($$3.b(axl.bX), 5, 4, dcd.a(10, 8), dcd.a(18, 8), 2, buu.i))
            .a($$2.b(axf.b))
            .a(dce.c, new dcn(dck.b(2.0F)), exl.a(exr.a(bl.a.a().a(eg.a(axe.i)).a(eg.b(axe.d)))))
            .a(dce.l, new dct(alj.b("enchantment.fire_protection"), bwp.h, dck.b(-0.15F), bwn.a.b))
      );
      a(
         $$0,
         c,
         dcd.a(dcd.a($$3.b(axl.bT), 5, 4, dcd.a(5, 6), dcd.a(11, 6), 2, buu.i)).a(dce.c, new dcn(dck.b(3.0F)), exr.a(bl.a.a().a(eg.a(axe.m)).a(eg.b(axe.d))))
      );
      a(
         $$0,
         d,
         dcd.a(dcd.a($$3.b(axl.bX), 2, 4, dcd.a(5, 8), dcd.a(13, 8), 4, buu.i))
            .a($$2.b(axf.b))
            .a(dce.c, new dcn(dck.b(2.0F)), exr.a(bl.a.a().a(eg.a(axe.l)).a(eg.b(axe.d))))
            .a(dce.l, new dct(alj.b("enchantment.blast_protection"), bwp.i, dck.b(0.15F), bwn.a.a))
      );
      a(
         $$0,
         e,
         dcd.a(dcd.a($$3.b(axl.bX), 5, 4, dcd.a(3, 6), dcd.a(9, 6), 2, buu.i))
            .a($$2.b(axf.b))
            .a(dce.c, new dcn(dck.b(2.0F)), exr.a(bl.a.a().a(eg.a(axe.j)).a(eg.b(axe.d))))
      );
      a(
         $$0,
         f,
         dcd.a(dcd.a($$3.b(axl.bW), 2, 3, dcd.a(10, 10), dcd.a(40, 10), 4, buu.h))
            .a(dce.l, new dct(alj.b("enchantment.respiration"), bwp.w, dck.b(1.0F), bwn.a.a))
      );
      a(
         $$0,
         g,
         dcd.a(dcd.a($$3.b(axl.bW), 2, 1, dcd.a(1), dcd.a(41), 4, buu.h)).a(dce.l, new dct(alj.b("enchantment.aqua_affinity"), bwp.C, dck.b(4.0F), bwn.a.c))
      );
      a(
         $$0,
         h,
         dcd.a(dcd.a($$3.b(axl.bX), $$3.b(axl.bV), 1, 3, dcd.a(10, 20), dcd.a(60, 20), 8, buu.a))
            .a(dce.i, dch.c, dch.a, dco.a(new dcq(dck.a(1.0F), dck.a(5.0F), $$1.b(bte.P)), new dcs(dck.a(2.0F))), eyd.a(eys.a(dck.b(0.15F))))
      );
      a(
         $$0,
         i,
         dcd.a(dcd.a($$3.b(axl.bT), 2, 3, dcd.a(10, 10), dcd.a(25, 10), 4, buu.e))
            .a($$2.b(axf.c))
            .a(dce.l, new dct(alj.b("enchantment.depth_strider"), bwp.F, dck.b(0.33333334F), bwn.a.a))
      );
      a(
         $$0,
         j,
         dcd.a(dcd.a($$3.b(axl.bT), 2, 2, dcd.a(10, 10), dcd.a(25, 10), 4, buu.e))
            .a($$2.b(axf.c))
            .a(dce.d, dcr.a, exr.a(bl.a.a().a(eg.a(axe.E)).a(eg.b(axe.d))))
            .a(
               dce.n,
               new ddd(
                  new dck.a(dck.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dck.a(1.0F),
                  new kl(0, -1, 0),
                  Optional.of(ecx.a(ecx.a(new kl(0, 1, 0), axc.cC), ecx.a(dis.G), ecx.a(erw.c), ecx.f())),
                  ejb.a(dis.kI),
                  Optional.of(ear.i)
               ),
               eyb.a(eun.b.a, bw.a.a().a(bu.a.a().a(true)))
            )
      );
      a($$0, k, dcd.a(dcd.a($$3.b(axl.ci), 1, 1, dcd.a(25), dcd.a(50), 8, buu.i)).a(dce.E));
      bw.a $$6 = bw.a.a().a(5).a(bu.a.a().f(false).a(true)).a(dl.b(dj.c.b(1.0E-5F))).c(dh.a.a().a(ax.a.a().a($$4, axc.aP)));
      exl.a $$7 = exl.a(
         exv.a(eyb.a(eun.b.a, bw.a.a().a(bw.a.a()))),
         exm.a(
            exl.a(
               exs.c(),
               eyb.a(eun.b.a, bw.a.a().a(bu.a.a().f(false))),
               exm.a(eyb.a(eun.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axc.aP)))), eyb.a(eun.b.a, bw.a.a().a(bu.a.a().a(false)).b()))
            ),
            exl.a(exs.d(), eyb.a(eun.b.a, bw.a.a().c(dh.a.a().a(ax.a.a().a($$4, axc.aP))).a(bu.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dcd.a(dcd.a($$3.b(axl.bT), 1, 3, dcd.a(10, 10), dcd.a(25, 10), 8, buu.e))
            .a(
               dce.n,
               dco.a(
                  new dct(alj.b("enchantment.soul_speed"), bwp.v, dck.a(0.0405F, 0.0105F), bwn.a.a),
                  new dct(alj.b("enchantment.soul_speed"), bwp.u, dck.a(1.0F), bwn.a.a)
               ),
               $$7
            )
            .a(
               dce.n,
               new dcs(dck.a(1.0F)),
               exl.a(eyd.a(eys.a(dck.a(0.04F))), eyb.a(eun.b.a, bw.a.a().a(bu.a.a().a(true)).c(dh.a.a().a(ax.a.a().a($$4, axc.aP)))))
            )
            .a(dce.o, new ddh(ls.M, ddh.b(), ddh.a(0.1F), ddh.b(-0.2F), ddh.a(brl.a(0.1F)), brl.a(1.0F)), eyb.a(eun.b.a, $$6))
            .a(dce.o, new dda(awn.xP, brl.a(0.6F), bru.b(0.6F, 1.0F)), exl.a(eyd.a(0.35F), eyb.a(eun.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dcd.a(dcd.a($$3.b(axl.bU), 1, 3, dcd.a(25, 25), dcd.a(75, 25), 8, buu.f))
            .a(dce.l, new dct(alj.b("enchantment.swift_sneak"), bwp.z, dck.b(0.15F), bwn.a.a))
      );
      a($$0, n, dcd.a(dcd.a($$3.b(axl.ca), $$3.b(axl.bY), 10, 5, dcd.a(1, 11), dcd.a(21, 11), 1, buu.b)).a($$2.b(axf.f)).a(dce.e, new dcn(dck.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dcd.a(dcd.a($$3.b(axl.cb), $$3.b(axl.bY), 5, 5, dcd.a(5, 8), dcd.a(25, 8), 2, buu.b))
            .a($$2.b(axf.f))
            .a(dce.e, new dcn(dck.b(2.5F)), eyb.a(eun.b.a, bw.a.a().a(bz.a($$5, axg.D))))
      );
      a(
         $$0,
         p,
         dcd.a(dcd.a($$3.b(axl.cb), $$3.b(axl.bY), 5, 5, dcd.a(5, 8), dcd.a(25, 8), 2, buu.b))
            .a($$2.b(axf.f))
            .a(dce.e, new dcn(dck.b(2.5F)), eyb.a(eun.b.a, bw.a.a().a(bz.a($$5, axg.C))))
            .a(
               dce.i,
               dch.a,
               dch.c,
               new dcp(ju.a(bts.b), dck.a(1.5F), dck.a(1.5F, 0.5F), dck.a(3.0F), dck.a(3.0F)),
               eyb.a(eun.b.a, bw.a.a().a(bz.a($$5, axg.C))).and(exr.a(bl.a.a().a(true)))
            )
      );
      a($$0, q, dcd.a(dcd.a($$3.b(axl.bY), 5, 2, dcd.a(5, 20), dcd.a(55, 20), 2, buu.b)).a(dce.g, new dcn(dck.b(1.0F))));
      a(
         $$0,
         r,
         dcd.a(dcd.a($$3.b(axl.bZ), $$3.b(axl.bY), 2, 2, dcd.a(10, 20), dcd.a(60, 20), 4, buu.b))
            .a(dce.i, dch.a, dch.c, new dcy(dck.b(4.0F)), exr.a(bl.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dcd.a(dcd.a($$3.b(axl.bY), 2, 3, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b))
            .a(dce.m, dch.a, dch.c, new dcn(dck.b(0.01F)), eyb.a(eun.b.b, bw.a.a().a(bz.a($$5, bus.bO))))
      );
      a(
         $$0,
         t,
         dcd.a(dcd.a($$3.b(axl.bY), 2, 3, dcd.a(5, 9), dcd.a(20, 9), 4, buu.b))
            .a(dce.l, new dct(alj.b("enchantment.sweeping_edge"), bwp.D, new dck.c(dck.b(1.0F), dck.a(2.0F, 1.0F)), bwn.a.a))
      );
      a(
         $$0,
         u,
         dcd.a(dcd.a($$3.b(axl.cc), 10, 5, dcd.a(1, 10), dcd.a(51, 10), 1, buu.b))
            .a(dce.l, new dct(alj.b("enchantment.efficiency"), bwp.t, new dck.d(1.0F), bwn.a.a))
      );
      a($$0, v, dcd.a(dcd.a($$3.b(axl.cd), 1, 1, dcd.a(15), dcd.a(65), 8, buu.b)).a($$2.b(axf.g)).a(dce.x, new ddg(dck.a(0.0F))));
      a(
         $$0,
         w,
         dcd.a(dcd.a($$3.b(axl.cg), 5, 3, dcd.a(5, 8), dcd.a(55, 8), 2, buu.a))
            .a(dce.k, new ddb(new dck.c(dck.b(2.0F), dck.a(10.0F, 5.0F))), eyf.a(cu.a.a().a($$3, axl.bX)))
            .a(dce.k, new ddb(new dck.c(dck.b(1.0F), dck.a(2.0F, 1.0F))), exv.a(eyf.a(cu.a.a().a($$3, axl.bX))))
      );
      a($$0, x, dcd.a(dcd.a($$3.b(axl.cd), 2, 3, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b)).a($$2.b(axf.g)));
      a(
         $$0,
         y,
         dcd.a(dcd.a($$3.b(axl.ch), 10, 5, dcd.a(1, 10), dcd.a(16, 10), 1, buu.b)).a(dce.e, new dcn(dck.b(0.5F)), eyb.a(eun.b.c, bw.a.a().a($$5, axg.f).b()))
      );
      a(
         $$0,
         z,
         dcd.a(dcd.a($$3.b(axl.ch), 2, 2, dcd.a(12, 20), dcd.a(37, 20), 4, buu.b)).a(dce.g, new dcn(dck.b(1.0F)), eyb.a(eun.b.c, bw.a.a().a($$5, axg.f).b()))
      );
      a($$0, A, dcd.a(dcd.a($$3.b(axl.ch), 2, 1, dcd.a(20), dcd.a(50), 4, buu.b)).a(dce.r, new dcy(dck.a(100.0F))));
      a(
         $$0,
         B,
         dcd.a(dcd.a($$3.b(axl.ch), 1, 1, dcd.a(20), dcd.a(50), 8, buu.b)).a($$2.b(axf.d)).a(dce.p, new ddg(dck.a(0.0F)), eyf.a(cu.a.a().a($$3, cwq.ox)))
      );
      a($$0, C, dcd.a(dcd.a($$3.b(axl.ce), 2, 3, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b)).a(dce.w, new dcn(dck.b(1.0F))));
      a($$0, D, dcd.a(dcd.a($$3.b(axl.ce), 2, 3, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b)).a(dce.v, new dcn(dck.b(5.0F))));
      a($$0, E, dcd.a(dcd.a($$3.b(axl.cf), 5, 3, dcd.a(12, 7), dcd.a(50), 2, buu.b)).a(dce.u, new dcn(dck.b(1.0F))));
      a(
         $$0,
         F,
         dcd.a(dcd.a($$3.b(axl.cf), 2, 5, dcd.a(1, 8), dcd.a(21, 8), 4, buu.b))
            .a($$2.b(axf.f))
            .a(dce.e, new dcn(dck.b(2.5F)), eyb.a(eun.b.a, bw.a.a().a(bz.a($$5, axg.B)).b()))
      );
      a(
         $$0,
         G,
         dcd.a(dcd.a($$3.b(axl.cf), 2, 3, dcd.a(17, 7), dcd.a(50), 4, buu.d))
            .a($$2.b(axf.h))
            .b(dce.F, new dcn(dck.a(1.5F, 0.75F)))
            .b(dce.C, List.of(awn.zH, awn.zI, awn.zJ))
      );
      a(
         $$0,
         H,
         dcd.a(dcd.a($$3.b(axl.cf), 1, 1, dcd.a(25), dcd.a(50), 8, buu.b))
            .a(
               dce.i,
               dch.a,
               dch.c,
               dco.a(new ddi(ju.a(bus.av.r()), false), new dda(awn.zL, brl.a(5.0F), brl.a(1.0F))),
               exl.a(eyi.c().b(true), eyb.a(eun.b.a, bw.a.a().a(dh.a.a().b(true))), eyb.a(eun.b.c, bw.a.a().a($$5, bus.bv)))
            )
            .a(
               dce.j,
               dco.a(new ddi(ju.a(bus.av.r()), false), new dda(awn.zL, brl.a(5.0F), brl.a(1.0F))),
               exl.a(eyi.c().b(true), eyb.a(eun.b.a, bw.a.a().a($$5, bus.bv)), exw.a(dh.a.a().b(true)), exx.a(dis.ss))
            )
      );
      a(
         $$0,
         I,
         dcd.a(dcd.a($$3.b(axl.cj), 2, 1, dcd.a(20), dcd.a(50), 4, buu.b)).a($$2.b(axf.e)).a(dce.t, new dcn(dck.b(2.0F))).a(dce.s, new dcn(dck.b(10.0F)))
      );
      a(
         $$0,
         J,
         dcd.a(dcd.a($$3.b(axl.cj), 5, 3, dcd.a(12, 20), dcd.a(50), 2, buu.b, buu.c))
            .b(dce.A, new dcn(dck.b(-0.25F)))
            .b(
               dce.B,
               List.of(
                  new cvd.a(Optional.of(awn.gs), Optional.empty(), Optional.of(awn.gp)),
                  new cvd.a(Optional.of(awn.gt), Optional.empty(), Optional.of(awn.gp)),
                  new cvd.a(Optional.of(awn.gu), Optional.empty(), Optional.of(awn.gp))
               )
            )
      );
      a($$0, K, dcd.a(dcd.a($$3.b(axl.cj), 10, 4, dcd.a(1, 10), dcd.a(50), 1, buu.b)).a($$2.b(axf.e)).a(dce.q, new dcn(dck.b(1.0F))));
      a($$0, L, dcd.a(dcd.a($$3.b(axl.cl), 5, 5, dcd.a(5, 8), dcd.a(25, 8), 2, buu.b)).a($$2.b(axf.f)).a(dce.f, new dcn(dck.b(0.5F))));
      a($$0, M, dcd.a(dcd.a($$3.b(axl.cl), 2, 4, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b)).a($$2.b(axf.f)).a(dce.h, new dcn(dck.b(-0.15F))));
      a(
         $$0,
         N,
         dcd.a(dcd.a($$3.b(axl.cl), 2, 3, dcd.a(15, 9), dcd.a(65, 9), 4, buu.b))
            .a(
               dce.i,
               dch.a,
               dch.a,
               new dcx(
                  false,
                  Optional.empty(),
                  Optional.of(dck.a(List.of(1.2F, 1.75F, 2.2F), dck.a(1.5F, 0.35F))),
                  $$4.a(axc.cA).map(Function.identity()),
                  ezy.c,
                  dck.a(3.5F),
                  false,
                  dfm.a.e,
                  ls.A,
                  ls.z,
                  awn.Cu
               ),
               eyb.a(eun.b.c, bw.a.a().a(bu.a.a().f(false)).a(dl.d(dj.c.b(1.5))))
            )
      );
      a($$0, O, dcd.a(dcd.a($$3.b(axl.cg), 2, 1, dcd.a(25, 25), dcd.a(75, 25), 4, buu.a)).a(dce.z, new dcz(dck.a(2.0F))));
      a($$0, P, dcd.a(dcd.a($$3.b(axl.ck), 1, 1, dcd.a(25), dcd.a(50), 8, buu.a)).a(dce.D));
   }

   private static void a(qz<dcd> $$0, ali<dcd> $$1, dcd.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static ali<dcd> a(String $$0) {
      return ali.a(ma.aM, alj.b($$0));
   }
}
