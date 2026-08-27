import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class brw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqb<? extends bqo>, bru> b = ImmutableMap.builder()
      .put(bqb.a, cdh.r().a())
      .put(bqb.c, cdk.r().a())
      .put(bqb.d, cft.r().a())
      .put(bqb.f, cdn.gu().a())
      .put(bqb.g, cby.r().a())
      .put(bqb.h, cce.gz().a())
      .put(bqb.i, cgi.r().a())
      .put(bqb.l, cgj.gq().a())
      .put(bqb.p, ccg.gz().a())
      .put(bqb.o, cds.r().a())
      .put(bqb.q, cgk.r().a())
      .put(bqb.t, cci.r().a())
      .put(bqb.u, cca.r().a())
      .put(bqb.w, cck.r().a())
      .put(bqb.x, cgl.r().a())
      .put(bqb.y, ccl.gn().a())
      .put(bqb.z, cee.r().a())
      .put(bqb.B, cgn.r().a())
      .put(bqb.D, cgo.r().a())
      .put(bqb.H, cgp.r().a())
      .put(bqb.I, cgq.r().a())
      .put(bqb.F, cex.u().a())
      .put(bqb.J, cgs.u().a())
      .put(bqb.m, chv.r().a())
      .put(bqb.Q, ccn.r().a())
      .put(bqb.R, cdv.gn().a())
      .put(bqb.T, cgt.y().a())
      .put(bqb.U, cgu.r().a())
      .put(bqb.W, bqg.gn().a())
      .put(bqb.X, ceb.u().a())
      .put(bqb.Y, cgv.gn().a())
      .put(bqb.Z, cid.r().a())
      .put(bqb.ab, cef.gM().a())
      .put(bqb.ac, chs.gr().a())
      .put(bqb.ad, cgx.u().a())
      .put(bqb.af, ccp.r().a())
      .put(bqb.am, cei.gy().a())
      .put(bqb.ao, cgy.r().a())
      .put(bqb.ar, cck.r().a())
      .put(bqb.as, cee.r().a())
      .put(bqb.at, ccr.r().a())
      .put(bqb.av, ccs.gy().a())
      .put(bqb.aw, cct.gt().a())
      .put(bqb.ax, cgz.gt().a())
      .put(bqb.ay, ccu.r().a())
      .put(bqb.az, cij.gu().a())
      .put(bqb.aA, cim.y().a())
      .put(bqb.aB, chc.u().a())
      .put(bqb.bx, cjt.fN().a())
      .put(bqb.aC, ccv.r().a())
      .put(bqb.aE, cca.r().a())
      .put(bqb.aF, ccx.u().a())
      .put(bqb.aG, che.r().a())
      .put(bqb.aH, cca.r().a())
      .put(bqb.aI, ccz.r().a())
      .put(bqb.aJ, chf.r().a())
      .put(bqb.aL, chg.r().a())
      .put(bqb.aM, cgh.r().a())
      .put(bqb.aN, cel.r().a())
      .put(bqb.aO, cgz.gt().a())
      .put(bqb.aQ, ces.r().a())
      .put(bqb.aR, cdb.r().a())
      .put(bqb.aV, chk.u().a())
      .put(bqb.aW, cdc.gn().a())
      .put(bqb.aX, cgh.r().a())
      .put(bqb.aY, chm.u().a())
      .put(bqb.aZ, cdy.gp().a())
      .put(bqb.bd, cei.gy().a())
      .put(bqb.bf, cca.r().a())
      .put(bqb.bg, cde.y().a())
      .put(bqb.bh, chn.r().a())
      .put(bqb.bi, cjg.gw().a())
      .put(bqb.bj, cho.u().a())
      .put(bqb.bl, cix.r().a())
      .put(bqb.bk, bqq.A().a())
      .put(bqb.bn, chp.u().a())
      .put(bqb.bo, cfr.u().a())
      .put(bqb.bp, cgh.r().a())
      .put(bqb.br, cdg.gt().a())
      .put(bqb.bs, chr.r().a())
      .put(bqb.bt, chs.gr().a())
      .put(bqb.bu, cep.r().a())
      .put(bqb.bv, chs.gr().a())
      .put(bqb.bw, chu.gx().a())
      .build();

   public static bru a(bqb<? extends bqo> $$0) {
      return b.get($$0);
   }

   public static boolean b(bqb<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kr.g.s().filter($$0 -> $$0.f() != bqr.h).filter($$0 -> !b((bqb<?>)$$0)).map(kr.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
