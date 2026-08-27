import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class btz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsc<? extends bsq>, btx> b = ImmutableMap.builder()
      .put(bsc.a, cfm.s().a())
      .put(bsc.c, cfp.s().a())
      .put(bsc.d, chy.s().a())
      .put(bsc.f, cfs.gw().a())
      .put(bsc.g, ceb.s().a())
      .put(bsc.h, ceh.gB().a())
      .put(bsc.i, cin.s().a())
      .put(bsc.l, cio.gs().a())
      .put(bsc.p, cej.gA().a())
      .put(bsc.o, cfx.s().a())
      .put(bsc.q, cip.s().a())
      .put(bsc.t, cel.s().a())
      .put(bsc.u, ced.s().a())
      .put(bsc.w, cen.s().a())
      .put(bsc.x, ciq.s().a())
      .put(bsc.y, ceo.gp().a())
      .put(bsc.z, cgj.s().a())
      .put(bsc.B, cis.s().a())
      .put(bsc.D, cit.s().a())
      .put(bsc.H, ciu.s().a())
      .put(bsc.I, civ.s().a())
      .put(bsc.F, chc.u().a())
      .put(bsc.J, cix.u().a())
      .put(bsc.m, cka.s().a())
      .put(bsc.Q, ceq.s().a())
      .put(bsc.R, cga.gp().a())
      .put(bsc.T, ciy.y().a())
      .put(bsc.U, ciz.s().a())
      .put(bsc.W, bsi.gp().a())
      .put(bsc.X, cgg.u().a())
      .put(bsc.Y, cja.gp().a())
      .put(bsc.Z, cki.s().a())
      .put(bsc.ab, cgk.gO().a())
      .put(bsc.ac, cjx.gt().a())
      .put(bsc.ad, cjc.u().a())
      .put(bsc.af, ces.s().a())
      .put(bsc.an, cgn.gA().a())
      .put(bsc.ap, cjd.s().a())
      .put(bsc.as, cen.s().a())
      .put(bsc.at, cgj.s().a())
      .put(bsc.au, ceu.s().a())
      .put(bsc.aw, cev.gA().a())
      .put(bsc.ax, cew.gv().a())
      .put(bsc.ay, cje.gv().a())
      .put(bsc.az, cex.s().a())
      .put(bsc.aA, cko.gw().a())
      .put(bsc.aB, ckr.y().a())
      .put(bsc.aC, cjh.u().a())
      .put(bsc.by, cly.fQ().a())
      .put(bsc.aD, cey.s().a())
      .put(bsc.aF, ced.s().a())
      .put(bsc.aG, cfa.u().a())
      .put(bsc.aH, cjj.s().a())
      .put(bsc.aI, ced.s().a())
      .put(bsc.aJ, cfc.s().a())
      .put(bsc.aK, cjk.s().a())
      .put(bsc.aM, cjl.s().a())
      .put(bsc.aN, cim.s().a())
      .put(bsc.aO, cgq.s().a())
      .put(bsc.aP, cje.gv().a())
      .put(bsc.aR, cgx.s().a())
      .put(bsc.aS, cfe.s().a())
      .put(bsc.aW, cjp.u().a())
      .put(bsc.aX, cff.gp().a())
      .put(bsc.aY, cim.s().a())
      .put(bsc.aZ, cjr.u().a())
      .put(bsc.ba, cgd.gr().a())
      .put(bsc.be, cgn.gA().a())
      .put(bsc.bg, ced.s().a())
      .put(bsc.bh, cfh.y().a())
      .put(bsc.bi, cjs.u().a())
      .put(bsc.bj, cll.gy().a())
      .put(bsc.bk, cjt.u().a())
      .put(bsc.bm, clc.s().a())
      .put(bsc.bl, bss.A().a())
      .put(bsc.bo, cju.u().a())
      .put(bsc.bp, chw.u().a())
      .put(bsc.bq, cim.s().a())
      .put(bsc.bs, cfj.gx().a())
      .put(bsc.bt, cjw.s().a())
      .put(bsc.bu, cjx.gt().a())
      .put(bsc.bv, cgu.s().a())
      .put(bsc.bw, cjx.gt().a())
      .put(bsc.bx, cjz.gz().a())
      .build();

   public static btx a(bsc<? extends bsq> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsc<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      le.g.s().filter($$0 -> $$0.f() != bst.h).filter($$0 -> !b((bsc<?>)$$0)).map(le.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
