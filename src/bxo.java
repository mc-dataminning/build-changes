import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxo {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvq<? extends bwf>, bxm> b = ImmutableMap.builder()
      .put(bvq.c, cjc.m().a())
      .put(bvq.e, cjf.p().a())
      .put(bvq.f, clp.m().a())
      .put(bvq.h, cji.gq().a())
      .put(bvq.k, chq.m().a())
      .put(bvq.l, chx.gC().a())
      .put(bvq.o, cmf.m().a())
      .put(bvq.q, cmg.gq().a())
      .put(bvq.u, chz.gE().a())
      .put(bvq.t, cjn.p().a())
      .put(bvq.v, cmh.m().a())
      .put(bvq.z, cib.p().a())
      .put(bvq.A, chs.m().a())
      .put(bvq.C, cid.p().a())
      .put(bvq.F, cmi.m().a())
      .put(bvq.I, cie.go().a())
      .put(bvq.J, cjz.p().a())
      .put(bvq.L, cmk.m().a())
      .put(bvq.N, cml.m().a())
      .put(bvq.O, cmm.m().a())
      .put(bvq.P, cmn.m().a())
      .put(bvq.Q, ckt.p().a())
      .put(bvq.T, cmp.p().a())
      .put(bvq.r, cns.m().a())
      .put(bvq.ab, cig.p().a())
      .put(bvq.ac, cjq.go().a())
      .put(bvq.ae, cmq.t().a())
      .put(bvq.af, cmr.m().a())
      .put(bvq.ah, bvx.go().a())
      .put(bvq.ai, cjw.t().a())
      .put(bvq.aj, cms.x().a())
      .put(bvq.ak, coe.p().a())
      .put(bvq.am, cka.gQ().a())
      .put(bvq.an, cnp.gr().a())
      .put(bvq.ao, cmu.p().a())
      .put(bvq.aq, cii.m().a())
      .put(bvq.ay, ckd.gA().a())
      .put(bvq.aA, cmv.m().a())
      .put(bvq.aF, cid.p().a())
      .put(bvq.aG, cjz.p().a())
      .put(bvq.aJ, cik.p().a())
      .put(bvq.aO, cil.gB().a())
      .put(bvq.aP, cim.gA().a())
      .put(bvq.aQ, cmw.gt().a())
      .put(bvq.aR, cin.p().a())
      .put(bvq.aS, cok.gu().a())
      .put(bvq.aT, coo.t().a())
      .put(bvq.aU, cmz.p().a())
      .put(bvq.bS, cpw.fX().a())
      .put(bvq.aV, cio.p().a())
      .put(bvq.aX, chs.m().a())
      .put(bvq.aY, ciq.t().a())
      .put(bvq.aZ, cnb.m().a())
      .put(bvq.ba, chs.m().a())
      .put(bvq.bb, cis.p().a())
      .put(bvq.bc, cnc.m().a())
      .put(bvq.be, cnd.m().a())
      .put(bvq.bf, cme.m().a())
      .put(bvq.bg, ckg.p().a())
      .put(bvq.bh, cmw.gt().a())
      .put(bvq.bj, ckn.p().a())
      .put(bvq.bl, ciu.m().a())
      .put(bvq.bo, cnh.p().a())
      .put(bvq.br, civ.go().a())
      .put(bvq.bs, cme.m().a())
      .put(bvq.bt, cnj.t().a())
      .put(bvq.bu, cjt.gp().a())
      .put(bvq.by, ckd.gA().a())
      .put(bvq.bA, chs.m().a())
      .put(bvq.bB, cix.x().a())
      .put(bvq.bC, cnk.m().a())
      .put(bvq.bD, cpi.gx().a())
      .put(bvq.bE, cnl.p().a())
      .put(bvq.bG, coz.m().a())
      .put(bvq.bF, bwh.C().a())
      .put(bvq.bI, cnm.p().a())
      .put(bvq.bJ, cln.p().a())
      .put(bvq.bK, cme.m().a())
      .put(bvq.bM, ciz.gC().a())
      .put(bvq.bN, cno.m().a())
      .put(bvq.D, coa.m().a())
      .put(bvq.E, coa.m().a())
      .put(bvq.bO, cnp.gr().a())
      .put(bvq.bP, ckk.p().a())
      .put(bvq.bQ, cnp.gr().a())
      .put(bvq.bR, cnr.gx().a())
      .build();

   public static bxm a(bvq<? extends bwf> $$0) {
      return b.get($$0);
   }

   public static boolean b(bvq<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ma.f.s().filter($$0 -> $$0.f() != bwi.h).filter($$0 -> !b((bvq<?>)$$0)).map(ma.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
