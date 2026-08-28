import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fna {
   private static final fmt a = fno.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fna.a> f = List.of(
      new fna.a("quartz", dey.a, Map.of()),
      new fna.a("iron", dey.b, Map.of(det.d, "iron_darker")),
      new fna.a("netherite", dey.c, Map.of(det.h, "netherite_darker")),
      new fna.a("redstone", dey.d, Map.of()),
      new fna.a("copper", dey.e, Map.of()),
      new fna.a("gold", dey.f, Map.of(det.e, "gold_darker")),
      new fna.a("emerald", dey.g, Map.of()),
      new fna.a("diamond", dey.h, Map.of(det.f, "diamond_darker")),
      new fna.a("lapis", dey.i, Map.of()),
      new fna.a("amethyst", dey.j, Map.of()),
      new fna.a("resin", dey.k, Map.of())
   );
   private final fnb g;
   private final BiConsumer<aku, fnp> h;

   public fna(fnb $$0, BiConsumer<aku, fnp> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cwl $$0) {
      this.g.a($$0, fno.a(fnq.a($$0)));
   }

   private aku a(cwl $$0, fnr $$1) {
      return $$1.a(fnq.a($$0), fnt.b($$0), this.h);
   }

   private void b(cwl $$0, fnr $$1) {
      this.g.a($$0, fno.a(this.a($$0, $$1)));
   }

   private aku a(cwl $$0, String $$1, fnr $$2) {
      return $$2.a(fnq.a($$0, $$1), fnt.k(fnt.a($$0, $$1)), this.h);
   }

   private aku a(cwl $$0, cwl $$1, fnr $$2) {
      return $$2.a(fnq.a($$0), fnt.b($$1), this.h);
   }

   private void b(cwl $$0, cwl $$1, fnr $$2) {
      this.g.a($$0, fno.a(this.a($$0, $$1, $$2)));
   }

   private void a(cwl $$0, fmt $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cwl $$0, String $$1, fmt $$2) {
      aku $$3 = this.a($$0, fnt.c($$0), fnt.a($$0, $$1));
      this.g.a($$0, fno.a($$3, a, $$2));
   }

   private List<hbn.a> b(cwl $$0) {
      List<hbn.a> $$1 = new ArrayList<>();
      hbi.b $$2 = fno.a(this.a($$0, "_16", fns.bE));
      $$1.add(fno.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayz.b($$3 - 16, 32);
         hbi.b $$5 = fno.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fns.bE));
         $$1.add(fno.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fno.a($$2, 31.5F));
      return $$1;
   }

   private void c(cwl $$0) {
      List<hbn.a> $$1 = this.b($$0);
      this.g.a($$0, fno.a(fno.a(kv.ad), fno.a(new hcg(true, hch.a.a), 32.0F, $$1), fno.a(new hcg(true, hch.a.b), 32.0F, $$1)));
   }

   private void d(cwl $$0) {
      this.g.a($$0, fno.a(new hcg(true, hch.a.c), 32.0F, this.b($$0)));
   }

   private void e(cwl $$0) {
      List<hbn.a> $$1 = new ArrayList<>();
      hbi.b $$2 = fno.a(this.a($$0, "_00", fns.bE));
      $$1.add(fno.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hbi.b $$4 = fno.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fns.bE));
         $$1.add(fno.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fno.a($$2, 63.5F));
      this.g.a($$0, fno.a(new hcq(true, true), 64.0F, $$1));
   }

   private aku a(cwl $$0, aku $$1, aku $$2) {
      return fns.bI.a($$0, fnt.c($$1, $$2), this.h);
   }

   private aku a(aku $$0, aku $$1, aku $$2) {
      return fns.bI.a($$0, fnt.c($$1, $$2), this.h);
   }

   private void a(aku $$0, aku $$1, aku $$2, aku $$3) {
      fns.bJ.a($$0, fnt.a($$1, $$2, $$3), this.h);
   }

   private void a(cwl $$0, akt<des> $$1, String $$2, boolean $$3) {
      aku $$4 = fnq.a($$0);
      aku $$5 = fnt.c($$0);
      aku $$6 = fnt.a($$0, "_overlay");
      List<hbo.a<akt<dex>>> $$7 = new ArrayList<>(f.size());

      for (fna.a $$8 : f) {
         aku $$9 = $$4.g("_" + $$8.a() + "_trim");
         aku $$10 = aku.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hbi.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fno.a($$9, new fmq(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fno.a($$9);
         }

         $$7.add(fno.a($$8.b, $$11));
      }

      hbi.b $$13;
      if ($$3) {
         fns.bI.a($$4, fnt.c($$5, $$6), this.h);
         $$13 = fno.a($$4, new fmq(-6265536));
      } else {
         fns.bE.a($$4, fnt.k($$5), this.h);
         $$13 = fno.a($$4);
      }

      this.g.a($$0, fno.a(new hdc(), $$13, $$7));
   }

   private void f(cwl $$0) {
      hbi.b $$1 = fno.a(this.a($$0, fns.bE));
      aku $$2 = this.a($$0, fns.bO, "_open_back");
      aku $$3 = this.a($$0, fns.bN, "_open_front");
      hbi.b $$4 = fno.a(fno.a($$2), new hbe.a(), fno.a($$3));
      hbi.b $$5 = fno.a(new hbs(), $$4, $$1);
      this.g.a($$0, fno.a(new hcx(), $$1, fno.a(cwn.g, $$5)));
   }

   private aku a(cwl $$0, fnr $$1, String $$2) {
      aku $$3 = fnt.a($$0, $$2);
      return $$1.a($$0, fnt.k($$3), this.h);
   }

   private void g(cwl $$0) {
      hbi.b $$1 = fno.a(fnq.a($$0));
      hbi.b $$2 = fno.a(this.a($$0, "_pulling_0", fns.bP));
      hbi.b $$3 = fno.a(this.a($$0, "_pulling_1", fns.bP));
      hbi.b $$4 = fno.a(this.a($$0, "_pulling_2", fns.bP));
      this.g.a($$0, fno.a(fno.a(), fno.a(new hcs(false), 0.05F, $$2, fno.a($$3, 0.65F), fno.a($$4, 0.9F)), $$1));
   }

   private void h(cwl $$0) {
      hbi.b $$1 = fno.a(fnq.a($$0));
      hbi.b $$2 = fno.a(this.a($$0, "_pulling_0", fns.bQ));
      hbi.b $$3 = fno.a(this.a($$0, "_pulling_1", fns.bQ));
      hbi.b $$4 = fno.a(this.a($$0, "_pulling_2", fns.bQ));
      hbi.b $$5 = fno.a(this.a($$0, "_arrow", fns.bQ));
      hbi.b $$6 = fno.a(this.a($$0, "_firework", fns.bQ));
      this.g
         .a($$0, fno.a(fno.a(), fno.a(new hck(), $$2, fno.a($$3, 0.58F), fno.a($$4, 1.0F)), fno.a(new hcv(), $$1, fno.a(cvg.a.b, $$5), fno.a(cvg.a.c, $$6))));
   }

   private void a(cwl $$0, hbu $$1, hbi.b $$2, hbi.b $$3) {
      this.g.a($$0, fno.a($$1, $$2, $$3));
   }

   private void i(cwl $$0) {
      hbi.b $$1 = fno.a(this.a($$0, fns.bE));
      hbi.b $$2 = fno.a(this.a($$0, "_broken", fns.bE));
      this.a($$0, new hbr(), $$2, $$1);
   }

   private void j(cwl $$0) {
      hbi.b $$1 = fno.a(fnq.a($$0));
      hbi.b $$2 = fno.a(fnq.a($$0, "_brushing_0"));
      hbi.b $$3 = fno.a(fnq.a($$0, "_brushing_1"));
      hbi.b $$4 = fno.a(fnq.a($$0, "_brushing_2"));
      this.g.a($$0, fno.a(new hcr(10.0F), 0.1F, $$1, fno.a($$2, 0.25F), fno.a($$3, 0.5F), fno.a($$4, 0.75F)));
   }

   private void k(cwl $$0) {
      hbi.b $$1 = fno.a(this.a($$0, fns.bH));
      hbi.b $$2 = fno.a(this.a($$0, "_cast", fns.bH));
      this.a($$0, new hbx(), $$2, $$1);
   }

   private void l(cwl $$0) {
      hbi.b $$1 = fno.a(fnq.a($$0));
      hbi.b $$2 = fno.a(fnq.b("tooting_goat_horn"));
      this.a($$0, fno.a(), $$2, $$1);
   }

   private void m(cwl $$0) {
      hbi.b $$1 = fno.a(fnq.a($$0), new hdl.a());
      hbi.b $$2 = fno.a(fnq.a($$0, "_blocking"), new hdl.a());
      this.a($$0, fno.a(), $$2, $$1);
   }

   private static hbi.b a(hbi.b $$0, hbi.b $$1) {
      return fno.a(new hcx(), $$1, fno.a(List.of(cwn.g, cwn.h, cwn.i), $$0));
   }

   private void n(cwl $$0) {
      hbi.b $$1 = fno.a(this.a($$0, fns.bE));
      hbi.b $$2 = fno.a(fnq.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cwl $$0) {
      hbi.b $$1 = fno.a(this.a($$0, fns.bE));
      hbi.b $$2 = fno.a(fnq.a($$0, "_in_hand"), new hdq.a());
      hbi.b $$3 = fno.a(fnq.a($$0, "_throwing"), new hdq.a());
      hbi.b $$4 = fno.a(fno.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cwl $$0, aku $$1) {
      this.g.a($$0, fno.a($$1, new fmw()));
   }

   private void p(cwl $$0) {
      aku $$1 = this.a($$0, fnq.b("potion_overlay"), fnq.a($$0));
      this.a($$0, $$1);
   }

   private void q(cwl $$0) {
      aku $$1 = this.a($$0, fnq.a($$0, "_head"), fnq.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cwl $$0, int $$1) {
      aku $$2 = this.a($$0, fns.bE);
      this.g.a($$0, fno.a($$2, new fmq($$1)));
   }

   private void a(cwl $$0, int $$1, int $$2) {
      aku $$3 = fnq.b("template_spawn_egg");
      this.g.a($$0, fno.a($$3, fno.a($$1), fno.a($$2)));
   }

   private void r(cwl $$0) {
      aku $$1 = fnt.c($$0);
      aku $$2 = fnt.a($$0, "_overlay");
      aku $$3 = fns.bE.a($$0, fnt.k($$1), this.h);
      aku $$4 = fnq.a($$0, "_dyed");
      fns.bI.a($$4, fnt.c($$1, $$2), this.h);
      this.g.a($$0, fno.a(fno.a(kv.J), fno.a($$4, a, new fmq(0)), fno.a($$3)));
   }

   public void a() {
      this.b(cwt.oF, fns.bE);
      this.b(cwt.oH, fns.bE);
      this.b(cwt.oG, fns.bE);
      this.b(cwt.oI, fns.bE);
      this.b(cwt.pi, fns.bE);
      this.b(cwt.oZ, fns.bE);
      this.b(cwt.oV, fns.bE);
      this.b(cwt.vF, fns.bE);
      this.b(cwt.pb, fns.bE);
      this.b(cwt.vg, fns.bE);
      this.b(cwt.ed, fns.bG);
      this.b(cwt.sX, fns.bE);
      this.b(cwt.wk, fns.bE);
      this.b(cwt.wm, fns.bE);
      this.b(cwt.oB, fns.bE);
      this.b(cwt.oC, fns.bE);
      this.b(cwt.su, fns.bE);
      this.b(cwt.tl, fns.bE);
      this.b(cwt.td, fns.bG);
      this.b(cwt.sq, fns.bE);
      this.b(cwt.sv, fns.bE);
      this.b(cwt.xh, fns.bE);
      this.b(cwt.rw, fns.bE);
      this.b(cwt.oY, fns.bE);
      this.b(cwt.qc, fns.bE);
      this.b(cwt.rs, fns.bE);
      this.b(cwt.uZ, fns.bG);
      this.b(cwt.sr, fns.bE);
      this.b(cwt.rf, fns.bE);
      this.b(cwt.ot, fns.bH);
      this.b(cwt.ou, fns.bH);
      this.b(cwt.pd, fns.bE);
      this.b(cwt.op, fns.bE);
      this.b(cwt.sZ, fns.bE);
      this.b(cwt.wg, fns.bE);
      this.b(cwt.rt, fns.bE);
      this.e(cwt.rT);
      this.b(cwt.pc, fns.bE);
      this.b(cwt.ro, fns.bE);
      this.b(cwt.vM, fns.bE);
      this.c(cwt.rz);
      this.d(cwt.rA);
      this.b(cwt.sY, fns.bE);
      this.b(cwt.ta, fns.bE);
      this.b(cwt.sa, fns.bE);
      this.b(cwt.vO, fns.bE);
      this.b(cwt.qD, fns.bE);
      this.b(cwt.vB, fns.bE);
      this.b(cwt.sb, fns.bE);
      this.b(cwt.sP, fns.bE);
      this.b(cwt.pl, fns.bE);
      this.b(cwt.pm, fns.bE);
      this.b(cwt.wZ, fns.bE);
      this.b(cwt.so, fns.bE);
      this.b(cwt.oJ, fns.bE);
      this.b(cwt.oK, fns.bE);
      this.b(cwt.pe, fns.bE);
      this.b(cwt.pO, fns.bG);
      this.b(cwt.pP, fns.bG);
      this.b(cwt.vI, fns.bE);
      this.b(cwt.pN, fns.bG);
      this.b(cwt.pM, fns.bG);
      this.b(cwt.pL, fns.bG);
      this.b(cwt.wn, fns.bE);
      this.b(cwt.sU, fns.bE);
      this.b(cwt.ry, fns.bE);
      this.b(cwt.pf, fns.bE);
      this.b(cwt.vv, fns.bE);
      this.b(cwt.tp, fns.bE);
      this.b(cwt.tc, fns.bE);
      this.b(cwt.wf, fns.bE);
      this.b(cwt.uU, fns.bE);
      this.b(cwt.tk, fns.bE);
      this.b(cwt.xg, fns.bE);
      this.b(cwt.vt, fns.bE);
      this.b(cwt.uV, fns.bE);
      this.b(cwt.qB, fns.bE);
      this.b(cwt.oX, fns.bE);
      this.b(cwt.xe, fns.bE);
      this.b(cwt.wY, fns.bE);
      this.b(cwt.oq, fns.bE);
      this.b(cwt.te, fns.bE);
      this.b(cwt.th, fns.bE);
      this.b(cwt.tq, fns.bE);
      this.b(cwt.xc, fns.bE);
      this.b(cwt.xw, fns.bE);
      this.b(cwt.rV, fns.bE);
      this.b(cwt.sd, fns.bE);
      this.b(cwt.vc, fns.bE);
      this.b(cwt.pn, fns.bE);
      this.b(cwt.qF, fns.bE);
      this.b(cwt.pE, fns.bG);
      this.b(cwt.vj, fns.bE);
      this.b(cwt.pF, fns.bG);
      this.b(cwt.vH, fns.bE);
      this.b(cwt.pD, fns.bG);
      this.b(cwt.pC, fns.bG);
      this.b(cwt.pB, fns.bG);
      this.b(cwt.po, fns.bE);
      this.b(cwt.tf, fns.bE);
      this.b(cwt.sm, fns.bE);
      this.b(cwt.ss, fns.bE);
      this.b(cwt.pZ, fns.bE);
      this.b(cwt.xf, fns.bE);
      this.b(cwt.wU, fns.bE);
      this.b(cwt.xA, fns.bE);
      this.b(cwt.xD, fns.bE);
      this.b(cwt.os, fns.bE);
      this.b(cwt.sc, fns.bE);
      this.b(cwt.pj, fns.bE);
      this.b(cwt.pJ, fns.bG);
      this.b(cwt.pK, fns.bG);
      this.b(cwt.vG, fns.bE);
      this.b(cwt.pk, fns.bE);
      this.b(cwt.wv, fns.bE);
      this.b(cwt.pI, fns.bG);
      this.b(cwt.pH, fns.bG);
      this.b(cwt.pG, fns.bG);
      this.b(cwt.vb, fns.bE);
      this.b(cwt.oD, fns.bE);
      this.b(cwt.oE, fns.bE);
      this.b(cwt.ww, fns.bE);
      this.b(cwt.pg, fns.bE);
      this.b(cwt.rh, fns.bE);
      this.b(cwt.rk, fns.bE);
      this.b(cwt.si, fns.bE);
      this.b(cwt.sn, fns.bE);
      this.b(cwt.sk, fns.bE);
      this.b(cwt.sh, fns.bE);
      this.b(cwt.tm, fns.bE);
      this.b(cwt.oN, fns.bE);
      this.b(cwt.oO, fns.bE);
      this.b(cwt.oP, fns.bE);
      this.b(cwt.oQ, fns.bE);
      this.b(cwt.vi, fns.bE);
      this.b(cwt.sT, fns.bE);
      this.b(cwt.rl, fns.bE);
      this.b(cwt.oo, fns.bE);
      this.b(cwt.xb, fns.bE);
      this.b(cwt.pW, fns.bE);
      this.b(cwt.wR, fns.bE);
      this.b(cwt.wK, fns.bF);
      this.b(cwt.wy, fns.bF);
      this.b(cwt.wA, fns.bF);
      this.b(cwt.wz, fns.bF);
      this.b(cwt.wB, fns.bF);
      this.b(cwt.wC, fns.bF);
      this.b(cwt.wD, fns.bF);
      this.b(cwt.wE, fns.bF);
      this.b(cwt.wF, fns.bF);
      this.b(cwt.wG, fns.bF);
      this.b(cwt.wP, fns.bF);
      this.b(cwt.wQ, fns.bF);
      this.b(cwt.wH, fns.bF);
      this.b(cwt.wI, fns.bF);
      this.b(cwt.wL, fns.bF);
      this.b(cwt.wJ, fns.bF);
      this.b(cwt.wM, fns.bF);
      this.b(cwt.wN, fns.bF);
      this.b(cwt.wO, fns.bF);
      this.b(cwt.vN, fns.bE);
      this.b(cwt.vL, fns.bE);
      this.b(cwt.wT, fns.bE);
      this.b(cwt.pT, fns.bG);
      this.b(cwt.pU, fns.bG);
      this.b(cwt.pp, fns.bE);
      this.b(cwt.pS, fns.bG);
      this.b(cwt.pq, fns.bE);
      this.b(cwt.pR, fns.bG);
      this.b(cwt.pQ, fns.bG);
      this.b(cwt.vw, fns.bE);
      this.b(cwt.vx, fns.bE);
      this.b(cwt.vr, fns.bE);
      this.b(cwt.ox, fns.bE);
      this.b(cwt.oy, fns.bE);
      this.b(cwt.sg, fns.bE);
      this.b(cwt.qE, fns.bE);
      this.b(cwt.oL, fns.bE);
      this.b(cwt.oM, fns.bE);
      this.b(cwt.rv, fns.bE);
      this.b(cwt.ov, fns.bE);
      this.b(cwt.xd, fns.bE);
      this.b(cwt.sl, fns.bE);
      this.b(cwt.vh, fns.bE);
      this.b(cwt.wh, fns.bE);
      this.b(cwt.qC, fns.bE);
      this.b(cwt.ri, fns.bE);
      this.b(cwt.vz, fns.bE);
      this.b(cwt.vy, fns.bE);
      this.b(cwt.rZ, fns.bE);
      this.b(cwt.rm, fns.bE);
      this.b(cwt.vs, fns.bE);
      this.b(cwt.sp, fns.bE);
      this.b(cwt.ph, fns.bE);
      this.b(cwt.vA, fns.bE);
      this.b(cwt.vD, fns.bE);
      this.b(cwt.vE, fns.bE);
      this.b(cwt.vC, fns.bE);
      this.b(cwt.st, fns.bE);
      this.b(cwt.tb, fns.bE);
      this.b(cwt.on, fns.bE);
      this.b(cwt.rX, fns.bE);
      this.b(cwt.rn, fns.bE);
      this.b(cwt.oU, fns.bE);
      this.b(cwt.sS, fns.bE);
      this.b(cwt.wu, fns.bE);
      this.b(cwt.xa, fns.bE);
      this.b(cwt.rx, fns.bE);
      this.b(cwt.rj, fns.bE);
      this.b(cwt.yu, fns.bE);
      this.b(cwt.wp, fns.bE);
      this.b(cwt.tj, fns.bE);
      this.b(cwt.oz, fns.bE);
      this.b(cwt.oA, fns.bE);
      this.b(cwt.pV, fns.bG);
      this.b(cwt.pz, fns.bG);
      this.b(cwt.pA, fns.bG);
      this.b(cwt.py, fns.bG);
      this.b(cwt.px, fns.bG);
      this.b(cwt.pw, fns.bG);
      this.b(cwt.sx, fns.bE);
      this.b(cwt.wW, fns.bE);
      this.b(cwt.or, fns.bE);
      this.b(cwt.wt, fns.bE);
      this.b(cwt.rY, fns.bE);
      this.b(cwt.rp, fns.bE);
      this.b(cwt.rq, fns.bE);
      this.b(cwt.rr, fns.bE);
      this.b(cwt.rg, fns.bE);
      this.b(cwt.qb, fns.bE);
      this.b(cwt.sf, fns.bE);
      this.b(cwt.uW, fns.bE);
      this.b(cwt.va, fns.bY);
      this.b(cwt.pu, fns.bG);
      this.b(cwt.pv, fns.bG);
      this.b(cwt.pt, fns.bG);
      this.b(cwt.ps, fns.bG);
      this.b(cwt.pr, fns.bG);
      this.b(cwt.uX, fns.bE);
      this.b(cwt.uY, fns.bE);
      this.b(cwt.sj, fns.bE);
      this.b(cwt.yw, fns.bE);
      this.b(cwt.yx, fns.bE);
      this.b(cwt.yy, fns.bE);
      this.b(cwt.yz, fns.bE);
      this.b(cwt.yA, fns.bE);
      this.b(cwt.yB, fns.bE);
      this.b(cwt.yC, fns.bE);
      this.b(cwt.yD, fns.bE);
      this.b(cwt.yE, fns.bE);
      this.b(cwt.yF, fns.bE);
      this.b(cwt.yG, fns.bE);
      this.b(cwt.yH, fns.bE);
      this.b(cwt.yI, fns.bE);
      this.b(cwt.yJ, fns.bE);
      this.b(cwt.yK, fns.bE);
      this.b(cwt.yL, fns.bE);
      this.b(cwt.yM, fns.bE);
      this.b(cwt.yN, fns.bE);
      this.b(cwt.yO, fns.bE);
      this.b(cwt.wx, cwt.pV, fns.bG);
      this.b(cwt.qG, cwt.qF, fns.bE);
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
      this.b(cwt.yP, fns.bE);
      this.b(cwt.yQ, fns.bE);
      this.b(cwt.yR, fns.bE);
      this.b(cwt.yS, fns.bE);
      this.b(cwt.yT, fns.bE);
      this.b(cwt.yU, fns.bE);
      this.b(cwt.yV, fns.bE);
      this.b(cwt.yW, fns.bE);
      this.b(cwt.yX, fns.bE);
      this.b(cwt.yY, fns.bE);
      this.b(cwt.yZ, fns.bE);
      this.b(cwt.za, fns.bE);
      this.b(cwt.zb, fns.bE);
      this.b(cwt.zc, fns.bE);
      this.b(cwt.zd, fns.bE);
      this.b(cwt.ze, fns.bE);
      this.b(cwt.zf, fns.bE);
      this.b(cwt.zg, fns.bE);
      this.b(cwt.zh, fns.bE);
      this.b(cwt.zi, fns.bE);
      this.b(cwt.zj, fns.bE);
      this.b(cwt.zk, fns.bE);
      this.b(cwt.zl, fns.bE);
      this.b(cwt.zD, fns.bE);
      this.b(cwt.zE, fns.bE);
      this.b(cwt.zG, fns.bE);
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

   static record a(String a, akt<dex> b, Map<akt<des>, String> c) {

      public String a(akt<des> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
