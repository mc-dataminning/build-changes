import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class btx {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsa<? extends bso>, btv> b = ImmutableMap.builder()
      .put(bsa.a, cfk.s().a())
      .put(bsa.c, cfn.s().a())
      .put(bsa.d, chw.s().a())
      .put(bsa.f, cfq.gw().a())
      .put(bsa.g, cdz.s().a())
      .put(bsa.h, cef.gB().a())
      .put(bsa.i, cil.s().a())
      .put(bsa.l, cim.gs().a())
      .put(bsa.p, ceh.gA().a())
      .put(bsa.o, cfv.s().a())
      .put(bsa.q, cin.s().a())
      .put(bsa.t, cej.s().a())
      .put(bsa.u, ceb.s().a())
      .put(bsa.w, cel.s().a())
      .put(bsa.x, cio.s().a())
      .put(bsa.y, cem.gp().a())
      .put(bsa.z, cgh.s().a())
      .put(bsa.B, ciq.s().a())
      .put(bsa.D, cir.s().a())
      .put(bsa.H, cis.s().a())
      .put(bsa.I, cit.s().a())
      .put(bsa.F, cha.u().a())
      .put(bsa.J, civ.u().a())
      .put(bsa.m, cjy.s().a())
      .put(bsa.Q, ceo.s().a())
      .put(bsa.R, cfy.gp().a())
      .put(bsa.T, ciw.y().a())
      .put(bsa.U, cix.s().a())
      .put(bsa.W, bsg.gp().a())
      .put(bsa.X, cge.u().a())
      .put(bsa.Y, ciy.gp().a())
      .put(bsa.Z, ckg.s().a())
      .put(bsa.ab, cgi.gO().a())
      .put(bsa.ac, cjv.gt().a())
      .put(bsa.ad, cja.u().a())
      .put(bsa.af, ceq.s().a())
      .put(bsa.an, cgl.gA().a())
      .put(bsa.ap, cjb.s().a())
      .put(bsa.as, cel.s().a())
      .put(bsa.at, cgh.s().a())
      .put(bsa.au, ces.s().a())
      .put(bsa.aw, cet.gA().a())
      .put(bsa.ax, ceu.gv().a())
      .put(bsa.ay, cjc.gv().a())
      .put(bsa.az, cev.s().a())
      .put(bsa.aA, ckm.gw().a())
      .put(bsa.aB, ckp.y().a())
      .put(bsa.aC, cjf.u().a())
      .put(bsa.by, clw.fQ().a())
      .put(bsa.aD, cew.s().a())
      .put(bsa.aF, ceb.s().a())
      .put(bsa.aG, cey.u().a())
      .put(bsa.aH, cjh.s().a())
      .put(bsa.aI, ceb.s().a())
      .put(bsa.aJ, cfa.s().a())
      .put(bsa.aK, cji.s().a())
      .put(bsa.aM, cjj.s().a())
      .put(bsa.aN, cik.s().a())
      .put(bsa.aO, cgo.s().a())
      .put(bsa.aP, cjc.gv().a())
      .put(bsa.aR, cgv.s().a())
      .put(bsa.aS, cfc.s().a())
      .put(bsa.aW, cjn.u().a())
      .put(bsa.aX, cfd.gp().a())
      .put(bsa.aY, cik.s().a())
      .put(bsa.aZ, cjp.u().a())
      .put(bsa.ba, cgb.gr().a())
      .put(bsa.be, cgl.gA().a())
      .put(bsa.bg, ceb.s().a())
      .put(bsa.bh, cff.y().a())
      .put(bsa.bi, cjq.u().a())
      .put(bsa.bj, clj.gy().a())
      .put(bsa.bk, cjr.u().a())
      .put(bsa.bm, cla.s().a())
      .put(bsa.bl, bsq.A().a())
      .put(bsa.bo, cjs.u().a())
      .put(bsa.bp, chu.u().a())
      .put(bsa.bq, cik.s().a())
      .put(bsa.bs, cfh.gx().a())
      .put(bsa.bt, cju.s().a())
      .put(bsa.bu, cjv.gt().a())
      .put(bsa.bv, cgs.s().a())
      .put(bsa.bw, cjv.gt().a())
      .put(bsa.bx, cjx.gz().a())
      .build();

   public static btv a(bsa<? extends bso> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsa<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      le.g.s().filter($$0 -> $$0.f() != bsr.h).filter($$0 -> !b((bsa<?>)$$0)).map(le.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
