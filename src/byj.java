import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class byj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwm<? extends bxc>, byh> b = ImmutableMap.builder()
      .put(bwm.c, ckd.j().a())
      .put(bwm.e, ckg.q().a())
      .put(bwm.f, cms.j().a())
      .put(bwm.h, ckj.gq().a())
      .put(bwm.k, cil.j().a())
      .put(bwm.l, cit.gE().a())
      .put(bwm.o, cni.j().a())
      .put(bwm.q, cnj.gq().a())
      .put(bwm.u, civ.gG().a())
      .put(bwm.t, cko.q().a())
      .put(bwm.v, cnk.j().a())
      .put(bwm.z, ciy.q().a())
      .put(bwm.A, cio.j().a())
      .put(bwm.C, cja.q().a())
      .put(bwm.D, cpe.m().a())
      .put(bwm.E, cnl.j().a())
      .put(bwm.H, cjd.gq().a())
      .put(bwm.I, clc.q().a())
      .put(bwm.K, cnn.j().a())
      .put(bwm.M, cno.j().a())
      .put(bwm.N, cnp.j().a())
      .put(bwm.O, cnq.j().a())
      .put(bwm.P, clw.m().a())
      .put(bwm.S, cns.m().a())
      .put(bwm.r, cow.j().a())
      .put(bwm.aa, cjf.q().a())
      .put(bwm.ab, ckr.gq().a())
      .put(bwm.ad, cnt.n().a())
      .put(bwm.ae, cnu.j().a())
      .put(bwm.ag, bwt.gq().a())
      .put(bwm.ah, ckz.t().a())
      .put(bwm.ai, cnv.q().a())
      .put(bwm.aj, cph.t().a())
      .put(bwm.al, cld.gR().a())
      .put(bwm.am, cot.gr().a())
      .put(bwm.an, cnx.m().a())
      .put(bwm.ap, cjg.j().a())
      .put(bwm.ax, clg.gC().a())
      .put(bwm.az, cny.j().a())
      .put(bwm.aE, cja.q().a())
      .put(bwm.aF, clc.q().a())
      .put(bwm.aI, cji.q().a())
      .put(bwm.aN, cjj.gD().a())
      .put(bwm.aO, cjk.gC().a())
      .put(bwm.aP, cnz.gt().a())
      .put(bwm.aQ, cjl.q().a())
      .put(bwm.aR, cpn.gu().a())
      .put(bwm.aS, cpq.n().a())
      .put(bwm.aT, coc.m().a())
      .put(bwm.bS, cqy.fW().a())
      .put(bwm.aU, cjo.q().a())
      .put(bwm.aX, cio.j().a())
      .put(bwm.aY, cjq.t().a())
      .put(bwm.aZ, coe.j().a())
      .put(bwm.ba, cio.j().a())
      .put(bwm.bb, cjs.q().a())
      .put(bwm.bc, cof.j().a())
      .put(bwm.be, cog.j().a())
      .put(bwm.bf, cnh.j().a())
      .put(bwm.bg, clj.q().a())
      .put(bwm.bh, cnz.gt().a())
      .put(bwm.bj, clq.q().a())
      .put(bwm.bl, cju.j().a())
      .put(bwm.bo, cok.m().a())
      .put(bwm.br, cjv.gq().a())
      .put(bwm.bs, cnh.j().a())
      .put(bwm.bt, com.t().a())
      .put(bwm.bu, ckw.x().a())
      .put(bwm.by, clg.gC().a())
      .put(bwm.bA, cio.j().a())
      .put(bwm.bB, cjy.x().a())
      .put(bwm.bC, coo.j().a())
      .put(bwm.bD, cqk.gz().a())
      .put(bwm.bE, cop.m().a())
      .put(bwm.bG, cqb.j().a())
      .put(bwm.bF, bxe.E().a())
      .put(bwm.bI, coq.m().a())
      .put(bwm.bJ, cmq.m().a())
      .put(bwm.bK, cnh.j().a())
      .put(bwm.bM, cka.gD().a())
      .put(bwm.bN, cos.j().a())
      .put(bwm.bO, cot.gr().a())
      .put(bwm.bP, cln.q().a())
      .put(bwm.bQ, cot.gr().a())
      .put(bwm.bR, cov.gx().a())
      .build();

   public static byh a(bwm<? extends bxc> $$0) {
      return b.get($$0);
   }

   public static boolean b(bwm<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mf.f.s().filter($$0 -> $$0.f() != bxf.h).filter($$0 -> !b((bwm<?>)$$0)).map(mf.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
