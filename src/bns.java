import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bns {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blz<? extends bml>, bnq> b = ImmutableMap.builder()
      .put(blz.b, bzc.u().a())
      .put(blz.d, bml.dQ().a())
      .put(blz.f, bzf.gl().a())
      .put(blz.g, bxt.u().a())
      .put(blz.h, bxz.gq().a())
      .put(blz.i, cbz.u().a())
      .put(blz.n, byb.gq().a())
      .put(blz.m, bzk.u().a())
      .put(blz.o, cca.u().a())
      .put(blz.r, byd.u().a())
      .put(blz.s, bxv.u().a())
      .put(blz.u, byf.u().a())
      .put(blz.v, ccb.u().a())
      .put(blz.w, byg.ge().a())
      .put(blz.x, bzw.u().a())
      .put(blz.z, cdi.gi().a())
      .put(blz.B, cce.u().a())
      .put(blz.F, ccf.u().a())
      .put(blz.G, ccg.u().a())
      .put(blz.D, cao.w().a())
      .put(blz.H, cci.w().a())
      .put(blz.l, cdl.u().a())
      .put(blz.O, byi.u().a())
      .put(blz.P, bzn.ge().a())
      .put(blz.R, ccj.A().a())
      .put(blz.S, cck.u().a())
      .put(blz.U, bmd.ge().a())
      .put(blz.V, bzt.w().a())
      .put(blz.W, ccl.ge().a())
      .put(blz.X, cds.u().a())
      .put(blz.Z, bzx.gE().a())
      .put(blz.aa, cdi.gi().a())
      .put(blz.ab, ccn.w().a())
      .put(blz.ad, byk.u().a())
      .put(blz.ak, caa.gp().a())
      .put(blz.am, cco.u().a())
      .put(blz.ap, byf.u().a())
      .put(blz.aq, bzw.u().a())
      .put(blz.ar, bym.u().a())
      .put(blz.at, byn.gp().a())
      .put(blz.au, byo.gk().a())
      .put(blz.av, ccp.gk().a())
      .put(blz.aw, byp.u().a())
      .put(blz.ax, cdy.gl().a())
      .put(blz.ay, ceb.A().a())
      .put(blz.az, ccs.w().a())
      .put(blz.bv, cfi.fH().a())
      .put(blz.aA, byq.u().a())
      .put(blz.aC, bxv.u().a())
      .put(blz.aD, bys.w().a())
      .put(blz.aE, ccu.u().a())
      .put(blz.aF, bxv.u().a())
      .put(blz.aG, byu.u().a())
      .put(blz.aH, ccv.u().a())
      .put(blz.aJ, ccw.u().a())
      .put(blz.aK, cby.u().a())
      .put(blz.aL, cad.u().a())
      .put(blz.aM, ccp.gk().a())
      .put(blz.aO, cak.u().a())
      .put(blz.aP, byw.u().a())
      .put(blz.aT, cda.w().a())
      .put(blz.aU, byx.ge().a())
      .put(blz.aV, cby.u().a())
      .put(blz.aW, cdc.w().a())
      .put(blz.aX, bzq.gg().a())
      .put(blz.bb, caa.gp().a())
      .put(blz.bd, bxv.u().a())
      .put(blz.be, byz.A().a())
      .put(blz.bf, cdd.u().a())
      .put(blz.bg, cev.gn().a())
      .put(blz.bh, cde.w().a())
      .put(blz.bj, cem.u().a())
      .put(blz.bi, bmn.C().a())
      .put(blz.bl, cdf.w().a())
      .put(blz.bm, cbi.w().a())
      .put(blz.bn, cby.u().a())
      .put(blz.bp, bzb.gk().a())
      .put(blz.bq, cdh.u().a())
      .put(blz.br, cdi.gi().a())
      .put(blz.bs, cah.u().a())
      .put(blz.bt, cdi.gi().a())
      .put(blz.bu, cdk.go().a())
      .build();

   public static bnq a(blz<? extends bml> $$0) {
      return b.get($$0);
   }

   public static boolean b(blz<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kd.g.s().filter($$0 -> $$0.f() != bmo.h).filter($$0 -> !b((blz<?>)$$0)).map(kd.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
