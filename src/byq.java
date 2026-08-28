import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class byq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwr<? extends bxj>, byo> b = ImmutableMap.builder()
      .put(bwr.c, ckl.j().a())
      .put(bwr.e, cko.q().a())
      .put(bwr.f, cnd.j().a())
      .put(bwr.h, ckr.gt().a())
      .put(bwr.k, cis.j().a())
      .put(bwr.l, cja.gH().a())
      .put(bwr.o, cnt.j().a())
      .put(bwr.q, cnu.gt().a())
      .put(bwr.u, cjc.gJ().a())
      .put(bwr.t, ckw.q().a())
      .put(bwr.v, cnv.j().a())
      .put(bwr.z, cjf.q().a())
      .put(bwr.A, civ.j().a())
      .put(bwr.C, cjj.q().a())
      .put(bwr.D, cpp.m().a())
      .put(bwr.E, cnw.j().a())
      .put(bwr.H, cjm.x().a())
      .put(bwr.I, clk.q().a())
      .put(bwr.K, cny.j().a())
      .put(bwr.M, cnz.j().a())
      .put(bwr.N, coa.j().a())
      .put(bwr.O, cob.j().a())
      .put(bwr.P, cmh.m().a())
      .put(bwr.S, cod.m().a())
      .put(bwr.r, cph.j().a())
      .put(bwr.aa, cjo.q().a())
      .put(bwr.ab, ckz.gt().a())
      .put(bwr.ad, coe.n().a())
      .put(bwr.ae, cof.j().a())
      .put(bwr.ag, bwy.gt().a())
      .put(bwr.ah, clh.t().a())
      .put(bwr.ai, cog.q().a())
      .put(bwr.aj, cps.t().a())
      .put(bwr.al, cll.gU().a())
      .put(bwr.am, cpe.gu().a())
      .put(bwr.an, coi.m().a())
      .put(bwr.ap, cjp.j().a())
      .put(bwr.ax, clo.gF().a())
      .put(bwr.az, coj.j().a())
      .put(bwr.aE, cjj.q().a())
      .put(bwr.aF, clk.q().a())
      .put(bwr.aI, cjr.q().a())
      .put(bwr.aN, cjs.gG().a())
      .put(bwr.aO, cjt.gF().a())
      .put(bwr.aP, cok.gw().a())
      .put(bwr.aQ, cju.q().a())
      .put(bwr.aR, cpy.gx().a())
      .put(bwr.aS, cqb.n().a())
      .put(bwr.aT, coo.m().a())
      .put(bwr.bS, crj.fW().a())
      .put(bwr.aU, cjx.q().a())
      .put(bwr.aX, civ.j().a())
      .put(bwr.aY, cjz.t().a())
      .put(bwr.aZ, coq.j().a())
      .put(bwr.ba, civ.j().a())
      .put(bwr.bb, cly.q().a())
      .put(bwr.bc, cor.j().a())
      .put(bwr.be, cos.j().a())
      .put(bwr.bf, cns.j().a())
      .put(bwr.bg, clr.q().a())
      .put(bwr.bh, cok.gw().a())
      .put(bwr.bj, cmb.q().a())
      .put(bwr.bl, ckc.j().a())
      .put(bwr.bo, cow.m().a())
      .put(bwr.br, ckd.gt().a())
      .put(bwr.bs, cns.j().a())
      .put(bwr.bt, coy.t().a())
      .put(bwr.bu, cle.x().a())
      .put(bwr.by, clo.gF().a())
      .put(bwr.bA, civ.j().a())
      .put(bwr.bB, ckg.x().a())
      .put(bwr.bC, coz.j().a())
      .put(bwr.bD, cqv.gC().a())
      .put(bwr.bE, cpa.m().a())
      .put(bwr.bG, cqm.j().a())
      .put(bwr.bF, bxl.E().a())
      .put(bwr.bI, cpb.m().a())
      .put(bwr.bJ, cnb.m().a())
      .put(bwr.bK, cns.j().a())
      .put(bwr.bM, cki.gG().a())
      .put(bwr.bN, cpd.j().a())
      .put(bwr.bO, cpe.gu().a())
      .put(bwr.bP, clv.q().a())
      .put(bwr.bQ, cpe.gu().a())
      .put(bwr.bR, cpg.gA().a())
      .build();

   public static byo a(bwr<? extends bxj> $$0) {
      return b.get($$0);
   }

   public static boolean b(bwr<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mg.f.s().filter($$0 -> $$0.f() != bxm.h).filter($$0 -> !b((bwr<?>)$$0)).map(mg.f::b).forEach($$0 -> ag.b("Entity " + $$0 + " has no attributes"));
   }
}
