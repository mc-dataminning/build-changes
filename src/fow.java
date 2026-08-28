import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fow {
   private static final fon a = fpk.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fow.a> f = List.of(
      new fow.a("quartz", dgg.a, Map.of()),
      new fow.a("iron", dgg.b, Map.of(dgb.d, "iron_darker")),
      new fow.a("netherite", dgg.c, Map.of(dgb.h, "netherite_darker")),
      new fow.a("redstone", dgg.d, Map.of()),
      new fow.a("copper", dgg.e, Map.of()),
      new fow.a("gold", dgg.f, Map.of(dgb.e, "gold_darker")),
      new fow.a("emerald", dgg.g, Map.of()),
      new fow.a("diamond", dgg.h, Map.of(dgb.f, "diamond_darker")),
      new fow.a("lapis", dgg.i, Map.of()),
      new fow.a("amethyst", dgg.j, Map.of()),
      new fow.a("resin", dgg.k, Map.of())
   );
   private final fox g;
   private final BiConsumer<ald, fpl> h;

   public fow(fox $$0, BiConsumer<ald, fpl> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cxu $$0) {
      this.g.a($$0, fpk.a(fpm.a($$0)));
   }

   private ald a(cxu $$0, fpn $$1) {
      return $$1.a(fpm.a($$0), fpp.b($$0), this.h);
   }

   private void b(cxu $$0, fpn $$1) {
      this.g.a($$0, fpk.a(this.a($$0, $$1)));
   }

   private ald a(cxu $$0, String $$1, fpn $$2) {
      return $$2.a(fpm.a($$0, $$1), fpp.k(fpp.a($$0, $$1)), this.h);
   }

   private ald a(cxu $$0, cxu $$1, fpn $$2) {
      return $$2.a(fpm.a($$0), fpp.b($$1), this.h);
   }

   private void b(cxu $$0, cxu $$1, fpn $$2) {
      this.g.a($$0, fpk.a(this.a($$0, $$1, $$2)));
   }

   private void a(cxu $$0, fon $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cxu $$0, String $$1, fon $$2) {
      ald $$3 = this.a($$0, fpp.c($$0), fpp.a($$0, $$1));
      this.g.a($$0, fpk.a($$3, a, $$2));
   }

   private List<hdp.a> b(cxu $$0) {
      List<hdp.a> $$1 = new ArrayList<>();
      hdk.b $$2 = fpk.a(this.a($$0, "_16", fpo.bI));
      $$1.add(fpk.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azk.b($$3 - 16, 32);
         hdk.b $$5 = fpk.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fpo.bI));
         $$1.add(fpk.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fpk.a($$2, 31.5F));
      return $$1;
   }

   private void c(cxu $$0) {
      List<hdp.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fpk.a(
               fpk.a(kx.af),
               fpk.a(new hej(true, hek.a.b), 32.0F, $$1),
               fpk.a(fpk.a(new hej(true, hek.a.c), 32.0F, $$1), fpk.a(new hej(true, hek.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cxu $$0) {
      this.g.a($$0, fpk.a(new hej(true, hek.a.d), 32.0F, this.b($$0)));
   }

   private void e(cxu $$0) {
      List<hdp.a> $$1 = new ArrayList<>();
      hdk.b $$2 = fpk.a(this.a($$0, "_00", fpo.bI));
      $$1.add(fpk.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hdk.b $$4 = fpk.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fpo.bI));
         $$1.add(fpk.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fpk.a($$2, 63.5F));
      this.g.a($$0, fpk.a(fpk.a(new het(true, het.a.b), 64.0F, $$1), fpk.a(new het(true, het.a.a), 64.0F, $$1)));
   }

   private ald a(cxu $$0, ald $$1, ald $$2) {
      return fpo.bM.a($$0, fpp.c($$1, $$2), this.h);
   }

   private ald a(ald $$0, ald $$1, ald $$2) {
      return fpo.bM.a($$0, fpp.c($$1, $$2), this.h);
   }

   private void a(ald $$0, ald $$1, ald $$2, ald $$3) {
      fpo.bN.a($$0, fpp.a($$1, $$2, $$3), this.h);
   }

   private void a(cxu $$0, alc<dga> $$1, String $$2, boolean $$3) {
      ald $$4 = fpm.a($$0);
      ald $$5 = fpp.c($$0);
      ald $$6 = fpp.a($$0, "_overlay");
      List<hdq.a<alc<dgf>>> $$7 = new ArrayList<>(f.size());

      for (fow.a $$8 : f) {
         ald $$9 = $$4.g("_" + $$8.a() + "_trim");
         ald $$10 = ald.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hdk.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fpk.a($$9, new fok(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fpk.a($$9);
         }

         $$7.add(fpk.a($$8.b, $$11));
      }

      hdk.b $$13;
      if ($$3) {
         fpo.bM.a($$4, fpp.c($$5, $$6), this.h);
         $$13 = fpk.a($$4, new fok(-6265536));
      } else {
         fpo.bI.a($$4, fpp.k($$5), this.h);
         $$13 = fpk.a($$4);
      }

      this.g.a($$0, fpk.a(new hfj(), $$13, $$7));
   }

   private void f(cxu $$0) {
      hdk.b $$1 = fpk.a(this.a($$0, fpo.bI));
      ald $$2 = this.a($$0, fpo.bS, "_open_back");
      ald $$3 = this.a($$0, fpo.bR, "_open_front");
      hdk.b $$4 = fpk.a(fpk.a($$2), new hdf.a(), fpk.a($$3));
      hdk.b $$5 = fpk.a(new hdu(), $$4, $$1);
      this.g.a($$0, fpk.a(new hfd(), $$1, fpk.a(cxw.g, $$5)));
   }

   private ald a(cxu $$0, fpn $$1, String $$2) {
      ald $$3 = fpp.a($$0, $$2);
      return $$1.a($$0, fpp.k($$3), this.h);
   }

   private void g(cxu $$0) {
      hdk.b $$1 = fpk.a(fpm.a($$0));
      hdk.b $$2 = fpk.a(this.a($$0, "_pulling_0", fpo.bT));
      hdk.b $$3 = fpk.a(this.a($$0, "_pulling_1", fpo.bT));
      hdk.b $$4 = fpk.a(this.a($$0, "_pulling_2", fpo.bT));
      this.g.a($$0, fpk.a(fpk.a(), fpk.a(new hev(false), 0.05F, $$2, fpk.a($$3, 0.65F), fpk.a($$4, 0.9F)), $$1));
   }

   private void h(cxu $$0) {
      hdk.b $$1 = fpk.a(fpm.a($$0));
      hdk.b $$2 = fpk.a(this.a($$0, "_pulling_0", fpo.bU));
      hdk.b $$3 = fpk.a(this.a($$0, "_pulling_1", fpo.bU));
      hdk.b $$4 = fpk.a(this.a($$0, "_pulling_2", fpo.bU));
      hdk.b $$5 = fpk.a(this.a($$0, "_arrow", fpo.bU));
      hdk.b $$6 = fpk.a(this.a($$0, "_firework", fpo.bU));
      this.g
         .a($$0, fpk.a(fpk.a(), fpk.a(new hen(), $$2, fpk.a($$3, 0.58F), fpk.a($$4, 1.0F)), fpk.a(new hey(), $$1, fpk.a(cwq.a.b, $$5), fpk.a(cwq.a.c, $$6))));
   }

   private void a(cxu $$0, hdw $$1, hdk.b $$2, hdk.b $$3) {
      this.g.a($$0, fpk.a($$1, $$2, $$3));
   }

   private void i(cxu $$0) {
      hdk.b $$1 = fpk.a(this.a($$0, fpo.bI));
      hdk.b $$2 = fpk.a(this.a($$0, "_broken", fpo.bI));
      this.a($$0, new hdt(), $$2, $$1);
   }

   private void j(cxu $$0) {
      hdk.b $$1 = fpk.a(fpm.a($$0));
      hdk.b $$2 = fpk.a(fpm.a($$0, "_brushing_0"));
      hdk.b $$3 = fpk.a(fpm.a($$0, "_brushing_1"));
      hdk.b $$4 = fpk.a(fpm.a($$0, "_brushing_2"));
      this.g.a($$0, fpk.a(new heu(10.0F), 0.1F, $$1, fpk.a($$2, 0.25F), fpk.a($$3, 0.5F), fpk.a($$4, 0.75F)));
   }

   private void k(cxu $$0) {
      hdk.b $$1 = fpk.a(this.a($$0, fpo.bL));
      hdk.b $$2 = fpk.a(this.a($$0, "_cast", fpo.bL));
      this.a($$0, new hea(), $$2, $$1);
   }

   private void l(cxu $$0) {
      hdk.b $$1 = fpk.a(fpm.a($$0));
      hdk.b $$2 = fpk.a(fpm.b("tooting_goat_horn"));
      this.a($$0, fpk.a(), $$2, $$1);
   }

   private void m(cxu $$0) {
      hdk.b $$1 = fpk.a(fpm.a($$0), new hft.a());
      hdk.b $$2 = fpk.a(fpm.a($$0, "_blocking"), new hft.a());
      this.a($$0, fpk.a(), $$2, $$1);
   }

   private static hdk.b a(hdk.b $$0, hdk.b $$1) {
      return fpk.a(new hfd(), $$1, fpk.a(List.of(cxw.g, cxw.h, cxw.i), $$0));
   }

   private void n(cxu $$0) {
      hdk.b $$1 = fpk.a(this.a($$0, fpo.bI));
      hdk.b $$2 = fpk.a(fpm.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cxu $$0) {
      hdk.b $$1 = fpk.a(this.a($$0, fpo.bI));
      hdk.b $$2 = fpk.a(fpm.a($$0, "_in_hand"), new hfz.a());
      hdk.b $$3 = fpk.a(fpm.a($$0, "_throwing"), new hfz.a());
      hdk.b $$4 = fpk.a(fpk.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cxu $$0, ald $$1) {
      this.g.a($$0, fpk.a($$1, new foq()));
   }

   private void p(cxu $$0) {
      ald $$1 = this.a($$0, fpm.b("potion_overlay"), fpm.a($$0));
      this.a($$0, $$1);
   }

   private void q(cxu $$0) {
      ald $$1 = this.a($$0, fpm.a($$0, "_head"), fpm.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cxu $$0, int $$1) {
      ald $$2 = this.a($$0, fpo.bI);
      this.g.a($$0, fpk.a($$2, new fok($$1)));
   }

   private void a(cxu $$0, int $$1, int $$2) {
      ald $$3 = fpm.b("template_spawn_egg");
      this.g.a($$0, fpk.a($$3, fpk.a($$1), fpk.a($$2)));
   }

   private void r(cxu $$0) {
      ald $$1 = fpp.c($$0);
      ald $$2 = fpp.a($$0, "_overlay");
      ald $$3 = fpo.bI.a($$0, fpp.k($$1), this.h);
      ald $$4 = fpm.a($$0, "_dyed");
      fpo.bM.a($$4, fpp.c($$1, $$2), this.h);
      this.g.a($$0, fpk.a(fpk.a(kx.K), fpk.a($$4, a, new fok(0)), fpk.a($$3)));
   }

   public void a() {
      this.b(cyc.oH, fpo.bI);
      this.b(cyc.oJ, fpo.bI);
      this.b(cyc.oI, fpo.bI);
      this.b(cyc.oK, fpo.bI);
      this.b(cyc.pm, fpo.bI);
      this.b(cyc.pd, fpo.bI);
      this.b(cyc.oZ, fpo.bI);
      this.b(cyc.vJ, fpo.bI);
      this.b(cyc.pf, fpo.bI);
      this.b(cyc.vk, fpo.bI);
      this.b(cyc.ef, fpo.bK);
      this.b(cyc.tb, fpo.bI);
      this.b(cyc.wo, fpo.bI);
      this.b(cyc.wq, fpo.bI);
      this.b(cyc.oD, fpo.bI);
      this.b(cyc.oE, fpo.bI);
      this.b(cyc.sy, fpo.bI);
      this.b(cyc.tp, fpo.bI);
      this.b(cyc.th, fpo.bK);
      this.b(cyc.su, fpo.bI);
      this.b(cyc.sz, fpo.bI);
      this.b(cyc.xl, fpo.bI);
      this.b(cyc.rA, fpo.bI);
      this.b(cyc.pc, fpo.bI);
      this.b(cyc.qg, fpo.bI);
      this.b(cyc.rw, fpo.bI);
      this.b(cyc.vd, fpo.bK);
      this.b(cyc.sv, fpo.bI);
      this.b(cyc.rj, fpo.bI);
      this.b(cyc.ov, fpo.bL);
      this.b(cyc.ow, fpo.bL);
      this.b(cyc.ph, fpo.bI);
      this.b(cyc.or, fpo.bI);
      this.b(cyc.td, fpo.bI);
      this.b(cyc.wk, fpo.bI);
      this.b(cyc.rx, fpo.bI);
      this.e(cyc.rX);
      this.b(cyc.pg, fpo.bI);
      this.b(cyc.rs, fpo.bI);
      this.b(cyc.vQ, fpo.bI);
      this.c(cyc.rD);
      this.d(cyc.rE);
      this.b(cyc.tc, fpo.bI);
      this.b(cyc.te, fpo.bI);
      this.b(cyc.se, fpo.bI);
      this.b(cyc.vS, fpo.bI);
      this.b(cyc.qH, fpo.bI);
      this.b(cyc.vF, fpo.bI);
      this.b(cyc.sf, fpo.bI);
      this.b(cyc.sT, fpo.bI);
      this.b(cyc.pp, fpo.bI);
      this.b(cyc.pq, fpo.bI);
      this.b(cyc.xd, fpo.bI);
      this.b(cyc.ss, fpo.bI);
      this.b(cyc.oL, fpo.bI);
      this.b(cyc.oM, fpo.bI);
      this.b(cyc.pi, fpo.bI);
      this.b(cyc.pS, fpo.bK);
      this.b(cyc.pT, fpo.bK);
      this.b(cyc.vM, fpo.bI);
      this.b(cyc.pR, fpo.bK);
      this.b(cyc.pQ, fpo.bK);
      this.b(cyc.pP, fpo.bK);
      this.b(cyc.wr, fpo.bI);
      this.b(cyc.sY, fpo.bI);
      this.b(cyc.rC, fpo.bI);
      this.b(cyc.pj, fpo.bI);
      this.b(cyc.vz, fpo.bI);
      this.b(cyc.tt, fpo.bI);
      this.b(cyc.tg, fpo.bI);
      this.b(cyc.wj, fpo.bI);
      this.b(cyc.uY, fpo.bI);
      this.b(cyc.to, fpo.bI);
      this.b(cyc.xk, fpo.bI);
      this.b(cyc.vx, fpo.bI);
      this.b(cyc.uZ, fpo.bI);
      this.b(cyc.qF, fpo.bI);
      this.b(cyc.pb, fpo.bI);
      this.b(cyc.xi, fpo.bI);
      this.b(cyc.xc, fpo.bI);
      this.b(cyc.os, fpo.bI);
      this.b(cyc.ti, fpo.bI);
      this.b(cyc.tl, fpo.bI);
      this.b(cyc.tu, fpo.bI);
      this.b(cyc.xg, fpo.bI);
      this.b(cyc.xA, fpo.bI);
      this.b(cyc.rZ, fpo.bI);
      this.b(cyc.sh, fpo.bI);
      this.b(cyc.vg, fpo.bI);
      this.b(cyc.pr, fpo.bI);
      this.b(cyc.qJ, fpo.bI);
      this.b(cyc.pI, fpo.bK);
      this.b(cyc.vn, fpo.bI);
      this.b(cyc.pJ, fpo.bK);
      this.b(cyc.vL, fpo.bI);
      this.b(cyc.pH, fpo.bK);
      this.b(cyc.pG, fpo.bK);
      this.b(cyc.pF, fpo.bK);
      this.b(cyc.ps, fpo.bI);
      this.b(cyc.tj, fpo.bI);
      this.b(cyc.sq, fpo.bI);
      this.b(cyc.sw, fpo.bI);
      this.b(cyc.qd, fpo.bI);
      this.b(cyc.xj, fpo.bI);
      this.b(cyc.wY, fpo.bI);
      this.b(cyc.xE, fpo.bI);
      this.b(cyc.xH, fpo.bI);
      this.b(cyc.ou, fpo.bI);
      this.b(cyc.sg, fpo.bI);
      this.b(cyc.pn, fpo.bI);
      this.b(cyc.pN, fpo.bK);
      this.b(cyc.pO, fpo.bK);
      this.b(cyc.vK, fpo.bI);
      this.b(cyc.po, fpo.bI);
      this.b(cyc.wz, fpo.bI);
      this.b(cyc.pM, fpo.bK);
      this.b(cyc.pL, fpo.bK);
      this.b(cyc.pK, fpo.bK);
      this.b(cyc.vf, fpo.bI);
      this.b(cyc.oF, fpo.bI);
      this.b(cyc.oG, fpo.bI);
      this.b(cyc.wA, fpo.bI);
      this.b(cyc.pk, fpo.bI);
      this.b(cyc.rl, fpo.bI);
      this.b(cyc.ro, fpo.bI);
      this.b(cyc.sm, fpo.bI);
      this.b(cyc.sr, fpo.bI);
      this.b(cyc.so, fpo.bI);
      this.b(cyc.sl, fpo.bI);
      this.b(cyc.tq, fpo.bI);
      this.b(cyc.oP, fpo.bI);
      this.b(cyc.oQ, fpo.bI);
      this.b(cyc.oR, fpo.bI);
      this.b(cyc.oS, fpo.bI);
      this.b(cyc.vm, fpo.bI);
      this.b(cyc.sX, fpo.bI);
      this.b(cyc.rp, fpo.bI);
      this.b(cyc.oq, fpo.bI);
      this.b(cyc.xf, fpo.bI);
      this.b(cyc.qa, fpo.bI);
      this.b(cyc.wV, fpo.bI);
      this.b(cyc.wO, fpo.bJ);
      this.b(cyc.wC, fpo.bJ);
      this.b(cyc.wE, fpo.bJ);
      this.b(cyc.wD, fpo.bJ);
      this.b(cyc.wF, fpo.bJ);
      this.b(cyc.wG, fpo.bJ);
      this.b(cyc.wH, fpo.bJ);
      this.b(cyc.wI, fpo.bJ);
      this.b(cyc.wJ, fpo.bJ);
      this.b(cyc.wK, fpo.bJ);
      this.b(cyc.wT, fpo.bJ);
      this.b(cyc.wU, fpo.bJ);
      this.b(cyc.wL, fpo.bJ);
      this.b(cyc.wM, fpo.bJ);
      this.b(cyc.wP, fpo.bJ);
      this.b(cyc.wN, fpo.bJ);
      this.b(cyc.wQ, fpo.bJ);
      this.b(cyc.wR, fpo.bJ);
      this.b(cyc.wS, fpo.bJ);
      this.b(cyc.vR, fpo.bI);
      this.b(cyc.vP, fpo.bI);
      this.b(cyc.wX, fpo.bI);
      this.b(cyc.pX, fpo.bK);
      this.b(cyc.pY, fpo.bK);
      this.b(cyc.pt, fpo.bI);
      this.b(cyc.pW, fpo.bK);
      this.b(cyc.pu, fpo.bI);
      this.b(cyc.pV, fpo.bK);
      this.b(cyc.pU, fpo.bK);
      this.b(cyc.vA, fpo.bI);
      this.b(cyc.vB, fpo.bI);
      this.b(cyc.vv, fpo.bI);
      this.b(cyc.oz, fpo.bI);
      this.b(cyc.oA, fpo.bI);
      this.b(cyc.sk, fpo.bI);
      this.b(cyc.qI, fpo.bI);
      this.b(cyc.oN, fpo.bI);
      this.b(cyc.oO, fpo.bI);
      this.b(cyc.rz, fpo.bI);
      this.b(cyc.ox, fpo.bI);
      this.b(cyc.xh, fpo.bI);
      this.b(cyc.sp, fpo.bI);
      this.b(cyc.vl, fpo.bI);
      this.b(cyc.wl, fpo.bI);
      this.b(cyc.qG, fpo.bI);
      this.b(cyc.rm, fpo.bI);
      this.b(cyc.vD, fpo.bI);
      this.b(cyc.vC, fpo.bI);
      this.b(cyc.sd, fpo.bI);
      this.b(cyc.rq, fpo.bI);
      this.b(cyc.vw, fpo.bI);
      this.b(cyc.st, fpo.bI);
      this.b(cyc.pl, fpo.bI);
      this.b(cyc.vE, fpo.bI);
      this.b(cyc.vH, fpo.bI);
      this.b(cyc.vI, fpo.bI);
      this.b(cyc.vG, fpo.bI);
      this.b(cyc.sx, fpo.bI);
      this.b(cyc.tf, fpo.bI);
      this.b(cyc.op, fpo.bI);
      this.b(cyc.sb, fpo.bI);
      this.b(cyc.rr, fpo.bI);
      this.b(cyc.oY, fpo.bI);
      this.b(cyc.sW, fpo.bI);
      this.b(cyc.wy, fpo.bI);
      this.b(cyc.xe, fpo.bI);
      this.b(cyc.rB, fpo.bI);
      this.b(cyc.rn, fpo.bI);
      this.b(cyc.yy, fpo.bI);
      this.b(cyc.wt, fpo.bI);
      this.b(cyc.tn, fpo.bI);
      this.b(cyc.oB, fpo.bI);
      this.b(cyc.oC, fpo.bI);
      this.b(cyc.pZ, fpo.bK);
      this.b(cyc.pD, fpo.bK);
      this.b(cyc.pE, fpo.bK);
      this.b(cyc.pC, fpo.bK);
      this.b(cyc.pB, fpo.bK);
      this.b(cyc.pA, fpo.bK);
      this.b(cyc.sB, fpo.bI);
      this.b(cyc.xa, fpo.bI);
      this.b(cyc.ot, fpo.bI);
      this.b(cyc.wx, fpo.bI);
      this.b(cyc.sc, fpo.bI);
      this.b(cyc.rt, fpo.bI);
      this.b(cyc.ru, fpo.bI);
      this.b(cyc.rv, fpo.bI);
      this.b(cyc.rk, fpo.bI);
      this.b(cyc.qf, fpo.bI);
      this.b(cyc.sj, fpo.bI);
      this.b(cyc.va, fpo.bI);
      this.b(cyc.ve, fpo.cc);
      this.b(cyc.py, fpo.bK);
      this.b(cyc.pz, fpo.bK);
      this.b(cyc.px, fpo.bK);
      this.b(cyc.pw, fpo.bK);
      this.b(cyc.pv, fpo.bK);
      this.b(cyc.vb, fpo.bI);
      this.b(cyc.vc, fpo.bI);
      this.b(cyc.sn, fpo.bI);
      this.b(cyc.yA, fpo.bI);
      this.b(cyc.yB, fpo.bI);
      this.b(cyc.yC, fpo.bI);
      this.b(cyc.yD, fpo.bI);
      this.b(cyc.yE, fpo.bI);
      this.b(cyc.yF, fpo.bI);
      this.b(cyc.yG, fpo.bI);
      this.b(cyc.yH, fpo.bI);
      this.b(cyc.yI, fpo.bI);
      this.b(cyc.yJ, fpo.bI);
      this.b(cyc.yK, fpo.bI);
      this.b(cyc.yL, fpo.bI);
      this.b(cyc.yM, fpo.bI);
      this.b(cyc.yN, fpo.bI);
      this.b(cyc.yO, fpo.bI);
      this.b(cyc.yP, fpo.bI);
      this.b(cyc.yQ, fpo.bI);
      this.b(cyc.yR, fpo.bI);
      this.b(cyc.yS, fpo.bI);
      this.b(cyc.wB, cyc.pZ, fpo.bK);
      this.b(cyc.qK, cyc.qJ, fpo.bI);
      this.a(cyc.oX, dgb.g, "helmet", false);
      this.a(cyc.qh, dgb.b, "helmet", true);
      this.a(cyc.qi, dgb.b, "chestplate", true);
      this.a(cyc.qj, dgb.b, "leggings", true);
      this.a(cyc.qk, dgb.b, "boots", true);
      this.a(cyc.ql, dgb.c, "helmet", false);
      this.a(cyc.qm, dgb.c, "chestplate", false);
      this.a(cyc.qn, dgb.c, "leggings", false);
      this.a(cyc.qo, dgb.c, "boots", false);
      this.a(cyc.qp, dgb.d, "helmet", false);
      this.a(cyc.qq, dgb.d, "chestplate", false);
      this.a(cyc.qr, dgb.d, "leggings", false);
      this.a(cyc.qs, dgb.d, "boots", false);
      this.a(cyc.qt, dgb.f, "helmet", false);
      this.a(cyc.qu, dgb.f, "chestplate", false);
      this.a(cyc.qv, dgb.f, "leggings", false);
      this.a(cyc.qw, dgb.f, "boots", false);
      this.a(cyc.qx, dgb.e, "helmet", false);
      this.a(cyc.qy, dgb.e, "chestplate", false);
      this.a(cyc.qz, dgb.e, "leggings", false);
      this.a(cyc.qA, dgb.e, "boots", false);
      this.a(cyc.qB, dgb.h, "helmet", false);
      this.a(cyc.qC, dgb.h, "chestplate", false);
      this.a(cyc.qD, dgb.h, "leggings", false);
      this.a(cyc.qE, dgb.h, "boots", false);
      this.a(cyc.vN, -6265536);
      this.b(cyc.yT, fpo.bI);
      this.b(cyc.yU, fpo.bI);
      this.b(cyc.yV, fpo.bI);
      this.b(cyc.yW, fpo.bI);
      this.b(cyc.yX, fpo.bI);
      this.b(cyc.yY, fpo.bI);
      this.b(cyc.yZ, fpo.bI);
      this.b(cyc.za, fpo.bI);
      this.b(cyc.zb, fpo.bI);
      this.b(cyc.zc, fpo.bI);
      this.b(cyc.zd, fpo.bI);
      this.b(cyc.ze, fpo.bI);
      this.b(cyc.zf, fpo.bI);
      this.b(cyc.zg, fpo.bI);
      this.b(cyc.zh, fpo.bI);
      this.b(cyc.zi, fpo.bI);
      this.b(cyc.zj, fpo.bI);
      this.b(cyc.zk, fpo.bI);
      this.b(cyc.zl, fpo.bI);
      this.b(cyc.zm, fpo.bI);
      this.b(cyc.zn, fpo.bI);
      this.b(cyc.zo, fpo.bI);
      this.b(cyc.zp, fpo.bI);
      this.b(cyc.zH, fpo.bI);
      this.b(cyc.zI, fpo.bI);
      this.b(cyc.zK, fpo.bI);
      this.a(cyc.vy, new fol());
      this.a(cyc.sV, "_markings", new fop());
      this.f(cyc.rF);
      this.f(cyc.rV);
      this.f(cyc.rG);
      this.f(cyc.rN);
      this.f(cyc.rO);
      this.f(cyc.rJ);
      this.f(cyc.rR);
      this.f(cyc.rP);
      this.f(cyc.rK);
      this.f(cyc.rU);
      this.f(cyc.rQ);
      this.f(cyc.rI);
      this.f(cyc.rM);
      this.f(cyc.rT);
      this.f(cyc.rL);
      this.f(cyc.rS);
      this.f(cyc.rH);
      this.n(cyc.rY);
      this.o(cyc.wW);
      this.r(cyc.pa);
      this.g(cyc.pe);
      this.h(cyc.wZ);
      this.i(cyc.oy);
      this.j(cyc.yz);
      this.k(cyc.rW);
      this.l(cyc.xm);
      this.m(cyc.ww);
      this.q(cyc.wu);
      this.p(cyc.tm);
      this.p(cyc.ws);
      this.p(cyc.wv);
      this.a(cyc.tv, 11366765, 8538184);
      this.a(cyc.tw, 56063, 44543);
      this.a(cyc.tx, 16499171, 10890612);
      this.a(cyc.ty, 4996656, 986895);
      this.a(cyc.tz, 15582019, 4400155);
      this.a(cyc.tA, 16167425, 16775294);
      this.a(cyc.tB, 9084018, 3231003);
      this.a(cyc.tC, 11506911, 9529055);
      this.a(cyc.tD, 15714446, 9794134);
      this.a(cyc.tE, 16565097, 13341495);
      this.a(cyc.tF, 803406, 11013646);
      this.a(cyc.tG, 10592673, 16711680);
      this.a(cyc.tH, 12691306, 15058059);
      this.a(cyc.tI, 4470310, 10592673);
      this.a(cyc.tJ, 894731, 0);
      this.a(cyc.tK, 2243405, 16382457);
      this.a(cyc.tL, 5457209, 8811878);
      this.a(cyc.tM, 9433559, 7969893);
      this.a(cyc.tN, 13552826, 7632531);
      this.a(cyc.tO, 1842204, 14711290);
      this.a(cyc.tP, 1447446, 0);
      this.a(cyc.tQ, 1447446, 7237230);
      this.a(cyc.tR, 9804699, 1973274);
      this.a(cyc.tS, 14005919, 13396256);
      this.a(cyc.tT, 13661252, 16762748);
      this.a(cyc.tU, 16382457, 12369084);
      this.a(cyc.tV, 611926, 8778172);
      this.a(cyc.tW, 10851452, 5589310);
      this.a(cyc.tX, 5931634, 15826224);
      this.a(cyc.tY, 13004373, 6251620);
      this.a(cyc.tZ, 12623485, 15656192);
      this.a(cyc.ua, 7958625, 15125652);
      this.a(cyc.ub, 14405058, 7643954);
      this.a(cyc.uc, 12623485, 10051392);
      this.a(cyc.ud, 3407872, 16579584);
      this.a(cyc.ue, 10489616, 12040119);
      this.a(cyc.uf, 1769984, 5321501);
      this.a(cyc.ug, 15720061, 5653556);
      this.a(cyc.uh, 15198183, 1776418);
      this.a(cyc.ui, 894731, 16711680);
      this.a(cyc.uj, 4411786, 8978176);
      this.a(cyc.uk, 15771042, 14377823);
      this.a(cyc.ul, 10051392, 16380836);
      this.a(cyc.um, 5843472, 16380836);
      this.a(cyc.un, 5451574, 9804699);
      this.a(cyc.uo, 15658718, 14014157);
      this.a(cyc.up, 16167425, 3654642);
      this.a(cyc.uq, 10051392, 7555121);
      this.a(cyc.ur, 7697520, 5984329);
      this.a(cyc.us, 10489616, 951412);
      this.a(cyc.ut, 15198183, 16758197);
      this.a(cyc.uu, 9725844, 5060690);
      this.a(cyc.uv, 7237230, 3158064);
      this.a(cyc.uw, 12698049, 4802889);
      this.a(cyc.ux, 6842447, 15066584);
      this.a(cyc.uy, 5349438, 8306542);
      this.a(cyc.uz, 8855049, 2468720);
      this.a(cyc.uA, 14283506, 8496292);
      this.a(cyc.uB, 3419431, 11013646);
      this.a(cyc.uC, 2243405, 7375001);
      this.a(cyc.uD, 6387319, 14543594);
      this.a(cyc.uE, 10236982, 5065037);
      this.a(cyc.uF, 7164733, 1444352);
      this.a(cyc.uG, 15377456, 4547222);
      this.a(cyc.uH, 15690005, 16775663);
      this.a(cyc.uI, 15198183, 44975);
      this.a(cyc.uJ, 8032420, 15265265);
      this.a(cyc.uK, 5651507, 12422002);
      this.a(cyc.uL, 9804699, 2580065);
      this.a(cyc.uM, 4547222, 15377456);
      this.a(cyc.uN, 1001033, 3790560);
      this.a(cyc.uO, 3407872, 5349438);
      this.a(cyc.uP, 1315860, 5075616);
      this.a(cyc.uQ, 1315860, 4672845);
      this.a(cyc.uR, 14144467, 13545366);
      this.a(cyc.uS, 13004373, 15132390);
      this.a(cyc.uT, 6250335, 16545810);
      this.a(cyc.uU, 44975, 7969893);
      this.a(cyc.uV, 3232308, 9945732);
      this.a(cyc.uW, 5651507, 7969893);
      this.a(cyc.uX, 15373203, 5009705);
      this.a(cyc.a);
      this.a(cyc.ys);
      this.a(cyc.yp);
      this.a(cyc.yq);
      this.a(cyc.yr);
      this.a(cyc.ee);
      this.a(cyc.ed);
      this.a(cyc.ec);
      this.a(cyc.yt);
      this.a(cyc.sA);
      this.a(cyc.sa);
      this.a(cyc.qc);
      this.a(cyc.vO);
   }

   static record a(String a, alc<dgf> b, Map<alc<dga>, String> c) {

      public String a(alc<dga> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
