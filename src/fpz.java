import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fpz {
   private static final fpq f = fqn.a(-1);
   public static final ale a = a("helmet");
   public static final ale b = a("chestplate");
   public static final ale c = a("leggings");
   public static final ale d = a("boots");
   public static final List<fpz.a> e = List.of(
      new fpz.a(dhe.d, dhg.a),
      new fpz.a(dhe.e, dhg.b),
      new fpz.a(dhe.f, dhg.c),
      new fpz.a(dhe.g, dhg.d),
      new fpz.a(dhe.h, dhg.e),
      new fpz.a(dhe.i, dhg.f),
      new fpz.a(dhe.j, dhg.g),
      new fpz.a(dhe.k, dhg.h),
      new fpz.a(dhe.l, dhg.i),
      new fpz.a(dhe.m, dhg.j),
      new fpz.a(dhe.n, dhg.k)
   );
   private final fqa g;
   private final BiConsumer<ale, fqo> h;

   public static ale a(String $$0) {
      return ale.b("trims/items/" + $$0 + "_trim");
   }

   public fpz(fqa $$0, BiConsumer<ale, fqo> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cyo $$0) {
      this.g.a($$0, fqn.a(fqp.a($$0)));
   }

   private ale a(cyo $$0, fqq $$1) {
      return $$1.a(fqp.a($$0), fqs.b($$0), this.h);
   }

   private void b(cyo $$0, fqq $$1) {
      this.g.a($$0, fqn.a(this.a($$0, $$1)));
   }

   private ale a(cyo $$0, String $$1, fqq $$2) {
      return $$2.a(fqp.a($$0, $$1), fqs.k(fqs.a($$0, $$1)), this.h);
   }

   private ale a(cyo $$0, cyo $$1, fqq $$2) {
      return $$2.a(fqp.a($$0), fqs.b($$1), this.h);
   }

   private void b(cyo $$0, cyo $$1, fqq $$2) {
      this.g.a($$0, fqn.a(this.a($$0, $$1, $$2)));
   }

   private void a(cyo $$0, fpq $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cyo $$0, String $$1, fpq $$2) {
      ale $$3 = this.a($$0, fqs.c($$0), fqs.a($$0, $$1));
      this.g.a($$0, fqn.a($$3, f, $$2));
   }

   private List<heu.a> b(cyo $$0) {
      List<heu.a> $$1 = new ArrayList<>();
      hep.b $$2 = fqn.a(this.a($$0, "_16", fqr.bI));
      $$1.add(fqn.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azk.b($$3 - 16, 32);
         hep.b $$5 = fqn.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fqr.bI));
         $$1.add(fqn.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fqn.a($$2, 31.5F));
      return $$1;
   }

   private void c(cyo $$0) {
      List<heu.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fqn.a(
               fqn.a(kj.ah),
               fqn.a(new hfq(true, hfr.a.b), 32.0F, $$1),
               fqn.a(fqn.a(new hfq(true, hfr.a.c), 32.0F, $$1), fqn.a(new hfq(true, hfr.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cyo $$0) {
      this.g.a($$0, fqn.a(new hfq(true, hfr.a.d), 32.0F, this.b($$0)));
   }

   private void e(cyo $$0) {
      List<heu.a> $$1 = new ArrayList<>();
      hep.b $$2 = fqn.a(this.a($$0, "_00", fqr.bI));
      $$1.add(fqn.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hep.b $$4 = fqn.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fqr.bI));
         $$1.add(fqn.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fqn.a($$2, 63.5F));
      this.g.a($$0, fqn.a(fqn.a(new hga(true, hga.a.b), 64.0F, $$1), fqn.a(new hga(true, hga.a.a), 64.0F, $$1)));
   }

   private ale a(cyo $$0, ale $$1, ale $$2) {
      return fqr.bM.a($$0, fqs.c($$1, $$2), this.h);
   }

   private ale a(ale $$0, ale $$1, ale $$2) {
      return fqr.bM.a($$0, fqs.c($$1, $$2), this.h);
   }

   private void a(ale $$0, ale $$1, ale $$2, ale $$3) {
      fqr.bN.a($$0, fqs.a($$1, $$2, $$3), this.h);
   }

   private void a(cyo $$0, ald<dgz> $$1, ale $$2, boolean $$3) {
      ale $$4 = fqp.a($$0);
      ale $$5 = fqs.c($$0);
      ale $$6 = fqs.a($$0, "_overlay");
      List<hev.b<ald<dhf>>> $$7 = new ArrayList<>(e.size());

      for (fpz.a $$8 : e) {
         ale $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         ale $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hep.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fqn.a($$9, new fpn(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fqn.a($$9);
         }

         $$7.add(fqn.a($$8.b, $$11));
      }

      hep.b $$13;
      if ($$3) {
         fqr.bM.a($$4, fqs.c($$5, $$6), this.h);
         $$13 = fqn.a($$4, new fpn(-6265536));
      } else {
         fqr.bI.a($$4, fqs.k($$5), this.h);
         $$13 = fqn.a($$4);
      }

      this.g.a($$0, fqn.a(new hgq(), $$13, $$7));
   }

   private void f(cyo $$0) {
      hep.b $$1 = fqn.a(this.a($$0, fqr.bI));
      ale $$2 = this.a($$0, fqr.bS, "_open_back");
      ale $$3 = this.a($$0, fqr.bR, "_open_front");
      hep.b $$4 = fqn.a(fqn.a($$2), new hek.a(), fqn.a($$3));
      hep.b $$5 = fqn.a(new hez(), $$4, $$1);
      this.g.a($$0, fqn.a(new hgk(), $$1, fqn.a(cyq.g, $$5)));
   }

   private ale a(cyo $$0, fqq $$1, String $$2) {
      ale $$3 = fqs.a($$0, $$2);
      return $$1.a($$0, fqs.k($$3), this.h);
   }

   private void g(cyo $$0) {
      hep.b $$1 = fqn.a(fqp.a($$0));
      hep.b $$2 = fqn.a(this.a($$0, "_pulling_0", fqr.bT));
      hep.b $$3 = fqn.a(this.a($$0, "_pulling_1", fqr.bT));
      hep.b $$4 = fqn.a(this.a($$0, "_pulling_2", fqr.bT));
      this.g.a($$0, fqn.a(fqn.a(), fqn.a(new hgc(false), 0.05F, $$2, fqn.a($$3, 0.65F), fqn.a($$4, 0.9F)), $$1));
   }

   private void h(cyo $$0) {
      hep.b $$1 = fqn.a(fqp.a($$0));
      hep.b $$2 = fqn.a(this.a($$0, "_pulling_0", fqr.bU));
      hep.b $$3 = fqn.a(this.a($$0, "_pulling_1", fqr.bU));
      hep.b $$4 = fqn.a(this.a($$0, "_pulling_2", fqr.bU));
      hep.b $$5 = fqn.a(this.a($$0, "_arrow", fqr.bU));
      hep.b $$6 = fqn.a(this.a($$0, "_firework", fqr.bU));
      this.g
         .a($$0, fqn.a(new hgf(), fqn.a(fqn.a(), fqn.a(new hfu(), $$2, fqn.a($$3, 0.58F), fqn.a($$4, 1.0F)), $$1), fqn.a(cxl.a.b, $$5), fqn.a(cxl.a.c, $$6)));
   }

   private void a(cyo $$0, hfc $$1, hep.b $$2, hep.b $$3) {
      this.g.a($$0, fqn.a($$1, $$2, $$3));
   }

   private void i(cyo $$0) {
      hep.b $$1 = fqn.a(this.a($$0, fqr.bI));
      hep.b $$2 = fqn.a(this.a($$0, "_broken", fqr.bI));
      this.a($$0, new hey(), $$2, $$1);
   }

   private void j(cyo $$0) {
      hep.b $$1 = fqn.a(fqp.a($$0));
      hep.b $$2 = fqn.a(fqp.a($$0, "_brushing_0"));
      hep.b $$3 = fqn.a(fqp.a($$0, "_brushing_1"));
      hep.b $$4 = fqn.a(fqp.a($$0, "_brushing_2"));
      this.g.a($$0, fqn.a(new hgb(10.0F), 0.1F, $$1, fqn.a($$2, 0.25F), fqn.a($$3, 0.5F), fqn.a($$4, 0.75F)));
   }

   private void k(cyo $$0) {
      hep.b $$1 = fqn.a(this.a($$0, fqr.bL));
      hep.b $$2 = fqn.a(this.a($$0, "_cast", fqr.bL));
      this.a($$0, new hfg(), $$2, $$1);
   }

   private void l(cyo $$0) {
      hep.b $$1 = fqn.a(fqp.a($$0));
      hep.b $$2 = fqn.a(fqp.b("tooting_goat_horn"));
      this.a($$0, fqn.a(), $$2, $$1);
   }

   private void m(cyo $$0) {
      hep.b $$1 = fqn.a(fqp.a($$0), new hha.a());
      hep.b $$2 = fqn.a(fqp.a($$0, "_blocking"), new hha.a());
      this.a($$0, fqn.a(), $$2, $$1);
   }

   private static hep.b a(hep.b $$0, hep.b $$1) {
      return fqn.a(new hgk(), $$1, fqn.a(List.of(cyq.g, cyq.h, cyq.i), $$0));
   }

   private void n(cyo $$0) {
      hep.b $$1 = fqn.a(this.a($$0, fqr.bI));
      hep.b $$2 = fqn.a(fqp.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cyo $$0) {
      hep.b $$1 = fqn.a(this.a($$0, fqr.bI));
      hep.b $$2 = fqn.a(fqp.a($$0, "_in_hand"), new hhg.a());
      hep.b $$3 = fqn.a(fqp.a($$0, "_throwing"), new hhg.a());
      hep.b $$4 = fqn.a(fqn.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cyo $$0, ale $$1) {
      this.g.a($$0, fqn.a($$1, new fpt()));
   }

   private void p(cyo $$0) {
      ale $$1 = this.a($$0, fqp.b("potion_overlay"), fqp.a($$0));
      this.a($$0, $$1);
   }

   private void q(cyo $$0) {
      ale $$1 = this.a($$0, fqp.a($$0, "_head"), fqp.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cyo $$0, int $$1) {
      ale $$2 = this.a($$0, fqr.bI);
      this.g.a($$0, fqn.a($$2, new fpn($$1)));
   }

   private void a(cyo $$0, int $$1, int $$2) {
      ale $$3 = fqp.b("template_spawn_egg");
      this.g.a($$0, fqn.a($$3, fqn.a($$1), fqn.a($$2)));
   }

   private void r(cyo $$0) {
      ale $$1 = fqs.c($$0);
      ale $$2 = fqs.a($$0, "_overlay");
      ale $$3 = fqr.bI.a($$0, fqs.k($$1), this.h);
      ale $$4 = fqp.a($$0, "_dyed");
      fqr.bM.a($$4, fqs.c($$1, $$2), this.h);
      this.g.a($$0, fqn.a(fqn.a(kj.K), fqn.a($$4, f, new fpn(0)), fqn.a($$3)));
   }

   public void a() {
      this.b(cyw.oH, fqr.bI);
      this.b(cyw.oJ, fqr.bI);
      this.b(cyw.oI, fqr.bI);
      this.b(cyw.oK, fqr.bI);
      this.b(cyw.pm, fqr.bI);
      this.b(cyw.pd, fqr.bI);
      this.b(cyw.oZ, fqr.bI);
      this.b(cyw.vJ, fqr.bI);
      this.b(cyw.pf, fqr.bI);
      this.b(cyw.vk, fqr.bI);
      this.b(cyw.ef, fqr.bK);
      this.b(cyw.tb, fqr.bI);
      this.b(cyw.wo, fqr.bI);
      this.b(cyw.wq, fqr.bI);
      this.b(cyw.oD, fqr.bI);
      this.b(cyw.oE, fqr.bI);
      this.b(cyw.sy, fqr.bI);
      this.b(cyw.tp, fqr.bI);
      this.b(cyw.th, fqr.bK);
      this.b(cyw.su, fqr.bI);
      this.b(cyw.sz, fqr.bI);
      this.b(cyw.xl, fqr.bI);
      this.b(cyw.rA, fqr.bI);
      this.b(cyw.pc, fqr.bI);
      this.b(cyw.qg, fqr.bI);
      this.b(cyw.rw, fqr.bI);
      this.b(cyw.vd, fqr.bK);
      this.b(cyw.sv, fqr.bI);
      this.b(cyw.rj, fqr.bI);
      this.b(cyw.ov, fqr.bL);
      this.b(cyw.ow, fqr.bL);
      this.b(cyw.ph, fqr.bI);
      this.b(cyw.or, fqr.bI);
      this.b(cyw.td, fqr.bI);
      this.b(cyw.wk, fqr.bI);
      this.b(cyw.rx, fqr.bI);
      this.e(cyw.rX);
      this.b(cyw.pg, fqr.bI);
      this.b(cyw.rs, fqr.bI);
      this.b(cyw.vQ, fqr.bI);
      this.c(cyw.rD);
      this.d(cyw.rE);
      this.b(cyw.tc, fqr.bI);
      this.b(cyw.te, fqr.bI);
      this.b(cyw.se, fqr.bI);
      this.b(cyw.vS, fqr.bI);
      this.b(cyw.qH, fqr.bI);
      this.b(cyw.vF, fqr.bI);
      this.b(cyw.sf, fqr.bI);
      this.b(cyw.sT, fqr.bI);
      this.b(cyw.pp, fqr.bI);
      this.b(cyw.pq, fqr.bI);
      this.b(cyw.xd, fqr.bI);
      this.b(cyw.ss, fqr.bI);
      this.b(cyw.oL, fqr.bI);
      this.b(cyw.oM, fqr.bI);
      this.b(cyw.pi, fqr.bI);
      this.b(cyw.pS, fqr.bK);
      this.b(cyw.pT, fqr.bK);
      this.b(cyw.vM, fqr.bI);
      this.b(cyw.pR, fqr.bK);
      this.b(cyw.pQ, fqr.bK);
      this.b(cyw.pP, fqr.bK);
      this.b(cyw.wr, fqr.bI);
      this.b(cyw.sY, fqr.bI);
      this.b(cyw.rC, fqr.bI);
      this.b(cyw.pj, fqr.bI);
      this.b(cyw.vz, fqr.bI);
      this.b(cyw.tt, fqr.bI);
      this.b(cyw.tg, fqr.bI);
      this.b(cyw.wj, fqr.bI);
      this.b(cyw.uY, fqr.bI);
      this.b(cyw.to, fqr.bI);
      this.b(cyw.xk, fqr.bI);
      this.b(cyw.vx, fqr.bI);
      this.b(cyw.uZ, fqr.bI);
      this.b(cyw.qF, fqr.bI);
      this.b(cyw.pb, fqr.bI);
      this.b(cyw.xi, fqr.bI);
      this.b(cyw.xc, fqr.bI);
      this.b(cyw.os, fqr.bI);
      this.b(cyw.ti, fqr.bI);
      this.b(cyw.tl, fqr.bI);
      this.b(cyw.tu, fqr.bI);
      this.b(cyw.xg, fqr.bI);
      this.b(cyw.xA, fqr.bI);
      this.b(cyw.rZ, fqr.bI);
      this.b(cyw.sh, fqr.bI);
      this.b(cyw.vg, fqr.bI);
      this.b(cyw.pr, fqr.bI);
      this.b(cyw.qJ, fqr.bI);
      this.b(cyw.pI, fqr.bK);
      this.b(cyw.vn, fqr.bI);
      this.b(cyw.pJ, fqr.bK);
      this.b(cyw.vL, fqr.bI);
      this.b(cyw.pH, fqr.bK);
      this.b(cyw.pG, fqr.bK);
      this.b(cyw.pF, fqr.bK);
      this.b(cyw.ps, fqr.bI);
      this.b(cyw.tj, fqr.bI);
      this.b(cyw.sq, fqr.bI);
      this.b(cyw.sw, fqr.bI);
      this.b(cyw.qd, fqr.bI);
      this.b(cyw.xj, fqr.bI);
      this.b(cyw.wY, fqr.bI);
      this.b(cyw.xE, fqr.bI);
      this.b(cyw.xH, fqr.bI);
      this.b(cyw.ou, fqr.bI);
      this.b(cyw.sg, fqr.bI);
      this.b(cyw.pn, fqr.bI);
      this.b(cyw.pN, fqr.bK);
      this.b(cyw.pO, fqr.bK);
      this.b(cyw.vK, fqr.bI);
      this.b(cyw.po, fqr.bI);
      this.b(cyw.wz, fqr.bI);
      this.b(cyw.pM, fqr.bK);
      this.b(cyw.pL, fqr.bK);
      this.b(cyw.pK, fqr.bK);
      this.b(cyw.vf, fqr.bI);
      this.b(cyw.oF, fqr.bI);
      this.b(cyw.oG, fqr.bI);
      this.b(cyw.wA, fqr.bI);
      this.b(cyw.pk, fqr.bI);
      this.b(cyw.rl, fqr.bI);
      this.b(cyw.ro, fqr.bI);
      this.b(cyw.sm, fqr.bI);
      this.b(cyw.sr, fqr.bI);
      this.b(cyw.so, fqr.bI);
      this.b(cyw.sl, fqr.bI);
      this.b(cyw.tq, fqr.bI);
      this.b(cyw.oP, fqr.bI);
      this.b(cyw.oQ, fqr.bI);
      this.b(cyw.oR, fqr.bI);
      this.b(cyw.oS, fqr.bI);
      this.b(cyw.vm, fqr.bI);
      this.b(cyw.sX, fqr.bI);
      this.b(cyw.rp, fqr.bI);
      this.b(cyw.oq, fqr.bI);
      this.b(cyw.xf, fqr.bI);
      this.b(cyw.qa, fqr.bI);
      this.b(cyw.wV, fqr.bI);
      this.b(cyw.wO, fqr.bJ);
      this.b(cyw.wC, fqr.bJ);
      this.b(cyw.wE, fqr.bJ);
      this.b(cyw.wD, fqr.bJ);
      this.b(cyw.wF, fqr.bJ);
      this.b(cyw.wG, fqr.bJ);
      this.b(cyw.wH, fqr.bJ);
      this.b(cyw.wI, fqr.bJ);
      this.b(cyw.wJ, fqr.bJ);
      this.b(cyw.wK, fqr.bJ);
      this.b(cyw.wT, fqr.bJ);
      this.b(cyw.wU, fqr.bJ);
      this.b(cyw.wL, fqr.bJ);
      this.b(cyw.wM, fqr.bJ);
      this.b(cyw.wP, fqr.bJ);
      this.b(cyw.wN, fqr.bJ);
      this.b(cyw.wQ, fqr.bJ);
      this.b(cyw.wR, fqr.bJ);
      this.b(cyw.wS, fqr.bJ);
      this.b(cyw.vR, fqr.bI);
      this.b(cyw.vP, fqr.bI);
      this.b(cyw.wX, fqr.bI);
      this.b(cyw.pX, fqr.bK);
      this.b(cyw.pY, fqr.bK);
      this.b(cyw.pt, fqr.bI);
      this.b(cyw.pW, fqr.bK);
      this.b(cyw.pu, fqr.bI);
      this.b(cyw.pV, fqr.bK);
      this.b(cyw.pU, fqr.bK);
      this.b(cyw.vA, fqr.bI);
      this.b(cyw.vB, fqr.bI);
      this.b(cyw.vv, fqr.bI);
      this.b(cyw.oz, fqr.bI);
      this.b(cyw.oA, fqr.bI);
      this.b(cyw.sk, fqr.bI);
      this.b(cyw.qI, fqr.bI);
      this.b(cyw.oN, fqr.bI);
      this.b(cyw.oO, fqr.bI);
      this.b(cyw.rz, fqr.bI);
      this.b(cyw.ox, fqr.bI);
      this.b(cyw.xh, fqr.bI);
      this.b(cyw.sp, fqr.bI);
      this.b(cyw.vl, fqr.bI);
      this.b(cyw.wl, fqr.bI);
      this.b(cyw.qG, fqr.bI);
      this.b(cyw.rm, fqr.bI);
      this.b(cyw.vD, fqr.bI);
      this.b(cyw.vC, fqr.bI);
      this.b(cyw.sd, fqr.bI);
      this.b(cyw.rq, fqr.bI);
      this.b(cyw.vw, fqr.bI);
      this.b(cyw.st, fqr.bI);
      this.b(cyw.pl, fqr.bI);
      this.b(cyw.vE, fqr.bI);
      this.b(cyw.vH, fqr.bI);
      this.b(cyw.vI, fqr.bI);
      this.b(cyw.vG, fqr.bI);
      this.b(cyw.sx, fqr.bI);
      this.b(cyw.tf, fqr.bI);
      this.b(cyw.op, fqr.bI);
      this.b(cyw.sb, fqr.bI);
      this.b(cyw.rr, fqr.bI);
      this.b(cyw.oY, fqr.bI);
      this.b(cyw.sW, fqr.bI);
      this.b(cyw.wy, fqr.bI);
      this.b(cyw.xe, fqr.bI);
      this.b(cyw.rB, fqr.bI);
      this.b(cyw.rn, fqr.bI);
      this.b(cyw.yy, fqr.bI);
      this.b(cyw.wt, fqr.bI);
      this.b(cyw.tn, fqr.bI);
      this.b(cyw.oB, fqr.bI);
      this.b(cyw.oC, fqr.bI);
      this.b(cyw.pZ, fqr.bK);
      this.b(cyw.pD, fqr.bK);
      this.b(cyw.pE, fqr.bK);
      this.b(cyw.pC, fqr.bK);
      this.b(cyw.pB, fqr.bK);
      this.b(cyw.pA, fqr.bK);
      this.b(cyw.sB, fqr.bI);
      this.b(cyw.xa, fqr.bI);
      this.b(cyw.ot, fqr.bI);
      this.b(cyw.wx, fqr.bI);
      this.b(cyw.sc, fqr.bI);
      this.b(cyw.rt, fqr.bI);
      this.b(cyw.ru, fqr.bI);
      this.b(cyw.rv, fqr.bI);
      this.b(cyw.rk, fqr.bI);
      this.b(cyw.qf, fqr.bI);
      this.b(cyw.sj, fqr.bI);
      this.b(cyw.va, fqr.bI);
      this.b(cyw.ve, fqr.cc);
      this.b(cyw.py, fqr.bK);
      this.b(cyw.pz, fqr.bK);
      this.b(cyw.px, fqr.bK);
      this.b(cyw.pw, fqr.bK);
      this.b(cyw.pv, fqr.bK);
      this.b(cyw.vb, fqr.bI);
      this.b(cyw.vc, fqr.bI);
      this.b(cyw.sn, fqr.bI);
      this.b(cyw.yA, fqr.bI);
      this.b(cyw.yB, fqr.bI);
      this.b(cyw.yC, fqr.bI);
      this.b(cyw.yD, fqr.bI);
      this.b(cyw.yE, fqr.bI);
      this.b(cyw.yF, fqr.bI);
      this.b(cyw.yG, fqr.bI);
      this.b(cyw.yH, fqr.bI);
      this.b(cyw.yI, fqr.bI);
      this.b(cyw.yJ, fqr.bI);
      this.b(cyw.yK, fqr.bI);
      this.b(cyw.yL, fqr.bI);
      this.b(cyw.yM, fqr.bI);
      this.b(cyw.yN, fqr.bI);
      this.b(cyw.yO, fqr.bI);
      this.b(cyw.yP, fqr.bI);
      this.b(cyw.yQ, fqr.bI);
      this.b(cyw.yR, fqr.bI);
      this.b(cyw.yS, fqr.bI);
      this.b(cyw.wB, cyw.pZ, fqr.bK);
      this.b(cyw.qK, cyw.qJ, fqr.bI);
      this.a(cyw.oX, dha.g, a, false);
      this.a(cyw.qh, dha.b, a, true);
      this.a(cyw.qi, dha.b, b, true);
      this.a(cyw.qj, dha.b, c, true);
      this.a(cyw.qk, dha.b, d, true);
      this.a(cyw.ql, dha.c, a, false);
      this.a(cyw.qm, dha.c, b, false);
      this.a(cyw.qn, dha.c, c, false);
      this.a(cyw.qo, dha.c, d, false);
      this.a(cyw.qp, dha.d, a, false);
      this.a(cyw.qq, dha.d, b, false);
      this.a(cyw.qr, dha.d, c, false);
      this.a(cyw.qs, dha.d, d, false);
      this.a(cyw.qt, dha.f, a, false);
      this.a(cyw.qu, dha.f, b, false);
      this.a(cyw.qv, dha.f, c, false);
      this.a(cyw.qw, dha.f, d, false);
      this.a(cyw.qx, dha.e, a, false);
      this.a(cyw.qy, dha.e, b, false);
      this.a(cyw.qz, dha.e, c, false);
      this.a(cyw.qA, dha.e, d, false);
      this.a(cyw.qB, dha.h, a, false);
      this.a(cyw.qC, dha.h, b, false);
      this.a(cyw.qD, dha.h, c, false);
      this.a(cyw.qE, dha.h, d, false);
      this.a(cyw.vN, -6265536);
      this.b(cyw.yT, fqr.bI);
      this.b(cyw.yU, fqr.bI);
      this.b(cyw.yV, fqr.bI);
      this.b(cyw.yW, fqr.bI);
      this.b(cyw.yX, fqr.bI);
      this.b(cyw.yY, fqr.bI);
      this.b(cyw.yZ, fqr.bI);
      this.b(cyw.za, fqr.bI);
      this.b(cyw.zb, fqr.bI);
      this.b(cyw.zc, fqr.bI);
      this.b(cyw.zd, fqr.bI);
      this.b(cyw.ze, fqr.bI);
      this.b(cyw.zf, fqr.bI);
      this.b(cyw.zg, fqr.bI);
      this.b(cyw.zh, fqr.bI);
      this.b(cyw.zi, fqr.bI);
      this.b(cyw.zj, fqr.bI);
      this.b(cyw.zk, fqr.bI);
      this.b(cyw.zl, fqr.bI);
      this.b(cyw.zm, fqr.bI);
      this.b(cyw.zn, fqr.bI);
      this.b(cyw.zo, fqr.bI);
      this.b(cyw.zp, fqr.bI);
      this.b(cyw.zH, fqr.bI);
      this.b(cyw.zI, fqr.bI);
      this.b(cyw.zK, fqr.bI);
      this.a(cyw.vy, new fpo());
      this.a(cyw.sV, "_markings", new fps());
      this.f(cyw.rF);
      this.f(cyw.rV);
      this.f(cyw.rG);
      this.f(cyw.rN);
      this.f(cyw.rO);
      this.f(cyw.rJ);
      this.f(cyw.rR);
      this.f(cyw.rP);
      this.f(cyw.rK);
      this.f(cyw.rU);
      this.f(cyw.rQ);
      this.f(cyw.rI);
      this.f(cyw.rM);
      this.f(cyw.rT);
      this.f(cyw.rL);
      this.f(cyw.rS);
      this.f(cyw.rH);
      this.n(cyw.rY);
      this.o(cyw.wW);
      this.r(cyw.pa);
      this.g(cyw.pe);
      this.h(cyw.wZ);
      this.i(cyw.oy);
      this.j(cyw.yz);
      this.k(cyw.rW);
      this.l(cyw.xm);
      this.m(cyw.ww);
      this.q(cyw.wu);
      this.p(cyw.tm);
      this.p(cyw.ws);
      this.p(cyw.wv);
      this.a(cyw.tv, 11366765, 8538184);
      this.a(cyw.tw, 56063, 44543);
      this.a(cyw.tx, 16499171, 10890612);
      this.a(cyw.ty, 4996656, 986895);
      this.a(cyw.tz, 15582019, 4400155);
      this.a(cyw.tA, 16167425, 16775294);
      this.a(cyw.tB, 9084018, 3231003);
      this.a(cyw.tC, 11506911, 9529055);
      this.a(cyw.tD, 15714446, 9794134);
      this.a(cyw.tE, 16565097, 13341495);
      this.a(cyw.tF, 803406, 11013646);
      this.a(cyw.tG, 10592673, 16711680);
      this.a(cyw.tH, 12691306, 15058059);
      this.a(cyw.tI, 4470310, 10592673);
      this.a(cyw.tJ, 894731, 0);
      this.a(cyw.tK, 2243405, 16382457);
      this.a(cyw.tL, 5457209, 8811878);
      this.a(cyw.tM, 9433559, 7969893);
      this.a(cyw.tN, 13552826, 7632531);
      this.a(cyw.tO, 1842204, 14711290);
      this.a(cyw.tP, 1447446, 0);
      this.a(cyw.tQ, 1447446, 7237230);
      this.a(cyw.tR, 9804699, 1973274);
      this.a(cyw.tS, 14005919, 13396256);
      this.a(cyw.tT, 13661252, 16762748);
      this.a(cyw.tU, 16382457, 12369084);
      this.a(cyw.tV, 611926, 8778172);
      this.a(cyw.tW, 10851452, 5589310);
      this.a(cyw.tX, 5931634, 15826224);
      this.a(cyw.tY, 13004373, 6251620);
      this.a(cyw.tZ, 12623485, 15656192);
      this.a(cyw.ua, 7958625, 15125652);
      this.a(cyw.ub, 14405058, 7643954);
      this.a(cyw.uc, 12623485, 10051392);
      this.a(cyw.ud, 3407872, 16579584);
      this.a(cyw.ue, 10489616, 12040119);
      this.a(cyw.uf, 1769984, 5321501);
      this.a(cyw.ug, 15720061, 5653556);
      this.a(cyw.uh, 15198183, 1776418);
      this.a(cyw.ui, 894731, 16711680);
      this.a(cyw.uj, 4411786, 8978176);
      this.a(cyw.uk, 15771042, 14377823);
      this.a(cyw.ul, 10051392, 16380836);
      this.a(cyw.um, 5843472, 16380836);
      this.a(cyw.un, 5451574, 9804699);
      this.a(cyw.uo, 15658718, 14014157);
      this.a(cyw.up, 16167425, 3654642);
      this.a(cyw.uq, 10051392, 7555121);
      this.a(cyw.ur, 7697520, 5984329);
      this.a(cyw.us, 10489616, 951412);
      this.a(cyw.ut, 15198183, 16758197);
      this.a(cyw.uu, 9725844, 5060690);
      this.a(cyw.uv, 7237230, 3158064);
      this.a(cyw.uw, 12698049, 4802889);
      this.a(cyw.ux, 6842447, 15066584);
      this.a(cyw.uy, 5349438, 8306542);
      this.a(cyw.uz, 8855049, 2468720);
      this.a(cyw.uA, 14283506, 8496292);
      this.a(cyw.uB, 3419431, 11013646);
      this.a(cyw.uC, 2243405, 7375001);
      this.a(cyw.uD, 6387319, 14543594);
      this.a(cyw.uE, 10236982, 5065037);
      this.a(cyw.uF, 7164733, 1444352);
      this.a(cyw.uG, 15377456, 4547222);
      this.a(cyw.uH, 15690005, 16775663);
      this.a(cyw.uI, 15198183, 44975);
      this.a(cyw.uJ, 8032420, 15265265);
      this.a(cyw.uK, 5651507, 12422002);
      this.a(cyw.uL, 9804699, 2580065);
      this.a(cyw.uM, 4547222, 15377456);
      this.a(cyw.uN, 1001033, 3790560);
      this.a(cyw.uO, 3407872, 5349438);
      this.a(cyw.uP, 1315860, 5075616);
      this.a(cyw.uQ, 1315860, 4672845);
      this.a(cyw.uR, 14144467, 13545366);
      this.a(cyw.uS, 13004373, 15132390);
      this.a(cyw.uT, 6250335, 16545810);
      this.a(cyw.uU, 44975, 7969893);
      this.a(cyw.uV, 3232308, 9945732);
      this.a(cyw.uW, 5651507, 7969893);
      this.a(cyw.uX, 15373203, 5009705);
      this.a(cyw.a);
      this.a(cyw.ys);
      this.a(cyw.yp);
      this.a(cyw.yq);
      this.a(cyw.yr);
      this.a(cyw.ee);
      this.a(cyw.ed);
      this.a(cyw.ec);
      this.a(cyw.yt);
      this.a(cyw.sA);
      this.a(cyw.sa);
      this.a(cyw.qc);
      this.a(cyw.vO);
   }

   public static record a(dhe a, ald<dhf> b) {
   }
}
