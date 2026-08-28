import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class byq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwr<? extends bxj>, byo> b = ImmutableMap.builder()
      .put(bwr.c, cki.j().a())
      .put(bwr.e, ckl.q().a())
      .put(bwr.f, cng.j().a())
      .put(bwr.h, cko.gt().a())
      .put(bwr.k, cis.j().a())
      .put(bwr.l, cja.gH().a())
      .put(bwr.o, cnw.j().a())
      .put(bwr.q, cnx.gt().a())
      .put(bwr.u, cjc.gJ().a())
      .put(bwr.t, ckt.q().a())
      .put(bwr.v, cny.j().a())
      .put(bwr.z, cjf.q().a())
      .put(bwr.A, civ.j().a())
      .put(bwr.C, cjj.q().a())
      .put(bwr.D, cps.m().a())
      .put(bwr.E, cnz.j().a())
      .put(bwr.H, cjm.x().a())
      .put(bwr.I, clh.q().a())
      .put(bwr.K, cob.j().a())
      .put(bwr.M, coc.j().a())
      .put(bwr.N, cod.j().a())
      .put(bwr.O, coe.j().a())
      .put(bwr.P, cmk.m().a())
      .put(bwr.S, cog.m().a())
      .put(bwr.r, cpk.j().a())
      .put(bwr.aa, cjo.q().a())
      .put(bwr.ab, ckw.gt().a())
      .put(bwr.ad, coh.n().a())
      .put(bwr.ae, coi.j().a())
      .put(bwr.ag, bwy.gt().a())
      .put(bwr.ah, cle.t().a())
      .put(bwr.ai, coj.q().a())
      .put(bwr.aj, cpv.t().a())
      .put(bwr.al, cli.gU().a())
      .put(bwr.am, cph.gu().a())
      .put(bwr.an, col.m().a())
      .put(bwr.ap, cjp.j().a())
      .put(bwr.ax, cll.gF().a())
      .put(bwr.az, com.j().a())
      .put(bwr.aE, cjj.q().a())
      .put(bwr.aF, clh.q().a())
      .put(bwr.aI, cjr.q().a())
      .put(bwr.aN, cjs.gG().a())
      .put(bwr.aO, cjt.gF().a())
      .put(bwr.aP, coo.gw().a())
      .put(bwr.aQ, cju.q().a())
      .put(bwr.aR, cqb.gx().a())
      .put(bwr.aS, cqe.n().a())
      .put(bwr.aT, cor.m().a())
      .put(bwr.bS, crm.fW().a())
      .put(bwr.aU, cjx.q().a())
      .put(bwr.aX, civ.j().a())
      .put(bwr.aY, cjz.t().a())
      .put(bwr.aZ, cot.j().a())
      .put(bwr.ba, civ.j().a())
      .put(bwr.bb, clv.q().a())
      .put(bwr.bc, cou.j().a())
      .put(bwr.be, cov.j().a())
      .put(bwr.bf, cnv.j().a())
      .put(bwr.bg, clo.q().a())
      .put(bwr.bh, coo.gw().a())
      .put(bwr.bj, cly.q().a())
      .put(bwr.bl, ckc.j().a())
      .put(bwr.bo, coz.m().a())
      .put(bwr.br, ckd.gt().a())
      .put(bwr.bs, cnv.j().a())
      .put(bwr.bt, cpb.t().a())
      .put(bwr.bu, clb.x().a())
      .put(bwr.by, cll.gF().a())
      .put(bwr.bA, civ.j().a())
      .put(bwr.bB, ckg.x().a())
      .put(bwr.bC, cpc.j().a())
      .put(bwr.bD, cqy.gC().a())
      .put(bwr.bE, cpd.m().a())
      .put(bwr.bG, cqp.j().a())
      .put(bwr.bF, bxl.E().a())
      .put(bwr.bI, cpe.m().a())
      .put(bwr.bJ, cne.m().a())
      .put(bwr.bK, cnv.j().a())
      .put(bwr.bM, cmb.gG().a())
      .put(bwr.bN, cpg.j().a())
      .put(bwr.bO, cph.gu().a())
      .put(bwr.bP, cls.q().a())
      .put(bwr.bQ, cph.gu().a())
      .put(bwr.bR, cpj.gA().a())
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
