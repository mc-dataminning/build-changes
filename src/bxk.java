import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvm<? extends bwb>, bxi> b = ImmutableMap.builder()
      .put(bvm.c, ciy.m().a())
      .put(bvm.e, cjb.p().a())
      .put(bvm.f, cll.m().a())
      .put(bvm.h, cje.go().a())
      .put(bvm.k, chm.m().a())
      .put(bvm.l, cht.gA().a())
      .put(bvm.o, cmb.m().a())
      .put(bvm.q, cmc.go().a())
      .put(bvm.u, chv.gC().a())
      .put(bvm.t, cjj.p().a())
      .put(bvm.v, cmd.m().a())
      .put(bvm.z, chx.p().a())
      .put(bvm.A, cho.m().a())
      .put(bvm.C, chz.p().a())
      .put(bvm.F, cme.m().a())
      .put(bvm.I, cia.gm().a())
      .put(bvm.J, cjv.p().a())
      .put(bvm.L, cmg.m().a())
      .put(bvm.N, cmh.m().a())
      .put(bvm.O, cmi.m().a())
      .put(bvm.P, cmj.m().a())
      .put(bvm.Q, ckp.p().a())
      .put(bvm.T, cml.p().a())
      .put(bvm.r, cno.m().a())
      .put(bvm.ab, cic.p().a())
      .put(bvm.ac, cjm.gm().a())
      .put(bvm.ae, cmm.t().a())
      .put(bvm.af, cmn.m().a())
      .put(bvm.ah, bvt.gm().a())
      .put(bvm.ai, cjs.t().a())
      .put(bvm.aj, cmo.x().a())
      .put(bvm.ak, coa.p().a())
      .put(bvm.am, cjw.gO().a())
      .put(bvm.an, cnl.gp().a())
      .put(bvm.ao, cmq.p().a())
      .put(bvm.aq, cie.m().a())
      .put(bvm.ay, cjz.gy().a())
      .put(bvm.aA, cmr.m().a())
      .put(bvm.aF, chz.p().a())
      .put(bvm.aG, cjv.p().a())
      .put(bvm.aJ, cig.p().a())
      .put(bvm.aO, cih.gz().a())
      .put(bvm.aP, cii.gy().a())
      .put(bvm.aQ, cms.gr().a())
      .put(bvm.aR, cij.p().a())
      .put(bvm.aS, cog.gs().a())
      .put(bvm.aT, coj.t().a())
      .put(bvm.aU, cmv.p().a())
      .put(bvm.bS, cps.fV().a())
      .put(bvm.aV, cik.p().a())
      .put(bvm.aX, cho.m().a())
      .put(bvm.aY, cim.t().a())
      .put(bvm.aZ, cmx.m().a())
      .put(bvm.ba, cho.m().a())
      .put(bvm.bb, cio.p().a())
      .put(bvm.bc, cmy.m().a())
      .put(bvm.be, cmz.m().a())
      .put(bvm.bf, cma.m().a())
      .put(bvm.bg, ckc.p().a())
      .put(bvm.bh, cms.gr().a())
      .put(bvm.bj, ckj.p().a())
      .put(bvm.bl, ciq.m().a())
      .put(bvm.bo, cnd.p().a())
      .put(bvm.br, cir.gm().a())
      .put(bvm.bs, cma.m().a())
      .put(bvm.bt, cnf.t().a())
      .put(bvm.bu, cjp.gn().a())
      .put(bvm.by, cjz.gy().a())
      .put(bvm.bA, cho.m().a())
      .put(bvm.bB, cit.x().a())
      .put(bvm.bC, cng.m().a())
      .put(bvm.bD, cpe.gv().a())
      .put(bvm.bE, cnh.p().a())
      .put(bvm.bG, cov.m().a())
      .put(bvm.bF, bwd.C().a())
      .put(bvm.bI, cni.p().a())
      .put(bvm.bJ, clj.p().a())
      .put(bvm.bK, cma.m().a())
      .put(bvm.bM, civ.gA().a())
      .put(bvm.bN, cnk.m().a())
      .put(bvm.D, cnw.m().a())
      .put(bvm.E, cnw.m().a())
      .put(bvm.bO, cnl.gp().a())
      .put(bvm.bP, ckg.p().a())
      .put(bvm.bQ, cnl.gp().a())
      .put(bvm.bR, cnn.gv().a())
      .build();

   public static bxi a(bvm<? extends bwb> $$0) {
      return b.get($$0);
   }

   public static boolean b(bvm<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ma.f.s().filter($$0 -> $$0.f() != bwe.h).filter($$0 -> !b((bvm<?>)$$0)).map(ma.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
