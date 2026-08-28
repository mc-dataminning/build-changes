import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buv {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsw<? extends btl>, but> b = ImmutableMap.builder()
      .put(bsw.a, cgi.s().a())
      .put(bsw.c, cgl.s().a())
      .put(bsw.d, ciu.s().a())
      .put(bsw.f, cgo.go().a())
      .put(bsw.g, cex.s().a())
      .put(bsw.h, cfd.gy().a())
      .put(bsw.i, cjk.s().a())
      .put(bsw.l, cjl.gp().a())
      .put(bsw.p, cff.gB().a())
      .put(bsw.o, cgt.s().a())
      .put(bsw.q, cjm.s().a())
      .put(bsw.t, cfh.s().a())
      .put(bsw.u, cez.s().a())
      .put(bsw.w, cfj.s().a())
      .put(bsw.x, cjn.s().a())
      .put(bsw.y, cfk.gm().a())
      .put(bsw.z, chf.s().a())
      .put(bsw.B, cjp.s().a())
      .put(bsw.D, cjq.s().a())
      .put(bsw.H, cjr.s().a())
      .put(bsw.I, cjs.s().a())
      .put(bsw.F, chy.t().a())
      .put(bsw.J, cju.t().a())
      .put(bsw.m, ckx.s().a())
      .put(bsw.Q, cfm.s().a())
      .put(bsw.R, cgw.gm().a())
      .put(bsw.T, cjv.x().a())
      .put(bsw.U, cjw.s().a())
      .put(bsw.W, btd.gm().a())
      .put(bsw.X, chc.t().a())
      .put(bsw.Y, cjx.gm().a())
      .put(bsw.Z, clf.s().a())
      .put(bsw.ab, chg.gL().a())
      .put(bsw.ac, cku.gq().a())
      .put(bsw.ad, cjz.t().a())
      .put(bsw.af, cfo.s().a())
      .put(bsw.an, chj.gx().a())
      .put(bsw.ap, cka.s().a())
      .put(bsw.as, cfj.s().a())
      .put(bsw.at, chf.s().a())
      .put(bsw.au, cfq.s().a())
      .put(bsw.aw, cfr.gx().a())
      .put(bsw.ax, cfs.gw().a())
      .put(bsw.ay, ckb.gs().a())
      .put(bsw.az, cft.s().a())
      .put(bsw.aA, cll.gt().a())
      .put(bsw.aB, clo.x().a())
      .put(bsw.aC, cke.t().a())
      .put(bsw.by, cmv.fN().a())
      .put(bsw.aD, cfu.s().a())
      .put(bsw.aF, cez.s().a())
      .put(bsw.aG, cfw.t().a())
      .put(bsw.aH, ckg.s().a())
      .put(bsw.aI, cez.s().a())
      .put(bsw.aJ, cfy.s().a())
      .put(bsw.aK, ckh.s().a())
      .put(bsw.aM, cki.s().a())
      .put(bsw.aN, cjj.s().a())
      .put(bsw.aO, chm.s().a())
      .put(bsw.aP, ckb.gs().a())
      .put(bsw.aR, cht.s().a())
      .put(bsw.aS, cga.s().a())
      .put(bsw.aW, ckm.t().a())
      .put(bsw.aX, cgb.gm().a())
      .put(bsw.aY, cjj.s().a())
      .put(bsw.aZ, cko.t().a())
      .put(bsw.ba, cgz.go().a())
      .put(bsw.be, chj.gx().a())
      .put(bsw.bg, cez.s().a())
      .put(bsw.bh, cgd.x().a())
      .put(bsw.bi, ckp.t().a())
      .put(bsw.bj, cmi.gv().a())
      .put(bsw.bk, ckq.t().a())
      .put(bsw.bm, clz.s().a())
      .put(bsw.bl, btn.A().a())
      .put(bsw.bo, ckr.t().a())
      .put(bsw.bp, cis.t().a())
      .put(bsw.bq, cjj.s().a())
      .put(bsw.bs, cgf.gy().a())
      .put(bsw.bt, ckt.s().a())
      .put(bsw.bu, cku.gq().a())
      .put(bsw.bv, chq.s().a())
      .put(bsw.bw, cku.gq().a())
      .put(bsw.bx, ckw.gw().a())
      .build();

   public static but a(bsw<? extends btl> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsw<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lt.f.t().filter($$0 -> $$0.f() != bto.h).filter($$0 -> !b((bsw<?>)$$0)).map(lt.f::b).forEach($$0 -> ad.a("Entity " + $$0 + " has no attributes"));
   }
}
