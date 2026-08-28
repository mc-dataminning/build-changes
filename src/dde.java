import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dde {
   public static final akt<dcz> a = a("protection");
   public static final akt<dcz> b = a("fire_protection");
   public static final akt<dcz> c = a("feather_falling");
   public static final akt<dcz> d = a("blast_protection");
   public static final akt<dcz> e = a("projectile_protection");
   public static final akt<dcz> f = a("respiration");
   public static final akt<dcz> g = a("aqua_affinity");
   public static final akt<dcz> h = a("thorns");
   public static final akt<dcz> i = a("depth_strider");
   public static final akt<dcz> j = a("frost_walker");
   public static final akt<dcz> k = a("binding_curse");
   public static final akt<dcz> l = a("soul_speed");
   public static final akt<dcz> m = a("swift_sneak");
   public static final akt<dcz> n = a("sharpness");
   public static final akt<dcz> o = a("smite");
   public static final akt<dcz> p = a("bane_of_arthropods");
   public static final akt<dcz> q = a("knockback");
   public static final akt<dcz> r = a("fire_aspect");
   public static final akt<dcz> s = a("looting");
   public static final akt<dcz> t = a("sweeping_edge");
   public static final akt<dcz> u = a("efficiency");
   public static final akt<dcz> v = a("silk_touch");
   public static final akt<dcz> w = a("unbreaking");
   public static final akt<dcz> x = a("fortune");
   public static final akt<dcz> y = a("power");
   public static final akt<dcz> z = a("punch");
   public static final akt<dcz> A = a("flame");
   public static final akt<dcz> B = a("infinity");
   public static final akt<dcz> C = a("luck_of_the_sea");
   public static final akt<dcz> D = a("lure");
   public static final akt<dcz> E = a("loyalty");
   public static final akt<dcz> F = a("impaling");
   public static final akt<dcz> G = a("riptide");
   public static final akt<dcz> H = a("channeling");
   public static final akt<dcz> I = a("multishot");
   public static final akt<dcz> J = a("quick_charge");
   public static final akt<dcz> K = a("piercing");
   public static final akt<dcz> L = a("density");
   public static final akt<dcz> M = a("breach");
   public static final akt<dcz> N = a("wind_burst");
   public static final akt<dcz> O = a("mending");
   public static final akt<dcz> P = a("vanishing_curse");

   public static void a(qe<dcz> $$0) {
      js<btc> $$1 = $$0.a(mc.s);
      js<dcz> $$2 = $$0.a(mc.aO);
      js<cwl> $$3 = $$0.a(mc.K);
      js<djm> $$4 = $$0.a(mc.f);
      js<bur<?>> $$5 = $$0.a(mc.z);
      a(
         $$0,
         a,
         dcz.a(dcz.a($$3.b(awy.ca), 10, 4, dcz.a(1, 11), dcz.a(12, 11), 1, but.i))
            .a($$2.b(aws.b))
            .a(dda.c, new ddj(ddg.b(1.0F)), eyt.a(bm.a.a().a(eh.b(awr.d))))
      );
      a(
         $$0,
         b,
         dcz.a(dcz.a($$3.b(awy.ca), 5, 4, dcz.a(10, 8), dcz.a(18, 8), 2, but.i))
            .a($$2.b(aws.b))
            .a(dda.c, new ddj(ddg.b(2.0F)), eyn.a(eyt.a(bm.a.a().a(eh.a(awr.i)).a(eh.b(awr.d)))))
            .a(dda.l, new ddp(aku.b("enchantment.fire_protection"), bwo.h, ddg.b(-0.15F), bwm.a.b))
      );
      a(
         $$0,
         c,
         dcz.a(dcz.a($$3.b(awy.bW), 5, 4, dcz.a(5, 6), dcz.a(11, 6), 2, but.i)).a(dda.c, new ddj(ddg.b(3.0F)), eyt.a(bm.a.a().a(eh.a(awr.m)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         d,
         dcz.a(dcz.a($$3.b(awy.ca), 2, 4, dcz.a(5, 8), dcz.a(13, 8), 4, but.i))
            .a($$2.b(aws.b))
            .a(dda.c, new ddj(ddg.b(2.0F)), eyt.a(bm.a.a().a(eh.a(awr.l)).a(eh.b(awr.d))))
            .a(dda.l, new ddp(aku.b("enchantment.blast_protection"), bwo.i, ddg.b(0.15F), bwm.a.a))
      );
      a(
         $$0,
         e,
         dcz.a(dcz.a($$3.b(awy.ca), 5, 4, dcz.a(3, 6), dcz.a(9, 6), 2, but.i))
            .a($$2.b(aws.b))
            .a(dda.c, new ddj(ddg.b(2.0F)), eyt.a(bm.a.a().a(eh.a(awr.j)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         f,
         dcz.a(dcz.a($$3.b(awy.bZ), 2, 3, dcz.a(10, 10), dcz.a(40, 10), 4, but.h))
            .a(dda.l, new ddp(aku.b("enchantment.respiration"), bwo.w, ddg.b(1.0F), bwm.a.a))
      );
      a(
         $$0,
         g,
         dcz.a(dcz.a($$3.b(awy.bZ), 2, 1, dcz.a(1), dcz.a(41), 4, but.h)).a(dda.l, new ddp(aku.b("enchantment.aqua_affinity"), bwo.C, ddg.b(4.0F), bwm.a.c))
      );
      a(
         $$0,
         h,
         dcz.a(dcz.a($$3.b(awy.ca), $$3.b(awy.bY), 1, 3, dcz.a(10, 20), dcz.a(60, 20), 8, but.a))
            .a(dda.i, ddd.c, ddd.a, ddk.a(new ddn(ddg.a(1.0F), ddg.a(5.0F), $$1.b(btd.P)), new ddm(ddg.a(2.0F))), ezf.a(ezu.a(ddg.b(0.15F))))
      );
      a(
         $$0,
         i,
         dcz.a(dcz.a($$3.b(awy.bW), 2, 3, dcz.a(10, 10), dcz.a(25, 10), 4, but.e))
            .a($$2.b(aws.c))
            .a(dda.l, new ddp(aku.b("enchantment.depth_strider"), bwo.F, ddg.b(0.33333334F), bwm.a.a))
      );
      a(
         $$0,
         j,
         dcz.a(dcz.a($$3.b(awy.bW), 2, 2, dcz.a(10, 10), dcz.a(25, 10), 4, but.e))
            .a($$2.b(aws.c))
            .a(dda.d, ddo.a, eyt.a(bm.a.a().a(eh.a(awr.E)).a(eh.b(awr.d))))
            .a(
               dda.n,
               new ddz(
                  new ddg.a(ddg.a(3.0F, 1.0F), 0.0F, 16.0F),
                  ddg.a(1.0F),
                  new km(0, -1, 0),
                  Optional.of(edz.a(edz.a(new km(0, 1, 0), awp.cD), edz.a(djo.J), edz.a(eta.c), edz.f())),
                  ekd.a(djo.lk),
                  Optional.of(ebt.i)
               ),
               ezd.a(evr.b.a, bx.a.a().a(bv.a.a().a(true)))
            )
      );
      a($$0, k, dcz.a(dcz.a($$3.b(awy.cl), 1, 1, dcz.a(25), dcz.a(50), 8, but.i)).a(dda.E));
      bx.a $$6 = bx.a.a().a(5).a(bv.a.a().f(false).a(true)).a(dm.b(dk.c.b(1.0E-5F))).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)));
      eyn.a $$7 = eyn.a(
         eyx.a(ezd.a(evr.b.a, bx.a.a().a(bx.a.a()))),
         eyo.a(
            eyn.a(
               eyu.c(),
               ezd.a(evr.b.a, bx.a.a().a(bv.a.a().f(false))),
               eyo.a(ezd.a(evr.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))), ezd.a(evr.b.a, bx.a.a().a(bv.a.a().a(false)).b()))
            ),
            eyn.a(eyu.d(), ezd.a(evr.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ))).a(bv.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dcz.a(dcz.a($$3.b(awy.bW), 1, 3, dcz.a(10, 10), dcz.a(25, 10), 8, but.e))
            .a(
               dda.n,
               ddk.a(
                  new ddp(aku.b("enchantment.soul_speed"), bwo.v, ddg.a(0.0405F, 0.0105F), bwm.a.a),
                  new ddp(aku.b("enchantment.soul_speed"), bwo.u, ddg.a(1.0F), bwm.a.a)
               ),
               $$7
            )
            .a(
               dda.n,
               new ddm(ddg.a(1.0F)),
               eyn.a(ezf.a(ezu.a(ddg.a(0.04F))), ezd.a(evr.b.a, bx.a.a().a(bv.a.a().a(true)).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))))
            )
            .a(dda.o, new ded(lt.N, ded.b(), ded.a(0.1F), ded.b(-0.2F), ded.a(brk.a(0.1F)), brk.a(1.0F)), ezd.a(evr.b.a, $$6))
            .a(dda.o, new ddw(awa.yq, brk.a(0.6F), brt.b(0.6F, 1.0F)), eyn.a(ezf.a(0.35F), ezd.a(evr.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dcz.a(dcz.a($$3.b(awy.bX), 1, 3, dcz.a(25, 25), dcz.a(75, 25), 8, but.f))
            .a(dda.l, new ddp(aku.b("enchantment.swift_sneak"), bwo.z, ddg.b(0.15F), bwm.a.a))
      );
      a($$0, n, dcz.a(dcz.a($$3.b(awy.cd), $$3.b(awy.cb), 10, 5, dcz.a(1, 11), dcz.a(21, 11), 1, but.b)).a($$2.b(aws.f)).a(dda.e, new ddj(ddg.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dcz.a(dcz.a($$3.b(awy.ce), $$3.b(awy.cb), 5, 5, dcz.a(5, 8), dcz.a(25, 8), 2, but.b))
            .a($$2.b(aws.f))
            .a(dda.e, new ddj(ddg.b(2.5F)), ezd.a(evr.b.a, bx.a.a().a(ca.a($$5, awt.D))))
      );
      a(
         $$0,
         p,
         dcz.a(dcz.a($$3.b(awy.ce), $$3.b(awy.cb), 5, 5, dcz.a(5, 8), dcz.a(25, 8), 2, but.b))
            .a($$2.b(aws.f))
            .a(dda.e, new ddj(ddg.b(2.5F)), ezd.a(evr.b.a, bx.a.a().a(ca.a($$5, awt.C))))
            .a(
               dda.i,
               ddd.a,
               ddd.c,
               new ddl(jv.a(btr.b), ddg.a(1.5F), ddg.a(1.5F, 0.5F), ddg.a(3.0F), ddg.a(3.0F)),
               ezd.a(evr.b.a, bx.a.a().a(ca.a($$5, awt.C))).and(eyt.a(bm.a.a().a(true)))
            )
      );
      a($$0, q, dcz.a(dcz.a($$3.b(awy.cb), 5, 2, dcz.a(5, 20), dcz.a(55, 20), 2, but.b)).a(dda.g, new ddj(ddg.b(1.0F))));
      a(
         $$0,
         r,
         dcz.a(dcz.a($$3.b(awy.cc), $$3.b(awy.cb), 2, 2, dcz.a(10, 20), dcz.a(60, 20), 4, but.b))
            .a(dda.i, ddd.a, ddd.c, new ddu(ddg.b(4.0F)), eyt.a(bm.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dcz.a(dcz.a($$3.b(awy.cb), 2, 3, dcz.a(15, 9), dcz.a(65, 9), 4, but.b))
            .a(dda.m, ddd.a, ddd.c, new ddj(ddg.b(0.01F)), ezd.a(evr.b.b, bx.a.a().a(ca.a($$5, bur.bS))))
      );
      a(
         $$0,
         t,
         dcz.a(dcz.a($$3.b(awy.cb), 2, 3, dcz.a(5, 9), dcz.a(20, 9), 4, but.b))
            .a(dda.l, new ddp(aku.b("enchantment.sweeping_edge"), bwo.D, new ddg.c(ddg.b(1.0F), ddg.a(2.0F, 1.0F)), bwm.a.a))
      );
      a(
         $$0,
         u,
         dcz.a(dcz.a($$3.b(awy.cf), 10, 5, dcz.a(1, 10), dcz.a(51, 10), 1, but.b))
            .a(dda.l, new ddp(aku.b("enchantment.efficiency"), bwo.t, new ddg.d(1.0F), bwm.a.a))
      );
      a($$0, v, dcz.a(dcz.a($$3.b(awy.cg), 1, 1, dcz.a(15), dcz.a(65), 8, but.b)).a($$2.b(aws.g)).a(dda.x, new dec(ddg.a(0.0F))));
      a(
         $$0,
         w,
         dcz.a(dcz.a($$3.b(awy.cj), 5, 3, dcz.a(5, 8), dcz.a(55, 8), 2, but.a))
            .a(dda.k, new ddx(new ddg.c(ddg.b(2.0F), ddg.a(10.0F, 5.0F))), ezh.a(cv.a.a().a($$3, awy.ca)))
            .a(dda.k, new ddx(new ddg.c(ddg.b(1.0F), ddg.a(2.0F, 1.0F))), eyx.a(ezh.a(cv.a.a().a($$3, awy.ca))))
      );
      a($$0, x, dcz.a(dcz.a($$3.b(awy.cg), 2, 3, dcz.a(15, 9), dcz.a(65, 9), 4, but.b)).a($$2.b(aws.g)));
      a(
         $$0,
         y,
         dcz.a(dcz.a($$3.b(awy.ck), 10, 5, dcz.a(1, 10), dcz.a(16, 10), 1, but.b))
            .a(dda.e, new ddj(ddg.a(1.0F, 0.5F)), ezd.a(evr.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a(
         $$0,
         z,
         dcz.a(dcz.a($$3.b(awy.ck), 2, 2, dcz.a(12, 20), dcz.a(37, 20), 4, but.b)).a(dda.g, new ddj(ddg.b(1.0F)), ezd.a(evr.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a($$0, A, dcz.a(dcz.a($$3.b(awy.ck), 2, 1, dcz.a(20), dcz.a(50), 4, but.b)).a(dda.r, new ddu(ddg.a(100.0F))));
      a(
         $$0,
         B,
         dcz.a(dcz.a($$3.b(awy.ck), 1, 1, dcz.a(20), dcz.a(50), 8, but.b)).a($$2.b(aws.d)).a(dda.p, new dec(ddg.a(0.0F)), ezh.a(cv.a.a().a($$3, cwt.pb)))
      );
      a($$0, C, dcz.a(dcz.a($$3.b(awy.ch), 2, 3, dcz.a(15, 9), dcz.a(65, 9), 4, but.b)).a(dda.w, new ddj(ddg.b(1.0F))));
      a($$0, D, dcz.a(dcz.a($$3.b(awy.ch), 2, 3, dcz.a(15, 9), dcz.a(65, 9), 4, but.b)).a(dda.v, new ddj(ddg.b(5.0F))));
      a($$0, E, dcz.a(dcz.a($$3.b(awy.ci), 5, 3, dcz.a(12, 7), dcz.a(50), 2, but.b)).a(dda.u, new ddj(ddg.b(1.0F))));
      a(
         $$0,
         F,
         dcz.a(dcz.a($$3.b(awy.ci), 2, 5, dcz.a(1, 8), dcz.a(21, 8), 4, but.b))
            .a($$2.b(aws.f))
            .a(dda.e, new ddj(ddg.b(2.5F)), ezd.a(evr.b.a, bx.a.a().a(ca.a($$5, awt.B)).b()))
      );
      a(
         $$0,
         G,
         dcz.a(dcz.a($$3.b(awy.ci), 2, 3, dcz.a(17, 7), dcz.a(50), 4, but.d))
            .a($$2.b(aws.h))
            .b(dda.F, new ddj(ddg.a(1.5F, 0.75F)))
            .b(dda.C, List.of(awa.As, awa.At, awa.Au))
      );
      a(
         $$0,
         H,
         dcz.a(dcz.a($$3.b(awy.ci), 1, 1, dcz.a(25), dcz.a(50), 8, but.b))
            .a(
               dda.i,
               ddd.a,
               ddd.c,
               ddk.a(new dee(jv.a(bur.ax.r()), false), new ddw(awa.Aw, brk.a(5.0F), brk.a(1.0F))),
               eyn.a(ezk.c().b(true), ezd.a(evr.b.a, bx.a.a().a(di.a.a().b(true))), ezd.a(evr.b.c, bx.a.a().a($$5, bur.bz)))
            )
            .a(
               dda.j,
               ddk.a(new dee(jv.a(bur.ax.r()), false), new ddw(awa.Aw, brk.a(5.0F), brk.a(1.0F))),
               eyn.a(ezk.c().b(true), ezd.a(evr.b.a, bx.a.a().a($$5, bur.bz)), eyy.a(di.a.a().b(true)), eyz.a(djo.sU))
            )
      );
      a(
         $$0,
         I,
         dcz.a(dcz.a($$3.b(awy.cm), 2, 1, dcz.a(20), dcz.a(50), 4, but.b)).a($$2.b(aws.e)).a(dda.t, new ddj(ddg.b(2.0F))).a(dda.s, new ddj(ddg.b(10.0F)))
      );
      a(
         $$0,
         J,
         dcz.a(dcz.a($$3.b(awy.cm), 5, 3, dcz.a(12, 20), dcz.a(50), 2, but.b, but.c))
            .b(dda.A, new ddj(ddg.b(-0.25F)))
            .b(
               dda.B,
               List.of(
                  new cvg.b(Optional.of(awa.gM), Optional.empty(), Optional.of(awa.gJ)),
                  new cvg.b(Optional.of(awa.gN), Optional.empty(), Optional.of(awa.gJ)),
                  new cvg.b(Optional.of(awa.gO), Optional.empty(), Optional.of(awa.gJ))
               )
            )
      );
      a($$0, K, dcz.a(dcz.a($$3.b(awy.cm), 10, 4, dcz.a(1, 10), dcz.a(50), 1, but.b)).a($$2.b(aws.e)).a(dda.q, new ddj(ddg.b(1.0F))));
      a($$0, L, dcz.a(dcz.a($$3.b(awy.co), 5, 5, dcz.a(5, 8), dcz.a(25, 8), 2, but.b)).a($$2.b(aws.f)).a(dda.f, new ddj(ddg.b(0.5F))));
      a($$0, M, dcz.a(dcz.a($$3.b(awy.co), 2, 4, dcz.a(15, 9), dcz.a(65, 9), 4, but.b)).a($$2.b(aws.f)).a(dda.h, new ddj(ddg.b(-0.15F))));
      a(
         $$0,
         N,
         dcz.a(dcz.a($$3.b(awy.co), 2, 3, dcz.a(15, 9), dcz.a(65, 9), 4, but.b))
            .a(
               dda.i,
               ddd.a,
               ddd.a,
               new ddt(
                  false,
                  Optional.empty(),
                  Optional.of(ddg.a(List.of(1.2F, 1.75F, 2.2F), ddg.a(1.5F, 0.35F))),
                  $$4.a(awp.cB).map(Function.identity()),
                  fba.c,
                  ddg.a(3.5F),
                  false,
                  dgi.a.e,
                  lt.A,
                  lt.z,
                  awa.Df
               ),
               ezd.a(evr.b.c, bx.a.a().a(bv.a.a().f(false)).a(dm.d(dk.c.b(1.5))))
            )
      );
      a($$0, O, dcz.a(dcz.a($$3.b(awy.cj), 2, 1, dcz.a(25, 25), dcz.a(75, 25), 4, but.a)).a(dda.z, new ddv(ddg.a(2.0F))));
      a($$0, P, dcz.a(dcz.a($$3.b(awy.cn), 1, 1, dcz.a(25), dcz.a(50), 8, but.a)).a(dda.D));
   }

   private static void a(qe<dcz> $$0, akt<dcz> $$1, dcz.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akt<dcz> a(String $$0) {
      return akt.a(mc.aO, aku.b($$0));
   }
}
