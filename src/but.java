import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class but {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsv<? extends btk>, bur> b = ImmutableMap.builder()
      .put(bsv.a, cgg.s().a())
      .put(bsv.c, cgj.s().a())
      .put(bsv.d, cis.s().a())
      .put(bsv.f, cgm.gx().a())
      .put(bsv.g, cev.s().a())
      .put(bsv.h, cfb.gC().a())
      .put(bsv.i, cjh.s().a())
      .put(bsv.l, cji.gt().a())
      .put(bsv.p, cfd.gB().a())
      .put(bsv.o, cgr.s().a())
      .put(bsv.q, cjj.s().a())
      .put(bsv.t, cff.s().a())
      .put(bsv.u, cex.s().a())
      .put(bsv.w, cfh.s().a())
      .put(bsv.x, cjk.s().a())
      .put(bsv.y, cfi.gq().a())
      .put(bsv.z, chd.s().a())
      .put(bsv.B, cjm.s().a())
      .put(bsv.D, cjn.s().a())
      .put(bsv.H, cjo.s().a())
      .put(bsv.I, cjp.s().a())
      .put(bsv.F, chw.u().a())
      .put(bsv.J, cjr.u().a())
      .put(bsv.m, cku.s().a())
      .put(bsv.Q, cfk.s().a())
      .put(bsv.R, cgu.gq().a())
      .put(bsv.T, cjs.y().a())
      .put(bsv.U, cjt.s().a())
      .put(bsv.W, btc.gq().a())
      .put(bsv.X, cha.u().a())
      .put(bsv.Y, cju.gq().a())
      .put(bsv.Z, clc.s().a())
      .put(bsv.ab, che.gP().a())
      .put(bsv.ac, ckr.gu().a())
      .put(bsv.ad, cjw.u().a())
      .put(bsv.af, cfm.s().a())
      .put(bsv.an, chh.gB().a())
      .put(bsv.ap, cjx.s().a())
      .put(bsv.as, cfh.s().a())
      .put(bsv.at, chd.s().a())
      .put(bsv.au, cfo.s().a())
      .put(bsv.aw, cfp.gB().a())
      .put(bsv.ax, cfq.gw().a())
      .put(bsv.ay, cjy.gw().a())
      .put(bsv.az, cfr.s().a())
      .put(bsv.aA, cli.gx().a())
      .put(bsv.aB, cll.y().a())
      .put(bsv.aC, ckb.u().a())
      .put(bsv.by, cms.fQ().a())
      .put(bsv.aD, cfs.s().a())
      .put(bsv.aF, cex.s().a())
      .put(bsv.aG, cfu.u().a())
      .put(bsv.aH, ckd.s().a())
      .put(bsv.aI, cex.s().a())
      .put(bsv.aJ, cfw.s().a())
      .put(bsv.aK, cke.s().a())
      .put(bsv.aM, ckf.s().a())
      .put(bsv.aN, cjg.s().a())
      .put(bsv.aO, chk.s().a())
      .put(bsv.aP, cjy.gw().a())
      .put(bsv.aR, chr.s().a())
      .put(bsv.aS, cfy.s().a())
      .put(bsv.aW, ckj.u().a())
      .put(bsv.aX, cfz.gq().a())
      .put(bsv.aY, cjg.s().a())
      .put(bsv.aZ, ckl.u().a())
      .put(bsv.ba, cgx.gs().a())
      .put(bsv.be, chh.gB().a())
      .put(bsv.bg, cex.s().a())
      .put(bsv.bh, cgb.y().a())
      .put(bsv.bi, ckm.u().a())
      .put(bsv.bj, cmf.gz().a())
      .put(bsv.bk, ckn.u().a())
      .put(bsv.bm, clw.s().a())
      .put(bsv.bl, btm.A().a())
      .put(bsv.bo, cko.u().a())
      .put(bsv.bp, ciq.u().a())
      .put(bsv.bq, cjg.s().a())
      .put(bsv.bs, cgd.gy().a())
      .put(bsv.bt, ckq.s().a())
      .put(bsv.bu, ckr.gu().a())
      .put(bsv.bv, cho.s().a())
      .put(bsv.bw, ckr.gu().a())
      .put(bsv.bx, ckt.gA().a())
      .build();

   public static bur a(bsv<? extends btk> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsv<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lp.g.s().filter($$0 -> $$0.f() != btn.h).filter($$0 -> !b((bsv<?>)$$0)).map(lp.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
