import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class czr {
   public static final akj<czm> a = a("protection");
   public static final akj<czm> b = a("fire_protection");
   public static final akj<czm> c = a("feather_falling");
   public static final akj<czm> d = a("blast_protection");
   public static final akj<czm> e = a("projectile_protection");
   public static final akj<czm> f = a("respiration");
   public static final akj<czm> g = a("aqua_affinity");
   public static final akj<czm> h = a("thorns");
   public static final akj<czm> i = a("depth_strider");
   public static final akj<czm> j = a("frost_walker");
   public static final akj<czm> k = a("binding_curse");
   public static final akj<czm> l = a("soul_speed");
   public static final akj<czm> m = a("swift_sneak");
   public static final akj<czm> n = a("sharpness");
   public static final akj<czm> o = a("smite");
   public static final akj<czm> p = a("bane_of_arthropods");
   public static final akj<czm> q = a("knockback");
   public static final akj<czm> r = a("fire_aspect");
   public static final akj<czm> s = a("looting");
   public static final akj<czm> t = a("sweeping_edge");
   public static final akj<czm> u = a("efficiency");
   public static final akj<czm> v = a("silk_touch");
   public static final akj<czm> w = a("unbreaking");
   public static final akj<czm> x = a("fortune");
   public static final akj<czm> y = a("power");
   public static final akj<czm> z = a("punch");
   public static final akj<czm> A = a("flame");
   public static final akj<czm> B = a("infinity");
   public static final akj<czm> C = a("luck_of_the_sea");
   public static final akj<czm> D = a("lure");
   public static final akj<czm> E = a("loyalty");
   public static final akj<czm> F = a("impaling");
   public static final akj<czm> G = a("riptide");
   public static final akj<czm> H = a("channeling");
   public static final akj<czm> I = a("multishot");
   public static final akj<czm> J = a("quick_charge");
   public static final akj<czm> K = a("piercing");
   public static final akj<czm> L = a("density");
   public static final akj<czm> M = a("breach");
   public static final akj<czm> N = a("wind_burst");
   public static final akj<czm> O = a("mending");
   public static final akj<czm> P = a("vanishing_curse");

   public static void a(qm<czm> $$0) {
      jk<brc> $$1 = $$0.a(lr.s);
      jk<czm> $$2 = $$0.a(lr.aK);
      jk<cty> $$3 = $$0.a(lr.K);
      jk<dfi> $$4 = $$0.a(lr.f);
      a(
         $$0,
         a,
         czm.a(czm.a($$3.b(awf.bD), 10, 4, czm.a(1, 11), czm.a(12, 11), 1, bsp.i))
            .a($$2.b(avz.b))
            .a(czn.c, new czv(czt.b(1.0F)), eua.a(bj.a.a().a(ea.b(avy.e))))
      );
      a(
         $$0,
         b,
         czm.a(czm.a($$3.b(awf.bD), 5, 4, czm.a(10, 8), czm.a(18, 8), 2, bsp.i))
            .a($$2.b(avz.b))
            .a(czn.c, new czv(czt.b(2.0F)), etu.a(eua.a(bj.a.a().a(ea.a(avy.j)).a(ea.b(avy.e)))))
            .a(czn.l, new dab("enchantment.fire_protection", buk.h, czt.b(-0.15F), bui.a.b, UUID.fromString("b572ecd2-ac0c-4071-abde-9594af072a37")))
      );
      a(
         $$0,
         c,
         czm.a(czm.a($$3.b(awf.bz), 5, 4, czm.a(5, 6), czm.a(11, 6), 2, bsp.i)).a(czn.c, new czv(czt.b(3.0F)), eua.a(bj.a.a().a(ea.a(avy.n)).a(ea.b(avy.e))))
      );
      a(
         $$0,
         d,
         czm.a(czm.a($$3.b(awf.bD), 2, 4, czm.a(5, 8), czm.a(13, 8), 4, bsp.i))
            .a($$2.b(avz.b))
            .a(czn.c, new czv(czt.b(2.0F)), eua.a(bj.a.a().a(ea.a(avy.m)).a(ea.b(avy.e))))
            .a(czn.l, new dab("enchantment.blast_protection", buk.i, czt.b(0.15F), bui.a.a, UUID.fromString("40a9968f-5c66-4e2f-b7f4-2ec2f4b3e450")))
      );
      a(
         $$0,
         e,
         czm.a(czm.a($$3.b(awf.bD), 5, 4, czm.a(3, 6), czm.a(9, 6), 2, bsp.i))
            .a($$2.b(avz.b))
            .a(czn.c, new czv(czt.b(2.0F)), eua.a(bj.a.a().a(ea.a(avy.k)).a(ea.b(avy.e))))
      );
      a(
         $$0,
         f,
         czm.a(czm.a($$3.b(awf.bC), 2, 3, czm.a(10, 10), czm.a(40, 10), 4, bsp.h))
            .a(czn.l, new dab("enchantment.respiration", buk.w, czt.b(1.0F), bui.a.a, UUID.fromString("07a65791-f64d-4e79-86c7-f83932f007ec")))
      );
      a(
         $$0,
         g,
         czm.a(czm.a($$3.b(awf.bC), 2, 1, czm.a(1), czm.a(41), 4, bsp.h))
            .a(czn.l, new dab("enchantment.aqua_affinity", buk.C, czt.b(4.0F), bui.a.c, UUID.fromString("60b1b7db-fffd-4ad0-817c-d6c6a93d8a45")))
      );
      a(
         $$0,
         h,
         czm.a(czm.a($$3.b(awf.bD), $$3.b(awf.bB), 1, 3, czm.a(10, 20), czm.a(60, 20), 8, bsp.a))
            .a(czn.i, czq.c, czq.a, czw.a(new czy(czt.a(1.0F), czt.a(5.0F), $$1.b(brd.O)), new daa(czt.a(2.0F))), eum.a(evb.a(czt.b(0.15F))))
      );
      a(
         $$0,
         i,
         czm.a(czm.a($$3.b(awf.bz), 2, 3, czm.a(10, 10), czm.a(25, 10), 4, bsp.e))
            .a($$2.b(avz.c))
            .a(czn.l, new dab("enchantment.depth_strider", buk.E, czt.b(0.33333334F), bui.a.a, UUID.fromString("11dc269a-4476-46c0-aff3-9e17d7eb6801")))
      );
      a(
         $$0,
         j,
         czm.a(czm.a($$3.b(awf.bz), 2, 2, czm.a(10, 10), czm.a(25, 10), 4, bsp.e))
            .a($$2.b(avz.c))
            .a(czn.d, czz.a, eua.a(bj.a.a().a(ea.a(avy.F)).a(ea.b(avy.e))))
            .a(
               czn.n,
               new dal(
                  new czt.a(czt.a(3.0F, 1.0F), 0.0F, 16.0F),
                  czt.a(1.0F),
                  new ke(0, -1, 0),
                  Optional.of(dzn.a(dzn.a(new ke(0, 1, 0), dfk.a), dzn.a(dfk.G), dzn.f())),
                  efq.a(dfk.kI),
                  Optional.of(dxh.i)
               ),
               euk.a(eqw.b.a, bu.a.a().a(bs.a.a().a(true)))
            )
      );
      a($$0, k, czm.a(czm.a($$3.b(awf.bO), 1, 1, czm.a(25), czm.a(50), 8, bsp.i)).a(czn.E));
      bu.a $$5 = bu.a.a().a(5).a(bs.a.a().f(false).a(true)).a(dg.b(de.c.b(1.0E-5F))).c(dc.a.a().a(av.a.a().a(avw.aN)));
      a(
         $$0,
         l,
         czm.a(czm.a($$3.b(awf.bz), 1, 3, czm.a(10, 10), czm.a(25, 10), 8, bsp.e))
            .a(
               czn.n,
               new dab("Soul speed boost", buk.v, czt.a(0.0405F, 0.0105F), bui.a.a, UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038")),
               etu.a(
                  eue.a(euk.a(eqw.b.a, bu.a.a().a(bu.a.a()))),
                  etv.a(
                     etu.a(
                        eub.c(),
                        euk.a(eqw.b.a, bu.a.a().a(bs.a.a().f(false))),
                        etv.a(euk.a(eqw.b.a, bu.a.a().c(dc.a.a().a(av.a.a().a(avw.aN)))), euk.a(eqw.b.a, bu.a.a().a(bs.a.a().a(false)).b()))
                     ),
                     etu.a(eub.d(), euk.a(eqw.b.a, bu.a.a().c(dc.a.a().a(av.a.a().a(avw.aN))).a(bs.a.a().f(false))))
                  )
               )
            )
            .a(
               czn.n,
               new dab("Soul speed movement efficiency", buk.u, czt.a(1.0F), bui.a.a, UUID.fromString("b9716dbd-50df-4080-850e-70347d24e687")),
               euk.a(eqw.b.a, bu.a.a().c(dc.a.a().a(av.a.a().a(avw.aN))))
            )
            .a(czn.n, new daa(czt.a(1.0F)), etu.a(eum.a(evb.a(czt.a(0.04F))), euk.a(eqw.b.a, bu.a.a().a(bs.a.a().a(true)).c(dc.a.a().a(av.a.a().a(avw.aN))))))
            .a(czn.o, new dap(lj.M, dap.b(), dap.a(0.1F), dap.b(-0.2F), dap.a(bpi.a(0.1F)), bpi.a(1.0F)), euk.a(eqw.b.a, $$5))
            .a(czn.o, new dai(avh.xQ, bpi.a(0.6F), bpr.b(0.6F, 1.0F)), etu.a(eum.a(0.35F), euk.a(eqw.b.a, $$5)))
      );
      a(
         $$0,
         m,
         czm.a(czm.a($$3.b(awf.bA), 1, 3, czm.a(25, 25), czm.a(75, 25), 8, bsp.f))
            .a(czn.l, new dab("enchantment.swift_sneak", buk.z, czt.b(0.15F), bui.a.a, UUID.fromString("92437d00-c3a7-4f2e-8f6c-1f21585d5dd0")))
      );
      a($$0, n, czm.a(czm.a($$3.b(awf.bH), $$3.b(awf.bE), 10, 5, czm.a(1, 11), czm.a(21, 11), 1, bsp.b)).a($$2.b(avz.f)).a(czn.e, new czv(czt.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         czm.a(czm.a($$3.b(awf.bH), $$3.b(awf.bE), 5, 5, czm.a(5, 8), czm.a(25, 8), 2, bsp.b))
            .a($$2.b(avz.f))
            .a(czn.e, new czv(czt.b(2.5F)), euk.a(eqw.b.a, bu.a.a().a(bx.a(awa.D))))
      );
      a(
         $$0,
         p,
         czm.a(czm.a($$3.b(awf.bH), $$3.b(awf.bE), 5, 5, czm.a(5, 8), czm.a(25, 8), 2, bsp.b))
            .a($$2.b(avz.f))
            .a(czn.e, new czv(czt.b(2.5F)), euk.a(eqw.b.a, bu.a.a().a(bx.a(awa.C))))
            .a(
               czn.i,
               czq.a,
               czq.c,
               new czx(jn.a(brr.b), czt.a(1.5F), czt.a(1.5F, 0.5F), czt.a(3.0F), czt.a(3.0F)),
               euk.a(eqw.b.a, bu.a.a().a(bx.a(awa.C))).and(eua.a(bj.a.a().a(true)))
            )
      );
      a($$0, q, czm.a(czm.a($$3.b(awf.bE), 5, 2, czm.a(5, 20), czm.a(55, 20), 2, bsp.b)).a(czn.g, new czv(czt.b(1.0F))));
      a(
         $$0,
         r,
         czm.a(czm.a($$3.b(awf.bF), $$3.b(awf.bE), 2, 2, czm.a(10, 20), czm.a(60, 20), 4, bsp.b))
            .a(czn.i, czq.a, czq.c, new dag(czt.b(4.0F)), eua.a(bj.a.a().a(true)))
            .a(
               czn.j,
               czw.a(new dan(cwn.a.a(dfx.g, true), ke.g, Optional.of(dxh.c)), new daa(czt.a(1.0F))),
               euf.a(dc.a.a().a(av.a.a().a(avw.cA).a(dy.a.a().a(dtb.r, false))).a(cc.a.a().a(eok.a)))
            )
      );
      a(
         $$0,
         s,
         czm.a(czm.a($$3.b(awf.bE), 2, 3, czm.a(15, 9), czm.a(65, 9), 4, bsp.b))
            .a(czn.m, czq.a, czq.c, new czv(czt.b(0.01F)), euk.a(eqw.b.b, bu.a.a().a(bx.a(bsn.by))))
      );
      a(
         $$0,
         t,
         czm.a(czm.a($$3.b(awf.bE), 2, 3, czm.a(5, 9), czm.a(20, 9), 4, bsp.b))
            .a(
               czn.l,
               new dab(
                  "enchantment.sweeping_edge",
                  buk.D,
                  new czt.c(czt.b(1.0F), czt.a(2.0F, 1.0F)),
                  bui.a.a,
                  UUID.fromString("5d3d087b-debe-4037-b53e-d84f3ff51f17")
               )
            )
      );
      a(
         $$0,
         u,
         czm.a(czm.a($$3.b(awf.bI), 10, 5, czm.a(1, 10), czm.a(51, 10), 1, bsp.b))
            .a(czn.l, new dab("enchantment.efficiency", buk.t, new czt.d(1.0F), bui.a.a, UUID.fromString("3ceb37c0-db62-46b5-bd02-785457b01d96")))
      );
      a($$0, v, czm.a(czm.a($$3.b(awf.bJ), 1, 1, czm.a(15), czm.a(65), 8, bsp.b)).a($$2.b(avz.g)).a(czn.x, new dao(czt.a(0.0F))));
      a(
         $$0,
         w,
         czm.a(czm.a($$3.b(awf.bM), 5, 3, czm.a(5, 8), czm.a(55, 8), 2, bsp.a))
            .a(czn.k, new daj(new czt.c(czt.b(2.0F), czt.a(10.0F, 5.0F))), euo.a(cp.a.a().a(awf.bD)))
            .a(czn.k, new daj(new czt.c(czt.b(1.0F), czt.a(2.0F, 1.0F))), eue.a(euo.a(cp.a.a().a(awf.bD))))
      );
      a($$0, x, czm.a(czm.a($$3.b(awf.bJ), 2, 3, czm.a(15, 9), czm.a(65, 9), 4, bsp.b)).a($$2.b(avz.g)));
      a($$0, y, czm.a(czm.a($$3.b(awf.bN), 10, 5, czm.a(1, 10), czm.a(16, 10), 1, bsp.b)).a(czn.e, new czv(czt.b(0.5F)), euk.a(eqw.b.c, bu.a.a().a(awa.f).b())));
      a($$0, z, czm.a(czm.a($$3.b(awf.bN), 2, 2, czm.a(12, 20), czm.a(37, 20), 4, bsp.b)).a(czn.g, new czv(czt.b(1.0F)), euk.a(eqw.b.c, bu.a.a().a(awa.f).b())));
      a($$0, A, czm.a(czm.a($$3.b(awf.bN), 2, 1, czm.a(20), czm.a(50), 4, bsp.b)).a(czn.r, new dag(czt.a(100.0F))));
      a($$0, B, czm.a(czm.a($$3.b(awf.bN), 1, 1, czm.a(20), czm.a(50), 8, bsp.b)).a($$2.b(avz.d)).a(czn.p, new dao(czt.a(0.0F)), euo.a(cp.a.a().a(cug.ow))));
      a($$0, C, czm.a(czm.a($$3.b(awf.bK), 2, 3, czm.a(15, 9), czm.a(65, 9), 4, bsp.b)).a(czn.w, new czv(czt.b(1.0F))));
      a($$0, D, czm.a(czm.a($$3.b(awf.bK), 2, 3, czm.a(15, 9), czm.a(65, 9), 4, bsp.b)).a(czn.v, new czv(czt.b(5.0F))));
      a($$0, E, czm.a(czm.a($$3.b(awf.bL), 5, 3, czm.a(12, 7), czm.a(50), 2, bsp.b)).a(czn.u, new czv(czt.b(1.0F))));
      a(
         $$0,
         F,
         czm.a(czm.a($$3.b(awf.bL), 2, 5, czm.a(1, 8), czm.a(21, 8), 4, bsp.b))
            .a($$2.b(avz.f))
            .a(czn.e, new czv(czt.b(2.5F)), euk.a(eqw.b.a, bu.a.a().a(bx.a(awa.B)).b()))
      );
      a(
         $$0,
         G,
         czm.a(czm.a($$3.b(awf.bL), 2, 3, czm.a(17, 7), czm.a(50), 4, bsp.d))
            .a($$2.b(avz.h))
            .b(czn.F, new czv(czt.a(1.5F, 0.75F)))
            .b(czn.C, List.of(avh.zD, avh.zE, avh.zF))
      );
      a(
         $$0,
         H,
         czm.a(czm.a($$3.b(awf.bL), 1, 1, czm.a(25), czm.a(50), 8, bsp.b))
            .a(
               czn.i,
               czq.a,
               czq.c,
               czw.a(new daq(jn.a(bsn.am.r()), false), new dai(avh.zH, bpi.a(5.0F), bpi.a(1.0F))),
               etu.a(eur.c().b(true), euk.a(eqw.b.a, bu.a.a().a(dc.a.a().b(true))), euk.a(eqw.b.c, bu.a.a().a(bsn.bf)))
            )
            .a(
               czn.j,
               czw.a(new daq(jn.a(bsn.am.r()), false), new dai(avh.zH, bpi.a(5.0F), bpi.a(1.0F))),
               etu.a(eur.c().b(true), euk.a(eqw.b.a, bu.a.a().a(bsn.bf).a(dc.a.a().b(true).a(av.a.a().a(dfk.ss)))))
            )
      );
      a(
         $$0,
         I,
         czm.a(czm.a($$3.b(awf.bP), 2, 1, czm.a(20), czm.a(50), 4, bsp.b)).a($$2.b(avz.e)).a(czn.t, new czv(czt.b(2.0F))).a(czn.s, new czv(czt.b(10.0F)))
      );
      a(
         $$0,
         J,
         czm.a(czm.a($$3.b(awf.bP), 5, 3, czm.a(12, 20), czm.a(50), 2, bsp.b))
            .b(czn.A, new czv(czt.b(-0.25F)))
            .b(
               czn.B,
               List.of(
                  new csq.a(Optional.of(avh.gr), Optional.empty(), Optional.of(avh.go)),
                  new csq.a(Optional.of(avh.gs), Optional.empty(), Optional.of(avh.go)),
                  new csq.a(Optional.of(avh.gt), Optional.empty(), Optional.of(avh.go))
               )
            )
      );
      a($$0, K, czm.a(czm.a($$3.b(awf.bP), 10, 4, czm.a(1, 10), czm.a(50), 1, bsp.b)).a($$2.b(avz.e)).a(czn.q, new czv(czt.b(1.0F))));
      a($$0, L, czm.a(czm.a($$3.b(awf.bR), 5, 5, czm.a(5, 8), czm.a(25, 8), 2, bsp.b)).a($$2.b(avz.f)).a(czn.f, new czv(czt.b(0.5F))));
      a($$0, M, czm.a(czm.a($$3.b(awf.bR), 2, 4, czm.a(15, 9), czm.a(65, 9), 4, bsp.b)).a($$2.b(avz.f)).a(czn.h, new czv(czt.b(-0.15F))));
      a(
         $$0,
         N,
         czm.a(czm.a($$3.b(awf.bR), 2, 3, czm.a(15, 9), czm.a(65, 9), 4, bsp.b))
            .a(
               czn.i,
               czq.a,
               czq.a,
               new daf(
                  false,
                  Optional.empty(),
                  Optional.of(czt.a(0.5F, 0.25F)),
                  $$4.a(avw.cy).map(Function.identity()),
                  ewh.b,
                  czt.a(3.5F),
                  false,
                  dcg.a.e,
                  lj.A,
                  lj.z,
                  avh.Cp
               ),
               euk.a(eqw.b.b, bu.a.a().a(bs.a.a().f(false)).a(dg.d(de.c.b(1.5))))
            )
      );
      a($$0, O, czm.a(czm.a($$3.b(awf.bM), 2, 1, czm.a(25, 25), czm.a(75, 25), 4, bsp.a)).a(czn.z, new dah(czt.a(2.0F))));
      a($$0, P, czm.a(czm.a($$3.b(awf.bQ), 1, 1, czm.a(25), czm.a(50), 8, bsp.a)).a(czn.D));
   }

   private static void a(qm<czm> $$0, akj<czm> $$1, czm.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akj<czm> a(String $$0) {
      return akj.a(lr.aK, new akk($$0));
   }
}
