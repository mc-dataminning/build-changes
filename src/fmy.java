import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fmy {
   private static final fmr a = fnm.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fmy.a> f = List.of(
      new fmy.a("quartz", dew.a, Map.of()),
      new fmy.a("iron", dew.b, Map.of(der.d, "iron_darker")),
      new fmy.a("netherite", dew.c, Map.of(der.h, "netherite_darker")),
      new fmy.a("redstone", dew.d, Map.of()),
      new fmy.a("copper", dew.e, Map.of()),
      new fmy.a("gold", dew.f, Map.of(der.e, "gold_darker")),
      new fmy.a("emerald", dew.g, Map.of()),
      new fmy.a("diamond", dew.h, Map.of(der.f, "diamond_darker")),
      new fmy.a("lapis", dew.i, Map.of()),
      new fmy.a("amethyst", dew.j, Map.of()),
      new fmy.a("resin", dew.k, Map.of())
   );
   private final fmz g;
   private final BiConsumer<aku, fnn> h;

   public fmy(fmz $$0, BiConsumer<aku, fnn> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cwj $$0) {
      this.g.a($$0, fnm.a(fno.a($$0)));
   }

   private aku a(cwj $$0, fnp $$1) {
      return $$1.a(fno.a($$0), fnr.b($$0), this.h);
   }

   private void b(cwj $$0, fnp $$1) {
      this.g.a($$0, fnm.a(this.a($$0, $$1)));
   }

   private aku a(cwj $$0, String $$1, fnp $$2) {
      return $$2.a(fno.a($$0, $$1), fnr.k(fnr.a($$0, $$1)), this.h);
   }

   private aku a(cwj $$0, cwj $$1, fnp $$2) {
      return $$2.a(fno.a($$0), fnr.b($$1), this.h);
   }

   private void b(cwj $$0, cwj $$1, fnp $$2) {
      this.g.a($$0, fnm.a(this.a($$0, $$1, $$2)));
   }

   private void a(cwj $$0, fmr $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cwj $$0, String $$1, fmr $$2) {
      aku $$3 = this.a($$0, fnr.c($$0), fnr.a($$0, $$1));
      this.g.a($$0, fnm.a($$3, a, $$2));
   }

   private List<hbm.a> b(cwj $$0) {
      List<hbm.a> $$1 = new ArrayList<>();
      hbh.b $$2 = fnm.a(this.a($$0, "_16", fnq.bE));
      $$1.add(fnm.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayy.b($$3 - 16, 32);
         hbh.b $$5 = fnm.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fnq.bE));
         $$1.add(fnm.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fnm.a($$2, 31.5F));
      return $$1;
   }

   private void c(cwj $$0) {
      List<hbm.a> $$1 = this.b($$0);
      this.g.a($$0, fnm.a(fnm.a(kv.ad), fnm.a(new hcf(true, hcg.a.a), 32.0F, $$1), fnm.a(new hcf(true, hcg.a.b), 32.0F, $$1)));
   }

   private void d(cwj $$0) {
      this.g.a($$0, fnm.a(new hcf(true, hcg.a.c), 32.0F, this.b($$0)));
   }

   private void e(cwj $$0) {
      List<hbm.a> $$1 = new ArrayList<>();
      hbh.b $$2 = fnm.a(this.a($$0, "_00", fnq.bE));
      $$1.add(fnm.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hbh.b $$4 = fnm.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fnq.bE));
         $$1.add(fnm.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fnm.a($$2, 63.5F));
      this.g.a($$0, fnm.a(new hcp(true, true), 64.0F, $$1));
   }

   private aku a(cwj $$0, aku $$1, aku $$2) {
      return fnq.bI.a($$0, fnr.c($$1, $$2), this.h);
   }

   private aku a(aku $$0, aku $$1, aku $$2) {
      return fnq.bI.a($$0, fnr.c($$1, $$2), this.h);
   }

   private void a(aku $$0, aku $$1, aku $$2, aku $$3) {
      fnq.bJ.a($$0, fnr.a($$1, $$2, $$3), this.h);
   }

   private void a(cwj $$0, akt<deq> $$1, String $$2, boolean $$3) {
      aku $$4 = fno.a($$0);
      aku $$5 = fnr.c($$0);
      aku $$6 = fnr.a($$0, "_overlay");
      List<hbn.a<akt<dev>>> $$7 = new ArrayList<>(f.size());

      for (fmy.a $$8 : f) {
         aku $$9 = $$4.g("_" + $$8.a() + "_trim");
         aku $$10 = aku.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hbh.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fnm.a($$9, new fmo(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fnm.a($$9);
         }

         $$7.add(fnm.a($$8.b, $$11));
      }

      hbh.b $$13;
      if ($$3) {
         fnq.bI.a($$4, fnr.c($$5, $$6), this.h);
         $$13 = fnm.a($$4, new fmo(-6265536));
      } else {
         fnq.bE.a($$4, fnr.k($$5), this.h);
         $$13 = fnm.a($$4);
      }

      this.g.a($$0, fnm.a(new hdd(), $$13, $$7));
   }

   private void f(cwj $$0) {
      hbh.b $$1 = fnm.a(this.a($$0, fnq.bE));
      aku $$2 = this.a($$0, fnq.bO, "_open_back");
      aku $$3 = this.a($$0, fnq.bN, "_open_front");
      hbh.b $$4 = fnm.a(fnm.a($$2), new hbd.a(), fnm.a($$3));
      hbh.b $$5 = fnm.a(new hbr(), $$4, $$1);
      this.g.a($$0, fnm.a(new hcw(), $$1, fnm.a(cwl.g, $$5)));
   }

   private aku a(cwj $$0, fnp $$1, String $$2) {
      aku $$3 = fnr.a($$0, $$2);
      return $$1.a($$0, fnr.k($$3), this.h);
   }

   private void g(cwj $$0) {
      hbh.b $$1 = fnm.a(fno.a($$0));
      hbh.b $$2 = fnm.a(this.a($$0, "_pulling_0", fnq.bP));
      hbh.b $$3 = fnm.a(this.a($$0, "_pulling_1", fnq.bP));
      hbh.b $$4 = fnm.a(this.a($$0, "_pulling_2", fnq.bP));
      this.g.a($$0, fnm.a(fnm.a(), fnm.a(new hcr(false), 0.05F, $$2, fnm.a($$3, 0.65F), fnm.a($$4, 0.9F)), $$1));
   }

   private void h(cwj $$0) {
      hbh.b $$1 = fnm.a(fno.a($$0));
      hbh.b $$2 = fnm.a(this.a($$0, "_pulling_0", fnq.bQ));
      hbh.b $$3 = fnm.a(this.a($$0, "_pulling_1", fnq.bQ));
      hbh.b $$4 = fnm.a(this.a($$0, "_pulling_2", fnq.bQ));
      hbh.b $$5 = fnm.a(this.a($$0, "_arrow", fnq.bQ));
      hbh.b $$6 = fnm.a(this.a($$0, "_firework", fnq.bQ));
      this.g
         .a($$0, fnm.a(fnm.a(), fnm.a(new hcj(), $$2, fnm.a($$3, 0.58F), fnm.a($$4, 1.0F)), fnm.a(new hcu(), $$1, fnm.a(cve.a.b, $$5), fnm.a(cve.a.c, $$6))));
   }

   private void a(cwj $$0, hbt $$1, hbh.b $$2, hbh.b $$3) {
      this.g.a($$0, fnm.a($$1, $$2, $$3));
   }

   private void i(cwj $$0) {
      hbh.b $$1 = fnm.a(this.a($$0, fnq.bE));
      hbh.b $$2 = fnm.a(this.a($$0, "_broken", fnq.bE));
      this.a($$0, new hbq(), $$2, $$1);
   }

   private void j(cwj $$0) {
      hbh.b $$1 = fnm.a(fno.a($$0));
      hbh.b $$2 = fnm.a(fno.a($$0, "_brushing_0"));
      hbh.b $$3 = fnm.a(fno.a($$0, "_brushing_1"));
      hbh.b $$4 = fnm.a(fno.a($$0, "_brushing_2"));
      this.g.a($$0, fnm.a(new hcq(10.0F), 0.1F, $$1, fnm.a($$2, 0.25F), fnm.a($$3, 0.5F), fnm.a($$4, 0.75F)));
   }

   private void k(cwj $$0) {
      hbh.b $$1 = fnm.a(this.a($$0, fnq.bH));
      hbh.b $$2 = fnm.a(this.a($$0, "_cast", fnq.bH));
      this.a($$0, new hbx(), $$2, $$1);
   }

   private void l(cwj $$0) {
      hbh.b $$1 = fnm.a(fno.a($$0));
      hbh.b $$2 = fnm.a(fno.b("tooting_goat_horn"));
      this.a($$0, fnm.a(), $$2, $$1);
   }

   private void m(cwj $$0) {
      hbh.b $$1 = fnm.a(fno.a($$0), new hdn.a());
      hbh.b $$2 = fnm.a(fno.a($$0, "_blocking"), new hdn.a());
      this.a($$0, fnm.a(), $$2, $$1);
   }

   private static hbh.b a(hbh.b $$0, hbh.b $$1) {
      return fnm.a(new hcw(), $$1, fnm.a(List.of(cwl.g, cwl.h, cwl.i), $$0));
   }

   private void n(cwj $$0) {
      hbh.b $$1 = fnm.a(this.a($$0, fnq.bE));
      hbh.b $$2 = fnm.a(fno.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cwj $$0) {
      hbh.b $$1 = fnm.a(this.a($$0, fnq.bE));
      hbh.b $$2 = fnm.a(fno.a($$0, "_in_hand"), new hdt.a());
      hbh.b $$3 = fnm.a(fno.a($$0, "_throwing"), new hdt.a());
      hbh.b $$4 = fnm.a(fnm.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cwj $$0, aku $$1) {
      this.g.a($$0, fnm.a($$1, new fmu()));
   }

   private void p(cwj $$0) {
      aku $$1 = this.a($$0, fno.b("potion_overlay"), fno.a($$0));
      this.a($$0, $$1);
   }

   private void q(cwj $$0) {
      aku $$1 = this.a($$0, fno.a($$0, "_head"), fno.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cwj $$0, int $$1) {
      aku $$2 = this.a($$0, fnq.bE);
      this.g.a($$0, fnm.a($$2, new fmo($$1)));
   }

   private void a(cwj $$0, int $$1, int $$2) {
      aku $$3 = fno.b("template_spawn_egg");
      this.g.a($$0, fnm.a($$3, fnm.a($$1), fnm.a($$2)));
   }

   private void r(cwj $$0) {
      aku $$1 = fnr.c($$0);
      aku $$2 = fnr.a($$0, "_overlay");
      aku $$3 = fnq.bE.a($$0, fnr.k($$1), this.h);
      aku $$4 = fno.a($$0, "_dyed");
      fnq.bI.a($$4, fnr.c($$1, $$2), this.h);
      this.g.a($$0, fnm.a(fnm.a(kv.J), fnm.a($$4, a, new fmo(0)), fnm.a($$3)));
   }

   public void a() {
      this.b(cwr.oF, fnq.bE);
      this.b(cwr.oH, fnq.bE);
      this.b(cwr.oG, fnq.bE);
      this.b(cwr.oI, fnq.bE);
      this.b(cwr.pi, fnq.bE);
      this.b(cwr.oZ, fnq.bE);
      this.b(cwr.oV, fnq.bE);
      this.b(cwr.vF, fnq.bE);
      this.b(cwr.pb, fnq.bE);
      this.b(cwr.vg, fnq.bE);
      this.b(cwr.ed, fnq.bG);
      this.b(cwr.sX, fnq.bE);
      this.b(cwr.wk, fnq.bE);
      this.b(cwr.wm, fnq.bE);
      this.b(cwr.oB, fnq.bE);
      this.b(cwr.oC, fnq.bE);
      this.b(cwr.su, fnq.bE);
      this.b(cwr.tl, fnq.bE);
      this.b(cwr.td, fnq.bG);
      this.b(cwr.sq, fnq.bE);
      this.b(cwr.sv, fnq.bE);
      this.b(cwr.xh, fnq.bE);
      this.b(cwr.rw, fnq.bE);
      this.b(cwr.oY, fnq.bE);
      this.b(cwr.qc, fnq.bE);
      this.b(cwr.rs, fnq.bE);
      this.b(cwr.uZ, fnq.bG);
      this.b(cwr.sr, fnq.bE);
      this.b(cwr.rf, fnq.bE);
      this.b(cwr.ot, fnq.bH);
      this.b(cwr.ou, fnq.bH);
      this.b(cwr.pd, fnq.bE);
      this.b(cwr.op, fnq.bE);
      this.b(cwr.sZ, fnq.bE);
      this.b(cwr.wg, fnq.bE);
      this.b(cwr.rt, fnq.bE);
      this.e(cwr.rT);
      this.b(cwr.pc, fnq.bE);
      this.b(cwr.ro, fnq.bE);
      this.b(cwr.vM, fnq.bE);
      this.c(cwr.rz);
      this.d(cwr.rA);
      this.b(cwr.sY, fnq.bE);
      this.b(cwr.ta, fnq.bE);
      this.b(cwr.sa, fnq.bE);
      this.b(cwr.vO, fnq.bE);
      this.b(cwr.qD, fnq.bE);
      this.b(cwr.vB, fnq.bE);
      this.b(cwr.sb, fnq.bE);
      this.b(cwr.sP, fnq.bE);
      this.b(cwr.pl, fnq.bE);
      this.b(cwr.pm, fnq.bE);
      this.b(cwr.wZ, fnq.bE);
      this.b(cwr.so, fnq.bE);
      this.b(cwr.oJ, fnq.bE);
      this.b(cwr.oK, fnq.bE);
      this.b(cwr.pe, fnq.bE);
      this.b(cwr.pO, fnq.bG);
      this.b(cwr.pP, fnq.bG);
      this.b(cwr.vI, fnq.bE);
      this.b(cwr.pN, fnq.bG);
      this.b(cwr.pM, fnq.bG);
      this.b(cwr.pL, fnq.bG);
      this.b(cwr.wn, fnq.bE);
      this.b(cwr.sU, fnq.bE);
      this.b(cwr.ry, fnq.bE);
      this.b(cwr.pf, fnq.bE);
      this.b(cwr.vv, fnq.bE);
      this.b(cwr.tp, fnq.bE);
      this.b(cwr.tc, fnq.bE);
      this.b(cwr.wf, fnq.bE);
      this.b(cwr.uU, fnq.bE);
      this.b(cwr.tk, fnq.bE);
      this.b(cwr.xg, fnq.bE);
      this.b(cwr.vt, fnq.bE);
      this.b(cwr.uV, fnq.bE);
      this.b(cwr.qB, fnq.bE);
      this.b(cwr.oX, fnq.bE);
      this.b(cwr.xe, fnq.bE);
      this.b(cwr.wY, fnq.bE);
      this.b(cwr.oq, fnq.bE);
      this.b(cwr.te, fnq.bE);
      this.b(cwr.th, fnq.bE);
      this.b(cwr.tq, fnq.bE);
      this.b(cwr.xc, fnq.bE);
      this.b(cwr.xw, fnq.bE);
      this.b(cwr.rV, fnq.bE);
      this.b(cwr.sd, fnq.bE);
      this.b(cwr.vc, fnq.bE);
      this.b(cwr.pn, fnq.bE);
      this.b(cwr.qF, fnq.bE);
      this.b(cwr.pE, fnq.bG);
      this.b(cwr.vj, fnq.bE);
      this.b(cwr.pF, fnq.bG);
      this.b(cwr.vH, fnq.bE);
      this.b(cwr.pD, fnq.bG);
      this.b(cwr.pC, fnq.bG);
      this.b(cwr.pB, fnq.bG);
      this.b(cwr.po, fnq.bE);
      this.b(cwr.tf, fnq.bE);
      this.b(cwr.sm, fnq.bE);
      this.b(cwr.ss, fnq.bE);
      this.b(cwr.pZ, fnq.bE);
      this.b(cwr.xf, fnq.bE);
      this.b(cwr.wU, fnq.bE);
      this.b(cwr.xA, fnq.bE);
      this.b(cwr.xD, fnq.bE);
      this.b(cwr.os, fnq.bE);
      this.b(cwr.sc, fnq.bE);
      this.b(cwr.pj, fnq.bE);
      this.b(cwr.pJ, fnq.bG);
      this.b(cwr.pK, fnq.bG);
      this.b(cwr.vG, fnq.bE);
      this.b(cwr.pk, fnq.bE);
      this.b(cwr.wv, fnq.bE);
      this.b(cwr.pI, fnq.bG);
      this.b(cwr.pH, fnq.bG);
      this.b(cwr.pG, fnq.bG);
      this.b(cwr.vb, fnq.bE);
      this.b(cwr.oD, fnq.bE);
      this.b(cwr.oE, fnq.bE);
      this.b(cwr.ww, fnq.bE);
      this.b(cwr.pg, fnq.bE);
      this.b(cwr.rh, fnq.bE);
      this.b(cwr.rk, fnq.bE);
      this.b(cwr.si, fnq.bE);
      this.b(cwr.sn, fnq.bE);
      this.b(cwr.sk, fnq.bE);
      this.b(cwr.sh, fnq.bE);
      this.b(cwr.tm, fnq.bE);
      this.b(cwr.oN, fnq.bE);
      this.b(cwr.oO, fnq.bE);
      this.b(cwr.oP, fnq.bE);
      this.b(cwr.oQ, fnq.bE);
      this.b(cwr.vi, fnq.bE);
      this.b(cwr.sT, fnq.bE);
      this.b(cwr.rl, fnq.bE);
      this.b(cwr.oo, fnq.bE);
      this.b(cwr.xb, fnq.bE);
      this.b(cwr.pW, fnq.bE);
      this.b(cwr.wR, fnq.bE);
      this.b(cwr.wK, fnq.bF);
      this.b(cwr.wy, fnq.bF);
      this.b(cwr.wA, fnq.bF);
      this.b(cwr.wz, fnq.bF);
      this.b(cwr.wB, fnq.bF);
      this.b(cwr.wC, fnq.bF);
      this.b(cwr.wD, fnq.bF);
      this.b(cwr.wE, fnq.bF);
      this.b(cwr.wF, fnq.bF);
      this.b(cwr.wG, fnq.bF);
      this.b(cwr.wP, fnq.bF);
      this.b(cwr.wQ, fnq.bF);
      this.b(cwr.wH, fnq.bF);
      this.b(cwr.wI, fnq.bF);
      this.b(cwr.wL, fnq.bF);
      this.b(cwr.wJ, fnq.bF);
      this.b(cwr.wM, fnq.bF);
      this.b(cwr.wN, fnq.bF);
      this.b(cwr.wO, fnq.bF);
      this.b(cwr.vN, fnq.bE);
      this.b(cwr.vL, fnq.bE);
      this.b(cwr.wT, fnq.bE);
      this.b(cwr.pT, fnq.bG);
      this.b(cwr.pU, fnq.bG);
      this.b(cwr.pp, fnq.bE);
      this.b(cwr.pS, fnq.bG);
      this.b(cwr.pq, fnq.bE);
      this.b(cwr.pR, fnq.bG);
      this.b(cwr.pQ, fnq.bG);
      this.b(cwr.vw, fnq.bE);
      this.b(cwr.vx, fnq.bE);
      this.b(cwr.vr, fnq.bE);
      this.b(cwr.ox, fnq.bE);
      this.b(cwr.oy, fnq.bE);
      this.b(cwr.sg, fnq.bE);
      this.b(cwr.qE, fnq.bE);
      this.b(cwr.oL, fnq.bE);
      this.b(cwr.oM, fnq.bE);
      this.b(cwr.rv, fnq.bE);
      this.b(cwr.ov, fnq.bE);
      this.b(cwr.xd, fnq.bE);
      this.b(cwr.sl, fnq.bE);
      this.b(cwr.vh, fnq.bE);
      this.b(cwr.wh, fnq.bE);
      this.b(cwr.qC, fnq.bE);
      this.b(cwr.ri, fnq.bE);
      this.b(cwr.vz, fnq.bE);
      this.b(cwr.vy, fnq.bE);
      this.b(cwr.rZ, fnq.bE);
      this.b(cwr.rm, fnq.bE);
      this.b(cwr.vs, fnq.bE);
      this.b(cwr.sp, fnq.bE);
      this.b(cwr.ph, fnq.bE);
      this.b(cwr.vA, fnq.bE);
      this.b(cwr.vD, fnq.bE);
      this.b(cwr.vE, fnq.bE);
      this.b(cwr.vC, fnq.bE);
      this.b(cwr.st, fnq.bE);
      this.b(cwr.tb, fnq.bE);
      this.b(cwr.on, fnq.bE);
      this.b(cwr.rX, fnq.bE);
      this.b(cwr.rn, fnq.bE);
      this.b(cwr.oU, fnq.bE);
      this.b(cwr.sS, fnq.bE);
      this.b(cwr.wu, fnq.bE);
      this.b(cwr.xa, fnq.bE);
      this.b(cwr.rx, fnq.bE);
      this.b(cwr.rj, fnq.bE);
      this.b(cwr.yu, fnq.bE);
      this.b(cwr.wp, fnq.bE);
      this.b(cwr.tj, fnq.bE);
      this.b(cwr.oz, fnq.bE);
      this.b(cwr.oA, fnq.bE);
      this.b(cwr.pV, fnq.bG);
      this.b(cwr.pz, fnq.bG);
      this.b(cwr.pA, fnq.bG);
      this.b(cwr.py, fnq.bG);
      this.b(cwr.px, fnq.bG);
      this.b(cwr.pw, fnq.bG);
      this.b(cwr.sx, fnq.bE);
      this.b(cwr.wW, fnq.bE);
      this.b(cwr.or, fnq.bE);
      this.b(cwr.wt, fnq.bE);
      this.b(cwr.rY, fnq.bE);
      this.b(cwr.rp, fnq.bE);
      this.b(cwr.rq, fnq.bE);
      this.b(cwr.rr, fnq.bE);
      this.b(cwr.rg, fnq.bE);
      this.b(cwr.qb, fnq.bE);
      this.b(cwr.sf, fnq.bE);
      this.b(cwr.uW, fnq.bE);
      this.b(cwr.va, fnq.bY);
      this.b(cwr.pu, fnq.bG);
      this.b(cwr.pv, fnq.bG);
      this.b(cwr.pt, fnq.bG);
      this.b(cwr.ps, fnq.bG);
      this.b(cwr.pr, fnq.bG);
      this.b(cwr.uX, fnq.bE);
      this.b(cwr.uY, fnq.bE);
      this.b(cwr.sj, fnq.bE);
      this.b(cwr.yw, fnq.bE);
      this.b(cwr.yx, fnq.bE);
      this.b(cwr.yy, fnq.bE);
      this.b(cwr.yz, fnq.bE);
      this.b(cwr.yA, fnq.bE);
      this.b(cwr.yB, fnq.bE);
      this.b(cwr.yC, fnq.bE);
      this.b(cwr.yD, fnq.bE);
      this.b(cwr.yE, fnq.bE);
      this.b(cwr.yF, fnq.bE);
      this.b(cwr.yG, fnq.bE);
      this.b(cwr.yH, fnq.bE);
      this.b(cwr.yI, fnq.bE);
      this.b(cwr.yJ, fnq.bE);
      this.b(cwr.yK, fnq.bE);
      this.b(cwr.yL, fnq.bE);
      this.b(cwr.yM, fnq.bE);
      this.b(cwr.yN, fnq.bE);
      this.b(cwr.yO, fnq.bE);
      this.b(cwr.wx, cwr.pV, fnq.bG);
      this.b(cwr.qG, cwr.qF, fnq.bE);
      this.a(cwr.oT, der.g, "helmet", false);
      this.a(cwr.qd, der.b, "helmet", true);
      this.a(cwr.qe, der.b, "chestplate", true);
      this.a(cwr.qf, der.b, "leggings", true);
      this.a(cwr.qg, der.b, "boots", true);
      this.a(cwr.qh, der.c, "helmet", false);
      this.a(cwr.qi, der.c, "chestplate", false);
      this.a(cwr.qj, der.c, "leggings", false);
      this.a(cwr.qk, der.c, "boots", false);
      this.a(cwr.ql, der.d, "helmet", false);
      this.a(cwr.qm, der.d, "chestplate", false);
      this.a(cwr.qn, der.d, "leggings", false);
      this.a(cwr.qo, der.d, "boots", false);
      this.a(cwr.qp, der.f, "helmet", false);
      this.a(cwr.qq, der.f, "chestplate", false);
      this.a(cwr.qr, der.f, "leggings", false);
      this.a(cwr.qs, der.f, "boots", false);
      this.a(cwr.qt, der.e, "helmet", false);
      this.a(cwr.qu, der.e, "chestplate", false);
      this.a(cwr.qv, der.e, "leggings", false);
      this.a(cwr.qw, der.e, "boots", false);
      this.a(cwr.qx, der.h, "helmet", false);
      this.a(cwr.qy, der.h, "chestplate", false);
      this.a(cwr.qz, der.h, "leggings", false);
      this.a(cwr.qA, der.h, "boots", false);
      this.a(cwr.vJ, -6265536);
      this.b(cwr.yP, fnq.bE);
      this.b(cwr.yQ, fnq.bE);
      this.b(cwr.yR, fnq.bE);
      this.b(cwr.yS, fnq.bE);
      this.b(cwr.yT, fnq.bE);
      this.b(cwr.yU, fnq.bE);
      this.b(cwr.yV, fnq.bE);
      this.b(cwr.yW, fnq.bE);
      this.b(cwr.yX, fnq.bE);
      this.b(cwr.yY, fnq.bE);
      this.b(cwr.yZ, fnq.bE);
      this.b(cwr.za, fnq.bE);
      this.b(cwr.zb, fnq.bE);
      this.b(cwr.zc, fnq.bE);
      this.b(cwr.zd, fnq.bE);
      this.b(cwr.ze, fnq.bE);
      this.b(cwr.zf, fnq.bE);
      this.b(cwr.zg, fnq.bE);
      this.b(cwr.zh, fnq.bE);
      this.b(cwr.zi, fnq.bE);
      this.b(cwr.zj, fnq.bE);
      this.b(cwr.zk, fnq.bE);
      this.b(cwr.zl, fnq.bE);
      this.b(cwr.zD, fnq.bE);
      this.b(cwr.zE, fnq.bE);
      this.b(cwr.zG, fnq.bE);
      this.a(cwr.vu, new fmp());
      this.a(cwr.sR, "_markings", new fmt());
      this.f(cwr.rB);
      this.f(cwr.rR);
      this.f(cwr.rC);
      this.f(cwr.rJ);
      this.f(cwr.rK);
      this.f(cwr.rF);
      this.f(cwr.rN);
      this.f(cwr.rL);
      this.f(cwr.rG);
      this.f(cwr.rQ);
      this.f(cwr.rM);
      this.f(cwr.rE);
      this.f(cwr.rI);
      this.f(cwr.rP);
      this.f(cwr.rH);
      this.f(cwr.rO);
      this.f(cwr.rD);
      this.n(cwr.rU);
      this.o(cwr.wS);
      this.r(cwr.oW);
      this.g(cwr.pa);
      this.h(cwr.wV);
      this.i(cwr.ow);
      this.j(cwr.yv);
      this.k(cwr.rS);
      this.l(cwr.xi);
      this.m(cwr.ws);
      this.q(cwr.wq);
      this.p(cwr.ti);
      this.p(cwr.wo);
      this.p(cwr.wr);
      this.a(cwr.tr, 11366765, 8538184);
      this.a(cwr.ts, 56063, 44543);
      this.a(cwr.tt, 16499171, 10890612);
      this.a(cwr.tu, 4996656, 986895);
      this.a(cwr.tv, 15582019, 4400155);
      this.a(cwr.tw, 16167425, 16775294);
      this.a(cwr.tx, 9084018, 3231003);
      this.a(cwr.ty, 11506911, 9529055);
      this.a(cwr.tz, 15714446, 9794134);
      this.a(cwr.tA, 16565097, 13341495);
      this.a(cwr.tB, 803406, 11013646);
      this.a(cwr.tC, 10592673, 16711680);
      this.a(cwr.tD, 12691306, 15058059);
      this.a(cwr.tE, 4470310, 10592673);
      this.a(cwr.tF, 894731, 0);
      this.a(cwr.tG, 2243405, 16382457);
      this.a(cwr.tH, 5457209, 8811878);
      this.a(cwr.tI, 9433559, 7969893);
      this.a(cwr.tJ, 13552826, 7632531);
      this.a(cwr.tK, 1842204, 14711290);
      this.a(cwr.tL, 1447446, 0);
      this.a(cwr.tM, 1447446, 7237230);
      this.a(cwr.tN, 9804699, 1973274);
      this.a(cwr.tO, 14005919, 13396256);
      this.a(cwr.tP, 13661252, 16762748);
      this.a(cwr.tQ, 16382457, 12369084);
      this.a(cwr.tR, 611926, 8778172);
      this.a(cwr.tS, 10851452, 5589310);
      this.a(cwr.tT, 5931634, 15826224);
      this.a(cwr.tU, 13004373, 6251620);
      this.a(cwr.tV, 12623485, 15656192);
      this.a(cwr.tW, 7958625, 15125652);
      this.a(cwr.tX, 14405058, 7643954);
      this.a(cwr.tY, 12623485, 10051392);
      this.a(cwr.tZ, 3407872, 16579584);
      this.a(cwr.ua, 10489616, 12040119);
      this.a(cwr.ub, 1769984, 5321501);
      this.a(cwr.uc, 15720061, 5653556);
      this.a(cwr.ud, 15198183, 1776418);
      this.a(cwr.ue, 894731, 16711680);
      this.a(cwr.uf, 4411786, 8978176);
      this.a(cwr.ug, 15771042, 14377823);
      this.a(cwr.uh, 10051392, 16380836);
      this.a(cwr.ui, 5843472, 16380836);
      this.a(cwr.uj, 5451574, 9804699);
      this.a(cwr.uk, 15658718, 14014157);
      this.a(cwr.ul, 16167425, 3654642);
      this.a(cwr.um, 10051392, 7555121);
      this.a(cwr.un, 7697520, 5984329);
      this.a(cwr.uo, 10489616, 951412);
      this.a(cwr.up, 15198183, 16758197);
      this.a(cwr.uq, 9725844, 5060690);
      this.a(cwr.ur, 7237230, 3158064);
      this.a(cwr.us, 12698049, 4802889);
      this.a(cwr.ut, 6842447, 15066584);
      this.a(cwr.uu, 5349438, 8306542);
      this.a(cwr.uv, 8855049, 2468720);
      this.a(cwr.uw, 14283506, 8496292);
      this.a(cwr.ux, 3419431, 11013646);
      this.a(cwr.uy, 2243405, 7375001);
      this.a(cwr.uz, 6387319, 14543594);
      this.a(cwr.uA, 10236982, 5065037);
      this.a(cwr.uB, 7164733, 1444352);
      this.a(cwr.uC, 15377456, 4547222);
      this.a(cwr.uD, 15690005, 16775663);
      this.a(cwr.uE, 15198183, 44975);
      this.a(cwr.uF, 8032420, 15265265);
      this.a(cwr.uG, 5651507, 12422002);
      this.a(cwr.uH, 9804699, 2580065);
      this.a(cwr.uI, 4547222, 15377456);
      this.a(cwr.uJ, 1001033, 3790560);
      this.a(cwr.uK, 3407872, 5349438);
      this.a(cwr.uL, 1315860, 5075616);
      this.a(cwr.uM, 1315860, 4672845);
      this.a(cwr.uN, 14144467, 13545366);
      this.a(cwr.uO, 13004373, 15132390);
      this.a(cwr.uP, 6250335, 16545810);
      this.a(cwr.uQ, 44975, 7969893);
      this.a(cwr.uR, 3232308, 9945732);
      this.a(cwr.uS, 5651507, 7969893);
      this.a(cwr.uT, 15373203, 5009705);
      this.a(cwr.a);
      this.a(cwr.yo);
      this.a(cwr.yl);
      this.a(cwr.ym);
      this.a(cwr.yn);
      this.a(cwr.ec);
      this.a(cwr.eb);
      this.a(cwr.ea);
      this.a(cwr.yp);
      this.a(cwr.sw);
      this.a(cwr.rW);
      this.a(cwr.pY);
      this.a(cwr.vK);
   }

   static record a(String a, akt<dev> b, Map<akt<deq>, String> c) {

      public String a(akt<deq> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
