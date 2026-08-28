import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bvr<? extends bwg>, bxn> b = ImmutableMap.builder()
      .put(bvr.c, cjd.m().a())
      .put(bvr.e, cjg.p().a())
      .put(bvr.f, clq.m().a())
      .put(bvr.h, cjj.gq().a())
      .put(bvr.k, chr.m().a())
      .put(bvr.l, chy.gC().a())
      .put(bvr.o, cmg.m().a())
      .put(bvr.q, cmh.gq().a())
      .put(bvr.u, cia.gE().a())
      .put(bvr.t, cjo.p().a())
      .put(bvr.v, cmi.m().a())
      .put(bvr.z, cic.p().a())
      .put(bvr.A, cht.m().a())
      .put(bvr.C, cie.p().a())
      .put(bvr.F, cmj.m().a())
      .put(bvr.I, cif.go().a())
      .put(bvr.J, cka.p().a())
      .put(bvr.L, cml.m().a())
      .put(bvr.N, cmm.m().a())
      .put(bvr.O, cmn.m().a())
      .put(bvr.P, cmo.m().a())
      .put(bvr.Q, cku.p().a())
      .put(bvr.T, cmq.p().a())
      .put(bvr.r, cnt.m().a())
      .put(bvr.ab, cih.p().a())
      .put(bvr.ac, cjr.go().a())
      .put(bvr.ae, cmr.t().a())
      .put(bvr.af, cms.m().a())
      .put(bvr.ah, bvy.go().a())
      .put(bvr.ai, cjx.t().a())
      .put(bvr.aj, cmt.x().a())
      .put(bvr.ak, cof.p().a())
      .put(bvr.am, ckb.gQ().a())
      .put(bvr.an, cnq.gr().a())
      .put(bvr.ao, cmv.p().a())
      .put(bvr.aq, cij.m().a())
      .put(bvr.ay, cke.gA().a())
      .put(bvr.aA, cmw.m().a())
      .put(bvr.aF, cie.p().a())
      .put(bvr.aG, cka.p().a())
      .put(bvr.aJ, cil.p().a())
      .put(bvr.aO, cim.gB().a())
      .put(bvr.aP, cin.gA().a())
      .put(bvr.aQ, cmx.gt().a())
      .put(bvr.aR, cio.p().a())
      .put(bvr.aS, col.gu().a())
      .put(bvr.aT, cop.t().a())
      .put(bvr.aU, cna.p().a())
      .put(bvr.bS, cpx.fX().a())
      .put(bvr.aV, cip.p().a())
      .put(bvr.aX, cht.m().a())
      .put(bvr.aY, cir.t().a())
      .put(bvr.aZ, cnc.m().a())
      .put(bvr.ba, cht.m().a())
      .put(bvr.bb, cit.p().a())
      .put(bvr.bc, cnd.m().a())
      .put(bvr.be, cne.m().a())
      .put(bvr.bf, cmf.m().a())
      .put(bvr.bg, ckh.p().a())
      .put(bvr.bh, cmx.gt().a())
      .put(bvr.bj, cko.p().a())
      .put(bvr.bl, civ.m().a())
      .put(bvr.bo, cni.p().a())
      .put(bvr.br, ciw.go().a())
      .put(bvr.bs, cmf.m().a())
      .put(bvr.bt, cnk.t().a())
      .put(bvr.bu, cju.gp().a())
      .put(bvr.by, cke.gA().a())
      .put(bvr.bA, cht.m().a())
      .put(bvr.bB, ciy.x().a())
      .put(bvr.bC, cnl.m().a())
      .put(bvr.bD, cpj.gx().a())
      .put(bvr.bE, cnm.p().a())
      .put(bvr.bG, cpa.m().a())
      .put(bvr.bF, bwi.C().a())
      .put(bvr.bI, cnn.p().a())
      .put(bvr.bJ, clo.p().a())
      .put(bvr.bK, cmf.m().a())
      .put(bvr.bM, cja.gC().a())
      .put(bvr.bN, cnp.m().a())
      .put(bvr.D, cob.m().a())
      .put(bvr.E, cob.m().a())
      .put(bvr.bO, cnq.gr().a())
      .put(bvr.bP, ckl.p().a())
      .put(bvr.bQ, cnq.gr().a())
      .put(bvr.bR, cns.gx().a())
      .build();

   public static bxn a(bvr<? extends bwg> $$0) {
      return b.get($$0);
   }

   public static boolean b(bvr<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ma.f.s().filter($$0 -> $$0.f() != bwj.h).filter($$0 -> !b((bvr<?>)$$0)).map(ma.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
