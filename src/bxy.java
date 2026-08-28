import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bxy {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwb<? extends bwr>, bxw> b = ImmutableMap.builder()
      .put(bwb.c, cjp.j().a())
      .put(bwb.e, cjs.q().a())
      .put(bwb.f, cmc.j().a())
      .put(bwb.h, cjv.gq().a())
      .put(bwb.k, cia.j().a())
      .put(bwb.l, cih.gE().a())
      .put(bwb.o, cms.j().a())
      .put(bwb.q, cmt.gq().a())
      .put(bwb.u, cij.gG().a())
      .put(bwb.t, cka.q().a())
      .put(bwb.v, cmu.j().a())
      .put(bwb.z, cil.q().a())
      .put(bwb.A, cic.j().a())
      .put(bwb.C, cin.q().a())
      .put(bwb.D, coo.m().a())
      .put(bwb.E, cmv.j().a())
      .put(bwb.H, cio.gq().a())
      .put(bwb.I, ckm.q().a())
      .put(bwb.K, cmx.j().a())
      .put(bwb.M, cmy.j().a())
      .put(bwb.N, cmz.j().a())
      .put(bwb.O, cna.j().a())
      .put(bwb.P, clg.m().a())
      .put(bwb.S, cnc.m().a())
      .put(bwb.r, cof.j().a())
      .put(bwb.aa, ciq.q().a())
      .put(bwb.ab, ckd.gq().a())
      .put(bwb.ad, cnd.n().a())
      .put(bwb.ae, cne.j().a())
      .put(bwb.ag, bwi.gq().a())
      .put(bwb.ah, ckj.t().a())
      .put(bwb.ai, cnf.q().a())
      .put(bwb.aj, cor.t().a())
      .put(bwb.al, ckn.gR().a())
      .put(bwb.am, coc.gr().a())
      .put(bwb.an, cnh.m().a())
      .put(bwb.ap, cis.j().a())
      .put(bwb.ax, ckq.gC().a())
      .put(bwb.az, cni.j().a())
      .put(bwb.aE, cin.q().a())
      .put(bwb.aF, ckm.q().a())
      .put(bwb.aI, ciu.q().a())
      .put(bwb.aN, civ.gD().a())
      .put(bwb.aO, ciw.gC().a())
      .put(bwb.aP, cnj.gt().a())
      .put(bwb.aQ, cix.q().a())
      .put(bwb.aR, cox.gu().a())
      .put(bwb.aS, cpa.n().a())
      .put(bwb.aT, cnm.m().a())
      .put(bwb.bR, cqi.fW().a())
      .put(bwb.aU, cja.q().a())
      .put(bwb.aW, cic.j().a())
      .put(bwb.aX, cjc.t().a())
      .put(bwb.aY, cno.j().a())
      .put(bwb.aZ, cic.j().a())
      .put(bwb.ba, cje.q().a())
      .put(bwb.bb, cnp.j().a())
      .put(bwb.bd, cnq.j().a())
      .put(bwb.be, cmr.j().a())
      .put(bwb.bf, ckt.q().a())
      .put(bwb.bg, cnj.gt().a())
      .put(bwb.bi, cla.q().a())
      .put(bwb.bk, cjg.j().a())
      .put(bwb.bn, cnu.m().a())
      .put(bwb.bq, cjh.gq().a())
      .put(bwb.br, cmr.j().a())
      .put(bwb.bs, cnw.t().a())
      .put(bwb.bt, ckg.x().a())
      .put(bwb.bx, ckq.gC().a())
      .put(bwb.bz, cic.j().a())
      .put(bwb.bA, cjk.x().a())
      .put(bwb.bB, cnx.j().a())
      .put(bwb.bC, cpu.gz().a())
      .put(bwb.bD, cny.m().a())
      .put(bwb.bF, cpl.j().a())
      .put(bwb.bE, bwt.E().a())
      .put(bwb.bH, cnz.m().a())
      .put(bwb.bI, cma.m().a())
      .put(bwb.bJ, cmr.j().a())
      .put(bwb.bL, cjm.gD().a())
      .put(bwb.bM, cob.j().a())
      .put(bwb.bN, coc.gr().a())
      .put(bwb.bO, ckx.q().a())
      .put(bwb.bP, coc.gr().a())
      .put(bwb.bQ, coe.gx().a())
      .build();

   public static bxw a(bwb<? extends bwr> $$0) {
      return b.get($$0);
   }

   public static boolean b(bwb<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      md.f.s().filter($$0 -> $$0.f() != bwu.h).filter($$0 -> !b((bwb<?>)$$0)).map(md.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
