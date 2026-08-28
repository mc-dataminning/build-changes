import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class czo {
   public static final akj<czj> a = a("protection");
   public static final akj<czj> b = a("fire_protection");
   public static final akj<czj> c = a("feather_falling");
   public static final akj<czj> d = a("blast_protection");
   public static final akj<czj> e = a("projectile_protection");
   public static final akj<czj> f = a("respiration");
   public static final akj<czj> g = a("aqua_affinity");
   public static final akj<czj> h = a("thorns");
   public static final akj<czj> i = a("depth_strider");
   public static final akj<czj> j = a("frost_walker");
   public static final akj<czj> k = a("binding_curse");
   public static final akj<czj> l = a("soul_speed");
   public static final akj<czj> m = a("swift_sneak");
   public static final akj<czj> n = a("sharpness");
   public static final akj<czj> o = a("smite");
   public static final akj<czj> p = a("bane_of_arthropods");
   public static final akj<czj> q = a("knockback");
   public static final akj<czj> r = a("fire_aspect");
   public static final akj<czj> s = a("looting");
   public static final akj<czj> t = a("sweeping_edge");
   public static final akj<czj> u = a("efficiency");
   public static final akj<czj> v = a("silk_touch");
   public static final akj<czj> w = a("unbreaking");
   public static final akj<czj> x = a("fortune");
   public static final akj<czj> y = a("power");
   public static final akj<czj> z = a("punch");
   public static final akj<czj> A = a("flame");
   public static final akj<czj> B = a("infinity");
   public static final akj<czj> C = a("luck_of_the_sea");
   public static final akj<czj> D = a("lure");
   public static final akj<czj> E = a("loyalty");
   public static final akj<czj> F = a("impaling");
   public static final akj<czj> G = a("riptide");
   public static final akj<czj> H = a("channeling");
   public static final akj<czj> I = a("multishot");
   public static final akj<czj> J = a("quick_charge");
   public static final akj<czj> K = a("piercing");
   public static final akj<czj> L = a("density");
   public static final akj<czj> M = a("breach");
   public static final akj<czj> N = a("wind_burst");
   public static final akj<czj> O = a("mending");
   public static final akj<czj> P = a("vanishing_curse");

   public static void a(qm<czj> $$0) {
      jk<bqy> $$1 = $$0.a(lr.s);
      jk<czj> $$2 = $$0.a(lr.aK);
      jk<ctv> $$3 = $$0.a(lr.K);
      jk<dff> $$4 = $$0.a(lr.f);
      a(
         $$0,
         a,
         czj.a(czj.a($$3.b(awd.bD), 10, 4, czj.a(1, 11), czj.a(12, 11), 1, bsl.i))
            .a($$2.b(avx.b))
            .a(czk.c, new czs(czq.b(1.0F)), ets.a(bj.a.a().a(ea.b(avw.e))))
      );
      a(
         $$0,
         b,
         czj.a(czj.a($$3.b(awd.bD), 5, 4, czj.a(10, 8), czj.a(18, 8), 2, bsl.i))
            .a($$2.b(avx.b))
            .a(czk.c, new czs(czq.b(2.0F)), etm.a(ets.a(bj.a.a().a(ea.a(avw.j)).a(ea.b(avw.e)))))
            .a(czk.l, new czy("enchantment.fire_protection", bug.h, czq.b(-0.15F), bue.a.b, UUID.fromString("b572ecd2-ac0c-4071-abde-9594af072a37")))
      );
      a(
         $$0,
         c,
         czj.a(czj.a($$3.b(awd.bz), 5, 4, czj.a(5, 6), czj.a(11, 6), 2, bsl.i)).a(czk.c, new czs(czq.b(3.0F)), ets.a(bj.a.a().a(ea.a(avw.n)).a(ea.b(avw.e))))
      );
      a(
         $$0,
         d,
         czj.a(czj.a($$3.b(awd.bD), 2, 4, czj.a(5, 8), czj.a(13, 8), 4, bsl.i))
            .a($$2.b(avx.b))
            .a(czk.c, new czs(czq.b(2.0F)), ets.a(bj.a.a().a(ea.a(avw.m)).a(ea.b(avw.e))))
            .a(czk.l, new czy("enchantment.blast_protection", bug.i, czq.b(0.15F), bue.a.a, UUID.fromString("40a9968f-5c66-4e2f-b7f4-2ec2f4b3e450")))
      );
      a(
         $$0,
         e,
         czj.a(czj.a($$3.b(awd.bD), 5, 4, czj.a(3, 6), czj.a(9, 6), 2, bsl.i))
            .a($$2.b(avx.b))
            .a(czk.c, new czs(czq.b(2.0F)), ets.a(bj.a.a().a(ea.a(avw.k)).a(ea.b(avw.e))))
      );
      a(
         $$0,
         f,
         czj.a(czj.a($$3.b(awd.bC), 2, 3, czj.a(10, 10), czj.a(40, 10), 4, bsl.h))
            .a(czk.l, new czy("enchantment.respiration", bug.w, czq.b(1.0F), bue.a.a, UUID.fromString("07a65791-f64d-4e79-86c7-f83932f007ec")))
      );
      a(
         $$0,
         g,
         czj.a(czj.a($$3.b(awd.bC), 2, 1, czj.a(1), czj.a(41), 4, bsl.h))
            .a(czk.l, new czy("enchantment.aqua_affinity", bug.C, czq.b(4.0F), bue.a.c, UUID.fromString("60b1b7db-fffd-4ad0-817c-d6c6a93d8a45")))
      );
      a(
         $$0,
         h,
         czj.a(czj.a($$3.b(awd.bD), $$3.b(awd.bB), 1, 3, czj.a(10, 20), czj.a(60, 20), 8, bsl.i))
            .a(czk.i, czn.c, czn.a, czt.a(new czv(czq.a(1.0F), czq.a(5.0F), $$1.b(bqz.O)), new czx(czq.a(2.0F))), eue.a(eut.a(czq.b(0.15F))))
      );
      a(
         $$0,
         i,
         czj.a(czj.a($$3.b(awd.bz), 2, 3, czj.a(10, 10), czj.a(25, 10), 4, bsl.e))
            .a($$2.b(avx.c))
            .a(czk.l, new czy("enchantment.depth_strider", bug.E, czq.b(0.33333334F), bue.a.a, UUID.fromString("11dc269a-4476-46c0-aff3-9e17d7eb6801")))
      );
      a(
         $$0,
         j,
         czj.a(czj.a($$3.b(awd.bz), 2, 2, czj.a(10, 10), czj.a(25, 10), 4, bsl.e))
            .a($$2.b(avx.c))
            .a(czk.d, czw.a, ets.a(bj.a.a().a(ea.a(avw.F)).a(ea.b(avw.e))))
            .a(
               czk.n,
               new dai(
                  new czq.a(czq.a(3.0F, 1.0F), 0.0F, 16.0F),
                  czq.a(1.0F),
                  new ke(0, -1, 0),
                  Optional.of(dzg.a(dzg.a(new ke(0, 1, 0), dfh.a), dzg.a(eoc.c), dzg.f())),
                  efj.a(dfh.kI)
               ),
               euc.a(eqo.b.a, bu.a.a().a(bs.a.a().a(true)))
            )
      );
      a($$0, k, czj.a(czj.a($$3.b(awd.bO), 1, 1, czj.a(25), czj.a(50), 8, bsl.i)).a(czk.F));
      bu.a $$5 = bu.a.a().a(5).a(bs.a.a().f(false).a(true)).a(dg.b(de.c.b(1.0E-5F))).b(dc.a.a().a(av.a.a().a(avu.aN)));
      a(
         $$0,
         l,
         czj.a(czj.a($$3.b(awd.bz), 1, 3, czj.a(10, 10), czj.a(25, 10), 8, bsl.e))
            .a(
               czk.n,
               new czy("Soul speed boost", bug.v, czq.a(0.0405F, 0.0105F), bue.a.a, UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038")),
               etm.a(
                  etw.a(euc.a(eqo.b.a, bu.a.a().a(bu.a.a()))),
                  etn.a(
                     etm.a(
                        ett.c(),
                        euc.a(eqo.b.a, bu.a.a().a(bs.a.a().f(false))),
                        etn.a(euc.a(eqo.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avu.aN)))), euc.a(eqo.b.a, bu.a.a().a(bs.a.a().a(false)).b()))
                     ),
                     etm.a(ett.d(), euc.a(eqo.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avu.aN))).a(bs.a.a().f(false))))
                  )
               )
            )
            .a(
               czk.n,
               new czy("Soul speed movement efficiency", bug.u, czq.a(1.0F), bue.a.a, UUID.fromString("b9716dbd-50df-4080-850e-70347d24e687")),
               euc.a(eqo.b.a, bu.a.a().b(dc.a.a().a(av.a.a().a(avu.aN))))
            )
            .a(czk.n, new czx(czq.a(1.0F)), etm.a(eue.a(eut.a(czq.a(0.04F))), euc.a(eqo.b.a, bu.a.a().a(bs.a.a().a(true)).b(dc.a.a().a(av.a.a().a(avu.aN))))))
            .a(czk.o, new dam(lj.M, dam.b(), dam.a(0.1F), dam.b(-0.2F), dam.a(bpe.a(0.1F)), bpe.a(1.0F)), euc.a(eqo.b.a, $$5))
            .a(czk.o, new daf(avf.xQ, bpe.a(0.6F), bpn.b(0.6F, 1.0F)), etm.a(eue.a(0.35F), euc.a(eqo.b.a, $$5)))
      );
      a(
         $$0,
         m,
         czj.a(czj.a($$3.b(awd.bA), 1, 3, czj.a(25, 25), czj.a(75, 25), 8, bsl.f))
            .a(czk.l, new czy("enchantment.swift_sneak", bug.z, czq.b(0.15F), bue.a.a, UUID.fromString("92437d00-c3a7-4f2e-8f6c-1f21585d5dd0")))
      );
      a($$0, n, czj.a(czj.a($$3.b(awd.bH), $$3.b(awd.bE), 10, 5, czj.a(1, 11), czj.a(21, 11), 1, bsl.b)).a($$2.b(avx.f)).a(czk.e, new czs(czq.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         czj.a(czj.a($$3.b(awd.bH), $$3.b(awd.bE), 5, 5, czj.a(5, 8), czj.a(25, 8), 2, bsl.b))
            .a($$2.b(avx.f))
            .a(czk.e, new czs(czq.b(2.5F)), euc.a(eqo.b.a, bu.a.a().a(bx.a(avy.D))))
      );
      a(
         $$0,
         p,
         czj.a(czj.a($$3.b(awd.bH), $$3.b(awd.bE), 5, 5, czj.a(5, 8), czj.a(25, 8), 2, bsl.b))
            .a($$2.b(avx.f))
            .a(czk.e, new czs(czq.b(2.5F)), euc.a(eqo.b.a, bu.a.a().a(bx.a(avy.C))))
            .a(czk.i, czn.a, czn.c, new czu(jn.a(brn.b), czq.a(1.5F), czq.a(1.5F, 0.5F), czq.a(3.0F), czq.a(3.0F)), euc.a(eqo.b.a, bu.a.a().a(bx.a(avy.C))))
      );
      a($$0, q, czj.a(czj.a($$3.b(awd.bE), 5, 2, czj.a(5, 20), czj.a(55, 20), 2, bsl.b)).a(czk.g, new czs(czq.b(1.0F))));
      a(
         $$0,
         r,
         czj.a(czj.a($$3.b(awd.bE), 2, 2, czj.a(10, 20), czj.a(60, 20), 4, bsl.b))
            .a(czk.i, czn.a, czn.c, new dad(czq.b(4.0F)))
            .a(czk.j, czt.a(new dak(cwk.a.a(dfu.g, true)), new czx(czq.a(1.0F))), etx.a(dc.a.a().a(av.a.a().a(dy.a.a().a(dfu.g, false)))))
      );
      a(
         $$0,
         s,
         czj.a(czj.a($$3.b(awd.bE), 2, 3, czj.a(15, 9), czj.a(65, 9), 4, bsl.b))
            .a(czk.m, czn.a, czn.c, new czs(czq.b(0.01F)), euc.a(eqo.b.b, bu.a.a().a(bx.a(bsj.by))))
      );
      a(
         $$0,
         t,
         czj.a(czj.a($$3.b(awd.bE), 2, 3, czj.a(5, 9), czj.a(20, 9), 4, bsl.b))
            .a(
               czk.l,
               new czy(
                  "enchantment.sweeping_edge",
                  bug.D,
                  new czq.c(czq.b(1.0F), czq.a(2.0F, 1.0F)),
                  bue.a.a,
                  UUID.fromString("5d3d087b-debe-4037-b53e-d84f3ff51f17")
               )
            )
      );
      a(
         $$0,
         u,
         czj.a(czj.a($$3.b(awd.bI), 10, 5, czj.a(1, 10), czj.a(51, 10), 1, bsl.b))
            .a(czk.l, new czy("enchantment.efficiency", bug.t, new czq.d(1.0F), bue.a.a, UUID.fromString("3ceb37c0-db62-46b5-bd02-785457b01d96")))
      );
      a($$0, v, czj.a(czj.a($$3.b(awd.bJ), 1, 1, czj.a(15), czj.a(65), 8, bsl.b)).a($$2.b(avx.g)).a(czk.y, new dal(czq.a(0.0F))));
      a(
         $$0,
         w,
         czj.a(czj.a($$3.b(awd.bM), 5, 3, czj.a(5, 8), czj.a(55, 8), 2, bsl.b))
            .a(czk.k, new dag(new czq.c(czq.b(2.0F), czq.a(10.0F, 5.0F))), eug.a(cp.a.a().a(awd.bD)))
            .a(czk.k, new dag(new czq.c(czq.b(1.0F), czq.a(2.0F, 1.0F))), etw.a(eug.a(cp.a.a().a(awd.bD))))
      );
      a($$0, x, czj.a(czj.a($$3.b(awd.bJ), 2, 3, czj.a(15, 9), czj.a(65, 9), 4, bsl.b)).a($$2.b(avx.g)));
      a($$0, y, czj.a(czj.a($$3.b(awd.bN), 10, 5, czj.a(1, 10), czj.a(16, 10), 1, bsl.b)).a(czk.e, new czs(czq.b(0.5F)), euc.a(eqo.b.c, bu.a.a().a(avy.f).b())));
      a($$0, z, czj.a(czj.a($$3.b(awd.bN), 2, 2, czj.a(12, 20), czj.a(37, 20), 4, bsl.b)).a(czk.g, new czs(czq.b(1.0F)), euc.a(eqo.b.c, bu.a.a().a(avy.f).b())));
      a($$0, A, czj.a(czj.a($$3.b(awd.bN), 2, 1, czj.a(20), czj.a(50), 4, bsl.b)).a(czk.r, new dad(czq.a(100.0F))));
      a($$0, B, czj.a(czj.a($$3.b(awd.bN), 1, 1, czj.a(20), czj.a(50), 8, bsl.b)).a($$2.b(avx.d)).a(czk.p, new dal(czq.a(0.0F)), eug.a(cp.a.a().a(cud.ov))));
      a($$0, C, czj.a(czj.a($$3.b(awd.bK), 2, 3, czj.a(15, 9), czj.a(65, 9), 4, bsl.b)).a(czk.x, new czs(czq.b(1.0F))));
      a($$0, D, czj.a(czj.a($$3.b(awd.bK), 2, 3, czj.a(15, 9), czj.a(65, 9), 4, bsl.b)).a(czk.w, new czs(czq.b(5.0F))));
      a($$0, E, czj.a(czj.a($$3.b(awd.bL), 5, 3, czj.a(12, 7), czj.a(50), 2, bsl.b)).a(czk.v, new czs(czq.b(1.0F))));
      a(
         $$0,
         F,
         czj.a(czj.a($$3.b(awd.bL), 2, 5, czj.a(1, 8), czj.a(21, 8), 4, bsl.b))
            .a($$2.b(avx.f))
            .a(czk.e, new czs(czq.b(2.5F)), euc.a(eqo.b.a, bu.a.a().a(bx.a(avy.B)).b()))
      );
      a(
         $$0,
         G,
         czj.a(czj.a($$3.b(awd.bL), 2, 3, czj.a(17, 7), czj.a(50), 4, bsl.b))
            .a($$2.b(avx.h))
            .a(czk.A, new czs(czq.a(1.5F, 0.75F)))
            .b(czk.D, List.of(avf.zD, avf.zE, avf.zF))
      );
      a(
         $$0,
         H,
         czj.a(czj.a($$3.b(awd.bL), 1, 1, czj.a(25), czj.a(50), 8, bsl.b))
            .a(
               czk.i,
               czn.a,
               czn.c,
               czt.a(new dan(jn.a(bsj.am.r()), false), new daf(avf.zH, bpe.a(5.0F), bpe.a(1.0F))),
               etm.a(euj.c().b(true), euc.a(eqo.b.a, bu.a.a().a(dc.a.a().b(true))), euc.a(eqo.b.c, bu.a.a().a(bsj.bf)))
            )
            .a(
               czk.j,
               czt.a(new dan(jn.a(bsj.am.r()), false), new daf(avf.zH, bpe.a(5.0F), bpe.a(1.0F))),
               etm.a(euj.c().b(true), euc.a(eqo.b.a, bu.a.a().a(bsj.bf).a(dc.a.a().b(true).a(av.a.a().a(dfh.ss)))))
            )
      );
      a(
         $$0,
         I,
         czj.a(czj.a($$3.b(awd.bP), 2, 1, czj.a(20), czj.a(50), 4, bsl.b)).a($$2.b(avx.e)).a(czk.t, new czs(czq.b(2.0F))).a(czk.s, new czs(czq.b(10.0F)))
      );
      a(
         $$0,
         J,
         czj.a(czj.a($$3.b(awd.bP), 5, 3, czj.a(12, 20), czj.a(50), 2, bsl.b))
            .a(czk.u, new czs(czq.b(-0.25F)))
            .b(
               czk.C,
               List.of(
                  new csn.a(Optional.of(avf.gr), Optional.empty(), Optional.of(avf.go)),
                  new csn.a(Optional.of(avf.gs), Optional.empty(), Optional.of(avf.go)),
                  new csn.a(Optional.of(avf.gt), Optional.empty(), Optional.of(avf.go))
               )
            )
      );
      a($$0, K, czj.a(czj.a($$3.b(awd.bP), 10, 4, czj.a(1, 10), czj.a(50), 1, bsl.b)).a($$2.b(avx.e)).a(czk.q, new czs(czq.b(1.0F))));
      a($$0, L, czj.a(czj.a($$3.b(awd.bR), 5, 5, czj.a(5, 8), czj.a(25, 8), 2, bsl.b)).a(czk.f, new czs(czq.b(0.5F))));
      a($$0, M, czj.a(czj.a($$3.b(awd.bR), 2, 4, czj.a(15, 9), czj.a(65, 9), 4, bsl.b)).a(czk.h, new czs(czq.b(-0.15F))));
      a(
         $$0,
         N,
         czj.a(czj.a($$3.b(awd.bR), 2, 3, czj.a(15, 9), czj.a(65, 9), 4, bsl.b))
            .a(
               czk.i,
               czn.a,
               czn.a,
               new dac(
                  false,
                  Optional.empty(),
                  Optional.of(czq.a(0.5F, 0.25F)),
                  $$4.a(avu.cy).map(Function.identity()),
                  evz.b,
                  czq.a(3.5F),
                  false,
                  dcd.a.e,
                  lj.A,
                  lj.z,
                  avf.Cp
               ),
               euc.a(eqo.b.b, bu.a.a().a(bs.a.a().f(false)).a(dg.d(de.c.b(1.5))))
            )
      );
      a($$0, O, czj.a(czj.a($$3.b(awd.bM), 2, 1, czj.a(25, 25), czj.a(75, 25), 4, bsl.a)).a(czk.B, new dae(czq.a(2.0F))));
      a($$0, P, czj.a(czj.a($$3.b(awd.bQ), 1, 1, czj.a(25), czj.a(50), 8, bsl.a)).a(czk.E));
   }

   private static void a(qm<czj> $$0, akj<czj> $$1, czj.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akj<czj> a(String $$0) {
      return akj.a(lr.aK, new akk($$0));
   }
}
