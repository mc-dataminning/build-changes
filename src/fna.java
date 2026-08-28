import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fna {
   private static final fms a = fno.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fna.a> f = List.of(
      new fna.a("quartz", dex.a, Map.of()),
      new fna.a("iron", dex.b, Map.of(des.d, "iron_darker")),
      new fna.a("netherite", dex.c, Map.of(des.h, "netherite_darker")),
      new fna.a("redstone", dex.d, Map.of()),
      new fna.a("copper", dex.e, Map.of()),
      new fna.a("gold", dex.f, Map.of(des.e, "gold_darker")),
      new fna.a("emerald", dex.g, Map.of()),
      new fna.a("diamond", dex.h, Map.of(des.f, "diamond_darker")),
      new fna.a("lapis", dex.i, Map.of()),
      new fna.a("amethyst", dex.j, Map.of()),
      new fna.a("resin", dex.k, Map.of())
   );
   private final fnb g;
   private final BiConsumer<akv, fnp> h;

   public fna(fnb $$0, BiConsumer<akv, fnp> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cwk $$0) {
      this.g.a($$0, fno.a(fnq.a($$0)));
   }

   private akv a(cwk $$0, fnr $$1) {
      return $$1.a(fnq.a($$0), fnt.b($$0), this.h);
   }

   private void b(cwk $$0, fnr $$1) {
      this.g.a($$0, fno.a(this.a($$0, $$1)));
   }

   private akv a(cwk $$0, String $$1, fnr $$2) {
      return $$2.a(fnq.a($$0, $$1), fnt.k(fnt.a($$0, $$1)), this.h);
   }

   private akv a(cwk $$0, cwk $$1, fnr $$2) {
      return $$2.a(fnq.a($$0), fnt.b($$1), this.h);
   }

   private void b(cwk $$0, cwk $$1, fnr $$2) {
      this.g.a($$0, fno.a(this.a($$0, $$1, $$2)));
   }

   private void a(cwk $$0, fms $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cwk $$0, String $$1, fms $$2) {
      akv $$3 = this.a($$0, fnt.c($$0), fnt.a($$0, $$1));
      this.g.a($$0, fno.a($$3, a, $$2));
   }

   private List<hbp.a> b(cwk $$0) {
      List<hbp.a> $$1 = new ArrayList<>();
      hbk.b $$2 = fno.a(this.a($$0, "_16", fns.bE));
      $$1.add(fno.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayz.b($$3 - 16, 32);
         hbk.b $$5 = fno.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fns.bE));
         $$1.add(fno.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fno.a($$2, 31.5F));
      return $$1;
   }

   private void c(cwk $$0) {
      List<hbp.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fno.a(
               fno.a(kv.ad),
               fno.a(new hcj(true, hck.a.b), 32.0F, $$1),
               fno.a(fno.a(new hcj(true, hck.a.c), 32.0F, $$1), fno.a(new hcj(true, hck.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cwk $$0) {
      this.g.a($$0, fno.a(new hcj(true, hck.a.d), 32.0F, this.b($$0)));
   }

   private void e(cwk $$0) {
      List<hbp.a> $$1 = new ArrayList<>();
      hbk.b $$2 = fno.a(this.a($$0, "_00", fns.bE));
      $$1.add(fno.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hbk.b $$4 = fno.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fns.bE));
         $$1.add(fno.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fno.a($$2, 63.5F));
      this.g.a($$0, fno.a(fno.a(new hct(true, hct.a.b), 64.0F, $$1), fno.a(new hct(true, hct.a.a), 64.0F, $$1)));
   }

   private akv a(cwk $$0, akv $$1, akv $$2) {
      return fns.bI.a($$0, fnt.c($$1, $$2), this.h);
   }

   private akv a(akv $$0, akv $$1, akv $$2) {
      return fns.bI.a($$0, fnt.c($$1, $$2), this.h);
   }

   private void a(akv $$0, akv $$1, akv $$2, akv $$3) {
      fns.bJ.a($$0, fnt.a($$1, $$2, $$3), this.h);
   }

   private void a(cwk $$0, aku<der> $$1, String $$2, boolean $$3) {
      akv $$4 = fnq.a($$0);
      akv $$5 = fnt.c($$0);
      akv $$6 = fnt.a($$0, "_overlay");
      List<hbq.a<aku<dew>>> $$7 = new ArrayList<>(f.size());

      for (fna.a $$8 : f) {
         akv $$9 = $$4.g("_" + $$8.a() + "_trim");
         akv $$10 = akv.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hbk.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fno.a($$9, new fmp(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fno.a($$9);
         }

         $$7.add(fno.a($$8.b, $$11));
      }

      hbk.b $$13;
      if ($$3) {
         fns.bI.a($$4, fnt.c($$5, $$6), this.h);
         $$13 = fno.a($$4, new fmp(-6265536));
      } else {
         fns.bE.a($$4, fnt.k($$5), this.h);
         $$13 = fno.a($$4);
      }

      this.g.a($$0, fno.a(new hdi(), $$13, $$7));
   }

   private void f(cwk $$0) {
      hbk.b $$1 = fno.a(this.a($$0, fns.bE));
      akv $$2 = this.a($$0, fns.bO, "_open_back");
      akv $$3 = this.a($$0, fns.bN, "_open_front");
      hbk.b $$4 = fno.a(fno.a($$2), new hbf.a(), fno.a($$3));
      hbk.b $$5 = fno.a(new hbu(), $$4, $$1);
      this.g.a($$0, fno.a(new hdc(), $$1, fno.a(cwm.g, $$5)));
   }

   private akv a(cwk $$0, fnr $$1, String $$2) {
      akv $$3 = fnt.a($$0, $$2);
      return $$1.a($$0, fnt.k($$3), this.h);
   }

   private void g(cwk $$0) {
      hbk.b $$1 = fno.a(fnq.a($$0));
      hbk.b $$2 = fno.a(this.a($$0, "_pulling_0", fns.bP));
      hbk.b $$3 = fno.a(this.a($$0, "_pulling_1", fns.bP));
      hbk.b $$4 = fno.a(this.a($$0, "_pulling_2", fns.bP));
      this.g.a($$0, fno.a(fno.a(), fno.a(new hcv(false), 0.05F, $$2, fno.a($$3, 0.65F), fno.a($$4, 0.9F)), $$1));
   }

   private void h(cwk $$0) {
      hbk.b $$1 = fno.a(fnq.a($$0));
      hbk.b $$2 = fno.a(this.a($$0, "_pulling_0", fns.bQ));
      hbk.b $$3 = fno.a(this.a($$0, "_pulling_1", fns.bQ));
      hbk.b $$4 = fno.a(this.a($$0, "_pulling_2", fns.bQ));
      hbk.b $$5 = fno.a(this.a($$0, "_arrow", fns.bQ));
      hbk.b $$6 = fno.a(this.a($$0, "_firework", fns.bQ));
      this.g
         .a($$0, fno.a(fno.a(), fno.a(new hcn(), $$2, fno.a($$3, 0.58F), fno.a($$4, 1.0F)), fno.a(new hcy(), $$1, fno.a(cvf.a.b, $$5), fno.a(cvf.a.c, $$6))));
   }

   private void a(cwk $$0, hbw $$1, hbk.b $$2, hbk.b $$3) {
      this.g.a($$0, fno.a($$1, $$2, $$3));
   }

   private void i(cwk $$0) {
      hbk.b $$1 = fno.a(this.a($$0, fns.bE));
      hbk.b $$2 = fno.a(this.a($$0, "_broken", fns.bE));
      this.a($$0, new hbt(), $$2, $$1);
   }

   private void j(cwk $$0) {
      hbk.b $$1 = fno.a(fnq.a($$0));
      hbk.b $$2 = fno.a(fnq.a($$0, "_brushing_0"));
      hbk.b $$3 = fno.a(fnq.a($$0, "_brushing_1"));
      hbk.b $$4 = fno.a(fnq.a($$0, "_brushing_2"));
      this.g.a($$0, fno.a(new hcu(10.0F), 0.1F, $$1, fno.a($$2, 0.25F), fno.a($$3, 0.5F), fno.a($$4, 0.75F)));
   }

   private void k(cwk $$0) {
      hbk.b $$1 = fno.a(this.a($$0, fns.bH));
      hbk.b $$2 = fno.a(this.a($$0, "_cast", fns.bH));
      this.a($$0, new hca(), $$2, $$1);
   }

   private void l(cwk $$0) {
      hbk.b $$1 = fno.a(fnq.a($$0));
      hbk.b $$2 = fno.a(fnq.b("tooting_goat_horn"));
      this.a($$0, fno.a(), $$2, $$1);
   }

   private void m(cwk $$0) {
      hbk.b $$1 = fno.a(fnq.a($$0), new hds.a());
      hbk.b $$2 = fno.a(fnq.a($$0, "_blocking"), new hds.a());
      this.a($$0, fno.a(), $$2, $$1);
   }

   private static hbk.b a(hbk.b $$0, hbk.b $$1) {
      return fno.a(new hdc(), $$1, fno.a(List.of(cwm.g, cwm.h, cwm.i), $$0));
   }

   private void n(cwk $$0) {
      hbk.b $$1 = fno.a(this.a($$0, fns.bE));
      hbk.b $$2 = fno.a(fnq.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cwk $$0) {
      hbk.b $$1 = fno.a(this.a($$0, fns.bE));
      hbk.b $$2 = fno.a(fnq.a($$0, "_in_hand"), new hdy.a());
      hbk.b $$3 = fno.a(fnq.a($$0, "_throwing"), new hdy.a());
      hbk.b $$4 = fno.a(fno.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cwk $$0, akv $$1) {
      this.g.a($$0, fno.a($$1, new fmv()));
   }

   private void p(cwk $$0) {
      akv $$1 = this.a($$0, fnq.b("potion_overlay"), fnq.a($$0));
      this.a($$0, $$1);
   }

   private void q(cwk $$0) {
      akv $$1 = this.a($$0, fnq.a($$0, "_head"), fnq.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cwk $$0, int $$1) {
      akv $$2 = this.a($$0, fns.bE);
      this.g.a($$0, fno.a($$2, new fmp($$1)));
   }

   private void a(cwk $$0, int $$1, int $$2) {
      akv $$3 = fnq.b("template_spawn_egg");
      this.g.a($$0, fno.a($$3, fno.a($$1), fno.a($$2)));
   }

   private void r(cwk $$0) {
      akv $$1 = fnt.c($$0);
      akv $$2 = fnt.a($$0, "_overlay");
      akv $$3 = fns.bE.a($$0, fnt.k($$1), this.h);
      akv $$4 = fnq.a($$0, "_dyed");
      fns.bI.a($$4, fnt.c($$1, $$2), this.h);
      this.g.a($$0, fno.a(fno.a(kv.J), fno.a($$4, a, new fmp(0)), fno.a($$3)));
   }

   public void a() {
      this.b(cws.oF, fns.bE);
      this.b(cws.oH, fns.bE);
      this.b(cws.oG, fns.bE);
      this.b(cws.oI, fns.bE);
      this.b(cws.pi, fns.bE);
      this.b(cws.oZ, fns.bE);
      this.b(cws.oV, fns.bE);
      this.b(cws.vF, fns.bE);
      this.b(cws.pb, fns.bE);
      this.b(cws.vg, fns.bE);
      this.b(cws.ed, fns.bG);
      this.b(cws.sX, fns.bE);
      this.b(cws.wk, fns.bE);
      this.b(cws.wm, fns.bE);
      this.b(cws.oB, fns.bE);
      this.b(cws.oC, fns.bE);
      this.b(cws.su, fns.bE);
      this.b(cws.tl, fns.bE);
      this.b(cws.td, fns.bG);
      this.b(cws.sq, fns.bE);
      this.b(cws.sv, fns.bE);
      this.b(cws.xh, fns.bE);
      this.b(cws.rw, fns.bE);
      this.b(cws.oY, fns.bE);
      this.b(cws.qc, fns.bE);
      this.b(cws.rs, fns.bE);
      this.b(cws.uZ, fns.bG);
      this.b(cws.sr, fns.bE);
      this.b(cws.rf, fns.bE);
      this.b(cws.ot, fns.bH);
      this.b(cws.ou, fns.bH);
      this.b(cws.pd, fns.bE);
      this.b(cws.op, fns.bE);
      this.b(cws.sZ, fns.bE);
      this.b(cws.wg, fns.bE);
      this.b(cws.rt, fns.bE);
      this.e(cws.rT);
      this.b(cws.pc, fns.bE);
      this.b(cws.ro, fns.bE);
      this.b(cws.vM, fns.bE);
      this.c(cws.rz);
      this.d(cws.rA);
      this.b(cws.sY, fns.bE);
      this.b(cws.ta, fns.bE);
      this.b(cws.sa, fns.bE);
      this.b(cws.vO, fns.bE);
      this.b(cws.qD, fns.bE);
      this.b(cws.vB, fns.bE);
      this.b(cws.sb, fns.bE);
      this.b(cws.sP, fns.bE);
      this.b(cws.pl, fns.bE);
      this.b(cws.pm, fns.bE);
      this.b(cws.wZ, fns.bE);
      this.b(cws.so, fns.bE);
      this.b(cws.oJ, fns.bE);
      this.b(cws.oK, fns.bE);
      this.b(cws.pe, fns.bE);
      this.b(cws.pO, fns.bG);
      this.b(cws.pP, fns.bG);
      this.b(cws.vI, fns.bE);
      this.b(cws.pN, fns.bG);
      this.b(cws.pM, fns.bG);
      this.b(cws.pL, fns.bG);
      this.b(cws.wn, fns.bE);
      this.b(cws.sU, fns.bE);
      this.b(cws.ry, fns.bE);
      this.b(cws.pf, fns.bE);
      this.b(cws.vv, fns.bE);
      this.b(cws.tp, fns.bE);
      this.b(cws.tc, fns.bE);
      this.b(cws.wf, fns.bE);
      this.b(cws.uU, fns.bE);
      this.b(cws.tk, fns.bE);
      this.b(cws.xg, fns.bE);
      this.b(cws.vt, fns.bE);
      this.b(cws.uV, fns.bE);
      this.b(cws.qB, fns.bE);
      this.b(cws.oX, fns.bE);
      this.b(cws.xe, fns.bE);
      this.b(cws.wY, fns.bE);
      this.b(cws.oq, fns.bE);
      this.b(cws.te, fns.bE);
      this.b(cws.th, fns.bE);
      this.b(cws.tq, fns.bE);
      this.b(cws.xc, fns.bE);
      this.b(cws.xw, fns.bE);
      this.b(cws.rV, fns.bE);
      this.b(cws.sd, fns.bE);
      this.b(cws.vc, fns.bE);
      this.b(cws.pn, fns.bE);
      this.b(cws.qF, fns.bE);
      this.b(cws.pE, fns.bG);
      this.b(cws.vj, fns.bE);
      this.b(cws.pF, fns.bG);
      this.b(cws.vH, fns.bE);
      this.b(cws.pD, fns.bG);
      this.b(cws.pC, fns.bG);
      this.b(cws.pB, fns.bG);
      this.b(cws.po, fns.bE);
      this.b(cws.tf, fns.bE);
      this.b(cws.sm, fns.bE);
      this.b(cws.ss, fns.bE);
      this.b(cws.pZ, fns.bE);
      this.b(cws.xf, fns.bE);
      this.b(cws.wU, fns.bE);
      this.b(cws.xA, fns.bE);
      this.b(cws.xD, fns.bE);
      this.b(cws.os, fns.bE);
      this.b(cws.sc, fns.bE);
      this.b(cws.pj, fns.bE);
      this.b(cws.pJ, fns.bG);
      this.b(cws.pK, fns.bG);
      this.b(cws.vG, fns.bE);
      this.b(cws.pk, fns.bE);
      this.b(cws.wv, fns.bE);
      this.b(cws.pI, fns.bG);
      this.b(cws.pH, fns.bG);
      this.b(cws.pG, fns.bG);
      this.b(cws.vb, fns.bE);
      this.b(cws.oD, fns.bE);
      this.b(cws.oE, fns.bE);
      this.b(cws.ww, fns.bE);
      this.b(cws.pg, fns.bE);
      this.b(cws.rh, fns.bE);
      this.b(cws.rk, fns.bE);
      this.b(cws.si, fns.bE);
      this.b(cws.sn, fns.bE);
      this.b(cws.sk, fns.bE);
      this.b(cws.sh, fns.bE);
      this.b(cws.tm, fns.bE);
      this.b(cws.oN, fns.bE);
      this.b(cws.oO, fns.bE);
      this.b(cws.oP, fns.bE);
      this.b(cws.oQ, fns.bE);
      this.b(cws.vi, fns.bE);
      this.b(cws.sT, fns.bE);
      this.b(cws.rl, fns.bE);
      this.b(cws.oo, fns.bE);
      this.b(cws.xb, fns.bE);
      this.b(cws.pW, fns.bE);
      this.b(cws.wR, fns.bE);
      this.b(cws.wK, fns.bF);
      this.b(cws.wy, fns.bF);
      this.b(cws.wA, fns.bF);
      this.b(cws.wz, fns.bF);
      this.b(cws.wB, fns.bF);
      this.b(cws.wC, fns.bF);
      this.b(cws.wD, fns.bF);
      this.b(cws.wE, fns.bF);
      this.b(cws.wF, fns.bF);
      this.b(cws.wG, fns.bF);
      this.b(cws.wP, fns.bF);
      this.b(cws.wQ, fns.bF);
      this.b(cws.wH, fns.bF);
      this.b(cws.wI, fns.bF);
      this.b(cws.wL, fns.bF);
      this.b(cws.wJ, fns.bF);
      this.b(cws.wM, fns.bF);
      this.b(cws.wN, fns.bF);
      this.b(cws.wO, fns.bF);
      this.b(cws.vN, fns.bE);
      this.b(cws.vL, fns.bE);
      this.b(cws.wT, fns.bE);
      this.b(cws.pT, fns.bG);
      this.b(cws.pU, fns.bG);
      this.b(cws.pp, fns.bE);
      this.b(cws.pS, fns.bG);
      this.b(cws.pq, fns.bE);
      this.b(cws.pR, fns.bG);
      this.b(cws.pQ, fns.bG);
      this.b(cws.vw, fns.bE);
      this.b(cws.vx, fns.bE);
      this.b(cws.vr, fns.bE);
      this.b(cws.ox, fns.bE);
      this.b(cws.oy, fns.bE);
      this.b(cws.sg, fns.bE);
      this.b(cws.qE, fns.bE);
      this.b(cws.oL, fns.bE);
      this.b(cws.oM, fns.bE);
      this.b(cws.rv, fns.bE);
      this.b(cws.ov, fns.bE);
      this.b(cws.xd, fns.bE);
      this.b(cws.sl, fns.bE);
      this.b(cws.vh, fns.bE);
      this.b(cws.wh, fns.bE);
      this.b(cws.qC, fns.bE);
      this.b(cws.ri, fns.bE);
      this.b(cws.vz, fns.bE);
      this.b(cws.vy, fns.bE);
      this.b(cws.rZ, fns.bE);
      this.b(cws.rm, fns.bE);
      this.b(cws.vs, fns.bE);
      this.b(cws.sp, fns.bE);
      this.b(cws.ph, fns.bE);
      this.b(cws.vA, fns.bE);
      this.b(cws.vD, fns.bE);
      this.b(cws.vE, fns.bE);
      this.b(cws.vC, fns.bE);
      this.b(cws.st, fns.bE);
      this.b(cws.tb, fns.bE);
      this.b(cws.on, fns.bE);
      this.b(cws.rX, fns.bE);
      this.b(cws.rn, fns.bE);
      this.b(cws.oU, fns.bE);
      this.b(cws.sS, fns.bE);
      this.b(cws.wu, fns.bE);
      this.b(cws.xa, fns.bE);
      this.b(cws.rx, fns.bE);
      this.b(cws.rj, fns.bE);
      this.b(cws.yu, fns.bE);
      this.b(cws.wp, fns.bE);
      this.b(cws.tj, fns.bE);
      this.b(cws.oz, fns.bE);
      this.b(cws.oA, fns.bE);
      this.b(cws.pV, fns.bG);
      this.b(cws.pz, fns.bG);
      this.b(cws.pA, fns.bG);
      this.b(cws.py, fns.bG);
      this.b(cws.px, fns.bG);
      this.b(cws.pw, fns.bG);
      this.b(cws.sx, fns.bE);
      this.b(cws.wW, fns.bE);
      this.b(cws.or, fns.bE);
      this.b(cws.wt, fns.bE);
      this.b(cws.rY, fns.bE);
      this.b(cws.rp, fns.bE);
      this.b(cws.rq, fns.bE);
      this.b(cws.rr, fns.bE);
      this.b(cws.rg, fns.bE);
      this.b(cws.qb, fns.bE);
      this.b(cws.sf, fns.bE);
      this.b(cws.uW, fns.bE);
      this.b(cws.va, fns.bY);
      this.b(cws.pu, fns.bG);
      this.b(cws.pv, fns.bG);
      this.b(cws.pt, fns.bG);
      this.b(cws.ps, fns.bG);
      this.b(cws.pr, fns.bG);
      this.b(cws.uX, fns.bE);
      this.b(cws.uY, fns.bE);
      this.b(cws.sj, fns.bE);
      this.b(cws.yw, fns.bE);
      this.b(cws.yx, fns.bE);
      this.b(cws.yy, fns.bE);
      this.b(cws.yz, fns.bE);
      this.b(cws.yA, fns.bE);
      this.b(cws.yB, fns.bE);
      this.b(cws.yC, fns.bE);
      this.b(cws.yD, fns.bE);
      this.b(cws.yE, fns.bE);
      this.b(cws.yF, fns.bE);
      this.b(cws.yG, fns.bE);
      this.b(cws.yH, fns.bE);
      this.b(cws.yI, fns.bE);
      this.b(cws.yJ, fns.bE);
      this.b(cws.yK, fns.bE);
      this.b(cws.yL, fns.bE);
      this.b(cws.yM, fns.bE);
      this.b(cws.yN, fns.bE);
      this.b(cws.yO, fns.bE);
      this.b(cws.wx, cws.pV, fns.bG);
      this.b(cws.qG, cws.qF, fns.bE);
      this.a(cws.oT, des.g, "helmet", false);
      this.a(cws.qd, des.b, "helmet", true);
      this.a(cws.qe, des.b, "chestplate", true);
      this.a(cws.qf, des.b, "leggings", true);
      this.a(cws.qg, des.b, "boots", true);
      this.a(cws.qh, des.c, "helmet", false);
      this.a(cws.qi, des.c, "chestplate", false);
      this.a(cws.qj, des.c, "leggings", false);
      this.a(cws.qk, des.c, "boots", false);
      this.a(cws.ql, des.d, "helmet", false);
      this.a(cws.qm, des.d, "chestplate", false);
      this.a(cws.qn, des.d, "leggings", false);
      this.a(cws.qo, des.d, "boots", false);
      this.a(cws.qp, des.f, "helmet", false);
      this.a(cws.qq, des.f, "chestplate", false);
      this.a(cws.qr, des.f, "leggings", false);
      this.a(cws.qs, des.f, "boots", false);
      this.a(cws.qt, des.e, "helmet", false);
      this.a(cws.qu, des.e, "chestplate", false);
      this.a(cws.qv, des.e, "leggings", false);
      this.a(cws.qw, des.e, "boots", false);
      this.a(cws.qx, des.h, "helmet", false);
      this.a(cws.qy, des.h, "chestplate", false);
      this.a(cws.qz, des.h, "leggings", false);
      this.a(cws.qA, des.h, "boots", false);
      this.a(cws.vJ, -6265536);
      this.b(cws.yP, fns.bE);
      this.b(cws.yQ, fns.bE);
      this.b(cws.yR, fns.bE);
      this.b(cws.yS, fns.bE);
      this.b(cws.yT, fns.bE);
      this.b(cws.yU, fns.bE);
      this.b(cws.yV, fns.bE);
      this.b(cws.yW, fns.bE);
      this.b(cws.yX, fns.bE);
      this.b(cws.yY, fns.bE);
      this.b(cws.yZ, fns.bE);
      this.b(cws.za, fns.bE);
      this.b(cws.zb, fns.bE);
      this.b(cws.zc, fns.bE);
      this.b(cws.zd, fns.bE);
      this.b(cws.ze, fns.bE);
      this.b(cws.zf, fns.bE);
      this.b(cws.zg, fns.bE);
      this.b(cws.zh, fns.bE);
      this.b(cws.zi, fns.bE);
      this.b(cws.zj, fns.bE);
      this.b(cws.zk, fns.bE);
      this.b(cws.zl, fns.bE);
      this.b(cws.zD, fns.bE);
      this.b(cws.zE, fns.bE);
      this.b(cws.zG, fns.bE);
      this.a(cws.vu, new fmq());
      this.a(cws.sR, "_markings", new fmu());
      this.f(cws.rB);
      this.f(cws.rR);
      this.f(cws.rC);
      this.f(cws.rJ);
      this.f(cws.rK);
      this.f(cws.rF);
      this.f(cws.rN);
      this.f(cws.rL);
      this.f(cws.rG);
      this.f(cws.rQ);
      this.f(cws.rM);
      this.f(cws.rE);
      this.f(cws.rI);
      this.f(cws.rP);
      this.f(cws.rH);
      this.f(cws.rO);
      this.f(cws.rD);
      this.n(cws.rU);
      this.o(cws.wS);
      this.r(cws.oW);
      this.g(cws.pa);
      this.h(cws.wV);
      this.i(cws.ow);
      this.j(cws.yv);
      this.k(cws.rS);
      this.l(cws.xi);
      this.m(cws.ws);
      this.q(cws.wq);
      this.p(cws.ti);
      this.p(cws.wo);
      this.p(cws.wr);
      this.a(cws.tr, 11366765, 8538184);
      this.a(cws.ts, 56063, 44543);
      this.a(cws.tt, 16499171, 10890612);
      this.a(cws.tu, 4996656, 986895);
      this.a(cws.tv, 15582019, 4400155);
      this.a(cws.tw, 16167425, 16775294);
      this.a(cws.tx, 9084018, 3231003);
      this.a(cws.ty, 11506911, 9529055);
      this.a(cws.tz, 15714446, 9794134);
      this.a(cws.tA, 16565097, 13341495);
      this.a(cws.tB, 803406, 11013646);
      this.a(cws.tC, 10592673, 16711680);
      this.a(cws.tD, 12691306, 15058059);
      this.a(cws.tE, 4470310, 10592673);
      this.a(cws.tF, 894731, 0);
      this.a(cws.tG, 2243405, 16382457);
      this.a(cws.tH, 5457209, 8811878);
      this.a(cws.tI, 9433559, 7969893);
      this.a(cws.tJ, 13552826, 7632531);
      this.a(cws.tK, 1842204, 14711290);
      this.a(cws.tL, 1447446, 0);
      this.a(cws.tM, 1447446, 7237230);
      this.a(cws.tN, 9804699, 1973274);
      this.a(cws.tO, 14005919, 13396256);
      this.a(cws.tP, 13661252, 16762748);
      this.a(cws.tQ, 16382457, 12369084);
      this.a(cws.tR, 611926, 8778172);
      this.a(cws.tS, 10851452, 5589310);
      this.a(cws.tT, 5931634, 15826224);
      this.a(cws.tU, 13004373, 6251620);
      this.a(cws.tV, 12623485, 15656192);
      this.a(cws.tW, 7958625, 15125652);
      this.a(cws.tX, 14405058, 7643954);
      this.a(cws.tY, 12623485, 10051392);
      this.a(cws.tZ, 3407872, 16579584);
      this.a(cws.ua, 10489616, 12040119);
      this.a(cws.ub, 1769984, 5321501);
      this.a(cws.uc, 15720061, 5653556);
      this.a(cws.ud, 15198183, 1776418);
      this.a(cws.ue, 894731, 16711680);
      this.a(cws.uf, 4411786, 8978176);
      this.a(cws.ug, 15771042, 14377823);
      this.a(cws.uh, 10051392, 16380836);
      this.a(cws.ui, 5843472, 16380836);
      this.a(cws.uj, 5451574, 9804699);
      this.a(cws.uk, 15658718, 14014157);
      this.a(cws.ul, 16167425, 3654642);
      this.a(cws.um, 10051392, 7555121);
      this.a(cws.un, 7697520, 5984329);
      this.a(cws.uo, 10489616, 951412);
      this.a(cws.up, 15198183, 16758197);
      this.a(cws.uq, 9725844, 5060690);
      this.a(cws.ur, 7237230, 3158064);
      this.a(cws.us, 12698049, 4802889);
      this.a(cws.ut, 6842447, 15066584);
      this.a(cws.uu, 5349438, 8306542);
      this.a(cws.uv, 8855049, 2468720);
      this.a(cws.uw, 14283506, 8496292);
      this.a(cws.ux, 3419431, 11013646);
      this.a(cws.uy, 2243405, 7375001);
      this.a(cws.uz, 6387319, 14543594);
      this.a(cws.uA, 10236982, 5065037);
      this.a(cws.uB, 7164733, 1444352);
      this.a(cws.uC, 15377456, 4547222);
      this.a(cws.uD, 15690005, 16775663);
      this.a(cws.uE, 15198183, 44975);
      this.a(cws.uF, 8032420, 15265265);
      this.a(cws.uG, 5651507, 12422002);
      this.a(cws.uH, 9804699, 2580065);
      this.a(cws.uI, 4547222, 15377456);
      this.a(cws.uJ, 1001033, 3790560);
      this.a(cws.uK, 3407872, 5349438);
      this.a(cws.uL, 1315860, 5075616);
      this.a(cws.uM, 1315860, 4672845);
      this.a(cws.uN, 14144467, 13545366);
      this.a(cws.uO, 13004373, 15132390);
      this.a(cws.uP, 6250335, 16545810);
      this.a(cws.uQ, 44975, 7969893);
      this.a(cws.uR, 3232308, 9945732);
      this.a(cws.uS, 5651507, 7969893);
      this.a(cws.uT, 15373203, 5009705);
      this.a(cws.a);
      this.a(cws.yo);
      this.a(cws.yl);
      this.a(cws.ym);
      this.a(cws.yn);
      this.a(cws.ec);
      this.a(cws.eb);
      this.a(cws.ea);
      this.a(cws.yp);
      this.a(cws.sw);
      this.a(cws.rW);
      this.a(cws.pY);
      this.a(cws.vK);
   }

   static record a(String a, aku<dew> b, Map<aku<der>, String> c) {

      public String a(aku<der> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
