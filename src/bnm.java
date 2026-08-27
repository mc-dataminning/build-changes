import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bnm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<blt<? extends bmf>, bnk> b = ImmutableMap.builder()
      .put(blt.b, byw.u().a())
      .put(blt.d, bmf.dQ().a())
      .put(blt.f, byz.gl().a())
      .put(blt.g, bxn.u().a())
      .put(blt.h, bxt.gq().a())
      .put(blt.i, cbt.u().a())
      .put(blt.n, bxv.gq().a())
      .put(blt.m, bze.u().a())
      .put(blt.o, cbu.u().a())
      .put(blt.r, bxx.u().a())
      .put(blt.s, bxp.u().a())
      .put(blt.u, bxz.u().a())
      .put(blt.v, cbv.u().a())
      .put(blt.w, bya.ge().a())
      .put(blt.x, bzq.u().a())
      .put(blt.z, cdc.gi().a())
      .put(blt.B, cby.u().a())
      .put(blt.F, cbz.u().a())
      .put(blt.G, cca.u().a())
      .put(blt.D, cai.w().a())
      .put(blt.H, ccc.w().a())
      .put(blt.l, cdf.u().a())
      .put(blt.O, byc.u().a())
      .put(blt.P, bzh.ge().a())
      .put(blt.R, ccd.A().a())
      .put(blt.S, cce.u().a())
      .put(blt.U, blx.ge().a())
      .put(blt.V, bzn.w().a())
      .put(blt.W, ccf.ge().a())
      .put(blt.X, cdl.u().a())
      .put(blt.Z, bzr.gE().a())
      .put(blt.aa, cdc.gi().a())
      .put(blt.ab, cch.w().a())
      .put(blt.ad, bye.u().a())
      .put(blt.ak, bzu.gp().a())
      .put(blt.am, cci.u().a())
      .put(blt.ap, bxz.u().a())
      .put(blt.aq, bzq.u().a())
      .put(blt.ar, byg.u().a())
      .put(blt.at, byh.gp().a())
      .put(blt.au, byi.gk().a())
      .put(blt.av, ccj.gk().a())
      .put(blt.aw, byj.u().a())
      .put(blt.ax, cdr.gl().a())
      .put(blt.ay, cdu.A().a())
      .put(blt.az, ccm.w().a())
      .put(blt.bv, cfb.fH().a())
      .put(blt.aA, byk.u().a())
      .put(blt.aC, bxp.u().a())
      .put(blt.aD, bym.w().a())
      .put(blt.aE, cco.u().a())
      .put(blt.aF, bxp.u().a())
      .put(blt.aG, byo.u().a())
      .put(blt.aH, ccp.u().a())
      .put(blt.aJ, ccq.u().a())
      .put(blt.aK, cbs.u().a())
      .put(blt.aL, bzx.u().a())
      .put(blt.aM, ccj.gk().a())
      .put(blt.aO, cae.u().a())
      .put(blt.aP, byq.u().a())
      .put(blt.aT, ccu.w().a())
      .put(blt.aU, byr.ge().a())
      .put(blt.aV, cbs.u().a())
      .put(blt.aW, ccw.w().a())
      .put(blt.aX, bzk.gg().a())
      .put(blt.bb, bzu.gp().a())
      .put(blt.bd, bxp.u().a())
      .put(blt.be, byt.A().a())
      .put(blt.bf, ccx.u().a())
      .put(blt.bg, ceo.gn().a())
      .put(blt.bh, ccy.w().a())
      .put(blt.bj, cef.u().a())
      .put(blt.bi, bmh.C().a())
      .put(blt.bl, ccz.w().a())
      .put(blt.bm, cbc.w().a())
      .put(blt.bn, cbs.u().a())
      .put(blt.bp, byv.gk().a())
      .put(blt.bq, cdb.u().a())
      .put(blt.br, cdc.gi().a())
      .put(blt.bs, cab.u().a())
      .put(blt.bt, cdc.gi().a())
      .put(blt.bu, cde.go().a())
      .build();

   public static bnk a(blt<? extends bmf> $$0) {
      return b.get($$0);
   }

   public static boolean b(blt<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kd.g.s().filter($$0 -> $$0.f() != bmi.h).filter($$0 -> !b((blt<?>)$$0)).map(kd.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
