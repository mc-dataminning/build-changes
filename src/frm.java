import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class frm {
   private static final frd f = frx.a(-1);
   public static final alg a = a("helmet");
   public static final alg b = a("chestplate");
   public static final alg c = a("leggings");
   public static final alg d = a("boots");
   public static final List<frm.a> e = List.of(
      new frm.a(dhz.d, dib.a),
      new frm.a(dhz.e, dib.b),
      new frm.a(dhz.f, dib.c),
      new frm.a(dhz.g, dib.d),
      new frm.a(dhz.h, dib.e),
      new frm.a(dhz.i, dib.f),
      new frm.a(dhz.j, dib.g),
      new frm.a(dhz.k, dib.h),
      new frm.a(dhz.l, dib.i),
      new frm.a(dhz.m, dib.j),
      new frm.a(dhz.n, dib.k)
   );
   private final frn g;
   private final BiConsumer<alg, fry> h;

   public static alg a(String $$0) {
      return alg.b("trims/items/" + $$0 + "_trim");
   }

   public frm(frn $$0, BiConsumer<alg, fry> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(czj $$0) {
      this.g.a($$0, frx.a(frz.a($$0)));
   }

   private alg a(czj $$0, fsa $$1) {
      return $$1.a(frz.a($$0), fsc.b($$0), this.h);
   }

   private void b(czj $$0, fsa $$1) {
      this.g.a($$0, frx.a(this.a($$0, $$1)));
   }

   private alg a(czj $$0, String $$1, fsa $$2) {
      return $$2.a(frz.a($$0, $$1), fsc.k(fsc.a($$0, $$1)), this.h);
   }

   private alg a(czj $$0, czj $$1, fsa $$2) {
      return $$2.a(frz.a($$0), fsc.b($$1), this.h);
   }

   private void b(czj $$0, czj $$1, fsa $$2) {
      this.g.a($$0, frx.a(this.a($$0, $$1, $$2)));
   }

   private void a(czj $$0, frd $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(czj $$0, String $$1, frd $$2) {
      alg $$3 = this.a($$0, fsc.c($$0), fsc.a($$0, $$1));
      this.g.a($$0, frx.a($$3, f, $$2));
   }

   private List<hgl.a> b(czj $$0) {
      List<hgl.a> $$1 = new ArrayList<>();
      hgf.b $$2 = frx.a(this.a($$0, "_16", fsb.bI));
      $$1.add(frx.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azm.b($$3 - 16, 32);
         hgf.b $$5 = frx.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fsb.bI));
         $$1.add(frx.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(frx.a($$2, 31.5F));
      return $$1;
   }

   private void c(czj $$0) {
      List<hgl.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            frx.a(
               frx.a(kk.ah),
               frx.a(new hhh(true, hhi.a.b), 32.0F, $$1),
               frx.a(frx.a(new hhh(true, hhi.a.c), 32.0F, $$1), frx.a(new hhh(true, hhi.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(czj $$0) {
      this.g.a($$0, frx.a(new hhh(true, hhi.a.d), 32.0F, this.b($$0)));
   }

   private void e(czj $$0) {
      List<hgl.a> $$1 = new ArrayList<>();
      hgf.b $$2 = frx.a(this.a($$0, "_00", fsb.bI));
      $$1.add(frx.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hgf.b $$4 = frx.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fsb.bI));
         $$1.add(frx.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(frx.a($$2, 63.5F));
      this.g.a($$0, frx.a(frx.a(new hhr(true, hhr.a.b), 64.0F, $$1), frx.a(new hhr(true, hhr.a.a), 64.0F, $$1)));
   }

   private alg a(czj $$0, alg $$1, alg $$2) {
      return fsb.bM.a($$0, fsc.c($$1, $$2), this.h);
   }

   private alg a(alg $$0, alg $$1, alg $$2) {
      return fsb.bM.a($$0, fsc.c($$1, $$2), this.h);
   }

   private void a(alg $$0, alg $$1, alg $$2, alg $$3) {
      fsb.bN.a($$0, fsc.a($$1, $$2, $$3), this.h);
   }

   private void a(czj $$0, alf<dhu> $$1, alg $$2, boolean $$3) {
      alg $$4 = frz.a($$0);
      alg $$5 = fsc.c($$0);
      alg $$6 = fsc.a($$0, "_overlay");
      List<hgm.b<alf<dia>>> $$7 = new ArrayList<>(e.size());

      for (frm.a $$8 : e) {
         alg $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alg $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hgf.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = frx.a($$9, new fra(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = frx.a($$9);
         }

         $$7.add(frx.a($$8.b, $$11));
      }

      hgf.b $$13;
      if ($$3) {
         fsb.bM.a($$4, fsc.c($$5, $$6), this.h);
         $$13 = frx.a($$4, new fra(-6265536));
      } else {
         fsb.bI.a($$4, fsc.k($$5), this.h);
         $$13 = frx.a($$4);
      }

      this.g.a($$0, frx.a(new hih(), $$13, $$7));
   }

   private void f(czj $$0) {
      hgf.b $$1 = frx.a(this.a($$0, fsb.bI));
      alg $$2 = this.a($$0, fsb.bS, "_open_back");
      alg $$3 = this.a($$0, fsb.bR, "_open_front");
      hgf.b $$4 = frx.a(frx.a($$2), new hga.a(), frx.a($$3));
      hgf.b $$5 = frx.a(new hgq(), $$4, $$1);
      this.g.a($$0, frx.a(new hib(), $$1, frx.a(czl.g, $$5)));
   }

   private alg a(czj $$0, fsa $$1, String $$2) {
      alg $$3 = fsc.a($$0, $$2);
      return $$1.a($$0, fsc.k($$3), this.h);
   }

   private void g(czj $$0) {
      hgf.b $$1 = frx.a(frz.a($$0));
      hgf.b $$2 = frx.a(this.a($$0, "_pulling_0", fsb.bT));
      hgf.b $$3 = frx.a(this.a($$0, "_pulling_1", fsb.bT));
      hgf.b $$4 = frx.a(this.a($$0, "_pulling_2", fsb.bT));
      this.g.a($$0, frx.a(frx.a(), frx.a(new hht(false), 0.05F, $$2, frx.a($$3, 0.65F), frx.a($$4, 0.9F)), $$1));
   }

   private void h(czj $$0) {
      hgf.b $$1 = frx.a(frz.a($$0));
      hgf.b $$2 = frx.a(this.a($$0, "_pulling_0", fsb.bU));
      hgf.b $$3 = frx.a(this.a($$0, "_pulling_1", fsb.bU));
      hgf.b $$4 = frx.a(this.a($$0, "_pulling_2", fsb.bU));
      hgf.b $$5 = frx.a(this.a($$0, "_arrow", fsb.bU));
      hgf.b $$6 = frx.a(this.a($$0, "_firework", fsb.bU));
      this.g
         .a($$0, frx.a(new hhw(), frx.a(frx.a(), frx.a(new hhl(), $$2, frx.a($$3, 0.58F), frx.a($$4, 1.0F)), $$1), frx.a(cyg.a.b, $$5), frx.a(cyg.a.c, $$6)));
   }

   private void a(czj $$0, hgt $$1, hgf.b $$2, hgf.b $$3) {
      this.g.a($$0, frx.a($$1, $$2, $$3));
   }

   private void i(czj $$0) {
      hgf.b $$1 = frx.a(this.a($$0, fsb.bI));
      hgf.b $$2 = frx.a(this.a($$0, "_broken", fsb.bI));
      this.a($$0, new hgp(), $$2, $$1);
   }

   private void j(czj $$0) {
      hgf.b $$1 = frx.a(frz.a($$0));
      hgf.b $$2 = frx.a(frz.a($$0, "_brushing_0"));
      hgf.b $$3 = frx.a(frz.a($$0, "_brushing_1"));
      hgf.b $$4 = frx.a(frz.a($$0, "_brushing_2"));
      this.g.a($$0, frx.a(new hhs(10.0F), 0.1F, $$1, frx.a($$2, 0.25F), frx.a($$3, 0.5F), frx.a($$4, 0.75F)));
   }

   private void k(czj $$0) {
      hgf.b $$1 = frx.a(this.a($$0, fsb.bL));
      hgf.b $$2 = frx.a(this.a($$0, "_cast", fsb.bL));
      this.a($$0, new hgx(), $$2, $$1);
   }

   private void l(czj $$0) {
      hgf.b $$1 = frx.a(frz.a($$0));
      hgf.b $$2 = frx.a(frz.b("tooting_goat_horn"));
      this.a($$0, frx.a(), $$2, $$1);
   }

   private void m(czj $$0) {
      hgf.b $$1 = frx.a(frz.a($$0), new hir.a());
      hgf.b $$2 = frx.a(frz.a($$0, "_blocking"), new hir.a());
      this.a($$0, frx.a(), $$2, $$1);
   }

   private static hgf.b a(hgf.b $$0, hgf.b $$1) {
      return frx.a(new hib(), $$1, frx.a(List.of(czl.g, czl.h, czl.i), $$0));
   }

   private void n(czj $$0) {
      hgf.b $$1 = frx.a(this.a($$0, fsb.bI));
      hgf.b $$2 = frx.a(frz.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(czj $$0) {
      hgf.b $$1 = frx.a(this.a($$0, fsb.bI));
      hgf.b $$2 = frx.a(frz.a($$0, "_in_hand"), new hix.a());
      hgf.b $$3 = frx.a(frz.a($$0, "_throwing"), new hix.a());
      hgf.b $$4 = frx.a(frx.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(czj $$0, alg $$1) {
      this.g.a($$0, frx.a($$1, new frg()));
   }

   private void p(czj $$0) {
      alg $$1 = this.a($$0, frz.b("potion_overlay"), frz.a($$0));
      this.a($$0, $$1);
   }

   private void q(czj $$0) {
      alg $$1 = this.a($$0, frz.a($$0, "_head"), frz.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(czj $$0, int $$1) {
      alg $$2 = this.a($$0, fsb.bI);
      this.g.a($$0, frx.a($$2, new fra($$1)));
   }

   private void r(czj $$0) {
      alg $$1 = fsc.c($$0);
      alg $$2 = fsc.a($$0, "_overlay");
      alg $$3 = fsb.bI.a($$0, fsc.k($$1), this.h);
      alg $$4 = frz.a($$0, "_dyed");
      fsb.bM.a($$4, fsc.c($$1, $$2), this.h);
      this.g.a($$0, frx.a(frx.a(kk.K), frx.a($$4, f, new fra(0)), frx.a($$3)));
   }

   public void a() {
      this.b(czr.oM, fsb.bI);
      this.b(czr.oO, fsb.bI);
      this.b(czr.oN, fsb.bI);
      this.b(czr.oP, fsb.bI);
      this.b(czr.pr, fsb.bI);
      this.b(czr.pi, fsb.bI);
      this.b(czr.pe, fsb.bI);
      this.b(czr.vQ, fsb.bI);
      this.b(czr.pk, fsb.bI);
      this.b(czr.vr, fsb.bI);
      this.b(czr.ej, fsb.bK);
      this.b(czr.ti, fsb.bI);
      this.b(czr.wv, fsb.bI);
      this.b(czr.wx, fsb.bI);
      this.b(czr.oI, fsb.bI);
      this.b(czr.oJ, fsb.bI);
      this.b(czr.sF, fsb.bI);
      this.b(czr.tw, fsb.bI);
      this.b(czr.to, fsb.bK);
      this.b(czr.sB, fsb.bI);
      this.b(czr.sG, fsb.bI);
      this.b(czr.xs, fsb.bI);
      this.b(czr.rF, fsb.bI);
      this.b(czr.ph, fsb.bI);
      this.b(czr.ql, fsb.bI);
      this.b(czr.rB, fsb.bI);
      this.b(czr.vk, fsb.bK);
      this.b(czr.sC, fsb.bI);
      this.b(czr.ro, fsb.bI);
      this.b(czr.oA, fsb.bL);
      this.b(czr.oB, fsb.bL);
      this.b(czr.pm, fsb.bI);
      this.b(czr.ow, fsb.bI);
      this.b(czr.tk, fsb.bI);
      this.b(czr.wr, fsb.bI);
      this.b(czr.rC, fsb.bI);
      this.e(czr.se);
      this.b(czr.pl, fsb.bI);
      this.b(czr.rx, fsb.bI);
      this.b(czr.vX, fsb.bI);
      this.c(czr.rK);
      this.d(czr.rL);
      this.b(czr.tj, fsb.bI);
      this.b(czr.tl, fsb.bI);
      this.b(czr.sl, fsb.bI);
      this.b(czr.vZ, fsb.bI);
      this.b(czr.qM, fsb.bI);
      this.b(czr.vM, fsb.bI);
      this.b(czr.sm, fsb.bI);
      this.b(czr.ta, fsb.bI);
      this.b(czr.pu, fsb.bI);
      this.b(czr.pv, fsb.bI);
      this.b(czr.xk, fsb.bI);
      this.b(czr.sz, fsb.bI);
      this.b(czr.oQ, fsb.bI);
      this.b(czr.oR, fsb.bI);
      this.b(czr.pn, fsb.bI);
      this.b(czr.pX, fsb.bK);
      this.b(czr.pY, fsb.bK);
      this.b(czr.vT, fsb.bI);
      this.b(czr.pW, fsb.bK);
      this.b(czr.pV, fsb.bK);
      this.b(czr.pU, fsb.bK);
      this.b(czr.wy, fsb.bI);
      this.b(czr.tf, fsb.bI);
      this.b(czr.rH, fsb.bI);
      this.b(czr.rI, fsb.bI);
      this.b(czr.rJ, fsb.bI);
      this.b(czr.po, fsb.bI);
      this.b(czr.vG, fsb.bI);
      this.b(czr.tA, fsb.bI);
      this.b(czr.tn, fsb.bI);
      this.b(czr.wq, fsb.bI);
      this.b(czr.vf, fsb.bI);
      this.b(czr.tv, fsb.bI);
      this.b(czr.xr, fsb.bI);
      this.b(czr.vE, fsb.bI);
      this.b(czr.vg, fsb.bI);
      this.b(czr.qK, fsb.bI);
      this.b(czr.pg, fsb.bI);
      this.b(czr.xp, fsb.bI);
      this.b(czr.xj, fsb.bI);
      this.b(czr.ox, fsb.bI);
      this.b(czr.tp, fsb.bI);
      this.b(czr.ts, fsb.bI);
      this.b(czr.tB, fsb.bI);
      this.b(czr.xn, fsb.bI);
      this.b(czr.xH, fsb.bI);
      this.b(czr.sg, fsb.bI);
      this.b(czr.so, fsb.bI);
      this.b(czr.vn, fsb.bI);
      this.b(czr.pw, fsb.bI);
      this.b(czr.qO, fsb.bI);
      this.b(czr.pN, fsb.bK);
      this.b(czr.vu, fsb.bI);
      this.b(czr.pO, fsb.bK);
      this.b(czr.vS, fsb.bI);
      this.b(czr.pM, fsb.bK);
      this.b(czr.pL, fsb.bK);
      this.b(czr.pK, fsb.bK);
      this.b(czr.px, fsb.bI);
      this.b(czr.tq, fsb.bI);
      this.b(czr.sx, fsb.bI);
      this.b(czr.sD, fsb.bI);
      this.b(czr.qi, fsb.bI);
      this.b(czr.xq, fsb.bI);
      this.b(czr.xf, fsb.bI);
      this.b(czr.xL, fsb.bI);
      this.b(czr.xO, fsb.bI);
      this.b(czr.oz, fsb.bI);
      this.b(czr.sn, fsb.bI);
      this.b(czr.ps, fsb.bI);
      this.b(czr.pS, fsb.bK);
      this.b(czr.pT, fsb.bK);
      this.b(czr.vR, fsb.bI);
      this.b(czr.pt, fsb.bI);
      this.b(czr.wG, fsb.bI);
      this.b(czr.pR, fsb.bK);
      this.b(czr.pQ, fsb.bK);
      this.b(czr.pP, fsb.bK);
      this.b(czr.vm, fsb.bI);
      this.b(czr.oK, fsb.bI);
      this.b(czr.oL, fsb.bI);
      this.b(czr.wH, fsb.bI);
      this.b(czr.pp, fsb.bI);
      this.b(czr.rq, fsb.bI);
      this.b(czr.rt, fsb.bI);
      this.b(czr.st, fsb.bI);
      this.b(czr.sy, fsb.bI);
      this.b(czr.sv, fsb.bI);
      this.b(czr.ss, fsb.bI);
      this.b(czr.tx, fsb.bI);
      this.b(czr.oU, fsb.bI);
      this.b(czr.oV, fsb.bI);
      this.b(czr.oW, fsb.bI);
      this.b(czr.oX, fsb.bI);
      this.b(czr.vt, fsb.bI);
      this.b(czr.te, fsb.bI);
      this.b(czr.ru, fsb.bI);
      this.b(czr.ov, fsb.bI);
      this.b(czr.xm, fsb.bI);
      this.b(czr.qf, fsb.bI);
      this.b(czr.xc, fsb.bI);
      this.b(czr.wV, fsb.bJ);
      this.b(czr.wJ, fsb.bJ);
      this.b(czr.wL, fsb.bJ);
      this.b(czr.wK, fsb.bJ);
      this.b(czr.wM, fsb.bJ);
      this.b(czr.wN, fsb.bJ);
      this.b(czr.wO, fsb.bJ);
      this.b(czr.wP, fsb.bJ);
      this.b(czr.wQ, fsb.bJ);
      this.b(czr.wR, fsb.bJ);
      this.b(czr.xa, fsb.bJ);
      this.b(czr.xb, fsb.bJ);
      this.b(czr.wS, fsb.bJ);
      this.b(czr.wT, fsb.bJ);
      this.b(czr.wW, fsb.bJ);
      this.b(czr.wU, fsb.bJ);
      this.b(czr.wX, fsb.bJ);
      this.b(czr.wY, fsb.bJ);
      this.b(czr.wZ, fsb.bJ);
      this.b(czr.vY, fsb.bI);
      this.b(czr.vW, fsb.bI);
      this.b(czr.xe, fsb.bI);
      this.b(czr.qc, fsb.bK);
      this.b(czr.qd, fsb.bK);
      this.b(czr.py, fsb.bI);
      this.b(czr.qb, fsb.bK);
      this.b(czr.pz, fsb.bI);
      this.b(czr.qa, fsb.bK);
      this.b(czr.pZ, fsb.bK);
      this.b(czr.vH, fsb.bI);
      this.b(czr.vI, fsb.bI);
      this.b(czr.vC, fsb.bI);
      this.b(czr.oE, fsb.bI);
      this.b(czr.oF, fsb.bI);
      this.b(czr.sr, fsb.bI);
      this.b(czr.qN, fsb.bI);
      this.b(czr.oS, fsb.bI);
      this.b(czr.oT, fsb.bI);
      this.b(czr.rE, fsb.bI);
      this.b(czr.oC, fsb.bI);
      this.b(czr.xo, fsb.bI);
      this.b(czr.sw, fsb.bI);
      this.b(czr.vs, fsb.bI);
      this.b(czr.ws, fsb.bI);
      this.b(czr.qL, fsb.bI);
      this.b(czr.rr, fsb.bI);
      this.b(czr.vK, fsb.bI);
      this.b(czr.vJ, fsb.bI);
      this.b(czr.sk, fsb.bI);
      this.b(czr.rv, fsb.bI);
      this.b(czr.vD, fsb.bI);
      this.b(czr.sA, fsb.bI);
      this.b(czr.pq, fsb.bI);
      this.b(czr.vL, fsb.bI);
      this.b(czr.vO, fsb.bI);
      this.b(czr.vP, fsb.bI);
      this.b(czr.vN, fsb.bI);
      this.b(czr.sE, fsb.bI);
      this.b(czr.tm, fsb.bI);
      this.b(czr.ou, fsb.bI);
      this.b(czr.si, fsb.bI);
      this.b(czr.rw, fsb.bI);
      this.b(czr.pd, fsb.bI);
      this.b(czr.td, fsb.bI);
      this.b(czr.wF, fsb.bI);
      this.b(czr.xl, fsb.bI);
      this.b(czr.rG, fsb.bI);
      this.b(czr.rs, fsb.bI);
      this.b(czr.yF, fsb.bI);
      this.b(czr.wA, fsb.bI);
      this.b(czr.tu, fsb.bI);
      this.b(czr.oG, fsb.bI);
      this.b(czr.oH, fsb.bI);
      this.b(czr.qe, fsb.bK);
      this.b(czr.pI, fsb.bK);
      this.b(czr.pJ, fsb.bK);
      this.b(czr.pH, fsb.bK);
      this.b(czr.pG, fsb.bK);
      this.b(czr.pF, fsb.bK);
      this.b(czr.sI, fsb.bI);
      this.b(czr.xh, fsb.bI);
      this.b(czr.oy, fsb.bI);
      this.b(czr.wE, fsb.bI);
      this.b(czr.sj, fsb.bI);
      this.b(czr.ry, fsb.bI);
      this.b(czr.rz, fsb.bI);
      this.b(czr.rA, fsb.bI);
      this.b(czr.rp, fsb.bI);
      this.b(czr.qk, fsb.bI);
      this.b(czr.sq, fsb.bI);
      this.b(czr.vh, fsb.bI);
      this.b(czr.vl, fsb.cc);
      this.b(czr.pD, fsb.bK);
      this.b(czr.pE, fsb.bK);
      this.b(czr.pC, fsb.bK);
      this.b(czr.pB, fsb.bK);
      this.b(czr.pA, fsb.bK);
      this.b(czr.vi, fsb.bI);
      this.b(czr.vj, fsb.bI);
      this.b(czr.su, fsb.bI);
      this.b(czr.yH, fsb.bI);
      this.b(czr.yI, fsb.bI);
      this.b(czr.yJ, fsb.bI);
      this.b(czr.yK, fsb.bI);
      this.b(czr.yL, fsb.bI);
      this.b(czr.yM, fsb.bI);
      this.b(czr.yN, fsb.bI);
      this.b(czr.yO, fsb.bI);
      this.b(czr.yP, fsb.bI);
      this.b(czr.yQ, fsb.bI);
      this.b(czr.yR, fsb.bI);
      this.b(czr.yS, fsb.bI);
      this.b(czr.yT, fsb.bI);
      this.b(czr.yU, fsb.bI);
      this.b(czr.yV, fsb.bI);
      this.b(czr.yW, fsb.bI);
      this.b(czr.yX, fsb.bI);
      this.b(czr.yY, fsb.bI);
      this.b(czr.yZ, fsb.bI);
      this.b(czr.wI, czr.qe, fsb.bK);
      this.b(czr.qP, czr.qO, fsb.bI);
      this.a(czr.pc, dhv.g, a, false);
      this.a(czr.qm, dhv.b, a, true);
      this.a(czr.qn, dhv.b, b, true);
      this.a(czr.qo, dhv.b, c, true);
      this.a(czr.qp, dhv.b, d, true);
      this.a(czr.qq, dhv.c, a, false);
      this.a(czr.qr, dhv.c, b, false);
      this.a(czr.qs, dhv.c, c, false);
      this.a(czr.qt, dhv.c, d, false);
      this.a(czr.qu, dhv.d, a, false);
      this.a(czr.qv, dhv.d, b, false);
      this.a(czr.qw, dhv.d, c, false);
      this.a(czr.qx, dhv.d, d, false);
      this.a(czr.qy, dhv.f, a, false);
      this.a(czr.qz, dhv.f, b, false);
      this.a(czr.qA, dhv.f, c, false);
      this.a(czr.qB, dhv.f, d, false);
      this.a(czr.qC, dhv.e, a, false);
      this.a(czr.qD, dhv.e, b, false);
      this.a(czr.qE, dhv.e, c, false);
      this.a(czr.qF, dhv.e, d, false);
      this.a(czr.qG, dhv.h, a, false);
      this.a(czr.qH, dhv.h, b, false);
      this.a(czr.qI, dhv.h, c, false);
      this.a(czr.qJ, dhv.h, d, false);
      this.a(czr.vU, -6265536);
      this.b(czr.za, fsb.bI);
      this.b(czr.zb, fsb.bI);
      this.b(czr.zc, fsb.bI);
      this.b(czr.zd, fsb.bI);
      this.b(czr.ze, fsb.bI);
      this.b(czr.zf, fsb.bI);
      this.b(czr.zg, fsb.bI);
      this.b(czr.zh, fsb.bI);
      this.b(czr.zi, fsb.bI);
      this.b(czr.zj, fsb.bI);
      this.b(czr.zk, fsb.bI);
      this.b(czr.zl, fsb.bI);
      this.b(czr.zm, fsb.bI);
      this.b(czr.zn, fsb.bI);
      this.b(czr.zo, fsb.bI);
      this.b(czr.zp, fsb.bI);
      this.b(czr.zq, fsb.bI);
      this.b(czr.zr, fsb.bI);
      this.b(czr.zs, fsb.bI);
      this.b(czr.zt, fsb.bI);
      this.b(czr.zu, fsb.bI);
      this.b(czr.zv, fsb.bI);
      this.b(czr.zw, fsb.bI);
      this.b(czr.zO, fsb.bI);
      this.b(czr.zP, fsb.bI);
      this.b(czr.zR, fsb.bI);
      this.a(czr.vF, new frb());
      this.a(czr.tc, "_markings", new frf());
      this.f(czr.rM);
      this.f(czr.sc);
      this.f(czr.rN);
      this.f(czr.rU);
      this.f(czr.rV);
      this.f(czr.rQ);
      this.f(czr.rY);
      this.f(czr.rW);
      this.f(czr.rR);
      this.f(czr.sb);
      this.f(czr.rX);
      this.f(czr.rP);
      this.f(czr.rT);
      this.f(czr.sa);
      this.f(czr.rS);
      this.f(czr.rZ);
      this.f(czr.rO);
      this.n(czr.sf);
      this.o(czr.xd);
      this.r(czr.pf);
      this.g(czr.pj);
      this.h(czr.xg);
      this.i(czr.oD);
      this.j(czr.yG);
      this.k(czr.sd);
      this.l(czr.xt);
      this.m(czr.wD);
      this.q(czr.wB);
      this.p(czr.tt);
      this.p(czr.wz);
      this.p(czr.wC);
      this.b(czr.tC, fsb.bI);
      this.b(czr.tD, fsb.bI);
      this.b(czr.tE, fsb.bI);
      this.b(czr.tF, fsb.bI);
      this.b(czr.tG, fsb.bI);
      this.b(czr.tH, fsb.bI);
      this.b(czr.tI, fsb.bI);
      this.b(czr.tJ, fsb.bI);
      this.b(czr.tK, fsb.bI);
      this.b(czr.tL, fsb.bI);
      this.b(czr.tM, fsb.bI);
      this.b(czr.tN, fsb.bI);
      this.b(czr.tO, fsb.bI);
      this.b(czr.tP, fsb.bI);
      this.b(czr.tQ, fsb.bI);
      this.b(czr.tR, fsb.bI);
      this.b(czr.tS, fsb.bI);
      this.b(czr.tT, fsb.bI);
      this.b(czr.tU, fsb.bI);
      this.b(czr.tV, fsb.bI);
      this.b(czr.tW, fsb.bI);
      this.b(czr.tX, fsb.bI);
      this.b(czr.tY, fsb.bI);
      this.b(czr.tZ, fsb.bI);
      this.b(czr.ua, fsb.bI);
      this.b(czr.ub, fsb.bI);
      this.b(czr.uc, fsb.bI);
      this.b(czr.ud, fsb.bI);
      this.b(czr.ue, fsb.bI);
      this.b(czr.uf, fsb.bI);
      this.b(czr.ug, fsb.bI);
      this.b(czr.uh, fsb.bI);
      this.b(czr.ui, fsb.bI);
      this.b(czr.uj, fsb.bI);
      this.b(czr.uk, fsb.bI);
      this.b(czr.ul, fsb.bI);
      this.b(czr.um, fsb.bI);
      this.b(czr.un, fsb.bI);
      this.b(czr.uo, fsb.bI);
      this.b(czr.up, fsb.bI);
      this.b(czr.uq, fsb.bI);
      this.b(czr.ur, fsb.bI);
      this.b(czr.us, fsb.bI);
      this.b(czr.ut, fsb.bI);
      this.b(czr.uu, fsb.bI);
      this.b(czr.uv, fsb.bI);
      this.b(czr.uw, fsb.bI);
      this.b(czr.ux, fsb.bI);
      this.b(czr.uy, fsb.bI);
      this.b(czr.uz, fsb.bI);
      this.b(czr.uA, fsb.bI);
      this.b(czr.uB, fsb.bI);
      this.b(czr.uC, fsb.bI);
      this.b(czr.uD, fsb.bI);
      this.b(czr.uE, fsb.bI);
      this.b(czr.uF, fsb.bI);
      this.b(czr.uG, fsb.bI);
      this.b(czr.uH, fsb.bI);
      this.b(czr.uI, fsb.bI);
      this.b(czr.uJ, fsb.bI);
      this.b(czr.uK, fsb.bI);
      this.b(czr.uL, fsb.bI);
      this.b(czr.uM, fsb.bI);
      this.b(czr.uN, fsb.bI);
      this.b(czr.uO, fsb.bI);
      this.b(czr.uP, fsb.bI);
      this.b(czr.uQ, fsb.bI);
      this.b(czr.uR, fsb.bI);
      this.b(czr.uS, fsb.bI);
      this.b(czr.uT, fsb.bI);
      this.b(czr.uU, fsb.bI);
      this.b(czr.uV, fsb.bI);
      this.b(czr.uW, fsb.bI);
      this.b(czr.uX, fsb.bI);
      this.b(czr.uY, fsb.bI);
      this.b(czr.uZ, fsb.bI);
      this.b(czr.va, fsb.bI);
      this.b(czr.vb, fsb.bI);
      this.b(czr.vc, fsb.bI);
      this.b(czr.vd, fsb.bI);
      this.b(czr.ve, fsb.bI);
      this.a(czr.a);
      this.a(czr.yz);
      this.a(czr.yw);
      this.a(czr.yx);
      this.a(czr.yy);
      this.a(czr.ei);
      this.a(czr.eh);
      this.a(czr.eg);
      this.a(czr.yA);
      this.a(czr.sH);
      this.a(czr.sh);
      this.a(czr.qh);
      this.a(czr.vV);
   }

   public static record a(dhz a, alf<dia> b) {
   }
}
