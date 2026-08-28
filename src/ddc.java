import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ddc {
   public static final akt<dcx> a = a("protection");
   public static final akt<dcx> b = a("fire_protection");
   public static final akt<dcx> c = a("feather_falling");
   public static final akt<dcx> d = a("blast_protection");
   public static final akt<dcx> e = a("projectile_protection");
   public static final akt<dcx> f = a("respiration");
   public static final akt<dcx> g = a("aqua_affinity");
   public static final akt<dcx> h = a("thorns");
   public static final akt<dcx> i = a("depth_strider");
   public static final akt<dcx> j = a("frost_walker");
   public static final akt<dcx> k = a("binding_curse");
   public static final akt<dcx> l = a("soul_speed");
   public static final akt<dcx> m = a("swift_sneak");
   public static final akt<dcx> n = a("sharpness");
   public static final akt<dcx> o = a("smite");
   public static final akt<dcx> p = a("bane_of_arthropods");
   public static final akt<dcx> q = a("knockback");
   public static final akt<dcx> r = a("fire_aspect");
   public static final akt<dcx> s = a("looting");
   public static final akt<dcx> t = a("sweeping_edge");
   public static final akt<dcx> u = a("efficiency");
   public static final akt<dcx> v = a("silk_touch");
   public static final akt<dcx> w = a("unbreaking");
   public static final akt<dcx> x = a("fortune");
   public static final akt<dcx> y = a("power");
   public static final akt<dcx> z = a("punch");
   public static final akt<dcx> A = a("flame");
   public static final akt<dcx> B = a("infinity");
   public static final akt<dcx> C = a("luck_of_the_sea");
   public static final akt<dcx> D = a("lure");
   public static final akt<dcx> E = a("loyalty");
   public static final akt<dcx> F = a("impaling");
   public static final akt<dcx> G = a("riptide");
   public static final akt<dcx> H = a("channeling");
   public static final akt<dcx> I = a("multishot");
   public static final akt<dcx> J = a("quick_charge");
   public static final akt<dcx> K = a("piercing");
   public static final akt<dcx> L = a("density");
   public static final akt<dcx> M = a("breach");
   public static final akt<dcx> N = a("wind_burst");
   public static final akt<dcx> O = a("mending");
   public static final akt<dcx> P = a("vanishing_curse");

   public static void a(qe<dcx> $$0) {
      js<btb> $$1 = $$0.a(mc.s);
      js<dcx> $$2 = $$0.a(mc.aO);
      js<cwj> $$3 = $$0.a(mc.K);
      js<djk> $$4 = $$0.a(mc.f);
      js<buq<?>> $$5 = $$0.a(mc.z);
      a(
         $$0,
         a,
         dcx.a(dcx.a($$3.b(awx.ca), 10, 4, dcx.a(1, 11), dcx.a(12, 11), 1, bus.i))
            .a($$2.b(awr.b))
            .a(dcy.c, new ddh(dde.b(1.0F)), eyr.a(bm.a.a().a(eh.b(awq.d))))
      );
      a(
         $$0,
         b,
         dcx.a(dcx.a($$3.b(awx.ca), 5, 4, dcx.a(10, 8), dcx.a(18, 8), 2, bus.i))
            .a($$2.b(awr.b))
            .a(dcy.c, new ddh(dde.b(2.0F)), eyl.a(eyr.a(bm.a.a().a(eh.a(awq.i)).a(eh.b(awq.d)))))
            .a(dcy.l, new ddn(aku.b("enchantment.fire_protection"), bwn.h, dde.b(-0.15F), bwl.a.b))
      );
      a(
         $$0,
         c,
         dcx.a(dcx.a($$3.b(awx.bW), 5, 4, dcx.a(5, 6), dcx.a(11, 6), 2, bus.i)).a(dcy.c, new ddh(dde.b(3.0F)), eyr.a(bm.a.a().a(eh.a(awq.m)).a(eh.b(awq.d))))
      );
      a(
         $$0,
         d,
         dcx.a(dcx.a($$3.b(awx.ca), 2, 4, dcx.a(5, 8), dcx.a(13, 8), 4, bus.i))
            .a($$2.b(awr.b))
            .a(dcy.c, new ddh(dde.b(2.0F)), eyr.a(bm.a.a().a(eh.a(awq.l)).a(eh.b(awq.d))))
            .a(dcy.l, new ddn(aku.b("enchantment.blast_protection"), bwn.i, dde.b(0.15F), bwl.a.a))
      );
      a(
         $$0,
         e,
         dcx.a(dcx.a($$3.b(awx.ca), 5, 4, dcx.a(3, 6), dcx.a(9, 6), 2, bus.i))
            .a($$2.b(awr.b))
            .a(dcy.c, new ddh(dde.b(2.0F)), eyr.a(bm.a.a().a(eh.a(awq.j)).a(eh.b(awq.d))))
      );
      a(
         $$0,
         f,
         dcx.a(dcx.a($$3.b(awx.bZ), 2, 3, dcx.a(10, 10), dcx.a(40, 10), 4, bus.h))
            .a(dcy.l, new ddn(aku.b("enchantment.respiration"), bwn.w, dde.b(1.0F), bwl.a.a))
      );
      a(
         $$0,
         g,
         dcx.a(dcx.a($$3.b(awx.bZ), 2, 1, dcx.a(1), dcx.a(41), 4, bus.h)).a(dcy.l, new ddn(aku.b("enchantment.aqua_affinity"), bwn.C, dde.b(4.0F), bwl.a.c))
      );
      a(
         $$0,
         h,
         dcx.a(dcx.a($$3.b(awx.ca), $$3.b(awx.bY), 1, 3, dcx.a(10, 20), dcx.a(60, 20), 8, bus.a))
            .a(dcy.i, ddb.c, ddb.a, ddi.a(new ddl(dde.a(1.0F), dde.a(5.0F), $$1.b(btc.P)), new ddk(dde.a(2.0F))), ezd.a(ezs.a(dde.b(0.15F))))
      );
      a(
         $$0,
         i,
         dcx.a(dcx.a($$3.b(awx.bW), 2, 3, dcx.a(10, 10), dcx.a(25, 10), 4, bus.e))
            .a($$2.b(awr.c))
            .a(dcy.l, new ddn(aku.b("enchantment.depth_strider"), bwn.F, dde.b(0.33333334F), bwl.a.a))
      );
      a(
         $$0,
         j,
         dcx.a(dcx.a($$3.b(awx.bW), 2, 2, dcx.a(10, 10), dcx.a(25, 10), 4, bus.e))
            .a($$2.b(awr.c))
            .a(dcy.d, ddm.a, eyr.a(bm.a.a().a(eh.a(awq.E)).a(eh.b(awq.d))))
            .a(
               dcy.n,
               new ddx(
                  new dde.a(dde.a(3.0F, 1.0F), 0.0F, 16.0F),
                  dde.a(1.0F),
                  new km(0, -1, 0),
                  Optional.of(edx.a(edx.a(new km(0, 1, 0), awo.cD), edx.a(djm.J), edx.a(esy.c), edx.f())),
                  ekb.a(djm.lk),
                  Optional.of(ebr.i)
               ),
               ezb.a(evp.b.a, bx.a.a().a(bv.a.a().a(true)))
            )
      );
      a($$0, k, dcx.a(dcx.a($$3.b(awx.cl), 1, 1, dcx.a(25), dcx.a(50), 8, bus.i)).a(dcy.E));
      bx.a $$6 = bx.a.a().a(5).a(bv.a.a().f(false).a(true)).a(dm.b(dk.c.b(1.0E-5F))).c(di.a.a().a(ay.a.a().a($$4, awo.aQ)));
      eyl.a $$7 = eyl.a(
         eyv.a(ezb.a(evp.b.a, bx.a.a().a(bx.a.a()))),
         eym.a(
            eyl.a(
               eys.c(),
               ezb.a(evp.b.a, bx.a.a().a(bv.a.a().f(false))),
               eym.a(ezb.a(evp.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awo.aQ)))), ezb.a(evp.b.a, bx.a.a().a(bv.a.a().a(false)).b()))
            ),
            eyl.a(eys.d(), ezb.a(evp.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awo.aQ))).a(bv.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         dcx.a(dcx.a($$3.b(awx.bW), 1, 3, dcx.a(10, 10), dcx.a(25, 10), 8, bus.e))
            .a(
               dcy.n,
               ddi.a(
                  new ddn(aku.b("enchantment.soul_speed"), bwn.v, dde.a(0.0405F, 0.0105F), bwl.a.a),
                  new ddn(aku.b("enchantment.soul_speed"), bwn.u, dde.a(1.0F), bwl.a.a)
               ),
               $$7
            )
            .a(
               dcy.n,
               new ddk(dde.a(1.0F)),
               eyl.a(ezd.a(ezs.a(dde.a(0.04F))), ezb.a(evp.b.a, bx.a.a().a(bv.a.a().a(true)).c(di.a.a().a(ay.a.a().a($$4, awo.aQ)))))
            )
            .a(dcy.o, new deb(lt.N, deb.b(), deb.a(0.1F), deb.b(-0.2F), deb.a(brj.a(0.1F)), brj.a(1.0F)), ezb.a(evp.b.a, $$6))
            .a(dcy.o, new ddu(avz.yq, brj.a(0.6F), brs.b(0.6F, 1.0F)), eyl.a(ezd.a(0.35F), ezb.a(evp.b.a, $$6)))
      );
      a(
         $$0,
         m,
         dcx.a(dcx.a($$3.b(awx.bX), 1, 3, dcx.a(25, 25), dcx.a(75, 25), 8, bus.f))
            .a(dcy.l, new ddn(aku.b("enchantment.swift_sneak"), bwn.z, dde.b(0.15F), bwl.a.a))
      );
      a($$0, n, dcx.a(dcx.a($$3.b(awx.cd), $$3.b(awx.cb), 10, 5, dcx.a(1, 11), dcx.a(21, 11), 1, bus.b)).a($$2.b(awr.f)).a(dcy.e, new ddh(dde.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         dcx.a(dcx.a($$3.b(awx.ce), $$3.b(awx.cb), 5, 5, dcx.a(5, 8), dcx.a(25, 8), 2, bus.b))
            .a($$2.b(awr.f))
            .a(dcy.e, new ddh(dde.b(2.5F)), ezb.a(evp.b.a, bx.a.a().a(ca.a($$5, aws.D))))
      );
      a(
         $$0,
         p,
         dcx.a(dcx.a($$3.b(awx.ce), $$3.b(awx.cb), 5, 5, dcx.a(5, 8), dcx.a(25, 8), 2, bus.b))
            .a($$2.b(awr.f))
            .a(dcy.e, new ddh(dde.b(2.5F)), ezb.a(evp.b.a, bx.a.a().a(ca.a($$5, aws.C))))
            .a(
               dcy.i,
               ddb.a,
               ddb.c,
               new ddj(jv.a(btq.b), dde.a(1.5F), dde.a(1.5F, 0.5F), dde.a(3.0F), dde.a(3.0F)),
               ezb.a(evp.b.a, bx.a.a().a(ca.a($$5, aws.C))).and(eyr.a(bm.a.a().a(true)))
            )
      );
      a($$0, q, dcx.a(dcx.a($$3.b(awx.cb), 5, 2, dcx.a(5, 20), dcx.a(55, 20), 2, bus.b)).a(dcy.g, new ddh(dde.b(1.0F))));
      a(
         $$0,
         r,
         dcx.a(dcx.a($$3.b(awx.cc), $$3.b(awx.cb), 2, 2, dcx.a(10, 20), dcx.a(60, 20), 4, bus.b))
            .a(dcy.i, ddb.a, ddb.c, new dds(dde.b(4.0F)), eyr.a(bm.a.a().a(true)))
      );
      a(
         $$0,
         s,
         dcx.a(dcx.a($$3.b(awx.cb), 2, 3, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b))
            .a(dcy.m, ddb.a, ddb.c, new ddh(dde.b(0.01F)), ezb.a(evp.b.b, bx.a.a().a(ca.a($$5, buq.bR))))
      );
      a(
         $$0,
         t,
         dcx.a(dcx.a($$3.b(awx.cb), 2, 3, dcx.a(5, 9), dcx.a(20, 9), 4, bus.b))
            .a(dcy.l, new ddn(aku.b("enchantment.sweeping_edge"), bwn.D, new dde.c(dde.b(1.0F), dde.a(2.0F, 1.0F)), bwl.a.a))
      );
      a(
         $$0,
         u,
         dcx.a(dcx.a($$3.b(awx.cf), 10, 5, dcx.a(1, 10), dcx.a(51, 10), 1, bus.b))
            .a(dcy.l, new ddn(aku.b("enchantment.efficiency"), bwn.t, new dde.d(1.0F), bwl.a.a))
      );
      a($$0, v, dcx.a(dcx.a($$3.b(awx.cg), 1, 1, dcx.a(15), dcx.a(65), 8, bus.b)).a($$2.b(awr.g)).a(dcy.x, new dea(dde.a(0.0F))));
      a(
         $$0,
         w,
         dcx.a(dcx.a($$3.b(awx.cj), 5, 3, dcx.a(5, 8), dcx.a(55, 8), 2, bus.a))
            .a(dcy.k, new ddv(new dde.c(dde.b(2.0F), dde.a(10.0F, 5.0F))), ezf.a(cv.a.a().a($$3, awx.ca)))
            .a(dcy.k, new ddv(new dde.c(dde.b(1.0F), dde.a(2.0F, 1.0F))), eyv.a(ezf.a(cv.a.a().a($$3, awx.ca))))
      );
      a($$0, x, dcx.a(dcx.a($$3.b(awx.cg), 2, 3, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b)).a($$2.b(awr.g)));
      a(
         $$0,
         y,
         dcx.a(dcx.a($$3.b(awx.ck), 10, 5, dcx.a(1, 10), dcx.a(16, 10), 1, bus.b))
            .a(dcy.e, new ddh(dde.a(1.0F, 0.5F)), ezb.a(evp.b.c, bx.a.a().a($$5, aws.f).b()))
      );
      a(
         $$0,
         z,
         dcx.a(dcx.a($$3.b(awx.ck), 2, 2, dcx.a(12, 20), dcx.a(37, 20), 4, bus.b)).a(dcy.g, new ddh(dde.b(1.0F)), ezb.a(evp.b.c, bx.a.a().a($$5, aws.f).b()))
      );
      a($$0, A, dcx.a(dcx.a($$3.b(awx.ck), 2, 1, dcx.a(20), dcx.a(50), 4, bus.b)).a(dcy.r, new dds(dde.a(100.0F))));
      a(
         $$0,
         B,
         dcx.a(dcx.a($$3.b(awx.ck), 1, 1, dcx.a(20), dcx.a(50), 8, bus.b)).a($$2.b(awr.d)).a(dcy.p, new dea(dde.a(0.0F)), ezf.a(cv.a.a().a($$3, cwr.pb)))
      );
      a($$0, C, dcx.a(dcx.a($$3.b(awx.ch), 2, 3, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b)).a(dcy.w, new ddh(dde.b(1.0F))));
      a($$0, D, dcx.a(dcx.a($$3.b(awx.ch), 2, 3, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b)).a(dcy.v, new ddh(dde.b(5.0F))));
      a($$0, E, dcx.a(dcx.a($$3.b(awx.ci), 5, 3, dcx.a(12, 7), dcx.a(50), 2, bus.b)).a(dcy.u, new ddh(dde.b(1.0F))));
      a(
         $$0,
         F,
         dcx.a(dcx.a($$3.b(awx.ci), 2, 5, dcx.a(1, 8), dcx.a(21, 8), 4, bus.b))
            .a($$2.b(awr.f))
            .a(dcy.e, new ddh(dde.b(2.5F)), ezb.a(evp.b.a, bx.a.a().a(ca.a($$5, aws.B)).b()))
      );
      a(
         $$0,
         G,
         dcx.a(dcx.a($$3.b(awx.ci), 2, 3, dcx.a(17, 7), dcx.a(50), 4, bus.d))
            .a($$2.b(awr.h))
            .b(dcy.F, new ddh(dde.a(1.5F, 0.75F)))
            .b(dcy.C, List.of(avz.Ar, avz.As, avz.At))
      );
      a(
         $$0,
         H,
         dcx.a(dcx.a($$3.b(awx.ci), 1, 1, dcx.a(25), dcx.a(50), 8, bus.b))
            .a(
               dcy.i,
               ddb.a,
               ddb.c,
               ddi.a(new dec(jv.a(buq.aw.r()), false), new ddu(avz.Av, brj.a(5.0F), brj.a(1.0F))),
               eyl.a(ezi.c().b(true), ezb.a(evp.b.a, bx.a.a().a(di.a.a().b(true))), ezb.a(evp.b.c, bx.a.a().a($$5, buq.by)))
            )
            .a(
               dcy.j,
               ddi.a(new dec(jv.a(buq.aw.r()), false), new ddu(avz.Av, brj.a(5.0F), brj.a(1.0F))),
               eyl.a(ezi.c().b(true), ezb.a(evp.b.a, bx.a.a().a($$5, buq.by)), eyw.a(di.a.a().b(true)), eyx.a(djm.sU))
            )
      );
      a(
         $$0,
         I,
         dcx.a(dcx.a($$3.b(awx.cm), 2, 1, dcx.a(20), dcx.a(50), 4, bus.b)).a($$2.b(awr.e)).a(dcy.t, new ddh(dde.b(2.0F))).a(dcy.s, new ddh(dde.b(10.0F)))
      );
      a(
         $$0,
         J,
         dcx.a(dcx.a($$3.b(awx.cm), 5, 3, dcx.a(12, 20), dcx.a(50), 2, bus.b, bus.c))
            .b(dcy.A, new ddh(dde.b(-0.25F)))
            .b(
               dcy.B,
               List.of(
                  new cve.b(Optional.of(avz.gM), Optional.empty(), Optional.of(avz.gJ)),
                  new cve.b(Optional.of(avz.gN), Optional.empty(), Optional.of(avz.gJ)),
                  new cve.b(Optional.of(avz.gO), Optional.empty(), Optional.of(avz.gJ))
               )
            )
      );
      a($$0, K, dcx.a(dcx.a($$3.b(awx.cm), 10, 4, dcx.a(1, 10), dcx.a(50), 1, bus.b)).a($$2.b(awr.e)).a(dcy.q, new ddh(dde.b(1.0F))));
      a($$0, L, dcx.a(dcx.a($$3.b(awx.co), 5, 5, dcx.a(5, 8), dcx.a(25, 8), 2, bus.b)).a($$2.b(awr.f)).a(dcy.f, new ddh(dde.b(0.5F))));
      a($$0, M, dcx.a(dcx.a($$3.b(awx.co), 2, 4, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b)).a($$2.b(awr.f)).a(dcy.h, new ddh(dde.b(-0.15F))));
      a(
         $$0,
         N,
         dcx.a(dcx.a($$3.b(awx.co), 2, 3, dcx.a(15, 9), dcx.a(65, 9), 4, bus.b))
            .a(
               dcy.i,
               ddb.a,
               ddb.a,
               new ddr(
                  false,
                  Optional.empty(),
                  Optional.of(dde.a(List.of(1.2F, 1.75F, 2.2F), dde.a(1.5F, 0.35F))),
                  $$4.a(awo.cB).map(Function.identity()),
                  fay.c,
                  dde.a(3.5F),
                  false,
                  dgg.a.e,
                  lt.A,
                  lt.z,
                  avz.De
               ),
               ezb.a(evp.b.c, bx.a.a().a(bv.a.a().f(false)).a(dm.d(dk.c.b(1.5))))
            )
      );
      a($$0, O, dcx.a(dcx.a($$3.b(awx.cj), 2, 1, dcx.a(25, 25), dcx.a(75, 25), 4, bus.a)).a(dcy.z, new ddt(dde.a(2.0F))));
      a($$0, P, dcx.a(dcx.a($$3.b(awx.cn), 1, 1, dcx.a(25), dcx.a(50), 8, bus.a)).a(dcy.D));
   }

   private static void a(qe<dcx> $$0, akt<dcx> $$1, dcx.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akt<dcx> a(String $$0) {
      return akt.a(mc.aO, aku.b($$0));
   }
}
