import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class blq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bjx<? extends bkj>, blo> b = ImmutableMap.builder()
      .put(bjx.b, bwy.s().a())
      .put(bjx.d, bkj.dP().a())
      .put(bjx.f, bxb.gl().a())
      .put(bjx.g, bvp.s().a())
      .put(bjx.h, bvv.gq().a())
      .put(bjx.i, bzv.s().a())
      .put(bjx.m, bvx.gq().a())
      .put(bjx.l, bxg.s().a())
      .put(bjx.n, bzw.s().a())
      .put(bjx.q, bvz.s().a())
      .put(bjx.r, bvr.s().a())
      .put(bjx.t, bwb.s().a())
      .put(bjx.u, bzx.s().a())
      .put(bjx.v, bwc.ge().a())
      .put(bjx.w, bxs.s().a())
      .put(bjx.y, cbe.gi().a())
      .put(bjx.A, caa.s().a())
      .put(bjx.E, cab.s().a())
      .put(bjx.F, cac.s().a())
      .put(bjx.C, byk.t().a())
      .put(bjx.G, cae.t().a())
      .put(bjx.N, bwe.s().a())
      .put(bjx.O, bxj.ge().a())
      .put(bjx.Q, caf.y().a())
      .put(bjx.R, cag.s().a())
      .put(bjx.T, bkb.ge().a())
      .put(bjx.U, bxp.t().a())
      .put(bjx.V, cah.ge().a())
      .put(bjx.W, cbh.s().a())
      .put(bjx.Y, bxt.gE().a())
      .put(bjx.Z, cbe.gi().a())
      .put(bjx.aa, caj.t().a())
      .put(bjx.ac, bwg.s().a())
      .put(bjx.aj, bxw.gp().a())
      .put(bjx.al, cak.s().a())
      .put(bjx.ao, bwb.s().a())
      .put(bjx.ap, bxs.s().a())
      .put(bjx.aq, bwi.s().a())
      .put(bjx.as, bwj.gp().a())
      .put(bjx.at, bwk.gk().a())
      .put(bjx.au, cal.gk().a())
      .put(bjx.av, bwl.s().a())
      .put(bjx.aw, cbn.gl().a())
      .put(bjx.ax, cbq.y().a())
      .put(bjx.ay, cao.t().a())
      .put(bjx.bt, ccx.fH().a())
      .put(bjx.az, bwm.s().a())
      .put(bjx.aB, bvr.s().a())
      .put(bjx.aC, bwo.t().a())
      .put(bjx.aD, caq.s().a())
      .put(bjx.aE, bvr.s().a())
      .put(bjx.aF, bwq.s().a())
      .put(bjx.aG, car.s().a())
      .put(bjx.aI, cas.s().a())
      .put(bjx.aJ, bzu.s().a())
      .put(bjx.aK, bxz.s().a())
      .put(bjx.aL, cal.gk().a())
      .put(bjx.aN, byg.s().a())
      .put(bjx.aO, bws.s().a())
      .put(bjx.aS, caw.t().a())
      .put(bjx.aT, bwt.ge().a())
      .put(bjx.aU, bzu.s().a())
      .put(bjx.aV, cay.t().a())
      .put(bjx.aW, bxm.gg().a())
      .put(bjx.ba, bxw.gp().a())
      .put(bjx.bc, bvr.s().a())
      .put(bjx.bd, bwv.y().a())
      .put(bjx.be, caz.s().a())
      .put(bjx.bf, cck.gn().a())
      .put(bjx.bg, cba.t().a())
      .put(bjx.bi, ccb.s().a())
      .put(bjx.bh, bkl.A().a())
      .put(bjx.bj, cbb.t().a())
      .put(bjx.bk, bze.t().a())
      .put(bjx.bl, bzu.s().a())
      .put(bjx.bn, bwx.gk().a())
      .put(bjx.bo, cbd.s().a())
      .put(bjx.bp, cbe.gi().a())
      .put(bjx.bq, byd.s().a())
      .put(bjx.br, cbe.gi().a())
      .put(bjx.bs, cbg.go().a())
      .build();

   public static blo a(bjx<? extends bkj> $$0) {
      return b.get($$0);
   }

   public static boolean b(bjx<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jy.h.s().filter($$0 -> $$0.f() != bkm.h).filter($$0 -> !b((bjx<?>)$$0)).map(jy.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
