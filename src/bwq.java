import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bus<? extends bvh>, bwo> b = ImmutableMap.builder()
      .put(bus.c, cie.m().a())
      .put(bus.e, cih.p().a())
      .put(bus.f, ckr.m().a())
      .put(bus.h, cik.gu().a())
      .put(bus.k, cgs.m().a())
      .put(bus.l, cgz.gG().a())
      .put(bus.o, clh.m().a())
      .put(bus.q, cli.gu().a())
      .put(bus.u, chb.gI().a())
      .put(bus.t, cip.p().a())
      .put(bus.v, clj.m().a())
      .put(bus.z, chd.p().a())
      .put(bus.A, cgu.m().a())
      .put(bus.C, chf.p().a())
      .put(bus.D, cnc.p().a())
      .put(bus.E, clk.m().a())
      .put(bus.H, chg.gs().a())
      .put(bus.I, cjb.p().a())
      .put(bus.K, clm.m().a())
      .put(bus.M, cln.m().a())
      .put(bus.N, clo.m().a())
      .put(bus.O, clp.m().a())
      .put(bus.P, cjv.p().a())
      .put(bus.S, clr.p().a())
      .put(bus.r, cmu.m().a())
      .put(bus.aa, chi.p().a())
      .put(bus.ab, cis.gs().a())
      .put(bus.ad, cls.t().a())
      .put(bus.ae, clt.m().a())
      .put(bus.ag, buz.gs().a())
      .put(bus.ah, ciy.t().a())
      .put(bus.ai, clu.x().a())
      .put(bus.aj, cnf.p().a())
      .put(bus.al, cjc.gU().a())
      .put(bus.am, cmr.gv().a())
      .put(bus.an, clw.p().a())
      .put(bus.ap, chk.m().a())
      .put(bus.ax, cjf.gE().a())
      .put(bus.az, clx.m().a())
      .put(bus.aE, chf.p().a())
      .put(bus.aF, cjb.p().a())
      .put(bus.aI, chm.p().a())
      .put(bus.aN, chn.gF().a())
      .put(bus.aO, cho.gE().a())
      .put(bus.aP, cly.gx().a())
      .put(bus.aQ, chp.p().a())
      .put(bus.aR, cnl.gy().a())
      .put(bus.aS, cno.t().a())
      .put(bus.aT, cmb.p().a())
      .put(bus.bR, cox.fX().a())
      .put(bus.aU, chq.p().a())
      .put(bus.aW, cgu.m().a())
      .put(bus.aX, chs.t().a())
      .put(bus.aY, cmd.m().a())
      .put(bus.aZ, cgu.m().a())
      .put(bus.ba, chu.p().a())
      .put(bus.bb, cme.m().a())
      .put(bus.bd, cmf.m().a())
      .put(bus.be, clg.m().a())
      .put(bus.bf, cji.p().a())
      .put(bus.bg, cly.gx().a())
      .put(bus.bi, cjp.p().a())
      .put(bus.bk, chw.m().a())
      .put(bus.bn, cmj.p().a())
      .put(bus.bq, chx.gs().a())
      .put(bus.br, clg.m().a())
      .put(bus.bs, cml.t().a())
      .put(bus.bt, civ.gt().a())
      .put(bus.bx, cjf.gE().a())
      .put(bus.bz, cgu.m().a())
      .put(bus.bA, chz.x().a())
      .put(bus.bB, cmm.m().a())
      .put(bus.bC, coi.gB().a())
      .put(bus.bD, cmn.p().a())
      .put(bus.bF, cnz.m().a())
      .put(bus.bE, bvj.F().a())
      .put(bus.bH, cmo.p().a())
      .put(bus.bI, ckp.p().a())
      .put(bus.bJ, clg.m().a())
      .put(bus.bL, cib.gG().a())
      .put(bus.bM, cmq.m().a())
      .put(bus.bN, cmr.gv().a())
      .put(bus.bO, cjm.p().a())
      .put(bus.bP, cmr.gv().a())
      .put(bus.bQ, cmt.gB().a())
      .build();

   public static bwo a(bus<? extends bvh> $$0) {
      return b.get($$0);
   }

   public static boolean b(bus<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mb.f.s().filter($$0 -> $$0.f() != bvk.h).filter($$0 -> !b((bus<?>)$$0)).map(mb.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
