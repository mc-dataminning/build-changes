import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dhc {
   public static final alq<dgx> a = a("protection");
   public static final alq<dgx> b = a("fire_protection");
   public static final alq<dgx> c = a("feather_falling");
   public static final alq<dgx> d = a("blast_protection");
   public static final alq<dgx> e = a("projectile_protection");
   public static final alq<dgx> f = a("respiration");
   public static final alq<dgx> g = a("aqua_affinity");
   public static final alq<dgx> h = a("thorns");
   public static final alq<dgx> i = a("depth_strider");
   public static final alq<dgx> j = a("frost_walker");
   public static final alq<dgx> k = a("binding_curse");
   public static final alq<dgx> l = a("soul_speed");
   public static final alq<dgx> m = a("swift_sneak");
   public static final alq<dgx> n = a("sharpness");
   public static final alq<dgx> o = a("smite");
   public static final alq<dgx> p = a("bane_of_arthropods");
   public static final alq<dgx> q = a("knockback");
   public static final alq<dgx> r = a("fire_aspect");
   public static final alq<dgx> s = a("looting");
   public static final alq<dgx> t = a("sweeping_edge");
   public static final alq<dgx> u = a("efficiency");
   public static final alq<dgx> v = a("silk_touch");
   public static final alq<dgx> w = a("unbreaking");
   public static final alq<dgx> x = a("fortune");
   public static final alq<dgx> y = a("power");
   public static final alq<dgx> z = a("punch");
   public static final alq<dgx> A = a("flame");
   public static final alq<dgx> B = a("infinity");
   public static final alq<dgx> C = a("luck_of_the_sea");
   public static final alq<dgx> D = a("lure");
   public static final alq<dgx> E = a("loyalty");
   public static final alq<dgx> F = a("impaling");
   public static final alq<dgx> G = a("riptide");
   public static final alq<dgx> H = a("channeling");
   public static final alq<dgx> I = a("multishot");
   public static final alq<dgx> J = a("quick_charge");
   public static final alq<dgx> K = a("piercing");
   public static final alq<dgx> L = a("density");
   public static final alq<dgx> M = a("breach");
   public static final alq<dgx> N = a("wind_burst");
   public static final alq<dgx> O = a("mending");
   public static final alq<dgx> P = a("vanishing_curse");

   public static void a(qi<dgx> $$0) {
      jh<bvv> $$1 = $$0.a(mi.aN);
      jh<dgx> $$2 = $$0.a(mi.aR);
      jh<dag> $$3 = $$0.a(mi.K);
      jh<dno> $$4 = $$0.a(mi.i);
      jh<bxn<?>> $$5 = $$0.a(mi.B);
      a(
         $$0,
         a,
         dgx.a(dgx.a($$3.b(axv.cd), 10, 4, dgx.a(1, 11), dgx.a(12, 11), 1, bxp.i))
            .a($$2.b(axp.b))
            .a(dgy.c, new dhh(dhe.b(1.0F)), fdv.a(bn.a.a().a(du.b(axo.d))))
      );
      a(
         $$0,
         b,
         dgx.a(dgx.a($$3.b(axv.cd), 5, 4, dgx.a(10, 8), dgx.a(18, 8), 2, bxp.i))
            .a($$2.b(axp.b))
            .a(dgy.c, new dhh(dhe.b(2.0F)), fdp.a(fdv.a(bn.a.a().a(du.a(axo.i)).a(du.b(axo.d)))))
            .a(dgy.l, new dhn(alr.b("enchantment.fire_protection"), bzl.h, dhe.b(-0.15F), bzj.a.b))
      );
      a(
         $$0,
         c,
         dgx.a(dgx.a($$3.b(axv.bZ), 5, 4, dgx.a(5, 6), dgx.a(11, 6), 2, bxp.i)).a(dgy.c, new dhh(dhe.b(3.0F)), fdv.a(bn.a.a().a(du.a(axo.m)).a(du.b(axo.d))))
      );
      a(
         $$0,
         d,
         dgx.a(dgx.a($$3.b(axv.cd), 2, 4, dgx.a(5, 8), dgx.a(13, 8), 4, bxp.i))
            .a($$2.b(axp.b))
            .a(dgy.c, new dhh(dhe.b(2.0F)), fdv.a(bn.a.a().a(du.a(axo.l)).a(du.b(axo.d))))
            .a(dgy.l, new dhn(alr.b("enchantment.blast_protection"), bzl.i, dhe.b(0.15F), bzj.a.a))
      );
      a(
         $$0,
         e,
         dgx.a(dgx.a($$3.b(axv.cd), 5, 4, dgx.a(3, 6), dgx.a(9, 6), 2, bxp.i))
            .a($$2.b(axp.b))
            .a(dgy.c, new dhh(dhe.b(2.0F)), fdv.a(bn.a.a().a(du.a(axo.j)).a(du.b(axo.d))))
      );
      a(
         $$0,
         f,
         dgx.a(dgx.a($$3.b(axv.cc), 2, 3, dgx.a(10, 10), dgx.a(40, 10), 4, bxp.h))
            .a(dgy.l, new dhn(alr.b("enchantment.respiration"), bzl.w, dhe.b(1.0F), bzj.a.a))
      );
      a(
         $$0,
         g,
         dgx.a(dgx.a($$3.b(axv.cc), 2, 1, dgx.a(1), dgx.a(41), 4, bxp.h)).a(dgy.l, new dhn(alr.b("enchantment.aqua_affinity"), bzl.C, dhe.b(4.0F), bzj.a.c))
      );
      a(
         $$0,
         h,
         dgx.a(dgx.a($$3.b(axv.cd), $$3.b(axv.cb), 1, 3, dgx.a(10, 20), dgx.a(60, 20), 8, bxp.a))
            .a(dgy.i, dhb.c, dhb.a, dhi.a(new dhl(dhe.a(1.0F), dhe.a(5.0F), $$1.b(bvw.P)), new dhk(dhe.a(2.0F))), feh.a(few.a(dhe.b(0.15F))))
      );
      a(
         $$0,
         i,
         dgx.a(dgx.a($$3.b(axv.bZ), 2, 3, dgx.a(10, 10), dgx.a(25, 10), 4, bxp.e))
            .a($$2.b(axp.c))
            .a(dgy.l, new dhn(alr.b("enchantment.depth_strider"), bzl.F, dhe.b(0.33333334F), bzj.a.a))
      );
      a(
         $$0,
         j,
         dgx.a(dgx.a($$3.b(axv.bZ), 2, 2, dgx.a(10, 10), dgx.a(25, 10), 4, bxp.e))
            .a($$2.b(axp.c))
            .a(dgy.d, dhm.a, fdv.a(bn.a.a().a(du.a(axo.E)).a(du.b(axo.d))))
            .a(
               dgy.n,
               new dhx(
                  new dhe.a(dhe.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dhe.a(1.0F),
                  new kb(0, -1, 0),
                  Optional.of(eiw.a(eiw.a(new kb(0, 1, 0), axn.cI), eiw.a(dnq.J), eiw.a(eyb.c), eiw.f())),
                  epc.a(dnq.lo),
                  Optional.of(egq.i)
               ),
               fdp.a(fef.a(fat.b.a, bz.a.a().a(bx.a.a().a(true))), fdz.a(fef.a(fat.b.a, bz.a.a().a(bz.a.a()))))
            )
      );
      a($$0, k, dgx.a(dgx.a($$3.b(axv.co), 1, 1, dgx.a(25), dgx.a(50), 8, bxp.i)).a(dgy.E));
      bz.a $$6 = bz.a.a().a(5).a(bx.a.a().f(false).a(true)).a(cz.b(cx.c.b(1.0E-5F))).c(cv.a.a().a(az.a.a().a($$4, axn.aQ)));
      fdp.a $$7 = fdp.a(
         fdz.a(fef.a(fat.b.a, bz.a.a().a(bz.a.a()))),
         fdq.a(
            fdp.a(
               fdw.c(),
               fef.a(fat.b.a, bz.a.a().a(bx.a.a().f(false))),
               fdq.a(fef.a(fat.b.a, bz.a.a().c(cv.a.a().a(az.a.a().a($$4, axn.aQ)))), fef.a(fat.b.a, bz.a.a().a(bx.a.a().a(false)).b()))
            ),
            fdp.a(fdw.d(), fef.a(fat.b.a, bz.a.a().c(cv.a.a().a(az.a.a().a($$4, axn.aQ))).a(bx.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dgx.a(dgx.a($$3.b(axv.bZ), 1, 3, dgx.a(10, 10), dgx.a(25, 10), 8, bxp.e))
            .a(
               dgy.n,
               dhi.a(
                  new dhn(alr.b("enchantment.soul_speed"), bzl.v, dhe.a(0.0405F, 0.0105F), bzj.a.a),
                  new dhn(alr.b("enchantment.soul_speed"), bzl.u, dhe.a(1.0F), bzj.a.a)
               ),
               $$7
            )
            .a(
               dgy.n,
               new dhk(dhe.a(1.0F)),
               fdp.a(feh.a(few.a(dhe.a(0.04F))), fef.a(fat.b.a, bz.a.a().a(bx.a.a().a(true)).c(cv.a.a().a(az.a.a().a($$4, axn.aQ)))))
            )
            .a(dgy.o, new dib(lz.O, dib.b(), dib.a(0.1F), dib.b(-0.2F), dib.a(bud.a(0.1F)), bud.a(1.0F)), fef.a(fat.b.a, $$6))
            .a(dgy.o, new dhu(awy.yG, bud.a(0.6F), bum.b(0.6F, 1.0F)), fdp.a(feh.a(0.35F), fef.a(fat.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dgx.a(dgx.a($$3.b(axv.ca), 1, 3, dgx.a(25, 25), dgx.a(75, 25), 8, bxp.f))
            .a(dgy.l, new dhn(alr.b("enchantment.swift_sneak"), bzl.z, dhe.b(0.15F), bzj.a.a))
      );
      a($$0, n, dgx.a(dgx.a($$3.b(axv.cg), $$3.b(axv.ce), 10, 5, dgx.a(1, 11), dgx.a(21, 11), 1, bxp.b)).a($$2.b(axp.f)).a(dgy.e, new dhh(dhe.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dgx.a(dgx.a($$3.b(axv.ch), $$3.b(axv.ce), 5, 5, dgx.a(5, 8), dgx.a(25, 8), 2, bxp.b))
            .a($$2.b(axp.f))
            .a(dgy.e, new dhh(dhe.b(2.5F)), fef.a(fat.b.a, bz.a.a().a(cc.a($$5, axq.D))))
      );
      a(
         $$0,
         p,
         dgx.a(dgx.a($$3.b(axv.ch), $$3.b(axv.ce), 5, 5, dgx.a(5, 8), dgx.a(25, 8), 2, bxp.b))
            .a($$2.b(axp.f))
            .a(dgy.e, new dhh(dhe.b(2.5F)), fef.a(fat.b.a, bz.a.a().a(cc.a($$5, axq.C))))
            .a(
               dgy.i,
               dhb.a,
               dhb.c,
               new dhj(jk.a(bwk.b), dhe.a(1.5F), dhe.a(1.5F, 0.5F), dhe.a(3.0F), dhe.a(3.0F)),
               fef.a(fat.b.a, bz.a.a().a(cc.a($$5, axq.C))).and(fdv.a(bn.a.a().a(true)))
            )
      );
      a($$0, q, dgx.a(dgx.a($$3.b(axv.ce), 5, 2, dgx.a(5, 20), dgx.a(55, 20), 2, bxp.b)).a(dgy.g, new dhh(dhe.b(1.0F))));
      a(
         $$0,
         r,
         dgx.a(dgx.a($$3.b(axv.cf), $$3.b(axv.ce), 2, 2, dgx.a(10, 20), dgx.a(60, 20), 4, bxp.b))
            .a(dgy.i, dhb.a, dhb.c, new dhs(dhe.b(4.0F)), fdv.a(bn.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dgx.a(dgx.a($$3.b(axv.ce), 2, 3, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b))
            .a(dgy.m, dhb.a, dhb.c, new dhh(dhe.b(0.01F)), fef.a(fat.b.b, bz.a.a().a(cc.a($$5, bxn.bT))))
      );
      a(
         $$0,
         t,
         dgx.a(dgx.a($$3.b(axv.ce), 2, 3, dgx.a(5, 9), dgx.a(20, 9), 4, bxp.b))
            .a(dgy.l, new dhn(alr.b("enchantment.sweeping_edge"), bzl.D, new dhe.c(dhe.b(1.0F), dhe.a(2.0F, 1.0F)), bzj.a.a))
      );
      a(
         $$0,
         u,
         dgx.a(dgx.a($$3.b(axv.ci), 10, 5, dgx.a(1, 10), dgx.a(51, 10), 1, bxp.b))
            .a(dgy.l, new dhn(alr.b("enchantment.efficiency"), bzl.t, new dhe.d(1.0F), bzj.a.a))
      );
      a($$0, v, dgx.a(dgx.a($$3.b(axv.cj), 1, 1, dgx.a(15), dgx.a(65), 8, bxp.b)).a($$2.b(axp.g)).a(dgy.x, new dia(dhe.a(0.0F))));
      a(
         $$0,
         w,
         dgx.a(dgx.a($$3.b(axv.cm), 5, 3, dgx.a(5, 8), dgx.a(55, 8), 2, bxp.a))
            .a(dgy.k, new dhv(new dhe.c(dhe.b(2.0F), dhe.a(10.0F, 5.0F))), fej.a(cn.a.a().a($$3, axv.cd)))
            .a(dgy.k, new dhv(new dhe.c(dhe.b(1.0F), dhe.a(2.0F, 1.0F))), fdz.a(fej.a(cn.a.a().a($$3, axv.cd))))
      );
      a($$0, x, dgx.a(dgx.a($$3.b(axv.cj), 2, 3, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b)).a($$2.b(axp.g)));
      a(
         $$0,
         y,
         dgx.a(dgx.a($$3.b(axv.cn), 10, 5, dgx.a(1, 10), dgx.a(16, 10), 1, bxp.b))
            .a(dgy.e, new dhh(dhe.a(1.0F, 0.5F)), fef.a(fat.b.c, bz.a.a().a($$5, axq.f).b()))
      );
      a(
         $$0,
         z,
         dgx.a(dgx.a($$3.b(axv.cn), 2, 2, dgx.a(12, 20), dgx.a(37, 20), 4, bxp.b)).a(dgy.g, new dhh(dhe.b(1.0F)), fef.a(fat.b.c, bz.a.a().a($$5, axq.f).b()))
      );
      a($$0, A, dgx.a(dgx.a($$3.b(axv.cn), 2, 1, dgx.a(20), dgx.a(50), 4, bxp.b)).a(dgy.r, new dhs(dhe.a(100.0F))));
      a(
         $$0,
         B,
         dgx.a(dgx.a($$3.b(axv.cn), 1, 1, dgx.a(20), dgx.a(50), 8, bxp.b)).a($$2.b(axp.d)).a(dgy.p, new dia(dhe.a(0.0F)), fej.a(cn.a.a().a($$3, dao.pk)))
      );
      a($$0, C, dgx.a(dgx.a($$3.b(axv.ck), 2, 3, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b)).a(dgy.w, new dhh(dhe.b(1.0F))));
      a($$0, D, dgx.a(dgx.a($$3.b(axv.ck), 2, 3, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b)).a(dgy.v, new dhh(dhe.b(5.0F))));
      a($$0, E, dgx.a(dgx.a($$3.b(axv.cl), 5, 3, dgx.a(12, 7), dgx.a(50), 2, bxp.b)).a(dgy.u, new dhh(dhe.b(1.0F))));
      a(
         $$0,
         F,
         dgx.a(dgx.a($$3.b(axv.cl), 2, 5, dgx.a(1, 8), dgx.a(21, 8), 4, bxp.b))
            .a($$2.b(axp.f))
            .a(dgy.e, new dhh(dhe.b(2.5F)), fef.a(fat.b.a, bz.a.a().a(cc.a($$5, axq.B)).b()))
      );
      a(
         $$0,
         G,
         dgx.a(dgx.a($$3.b(axv.cl), 2, 3, dgx.a(17, 7), dgx.a(50), 4, bxp.d))
            .a($$2.b(axp.h))
            .b(dgy.F, new dhh(dhe.a(1.5F, 0.75F)))
            .b(dgy.C, List.of(awy.AH, awy.AI, awy.AJ))
      );
      a(
         $$0,
         H,
         dgx.a(dgx.a($$3.b(axv.cl), 1, 1, dgx.a(25), dgx.a(50), 8, bxp.b))
            .a(
               dgy.i,
               dhb.a,
               dhb.c,
               dhi.a(new dic(jk.a(bxn.ax.r()), false), new dhu(awy.AL, bud.a(5.0F), bud.a(1.0F))),
               fdp.a(fem.c().b(true), fef.a(fat.b.a, bz.a.a().a(cv.a.a().b(true))), fef.a(fat.b.c, bz.a.a().a($$5, bxn.bA)))
            )
            .a(
               dgy.j,
               dhi.a(new dic(jk.a(bxn.ax.r()), false), new dhu(awy.AL, bud.a(5.0F), bud.a(1.0F))),
               fdp.a(fem.c().b(true), fef.a(fat.b.a, bz.a.a().a($$5, bxn.bA)), fea.a(cv.a.a().b(true)), feb.a(dnq.ta))
            )
      );
      a(
         $$0,
         I,
         dgx.a(dgx.a($$3.b(axv.cp), 2, 1, dgx.a(20), dgx.a(50), 4, bxp.b)).a($$2.b(axp.e)).a(dgy.t, new dhh(dhe.b(2.0F))).a(dgy.s, new dhh(dhe.b(10.0F)))
      );
      a(
         $$0,
         J,
         dgx.a(dgx.a($$3.b(axv.cp), 5, 3, dgx.a(12, 20), dgx.a(50), 2, bxp.b, bxp.c))
            .b(dgy.A, new dhh(dhe.b(-0.25F)))
            .b(
               dgy.B,
               List.of(
                  new czd.b(Optional.of(awy.gO), Optional.empty(), Optional.of(awy.gL)),
                  new czd.b(Optional.of(awy.gP), Optional.empty(), Optional.of(awy.gL)),
                  new czd.b(Optional.of(awy.gQ), Optional.empty(), Optional.of(awy.gL))
               )
            )
      );
      a($$0, K, dgx.a(dgx.a($$3.b(axv.cp), 10, 4, dgx.a(1, 10), dgx.a(50), 1, bxp.b)).a($$2.b(axp.e)).a(dgy.q, new dhh(dhe.b(1.0F))));
      a($$0, L, dgx.a(dgx.a($$3.b(axv.cr), 5, 5, dgx.a(5, 8), dgx.a(25, 8), 2, bxp.b)).a($$2.b(axp.f)).a(dgy.f, new dhh(dhe.b(0.5F))));
      a($$0, M, dgx.a(dgx.a($$3.b(axv.cr), 2, 4, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b)).a($$2.b(axp.f)).a(dgy.h, new dhh(dhe.b(-0.15F))));
      a(
         $$0,
         N,
         dgx.a(dgx.a($$3.b(axv.cr), 2, 3, dgx.a(15, 9), dgx.a(65, 9), 4, bxp.b))
            .a(
               dgy.i,
               dhb.a,
               dhb.a,
               new dhr(
                  false,
                  Optional.empty(),
                  Optional.of(dhe.a(List.of(1.2F, 1.75F, 2.2F), dhe.a(1.5F, 0.35F))),
                  $$4.a(axn.cF).map(Function.identity()),
                  fgc.c,
                  dhe.a(3.5F),
                  false,
                  dkj.a.e,
                  lz.A,
                  lz.z,
                  awy.Du
               ),
               fef.a(fat.b.c, bz.a.a().a(bx.a.a().f(false)).a(cz.d(cx.c.b(1.5))))
            )
      );
      a($$0, O, dgx.a(dgx.a($$3.b(axv.cm), 2, 1, dgx.a(25, 25), dgx.a(75, 25), 4, bxp.a)).a(dgy.z, new dht(dhe.a(2.0F))));
      a($$0, P, dgx.a(dgx.a($$3.b(axv.cq), 1, 1, dgx.a(25), dgx.a(50), 8, bxp.a)).a(dgy.D));
   }

   private static void a(qi<dgx> $$0, alq<dgx> $$1, dgx.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static alq<dgx> a(String $$0) {
      return alq.a(mi.aR, alr.b($$0));
   }
}
