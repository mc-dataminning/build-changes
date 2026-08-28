import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bux {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsx<? extends btn>, buv> b = ImmutableMap.builder()
      .put(bsx.a, cgk.s().a())
      .put(bsx.c, cgn.s().a())
      .put(bsx.d, ciw.s().a())
      .put(bsx.f, cgq.gn().a())
      .put(bsx.g, cez.s().a())
      .put(bsx.h, cff.gx().a())
      .put(bsx.i, cjm.s().a())
      .put(bsx.l, cjn.go().a())
      .put(bsx.p, cfh.gA().a())
      .put(bsx.o, cgv.s().a())
      .put(bsx.q, cjo.s().a())
      .put(bsx.t, cfj.s().a())
      .put(bsx.u, cfb.s().a())
      .put(bsx.w, cfl.s().a())
      .put(bsx.x, cjp.s().a())
      .put(bsx.y, cfm.gl().a())
      .put(bsx.z, chh.s().a())
      .put(bsx.B, cjr.s().a())
      .put(bsx.D, cjs.s().a())
      .put(bsx.H, cjt.s().a())
      .put(bsx.I, cju.s().a())
      .put(bsx.F, cia.t().a())
      .put(bsx.J, cjw.t().a())
      .put(bsx.m, ckz.s().a())
      .put(bsx.Q, cfo.s().a())
      .put(bsx.R, cgy.gl().a())
      .put(bsx.T, cjx.x().a())
      .put(bsx.U, cjy.s().a())
      .put(bsx.W, bte.gl().a())
      .put(bsx.X, che.t().a())
      .put(bsx.Y, cjz.gl().a())
      .put(bsx.Z, clh.s().a())
      .put(bsx.ab, chi.gL().a())
      .put(bsx.ac, ckw.gp().a())
      .put(bsx.ad, ckb.t().a())
      .put(bsx.af, cfq.s().a())
      .put(bsx.an, chl.gv().a())
      .put(bsx.ap, ckc.s().a())
      .put(bsx.as, cfl.s().a())
      .put(bsx.at, chh.s().a())
      .put(bsx.au, cfs.s().a())
      .put(bsx.aw, cft.gw().a())
      .put(bsx.ax, cfu.gv().a())
      .put(bsx.ay, ckd.gr().a())
      .put(bsx.az, cfv.s().a())
      .put(bsx.aA, cln.gs().a())
      .put(bsx.aB, clq.x().a())
      .put(bsx.aC, ckg.t().a())
      .put(bsx.by, cmx.fN().a())
      .put(bsx.aD, cfw.s().a())
      .put(bsx.aF, cfb.s().a())
      .put(bsx.aG, cfy.t().a())
      .put(bsx.aH, cki.s().a())
      .put(bsx.aI, cfb.s().a())
      .put(bsx.aJ, cga.s().a())
      .put(bsx.aK, ckj.s().a())
      .put(bsx.aM, ckk.s().a())
      .put(bsx.aN, cjl.s().a())
      .put(bsx.aO, cho.s().a())
      .put(bsx.aP, ckd.gr().a())
      .put(bsx.aR, chv.s().a())
      .put(bsx.aS, cgc.s().a())
      .put(bsx.aW, cko.t().a())
      .put(bsx.aX, cgd.gl().a())
      .put(bsx.aY, cjl.s().a())
      .put(bsx.aZ, ckq.t().a())
      .put(bsx.ba, chb.gn().a())
      .put(bsx.be, chl.gv().a())
      .put(bsx.bg, cfb.s().a())
      .put(bsx.bh, cgf.x().a())
      .put(bsx.bi, ckr.t().a())
      .put(bsx.bj, cmk.gu().a())
      .put(bsx.bk, cks.t().a())
      .put(bsx.bm, cmb.s().a())
      .put(bsx.bl, btp.C().a())
      .put(bsx.bo, ckt.t().a())
      .put(bsx.bp, ciu.t().a())
      .put(bsx.bq, cjl.s().a())
      .put(bsx.bs, cgh.gx().a())
      .put(bsx.bt, ckv.s().a())
      .put(bsx.bu, ckw.gp().a())
      .put(bsx.bv, chs.s().a())
      .put(bsx.bw, ckw.gp().a())
      .put(bsx.bx, cky.gv().a())
      .build();

   public static buv a(bsx<? extends btn> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsx<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lt.f.t().filter($$0 -> $$0.f() != btq.h).filter($$0 -> !b((bsx<?>)$$0)).map(lt.f::b).forEach($$0 -> ad.b("Entity " + $$0 + " has no attributes"));
   }
}
