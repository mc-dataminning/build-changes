import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bpq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bnw<? extends boi>, bpo> b = ImmutableMap.builder()
      .put(bnw.b, cbb.u().a())
      .put(bnw.d, cbe.u().a())
      .put(bnw.e, cdm.u().a())
      .put(bnw.g, cbh.gn().a())
      .put(bnw.h, bzs.u().a())
      .put(bnw.i, bzy.gs().a())
      .put(bnw.j, ceb.u().a())
      .put(bnw.o, caa.gs().a())
      .put(bnw.n, cbm.u().a())
      .put(bnw.p, cec.u().a())
      .put(bnw.s, cac.u().a())
      .put(bnw.t, bzu.u().a())
      .put(bnw.v, cae.u().a())
      .put(bnw.w, ced.u().a())
      .put(bnw.x, caf.gg().a())
      .put(bnw.y, cby.u().a())
      .put(bnw.A, cef.u().a())
      .put(bnw.C, ceg.u().a())
      .put(bnw.G, ceh.u().a())
      .put(bnw.H, cei.u().a())
      .put(bnw.E, ccq.w().a())
      .put(bnw.I, cek.w().a())
      .put(bnw.m, cfn.u().a())
      .put(bnw.P, cah.u().a())
      .put(bnw.Q, cbp.gg().a())
      .put(bnw.S, cel.A().a())
      .put(bnw.T, cem.u().a())
      .put(bnw.V, boa.gg().a())
      .put(bnw.W, cbv.w().a())
      .put(bnw.X, cen.gg().a())
      .put(bnw.Y, cfv.u().a())
      .put(bnw.aa, cbz.gG().a())
      .put(bnw.ab, cfk.gk().a())
      .put(bnw.ac, cep.w().a())
      .put(bnw.ae, caj.u().a())
      .put(bnw.al, ccc.gr().a())
      .put(bnw.an, ceq.u().a())
      .put(bnw.aq, cae.u().a())
      .put(bnw.ar, cby.u().a())
      .put(bnw.as, cal.u().a())
      .put(bnw.au, cam.gr().a())
      .put(bnw.av, can.gm().a())
      .put(bnw.aw, cer.gm().a())
      .put(bnw.ax, cao.u().a())
      .put(bnw.ay, cgb.gn().a())
      .put(bnw.az, cge.A().a())
      .put(bnw.aA, ceu.w().a())
      .put(bnw.bw, chl.fH().a())
      .put(bnw.aB, cap.u().a())
      .put(bnw.aD, bzu.u().a())
      .put(bnw.aE, car.w().a())
      .put(bnw.aF, cew.u().a())
      .put(bnw.aG, bzu.u().a())
      .put(bnw.aH, cat.u().a())
      .put(bnw.aI, cex.u().a())
      .put(bnw.aK, cey.u().a())
      .put(bnw.aL, cea.u().a())
      .put(bnw.aM, ccf.u().a())
      .put(bnw.aN, cer.gm().a())
      .put(bnw.aP, ccm.u().a())
      .put(bnw.aQ, cav.u().a())
      .put(bnw.aU, cfc.w().a())
      .put(bnw.aV, caw.gg().a())
      .put(bnw.aW, cea.u().a())
      .put(bnw.aX, cfe.w().a())
      .put(bnw.aY, cbs.gi().a())
      .put(bnw.bc, ccc.gr().a())
      .put(bnw.be, bzu.u().a())
      .put(bnw.bf, cay.A().a())
      .put(bnw.bg, cff.u().a())
      .put(bnw.bh, cgy.gp().a())
      .put(bnw.bi, cfg.w().a())
      .put(bnw.bk, cgp.u().a())
      .put(bnw.bj, bok.C().a())
      .put(bnw.bm, cfh.w().a())
      .put(bnw.bn, cdk.w().a())
      .put(bnw.bo, cea.u().a())
      .put(bnw.bq, cba.gm().a())
      .put(bnw.br, cfj.u().a())
      .put(bnw.bs, cfk.gk().a())
      .put(bnw.bt, ccj.u().a())
      .put(bnw.bu, cfk.gk().a())
      .put(bnw.bv, cfm.gq().a())
      .build();

   public static bpo a(bnw<? extends boi> $$0) {
      return b.get($$0);
   }

   public static boolean b(bnw<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kf.g.s().filter($$0 -> $$0.f() != bol.h).filter($$0 -> !b((bnw<?>)$$0)).map(kf.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
