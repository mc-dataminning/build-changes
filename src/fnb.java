import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fnb {
   private static final fmt a = fnp.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fnb.a> f = List.of(
      new fnb.a("quartz", dey.a, Map.of()),
      new fnb.a("iron", dey.b, Map.of(det.d, "iron_darker")),
      new fnb.a("netherite", dey.c, Map.of(det.h, "netherite_darker")),
      new fnb.a("redstone", dey.d, Map.of()),
      new fnb.a("copper", dey.e, Map.of()),
      new fnb.a("gold", dey.f, Map.of(det.e, "gold_darker")),
      new fnb.a("emerald", dey.g, Map.of()),
      new fnb.a("diamond", dey.h, Map.of(det.f, "diamond_darker")),
      new fnb.a("lapis", dey.i, Map.of()),
      new fnb.a("amethyst", dey.j, Map.of()),
      new fnb.a("resin", dey.k, Map.of())
   );
   private final fnc g;
   private final BiConsumer<akv, fnq> h;

   public fnb(fnc $$0, BiConsumer<akv, fnq> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cwl $$0) {
      this.g.a($$0, fnp.a(fnr.a($$0)));
   }

   private akv a(cwl $$0, fns $$1) {
      return $$1.a(fnr.a($$0), fnu.b($$0), this.h);
   }

   private void b(cwl $$0, fns $$1) {
      this.g.a($$0, fnp.a(this.a($$0, $$1)));
   }

   private akv a(cwl $$0, String $$1, fns $$2) {
      return $$2.a(fnr.a($$0, $$1), fnu.k(fnu.a($$0, $$1)), this.h);
   }

   private akv a(cwl $$0, cwl $$1, fns $$2) {
      return $$2.a(fnr.a($$0), fnu.b($$1), this.h);
   }

   private void b(cwl $$0, cwl $$1, fns $$2) {
      this.g.a($$0, fnp.a(this.a($$0, $$1, $$2)));
   }

   private void a(cwl $$0, fmt $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cwl $$0, String $$1, fmt $$2) {
      akv $$3 = this.a($$0, fnu.c($$0), fnu.a($$0, $$1));
      this.g.a($$0, fnp.a($$3, a, $$2));
   }

   private List<hbq.a> b(cwl $$0) {
      List<hbq.a> $$1 = new ArrayList<>();
      hbl.b $$2 = fnp.a(this.a($$0, "_16", fnt.bE));
      $$1.add(fnp.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayz.b($$3 - 16, 32);
         hbl.b $$5 = fnp.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fnt.bE));
         $$1.add(fnp.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fnp.a($$2, 31.5F));
      return $$1;
   }

   private void c(cwl $$0) {
      List<hbq.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fnp.a(
               fnp.a(kv.ad),
               fnp.a(new hck(true, hcl.a.b), 32.0F, $$1),
               fnp.a(fnp.a(new hck(true, hcl.a.c), 32.0F, $$1), fnp.a(new hck(true, hcl.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cwl $$0) {
      this.g.a($$0, fnp.a(new hck(true, hcl.a.d), 32.0F, this.b($$0)));
   }

   private void e(cwl $$0) {
      List<hbq.a> $$1 = new ArrayList<>();
      hbl.b $$2 = fnp.a(this.a($$0, "_00", fnt.bE));
      $$1.add(fnp.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hbl.b $$4 = fnp.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fnt.bE));
         $$1.add(fnp.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fnp.a($$2, 63.5F));
      this.g.a($$0, fnp.a(fnp.a(new hcu(true, hcu.a.b), 64.0F, $$1), fnp.a(new hcu(true, hcu.a.a), 64.0F, $$1)));
   }

   private akv a(cwl $$0, akv $$1, akv $$2) {
      return fnt.bI.a($$0, fnu.c($$1, $$2), this.h);
   }

   private akv a(akv $$0, akv $$1, akv $$2) {
      return fnt.bI.a($$0, fnu.c($$1, $$2), this.h);
   }

   private void a(akv $$0, akv $$1, akv $$2, akv $$3) {
      fnt.bJ.a($$0, fnu.a($$1, $$2, $$3), this.h);
   }

   private void a(cwl $$0, aku<des> $$1, String $$2, boolean $$3) {
      akv $$4 = fnr.a($$0);
      akv $$5 = fnu.c($$0);
      akv $$6 = fnu.a($$0, "_overlay");
      List<hbr.a<aku<dex>>> $$7 = new ArrayList<>(f.size());

      for (fnb.a $$8 : f) {
         akv $$9 = $$4.g("_" + $$8.a() + "_trim");
         akv $$10 = akv.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hbl.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fnp.a($$9, new fmq(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fnp.a($$9);
         }

         $$7.add(fnp.a($$8.b, $$11));
      }

      hbl.b $$13;
      if ($$3) {
         fnt.bI.a($$4, fnu.c($$5, $$6), this.h);
         $$13 = fnp.a($$4, new fmq(-6265536));
      } else {
         fnt.bE.a($$4, fnu.k($$5), this.h);
         $$13 = fnp.a($$4);
      }

      this.g.a($$0, fnp.a(new hdj(), $$13, $$7));
   }

   private void f(cwl $$0) {
      hbl.b $$1 = fnp.a(this.a($$0, fnt.bE));
      akv $$2 = this.a($$0, fnt.bO, "_open_back");
      akv $$3 = this.a($$0, fnt.bN, "_open_front");
      hbl.b $$4 = fnp.a(fnp.a($$2), new hbg.a(), fnp.a($$3));
      hbl.b $$5 = fnp.a(new hbv(), $$4, $$1);
      this.g.a($$0, fnp.a(new hdd(), $$1, fnp.a(cwn.g, $$5)));
   }

   private akv a(cwl $$0, fns $$1, String $$2) {
      akv $$3 = fnu.a($$0, $$2);
      return $$1.a($$0, fnu.k($$3), this.h);
   }

   private void g(cwl $$0) {
      hbl.b $$1 = fnp.a(fnr.a($$0));
      hbl.b $$2 = fnp.a(this.a($$0, "_pulling_0", fnt.bP));
      hbl.b $$3 = fnp.a(this.a($$0, "_pulling_1", fnt.bP));
      hbl.b $$4 = fnp.a(this.a($$0, "_pulling_2", fnt.bP));
      this.g.a($$0, fnp.a(fnp.a(), fnp.a(new hcw(false), 0.05F, $$2, fnp.a($$3, 0.65F), fnp.a($$4, 0.9F)), $$1));
   }

   private void h(cwl $$0) {
      hbl.b $$1 = fnp.a(fnr.a($$0));
      hbl.b $$2 = fnp.a(this.a($$0, "_pulling_0", fnt.bQ));
      hbl.b $$3 = fnp.a(this.a($$0, "_pulling_1", fnt.bQ));
      hbl.b $$4 = fnp.a(this.a($$0, "_pulling_2", fnt.bQ));
      hbl.b $$5 = fnp.a(this.a($$0, "_arrow", fnt.bQ));
      hbl.b $$6 = fnp.a(this.a($$0, "_firework", fnt.bQ));
      this.g
         .a($$0, fnp.a(fnp.a(), fnp.a(new hco(), $$2, fnp.a($$3, 0.58F), fnp.a($$4, 1.0F)), fnp.a(new hcz(), $$1, fnp.a(cvg.a.b, $$5), fnp.a(cvg.a.c, $$6))));
   }

   private void a(cwl $$0, hbx $$1, hbl.b $$2, hbl.b $$3) {
      this.g.a($$0, fnp.a($$1, $$2, $$3));
   }

   private void i(cwl $$0) {
      hbl.b $$1 = fnp.a(this.a($$0, fnt.bE));
      hbl.b $$2 = fnp.a(this.a($$0, "_broken", fnt.bE));
      this.a($$0, new hbu(), $$2, $$1);
   }

   private void j(cwl $$0) {
      hbl.b $$1 = fnp.a(fnr.a($$0));
      hbl.b $$2 = fnp.a(fnr.a($$0, "_brushing_0"));
      hbl.b $$3 = fnp.a(fnr.a($$0, "_brushing_1"));
      hbl.b $$4 = fnp.a(fnr.a($$0, "_brushing_2"));
      this.g.a($$0, fnp.a(new hcv(10.0F), 0.1F, $$1, fnp.a($$2, 0.25F), fnp.a($$3, 0.5F), fnp.a($$4, 0.75F)));
   }

   private void k(cwl $$0) {
      hbl.b $$1 = fnp.a(this.a($$0, fnt.bH));
      hbl.b $$2 = fnp.a(this.a($$0, "_cast", fnt.bH));
      this.a($$0, new hcb(), $$2, $$1);
   }

   private void l(cwl $$0) {
      hbl.b $$1 = fnp.a(fnr.a($$0));
      hbl.b $$2 = fnp.a(fnr.b("tooting_goat_horn"));
      this.a($$0, fnp.a(), $$2, $$1);
   }

   private void m(cwl $$0) {
      hbl.b $$1 = fnp.a(fnr.a($$0), new hdt.a());
      hbl.b $$2 = fnp.a(fnr.a($$0, "_blocking"), new hdt.a());
      this.a($$0, fnp.a(), $$2, $$1);
   }

   private static hbl.b a(hbl.b $$0, hbl.b $$1) {
      return fnp.a(new hdd(), $$1, fnp.a(List.of(cwn.g, cwn.h, cwn.i), $$0));
   }

   private void n(cwl $$0) {
      hbl.b $$1 = fnp.a(this.a($$0, fnt.bE));
      hbl.b $$2 = fnp.a(fnr.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cwl $$0) {
      hbl.b $$1 = fnp.a(this.a($$0, fnt.bE));
      hbl.b $$2 = fnp.a(fnr.a($$0, "_in_hand"), new hdz.a());
      hbl.b $$3 = fnp.a(fnr.a($$0, "_throwing"), new hdz.a());
      hbl.b $$4 = fnp.a(fnp.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cwl $$0, akv $$1) {
      this.g.a($$0, fnp.a($$1, new fmw()));
   }

   private void p(cwl $$0) {
      akv $$1 = this.a($$0, fnr.b("potion_overlay"), fnr.a($$0));
      this.a($$0, $$1);
   }

   private void q(cwl $$0) {
      akv $$1 = this.a($$0, fnr.a($$0, "_head"), fnr.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cwl $$0, int $$1) {
      akv $$2 = this.a($$0, fnt.bE);
      this.g.a($$0, fnp.a($$2, new fmq($$1)));
   }

   private void a(cwl $$0, int $$1, int $$2) {
      akv $$3 = fnr.b("template_spawn_egg");
      this.g.a($$0, fnp.a($$3, fnp.a($$1), fnp.a($$2)));
   }

   private void r(cwl $$0) {
      akv $$1 = fnu.c($$0);
      akv $$2 = fnu.a($$0, "_overlay");
      akv $$3 = fnt.bE.a($$0, fnu.k($$1), this.h);
      akv $$4 = fnr.a($$0, "_dyed");
      fnt.bI.a($$4, fnu.c($$1, $$2), this.h);
      this.g.a($$0, fnp.a(fnp.a(kv.J), fnp.a($$4, a, new fmq(0)), fnp.a($$3)));
   }

   public void a() {
      this.b(cwt.oF, fnt.bE);
      this.b(cwt.oH, fnt.bE);
      this.b(cwt.oG, fnt.bE);
      this.b(cwt.oI, fnt.bE);
      this.b(cwt.pi, fnt.bE);
      this.b(cwt.oZ, fnt.bE);
      this.b(cwt.oV, fnt.bE);
      this.b(cwt.vF, fnt.bE);
      this.b(cwt.pb, fnt.bE);
      this.b(cwt.vg, fnt.bE);
      this.b(cwt.ed, fnt.bG);
      this.b(cwt.sX, fnt.bE);
      this.b(cwt.wk, fnt.bE);
      this.b(cwt.wm, fnt.bE);
      this.b(cwt.oB, fnt.bE);
      this.b(cwt.oC, fnt.bE);
      this.b(cwt.su, fnt.bE);
      this.b(cwt.tl, fnt.bE);
      this.b(cwt.td, fnt.bG);
      this.b(cwt.sq, fnt.bE);
      this.b(cwt.sv, fnt.bE);
      this.b(cwt.xh, fnt.bE);
      this.b(cwt.rw, fnt.bE);
      this.b(cwt.oY, fnt.bE);
      this.b(cwt.qc, fnt.bE);
      this.b(cwt.rs, fnt.bE);
      this.b(cwt.uZ, fnt.bG);
      this.b(cwt.sr, fnt.bE);
      this.b(cwt.rf, fnt.bE);
      this.b(cwt.ot, fnt.bH);
      this.b(cwt.ou, fnt.bH);
      this.b(cwt.pd, fnt.bE);
      this.b(cwt.op, fnt.bE);
      this.b(cwt.sZ, fnt.bE);
      this.b(cwt.wg, fnt.bE);
      this.b(cwt.rt, fnt.bE);
      this.e(cwt.rT);
      this.b(cwt.pc, fnt.bE);
      this.b(cwt.ro, fnt.bE);
      this.b(cwt.vM, fnt.bE);
      this.c(cwt.rz);
      this.d(cwt.rA);
      this.b(cwt.sY, fnt.bE);
      this.b(cwt.ta, fnt.bE);
      this.b(cwt.sa, fnt.bE);
      this.b(cwt.vO, fnt.bE);
      this.b(cwt.qD, fnt.bE);
      this.b(cwt.vB, fnt.bE);
      this.b(cwt.sb, fnt.bE);
      this.b(cwt.sP, fnt.bE);
      this.b(cwt.pl, fnt.bE);
      this.b(cwt.pm, fnt.bE);
      this.b(cwt.wZ, fnt.bE);
      this.b(cwt.so, fnt.bE);
      this.b(cwt.oJ, fnt.bE);
      this.b(cwt.oK, fnt.bE);
      this.b(cwt.pe, fnt.bE);
      this.b(cwt.pO, fnt.bG);
      this.b(cwt.pP, fnt.bG);
      this.b(cwt.vI, fnt.bE);
      this.b(cwt.pN, fnt.bG);
      this.b(cwt.pM, fnt.bG);
      this.b(cwt.pL, fnt.bG);
      this.b(cwt.wn, fnt.bE);
      this.b(cwt.sU, fnt.bE);
      this.b(cwt.ry, fnt.bE);
      this.b(cwt.pf, fnt.bE);
      this.b(cwt.vv, fnt.bE);
      this.b(cwt.tp, fnt.bE);
      this.b(cwt.tc, fnt.bE);
      this.b(cwt.wf, fnt.bE);
      this.b(cwt.uU, fnt.bE);
      this.b(cwt.tk, fnt.bE);
      this.b(cwt.xg, fnt.bE);
      this.b(cwt.vt, fnt.bE);
      this.b(cwt.uV, fnt.bE);
      this.b(cwt.qB, fnt.bE);
      this.b(cwt.oX, fnt.bE);
      this.b(cwt.xe, fnt.bE);
      this.b(cwt.wY, fnt.bE);
      this.b(cwt.oq, fnt.bE);
      this.b(cwt.te, fnt.bE);
      this.b(cwt.th, fnt.bE);
      this.b(cwt.tq, fnt.bE);
      this.b(cwt.xc, fnt.bE);
      this.b(cwt.xw, fnt.bE);
      this.b(cwt.rV, fnt.bE);
      this.b(cwt.sd, fnt.bE);
      this.b(cwt.vc, fnt.bE);
      this.b(cwt.pn, fnt.bE);
      this.b(cwt.qF, fnt.bE);
      this.b(cwt.pE, fnt.bG);
      this.b(cwt.vj, fnt.bE);
      this.b(cwt.pF, fnt.bG);
      this.b(cwt.vH, fnt.bE);
      this.b(cwt.pD, fnt.bG);
      this.b(cwt.pC, fnt.bG);
      this.b(cwt.pB, fnt.bG);
      this.b(cwt.po, fnt.bE);
      this.b(cwt.tf, fnt.bE);
      this.b(cwt.sm, fnt.bE);
      this.b(cwt.ss, fnt.bE);
      this.b(cwt.pZ, fnt.bE);
      this.b(cwt.xf, fnt.bE);
      this.b(cwt.wU, fnt.bE);
      this.b(cwt.xA, fnt.bE);
      this.b(cwt.xD, fnt.bE);
      this.b(cwt.os, fnt.bE);
      this.b(cwt.sc, fnt.bE);
      this.b(cwt.pj, fnt.bE);
      this.b(cwt.pJ, fnt.bG);
      this.b(cwt.pK, fnt.bG);
      this.b(cwt.vG, fnt.bE);
      this.b(cwt.pk, fnt.bE);
      this.b(cwt.wv, fnt.bE);
      this.b(cwt.pI, fnt.bG);
      this.b(cwt.pH, fnt.bG);
      this.b(cwt.pG, fnt.bG);
      this.b(cwt.vb, fnt.bE);
      this.b(cwt.oD, fnt.bE);
      this.b(cwt.oE, fnt.bE);
      this.b(cwt.ww, fnt.bE);
      this.b(cwt.pg, fnt.bE);
      this.b(cwt.rh, fnt.bE);
      this.b(cwt.rk, fnt.bE);
      this.b(cwt.si, fnt.bE);
      this.b(cwt.sn, fnt.bE);
      this.b(cwt.sk, fnt.bE);
      this.b(cwt.sh, fnt.bE);
      this.b(cwt.tm, fnt.bE);
      this.b(cwt.oN, fnt.bE);
      this.b(cwt.oO, fnt.bE);
      this.b(cwt.oP, fnt.bE);
      this.b(cwt.oQ, fnt.bE);
      this.b(cwt.vi, fnt.bE);
      this.b(cwt.sT, fnt.bE);
      this.b(cwt.rl, fnt.bE);
      this.b(cwt.oo, fnt.bE);
      this.b(cwt.xb, fnt.bE);
      this.b(cwt.pW, fnt.bE);
      this.b(cwt.wR, fnt.bE);
      this.b(cwt.wK, fnt.bF);
      this.b(cwt.wy, fnt.bF);
      this.b(cwt.wA, fnt.bF);
      this.b(cwt.wz, fnt.bF);
      this.b(cwt.wB, fnt.bF);
      this.b(cwt.wC, fnt.bF);
      this.b(cwt.wD, fnt.bF);
      this.b(cwt.wE, fnt.bF);
      this.b(cwt.wF, fnt.bF);
      this.b(cwt.wG, fnt.bF);
      this.b(cwt.wP, fnt.bF);
      this.b(cwt.wQ, fnt.bF);
      this.b(cwt.wH, fnt.bF);
      this.b(cwt.wI, fnt.bF);
      this.b(cwt.wL, fnt.bF);
      this.b(cwt.wJ, fnt.bF);
      this.b(cwt.wM, fnt.bF);
      this.b(cwt.wN, fnt.bF);
      this.b(cwt.wO, fnt.bF);
      this.b(cwt.vN, fnt.bE);
      this.b(cwt.vL, fnt.bE);
      this.b(cwt.wT, fnt.bE);
      this.b(cwt.pT, fnt.bG);
      this.b(cwt.pU, fnt.bG);
      this.b(cwt.pp, fnt.bE);
      this.b(cwt.pS, fnt.bG);
      this.b(cwt.pq, fnt.bE);
      this.b(cwt.pR, fnt.bG);
      this.b(cwt.pQ, fnt.bG);
      this.b(cwt.vw, fnt.bE);
      this.b(cwt.vx, fnt.bE);
      this.b(cwt.vr, fnt.bE);
      this.b(cwt.ox, fnt.bE);
      this.b(cwt.oy, fnt.bE);
      this.b(cwt.sg, fnt.bE);
      this.b(cwt.qE, fnt.bE);
      this.b(cwt.oL, fnt.bE);
      this.b(cwt.oM, fnt.bE);
      this.b(cwt.rv, fnt.bE);
      this.b(cwt.ov, fnt.bE);
      this.b(cwt.xd, fnt.bE);
      this.b(cwt.sl, fnt.bE);
      this.b(cwt.vh, fnt.bE);
      this.b(cwt.wh, fnt.bE);
      this.b(cwt.qC, fnt.bE);
      this.b(cwt.ri, fnt.bE);
      this.b(cwt.vz, fnt.bE);
      this.b(cwt.vy, fnt.bE);
      this.b(cwt.rZ, fnt.bE);
      this.b(cwt.rm, fnt.bE);
      this.b(cwt.vs, fnt.bE);
      this.b(cwt.sp, fnt.bE);
      this.b(cwt.ph, fnt.bE);
      this.b(cwt.vA, fnt.bE);
      this.b(cwt.vD, fnt.bE);
      this.b(cwt.vE, fnt.bE);
      this.b(cwt.vC, fnt.bE);
      this.b(cwt.st, fnt.bE);
      this.b(cwt.tb, fnt.bE);
      this.b(cwt.on, fnt.bE);
      this.b(cwt.rX, fnt.bE);
      this.b(cwt.rn, fnt.bE);
      this.b(cwt.oU, fnt.bE);
      this.b(cwt.sS, fnt.bE);
      this.b(cwt.wu, fnt.bE);
      this.b(cwt.xa, fnt.bE);
      this.b(cwt.rx, fnt.bE);
      this.b(cwt.rj, fnt.bE);
      this.b(cwt.yu, fnt.bE);
      this.b(cwt.wp, fnt.bE);
      this.b(cwt.tj, fnt.bE);
      this.b(cwt.oz, fnt.bE);
      this.b(cwt.oA, fnt.bE);
      this.b(cwt.pV, fnt.bG);
      this.b(cwt.pz, fnt.bG);
      this.b(cwt.pA, fnt.bG);
      this.b(cwt.py, fnt.bG);
      this.b(cwt.px, fnt.bG);
      this.b(cwt.pw, fnt.bG);
      this.b(cwt.sx, fnt.bE);
      this.b(cwt.wW, fnt.bE);
      this.b(cwt.or, fnt.bE);
      this.b(cwt.wt, fnt.bE);
      this.b(cwt.rY, fnt.bE);
      this.b(cwt.rp, fnt.bE);
      this.b(cwt.rq, fnt.bE);
      this.b(cwt.rr, fnt.bE);
      this.b(cwt.rg, fnt.bE);
      this.b(cwt.qb, fnt.bE);
      this.b(cwt.sf, fnt.bE);
      this.b(cwt.uW, fnt.bE);
      this.b(cwt.va, fnt.bY);
      this.b(cwt.pu, fnt.bG);
      this.b(cwt.pv, fnt.bG);
      this.b(cwt.pt, fnt.bG);
      this.b(cwt.ps, fnt.bG);
      this.b(cwt.pr, fnt.bG);
      this.b(cwt.uX, fnt.bE);
      this.b(cwt.uY, fnt.bE);
      this.b(cwt.sj, fnt.bE);
      this.b(cwt.yw, fnt.bE);
      this.b(cwt.yx, fnt.bE);
      this.b(cwt.yy, fnt.bE);
      this.b(cwt.yz, fnt.bE);
      this.b(cwt.yA, fnt.bE);
      this.b(cwt.yB, fnt.bE);
      this.b(cwt.yC, fnt.bE);
      this.b(cwt.yD, fnt.bE);
      this.b(cwt.yE, fnt.bE);
      this.b(cwt.yF, fnt.bE);
      this.b(cwt.yG, fnt.bE);
      this.b(cwt.yH, fnt.bE);
      this.b(cwt.yI, fnt.bE);
      this.b(cwt.yJ, fnt.bE);
      this.b(cwt.yK, fnt.bE);
      this.b(cwt.yL, fnt.bE);
      this.b(cwt.yM, fnt.bE);
      this.b(cwt.yN, fnt.bE);
      this.b(cwt.yO, fnt.bE);
      this.b(cwt.wx, cwt.pV, fnt.bG);
      this.b(cwt.qG, cwt.qF, fnt.bE);
      this.a(cwt.oT, det.g, "helmet", false);
      this.a(cwt.qd, det.b, "helmet", true);
      this.a(cwt.qe, det.b, "chestplate", true);
      this.a(cwt.qf, det.b, "leggings", true);
      this.a(cwt.qg, det.b, "boots", true);
      this.a(cwt.qh, det.c, "helmet", false);
      this.a(cwt.qi, det.c, "chestplate", false);
      this.a(cwt.qj, det.c, "leggings", false);
      this.a(cwt.qk, det.c, "boots", false);
      this.a(cwt.ql, det.d, "helmet", false);
      this.a(cwt.qm, det.d, "chestplate", false);
      this.a(cwt.qn, det.d, "leggings", false);
      this.a(cwt.qo, det.d, "boots", false);
      this.a(cwt.qp, det.f, "helmet", false);
      this.a(cwt.qq, det.f, "chestplate", false);
      this.a(cwt.qr, det.f, "leggings", false);
      this.a(cwt.qs, det.f, "boots", false);
      this.a(cwt.qt, det.e, "helmet", false);
      this.a(cwt.qu, det.e, "chestplate", false);
      this.a(cwt.qv, det.e, "leggings", false);
      this.a(cwt.qw, det.e, "boots", false);
      this.a(cwt.qx, det.h, "helmet", false);
      this.a(cwt.qy, det.h, "chestplate", false);
      this.a(cwt.qz, det.h, "leggings", false);
      this.a(cwt.qA, det.h, "boots", false);
      this.a(cwt.vJ, -6265536);
      this.b(cwt.yP, fnt.bE);
      this.b(cwt.yQ, fnt.bE);
      this.b(cwt.yR, fnt.bE);
      this.b(cwt.yS, fnt.bE);
      this.b(cwt.yT, fnt.bE);
      this.b(cwt.yU, fnt.bE);
      this.b(cwt.yV, fnt.bE);
      this.b(cwt.yW, fnt.bE);
      this.b(cwt.yX, fnt.bE);
      this.b(cwt.yY, fnt.bE);
      this.b(cwt.yZ, fnt.bE);
      this.b(cwt.za, fnt.bE);
      this.b(cwt.zb, fnt.bE);
      this.b(cwt.zc, fnt.bE);
      this.b(cwt.zd, fnt.bE);
      this.b(cwt.ze, fnt.bE);
      this.b(cwt.zf, fnt.bE);
      this.b(cwt.zg, fnt.bE);
      this.b(cwt.zh, fnt.bE);
      this.b(cwt.zi, fnt.bE);
      this.b(cwt.zj, fnt.bE);
      this.b(cwt.zk, fnt.bE);
      this.b(cwt.zl, fnt.bE);
      this.b(cwt.zD, fnt.bE);
      this.b(cwt.zE, fnt.bE);
      this.b(cwt.zG, fnt.bE);
      this.a(cwt.vu, new fmr());
      this.a(cwt.sR, "_markings", new fmv());
      this.f(cwt.rB);
      this.f(cwt.rR);
      this.f(cwt.rC);
      this.f(cwt.rJ);
      this.f(cwt.rK);
      this.f(cwt.rF);
      this.f(cwt.rN);
      this.f(cwt.rL);
      this.f(cwt.rG);
      this.f(cwt.rQ);
      this.f(cwt.rM);
      this.f(cwt.rE);
      this.f(cwt.rI);
      this.f(cwt.rP);
      this.f(cwt.rH);
      this.f(cwt.rO);
      this.f(cwt.rD);
      this.n(cwt.rU);
      this.o(cwt.wS);
      this.r(cwt.oW);
      this.g(cwt.pa);
      this.h(cwt.wV);
      this.i(cwt.ow);
      this.j(cwt.yv);
      this.k(cwt.rS);
      this.l(cwt.xi);
      this.m(cwt.ws);
      this.q(cwt.wq);
      this.p(cwt.ti);
      this.p(cwt.wo);
      this.p(cwt.wr);
      this.a(cwt.tr, 11366765, 8538184);
      this.a(cwt.ts, 56063, 44543);
      this.a(cwt.tt, 16499171, 10890612);
      this.a(cwt.tu, 4996656, 986895);
      this.a(cwt.tv, 15582019, 4400155);
      this.a(cwt.tw, 16167425, 16775294);
      this.a(cwt.tx, 9084018, 3231003);
      this.a(cwt.ty, 11506911, 9529055);
      this.a(cwt.tz, 15714446, 9794134);
      this.a(cwt.tA, 16565097, 13341495);
      this.a(cwt.tB, 803406, 11013646);
      this.a(cwt.tC, 10592673, 16711680);
      this.a(cwt.tD, 12691306, 15058059);
      this.a(cwt.tE, 4470310, 10592673);
      this.a(cwt.tF, 894731, 0);
      this.a(cwt.tG, 2243405, 16382457);
      this.a(cwt.tH, 5457209, 8811878);
      this.a(cwt.tI, 9433559, 7969893);
      this.a(cwt.tJ, 13552826, 7632531);
      this.a(cwt.tK, 1842204, 14711290);
      this.a(cwt.tL, 1447446, 0);
      this.a(cwt.tM, 1447446, 7237230);
      this.a(cwt.tN, 9804699, 1973274);
      this.a(cwt.tO, 14005919, 13396256);
      this.a(cwt.tP, 13661252, 16762748);
      this.a(cwt.tQ, 16382457, 12369084);
      this.a(cwt.tR, 611926, 8778172);
      this.a(cwt.tS, 10851452, 5589310);
      this.a(cwt.tT, 5931634, 15826224);
      this.a(cwt.tU, 13004373, 6251620);
      this.a(cwt.tV, 12623485, 15656192);
      this.a(cwt.tW, 7958625, 15125652);
      this.a(cwt.tX, 14405058, 7643954);
      this.a(cwt.tY, 12623485, 10051392);
      this.a(cwt.tZ, 3407872, 16579584);
      this.a(cwt.ua, 10489616, 12040119);
      this.a(cwt.ub, 1769984, 5321501);
      this.a(cwt.uc, 15720061, 5653556);
      this.a(cwt.ud, 15198183, 1776418);
      this.a(cwt.ue, 894731, 16711680);
      this.a(cwt.uf, 4411786, 8978176);
      this.a(cwt.ug, 15771042, 14377823);
      this.a(cwt.uh, 10051392, 16380836);
      this.a(cwt.ui, 5843472, 16380836);
      this.a(cwt.uj, 5451574, 9804699);
      this.a(cwt.uk, 15658718, 14014157);
      this.a(cwt.ul, 16167425, 3654642);
      this.a(cwt.um, 10051392, 7555121);
      this.a(cwt.un, 7697520, 5984329);
      this.a(cwt.uo, 10489616, 951412);
      this.a(cwt.up, 15198183, 16758197);
      this.a(cwt.uq, 9725844, 5060690);
      this.a(cwt.ur, 7237230, 3158064);
      this.a(cwt.us, 12698049, 4802889);
      this.a(cwt.ut, 6842447, 15066584);
      this.a(cwt.uu, 5349438, 8306542);
      this.a(cwt.uv, 8855049, 2468720);
      this.a(cwt.uw, 14283506, 8496292);
      this.a(cwt.ux, 3419431, 11013646);
      this.a(cwt.uy, 2243405, 7375001);
      this.a(cwt.uz, 6387319, 14543594);
      this.a(cwt.uA, 10236982, 5065037);
      this.a(cwt.uB, 7164733, 1444352);
      this.a(cwt.uC, 15377456, 4547222);
      this.a(cwt.uD, 15690005, 16775663);
      this.a(cwt.uE, 15198183, 44975);
      this.a(cwt.uF, 8032420, 15265265);
      this.a(cwt.uG, 5651507, 12422002);
      this.a(cwt.uH, 9804699, 2580065);
      this.a(cwt.uI, 4547222, 15377456);
      this.a(cwt.uJ, 1001033, 3790560);
      this.a(cwt.uK, 3407872, 5349438);
      this.a(cwt.uL, 1315860, 5075616);
      this.a(cwt.uM, 1315860, 4672845);
      this.a(cwt.uN, 14144467, 13545366);
      this.a(cwt.uO, 13004373, 15132390);
      this.a(cwt.uP, 6250335, 16545810);
      this.a(cwt.uQ, 44975, 7969893);
      this.a(cwt.uR, 3232308, 9945732);
      this.a(cwt.uS, 5651507, 7969893);
      this.a(cwt.uT, 15373203, 5009705);
      this.a(cwt.a);
      this.a(cwt.yo);
      this.a(cwt.yl);
      this.a(cwt.ym);
      this.a(cwt.yn);
      this.a(cwt.ec);
      this.a(cwt.eb);
      this.a(cwt.ea);
      this.a(cwt.yp);
      this.a(cwt.sw);
      this.a(cwt.rW);
      this.a(cwt.pY);
      this.a(cwt.vK);
   }

   static record a(String a, aku<dex> b, Map<aku<des>, String> c) {

      public String a(aku<des> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
