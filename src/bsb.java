import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bsb {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bqg<? extends bqt>, brz> b = ImmutableMap.builder()
      .put(bqg.a, cdo.r().a())
      .put(bqg.c, cdr.r().a())
      .put(bqg.d, cga.r().a())
      .put(bqg.f, cdu.gu().a())
      .put(bqg.g, ccd.r().a())
      .put(bqg.h, ccj.gz().a())
      .put(bqg.i, cgp.r().a())
      .put(bqg.l, cgq.gq().a())
      .put(bqg.p, ccl.gz().a())
      .put(bqg.o, cdz.r().a())
      .put(bqg.q, cgr.r().a())
      .put(bqg.t, ccn.r().a())
      .put(bqg.u, ccf.r().a())
      .put(bqg.w, ccp.r().a())
      .put(bqg.x, cgs.r().a())
      .put(bqg.y, ccq.gn().a())
      .put(bqg.z, cel.r().a())
      .put(bqg.B, cgu.r().a())
      .put(bqg.D, cgv.r().a())
      .put(bqg.H, cgw.r().a())
      .put(bqg.I, cgx.r().a())
      .put(bqg.F, cfe.u().a())
      .put(bqg.J, cgz.u().a())
      .put(bqg.m, cic.r().a())
      .put(bqg.Q, ccs.r().a())
      .put(bqg.R, cec.gn().a())
      .put(bqg.T, cha.y().a())
      .put(bqg.U, chb.r().a())
      .put(bqg.W, bql.gn().a())
      .put(bqg.X, cei.u().a())
      .put(bqg.Y, chc.gn().a())
      .put(bqg.Z, cik.r().a())
      .put(bqg.ab, cem.gM().a())
      .put(bqg.ac, chz.gr().a())
      .put(bqg.ad, che.u().a())
      .put(bqg.af, ccu.r().a())
      .put(bqg.am, cep.gy().a())
      .put(bqg.ao, chf.r().a())
      .put(bqg.ar, ccp.r().a())
      .put(bqg.as, cel.r().a())
      .put(bqg.at, ccw.r().a())
      .put(bqg.av, ccx.gy().a())
      .put(bqg.aw, ccy.gt().a())
      .put(bqg.ax, chg.gt().a())
      .put(bqg.ay, ccz.r().a())
      .put(bqg.az, ciq.gu().a())
      .put(bqg.aA, cit.y().a())
      .put(bqg.aB, chj.u().a())
      .put(bqg.bx, cka.fN().a())
      .put(bqg.aC, cda.r().a())
      .put(bqg.aE, ccf.r().a())
      .put(bqg.aF, cdc.u().a())
      .put(bqg.aG, chl.r().a())
      .put(bqg.aH, ccf.r().a())
      .put(bqg.aI, cde.r().a())
      .put(bqg.aJ, chm.r().a())
      .put(bqg.aL, chn.r().a())
      .put(bqg.aM, cgo.r().a())
      .put(bqg.aN, ces.r().a())
      .put(bqg.aO, chg.gt().a())
      .put(bqg.aQ, cez.r().a())
      .put(bqg.aR, cdg.r().a())
      .put(bqg.aV, chr.u().a())
      .put(bqg.aW, cdh.gn().a())
      .put(bqg.aX, cgo.r().a())
      .put(bqg.aY, cht.u().a())
      .put(bqg.aZ, cef.gp().a())
      .put(bqg.bd, cep.gy().a())
      .put(bqg.bf, ccf.r().a())
      .put(bqg.bg, cdj.y().a())
      .put(bqg.bh, chu.r().a())
      .put(bqg.bi, cjn.gw().a())
      .put(bqg.bj, chv.u().a())
      .put(bqg.bl, cje.r().a())
      .put(bqg.bk, bqv.A().a())
      .put(bqg.bn, chw.u().a())
      .put(bqg.bo, cfy.u().a())
      .put(bqg.bp, cgo.r().a())
      .put(bqg.br, cdl.gv().a())
      .put(bqg.bs, chy.r().a())
      .put(bqg.bt, chz.gr().a())
      .put(bqg.bu, cew.r().a())
      .put(bqg.bv, chz.gr().a())
      .put(bqg.bw, cib.gx().a())
      .build();

   public static brz a(bqg<? extends bqt> $$0) {
      return b.get($$0);
   }

   public static boolean b(bqg<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kt.g.s().filter($$0 -> $$0.f() != bqw.h).filter($$0 -> !b((bqg<?>)$$0)).map(kt.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
