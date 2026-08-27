import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bki {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bip<? extends bjb>, bkg> b = ImmutableMap.builder()
      .put(bip.b, bvq.p().a())
      .put(bip.d, bjb.dO().a())
      .put(bip.f, bvt.gh().a())
      .put(bip.g, buh.p().a())
      .put(bip.h, bun.gm().a())
      .put(bip.i, byn.p().a())
      .put(bip.m, bup.gm().a())
      .put(bip.l, bvy.p().a())
      .put(bip.n, byo.p().a())
      .put(bip.q, bur.p().a())
      .put(bip.r, buj.p().a())
      .put(bip.t, but.p().a())
      .put(bip.u, byp.p().a())
      .put(bip.v, buu.ga().a())
      .put(bip.w, bwk.p().a())
      .put(bip.y, bzw.ge().a())
      .put(bip.A, bys.p().a())
      .put(bip.E, byt.p().a())
      .put(bip.F, byu.p().a())
      .put(bip.C, bxc.q().a())
      .put(bip.G, byw.q().a())
      .put(bip.N, buw.p().a())
      .put(bip.O, bwb.ga().a())
      .put(bip.Q, byx.t().a())
      .put(bip.R, byy.p().a())
      .put(bip.T, bit.ga().a())
      .put(bip.U, bwh.q().a())
      .put(bip.V, byz.ga().a())
      .put(bip.W, bzz.p().a())
      .put(bip.Y, bwl.gA().a())
      .put(bip.Z, bzw.ge().a())
      .put(bip.aa, bzb.q().a())
      .put(bip.ac, buy.p().a())
      .put(bip.aj, bwo.gl().a())
      .put(bip.al, bzc.p().a())
      .put(bip.ao, but.p().a())
      .put(bip.ap, bwk.p().a())
      .put(bip.aq, bva.p().a())
      .put(bip.as, bvb.gl().a())
      .put(bip.at, bvc.gg().a())
      .put(bip.au, bzd.gg().a())
      .put(bip.av, bvd.p().a())
      .put(bip.aw, caf.gh().a())
      .put(bip.ax, cai.t().a())
      .put(bip.ay, bzg.q().a())
      .put(bip.bt, cbp.fF().a())
      .put(bip.az, bve.p().a())
      .put(bip.aB, buj.p().a())
      .put(bip.aC, bvg.q().a())
      .put(bip.aD, bzi.p().a())
      .put(bip.aE, buj.p().a())
      .put(bip.aF, bvi.p().a())
      .put(bip.aG, bzj.p().a())
      .put(bip.aI, bzk.p().a())
      .put(bip.aJ, bym.p().a())
      .put(bip.aK, bwr.p().a())
      .put(bip.aL, bzd.gg().a())
      .put(bip.aN, bwy.p().a())
      .put(bip.aO, bvk.p().a())
      .put(bip.aS, bzo.q().a())
      .put(bip.aT, bvl.ga().a())
      .put(bip.aU, bym.p().a())
      .put(bip.aV, bzq.q().a())
      .put(bip.aW, bwe.gc().a())
      .put(bip.ba, bwo.gl().a())
      .put(bip.bc, buj.p().a())
      .put(bip.bd, bvn.t().a())
      .put(bip.be, bzr.p().a())
      .put(bip.bf, cbc.gj().a())
      .put(bip.bg, bzs.q().a())
      .put(bip.bi, cat.p().a())
      .put(bip.bh, bjd.x().a())
      .put(bip.bj, bzt.q().a())
      .put(bip.bk, bxw.q().a())
      .put(bip.bl, bym.p().a())
      .put(bip.bn, bvp.gg().a())
      .put(bip.bo, bzv.p().a())
      .put(bip.bp, bzw.ge().a())
      .put(bip.bq, bwv.p().a())
      .put(bip.br, bzw.ge().a())
      .put(bip.bs, bzy.gk().a())
      .build();

   public static bkg a(bip<? extends bjb> $$0) {
      return b.get($$0);
   }

   public static boolean b(bip<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jd.h.s().filter($$0 -> $$0.f() != bje.h).filter($$0 -> !b((bip<?>)$$0)).map(jd.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
