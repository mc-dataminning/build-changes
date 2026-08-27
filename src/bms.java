import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bms {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bkz<? extends bll>, bmq> b = ImmutableMap.builder()
      .put(bkz.b, bya.u().a())
      .put(bkz.d, bll.dR().a())
      .put(bkz.f, byd.gm().a())
      .put(bkz.g, bwr.u().a())
      .put(bkz.h, bwx.gr().a())
      .put(bkz.i, cax.u().a())
      .put(bkz.m, bwz.gr().a())
      .put(bkz.l, byi.u().a())
      .put(bkz.n, cay.u().a())
      .put(bkz.q, bxb.u().a())
      .put(bkz.r, bwt.u().a())
      .put(bkz.t, bxd.u().a())
      .put(bkz.u, caz.u().a())
      .put(bkz.v, bxe.gf().a())
      .put(bkz.w, byu.u().a())
      .put(bkz.y, ccg.gj().a())
      .put(bkz.A, cbc.u().a())
      .put(bkz.E, cbd.u().a())
      .put(bkz.F, cbe.u().a())
      .put(bkz.C, bzm.w().a())
      .put(bkz.G, cbg.w().a())
      .put(bkz.N, bxg.u().a())
      .put(bkz.O, byl.gf().a())
      .put(bkz.Q, cbh.A().a())
      .put(bkz.R, cbi.u().a())
      .put(bkz.T, bld.gf().a())
      .put(bkz.U, byr.w().a())
      .put(bkz.V, cbj.gf().a())
      .put(bkz.W, ccj.u().a())
      .put(bkz.Y, byv.gF().a())
      .put(bkz.Z, ccg.gj().a())
      .put(bkz.aa, cbl.w().a())
      .put(bkz.ac, bxi.u().a())
      .put(bkz.aj, byy.gq().a())
      .put(bkz.al, cbm.u().a())
      .put(bkz.ao, bxd.u().a())
      .put(bkz.ap, byu.u().a())
      .put(bkz.aq, bxk.u().a())
      .put(bkz.as, bxl.gq().a())
      .put(bkz.at, bxm.gl().a())
      .put(bkz.au, cbn.gl().a())
      .put(bkz.av, bxn.u().a())
      .put(bkz.aw, ccp.gm().a())
      .put(bkz.ax, ccs.A().a())
      .put(bkz.ay, cbq.w().a())
      .put(bkz.bt, cdz.fI().a())
      .put(bkz.az, bxo.u().a())
      .put(bkz.aB, bwt.u().a())
      .put(bkz.aC, bxq.w().a())
      .put(bkz.aD, cbs.u().a())
      .put(bkz.aE, bwt.u().a())
      .put(bkz.aF, bxs.u().a())
      .put(bkz.aG, cbt.u().a())
      .put(bkz.aI, cbu.u().a())
      .put(bkz.aJ, caw.u().a())
      .put(bkz.aK, bzb.u().a())
      .put(bkz.aL, cbn.gl().a())
      .put(bkz.aN, bzi.u().a())
      .put(bkz.aO, bxu.u().a())
      .put(bkz.aS, cby.w().a())
      .put(bkz.aT, bxv.gf().a())
      .put(bkz.aU, caw.u().a())
      .put(bkz.aV, cca.w().a())
      .put(bkz.aW, byo.gh().a())
      .put(bkz.ba, byy.gq().a())
      .put(bkz.bc, bwt.u().a())
      .put(bkz.bd, bxx.A().a())
      .put(bkz.be, ccb.u().a())
      .put(bkz.bf, cdm.go().a())
      .put(bkz.bg, ccc.w().a())
      .put(bkz.bi, cdd.u().a())
      .put(bkz.bh, bln.C().a())
      .put(bkz.bj, ccd.w().a())
      .put(bkz.bk, cag.w().a())
      .put(bkz.bl, caw.u().a())
      .put(bkz.bn, bxz.gl().a())
      .put(bkz.bo, ccf.u().a())
      .put(bkz.bp, ccg.gj().a())
      .put(bkz.bq, bzf.u().a())
      .put(bkz.br, ccg.gj().a())
      .put(bkz.bs, cci.gp().a())
      .build();

   public static bmq a(bkz<? extends bll> $$0) {
      return b.get($$0);
   }

   public static boolean b(bkz<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kc.h.s().filter($$0 -> $$0.f() != blo.h).filter($$0 -> !b((bkz<?>)$$0)).map(kc.h::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
