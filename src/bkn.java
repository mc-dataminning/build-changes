import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bkn {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<biu<? extends bjg>, bkl> b = ImmutableMap.builder()
      .put(biu.b, bvv.s().a())
      .put(biu.d, bjg.dP().a())
      .put(biu.f, bvy.gk().a())
      .put(biu.g, bum.s().a())
      .put(biu.h, bus.gp().a())
      .put(biu.i, bys.s().a())
      .put(biu.m, buu.gp().a())
      .put(biu.l, bwd.s().a())
      .put(biu.n, byt.s().a())
      .put(biu.q, buw.s().a())
      .put(biu.r, buo.s().a())
      .put(biu.t, buy.s().a())
      .put(biu.u, byu.s().a())
      .put(biu.v, buz.gd().a())
      .put(biu.w, bwp.s().a())
      .put(biu.y, cab.gh().a())
      .put(biu.A, byx.s().a())
      .put(biu.E, byy.s().a())
      .put(biu.F, byz.s().a())
      .put(biu.C, bxh.t().a())
      .put(biu.G, bzb.t().a())
      .put(biu.N, bvb.s().a())
      .put(biu.O, bwg.gd().a())
      .put(biu.Q, bzc.y().a())
      .put(biu.R, bzd.s().a())
      .put(biu.T, biy.gd().a())
      .put(biu.U, bwm.t().a())
      .put(biu.V, bze.gd().a())
      .put(biu.W, cae.s().a())
      .put(biu.Y, bwq.gD().a())
      .put(biu.Z, cab.gh().a())
      .put(biu.aa, bzg.t().a())
      .put(biu.ac, bvd.s().a())
      .put(biu.aj, bwt.go().a())
      .put(biu.al, bzh.s().a())
      .put(biu.ao, buy.s().a())
      .put(biu.ap, bwp.s().a())
      .put(biu.aq, bvf.s().a())
      .put(biu.as, bvg.go().a())
      .put(biu.at, bvh.gj().a())
      .put(biu.au, bzi.gj().a())
      .put(biu.av, bvi.s().a())
      .put(biu.aw, cak.gk().a())
      .put(biu.ax, can.y().a())
      .put(biu.ay, bzl.t().a())
      .put(biu.bt, cbu.fG().a())
      .put(biu.az, bvj.s().a())
      .put(biu.aB, buo.s().a())
      .put(biu.aC, bvl.t().a())
      .put(biu.aD, bzn.s().a())
      .put(biu.aE, buo.s().a())
      .put(biu.aF, bvn.s().a())
      .put(biu.aG, bzo.s().a())
      .put(biu.aI, bzp.s().a())
      .put(biu.aJ, byr.s().a())
      .put(biu.aK, bww.s().a())
      .put(biu.aL, bzi.gj().a())
      .put(biu.aN, bxd.s().a())
      .put(biu.aO, bvp.s().a())
      .put(biu.aS, bzt.t().a())
      .put(biu.aT, bvq.gd().a())
      .put(biu.aU, byr.s().a())
      .put(biu.aV, bzv.t().a())
      .put(biu.aW, bwj.gf().a())
      .put(biu.ba, bwt.go().a())
      .put(biu.bc, buo.s().a())
      .put(biu.bd, bvs.y().a())
      .put(biu.be, bzw.s().a())
      .put(biu.bf, cbh.gm().a())
      .put(biu.bg, bzx.t().a())
      .put(biu.bi, cay.s().a())
      .put(biu.bh, bji.A().a())
      .put(biu.bj, bzy.t().a())
      .put(biu.bk, byb.t().a())
      .put(biu.bl, byr.s().a())
      .put(biu.bn, bvu.gj().a())
      .put(biu.bo, caa.s().a())
      .put(biu.bp, cab.gh().a())
      .put(biu.bq, bxa.s().a())
      .put(biu.br, cab.gh().a())
      .put(biu.bs, cad.gn().a())
      .build();

   public static bkl a(biu<? extends bjg> $$0) {
      return b.get($$0);
   }

   public static boolean b(biu<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jb.h.s().filter($$0 -> $$0.f() != bjj.h).filter($$0 -> !b((biu<?>)$$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
