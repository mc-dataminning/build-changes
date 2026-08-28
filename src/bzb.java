import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bzb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bxc<? extends bxu>, byz> b = ImmutableMap.builder()
      .put(bxc.d, ckt.j().a())
      .put(bxc.f, ckw.q().a())
      .put(bxc.g, cnr.j().a())
      .put(bxc.i, ckz.gu().a())
      .put(bxc.l, cjd.j().a())
      .put(bxc.m, cjl.gI().a())
      .put(bxc.p, coh.j().a())
      .put(bxc.r, coi.gu().a())
      .put(bxc.v, cjn.gK().a())
      .put(bxc.u, cle.q().a())
      .put(bxc.w, coj.j().a())
      .put(bxc.A, cjq.q().a())
      .put(bxc.B, cjg.j().a())
      .put(bxc.D, cju.q().a())
      .put(bxc.E, cqd.m().a())
      .put(bxc.F, cok.j().a())
      .put(bxc.I, cjx.x().a())
      .put(bxc.J, cls.q().a())
      .put(bxc.L, com.j().a())
      .put(bxc.N, coo.j().a())
      .put(bxc.O, cop.j().a())
      .put(bxc.P, coq.j().a())
      .put(bxc.Q, cmv.m().a())
      .put(bxc.T, cos.m().a())
      .put(bxc.s, cpv.j().a())
      .put(bxc.ab, cjz.q().a())
      .put(bxc.ac, clh.gu().a())
      .put(bxc.ae, cot.n().a())
      .put(bxc.af, cou.j().a())
      .put(bxc.ah, bxj.gu().a())
      .put(bxc.ai, clp.t().a())
      .put(bxc.aj, cov.q().a())
      .put(bxc.ak, cqg.t().a())
      .put(bxc.am, clt.gV().a())
      .put(bxc.an, cps.gv().a())
      .put(bxc.ao, cox.m().a())
      .put(bxc.aq, cka.j().a())
      .put(bxc.ay, clw.gG().a())
      .put(bxc.aA, coy.j().a())
      .put(bxc.aF, cju.q().a())
      .put(bxc.aG, cls.q().a())
      .put(bxc.aJ, ckc.q().a())
      .put(bxc.aO, ckd.gH().a())
      .put(bxc.aP, cke.gG().a())
      .put(bxc.aQ, coz.gx().a())
      .put(bxc.aR, ckf.q().a())
      .put(bxc.aS, cqm.gy().a())
      .put(bxc.aT, cqp.n().a())
      .put(bxc.aU, cpc.m().a())
      .put(bxc.bT, crx.fX().a())
      .put(bxc.aV, cki.q().a())
      .put(bxc.aY, cjg.j().a())
      .put(bxc.aZ, ckk.t().a())
      .put(bxc.ba, cpe.j().a())
      .put(bxc.bb, cjg.j().a())
      .put(bxc.bc, cmg.q().a())
      .put(bxc.bd, cpf.j().a())
      .put(bxc.bf, cpg.j().a())
      .put(bxc.bg, cog.j().a())
      .put(bxc.bh, clz.q().a())
      .put(bxc.bi, coz.gx().a())
      .put(bxc.bk, cmj.q().a())
      .put(bxc.bm, ckn.j().a())
      .put(bxc.bp, cpk.m().a())
      .put(bxc.bs, cko.gu().a())
      .put(bxc.bt, cog.j().a())
      .put(bxc.bu, cpm.t().a())
      .put(bxc.bv, clm.x().a())
      .put(bxc.bz, clw.gG().a())
      .put(bxc.bB, cjg.j().a())
      .put(bxc.bC, ckr.x().a())
      .put(bxc.bD, cpn.j().a())
      .put(bxc.bE, crj.gD().a())
      .put(bxc.bF, cpo.m().a())
      .put(bxc.bH, cra.j().a())
      .put(bxc.bG, bxw.E().a())
      .put(bxc.bJ, cpp.m().a())
      .put(bxc.bK, cnp.m().a())
      .put(bxc.bL, cog.j().a())
      .put(bxc.bN, cmm.gH().a())
      .put(bxc.bO, cpr.j().a())
      .put(bxc.bP, cps.gv().a())
      .put(bxc.bQ, cmd.q().a())
      .put(bxc.bR, cps.gv().a())
      .put(bxc.bS, cpu.gB().a())
      .build();

   public static byz a(bxc<? extends bxu> $$0) {
      return b.get($$0);
   }

   public static boolean b(bxc<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mg.f.s().filter($$0 -> $$0.f() != bxx.h).filter($$0 -> !b((bxc<?>)$$0)).map(mg.f::b).forEach($$0 -> ag.b("Entity " + $$0 + " has no attributes"));
   }
}
