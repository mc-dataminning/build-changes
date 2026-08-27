import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bhh {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bfn<? extends bfz>, bhf> b = ImmutableMap.builder()
      .put(bfn.b, bsp.q().a())
      .put(bfn.d, bfz.dM().a())
      .put(bfn.f, bss.gf().a())
      .put(bfn.g, brg.q().a())
      .put(bfn.h, brm.gk().a())
      .put(bfn.i, bvm.q().a())
      .put(bfn.m, bro.gk().a())
      .put(bfn.l, bsx.q().a())
      .put(bfn.n, bvn.q().a())
      .put(bfn.q, brq.q().a())
      .put(bfn.r, bri.q().a())
      .put(bfn.t, brs.q().a())
      .put(bfn.u, bvo.q().a())
      .put(bfn.v, brt.fY().a())
      .put(bfn.w, btj.q().a())
      .put(bfn.y, bwv.gc().a())
      .put(bfn.A, bvr.q().a())
      .put(bfn.E, bvs.q().a())
      .put(bfn.F, bvt.q().a())
      .put(bfn.C, bub.r().a())
      .put(bfn.G, bvv.r().a())
      .put(bfn.N, brv.q().a())
      .put(bfn.O, bta.fY().a())
      .put(bfn.Q, bvw.w().a())
      .put(bfn.R, bvx.q().a())
      .put(bfn.T, bfr.fY().a())
      .put(bfn.U, btg.r().a())
      .put(bfn.V, bvy.fY().a())
      .put(bfn.W, bwy.q().a())
      .put(bfn.Y, btk.gy().a())
      .put(bfn.Z, bwv.gc().a())
      .put(bfn.aa, bwa.r().a())
      .put(bfn.ac, brx.q().a())
      .put(bfn.aj, btn.gj().a())
      .put(bfn.al, bwb.q().a())
      .put(bfn.ao, brs.q().a())
      .put(bfn.ap, btj.q().a())
      .put(bfn.aq, brz.q().a())
      .put(bfn.as, bsa.gj().a())
      .put(bfn.at, bsb.ge().a())
      .put(bfn.au, bwc.ge().a())
      .put(bfn.av, bsc.q().a())
      .put(bfn.aw, bxe.gf().a())
      .put(bfn.ax, bxh.w().a())
      .put(bfn.ay, bwf.r().a())
      .put(bfn.bt, byo.fC().a())
      .put(bfn.az, bsd.q().a())
      .put(bfn.aB, bri.q().a())
      .put(bfn.aC, bsf.r().a())
      .put(bfn.aD, bwh.q().a())
      .put(bfn.aE, bri.q().a())
      .put(bfn.aF, bsh.q().a())
      .put(bfn.aG, bwi.q().a())
      .put(bfn.aI, bwj.q().a())
      .put(bfn.aJ, bvl.q().a())
      .put(bfn.aK, btq.q().a())
      .put(bfn.aL, bwc.ge().a())
      .put(bfn.aN, btx.q().a())
      .put(bfn.aO, bsj.q().a())
      .put(bfn.aS, bwn.r().a())
      .put(bfn.aT, bsk.fY().a())
      .put(bfn.aU, bvl.q().a())
      .put(bfn.aV, bwp.r().a())
      .put(bfn.aW, btd.ga().a())
      .put(bfn.ba, btn.gj().a())
      .put(bfn.bc, bri.q().a())
      .put(bfn.bd, bsm.w().a())
      .put(bfn.be, bwq.q().a())
      .put(bfn.bf, byb.gh().a())
      .put(bfn.bg, bwr.r().a())
      .put(bfn.bi, bxs.q().a())
      .put(bfn.bh, bgb.y().a())
      .put(bfn.bj, bws.r().a())
      .put(bfn.bk, buv.r().a())
      .put(bfn.bl, bvl.q().a())
      .put(bfn.bn, bso.ge().a())
      .put(bfn.bo, bwu.q().a())
      .put(bfn.bp, bwv.gc().a())
      .put(bfn.bq, btu.q().a())
      .put(bfn.br, bwv.gc().a())
      .put(bfn.bs, bwx.gi().a())
      .build();

   public static bhf a(bfn<? extends bfz> $$0) {
      return b.get($$0);
   }

   public static boolean b(bfn<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      jb.h.s().filter($$0 -> $$0.f() != bgc.h).filter($$0 -> !b((bfn<?>)$$0)).map(jb.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
