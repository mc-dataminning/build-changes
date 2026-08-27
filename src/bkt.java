import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bkt {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bja<? extends bjm>, bkr> b = ImmutableMap.builder()
      .put(bja.b, bwb.s().a())
      .put(bja.d, bjm.dP().a())
      .put(bja.f, bwe.gl().a())
      .put(bja.g, bus.s().a())
      .put(bja.h, buy.gq().a())
      .put(bja.i, byy.s().a())
      .put(bja.m, bva.gq().a())
      .put(bja.l, bwj.s().a())
      .put(bja.n, byz.s().a())
      .put(bja.q, bvc.s().a())
      .put(bja.r, buu.s().a())
      .put(bja.t, bve.s().a())
      .put(bja.u, bza.s().a())
      .put(bja.v, bvf.ge().a())
      .put(bja.w, bwv.s().a())
      .put(bja.y, cah.gi().a())
      .put(bja.A, bzd.s().a())
      .put(bja.E, bze.s().a())
      .put(bja.F, bzf.s().a())
      .put(bja.C, bxn.t().a())
      .put(bja.G, bzh.t().a())
      .put(bja.N, bvh.s().a())
      .put(bja.O, bwm.ge().a())
      .put(bja.Q, bzi.y().a())
      .put(bja.R, bzj.s().a())
      .put(bja.T, bje.ge().a())
      .put(bja.U, bws.t().a())
      .put(bja.V, bzk.ge().a())
      .put(bja.W, cak.s().a())
      .put(bja.Y, bww.gE().a())
      .put(bja.Z, cah.gi().a())
      .put(bja.aa, bzm.t().a())
      .put(bja.ac, bvj.s().a())
      .put(bja.aj, bwz.gp().a())
      .put(bja.al, bzn.s().a())
      .put(bja.ao, bve.s().a())
      .put(bja.ap, bwv.s().a())
      .put(bja.aq, bvl.s().a())
      .put(bja.as, bvm.gp().a())
      .put(bja.at, bvn.gk().a())
      .put(bja.au, bzo.gk().a())
      .put(bja.av, bvo.s().a())
      .put(bja.aw, caq.gl().a())
      .put(bja.ax, cat.y().a())
      .put(bja.ay, bzr.t().a())
      .put(bja.bt, cca.fH().a())
      .put(bja.az, bvp.s().a())
      .put(bja.aB, buu.s().a())
      .put(bja.aC, bvr.t().a())
      .put(bja.aD, bzt.s().a())
      .put(bja.aE, buu.s().a())
      .put(bja.aF, bvt.s().a())
      .put(bja.aG, bzu.s().a())
      .put(bja.aI, bzv.s().a())
      .put(bja.aJ, byx.s().a())
      .put(bja.aK, bxc.s().a())
      .put(bja.aL, bzo.gk().a())
      .put(bja.aN, bxj.s().a())
      .put(bja.aO, bvv.s().a())
      .put(bja.aS, bzz.t().a())
      .put(bja.aT, bvw.ge().a())
      .put(bja.aU, byx.s().a())
      .put(bja.aV, cab.t().a())
      .put(bja.aW, bwp.gg().a())
      .put(bja.ba, bwz.gp().a())
      .put(bja.bc, buu.s().a())
      .put(bja.bd, bvy.y().a())
      .put(bja.be, cac.s().a())
      .put(bja.bf, cbn.gn().a())
      .put(bja.bg, cad.t().a())
      .put(bja.bi, cbe.s().a())
      .put(bja.bh, bjo.A().a())
      .put(bja.bj, cae.t().a())
      .put(bja.bk, byh.t().a())
      .put(bja.bl, byx.s().a())
      .put(bja.bn, bwa.gk().a())
      .put(bja.bo, cag.s().a())
      .put(bja.bp, cah.gi().a())
      .put(bja.bq, bxg.s().a())
      .put(bja.br, cah.gi().a())
      .put(bja.bs, caj.go().a())
      .build();

   public static bkr a(bja<? extends bjm> $$0) {
      return b.get($$0);
   }

   public static boolean b(bja<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jb.h.s().filter($$0 -> $$0.f() != bjp.h).filter($$0 -> !b((bja<?>)$$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
