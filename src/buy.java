import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bta<? extends btp>, buw> b = ImmutableMap.builder()
      .put(bta.a, cgl.s().a())
      .put(bta.c, cgo.s().a())
      .put(bta.d, cix.s().a())
      .put(bta.f, cgr.gx().a())
      .put(bta.g, cfa.s().a())
      .put(bta.h, cfg.gC().a())
      .put(bta.i, cjm.s().a())
      .put(bta.l, cjn.gt().a())
      .put(bta.p, cfi.gB().a())
      .put(bta.o, cgw.s().a())
      .put(bta.q, cjo.s().a())
      .put(bta.t, cfk.s().a())
      .put(bta.u, cfc.s().a())
      .put(bta.w, cfm.s().a())
      .put(bta.x, cjp.s().a())
      .put(bta.y, cfn.gq().a())
      .put(bta.z, chi.s().a())
      .put(bta.B, cjr.s().a())
      .put(bta.D, cjs.s().a())
      .put(bta.H, cjt.s().a())
      .put(bta.I, cju.s().a())
      .put(bta.F, cib.u().a())
      .put(bta.J, cjw.u().a())
      .put(bta.m, ckz.s().a())
      .put(bta.Q, cfp.s().a())
      .put(bta.R, cgz.gq().a())
      .put(bta.T, cjx.y().a())
      .put(bta.U, cjy.s().a())
      .put(bta.W, bth.gq().a())
      .put(bta.X, chf.u().a())
      .put(bta.Y, cjz.gq().a())
      .put(bta.Z, clh.s().a())
      .put(bta.ab, chj.gP().a())
      .put(bta.ac, ckw.gu().a())
      .put(bta.ad, ckb.u().a())
      .put(bta.af, cfr.s().a())
      .put(bta.an, chm.gB().a())
      .put(bta.ap, ckc.s().a())
      .put(bta.as, cfm.s().a())
      .put(bta.at, chi.s().a())
      .put(bta.au, cft.s().a())
      .put(bta.aw, cfu.gB().a())
      .put(bta.ax, cfv.gw().a())
      .put(bta.ay, ckd.gw().a())
      .put(bta.az, cfw.s().a())
      .put(bta.aA, cln.gx().a())
      .put(bta.aB, clq.y().a())
      .put(bta.aC, ckg.u().a())
      .put(bta.by, cmx.fQ().a())
      .put(bta.aD, cfx.s().a())
      .put(bta.aF, cfc.s().a())
      .put(bta.aG, cfz.u().a())
      .put(bta.aH, cki.s().a())
      .put(bta.aI, cfc.s().a())
      .put(bta.aJ, cgb.s().a())
      .put(bta.aK, ckj.s().a())
      .put(bta.aM, ckk.s().a())
      .put(bta.aN, cjl.s().a())
      .put(bta.aO, chp.s().a())
      .put(bta.aP, ckd.gw().a())
      .put(bta.aR, chw.s().a())
      .put(bta.aS, cgd.s().a())
      .put(bta.aW, cko.u().a())
      .put(bta.aX, cge.gq().a())
      .put(bta.aY, cjl.s().a())
      .put(bta.aZ, ckq.u().a())
      .put(bta.ba, chc.gs().a())
      .put(bta.be, chm.gB().a())
      .put(bta.bg, cfc.s().a())
      .put(bta.bh, cgg.y().a())
      .put(bta.bi, ckr.u().a())
      .put(bta.bj, cmk.gz().a())
      .put(bta.bk, cks.u().a())
      .put(bta.bm, cmb.s().a())
      .put(bta.bl, btr.A().a())
      .put(bta.bo, ckt.u().a())
      .put(bta.bp, civ.u().a())
      .put(bta.bq, cjl.s().a())
      .put(bta.bs, cgi.gy().a())
      .put(bta.bt, ckv.s().a())
      .put(bta.bu, ckw.gu().a())
      .put(bta.bv, cht.s().a())
      .put(bta.bw, ckw.gu().a())
      .put(bta.bx, cky.gA().a())
      .build();

   public static buw a(bta<? extends btp> $$0) {
      return b.get($$0);
   }

   public static boolean b(bta<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lp.g.s().filter($$0 -> $$0.f() != bts.h).filter($$0 -> !b((bta<?>)$$0)).map(lp.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
