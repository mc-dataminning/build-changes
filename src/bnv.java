import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bnv {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bmc<? extends bmo>, bnt> b = ImmutableMap.builder()
      .put(bmc.b, bzg.u().a())
      .put(bmc.d, bzj.u().a())
      .put(bmc.e, cbr.u().a())
      .put(bmc.g, bzm.gm().a())
      .put(bmc.h, bxx.u().a())
      .put(bmc.i, byd.gr().a())
      .put(bmc.j, ccg.u().a())
      .put(bmc.o, byf.gr().a())
      .put(bmc.n, bzr.u().a())
      .put(bmc.p, cch.u().a())
      .put(bmc.s, byh.u().a())
      .put(bmc.t, bxz.u().a())
      .put(bmc.v, byj.u().a())
      .put(bmc.w, cci.u().a())
      .put(bmc.x, byk.gf().a())
      .put(bmc.y, cad.u().a())
      .put(bmc.A, cck.u().a())
      .put(bmc.C, ccl.u().a())
      .put(bmc.G, ccm.u().a())
      .put(bmc.H, ccn.u().a())
      .put(bmc.E, cav.w().a())
      .put(bmc.I, ccp.w().a())
      .put(bmc.m, cds.u().a())
      .put(bmc.P, bym.u().a())
      .put(bmc.Q, bzu.gf().a())
      .put(bmc.S, ccq.A().a())
      .put(bmc.T, ccr.u().a())
      .put(bmc.V, bmg.gf().a())
      .put(bmc.W, caa.w().a())
      .put(bmc.X, ccs.gf().a())
      .put(bmc.Y, cea.u().a())
      .put(bmc.aa, cae.gF().a())
      .put(bmc.ab, cdp.gj().a())
      .put(bmc.ac, ccu.w().a())
      .put(bmc.ae, byo.u().a())
      .put(bmc.al, cah.gq().a())
      .put(bmc.an, ccv.u().a())
      .put(bmc.aq, byj.u().a())
      .put(bmc.ar, cad.u().a())
      .put(bmc.as, byq.u().a())
      .put(bmc.au, byr.gq().a())
      .put(bmc.av, bys.gl().a())
      .put(bmc.aw, ccw.gl().a())
      .put(bmc.ax, byt.u().a())
      .put(bmc.ay, ceg.gm().a())
      .put(bmc.az, cej.A().a())
      .put(bmc.aA, ccz.w().a())
      .put(bmc.bw, cfq.fH().a())
      .put(bmc.aB, byu.u().a())
      .put(bmc.aD, bxz.u().a())
      .put(bmc.aE, byw.w().a())
      .put(bmc.aF, cdb.u().a())
      .put(bmc.aG, bxz.u().a())
      .put(bmc.aH, byy.u().a())
      .put(bmc.aI, cdc.u().a())
      .put(bmc.aK, cdd.u().a())
      .put(bmc.aL, ccf.u().a())
      .put(bmc.aM, cak.u().a())
      .put(bmc.aN, ccw.gl().a())
      .put(bmc.aP, car.u().a())
      .put(bmc.aQ, bza.u().a())
      .put(bmc.aU, cdh.w().a())
      .put(bmc.aV, bzb.gf().a())
      .put(bmc.aW, ccf.u().a())
      .put(bmc.aX, cdj.w().a())
      .put(bmc.aY, bzx.gh().a())
      .put(bmc.bc, cah.gq().a())
      .put(bmc.be, bxz.u().a())
      .put(bmc.bf, bzd.A().a())
      .put(bmc.bg, cdk.u().a())
      .put(bmc.bh, cfd.go().a())
      .put(bmc.bi, cdl.w().a())
      .put(bmc.bk, ceu.u().a())
      .put(bmc.bj, bmq.C().a())
      .put(bmc.bm, cdm.w().a())
      .put(bmc.bn, cbp.w().a())
      .put(bmc.bo, ccf.u().a())
      .put(bmc.bq, bzf.gl().a())
      .put(bmc.br, cdo.u().a())
      .put(bmc.bs, cdp.gj().a())
      .put(bmc.bt, cao.u().a())
      .put(bmc.bu, cdp.gj().a())
      .put(bmc.bv, cdr.gp().a())
      .build();

   public static bnt a(bmc<? extends bmo> $$0) {
      return b.get($$0);
   }

   public static boolean b(bmc<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kd.g.s().filter($$0 -> $$0.f() != bmr.h).filter($$0 -> !b((bmc<?>)$$0)).map(kd.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
