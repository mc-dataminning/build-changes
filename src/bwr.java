import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<but<? extends bvi>, bwp> b = ImmutableMap.builder()
      .put(but.c, cif.m().a())
      .put(but.e, cii.p().a())
      .put(but.f, cks.m().a())
      .put(but.h, cil.gu().a())
      .put(but.k, cgt.m().a())
      .put(but.l, cha.gG().a())
      .put(but.o, cli.m().a())
      .put(but.q, clj.gu().a())
      .put(but.u, chc.gI().a())
      .put(but.t, ciq.p().a())
      .put(but.v, clk.m().a())
      .put(but.z, che.p().a())
      .put(but.A, cgv.m().a())
      .put(but.C, chg.p().a())
      .put(but.D, cnd.p().a())
      .put(but.E, cll.m().a())
      .put(but.H, chh.gs().a())
      .put(but.I, cjc.p().a())
      .put(but.K, cln.m().a())
      .put(but.M, clo.m().a())
      .put(but.N, clp.m().a())
      .put(but.O, clq.m().a())
      .put(but.P, cjw.p().a())
      .put(but.S, cls.p().a())
      .put(but.r, cmv.m().a())
      .put(but.aa, chj.p().a())
      .put(but.ab, cit.gs().a())
      .put(but.ad, clt.t().a())
      .put(but.ae, clu.m().a())
      .put(but.ag, bva.gs().a())
      .put(but.ah, ciz.t().a())
      .put(but.ai, clv.x().a())
      .put(but.aj, cng.p().a())
      .put(but.al, cjd.gU().a())
      .put(but.am, cms.gv().a())
      .put(but.an, clx.p().a())
      .put(but.ap, chl.m().a())
      .put(but.ax, cjg.gE().a())
      .put(but.az, cly.m().a())
      .put(but.aE, chg.p().a())
      .put(but.aF, cjc.p().a())
      .put(but.aI, chn.p().a())
      .put(but.aN, cho.gF().a())
      .put(but.aO, chp.gE().a())
      .put(but.aP, clz.gx().a())
      .put(but.aQ, chq.p().a())
      .put(but.aR, cnm.gy().a())
      .put(but.aS, cnp.t().a())
      .put(but.aT, cmc.p().a())
      .put(but.bR, coy.fX().a())
      .put(but.aU, chr.p().a())
      .put(but.aW, cgv.m().a())
      .put(but.aX, cht.t().a())
      .put(but.aY, cme.m().a())
      .put(but.aZ, cgv.m().a())
      .put(but.ba, chv.p().a())
      .put(but.bb, cmf.m().a())
      .put(but.bd, cmg.m().a())
      .put(but.be, clh.m().a())
      .put(but.bf, cjj.p().a())
      .put(but.bg, clz.gx().a())
      .put(but.bi, cjq.p().a())
      .put(but.bk, chx.m().a())
      .put(but.bn, cmk.p().a())
      .put(but.bq, chy.gs().a())
      .put(but.br, clh.m().a())
      .put(but.bs, cmm.t().a())
      .put(but.bt, ciw.gt().a())
      .put(but.bx, cjg.gE().a())
      .put(but.bz, cgv.m().a())
      .put(but.bA, cia.x().a())
      .put(but.bB, cmn.m().a())
      .put(but.bC, coj.gB().a())
      .put(but.bD, cmo.p().a())
      .put(but.bF, coa.m().a())
      .put(but.bE, bvk.F().a())
      .put(but.bH, cmp.p().a())
      .put(but.bI, ckq.p().a())
      .put(but.bJ, clh.m().a())
      .put(but.bL, cic.gG().a())
      .put(but.bM, cmr.m().a())
      .put(but.bN, cms.gv().a())
      .put(but.bO, cjn.p().a())
      .put(but.bP, cms.gv().a())
      .put(but.bQ, cmu.gB().a())
      .build();

   public static bwp a(but<? extends bvi> $$0) {
      return b.get($$0);
   }

   public static boolean b(but<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mb.f.s().filter($$0 -> $$0.f() != bvl.h).filter($$0 -> !b((but<?>)$$0)).map(mb.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
