import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class frh {
   private static final fqy f = frs.a(-1);
   public static final alg a = a("helmet");
   public static final alg b = a("chestplate");
   public static final alg c = a("leggings");
   public static final alg d = a("boots");
   public static final List<frh.a> e = List.of(
      new frh.a(dhw.d, dhy.a),
      new frh.a(dhw.e, dhy.b),
      new frh.a(dhw.f, dhy.c),
      new frh.a(dhw.g, dhy.d),
      new frh.a(dhw.h, dhy.e),
      new frh.a(dhw.i, dhy.f),
      new frh.a(dhw.j, dhy.g),
      new frh.a(dhw.k, dhy.h),
      new frh.a(dhw.l, dhy.i),
      new frh.a(dhw.m, dhy.j),
      new frh.a(dhw.n, dhy.k)
   );
   private final fri g;
   private final BiConsumer<alg, frt> h;

   public static alg a(String $$0) {
      return alg.b("trims/items/" + $$0 + "_trim");
   }

   public frh(fri $$0, BiConsumer<alg, frt> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(czg $$0) {
      this.g.a($$0, frs.a(fru.a($$0)));
   }

   private alg a(czg $$0, frv $$1) {
      return $$1.a(fru.a($$0), frx.b($$0), this.h);
   }

   private void b(czg $$0, frv $$1) {
      this.g.a($$0, frs.a(this.a($$0, $$1)));
   }

   private alg a(czg $$0, String $$1, frv $$2) {
      return $$2.a(fru.a($$0, $$1), frx.k(frx.a($$0, $$1)), this.h);
   }

   private alg a(czg $$0, czg $$1, frv $$2) {
      return $$2.a(fru.a($$0), frx.b($$1), this.h);
   }

   private void b(czg $$0, czg $$1, frv $$2) {
      this.g.a($$0, frs.a(this.a($$0, $$1, $$2)));
   }

   private void a(czg $$0, fqy $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(czg $$0, String $$1, fqy $$2) {
      alg $$3 = this.a($$0, frx.c($$0), frx.a($$0, $$1));
      this.g.a($$0, frs.a($$3, f, $$2));
   }

   private List<hgf.a> b(czg $$0) {
      List<hgf.a> $$1 = new ArrayList<>();
      hfz.b $$2 = frs.a(this.a($$0, "_16", frw.bI));
      $$1.add(frs.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azm.b($$3 - 16, 32);
         hfz.b $$5 = frs.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), frw.bI));
         $$1.add(frs.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(frs.a($$2, 31.5F));
      return $$1;
   }

   private void c(czg $$0) {
      List<hgf.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            frs.a(
               frs.a(kk.ah),
               frs.a(new hhb(true, hhc.a.b), 32.0F, $$1),
               frs.a(frs.a(new hhb(true, hhc.a.c), 32.0F, $$1), frs.a(new hhb(true, hhc.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(czg $$0) {
      this.g.a($$0, frs.a(new hhb(true, hhc.a.d), 32.0F, this.b($$0)));
   }

   private void e(czg $$0) {
      List<hgf.a> $$1 = new ArrayList<>();
      hfz.b $$2 = frs.a(this.a($$0, "_00", frw.bI));
      $$1.add(frs.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hfz.b $$4 = frs.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), frw.bI));
         $$1.add(frs.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(frs.a($$2, 63.5F));
      this.g.a($$0, frs.a(frs.a(new hhl(true, hhl.a.b), 64.0F, $$1), frs.a(new hhl(true, hhl.a.a), 64.0F, $$1)));
   }

   private alg a(czg $$0, alg $$1, alg $$2) {
      return frw.bM.a($$0, frx.c($$1, $$2), this.h);
   }

   private alg a(alg $$0, alg $$1, alg $$2) {
      return frw.bM.a($$0, frx.c($$1, $$2), this.h);
   }

   private void a(alg $$0, alg $$1, alg $$2, alg $$3) {
      frw.bN.a($$0, frx.a($$1, $$2, $$3), this.h);
   }

   private void a(czg $$0, alf<dhr> $$1, alg $$2, boolean $$3) {
      alg $$4 = fru.a($$0);
      alg $$5 = frx.c($$0);
      alg $$6 = frx.a($$0, "_overlay");
      List<hgg.b<alf<dhx>>> $$7 = new ArrayList<>(e.size());

      for (frh.a $$8 : e) {
         alg $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alg $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hfz.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = frs.a($$9, new fqv(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = frs.a($$9);
         }

         $$7.add(frs.a($$8.b, $$11));
      }

      hfz.b $$13;
      if ($$3) {
         frw.bM.a($$4, frx.c($$5, $$6), this.h);
         $$13 = frs.a($$4, new fqv(-6265536));
      } else {
         frw.bI.a($$4, frx.k($$5), this.h);
         $$13 = frs.a($$4);
      }

      this.g.a($$0, frs.a(new hib(), $$13, $$7));
   }

   private void f(czg $$0) {
      hfz.b $$1 = frs.a(this.a($$0, frw.bI));
      alg $$2 = this.a($$0, frw.bS, "_open_back");
      alg $$3 = this.a($$0, frw.bR, "_open_front");
      hfz.b $$4 = frs.a(frs.a($$2), new hfu.a(), frs.a($$3));
      hfz.b $$5 = frs.a(new hgk(), $$4, $$1);
      this.g.a($$0, frs.a(new hhv(), $$1, frs.a(czi.g, $$5)));
   }

   private alg a(czg $$0, frv $$1, String $$2) {
      alg $$3 = frx.a($$0, $$2);
      return $$1.a($$0, frx.k($$3), this.h);
   }

   private void g(czg $$0) {
      hfz.b $$1 = frs.a(fru.a($$0));
      hfz.b $$2 = frs.a(this.a($$0, "_pulling_0", frw.bT));
      hfz.b $$3 = frs.a(this.a($$0, "_pulling_1", frw.bT));
      hfz.b $$4 = frs.a(this.a($$0, "_pulling_2", frw.bT));
      this.g.a($$0, frs.a(frs.a(), frs.a(new hhn(false), 0.05F, $$2, frs.a($$3, 0.65F), frs.a($$4, 0.9F)), $$1));
   }

   private void h(czg $$0) {
      hfz.b $$1 = frs.a(fru.a($$0));
      hfz.b $$2 = frs.a(this.a($$0, "_pulling_0", frw.bU));
      hfz.b $$3 = frs.a(this.a($$0, "_pulling_1", frw.bU));
      hfz.b $$4 = frs.a(this.a($$0, "_pulling_2", frw.bU));
      hfz.b $$5 = frs.a(this.a($$0, "_arrow", frw.bU));
      hfz.b $$6 = frs.a(this.a($$0, "_firework", frw.bU));
      this.g
         .a($$0, frs.a(new hhq(), frs.a(frs.a(), frs.a(new hhf(), $$2, frs.a($$3, 0.58F), frs.a($$4, 1.0F)), $$1), frs.a(cyd.a.b, $$5), frs.a(cyd.a.c, $$6)));
   }

   private void a(czg $$0, hgn $$1, hfz.b $$2, hfz.b $$3) {
      this.g.a($$0, frs.a($$1, $$2, $$3));
   }

   private void i(czg $$0) {
      hfz.b $$1 = frs.a(this.a($$0, frw.bI));
      hfz.b $$2 = frs.a(this.a($$0, "_broken", frw.bI));
      this.a($$0, new hgj(), $$2, $$1);
   }

   private void j(czg $$0) {
      hfz.b $$1 = frs.a(fru.a($$0));
      hfz.b $$2 = frs.a(fru.a($$0, "_brushing_0"));
      hfz.b $$3 = frs.a(fru.a($$0, "_brushing_1"));
      hfz.b $$4 = frs.a(fru.a($$0, "_brushing_2"));
      this.g.a($$0, frs.a(new hhm(10.0F), 0.1F, $$1, frs.a($$2, 0.25F), frs.a($$3, 0.5F), frs.a($$4, 0.75F)));
   }

   private void k(czg $$0) {
      hfz.b $$1 = frs.a(this.a($$0, frw.bL));
      hfz.b $$2 = frs.a(this.a($$0, "_cast", frw.bL));
      this.a($$0, new hgr(), $$2, $$1);
   }

   private void l(czg $$0) {
      hfz.b $$1 = frs.a(fru.a($$0));
      hfz.b $$2 = frs.a(fru.b("tooting_goat_horn"));
      this.a($$0, frs.a(), $$2, $$1);
   }

   private void m(czg $$0) {
      hfz.b $$1 = frs.a(fru.a($$0), new hil.a());
      hfz.b $$2 = frs.a(fru.a($$0, "_blocking"), new hil.a());
      this.a($$0, frs.a(), $$2, $$1);
   }

   private static hfz.b a(hfz.b $$0, hfz.b $$1) {
      return frs.a(new hhv(), $$1, frs.a(List.of(czi.g, czi.h, czi.i), $$0));
   }

   private void n(czg $$0) {
      hfz.b $$1 = frs.a(this.a($$0, frw.bI));
      hfz.b $$2 = frs.a(fru.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(czg $$0) {
      hfz.b $$1 = frs.a(this.a($$0, frw.bI));
      hfz.b $$2 = frs.a(fru.a($$0, "_in_hand"), new hir.a());
      hfz.b $$3 = frs.a(fru.a($$0, "_throwing"), new hir.a());
      hfz.b $$4 = frs.a(frs.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(czg $$0, alg $$1) {
      this.g.a($$0, frs.a($$1, new frb()));
   }

   private void p(czg $$0) {
      alg $$1 = this.a($$0, fru.b("potion_overlay"), fru.a($$0));
      this.a($$0, $$1);
   }

   private void q(czg $$0) {
      alg $$1 = this.a($$0, fru.a($$0, "_head"), fru.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(czg $$0, int $$1) {
      alg $$2 = this.a($$0, frw.bI);
      this.g.a($$0, frs.a($$2, new fqv($$1)));
   }

   private void a(czg $$0, int $$1, int $$2) {
      alg $$3 = fru.b("template_spawn_egg");
      this.g.a($$0, frs.a($$3, frs.a($$1), frs.a($$2)));
   }

   private void r(czg $$0) {
      alg $$1 = frx.c($$0);
      alg $$2 = frx.a($$0, "_overlay");
      alg $$3 = frw.bI.a($$0, frx.k($$1), this.h);
      alg $$4 = fru.a($$0, "_dyed");
      frw.bM.a($$4, frx.c($$1, $$2), this.h);
      this.g.a($$0, frs.a(frs.a(kk.K), frs.a($$4, f, new fqv(0)), frs.a($$3)));
   }

   public void a() {
      this.b(czo.oM, frw.bI);
      this.b(czo.oO, frw.bI);
      this.b(czo.oN, frw.bI);
      this.b(czo.oP, frw.bI);
      this.b(czo.pr, frw.bI);
      this.b(czo.pi, frw.bI);
      this.b(czo.pe, frw.bI);
      this.b(czo.vQ, frw.bI);
      this.b(czo.pk, frw.bI);
      this.b(czo.vr, frw.bI);
      this.b(czo.ej, frw.bK);
      this.b(czo.ti, frw.bI);
      this.b(czo.wv, frw.bI);
      this.b(czo.wx, frw.bI);
      this.b(czo.oI, frw.bI);
      this.b(czo.oJ, frw.bI);
      this.b(czo.sF, frw.bI);
      this.b(czo.tw, frw.bI);
      this.b(czo.to, frw.bK);
      this.b(czo.sB, frw.bI);
      this.b(czo.sG, frw.bI);
      this.b(czo.xs, frw.bI);
      this.b(czo.rF, frw.bI);
      this.b(czo.ph, frw.bI);
      this.b(czo.ql, frw.bI);
      this.b(czo.rB, frw.bI);
      this.b(czo.vk, frw.bK);
      this.b(czo.sC, frw.bI);
      this.b(czo.ro, frw.bI);
      this.b(czo.oA, frw.bL);
      this.b(czo.oB, frw.bL);
      this.b(czo.pm, frw.bI);
      this.b(czo.ow, frw.bI);
      this.b(czo.tk, frw.bI);
      this.b(czo.wr, frw.bI);
      this.b(czo.rC, frw.bI);
      this.e(czo.se);
      this.b(czo.pl, frw.bI);
      this.b(czo.rx, frw.bI);
      this.b(czo.vX, frw.bI);
      this.c(czo.rK);
      this.d(czo.rL);
      this.b(czo.tj, frw.bI);
      this.b(czo.tl, frw.bI);
      this.b(czo.sl, frw.bI);
      this.b(czo.vZ, frw.bI);
      this.b(czo.qM, frw.bI);
      this.b(czo.vM, frw.bI);
      this.b(czo.sm, frw.bI);
      this.b(czo.ta, frw.bI);
      this.b(czo.pu, frw.bI);
      this.b(czo.pv, frw.bI);
      this.b(czo.xk, frw.bI);
      this.b(czo.sz, frw.bI);
      this.b(czo.oQ, frw.bI);
      this.b(czo.oR, frw.bI);
      this.b(czo.pn, frw.bI);
      this.b(czo.pX, frw.bK);
      this.b(czo.pY, frw.bK);
      this.b(czo.vT, frw.bI);
      this.b(czo.pW, frw.bK);
      this.b(czo.pV, frw.bK);
      this.b(czo.pU, frw.bK);
      this.b(czo.wy, frw.bI);
      this.b(czo.tf, frw.bI);
      this.b(czo.rH, frw.bI);
      this.b(czo.rI, frw.bI);
      this.b(czo.rJ, frw.bI);
      this.b(czo.po, frw.bI);
      this.b(czo.vG, frw.bI);
      this.b(czo.tA, frw.bI);
      this.b(czo.tn, frw.bI);
      this.b(czo.wq, frw.bI);
      this.b(czo.vf, frw.bI);
      this.b(czo.tv, frw.bI);
      this.b(czo.xr, frw.bI);
      this.b(czo.vE, frw.bI);
      this.b(czo.vg, frw.bI);
      this.b(czo.qK, frw.bI);
      this.b(czo.pg, frw.bI);
      this.b(czo.xp, frw.bI);
      this.b(czo.xj, frw.bI);
      this.b(czo.ox, frw.bI);
      this.b(czo.tp, frw.bI);
      this.b(czo.ts, frw.bI);
      this.b(czo.tB, frw.bI);
      this.b(czo.xn, frw.bI);
      this.b(czo.xH, frw.bI);
      this.b(czo.sg, frw.bI);
      this.b(czo.so, frw.bI);
      this.b(czo.vn, frw.bI);
      this.b(czo.pw, frw.bI);
      this.b(czo.qO, frw.bI);
      this.b(czo.pN, frw.bK);
      this.b(czo.vu, frw.bI);
      this.b(czo.pO, frw.bK);
      this.b(czo.vS, frw.bI);
      this.b(czo.pM, frw.bK);
      this.b(czo.pL, frw.bK);
      this.b(czo.pK, frw.bK);
      this.b(czo.px, frw.bI);
      this.b(czo.tq, frw.bI);
      this.b(czo.sx, frw.bI);
      this.b(czo.sD, frw.bI);
      this.b(czo.qi, frw.bI);
      this.b(czo.xq, frw.bI);
      this.b(czo.xf, frw.bI);
      this.b(czo.xL, frw.bI);
      this.b(czo.xO, frw.bI);
      this.b(czo.oz, frw.bI);
      this.b(czo.sn, frw.bI);
      this.b(czo.ps, frw.bI);
      this.b(czo.pS, frw.bK);
      this.b(czo.pT, frw.bK);
      this.b(czo.vR, frw.bI);
      this.b(czo.pt, frw.bI);
      this.b(czo.wG, frw.bI);
      this.b(czo.pR, frw.bK);
      this.b(czo.pQ, frw.bK);
      this.b(czo.pP, frw.bK);
      this.b(czo.vm, frw.bI);
      this.b(czo.oK, frw.bI);
      this.b(czo.oL, frw.bI);
      this.b(czo.wH, frw.bI);
      this.b(czo.pp, frw.bI);
      this.b(czo.rq, frw.bI);
      this.b(czo.rt, frw.bI);
      this.b(czo.st, frw.bI);
      this.b(czo.sy, frw.bI);
      this.b(czo.sv, frw.bI);
      this.b(czo.ss, frw.bI);
      this.b(czo.tx, frw.bI);
      this.b(czo.oU, frw.bI);
      this.b(czo.oV, frw.bI);
      this.b(czo.oW, frw.bI);
      this.b(czo.oX, frw.bI);
      this.b(czo.vt, frw.bI);
      this.b(czo.te, frw.bI);
      this.b(czo.ru, frw.bI);
      this.b(czo.ov, frw.bI);
      this.b(czo.xm, frw.bI);
      this.b(czo.qf, frw.bI);
      this.b(czo.xc, frw.bI);
      this.b(czo.wV, frw.bJ);
      this.b(czo.wJ, frw.bJ);
      this.b(czo.wL, frw.bJ);
      this.b(czo.wK, frw.bJ);
      this.b(czo.wM, frw.bJ);
      this.b(czo.wN, frw.bJ);
      this.b(czo.wO, frw.bJ);
      this.b(czo.wP, frw.bJ);
      this.b(czo.wQ, frw.bJ);
      this.b(czo.wR, frw.bJ);
      this.b(czo.xa, frw.bJ);
      this.b(czo.xb, frw.bJ);
      this.b(czo.wS, frw.bJ);
      this.b(czo.wT, frw.bJ);
      this.b(czo.wW, frw.bJ);
      this.b(czo.wU, frw.bJ);
      this.b(czo.wX, frw.bJ);
      this.b(czo.wY, frw.bJ);
      this.b(czo.wZ, frw.bJ);
      this.b(czo.vY, frw.bI);
      this.b(czo.vW, frw.bI);
      this.b(czo.xe, frw.bI);
      this.b(czo.qc, frw.bK);
      this.b(czo.qd, frw.bK);
      this.b(czo.py, frw.bI);
      this.b(czo.qb, frw.bK);
      this.b(czo.pz, frw.bI);
      this.b(czo.qa, frw.bK);
      this.b(czo.pZ, frw.bK);
      this.b(czo.vH, frw.bI);
      this.b(czo.vI, frw.bI);
      this.b(czo.vC, frw.bI);
      this.b(czo.oE, frw.bI);
      this.b(czo.oF, frw.bI);
      this.b(czo.sr, frw.bI);
      this.b(czo.qN, frw.bI);
      this.b(czo.oS, frw.bI);
      this.b(czo.oT, frw.bI);
      this.b(czo.rE, frw.bI);
      this.b(czo.oC, frw.bI);
      this.b(czo.xo, frw.bI);
      this.b(czo.sw, frw.bI);
      this.b(czo.vs, frw.bI);
      this.b(czo.ws, frw.bI);
      this.b(czo.qL, frw.bI);
      this.b(czo.rr, frw.bI);
      this.b(czo.vK, frw.bI);
      this.b(czo.vJ, frw.bI);
      this.b(czo.sk, frw.bI);
      this.b(czo.rv, frw.bI);
      this.b(czo.vD, frw.bI);
      this.b(czo.sA, frw.bI);
      this.b(czo.pq, frw.bI);
      this.b(czo.vL, frw.bI);
      this.b(czo.vO, frw.bI);
      this.b(czo.vP, frw.bI);
      this.b(czo.vN, frw.bI);
      this.b(czo.sE, frw.bI);
      this.b(czo.tm, frw.bI);
      this.b(czo.ou, frw.bI);
      this.b(czo.si, frw.bI);
      this.b(czo.rw, frw.bI);
      this.b(czo.pd, frw.bI);
      this.b(czo.td, frw.bI);
      this.b(czo.wF, frw.bI);
      this.b(czo.xl, frw.bI);
      this.b(czo.rG, frw.bI);
      this.b(czo.rs, frw.bI);
      this.b(czo.yF, frw.bI);
      this.b(czo.wA, frw.bI);
      this.b(czo.tu, frw.bI);
      this.b(czo.oG, frw.bI);
      this.b(czo.oH, frw.bI);
      this.b(czo.qe, frw.bK);
      this.b(czo.pI, frw.bK);
      this.b(czo.pJ, frw.bK);
      this.b(czo.pH, frw.bK);
      this.b(czo.pG, frw.bK);
      this.b(czo.pF, frw.bK);
      this.b(czo.sI, frw.bI);
      this.b(czo.xh, frw.bI);
      this.b(czo.oy, frw.bI);
      this.b(czo.wE, frw.bI);
      this.b(czo.sj, frw.bI);
      this.b(czo.ry, frw.bI);
      this.b(czo.rz, frw.bI);
      this.b(czo.rA, frw.bI);
      this.b(czo.rp, frw.bI);
      this.b(czo.qk, frw.bI);
      this.b(czo.sq, frw.bI);
      this.b(czo.vh, frw.bI);
      this.b(czo.vl, frw.cc);
      this.b(czo.pD, frw.bK);
      this.b(czo.pE, frw.bK);
      this.b(czo.pC, frw.bK);
      this.b(czo.pB, frw.bK);
      this.b(czo.pA, frw.bK);
      this.b(czo.vi, frw.bI);
      this.b(czo.vj, frw.bI);
      this.b(czo.su, frw.bI);
      this.b(czo.yH, frw.bI);
      this.b(czo.yI, frw.bI);
      this.b(czo.yJ, frw.bI);
      this.b(czo.yK, frw.bI);
      this.b(czo.yL, frw.bI);
      this.b(czo.yM, frw.bI);
      this.b(czo.yN, frw.bI);
      this.b(czo.yO, frw.bI);
      this.b(czo.yP, frw.bI);
      this.b(czo.yQ, frw.bI);
      this.b(czo.yR, frw.bI);
      this.b(czo.yS, frw.bI);
      this.b(czo.yT, frw.bI);
      this.b(czo.yU, frw.bI);
      this.b(czo.yV, frw.bI);
      this.b(czo.yW, frw.bI);
      this.b(czo.yX, frw.bI);
      this.b(czo.yY, frw.bI);
      this.b(czo.yZ, frw.bI);
      this.b(czo.wI, czo.qe, frw.bK);
      this.b(czo.qP, czo.qO, frw.bI);
      this.a(czo.pc, dhs.g, a, false);
      this.a(czo.qm, dhs.b, a, true);
      this.a(czo.qn, dhs.b, b, true);
      this.a(czo.qo, dhs.b, c, true);
      this.a(czo.qp, dhs.b, d, true);
      this.a(czo.qq, dhs.c, a, false);
      this.a(czo.qr, dhs.c, b, false);
      this.a(czo.qs, dhs.c, c, false);
      this.a(czo.qt, dhs.c, d, false);
      this.a(czo.qu, dhs.d, a, false);
      this.a(czo.qv, dhs.d, b, false);
      this.a(czo.qw, dhs.d, c, false);
      this.a(czo.qx, dhs.d, d, false);
      this.a(czo.qy, dhs.f, a, false);
      this.a(czo.qz, dhs.f, b, false);
      this.a(czo.qA, dhs.f, c, false);
      this.a(czo.qB, dhs.f, d, false);
      this.a(czo.qC, dhs.e, a, false);
      this.a(czo.qD, dhs.e, b, false);
      this.a(czo.qE, dhs.e, c, false);
      this.a(czo.qF, dhs.e, d, false);
      this.a(czo.qG, dhs.h, a, false);
      this.a(czo.qH, dhs.h, b, false);
      this.a(czo.qI, dhs.h, c, false);
      this.a(czo.qJ, dhs.h, d, false);
      this.a(czo.vU, -6265536);
      this.b(czo.za, frw.bI);
      this.b(czo.zb, frw.bI);
      this.b(czo.zc, frw.bI);
      this.b(czo.zd, frw.bI);
      this.b(czo.ze, frw.bI);
      this.b(czo.zf, frw.bI);
      this.b(czo.zg, frw.bI);
      this.b(czo.zh, frw.bI);
      this.b(czo.zi, frw.bI);
      this.b(czo.zj, frw.bI);
      this.b(czo.zk, frw.bI);
      this.b(czo.zl, frw.bI);
      this.b(czo.zm, frw.bI);
      this.b(czo.zn, frw.bI);
      this.b(czo.zo, frw.bI);
      this.b(czo.zp, frw.bI);
      this.b(czo.zq, frw.bI);
      this.b(czo.zr, frw.bI);
      this.b(czo.zs, frw.bI);
      this.b(czo.zt, frw.bI);
      this.b(czo.zu, frw.bI);
      this.b(czo.zv, frw.bI);
      this.b(czo.zw, frw.bI);
      this.b(czo.zO, frw.bI);
      this.b(czo.zP, frw.bI);
      this.b(czo.zR, frw.bI);
      this.a(czo.vF, new fqw());
      this.a(czo.tc, "_markings", new fra());
      this.f(czo.rM);
      this.f(czo.sc);
      this.f(czo.rN);
      this.f(czo.rU);
      this.f(czo.rV);
      this.f(czo.rQ);
      this.f(czo.rY);
      this.f(czo.rW);
      this.f(czo.rR);
      this.f(czo.sb);
      this.f(czo.rX);
      this.f(czo.rP);
      this.f(czo.rT);
      this.f(czo.sa);
      this.f(czo.rS);
      this.f(czo.rZ);
      this.f(czo.rO);
      this.n(czo.sf);
      this.o(czo.xd);
      this.r(czo.pf);
      this.g(czo.pj);
      this.h(czo.xg);
      this.i(czo.oD);
      this.j(czo.yG);
      this.k(czo.sd);
      this.l(czo.xt);
      this.m(czo.wD);
      this.q(czo.wB);
      this.p(czo.tt);
      this.p(czo.wz);
      this.p(czo.wC);
      this.a(czo.tC, 11366765, 8538184);
      this.a(czo.tD, 56063, 44543);
      this.a(czo.tE, 16499171, 10890612);
      this.a(czo.tF, 4996656, 986895);
      this.a(czo.tG, 15582019, 4400155);
      this.a(czo.tH, 16167425, 16775294);
      this.a(czo.tI, 9084018, 3231003);
      this.a(czo.tJ, 11506911, 9529055);
      this.a(czo.tK, 15714446, 9794134);
      this.a(czo.tL, 16565097, 13341495);
      this.a(czo.tM, 803406, 11013646);
      this.a(czo.tN, 10592673, 16711680);
      this.a(czo.tO, 12691306, 15058059);
      this.a(czo.tP, 4470310, 10592673);
      this.a(czo.tQ, 894731, 0);
      this.a(czo.tR, 2243405, 16382457);
      this.a(czo.tS, 5457209, 8811878);
      this.a(czo.tT, 9433559, 7969893);
      this.a(czo.tU, 13552826, 7632531);
      this.a(czo.tV, 1842204, 14711290);
      this.a(czo.tW, 1447446, 0);
      this.a(czo.tX, 1447446, 7237230);
      this.a(czo.tY, 9804699, 1973274);
      this.a(czo.tZ, 14005919, 13396256);
      this.a(czo.ua, 13661252, 16762748);
      this.a(czo.ub, 16382457, 12369084);
      this.a(czo.uc, 611926, 8778172);
      this.a(czo.ud, 10851452, 5589310);
      this.a(czo.ue, 5931634, 15826224);
      this.a(czo.uf, 13004373, 6251620);
      this.a(czo.ug, 12623485, 15656192);
      this.a(czo.uh, 7958625, 15125652);
      this.a(czo.ui, 14405058, 7643954);
      this.a(czo.uj, 12623485, 10051392);
      this.a(czo.uk, 3407872, 16579584);
      this.a(czo.ul, 10489616, 12040119);
      this.a(czo.um, 1769984, 5321501);
      this.a(czo.un, 15720061, 5653556);
      this.a(czo.uo, 15198183, 1776418);
      this.a(czo.up, 894731, 16711680);
      this.a(czo.uq, 4411786, 8978176);
      this.a(czo.ur, 15771042, 14377823);
      this.a(czo.us, 10051392, 16380836);
      this.a(czo.ut, 5843472, 16380836);
      this.a(czo.uu, 5451574, 9804699);
      this.a(czo.uv, 15658718, 14014157);
      this.a(czo.uw, 16167425, 3654642);
      this.a(czo.ux, 10051392, 7555121);
      this.a(czo.uy, 7697520, 5984329);
      this.a(czo.uz, 10489616, 951412);
      this.a(czo.uA, 15198183, 16758197);
      this.a(czo.uB, 9725844, 5060690);
      this.a(czo.uC, 7237230, 3158064);
      this.a(czo.uD, 12698049, 4802889);
      this.a(czo.uE, 6842447, 15066584);
      this.a(czo.uF, 5349438, 8306542);
      this.a(czo.uG, 8855049, 2468720);
      this.a(czo.uH, 14283506, 8496292);
      this.a(czo.uI, 3419431, 11013646);
      this.a(czo.uJ, 2243405, 7375001);
      this.a(czo.uK, 6387319, 14543594);
      this.a(czo.uL, 10236982, 5065037);
      this.a(czo.uM, 7164733, 1444352);
      this.a(czo.uN, 15377456, 4547222);
      this.a(czo.uO, 15690005, 16775663);
      this.a(czo.uP, 15198183, 44975);
      this.a(czo.uQ, 8032420, 15265265);
      this.a(czo.uR, 5651507, 12422002);
      this.a(czo.uS, 9804699, 2580065);
      this.a(czo.uT, 4547222, 15377456);
      this.a(czo.uU, 1001033, 3790560);
      this.a(czo.uV, 3407872, 5349438);
      this.a(czo.uW, 1315860, 5075616);
      this.a(czo.uX, 1315860, 4672845);
      this.a(czo.uY, 14144467, 13545366);
      this.a(czo.uZ, 13004373, 15132390);
      this.a(czo.va, 6250335, 16545810);
      this.a(czo.vb, 44975, 7969893);
      this.a(czo.vc, 3232308, 9945732);
      this.a(czo.vd, 5651507, 7969893);
      this.a(czo.ve, 15373203, 5009705);
      this.a(czo.a);
      this.a(czo.yz);
      this.a(czo.yw);
      this.a(czo.yx);
      this.a(czo.yy);
      this.a(czo.ei);
      this.a(czo.eh);
      this.a(czo.eg);
      this.a(czo.yA);
      this.a(czo.sH);
      this.a(czo.sh);
      this.a(czo.qh);
      this.a(czo.vV);
   }

   public static record a(dhw a, alf<dhx> b) {
   }
}
