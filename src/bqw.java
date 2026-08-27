import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bqw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bpc<? extends bpo>, bqu> b = ImmutableMap.builder()
      .put(bpc.b, cch.r().a())
      .put(bpc.d, cck.r().a())
      .put(bpc.e, cet.r().a())
      .put(bpc.g, ccn.gu().a())
      .put(bpc.h, cay.r().a())
      .put(bpc.i, cbe.gz().a())
      .put(bpc.j, cfi.r().a())
      .put(bpc.p, cbg.gz().a())
      .put(bpc.o, ccs.r().a())
      .put(bpc.q, cfj.r().a())
      .put(bpc.t, cbi.r().a())
      .put(bpc.u, cba.r().a())
      .put(bpc.w, cbk.r().a())
      .put(bpc.x, cfk.r().a())
      .put(bpc.y, cbl.gn().a())
      .put(bpc.z, cde.r().a())
      .put(bpc.B, cfm.r().a())
      .put(bpc.D, cfn.r().a())
      .put(bpc.H, cfo.r().a())
      .put(bpc.I, cfp.r().a())
      .put(bpc.F, cdx.s().a())
      .put(bpc.J, cfr.s().a())
      .put(bpc.m, cgu.r().a())
      .put(bpc.Q, cbn.r().a())
      .put(bpc.R, ccv.gn().a())
      .put(bpc.T, cfs.y().a())
      .put(bpc.U, cft.r().a())
      .put(bpc.W, bpg.gn().a())
      .put(bpc.X, cdb.s().a())
      .put(bpc.Y, cfu.gn().a())
      .put(bpc.Z, chc.r().a())
      .put(bpc.ab, cdf.gM().a())
      .put(bpc.ac, cgr.gr().a())
      .put(bpc.ad, cfw.s().a())
      .put(bpc.af, cbp.r().a())
      .put(bpc.am, cdi.gy().a())
      .put(bpc.ao, cfx.r().a())
      .put(bpc.ar, cbk.r().a())
      .put(bpc.as, cde.r().a())
      .put(bpc.at, cbr.r().a())
      .put(bpc.av, cbs.gy().a())
      .put(bpc.aw, cbt.gt().a())
      .put(bpc.ax, cfy.gt().a())
      .put(bpc.ay, cbu.r().a())
      .put(bpc.az, chi.gu().a())
      .put(bpc.aA, chl.y().a())
      .put(bpc.aB, cgb.s().a())
      .put(bpc.bx, cis.fN().a())
      .put(bpc.aC, cbv.r().a())
      .put(bpc.aE, cba.r().a())
      .put(bpc.aF, cbx.s().a())
      .put(bpc.aG, cgd.r().a())
      .put(bpc.aH, cba.r().a())
      .put(bpc.aI, cbz.r().a())
      .put(bpc.aJ, cge.r().a())
      .put(bpc.aL, cgf.r().a())
      .put(bpc.aM, cfh.r().a())
      .put(bpc.aN, cdl.r().a())
      .put(bpc.aO, cfy.gt().a())
      .put(bpc.aQ, cds.r().a())
      .put(bpc.aR, ccb.r().a())
      .put(bpc.aV, cgj.s().a())
      .put(bpc.aW, ccc.gn().a())
      .put(bpc.aX, cfh.r().a())
      .put(bpc.aY, cgl.s().a())
      .put(bpc.aZ, ccy.gp().a())
      .put(bpc.bd, cdi.gy().a())
      .put(bpc.bf, cba.r().a())
      .put(bpc.bg, cce.y().a())
      .put(bpc.bh, cgm.r().a())
      .put(bpc.bi, cif.gw().a())
      .put(bpc.bj, cgn.s().a())
      .put(bpc.bl, chw.r().a())
      .put(bpc.bk, bpq.A().a())
      .put(bpc.bn, cgo.s().a())
      .put(bpc.bo, cer.s().a())
      .put(bpc.bp, cfh.r().a())
      .put(bpc.br, ccg.gt().a())
      .put(bpc.bs, cgq.r().a())
      .put(bpc.bt, cgr.gr().a())
      .put(bpc.bu, cdp.r().a())
      .put(bpc.bv, cgr.gr().a())
      .put(bpc.bw, cgt.gx().a())
      .build();

   public static bqu a(bpc<? extends bpo> $$0) {
      return b.get($$0);
   }

   public static boolean b(bpc<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ki.g.s().filter($$0 -> $$0.f() != bpr.h).filter($$0 -> !b((bpc<?>)$$0)).map(ki.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
