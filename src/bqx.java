import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bqx {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bpd<? extends bpp>, bqv> b = ImmutableMap.builder()
      .put(bpd.b, cci.r().a())
      .put(bpd.d, ccl.r().a())
      .put(bpd.e, ceu.r().a())
      .put(bpd.g, cco.gu().a())
      .put(bpd.h, caz.r().a())
      .put(bpd.i, cbf.gz().a())
      .put(bpd.j, cfj.r().a())
      .put(bpd.m, cfk.gq().a())
      .put(bpd.q, cbh.gz().a())
      .put(bpd.p, cct.r().a())
      .put(bpd.r, cfl.r().a())
      .put(bpd.u, cbj.r().a())
      .put(bpd.v, cbb.r().a())
      .put(bpd.x, cbl.r().a())
      .put(bpd.y, cfm.r().a())
      .put(bpd.z, cbm.gn().a())
      .put(bpd.A, cdf.r().a())
      .put(bpd.C, cfo.r().a())
      .put(bpd.E, cfp.r().a())
      .put(bpd.I, cfq.r().a())
      .put(bpd.J, cfr.r().a())
      .put(bpd.G, cdy.s().a())
      .put(bpd.K, cft.s().a())
      .put(bpd.n, cgw.r().a())
      .put(bpd.R, cbo.r().a())
      .put(bpd.S, ccw.gn().a())
      .put(bpd.U, cfu.y().a())
      .put(bpd.V, cfv.r().a())
      .put(bpd.X, bph.gn().a())
      .put(bpd.Y, cdc.s().a())
      .put(bpd.Z, cfw.gn().a())
      .put(bpd.aa, che.r().a())
      .put(bpd.ac, cdg.gM().a())
      .put(bpd.ad, cgt.gr().a())
      .put(bpd.ae, cfy.s().a())
      .put(bpd.ag, cbq.r().a())
      .put(bpd.an, cdj.gy().a())
      .put(bpd.ap, cfz.r().a())
      .put(bpd.as, cbl.r().a())
      .put(bpd.at, cdf.r().a())
      .put(bpd.au, cbs.r().a())
      .put(bpd.aw, cbt.gy().a())
      .put(bpd.ax, cbu.gt().a())
      .put(bpd.ay, cga.gt().a())
      .put(bpd.az, cbv.r().a())
      .put(bpd.aA, chk.gu().a())
      .put(bpd.aB, chn.y().a())
      .put(bpd.aC, cgd.s().a())
      .put(bpd.by, ciu.fN().a())
      .put(bpd.aD, cbw.r().a())
      .put(bpd.aF, cbb.r().a())
      .put(bpd.aG, cby.s().a())
      .put(bpd.aH, cgf.r().a())
      .put(bpd.aI, cbb.r().a())
      .put(bpd.aJ, cca.r().a())
      .put(bpd.aK, cgg.r().a())
      .put(bpd.aM, cgh.r().a())
      .put(bpd.aN, cfi.r().a())
      .put(bpd.aO, cdm.r().a())
      .put(bpd.aP, cga.gt().a())
      .put(bpd.aR, cdt.r().a())
      .put(bpd.aS, ccc.r().a())
      .put(bpd.aW, cgl.s().a())
      .put(bpd.aX, ccd.gn().a())
      .put(bpd.aY, cfi.r().a())
      .put(bpd.aZ, cgn.s().a())
      .put(bpd.ba, ccz.gp().a())
      .put(bpd.be, cdj.gy().a())
      .put(bpd.bg, cbb.r().a())
      .put(bpd.bh, ccf.y().a())
      .put(bpd.bi, cgo.r().a())
      .put(bpd.bj, cih.gw().a())
      .put(bpd.bk, cgp.s().a())
      .put(bpd.bm, chy.r().a())
      .put(bpd.bl, bpr.A().a())
      .put(bpd.bo, cgq.s().a())
      .put(bpd.bp, ces.s().a())
      .put(bpd.bq, cfi.r().a())
      .put(bpd.bs, cch.gt().a())
      .put(bpd.bt, cgs.r().a())
      .put(bpd.bu, cgt.gr().a())
      .put(bpd.bv, cdq.r().a())
      .put(bpd.bw, cgt.gr().a())
      .put(bpd.bx, cgv.gx().a())
      .build();

   public static bqv a(bpd<? extends bpp> $$0) {
      return b.get($$0);
   }

   public static boolean b(bpd<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      ki.g.s().filter($$0 -> $$0.f() != bps.h).filter($$0 -> !b((bpd<?>)$$0)).map(ki.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
