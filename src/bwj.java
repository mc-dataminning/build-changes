import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwj {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bul<? extends bva>, bwh> b = ImmutableMap.builder()
      .put(bul.a, chx.q().a())
      .put(bul.c, cia.q().a())
      .put(bul.d, ckk.q().a())
      .put(bul.f, cid.gw().a())
      .put(bul.g, cgl.q().a())
      .put(bul.h, cgs.gI().a())
      .put(bul.i, cla.q().a())
      .put(bul.l, clb.gx().a())
      .put(bul.p, cgu.gK().a())
      .put(bul.o, cii.q().a())
      .put(bul.q, clc.q().a())
      .put(bul.t, cgw.q().a())
      .put(bul.u, cgn.q().a())
      .put(bul.w, cgy.q().a())
      .put(bul.x, cld.q().a())
      .put(bul.y, cgz.gu().a())
      .put(bul.z, ciu.q().a())
      .put(bul.B, clf.q().a())
      .put(bul.D, clg.q().a())
      .put(bul.H, clh.q().a())
      .put(bul.I, cli.q().a())
      .put(bul.F, cjo.t().a())
      .put(bul.J, clk.t().a())
      .put(bul.m, cmn.q().a())
      .put(bul.Q, chb.q().a())
      .put(bul.R, cil.gu().a())
      .put(bul.T, cll.y().a())
      .put(bul.U, clm.q().a())
      .put(bul.W, bus.gu().a())
      .put(bul.X, cir.t().a())
      .put(bul.Y, cln.gu().a())
      .put(bul.Z, cmv.q().a())
      .put(bul.ab, civ.gW().a())
      .put(bul.ac, cmk.gx().a())
      .put(bul.ad, clp.t().a())
      .put(bul.af, chd.q().a())
      .put(bul.an, ciy.gG().a())
      .put(bul.ap, clq.q().a())
      .put(bul.as, cgy.q().a())
      .put(bul.at, ciu.q().a())
      .put(bul.au, chf.q().a())
      .put(bul.aw, chg.gH().a())
      .put(bul.ax, chh.gG().a())
      .put(bul.ay, clr.gA().a())
      .put(bul.az, chi.q().a())
      .put(bul.aA, cnb.gB().a())
      .put(bul.aB, cne.y().a())
      .put(bul.aC, clu.t().a())
      .put(bul.by, com.fZ().a())
      .put(bul.aD, chj.q().a())
      .put(bul.aF, cgn.q().a())
      .put(bul.aG, chl.t().a())
      .put(bul.aH, clw.q().a())
      .put(bul.aI, cgn.q().a())
      .put(bul.aJ, chn.q().a())
      .put(bul.aK, clx.q().a())
      .put(bul.aM, cly.q().a())
      .put(bul.aN, ckz.q().a())
      .put(bul.aO, cjb.q().a())
      .put(bul.aP, clr.gA().a())
      .put(bul.aR, cji.q().a())
      .put(bul.aS, chp.q().a())
      .put(bul.aW, cmc.t().a())
      .put(bul.aX, chq.gu().a())
      .put(bul.aY, ckz.q().a())
      .put(bul.aZ, cme.t().a())
      .put(bul.ba, cio.gw().a())
      .put(bul.be, ciy.gG().a())
      .put(bul.bg, cgn.q().a())
      .put(bul.bh, chs.y().a())
      .put(bul.bi, cmf.q().a())
      .put(bul.bj, cny.gD().a())
      .put(bul.bk, cmg.t().a())
      .put(bul.bm, cnp.q().a())
      .put(bul.bl, bvc.E().a())
      .put(bul.bo, cmh.t().a())
      .put(bul.bp, cki.t().a())
      .put(bul.bq, ckz.q().a())
      .put(bul.bs, chu.gI().a())
      .put(bul.bt, cmj.q().a())
      .put(bul.bu, cmk.gx().a())
      .put(bul.bv, cjf.q().a())
      .put(bul.bw, cmk.gx().a())
      .put(bul.bx, cmm.gD().a())
      .build();

   public static bwh a(bul<? extends bva> $$0) {
      return b.get($$0);
   }

   public static boolean b(bul<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ly.f.s().filter($$0 -> $$0.f() != bvd.h).filter($$0 -> !b((bul<?>)$$0)).map(ly.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
