import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bsm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqr<? extends bre>, bsk> b = ImmutableMap.builder()
      .put(bqr.a, cdz.r().a())
      .put(bqr.c, cec.r().a())
      .put(bqr.d, cgl.r().a())
      .put(bqr.f, cef.gw().a())
      .put(bqr.g, cco.r().a())
      .put(bqr.h, ccu.gB().a())
      .put(bqr.i, cha.r().a())
      .put(bqr.l, chb.gs().a())
      .put(bqr.p, ccw.gA().a())
      .put(bqr.o, cek.r().a())
      .put(bqr.q, chc.r().a())
      .put(bqr.t, ccy.r().a())
      .put(bqr.u, ccq.r().a())
      .put(bqr.w, cda.r().a())
      .put(bqr.x, chd.r().a())
      .put(bqr.y, cdb.gp().a())
      .put(bqr.z, cew.r().a())
      .put(bqr.B, chf.r().a())
      .put(bqr.D, chg.r().a())
      .put(bqr.H, chh.r().a())
      .put(bqr.I, chi.r().a())
      .put(bqr.F, cfp.u().a())
      .put(bqr.J, chk.u().a())
      .put(bqr.m, cin.r().a())
      .put(bqr.Q, cdd.r().a())
      .put(bqr.R, cen.gp().a())
      .put(bqr.T, chl.y().a())
      .put(bqr.U, chm.r().a())
      .put(bqr.W, bqw.gp().a())
      .put(bqr.X, cet.u().a())
      .put(bqr.Y, chn.gp().a())
      .put(bqr.Z, civ.r().a())
      .put(bqr.ab, cex.gO().a())
      .put(bqr.ac, cik.gt().a())
      .put(bqr.ad, chp.u().a())
      .put(bqr.af, cdf.r().a())
      .put(bqr.am, cfa.gA().a())
      .put(bqr.ao, chq.r().a())
      .put(bqr.ar, cda.r().a())
      .put(bqr.as, cew.r().a())
      .put(bqr.at, cdh.r().a())
      .put(bqr.av, cdi.gA().a())
      .put(bqr.aw, cdj.gv().a())
      .put(bqr.ax, chr.gv().a())
      .put(bqr.ay, cdk.r().a())
      .put(bqr.az, cjb.gw().a())
      .put(bqr.aA, cje.y().a())
      .put(bqr.aB, chu.u().a())
      .put(bqr.bx, ckl.fO().a())
      .put(bqr.aC, cdl.r().a())
      .put(bqr.aE, ccq.r().a())
      .put(bqr.aF, cdn.u().a())
      .put(bqr.aG, chw.r().a())
      .put(bqr.aH, ccq.r().a())
      .put(bqr.aI, cdp.r().a())
      .put(bqr.aJ, chx.r().a())
      .put(bqr.aL, chy.r().a())
      .put(bqr.aM, cgz.r().a())
      .put(bqr.aN, cfd.r().a())
      .put(bqr.aO, chr.gv().a())
      .put(bqr.aQ, cfk.r().a())
      .put(bqr.aR, cdr.r().a())
      .put(bqr.aV, cic.u().a())
      .put(bqr.aW, cds.gp().a())
      .put(bqr.aX, cgz.r().a())
      .put(bqr.aY, cie.u().a())
      .put(bqr.aZ, ceq.gr().a())
      .put(bqr.bd, cfa.gA().a())
      .put(bqr.bf, ccq.r().a())
      .put(bqr.bg, cdu.y().a())
      .put(bqr.bh, cif.r().a())
      .put(bqr.bi, cjy.gy().a())
      .put(bqr.bj, cig.u().a())
      .put(bqr.bl, cjp.r().a())
      .put(bqr.bk, brg.A().a())
      .put(bqr.bn, cih.u().a())
      .put(bqr.bo, cgj.u().a())
      .put(bqr.bp, cgz.r().a())
      .put(bqr.br, cdw.gx().a())
      .put(bqr.bs, cij.r().a())
      .put(bqr.bt, cik.gt().a())
      .put(bqr.bu, cfh.r().a())
      .put(bqr.bv, cik.gt().a())
      .put(bqr.bw, cim.gz().a())
      .build();

   public static bsk a(bqr<? extends bre> $$0) {
      return b.get($$0);
   }

   public static boolean b(bqr<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lc.g.s().filter($$0 -> $$0.f() != brh.h).filter($$0 -> !b((bqr<?>)$$0)).map(lc.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
