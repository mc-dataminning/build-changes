import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bul {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bsn<? extends btc>, buj> b = ImmutableMap.builder()
      .put(bsn.a, cfy.s().a())
      .put(bsn.c, cgb.s().a())
      .put(bsn.d, cik.s().a())
      .put(bsn.f, cge.gu().a())
      .put(bsn.g, cen.s().a())
      .put(bsn.h, cet.gz().a())
      .put(bsn.i, cja.s().a())
      .put(bsn.l, cjb.gq().a())
      .put(bsn.p, cev.gy().a())
      .put(bsn.o, cgj.s().a())
      .put(bsn.q, cjc.s().a())
      .put(bsn.t, cex.s().a())
      .put(bsn.u, cep.s().a())
      .put(bsn.w, cez.s().a())
      .put(bsn.x, cjd.s().a())
      .put(bsn.y, cfa.gn().a())
      .put(bsn.z, cgv.s().a())
      .put(bsn.B, cjf.s().a())
      .put(bsn.D, cjg.s().a())
      .put(bsn.H, cjh.s().a())
      .put(bsn.I, cji.s().a())
      .put(bsn.F, cho.t().a())
      .put(bsn.J, cjk.t().a())
      .put(bsn.m, ckn.s().a())
      .put(bsn.Q, cfc.s().a())
      .put(bsn.R, cgm.gn().a())
      .put(bsn.T, cjl.x().a())
      .put(bsn.U, cjm.s().a())
      .put(bsn.W, bsu.gn().a())
      .put(bsn.X, cgs.t().a())
      .put(bsn.Y, cjn.gn().a())
      .put(bsn.Z, ckv.s().a())
      .put(bsn.ab, cgw.gM().a())
      .put(bsn.ac, ckk.gr().a())
      .put(bsn.ad, cjp.t().a())
      .put(bsn.af, cfe.s().a())
      .put(bsn.an, cgz.gy().a())
      .put(bsn.ap, cjq.s().a())
      .put(bsn.as, cez.s().a())
      .put(bsn.at, cgv.s().a())
      .put(bsn.au, cfg.s().a())
      .put(bsn.aw, cfh.gy().a())
      .put(bsn.ax, cfi.gt().a())
      .put(bsn.ay, cjr.gt().a())
      .put(bsn.az, cfj.s().a())
      .put(bsn.aA, clb.gu().a())
      .put(bsn.aB, cle.x().a())
      .put(bsn.aC, cju.t().a())
      .put(bsn.by, cml.fO().a())
      .put(bsn.aD, cfk.s().a())
      .put(bsn.aF, cep.s().a())
      .put(bsn.aG, cfm.t().a())
      .put(bsn.aH, cjw.s().a())
      .put(bsn.aI, cep.s().a())
      .put(bsn.aJ, cfo.s().a())
      .put(bsn.aK, cjx.s().a())
      .put(bsn.aM, cjy.s().a())
      .put(bsn.aN, ciz.s().a())
      .put(bsn.aO, chc.s().a())
      .put(bsn.aP, cjr.gt().a())
      .put(bsn.aR, chj.s().a())
      .put(bsn.aS, cfq.s().a())
      .put(bsn.aW, ckc.t().a())
      .put(bsn.aX, cfr.gn().a())
      .put(bsn.aY, ciz.s().a())
      .put(bsn.aZ, cke.t().a())
      .put(bsn.ba, cgp.gp().a())
      .put(bsn.be, cgz.gy().a())
      .put(bsn.bg, cep.s().a())
      .put(bsn.bh, cft.x().a())
      .put(bsn.bi, ckf.t().a())
      .put(bsn.bj, cly.gw().a())
      .put(bsn.bk, ckg.t().a())
      .put(bsn.bm, clp.s().a())
      .put(bsn.bl, bte.A().a())
      .put(bsn.bo, ckh.t().a())
      .put(bsn.bp, cii.t().a())
      .put(bsn.bq, ciz.s().a())
      .put(bsn.bs, cfv.gv().a())
      .put(bsn.bt, ckj.s().a())
      .put(bsn.bu, ckk.gr().a())
      .put(bsn.bv, chg.s().a())
      .put(bsn.bw, ckk.gr().a())
      .put(bsn.bx, ckm.gx().a())
      .build();

   public static buj a(bsn<? extends btc> $$0) {
      return b.get($$0);
   }

   public static boolean b(bsn<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lq.f.t().filter($$0 -> $$0.f() != btf.h).filter($$0 -> !b((bsn<?>)$$0)).map(lq.f::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
