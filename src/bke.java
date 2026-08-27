import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bke {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bik<? extends biw>, bkc> b = ImmutableMap.builder()
      .put(bik.b, bvm.p().a())
      .put(bik.d, biw.dO().a())
      .put(bik.f, bvp.gg().a())
      .put(bik.g, bud.p().a())
      .put(bik.h, buj.gl().a())
      .put(bik.i, byj.p().a())
      .put(bik.m, bul.gl().a())
      .put(bik.l, bvu.p().a())
      .put(bik.n, byk.p().a())
      .put(bik.q, bun.p().a())
      .put(bik.r, buf.p().a())
      .put(bik.t, bup.p().a())
      .put(bik.u, byl.p().a())
      .put(bik.v, buq.fZ().a())
      .put(bik.w, bwg.p().a())
      .put(bik.y, bzs.gd().a())
      .put(bik.A, byo.p().a())
      .put(bik.E, byp.p().a())
      .put(bik.F, byq.p().a())
      .put(bik.C, bwy.q().a())
      .put(bik.G, bys.q().a())
      .put(bik.N, bus.p().a())
      .put(bik.O, bvx.fZ().a())
      .put(bik.Q, byt.t().a())
      .put(bik.R, byu.p().a())
      .put(bik.T, bio.fZ().a())
      .put(bik.U, bwd.q().a())
      .put(bik.V, byv.fZ().a())
      .put(bik.W, bzv.p().a())
      .put(bik.Y, bwh.gz().a())
      .put(bik.Z, bzs.gd().a())
      .put(bik.aa, byx.q().a())
      .put(bik.ac, buu.p().a())
      .put(bik.aj, bwk.gk().a())
      .put(bik.al, byy.p().a())
      .put(bik.ao, bup.p().a())
      .put(bik.ap, bwg.p().a())
      .put(bik.aq, buw.p().a())
      .put(bik.as, bux.gk().a())
      .put(bik.at, buy.gf().a())
      .put(bik.au, byz.gf().a())
      .put(bik.av, buz.p().a())
      .put(bik.aw, cab.gg().a())
      .put(bik.ax, cae.t().a())
      .put(bik.ay, bzc.q().a())
      .put(bik.bt, cbl.fF().a())
      .put(bik.az, bva.p().a())
      .put(bik.aB, buf.p().a())
      .put(bik.aC, bvc.q().a())
      .put(bik.aD, bze.p().a())
      .put(bik.aE, buf.p().a())
      .put(bik.aF, bve.p().a())
      .put(bik.aG, bzf.p().a())
      .put(bik.aI, bzg.p().a())
      .put(bik.aJ, byi.p().a())
      .put(bik.aK, bwn.p().a())
      .put(bik.aL, byz.gf().a())
      .put(bik.aN, bwu.p().a())
      .put(bik.aO, bvg.p().a())
      .put(bik.aS, bzk.q().a())
      .put(bik.aT, bvh.fZ().a())
      .put(bik.aU, byi.p().a())
      .put(bik.aV, bzm.q().a())
      .put(bik.aW, bwa.gb().a())
      .put(bik.ba, bwk.gk().a())
      .put(bik.bc, buf.p().a())
      .put(bik.bd, bvj.t().a())
      .put(bik.be, bzn.p().a())
      .put(bik.bf, cay.gi().a())
      .put(bik.bg, bzo.q().a())
      .put(bik.bi, cap.p().a())
      .put(bik.bh, biy.x().a())
      .put(bik.bj, bzp.q().a())
      .put(bik.bk, bxs.q().a())
      .put(bik.bl, byi.p().a())
      .put(bik.bn, bvl.gf().a())
      .put(bik.bo, bzr.p().a())
      .put(bik.bp, bzs.gd().a())
      .put(bik.bq, bwr.p().a())
      .put(bik.br, bzs.gd().a())
      .put(bik.bs, bzu.gj().a())
      .build();

   public static bkc a(bik<? extends biw> $$0) {
      return b.get($$0);
   }

   public static boolean b(bik<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jc.h.s().filter($$0 -> $$0.f() != biz.h).filter($$0 -> !b((bik<?>)$$0)).map(jc.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
