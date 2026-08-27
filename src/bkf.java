import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bkf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bim<? extends biy>, bkd> b = ImmutableMap.builder()
      .put(bim.b, bvn.p().a())
      .put(bim.d, biy.dO().a())
      .put(bim.f, bvq.gh().a())
      .put(bim.g, bue.p().a())
      .put(bim.h, buk.gm().a())
      .put(bim.i, byk.p().a())
      .put(bim.m, bum.gm().a())
      .put(bim.l, bvv.p().a())
      .put(bim.n, byl.p().a())
      .put(bim.q, buo.p().a())
      .put(bim.r, bug.p().a())
      .put(bim.t, buq.p().a())
      .put(bim.u, bym.p().a())
      .put(bim.v, bur.ga().a())
      .put(bim.w, bwh.p().a())
      .put(bim.y, bzt.ge().a())
      .put(bim.A, byp.p().a())
      .put(bim.E, byq.p().a())
      .put(bim.F, byr.p().a())
      .put(bim.C, bwz.q().a())
      .put(bim.G, byt.q().a())
      .put(bim.N, but.p().a())
      .put(bim.O, bvy.ga().a())
      .put(bim.Q, byu.t().a())
      .put(bim.R, byv.p().a())
      .put(bim.T, biq.ga().a())
      .put(bim.U, bwe.q().a())
      .put(bim.V, byw.ga().a())
      .put(bim.W, bzw.p().a())
      .put(bim.Y, bwi.gA().a())
      .put(bim.Z, bzt.ge().a())
      .put(bim.aa, byy.q().a())
      .put(bim.ac, buv.p().a())
      .put(bim.aj, bwl.gl().a())
      .put(bim.al, byz.p().a())
      .put(bim.ao, buq.p().a())
      .put(bim.ap, bwh.p().a())
      .put(bim.aq, bux.p().a())
      .put(bim.as, buy.gl().a())
      .put(bim.at, buz.gg().a())
      .put(bim.au, bza.gg().a())
      .put(bim.av, bva.p().a())
      .put(bim.aw, cac.gh().a())
      .put(bim.ax, caf.t().a())
      .put(bim.ay, bzd.q().a())
      .put(bim.bt, cbm.fF().a())
      .put(bim.az, bvb.p().a())
      .put(bim.aB, bug.p().a())
      .put(bim.aC, bvd.q().a())
      .put(bim.aD, bzf.p().a())
      .put(bim.aE, bug.p().a())
      .put(bim.aF, bvf.p().a())
      .put(bim.aG, bzg.p().a())
      .put(bim.aI, bzh.p().a())
      .put(bim.aJ, byj.p().a())
      .put(bim.aK, bwo.p().a())
      .put(bim.aL, bza.gg().a())
      .put(bim.aN, bwv.p().a())
      .put(bim.aO, bvh.p().a())
      .put(bim.aS, bzl.q().a())
      .put(bim.aT, bvi.ga().a())
      .put(bim.aU, byj.p().a())
      .put(bim.aV, bzn.q().a())
      .put(bim.aW, bwb.gc().a())
      .put(bim.ba, bwl.gl().a())
      .put(bim.bc, bug.p().a())
      .put(bim.bd, bvk.t().a())
      .put(bim.be, bzo.p().a())
      .put(bim.bf, caz.gj().a())
      .put(bim.bg, bzp.q().a())
      .put(bim.bi, caq.p().a())
      .put(bim.bh, bja.x().a())
      .put(bim.bj, bzq.q().a())
      .put(bim.bk, bxt.q().a())
      .put(bim.bl, byj.p().a())
      .put(bim.bn, bvm.gg().a())
      .put(bim.bo, bzs.p().a())
      .put(bim.bp, bzt.ge().a())
      .put(bim.bq, bws.p().a())
      .put(bim.br, bzt.ge().a())
      .put(bim.bs, bzv.gk().a())
      .build();

   public static bkd a(bim<? extends biy> $$0) {
      return b.get($$0);
   }

   public static boolean b(bim<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jb.h.s().filter($$0 -> $$0.f() != bjb.h).filter($$0 -> !b((bim<?>)$$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
