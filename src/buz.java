import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buz {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btb<? extends btq>, bux> b = ImmutableMap.builder()
      .put(btb.a, cgm.s().a())
      .put(btb.c, cgp.s().a())
      .put(btb.d, ciy.s().a())
      .put(btb.f, cgs.gx().a())
      .put(btb.g, cfb.s().a())
      .put(btb.h, cfh.gC().a())
      .put(btb.i, cjn.s().a())
      .put(btb.l, cjo.gt().a())
      .put(btb.p, cfj.gB().a())
      .put(btb.o, cgx.s().a())
      .put(btb.q, cjp.s().a())
      .put(btb.t, cfl.s().a())
      .put(btb.u, cfd.s().a())
      .put(btb.w, cfn.s().a())
      .put(btb.x, cjq.s().a())
      .put(btb.y, cfo.gq().a())
      .put(btb.z, chj.s().a())
      .put(btb.B, cjs.s().a())
      .put(btb.D, cjt.s().a())
      .put(btb.H, cju.s().a())
      .put(btb.I, cjv.s().a())
      .put(btb.F, cic.u().a())
      .put(btb.J, cjx.u().a())
      .put(btb.m, cla.s().a())
      .put(btb.Q, cfq.s().a())
      .put(btb.R, cha.gq().a())
      .put(btb.T, cjy.y().a())
      .put(btb.U, cjz.s().a())
      .put(btb.W, bti.gq().a())
      .put(btb.X, chg.u().a())
      .put(btb.Y, cka.gq().a())
      .put(btb.Z, cli.s().a())
      .put(btb.ab, chk.gP().a())
      .put(btb.ac, ckx.gu().a())
      .put(btb.ad, ckc.u().a())
      .put(btb.af, cfs.s().a())
      .put(btb.an, chn.gB().a())
      .put(btb.ap, ckd.s().a())
      .put(btb.as, cfn.s().a())
      .put(btb.at, chj.s().a())
      .put(btb.au, cfu.s().a())
      .put(btb.aw, cfv.gB().a())
      .put(btb.ax, cfw.gw().a())
      .put(btb.ay, cke.gw().a())
      .put(btb.az, cfx.s().a())
      .put(btb.aA, clo.gx().a())
      .put(btb.aB, clr.y().a())
      .put(btb.aC, ckh.u().a())
      .put(btb.by, cmy.fQ().a())
      .put(btb.aD, cfy.s().a())
      .put(btb.aF, cfd.s().a())
      .put(btb.aG, cga.u().a())
      .put(btb.aH, ckj.s().a())
      .put(btb.aI, cfd.s().a())
      .put(btb.aJ, cgc.s().a())
      .put(btb.aK, ckk.s().a())
      .put(btb.aM, ckl.s().a())
      .put(btb.aN, cjm.s().a())
      .put(btb.aO, chq.s().a())
      .put(btb.aP, cke.gw().a())
      .put(btb.aR, chx.s().a())
      .put(btb.aS, cge.s().a())
      .put(btb.aW, ckp.u().a())
      .put(btb.aX, cgf.gq().a())
      .put(btb.aY, cjm.s().a())
      .put(btb.aZ, ckr.u().a())
      .put(btb.ba, chd.gs().a())
      .put(btb.be, chn.gB().a())
      .put(btb.bg, cfd.s().a())
      .put(btb.bh, cgh.y().a())
      .put(btb.bi, cks.u().a())
      .put(btb.bj, cml.gz().a())
      .put(btb.bk, ckt.u().a())
      .put(btb.bm, cmc.s().a())
      .put(btb.bl, bts.A().a())
      .put(btb.bo, cku.u().a())
      .put(btb.bp, ciw.u().a())
      .put(btb.bq, cjm.s().a())
      .put(btb.bs, cgj.gy().a())
      .put(btb.bt, ckw.s().a())
      .put(btb.bu, ckx.gu().a())
      .put(btb.bv, chu.s().a())
      .put(btb.bw, ckx.gu().a())
      .put(btb.bx, ckz.gA().a())
      .build();

   public static bux a(btb<? extends btq> $$0) {
      return b.get($$0);
   }

   public static boolean b(btb<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lp.g.s().filter($$0 -> $$0.f() != btt.h).filter($$0 -> !b((btb<?>)$$0)).map(lp.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
