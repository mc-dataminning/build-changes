import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bkp {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<biw<? extends bji>, bkn> b = ImmutableMap.builder()
      .put(biw.b, bvx.s().a())
      .put(biw.d, bji.dP().a())
      .put(biw.f, bwa.gk().a())
      .put(biw.g, buo.s().a())
      .put(biw.h, buu.gp().a())
      .put(biw.i, byu.s().a())
      .put(biw.m, buw.gp().a())
      .put(biw.l, bwf.s().a())
      .put(biw.n, byv.s().a())
      .put(biw.q, buy.s().a())
      .put(biw.r, buq.s().a())
      .put(biw.t, bva.s().a())
      .put(biw.u, byw.s().a())
      .put(biw.v, bvb.gd().a())
      .put(biw.w, bwr.s().a())
      .put(biw.y, cad.gh().a())
      .put(biw.A, byz.s().a())
      .put(biw.E, bza.s().a())
      .put(biw.F, bzb.s().a())
      .put(biw.C, bxj.t().a())
      .put(biw.G, bzd.t().a())
      .put(biw.N, bvd.s().a())
      .put(biw.O, bwi.gd().a())
      .put(biw.Q, bze.y().a())
      .put(biw.R, bzf.s().a())
      .put(biw.T, bja.gd().a())
      .put(biw.U, bwo.t().a())
      .put(biw.V, bzg.gd().a())
      .put(biw.W, cag.s().a())
      .put(biw.Y, bws.gD().a())
      .put(biw.Z, cad.gh().a())
      .put(biw.aa, bzi.t().a())
      .put(biw.ac, bvf.s().a())
      .put(biw.aj, bwv.go().a())
      .put(biw.al, bzj.s().a())
      .put(biw.ao, bva.s().a())
      .put(biw.ap, bwr.s().a())
      .put(biw.aq, bvh.s().a())
      .put(biw.as, bvi.go().a())
      .put(biw.at, bvj.gj().a())
      .put(biw.au, bzk.gj().a())
      .put(biw.av, bvk.s().a())
      .put(biw.aw, cam.gk().a())
      .put(biw.ax, cap.y().a())
      .put(biw.ay, bzn.t().a())
      .put(biw.bt, cbw.fG().a())
      .put(biw.az, bvl.s().a())
      .put(biw.aB, buq.s().a())
      .put(biw.aC, bvn.t().a())
      .put(biw.aD, bzp.s().a())
      .put(biw.aE, buq.s().a())
      .put(biw.aF, bvp.s().a())
      .put(biw.aG, bzq.s().a())
      .put(biw.aI, bzr.s().a())
      .put(biw.aJ, byt.s().a())
      .put(biw.aK, bwy.s().a())
      .put(biw.aL, bzk.gj().a())
      .put(biw.aN, bxf.s().a())
      .put(biw.aO, bvr.s().a())
      .put(biw.aS, bzv.t().a())
      .put(biw.aT, bvs.gd().a())
      .put(biw.aU, byt.s().a())
      .put(biw.aV, bzx.t().a())
      .put(biw.aW, bwl.gf().a())
      .put(biw.ba, bwv.go().a())
      .put(biw.bc, buq.s().a())
      .put(biw.bd, bvu.y().a())
      .put(biw.be, bzy.s().a())
      .put(biw.bf, cbj.gm().a())
      .put(biw.bg, bzz.t().a())
      .put(biw.bi, cba.s().a())
      .put(biw.bh, bjk.A().a())
      .put(biw.bj, caa.t().a())
      .put(biw.bk, byd.t().a())
      .put(biw.bl, byt.s().a())
      .put(biw.bn, bvw.gj().a())
      .put(biw.bo, cac.s().a())
      .put(biw.bp, cad.gh().a())
      .put(biw.bq, bxc.s().a())
      .put(biw.br, cad.gh().a())
      .put(biw.bs, caf.gn().a())
      .build();

   public static bkn a(biw<? extends bji> $$0) {
      return b.get($$0);
   }

   public static boolean b(biw<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jd.h.s().filter($$0 -> $$0.f() != bjl.h).filter($$0 -> !b((biw<?>)$$0)).map(jd.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
