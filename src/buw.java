import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buw {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsy<? extends btn>, buu> b = ImmutableMap.builder()
      .put(bsy.a, cgj.s().a())
      .put(bsy.c, cgm.s().a())
      .put(bsy.d, civ.s().a())
      .put(bsy.f, cgp.gx().a())
      .put(bsy.g, cey.s().a())
      .put(bsy.h, cfe.gC().a())
      .put(bsy.i, cjk.s().a())
      .put(bsy.l, cjl.gt().a())
      .put(bsy.p, cfg.gB().a())
      .put(bsy.o, cgu.s().a())
      .put(bsy.q, cjm.s().a())
      .put(bsy.t, cfi.s().a())
      .put(bsy.u, cfa.s().a())
      .put(bsy.w, cfk.s().a())
      .put(bsy.x, cjn.s().a())
      .put(bsy.y, cfl.gq().a())
      .put(bsy.z, chg.s().a())
      .put(bsy.B, cjp.s().a())
      .put(bsy.D, cjq.s().a())
      .put(bsy.H, cjr.s().a())
      .put(bsy.I, cjs.s().a())
      .put(bsy.F, chz.u().a())
      .put(bsy.J, cju.u().a())
      .put(bsy.m, ckx.s().a())
      .put(bsy.Q, cfn.s().a())
      .put(bsy.R, cgx.gq().a())
      .put(bsy.T, cjv.y().a())
      .put(bsy.U, cjw.s().a())
      .put(bsy.W, btf.gq().a())
      .put(bsy.X, chd.u().a())
      .put(bsy.Y, cjx.gq().a())
      .put(bsy.Z, clf.s().a())
      .put(bsy.ab, chh.gP().a())
      .put(bsy.ac, cku.gu().a())
      .put(bsy.ad, cjz.u().a())
      .put(bsy.af, cfp.s().a())
      .put(bsy.an, chk.gB().a())
      .put(bsy.ap, cka.s().a())
      .put(bsy.as, cfk.s().a())
      .put(bsy.at, chg.s().a())
      .put(bsy.au, cfr.s().a())
      .put(bsy.aw, cfs.gB().a())
      .put(bsy.ax, cft.gw().a())
      .put(bsy.ay, ckb.gw().a())
      .put(bsy.az, cfu.s().a())
      .put(bsy.aA, cll.gx().a())
      .put(bsy.aB, clo.y().a())
      .put(bsy.aC, cke.u().a())
      .put(bsy.by, cmv.fQ().a())
      .put(bsy.aD, cfv.s().a())
      .put(bsy.aF, cfa.s().a())
      .put(bsy.aG, cfx.u().a())
      .put(bsy.aH, ckg.s().a())
      .put(bsy.aI, cfa.s().a())
      .put(bsy.aJ, cfz.s().a())
      .put(bsy.aK, ckh.s().a())
      .put(bsy.aM, cki.s().a())
      .put(bsy.aN, cjj.s().a())
      .put(bsy.aO, chn.s().a())
      .put(bsy.aP, ckb.gw().a())
      .put(bsy.aR, chu.s().a())
      .put(bsy.aS, cgb.s().a())
      .put(bsy.aW, ckm.u().a())
      .put(bsy.aX, cgc.gq().a())
      .put(bsy.aY, cjj.s().a())
      .put(bsy.aZ, cko.u().a())
      .put(bsy.ba, cha.gs().a())
      .put(bsy.be, chk.gB().a())
      .put(bsy.bg, cfa.s().a())
      .put(bsy.bh, cge.y().a())
      .put(bsy.bi, ckp.u().a())
      .put(bsy.bj, cmi.gz().a())
      .put(bsy.bk, ckq.u().a())
      .put(bsy.bm, clz.s().a())
      .put(bsy.bl, btp.A().a())
      .put(bsy.bo, ckr.u().a())
      .put(bsy.bp, cit.u().a())
      .put(bsy.bq, cjj.s().a())
      .put(bsy.bs, cgg.gy().a())
      .put(bsy.bt, ckt.s().a())
      .put(bsy.bu, cku.gu().a())
      .put(bsy.bv, chr.s().a())
      .put(bsy.bw, cku.gu().a())
      .put(bsy.bx, ckw.gA().a())
      .build();

   public static buu a(bsy<? extends btn> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsy<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lp.g.s().filter($$0 -> $$0.f() != btq.h).filter($$0 -> !b((bsy<?>)$$0)).map(lp.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
