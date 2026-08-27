import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bnr {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bly<? extends bmk>, bnp> b = ImmutableMap.builder()
      .put(bly.b, bzb.u().a())
      .put(bly.d, bmk.dQ().a())
      .put(bly.f, bze.gl().a())
      .put(bly.g, bxs.u().a())
      .put(bly.h, bxy.gq().a())
      .put(bly.i, cby.u().a())
      .put(bly.n, bya.gq().a())
      .put(bly.m, bzj.u().a())
      .put(bly.o, cbz.u().a())
      .put(bly.r, byc.u().a())
      .put(bly.s, bxu.u().a())
      .put(bly.u, bye.u().a())
      .put(bly.v, cca.u().a())
      .put(bly.w, byf.ge().a())
      .put(bly.x, bzv.u().a())
      .put(bly.z, cdh.gi().a())
      .put(bly.B, ccd.u().a())
      .put(bly.F, cce.u().a())
      .put(bly.G, ccf.u().a())
      .put(bly.D, can.w().a())
      .put(bly.H, cch.w().a())
      .put(bly.l, cdk.u().a())
      .put(bly.O, byh.u().a())
      .put(bly.P, bzm.ge().a())
      .put(bly.R, cci.A().a())
      .put(bly.S, ccj.u().a())
      .put(bly.U, bmc.ge().a())
      .put(bly.V, bzs.w().a())
      .put(bly.W, cck.ge().a())
      .put(bly.X, cdr.u().a())
      .put(bly.Z, bzw.gE().a())
      .put(bly.aa, cdh.gi().a())
      .put(bly.ab, ccm.w().a())
      .put(bly.ad, byj.u().a())
      .put(bly.ak, bzz.gp().a())
      .put(bly.am, ccn.u().a())
      .put(bly.ap, bye.u().a())
      .put(bly.aq, bzv.u().a())
      .put(bly.ar, byl.u().a())
      .put(bly.at, bym.gp().a())
      .put(bly.au, byn.gk().a())
      .put(bly.av, cco.gk().a())
      .put(bly.aw, byo.u().a())
      .put(bly.ax, cdx.gl().a())
      .put(bly.ay, cea.A().a())
      .put(bly.az, ccr.w().a())
      .put(bly.bv, cfh.fH().a())
      .put(bly.aA, byp.u().a())
      .put(bly.aC, bxu.u().a())
      .put(bly.aD, byr.w().a())
      .put(bly.aE, cct.u().a())
      .put(bly.aF, bxu.u().a())
      .put(bly.aG, byt.u().a())
      .put(bly.aH, ccu.u().a())
      .put(bly.aJ, ccv.u().a())
      .put(bly.aK, cbx.u().a())
      .put(bly.aL, cac.u().a())
      .put(bly.aM, cco.gk().a())
      .put(bly.aO, caj.u().a())
      .put(bly.aP, byv.u().a())
      .put(bly.aT, ccz.w().a())
      .put(bly.aU, byw.ge().a())
      .put(bly.aV, cbx.u().a())
      .put(bly.aW, cdb.w().a())
      .put(bly.aX, bzp.gg().a())
      .put(bly.bb, bzz.gp().a())
      .put(bly.bd, bxu.u().a())
      .put(bly.be, byy.A().a())
      .put(bly.bf, cdc.u().a())
      .put(bly.bg, ceu.gn().a())
      .put(bly.bh, cdd.w().a())
      .put(bly.bj, cel.u().a())
      .put(bly.bi, bmm.C().a())
      .put(bly.bl, cde.w().a())
      .put(bly.bm, cbh.w().a())
      .put(bly.bn, cbx.u().a())
      .put(bly.bp, bza.gk().a())
      .put(bly.bq, cdg.u().a())
      .put(bly.br, cdh.gi().a())
      .put(bly.bs, cag.u().a())
      .put(bly.bt, cdh.gi().a())
      .put(bly.bu, cdj.go().a())
      .build();

   public static bnp a(bly<? extends bmk> $$0) {
      return b.get($$0);
   }

   public static boolean b(bly<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kd.g.s().filter($$0 -> $$0.f() != bmn.h).filter($$0 -> !b((bly<?>)$$0)).map(kd.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
