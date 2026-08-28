import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bur<? extends bvg>, bwn> b = ImmutableMap.builder()
      .put(bur.c, cid.m().a())
      .put(bur.e, cig.p().a())
      .put(bur.f, ckq.m().a())
      .put(bur.h, cij.gu().a())
      .put(bur.k, cgr.m().a())
      .put(bur.l, cgy.gG().a())
      .put(bur.o, clg.m().a())
      .put(bur.q, clh.gu().a())
      .put(bur.u, cha.gI().a())
      .put(bur.t, cio.p().a())
      .put(bur.v, cli.m().a())
      .put(bur.z, chc.p().a())
      .put(bur.A, cgt.m().a())
      .put(bur.C, che.p().a())
      .put(bur.D, cnb.p().a())
      .put(bur.E, clj.m().a())
      .put(bur.H, chf.gs().a())
      .put(bur.I, cja.p().a())
      .put(bur.K, cll.m().a())
      .put(bur.M, clm.m().a())
      .put(bur.N, cln.m().a())
      .put(bur.O, clo.m().a())
      .put(bur.P, cju.p().a())
      .put(bur.S, clq.p().a())
      .put(bur.r, cmt.m().a())
      .put(bur.aa, chh.p().a())
      .put(bur.ab, cir.gs().a())
      .put(bur.ad, clr.t().a())
      .put(bur.ae, cls.m().a())
      .put(bur.ag, buy.gs().a())
      .put(bur.ah, cix.t().a())
      .put(bur.ai, clt.x().a())
      .put(bur.aj, cne.p().a())
      .put(bur.al, cjb.gU().a())
      .put(bur.am, cmq.gv().a())
      .put(bur.an, clv.p().a())
      .put(bur.ap, chj.m().a())
      .put(bur.ax, cje.gE().a())
      .put(bur.az, clw.m().a())
      .put(bur.aE, che.p().a())
      .put(bur.aF, cja.p().a())
      .put(bur.aI, chl.p().a())
      .put(bur.aN, chm.gF().a())
      .put(bur.aO, chn.gE().a())
      .put(bur.aP, clx.gx().a())
      .put(bur.aQ, cho.p().a())
      .put(bur.aR, cnk.gy().a())
      .put(bur.aS, cnn.t().a())
      .put(bur.aT, cma.p().a())
      .put(bur.bR, cow.fX().a())
      .put(bur.aU, chp.p().a())
      .put(bur.aW, cgt.m().a())
      .put(bur.aX, chr.t().a())
      .put(bur.aY, cmc.m().a())
      .put(bur.aZ, cgt.m().a())
      .put(bur.ba, cht.p().a())
      .put(bur.bb, cmd.m().a())
      .put(bur.bd, cme.m().a())
      .put(bur.be, clf.m().a())
      .put(bur.bf, cjh.p().a())
      .put(bur.bg, clx.gx().a())
      .put(bur.bi, cjo.p().a())
      .put(bur.bk, chv.m().a())
      .put(bur.bn, cmi.p().a())
      .put(bur.bq, chw.gs().a())
      .put(bur.br, clf.m().a())
      .put(bur.bs, cmk.t().a())
      .put(bur.bt, ciu.gt().a())
      .put(bur.bx, cje.gE().a())
      .put(bur.bz, cgt.m().a())
      .put(bur.bA, chy.x().a())
      .put(bur.bB, cml.m().a())
      .put(bur.bC, coh.gB().a())
      .put(bur.bD, cmm.p().a())
      .put(bur.bF, cny.m().a())
      .put(bur.bE, bvi.F().a())
      .put(bur.bH, cmn.p().a())
      .put(bur.bI, cko.p().a())
      .put(bur.bJ, clf.m().a())
      .put(bur.bL, cia.gG().a())
      .put(bur.bM, cmp.m().a())
      .put(bur.bN, cmq.gv().a())
      .put(bur.bO, cjl.p().a())
      .put(bur.bP, cmq.gv().a())
      .put(bur.bQ, cms.gB().a())
      .build();

   public static bwn a(bur<? extends bvg> $$0) {
      return b.get($$0);
   }

   public static boolean b(bur<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mb.f.s().filter($$0 -> $$0.f() != bvj.h).filter($$0 -> !b((bur<?>)$$0)).map(mb.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
