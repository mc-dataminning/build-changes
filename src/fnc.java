import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fnc {
   private static final fmu a = fnq.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fnc.a> f = List.of(
      new fnc.a("quartz", dez.a, Map.of()),
      new fnc.a("iron", dez.b, Map.of(deu.d, "iron_darker")),
      new fnc.a("netherite", dez.c, Map.of(deu.h, "netherite_darker")),
      new fnc.a("redstone", dez.d, Map.of()),
      new fnc.a("copper", dez.e, Map.of()),
      new fnc.a("gold", dez.f, Map.of(deu.e, "gold_darker")),
      new fnc.a("emerald", dez.g, Map.of()),
      new fnc.a("diamond", dez.h, Map.of(deu.f, "diamond_darker")),
      new fnc.a("lapis", dez.i, Map.of()),
      new fnc.a("amethyst", dez.j, Map.of()),
      new fnc.a("resin", dez.k, Map.of())
   );
   private final fnd g;
   private final BiConsumer<akv, fnr> h;

   public fnc(fnd $$0, BiConsumer<akv, fnr> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cwm $$0) {
      this.g.a($$0, fnq.a(fns.a($$0)));
   }

   private akv a(cwm $$0, fnt $$1) {
      return $$1.a(fns.a($$0), fnv.b($$0), this.h);
   }

   private void b(cwm $$0, fnt $$1) {
      this.g.a($$0, fnq.a(this.a($$0, $$1)));
   }

   private akv a(cwm $$0, String $$1, fnt $$2) {
      return $$2.a(fns.a($$0, $$1), fnv.k(fnv.a($$0, $$1)), this.h);
   }

   private akv a(cwm $$0, cwm $$1, fnt $$2) {
      return $$2.a(fns.a($$0), fnv.b($$1), this.h);
   }

   private void b(cwm $$0, cwm $$1, fnt $$2) {
      this.g.a($$0, fnq.a(this.a($$0, $$1, $$2)));
   }

   private void a(cwm $$0, fmu $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cwm $$0, String $$1, fmu $$2) {
      akv $$3 = this.a($$0, fnv.c($$0), fnv.a($$0, $$1));
      this.g.a($$0, fnq.a($$3, a, $$2));
   }

   private List<hbr.a> b(cwm $$0) {
      List<hbr.a> $$1 = new ArrayList<>();
      hbm.b $$2 = fnq.a(this.a($$0, "_16", fnu.bE));
      $$1.add(fnq.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayz.b($$3 - 16, 32);
         hbm.b $$5 = fnq.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fnu.bE));
         $$1.add(fnq.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fnq.a($$2, 31.5F));
      return $$1;
   }

   private void c(cwm $$0) {
      List<hbr.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fnq.a(
               fnq.a(kv.ad),
               fnq.a(new hcl(true, hcm.a.b), 32.0F, $$1),
               fnq.a(fnq.a(new hcl(true, hcm.a.c), 32.0F, $$1), fnq.a(new hcl(true, hcm.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cwm $$0) {
      this.g.a($$0, fnq.a(new hcl(true, hcm.a.d), 32.0F, this.b($$0)));
   }

   private void e(cwm $$0) {
      List<hbr.a> $$1 = new ArrayList<>();
      hbm.b $$2 = fnq.a(this.a($$0, "_00", fnu.bE));
      $$1.add(fnq.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hbm.b $$4 = fnq.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fnu.bE));
         $$1.add(fnq.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fnq.a($$2, 63.5F));
      this.g.a($$0, fnq.a(fnq.a(new hcv(true, hcv.a.b), 64.0F, $$1), fnq.a(new hcv(true, hcv.a.a), 64.0F, $$1)));
   }

   private akv a(cwm $$0, akv $$1, akv $$2) {
      return fnu.bI.a($$0, fnv.c($$1, $$2), this.h);
   }

   private akv a(akv $$0, akv $$1, akv $$2) {
      return fnu.bI.a($$0, fnv.c($$1, $$2), this.h);
   }

   private void a(akv $$0, akv $$1, akv $$2, akv $$3) {
      fnu.bJ.a($$0, fnv.a($$1, $$2, $$3), this.h);
   }

   private void a(cwm $$0, aku<det> $$1, String $$2, boolean $$3) {
      akv $$4 = fns.a($$0);
      akv $$5 = fnv.c($$0);
      akv $$6 = fnv.a($$0, "_overlay");
      List<hbs.a<aku<dey>>> $$7 = new ArrayList<>(f.size());

      for (fnc.a $$8 : f) {
         akv $$9 = $$4.g("_" + $$8.a() + "_trim");
         akv $$10 = akv.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hbm.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fnq.a($$9, new fmr(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fnq.a($$9);
         }

         $$7.add(fnq.a($$8.b, $$11));
      }

      hbm.b $$13;
      if ($$3) {
         fnu.bI.a($$4, fnv.c($$5, $$6), this.h);
         $$13 = fnq.a($$4, new fmr(-6265536));
      } else {
         fnu.bE.a($$4, fnv.k($$5), this.h);
         $$13 = fnq.a($$4);
      }

      this.g.a($$0, fnq.a(new hdk(), $$13, $$7));
   }

   private void f(cwm $$0) {
      hbm.b $$1 = fnq.a(this.a($$0, fnu.bE));
      akv $$2 = this.a($$0, fnu.bO, "_open_back");
      akv $$3 = this.a($$0, fnu.bN, "_open_front");
      hbm.b $$4 = fnq.a(fnq.a($$2), new hbh.a(), fnq.a($$3));
      hbm.b $$5 = fnq.a(new hbw(), $$4, $$1);
      this.g.a($$0, fnq.a(new hde(), $$1, fnq.a(cwo.g, $$5)));
   }

   private akv a(cwm $$0, fnt $$1, String $$2) {
      akv $$3 = fnv.a($$0, $$2);
      return $$1.a($$0, fnv.k($$3), this.h);
   }

   private void g(cwm $$0) {
      hbm.b $$1 = fnq.a(fns.a($$0));
      hbm.b $$2 = fnq.a(this.a($$0, "_pulling_0", fnu.bP));
      hbm.b $$3 = fnq.a(this.a($$0, "_pulling_1", fnu.bP));
      hbm.b $$4 = fnq.a(this.a($$0, "_pulling_2", fnu.bP));
      this.g.a($$0, fnq.a(fnq.a(), fnq.a(new hcx(false), 0.05F, $$2, fnq.a($$3, 0.65F), fnq.a($$4, 0.9F)), $$1));
   }

   private void h(cwm $$0) {
      hbm.b $$1 = fnq.a(fns.a($$0));
      hbm.b $$2 = fnq.a(this.a($$0, "_pulling_0", fnu.bQ));
      hbm.b $$3 = fnq.a(this.a($$0, "_pulling_1", fnu.bQ));
      hbm.b $$4 = fnq.a(this.a($$0, "_pulling_2", fnu.bQ));
      hbm.b $$5 = fnq.a(this.a($$0, "_arrow", fnu.bQ));
      hbm.b $$6 = fnq.a(this.a($$0, "_firework", fnu.bQ));
      this.g
         .a($$0, fnq.a(fnq.a(), fnq.a(new hcp(), $$2, fnq.a($$3, 0.58F), fnq.a($$4, 1.0F)), fnq.a(new hda(), $$1, fnq.a(cvh.a.b, $$5), fnq.a(cvh.a.c, $$6))));
   }

   private void a(cwm $$0, hby $$1, hbm.b $$2, hbm.b $$3) {
      this.g.a($$0, fnq.a($$1, $$2, $$3));
   }

   private void i(cwm $$0) {
      hbm.b $$1 = fnq.a(this.a($$0, fnu.bE));
      hbm.b $$2 = fnq.a(this.a($$0, "_broken", fnu.bE));
      this.a($$0, new hbv(), $$2, $$1);
   }

   private void j(cwm $$0) {
      hbm.b $$1 = fnq.a(fns.a($$0));
      hbm.b $$2 = fnq.a(fns.a($$0, "_brushing_0"));
      hbm.b $$3 = fnq.a(fns.a($$0, "_brushing_1"));
      hbm.b $$4 = fnq.a(fns.a($$0, "_brushing_2"));
      this.g.a($$0, fnq.a(new hcw(10.0F), 0.1F, $$1, fnq.a($$2, 0.25F), fnq.a($$3, 0.5F), fnq.a($$4, 0.75F)));
   }

   private void k(cwm $$0) {
      hbm.b $$1 = fnq.a(this.a($$0, fnu.bH));
      hbm.b $$2 = fnq.a(this.a($$0, "_cast", fnu.bH));
      this.a($$0, new hcc(), $$2, $$1);
   }

   private void l(cwm $$0) {
      hbm.b $$1 = fnq.a(fns.a($$0));
      hbm.b $$2 = fnq.a(fns.b("tooting_goat_horn"));
      this.a($$0, fnq.a(), $$2, $$1);
   }

   private void m(cwm $$0) {
      hbm.b $$1 = fnq.a(fns.a($$0), new hdu.a());
      hbm.b $$2 = fnq.a(fns.a($$0, "_blocking"), new hdu.a());
      this.a($$0, fnq.a(), $$2, $$1);
   }

   private static hbm.b a(hbm.b $$0, hbm.b $$1) {
      return fnq.a(new hde(), $$1, fnq.a(List.of(cwo.g, cwo.h, cwo.i), $$0));
   }

   private void n(cwm $$0) {
      hbm.b $$1 = fnq.a(this.a($$0, fnu.bE));
      hbm.b $$2 = fnq.a(fns.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cwm $$0) {
      hbm.b $$1 = fnq.a(this.a($$0, fnu.bE));
      hbm.b $$2 = fnq.a(fns.a($$0, "_in_hand"), new hea.a());
      hbm.b $$3 = fnq.a(fns.a($$0, "_throwing"), new hea.a());
      hbm.b $$4 = fnq.a(fnq.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cwm $$0, akv $$1) {
      this.g.a($$0, fnq.a($$1, new fmx()));
   }

   private void p(cwm $$0) {
      akv $$1 = this.a($$0, fns.b("potion_overlay"), fns.a($$0));
      this.a($$0, $$1);
   }

   private void q(cwm $$0) {
      akv $$1 = this.a($$0, fns.a($$0, "_head"), fns.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cwm $$0, int $$1) {
      akv $$2 = this.a($$0, fnu.bE);
      this.g.a($$0, fnq.a($$2, new fmr($$1)));
   }

   private void a(cwm $$0, int $$1, int $$2) {
      akv $$3 = fns.b("template_spawn_egg");
      this.g.a($$0, fnq.a($$3, fnq.a($$1), fnq.a($$2)));
   }

   private void r(cwm $$0) {
      akv $$1 = fnv.c($$0);
      akv $$2 = fnv.a($$0, "_overlay");
      akv $$3 = fnu.bE.a($$0, fnv.k($$1), this.h);
      akv $$4 = fns.a($$0, "_dyed");
      fnu.bI.a($$4, fnv.c($$1, $$2), this.h);
      this.g.a($$0, fnq.a(fnq.a(kv.J), fnq.a($$4, a, new fmr(0)), fnq.a($$3)));
   }

   public void a() {
      this.b(cwu.oF, fnu.bE);
      this.b(cwu.oH, fnu.bE);
      this.b(cwu.oG, fnu.bE);
      this.b(cwu.oI, fnu.bE);
      this.b(cwu.pi, fnu.bE);
      this.b(cwu.oZ, fnu.bE);
      this.b(cwu.oV, fnu.bE);
      this.b(cwu.vF, fnu.bE);
      this.b(cwu.pb, fnu.bE);
      this.b(cwu.vg, fnu.bE);
      this.b(cwu.ed, fnu.bG);
      this.b(cwu.sX, fnu.bE);
      this.b(cwu.wk, fnu.bE);
      this.b(cwu.wm, fnu.bE);
      this.b(cwu.oB, fnu.bE);
      this.b(cwu.oC, fnu.bE);
      this.b(cwu.su, fnu.bE);
      this.b(cwu.tl, fnu.bE);
      this.b(cwu.td, fnu.bG);
      this.b(cwu.sq, fnu.bE);
      this.b(cwu.sv, fnu.bE);
      this.b(cwu.xh, fnu.bE);
      this.b(cwu.rw, fnu.bE);
      this.b(cwu.oY, fnu.bE);
      this.b(cwu.qc, fnu.bE);
      this.b(cwu.rs, fnu.bE);
      this.b(cwu.uZ, fnu.bG);
      this.b(cwu.sr, fnu.bE);
      this.b(cwu.rf, fnu.bE);
      this.b(cwu.ot, fnu.bH);
      this.b(cwu.ou, fnu.bH);
      this.b(cwu.pd, fnu.bE);
      this.b(cwu.op, fnu.bE);
      this.b(cwu.sZ, fnu.bE);
      this.b(cwu.wg, fnu.bE);
      this.b(cwu.rt, fnu.bE);
      this.e(cwu.rT);
      this.b(cwu.pc, fnu.bE);
      this.b(cwu.ro, fnu.bE);
      this.b(cwu.vM, fnu.bE);
      this.c(cwu.rz);
      this.d(cwu.rA);
      this.b(cwu.sY, fnu.bE);
      this.b(cwu.ta, fnu.bE);
      this.b(cwu.sa, fnu.bE);
      this.b(cwu.vO, fnu.bE);
      this.b(cwu.qD, fnu.bE);
      this.b(cwu.vB, fnu.bE);
      this.b(cwu.sb, fnu.bE);
      this.b(cwu.sP, fnu.bE);
      this.b(cwu.pl, fnu.bE);
      this.b(cwu.pm, fnu.bE);
      this.b(cwu.wZ, fnu.bE);
      this.b(cwu.so, fnu.bE);
      this.b(cwu.oJ, fnu.bE);
      this.b(cwu.oK, fnu.bE);
      this.b(cwu.pe, fnu.bE);
      this.b(cwu.pO, fnu.bG);
      this.b(cwu.pP, fnu.bG);
      this.b(cwu.vI, fnu.bE);
      this.b(cwu.pN, fnu.bG);
      this.b(cwu.pM, fnu.bG);
      this.b(cwu.pL, fnu.bG);
      this.b(cwu.wn, fnu.bE);
      this.b(cwu.sU, fnu.bE);
      this.b(cwu.ry, fnu.bE);
      this.b(cwu.pf, fnu.bE);
      this.b(cwu.vv, fnu.bE);
      this.b(cwu.tp, fnu.bE);
      this.b(cwu.tc, fnu.bE);
      this.b(cwu.wf, fnu.bE);
      this.b(cwu.uU, fnu.bE);
      this.b(cwu.tk, fnu.bE);
      this.b(cwu.xg, fnu.bE);
      this.b(cwu.vt, fnu.bE);
      this.b(cwu.uV, fnu.bE);
      this.b(cwu.qB, fnu.bE);
      this.b(cwu.oX, fnu.bE);
      this.b(cwu.xe, fnu.bE);
      this.b(cwu.wY, fnu.bE);
      this.b(cwu.oq, fnu.bE);
      this.b(cwu.te, fnu.bE);
      this.b(cwu.th, fnu.bE);
      this.b(cwu.tq, fnu.bE);
      this.b(cwu.xc, fnu.bE);
      this.b(cwu.xw, fnu.bE);
      this.b(cwu.rV, fnu.bE);
      this.b(cwu.sd, fnu.bE);
      this.b(cwu.vc, fnu.bE);
      this.b(cwu.pn, fnu.bE);
      this.b(cwu.qF, fnu.bE);
      this.b(cwu.pE, fnu.bG);
      this.b(cwu.vj, fnu.bE);
      this.b(cwu.pF, fnu.bG);
      this.b(cwu.vH, fnu.bE);
      this.b(cwu.pD, fnu.bG);
      this.b(cwu.pC, fnu.bG);
      this.b(cwu.pB, fnu.bG);
      this.b(cwu.po, fnu.bE);
      this.b(cwu.tf, fnu.bE);
      this.b(cwu.sm, fnu.bE);
      this.b(cwu.ss, fnu.bE);
      this.b(cwu.pZ, fnu.bE);
      this.b(cwu.xf, fnu.bE);
      this.b(cwu.wU, fnu.bE);
      this.b(cwu.xA, fnu.bE);
      this.b(cwu.xD, fnu.bE);
      this.b(cwu.os, fnu.bE);
      this.b(cwu.sc, fnu.bE);
      this.b(cwu.pj, fnu.bE);
      this.b(cwu.pJ, fnu.bG);
      this.b(cwu.pK, fnu.bG);
      this.b(cwu.vG, fnu.bE);
      this.b(cwu.pk, fnu.bE);
      this.b(cwu.wv, fnu.bE);
      this.b(cwu.pI, fnu.bG);
      this.b(cwu.pH, fnu.bG);
      this.b(cwu.pG, fnu.bG);
      this.b(cwu.vb, fnu.bE);
      this.b(cwu.oD, fnu.bE);
      this.b(cwu.oE, fnu.bE);
      this.b(cwu.ww, fnu.bE);
      this.b(cwu.pg, fnu.bE);
      this.b(cwu.rh, fnu.bE);
      this.b(cwu.rk, fnu.bE);
      this.b(cwu.si, fnu.bE);
      this.b(cwu.sn, fnu.bE);
      this.b(cwu.sk, fnu.bE);
      this.b(cwu.sh, fnu.bE);
      this.b(cwu.tm, fnu.bE);
      this.b(cwu.oN, fnu.bE);
      this.b(cwu.oO, fnu.bE);
      this.b(cwu.oP, fnu.bE);
      this.b(cwu.oQ, fnu.bE);
      this.b(cwu.vi, fnu.bE);
      this.b(cwu.sT, fnu.bE);
      this.b(cwu.rl, fnu.bE);
      this.b(cwu.oo, fnu.bE);
      this.b(cwu.xb, fnu.bE);
      this.b(cwu.pW, fnu.bE);
      this.b(cwu.wR, fnu.bE);
      this.b(cwu.wK, fnu.bF);
      this.b(cwu.wy, fnu.bF);
      this.b(cwu.wA, fnu.bF);
      this.b(cwu.wz, fnu.bF);
      this.b(cwu.wB, fnu.bF);
      this.b(cwu.wC, fnu.bF);
      this.b(cwu.wD, fnu.bF);
      this.b(cwu.wE, fnu.bF);
      this.b(cwu.wF, fnu.bF);
      this.b(cwu.wG, fnu.bF);
      this.b(cwu.wP, fnu.bF);
      this.b(cwu.wQ, fnu.bF);
      this.b(cwu.wH, fnu.bF);
      this.b(cwu.wI, fnu.bF);
      this.b(cwu.wL, fnu.bF);
      this.b(cwu.wJ, fnu.bF);
      this.b(cwu.wM, fnu.bF);
      this.b(cwu.wN, fnu.bF);
      this.b(cwu.wO, fnu.bF);
      this.b(cwu.vN, fnu.bE);
      this.b(cwu.vL, fnu.bE);
      this.b(cwu.wT, fnu.bE);
      this.b(cwu.pT, fnu.bG);
      this.b(cwu.pU, fnu.bG);
      this.b(cwu.pp, fnu.bE);
      this.b(cwu.pS, fnu.bG);
      this.b(cwu.pq, fnu.bE);
      this.b(cwu.pR, fnu.bG);
      this.b(cwu.pQ, fnu.bG);
      this.b(cwu.vw, fnu.bE);
      this.b(cwu.vx, fnu.bE);
      this.b(cwu.vr, fnu.bE);
      this.b(cwu.ox, fnu.bE);
      this.b(cwu.oy, fnu.bE);
      this.b(cwu.sg, fnu.bE);
      this.b(cwu.qE, fnu.bE);
      this.b(cwu.oL, fnu.bE);
      this.b(cwu.oM, fnu.bE);
      this.b(cwu.rv, fnu.bE);
      this.b(cwu.ov, fnu.bE);
      this.b(cwu.xd, fnu.bE);
      this.b(cwu.sl, fnu.bE);
      this.b(cwu.vh, fnu.bE);
      this.b(cwu.wh, fnu.bE);
      this.b(cwu.qC, fnu.bE);
      this.b(cwu.ri, fnu.bE);
      this.b(cwu.vz, fnu.bE);
      this.b(cwu.vy, fnu.bE);
      this.b(cwu.rZ, fnu.bE);
      this.b(cwu.rm, fnu.bE);
      this.b(cwu.vs, fnu.bE);
      this.b(cwu.sp, fnu.bE);
      this.b(cwu.ph, fnu.bE);
      this.b(cwu.vA, fnu.bE);
      this.b(cwu.vD, fnu.bE);
      this.b(cwu.vE, fnu.bE);
      this.b(cwu.vC, fnu.bE);
      this.b(cwu.st, fnu.bE);
      this.b(cwu.tb, fnu.bE);
      this.b(cwu.on, fnu.bE);
      this.b(cwu.rX, fnu.bE);
      this.b(cwu.rn, fnu.bE);
      this.b(cwu.oU, fnu.bE);
      this.b(cwu.sS, fnu.bE);
      this.b(cwu.wu, fnu.bE);
      this.b(cwu.xa, fnu.bE);
      this.b(cwu.rx, fnu.bE);
      this.b(cwu.rj, fnu.bE);
      this.b(cwu.yu, fnu.bE);
      this.b(cwu.wp, fnu.bE);
      this.b(cwu.tj, fnu.bE);
      this.b(cwu.oz, fnu.bE);
      this.b(cwu.oA, fnu.bE);
      this.b(cwu.pV, fnu.bG);
      this.b(cwu.pz, fnu.bG);
      this.b(cwu.pA, fnu.bG);
      this.b(cwu.py, fnu.bG);
      this.b(cwu.px, fnu.bG);
      this.b(cwu.pw, fnu.bG);
      this.b(cwu.sx, fnu.bE);
      this.b(cwu.wW, fnu.bE);
      this.b(cwu.or, fnu.bE);
      this.b(cwu.wt, fnu.bE);
      this.b(cwu.rY, fnu.bE);
      this.b(cwu.rp, fnu.bE);
      this.b(cwu.rq, fnu.bE);
      this.b(cwu.rr, fnu.bE);
      this.b(cwu.rg, fnu.bE);
      this.b(cwu.qb, fnu.bE);
      this.b(cwu.sf, fnu.bE);
      this.b(cwu.uW, fnu.bE);
      this.b(cwu.va, fnu.bY);
      this.b(cwu.pu, fnu.bG);
      this.b(cwu.pv, fnu.bG);
      this.b(cwu.pt, fnu.bG);
      this.b(cwu.ps, fnu.bG);
      this.b(cwu.pr, fnu.bG);
      this.b(cwu.uX, fnu.bE);
      this.b(cwu.uY, fnu.bE);
      this.b(cwu.sj, fnu.bE);
      this.b(cwu.yw, fnu.bE);
      this.b(cwu.yx, fnu.bE);
      this.b(cwu.yy, fnu.bE);
      this.b(cwu.yz, fnu.bE);
      this.b(cwu.yA, fnu.bE);
      this.b(cwu.yB, fnu.bE);
      this.b(cwu.yC, fnu.bE);
      this.b(cwu.yD, fnu.bE);
      this.b(cwu.yE, fnu.bE);
      this.b(cwu.yF, fnu.bE);
      this.b(cwu.yG, fnu.bE);
      this.b(cwu.yH, fnu.bE);
      this.b(cwu.yI, fnu.bE);
      this.b(cwu.yJ, fnu.bE);
      this.b(cwu.yK, fnu.bE);
      this.b(cwu.yL, fnu.bE);
      this.b(cwu.yM, fnu.bE);
      this.b(cwu.yN, fnu.bE);
      this.b(cwu.yO, fnu.bE);
      this.b(cwu.wx, cwu.pV, fnu.bG);
      this.b(cwu.qG, cwu.qF, fnu.bE);
      this.a(cwu.oT, deu.g, "helmet", false);
      this.a(cwu.qd, deu.b, "helmet", true);
      this.a(cwu.qe, deu.b, "chestplate", true);
      this.a(cwu.qf, deu.b, "leggings", true);
      this.a(cwu.qg, deu.b, "boots", true);
      this.a(cwu.qh, deu.c, "helmet", false);
      this.a(cwu.qi, deu.c, "chestplate", false);
      this.a(cwu.qj, deu.c, "leggings", false);
      this.a(cwu.qk, deu.c, "boots", false);
      this.a(cwu.ql, deu.d, "helmet", false);
      this.a(cwu.qm, deu.d, "chestplate", false);
      this.a(cwu.qn, deu.d, "leggings", false);
      this.a(cwu.qo, deu.d, "boots", false);
      this.a(cwu.qp, deu.f, "helmet", false);
      this.a(cwu.qq, deu.f, "chestplate", false);
      this.a(cwu.qr, deu.f, "leggings", false);
      this.a(cwu.qs, deu.f, "boots", false);
      this.a(cwu.qt, deu.e, "helmet", false);
      this.a(cwu.qu, deu.e, "chestplate", false);
      this.a(cwu.qv, deu.e, "leggings", false);
      this.a(cwu.qw, deu.e, "boots", false);
      this.a(cwu.qx, deu.h, "helmet", false);
      this.a(cwu.qy, deu.h, "chestplate", false);
      this.a(cwu.qz, deu.h, "leggings", false);
      this.a(cwu.qA, deu.h, "boots", false);
      this.a(cwu.vJ, -6265536);
      this.b(cwu.yP, fnu.bE);
      this.b(cwu.yQ, fnu.bE);
      this.b(cwu.yR, fnu.bE);
      this.b(cwu.yS, fnu.bE);
      this.b(cwu.yT, fnu.bE);
      this.b(cwu.yU, fnu.bE);
      this.b(cwu.yV, fnu.bE);
      this.b(cwu.yW, fnu.bE);
      this.b(cwu.yX, fnu.bE);
      this.b(cwu.yY, fnu.bE);
      this.b(cwu.yZ, fnu.bE);
      this.b(cwu.za, fnu.bE);
      this.b(cwu.zb, fnu.bE);
      this.b(cwu.zc, fnu.bE);
      this.b(cwu.zd, fnu.bE);
      this.b(cwu.ze, fnu.bE);
      this.b(cwu.zf, fnu.bE);
      this.b(cwu.zg, fnu.bE);
      this.b(cwu.zh, fnu.bE);
      this.b(cwu.zi, fnu.bE);
      this.b(cwu.zj, fnu.bE);
      this.b(cwu.zk, fnu.bE);
      this.b(cwu.zl, fnu.bE);
      this.b(cwu.zD, fnu.bE);
      this.b(cwu.zE, fnu.bE);
      this.b(cwu.zG, fnu.bE);
      this.a(cwu.vu, new fms());
      this.a(cwu.sR, "_markings", new fmw());
      this.f(cwu.rB);
      this.f(cwu.rR);
      this.f(cwu.rC);
      this.f(cwu.rJ);
      this.f(cwu.rK);
      this.f(cwu.rF);
      this.f(cwu.rN);
      this.f(cwu.rL);
      this.f(cwu.rG);
      this.f(cwu.rQ);
      this.f(cwu.rM);
      this.f(cwu.rE);
      this.f(cwu.rI);
      this.f(cwu.rP);
      this.f(cwu.rH);
      this.f(cwu.rO);
      this.f(cwu.rD);
      this.n(cwu.rU);
      this.o(cwu.wS);
      this.r(cwu.oW);
      this.g(cwu.pa);
      this.h(cwu.wV);
      this.i(cwu.ow);
      this.j(cwu.yv);
      this.k(cwu.rS);
      this.l(cwu.xi);
      this.m(cwu.ws);
      this.q(cwu.wq);
      this.p(cwu.ti);
      this.p(cwu.wo);
      this.p(cwu.wr);
      this.a(cwu.tr, 11366765, 8538184);
      this.a(cwu.ts, 56063, 44543);
      this.a(cwu.tt, 16499171, 10890612);
      this.a(cwu.tu, 4996656, 986895);
      this.a(cwu.tv, 15582019, 4400155);
      this.a(cwu.tw, 16167425, 16775294);
      this.a(cwu.tx, 9084018, 3231003);
      this.a(cwu.ty, 11506911, 9529055);
      this.a(cwu.tz, 15714446, 9794134);
      this.a(cwu.tA, 16565097, 13341495);
      this.a(cwu.tB, 803406, 11013646);
      this.a(cwu.tC, 10592673, 16711680);
      this.a(cwu.tD, 12691306, 15058059);
      this.a(cwu.tE, 4470310, 10592673);
      this.a(cwu.tF, 894731, 0);
      this.a(cwu.tG, 2243405, 16382457);
      this.a(cwu.tH, 5457209, 8811878);
      this.a(cwu.tI, 9433559, 7969893);
      this.a(cwu.tJ, 13552826, 7632531);
      this.a(cwu.tK, 1842204, 14711290);
      this.a(cwu.tL, 1447446, 0);
      this.a(cwu.tM, 1447446, 7237230);
      this.a(cwu.tN, 9804699, 1973274);
      this.a(cwu.tO, 14005919, 13396256);
      this.a(cwu.tP, 13661252, 16762748);
      this.a(cwu.tQ, 16382457, 12369084);
      this.a(cwu.tR, 611926, 8778172);
      this.a(cwu.tS, 10851452, 5589310);
      this.a(cwu.tT, 5931634, 15826224);
      this.a(cwu.tU, 13004373, 6251620);
      this.a(cwu.tV, 12623485, 15656192);
      this.a(cwu.tW, 7958625, 15125652);
      this.a(cwu.tX, 14405058, 7643954);
      this.a(cwu.tY, 12623485, 10051392);
      this.a(cwu.tZ, 3407872, 16579584);
      this.a(cwu.ua, 10489616, 12040119);
      this.a(cwu.ub, 1769984, 5321501);
      this.a(cwu.uc, 15720061, 5653556);
      this.a(cwu.ud, 15198183, 1776418);
      this.a(cwu.ue, 894731, 16711680);
      this.a(cwu.uf, 4411786, 8978176);
      this.a(cwu.ug, 15771042, 14377823);
      this.a(cwu.uh, 10051392, 16380836);
      this.a(cwu.ui, 5843472, 16380836);
      this.a(cwu.uj, 5451574, 9804699);
      this.a(cwu.uk, 15658718, 14014157);
      this.a(cwu.ul, 16167425, 3654642);
      this.a(cwu.um, 10051392, 7555121);
      this.a(cwu.un, 7697520, 5984329);
      this.a(cwu.uo, 10489616, 951412);
      this.a(cwu.up, 15198183, 16758197);
      this.a(cwu.uq, 9725844, 5060690);
      this.a(cwu.ur, 7237230, 3158064);
      this.a(cwu.us, 12698049, 4802889);
      this.a(cwu.ut, 6842447, 15066584);
      this.a(cwu.uu, 5349438, 8306542);
      this.a(cwu.uv, 8855049, 2468720);
      this.a(cwu.uw, 14283506, 8496292);
      this.a(cwu.ux, 3419431, 11013646);
      this.a(cwu.uy, 2243405, 7375001);
      this.a(cwu.uz, 6387319, 14543594);
      this.a(cwu.uA, 10236982, 5065037);
      this.a(cwu.uB, 7164733, 1444352);
      this.a(cwu.uC, 15377456, 4547222);
      this.a(cwu.uD, 15690005, 16775663);
      this.a(cwu.uE, 15198183, 44975);
      this.a(cwu.uF, 8032420, 15265265);
      this.a(cwu.uG, 5651507, 12422002);
      this.a(cwu.uH, 9804699, 2580065);
      this.a(cwu.uI, 4547222, 15377456);
      this.a(cwu.uJ, 1001033, 3790560);
      this.a(cwu.uK, 3407872, 5349438);
      this.a(cwu.uL, 1315860, 5075616);
      this.a(cwu.uM, 1315860, 4672845);
      this.a(cwu.uN, 14144467, 13545366);
      this.a(cwu.uO, 13004373, 15132390);
      this.a(cwu.uP, 6250335, 16545810);
      this.a(cwu.uQ, 44975, 7969893);
      this.a(cwu.uR, 3232308, 9945732);
      this.a(cwu.uS, 5651507, 7969893);
      this.a(cwu.uT, 15373203, 5009705);
      this.a(cwu.a);
      this.a(cwu.yo);
      this.a(cwu.yl);
      this.a(cwu.ym);
      this.a(cwu.yn);
      this.a(cwu.ec);
      this.a(cwu.eb);
      this.a(cwu.ea);
      this.a(cwu.yp);
      this.a(cwu.sw);
      this.a(cwu.rW);
      this.a(cwu.pY);
      this.a(cwu.vK);
   }

   static record a(String a, aku<dey> b, Map<aku<det>, String> c) {

      public String a(aku<det> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
