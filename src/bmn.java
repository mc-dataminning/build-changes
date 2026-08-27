import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bmn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bku<? extends blg>, bml> b = ImmutableMap.builder()
      .put(bku.b, bxv.u().a())
      .put(bku.d, blg.dR().a())
      .put(bku.f, bxy.gm().a())
      .put(bku.g, bwm.u().a())
      .put(bku.h, bws.gr().a())
      .put(bku.i, cas.u().a())
      .put(bku.m, bwu.gr().a())
      .put(bku.l, byd.u().a())
      .put(bku.n, cat.u().a())
      .put(bku.q, bww.u().a())
      .put(bku.r, bwo.u().a())
      .put(bku.t, bwy.u().a())
      .put(bku.u, cau.u().a())
      .put(bku.v, bwz.gf().a())
      .put(bku.w, byp.u().a())
      .put(bku.y, ccb.gj().a())
      .put(bku.A, cax.u().a())
      .put(bku.E, cay.u().a())
      .put(bku.F, caz.u().a())
      .put(bku.C, bzh.w().a())
      .put(bku.G, cbb.w().a())
      .put(bku.N, bxb.u().a())
      .put(bku.O, byg.gf().a())
      .put(bku.Q, cbc.A().a())
      .put(bku.R, cbd.u().a())
      .put(bku.T, bky.gf().a())
      .put(bku.U, bym.w().a())
      .put(bku.V, cbe.gf().a())
      .put(bku.W, cce.u().a())
      .put(bku.Y, byq.gF().a())
      .put(bku.Z, ccb.gj().a())
      .put(bku.aa, cbg.w().a())
      .put(bku.ac, bxd.u().a())
      .put(bku.aj, byt.gq().a())
      .put(bku.al, cbh.u().a())
      .put(bku.ao, bwy.u().a())
      .put(bku.ap, byp.u().a())
      .put(bku.aq, bxf.u().a())
      .put(bku.as, bxg.gq().a())
      .put(bku.at, bxh.gl().a())
      .put(bku.au, cbi.gl().a())
      .put(bku.av, bxi.u().a())
      .put(bku.aw, cck.gm().a())
      .put(bku.ax, ccn.A().a())
      .put(bku.ay, cbl.w().a())
      .put(bku.bt, cdu.fI().a())
      .put(bku.az, bxj.u().a())
      .put(bku.aB, bwo.u().a())
      .put(bku.aC, bxl.w().a())
      .put(bku.aD, cbn.u().a())
      .put(bku.aE, bwo.u().a())
      .put(bku.aF, bxn.u().a())
      .put(bku.aG, cbo.u().a())
      .put(bku.aI, cbp.u().a())
      .put(bku.aJ, car.u().a())
      .put(bku.aK, byw.u().a())
      .put(bku.aL, cbi.gl().a())
      .put(bku.aN, bzd.u().a())
      .put(bku.aO, bxp.u().a())
      .put(bku.aS, cbt.w().a())
      .put(bku.aT, bxq.gf().a())
      .put(bku.aU, car.u().a())
      .put(bku.aV, cbv.w().a())
      .put(bku.aW, byj.gh().a())
      .put(bku.ba, byt.gq().a())
      .put(bku.bc, bwo.u().a())
      .put(bku.bd, bxs.A().a())
      .put(bku.be, cbw.u().a())
      .put(bku.bf, cdh.go().a())
      .put(bku.bg, cbx.w().a())
      .put(bku.bi, ccy.u().a())
      .put(bku.bh, bli.C().a())
      .put(bku.bj, cby.w().a())
      .put(bku.bk, cab.w().a())
      .put(bku.bl, car.u().a())
      .put(bku.bn, bxu.gl().a())
      .put(bku.bo, cca.u().a())
      .put(bku.bp, ccb.gj().a())
      .put(bku.bq, bza.u().a())
      .put(bku.br, ccb.gj().a())
      .put(bku.bs, ccd.gp().a())
      .build();

   public static bml a(bku<? extends blg> $$0) {
      return b.get($$0);
   }

   public static boolean b(bku<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jy.h.s().filter($$0 -> $$0.f() != blj.h).filter($$0 -> !b((bku<?>)$$0)).map(jy.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
