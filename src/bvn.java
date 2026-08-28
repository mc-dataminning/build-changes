import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bvn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btq<? extends buf>, bvl> b = ImmutableMap.builder()
      .put(btq.a, chb.q().a())
      .put(btq.c, che.q().a())
      .put(btq.d, cjo.q().a())
      .put(btq.f, chh.gq().a())
      .put(btq.g, cfp.q().a())
      .put(btq.h, cfw.gC().a())
      .put(btq.i, cke.q().a())
      .put(btq.l, ckf.gr().a())
      .put(btq.p, cfy.gE().a())
      .put(btq.o, chm.q().a())
      .put(btq.q, ckg.q().a())
      .put(btq.t, cga.q().a())
      .put(btq.u, cfr.q().a())
      .put(btq.w, cgc.q().a())
      .put(btq.x, ckh.q().a())
      .put(btq.y, cgd.go().a())
      .put(btq.z, chy.q().a())
      .put(btq.B, ckj.q().a())
      .put(btq.D, ckk.q().a())
      .put(btq.H, ckl.q().a())
      .put(btq.I, ckm.q().a())
      .put(btq.F, cis.t().a())
      .put(btq.J, cko.t().a())
      .put(btq.m, clr.q().a())
      .put(btq.Q, cgf.q().a())
      .put(btq.R, chp.go().a())
      .put(btq.T, ckp.y().a())
      .put(btq.U, ckq.q().a())
      .put(btq.W, btx.go().a())
      .put(btq.X, chv.t().a())
      .put(btq.Y, ckr.go().a())
      .put(btq.Z, clz.q().a())
      .put(btq.ab, chz.gQ().a())
      .put(btq.ac, clo.gr().a())
      .put(btq.ad, ckt.t().a())
      .put(btq.af, cgh.q().a())
      .put(btq.an, cic.gA().a())
      .put(btq.ap, cku.q().a())
      .put(btq.as, cgc.q().a())
      .put(btq.at, chy.q().a())
      .put(btq.au, cgj.q().a())
      .put(btq.aw, cgk.gB().a())
      .put(btq.ax, cgl.gA().a())
      .put(btq.ay, ckv.gu().a())
      .put(btq.az, cgm.q().a())
      .put(btq.aA, cmf.gv().a())
      .put(btq.aB, cmi.y().a())
      .put(btq.aC, cky.t().a())
      .put(btq.by, cnp.fQ().a())
      .put(btq.aD, cgn.q().a())
      .put(btq.aF, cfr.q().a())
      .put(btq.aG, cgp.t().a())
      .put(btq.aH, cla.q().a())
      .put(btq.aI, cfr.q().a())
      .put(btq.aJ, cgr.q().a())
      .put(btq.aK, clb.q().a())
      .put(btq.aM, clc.q().a())
      .put(btq.aN, ckd.q().a())
      .put(btq.aO, cif.q().a())
      .put(btq.aP, ckv.gu().a())
      .put(btq.aR, cim.q().a())
      .put(btq.aS, cgt.q().a())
      .put(btq.aW, clg.t().a())
      .put(btq.aX, cgu.go().a())
      .put(btq.aY, ckd.q().a())
      .put(btq.aZ, cli.t().a())
      .put(btq.ba, chs.gq().a())
      .put(btq.be, cic.gA().a())
      .put(btq.bg, cfr.q().a())
      .put(btq.bh, cgw.y().a())
      .put(btq.bi, clj.q().a())
      .put(btq.bj, cnc.gx().a())
      .put(btq.bk, clk.t().a())
      .put(btq.bm, cmt.q().a())
      .put(btq.bl, buh.E().a())
      .put(btq.bo, cll.t().a())
      .put(btq.bp, cjm.t().a())
      .put(btq.bq, ckd.q().a())
      .put(btq.bs, cgy.gC().a())
      .put(btq.bt, cln.q().a())
      .put(btq.bu, clo.gr().a())
      .put(btq.bv, cij.q().a())
      .put(btq.bw, clo.gr().a())
      .put(btq.bx, clq.gx().a())
      .build();

   public static bvl a(btq<? extends buf> $$0) {
      return b.get($$0);
   }

   public static boolean b(btq<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lu.f.s().filter($$0 -> $$0.f() != bui.h).filter($$0 -> !b((btq<?>)$$0)).map(lu.f::b).forEach($$0 -> ad.b("Entity " + $$0 + " has no attributes"));
   }
}
