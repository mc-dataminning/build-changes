import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bzm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxn<? extends byf>, bzk> b = ImmutableMap.builder()
      .put(bxn.d, cle.j().a())
      .put(bxn.f, clh.q().a())
      .put(bxn.g, coc.j().a())
      .put(bxn.i, clk.gu().a())
      .put(bxn.l, cjo.j().a())
      .put(bxn.m, cjw.gI().a())
      .put(bxn.p, cot.j().a())
      .put(bxn.r, cou.gu().a())
      .put(bxn.v, cjy.gK().a())
      .put(bxn.u, clp.q().a())
      .put(bxn.w, cov.j().a())
      .put(bxn.A, ckb.q().a())
      .put(bxn.B, cjr.j().a())
      .put(bxn.D, ckf.q().a())
      .put(bxn.E, cqo.m().a())
      .put(bxn.F, cow.j().a())
      .put(bxn.I, cki.x().a())
      .put(bxn.J, cmd.q().a())
      .put(bxn.L, coy.j().a())
      .put(bxn.N, coz.j().a())
      .put(bxn.O, cpa.j().a())
      .put(bxn.P, cpb.j().a())
      .put(bxn.Q, cng.m().a())
      .put(bxn.T, cpd.m().a())
      .put(bxn.s, cqg.j().a())
      .put(bxn.ab, ckk.q().a())
      .put(bxn.ac, cls.gu().a())
      .put(bxn.ae, cpe.n().a())
      .put(bxn.af, cpf.j().a())
      .put(bxn.ah, bxu.gu().a())
      .put(bxn.ai, cma.t().a())
      .put(bxn.aj, cpg.q().a())
      .put(bxn.ak, cqr.t().a())
      .put(bxn.am, cme.gV().a())
      .put(bxn.an, cqd.gv().a())
      .put(bxn.ao, cpi.m().a())
      .put(bxn.aq, ckl.j().a())
      .put(bxn.ay, cmh.gG().a())
      .put(bxn.aA, cpj.j().a())
      .put(bxn.aF, ckf.q().a())
      .put(bxn.aG, cmd.q().a())
      .put(bxn.aJ, ckn.q().a())
      .put(bxn.aO, cko.gH().a())
      .put(bxn.aP, ckp.gG().a())
      .put(bxn.aQ, cpk.gx().a())
      .put(bxn.aR, ckq.q().a())
      .put(bxn.aS, cqx.gy().a())
      .put(bxn.aT, cra.n().a())
      .put(bxn.aU, cpn.m().a())
      .put(bxn.bT, csi.fX().a())
      .put(bxn.aV, ckt.q().a())
      .put(bxn.aY, cjr.j().a())
      .put(bxn.aZ, ckv.t().a())
      .put(bxn.ba, cpp.j().a())
      .put(bxn.bb, cjr.j().a())
      .put(bxn.bc, cmr.q().a())
      .put(bxn.bd, cpq.j().a())
      .put(bxn.bf, cpr.j().a())
      .put(bxn.bg, cos.j().a())
      .put(bxn.bh, cmk.q().a())
      .put(bxn.bi, cpk.gx().a())
      .put(bxn.bk, cmu.q().a())
      .put(bxn.bm, cky.j().a())
      .put(bxn.bp, cpv.m().a())
      .put(bxn.bs, ckz.gu().a())
      .put(bxn.bt, cos.j().a())
      .put(bxn.bu, cpx.t().a())
      .put(bxn.bv, clx.x().a())
      .put(bxn.bz, cmh.gG().a())
      .put(bxn.bB, cjr.j().a())
      .put(bxn.bC, clc.x().a())
      .put(bxn.bD, cpy.j().a())
      .put(bxn.bE, cru.gD().a())
      .put(bxn.bF, cpz.m().a())
      .put(bxn.bH, crl.j().a())
      .put(bxn.bG, byh.E().a())
      .put(bxn.bJ, cqa.m().a())
      .put(bxn.bK, coa.m().a())
      .put(bxn.bL, cos.j().a())
      .put(bxn.bN, cmx.gH().a())
      .put(bxn.bO, cqc.j().a())
      .put(bxn.bP, cqd.gv().a())
      .put(bxn.bQ, cmo.q().a())
      .put(bxn.bR, cqd.gv().a())
      .put(bxn.bS, cqf.gB().a())
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
