import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bmf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bkm<? extends bky>, bmd> b = ImmutableMap.builder()
      .put(bkm.b, bxn.s().a())
      .put(bkm.d, bky.dP().a())
      .put(bkm.f, bxq.gl().a())
      .put(bkm.g, bwe.s().a())
      .put(bkm.h, bwk.gq().a())
      .put(bkm.i, cak.s().a())
      .put(bkm.m, bwm.gq().a())
      .put(bkm.l, bxv.s().a())
      .put(bkm.n, cal.s().a())
      .put(bkm.q, bwo.s().a())
      .put(bkm.r, bwg.s().a())
      .put(bkm.t, bwq.s().a())
      .put(bkm.u, cam.s().a())
      .put(bkm.v, bwr.ge().a())
      .put(bkm.w, byh.s().a())
      .put(bkm.y, cbt.gi().a())
      .put(bkm.A, cap.s().a())
      .put(bkm.E, caq.s().a())
      .put(bkm.F, car.s().a())
      .put(bkm.C, byz.t().a())
      .put(bkm.G, cat.t().a())
      .put(bkm.N, bwt.s().a())
      .put(bkm.O, bxy.ge().a())
      .put(bkm.Q, cau.y().a())
      .put(bkm.R, cav.s().a())
      .put(bkm.T, bkq.ge().a())
      .put(bkm.U, bye.t().a())
      .put(bkm.V, caw.ge().a())
      .put(bkm.W, cbw.s().a())
      .put(bkm.Y, byi.gE().a())
      .put(bkm.Z, cbt.gi().a())
      .put(bkm.aa, cay.t().a())
      .put(bkm.ac, bwv.s().a())
      .put(bkm.aj, byl.gp().a())
      .put(bkm.al, caz.s().a())
      .put(bkm.ao, bwq.s().a())
      .put(bkm.ap, byh.s().a())
      .put(bkm.aq, bwx.s().a())
      .put(bkm.as, bwy.gp().a())
      .put(bkm.at, bwz.gk().a())
      .put(bkm.au, cba.gk().a())
      .put(bkm.av, bxa.s().a())
      .put(bkm.aw, ccc.gl().a())
      .put(bkm.ax, ccf.y().a())
      .put(bkm.ay, cbd.t().a())
      .put(bkm.bt, cdm.fH().a())
      .put(bkm.az, bxb.s().a())
      .put(bkm.aB, bwg.s().a())
      .put(bkm.aC, bxd.t().a())
      .put(bkm.aD, cbf.s().a())
      .put(bkm.aE, bwg.s().a())
      .put(bkm.aF, bxf.s().a())
      .put(bkm.aG, cbg.s().a())
      .put(bkm.aI, cbh.s().a())
      .put(bkm.aJ, caj.s().a())
      .put(bkm.aK, byo.s().a())
      .put(bkm.aL, cba.gk().a())
      .put(bkm.aN, byv.s().a())
      .put(bkm.aO, bxh.s().a())
      .put(bkm.aS, cbl.t().a())
      .put(bkm.aT, bxi.ge().a())
      .put(bkm.aU, caj.s().a())
      .put(bkm.aV, cbn.t().a())
      .put(bkm.aW, byb.gg().a())
      .put(bkm.ba, byl.gp().a())
      .put(bkm.bc, bwg.s().a())
      .put(bkm.bd, bxk.y().a())
      .put(bkm.be, cbo.s().a())
      .put(bkm.bf, ccz.gn().a())
      .put(bkm.bg, cbp.t().a())
      .put(bkm.bi, ccq.s().a())
      .put(bkm.bh, bla.A().a())
      .put(bkm.bj, cbq.t().a())
      .put(bkm.bk, bzt.t().a())
      .put(bkm.bl, caj.s().a())
      .put(bkm.bn, bxm.gk().a())
      .put(bkm.bo, cbs.s().a())
      .put(bkm.bp, cbt.gi().a())
      .put(bkm.bq, bys.s().a())
      .put(bkm.br, cbt.gi().a())
      .put(bkm.bs, cbv.go().a())
      .build();

   public static bmd a(bkm<? extends bky> $$0) {
      return b.get($$0);
   }

   public static boolean b(bkm<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jy.h.s().filter($$0 -> $$0.f() != blb.h).filter($$0 -> !b((bkm<?>)$$0)).map(jy.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
