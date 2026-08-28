import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwo {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<buq<? extends bvf>, bwm> b = ImmutableMap.builder()
      .put(buq.c, cic.m().a())
      .put(buq.e, cif.p().a())
      .put(buq.f, ckp.m().a())
      .put(buq.h, cii.gr().a())
      .put(buq.k, cgq.m().a())
      .put(buq.l, cgx.gD().a())
      .put(buq.o, clf.m().a())
      .put(buq.q, clg.gr().a())
      .put(buq.u, cgz.gF().a())
      .put(buq.t, cin.p().a())
      .put(buq.v, clh.m().a())
      .put(buq.z, chb.p().a())
      .put(buq.A, cgs.m().a())
      .put(buq.C, chd.p().a())
      .put(buq.D, cna.p().a())
      .put(buq.E, cli.m().a())
      .put(buq.H, che.gp().a())
      .put(buq.I, ciz.p().a())
      .put(buq.K, clk.m().a())
      .put(buq.M, cll.m().a())
      .put(buq.N, clm.m().a())
      .put(buq.O, cln.m().a())
      .put(buq.P, cjt.p().a())
      .put(buq.S, clp.p().a())
      .put(buq.r, cms.m().a())
      .put(buq.aa, chg.p().a())
      .put(buq.ab, ciq.gp().a())
      .put(buq.ad, clq.t().a())
      .put(buq.ae, clr.m().a())
      .put(buq.ag, bux.gp().a())
      .put(buq.ah, ciw.t().a())
      .put(buq.ai, cls.x().a())
      .put(buq.aj, cnd.p().a())
      .put(buq.al, cja.gR().a())
      .put(buq.am, cmp.gs().a())
      .put(buq.an, clu.p().a())
      .put(buq.ap, chi.m().a())
      .put(buq.ax, cjd.gB().a())
      .put(buq.az, clv.m().a())
      .put(buq.aE, chd.p().a())
      .put(buq.aF, ciz.p().a())
      .put(buq.aI, chk.p().a())
      .put(buq.aN, chl.gC().a())
      .put(buq.aO, chm.gB().a())
      .put(buq.aP, clw.gu().a())
      .put(buq.aQ, chn.p().a())
      .put(buq.aR, cnj.gv().a())
      .put(buq.aS, cnm.t().a())
      .put(buq.aT, clz.p().a())
      .put(buq.bR, cov.fX().a())
      .put(buq.aU, cho.p().a())
      .put(buq.aW, cgs.m().a())
      .put(buq.aX, chq.t().a())
      .put(buq.aY, cmb.m().a())
      .put(buq.aZ, cgs.m().a())
      .put(buq.ba, chs.p().a())
      .put(buq.bb, cmc.m().a())
      .put(buq.bd, cmd.m().a())
      .put(buq.be, cle.m().a())
      .put(buq.bf, cjg.p().a())
      .put(buq.bg, clw.gu().a())
      .put(buq.bi, cjn.p().a())
      .put(buq.bk, chu.m().a())
      .put(buq.bn, cmh.p().a())
      .put(buq.bq, chv.gp().a())
      .put(buq.br, cle.m().a())
      .put(buq.bs, cmj.t().a())
      .put(buq.bt, cit.gq().a())
      .put(buq.bx, cjd.gB().a())
      .put(buq.bz, cgs.m().a())
      .put(buq.bA, chx.x().a())
      .put(buq.bB, cmk.m().a())
      .put(buq.bC, cog.gy().a())
      .put(buq.bD, cml.p().a())
      .put(buq.bF, cnx.m().a())
      .put(buq.bE, bvh.C().a())
      .put(buq.bH, cmm.p().a())
      .put(buq.bI, ckn.p().a())
      .put(buq.bJ, cle.m().a())
      .put(buq.bL, chz.gD().a())
      .put(buq.bM, cmo.m().a())
      .put(buq.bN, cmp.gs().a())
      .put(buq.bO, cjk.p().a())
      .put(buq.bP, cmp.gs().a())
      .put(buq.bQ, cmr.gy().a())
      .build();

   public static bwm a(buq<? extends bvf> $$0) {
      return b.get($$0);
   }

   public static boolean b(buq<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mb.f.s().filter($$0 -> $$0.f() != bvi.h).filter($$0 -> !b((buq<?>)$$0)).map(mb.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
