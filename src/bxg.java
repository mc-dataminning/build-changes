import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvi<? extends bvx>, bxe> b = ImmutableMap.builder()
      .put(bvi.c, ciu.m().a())
      .put(bvi.e, cix.p().a())
      .put(bvi.f, clh.m().a())
      .put(bvi.h, cja.gq().a())
      .put(bvi.k, chi.m().a())
      .put(bvi.l, chp.gC().a())
      .put(bvi.o, clx.m().a())
      .put(bvi.q, cly.gq().a())
      .put(bvi.u, chr.gE().a())
      .put(bvi.t, cjf.p().a())
      .put(bvi.v, clz.m().a())
      .put(bvi.z, cht.p().a())
      .put(bvi.A, chk.m().a())
      .put(bvi.C, chv.p().a())
      .put(bvi.F, cma.m().a())
      .put(bvi.I, chw.go().a())
      .put(bvi.J, cjr.p().a())
      .put(bvi.L, cmc.m().a())
      .put(bvi.N, cmd.m().a())
      .put(bvi.O, cme.m().a())
      .put(bvi.P, cmf.m().a())
      .put(bvi.Q, ckl.p().a())
      .put(bvi.T, cmh.p().a())
      .put(bvi.r, cnk.m().a())
      .put(bvi.ab, chy.p().a())
      .put(bvi.ac, cji.go().a())
      .put(bvi.ae, cmi.t().a())
      .put(bvi.af, cmj.m().a())
      .put(bvi.ah, bvp.go().a())
      .put(bvi.ai, cjo.t().a())
      .put(bvi.aj, cmk.x().a())
      .put(bvi.ak, cnw.p().a())
      .put(bvi.am, cjs.gQ().a())
      .put(bvi.an, cnh.gr().a())
      .put(bvi.ao, cmm.p().a())
      .put(bvi.aq, cia.m().a())
      .put(bvi.ay, cjv.gA().a())
      .put(bvi.aA, cmn.m().a())
      .put(bvi.aF, chv.p().a())
      .put(bvi.aG, cjr.p().a())
      .put(bvi.aJ, cic.p().a())
      .put(bvi.aO, cid.gB().a())
      .put(bvi.aP, cie.gA().a())
      .put(bvi.aQ, cmo.gt().a())
      .put(bvi.aR, cif.p().a())
      .put(bvi.aS, coc.gu().a())
      .put(bvi.aT, cof.t().a())
      .put(bvi.aU, cmr.p().a())
      .put(bvi.bS, cpo.fX().a())
      .put(bvi.aV, cig.p().a())
      .put(bvi.aX, chk.m().a())
      .put(bvi.aY, cii.t().a())
      .put(bvi.aZ, cmt.m().a())
      .put(bvi.ba, chk.m().a())
      .put(bvi.bb, cik.p().a())
      .put(bvi.bc, cmu.m().a())
      .put(bvi.be, cmv.m().a())
      .put(bvi.bf, clw.m().a())
      .put(bvi.bg, cjy.p().a())
      .put(bvi.bh, cmo.gt().a())
      .put(bvi.bj, ckf.p().a())
      .put(bvi.bl, cim.m().a())
      .put(bvi.bo, cmz.p().a())
      .put(bvi.br, cin.go().a())
      .put(bvi.bs, clw.m().a())
      .put(bvi.bt, cnb.t().a())
      .put(bvi.bu, cjl.gp().a())
      .put(bvi.by, cjv.gA().a())
      .put(bvi.bA, chk.m().a())
      .put(bvi.bB, cip.x().a())
      .put(bvi.bC, cnc.m().a())
      .put(bvi.bD, cpa.gx().a())
      .put(bvi.bE, cnd.p().a())
      .put(bvi.bG, cor.m().a())
      .put(bvi.bF, bvz.C().a())
      .put(bvi.bI, cne.p().a())
      .put(bvi.bJ, clf.p().a())
      .put(bvi.bK, clw.m().a())
      .put(bvi.bM, cir.gC().a())
      .put(bvi.bN, cng.m().a())
      .put(bvi.D, cns.m().a())
      .put(bvi.E, cns.m().a())
      .put(bvi.bO, cnh.gr().a())
      .put(bvi.bP, ckc.p().a())
      .put(bvi.bQ, cnh.gr().a())
      .put(bvi.bR, cnj.gx().a())
      .build();

   public static bxe a(bvi<? extends bvx> $$0) {
      return b.get($$0);
   }

   public static boolean b(bvi<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ma.f.s().filter($$0 -> $$0.f() != bwa.h).filter($$0 -> !b((bvi<?>)$$0)).map(ma.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
