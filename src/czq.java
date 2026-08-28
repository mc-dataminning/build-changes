import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class czq {
   public static final akj<czl> a = a("protection");
   public static final akj<czl> b = a("fire_protection");
   public static final akj<czl> c = a("feather_falling");
   public static final akj<czl> d = a("blast_protection");
   public static final akj<czl> e = a("projectile_protection");
   public static final akj<czl> f = a("respiration");
   public static final akj<czl> g = a("aqua_affinity");
   public static final akj<czl> h = a("thorns");
   public static final akj<czl> i = a("depth_strider");
   public static final akj<czl> j = a("frost_walker");
   public static final akj<czl> k = a("binding_curse");
   public static final akj<czl> l = a("soul_speed");
   public static final akj<czl> m = a("swift_sneak");
   public static final akj<czl> n = a("sharpness");
   public static final akj<czl> o = a("smite");
   public static final akj<czl> p = a("bane_of_arthropods");
   public static final akj<czl> q = a("knockback");
   public static final akj<czl> r = a("fire_aspect");
   public static final akj<czl> s = a("looting");
   public static final akj<czl> t = a("sweeping_edge");
   public static final akj<czl> u = a("efficiency");
   public static final akj<czl> v = a("silk_touch");
   public static final akj<czl> w = a("unbreaking");
   public static final akj<czl> x = a("fortune");
   public static final akj<czl> y = a("power");
   public static final akj<czl> z = a("punch");
   public static final akj<czl> A = a("flame");
   public static final akj<czl> B = a("infinity");
   public static final akj<czl> C = a("luck_of_the_sea");
   public static final akj<czl> D = a("lure");
   public static final akj<czl> E = a("loyalty");
   public static final akj<czl> F = a("impaling");
   public static final akj<czl> G = a("riptide");
   public static final akj<czl> H = a("channeling");
   public static final akj<czl> I = a("multishot");
   public static final akj<czl> J = a("quick_charge");
   public static final akj<czl> K = a("piercing");
   public static final akj<czl> L = a("density");
   public static final akj<czl> M = a("breach");
   public static final akj<czl> N = a("wind_burst");
   public static final akj<czl> O = a("mending");
   public static final akj<czl> P = a("vanishing_curse");

   public static void a(qm<czl> $$0) {
      jk<brb> $$1 = $$0.a(lr.s);
      jk<czl> $$2 = $$0.a(lr.aK);
      jk<ctx> $$3 = $$0.a(lr.K);
      jk<dfh> $$4 = $$0.a(lr.f);
      a(
         $$0,
         a,
         czl.a(czl.a($$3.b(awf.bD), 10, 4, czl.a(1, 11), czl.a(12, 11), 1, bso.i))
            .a($$2.b(avz.b))
            .a(czm.c, new czu(czs.b(1.0F)), ety.a(bj.a.a().a(ea.b(avy.e))))
      );
      a(
         $$0,
         b,
         czl.a(czl.a($$3.b(awf.bD), 5, 4, czl.a(10, 8), czl.a(18, 8), 2, bso.i))
            .a($$2.b(avz.b))
            .a(czm.c, new czu(czs.b(2.0F)), ets.a(ety.a(bj.a.a().a(ea.a(avy.j)).a(ea.b(avy.e)))))
            .a(czm.l, new daa("enchantment.fire_protection", buj.h, czs.b(-0.15F), buh.a.b, UUID.fromString("b572ecd2-ac0c-4071-abde-9594af072a37")))
      );
      a(
         $$0,
         c,
         czl.a(czl.a($$3.b(awf.bz), 5, 4, czl.a(5, 6), czl.a(11, 6), 2, bso.i)).a(czm.c, new czu(czs.b(3.0F)), ety.a(bj.a.a().a(ea.a(avy.n)).a(ea.b(avy.e))))
      );
      a(
         $$0,
         d,
         czl.a(czl.a($$3.b(awf.bD), 2, 4, czl.a(5, 8), czl.a(13, 8), 4, bso.i))
            .a($$2.b(avz.b))
            .a(czm.c, new czu(czs.b(2.0F)), ety.a(bj.a.a().a(ea.a(avy.m)).a(ea.b(avy.e))))
            .a(czm.l, new daa("enchantment.blast_protection", buj.i, czs.b(0.15F), buh.a.a, UUID.fromString("40a9968f-5c66-4e2f-b7f4-2ec2f4b3e450")))
      );
      a(
         $$0,
         e,
         czl.a(czl.a($$3.b(awf.bD), 5, 4, czl.a(3, 6), czl.a(9, 6), 2, bso.i))
            .a($$2.b(avz.b))
            .a(czm.c, new czu(czs.b(2.0F)), ety.a(bj.a.a().a(ea.a(avy.k)).a(ea.b(avy.e))))
      );
      a(
         $$0,
         f,
         czl.a(czl.a($$3.b(awf.bC), 2, 3, czl.a(10, 10), czl.a(40, 10), 4, bso.h))
            .a(czm.l, new daa("enchantment.respiration", buj.w, czs.b(1.0F), buh.a.a, UUID.fromString("07a65791-f64d-4e79-86c7-f83932f007ec")))
      );
      a(
         $$0,
         g,
         czl.a(czl.a($$3.b(awf.bC), 2, 1, czl.a(1), czl.a(41), 4, bso.h))
            .a(czm.l, new daa("enchantment.aqua_affinity", buj.C, czs.b(4.0F), buh.a.c, UUID.fromString("60b1b7db-fffd-4ad0-817c-d6c6a93d8a45")))
      );
      a(
         $$0,
         h,
         czl.a(czl.a($$3.b(awf.bD), $$3.b(awf.bB), 1, 3, czl.a(10, 20), czl.a(60, 20), 8, bso.a))
            .a(czm.i, czp.c, czp.a, czv.a(new czx(czs.a(1.0F), czs.a(5.0F), $$1.b(brc.O)), new czz(czs.a(2.0F))), euk.a(euz.a(czs.b(0.15F))))
      );
      a(
         $$0,
         i,
         czl.a(czl.a($$3.b(awf.bz), 2, 3, czl.a(10, 10), czl.a(25, 10), 4, bso.e))
            .a($$2.b(avz.c))
            .a(czm.l, new daa("enchantment.depth_strider", buj.E, czs.b(0.33333334F), buh.a.a, UUID.fromString("11dc269a-4476-46c0-aff3-9e17d7eb6801")))
      );
      a(
         $$0,
         j,
         czl.a(czl.a($$3.b(awf.bz), 2, 2, czl.a(10, 10), czl.a(25, 10), 4, bso.e))
            .a($$2.b(avz.c))
            .a(czm.d, czy.a, ety.a(bj.a.a().a(ea.a(avy.F)).a(ea.b(avy.e))))
            .a(
               czm.n,
               new dak(
                  new czs.a(czs.a(3.0F, 1.0F), 0.0F, 16.0F),
                  czs.a(1.0F),
                  new ke(0, -1, 0),
                  Optional.of(dzm.a(dzm.a(new ke(0, 1, 0), dfj.a), dzm.a(dfj.G), dzm.f())),
                  efp.a(dfj.kI),
                  Optional.of(dxg.i)
               ),
               eui.a(equ.b.a, bu.a.a().a(bs.a.a().a(true)))
            )
      );
      a($$0, k, czl.a(czl.a($$3.b(awf.bO), 1, 1, czl.a(25), czl.a(50), 8, bso.i)).a(czm.E));
      bu.a $$5 = bu.a.a().a(5).a(bs.a.a().f(false).a(true)).a(dg.b(de.c.b(1.0E-5F))).b(dc.a.a().a(av.a.a().a(avw.aN)));
      a(
         $$0,
         l,
         czl.a(czl.a($$3.b(awf.bz), 1, 3, czl.a(10, 10), czl.a(25, 10), 8, bso.e))
            .a(
               czm.n,
               new daa("Soul speed boost", buj.v, czs.a(0.0405F, 0.0105F), buh.a.a, UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038")),
               ets.a(
                  euc.a(eui.a(equ.b.a, bu.a.a().a(bu.a.a()))),
                  ett.a(
                     ets.a(
                        etz.c(),
                        eui.a(equ.b.a, bu.a.a().a(bs.a.a().f(false))),
                        ett.a(eui.a(equ.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avw.aN)))), eui.a(equ.b.a, bu.a.a().a(bs.a.a().a(false)).b()))
                     ),
                     ets.a(etz.d(), eui.a(equ.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avw.aN))).a(bs.a.a().f(false))))
                  )
               )
            )
            .a(
               czm.n,
               new daa("Soul speed movement efficiency", buj.u, czs.a(1.0F), buh.a.a, UUID.fromString("b9716dbd-50df-4080-850e-70347d24e687")),
               eui.a(equ.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avw.aN))))
            )
            .a(czm.n, new czz(czs.a(1.0F)), ets.a(euk.a(euz.a(czs.a(0.04F))), eui.a(equ.b.a, bu.a.a().a(bs.a.a().a(true)).b(dc.a.a().a(av.a.a().a(avw.aN))))))
            .a(czm.o, new dao(lj.M, dao.b(), dao.a(0.1F), dao.b(-0.2F), dao.a(bph.a(0.1F)), bph.a(1.0F)), eui.a(equ.b.a, $$5))
            .a(czm.o, new dah(avh.xQ, bph.a(0.6F), bpq.b(0.6F, 1.0F)), ets.a(euk.a(0.35F), eui.a(equ.b.a, $$5)))
      );
      a(
         $$0,
         m,
         czl.a(czl.a($$3.b(awf.bA), 1, 3, czl.a(25, 25), czl.a(75, 25), 8, bso.f))
            .a(czm.l, new daa("enchantment.swift_sneak", buj.z, czs.b(0.15F), buh.a.a, UUID.fromString("92437d00-c3a7-4f2e-8f6c-1f21585d5dd0")))
      );
      a($$0, n, czl.a(czl.a($$3.b(awf.bH), $$3.b(awf.bE), 10, 5, czl.a(1, 11), czl.a(21, 11), 1, bso.b)).a($$2.b(avz.f)).a(czm.e, new czu(czs.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         czl.a(czl.a($$3.b(awf.bH), $$3.b(awf.bE), 5, 5, czl.a(5, 8), czl.a(25, 8), 2, bso.b))
            .a($$2.b(avz.f))
            .a(czm.e, new czu(czs.b(2.5F)), eui.a(equ.b.a, bu.a.a().a(bx.a(awa.D))))
      );
      a(
         $$0,
         p,
         czl.a(czl.a($$3.b(awf.bH), $$3.b(awf.bE), 5, 5, czl.a(5, 8), czl.a(25, 8), 2, bso.b))
            .a($$2.b(avz.f))
            .a(czm.e, new czu(czs.b(2.5F)), eui.a(equ.b.a, bu.a.a().a(bx.a(awa.C))))
            .a(
               czm.i,
               czp.a,
               czp.c,
               new czw(jn.a(brq.b), czs.a(1.5F), czs.a(1.5F, 0.5F), czs.a(3.0F), czs.a(3.0F)),
               eui.a(equ.b.a, bu.a.a().a(bx.a(awa.C))).and(ety.a(bj.a.a().a(true)))
            )
      );
      a($$0, q, czl.a(czl.a($$3.b(awf.bE), 5, 2, czl.a(5, 20), czl.a(55, 20), 2, bso.b)).a(czm.g, new czu(czs.b(1.0F))));
      a(
         $$0,
         r,
         czl.a(czl.a($$3.b(awf.bF), $$3.b(awf.bE), 2, 2, czl.a(10, 20), czl.a(60, 20), 4, bso.b))
            .a(czm.i, czp.a, czp.c, new daf(czs.b(4.0F)), ety.a(bj.a.a().a(true)))
            .a(
               czm.j,
               czv.a(new dam(cwm.a.a(dfw.g, true), ke.g, Optional.of(dxg.c)), new czz(czs.a(1.0F))),
               eud.a(dc.a.a().a(av.a.a().a(avw.cA).a(dy.a.a().a(dta.r, false))).a(cc.a.a().a(eoi.a)))
            )
      );
      a(
         $$0,
         s,
         czl.a(czl.a($$3.b(awf.bE), 2, 3, czl.a(15, 9), czl.a(65, 9), 4, bso.b))
            .a(czm.m, czp.a, czp.c, new czu(czs.b(0.01F)), eui.a(equ.b.b, bu.a.a().a(bx.a(bsm.by))))
      );
      a(
         $$0,
         t,
         czl.a(czl.a($$3.b(awf.bE), 2, 3, czl.a(5, 9), czl.a(20, 9), 4, bso.b))
            .a(
               czm.l,
               new daa(
                  "enchantment.sweeping_edge",
                  buj.D,
                  new czs.c(czs.b(1.0F), czs.a(2.0F, 1.0F)),
                  buh.a.a,
                  UUID.fromString("5d3d087b-debe-4037-b53e-d84f3ff51f17")
               )
            )
      );
      a(
         $$0,
         u,
         czl.a(czl.a($$3.b(awf.bI), 10, 5, czl.a(1, 10), czl.a(51, 10), 1, bso.b))
            .a(czm.l, new daa("enchantment.efficiency", buj.t, new czs.d(1.0F), buh.a.a, UUID.fromString("3ceb37c0-db62-46b5-bd02-785457b01d96")))
      );
      a($$0, v, czl.a(czl.a($$3.b(awf.bJ), 1, 1, czl.a(15), czl.a(65), 8, bso.b)).a($$2.b(avz.g)).a(czm.x, new dan(czs.a(0.0F))));
      a(
         $$0,
         w,
         czl.a(czl.a($$3.b(awf.bM), 5, 3, czl.a(5, 8), czl.a(55, 8), 2, bso.a))
            .a(czm.k, new dai(new czs.c(czs.b(2.0F), czs.a(10.0F, 5.0F))), eum.a(cp.a.a().a(awf.bD)))
            .a(czm.k, new dai(new czs.c(czs.b(1.0F), czs.a(2.0F, 1.0F))), euc.a(eum.a(cp.a.a().a(awf.bD))))
      );
      a($$0, x, czl.a(czl.a($$3.b(awf.bJ), 2, 3, czl.a(15, 9), czl.a(65, 9), 4, bso.b)).a($$2.b(avz.g)));
      a($$0, y, czl.a(czl.a($$3.b(awf.bN), 10, 5, czl.a(1, 10), czl.a(16, 10), 1, bso.b)).a(czm.e, new czu(czs.b(0.5F)), eui.a(equ.b.c, bu.a.a().a(awa.f).b())));
      a($$0, z, czl.a(czl.a($$3.b(awf.bN), 2, 2, czl.a(12, 20), czl.a(37, 20), 4, bso.b)).a(czm.g, new czu(czs.b(1.0F)), eui.a(equ.b.c, bu.a.a().a(awa.f).b())));
      a($$0, A, czl.a(czl.a($$3.b(awf.bN), 2, 1, czl.a(20), czl.a(50), 4, bso.b)).a(czm.r, new daf(czs.a(100.0F))));
      a($$0, B, czl.a(czl.a($$3.b(awf.bN), 1, 1, czl.a(20), czl.a(50), 8, bso.b)).a($$2.b(avz.d)).a(czm.p, new dan(czs.a(0.0F)), eum.a(cp.a.a().a(cuf.ow))));
      a($$0, C, czl.a(czl.a($$3.b(awf.bK), 2, 3, czl.a(15, 9), czl.a(65, 9), 4, bso.b)).a(czm.w, new czu(czs.b(1.0F))));
      a($$0, D, czl.a(czl.a($$3.b(awf.bK), 2, 3, czl.a(15, 9), czl.a(65, 9), 4, bso.b)).a(czm.v, new czu(czs.b(5.0F))));
      a($$0, E, czl.a(czl.a($$3.b(awf.bL), 5, 3, czl.a(12, 7), czl.a(50), 2, bso.b)).a(czm.u, new czu(czs.b(1.0F))));
      a(
         $$0,
         F,
         czl.a(czl.a($$3.b(awf.bL), 2, 5, czl.a(1, 8), czl.a(21, 8), 4, bso.b))
            .a($$2.b(avz.f))
            .a(czm.e, new czu(czs.b(2.5F)), eui.a(equ.b.a, bu.a.a().a(bx.a(awa.B)).b()))
      );
      a(
         $$0,
         G,
         czl.a(czl.a($$3.b(awf.bL), 2, 3, czl.a(17, 7), czl.a(50), 4, bso.d))
            .a($$2.b(avz.h))
            .b(czm.F, new czu(czs.a(1.5F, 0.75F)))
            .b(czm.C, List.of(avh.zD, avh.zE, avh.zF))
      );
      a(
         $$0,
         H,
         czl.a(czl.a($$3.b(awf.bL), 1, 1, czl.a(25), czl.a(50), 8, bso.b))
            .a(
               czm.i,
               czp.a,
               czp.c,
               czv.a(new dap(jn.a(bsm.am.r()), false), new dah(avh.zH, bph.a(5.0F), bph.a(1.0F))),
               ets.a(eup.c().b(true), eui.a(equ.b.a, bu.a.a().a(dc.a.a().b(true))), eui.a(equ.b.c, bu.a.a().a(bsm.bf)))
            )
            .a(
               czm.j,
               czv.a(new dap(jn.a(bsm.am.r()), false), new dah(avh.zH, bph.a(5.0F), bph.a(1.0F))),
               ets.a(eup.c().b(true), eui.a(equ.b.a, bu.a.a().a(bsm.bf).a(dc.a.a().b(true).a(av.a.a().a(dfj.ss)))))
            )
      );
      a(
         $$0,
         I,
         czl.a(czl.a($$3.b(awf.bP), 2, 1, czl.a(20), czl.a(50), 4, bso.b)).a($$2.b(avz.e)).a(czm.t, new czu(czs.b(2.0F))).a(czm.s, new czu(czs.b(10.0F)))
      );
      a(
         $$0,
         J,
         czl.a(czl.a($$3.b(awf.bP), 5, 3, czl.a(12, 20), czl.a(50), 2, bso.b))
            .b(czm.A, new czu(czs.b(-0.25F)))
            .b(
               czm.B,
               List.of(
                  new csp.a(Optional.of(avh.gr), Optional.empty(), Optional.of(avh.go)),
                  new csp.a(Optional.of(avh.gs), Optional.empty(), Optional.of(avh.go)),
                  new csp.a(Optional.of(avh.gt), Optional.empty(), Optional.of(avh.go))
               )
            )
      );
      a($$0, K, czl.a(czl.a($$3.b(awf.bP), 10, 4, czl.a(1, 10), czl.a(50), 1, bso.b)).a($$2.b(avz.e)).a(czm.q, new czu(czs.b(1.0F))));
      a($$0, L, czl.a(czl.a($$3.b(awf.bR), 5, 5, czl.a(5, 8), czl.a(25, 8), 2, bso.b)).a($$2.b(avz.f)).a(czm.f, new czu(czs.b(0.5F))));
      a($$0, M, czl.a(czl.a($$3.b(awf.bR), 2, 4, czl.a(15, 9), czl.a(65, 9), 4, bso.b)).a($$2.b(avz.f)).a(czm.h, new czu(czs.b(-0.15F))));
      a(
         $$0,
         N,
         czl.a(czl.a($$3.b(awf.bR), 2, 3, czl.a(15, 9), czl.a(65, 9), 4, bso.b))
            .a(
               czm.i,
               czp.a,
               czp.a,
               new dae(
                  false,
                  Optional.empty(),
                  Optional.of(czs.a(0.5F, 0.25F)),
                  $$4.a(avw.cy).map(Function.identity()),
                  ewf.b,
                  czs.a(3.5F),
                  false,
                  dcf.a.e,
                  lj.A,
                  lj.z,
                  avh.Cp
               ),
               eui.a(equ.b.b, bu.a.a().a(bs.a.a().f(false)).a(dg.d(de.c.b(1.5))))
            )
      );
      a($$0, O, czl.a(czl.a($$3.b(awf.bM), 2, 1, czl.a(25, 25), czl.a(75, 25), 4, bso.a)).a(czm.z, new dag(czs.a(2.0F))));
      a($$0, P, czl.a(czl.a($$3.b(awf.bQ), 1, 1, czl.a(25), czl.a(50), 8, bso.a)).a(czm.D));
   }

   private static void a(qm<czl> $$0, akj<czl> $$1, czl.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akj<czl> a(String $$0) {
      return akj.a(lr.aK, new akk($$0));
   }
}
