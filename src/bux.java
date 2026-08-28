import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bux {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsz<? extends bto>, buv> b = ImmutableMap.builder()
      .put(bsz.a, cgk.s().a())
      .put(bsz.c, cgn.s().a())
      .put(bsz.d, ciw.s().a())
      .put(bsz.f, cgq.gx().a())
      .put(bsz.g, cez.s().a())
      .put(bsz.h, cff.gC().a())
      .put(bsz.i, cjl.s().a())
      .put(bsz.l, cjm.gt().a())
      .put(bsz.p, cfh.gB().a())
      .put(bsz.o, cgv.s().a())
      .put(bsz.q, cjn.s().a())
      .put(bsz.t, cfj.s().a())
      .put(bsz.u, cfb.s().a())
      .put(bsz.w, cfl.s().a())
      .put(bsz.x, cjo.s().a())
      .put(bsz.y, cfm.gq().a())
      .put(bsz.z, chh.s().a())
      .put(bsz.B, cjq.s().a())
      .put(bsz.D, cjr.s().a())
      .put(bsz.H, cjs.s().a())
      .put(bsz.I, cjt.s().a())
      .put(bsz.F, cia.u().a())
      .put(bsz.J, cjv.u().a())
      .put(bsz.m, cky.s().a())
      .put(bsz.Q, cfo.s().a())
      .put(bsz.R, cgy.gq().a())
      .put(bsz.T, cjw.y().a())
      .put(bsz.U, cjx.s().a())
      .put(bsz.W, btg.gq().a())
      .put(bsz.X, che.u().a())
      .put(bsz.Y, cjy.gq().a())
      .put(bsz.Z, clg.s().a())
      .put(bsz.ab, chi.gP().a())
      .put(bsz.ac, ckv.gu().a())
      .put(bsz.ad, cka.u().a())
      .put(bsz.af, cfq.s().a())
      .put(bsz.an, chl.gB().a())
      .put(bsz.ap, ckb.s().a())
      .put(bsz.as, cfl.s().a())
      .put(bsz.at, chh.s().a())
      .put(bsz.au, cfs.s().a())
      .put(bsz.aw, cft.gB().a())
      .put(bsz.ax, cfu.gw().a())
      .put(bsz.ay, ckc.gw().a())
      .put(bsz.az, cfv.s().a())
      .put(bsz.aA, clm.gx().a())
      .put(bsz.aB, clp.y().a())
      .put(bsz.aC, ckf.u().a())
      .put(bsz.by, cmw.fQ().a())
      .put(bsz.aD, cfw.s().a())
      .put(bsz.aF, cfb.s().a())
      .put(bsz.aG, cfy.u().a())
      .put(bsz.aH, ckh.s().a())
      .put(bsz.aI, cfb.s().a())
      .put(bsz.aJ, cga.s().a())
      .put(bsz.aK, cki.s().a())
      .put(bsz.aM, ckj.s().a())
      .put(bsz.aN, cjk.s().a())
      .put(bsz.aO, cho.s().a())
      .put(bsz.aP, ckc.gw().a())
      .put(bsz.aR, chv.s().a())
      .put(bsz.aS, cgc.s().a())
      .put(bsz.aW, ckn.u().a())
      .put(bsz.aX, cgd.gq().a())
      .put(bsz.aY, cjk.s().a())
      .put(bsz.aZ, ckp.u().a())
      .put(bsz.ba, chb.gs().a())
      .put(bsz.be, chl.gB().a())
      .put(bsz.bg, cfb.s().a())
      .put(bsz.bh, cgf.y().a())
      .put(bsz.bi, ckq.u().a())
      .put(bsz.bj, cmj.gz().a())
      .put(bsz.bk, ckr.u().a())
      .put(bsz.bm, cma.s().a())
      .put(bsz.bl, btq.A().a())
      .put(bsz.bo, cks.u().a())
      .put(bsz.bp, ciu.u().a())
      .put(bsz.bq, cjk.s().a())
      .put(bsz.bs, cgh.gy().a())
      .put(bsz.bt, cku.s().a())
      .put(bsz.bu, ckv.gu().a())
      .put(bsz.bv, chs.s().a())
      .put(bsz.bw, ckv.gu().a())
      .put(bsz.bx, ckx.gA().a())
      .build();

   public static buv a(bsz<? extends bto> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsz<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lp.g.s().filter($$0 -> $$0.f() != btr.h).filter($$0 -> !b((bsz<?>)$$0)).map(lp.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
