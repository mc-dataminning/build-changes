import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buk {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsm<? extends btb>, bui> b = ImmutableMap.builder()
      .put(bsm.a, cfx.s().a())
      .put(bsm.c, cga.s().a())
      .put(bsm.d, cij.s().a())
      .put(bsm.f, cgd.gv().a())
      .put(bsm.g, cem.s().a())
      .put(bsm.h, ces.gA().a())
      .put(bsm.i, ciz.s().a())
      .put(bsm.l, cja.gr().a())
      .put(bsm.p, ceu.gz().a())
      .put(bsm.o, cgi.s().a())
      .put(bsm.q, cjb.s().a())
      .put(bsm.t, cew.s().a())
      .put(bsm.u, ceo.s().a())
      .put(bsm.w, cey.s().a())
      .put(bsm.x, cjc.s().a())
      .put(bsm.y, cez.go().a())
      .put(bsm.z, cgu.s().a())
      .put(bsm.B, cje.s().a())
      .put(bsm.D, cjf.s().a())
      .put(bsm.H, cjg.s().a())
      .put(bsm.I, cjh.s().a())
      .put(bsm.F, chn.u().a())
      .put(bsm.J, cjj.u().a())
      .put(bsm.m, ckm.s().a())
      .put(bsm.Q, cfb.s().a())
      .put(bsm.R, cgl.go().a())
      .put(bsm.T, cjk.y().a())
      .put(bsm.U, cjl.s().a())
      .put(bsm.W, bst.go().a())
      .put(bsm.X, cgr.u().a())
      .put(bsm.Y, cjm.go().a())
      .put(bsm.Z, cku.s().a())
      .put(bsm.ab, cgv.gN().a())
      .put(bsm.ac, ckj.gs().a())
      .put(bsm.ad, cjo.u().a())
      .put(bsm.af, cfd.s().a())
      .put(bsm.an, cgy.gz().a())
      .put(bsm.ap, cjp.s().a())
      .put(bsm.as, cey.s().a())
      .put(bsm.at, cgu.s().a())
      .put(bsm.au, cff.s().a())
      .put(bsm.aw, cfg.gz().a())
      .put(bsm.ax, cfh.gu().a())
      .put(bsm.ay, cjq.gu().a())
      .put(bsm.az, cfi.s().a())
      .put(bsm.aA, cla.gv().a())
      .put(bsm.aB, cld.y().a())
      .put(bsm.aC, cjt.u().a())
      .put(bsm.by, cmk.fN().a())
      .put(bsm.aD, cfj.s().a())
      .put(bsm.aF, ceo.s().a())
      .put(bsm.aG, cfl.u().a())
      .put(bsm.aH, cjv.s().a())
      .put(bsm.aI, ceo.s().a())
      .put(bsm.aJ, cfn.s().a())
      .put(bsm.aK, cjw.s().a())
      .put(bsm.aM, cjx.s().a())
      .put(bsm.aN, ciy.s().a())
      .put(bsm.aO, chb.s().a())
      .put(bsm.aP, cjq.gu().a())
      .put(bsm.aR, chi.s().a())
      .put(bsm.aS, cfp.s().a())
      .put(bsm.aW, ckb.u().a())
      .put(bsm.aX, cfq.go().a())
      .put(bsm.aY, ciy.s().a())
      .put(bsm.aZ, ckd.u().a())
      .put(bsm.ba, cgo.gq().a())
      .put(bsm.be, cgy.gz().a())
      .put(bsm.bg, ceo.s().a())
      .put(bsm.bh, cfs.y().a())
      .put(bsm.bi, cke.u().a())
      .put(bsm.bj, clx.gx().a())
      .put(bsm.bk, ckf.u().a())
      .put(bsm.bm, clo.s().a())
      .put(bsm.bl, btd.A().a())
      .put(bsm.bo, ckg.u().a())
      .put(bsm.bp, cih.u().a())
      .put(bsm.bq, ciy.s().a())
      .put(bsm.bs, cfu.gw().a())
      .put(bsm.bt, cki.s().a())
      .put(bsm.bu, ckj.gs().a())
      .put(bsm.bv, chf.s().a())
      .put(bsm.bw, ckj.gs().a())
      .put(bsm.bx, ckl.gy().a())
      .build();

   public static bui a(bsm<? extends btb> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsm<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lq.f.t().filter($$0 -> $$0.f() != bte.h).filter($$0 -> !b((bsm<?>)$$0)).map(lq.f::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
