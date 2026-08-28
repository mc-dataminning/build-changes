import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fqs {
   private static final fqj f = frg.a(-1);
   public static final alg a = a("helmet");
   public static final alg b = a("chestplate");
   public static final alg c = a("leggings");
   public static final alg d = a("boots");
   public static final List<fqs.a> e = List.of(
      new fqs.a(dhp.d, dhr.a),
      new fqs.a(dhp.e, dhr.b),
      new fqs.a(dhp.f, dhr.c),
      new fqs.a(dhp.g, dhr.d),
      new fqs.a(dhp.h, dhr.e),
      new fqs.a(dhp.i, dhr.f),
      new fqs.a(dhp.j, dhr.g),
      new fqs.a(dhp.k, dhr.h),
      new fqs.a(dhp.l, dhr.i),
      new fqs.a(dhp.m, dhr.j),
      new fqs.a(dhp.n, dhr.k)
   );
   private final fqt g;
   private final BiConsumer<alg, frh> h;

   public static alg a(String $$0) {
      return alg.b("trims/items/" + $$0 + "_trim");
   }

   public fqs(fqt $$0, BiConsumer<alg, frh> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cyz $$0) {
      this.g.a($$0, frg.a(fri.a($$0)));
   }

   private alg a(cyz $$0, frj $$1) {
      return $$1.a(fri.a($$0), frl.b($$0), this.h);
   }

   private void b(cyz $$0, frj $$1) {
      this.g.a($$0, frg.a(this.a($$0, $$1)));
   }

   private alg a(cyz $$0, String $$1, frj $$2) {
      return $$2.a(fri.a($$0, $$1), frl.k(frl.a($$0, $$1)), this.h);
   }

   private alg a(cyz $$0, cyz $$1, frj $$2) {
      return $$2.a(fri.a($$0), frl.b($$1), this.h);
   }

   private void b(cyz $$0, cyz $$1, frj $$2) {
      this.g.a($$0, frg.a(this.a($$0, $$1, $$2)));
   }

   private void a(cyz $$0, fqj $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cyz $$0, String $$1, fqj $$2) {
      alg $$3 = this.a($$0, frl.c($$0), frl.a($$0, $$1));
      this.g.a($$0, frg.a($$3, f, $$2));
   }

   private List<hfs.a> b(cyz $$0) {
      List<hfs.a> $$1 = new ArrayList<>();
      hfn.b $$2 = frg.a(this.a($$0, "_16", frk.bI));
      $$1.add(frg.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azm.b($$3 - 16, 32);
         hfn.b $$5 = frg.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), frk.bI));
         $$1.add(frg.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(frg.a($$2, 31.5F));
      return $$1;
   }

   private void c(cyz $$0) {
      List<hfs.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            frg.a(
               frg.a(kj.ah),
               frg.a(new hgo(true, hgp.a.b), 32.0F, $$1),
               frg.a(frg.a(new hgo(true, hgp.a.c), 32.0F, $$1), frg.a(new hgo(true, hgp.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cyz $$0) {
      this.g.a($$0, frg.a(new hgo(true, hgp.a.d), 32.0F, this.b($$0)));
   }

   private void e(cyz $$0) {
      List<hfs.a> $$1 = new ArrayList<>();
      hfn.b $$2 = frg.a(this.a($$0, "_00", frk.bI));
      $$1.add(frg.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hfn.b $$4 = frg.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), frk.bI));
         $$1.add(frg.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(frg.a($$2, 63.5F));
      this.g.a($$0, frg.a(frg.a(new hgy(true, hgy.a.b), 64.0F, $$1), frg.a(new hgy(true, hgy.a.a), 64.0F, $$1)));
   }

   private alg a(cyz $$0, alg $$1, alg $$2) {
      return frk.bM.a($$0, frl.c($$1, $$2), this.h);
   }

   private alg a(alg $$0, alg $$1, alg $$2) {
      return frk.bM.a($$0, frl.c($$1, $$2), this.h);
   }

   private void a(alg $$0, alg $$1, alg $$2, alg $$3) {
      frk.bN.a($$0, frl.a($$1, $$2, $$3), this.h);
   }

   private void a(cyz $$0, alf<dhk> $$1, alg $$2, boolean $$3) {
      alg $$4 = fri.a($$0);
      alg $$5 = frl.c($$0);
      alg $$6 = frl.a($$0, "_overlay");
      List<hft.b<alf<dhq>>> $$7 = new ArrayList<>(e.size());

      for (fqs.a $$8 : e) {
         alg $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alg $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hfn.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = frg.a($$9, new fqg(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = frg.a($$9);
         }

         $$7.add(frg.a($$8.b, $$11));
      }

      hfn.b $$13;
      if ($$3) {
         frk.bM.a($$4, frl.c($$5, $$6), this.h);
         $$13 = frg.a($$4, new fqg(-6265536));
      } else {
         frk.bI.a($$4, frl.k($$5), this.h);
         $$13 = frg.a($$4);
      }

      this.g.a($$0, frg.a(new hho(), $$13, $$7));
   }

   private void f(cyz $$0) {
      hfn.b $$1 = frg.a(this.a($$0, frk.bI));
      alg $$2 = this.a($$0, frk.bS, "_open_back");
      alg $$3 = this.a($$0, frk.bR, "_open_front");
      hfn.b $$4 = frg.a(frg.a($$2), new hfi.a(), frg.a($$3));
      hfn.b $$5 = frg.a(new hfx(), $$4, $$1);
      this.g.a($$0, frg.a(new hhi(), $$1, frg.a(czb.g, $$5)));
   }

   private alg a(cyz $$0, frj $$1, String $$2) {
      alg $$3 = frl.a($$0, $$2);
      return $$1.a($$0, frl.k($$3), this.h);
   }

   private void g(cyz $$0) {
      hfn.b $$1 = frg.a(fri.a($$0));
      hfn.b $$2 = frg.a(this.a($$0, "_pulling_0", frk.bT));
      hfn.b $$3 = frg.a(this.a($$0, "_pulling_1", frk.bT));
      hfn.b $$4 = frg.a(this.a($$0, "_pulling_2", frk.bT));
      this.g.a($$0, frg.a(frg.a(), frg.a(new hha(false), 0.05F, $$2, frg.a($$3, 0.65F), frg.a($$4, 0.9F)), $$1));
   }

   private void h(cyz $$0) {
      hfn.b $$1 = frg.a(fri.a($$0));
      hfn.b $$2 = frg.a(this.a($$0, "_pulling_0", frk.bU));
      hfn.b $$3 = frg.a(this.a($$0, "_pulling_1", frk.bU));
      hfn.b $$4 = frg.a(this.a($$0, "_pulling_2", frk.bU));
      hfn.b $$5 = frg.a(this.a($$0, "_arrow", frk.bU));
      hfn.b $$6 = frg.a(this.a($$0, "_firework", frk.bU));
      this.g
         .a($$0, frg.a(new hhd(), frg.a(frg.a(), frg.a(new hgs(), $$2, frg.a($$3, 0.58F), frg.a($$4, 1.0F)), $$1), frg.a(cxw.a.b, $$5), frg.a(cxw.a.c, $$6)));
   }

   private void a(cyz $$0, hga $$1, hfn.b $$2, hfn.b $$3) {
      this.g.a($$0, frg.a($$1, $$2, $$3));
   }

   private void i(cyz $$0) {
      hfn.b $$1 = frg.a(this.a($$0, frk.bI));
      hfn.b $$2 = frg.a(this.a($$0, "_broken", frk.bI));
      this.a($$0, new hfw(), $$2, $$1);
   }

   private void j(cyz $$0) {
      hfn.b $$1 = frg.a(fri.a($$0));
      hfn.b $$2 = frg.a(fri.a($$0, "_brushing_0"));
      hfn.b $$3 = frg.a(fri.a($$0, "_brushing_1"));
      hfn.b $$4 = frg.a(fri.a($$0, "_brushing_2"));
      this.g.a($$0, frg.a(new hgz(10.0F), 0.1F, $$1, frg.a($$2, 0.25F), frg.a($$3, 0.5F), frg.a($$4, 0.75F)));
   }

   private void k(cyz $$0) {
      hfn.b $$1 = frg.a(this.a($$0, frk.bL));
      hfn.b $$2 = frg.a(this.a($$0, "_cast", frk.bL));
      this.a($$0, new hge(), $$2, $$1);
   }

   private void l(cyz $$0) {
      hfn.b $$1 = frg.a(fri.a($$0));
      hfn.b $$2 = frg.a(fri.b("tooting_goat_horn"));
      this.a($$0, frg.a(), $$2, $$1);
   }

   private void m(cyz $$0) {
      hfn.b $$1 = frg.a(fri.a($$0), new hhy.a());
      hfn.b $$2 = frg.a(fri.a($$0, "_blocking"), new hhy.a());
      this.a($$0, frg.a(), $$2, $$1);
   }

   private static hfn.b a(hfn.b $$0, hfn.b $$1) {
      return frg.a(new hhi(), $$1, frg.a(List.of(czb.g, czb.h, czb.i), $$0));
   }

   private void n(cyz $$0) {
      hfn.b $$1 = frg.a(this.a($$0, frk.bI));
      hfn.b $$2 = frg.a(fri.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cyz $$0) {
      hfn.b $$1 = frg.a(this.a($$0, frk.bI));
      hfn.b $$2 = frg.a(fri.a($$0, "_in_hand"), new hie.a());
      hfn.b $$3 = frg.a(fri.a($$0, "_throwing"), new hie.a());
      hfn.b $$4 = frg.a(frg.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cyz $$0, alg $$1) {
      this.g.a($$0, frg.a($$1, new fqm()));
   }

   private void p(cyz $$0) {
      alg $$1 = this.a($$0, fri.b("potion_overlay"), fri.a($$0));
      this.a($$0, $$1);
   }

   private void q(cyz $$0) {
      alg $$1 = this.a($$0, fri.a($$0, "_head"), fri.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cyz $$0, int $$1) {
      alg $$2 = this.a($$0, frk.bI);
      this.g.a($$0, frg.a($$2, new fqg($$1)));
   }

   private void a(cyz $$0, int $$1, int $$2) {
      alg $$3 = fri.b("template_spawn_egg");
      this.g.a($$0, frg.a($$3, frg.a($$1), frg.a($$2)));
   }

   private void r(cyz $$0) {
      alg $$1 = frl.c($$0);
      alg $$2 = frl.a($$0, "_overlay");
      alg $$3 = frk.bI.a($$0, frl.k($$1), this.h);
      alg $$4 = fri.a($$0, "_dyed");
      frk.bM.a($$4, frl.c($$1, $$2), this.h);
      this.g.a($$0, frg.a(frg.a(kj.K), frg.a($$4, f, new fqg(0)), frg.a($$3)));
   }

   public void a() {
      this.b(czh.oM, frk.bI);
      this.b(czh.oO, frk.bI);
      this.b(czh.oN, frk.bI);
      this.b(czh.oP, frk.bI);
      this.b(czh.pr, frk.bI);
      this.b(czh.pi, frk.bI);
      this.b(czh.pe, frk.bI);
      this.b(czh.vQ, frk.bI);
      this.b(czh.pk, frk.bI);
      this.b(czh.vr, frk.bI);
      this.b(czh.ej, frk.bK);
      this.b(czh.ti, frk.bI);
      this.b(czh.wv, frk.bI);
      this.b(czh.wx, frk.bI);
      this.b(czh.oI, frk.bI);
      this.b(czh.oJ, frk.bI);
      this.b(czh.sF, frk.bI);
      this.b(czh.tw, frk.bI);
      this.b(czh.to, frk.bK);
      this.b(czh.sB, frk.bI);
      this.b(czh.sG, frk.bI);
      this.b(czh.xs, frk.bI);
      this.b(czh.rF, frk.bI);
      this.b(czh.ph, frk.bI);
      this.b(czh.ql, frk.bI);
      this.b(czh.rB, frk.bI);
      this.b(czh.vk, frk.bK);
      this.b(czh.sC, frk.bI);
      this.b(czh.ro, frk.bI);
      this.b(czh.oA, frk.bL);
      this.b(czh.oB, frk.bL);
      this.b(czh.pm, frk.bI);
      this.b(czh.ow, frk.bI);
      this.b(czh.tk, frk.bI);
      this.b(czh.wr, frk.bI);
      this.b(czh.rC, frk.bI);
      this.e(czh.se);
      this.b(czh.pl, frk.bI);
      this.b(czh.rx, frk.bI);
      this.b(czh.vX, frk.bI);
      this.c(czh.rK);
      this.d(czh.rL);
      this.b(czh.tj, frk.bI);
      this.b(czh.tl, frk.bI);
      this.b(czh.sl, frk.bI);
      this.b(czh.vZ, frk.bI);
      this.b(czh.qM, frk.bI);
      this.b(czh.vM, frk.bI);
      this.b(czh.sm, frk.bI);
      this.b(czh.ta, frk.bI);
      this.b(czh.pu, frk.bI);
      this.b(czh.pv, frk.bI);
      this.b(czh.xk, frk.bI);
      this.b(czh.sz, frk.bI);
      this.b(czh.oQ, frk.bI);
      this.b(czh.oR, frk.bI);
      this.b(czh.pn, frk.bI);
      this.b(czh.pX, frk.bK);
      this.b(czh.pY, frk.bK);
      this.b(czh.vT, frk.bI);
      this.b(czh.pW, frk.bK);
      this.b(czh.pV, frk.bK);
      this.b(czh.pU, frk.bK);
      this.b(czh.wy, frk.bI);
      this.b(czh.tf, frk.bI);
      this.b(czh.rH, frk.bI);
      this.b(czh.rI, frk.bI);
      this.b(czh.rJ, frk.bI);
      this.b(czh.po, frk.bI);
      this.b(czh.vG, frk.bI);
      this.b(czh.tA, frk.bI);
      this.b(czh.tn, frk.bI);
      this.b(czh.wq, frk.bI);
      this.b(czh.vf, frk.bI);
      this.b(czh.tv, frk.bI);
      this.b(czh.xr, frk.bI);
      this.b(czh.vE, frk.bI);
      this.b(czh.vg, frk.bI);
      this.b(czh.qK, frk.bI);
      this.b(czh.pg, frk.bI);
      this.b(czh.xp, frk.bI);
      this.b(czh.xj, frk.bI);
      this.b(czh.ox, frk.bI);
      this.b(czh.tp, frk.bI);
      this.b(czh.ts, frk.bI);
      this.b(czh.tB, frk.bI);
      this.b(czh.xn, frk.bI);
      this.b(czh.xH, frk.bI);
      this.b(czh.sg, frk.bI);
      this.b(czh.so, frk.bI);
      this.b(czh.vn, frk.bI);
      this.b(czh.pw, frk.bI);
      this.b(czh.qO, frk.bI);
      this.b(czh.pN, frk.bK);
      this.b(czh.vu, frk.bI);
      this.b(czh.pO, frk.bK);
      this.b(czh.vS, frk.bI);
      this.b(czh.pM, frk.bK);
      this.b(czh.pL, frk.bK);
      this.b(czh.pK, frk.bK);
      this.b(czh.px, frk.bI);
      this.b(czh.tq, frk.bI);
      this.b(czh.sx, frk.bI);
      this.b(czh.sD, frk.bI);
      this.b(czh.qi, frk.bI);
      this.b(czh.xq, frk.bI);
      this.b(czh.xf, frk.bI);
      this.b(czh.xL, frk.bI);
      this.b(czh.xO, frk.bI);
      this.b(czh.oz, frk.bI);
      this.b(czh.sn, frk.bI);
      this.b(czh.ps, frk.bI);
      this.b(czh.pS, frk.bK);
      this.b(czh.pT, frk.bK);
      this.b(czh.vR, frk.bI);
      this.b(czh.pt, frk.bI);
      this.b(czh.wG, frk.bI);
      this.b(czh.pR, frk.bK);
      this.b(czh.pQ, frk.bK);
      this.b(czh.pP, frk.bK);
      this.b(czh.vm, frk.bI);
      this.b(czh.oK, frk.bI);
      this.b(czh.oL, frk.bI);
      this.b(czh.wH, frk.bI);
      this.b(czh.pp, frk.bI);
      this.b(czh.rq, frk.bI);
      this.b(czh.rt, frk.bI);
      this.b(czh.st, frk.bI);
      this.b(czh.sy, frk.bI);
      this.b(czh.sv, frk.bI);
      this.b(czh.ss, frk.bI);
      this.b(czh.tx, frk.bI);
      this.b(czh.oU, frk.bI);
      this.b(czh.oV, frk.bI);
      this.b(czh.oW, frk.bI);
      this.b(czh.oX, frk.bI);
      this.b(czh.vt, frk.bI);
      this.b(czh.te, frk.bI);
      this.b(czh.ru, frk.bI);
      this.b(czh.ov, frk.bI);
      this.b(czh.xm, frk.bI);
      this.b(czh.qf, frk.bI);
      this.b(czh.xc, frk.bI);
      this.b(czh.wV, frk.bJ);
      this.b(czh.wJ, frk.bJ);
      this.b(czh.wL, frk.bJ);
      this.b(czh.wK, frk.bJ);
      this.b(czh.wM, frk.bJ);
      this.b(czh.wN, frk.bJ);
      this.b(czh.wO, frk.bJ);
      this.b(czh.wP, frk.bJ);
      this.b(czh.wQ, frk.bJ);
      this.b(czh.wR, frk.bJ);
      this.b(czh.xa, frk.bJ);
      this.b(czh.xb, frk.bJ);
      this.b(czh.wS, frk.bJ);
      this.b(czh.wT, frk.bJ);
      this.b(czh.wW, frk.bJ);
      this.b(czh.wU, frk.bJ);
      this.b(czh.wX, frk.bJ);
      this.b(czh.wY, frk.bJ);
      this.b(czh.wZ, frk.bJ);
      this.b(czh.vY, frk.bI);
      this.b(czh.vW, frk.bI);
      this.b(czh.xe, frk.bI);
      this.b(czh.qc, frk.bK);
      this.b(czh.qd, frk.bK);
      this.b(czh.py, frk.bI);
      this.b(czh.qb, frk.bK);
      this.b(czh.pz, frk.bI);
      this.b(czh.qa, frk.bK);
      this.b(czh.pZ, frk.bK);
      this.b(czh.vH, frk.bI);
      this.b(czh.vI, frk.bI);
      this.b(czh.vC, frk.bI);
      this.b(czh.oE, frk.bI);
      this.b(czh.oF, frk.bI);
      this.b(czh.sr, frk.bI);
      this.b(czh.qN, frk.bI);
      this.b(czh.oS, frk.bI);
      this.b(czh.oT, frk.bI);
      this.b(czh.rE, frk.bI);
      this.b(czh.oC, frk.bI);
      this.b(czh.xo, frk.bI);
      this.b(czh.sw, frk.bI);
      this.b(czh.vs, frk.bI);
      this.b(czh.ws, frk.bI);
      this.b(czh.qL, frk.bI);
      this.b(czh.rr, frk.bI);
      this.b(czh.vK, frk.bI);
      this.b(czh.vJ, frk.bI);
      this.b(czh.sk, frk.bI);
      this.b(czh.rv, frk.bI);
      this.b(czh.vD, frk.bI);
      this.b(czh.sA, frk.bI);
      this.b(czh.pq, frk.bI);
      this.b(czh.vL, frk.bI);
      this.b(czh.vO, frk.bI);
      this.b(czh.vP, frk.bI);
      this.b(czh.vN, frk.bI);
      this.b(czh.sE, frk.bI);
      this.b(czh.tm, frk.bI);
      this.b(czh.ou, frk.bI);
      this.b(czh.si, frk.bI);
      this.b(czh.rw, frk.bI);
      this.b(czh.pd, frk.bI);
      this.b(czh.td, frk.bI);
      this.b(czh.wF, frk.bI);
      this.b(czh.xl, frk.bI);
      this.b(czh.rG, frk.bI);
      this.b(czh.rs, frk.bI);
      this.b(czh.yF, frk.bI);
      this.b(czh.wA, frk.bI);
      this.b(czh.tu, frk.bI);
      this.b(czh.oG, frk.bI);
      this.b(czh.oH, frk.bI);
      this.b(czh.qe, frk.bK);
      this.b(czh.pI, frk.bK);
      this.b(czh.pJ, frk.bK);
      this.b(czh.pH, frk.bK);
      this.b(czh.pG, frk.bK);
      this.b(czh.pF, frk.bK);
      this.b(czh.sI, frk.bI);
      this.b(czh.xh, frk.bI);
      this.b(czh.oy, frk.bI);
      this.b(czh.wE, frk.bI);
      this.b(czh.sj, frk.bI);
      this.b(czh.ry, frk.bI);
      this.b(czh.rz, frk.bI);
      this.b(czh.rA, frk.bI);
      this.b(czh.rp, frk.bI);
      this.b(czh.qk, frk.bI);
      this.b(czh.sq, frk.bI);
      this.b(czh.vh, frk.bI);
      this.b(czh.vl, frk.cc);
      this.b(czh.pD, frk.bK);
      this.b(czh.pE, frk.bK);
      this.b(czh.pC, frk.bK);
      this.b(czh.pB, frk.bK);
      this.b(czh.pA, frk.bK);
      this.b(czh.vi, frk.bI);
      this.b(czh.vj, frk.bI);
      this.b(czh.su, frk.bI);
      this.b(czh.yH, frk.bI);
      this.b(czh.yI, frk.bI);
      this.b(czh.yJ, frk.bI);
      this.b(czh.yK, frk.bI);
      this.b(czh.yL, frk.bI);
      this.b(czh.yM, frk.bI);
      this.b(czh.yN, frk.bI);
      this.b(czh.yO, frk.bI);
      this.b(czh.yP, frk.bI);
      this.b(czh.yQ, frk.bI);
      this.b(czh.yR, frk.bI);
      this.b(czh.yS, frk.bI);
      this.b(czh.yT, frk.bI);
      this.b(czh.yU, frk.bI);
      this.b(czh.yV, frk.bI);
      this.b(czh.yW, frk.bI);
      this.b(czh.yX, frk.bI);
      this.b(czh.yY, frk.bI);
      this.b(czh.yZ, frk.bI);
      this.b(czh.wI, czh.qe, frk.bK);
      this.b(czh.qP, czh.qO, frk.bI);
      this.a(czh.pc, dhl.g, a, false);
      this.a(czh.qm, dhl.b, a, true);
      this.a(czh.qn, dhl.b, b, true);
      this.a(czh.qo, dhl.b, c, true);
      this.a(czh.qp, dhl.b, d, true);
      this.a(czh.qq, dhl.c, a, false);
      this.a(czh.qr, dhl.c, b, false);
      this.a(czh.qs, dhl.c, c, false);
      this.a(czh.qt, dhl.c, d, false);
      this.a(czh.qu, dhl.d, a, false);
      this.a(czh.qv, dhl.d, b, false);
      this.a(czh.qw, dhl.d, c, false);
      this.a(czh.qx, dhl.d, d, false);
      this.a(czh.qy, dhl.f, a, false);
      this.a(czh.qz, dhl.f, b, false);
      this.a(czh.qA, dhl.f, c, false);
      this.a(czh.qB, dhl.f, d, false);
      this.a(czh.qC, dhl.e, a, false);
      this.a(czh.qD, dhl.e, b, false);
      this.a(czh.qE, dhl.e, c, false);
      this.a(czh.qF, dhl.e, d, false);
      this.a(czh.qG, dhl.h, a, false);
      this.a(czh.qH, dhl.h, b, false);
      this.a(czh.qI, dhl.h, c, false);
      this.a(czh.qJ, dhl.h, d, false);
      this.a(czh.vU, -6265536);
      this.b(czh.za, frk.bI);
      this.b(czh.zb, frk.bI);
      this.b(czh.zc, frk.bI);
      this.b(czh.zd, frk.bI);
      this.b(czh.ze, frk.bI);
      this.b(czh.zf, frk.bI);
      this.b(czh.zg, frk.bI);
      this.b(czh.zh, frk.bI);
      this.b(czh.zi, frk.bI);
      this.b(czh.zj, frk.bI);
      this.b(czh.zk, frk.bI);
      this.b(czh.zl, frk.bI);
      this.b(czh.zm, frk.bI);
      this.b(czh.zn, frk.bI);
      this.b(czh.zo, frk.bI);
      this.b(czh.zp, frk.bI);
      this.b(czh.zq, frk.bI);
      this.b(czh.zr, frk.bI);
      this.b(czh.zs, frk.bI);
      this.b(czh.zt, frk.bI);
      this.b(czh.zu, frk.bI);
      this.b(czh.zv, frk.bI);
      this.b(czh.zw, frk.bI);
      this.b(czh.zO, frk.bI);
      this.b(czh.zP, frk.bI);
      this.b(czh.zR, frk.bI);
      this.a(czh.vF, new fqh());
      this.a(czh.tc, "_markings", new fql());
      this.f(czh.rM);
      this.f(czh.sc);
      this.f(czh.rN);
      this.f(czh.rU);
      this.f(czh.rV);
      this.f(czh.rQ);
      this.f(czh.rY);
      this.f(czh.rW);
      this.f(czh.rR);
      this.f(czh.sb);
      this.f(czh.rX);
      this.f(czh.rP);
      this.f(czh.rT);
      this.f(czh.sa);
      this.f(czh.rS);
      this.f(czh.rZ);
      this.f(czh.rO);
      this.n(czh.sf);
      this.o(czh.xd);
      this.r(czh.pf);
      this.g(czh.pj);
      this.h(czh.xg);
      this.i(czh.oD);
      this.j(czh.yG);
      this.k(czh.sd);
      this.l(czh.xt);
      this.m(czh.wD);
      this.q(czh.wB);
      this.p(czh.tt);
      this.p(czh.wz);
      this.p(czh.wC);
      this.a(czh.tC, 11366765, 8538184);
      this.a(czh.tD, 56063, 44543);
      this.a(czh.tE, 16499171, 10890612);
      this.a(czh.tF, 4996656, 986895);
      this.a(czh.tG, 15582019, 4400155);
      this.a(czh.tH, 16167425, 16775294);
      this.a(czh.tI, 9084018, 3231003);
      this.a(czh.tJ, 11506911, 9529055);
      this.a(czh.tK, 15714446, 9794134);
      this.a(czh.tL, 16565097, 13341495);
      this.a(czh.tM, 803406, 11013646);
      this.a(czh.tN, 10592673, 16711680);
      this.a(czh.tO, 12691306, 15058059);
      this.a(czh.tP, 4470310, 10592673);
      this.a(czh.tQ, 894731, 0);
      this.a(czh.tR, 2243405, 16382457);
      this.a(czh.tS, 5457209, 8811878);
      this.a(czh.tT, 9433559, 7969893);
      this.a(czh.tU, 13552826, 7632531);
      this.a(czh.tV, 1842204, 14711290);
      this.a(czh.tW, 1447446, 0);
      this.a(czh.tX, 1447446, 7237230);
      this.a(czh.tY, 9804699, 1973274);
      this.a(czh.tZ, 14005919, 13396256);
      this.a(czh.ua, 13661252, 16762748);
      this.a(czh.ub, 16382457, 12369084);
      this.a(czh.uc, 611926, 8778172);
      this.a(czh.ud, 10851452, 5589310);
      this.a(czh.ue, 5931634, 15826224);
      this.a(czh.uf, 13004373, 6251620);
      this.a(czh.ug, 12623485, 15656192);
      this.a(czh.uh, 7958625, 15125652);
      this.a(czh.ui, 14405058, 7643954);
      this.a(czh.uj, 12623485, 10051392);
      this.a(czh.uk, 3407872, 16579584);
      this.a(czh.ul, 10489616, 12040119);
      this.a(czh.um, 1769984, 5321501);
      this.a(czh.un, 15720061, 5653556);
      this.a(czh.uo, 15198183, 1776418);
      this.a(czh.up, 894731, 16711680);
      this.a(czh.uq, 4411786, 8978176);
      this.a(czh.ur, 15771042, 14377823);
      this.a(czh.us, 10051392, 16380836);
      this.a(czh.ut, 5843472, 16380836);
      this.a(czh.uu, 5451574, 9804699);
      this.a(czh.uv, 15658718, 14014157);
      this.a(czh.uw, 16167425, 3654642);
      this.a(czh.ux, 10051392, 7555121);
      this.a(czh.uy, 7697520, 5984329);
      this.a(czh.uz, 10489616, 951412);
      this.a(czh.uA, 15198183, 16758197);
      this.a(czh.uB, 9725844, 5060690);
      this.a(czh.uC, 7237230, 3158064);
      this.a(czh.uD, 12698049, 4802889);
      this.a(czh.uE, 6842447, 15066584);
      this.a(czh.uF, 5349438, 8306542);
      this.a(czh.uG, 8855049, 2468720);
      this.a(czh.uH, 14283506, 8496292);
      this.a(czh.uI, 3419431, 11013646);
      this.a(czh.uJ, 2243405, 7375001);
      this.a(czh.uK, 6387319, 14543594);
      this.a(czh.uL, 10236982, 5065037);
      this.a(czh.uM, 7164733, 1444352);
      this.a(czh.uN, 15377456, 4547222);
      this.a(czh.uO, 15690005, 16775663);
      this.a(czh.uP, 15198183, 44975);
      this.a(czh.uQ, 8032420, 15265265);
      this.a(czh.uR, 5651507, 12422002);
      this.a(czh.uS, 9804699, 2580065);
      this.a(czh.uT, 4547222, 15377456);
      this.a(czh.uU, 1001033, 3790560);
      this.a(czh.uV, 3407872, 5349438);
      this.a(czh.uW, 1315860, 5075616);
      this.a(czh.uX, 1315860, 4672845);
      this.a(czh.uY, 14144467, 13545366);
      this.a(czh.uZ, 13004373, 15132390);
      this.a(czh.va, 6250335, 16545810);
      this.a(czh.vb, 44975, 7969893);
      this.a(czh.vc, 3232308, 9945732);
      this.a(czh.vd, 5651507, 7969893);
      this.a(czh.ve, 15373203, 5009705);
      this.a(czh.a);
      this.a(czh.yz);
      this.a(czh.yw);
      this.a(czh.yx);
      this.a(czh.yy);
      this.a(czh.ei);
      this.a(czh.eh);
      this.a(czh.eg);
      this.a(czh.yA);
      this.a(czh.sH);
      this.a(czh.sh);
      this.a(czh.qh);
      this.a(czh.vV);
   }

   public static record a(dhp a, alf<dhq> b) {
   }
}
