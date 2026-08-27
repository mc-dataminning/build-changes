import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bpm {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bnu<? extends bog>, bpk> b = ImmutableMap.builder()
      .put(bnu.b, cax.u().a())
      .put(bnu.d, cba.u().a())
      .put(bnu.e, cdi.u().a())
      .put(bnu.g, cbd.gn().a())
      .put(bnu.h, bzo.u().a())
      .put(bnu.i, bzu.gs().a())
      .put(bnu.j, cdx.u().a())
      .put(bnu.o, bzw.gs().a())
      .put(bnu.n, cbi.u().a())
      .put(bnu.p, cdy.u().a())
      .put(bnu.s, bzy.u().a())
      .put(bnu.t, bzq.u().a())
      .put(bnu.v, caa.u().a())
      .put(bnu.w, cdz.u().a())
      .put(bnu.x, cab.gg().a())
      .put(bnu.y, cbu.u().a())
      .put(bnu.A, ceb.u().a())
      .put(bnu.C, cec.u().a())
      .put(bnu.G, ced.u().a())
      .put(bnu.H, cee.u().a())
      .put(bnu.E, ccm.w().a())
      .put(bnu.I, ceg.w().a())
      .put(bnu.m, cfj.u().a())
      .put(bnu.P, cad.u().a())
      .put(bnu.Q, cbl.gg().a())
      .put(bnu.S, ceh.A().a())
      .put(bnu.T, cei.u().a())
      .put(bnu.V, bny.gg().a())
      .put(bnu.W, cbr.w().a())
      .put(bnu.X, cej.gg().a())
      .put(bnu.Y, cfr.u().a())
      .put(bnu.aa, cbv.gG().a())
      .put(bnu.ab, cfg.gk().a())
      .put(bnu.ac, cel.w().a())
      .put(bnu.ae, caf.u().a())
      .put(bnu.al, cby.gr().a())
      .put(bnu.an, cem.u().a())
      .put(bnu.aq, caa.u().a())
      .put(bnu.ar, cbu.u().a())
      .put(bnu.as, cah.u().a())
      .put(bnu.au, cai.gr().a())
      .put(bnu.av, caj.gm().a())
      .put(bnu.aw, cen.gm().a())
      .put(bnu.ax, cak.u().a())
      .put(bnu.ay, cfx.gn().a())
      .put(bnu.az, cga.A().a())
      .put(bnu.aA, ceq.w().a())
      .put(bnu.bw, chh.fH().a())
      .put(bnu.aB, cal.u().a())
      .put(bnu.aD, bzq.u().a())
      .put(bnu.aE, can.w().a())
      .put(bnu.aF, ces.u().a())
      .put(bnu.aG, bzq.u().a())
      .put(bnu.aH, cap.u().a())
      .put(bnu.aI, cet.u().a())
      .put(bnu.aK, ceu.u().a())
      .put(bnu.aL, cdw.u().a())
      .put(bnu.aM, ccb.u().a())
      .put(bnu.aN, cen.gm().a())
      .put(bnu.aP, cci.u().a())
      .put(bnu.aQ, car.u().a())
      .put(bnu.aU, cey.w().a())
      .put(bnu.aV, cas.gg().a())
      .put(bnu.aW, cdw.u().a())
      .put(bnu.aX, cfa.w().a())
      .put(bnu.aY, cbo.gi().a())
      .put(bnu.bc, cby.gr().a())
      .put(bnu.be, bzq.u().a())
      .put(bnu.bf, cau.A().a())
      .put(bnu.bg, cfb.u().a())
      .put(bnu.bh, cgu.gp().a())
      .put(bnu.bi, cfc.w().a())
      .put(bnu.bk, cgl.u().a())
      .put(bnu.bj, boi.C().a())
      .put(bnu.bm, cfd.w().a())
      .put(bnu.bn, cdg.w().a())
      .put(bnu.bo, cdw.u().a())
      .put(bnu.bq, caw.gm().a())
      .put(bnu.br, cff.u().a())
      .put(bnu.bs, cfg.gk().a())
      .put(bnu.bt, ccf.u().a())
      .put(bnu.bu, cfg.gk().a())
      .put(bnu.bv, cfi.gq().a())
      .build();

   public static bpk a(bnu<? extends bog> $$0) {
      return b.get($$0);
   }

   public static boolean b(bnu<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kf.g.s().filter($$0 -> $$0.f() != boj.h).filter($$0 -> !b((bnu<?>)$$0)).map(kf.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
