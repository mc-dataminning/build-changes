import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bwq {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bus<? extends bvh>, bwo> b = ImmutableMap.builder()
      .put(bus.c, cie.n().a())
      .put(bus.e, cih.n().a())
      .put(bus.f, ckr.n().a())
      .put(bus.h, cik.go().a())
      .put(bus.k, cgs.n().a())
      .put(bus.l, cgz.gA().a())
      .put(bus.o, clh.n().a())
      .put(bus.q, cli.gp().a())
      .put(bus.u, chb.gC().a())
      .put(bus.t, cip.n().a())
      .put(bus.v, clj.n().a())
      .put(bus.z, chd.n().a())
      .put(bus.A, cgu.n().a())
      .put(bus.C, chf.n().a())
      .put(bus.D, clk.n().a())
      .put(bus.G, chg.gm().a())
      .put(bus.H, cjb.n().a())
      .put(bus.J, clm.n().a())
      .put(bus.L, cln.n().a())
      .put(bus.M, clo.n().a())
      .put(bus.N, clp.n().a())
      .put(bus.O, cjv.q().a())
      .put(bus.R, clr.q().a())
      .put(bus.r, cmu.n().a())
      .put(bus.Z, chi.n().a())
      .put(bus.aa, cis.gm().a())
      .put(bus.ac, cls.v().a())
      .put(bus.ad, clt.n().a())
      .put(bus.af, buz.gm().a())
      .put(bus.ag, ciy.q().a())
      .put(bus.ah, clu.gm().a())
      .put(bus.ai, cnc.n().a())
      .put(bus.ak, cjc.gO().a())
      .put(bus.al, cmr.gq().a())
      .put(bus.am, clw.q().a())
      .put(bus.ao, chk.n().a())
      .put(bus.aw, cjf.gy().a())
      .put(bus.ay, clx.n().a())
      .put(bus.aD, chf.n().a())
      .put(bus.aE, cjb.n().a())
      .put(bus.aH, chm.n().a())
      .put(bus.aK, chn.gz().a())
      .put(bus.aL, cho.gy().a())
      .put(bus.aM, cly.gs().a())
      .put(bus.aN, chp.n().a())
      .put(bus.aO, cni.gt().a())
      .put(bus.aP, cnl.v().a())
      .put(bus.aQ, cmb.q().a())
      .put(bus.bO, cou.fV().a())
      .put(bus.aR, chq.n().a())
      .put(bus.aT, cgu.n().a())
      .put(bus.aU, chs.q().a())
      .put(bus.aV, cmd.n().a())
      .put(bus.aW, cgu.n().a())
      .put(bus.aX, chu.n().a())
      .put(bus.aY, cme.n().a())
      .put(bus.ba, cmf.n().a())
      .put(bus.bb, clg.n().a())
      .put(bus.bc, cji.n().a())
      .put(bus.bd, cly.gs().a())
      .put(bus.bf, cjp.n().a())
      .put(bus.bh, chw.n().a())
      .put(bus.bk, cmj.q().a())
      .put(bus.bn, chx.gm().a())
      .put(bus.bo, clg.n().a())
      .put(bus.bp, cml.q().a())
      .put(bus.bq, civ.go().a())
      .put(bus.bu, cjf.gy().a())
      .put(bus.bw, cgu.n().a())
      .put(bus.bx, chz.v().a())
      .put(bus.by, cmm.n().a())
      .put(bus.bz, cof.gv().a())
      .put(bus.bA, cmn.q().a())
      .put(bus.bC, cnw.n().a())
      .put(bus.bB, bvj.C().a())
      .put(bus.bE, cmo.q().a())
      .put(bus.bF, ckp.q().a())
      .put(bus.bG, clg.n().a())
      .put(bus.bI, cib.gA().a())
      .put(bus.bJ, cmq.n().a())
      .put(bus.bK, cmr.gq().a())
      .put(bus.bL, cjm.n().a())
      .put(bus.bM, cmr.gq().a())
      .put(bus.bN, cmt.gw().a())
      .build();

   public static bwo a(bus<? extends bvh> $$0) {
      return b.get($$0);
   }

   public static boolean b(bus<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lz.f.s().filter($$0 -> $$0.f() != bvk.h).filter($$0 -> !b((bus<?>)$$0)).map(lz.f::b).forEach($$0 -> ae.b("Entity " + $$0 + " has no attributes"));
   }
}
