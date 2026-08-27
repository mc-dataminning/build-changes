import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bti {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<brn<? extends bsa>, btg> b = ImmutableMap.builder()
      .put(brn.a, cev.r().a())
      .put(brn.c, cey.r().a())
      .put(brn.d, chh.r().a())
      .put(brn.f, cfb.gw().a())
      .put(brn.g, cdk.r().a())
      .put(brn.h, cdq.gB().a())
      .put(brn.i, chw.r().a())
      .put(brn.l, chx.gs().a())
      .put(brn.p, cds.gA().a())
      .put(brn.o, cfg.r().a())
      .put(brn.q, chy.r().a())
      .put(brn.t, cdu.r().a())
      .put(brn.u, cdm.r().a())
      .put(brn.w, cdw.r().a())
      .put(brn.x, chz.r().a())
      .put(brn.y, cdx.gp().a())
      .put(brn.z, cfs.r().a())
      .put(brn.B, cib.r().a())
      .put(brn.D, cic.r().a())
      .put(brn.H, cid.r().a())
      .put(brn.I, cie.r().a())
      .put(brn.F, cgl.u().a())
      .put(brn.J, cig.u().a())
      .put(brn.m, cjj.r().a())
      .put(brn.Q, cdz.r().a())
      .put(brn.R, cfj.gp().a())
      .put(brn.T, cih.y().a())
      .put(brn.U, cii.r().a())
      .put(brn.W, brs.gp().a())
      .put(brn.X, cfp.u().a())
      .put(brn.Y, cij.gp().a())
      .put(brn.Z, cjr.r().a())
      .put(brn.ab, cft.gO().a())
      .put(brn.ac, cjg.gt().a())
      .put(brn.ad, cil.u().a())
      .put(brn.af, ceb.r().a())
      .put(brn.am, cfw.gA().a())
      .put(brn.ao, cim.r().a())
      .put(brn.ar, cdw.r().a())
      .put(brn.as, cfs.r().a())
      .put(brn.at, ced.r().a())
      .put(brn.av, cee.gA().a())
      .put(brn.aw, cef.gv().a())
      .put(brn.ax, cin.gv().a())
      .put(brn.ay, ceg.r().a())
      .put(brn.az, cjx.gw().a())
      .put(brn.aA, cka.y().a())
      .put(brn.aB, ciq.u().a())
      .put(brn.bx, clh.fO().a())
      .put(brn.aC, ceh.r().a())
      .put(brn.aE, cdm.r().a())
      .put(brn.aF, cej.u().a())
      .put(brn.aG, cis.r().a())
      .put(brn.aH, cdm.r().a())
      .put(brn.aI, cel.r().a())
      .put(brn.aJ, cit.r().a())
      .put(brn.aL, ciu.r().a())
      .put(brn.aM, chv.r().a())
      .put(brn.aN, cfz.r().a())
      .put(brn.aO, cin.gv().a())
      .put(brn.aQ, cgg.r().a())
      .put(brn.aR, cen.r().a())
      .put(brn.aV, ciy.u().a())
      .put(brn.aW, ceo.gp().a())
      .put(brn.aX, chv.r().a())
      .put(brn.aY, cja.u().a())
      .put(brn.aZ, cfm.gr().a())
      .put(brn.bd, cfw.gA().a())
      .put(brn.bf, cdm.r().a())
      .put(brn.bg, ceq.y().a())
      .put(brn.bh, cjb.r().a())
      .put(brn.bi, cku.gy().a())
      .put(brn.bj, cjc.u().a())
      .put(brn.bl, ckl.r().a())
      .put(brn.bk, bsc.A().a())
      .put(brn.bn, cjd.u().a())
      .put(brn.bo, chf.u().a())
      .put(brn.bp, chv.r().a())
      .put(brn.br, ces.gx().a())
      .put(brn.bs, cjf.r().a())
      .put(brn.bt, cjg.gt().a())
      .put(brn.bu, cgd.r().a())
      .put(brn.bv, cjg.gt().a())
      .put(brn.bw, cji.gz().a())
      .build();

   public static btg a(brn<? extends bsa> $$0) {
      return b.get($$0);
   }

   public static boolean b(brn<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ld.g.s().filter($$0 -> $$0.f() != bsd.h).filter($$0 -> !b((brn<?>)$$0)).map(ld.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
