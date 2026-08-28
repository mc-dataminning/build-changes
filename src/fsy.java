import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fsy {
   private static final fsp f = ftk.a(-1);
   public static final alk a = a("helmet");
   public static final alk b = a("chestplate");
   public static final alk c = a("leggings");
   public static final alk d = a("boots");
   public static final List<fsy.a> e = List.of(
      new fsy.a(dim.d, dio.a),
      new fsy.a(dim.e, dio.b),
      new fsy.a(dim.f, dio.c),
      new fsy.a(dim.g, dio.d),
      new fsy.a(dim.h, dio.e),
      new fsy.a(dim.i, dio.f),
      new fsy.a(dim.j, dio.g),
      new fsy.a(dim.k, dio.h),
      new fsy.a(dim.l, dio.i),
      new fsy.a(dim.m, dio.j),
      new fsy.a(dim.n, dio.k)
   );
   private final fsz g;
   private final BiConsumer<alk, ftl> h;

   public static alk a(String $$0) {
      return alk.b("trims/items/" + $$0 + "_trim");
   }

   public fsy(fsz $$0, BiConsumer<alk, ftl> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(czw $$0) {
      this.g.a($$0, ftk.a(ftm.a($$0)));
   }

   private alk a(czw $$0, ftn $$1) {
      return $$1.a(ftm.a($$0), ftp.b($$0), this.h);
   }

   private void b(czw $$0, ftn $$1) {
      this.g.a($$0, ftk.a(this.a($$0, $$1)));
   }

   private alk a(czw $$0, String $$1, ftn $$2) {
      return $$2.a(ftm.a($$0, $$1), ftp.k(ftp.a($$0, $$1)), this.h);
   }

   private alk a(czw $$0, czw $$1, ftn $$2) {
      return $$2.a(ftm.a($$0), ftp.b($$1), this.h);
   }

   private void b(czw $$0, czw $$1, ftn $$2) {
      this.g.a($$0, ftk.a(this.a($$0, $$1, $$2)));
   }

   private void a(czw $$0, fsp $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(czw $$0, String $$1, fsp $$2) {
      alk $$3 = this.a($$0, ftp.c($$0), ftp.a($$0, $$1));
      this.g.a($$0, ftk.a($$3, f, $$2));
   }

   private List<hhx.a> b(czw $$0) {
      List<hhx.a> $$1 = new ArrayList<>();
      hhr.b $$2 = ftk.a(this.a($$0, "_16", fto.bI));
      $$1.add(ftk.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azq.b($$3 - 16, 32);
         hhr.b $$5 = ftk.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), fto.bI));
         $$1.add(ftk.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(ftk.a($$2, 31.5F));
      return $$1;
   }

   private void c(czw $$0) {
      List<hhx.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            ftk.a(
               ftk.a(kl.ah),
               ftk.a(new hit(true, hiu.a.b), 32.0F, $$1),
               ftk.a(ftk.a(new hit(true, hiu.a.c), 32.0F, $$1), ftk.a(new hit(true, hiu.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(czw $$0) {
      this.g.a($$0, ftk.a(new hit(true, hiu.a.d), 32.0F, this.b($$0)));
   }

   private void e(czw $$0) {
      List<hhx.a> $$1 = new ArrayList<>();
      hhr.b $$2 = ftk.a(this.a($$0, "_00", fto.bI));
      $$1.add(ftk.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hhr.b $$4 = ftk.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), fto.bI));
         $$1.add(ftk.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(ftk.a($$2, 63.5F));
      this.g.a($$0, ftk.a(ftk.a(new hjd(true, hjd.a.b), 64.0F, $$1), ftk.a(new hjd(true, hjd.a.a), 64.0F, $$1)));
   }

   private alk a(czw $$0, alk $$1, alk $$2) {
      return fto.bM.a($$0, ftp.c($$1, $$2), this.h);
   }

   private alk a(alk $$0, alk $$1, alk $$2) {
      return fto.bM.a($$0, ftp.c($$1, $$2), this.h);
   }

   private void a(alk $$0, alk $$1, alk $$2, alk $$3) {
      fto.bN.a($$0, ftp.a($$1, $$2, $$3), this.h);
   }

   private void a(czw $$0, alj<dih> $$1, alk $$2, boolean $$3) {
      alk $$4 = ftm.a($$0);
      alk $$5 = ftp.c($$0);
      alk $$6 = ftp.a($$0, "_overlay");
      List<hhy.b<alj<din>>> $$7 = new ArrayList<>(e.size());

      for (fsy.a $$8 : e) {
         alk $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alk $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hhr.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = ftk.a($$9, new fsm(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = ftk.a($$9);
         }

         $$7.add(ftk.a($$8.b, $$11));
      }

      hhr.b $$13;
      if ($$3) {
         fto.bM.a($$4, ftp.c($$5, $$6), this.h);
         $$13 = ftk.a($$4, new fsm(-6265536));
      } else {
         fto.bI.a($$4, ftp.k($$5), this.h);
         $$13 = ftk.a($$4);
      }

      this.g.a($$0, ftk.a(new hjt(), $$13, $$7));
   }

   private void f(czw $$0) {
      hhr.b $$1 = ftk.a(this.a($$0, fto.bI));
      alk $$2 = this.a($$0, fto.bS, "_open_back");
      alk $$3 = this.a($$0, fto.bR, "_open_front");
      hhr.b $$4 = ftk.a(ftk.a($$2), new hhm.a(), ftk.a($$3));
      hhr.b $$5 = ftk.a(new hic(), $$4, $$1);
      this.g.a($$0, ftk.a(new hjn(), $$1, ftk.a(czy.g, $$5)));
   }

   private alk a(czw $$0, ftn $$1, String $$2) {
      alk $$3 = ftp.a($$0, $$2);
      return $$1.a($$0, ftp.k($$3), this.h);
   }

   private void g(czw $$0) {
      hhr.b $$1 = ftk.a(ftm.a($$0));
      hhr.b $$2 = ftk.a(this.a($$0, "_pulling_0", fto.bT));
      hhr.b $$3 = ftk.a(this.a($$0, "_pulling_1", fto.bT));
      hhr.b $$4 = ftk.a(this.a($$0, "_pulling_2", fto.bT));
      this.g.a($$0, ftk.a(ftk.a(), ftk.a(new hjf(false), 0.05F, $$2, ftk.a($$3, 0.65F), ftk.a($$4, 0.9F)), $$1));
   }

   private void h(czw $$0) {
      hhr.b $$1 = ftk.a(ftm.a($$0));
      hhr.b $$2 = ftk.a(this.a($$0, "_pulling_0", fto.bU));
      hhr.b $$3 = ftk.a(this.a($$0, "_pulling_1", fto.bU));
      hhr.b $$4 = ftk.a(this.a($$0, "_pulling_2", fto.bU));
      hhr.b $$5 = ftk.a(this.a($$0, "_arrow", fto.bU));
      hhr.b $$6 = ftk.a(this.a($$0, "_firework", fto.bU));
      this.g
         .a($$0, ftk.a(new hji(), ftk.a(ftk.a(), ftk.a(new hix(), $$2, ftk.a($$3, 0.58F), ftk.a($$4, 1.0F)), $$1), ftk.a(cyt.a.b, $$5), ftk.a(cyt.a.c, $$6)));
   }

   private void a(czw $$0, hif $$1, hhr.b $$2, hhr.b $$3) {
      this.g.a($$0, ftk.a($$1, $$2, $$3));
   }

   private void i(czw $$0) {
      hhr.b $$1 = ftk.a(this.a($$0, fto.bI));
      hhr.b $$2 = ftk.a(this.a($$0, "_broken", fto.bI));
      this.a($$0, new hib(), $$2, $$1);
   }

   private void j(czw $$0) {
      hhr.b $$1 = ftk.a(ftm.a($$0));
      hhr.b $$2 = ftk.a(ftm.a($$0, "_brushing_0"));
      hhr.b $$3 = ftk.a(ftm.a($$0, "_brushing_1"));
      hhr.b $$4 = ftk.a(ftm.a($$0, "_brushing_2"));
      this.g.a($$0, ftk.a(new hje(10.0F), 0.1F, $$1, ftk.a($$2, 0.25F), ftk.a($$3, 0.5F), ftk.a($$4, 0.75F)));
   }

   private void k(czw $$0) {
      hhr.b $$1 = ftk.a(this.a($$0, fto.bL));
      hhr.b $$2 = ftk.a(this.a($$0, "_cast", fto.bL));
      this.a($$0, new hij(), $$2, $$1);
   }

   private void l(czw $$0) {
      hhr.b $$1 = ftk.a(ftm.a($$0));
      hhr.b $$2 = ftk.a(ftm.b("tooting_goat_horn"));
      this.a($$0, ftk.a(), $$2, $$1);
   }

   private void m(czw $$0) {
      hhr.b $$1 = ftk.a(ftm.a($$0), new hkd.a());
      hhr.b $$2 = ftk.a(ftm.a($$0, "_blocking"), new hkd.a());
      this.a($$0, ftk.a(), $$2, $$1);
   }

   private static hhr.b a(hhr.b $$0, hhr.b $$1) {
      return ftk.a(new hjn(), $$1, ftk.a(List.of(czy.g, czy.h, czy.i), $$0));
   }

   private void n(czw $$0) {
      hhr.b $$1 = ftk.a(this.a($$0, fto.bI));
      hhr.b $$2 = ftk.a(ftm.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(czw $$0) {
      hhr.b $$1 = ftk.a(this.a($$0, fto.bI));
      hhr.b $$2 = ftk.a(ftm.a($$0, "_in_hand"), new hkj.a());
      hhr.b $$3 = ftk.a(ftm.a($$0, "_throwing"), new hkj.a());
      hhr.b $$4 = ftk.a(ftk.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(czw $$0, alk $$1) {
      this.g.a($$0, ftk.a($$1, new fss()));
   }

   private void p(czw $$0) {
      alk $$1 = this.a($$0, ftm.b("potion_overlay"), ftm.a($$0));
      this.a($$0, $$1);
   }

   private void q(czw $$0) {
      alk $$1 = this.a($$0, ftm.a($$0, "_head"), ftm.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(czw $$0, int $$1) {
      alk $$2 = this.a($$0, fto.bI);
      this.g.a($$0, ftk.a($$2, new fsm($$1)));
   }

   private void r(czw $$0) {
      alk $$1 = ftp.c($$0);
      alk $$2 = ftp.a($$0, "_overlay");
      alk $$3 = fto.bI.a($$0, ftp.k($$1), this.h);
      alk $$4 = ftm.a($$0, "_dyed");
      fto.bM.a($$4, ftp.c($$1, $$2), this.h);
      this.g.a($$0, ftk.a(ftk.a(kl.K), ftk.a($$4, f, new fsm(0)), ftk.a($$3)));
   }

   public void a() {
      this.b(dae.oM, fto.bI);
      this.b(dae.oO, fto.bI);
      this.b(dae.oN, fto.bI);
      this.b(dae.oP, fto.bI);
      this.b(dae.pr, fto.bI);
      this.b(dae.pi, fto.bI);
      this.b(dae.pe, fto.bI);
      this.b(dae.vQ, fto.bI);
      this.b(dae.pk, fto.bI);
      this.b(dae.vr, fto.bI);
      this.b(dae.ej, fto.bK);
      this.b(dae.ti, fto.bI);
      this.b(dae.wv, fto.bI);
      this.b(dae.wx, fto.bI);
      this.b(dae.oI, fto.bI);
      this.b(dae.oJ, fto.bI);
      this.b(dae.sF, fto.bI);
      this.b(dae.tw, fto.bI);
      this.b(dae.to, fto.bK);
      this.b(dae.sB, fto.bI);
      this.b(dae.sG, fto.bI);
      this.b(dae.xs, fto.bI);
      this.b(dae.rF, fto.bI);
      this.b(dae.ph, fto.bI);
      this.b(dae.ql, fto.bI);
      this.b(dae.rB, fto.bI);
      this.b(dae.vk, fto.bK);
      this.b(dae.sC, fto.bI);
      this.b(dae.ro, fto.bI);
      this.b(dae.oA, fto.bL);
      this.b(dae.oB, fto.bL);
      this.b(dae.pm, fto.bI);
      this.b(dae.ow, fto.bI);
      this.b(dae.tk, fto.bI);
      this.b(dae.wr, fto.bI);
      this.b(dae.rC, fto.bI);
      this.e(dae.se);
      this.b(dae.pl, fto.bI);
      this.b(dae.rx, fto.bI);
      this.b(dae.vX, fto.bI);
      this.c(dae.rK);
      this.d(dae.rL);
      this.b(dae.tj, fto.bI);
      this.b(dae.tl, fto.bI);
      this.b(dae.sl, fto.bI);
      this.b(dae.vZ, fto.bI);
      this.b(dae.qM, fto.bI);
      this.b(dae.vM, fto.bI);
      this.b(dae.sm, fto.bI);
      this.b(dae.ta, fto.bI);
      this.b(dae.pu, fto.bI);
      this.b(dae.pv, fto.bI);
      this.b(dae.xk, fto.bI);
      this.b(dae.sz, fto.bI);
      this.b(dae.oQ, fto.bI);
      this.b(dae.oR, fto.bI);
      this.b(dae.pn, fto.bI);
      this.b(dae.pX, fto.bK);
      this.b(dae.pY, fto.bK);
      this.b(dae.vT, fto.bI);
      this.b(dae.pW, fto.bK);
      this.b(dae.pV, fto.bK);
      this.b(dae.pU, fto.bK);
      this.b(dae.wy, fto.bI);
      this.b(dae.tf, fto.bI);
      this.b(dae.rH, fto.bI);
      this.b(dae.rI, fto.bI);
      this.b(dae.rJ, fto.bI);
      this.b(dae.po, fto.bI);
      this.b(dae.vG, fto.bI);
      this.b(dae.tA, fto.bI);
      this.b(dae.tn, fto.bI);
      this.b(dae.wq, fto.bI);
      this.b(dae.vf, fto.bI);
      this.b(dae.tv, fto.bI);
      this.b(dae.xr, fto.bI);
      this.b(dae.vE, fto.bI);
      this.b(dae.vg, fto.bI);
      this.b(dae.qK, fto.bI);
      this.b(dae.pg, fto.bI);
      this.b(dae.xp, fto.bI);
      this.b(dae.xj, fto.bI);
      this.b(dae.ox, fto.bI);
      this.b(dae.tp, fto.bI);
      this.b(dae.ts, fto.bI);
      this.b(dae.tB, fto.bI);
      this.b(dae.xn, fto.bI);
      this.b(dae.xH, fto.bI);
      this.b(dae.sg, fto.bI);
      this.b(dae.so, fto.bI);
      this.b(dae.vn, fto.bI);
      this.b(dae.pw, fto.bI);
      this.b(dae.qO, fto.bI);
      this.b(dae.pN, fto.bK);
      this.b(dae.vu, fto.bI);
      this.b(dae.pO, fto.bK);
      this.b(dae.vS, fto.bI);
      this.b(dae.pM, fto.bK);
      this.b(dae.pL, fto.bK);
      this.b(dae.pK, fto.bK);
      this.b(dae.px, fto.bI);
      this.b(dae.tq, fto.bI);
      this.b(dae.sx, fto.bI);
      this.b(dae.sD, fto.bI);
      this.b(dae.qi, fto.bI);
      this.b(dae.xq, fto.bI);
      this.b(dae.xf, fto.bI);
      this.b(dae.xL, fto.bI);
      this.b(dae.xO, fto.bI);
      this.b(dae.oz, fto.bI);
      this.b(dae.sn, fto.bI);
      this.b(dae.ps, fto.bI);
      this.b(dae.pS, fto.bK);
      this.b(dae.pT, fto.bK);
      this.b(dae.vR, fto.bI);
      this.b(dae.pt, fto.bI);
      this.b(dae.wG, fto.bI);
      this.b(dae.pR, fto.bK);
      this.b(dae.pQ, fto.bK);
      this.b(dae.pP, fto.bK);
      this.b(dae.vm, fto.bI);
      this.b(dae.oK, fto.bI);
      this.b(dae.oL, fto.bI);
      this.b(dae.wH, fto.bI);
      this.b(dae.pp, fto.bI);
      this.b(dae.rq, fto.bI);
      this.b(dae.rt, fto.bI);
      this.b(dae.st, fto.bI);
      this.b(dae.sy, fto.bI);
      this.b(dae.sv, fto.bI);
      this.b(dae.ss, fto.bI);
      this.b(dae.tx, fto.bI);
      this.b(dae.oU, fto.bI);
      this.b(dae.oV, fto.bI);
      this.b(dae.oW, fto.bI);
      this.b(dae.oX, fto.bI);
      this.b(dae.vt, fto.bI);
      this.b(dae.te, fto.bI);
      this.b(dae.ru, fto.bI);
      this.b(dae.ov, fto.bI);
      this.b(dae.xm, fto.bI);
      this.b(dae.qf, fto.bI);
      this.b(dae.xc, fto.bI);
      this.b(dae.wV, fto.bJ);
      this.b(dae.wJ, fto.bJ);
      this.b(dae.wL, fto.bJ);
      this.b(dae.wK, fto.bJ);
      this.b(dae.wM, fto.bJ);
      this.b(dae.wN, fto.bJ);
      this.b(dae.wO, fto.bJ);
      this.b(dae.wP, fto.bJ);
      this.b(dae.wQ, fto.bJ);
      this.b(dae.wR, fto.bJ);
      this.b(dae.xa, fto.bJ);
      this.b(dae.xb, fto.bJ);
      this.b(dae.wS, fto.bJ);
      this.b(dae.wT, fto.bJ);
      this.b(dae.wW, fto.bJ);
      this.b(dae.wU, fto.bJ);
      this.b(dae.wX, fto.bJ);
      this.b(dae.wY, fto.bJ);
      this.b(dae.wZ, fto.bJ);
      this.b(dae.vY, fto.bI);
      this.b(dae.vW, fto.bI);
      this.b(dae.xe, fto.bI);
      this.b(dae.qc, fto.bK);
      this.b(dae.qd, fto.bK);
      this.b(dae.py, fto.bI);
      this.b(dae.qb, fto.bK);
      this.b(dae.pz, fto.bI);
      this.b(dae.qa, fto.bK);
      this.b(dae.pZ, fto.bK);
      this.b(dae.vH, fto.bI);
      this.b(dae.vI, fto.bI);
      this.b(dae.vC, fto.bI);
      this.b(dae.oE, fto.bI);
      this.b(dae.oF, fto.bI);
      this.b(dae.sr, fto.bI);
      this.b(dae.qN, fto.bI);
      this.b(dae.oS, fto.bI);
      this.b(dae.oT, fto.bI);
      this.b(dae.rE, fto.bI);
      this.b(dae.oC, fto.bI);
      this.b(dae.xo, fto.bI);
      this.b(dae.sw, fto.bI);
      this.b(dae.vs, fto.bI);
      this.b(dae.ws, fto.bI);
      this.b(dae.qL, fto.bI);
      this.b(dae.rr, fto.bI);
      this.b(dae.vK, fto.bI);
      this.b(dae.vJ, fto.bI);
      this.b(dae.sk, fto.bI);
      this.b(dae.rv, fto.bI);
      this.b(dae.vD, fto.bI);
      this.b(dae.sA, fto.bI);
      this.b(dae.pq, fto.bI);
      this.b(dae.vL, fto.bI);
      this.b(dae.vO, fto.bI);
      this.b(dae.vP, fto.bI);
      this.b(dae.vN, fto.bI);
      this.b(dae.sE, fto.bI);
      this.b(dae.tm, fto.bI);
      this.b(dae.ou, fto.bI);
      this.b(dae.si, fto.bI);
      this.b(dae.rw, fto.bI);
      this.b(dae.pd, fto.bI);
      this.b(dae.td, fto.bI);
      this.b(dae.wF, fto.bI);
      this.b(dae.xl, fto.bI);
      this.b(dae.rG, fto.bI);
      this.b(dae.rs, fto.bI);
      this.b(dae.yF, fto.bI);
      this.b(dae.wA, fto.bI);
      this.b(dae.tu, fto.bI);
      this.b(dae.oG, fto.bI);
      this.b(dae.oH, fto.bI);
      this.b(dae.qe, fto.bK);
      this.b(dae.pI, fto.bK);
      this.b(dae.pJ, fto.bK);
      this.b(dae.pH, fto.bK);
      this.b(dae.pG, fto.bK);
      this.b(dae.pF, fto.bK);
      this.b(dae.sI, fto.bI);
      this.b(dae.xh, fto.bI);
      this.b(dae.oy, fto.bI);
      this.b(dae.wE, fto.bI);
      this.b(dae.sj, fto.bI);
      this.b(dae.ry, fto.bI);
      this.b(dae.rz, fto.bI);
      this.b(dae.rA, fto.bI);
      this.b(dae.rp, fto.bI);
      this.b(dae.qk, fto.bI);
      this.b(dae.sq, fto.bI);
      this.b(dae.vh, fto.bI);
      this.b(dae.vl, fto.cc);
      this.b(dae.pD, fto.bK);
      this.b(dae.pE, fto.bK);
      this.b(dae.pC, fto.bK);
      this.b(dae.pB, fto.bK);
      this.b(dae.pA, fto.bK);
      this.b(dae.vi, fto.bI);
      this.b(dae.vj, fto.bI);
      this.b(dae.su, fto.bI);
      this.b(dae.yH, fto.bI);
      this.b(dae.yI, fto.bI);
      this.b(dae.yJ, fto.bI);
      this.b(dae.yK, fto.bI);
      this.b(dae.yL, fto.bI);
      this.b(dae.yM, fto.bI);
      this.b(dae.yN, fto.bI);
      this.b(dae.yO, fto.bI);
      this.b(dae.yP, fto.bI);
      this.b(dae.yQ, fto.bI);
      this.b(dae.yR, fto.bI);
      this.b(dae.yS, fto.bI);
      this.b(dae.yT, fto.bI);
      this.b(dae.yU, fto.bI);
      this.b(dae.yV, fto.bI);
      this.b(dae.yW, fto.bI);
      this.b(dae.yX, fto.bI);
      this.b(dae.yY, fto.bI);
      this.b(dae.yZ, fto.bI);
      this.b(dae.wI, dae.qe, fto.bK);
      this.b(dae.qP, dae.qO, fto.bI);
      this.a(dae.pc, dii.g, a, false);
      this.a(dae.qm, dii.b, a, true);
      this.a(dae.qn, dii.b, b, true);
      this.a(dae.qo, dii.b, c, true);
      this.a(dae.qp, dii.b, d, true);
      this.a(dae.qq, dii.c, a, false);
      this.a(dae.qr, dii.c, b, false);
      this.a(dae.qs, dii.c, c, false);
      this.a(dae.qt, dii.c, d, false);
      this.a(dae.qu, dii.d, a, false);
      this.a(dae.qv, dii.d, b, false);
      this.a(dae.qw, dii.d, c, false);
      this.a(dae.qx, dii.d, d, false);
      this.a(dae.qy, dii.f, a, false);
      this.a(dae.qz, dii.f, b, false);
      this.a(dae.qA, dii.f, c, false);
      this.a(dae.qB, dii.f, d, false);
      this.a(dae.qC, dii.e, a, false);
      this.a(dae.qD, dii.e, b, false);
      this.a(dae.qE, dii.e, c, false);
      this.a(dae.qF, dii.e, d, false);
      this.a(dae.qG, dii.h, a, false);
      this.a(dae.qH, dii.h, b, false);
      this.a(dae.qI, dii.h, c, false);
      this.a(dae.qJ, dii.h, d, false);
      this.a(dae.vU, -6265536);
      this.b(dae.za, fto.bI);
      this.b(dae.zb, fto.bI);
      this.b(dae.zc, fto.bI);
      this.b(dae.zd, fto.bI);
      this.b(dae.ze, fto.bI);
      this.b(dae.zf, fto.bI);
      this.b(dae.zg, fto.bI);
      this.b(dae.zh, fto.bI);
      this.b(dae.zi, fto.bI);
      this.b(dae.zj, fto.bI);
      this.b(dae.zk, fto.bI);
      this.b(dae.zl, fto.bI);
      this.b(dae.zm, fto.bI);
      this.b(dae.zn, fto.bI);
      this.b(dae.zo, fto.bI);
      this.b(dae.zp, fto.bI);
      this.b(dae.zq, fto.bI);
      this.b(dae.zr, fto.bI);
      this.b(dae.zs, fto.bI);
      this.b(dae.zt, fto.bI);
      this.b(dae.zu, fto.bI);
      this.b(dae.zv, fto.bI);
      this.b(dae.zw, fto.bI);
      this.b(dae.zO, fto.bI);
      this.b(dae.zP, fto.bI);
      this.b(dae.zR, fto.bI);
      this.a(dae.vF, new fsn());
      this.a(dae.tc, "_markings", new fsr());
      this.f(dae.rM);
      this.f(dae.sc);
      this.f(dae.rN);
      this.f(dae.rU);
      this.f(dae.rV);
      this.f(dae.rQ);
      this.f(dae.rY);
      this.f(dae.rW);
      this.f(dae.rR);
      this.f(dae.sb);
      this.f(dae.rX);
      this.f(dae.rP);
      this.f(dae.rT);
      this.f(dae.sa);
      this.f(dae.rS);
      this.f(dae.rZ);
      this.f(dae.rO);
      this.n(dae.sf);
      this.o(dae.xd);
      this.r(dae.pf);
      this.g(dae.pj);
      this.h(dae.xg);
      this.i(dae.oD);
      this.j(dae.yG);
      this.k(dae.sd);
      this.l(dae.xt);
      this.m(dae.wD);
      this.q(dae.wB);
      this.p(dae.tt);
      this.p(dae.wz);
      this.p(dae.wC);
      this.b(dae.tC, fto.bI);
      this.b(dae.tD, fto.bI);
      this.b(dae.tE, fto.bI);
      this.b(dae.tF, fto.bI);
      this.b(dae.tG, fto.bI);
      this.b(dae.tH, fto.bI);
      this.b(dae.tI, fto.bI);
      this.b(dae.tJ, fto.bI);
      this.b(dae.tK, fto.bI);
      this.b(dae.tL, fto.bI);
      this.b(dae.tM, fto.bI);
      this.b(dae.tN, fto.bI);
      this.b(dae.tO, fto.bI);
      this.b(dae.tP, fto.bI);
      this.b(dae.tQ, fto.bI);
      this.b(dae.tR, fto.bI);
      this.b(dae.tS, fto.bI);
      this.b(dae.tT, fto.bI);
      this.b(dae.tU, fto.bI);
      this.b(dae.tV, fto.bI);
      this.b(dae.tW, fto.bI);
      this.b(dae.tX, fto.bI);
      this.b(dae.tY, fto.bI);
      this.b(dae.tZ, fto.bI);
      this.b(dae.ua, fto.bI);
      this.b(dae.ub, fto.bI);
      this.b(dae.uc, fto.bI);
      this.b(dae.ud, fto.bI);
      this.b(dae.ue, fto.bI);
      this.b(dae.uf, fto.bI);
      this.b(dae.ug, fto.bI);
      this.b(dae.uh, fto.bI);
      this.b(dae.ui, fto.bI);
      this.b(dae.uj, fto.bI);
      this.b(dae.uk, fto.bI);
      this.b(dae.ul, fto.bI);
      this.b(dae.um, fto.bI);
      this.b(dae.un, fto.bI);
      this.b(dae.uo, fto.bI);
      this.b(dae.up, fto.bI);
      this.b(dae.uq, fto.bI);
      this.b(dae.ur, fto.bI);
      this.b(dae.us, fto.bI);
      this.b(dae.ut, fto.bI);
      this.b(dae.uu, fto.bI);
      this.b(dae.uv, fto.bI);
      this.b(dae.uw, fto.bI);
      this.b(dae.ux, fto.bI);
      this.b(dae.uy, fto.bI);
      this.b(dae.uz, fto.bI);
      this.b(dae.uA, fto.bI);
      this.b(dae.uB, fto.bI);
      this.b(dae.uC, fto.bI);
      this.b(dae.uD, fto.bI);
      this.b(dae.uE, fto.bI);
      this.b(dae.uF, fto.bI);
      this.b(dae.uG, fto.bI);
      this.b(dae.uH, fto.bI);
      this.b(dae.uI, fto.bI);
      this.b(dae.uJ, fto.bI);
      this.b(dae.uK, fto.bI);
      this.b(dae.uL, fto.bI);
      this.b(dae.uM, fto.bI);
      this.b(dae.uN, fto.bI);
      this.b(dae.uO, fto.bI);
      this.b(dae.uP, fto.bI);
      this.b(dae.uQ, fto.bI);
      this.b(dae.uR, fto.bI);
      this.b(dae.uS, fto.bI);
      this.b(dae.uT, fto.bI);
      this.b(dae.uU, fto.bI);
      this.b(dae.uV, fto.bI);
      this.b(dae.uW, fto.bI);
      this.b(dae.uX, fto.bI);
      this.b(dae.uY, fto.bI);
      this.b(dae.uZ, fto.bI);
      this.b(dae.va, fto.bI);
      this.b(dae.vb, fto.bI);
      this.b(dae.vc, fto.bI);
      this.b(dae.vd, fto.bI);
      this.b(dae.ve, fto.bI);
      this.a(dae.a);
      this.a(dae.yz);
      this.a(dae.yw);
      this.a(dae.yx);
      this.a(dae.yy);
      this.a(dae.ei);
      this.a(dae.eh);
      this.a(dae.eg);
      this.a(dae.yA);
      this.a(dae.sH);
      this.a(dae.sh);
      this.a(dae.qh);
      this.a(dae.vV);
   }

   public static record a(dim a, alj<din> b) {
   }
}
