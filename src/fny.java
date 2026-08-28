import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class fny {
   private static final fnq a = fom.a(-1);
   private static final String b = "helmet";
   private static final String c = "chestplate";
   private static final String d = "leggings";
   private static final String e = "boots";
   private static final List<fny.a> f = List.of(
      new fny.a("quartz", dfq.a, Map.of()),
      new fny.a("iron", dfq.b, Map.of(dfl.d, "iron_darker")),
      new fny.a("netherite", dfq.c, Map.of(dfl.h, "netherite_darker")),
      new fny.a("redstone", dfq.d, Map.of()),
      new fny.a("copper", dfq.e, Map.of()),
      new fny.a("gold", dfq.f, Map.of(dfl.e, "gold_darker")),
      new fny.a("emerald", dfq.g, Map.of()),
      new fny.a("diamond", dfq.h, Map.of(dfl.f, "diamond_darker")),
      new fny.a("lapis", dfq.i, Map.of()),
      new fny.a("amethyst", dfq.j, Map.of()),
      new fny.a("resin", dfq.k, Map.of())
   );
   private final fnz g;
   private final BiConsumer<aku, fon> h;

   public fny(fnz $$0, BiConsumer<aku, fon> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   private void a(cxd $$0) {
      this.g.a($$0, fom.a(foo.a($$0)));
   }

   private aku a(cxd $$0, fop $$1) {
      return $$1.a(foo.a($$0), fos.b($$0), this.h);
   }

   private void b(cxd $$0, fop $$1) {
      this.g.a($$0, fom.a(this.a($$0, $$1)));
   }

   private aku a(cxd $$0, String $$1, fop $$2) {
      return $$2.a(foo.a($$0, $$1), fos.k(fos.a($$0, $$1)), this.h);
   }

   private aku a(cxd $$0, cxd $$1, fop $$2) {
      return $$2.a(foo.a($$0), fos.b($$1), this.h);
   }

   private void b(cxd $$0, cxd $$1, fop $$2) {
      this.g.a($$0, fom.a(this.a($$0, $$1, $$2)));
   }

   private void a(cxd $$0, fnq $$1) {
      this.a($$0, "_overlay", $$1);
   }

   private void a(cxd $$0, String $$1, fnq $$2) {
      aku $$3 = this.a($$0, fos.c($$0), fos.a($$0, $$1));
      this.g.a($$0, fom.a($$3, a, $$2));
   }

   private List<hcp.a> b(cxd $$0) {
      List<hcp.a> $$1 = new ArrayList<>();
      hck.b $$2 = fom.a(this.a($$0, "_16", foq.bI));
      $$1.add(fom.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 32; $$3++) {
         int $$4 = ayz.b($$3 - 16, 32);
         hck.b $$5 = fom.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), foq.bI));
         $$1.add(fom.a($$5, (float)$$3 - 0.5F));
      }

      $$1.add(fom.a($$2, 31.5F));
      return $$1;
   }

   private void c(cxd $$0) {
      List<hcp.a> $$1 = this.b($$0);
      this.g
         .a(
            $$0,
            fom.a(
               fom.a(kv.af),
               fom.a(new hdj(true, hdk.a.b), 32.0F, $$1),
               fom.a(fom.a(new hdj(true, hdk.a.c), 32.0F, $$1), fom.a(new hdj(true, hdk.a.a), 32.0F, $$1))
            )
         );
   }

   private void d(cxd $$0) {
      this.g.a($$0, fom.a(new hdj(true, hdk.a.d), 32.0F, this.b($$0)));
   }

   private void e(cxd $$0) {
      List<hcp.a> $$1 = new ArrayList<>();
      hck.b $$2 = fom.a(this.a($$0, "_00", foq.bI));
      $$1.add(fom.a($$2, 0.0F));

      for (int $$3 = 1; $$3 < 64; $$3++) {
         hck.b $$4 = fom.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), foq.bI));
         $$1.add(fom.a($$4, (float)$$3 - 0.5F));
      }

      $$1.add(fom.a($$2, 63.5F));
      this.g.a($$0, fom.a(fom.a(new hdt(true, hdt.a.b), 64.0F, $$1), fom.a(new hdt(true, hdt.a.a), 64.0F, $$1)));
   }

   private aku a(cxd $$0, aku $$1, aku $$2) {
      return foq.bM.a($$0, fos.c($$1, $$2), this.h);
   }

   private aku a(aku $$0, aku $$1, aku $$2) {
      return foq.bM.a($$0, fos.c($$1, $$2), this.h);
   }

   private void a(aku $$0, aku $$1, aku $$2, aku $$3) {
      foq.bN.a($$0, fos.a($$1, $$2, $$3), this.h);
   }

   private void a(cxd $$0, akt<dfk> $$1, String $$2, boolean $$3) {
      aku $$4 = foo.a($$0);
      aku $$5 = fos.c($$0);
      aku $$6 = fos.a($$0, "_overlay");
      List<hcq.a<akt<dfp>>> $$7 = new ArrayList<>(f.size());

      for (fny.a $$8 : f) {
         aku $$9 = $$4.g("_" + $$8.a() + "_trim");
         aku $$10 = aku.b("trims/items/" + $$2 + "_trim_" + $$8.a($$1));
         hck.b $$11;
         if ($$3) {
            this.a($$9, $$5, $$6, $$10);
            $$11 = fom.a($$9, new fnn(-6265536));
         } else {
            this.a($$9, $$5, $$10);
            $$11 = fom.a($$9);
         }

         $$7.add(fom.a($$8.b, $$11));
      }

      hck.b $$13;
      if ($$3) {
         foq.bM.a($$4, fos.c($$5, $$6), this.h);
         $$13 = fom.a($$4, new fnn(-6265536));
      } else {
         foq.bI.a($$4, fos.k($$5), this.h);
         $$13 = fom.a($$4);
      }

      this.g.a($$0, fom.a(new hei(), $$13, $$7));
   }

   private void f(cxd $$0) {
      hck.b $$1 = fom.a(this.a($$0, foq.bI));
      aku $$2 = this.a($$0, foq.bS, "_open_back");
      aku $$3 = this.a($$0, foq.bR, "_open_front");
      hck.b $$4 = fom.a(fom.a($$2), new hcf.a(), fom.a($$3));
      hck.b $$5 = fom.a(new hcu(), $$4, $$1);
      this.g.a($$0, fom.a(new hec(), $$1, fom.a(cxf.g, $$5)));
   }

   private aku a(cxd $$0, fop $$1, String $$2) {
      aku $$3 = fos.a($$0, $$2);
      return $$1.a($$0, fos.k($$3), this.h);
   }

   private void g(cxd $$0) {
      hck.b $$1 = fom.a(foo.a($$0));
      hck.b $$2 = fom.a(this.a($$0, "_pulling_0", foq.bT));
      hck.b $$3 = fom.a(this.a($$0, "_pulling_1", foq.bT));
      hck.b $$4 = fom.a(this.a($$0, "_pulling_2", foq.bT));
      this.g.a($$0, fom.a(fom.a(), fom.a(new hdv(false), 0.05F, $$2, fom.a($$3, 0.65F), fom.a($$4, 0.9F)), $$1));
   }

   private void h(cxd $$0) {
      hck.b $$1 = fom.a(foo.a($$0));
      hck.b $$2 = fom.a(this.a($$0, "_pulling_0", foq.bU));
      hck.b $$3 = fom.a(this.a($$0, "_pulling_1", foq.bU));
      hck.b $$4 = fom.a(this.a($$0, "_pulling_2", foq.bU));
      hck.b $$5 = fom.a(this.a($$0, "_arrow", foq.bU));
      hck.b $$6 = fom.a(this.a($$0, "_firework", foq.bU));
      this.g
         .a($$0, fom.a(fom.a(), fom.a(new hdn(), $$2, fom.a($$3, 0.58F), fom.a($$4, 1.0F)), fom.a(new hdy(), $$1, fom.a(cvz.a.b, $$5), fom.a(cvz.a.c, $$6))));
   }

   private void a(cxd $$0, hcw $$1, hck.b $$2, hck.b $$3) {
      this.g.a($$0, fom.a($$1, $$2, $$3));
   }

   private void i(cxd $$0) {
      hck.b $$1 = fom.a(this.a($$0, foq.bI));
      hck.b $$2 = fom.a(this.a($$0, "_broken", foq.bI));
      this.a($$0, new hct(), $$2, $$1);
   }

   private void j(cxd $$0) {
      hck.b $$1 = fom.a(foo.a($$0));
      hck.b $$2 = fom.a(foo.a($$0, "_brushing_0"));
      hck.b $$3 = fom.a(foo.a($$0, "_brushing_1"));
      hck.b $$4 = fom.a(foo.a($$0, "_brushing_2"));
      this.g.a($$0, fom.a(new hdu(10.0F), 0.1F, $$1, fom.a($$2, 0.25F), fom.a($$3, 0.5F), fom.a($$4, 0.75F)));
   }

   private void k(cxd $$0) {
      hck.b $$1 = fom.a(this.a($$0, foq.bL));
      hck.b $$2 = fom.a(this.a($$0, "_cast", foq.bL));
      this.a($$0, new hda(), $$2, $$1);
   }

   private void l(cxd $$0) {
      hck.b $$1 = fom.a(foo.a($$0));
      hck.b $$2 = fom.a(foo.b("tooting_goat_horn"));
      this.a($$0, fom.a(), $$2, $$1);
   }

   private void m(cxd $$0) {
      hck.b $$1 = fom.a(foo.a($$0), new hes.a());
      hck.b $$2 = fom.a(foo.a($$0, "_blocking"), new hes.a());
      this.a($$0, fom.a(), $$2, $$1);
   }

   private static hck.b a(hck.b $$0, hck.b $$1) {
      return fom.a(new hec(), $$1, fom.a(List.of(cxf.g, cxf.h, cxf.i), $$0));
   }

   private void n(cxd $$0) {
      hck.b $$1 = fom.a(this.a($$0, foq.bI));
      hck.b $$2 = fom.a(foo.a($$0, "_in_hand"));
      this.g.a($$0, a($$1, $$2));
   }

   private void o(cxd $$0) {
      hck.b $$1 = fom.a(this.a($$0, foq.bI));
      hck.b $$2 = fom.a(foo.a($$0, "_in_hand"), new hey.a());
      hck.b $$3 = fom.a(foo.a($$0, "_throwing"), new hey.a());
      hck.b $$4 = fom.a(fom.a(), $$3, $$2);
      this.g.a($$0, a($$1, $$4));
   }

   private void a(cxd $$0, aku $$1) {
      this.g.a($$0, fom.a($$1, new fnt()));
   }

   private void p(cxd $$0) {
      aku $$1 = this.a($$0, foo.b("potion_overlay"), foo.a($$0));
      this.a($$0, $$1);
   }

   private void q(cxd $$0) {
      aku $$1 = this.a($$0, foo.a($$0, "_head"), foo.a($$0, "_base"));
      this.a($$0, $$1);
   }

   private void a(cxd $$0, int $$1) {
      aku $$2 = this.a($$0, foq.bI);
      this.g.a($$0, fom.a($$2, new fnn($$1)));
   }

   private void a(cxd $$0, int $$1, int $$2) {
      aku $$3 = foo.b("template_spawn_egg");
      this.g.a($$0, fom.a($$3, fom.a($$1), fom.a($$2)));
   }

   private void r(cxd $$0) {
      aku $$1 = fos.c($$0);
      aku $$2 = fos.a($$0, "_overlay");
      aku $$3 = foq.bI.a($$0, fos.k($$1), this.h);
      aku $$4 = foo.a($$0, "_dyed");
      foq.bM.a($$4, fos.c($$1, $$2), this.h);
      this.g.a($$0, fom.a(fom.a(kv.K), fom.a($$4, a, new fnn(0)), fom.a($$3)));
   }

   public void a() {
      this.b(cxl.oH, foq.bI);
      this.b(cxl.oJ, foq.bI);
      this.b(cxl.oI, foq.bI);
      this.b(cxl.oK, foq.bI);
      this.b(cxl.pk, foq.bI);
      this.b(cxl.pb, foq.bI);
      this.b(cxl.oX, foq.bI);
      this.b(cxl.vH, foq.bI);
      this.b(cxl.pd, foq.bI);
      this.b(cxl.vi, foq.bI);
      this.b(cxl.ef, foq.bK);
      this.b(cxl.sZ, foq.bI);
      this.b(cxl.wm, foq.bI);
      this.b(cxl.wo, foq.bI);
      this.b(cxl.oD, foq.bI);
      this.b(cxl.oE, foq.bI);
      this.b(cxl.sw, foq.bI);
      this.b(cxl.tn, foq.bI);
      this.b(cxl.tf, foq.bK);
      this.b(cxl.ss, foq.bI);
      this.b(cxl.sx, foq.bI);
      this.b(cxl.xj, foq.bI);
      this.b(cxl.ry, foq.bI);
      this.b(cxl.pa, foq.bI);
      this.b(cxl.qe, foq.bI);
      this.b(cxl.ru, foq.bI);
      this.b(cxl.vb, foq.bK);
      this.b(cxl.st, foq.bI);
      this.b(cxl.rh, foq.bI);
      this.b(cxl.ov, foq.bL);
      this.b(cxl.ow, foq.bL);
      this.b(cxl.pf, foq.bI);
      this.b(cxl.or, foq.bI);
      this.b(cxl.tb, foq.bI);
      this.b(cxl.wi, foq.bI);
      this.b(cxl.rv, foq.bI);
      this.e(cxl.rV);
      this.b(cxl.pe, foq.bI);
      this.b(cxl.rq, foq.bI);
      this.b(cxl.vO, foq.bI);
      this.c(cxl.rB);
      this.d(cxl.rC);
      this.b(cxl.ta, foq.bI);
      this.b(cxl.tc, foq.bI);
      this.b(cxl.sc, foq.bI);
      this.b(cxl.vQ, foq.bI);
      this.b(cxl.qF, foq.bI);
      this.b(cxl.vD, foq.bI);
      this.b(cxl.sd, foq.bI);
      this.b(cxl.sR, foq.bI);
      this.b(cxl.pn, foq.bI);
      this.b(cxl.po, foq.bI);
      this.b(cxl.xb, foq.bI);
      this.b(cxl.sq, foq.bI);
      this.b(cxl.oL, foq.bI);
      this.b(cxl.oM, foq.bI);
      this.b(cxl.pg, foq.bI);
      this.b(cxl.pQ, foq.bK);
      this.b(cxl.pR, foq.bK);
      this.b(cxl.vK, foq.bI);
      this.b(cxl.pP, foq.bK);
      this.b(cxl.pO, foq.bK);
      this.b(cxl.pN, foq.bK);
      this.b(cxl.wp, foq.bI);
      this.b(cxl.sW, foq.bI);
      this.b(cxl.rA, foq.bI);
      this.b(cxl.ph, foq.bI);
      this.b(cxl.vx, foq.bI);
      this.b(cxl.tr, foq.bI);
      this.b(cxl.te, foq.bI);
      this.b(cxl.wh, foq.bI);
      this.b(cxl.uW, foq.bI);
      this.b(cxl.tm, foq.bI);
      this.b(cxl.xi, foq.bI);
      this.b(cxl.vv, foq.bI);
      this.b(cxl.uX, foq.bI);
      this.b(cxl.qD, foq.bI);
      this.b(cxl.oZ, foq.bI);
      this.b(cxl.xg, foq.bI);
      this.b(cxl.xa, foq.bI);
      this.b(cxl.os, foq.bI);
      this.b(cxl.tg, foq.bI);
      this.b(cxl.tj, foq.bI);
      this.b(cxl.ts, foq.bI);
      this.b(cxl.xe, foq.bI);
      this.b(cxl.xy, foq.bI);
      this.b(cxl.rX, foq.bI);
      this.b(cxl.sf, foq.bI);
      this.b(cxl.ve, foq.bI);
      this.b(cxl.pp, foq.bI);
      this.b(cxl.qH, foq.bI);
      this.b(cxl.pG, foq.bK);
      this.b(cxl.vl, foq.bI);
      this.b(cxl.pH, foq.bK);
      this.b(cxl.vJ, foq.bI);
      this.b(cxl.pF, foq.bK);
      this.b(cxl.pE, foq.bK);
      this.b(cxl.pD, foq.bK);
      this.b(cxl.pq, foq.bI);
      this.b(cxl.th, foq.bI);
      this.b(cxl.so, foq.bI);
      this.b(cxl.su, foq.bI);
      this.b(cxl.qb, foq.bI);
      this.b(cxl.xh, foq.bI);
      this.b(cxl.wW, foq.bI);
      this.b(cxl.xC, foq.bI);
      this.b(cxl.xF, foq.bI);
      this.b(cxl.ou, foq.bI);
      this.b(cxl.se, foq.bI);
      this.b(cxl.pl, foq.bI);
      this.b(cxl.pL, foq.bK);
      this.b(cxl.pM, foq.bK);
      this.b(cxl.vI, foq.bI);
      this.b(cxl.pm, foq.bI);
      this.b(cxl.wx, foq.bI);
      this.b(cxl.pK, foq.bK);
      this.b(cxl.pJ, foq.bK);
      this.b(cxl.pI, foq.bK);
      this.b(cxl.vd, foq.bI);
      this.b(cxl.oF, foq.bI);
      this.b(cxl.oG, foq.bI);
      this.b(cxl.wy, foq.bI);
      this.b(cxl.pi, foq.bI);
      this.b(cxl.rj, foq.bI);
      this.b(cxl.rm, foq.bI);
      this.b(cxl.sk, foq.bI);
      this.b(cxl.sp, foq.bI);
      this.b(cxl.sm, foq.bI);
      this.b(cxl.sj, foq.bI);
      this.b(cxl.to, foq.bI);
      this.b(cxl.oP, foq.bI);
      this.b(cxl.oQ, foq.bI);
      this.b(cxl.oR, foq.bI);
      this.b(cxl.oS, foq.bI);
      this.b(cxl.vk, foq.bI);
      this.b(cxl.sV, foq.bI);
      this.b(cxl.rn, foq.bI);
      this.b(cxl.oq, foq.bI);
      this.b(cxl.xd, foq.bI);
      this.b(cxl.pY, foq.bI);
      this.b(cxl.wT, foq.bI);
      this.b(cxl.wM, foq.bJ);
      this.b(cxl.wA, foq.bJ);
      this.b(cxl.wC, foq.bJ);
      this.b(cxl.wB, foq.bJ);
      this.b(cxl.wD, foq.bJ);
      this.b(cxl.wE, foq.bJ);
      this.b(cxl.wF, foq.bJ);
      this.b(cxl.wG, foq.bJ);
      this.b(cxl.wH, foq.bJ);
      this.b(cxl.wI, foq.bJ);
      this.b(cxl.wR, foq.bJ);
      this.b(cxl.wS, foq.bJ);
      this.b(cxl.wJ, foq.bJ);
      this.b(cxl.wK, foq.bJ);
      this.b(cxl.wN, foq.bJ);
      this.b(cxl.wL, foq.bJ);
      this.b(cxl.wO, foq.bJ);
      this.b(cxl.wP, foq.bJ);
      this.b(cxl.wQ, foq.bJ);
      this.b(cxl.vP, foq.bI);
      this.b(cxl.vN, foq.bI);
      this.b(cxl.wV, foq.bI);
      this.b(cxl.pV, foq.bK);
      this.b(cxl.pW, foq.bK);
      this.b(cxl.pr, foq.bI);
      this.b(cxl.pU, foq.bK);
      this.b(cxl.ps, foq.bI);
      this.b(cxl.pT, foq.bK);
      this.b(cxl.pS, foq.bK);
      this.b(cxl.vy, foq.bI);
      this.b(cxl.vz, foq.bI);
      this.b(cxl.vt, foq.bI);
      this.b(cxl.oz, foq.bI);
      this.b(cxl.oA, foq.bI);
      this.b(cxl.si, foq.bI);
      this.b(cxl.qG, foq.bI);
      this.b(cxl.oN, foq.bI);
      this.b(cxl.oO, foq.bI);
      this.b(cxl.rx, foq.bI);
      this.b(cxl.ox, foq.bI);
      this.b(cxl.xf, foq.bI);
      this.b(cxl.sn, foq.bI);
      this.b(cxl.vj, foq.bI);
      this.b(cxl.wj, foq.bI);
      this.b(cxl.qE, foq.bI);
      this.b(cxl.rk, foq.bI);
      this.b(cxl.vB, foq.bI);
      this.b(cxl.vA, foq.bI);
      this.b(cxl.sb, foq.bI);
      this.b(cxl.ro, foq.bI);
      this.b(cxl.vu, foq.bI);
      this.b(cxl.sr, foq.bI);
      this.b(cxl.pj, foq.bI);
      this.b(cxl.vC, foq.bI);
      this.b(cxl.vF, foq.bI);
      this.b(cxl.vG, foq.bI);
      this.b(cxl.vE, foq.bI);
      this.b(cxl.sv, foq.bI);
      this.b(cxl.td, foq.bI);
      this.b(cxl.op, foq.bI);
      this.b(cxl.rZ, foq.bI);
      this.b(cxl.rp, foq.bI);
      this.b(cxl.oW, foq.bI);
      this.b(cxl.sU, foq.bI);
      this.b(cxl.ww, foq.bI);
      this.b(cxl.xc, foq.bI);
      this.b(cxl.rz, foq.bI);
      this.b(cxl.rl, foq.bI);
      this.b(cxl.yw, foq.bI);
      this.b(cxl.wr, foq.bI);
      this.b(cxl.tl, foq.bI);
      this.b(cxl.oB, foq.bI);
      this.b(cxl.oC, foq.bI);
      this.b(cxl.pX, foq.bK);
      this.b(cxl.pB, foq.bK);
      this.b(cxl.pC, foq.bK);
      this.b(cxl.pA, foq.bK);
      this.b(cxl.pz, foq.bK);
      this.b(cxl.py, foq.bK);
      this.b(cxl.sz, foq.bI);
      this.b(cxl.wY, foq.bI);
      this.b(cxl.ot, foq.bI);
      this.b(cxl.wv, foq.bI);
      this.b(cxl.sa, foq.bI);
      this.b(cxl.rr, foq.bI);
      this.b(cxl.rs, foq.bI);
      this.b(cxl.rt, foq.bI);
      this.b(cxl.ri, foq.bI);
      this.b(cxl.qd, foq.bI);
      this.b(cxl.sh, foq.bI);
      this.b(cxl.uY, foq.bI);
      this.b(cxl.vc, foq.cc);
      this.b(cxl.pw, foq.bK);
      this.b(cxl.px, foq.bK);
      this.b(cxl.pv, foq.bK);
      this.b(cxl.pu, foq.bK);
      this.b(cxl.pt, foq.bK);
      this.b(cxl.uZ, foq.bI);
      this.b(cxl.va, foq.bI);
      this.b(cxl.sl, foq.bI);
      this.b(cxl.yy, foq.bI);
      this.b(cxl.yz, foq.bI);
      this.b(cxl.yA, foq.bI);
      this.b(cxl.yB, foq.bI);
      this.b(cxl.yC, foq.bI);
      this.b(cxl.yD, foq.bI);
      this.b(cxl.yE, foq.bI);
      this.b(cxl.yF, foq.bI);
      this.b(cxl.yG, foq.bI);
      this.b(cxl.yH, foq.bI);
      this.b(cxl.yI, foq.bI);
      this.b(cxl.yJ, foq.bI);
      this.b(cxl.yK, foq.bI);
      this.b(cxl.yL, foq.bI);
      this.b(cxl.yM, foq.bI);
      this.b(cxl.yN, foq.bI);
      this.b(cxl.yO, foq.bI);
      this.b(cxl.yP, foq.bI);
      this.b(cxl.yQ, foq.bI);
      this.b(cxl.wz, cxl.pX, foq.bK);
      this.b(cxl.qI, cxl.qH, foq.bI);
      this.a(cxl.oV, dfl.g, "helmet", false);
      this.a(cxl.qf, dfl.b, "helmet", true);
      this.a(cxl.qg, dfl.b, "chestplate", true);
      this.a(cxl.qh, dfl.b, "leggings", true);
      this.a(cxl.qi, dfl.b, "boots", true);
      this.a(cxl.qj, dfl.c, "helmet", false);
      this.a(cxl.qk, dfl.c, "chestplate", false);
      this.a(cxl.ql, dfl.c, "leggings", false);
      this.a(cxl.qm, dfl.c, "boots", false);
      this.a(cxl.qn, dfl.d, "helmet", false);
      this.a(cxl.qo, dfl.d, "chestplate", false);
      this.a(cxl.qp, dfl.d, "leggings", false);
      this.a(cxl.qq, dfl.d, "boots", false);
      this.a(cxl.qr, dfl.f, "helmet", false);
      this.a(cxl.qs, dfl.f, "chestplate", false);
      this.a(cxl.qt, dfl.f, "leggings", false);
      this.a(cxl.qu, dfl.f, "boots", false);
      this.a(cxl.qv, dfl.e, "helmet", false);
      this.a(cxl.qw, dfl.e, "chestplate", false);
      this.a(cxl.qx, dfl.e, "leggings", false);
      this.a(cxl.qy, dfl.e, "boots", false);
      this.a(cxl.qz, dfl.h, "helmet", false);
      this.a(cxl.qA, dfl.h, "chestplate", false);
      this.a(cxl.qB, dfl.h, "leggings", false);
      this.a(cxl.qC, dfl.h, "boots", false);
      this.a(cxl.vL, -6265536);
      this.b(cxl.yR, foq.bI);
      this.b(cxl.yS, foq.bI);
      this.b(cxl.yT, foq.bI);
      this.b(cxl.yU, foq.bI);
      this.b(cxl.yV, foq.bI);
      this.b(cxl.yW, foq.bI);
      this.b(cxl.yX, foq.bI);
      this.b(cxl.yY, foq.bI);
      this.b(cxl.yZ, foq.bI);
      this.b(cxl.za, foq.bI);
      this.b(cxl.zb, foq.bI);
      this.b(cxl.zc, foq.bI);
      this.b(cxl.zd, foq.bI);
      this.b(cxl.ze, foq.bI);
      this.b(cxl.zf, foq.bI);
      this.b(cxl.zg, foq.bI);
      this.b(cxl.zh, foq.bI);
      this.b(cxl.zi, foq.bI);
      this.b(cxl.zj, foq.bI);
      this.b(cxl.zk, foq.bI);
      this.b(cxl.zl, foq.bI);
      this.b(cxl.zm, foq.bI);
      this.b(cxl.zn, foq.bI);
      this.b(cxl.zF, foq.bI);
      this.b(cxl.zG, foq.bI);
      this.b(cxl.zI, foq.bI);
      this.a(cxl.vw, new fno());
      this.a(cxl.sT, "_markings", new fns());
      this.f(cxl.rD);
      this.f(cxl.rT);
      this.f(cxl.rE);
      this.f(cxl.rL);
      this.f(cxl.rM);
      this.f(cxl.rH);
      this.f(cxl.rP);
      this.f(cxl.rN);
      this.f(cxl.rI);
      this.f(cxl.rS);
      this.f(cxl.rO);
      this.f(cxl.rG);
      this.f(cxl.rK);
      this.f(cxl.rR);
      this.f(cxl.rJ);
      this.f(cxl.rQ);
      this.f(cxl.rF);
      this.n(cxl.rW);
      this.o(cxl.wU);
      this.r(cxl.oY);
      this.g(cxl.pc);
      this.h(cxl.wX);
      this.i(cxl.oy);
      this.j(cxl.yx);
      this.k(cxl.rU);
      this.l(cxl.xk);
      this.m(cxl.wu);
      this.q(cxl.ws);
      this.p(cxl.tk);
      this.p(cxl.wq);
      this.p(cxl.wt);
      this.a(cxl.tt, 11366765, 8538184);
      this.a(cxl.tu, 56063, 44543);
      this.a(cxl.tv, 16499171, 10890612);
      this.a(cxl.tw, 4996656, 986895);
      this.a(cxl.tx, 15582019, 4400155);
      this.a(cxl.ty, 16167425, 16775294);
      this.a(cxl.tz, 9084018, 3231003);
      this.a(cxl.tA, 11506911, 9529055);
      this.a(cxl.tB, 15714446, 9794134);
      this.a(cxl.tC, 16565097, 13341495);
      this.a(cxl.tD, 803406, 11013646);
      this.a(cxl.tE, 10592673, 16711680);
      this.a(cxl.tF, 12691306, 15058059);
      this.a(cxl.tG, 4470310, 10592673);
      this.a(cxl.tH, 894731, 0);
      this.a(cxl.tI, 2243405, 16382457);
      this.a(cxl.tJ, 5457209, 8811878);
      this.a(cxl.tK, 9433559, 7969893);
      this.a(cxl.tL, 13552826, 7632531);
      this.a(cxl.tM, 1842204, 14711290);
      this.a(cxl.tN, 1447446, 0);
      this.a(cxl.tO, 1447446, 7237230);
      this.a(cxl.tP, 9804699, 1973274);
      this.a(cxl.tQ, 14005919, 13396256);
      this.a(cxl.tR, 13661252, 16762748);
      this.a(cxl.tS, 16382457, 12369084);
      this.a(cxl.tT, 611926, 8778172);
      this.a(cxl.tU, 10851452, 5589310);
      this.a(cxl.tV, 5931634, 15826224);
      this.a(cxl.tW, 13004373, 6251620);
      this.a(cxl.tX, 12623485, 15656192);
      this.a(cxl.tY, 7958625, 15125652);
      this.a(cxl.tZ, 14405058, 7643954);
      this.a(cxl.ua, 12623485, 10051392);
      this.a(cxl.ub, 3407872, 16579584);
      this.a(cxl.uc, 10489616, 12040119);
      this.a(cxl.ud, 1769984, 5321501);
      this.a(cxl.ue, 15720061, 5653556);
      this.a(cxl.uf, 15198183, 1776418);
      this.a(cxl.ug, 894731, 16711680);
      this.a(cxl.uh, 4411786, 8978176);
      this.a(cxl.ui, 15771042, 14377823);
      this.a(cxl.uj, 10051392, 16380836);
      this.a(cxl.uk, 5843472, 16380836);
      this.a(cxl.ul, 5451574, 9804699);
      this.a(cxl.um, 15658718, 14014157);
      this.a(cxl.un, 16167425, 3654642);
      this.a(cxl.uo, 10051392, 7555121);
      this.a(cxl.up, 7697520, 5984329);
      this.a(cxl.uq, 10489616, 951412);
      this.a(cxl.ur, 15198183, 16758197);
      this.a(cxl.us, 9725844, 5060690);
      this.a(cxl.ut, 7237230, 3158064);
      this.a(cxl.uu, 12698049, 4802889);
      this.a(cxl.uv, 6842447, 15066584);
      this.a(cxl.uw, 5349438, 8306542);
      this.a(cxl.ux, 8855049, 2468720);
      this.a(cxl.uy, 14283506, 8496292);
      this.a(cxl.uz, 3419431, 11013646);
      this.a(cxl.uA, 2243405, 7375001);
      this.a(cxl.uB, 6387319, 14543594);
      this.a(cxl.uC, 10236982, 5065037);
      this.a(cxl.uD, 7164733, 1444352);
      this.a(cxl.uE, 15377456, 4547222);
      this.a(cxl.uF, 15690005, 16775663);
      this.a(cxl.uG, 15198183, 44975);
      this.a(cxl.uH, 8032420, 15265265);
      this.a(cxl.uI, 5651507, 12422002);
      this.a(cxl.uJ, 9804699, 2580065);
      this.a(cxl.uK, 4547222, 15377456);
      this.a(cxl.uL, 1001033, 3790560);
      this.a(cxl.uM, 3407872, 5349438);
      this.a(cxl.uN, 1315860, 5075616);
      this.a(cxl.uO, 1315860, 4672845);
      this.a(cxl.uP, 14144467, 13545366);
      this.a(cxl.uQ, 13004373, 15132390);
      this.a(cxl.uR, 6250335, 16545810);
      this.a(cxl.uS, 44975, 7969893);
      this.a(cxl.uT, 3232308, 9945732);
      this.a(cxl.uU, 5651507, 7969893);
      this.a(cxl.uV, 15373203, 5009705);
      this.a(cxl.a);
      this.a(cxl.yq);
      this.a(cxl.yn);
      this.a(cxl.yo);
      this.a(cxl.yp);
      this.a(cxl.ee);
      this.a(cxl.ed);
      this.a(cxl.ec);
      this.a(cxl.yr);
      this.a(cxl.sy);
      this.a(cxl.rY);
      this.a(cxl.qa);
      this.a(cxl.vM);
   }

   static record a(String a, akt<dfp> b, Map<akt<dfk>, String> c) {

      public String a(akt<dfk> $$0) {
         return this.c.getOrDefault($$0, this.a);
      }
   }
}
