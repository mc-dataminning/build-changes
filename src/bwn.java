import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bup<? extends bve>, bwl> b = ImmutableMap.builder()
      .put(bup.a, cib.q().a())
      .put(bup.c, cie.q().a())
      .put(bup.d, cko.q().a())
      .put(bup.f, cih.gx().a())
      .put(bup.g, cgp.q().a())
      .put(bup.h, cgw.gJ().a())
      .put(bup.i, cle.q().a())
      .put(bup.l, clf.gy().a())
      .put(bup.p, cgy.gL().a())
      .put(bup.o, cim.q().a())
      .put(bup.q, clg.q().a())
      .put(bup.t, cha.q().a())
      .put(bup.u, cgr.q().a())
      .put(bup.w, chc.q().a())
      .put(bup.x, clh.q().a())
      .put(bup.y, chd.gv().a())
      .put(bup.z, ciy.q().a())
      .put(bup.B, clj.q().a())
      .put(bup.D, clk.q().a())
      .put(bup.H, cll.q().a())
      .put(bup.I, clm.q().a())
      .put(bup.F, cjs.t().a())
      .put(bup.J, clo.t().a())
      .put(bup.m, cmr.q().a())
      .put(bup.Q, chf.q().a())
      .put(bup.R, cip.gv().a())
      .put(bup.T, clp.y().a())
      .put(bup.U, clq.q().a())
      .put(bup.W, buw.gv().a())
      .put(bup.X, civ.t().a())
      .put(bup.Y, clr.gv().a())
      .put(bup.Z, cmz.q().a())
      .put(bup.ab, ciz.gX().a())
      .put(bup.ac, cmo.gy().a())
      .put(bup.ad, clt.t().a())
      .put(bup.af, chh.q().a())
      .put(bup.an, cjc.gH().a())
      .put(bup.ap, clu.q().a())
      .put(bup.as, chc.q().a())
      .put(bup.at, ciy.q().a())
      .put(bup.au, chj.q().a())
      .put(bup.aw, chk.gI().a())
      .put(bup.ax, chl.gH().a())
      .put(bup.ay, clv.gB().a())
      .put(bup.az, chm.q().a())
      .put(bup.aA, cnf.gC().a())
      .put(bup.aB, cni.y().a())
      .put(bup.aC, cly.t().a())
      .put(bup.by, cor.ga().a())
      .put(bup.aD, chn.q().a())
      .put(bup.aF, cgr.q().a())
      .put(bup.aG, chp.t().a())
      .put(bup.aH, cma.q().a())
      .put(bup.aI, cgr.q().a())
      .put(bup.aJ, chr.q().a())
      .put(bup.aK, cmb.q().a())
      .put(bup.aM, cmc.q().a())
      .put(bup.aN, cld.q().a())
      .put(bup.aO, cjf.q().a())
      .put(bup.aP, clv.gB().a())
      .put(bup.aR, cjm.q().a())
      .put(bup.aS, cht.q().a())
      .put(bup.aW, cmg.t().a())
      .put(bup.aX, chu.gv().a())
      .put(bup.aY, cld.q().a())
      .put(bup.aZ, cmi.t().a())
      .put(bup.ba, cis.gx().a())
      .put(bup.be, cjc.gH().a())
      .put(bup.bg, cgr.q().a())
      .put(bup.bh, chw.y().a())
      .put(bup.bi, cmj.q().a())
      .put(bup.bj, coc.gE().a())
      .put(bup.bk, cmk.t().a())
      .put(bup.bm, cnt.q().a())
      .put(bup.bl, bvg.E().a())
      .put(bup.bo, cml.t().a())
      .put(bup.bp, ckm.t().a())
      .put(bup.bq, cld.q().a())
      .put(bup.bs, chy.gJ().a())
      .put(bup.bt, cmn.q().a())
      .put(bup.bu, cmo.gy().a())
      .put(bup.bv, cjj.q().a())
      .put(bup.bw, cmo.gy().a())
      .put(bup.bx, cmq.gE().a())
      .build();

   public static bwl a(bup<? extends bve> $$0) {
      return b.get($$0);
   }

   public static boolean b(bup<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lz.f.s().filter($$0 -> $$0.f() != bvh.h).filter($$0 -> !b((bup<?>)$$0)).map(lz.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
