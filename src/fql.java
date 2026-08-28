import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class fql {
   private static final fqc f = fqz.a(-1);
   public static final alg a = a("helmet");
   public static final alg b = a("chestplate");
   public static final alg c = a("leggings");
   public static final alg d = a("boots");
   public static final List<fql.a> e = List.of(
      new fql.a(dhk.d, dhm.a),
      new fql.a(dhk.e, dhm.b),
      new fql.a(dhk.f, dhm.c),
      new fql.a(dhk.g, dhm.d),
      new fql.a(dhk.h, dhm.e),
      new fql.a(dhk.i, dhm.f),
      new fql.a(dhk.j, dhm.g),
      new fql.a(dhk.k, dhm.h),
      new fql.a(dhk.l, dhm.i),
      new fql.a(dhk.m, dhm.j),
      new fql.a(dhk.n, dhm.k)
   );
   private final fqm g;
   private final BiConsumer<alg, fra> h;

   public static alg a(String $$0) {
      return alg.b("trims/items/" + $$0 + "_trim");
   }

   public fql(fqm $$0, BiConsumer<alg, fra> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cyu $$0) {
      this.g.a($$0, fqz.a(frb.a($$0)));
   }

   private alg a(cyu $$0, frc $$1) {
      return $$1.a(frb.a($$0), fre.b($$0), this.h);
   }

   private void b(cyu $$0, frc $$1) {
      this.g.a($$0, fqz.a(this.a($$0, $$1)));
   }

   private alg a(cyu $$0, String $$1, frc $$2) {
      return $$2.a(frb.a($$0, $$1), fre.k(fre.a($$0, $$1)), this.h);
   }

   private alg a(cyu $$0, cyu $$1, frc $$2) {
      return $$2.a(frb.a($$0), fre.b($$1), this.h);
   }

   private void b(cyu $$0, cyu $$1, frc $$2) {
      this.g.a($$0, fqz.a(this.a($$0, $$1, $$2)));
   }

   private void a(cyu $$0, fqc $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cyu $$0, String $$1, fqc $$2) {
      alg $$3 = this.a($$0, fre.c($$0), fre.a($$0, $$1));
      this.g.a($$0, fqz.a($$3, f, $$2));
   }

   private List<hfk.a> b(cyu $$0) {
      List<hfk.a> $$1 = new ArrayList<>();
      hff.b $$2 = fqz.a(this.a($$0, "_16", frd.bI));
      $$1.add(fqz.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = azm.b($$3 - 16, 32);
         hff.b $$5 = fqz.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), frd.bI));
         $$1.add(fqz.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fqz.a($$2, 31.5F));
      return $$1;
   }

   private void c(cyu $$0) {
      List<hfk.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fqz.a(
               fqz.a(kj.ah),
               fqz.a(new hgg(true, hgh.a.b), 32.0F, $$1),
               fqz.a(fqz.a(new hgg(true, hgh.a.c), 32.0F, $$1), fqz.a(new hgg(true, hgh.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cyu $$0) {
      this.g.a($$0, fqz.a(new hgg(true, hgh.a.d), 32.0F, this.b($$0)));
   }

   private void e(cyu $$0) {
      List<hfk.a> $$1 = new ArrayList<>();
      hff.b $$2 = fqz.a(this.a($$0, "_00", frd.bI));
      $$1.add(fqz.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hff.b $$4 = fqz.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), frd.bI));
         $$1.add(fqz.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fqz.a($$2, 63.5F));
      this.g.a($$0, fqz.a(fqz.a(new hgq(true, hgq.a.b), 64.0F, $$1), fqz.a(new hgq(true, hgq.a.a), 64.0F, $$1)));
   }

   private alg a(cyu $$0, alg $$1, alg $$2) {
      return frd.bM.a($$0, fre.c($$1, $$2), this.h);
   }

   private alg a(alg $$0, alg $$1, alg $$2) {
      return frd.bM.a($$0, fre.c($$1, $$2), this.h);
   }

   private void a(alg $$0, alg $$1, alg $$2, alg $$3) {
      frd.bN.a($$0, fre.a($$1, $$2, $$3), this.h);
   }

   private void a(cyu $$0, alf<dhf> $$1, alg $$2, boolean $$3) {
      alg $$4 = frb.a($$0);
      alg $$5 = fre.c($$0);
      alg $$6 = fre.a($$0, "_overlay");
      List<hfl.b<alf<dhl>>> $$7 = new ArrayList<>(e.size());

      for (fql.a $$8 : e) {
         alg $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
         alg $$10 = $$2.g("_" + $$8.a().a($$1).a());
         hff.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fqz.a($$9, new fpz(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fqz.a($$9);
         }

         $$7.add(fqz.a($$8.b, $$11));
      }

      hff.b $$13;
      if ($$3) {
         frd.bM.a($$4, fre.c($$5, $$6), this.h);
         $$13 = fqz.a($$4, new fpz(-6265536));
      } else {
         frd.bI.a($$4, fre.k($$5), this.h);
         $$13 = fqz.a($$4);
      }

      this.g.a($$0, fqz.a(new hhg(), $$13, $$7));
   }

   private void f(cyu $$0) {
      hff.b $$1 = fqz.a(this.a($$0, frd.bI));
      alg $$2 = this.a($$0, frd.bS, "_open_back");
      alg $$3 = this.a($$0, frd.bR, "_open_front");
      hff.b $$4 = fqz.a(fqz.a($$2), new hfa.a(), fqz.a($$3));
      hff.b $$5 = fqz.a(new hfp(), $$4, $$1);
      this.g.a($$0, fqz.a(new hha(), $$1, fqz.a(cyw.g, $$5)));
   }

   private alg a(cyu $$0, frc $$1, String $$2) {
      alg $$3 = fre.a($$0, $$2);
      return $$1.a($$0, fre.k($$3), this.h);
   }

   private void g(cyu $$0) {
      hff.b $$1 = fqz.a(frb.a($$0));
      hff.b $$2 = fqz.a(this.a($$0, "_pulling_0", frd.bT));
      hff.b $$3 = fqz.a(this.a($$0, "_pulling_1", frd.bT));
      hff.b $$4 = fqz.a(this.a($$0, "_pulling_2", frd.bT));
      this.g.a($$0, fqz.a(fqz.a(), fqz.a(new hgs(false), 0.05F, $$2, fqz.a($$3, 0.65F), fqz.a($$4, 0.9F)), $$1));
   }

   private void h(cyu $$0) {
      hff.b $$1 = fqz.a(frb.a($$0));
      hff.b $$2 = fqz.a(this.a($$0, "_pulling_0", frd.bU));
      hff.b $$3 = fqz.a(this.a($$0, "_pulling_1", frd.bU));
      hff.b $$4 = fqz.a(this.a($$0, "_pulling_2", frd.bU));
      hff.b $$5 = fqz.a(this.a($$0, "_arrow", frd.bU));
      hff.b $$6 = fqz.a(this.a($$0, "_firework", frd.bU));
      this.g
         .a($$0, fqz.a(new hgv(), fqz.a(fqz.a(), fqz.a(new hgk(), $$2, fqz.a($$3, 0.58F), fqz.a($$4, 1.0F)), $$1), fqz.a(cxr.a.b, $$5), fqz.a(cxr.a.c, $$6)));
   }

   private void a(cyu $$0, hfs $$1, hff.b $$2, hff.b $$3) {
      this.g.a($$0, fqz.a($$1, $$2, $$3));
   }

   private void i(cyu $$0) {
      hff.b $$1 = fqz.a(this.a($$0, frd.bI));
      hff.b $$2 = fqz.a(this.a($$0, "_broken", frd.bI));
      this.a($$0, new hfo(), $$2, $$1);
   }

   private void j(cyu $$0) {
      hff.b $$1 = fqz.a(frb.a($$0));
      hff.b $$2 = fqz.a(frb.a($$0, "_brushing_0"));
      hff.b $$3 = fqz.a(frb.a($$0, "_brushing_1"));
      hff.b $$4 = fqz.a(frb.a($$0, "_brushing_2"));
      this.g.a($$0, fqz.a(new hgr(10.0F), 0.1F, $$1, fqz.a($$2, 0.25F), fqz.a($$3, 0.5F), fqz.a($$4, 0.75F)));
   }

   private void k(cyu $$0) {
      hff.b $$1 = fqz.a(this.a($$0, frd.bL));
      hff.b $$2 = fqz.a(this.a($$0, "_cast", frd.bL));
      this.a($$0, new hfw(), $$2, $$1);
   }

   private void l(cyu $$0) {
      hff.b $$1 = fqz.a(frb.a($$0));
      hff.b $$2 = fqz.a(frb.b("tooting_goat_horn"));
      this.a($$0, fqz.a(), $$2, $$1);
   }

   private void m(cyu $$0) {
      hff.b $$1 = fqz.a(frb.a($$0), new hhq.a());
      hff.b $$2 = fqz.a(frb.a($$0, "_blocking"), new hhq.a());
      this.a($$0, fqz.a(), $$2, $$1);
   }

   private static hff.b a(hff.b $$0, hff.b $$1) {
      return fqz.a(new hha(), $$1, fqz.a(List.of(cyw.g, cyw.h, cyw.i), $$0));
   }

   private void n(cyu $$0) {
      hff.b $$1 = fqz.a(this.a($$0, frd.bI));
      hff.b $$2 = fqz.a(frb.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cyu $$0) {
      hff.b $$1 = fqz.a(this.a($$0, frd.bI));
      hff.b $$2 = fqz.a(frb.a($$0, "_in_hand"), new hhw.a());
      hff.b $$3 = fqz.a(frb.a($$0, "_throwing"), new hhw.a());
      hff.b $$4 = fqz.a(fqz.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cyu $$0, alg $$1) {
      this.g.a($$0, fqz.a($$1, new fqf()));
   }

   private void p(cyu $$0) {
      alg $$1 = this.a($$0, frb.b("potion_overlay"), frb.a($$0));
      this.a($$0, $$1);
   }

   private void q(cyu $$0) {
      alg $$1 = this.a($$0, frb.a($$0, "_head"), frb.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cyu $$0, int $$1) {
      alg $$2 = this.a($$0, frd.bI);
      this.g.a($$0, fqz.a($$2, new fpz($$1)));
   }

   private void a(cyu $$0, int $$1, int $$2) {
      alg $$3 = frb.b("template_spawn_egg");
      this.g.a($$0, fqz.a($$3, fqz.a($$1), fqz.a($$2)));
   }

   private void r(cyu $$0) {
      alg $$1 = fre.c($$0);
      alg $$2 = fre.a($$0, "_overlay");
      alg $$3 = frd.bI.a($$0, fre.k($$1), this.h);
      alg $$4 = frb.a($$0, "_dyed");
      frd.bM.a($$4, fre.c($$1, $$2), this.h);
      this.g.a($$0, fqz.a(fqz.a(kj.K), fqz.a($$4, f, new fpz(0)), fqz.a($$3)));
   }

   public void a() {
      this.b(czc.oJ, frd.bI);
      this.b(czc.oL, frd.bI);
      this.b(czc.oK, frd.bI);
      this.b(czc.oM, frd.bI);
      this.b(czc.po, frd.bI);
      this.b(czc.pf, frd.bI);
      this.b(czc.pb, frd.bI);
      this.b(czc.vL, frd.bI);
      this.b(czc.ph, frd.bI);
      this.b(czc.vm, frd.bI);
      this.b(czc.eh, frd.bK);
      this.b(czc.td, frd.bI);
      this.b(czc.wq, frd.bI);
      this.b(czc.ws, frd.bI);
      this.b(czc.oF, frd.bI);
      this.b(czc.oG, frd.bI);
      this.b(czc.sA, frd.bI);
      this.b(czc.tr, frd.bI);
      this.b(czc.tj, frd.bK);
      this.b(czc.sw, frd.bI);
      this.b(czc.sB, frd.bI);
      this.b(czc.xn, frd.bI);
      this.b(czc.rC, frd.bI);
      this.b(czc.pe, frd.bI);
      this.b(czc.qi, frd.bI);
      this.b(czc.ry, frd.bI);
      this.b(czc.vf, frd.bK);
      this.b(czc.sx, frd.bI);
      this.b(czc.rl, frd.bI);
      this.b(czc.ox, frd.bL);
      this.b(czc.oy, frd.bL);
      this.b(czc.pj, frd.bI);
      this.b(czc.ot, frd.bI);
      this.b(czc.tf, frd.bI);
      this.b(czc.wm, frd.bI);
      this.b(czc.rz, frd.bI);
      this.e(czc.rZ);
      this.b(czc.pi, frd.bI);
      this.b(czc.ru, frd.bI);
      this.b(czc.vS, frd.bI);
      this.c(czc.rF);
      this.d(czc.rG);
      this.b(czc.te, frd.bI);
      this.b(czc.tg, frd.bI);
      this.b(czc.sg, frd.bI);
      this.b(czc.vU, frd.bI);
      this.b(czc.qJ, frd.bI);
      this.b(czc.vH, frd.bI);
      this.b(czc.sh, frd.bI);
      this.b(czc.sV, frd.bI);
      this.b(czc.pr, frd.bI);
      this.b(czc.ps, frd.bI);
      this.b(czc.xf, frd.bI);
      this.b(czc.su, frd.bI);
      this.b(czc.oN, frd.bI);
      this.b(czc.oO, frd.bI);
      this.b(czc.pk, frd.bI);
      this.b(czc.pU, frd.bK);
      this.b(czc.pV, frd.bK);
      this.b(czc.vO, frd.bI);
      this.b(czc.pT, frd.bK);
      this.b(czc.pS, frd.bK);
      this.b(czc.pR, frd.bK);
      this.b(czc.wt, frd.bI);
      this.b(czc.ta, frd.bI);
      this.b(czc.rE, frd.bI);
      this.b(czc.pl, frd.bI);
      this.b(czc.vB, frd.bI);
      this.b(czc.tv, frd.bI);
      this.b(czc.ti, frd.bI);
      this.b(czc.wl, frd.bI);
      this.b(czc.va, frd.bI);
      this.b(czc.tq, frd.bI);
      this.b(czc.xm, frd.bI);
      this.b(czc.vz, frd.bI);
      this.b(czc.vb, frd.bI);
      this.b(czc.qH, frd.bI);
      this.b(czc.pd, frd.bI);
      this.b(czc.xk, frd.bI);
      this.b(czc.xe, frd.bI);
      this.b(czc.ou, frd.bI);
      this.b(czc.tk, frd.bI);
      this.b(czc.tn, frd.bI);
      this.b(czc.tw, frd.bI);
      this.b(czc.xi, frd.bI);
      this.b(czc.xC, frd.bI);
      this.b(czc.sb, frd.bI);
      this.b(czc.sj, frd.bI);
      this.b(czc.vi, frd.bI);
      this.b(czc.pt, frd.bI);
      this.b(czc.qL, frd.bI);
      this.b(czc.pK, frd.bK);
      this.b(czc.vp, frd.bI);
      this.b(czc.pL, frd.bK);
      this.b(czc.vN, frd.bI);
      this.b(czc.pJ, frd.bK);
      this.b(czc.pI, frd.bK);
      this.b(czc.pH, frd.bK);
      this.b(czc.pu, frd.bI);
      this.b(czc.tl, frd.bI);
      this.b(czc.ss, frd.bI);
      this.b(czc.sy, frd.bI);
      this.b(czc.qf, frd.bI);
      this.b(czc.xl, frd.bI);
      this.b(czc.xa, frd.bI);
      this.b(czc.xG, frd.bI);
      this.b(czc.xJ, frd.bI);
      this.b(czc.ow, frd.bI);
      this.b(czc.si, frd.bI);
      this.b(czc.pp, frd.bI);
      this.b(czc.pP, frd.bK);
      this.b(czc.pQ, frd.bK);
      this.b(czc.vM, frd.bI);
      this.b(czc.pq, frd.bI);
      this.b(czc.wB, frd.bI);
      this.b(czc.pO, frd.bK);
      this.b(czc.pN, frd.bK);
      this.b(czc.pM, frd.bK);
      this.b(czc.vh, frd.bI);
      this.b(czc.oH, frd.bI);
      this.b(czc.oI, frd.bI);
      this.b(czc.wC, frd.bI);
      this.b(czc.pm, frd.bI);
      this.b(czc.rn, frd.bI);
      this.b(czc.rq, frd.bI);
      this.b(czc.so, frd.bI);
      this.b(czc.st, frd.bI);
      this.b(czc.sq, frd.bI);
      this.b(czc.sn, frd.bI);
      this.b(czc.ts, frd.bI);
      this.b(czc.oR, frd.bI);
      this.b(czc.oS, frd.bI);
      this.b(czc.oT, frd.bI);
      this.b(czc.oU, frd.bI);
      this.b(czc.vo, frd.bI);
      this.b(czc.sZ, frd.bI);
      this.b(czc.rr, frd.bI);
      this.b(czc.os, frd.bI);
      this.b(czc.xh, frd.bI);
      this.b(czc.qc, frd.bI);
      this.b(czc.wX, frd.bI);
      this.b(czc.wQ, frd.bJ);
      this.b(czc.wE, frd.bJ);
      this.b(czc.wG, frd.bJ);
      this.b(czc.wF, frd.bJ);
      this.b(czc.wH, frd.bJ);
      this.b(czc.wI, frd.bJ);
      this.b(czc.wJ, frd.bJ);
      this.b(czc.wK, frd.bJ);
      this.b(czc.wL, frd.bJ);
      this.b(czc.wM, frd.bJ);
      this.b(czc.wV, frd.bJ);
      this.b(czc.wW, frd.bJ);
      this.b(czc.wN, frd.bJ);
      this.b(czc.wO, frd.bJ);
      this.b(czc.wR, frd.bJ);
      this.b(czc.wP, frd.bJ);
      this.b(czc.wS, frd.bJ);
      this.b(czc.wT, frd.bJ);
      this.b(czc.wU, frd.bJ);
      this.b(czc.vT, frd.bI);
      this.b(czc.vR, frd.bI);
      this.b(czc.wZ, frd.bI);
      this.b(czc.pZ, frd.bK);
      this.b(czc.qa, frd.bK);
      this.b(czc.pv, frd.bI);
      this.b(czc.pY, frd.bK);
      this.b(czc.pw, frd.bI);
      this.b(czc.pX, frd.bK);
      this.b(czc.pW, frd.bK);
      this.b(czc.vC, frd.bI);
      this.b(czc.vD, frd.bI);
      this.b(czc.vx, frd.bI);
      this.b(czc.oB, frd.bI);
      this.b(czc.oC, frd.bI);
      this.b(czc.sm, frd.bI);
      this.b(czc.qK, frd.bI);
      this.b(czc.oP, frd.bI);
      this.b(czc.oQ, frd.bI);
      this.b(czc.rB, frd.bI);
      this.b(czc.oz, frd.bI);
      this.b(czc.xj, frd.bI);
      this.b(czc.sr, frd.bI);
      this.b(czc.vn, frd.bI);
      this.b(czc.wn, frd.bI);
      this.b(czc.qI, frd.bI);
      this.b(czc.ro, frd.bI);
      this.b(czc.vF, frd.bI);
      this.b(czc.vE, frd.bI);
      this.b(czc.sf, frd.bI);
      this.b(czc.rs, frd.bI);
      this.b(czc.vy, frd.bI);
      this.b(czc.sv, frd.bI);
      this.b(czc.pn, frd.bI);
      this.b(czc.vG, frd.bI);
      this.b(czc.vJ, frd.bI);
      this.b(czc.vK, frd.bI);
      this.b(czc.vI, frd.bI);
      this.b(czc.sz, frd.bI);
      this.b(czc.th, frd.bI);
      this.b(czc.or, frd.bI);
      this.b(czc.sd, frd.bI);
      this.b(czc.rt, frd.bI);
      this.b(czc.pa, frd.bI);
      this.b(czc.sY, frd.bI);
      this.b(czc.wA, frd.bI);
      this.b(czc.xg, frd.bI);
      this.b(czc.rD, frd.bI);
      this.b(czc.rp, frd.bI);
      this.b(czc.yA, frd.bI);
      this.b(czc.wv, frd.bI);
      this.b(czc.tp, frd.bI);
      this.b(czc.oD, frd.bI);
      this.b(czc.oE, frd.bI);
      this.b(czc.qb, frd.bK);
      this.b(czc.pF, frd.bK);
      this.b(czc.pG, frd.bK);
      this.b(czc.pE, frd.bK);
      this.b(czc.pD, frd.bK);
      this.b(czc.pC, frd.bK);
      this.b(czc.sD, frd.bI);
      this.b(czc.xc, frd.bI);
      this.b(czc.ov, frd.bI);
      this.b(czc.wz, frd.bI);
      this.b(czc.se, frd.bI);
      this.b(czc.rv, frd.bI);
      this.b(czc.rw, frd.bI);
      this.b(czc.rx, frd.bI);
      this.b(czc.rm, frd.bI);
      this.b(czc.qh, frd.bI);
      this.b(czc.sl, frd.bI);
      this.b(czc.vc, frd.bI);
      this.b(czc.vg, frd.cc);
      this.b(czc.pA, frd.bK);
      this.b(czc.pB, frd.bK);
      this.b(czc.pz, frd.bK);
      this.b(czc.py, frd.bK);
      this.b(czc.px, frd.bK);
      this.b(czc.vd, frd.bI);
      this.b(czc.ve, frd.bI);
      this.b(czc.sp, frd.bI);
      this.b(czc.yC, frd.bI);
      this.b(czc.yD, frd.bI);
      this.b(czc.yE, frd.bI);
      this.b(czc.yF, frd.bI);
      this.b(czc.yG, frd.bI);
      this.b(czc.yH, frd.bI);
      this.b(czc.yI, frd.bI);
      this.b(czc.yJ, frd.bI);
      this.b(czc.yK, frd.bI);
      this.b(czc.yL, frd.bI);
      this.b(czc.yM, frd.bI);
      this.b(czc.yN, frd.bI);
      this.b(czc.yO, frd.bI);
      this.b(czc.yP, frd.bI);
      this.b(czc.yQ, frd.bI);
      this.b(czc.yR, frd.bI);
      this.b(czc.yS, frd.bI);
      this.b(czc.yT, frd.bI);
      this.b(czc.yU, frd.bI);
      this.b(czc.wD, czc.qb, frd.bK);
      this.b(czc.qM, czc.qL, frd.bI);
      this.a(czc.oZ, dhg.g, a, false);
      this.a(czc.qj, dhg.b, a, true);
      this.a(czc.qk, dhg.b, b, true);
      this.a(czc.ql, dhg.b, c, true);
      this.a(czc.qm, dhg.b, d, true);
      this.a(czc.qn, dhg.c, a, false);
      this.a(czc.qo, dhg.c, b, false);
      this.a(czc.qp, dhg.c, c, false);
      this.a(czc.qq, dhg.c, d, false);
      this.a(czc.qr, dhg.d, a, false);
      this.a(czc.qs, dhg.d, b, false);
      this.a(czc.qt, dhg.d, c, false);
      this.a(czc.qu, dhg.d, d, false);
      this.a(czc.qv, dhg.f, a, false);
      this.a(czc.qw, dhg.f, b, false);
      this.a(czc.qx, dhg.f, c, false);
      this.a(czc.qy, dhg.f, d, false);
      this.a(czc.qz, dhg.e, a, false);
      this.a(czc.qA, dhg.e, b, false);
      this.a(czc.qB, dhg.e, c, false);
      this.a(czc.qC, dhg.e, d, false);
      this.a(czc.qD, dhg.h, a, false);
      this.a(czc.qE, dhg.h, b, false);
      this.a(czc.qF, dhg.h, c, false);
      this.a(czc.qG, dhg.h, d, false);
      this.a(czc.vP, -6265536);
      this.b(czc.yV, frd.bI);
      this.b(czc.yW, frd.bI);
      this.b(czc.yX, frd.bI);
      this.b(czc.yY, frd.bI);
      this.b(czc.yZ, frd.bI);
      this.b(czc.za, frd.bI);
      this.b(czc.zb, frd.bI);
      this.b(czc.zc, frd.bI);
      this.b(czc.zd, frd.bI);
      this.b(czc.ze, frd.bI);
      this.b(czc.zf, frd.bI);
      this.b(czc.zg, frd.bI);
      this.b(czc.zh, frd.bI);
      this.b(czc.zi, frd.bI);
      this.b(czc.zj, frd.bI);
      this.b(czc.zk, frd.bI);
      this.b(czc.zl, frd.bI);
      this.b(czc.zm, frd.bI);
      this.b(czc.zn, frd.bI);
      this.b(czc.zo, frd.bI);
      this.b(czc.zp, frd.bI);
      this.b(czc.zq, frd.bI);
      this.b(czc.zr, frd.bI);
      this.b(czc.zJ, frd.bI);
      this.b(czc.zK, frd.bI);
      this.b(czc.zM, frd.bI);
      this.a(czc.vA, new fqa());
      this.a(czc.sX, "_markings", new fqe());
      this.f(czc.rH);
      this.f(czc.rX);
      this.f(czc.rI);
      this.f(czc.rP);
      this.f(czc.rQ);
      this.f(czc.rL);
      this.f(czc.rT);
      this.f(czc.rR);
      this.f(czc.rM);
      this.f(czc.rW);
      this.f(czc.rS);
      this.f(czc.rK);
      this.f(czc.rO);
      this.f(czc.rV);
      this.f(czc.rN);
      this.f(czc.rU);
      this.f(czc.rJ);
      this.n(czc.sa);
      this.o(czc.wY);
      this.r(czc.pc);
      this.g(czc.pg);
      this.h(czc.xb);
      this.i(czc.oA);
      this.j(czc.yB);
      this.k(czc.rY);
      this.l(czc.xo);
      this.m(czc.wy);
      this.q(czc.ww);
      this.p(czc.to);
      this.p(czc.wu);
      this.p(czc.wx);
      this.a(czc.tx, 11366765, 8538184);
      this.a(czc.ty, 56063, 44543);
      this.a(czc.tz, 16499171, 10890612);
      this.a(czc.tA, 4996656, 986895);
      this.a(czc.tB, 15582019, 4400155);
      this.a(czc.tC, 16167425, 16775294);
      this.a(czc.tD, 9084018, 3231003);
      this.a(czc.tE, 11506911, 9529055);
      this.a(czc.tF, 15714446, 9794134);
      this.a(czc.tG, 16565097, 13341495);
      this.a(czc.tH, 803406, 11013646);
      this.a(czc.tI, 10592673, 16711680);
      this.a(czc.tJ, 12691306, 15058059);
      this.a(czc.tK, 4470310, 10592673);
      this.a(czc.tL, 894731, 0);
      this.a(czc.tM, 2243405, 16382457);
      this.a(czc.tN, 5457209, 8811878);
      this.a(czc.tO, 9433559, 7969893);
      this.a(czc.tP, 13552826, 7632531);
      this.a(czc.tQ, 1842204, 14711290);
      this.a(czc.tR, 1447446, 0);
      this.a(czc.tS, 1447446, 7237230);
      this.a(czc.tT, 9804699, 1973274);
      this.a(czc.tU, 14005919, 13396256);
      this.a(czc.tV, 13661252, 16762748);
      this.a(czc.tW, 16382457, 12369084);
      this.a(czc.tX, 611926, 8778172);
      this.a(czc.tY, 10851452, 5589310);
      this.a(czc.tZ, 5931634, 15826224);
      this.a(czc.ua, 13004373, 6251620);
      this.a(czc.ub, 12623485, 15656192);
      this.a(czc.uc, 7958625, 15125652);
      this.a(czc.ud, 14405058, 7643954);
      this.a(czc.ue, 12623485, 10051392);
      this.a(czc.uf, 3407872, 16579584);
      this.a(czc.ug, 10489616, 12040119);
      this.a(czc.uh, 1769984, 5321501);
      this.a(czc.ui, 15720061, 5653556);
      this.a(czc.uj, 15198183, 1776418);
      this.a(czc.uk, 894731, 16711680);
      this.a(czc.ul, 4411786, 8978176);
      this.a(czc.um, 15771042, 14377823);
      this.a(czc.un, 10051392, 16380836);
      this.a(czc.uo, 5843472, 16380836);
      this.a(czc.up, 5451574, 9804699);
      this.a(czc.uq, 15658718, 14014157);
      this.a(czc.ur, 16167425, 3654642);
      this.a(czc.us, 10051392, 7555121);
      this.a(czc.ut, 7697520, 5984329);
      this.a(czc.uu, 10489616, 951412);
      this.a(czc.uv, 15198183, 16758197);
      this.a(czc.uw, 9725844, 5060690);
      this.a(czc.ux, 7237230, 3158064);
      this.a(czc.uy, 12698049, 4802889);
      this.a(czc.uz, 6842447, 15066584);
      this.a(czc.uA, 5349438, 8306542);
      this.a(czc.uB, 8855049, 2468720);
      this.a(czc.uC, 14283506, 8496292);
      this.a(czc.uD, 3419431, 11013646);
      this.a(czc.uE, 2243405, 7375001);
      this.a(czc.uF, 6387319, 14543594);
      this.a(czc.uG, 10236982, 5065037);
      this.a(czc.uH, 7164733, 1444352);
      this.a(czc.uI, 15377456, 4547222);
      this.a(czc.uJ, 15690005, 16775663);
      this.a(czc.uK, 15198183, 44975);
      this.a(czc.uL, 8032420, 15265265);
      this.a(czc.uM, 5651507, 12422002);
      this.a(czc.uN, 9804699, 2580065);
      this.a(czc.uO, 4547222, 15377456);
      this.a(czc.uP, 1001033, 3790560);
      this.a(czc.uQ, 3407872, 5349438);
      this.a(czc.uR, 1315860, 5075616);
      this.a(czc.uS, 1315860, 4672845);
      this.a(czc.uT, 14144467, 13545366);
      this.a(czc.uU, 13004373, 15132390);
      this.a(czc.uV, 6250335, 16545810);
      this.a(czc.uW, 44975, 7969893);
      this.a(czc.uX, 3232308, 9945732);
      this.a(czc.uY, 5651507, 7969893);
      this.a(czc.uZ, 15373203, 5009705);
      this.a(czc.a);
      this.a(czc.yu);
      this.a(czc.yr);
      this.a(czc.ys);
      this.a(czc.yt);
      this.a(czc.eg);
      this.a(czc.ef);
      this.a(czc.ee);
      this.a(czc.yv);
      this.a(czc.sC);
      this.a(czc.sc);
      this.a(czc.qe);
      this.a(czc.vQ);
   }

   public static record a(dhk a, alf<dhl> b) {
   }
}
