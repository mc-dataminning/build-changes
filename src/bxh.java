import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxh {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvi<? extends bvy>, bxf> b = ImmutableMap.builder()
      .put(bvi.c, ciy.j().a())
      .put(bvi.e, cjb.q().a())
      .put(bvi.f, cll.j().a())
      .put(bvi.h, cje.gs().a())
      .put(bvi.k, chj.j().a())
      .put(bvi.l, chq.gG().a())
      .put(bvi.o, cmb.j().a())
      .put(bvi.q, cmc.gs().a())
      .put(bvi.u, chs.gI().a())
      .put(bvi.t, cjj.q().a())
      .put(bvi.v, cmd.j().a())
      .put(bvi.z, chu.q().a())
      .put(bvi.A, chl.j().a())
      .put(bvi.C, chw.q().a())
      .put(bvi.D, cnw.m().a())
      .put(bvi.E, cme.j().a())
      .put(bvi.H, chx.gs().a())
      .put(bvi.I, cjv.q().a())
      .put(bvi.K, cmg.j().a())
      .put(bvi.M, cmh.j().a())
      .put(bvi.N, cmi.j().a())
      .put(bvi.O, cmj.j().a())
      .put(bvi.P, ckp.m().a())
      .put(bvi.S, cml.m().a())
      .put(bvi.r, cno.j().a())
      .put(bvi.aa, chz.q().a())
      .put(bvi.ab, cjm.gs().a())
      .put(bvi.ad, cmm.n().a())
      .put(bvi.ae, cmn.j().a())
      .put(bvi.ag, bvp.gs().a())
      .put(bvi.ah, cjs.t().a())
      .put(bvi.ai, cmo.q().a())
      .put(bvi.aj, cnz.t().a())
      .put(bvi.al, cjw.gU().a())
      .put(bvi.am, cnl.gt().a())
      .put(bvi.an, cmq.m().a())
      .put(bvi.ap, cib.j().a())
      .put(bvi.ax, cjz.gE().a())
      .put(bvi.az, cmr.j().a())
      .put(bvi.aE, chw.q().a())
      .put(bvi.aF, cjv.q().a())
      .put(bvi.aI, cid.q().a())
      .put(bvi.aN, cie.gF().a())
      .put(bvi.aO, cif.gE().a())
      .put(bvi.aP, cms.gv().a())
      .put(bvi.aQ, cig.q().a())
      .put(bvi.aR, cof.gw().a())
      .put(bvi.aS, coi.n().a())
      .put(bvi.aT, cmv.m().a())
      .put(bvi.bR, cpr.fZ().a())
      .put(bvi.aU, cij.q().a())
      .put(bvi.aW, chl.j().a())
      .put(bvi.aX, cil.t().a())
      .put(bvi.aY, cmx.j().a())
      .put(bvi.aZ, chl.j().a())
      .put(bvi.ba, cin.q().a())
      .put(bvi.bb, cmy.j().a())
      .put(bvi.bd, cmz.j().a())
      .put(bvi.be, cma.j().a())
      .put(bvi.bf, ckc.q().a())
      .put(bvi.bg, cms.gv().a())
      .put(bvi.bi, ckj.q().a())
      .put(bvi.bk, cip.j().a())
      .put(bvi.bn, cnd.m().a())
      .put(bvi.bq, ciq.gs().a())
      .put(bvi.br, cma.j().a())
      .put(bvi.bs, cnf.t().a())
      .put(bvi.bt, cjp.x().a())
      .put(bvi.bx, cjz.gE().a())
      .put(bvi.bz, chl.j().a())
      .put(bvi.bA, cit.x().a())
      .put(bvi.bB, cng.j().a())
      .put(bvi.bC, cpd.gB().a())
      .put(bvi.bD, cnh.m().a())
      .put(bvi.bF, cou.j().a())
      .put(bvi.bE, bwa.E().a())
      .put(bvi.bH, cni.m().a())
      .put(bvi.bI, clj.m().a())
      .put(bvi.bJ, cma.j().a())
      .put(bvi.bL, civ.gG().a())
      .put(bvi.bM, cnk.j().a())
      .put(bvi.bN, cnl.gt().a())
      .put(bvi.bO, ckg.q().a())
      .put(bvi.bP, cnl.gt().a())
      .put(bvi.bQ, cnn.gz().a())
      .build();

   public static bxf a(bvi<? extends bvy> $$0) {
      return b.get($$0);
   }

   public static boolean b(bvi<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mb.f.s().filter($$0 -> $$0.f() != bwb.h).filter($$0 -> !b((bvi<?>)$$0)).map(mb.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
