import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bkg {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bim<? extends biy>, bke> b = ImmutableMap.builder()
      .put(bim.b, bvo.p().a())
      .put(bim.d, biy.dO().a())
      .put(bim.f, bvr.gg().a())
      .put(bim.g, buf.p().a())
      .put(bim.h, bul.gl().a())
      .put(bim.i, byl.p().a())
      .put(bim.m, bun.gl().a())
      .put(bim.l, bvw.p().a())
      .put(bim.n, bym.p().a())
      .put(bim.q, bup.p().a())
      .put(bim.r, buh.p().a())
      .put(bim.t, bur.p().a())
      .put(bim.u, byn.p().a())
      .put(bim.v, bus.fZ().a())
      .put(bim.w, bwi.p().a())
      .put(bim.y, bzu.gd().a())
      .put(bim.A, byq.p().a())
      .put(bim.E, byr.p().a())
      .put(bim.F, bys.p().a())
      .put(bim.C, bxa.q().a())
      .put(bim.G, byu.q().a())
      .put(bim.N, buu.p().a())
      .put(bim.O, bvz.fZ().a())
      .put(bim.Q, byv.t().a())
      .put(bim.R, byw.p().a())
      .put(bim.T, biq.fZ().a())
      .put(bim.U, bwf.q().a())
      .put(bim.V, byx.fZ().a())
      .put(bim.W, bzx.p().a())
      .put(bim.Y, bwj.gz().a())
      .put(bim.Z, bzu.gd().a())
      .put(bim.aa, byz.q().a())
      .put(bim.ac, buw.p().a())
      .put(bim.aj, bwm.gk().a())
      .put(bim.al, bza.p().a())
      .put(bim.ao, bur.p().a())
      .put(bim.ap, bwi.p().a())
      .put(bim.aq, buy.p().a())
      .put(bim.as, buz.gk().a())
      .put(bim.at, bva.gf().a())
      .put(bim.au, bzb.gf().a())
      .put(bim.av, bvb.p().a())
      .put(bim.aw, cad.gg().a())
      .put(bim.ax, cag.t().a())
      .put(bim.ay, bze.q().a())
      .put(bim.bt, cbn.fF().a())
      .put(bim.az, bvc.p().a())
      .put(bim.aB, buh.p().a())
      .put(bim.aC, bve.q().a())
      .put(bim.aD, bzg.p().a())
      .put(bim.aE, buh.p().a())
      .put(bim.aF, bvg.p().a())
      .put(bim.aG, bzh.p().a())
      .put(bim.aI, bzi.p().a())
      .put(bim.aJ, byk.p().a())
      .put(bim.aK, bwp.p().a())
      .put(bim.aL, bzb.gf().a())
      .put(bim.aN, bww.p().a())
      .put(bim.aO, bvi.p().a())
      .put(bim.aS, bzm.q().a())
      .put(bim.aT, bvj.fZ().a())
      .put(bim.aU, byk.p().a())
      .put(bim.aV, bzo.q().a())
      .put(bim.aW, bwc.gb().a())
      .put(bim.ba, bwm.gk().a())
      .put(bim.bc, buh.p().a())
      .put(bim.bd, bvl.t().a())
      .put(bim.be, bzp.p().a())
      .put(bim.bf, cba.gi().a())
      .put(bim.bg, bzq.q().a())
      .put(bim.bi, car.p().a())
      .put(bim.bh, bja.x().a())
      .put(bim.bj, bzr.q().a())
      .put(bim.bk, bxu.q().a())
      .put(bim.bl, byk.p().a())
      .put(bim.bn, bvn.gf().a())
      .put(bim.bo, bzt.p().a())
      .put(bim.bp, bzu.gd().a())
      .put(bim.bq, bwt.p().a())
      .put(bim.br, bzu.gd().a())
      .put(bim.bs, bzw.gj().a())
      .build();

   public static bke a(bim<? extends biy> $$0) {
      return b.get($$0);
   }

   public static boolean b(bim<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jb.h.s().filter($$0 -> $$0.f() != bjb.h).filter($$0 -> !b((bim<?>)$$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
