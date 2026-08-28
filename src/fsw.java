import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fsw {
   private static final fsn f = fti.a(-1);
   public static final ali a = a("helmet");
   public static final ali b = a("chestplate");
   public static final ali c = a("leggings");
   public static final ali d = a("boots");
   public static final List<fsw.a> e = List.of(
      new fsw.a(dik.d, dim.a),
      new fsw.a(dik.e, dim.b),
      new fsw.a(dik.f, dim.c),
      new fsw.a(dik.g, dim.d),
      new fsw.a(dik.h, dim.e),
      new fsw.a(dik.i, dim.f),
      new fsw.a(dik.j, dim.g),
      new fsw.a(dik.k, dim.h),
      new fsw.a(dik.l, dim.i),
      new fsw.a(dik.m, dim.j),
      new fsw.a(dik.n, dim.k)
   );
   private final fsx g;
   private final BiConsumer<ali, ftj> h;

   public static ali a(String $$0) {
      return ali.b("trims/items/" + $$0 + "_trim");
   }

   public fsw(fsx $$0, BiConsumer<ali, ftj> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(czu $$0) {
      this.g.a($$0, fti.a(ftk.a($$0)));
   }

   private ali a(czu $$0, ftl $$1) {
      return $$1.a(ftk.a($$0), ftn.b($$0), this.h);
   }

   private void b(czu $$0, ftl $$1) {
      this.g.a($$0, fti.a(this.a($$0, $$1)));
   }

   private ali a(czu $$0, String $$1, ftl $$2) {
      return $$2.a(ftk.a($$0, $$1), ftn.k(ftn.a($$0, $$1)), this.h);
   }

   private ali a(czu $$0, czu $$1, ftl $$2) {
      return $$2.a(ftk.a($$0), ftn.b($$1), this.h);
   }

   private void b(czu $$0, czu $$1, ftl $$2) {
      this.g.a($$0, fti.a(this.a($$0, $$1, $$2)));
   }

   private void a(czu $$0, fsn $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(czu $$0, String $$1, fsn $$2) {
      ali $$3 = this.a($$0, ftn.c($$0), ftn.a($$0, $$1));
      this.g.a($$0, fti.a($$3, f, $$2));
   }

   private List<hhv.a> b(czu $$0) {
      List<hhv.a> $$1 = new ArrayList<>();
      hhp.b $$2 = fti.a(this.a($$0, "_16", ftm.bI));
      $$1.add(fti.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azo.b($$3 - 16, 32);
         hhp.b $$5 = fti.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), ftm.bI));
         $$1.add(fti.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fti.a($$2, 31.5F));
      return $$1;
   }

   private void c(czu $$0) {
      List<hhv.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fti.a(
               fti.a(kk.ah),
               fti.a(new hir(true, his.a.b), 32.0F, $$1),
               fti.a(fti.a(new hir(true, his.a.c), 32.0F, $$1), fti.a(new hir(true, his.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(czu $$0) {
      this.g.a($$0, fti.a(new hir(true, his.a.d), 32.0F, this.b($$0)));
   }

   private void e(czu $$0) {
      List<hhv.a> $$1 = new ArrayList<>();
      hhp.b $$2 = fti.a(this.a($$0, "_00", ftm.bI));
      $$1.add(fti.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hhp.b $$4 = fti.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), ftm.bI));
         $$1.add(fti.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fti.a($$2, 63.5F));
      this.g.a($$0, fti.a(fti.a(new hjb(true, hjb.a.b), 64.0F, $$1), fti.a(new hjb(true, hjb.a.a), 64.0F, $$1)));
   }

   private ali a(czu $$0, ali $$1, ali $$2) {
      return ftm.bM.a($$0, ftn.c($$1, $$2), this.h);
   }

   private ali a(ali $$0, ali $$1, ali $$2) {
      return ftm.bM.a($$0, ftn.c($$1, $$2), this.h);
   }

   private void a(ali $$0, ali $$1, ali $$2, ali $$3) {
      ftm.bN.a($$0, ftn.a($$1, $$2, $$3), this.h);
   }

   private void a(czu $$0, alh<dif> $$1, ali $$2, boolean $$3) {
      ali $$4 = ftk.a($$0);
      ali $$5 = ftn.c($$0);
      ali $$6 = ftn.a($$0, "_overlay");
      List<hhw.b<alh<dil>>> $$7 = new ArrayList<>(e.size());

      for (fsw.a $$8 : e) {
         ali $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         ali $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hhp.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fti.a($$9, new fsk(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fti.a($$9);
         }

         $$7.add(fti.a($$8.b, $$11));
      }

      hhp.b $$13;
      if ($$3) {
         ftm.bM.a($$4, ftn.c($$5, $$6), this.h);
         $$13 = fti.a($$4, new fsk(-6265536));
      } else {
         ftm.bI.a($$4, ftn.k($$5), this.h);
         $$13 = fti.a($$4);
      }

      this.g.a($$0, fti.a(new hjr(), $$13, $$7));
   }

   private void f(czu $$0) {
      hhp.b $$1 = fti.a(this.a($$0, ftm.bI));
      ali $$2 = this.a($$0, ftm.bS, "_open_back");
      ali $$3 = this.a($$0, ftm.bR, "_open_front");
      hhp.b $$4 = fti.a(fti.a($$2), new hhk.a(), fti.a($$3));
      hhp.b $$5 = fti.a(new hia(), $$4, $$1);
      this.g.a($$0, fti.a(new hjl(), $$1, fti.a(czw.g, $$5)));
   }

   private ali a(czu $$0, ftl $$1, String $$2) {
      ali $$3 = ftn.a($$0, $$2);
      return $$1.a($$0, ftn.k($$3), this.h);
   }

   private void g(czu $$0) {
      hhp.b $$1 = fti.a(ftk.a($$0));
      hhp.b $$2 = fti.a(this.a($$0, "_pulling_0", ftm.bT));
      hhp.b $$3 = fti.a(this.a($$0, "_pulling_1", ftm.bT));
      hhp.b $$4 = fti.a(this.a($$0, "_pulling_2", ftm.bT));
      this.g.a($$0, fti.a(fti.a(), fti.a(new hjd(false), 0.05F, $$2, fti.a($$3, 0.65F), fti.a($$4, 0.9F)), $$1));
   }

   private void h(czu $$0) {
      hhp.b $$1 = fti.a(ftk.a($$0));
      hhp.b $$2 = fti.a(this.a($$0, "_pulling_0", ftm.bU));
      hhp.b $$3 = fti.a(this.a($$0, "_pulling_1", ftm.bU));
      hhp.b $$4 = fti.a(this.a($$0, "_pulling_2", ftm.bU));
      hhp.b $$5 = fti.a(this.a($$0, "_arrow", ftm.bU));
      hhp.b $$6 = fti.a(this.a($$0, "_firework", ftm.bU));
      this.g
         .a($$0, fti.a(new hjg(), fti.a(fti.a(), fti.a(new hiv(), $$2, fti.a($$3, 0.58F), fti.a($$4, 1.0F)), $$1), fti.a(cyr.a.b, $$5), fti.a(cyr.a.c, $$6)));
   }

   private void a(czu $$0, hid $$1, hhp.b $$2, hhp.b $$3) {
      this.g.a($$0, fti.a($$1, $$2, $$3));
   }

   private void i(czu $$0) {
      hhp.b $$1 = fti.a(this.a($$0, ftm.bI));
      hhp.b $$2 = fti.a(this.a($$0, "_broken", ftm.bI));
      this.a($$0, new hhz(), $$2, $$1);
   }

   private void j(czu $$0) {
      hhp.b $$1 = fti.a(ftk.a($$0));
      hhp.b $$2 = fti.a(ftk.a($$0, "_brushing_0"));
      hhp.b $$3 = fti.a(ftk.a($$0, "_brushing_1"));
      hhp.b $$4 = fti.a(ftk.a($$0, "_brushing_2"));
      this.g.a($$0, fti.a(new hjc(10.0F), 0.1F, $$1, fti.a($$2, 0.25F), fti.a($$3, 0.5F), fti.a($$4, 0.75F)));
   }

   private void k(czu $$0) {
      hhp.b $$1 = fti.a(this.a($$0, ftm.bL));
      hhp.b $$2 = fti.a(this.a($$0, "_cast", ftm.bL));
      this.a($$0, new hih(), $$2, $$1);
   }

   private void l(czu $$0) {
      hhp.b $$1 = fti.a(ftk.a($$0));
      hhp.b $$2 = fti.a(ftk.b("tooting_goat_horn"));
      this.a($$0, fti.a(), $$2, $$1);
   }

   private void m(czu $$0) {
      hhp.b $$1 = fti.a(ftk.a($$0), new hkb.a());
      hhp.b $$2 = fti.a(ftk.a($$0, "_blocking"), new hkb.a());
      this.a($$0, fti.a(), $$2, $$1);
   }

   private static hhp.b a(hhp.b $$0, hhp.b $$1) {
      return fti.a(new hjl(), $$1, fti.a(List.of(czw.g, czw.h, czw.i), $$0));
   }

   private void n(czu $$0) {
      hhp.b $$1 = fti.a(this.a($$0, ftm.bI));
      hhp.b $$2 = fti.a(ftk.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(czu $$0) {
      hhp.b $$1 = fti.a(this.a($$0, ftm.bI));
      hhp.b $$2 = fti.a(ftk.a($$0, "_in_hand"), new hkh.a());
      hhp.b $$3 = fti.a(ftk.a($$0, "_throwing"), new hkh.a());
      hhp.b $$4 = fti.a(fti.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(czu $$0, ali $$1) {
      this.g.a($$0, fti.a($$1, new fsq()));
   }

   private void p(czu $$0) {
      ali $$1 = this.a($$0, ftk.b("potion_overlay"), ftk.a($$0));
      this.a($$0, $$1);
   }

   private void q(czu $$0) {
      ali $$1 = this.a($$0, ftk.a($$0, "_head"), ftk.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(czu $$0, int $$1) {
      ali $$2 = this.a($$0, ftm.bI);
      this.g.a($$0, fti.a($$2, new fsk($$1)));
   }

   private void r(czu $$0) {
      ali $$1 = ftn.c($$0);
      ali $$2 = ftn.a($$0, "_overlay");
      ali $$3 = ftm.bI.a($$0, ftn.k($$1), this.h);
      ali $$4 = ftk.a($$0, "_dyed");
      ftm.bM.a($$4, ftn.c($$1, $$2), this.h);
      this.g.a($$0, fti.a(fti.a(kk.K), fti.a($$4, f, new fsk(0)), fti.a($$3)));
   }

   public void a() {
      this.b(dac.oM, ftm.bI);
      this.b(dac.oO, ftm.bI);
      this.b(dac.oN, ftm.bI);
      this.b(dac.oP, ftm.bI);
      this.b(dac.pr, ftm.bI);
      this.b(dac.pi, ftm.bI);
      this.b(dac.pe, ftm.bI);
      this.b(dac.vQ, ftm.bI);
      this.b(dac.pk, ftm.bI);
      this.b(dac.vr, ftm.bI);
      this.b(dac.ej, ftm.bK);
      this.b(dac.ti, ftm.bI);
      this.b(dac.wv, ftm.bI);
      this.b(dac.wx, ftm.bI);
      this.b(dac.oI, ftm.bI);
      this.b(dac.oJ, ftm.bI);
      this.b(dac.sF, ftm.bI);
      this.b(dac.tw, ftm.bI);
      this.b(dac.to, ftm.bK);
      this.b(dac.sB, ftm.bI);
      this.b(dac.sG, ftm.bI);
      this.b(dac.xs, ftm.bI);
      this.b(dac.rF, ftm.bI);
      this.b(dac.ph, ftm.bI);
      this.b(dac.ql, ftm.bI);
      this.b(dac.rB, ftm.bI);
      this.b(dac.vk, ftm.bK);
      this.b(dac.sC, ftm.bI);
      this.b(dac.ro, ftm.bI);
      this.b(dac.oA, ftm.bL);
      this.b(dac.oB, ftm.bL);
      this.b(dac.pm, ftm.bI);
      this.b(dac.ow, ftm.bI);
      this.b(dac.tk, ftm.bI);
      this.b(dac.wr, ftm.bI);
      this.b(dac.rC, ftm.bI);
      this.e(dac.se);
      this.b(dac.pl, ftm.bI);
      this.b(dac.rx, ftm.bI);
      this.b(dac.vX, ftm.bI);
      this.c(dac.rK);
      this.d(dac.rL);
      this.b(dac.tj, ftm.bI);
      this.b(dac.tl, ftm.bI);
      this.b(dac.sl, ftm.bI);
      this.b(dac.vZ, ftm.bI);
      this.b(dac.qM, ftm.bI);
      this.b(dac.vM, ftm.bI);
      this.b(dac.sm, ftm.bI);
      this.b(dac.ta, ftm.bI);
      this.b(dac.pu, ftm.bI);
      this.b(dac.pv, ftm.bI);
      this.b(dac.xk, ftm.bI);
      this.b(dac.sz, ftm.bI);
      this.b(dac.oQ, ftm.bI);
      this.b(dac.oR, ftm.bI);
      this.b(dac.pn, ftm.bI);
      this.b(dac.pX, ftm.bK);
      this.b(dac.pY, ftm.bK);
      this.b(dac.vT, ftm.bI);
      this.b(dac.pW, ftm.bK);
      this.b(dac.pV, ftm.bK);
      this.b(dac.pU, ftm.bK);
      this.b(dac.wy, ftm.bI);
      this.b(dac.tf, ftm.bI);
      this.b(dac.rH, ftm.bI);
      this.b(dac.rI, ftm.bI);
      this.b(dac.rJ, ftm.bI);
      this.b(dac.po, ftm.bI);
      this.b(dac.vG, ftm.bI);
      this.b(dac.tA, ftm.bI);
      this.b(dac.tn, ftm.bI);
      this.b(dac.wq, ftm.bI);
      this.b(dac.vf, ftm.bI);
      this.b(dac.tv, ftm.bI);
      this.b(dac.xr, ftm.bI);
      this.b(dac.vE, ftm.bI);
      this.b(dac.vg, ftm.bI);
      this.b(dac.qK, ftm.bI);
      this.b(dac.pg, ftm.bI);
      this.b(dac.xp, ftm.bI);
      this.b(dac.xj, ftm.bI);
      this.b(dac.ox, ftm.bI);
      this.b(dac.tp, ftm.bI);
      this.b(dac.ts, ftm.bI);
      this.b(dac.tB, ftm.bI);
      this.b(dac.xn, ftm.bI);
      this.b(dac.xH, ftm.bI);
      this.b(dac.sg, ftm.bI);
      this.b(dac.so, ftm.bI);
      this.b(dac.vn, ftm.bI);
      this.b(dac.pw, ftm.bI);
      this.b(dac.qO, ftm.bI);
      this.b(dac.pN, ftm.bK);
      this.b(dac.vu, ftm.bI);
      this.b(dac.pO, ftm.bK);
      this.b(dac.vS, ftm.bI);
      this.b(dac.pM, ftm.bK);
      this.b(dac.pL, ftm.bK);
      this.b(dac.pK, ftm.bK);
      this.b(dac.px, ftm.bI);
      this.b(dac.tq, ftm.bI);
      this.b(dac.sx, ftm.bI);
      this.b(dac.sD, ftm.bI);
      this.b(dac.qi, ftm.bI);
      this.b(dac.xq, ftm.bI);
      this.b(dac.xf, ftm.bI);
      this.b(dac.xL, ftm.bI);
      this.b(dac.xO, ftm.bI);
      this.b(dac.oz, ftm.bI);
      this.b(dac.sn, ftm.bI);
      this.b(dac.ps, ftm.bI);
      this.b(dac.pS, ftm.bK);
      this.b(dac.pT, ftm.bK);
      this.b(dac.vR, ftm.bI);
      this.b(dac.pt, ftm.bI);
      this.b(dac.wG, ftm.bI);
      this.b(dac.pR, ftm.bK);
      this.b(dac.pQ, ftm.bK);
      this.b(dac.pP, ftm.bK);
      this.b(dac.vm, ftm.bI);
      this.b(dac.oK, ftm.bI);
      this.b(dac.oL, ftm.bI);
      this.b(dac.wH, ftm.bI);
      this.b(dac.pp, ftm.bI);
      this.b(dac.rq, ftm.bI);
      this.b(dac.rt, ftm.bI);
      this.b(dac.st, ftm.bI);
      this.b(dac.sy, ftm.bI);
      this.b(dac.sv, ftm.bI);
      this.b(dac.ss, ftm.bI);
      this.b(dac.tx, ftm.bI);
      this.b(dac.oU, ftm.bI);
      this.b(dac.oV, ftm.bI);
      this.b(dac.oW, ftm.bI);
      this.b(dac.oX, ftm.bI);
      this.b(dac.vt, ftm.bI);
      this.b(dac.te, ftm.bI);
      this.b(dac.ru, ftm.bI);
      this.b(dac.ov, ftm.bI);
      this.b(dac.xm, ftm.bI);
      this.b(dac.qf, ftm.bI);
      this.b(dac.xc, ftm.bI);
      this.b(dac.wV, ftm.bJ);
      this.b(dac.wJ, ftm.bJ);
      this.b(dac.wL, ftm.bJ);
      this.b(dac.wK, ftm.bJ);
      this.b(dac.wM, ftm.bJ);
      this.b(dac.wN, ftm.bJ);
      this.b(dac.wO, ftm.bJ);
      this.b(dac.wP, ftm.bJ);
      this.b(dac.wQ, ftm.bJ);
      this.b(dac.wR, ftm.bJ);
      this.b(dac.xa, ftm.bJ);
      this.b(dac.xb, ftm.bJ);
      this.b(dac.wS, ftm.bJ);
      this.b(dac.wT, ftm.bJ);
      this.b(dac.wW, ftm.bJ);
      this.b(dac.wU, ftm.bJ);
      this.b(dac.wX, ftm.bJ);
      this.b(dac.wY, ftm.bJ);
      this.b(dac.wZ, ftm.bJ);
      this.b(dac.vY, ftm.bI);
      this.b(dac.vW, ftm.bI);
      this.b(dac.xe, ftm.bI);
      this.b(dac.qc, ftm.bK);
      this.b(dac.qd, ftm.bK);
      this.b(dac.py, ftm.bI);
      this.b(dac.qb, ftm.bK);
      this.b(dac.pz, ftm.bI);
      this.b(dac.qa, ftm.bK);
      this.b(dac.pZ, ftm.bK);
      this.b(dac.vH, ftm.bI);
      this.b(dac.vI, ftm.bI);
      this.b(dac.vC, ftm.bI);
      this.b(dac.oE, ftm.bI);
      this.b(dac.oF, ftm.bI);
      this.b(dac.sr, ftm.bI);
      this.b(dac.qN, ftm.bI);
      this.b(dac.oS, ftm.bI);
      this.b(dac.oT, ftm.bI);
      this.b(dac.rE, ftm.bI);
      this.b(dac.oC, ftm.bI);
      this.b(dac.xo, ftm.bI);
      this.b(dac.sw, ftm.bI);
      this.b(dac.vs, ftm.bI);
      this.b(dac.ws, ftm.bI);
      this.b(dac.qL, ftm.bI);
      this.b(dac.rr, ftm.bI);
      this.b(dac.vK, ftm.bI);
      this.b(dac.vJ, ftm.bI);
      this.b(dac.sk, ftm.bI);
      this.b(dac.rv, ftm.bI);
      this.b(dac.vD, ftm.bI);
      this.b(dac.sA, ftm.bI);
      this.b(dac.pq, ftm.bI);
      this.b(dac.vL, ftm.bI);
      this.b(dac.vO, ftm.bI);
      this.b(dac.vP, ftm.bI);
      this.b(dac.vN, ftm.bI);
      this.b(dac.sE, ftm.bI);
      this.b(dac.tm, ftm.bI);
      this.b(dac.ou, ftm.bI);
      this.b(dac.si, ftm.bI);
      this.b(dac.rw, ftm.bI);
      this.b(dac.pd, ftm.bI);
      this.b(dac.td, ftm.bI);
      this.b(dac.wF, ftm.bI);
      this.b(dac.xl, ftm.bI);
      this.b(dac.rG, ftm.bI);
      this.b(dac.rs, ftm.bI);
      this.b(dac.yF, ftm.bI);
      this.b(dac.wA, ftm.bI);
      this.b(dac.tu, ftm.bI);
      this.b(dac.oG, ftm.bI);
      this.b(dac.oH, ftm.bI);
      this.b(dac.qe, ftm.bK);
      this.b(dac.pI, ftm.bK);
      this.b(dac.pJ, ftm.bK);
      this.b(dac.pH, ftm.bK);
      this.b(dac.pG, ftm.bK);
      this.b(dac.pF, ftm.bK);
      this.b(dac.sI, ftm.bI);
      this.b(dac.xh, ftm.bI);
      this.b(dac.oy, ftm.bI);
      this.b(dac.wE, ftm.bI);
      this.b(dac.sj, ftm.bI);
      this.b(dac.ry, ftm.bI);
      this.b(dac.rz, ftm.bI);
      this.b(dac.rA, ftm.bI);
      this.b(dac.rp, ftm.bI);
      this.b(dac.qk, ftm.bI);
      this.b(dac.sq, ftm.bI);
      this.b(dac.vh, ftm.bI);
      this.b(dac.vl, ftm.cc);
      this.b(dac.pD, ftm.bK);
      this.b(dac.pE, ftm.bK);
      this.b(dac.pC, ftm.bK);
      this.b(dac.pB, ftm.bK);
      this.b(dac.pA, ftm.bK);
      this.b(dac.vi, ftm.bI);
      this.b(dac.vj, ftm.bI);
      this.b(dac.su, ftm.bI);
      this.b(dac.yH, ftm.bI);
      this.b(dac.yI, ftm.bI);
      this.b(dac.yJ, ftm.bI);
      this.b(dac.yK, ftm.bI);
      this.b(dac.yL, ftm.bI);
      this.b(dac.yM, ftm.bI);
      this.b(dac.yN, ftm.bI);
      this.b(dac.yO, ftm.bI);
      this.b(dac.yP, ftm.bI);
      this.b(dac.yQ, ftm.bI);
      this.b(dac.yR, ftm.bI);
      this.b(dac.yS, ftm.bI);
      this.b(dac.yT, ftm.bI);
      this.b(dac.yU, ftm.bI);
      this.b(dac.yV, ftm.bI);
      this.b(dac.yW, ftm.bI);
      this.b(dac.yX, ftm.bI);
      this.b(dac.yY, ftm.bI);
      this.b(dac.yZ, ftm.bI);
      this.b(dac.wI, dac.qe, ftm.bK);
      this.b(dac.qP, dac.qO, ftm.bI);
      this.a(dac.pc, dig.g, a, false);
      this.a(dac.qm, dig.b, a, true);
      this.a(dac.qn, dig.b, b, true);
      this.a(dac.qo, dig.b, c, true);
      this.a(dac.qp, dig.b, d, true);
      this.a(dac.qq, dig.c, a, false);
      this.a(dac.qr, dig.c, b, false);
      this.a(dac.qs, dig.c, c, false);
      this.a(dac.qt, dig.c, d, false);
      this.a(dac.qu, dig.d, a, false);
      this.a(dac.qv, dig.d, b, false);
      this.a(dac.qw, dig.d, c, false);
      this.a(dac.qx, dig.d, d, false);
      this.a(dac.qy, dig.f, a, false);
      this.a(dac.qz, dig.f, b, false);
      this.a(dac.qA, dig.f, c, false);
      this.a(dac.qB, dig.f, d, false);
      this.a(dac.qC, dig.e, a, false);
      this.a(dac.qD, dig.e, b, false);
      this.a(dac.qE, dig.e, c, false);
      this.a(dac.qF, dig.e, d, false);
      this.a(dac.qG, dig.h, a, false);
      this.a(dac.qH, dig.h, b, false);
      this.a(dac.qI, dig.h, c, false);
      this.a(dac.qJ, dig.h, d, false);
      this.a(dac.vU, -6265536);
      this.b(dac.za, ftm.bI);
      this.b(dac.zb, ftm.bI);
      this.b(dac.zc, ftm.bI);
      this.b(dac.zd, ftm.bI);
      this.b(dac.ze, ftm.bI);
      this.b(dac.zf, ftm.bI);
      this.b(dac.zg, ftm.bI);
      this.b(dac.zh, ftm.bI);
      this.b(dac.zi, ftm.bI);
      this.b(dac.zj, ftm.bI);
      this.b(dac.zk, ftm.bI);
      this.b(dac.zl, ftm.bI);
      this.b(dac.zm, ftm.bI);
      this.b(dac.zn, ftm.bI);
      this.b(dac.zo, ftm.bI);
      this.b(dac.zp, ftm.bI);
      this.b(dac.zq, ftm.bI);
      this.b(dac.zr, ftm.bI);
      this.b(dac.zs, ftm.bI);
      this.b(dac.zt, ftm.bI);
      this.b(dac.zu, ftm.bI);
      this.b(dac.zv, ftm.bI);
      this.b(dac.zw, ftm.bI);
      this.b(dac.zO, ftm.bI);
      this.b(dac.zP, ftm.bI);
      this.b(dac.zR, ftm.bI);
      this.a(dac.vF, new fsl());
      this.a(dac.tc, "_markings", new fsp());
      this.f(dac.rM);
      this.f(dac.sc);
      this.f(dac.rN);
      this.f(dac.rU);
      this.f(dac.rV);
      this.f(dac.rQ);
      this.f(dac.rY);
      this.f(dac.rW);
      this.f(dac.rR);
      this.f(dac.sb);
      this.f(dac.rX);
      this.f(dac.rP);
      this.f(dac.rT);
      this.f(dac.sa);
      this.f(dac.rS);
      this.f(dac.rZ);
      this.f(dac.rO);
      this.n(dac.sf);
      this.o(dac.xd);
      this.r(dac.pf);
      this.g(dac.pj);
      this.h(dac.xg);
      this.i(dac.oD);
      this.j(dac.yG);
      this.k(dac.sd);
      this.l(dac.xt);
      this.m(dac.wD);
      this.q(dac.wB);
      this.p(dac.tt);
      this.p(dac.wz);
      this.p(dac.wC);
      this.b(dac.tC, ftm.bI);
      this.b(dac.tD, ftm.bI);
      this.b(dac.tE, ftm.bI);
      this.b(dac.tF, ftm.bI);
      this.b(dac.tG, ftm.bI);
      this.b(dac.tH, ftm.bI);
      this.b(dac.tI, ftm.bI);
      this.b(dac.tJ, ftm.bI);
      this.b(dac.tK, ftm.bI);
      this.b(dac.tL, ftm.bI);
      this.b(dac.tM, ftm.bI);
      this.b(dac.tN, ftm.bI);
      this.b(dac.tO, ftm.bI);
      this.b(dac.tP, ftm.bI);
      this.b(dac.tQ, ftm.bI);
      this.b(dac.tR, ftm.bI);
      this.b(dac.tS, ftm.bI);
      this.b(dac.tT, ftm.bI);
      this.b(dac.tU, ftm.bI);
      this.b(dac.tV, ftm.bI);
      this.b(dac.tW, ftm.bI);
      this.b(dac.tX, ftm.bI);
      this.b(dac.tY, ftm.bI);
      this.b(dac.tZ, ftm.bI);
      this.b(dac.ua, ftm.bI);
      this.b(dac.ub, ftm.bI);
      this.b(dac.uc, ftm.bI);
      this.b(dac.ud, ftm.bI);
      this.b(dac.ue, ftm.bI);
      this.b(dac.uf, ftm.bI);
      this.b(dac.ug, ftm.bI);
      this.b(dac.uh, ftm.bI);
      this.b(dac.ui, ftm.bI);
      this.b(dac.uj, ftm.bI);
      this.b(dac.uk, ftm.bI);
      this.b(dac.ul, ftm.bI);
      this.b(dac.um, ftm.bI);
      this.b(dac.un, ftm.bI);
      this.b(dac.uo, ftm.bI);
      this.b(dac.up, ftm.bI);
      this.b(dac.uq, ftm.bI);
      this.b(dac.ur, ftm.bI);
      this.b(dac.us, ftm.bI);
      this.b(dac.ut, ftm.bI);
      this.b(dac.uu, ftm.bI);
      this.b(dac.uv, ftm.bI);
      this.b(dac.uw, ftm.bI);
      this.b(dac.ux, ftm.bI);
      this.b(dac.uy, ftm.bI);
      this.b(dac.uz, ftm.bI);
      this.b(dac.uA, ftm.bI);
      this.b(dac.uB, ftm.bI);
      this.b(dac.uC, ftm.bI);
      this.b(dac.uD, ftm.bI);
      this.b(dac.uE, ftm.bI);
      this.b(dac.uF, ftm.bI);
      this.b(dac.uG, ftm.bI);
      this.b(dac.uH, ftm.bI);
      this.b(dac.uI, ftm.bI);
      this.b(dac.uJ, ftm.bI);
      this.b(dac.uK, ftm.bI);
      this.b(dac.uL, ftm.bI);
      this.b(dac.uM, ftm.bI);
      this.b(dac.uN, ftm.bI);
      this.b(dac.uO, ftm.bI);
      this.b(dac.uP, ftm.bI);
      this.b(dac.uQ, ftm.bI);
      this.b(dac.uR, ftm.bI);
      this.b(dac.uS, ftm.bI);
      this.b(dac.uT, ftm.bI);
      this.b(dac.uU, ftm.bI);
      this.b(dac.uV, ftm.bI);
      this.b(dac.uW, ftm.bI);
      this.b(dac.uX, ftm.bI);
      this.b(dac.uY, ftm.bI);
      this.b(dac.uZ, ftm.bI);
      this.b(dac.va, ftm.bI);
      this.b(dac.vb, ftm.bI);
      this.b(dac.vc, ftm.bI);
      this.b(dac.vd, ftm.bI);
      this.b(dac.ve, ftm.bI);
      this.a(dac.a);
      this.a(dac.yz);
      this.a(dac.yw);
      this.a(dac.yx);
      this.a(dac.yy);
      this.a(dac.ei);
      this.a(dac.eh);
      this.a(dac.eg);
      this.a(dac.yA);
      this.a(dac.sH);
      this.a(dac.sh);
      this.a(dac.qh);
      this.a(dac.vV);
   }

   public static record a(dik a, alh<dil> b) {
   }
}
