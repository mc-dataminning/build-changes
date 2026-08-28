import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class byg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwj<? extends bwz>, bye> b = ImmutableMap.builder()
      .put(bwj.c, cjx.j().a())
      .put(bwj.e, cka.q().a())
      .put(bwj.f, cmm.j().a())
      .put(bwj.h, ckd.gq().a())
      .put(bwj.k, cii.j().a())
      .put(bwj.l, cip.gE().a())
      .put(bwj.o, cnc.j().a())
      .put(bwj.q, cnd.gq().a())
      .put(bwj.u, cir.gG().a())
      .put(bwj.t, cki.q().a())
      .put(bwj.v, cne.j().a())
      .put(bwj.z, ciu.q().a())
      .put(bwj.A, cik.j().a())
      .put(bwj.C, ciw.q().a())
      .put(bwj.D, coy.m().a())
      .put(bwj.E, cnf.j().a())
      .put(bwj.H, cix.gq().a())
      .put(bwj.I, ckw.q().a())
      .put(bwj.K, cnh.j().a())
      .put(bwj.M, cni.j().a())
      .put(bwj.N, cnj.j().a())
      .put(bwj.O, cnk.j().a())
      .put(bwj.P, clq.m().a())
      .put(bwj.S, cnm.m().a())
      .put(bwj.r, coq.j().a())
      .put(bwj.aa, ciz.q().a())
      .put(bwj.ab, ckl.gq().a())
      .put(bwj.ad, cnn.n().a())
      .put(bwj.ae, cno.j().a())
      .put(bwj.ag, bwq.gq().a())
      .put(bwj.ah, ckt.t().a())
      .put(bwj.ai, cnp.q().a())
      .put(bwj.aj, cpb.t().a())
      .put(bwj.al, ckx.gR().a())
      .put(bwj.am, com.gr().a())
      .put(bwj.an, cnr.m().a())
      .put(bwj.ap, cja.j().a())
      .put(bwj.ax, cla.gC().a())
      .put(bwj.az, cns.j().a())
      .put(bwj.aE, ciw.q().a())
      .put(bwj.aF, ckw.q().a())
      .put(bwj.aI, cjc.q().a())
      .put(bwj.aN, cjd.gD().a())
      .put(bwj.aO, cje.gC().a())
      .put(bwj.aP, cnt.gt().a())
      .put(bwj.aQ, cjf.q().a())
      .put(bwj.aR, cph.gu().a())
      .put(bwj.aS, cpk.n().a())
      .put(bwj.aT, cnw.m().a())
      .put(bwj.bS, cqs.fW().a())
      .put(bwj.aU, cji.q().a())
      .put(bwj.aX, cik.j().a())
      .put(bwj.aY, cjk.t().a())
      .put(bwj.aZ, cny.j().a())
      .put(bwj.ba, cik.j().a())
      .put(bwj.bb, cjm.q().a())
      .put(bwj.bc, cnz.j().a())
      .put(bwj.be, coa.j().a())
      .put(bwj.bf, cnb.j().a())
      .put(bwj.bg, cld.q().a())
      .put(bwj.bh, cnt.gt().a())
      .put(bwj.bj, clk.q().a())
      .put(bwj.bl, cjo.j().a())
      .put(bwj.bo, coe.m().a())
      .put(bwj.br, cjp.gq().a())
      .put(bwj.bs, cnb.j().a())
      .put(bwj.bt, cog.t().a())
      .put(bwj.bu, ckq.x().a())
      .put(bwj.by, cla.gC().a())
      .put(bwj.bA, cik.j().a())
      .put(bwj.bB, cjs.x().a())
      .put(bwj.bC, coh.j().a())
      .put(bwj.bD, cqe.gz().a())
      .put(bwj.bE, coi.m().a())
      .put(bwj.bG, cpv.j().a())
      .put(bwj.bF, bxb.E().a())
      .put(bwj.bI, coj.m().a())
      .put(bwj.bJ, cmk.m().a())
      .put(bwj.bK, cnb.j().a())
      .put(bwj.bM, cju.gD().a())
      .put(bwj.bN, col.j().a())
      .put(bwj.bO, com.gr().a())
      .put(bwj.bP, clh.q().a())
      .put(bwj.bQ, com.gr().a())
      .put(bwj.bR, cop.gx().a())
      .build();

   public static bye a(bwj<? extends bwz> $$0) {
      return b.get($$0);
   }

   public static boolean b(bwj<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mf.f.s().filter($$0 -> $$0.f() != bxc.h).filter($$0 -> !b((bwj<?>)$$0)).map(mf.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
