import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bzd {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxe<? extends bxw>, bzb> b = ImmutableMap.builder()
      .put(bxe.d, ckv.j().a())
      .put(bxe.f, cky.q().a())
      .put(bxe.g, cnt.j().a())
      .put(bxe.i, clb.gu().a())
      .put(bxe.l, cjf.j().a())
      .put(bxe.m, cjn.gI().a())
      .put(bxe.p, coj.j().a())
      .put(bxe.r, cok.gu().a())
      .put(bxe.v, cjp.gK().a())
      .put(bxe.u, clg.q().a())
      .put(bxe.w, col.j().a())
      .put(bxe.A, cjs.q().a())
      .put(bxe.B, cji.j().a())
      .put(bxe.D, cjw.q().a())
      .put(bxe.E, cqf.m().a())
      .put(bxe.F, com.j().a())
      .put(bxe.I, cjz.x().a())
      .put(bxe.J, clu.q().a())
      .put(bxe.L, cop.j().a())
      .put(bxe.N, coq.j().a())
      .put(bxe.O, cor.j().a())
      .put(bxe.P, cos.j().a())
      .put(bxe.Q, cmx.m().a())
      .put(bxe.T, cou.m().a())
      .put(bxe.s, cpx.j().a())
      .put(bxe.ab, ckb.q().a())
      .put(bxe.ac, clj.gu().a())
      .put(bxe.ae, cov.n().a())
      .put(bxe.af, cow.j().a())
      .put(bxe.ah, bxl.gu().a())
      .put(bxe.ai, clr.t().a())
      .put(bxe.aj, cox.q().a())
      .put(bxe.ak, cqi.t().a())
      .put(bxe.am, clv.gV().a())
      .put(bxe.an, cpu.gv().a())
      .put(bxe.ao, coz.m().a())
      .put(bxe.aq, ckc.j().a())
      .put(bxe.ay, cly.gG().a())
      .put(bxe.aA, cpa.j().a())
      .put(bxe.aF, cjw.q().a())
      .put(bxe.aG, clu.q().a())
      .put(bxe.aJ, cke.q().a())
      .put(bxe.aO, ckf.gH().a())
      .put(bxe.aP, ckg.gG().a())
      .put(bxe.aQ, cpb.gx().a())
      .put(bxe.aR, ckh.q().a())
      .put(bxe.aS, cqo.gy().a())
      .put(bxe.aT, cqr.n().a())
      .put(bxe.aU, cpe.m().a())
      .put(bxe.bT, crz.fX().a())
      .put(bxe.aV, ckk.q().a())
      .put(bxe.aY, cji.j().a())
      .put(bxe.aZ, ckm.t().a())
      .put(bxe.ba, cpg.j().a())
      .put(bxe.bb, cji.j().a())
      .put(bxe.bc, cmi.q().a())
      .put(bxe.bd, cph.j().a())
      .put(bxe.bf, cpi.j().a())
      .put(bxe.bg, coi.j().a())
      .put(bxe.bh, cmb.q().a())
      .put(bxe.bi, cpb.gx().a())
      .put(bxe.bk, cml.q().a())
      .put(bxe.bm, ckp.j().a())
      .put(bxe.bp, cpm.m().a())
      .put(bxe.bs, ckq.gu().a())
      .put(bxe.bt, coi.j().a())
      .put(bxe.bu, cpo.t().a())
      .put(bxe.bv, clo.x().a())
      .put(bxe.bz, cly.gG().a())
      .put(bxe.bB, cji.j().a())
      .put(bxe.bC, ckt.x().a())
      .put(bxe.bD, cpp.j().a())
      .put(bxe.bE, crl.gD().a())
      .put(bxe.bF, cpq.m().a())
      .put(bxe.bH, crc.j().a())
      .put(bxe.bG, bxy.E().a())
      .put(bxe.bJ, cpr.m().a())
      .put(bxe.bK, cnr.m().a())
      .put(bxe.bL, coi.j().a())
      .put(bxe.bN, cmo.gH().a())
      .put(bxe.bO, cpt.j().a())
      .put(bxe.bP, cpu.gv().a())
      .put(bxe.bQ, cmf.q().a())
      .put(bxe.bR, cpu.gv().a())
      .put(bxe.bS, cpw.gB().a())
      .build();

   public static bzb a(bxe<? extends bxw> $$0) {
      return b.get($$0);
   }

   public static boolean b(bxe<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mh.f.s().filter($$0 -> $$0.f() != bxz.h).filter($$0 -> !b((bxe<?>)$$0)).map(mh.f::b).forEach($$0 -> ag.b("Entity " + $$0 + " has no attributes"));
   }
}
