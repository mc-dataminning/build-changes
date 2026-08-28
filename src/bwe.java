import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwe {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bug<? extends buv>, bwc> b = ImmutableMap.builder()
      .put(bug.a, chs.q().a())
      .put(bug.c, chv.q().a())
      .put(bug.d, ckf.q().a())
      .put(bug.f, chy.gx().a())
      .put(bug.g, cgg.q().a())
      .put(bug.h, cgn.gJ().a())
      .put(bug.i, ckv.q().a())
      .put(bug.l, ckw.gy().a())
      .put(bug.p, cgp.gL().a())
      .put(bug.o, cid.q().a())
      .put(bug.q, ckx.q().a())
      .put(bug.t, cgr.q().a())
      .put(bug.u, cgi.q().a())
      .put(bug.w, cgt.q().a())
      .put(bug.x, cky.q().a())
      .put(bug.y, cgu.gv().a())
      .put(bug.z, cip.q().a())
      .put(bug.B, cla.q().a())
      .put(bug.D, clb.q().a())
      .put(bug.H, clc.q().a())
      .put(bug.I, cld.q().a())
      .put(bug.F, cjj.t().a())
      .put(bug.J, clf.t().a())
      .put(bug.m, cmi.q().a())
      .put(bug.Q, cgw.q().a())
      .put(bug.R, cig.gv().a())
      .put(bug.T, clg.y().a())
      .put(bug.U, clh.q().a())
      .put(bug.W, bun.gv().a())
      .put(bug.X, cim.t().a())
      .put(bug.Y, cli.gv().a())
      .put(bug.Z, cmq.q().a())
      .put(bug.ab, ciq.gX().a())
      .put(bug.ac, cmf.gy().a())
      .put(bug.ad, clk.t().a())
      .put(bug.af, cgy.q().a())
      .put(bug.an, cit.gH().a())
      .put(bug.ap, cll.q().a())
      .put(bug.as, cgt.q().a())
      .put(bug.at, cip.q().a())
      .put(bug.au, cha.q().a())
      .put(bug.aw, chb.gI().a())
      .put(bug.ax, chc.gH().a())
      .put(bug.ay, clm.gB().a())
      .put(bug.az, chd.q().a())
      .put(bug.aA, cmw.gC().a())
      .put(bug.aB, cmz.y().a())
      .put(bug.aC, clp.t().a())
      .put(bug.by, coh.fZ().a())
      .put(bug.aD, che.q().a())
      .put(bug.aF, cgi.q().a())
      .put(bug.aG, chg.t().a())
      .put(bug.aH, clr.q().a())
      .put(bug.aI, cgi.q().a())
      .put(bug.aJ, chi.q().a())
      .put(bug.aK, cls.q().a())
      .put(bug.aM, clt.q().a())
      .put(bug.aN, cku.q().a())
      .put(bug.aO, ciw.q().a())
      .put(bug.aP, clm.gB().a())
      .put(bug.aR, cjd.q().a())
      .put(bug.aS, chk.q().a())
      .put(bug.aW, clx.t().a())
      .put(bug.aX, chl.gv().a())
      .put(bug.aY, cku.q().a())
      .put(bug.aZ, clz.t().a())
      .put(bug.ba, cij.gx().a())
      .put(bug.be, cit.gH().a())
      .put(bug.bg, cgi.q().a())
      .put(bug.bh, chn.y().a())
      .put(bug.bi, cma.q().a())
      .put(bug.bj, cnt.gE().a())
      .put(bug.bk, cmb.t().a())
      .put(bug.bm, cnk.q().a())
      .put(bug.bl, bux.E().a())
      .put(bug.bo, cmc.t().a())
      .put(bug.bp, ckd.t().a())
      .put(bug.bq, cku.q().a())
      .put(bug.bs, chp.gJ().a())
      .put(bug.bt, cme.q().a())
      .put(bug.bu, cmf.gy().a())
      .put(bug.bv, cja.q().a())
      .put(bug.bw, cmf.gy().a())
      .put(bug.bx, cmh.gE().a())
      .build();

   public static bwc a(bug<? extends buv> $$0) {
      return b.get($$0);
   }

   public static boolean b(bug<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lx.f.s().filter($$0 -> $$0.f() != buy.h).filter($$0 -> !b((bug<?>)$$0)).map(lx.f::b).forEach($$0 -> ad.b("Entity " + $$0 + " has no attributes"));
   }
}
