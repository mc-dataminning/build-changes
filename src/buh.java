import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class buh {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsj<? extends bsy>, buf> b = ImmutableMap.builder()
      .put(bsj.a, cfu.s().a())
      .put(bsj.c, cfx.s().a())
      .put(bsj.d, cig.s().a())
      .put(bsj.f, cga.gu().a())
      .put(bsj.g, cej.s().a())
      .put(bsj.h, cep.gz().a())
      .put(bsj.i, ciw.s().a())
      .put(bsj.l, cix.gq().a())
      .put(bsj.p, cer.gy().a())
      .put(bsj.o, cgf.s().a())
      .put(bsj.q, ciy.s().a())
      .put(bsj.t, cet.s().a())
      .put(bsj.u, cel.s().a())
      .put(bsj.w, cev.s().a())
      .put(bsj.x, ciz.s().a())
      .put(bsj.y, cew.gn().a())
      .put(bsj.z, cgr.s().a())
      .put(bsj.B, cjb.s().a())
      .put(bsj.D, cjc.s().a())
      .put(bsj.H, cjd.s().a())
      .put(bsj.I, cje.s().a())
      .put(bsj.F, chk.u().a())
      .put(bsj.J, cjg.u().a())
      .put(bsj.m, ckj.s().a())
      .put(bsj.Q, cey.s().a())
      .put(bsj.R, cgi.gn().a())
      .put(bsj.T, cjh.y().a())
      .put(bsj.U, cji.s().a())
      .put(bsj.W, bsq.gn().a())
      .put(bsj.X, cgo.u().a())
      .put(bsj.Y, cjj.gn().a())
      .put(bsj.Z, ckr.s().a())
      .put(bsj.ab, cgs.gM().a())
      .put(bsj.ac, ckg.gr().a())
      .put(bsj.ad, cjl.u().a())
      .put(bsj.af, cfa.s().a())
      .put(bsj.an, cgv.gy().a())
      .put(bsj.ap, cjm.s().a())
      .put(bsj.as, cev.s().a())
      .put(bsj.at, cgr.s().a())
      .put(bsj.au, cfc.s().a())
      .put(bsj.aw, cfd.gy().a())
      .put(bsj.ax, cfe.gt().a())
      .put(bsj.ay, cjn.gt().a())
      .put(bsj.az, cff.s().a())
      .put(bsj.aA, ckx.gu().a())
      .put(bsj.aB, cla.y().a())
      .put(bsj.aC, cjq.u().a())
      .put(bsj.by, cmh.fM().a())
      .put(bsj.aD, cfg.s().a())
      .put(bsj.aF, cel.s().a())
      .put(bsj.aG, cfi.u().a())
      .put(bsj.aH, cjs.s().a())
      .put(bsj.aI, cel.s().a())
      .put(bsj.aJ, cfk.s().a())
      .put(bsj.aK, cjt.s().a())
      .put(bsj.aM, cju.s().a())
      .put(bsj.aN, civ.s().a())
      .put(bsj.aO, cgy.s().a())
      .put(bsj.aP, cjn.gt().a())
      .put(bsj.aR, chf.s().a())
      .put(bsj.aS, cfm.s().a())
      .put(bsj.aW, cjy.u().a())
      .put(bsj.aX, cfn.gn().a())
      .put(bsj.aY, civ.s().a())
      .put(bsj.aZ, cka.u().a())
      .put(bsj.ba, cgl.gp().a())
      .put(bsj.be, cgv.gy().a())
      .put(bsj.bg, cel.s().a())
      .put(bsj.bh, cfp.y().a())
      .put(bsj.bi, ckb.u().a())
      .put(bsj.bj, clu.gw().a())
      .put(bsj.bk, ckc.u().a())
      .put(bsj.bm, cll.s().a())
      .put(bsj.bl, bta.A().a())
      .put(bsj.bo, ckd.u().a())
      .put(bsj.bp, cie.u().a())
      .put(bsj.bq, civ.s().a())
      .put(bsj.bs, cfr.gv().a())
      .put(bsj.bt, ckf.s().a())
      .put(bsj.bu, ckg.gr().a())
      .put(bsj.bv, chc.s().a())
      .put(bsj.bw, ckg.gr().a())
      .put(bsj.bx, cki.gx().a())
      .build();

   public static buf a(bsj<? extends bsy> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsj<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lq.f.t().filter($$0 -> $$0.f() != btb.h).filter($$0 -> !b((bsj<?>)$$0)).map(lq.f::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
