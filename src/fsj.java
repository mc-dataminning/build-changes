import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fsj {
   private static final fsa f = fsv.a(-1);
   public static final alr a = a("helmet");
   public static final alr b = a("chestplate");
   public static final alr c = a("leggings");
   public static final alr d = a("boots");
   public static final List<fsj.a> e = List.of(
      new fsj.a(diw.d, diy.a),
      new fsj.a(diw.e, diy.b),
      new fsj.a(diw.f, diy.c),
      new fsj.a(diw.g, diy.d),
      new fsj.a(diw.h, diy.e),
      new fsj.a(diw.i, diy.f),
      new fsj.a(diw.j, diy.g),
      new fsj.a(diw.k, diy.h),
      new fsj.a(diw.l, diy.i),
      new fsj.a(diw.m, diy.j),
      new fsj.a(diw.n, diy.k)
   );
   private final fsk g;
   private final BiConsumer<alr, fsw> h;

   public static alr a(String $$0) {
      return alr.b("trims/items/" + $$0 + "_trim");
   }

   public fsj(fsk $$0, BiConsumer<alr, fsw> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(dag $$0) {
      this.g.a($$0, fsv.a(fsx.a($$0)));
   }

   private alr a(dag $$0, fsy $$1) {
      return $$1.a(fsx.a($$0), fta.b($$0), this.h);
   }

   private void b(dag $$0, fsy $$1) {
      this.g.a($$0, fsv.a(this.a($$0, $$1)));
   }

   private alr a(dag $$0, String $$1, fsy $$2) {
      return $$2.a(fsx.a($$0, $$1), fta.k(fta.a($$0, $$1)), this.h);
   }

   private alr a(dag $$0, dag $$1, fsy $$2) {
      return $$2.a(fsx.a($$0), fta.b($$1), this.h);
   }

   private void b(dag $$0, dag $$1, fsy $$2) {
      this.g.a($$0, fsv.a(this.a($$0, $$1, $$2)));
   }

   private void a(dag $$0, fsa $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(dag $$0, String $$1, fsa $$2) {
      alr $$3 = this.a($$0, fta.c($$0), fta.a($$0, $$1));
      this.g.a($$0, fsv.a($$3, f, $$2));
   }

   private List<hhl.a> b(dag $$0) {
      List<hhl.a> $$1 = new ArrayList<>();
      hhf.b $$2 = fsv.a(this.a($$0, "_16", fsz.bI));
      $$1.add(fsv.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azz.b($$3 - 16, 32);
         hhf.b $$5 = fsv.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fsz.bI));
         $$1.add(fsv.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fsv.a($$2, 31.5F));
      return $$1;
   }

   private void c(dag $$0) {
      List<hhl.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fsv.a(
               fsv.a(kl.ah),
               fsv.a(new hih(true, hii.a.b), 32.0F, $$1),
               fsv.a(fsv.a(new hih(true, hii.a.c), 32.0F, $$1), fsv.a(new hih(true, hii.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(dag $$0) {
      this.g.a($$0, fsv.a(new hih(true, hii.a.d), 32.0F, this.b($$0)));
   }

   private void e(dag $$0) {
      List<hhl.a> $$1 = new ArrayList<>();
      hhf.b $$2 = fsv.a(this.a($$0, "_00", fsz.bI));
      $$1.add(fsv.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hhf.b $$4 = fsv.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fsz.bI));
         $$1.add(fsv.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fsv.a($$2, 63.5F));
      this.g.a($$0, fsv.a(fsv.a(new hir(true, hir.a.b), 64.0F, $$1), fsv.a(new hir(true, hir.a.a), 64.0F, $$1)));
   }

   private alr a(dag $$0, alr $$1, alr $$2) {
      return fsz.bM.a($$0, fta.c($$1, $$2), this.h);
   }

   private alr a(alr $$0, alr $$1, alr $$2) {
      return fsz.bM.a($$0, fta.c($$1, $$2), this.h);
   }

   private void a(alr $$0, alr $$1, alr $$2, alr $$3) {
      fsz.bN.a($$0, fta.a($$1, $$2, $$3), this.h);
   }

   private void a(dag $$0, alq<dir> $$1, alr $$2, boolean $$3) {
      alr $$4 = fsx.a($$0);
      alr $$5 = fta.c($$0);
      alr $$6 = fta.a($$0, "_overlay");
      List<hhm.b<alq<dix>>> $$7 = new ArrayList<>(e.size());

      for (fsj.a $$8 : e) {
         alr $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alr $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hhf.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fsv.a($$9, new frx(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fsv.a($$9);
         }

         $$7.add(fsv.a($$8.b, $$11));
      }

      hhf.b $$13;
      if ($$3) {
         fsz.bM.a($$4, fta.c($$5, $$6), this.h);
         $$13 = fsv.a($$4, new frx(-6265536));
      } else {
         fsz.bI.a($$4, fta.k($$5), this.h);
         $$13 = fsv.a($$4);
      }

      this.g.a($$0, fsv.a(new hjh(), $$13, $$7));
   }

   private void f(dag $$0) {
      hhf.b $$1 = fsv.a(this.a($$0, fsz.bI));
      alr $$2 = this.a($$0, fsz.bS, "_open_back");
      alr $$3 = this.a($$0, fsz.bR, "_open_front");
      hhf.b $$4 = fsv.a(fsv.a($$2), new hha.a(), fsv.a($$3));
      hhf.b $$5 = fsv.a(new hhq(), $$4, $$1);
      this.g.a($$0, fsv.a(new hjb(), $$1, fsv.a(dai.g, $$5)));
   }

   private alr a(dag $$0, fsy $$1, String $$2) {
      alr $$3 = fta.a($$0, $$2);
      return $$1.a($$0, fta.k($$3), this.h);
   }

   private void g(dag $$0) {
      hhf.b $$1 = fsv.a(fsx.a($$0));
      hhf.b $$2 = fsv.a(this.a($$0, "_pulling_0", fsz.bT));
      hhf.b $$3 = fsv.a(this.a($$0, "_pulling_1", fsz.bT));
      hhf.b $$4 = fsv.a(this.a($$0, "_pulling_2", fsz.bT));
      this.g.a($$0, fsv.a(fsv.a(), fsv.a(new hit(false), 0.05F, $$2, fsv.a($$3, 0.65F), fsv.a($$4, 0.9F)), $$1));
   }

   private void h(dag $$0) {
      hhf.b $$1 = fsv.a(fsx.a($$0));
      hhf.b $$2 = fsv.a(this.a($$0, "_pulling_0", fsz.bU));
      hhf.b $$3 = fsv.a(this.a($$0, "_pulling_1", fsz.bU));
      hhf.b $$4 = fsv.a(this.a($$0, "_pulling_2", fsz.bU));
      hhf.b $$5 = fsv.a(this.a($$0, "_arrow", fsz.bU));
      hhf.b $$6 = fsv.a(this.a($$0, "_firework", fsz.bU));
      this.g
         .a($$0, fsv.a(new hiw(), fsv.a(fsv.a(), fsv.a(new hil(), $$2, fsv.a($$3, 0.58F), fsv.a($$4, 1.0F)), $$1), fsv.a(czd.a.b, $$5), fsv.a(czd.a.c, $$6)));
   }

   private void a(dag $$0, hht $$1, hhf.b $$2, hhf.b $$3) {
      this.g.a($$0, fsv.a($$1, $$2, $$3));
   }

   private void i(dag $$0) {
      hhf.b $$1 = fsv.a(this.a($$0, fsz.bI));
      hhf.b $$2 = fsv.a(this.a($$0, "_broken", fsz.bI));
      this.a($$0, new hhp(), $$2, $$1);
   }

   private void j(dag $$0) {
      hhf.b $$1 = fsv.a(fsx.a($$0));
      hhf.b $$2 = fsv.a(fsx.a($$0, "_brushing_0"));
      hhf.b $$3 = fsv.a(fsx.a($$0, "_brushing_1"));
      hhf.b $$4 = fsv.a(fsx.a($$0, "_brushing_2"));
      this.g.a($$0, fsv.a(new his(10.0F), 0.1F, $$1, fsv.a($$2, 0.25F), fsv.a($$3, 0.5F), fsv.a($$4, 0.75F)));
   }

   private void k(dag $$0) {
      hhf.b $$1 = fsv.a(this.a($$0, fsz.bL));
      hhf.b $$2 = fsv.a(this.a($$0, "_cast", fsz.bL));
      this.a($$0, new hhx(), $$2, $$1);
   }

   private void l(dag $$0) {
      hhf.b $$1 = fsv.a(fsx.a($$0));
      hhf.b $$2 = fsv.a(fsx.b("tooting_goat_horn"));
      this.a($$0, fsv.a(), $$2, $$1);
   }

   private void m(dag $$0) {
      hhf.b $$1 = fsv.a(fsx.a($$0), new hjr.a());
      hhf.b $$2 = fsv.a(fsx.a($$0, "_blocking"), new hjr.a());
      this.a($$0, fsv.a(), $$2, $$1);
   }

   private static hhf.b a(hhf.b $$0, hhf.b $$1) {
      return fsv.a(new hjb(), $$1, fsv.a(List.of(dai.g, dai.h, dai.i), $$0));
   }

   private void n(dag $$0) {
      hhf.b $$1 = fsv.a(this.a($$0, fsz.bI));
      hhf.b $$2 = fsv.a(fsx.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(dag $$0) {
      hhf.b $$1 = fsv.a(this.a($$0, fsz.bI));
      hhf.b $$2 = fsv.a(fsx.a($$0, "_in_hand"), new hjx.a());
      hhf.b $$3 = fsv.a(fsx.a($$0, "_throwing"), new hjx.a());
      hhf.b $$4 = fsv.a(fsv.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(dag $$0, alr $$1) {
      this.g.a($$0, fsv.a($$1, new fsd()));
   }

   private void p(dag $$0) {
      alr $$1 = this.a($$0, fsx.b("potion_overlay"), fsx.a($$0));
      this.a($$0, $$1);
   }

   private void q(dag $$0) {
      alr $$1 = this.a($$0, fsx.a($$0, "_head"), fsx.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(dag $$0, int $$1) {
      alr $$2 = this.a($$0, fsz.bI);
      this.g.a($$0, fsv.a($$2, new frx($$1)));
   }

   private void r(dag $$0) {
      alr $$1 = fta.c($$0);
      alr $$2 = fta.a($$0, "_overlay");
      alr $$3 = fsz.bI.a($$0, fta.k($$1), this.h);
      alr $$4 = fsx.a($$0, "_dyed");
      fsz.bM.a($$4, fta.c($$1, $$2), this.h);
      this.g.a($$0, fsv.a(fsv.a(kl.K), fsv.a($$4, f, new frx(0)), fsv.a($$3)));
   }

   public void a() {
      this.b(dao.oM, fsz.bI);
      this.b(dao.oO, fsz.bI);
      this.b(dao.oN, fsz.bI);
      this.b(dao.oP, fsz.bI);
      this.b(dao.pr, fsz.bI);
      this.b(dao.pi, fsz.bI);
      this.b(dao.pe, fsz.bI);
      this.b(dao.vQ, fsz.bI);
      this.b(dao.pk, fsz.bI);
      this.b(dao.vr, fsz.bI);
      this.b(dao.ej, fsz.bK);
      this.b(dao.ti, fsz.bI);
      this.b(dao.wv, fsz.bI);
      this.b(dao.wx, fsz.bI);
      this.b(dao.oI, fsz.bI);
      this.b(dao.oJ, fsz.bI);
      this.b(dao.sF, fsz.bI);
      this.b(dao.tw, fsz.bI);
      this.b(dao.to, fsz.bK);
      this.b(dao.sB, fsz.bI);
      this.b(dao.sG, fsz.bI);
      this.b(dao.xs, fsz.bI);
      this.b(dao.rF, fsz.bI);
      this.b(dao.ph, fsz.bI);
      this.b(dao.ql, fsz.bI);
      this.b(dao.rB, fsz.bI);
      this.b(dao.vk, fsz.bK);
      this.b(dao.sC, fsz.bI);
      this.b(dao.ro, fsz.bI);
      this.b(dao.oA, fsz.bL);
      this.b(dao.oB, fsz.bL);
      this.b(dao.pm, fsz.bI);
      this.b(dao.ow, fsz.bI);
      this.b(dao.tk, fsz.bI);
      this.b(dao.wr, fsz.bI);
      this.b(dao.rC, fsz.bI);
      this.e(dao.se);
      this.b(dao.pl, fsz.bI);
      this.b(dao.rx, fsz.bI);
      this.b(dao.vX, fsz.bI);
      this.c(dao.rK);
      this.d(dao.rL);
      this.b(dao.tj, fsz.bI);
      this.b(dao.tl, fsz.bI);
      this.b(dao.sl, fsz.bI);
      this.b(dao.vZ, fsz.bI);
      this.b(dao.qM, fsz.bI);
      this.b(dao.vM, fsz.bI);
      this.b(dao.sm, fsz.bI);
      this.b(dao.ta, fsz.bI);
      this.b(dao.pu, fsz.bI);
      this.b(dao.pv, fsz.bI);
      this.b(dao.xk, fsz.bI);
      this.b(dao.sz, fsz.bI);
      this.b(dao.oQ, fsz.bI);
      this.b(dao.oR, fsz.bI);
      this.b(dao.pn, fsz.bI);
      this.b(dao.pX, fsz.bK);
      this.b(dao.pY, fsz.bK);
      this.b(dao.vT, fsz.bI);
      this.b(dao.pW, fsz.bK);
      this.b(dao.pV, fsz.bK);
      this.b(dao.pU, fsz.bK);
      this.b(dao.wy, fsz.bI);
      this.b(dao.tf, fsz.bI);
      this.b(dao.rH, fsz.bI);
      this.b(dao.rI, fsz.bI);
      this.b(dao.rJ, fsz.bI);
      this.b(dao.po, fsz.bI);
      this.b(dao.vG, fsz.bI);
      this.b(dao.tA, fsz.bI);
      this.b(dao.tn, fsz.bI);
      this.b(dao.wq, fsz.bI);
      this.b(dao.vf, fsz.bI);
      this.b(dao.tv, fsz.bI);
      this.b(dao.xr, fsz.bI);
      this.b(dao.vE, fsz.bI);
      this.b(dao.vg, fsz.bI);
      this.b(dao.qK, fsz.bI);
      this.b(dao.pg, fsz.bI);
      this.b(dao.xp, fsz.bI);
      this.b(dao.xj, fsz.bI);
      this.b(dao.ox, fsz.bI);
      this.b(dao.tp, fsz.bI);
      this.b(dao.ts, fsz.bI);
      this.b(dao.tB, fsz.bI);
      this.b(dao.xn, fsz.bI);
      this.b(dao.xH, fsz.bI);
      this.b(dao.sg, fsz.bI);
      this.b(dao.so, fsz.bI);
      this.b(dao.vn, fsz.bI);
      this.b(dao.pw, fsz.bI);
      this.b(dao.qO, fsz.bI);
      this.b(dao.pN, fsz.bK);
      this.b(dao.vu, fsz.bI);
      this.b(dao.pO, fsz.bK);
      this.b(dao.vS, fsz.bI);
      this.b(dao.pM, fsz.bK);
      this.b(dao.pL, fsz.bK);
      this.b(dao.pK, fsz.bK);
      this.b(dao.px, fsz.bI);
      this.b(dao.tq, fsz.bI);
      this.b(dao.sx, fsz.bI);
      this.b(dao.sD, fsz.bI);
      this.b(dao.qi, fsz.bI);
      this.b(dao.xq, fsz.bI);
      this.b(dao.xf, fsz.bI);
      this.b(dao.xL, fsz.bI);
      this.b(dao.xO, fsz.bI);
      this.b(dao.oz, fsz.bI);
      this.b(dao.sn, fsz.bI);
      this.b(dao.ps, fsz.bI);
      this.b(dao.pS, fsz.bK);
      this.b(dao.pT, fsz.bK);
      this.b(dao.vR, fsz.bI);
      this.b(dao.pt, fsz.bI);
      this.b(dao.wG, fsz.bI);
      this.b(dao.pR, fsz.bK);
      this.b(dao.pQ, fsz.bK);
      this.b(dao.pP, fsz.bK);
      this.b(dao.vm, fsz.bI);
      this.b(dao.oK, fsz.bI);
      this.b(dao.oL, fsz.bI);
      this.b(dao.wH, fsz.bI);
      this.b(dao.pp, fsz.bI);
      this.b(dao.rq, fsz.bI);
      this.b(dao.rt, fsz.bI);
      this.b(dao.st, fsz.bI);
      this.b(dao.sy, fsz.bI);
      this.b(dao.sv, fsz.bI);
      this.b(dao.ss, fsz.bI);
      this.b(dao.tx, fsz.bI);
      this.b(dao.oU, fsz.bI);
      this.b(dao.oV, fsz.bI);
      this.b(dao.oW, fsz.bI);
      this.b(dao.oX, fsz.bI);
      this.b(dao.vt, fsz.bI);
      this.b(dao.te, fsz.bI);
      this.b(dao.ru, fsz.bI);
      this.b(dao.ov, fsz.bI);
      this.b(dao.xm, fsz.bI);
      this.b(dao.qf, fsz.bI);
      this.b(dao.xc, fsz.bI);
      this.b(dao.wV, fsz.bJ);
      this.b(dao.wJ, fsz.bJ);
      this.b(dao.wL, fsz.bJ);
      this.b(dao.wK, fsz.bJ);
      this.b(dao.wM, fsz.bJ);
      this.b(dao.wN, fsz.bJ);
      this.b(dao.wO, fsz.bJ);
      this.b(dao.wP, fsz.bJ);
      this.b(dao.wQ, fsz.bJ);
      this.b(dao.wR, fsz.bJ);
      this.b(dao.xa, fsz.bJ);
      this.b(dao.xb, fsz.bJ);
      this.b(dao.wS, fsz.bJ);
      this.b(dao.wT, fsz.bJ);
      this.b(dao.wW, fsz.bJ);
      this.b(dao.wU, fsz.bJ);
      this.b(dao.wX, fsz.bJ);
      this.b(dao.wY, fsz.bJ);
      this.b(dao.wZ, fsz.bJ);
      this.b(dao.vY, fsz.bI);
      this.b(dao.vW, fsz.bI);
      this.b(dao.xe, fsz.bI);
      this.b(dao.qc, fsz.bK);
      this.b(dao.qd, fsz.bK);
      this.b(dao.py, fsz.bI);
      this.b(dao.qb, fsz.bK);
      this.b(dao.pz, fsz.bI);
      this.b(dao.qa, fsz.bK);
      this.b(dao.pZ, fsz.bK);
      this.b(dao.vH, fsz.bI);
      this.b(dao.vI, fsz.bI);
      this.b(dao.vC, fsz.bI);
      this.b(dao.oE, fsz.bI);
      this.b(dao.oF, fsz.bI);
      this.b(dao.sr, fsz.bI);
      this.b(dao.qN, fsz.bI);
      this.b(dao.oS, fsz.bI);
      this.b(dao.oT, fsz.bI);
      this.b(dao.rE, fsz.bI);
      this.b(dao.oC, fsz.bI);
      this.b(dao.xo, fsz.bI);
      this.b(dao.sw, fsz.bI);
      this.b(dao.vs, fsz.bI);
      this.b(dao.ws, fsz.bI);
      this.b(dao.qL, fsz.bI);
      this.b(dao.rr, fsz.bI);
      this.b(dao.vK, fsz.bI);
      this.b(dao.vJ, fsz.bI);
      this.b(dao.sk, fsz.bI);
      this.b(dao.rv, fsz.bI);
      this.b(dao.vD, fsz.bI);
      this.b(dao.sA, fsz.bI);
      this.b(dao.pq, fsz.bI);
      this.b(dao.vL, fsz.bI);
      this.b(dao.vO, fsz.bI);
      this.b(dao.vP, fsz.bI);
      this.b(dao.vN, fsz.bI);
      this.b(dao.sE, fsz.bI);
      this.b(dao.tm, fsz.bI);
      this.b(dao.ou, fsz.bI);
      this.b(dao.si, fsz.bI);
      this.b(dao.rw, fsz.bI);
      this.b(dao.pd, fsz.bI);
      this.b(dao.td, fsz.bI);
      this.b(dao.wF, fsz.bI);
      this.b(dao.xl, fsz.bI);
      this.b(dao.rG, fsz.bI);
      this.b(dao.rs, fsz.bI);
      this.b(dao.yF, fsz.bI);
      this.b(dao.wA, fsz.bI);
      this.b(dao.tu, fsz.bI);
      this.b(dao.oG, fsz.bI);
      this.b(dao.oH, fsz.bI);
      this.b(dao.qe, fsz.bK);
      this.b(dao.pI, fsz.bK);
      this.b(dao.pJ, fsz.bK);
      this.b(dao.pH, fsz.bK);
      this.b(dao.pG, fsz.bK);
      this.b(dao.pF, fsz.bK);
      this.b(dao.sI, fsz.bI);
      this.b(dao.xh, fsz.bI);
      this.b(dao.oy, fsz.bI);
      this.b(dao.wE, fsz.bI);
      this.b(dao.sj, fsz.bI);
      this.b(dao.ry, fsz.bI);
      this.b(dao.rz, fsz.bI);
      this.b(dao.rA, fsz.bI);
      this.b(dao.rp, fsz.bI);
      this.b(dao.qk, fsz.bI);
      this.b(dao.sq, fsz.bI);
      this.b(dao.vh, fsz.bI);
      this.b(dao.vl, fsz.cc);
      this.b(dao.pD, fsz.bK);
      this.b(dao.pE, fsz.bK);
      this.b(dao.pC, fsz.bK);
      this.b(dao.pB, fsz.bK);
      this.b(dao.pA, fsz.bK);
      this.b(dao.vi, fsz.bI);
      this.b(dao.vj, fsz.bI);
      this.b(dao.su, fsz.bI);
      this.b(dao.yH, fsz.bI);
      this.b(dao.yI, fsz.bI);
      this.b(dao.yJ, fsz.bI);
      this.b(dao.yK, fsz.bI);
      this.b(dao.yL, fsz.bI);
      this.b(dao.yM, fsz.bI);
      this.b(dao.yN, fsz.bI);
      this.b(dao.yO, fsz.bI);
      this.b(dao.yP, fsz.bI);
      this.b(dao.yQ, fsz.bI);
      this.b(dao.yR, fsz.bI);
      this.b(dao.yS, fsz.bI);
      this.b(dao.yT, fsz.bI);
      this.b(dao.yU, fsz.bI);
      this.b(dao.yV, fsz.bI);
      this.b(dao.yW, fsz.bI);
      this.b(dao.yX, fsz.bI);
      this.b(dao.yY, fsz.bI);
      this.b(dao.yZ, fsz.bI);
      this.b(dao.wI, dao.qe, fsz.bK);
      this.b(dao.qP, dao.qO, fsz.bI);
      this.a(dao.pc, dis.g, a, false);
      this.a(dao.qm, dis.b, a, true);
      this.a(dao.qn, dis.b, b, true);
      this.a(dao.qo, dis.b, c, true);
      this.a(dao.qp, dis.b, d, true);
      this.a(dao.qq, dis.c, a, false);
      this.a(dao.qr, dis.c, b, false);
      this.a(dao.qs, dis.c, c, false);
      this.a(dao.qt, dis.c, d, false);
      this.a(dao.qu, dis.d, a, false);
      this.a(dao.qv, dis.d, b, false);
      this.a(dao.qw, dis.d, c, false);
      this.a(dao.qx, dis.d, d, false);
      this.a(dao.qy, dis.f, a, false);
      this.a(dao.qz, dis.f, b, false);
      this.a(dao.qA, dis.f, c, false);
      this.a(dao.qB, dis.f, d, false);
      this.a(dao.qC, dis.e, a, false);
      this.a(dao.qD, dis.e, b, false);
      this.a(dao.qE, dis.e, c, false);
      this.a(dao.qF, dis.e, d, false);
      this.a(dao.qG, dis.h, a, false);
      this.a(dao.qH, dis.h, b, false);
      this.a(dao.qI, dis.h, c, false);
      this.a(dao.qJ, dis.h, d, false);
      this.a(dao.vU, -6265536);
      this.b(dao.za, fsz.bI);
      this.b(dao.zb, fsz.bI);
      this.b(dao.zc, fsz.bI);
      this.b(dao.zd, fsz.bI);
      this.b(dao.ze, fsz.bI);
      this.b(dao.zf, fsz.bI);
      this.b(dao.zg, fsz.bI);
      this.b(dao.zh, fsz.bI);
      this.b(dao.zi, fsz.bI);
      this.b(dao.zj, fsz.bI);
      this.b(dao.zk, fsz.bI);
      this.b(dao.zl, fsz.bI);
      this.b(dao.zm, fsz.bI);
      this.b(dao.zn, fsz.bI);
      this.b(dao.zo, fsz.bI);
      this.b(dao.zp, fsz.bI);
      this.b(dao.zq, fsz.bI);
      this.b(dao.zr, fsz.bI);
      this.b(dao.zs, fsz.bI);
      this.b(dao.zt, fsz.bI);
      this.b(dao.zu, fsz.bI);
      this.b(dao.zv, fsz.bI);
      this.b(dao.zw, fsz.bI);
      this.b(dao.zO, fsz.bI);
      this.b(dao.zP, fsz.bI);
      this.b(dao.zR, fsz.bI);
      this.a(dao.vF, new fry());
      this.a(dao.tc, "_markings", new fsc());
      this.f(dao.rM);
      this.f(dao.sc);
      this.f(dao.rN);
      this.f(dao.rU);
      this.f(dao.rV);
      this.f(dao.rQ);
      this.f(dao.rY);
      this.f(dao.rW);
      this.f(dao.rR);
      this.f(dao.sb);
      this.f(dao.rX);
      this.f(dao.rP);
      this.f(dao.rT);
      this.f(dao.sa);
      this.f(dao.rS);
      this.f(dao.rZ);
      this.f(dao.rO);
      this.n(dao.sf);
      this.o(dao.xd);
      this.r(dao.pf);
      this.g(dao.pj);
      this.h(dao.xg);
      this.i(dao.oD);
      this.j(dao.yG);
      this.k(dao.sd);
      this.l(dao.xt);
      this.m(dao.wD);
      this.q(dao.wB);
      this.p(dao.tt);
      this.p(dao.wz);
      this.p(dao.wC);
      this.b(dao.tC, fsz.bI);
      this.b(dao.tD, fsz.bI);
      this.b(dao.tE, fsz.bI);
      this.b(dao.tF, fsz.bI);
      this.b(dao.tG, fsz.bI);
      this.b(dao.tH, fsz.bI);
      this.b(dao.tI, fsz.bI);
      this.b(dao.tJ, fsz.bI);
      this.b(dao.tK, fsz.bI);
      this.b(dao.tL, fsz.bI);
      this.b(dao.tM, fsz.bI);
      this.b(dao.tN, fsz.bI);
      this.b(dao.tO, fsz.bI);
      this.b(dao.tP, fsz.bI);
      this.b(dao.tQ, fsz.bI);
      this.b(dao.tR, fsz.bI);
      this.b(dao.tS, fsz.bI);
      this.b(dao.tT, fsz.bI);
      this.b(dao.tU, fsz.bI);
      this.b(dao.tV, fsz.bI);
      this.b(dao.tW, fsz.bI);
      this.b(dao.tX, fsz.bI);
      this.b(dao.tY, fsz.bI);
      this.b(dao.tZ, fsz.bI);
      this.b(dao.ua, fsz.bI);
      this.b(dao.ub, fsz.bI);
      this.b(dao.uc, fsz.bI);
      this.b(dao.ud, fsz.bI);
      this.b(dao.ue, fsz.bI);
      this.b(dao.uf, fsz.bI);
      this.b(dao.ug, fsz.bI);
      this.b(dao.uh, fsz.bI);
      this.b(dao.ui, fsz.bI);
      this.b(dao.uj, fsz.bI);
      this.b(dao.uk, fsz.bI);
      this.b(dao.ul, fsz.bI);
      this.b(dao.um, fsz.bI);
      this.b(dao.un, fsz.bI);
      this.b(dao.uo, fsz.bI);
      this.b(dao.up, fsz.bI);
      this.b(dao.uq, fsz.bI);
      this.b(dao.ur, fsz.bI);
      this.b(dao.us, fsz.bI);
      this.b(dao.ut, fsz.bI);
      this.b(dao.uu, fsz.bI);
      this.b(dao.uv, fsz.bI);
      this.b(dao.uw, fsz.bI);
      this.b(dao.ux, fsz.bI);
      this.b(dao.uy, fsz.bI);
      this.b(dao.uz, fsz.bI);
      this.b(dao.uA, fsz.bI);
      this.b(dao.uB, fsz.bI);
      this.b(dao.uC, fsz.bI);
      this.b(dao.uD, fsz.bI);
      this.b(dao.uE, fsz.bI);
      this.b(dao.uF, fsz.bI);
      this.b(dao.uG, fsz.bI);
      this.b(dao.uH, fsz.bI);
      this.b(dao.uI, fsz.bI);
      this.b(dao.uJ, fsz.bI);
      this.b(dao.uK, fsz.bI);
      this.b(dao.uL, fsz.bI);
      this.b(dao.uM, fsz.bI);
      this.b(dao.uN, fsz.bI);
      this.b(dao.uO, fsz.bI);
      this.b(dao.uP, fsz.bI);
      this.b(dao.uQ, fsz.bI);
      this.b(dao.uR, fsz.bI);
      this.b(dao.uS, fsz.bI);
      this.b(dao.uT, fsz.bI);
      this.b(dao.uU, fsz.bI);
      this.b(dao.uV, fsz.bI);
      this.b(dao.uW, fsz.bI);
      this.b(dao.uX, fsz.bI);
      this.b(dao.uY, fsz.bI);
      this.b(dao.uZ, fsz.bI);
      this.b(dao.va, fsz.bI);
      this.b(dao.vb, fsz.bI);
      this.b(dao.vc, fsz.bI);
      this.b(dao.vd, fsz.bI);
      this.b(dao.ve, fsz.bI);
      this.a(dao.a);
      this.a(dao.yz);
      this.a(dao.yw);
      this.a(dao.yx);
      this.a(dao.yy);
      this.a(dao.ei);
      this.a(dao.eh);
      this.a(dao.eg);
      this.a(dao.yA);
      this.a(dao.sH);
      this.a(dao.sh);
      this.a(dao.qh);
      this.a(dao.vV);
   }

   public static record a(diw a, alq<dix> b) {
   }
}
