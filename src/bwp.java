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
      .put(bur.h, cij.gr().a())
      .put(bur.k, cgr.m().a())
      .put(bur.l, cgy.gD().a())
      .put(bur.o, clg.m().a())
      .put(bur.q, clh.gr().a())
      .put(bur.u, cha.gF().a())
      .put(bur.t, cio.p().a())
      .put(bur.v, cli.m().a())
      .put(bur.z, chc.p().a())
      .put(bur.A, cgt.m().a())
      .put(bur.C, che.p().a())
      .put(bur.F, clj.m().a())
      .put(bur.I, chf.gp().a())
      .put(bur.J, cja.p().a())
      .put(bur.L, cll.m().a())
      .put(bur.N, clm.m().a())
      .put(bur.O, cln.m().a())
      .put(bur.P, clo.m().a())
      .put(bur.Q, cju.p().a())
      .put(bur.T, clq.p().a())
      .put(bur.r, cmt.m().a())
      .put(bur.ab, chh.p().a())
      .put(bur.ac, cir.gp().a())
      .put(bur.ae, clr.t().a())
      .put(bur.af, cls.m().a())
      .put(bur.ah, buy.gp().a())
      .put(bur.ai, cix.t().a())
      .put(bur.aj, clt.x().a())
      .put(bur.ak, cnf.p().a())
      .put(bur.am, cjb.gR().a())
      .put(bur.an, cmq.gs().a())
      .put(bur.ao, clv.p().a())
      .put(bur.aq, chj.m().a())
      .put(bur.ay, cje.gB().a())
      .put(bur.aA, clw.m().a())
      .put(bur.aF, che.p().a())
      .put(bur.aG, cja.p().a())
      .put(bur.aJ, chl.p().a())
      .put(bur.aO, chm.gC().a())
      .put(bur.aP, chn.gB().a())
      .put(bur.aQ, clx.gu().a())
      .put(bur.aR, cho.p().a())
      .put(bur.aS, cnl.gv().a())
      .put(bur.aT, cno.t().a())
      .put(bur.aU, cma.p().a())
      .put(bur.bS, cox.fX().a())
      .put(bur.aV, chp.p().a())
      .put(bur.aX, cgt.m().a())
      .put(bur.aY, chr.t().a())
      .put(bur.aZ, cmc.m().a())
      .put(bur.ba, cgt.m().a())
      .put(bur.bb, cht.p().a())
      .put(bur.bc, cmd.m().a())
      .put(bur.be, cme.m().a())
      .put(bur.bf, clf.m().a())
      .put(bur.bg, cjh.p().a())
      .put(bur.bh, clx.gu().a())
      .put(bur.bj, cjo.p().a())
      .put(bur.bl, chv.m().a())
      .put(bur.bo, cmi.p().a())
      .put(bur.br, chw.gp().a())
      .put(bur.bs, clf.m().a())
      .put(bur.bt, cmk.t().a())
      .put(bur.bu, ciu.gq().a())
      .put(bur.by, cje.gB().a())
      .put(bur.bA, cgt.m().a())
      .put(bur.bB, chy.x().a())
      .put(bur.bC, cml.m().a())
      .put(bur.bD, coi.gy().a())
      .put(bur.bE, cmm.p().a())
      .put(bur.bG, cnz.m().a())
      .put(bur.bF, bvi.C().a())
      .put(bur.bI, cmn.p().a())
      .put(bur.bJ, cko.p().a())
      .put(bur.bK, clf.m().a())
      .put(bur.bM, cia.gD().a())
      .put(bur.bN, cmp.m().a())
      .put(bur.D, cnb.m().a())
      .put(bur.E, cnb.m().a())
      .put(bur.bO, cmq.gs().a())
      .put(bur.bP, cjl.p().a())
      .put(bur.bQ, cmq.gs().a())
      .put(bur.bR, cms.gy().a())
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
