import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bnc {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blj<? extends blv>, bna> b = ImmutableMap.builder()
      .put(blj.b, bym.u().a())
      .put(blj.d, blv.dQ().a())
      .put(blj.f, byp.gl().a())
      .put(blj.g, bxd.u().a())
      .put(blj.h, bxj.gq().a())
      .put(blj.i, cbj.u().a())
      .put(blj.n, bxl.gq().a())
      .put(blj.m, byu.u().a())
      .put(blj.o, cbk.u().a())
      .put(blj.r, bxn.u().a())
      .put(blj.s, bxf.u().a())
      .put(blj.u, bxp.u().a())
      .put(blj.v, cbl.u().a())
      .put(blj.w, bxq.ge().a())
      .put(blj.x, bzg.u().a())
      .put(blj.z, ccs.gi().a())
      .put(blj.B, cbo.u().a())
      .put(blj.F, cbp.u().a())
      .put(blj.G, cbq.u().a())
      .put(blj.D, bzy.w().a())
      .put(blj.H, cbs.w().a())
      .put(blj.l, ccv.u().a())
      .put(blj.O, bxs.u().a())
      .put(blj.P, byx.ge().a())
      .put(blj.R, cbt.A().a())
      .put(blj.S, cbu.u().a())
      .put(blj.U, bln.ge().a())
      .put(blj.V, bzd.w().a())
      .put(blj.W, cbv.ge().a())
      .put(blj.X, cdb.u().a())
      .put(blj.Z, bzh.gE().a())
      .put(blj.aa, ccs.gi().a())
      .put(blj.ab, cbx.w().a())
      .put(blj.ad, bxu.u().a())
      .put(blj.ak, bzk.gp().a())
      .put(blj.am, cby.u().a())
      .put(blj.ap, bxp.u().a())
      .put(blj.aq, bzg.u().a())
      .put(blj.ar, bxw.u().a())
      .put(blj.at, bxx.gp().a())
      .put(blj.au, bxy.gk().a())
      .put(blj.av, cbz.gk().a())
      .put(blj.aw, bxz.u().a())
      .put(blj.ax, cdh.gl().a())
      .put(blj.ay, cdk.A().a())
      .put(blj.az, ccc.w().a())
      .put(blj.bv, cer.fH().a())
      .put(blj.aA, bya.u().a())
      .put(blj.aC, bxf.u().a())
      .put(blj.aD, byc.w().a())
      .put(blj.aE, cce.u().a())
      .put(blj.aF, bxf.u().a())
      .put(blj.aG, bye.u().a())
      .put(blj.aH, ccf.u().a())
      .put(blj.aJ, ccg.u().a())
      .put(blj.aK, cbi.u().a())
      .put(blj.aL, bzn.u().a())
      .put(blj.aM, cbz.gk().a())
      .put(blj.aO, bzu.u().a())
      .put(blj.aP, byg.u().a())
      .put(blj.aT, cck.w().a())
      .put(blj.aU, byh.ge().a())
      .put(blj.aV, cbi.u().a())
      .put(blj.aW, ccm.w().a())
      .put(blj.aX, bza.gg().a())
      .put(blj.bb, bzk.gp().a())
      .put(blj.bd, bxf.u().a())
      .put(blj.be, byj.A().a())
      .put(blj.bf, ccn.u().a())
      .put(blj.bg, cee.gn().a())
      .put(blj.bh, cco.w().a())
      .put(blj.bj, cdv.u().a())
      .put(blj.bi, blx.C().a())
      .put(blj.bl, ccp.w().a())
      .put(blj.bm, cas.w().a())
      .put(blj.bn, cbi.u().a())
      .put(blj.bp, byl.gk().a())
      .put(blj.bq, ccr.u().a())
      .put(blj.br, ccs.gi().a())
      .put(blj.bs, bzr.u().a())
      .put(blj.bt, ccs.gi().a())
      .put(blj.bu, ccu.go().a())
      .build();

   public static bna a(blj<? extends blv> $$0) {
      return b.get($$0);
   }

   public static boolean b(blj<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kb.g.s().filter($$0 -> $$0.f() != bly.h).filter($$0 -> !b((blj<?>)$$0)).map(kb.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
