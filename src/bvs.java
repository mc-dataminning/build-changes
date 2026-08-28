import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bvs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<btv<? extends buk>, bvq> b = ImmutableMap.builder()
      .put(btv.a, chg.q().a())
      .put(btv.c, chj.q().a())
      .put(btv.d, cjt.q().a())
      .put(btv.f, chm.gr().a())
      .put(btv.g, cfu.q().a())
      .put(btv.h, cgb.gD().a())
      .put(btv.i, ckj.q().a())
      .put(btv.l, ckk.gs().a())
      .put(btv.p, cgd.gF().a())
      .put(btv.o, chr.q().a())
      .put(btv.q, ckl.q().a())
      .put(btv.t, cgf.q().a())
      .put(btv.u, cfw.q().a())
      .put(btv.w, cgh.q().a())
      .put(btv.x, ckm.q().a())
      .put(btv.y, cgi.gp().a())
      .put(btv.z, cid.q().a())
      .put(btv.B, cko.q().a())
      .put(btv.D, ckp.q().a())
      .put(btv.H, ckq.q().a())
      .put(btv.I, ckr.q().a())
      .put(btv.F, cix.t().a())
      .put(btv.J, ckt.t().a())
      .put(btv.m, clw.q().a())
      .put(btv.Q, cgk.q().a())
      .put(btv.R, chu.gp().a())
      .put(btv.T, cku.y().a())
      .put(btv.U, ckv.q().a())
      .put(btv.W, buc.gp().a())
      .put(btv.X, cia.t().a())
      .put(btv.Y, ckw.gp().a())
      .put(btv.Z, cme.q().a())
      .put(btv.ab, cie.gR().a())
      .put(btv.ac, clt.gs().a())
      .put(btv.ad, cky.t().a())
      .put(btv.af, cgm.q().a())
      .put(btv.an, cih.gB().a())
      .put(btv.ap, ckz.q().a())
      .put(btv.as, cgh.q().a())
      .put(btv.at, cid.q().a())
      .put(btv.au, cgo.q().a())
      .put(btv.aw, cgp.gC().a())
      .put(btv.ax, cgq.gB().a())
      .put(btv.ay, cla.gv().a())
      .put(btv.az, cgr.q().a())
      .put(btv.aA, cmk.gw().a())
      .put(btv.aB, cmn.y().a())
      .put(btv.aC, cld.t().a())
      .put(btv.by, cnu.fR().a())
      .put(btv.aD, cgs.q().a())
      .put(btv.aF, cfw.q().a())
      .put(btv.aG, cgu.t().a())
      .put(btv.aH, clf.q().a())
      .put(btv.aI, cfw.q().a())
      .put(btv.aJ, cgw.q().a())
      .put(btv.aK, clg.q().a())
      .put(btv.aM, clh.q().a())
      .put(btv.aN, cki.q().a())
      .put(btv.aO, cik.q().a())
      .put(btv.aP, cla.gv().a())
      .put(btv.aR, cir.q().a())
      .put(btv.aS, cgy.q().a())
      .put(btv.aW, cll.t().a())
      .put(btv.aX, cgz.gp().a())
      .put(btv.aY, cki.q().a())
      .put(btv.aZ, cln.t().a())
      .put(btv.ba, chx.gr().a())
      .put(btv.be, cih.gB().a())
      .put(btv.bg, cfw.q().a())
      .put(btv.bh, chb.y().a())
      .put(btv.bi, clo.q().a())
      .put(btv.bj, cnh.gy().a())
      .put(btv.bk, clp.t().a())
      .put(btv.bm, cmy.q().a())
      .put(btv.bl, bum.E().a())
      .put(btv.bo, clq.t().a())
      .put(btv.bp, cjr.t().a())
      .put(btv.bq, cki.q().a())
      .put(btv.bs, chd.gD().a())
      .put(btv.bt, cls.q().a())
      .put(btv.bu, clt.gs().a())
      .put(btv.bv, cio.q().a())
      .put(btv.bw, clt.gs().a())
      .put(btv.bx, clv.gy().a())
      .build();

   public static bvq a(btv<? extends buk> $$0) {
      return b.get($$0);
   }

   public static boolean b(btv<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      lu.f.s().filter($$0 -> $$0.f() != bun.h).filter($$0 -> !b((btv<?>)$$0)).map(lu.f::b).forEach($$0 -> ad.b("Entity " + $$0 + " has no attributes"));
   }
}
