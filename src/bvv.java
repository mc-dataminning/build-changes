import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bvv {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bty<? extends bun>, bvt> b = ImmutableMap.builder()
      .put(bty.a, chj.q().a())
      .put(bty.c, chm.q().a())
      .put(bty.d, cjw.q().a())
      .put(bty.f, chp.gq().a())
      .put(bty.g, cfx.q().a())
      .put(bty.h, cge.gC().a())
      .put(bty.i, ckm.q().a())
      .put(bty.l, ckn.gr().a())
      .put(bty.p, cgg.gE().a())
      .put(bty.o, chu.q().a())
      .put(bty.q, cko.q().a())
      .put(bty.t, cgi.q().a())
      .put(bty.u, cfz.q().a())
      .put(bty.w, cgk.q().a())
      .put(bty.x, ckp.q().a())
      .put(bty.y, cgl.go().a())
      .put(bty.z, cig.q().a())
      .put(bty.B, ckr.q().a())
      .put(bty.D, cks.q().a())
      .put(bty.H, ckt.q().a())
      .put(bty.I, cku.q().a())
      .put(bty.F, cja.t().a())
      .put(bty.J, ckw.t().a())
      .put(bty.m, clz.q().a())
      .put(bty.Q, cgn.q().a())
      .put(bty.R, chx.go().a())
      .put(bty.T, ckx.y().a())
      .put(bty.U, cky.q().a())
      .put(bty.W, buf.go().a())
      .put(bty.X, cid.t().a())
      .put(bty.Y, ckz.go().a())
      .put(bty.Z, cmh.q().a())
      .put(bty.ab, cih.gQ().a())
      .put(bty.ac, clw.gr().a())
      .put(bty.ad, clb.t().a())
      .put(bty.af, cgp.q().a())
      .put(bty.an, cik.gA().a())
      .put(bty.ap, clc.q().a())
      .put(bty.as, cgk.q().a())
      .put(bty.at, cig.q().a())
      .put(bty.au, cgr.q().a())
      .put(bty.aw, cgs.gB().a())
      .put(bty.ax, cgt.gA().a())
      .put(bty.ay, cld.gu().a())
      .put(bty.az, cgu.q().a())
      .put(bty.aA, cmn.gv().a())
      .put(bty.aB, cmq.y().a())
      .put(bty.aC, clg.t().a())
      .put(bty.by, cnx.fS().a())
      .put(bty.aD, cgv.q().a())
      .put(bty.aF, cfz.q().a())
      .put(bty.aG, cgx.t().a())
      .put(bty.aH, cli.q().a())
      .put(bty.aI, cfz.q().a())
      .put(bty.aJ, cgz.q().a())
      .put(bty.aK, clj.q().a())
      .put(bty.aM, clk.q().a())
      .put(bty.aN, ckl.q().a())
      .put(bty.aO, cin.q().a())
      .put(bty.aP, cld.gu().a())
      .put(bty.aR, ciu.q().a())
      .put(bty.aS, chb.q().a())
      .put(bty.aW, clo.t().a())
      .put(bty.aX, chc.go().a())
      .put(bty.aY, ckl.q().a())
      .put(bty.aZ, clq.t().a())
      .put(bty.ba, cia.gq().a())
      .put(bty.be, cik.gA().a())
      .put(bty.bg, cfz.q().a())
      .put(bty.bh, che.y().a())
      .put(bty.bi, clr.q().a())
      .put(bty.bj, cnk.gx().a())
      .put(bty.bk, cls.t().a())
      .put(bty.bm, cnb.q().a())
      .put(bty.bl, bup.E().a())
      .put(bty.bo, clt.t().a())
      .put(bty.bp, cju.t().a())
      .put(bty.bq, ckl.q().a())
      .put(bty.bs, chg.gC().a())
      .put(bty.bt, clv.q().a())
      .put(bty.bu, clw.gr().a())
      .put(bty.bv, cir.q().a())
      .put(bty.bw, clw.gr().a())
      .put(bty.bx, cly.gx().a())
      .build();

   public static bvt a(bty<? extends bun> $$0) {
      return b.get($$0);
   }

   public static boolean b(bty<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lv.f.s().filter($$0 -> $$0.f() != buq.h).filter($$0 -> !b((bty<?>)$$0)).map(lv.f::b).forEach($$0 -> ad.b("Entity " + $$0 + " has no attributes"));
   }
}
