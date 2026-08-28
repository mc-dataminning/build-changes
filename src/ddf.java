import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ddf {
   public static final aku<dda> a = a("protection");
   public static final aku<dda> b = a("fire_protection");
   public static final aku<dda> c = a("feather_falling");
   public static final aku<dda> d = a("blast_protection");
   public static final aku<dda> e = a("projectile_protection");
   public static final aku<dda> f = a("respiration");
   public static final aku<dda> g = a("aqua_affinity");
   public static final aku<dda> h = a("thorns");
   public static final aku<dda> i = a("depth_strider");
   public static final aku<dda> j = a("frost_walker");
   public static final aku<dda> k = a("binding_curse");
   public static final aku<dda> l = a("soul_speed");
   public static final aku<dda> m = a("swift_sneak");
   public static final aku<dda> n = a("sharpness");
   public static final aku<dda> o = a("smite");
   public static final aku<dda> p = a("bane_of_arthropods");
   public static final aku<dda> q = a("knockback");
   public static final aku<dda> r = a("fire_aspect");
   public static final aku<dda> s = a("looting");
   public static final aku<dda> t = a("sweeping_edge");
   public static final aku<dda> u = a("efficiency");
   public static final aku<dda> v = a("silk_touch");
   public static final aku<dda> w = a("unbreaking");
   public static final aku<dda> x = a("fortune");
   public static final aku<dda> y = a("power");
   public static final aku<dda> z = a("punch");
   public static final aku<dda> A = a("flame");
   public static final aku<dda> B = a("infinity");
   public static final aku<dda> C = a("luck_of_the_sea");
   public static final aku<dda> D = a("lure");
   public static final aku<dda> E = a("loyalty");
   public static final aku<dda> F = a("impaling");
   public static final aku<dda> G = a("riptide");
   public static final aku<dda> H = a("channeling");
   public static final aku<dda> I = a("multishot");
   public static final aku<dda> J = a("quick_charge");
   public static final aku<dda> K = a("piercing");
   public static final aku<dda> L = a("density");
   public static final aku<dda> M = a("breach");
   public static final aku<dda> N = a("wind_burst");
   public static final aku<dda> O = a("mending");
   public static final aku<dda> P = a("vanishing_curse");

   public static void a(qe<dda> $$0) {
      js<bte> $$1 = $$0.a(mc.s);
      js<dda> $$2 = $$0.a(mc.aO);
      js<cwm> $$3 = $$0.a(mc.K);
      js<djn> $$4 = $$0.a(mc.f);
      js<but<?>> $$5 = $$0.a(mc.z);
      a(
         $$0,
         a,
         dda.a(dda.a($$3.b(awy.ca), 10, 4, dda.a(1, 11), dda.a(12, 11), 1, buv.i))
            .a($$2.b(aws.b))
            .a(ddb.c, new ddk(ddh.b(1.0F)), eyu.a(bm.a.a().a(eh.b(awr.d))))
      );
      a(
         $$0,
         b,
         dda.a(dda.a($$3.b(awy.ca), 5, 4, dda.a(10, 8), dda.a(18, 8), 2, buv.i))
            .a($$2.b(aws.b))
            .a(ddb.c, new ddk(ddh.b(2.0F)), eyo.a(eyu.a(bm.a.a().a(eh.a(awr.i)).a(eh.b(awr.d)))))
            .a(ddb.l, new ddq(akv.b("enchantment.fire_protection"), bwq.h, ddh.b(-0.15F), bwo.a.b))
      );
      a(
         $$0,
         c,
         dda.a(dda.a($$3.b(awy.bW), 5, 4, dda.a(5, 6), dda.a(11, 6), 2, buv.i)).a(ddb.c, new ddk(ddh.b(3.0F)), eyu.a(bm.a.a().a(eh.a(awr.m)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         d,
         dda.a(dda.a($$3.b(awy.ca), 2, 4, dda.a(5, 8), dda.a(13, 8), 4, buv.i))
            .a($$2.b(aws.b))
            .a(ddb.c, new ddk(ddh.b(2.0F)), eyu.a(bm.a.a().a(eh.a(awr.l)).a(eh.b(awr.d))))
            .a(ddb.l, new ddq(akv.b("enchantment.blast_protection"), bwq.i, ddh.b(0.15F), bwo.a.a))
      );
      a(
         $$0,
         e,
         dda.a(dda.a($$3.b(awy.ca), 5, 4, dda.a(3, 6), dda.a(9, 6), 2, buv.i))
            .a($$2.b(aws.b))
            .a(ddb.c, new ddk(ddh.b(2.0F)), eyu.a(bm.a.a().a(eh.a(awr.j)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         f,
         dda.a(dda.a($$3.b(awy.bZ), 2, 3, dda.a(10, 10), dda.a(40, 10), 4, buv.h))
            .a(ddb.l, new ddq(akv.b("enchantment.respiration"), bwq.w, ddh.b(1.0F), bwo.a.a))
      );
      a(
         $$0,
         g,
         dda.a(dda.a($$3.b(awy.bZ), 2, 1, dda.a(1), dda.a(41), 4, buv.h)).a(ddb.l, new ddq(akv.b("enchantment.aqua_affinity"), bwq.C, ddh.b(4.0F), bwo.a.c))
      );
      a(
         $$0,
         h,
         dda.a(dda.a($$3.b(awy.ca), $$3.b(awy.bY), 1, 3, dda.a(10, 20), dda.a(60, 20), 8, buv.a))
            .a(ddb.i, dde.c, dde.a, ddl.a(new ddo(ddh.a(1.0F), ddh.a(5.0F), $$1.b(btf.P)), new ddn(ddh.a(2.0F))), ezg.a(ezv.a(ddh.b(0.15F))))
      );
      a(
         $$0,
         i,
         dda.a(dda.a($$3.b(awy.bW), 2, 3, dda.a(10, 10), dda.a(25, 10), 4, buv.e))
            .a($$2.b(aws.c))
            .a(ddb.l, new ddq(akv.b("enchantment.depth_strider"), bwq.F, ddh.b(0.33333334F), bwo.a.a))
      );
      a(
         $$0,
         j,
         dda.a(dda.a($$3.b(awy.bW), 2, 2, dda.a(10, 10), dda.a(25, 10), 4, buv.e))
            .a($$2.b(aws.c))
            .a(ddb.d, ddp.a, eyu.a(bm.a.a().a(eh.a(awr.E)).a(eh.b(awr.d))))
            .a(
               ddb.n,
               new dea(
                  new ddh.a(ddh.a(3.0F, 1.0F), 0.0F, 16.0F),
                  ddh.a(1.0F),
                  new km(0, -1, 0),
                  Optional.of(eea.a(eea.a(new km(0, 1, 0), awp.cD), eea.a(djp.J), eea.a(etb.c), eea.f())),
                  eke.a(djp.lk),
                  Optional.of(ebu.i)
               ),
               eyo.a(eze.a(evs.b.a, bx.a.a().a(bv.a.a().a(true))), eyy.a(eze.a(evs.b.a, bx.a.a().a(bx.a.a()))))
            )
      );
      a($$0, k, dda.a(dda.a($$3.b(awy.cl), 1, 1, dda.a(25), dda.a(50), 8, buv.i)).a(ddb.E));
      bx.a $$6 = bx.a.a().a(5).a(bv.a.a().f(false).a(true)).a(dm.b(dk.c.b(1.0E-5F))).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)));
      eyo.a $$7 = eyo.a(
         eyy.a(eze.a(evs.b.a, bx.a.a().a(bx.a.a()))),
         eyp.a(
            eyo.a(
               eyv.c(),
               eze.a(evs.b.a, bx.a.a().a(bv.a.a().f(false))),
               eyp.a(eze.a(evs.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))), eze.a(evs.b.a, bx.a.a().a(bv.a.a().a(false)).b()))
            ),
            eyo.a(eyv.d(), eze.a(evs.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ))).a(bv.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dda.a(dda.a($$3.b(awy.bW), 1, 3, dda.a(10, 10), dda.a(25, 10), 8, buv.e))
            .a(
               ddb.n,
               ddl.a(
                  new ddq(akv.b("enchantment.soul_speed"), bwq.v, ddh.a(0.0405F, 0.0105F), bwo.a.a),
                  new ddq(akv.b("enchantment.soul_speed"), bwq.u, ddh.a(1.0F), bwo.a.a)
               ),
               $$7
            )
            .a(
               ddb.n,
               new ddn(ddh.a(1.0F)),
               eyo.a(ezg.a(ezv.a(ddh.a(0.04F))), eze.a(evs.b.a, bx.a.a().a(bv.a.a().a(true)).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))))
            )
            .a(ddb.o, new dee(lt.N, dee.b(), dee.a(0.1F), dee.b(-0.2F), dee.a(brm.a(0.1F)), brm.a(1.0F)), eze.a(evs.b.a, $$6))
            .a(ddb.o, new ddx(awa.yq, brm.a(0.6F), brv.b(0.6F, 1.0F)), eyo.a(ezg.a(0.35F), eze.a(evs.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dda.a(dda.a($$3.b(awy.bX), 1, 3, dda.a(25, 25), dda.a(75, 25), 8, buv.f))
            .a(ddb.l, new ddq(akv.b("enchantment.swift_sneak"), bwq.z, ddh.b(0.15F), bwo.a.a))
      );
      a($$0, n, dda.a(dda.a($$3.b(awy.cd), $$3.b(awy.cb), 10, 5, dda.a(1, 11), dda.a(21, 11), 1, buv.b)).a($$2.b(aws.f)).a(ddb.e, new ddk(ddh.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dda.a(dda.a($$3.b(awy.ce), $$3.b(awy.cb), 5, 5, dda.a(5, 8), dda.a(25, 8), 2, buv.b))
            .a($$2.b(aws.f))
            .a(ddb.e, new ddk(ddh.b(2.5F)), eze.a(evs.b.a, bx.a.a().a(ca.a($$5, awt.D))))
      );
      a(
         $$0,
         p,
         dda.a(dda.a($$3.b(awy.ce), $$3.b(awy.cb), 5, 5, dda.a(5, 8), dda.a(25, 8), 2, buv.b))
            .a($$2.b(aws.f))
            .a(ddb.e, new ddk(ddh.b(2.5F)), eze.a(evs.b.a, bx.a.a().a(ca.a($$5, awt.C))))
            .a(
               ddb.i,
               dde.a,
               dde.c,
               new ddm(jv.a(btt.b), ddh.a(1.5F), ddh.a(1.5F, 0.5F), ddh.a(3.0F), ddh.a(3.0F)),
               eze.a(evs.b.a, bx.a.a().a(ca.a($$5, awt.C))).and(eyu.a(bm.a.a().a(true)))
            )
      );
      a($$0, q, dda.a(dda.a($$3.b(awy.cb), 5, 2, dda.a(5, 20), dda.a(55, 20), 2, buv.b)).a(ddb.g, new ddk(ddh.b(1.0F))));
      a(
         $$0,
         r,
         dda.a(dda.a($$3.b(awy.cc), $$3.b(awy.cb), 2, 2, dda.a(10, 20), dda.a(60, 20), 4, buv.b))
            .a(ddb.i, dde.a, dde.c, new ddv(ddh.b(4.0F)), eyu.a(bm.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dda.a(dda.a($$3.b(awy.cb), 2, 3, dda.a(15, 9), dda.a(65, 9), 4, buv.b))
            .a(ddb.m, dde.a, dde.c, new ddk(ddh.b(0.01F)), eze.a(evs.b.b, bx.a.a().a(ca.a($$5, but.bR))))
      );
      a(
         $$0,
         t,
         dda.a(dda.a($$3.b(awy.cb), 2, 3, dda.a(5, 9), dda.a(20, 9), 4, buv.b))
            .a(ddb.l, new ddq(akv.b("enchantment.sweeping_edge"), bwq.D, new ddh.c(ddh.b(1.0F), ddh.a(2.0F, 1.0F)), bwo.a.a))
      );
      a(
         $$0,
         u,
         dda.a(dda.a($$3.b(awy.cf), 10, 5, dda.a(1, 10), dda.a(51, 10), 1, buv.b))
            .a(ddb.l, new ddq(akv.b("enchantment.efficiency"), bwq.t, new ddh.d(1.0F), bwo.a.a))
      );
      a($$0, v, dda.a(dda.a($$3.b(awy.cg), 1, 1, dda.a(15), dda.a(65), 8, buv.b)).a($$2.b(aws.g)).a(ddb.x, new ded(ddh.a(0.0F))));
      a(
         $$0,
         w,
         dda.a(dda.a($$3.b(awy.cj), 5, 3, dda.a(5, 8), dda.a(55, 8), 2, buv.a))
            .a(ddb.k, new ddy(new ddh.c(ddh.b(2.0F), ddh.a(10.0F, 5.0F))), ezi.a(cv.a.a().a($$3, awy.ca)))
            .a(ddb.k, new ddy(new ddh.c(ddh.b(1.0F), ddh.a(2.0F, 1.0F))), eyy.a(ezi.a(cv.a.a().a($$3, awy.ca))))
      );
      a($$0, x, dda.a(dda.a($$3.b(awy.cg), 2, 3, dda.a(15, 9), dda.a(65, 9), 4, buv.b)).a($$2.b(aws.g)));
      a(
         $$0,
         y,
         dda.a(dda.a($$3.b(awy.ck), 10, 5, dda.a(1, 10), dda.a(16, 10), 1, buv.b))
            .a(ddb.e, new ddk(ddh.a(1.0F, 0.5F)), eze.a(evs.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a(
         $$0,
         z,
         dda.a(dda.a($$3.b(awy.ck), 2, 2, dda.a(12, 20), dda.a(37, 20), 4, buv.b)).a(ddb.g, new ddk(ddh.b(1.0F)), eze.a(evs.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a($$0, A, dda.a(dda.a($$3.b(awy.ck), 2, 1, dda.a(20), dda.a(50), 4, buv.b)).a(ddb.r, new ddv(ddh.a(100.0F))));
      a(
         $$0,
         B,
         dda.a(dda.a($$3.b(awy.ck), 1, 1, dda.a(20), dda.a(50), 8, buv.b)).a($$2.b(aws.d)).a(ddb.p, new ded(ddh.a(0.0F)), ezi.a(cv.a.a().a($$3, cwu.pb)))
      );
      a($$0, C, dda.a(dda.a($$3.b(awy.ch), 2, 3, dda.a(15, 9), dda.a(65, 9), 4, buv.b)).a(ddb.w, new ddk(ddh.b(1.0F))));
      a($$0, D, dda.a(dda.a($$3.b(awy.ch), 2, 3, dda.a(15, 9), dda.a(65, 9), 4, buv.b)).a(ddb.v, new ddk(ddh.b(5.0F))));
      a($$0, E, dda.a(dda.a($$3.b(awy.ci), 5, 3, dda.a(12, 7), dda.a(50), 2, buv.b)).a(ddb.u, new ddk(ddh.b(1.0F))));
      a(
         $$0,
         F,
         dda.a(dda.a($$3.b(awy.ci), 2, 5, dda.a(1, 8), dda.a(21, 8), 4, buv.b))
            .a($$2.b(aws.f))
            .a(ddb.e, new ddk(ddh.b(2.5F)), eze.a(evs.b.a, bx.a.a().a(ca.a($$5, awt.B)).b()))
      );
      a(
         $$0,
         G,
         dda.a(dda.a($$3.b(awy.ci), 2, 3, dda.a(17, 7), dda.a(50), 4, buv.d))
            .a($$2.b(aws.h))
            .b(ddb.F, new ddk(ddh.a(1.5F, 0.75F)))
            .b(ddb.C, List.of(awa.Ar, awa.As, awa.At))
      );
      a(
         $$0,
         H,
         dda.a(dda.a($$3.b(awy.ci), 1, 1, dda.a(25), dda.a(50), 8, buv.b))
            .a(
               ddb.i,
               dde.a,
               dde.c,
               ddl.a(new def(jv.a(but.aw.r()), false), new ddx(awa.Av, brm.a(5.0F), brm.a(1.0F))),
               eyo.a(ezl.c().b(true), eze.a(evs.b.a, bx.a.a().a(di.a.a().b(true))), eze.a(evs.b.c, bx.a.a().a($$5, but.by)))
            )
            .a(
               ddb.j,
               ddl.a(new def(jv.a(but.aw.r()), false), new ddx(awa.Av, brm.a(5.0F), brm.a(1.0F))),
               eyo.a(ezl.c().b(true), eze.a(evs.b.a, bx.a.a().a($$5, but.by)), eyz.a(di.a.a().b(true)), eza.a(djp.sU))
            )
      );
      a(
         $$0,
         I,
         dda.a(dda.a($$3.b(awy.cm), 2, 1, dda.a(20), dda.a(50), 4, buv.b)).a($$2.b(aws.e)).a(ddb.t, new ddk(ddh.b(2.0F))).a(ddb.s, new ddk(ddh.b(10.0F)))
      );
      a(
         $$0,
         J,
         dda.a(dda.a($$3.b(awy.cm), 5, 3, dda.a(12, 20), dda.a(50), 2, buv.b, buv.c))
            .b(ddb.A, new ddk(ddh.b(-0.25F)))
            .b(
               ddb.B,
               List.of(
                  new cvh.b(Optional.of(awa.gM), Optional.empty(), Optional.of(awa.gJ)),
                  new cvh.b(Optional.of(awa.gN), Optional.empty(), Optional.of(awa.gJ)),
                  new cvh.b(Optional.of(awa.gO), Optional.empty(), Optional.of(awa.gJ))
               )
            )
      );
      a($$0, K, dda.a(dda.a($$3.b(awy.cm), 10, 4, dda.a(1, 10), dda.a(50), 1, buv.b)).a($$2.b(aws.e)).a(ddb.q, new ddk(ddh.b(1.0F))));
      a($$0, L, dda.a(dda.a($$3.b(awy.co), 5, 5, dda.a(5, 8), dda.a(25, 8), 2, buv.b)).a($$2.b(aws.f)).a(ddb.f, new ddk(ddh.b(0.5F))));
      a($$0, M, dda.a(dda.a($$3.b(awy.co), 2, 4, dda.a(15, 9), dda.a(65, 9), 4, buv.b)).a($$2.b(aws.f)).a(ddb.h, new ddk(ddh.b(-0.15F))));
      a(
         $$0,
         N,
         dda.a(dda.a($$3.b(awy.co), 2, 3, dda.a(15, 9), dda.a(65, 9), 4, buv.b))
            .a(
               ddb.i,
               dde.a,
               dde.a,
               new ddu(
                  false,
                  Optional.empty(),
                  Optional.of(ddh.a(List.of(1.2F, 1.75F, 2.2F), ddh.a(1.5F, 0.35F))),
                  $$4.a(awp.cB).map(Function.identity()),
                  fbb.c,
                  ddh.a(3.5F),
                  false,
                  dgj.a.e,
                  lt.A,
                  lt.z,
                  awa.De
               ),
               eze.a(evs.b.c, bx.a.a().a(bv.a.a().f(false)).a(dm.d(dk.c.b(1.5))))
            )
      );
      a($$0, O, dda.a(dda.a($$3.b(awy.cj), 2, 1, dda.a(25, 25), dda.a(75, 25), 4, buv.a)).a(ddb.z, new ddw(ddh.a(2.0F))));
      a($$0, P, dda.a(dda.a($$3.b(awy.cn), 1, 1, dda.a(25), dda.a(50), 8, buv.a)).a(ddb.D));
   }

   private static void a(qe<dda> $$0, aku<dda> $$1, dda.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static aku<dda> a(String $$0) {
      return aku.a(mc.aO, akv.b($$0));
   }
}
