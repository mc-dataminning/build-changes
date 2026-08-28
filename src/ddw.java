import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ddw {
   public static final akt<ddr> a = a("protection");
   public static final akt<ddr> b = a("fire_protection");
   public static final akt<ddr> c = a("feather_falling");
   public static final akt<ddr> d = a("blast_protection");
   public static final akt<ddr> e = a("projectile_protection");
   public static final akt<ddr> f = a("respiration");
   public static final akt<ddr> g = a("aqua_affinity");
   public static final akt<ddr> h = a("thorns");
   public static final akt<ddr> i = a("depth_strider");
   public static final akt<ddr> j = a("frost_walker");
   public static final akt<ddr> k = a("binding_curse");
   public static final akt<ddr> l = a("soul_speed");
   public static final akt<ddr> m = a("swift_sneak");
   public static final akt<ddr> n = a("sharpness");
   public static final akt<ddr> o = a("smite");
   public static final akt<ddr> p = a("bane_of_arthropods");
   public static final akt<ddr> q = a("knockback");
   public static final akt<ddr> r = a("fire_aspect");
   public static final akt<ddr> s = a("looting");
   public static final akt<ddr> t = a("sweeping_edge");
   public static final akt<ddr> u = a("efficiency");
   public static final akt<ddr> v = a("silk_touch");
   public static final akt<ddr> w = a("unbreaking");
   public static final akt<ddr> x = a("fortune");
   public static final akt<ddr> y = a("power");
   public static final akt<ddr> z = a("punch");
   public static final akt<ddr> A = a("flame");
   public static final akt<ddr> B = a("infinity");
   public static final akt<ddr> C = a("luck_of_the_sea");
   public static final akt<ddr> D = a("lure");
   public static final akt<ddr> E = a("loyalty");
   public static final akt<ddr> F = a("impaling");
   public static final akt<ddr> G = a("riptide");
   public static final akt<ddr> H = a("channeling");
   public static final akt<ddr> I = a("multishot");
   public static final akt<ddr> J = a("quick_charge");
   public static final akt<ddr> K = a("piercing");
   public static final akt<ddr> L = a("density");
   public static final akt<ddr> M = a("breach");
   public static final akt<ddr> N = a("wind_burst");
   public static final akt<ddr> O = a("mending");
   public static final akt<ddr> P = a("vanishing_curse");

   public static void a(qe<ddr> $$0) {
      js<btr> $$1 = $$0.a(mc.s);
      js<ddr> $$2 = $$0.a(mc.aP);
      js<cxd> $$3 = $$0.a(mc.K);
      js<dke> $$4 = $$0.a(mc.f);
      js<bvi<?>> $$5 = $$0.a(mc.z);
      a(
         $$0,
         a,
         ddr.a(ddr.a($$3.b(awy.cb), 10, 4, ddr.a(1, 11), ddr.a(12, 11), 1, bvk.i))
            .a($$2.b(aws.b))
            .a(dds.c, new deb(ddy.b(1.0F)), ezq.a(bm.a.a().a(eh.b(awr.d))))
      );
      a(
         $$0,
         b,
         ddr.a(ddr.a($$3.b(awy.cb), 5, 4, ddr.a(10, 8), ddr.a(18, 8), 2, bvk.i))
            .a($$2.b(aws.b))
            .a(dds.c, new deb(ddy.b(2.0F)), ezk.a(ezq.a(bm.a.a().a(eh.a(awr.i)).a(eh.b(awr.d)))))
            .a(dds.l, new deh(aku.b("enchantment.fire_protection"), bxg.h, ddy.b(-0.15F), bxe.a.b))
      );
      a(
         $$0,
         c,
         ddr.a(ddr.a($$3.b(awy.bX), 5, 4, ddr.a(5, 6), ddr.a(11, 6), 2, bvk.i)).a(dds.c, new deb(ddy.b(3.0F)), ezq.a(bm.a.a().a(eh.a(awr.m)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         d,
         ddr.a(ddr.a($$3.b(awy.cb), 2, 4, ddr.a(5, 8), ddr.a(13, 8), 4, bvk.i))
            .a($$2.b(aws.b))
            .a(dds.c, new deb(ddy.b(2.0F)), ezq.a(bm.a.a().a(eh.a(awr.l)).a(eh.b(awr.d))))
            .a(dds.l, new deh(aku.b("enchantment.blast_protection"), bxg.i, ddy.b(0.15F), bxe.a.a))
      );
      a(
         $$0,
         e,
         ddr.a(ddr.a($$3.b(awy.cb), 5, 4, ddr.a(3, 6), ddr.a(9, 6), 2, bvk.i))
            .a($$2.b(aws.b))
            .a(dds.c, new deb(ddy.b(2.0F)), ezq.a(bm.a.a().a(eh.a(awr.j)).a(eh.b(awr.d))))
      );
      a(
         $$0,
         f,
         ddr.a(ddr.a($$3.b(awy.ca), 2, 3, ddr.a(10, 10), ddr.a(40, 10), 4, bvk.h))
            .a(dds.l, new deh(aku.b("enchantment.respiration"), bxg.w, ddy.b(1.0F), bxe.a.a))
      );
      a(
         $$0,
         g,
         ddr.a(ddr.a($$3.b(awy.ca), 2, 1, ddr.a(1), ddr.a(41), 4, bvk.h)).a(dds.l, new deh(aku.b("enchantment.aqua_affinity"), bxg.C, ddy.b(4.0F), bxe.a.c))
      );
      a(
         $$0,
         h,
         ddr.a(ddr.a($$3.b(awy.cb), $$3.b(awy.bZ), 1, 3, ddr.a(10, 20), ddr.a(60, 20), 8, bvk.a))
            .a(dds.i, ddv.c, ddv.a, dec.a(new def(ddy.a(1.0F), ddy.a(5.0F), $$1.b(bts.P)), new dee(ddy.a(2.0F))), fac.a(far.a(ddy.b(0.15F))))
      );
      a(
         $$0,
         i,
         ddr.a(ddr.a($$3.b(awy.bX), 2, 3, ddr.a(10, 10), ddr.a(25, 10), 4, bvk.e))
            .a($$2.b(aws.c))
            .a(dds.l, new deh(aku.b("enchantment.depth_strider"), bxg.F, ddy.b(0.33333334F), bxe.a.a))
      );
      a(
         $$0,
         j,
         ddr.a(ddr.a($$3.b(awy.bX), 2, 2, ddr.a(10, 10), ddr.a(25, 10), 4, bvk.e))
            .a($$2.b(aws.c))
            .a(dds.d, deg.a, ezq.a(bm.a.a().a(eh.a(awr.E)).a(eh.b(awr.d))))
            .a(
               dds.n,
               new der(
                  new ddy.a(ddy.a(3.0F, 1.0F), 0.0F, 16.0F),
                  ddy.a(1.0F),
                  new km(0, -1, 0),
                  Optional.of(eev.a(eev.a(new km(0, 1, 0), awp.cF), eev.a(dkg.J), eev.a(etx.c), eev.f())),
                  ekz.a(dkg.lk),
                  Optional.of(ecp.i)
               ),
               ezk.a(faa.a(ewo.b.a, bx.a.a().a(bv.a.a().a(true))), ezu.a(faa.a(ewo.b.a, bx.a.a().a(bx.a.a()))))
            )
      );
      a($$0, k, ddr.a(ddr.a($$3.b(awy.cm), 1, 1, ddr.a(25), ddr.a(50), 8, bvk.i)).a(dds.E));
      bx.a $$6 = bx.a.a().a(5).a(bv.a.a().f(false).a(true)).a(dm.b(dk.c.b(1.0E-5F))).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)));
      ezk.a $$7 = ezk.a(
         ezu.a(faa.a(ewo.b.a, bx.a.a().a(bx.a.a()))),
         ezl.a(
            ezk.a(
               ezr.c(),
               faa.a(ewo.b.a, bx.a.a().a(bv.a.a().f(false))),
               ezl.a(faa.a(ewo.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))), faa.a(ewo.b.a, bx.a.a().a(bv.a.a().a(false)).b()))
            ),
            ezk.a(ezr.d(), faa.a(ewo.b.a, bx.a.a().c(di.a.a().a(ay.a.a().a($$4, awp.aQ))).a(bv.a.a().f(false))))
         )
      );
      a(
         $$0,
         l,
         ddr.a(ddr.a($$3.b(awy.bX), 1, 3, ddr.a(10, 10), ddr.a(25, 10), 8, bvk.e))
            .a(
               dds.n,
               dec.a(
                  new deh(aku.b("enchantment.soul_speed"), bxg.v, ddy.a(0.0405F, 0.0105F), bxe.a.a),
                  new deh(aku.b("enchantment.soul_speed"), bxg.u, ddy.a(1.0F), bxe.a.a)
               ),
               $$7
            )
            .a(
               dds.n,
               new dee(ddy.a(1.0F)),
               ezk.a(fac.a(far.a(ddy.a(0.04F))), faa.a(ewo.b.a, bx.a.a().a(bv.a.a().a(true)).c(di.a.a().a(ay.a.a().a($$4, awp.aQ)))))
            )
            .a(dds.o, new dev(lt.O, dev.b(), dev.a(0.1F), dev.b(-0.2F), dev.a(brz.a(0.1F)), brz.a(1.0F)), faa.a(ewo.b.a, $$6))
            .a(dds.o, new deo(awa.yA, brz.a(0.6F), bsi.b(0.6F, 1.0F)), ezk.a(fac.a(0.35F), faa.a(ewo.b.a, $$6)))
      );
      a(
         $$0,
         m,
         ddr.a(ddr.a($$3.b(awy.bY), 1, 3, ddr.a(25, 25), ddr.a(75, 25), 8, bvk.f))
            .a(dds.l, new deh(aku.b("enchantment.swift_sneak"), bxg.z, ddy.b(0.15F), bxe.a.a))
      );
      a($$0, n, ddr.a(ddr.a($$3.b(awy.ce), $$3.b(awy.cc), 10, 5, ddr.a(1, 11), ddr.a(21, 11), 1, bvk.b)).a($$2.b(aws.f)).a(dds.e, new deb(ddy.a(1.0F, 0.5F))));
      a(
         $$0,
         o,
         ddr.a(ddr.a($$3.b(awy.cf), $$3.b(awy.cc), 5, 5, ddr.a(5, 8), ddr.a(25, 8), 2, bvk.b))
            .a($$2.b(aws.f))
            .a(dds.e, new deb(ddy.b(2.5F)), faa.a(ewo.b.a, bx.a.a().a(ca.a($$5, awt.D))))
      );
      a(
         $$0,
         p,
         ddr.a(ddr.a($$3.b(awy.cf), $$3.b(awy.cc), 5, 5, ddr.a(5, 8), ddr.a(25, 8), 2, bvk.b))
            .a($$2.b(aws.f))
            .a(dds.e, new deb(ddy.b(2.5F)), faa.a(ewo.b.a, bx.a.a().a(ca.a($$5, awt.C))))
            .a(
               dds.i,
               ddv.a,
               ddv.c,
               new ded(jv.a(bug.b), ddy.a(1.5F), ddy.a(1.5F, 0.5F), ddy.a(3.0F), ddy.a(3.0F)),
               faa.a(ewo.b.a, bx.a.a().a(ca.a($$5, awt.C))).and(ezq.a(bm.a.a().a(true)))
            )
      );
      a($$0, q, ddr.a(ddr.a($$3.b(awy.cc), 5, 2, ddr.a(5, 20), ddr.a(55, 20), 2, bvk.b)).a(dds.g, new deb(ddy.b(1.0F))));
      a(
         $$0,
         r,
         ddr.a(ddr.a($$3.b(awy.cd), $$3.b(awy.cc), 2, 2, ddr.a(10, 20), ddr.a(60, 20), 4, bvk.b))
            .a(dds.i, ddv.a, ddv.c, new dem(ddy.b(4.0F)), ezq.a(bm.a.a().a(true)))
      );
      a(
         $$0,
         s,
         ddr.a(ddr.a($$3.b(awy.cc), 2, 3, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b))
            .a(dds.m, ddv.a, ddv.c, new deb(ddy.b(0.01F)), faa.a(ewo.b.b, bx.a.a().a(ca.a($$5, bvi.bR))))
      );
      a(
         $$0,
         t,
         ddr.a(ddr.a($$3.b(awy.cc), 2, 3, ddr.a(5, 9), ddr.a(20, 9), 4, bvk.b))
            .a(dds.l, new deh(aku.b("enchantment.sweeping_edge"), bxg.D, new ddy.c(ddy.b(1.0F), ddy.a(2.0F, 1.0F)), bxe.a.a))
      );
      a(
         $$0,
         u,
         ddr.a(ddr.a($$3.b(awy.cg), 10, 5, ddr.a(1, 10), ddr.a(51, 10), 1, bvk.b))
            .a(dds.l, new deh(aku.b("enchantment.efficiency"), bxg.t, new ddy.d(1.0F), bxe.a.a))
      );
      a($$0, v, ddr.a(ddr.a($$3.b(awy.ch), 1, 1, ddr.a(15), ddr.a(65), 8, bvk.b)).a($$2.b(aws.g)).a(dds.x, new deu(ddy.a(0.0F))));
      a(
         $$0,
         w,
         ddr.a(ddr.a($$3.b(awy.ck), 5, 3, ddr.a(5, 8), ddr.a(55, 8), 2, bvk.a))
            .a(dds.k, new dep(new ddy.c(ddy.b(2.0F), ddy.a(10.0F, 5.0F))), fae.a(cv.a.a().a($$3, awy.cb)))
            .a(dds.k, new dep(new ddy.c(ddy.b(1.0F), ddy.a(2.0F, 1.0F))), ezu.a(fae.a(cv.a.a().a($$3, awy.cb))))
      );
      a($$0, x, ddr.a(ddr.a($$3.b(awy.ch), 2, 3, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b)).a($$2.b(aws.g)));
      a(
         $$0,
         y,
         ddr.a(ddr.a($$3.b(awy.cl), 10, 5, ddr.a(1, 10), ddr.a(16, 10), 1, bvk.b))
            .a(dds.e, new deb(ddy.a(1.0F, 0.5F)), faa.a(ewo.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a(
         $$0,
         z,
         ddr.a(ddr.a($$3.b(awy.cl), 2, 2, ddr.a(12, 20), ddr.a(37, 20), 4, bvk.b)).a(dds.g, new deb(ddy.b(1.0F)), faa.a(ewo.b.c, bx.a.a().a($$5, awt.f).b()))
      );
      a($$0, A, ddr.a(ddr.a($$3.b(awy.cl), 2, 1, ddr.a(20), ddr.a(50), 4, bvk.b)).a(dds.r, new dem(ddy.a(100.0F))));
      a(
         $$0,
         B,
         ddr.a(ddr.a($$3.b(awy.cl), 1, 1, ddr.a(20), ddr.a(50), 8, bvk.b)).a($$2.b(aws.d)).a(dds.p, new deu(ddy.a(0.0F)), fae.a(cv.a.a().a($$3, cxl.pd)))
      );
      a($$0, C, ddr.a(ddr.a($$3.b(awy.ci), 2, 3, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b)).a(dds.w, new deb(ddy.b(1.0F))));
      a($$0, D, ddr.a(ddr.a($$3.b(awy.ci), 2, 3, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b)).a(dds.v, new deb(ddy.b(5.0F))));
      a($$0, E, ddr.a(ddr.a($$3.b(awy.cj), 5, 3, ddr.a(12, 7), ddr.a(50), 2, bvk.b)).a(dds.u, new deb(ddy.b(1.0F))));
      a(
         $$0,
         F,
         ddr.a(ddr.a($$3.b(awy.cj), 2, 5, ddr.a(1, 8), ddr.a(21, 8), 4, bvk.b))
            .a($$2.b(aws.f))
            .a(dds.e, new deb(ddy.b(2.5F)), faa.a(ewo.b.a, bx.a.a().a(ca.a($$5, awt.B)).b()))
      );
      a(
         $$0,
         G,
         ddr.a(ddr.a($$3.b(awy.cj), 2, 3, ddr.a(17, 7), ddr.a(50), 4, bvk.d))
            .a($$2.b(aws.h))
            .b(dds.F, new deb(ddy.a(1.5F, 0.75F)))
            .b(dds.C, List.of(awa.AB, awa.AC, awa.AD))
      );
      a(
         $$0,
         H,
         ddr.a(ddr.a($$3.b(awy.cj), 1, 1, ddr.a(25), ddr.a(50), 8, bvk.b))
            .a(
               dds.i,
               ddv.a,
               ddv.c,
               dec.a(new dew(jv.a(bvi.aw.r()), false), new deo(awa.AF, brz.a(5.0F), brz.a(1.0F))),
               ezk.a(fah.c().b(true), faa.a(ewo.b.a, bx.a.a().a(di.a.a().b(true))), faa.a(ewo.b.c, bx.a.a().a($$5, bvi.by)))
            )
            .a(
               dds.j,
               dec.a(new dew(jv.a(bvi.aw.r()), false), new deo(awa.AF, brz.a(5.0F), brz.a(1.0F))),
               ezk.a(fah.c().b(true), faa.a(ewo.b.a, bx.a.a().a($$5, bvi.by)), ezv.a(di.a.a().b(true)), ezw.a(dkg.sU))
            )
      );
      a(
         $$0,
         I,
         ddr.a(ddr.a($$3.b(awy.cn), 2, 1, ddr.a(20), ddr.a(50), 4, bvk.b)).a($$2.b(aws.e)).a(dds.t, new deb(ddy.b(2.0F))).a(dds.s, new deb(ddy.b(10.0F)))
      );
      a(
         $$0,
         J,
         ddr.a(ddr.a($$3.b(awy.cn), 5, 3, ddr.a(12, 20), ddr.a(50), 2, bvk.b, bvk.c))
            .b(dds.A, new deb(ddy.b(-0.25F)))
            .b(
               dds.B,
               List.of(
                  new cvz.b(Optional.of(awa.gM), Optional.empty(), Optional.of(awa.gJ)),
                  new cvz.b(Optional.of(awa.gN), Optional.empty(), Optional.of(awa.gJ)),
                  new cvz.b(Optional.of(awa.gO), Optional.empty(), Optional.of(awa.gJ))
               )
            )
      );
      a($$0, K, ddr.a(ddr.a($$3.b(awy.cn), 10, 4, ddr.a(1, 10), ddr.a(50), 1, bvk.b)).a($$2.b(aws.e)).a(dds.q, new deb(ddy.b(1.0F))));
      a($$0, L, ddr.a(ddr.a($$3.b(awy.cp), 5, 5, ddr.a(5, 8), ddr.a(25, 8), 2, bvk.b)).a($$2.b(aws.f)).a(dds.f, new deb(ddy.b(0.5F))));
      a($$0, M, ddr.a(ddr.a($$3.b(awy.cp), 2, 4, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b)).a($$2.b(aws.f)).a(dds.h, new deb(ddy.b(-0.15F))));
      a(
         $$0,
         N,
         ddr.a(ddr.a($$3.b(awy.cp), 2, 3, ddr.a(15, 9), ddr.a(65, 9), 4, bvk.b))
            .a(
               dds.i,
               ddv.a,
               ddv.a,
               new del(
                  false,
                  Optional.empty(),
                  Optional.of(ddy.a(List.of(1.2F, 1.75F, 2.2F), ddy.a(1.5F, 0.35F))),
                  $$4.a(awp.cD).map(Function.identity()),
                  fbx.c,
                  ddy.a(3.5F),
                  false,
                  dgz.a.e,
                  lt.A,
                  lt.z,
                  awa.Do
               ),
               faa.a(ewo.b.c, bx.a.a().a(bv.a.a().f(false)).a(dm.d(dk.c.b(1.5))))
            )
      );
      a($$0, O, ddr.a(ddr.a($$3.b(awy.ck), 2, 1, ddr.a(25, 25), ddr.a(75, 25), 4, bvk.a)).a(dds.z, new den(ddy.a(2.0F))));
      a($$0, P, ddr.a(ddr.a($$3.b(awy.co), 1, 1, ddr.a(25), ddr.a(50), 8, bvk.a)).a(dds.D));
   }

   private static void a(qe<ddr> $$0, akt<ddr> $$1, ddr.a $$2) {
      $$0.a($$1, $$2.a($$1.a()));
   }

   private static akt<ddr> a(String $$0) {
      return akt.a(mc.aP, aku.b($$0));
   }
}
