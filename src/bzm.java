import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bzm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxn<? extends byf>, bzk> b = ImmutableMap.builder()
      .put(bxn.d, cle.m().a())
      .put(bxn.f, clh.m().a())
      .put(bxn.g, coc.m().a())
      .put(bxn.i, clk.gw().a())
      .put(bxn.l, cjo.m().a())
      .put(bxn.m, cjw.gI().a())
      .put(bxn.p, cot.m().a())
      .put(bxn.r, cou.gx().a())
      .put(bxn.v, cjy.gK().a())
      .put(bxn.u, clp.m().a())
      .put(bxn.w, cov.m().a())
      .put(bxn.A, ckb.m().a())
      .put(bxn.B, cjr.m().a())
      .put(bxn.D, ckf.m().a())
      .put(bxn.E, cqo.p().a())
      .put(bxn.F, cow.m().a())
      .put(bxn.I, cki.u().a())
      .put(bxn.J, cmd.m().a())
      .put(bxn.L, coy.m().a())
      .put(bxn.N, coz.m().a())
      .put(bxn.O, cpa.m().a())
      .put(bxn.P, cpb.m().a())
      .put(bxn.Q, cng.p().a())
      .put(bxn.T, cpd.p().a())
      .put(bxn.s, cqg.m().a())
      .put(bxn.ab, ckk.m().a())
      .put(bxn.ac, cls.gu().a())
      .put(bxn.ae, cpe.u().a())
      .put(bxn.af, cpf.m().a())
      .put(bxn.ah, bxu.gu().a())
      .put(bxn.ai, cma.p().a())
      .put(bxn.aj, cpg.gu().a())
      .put(bxn.ak, cqr.m().a())
      .put(bxn.am, cme.gV().a())
      .put(bxn.an, cqd.gy().a())
      .put(bxn.ao, cpi.p().a())
      .put(bxn.aq, ckl.m().a())
      .put(bxn.ay, cmh.gG().a())
      .put(bxn.aA, cpj.m().a())
      .put(bxn.aF, ckf.m().a())
      .put(bxn.aG, cmd.m().a())
      .put(bxn.aJ, ckn.m().a())
      .put(bxn.aO, cko.gH().a())
      .put(bxn.aP, ckp.gG().a())
      .put(bxn.aQ, cpk.gA().a())
      .put(bxn.aR, ckq.m().a())
      .put(bxn.aS, cqx.gB().a())
      .put(bxn.aT, cra.u().a())
      .put(bxn.aU, cpn.p().a())
      .put(bxn.bT, csi.fX().a())
      .put(bxn.aV, ckt.m().a())
      .put(bxn.aY, cjr.m().a())
      .put(bxn.aZ, ckv.p().a())
      .put(bxn.ba, cpp.m().a())
      .put(bxn.bb, cjr.m().a())
      .put(bxn.bc, cmr.m().a())
      .put(bxn.bd, cpq.m().a())
      .put(bxn.bf, cpr.m().a())
      .put(bxn.bg, cos.m().a())
      .put(bxn.bh, cmk.m().a())
      .put(bxn.bi, cpk.gA().a())
      .put(bxn.bk, cmu.m().a())
      .put(bxn.bm, cky.m().a())
      .put(bxn.bp, cpv.p().a())
      .put(bxn.bs, ckz.gu().a())
      .put(bxn.bt, cos.m().a())
      .put(bxn.bu, cpx.p().a())
      .put(bxn.bv, clx.gw().a())
      .put(bxn.bz, cmh.gG().a())
      .put(bxn.bB, cjr.m().a())
      .put(bxn.bC, clc.u().a())
      .put(bxn.bD, cpy.m().a())
      .put(bxn.bE, cru.gD().a())
      .put(bxn.bF, cpz.p().a())
      .put(bxn.bH, crl.m().a())
      .put(bxn.bG, byh.D().a())
      .put(bxn.bJ, cqa.p().a())
      .put(bxn.bK, coa.p().a())
      .put(bxn.bL, cos.m().a())
      .put(bxn.bN, cmx.gH().a())
      .put(bxn.bO, cqc.m().a())
      .put(bxn.bP, cqd.gy().a())
      .put(bxn.bQ, cmo.m().a())
      .put(bxn.bR, cqd.gy().a())
      .put(bxn.bS, cqf.gE().a())
      .build();

   public static bzk a(bxn<? extends byf> $$0) {
      return b.get($$0);
   }

   public static boolean b(bxn<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mh.f.s().filter($$0 -> $$0.f() != byi.h).filter($$0 -> !b((bxn<?>)$$0)).map(mh.f::b).forEach($$0 -> ag.b("Entity " + $$0 + " has no attributes"));
   }
}
