import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class bqf {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bol<? extends box>, bqd> b = ImmutableMap.builder()
      .put(bol.b, cbq.u().a())
      .put(bol.d, cbt.u().a())
      .put(bol.e, ceb.u().a())
      .put(bol.g, cbw.gs().a())
      .put(bol.h, cah.u().a())
      .put(bol.i, can.gx().a())
      .put(bol.j, ceq.u().a())
      .put(bol.o, cap.gx().a())
      .put(bol.n, ccb.u().a())
      .put(bol.p, cer.u().a())
      .put(bol.s, car.u().a())
      .put(bol.t, caj.u().a())
      .put(bol.v, cat.u().a())
      .put(bol.w, ces.u().a())
      .put(bol.x, cau.gl().a())
      .put(bol.y, ccn.u().a())
      .put(bol.A, ceu.u().a())
      .put(bol.C, cev.u().a())
      .put(bol.G, cew.u().a())
      .put(bol.H, cex.u().a())
      .put(bol.E, cdf.w().a())
      .put(bol.I, cez.w().a())
      .put(bol.m, cgc.u().a())
      .put(bol.P, caw.u().a())
      .put(bol.Q, cce.gl().a())
      .put(bol.S, cfa.A().a())
      .put(bol.T, cfb.u().a())
      .put(bol.V, bop.gl().a())
      .put(bol.W, cck.w().a())
      .put(bol.X, cfc.gl().a())
      .put(bol.Y, cgk.u().a())
      .put(bol.aa, cco.gL().a())
      .put(bol.ab, cfz.gp().a())
      .put(bol.ac, cfe.w().a())
      .put(bol.ae, cay.u().a())
      .put(bol.al, ccr.gw().a())
      .put(bol.an, cff.u().a())
      .put(bol.aq, cat.u().a())
      .put(bol.ar, ccn.u().a())
      .put(bol.as, cba.u().a())
      .put(bol.au, cbb.gw().a())
      .put(bol.av, cbc.gr().a())
      .put(bol.aw, cfg.gr().a())
      .put(bol.ax, cbd.u().a())
      .put(bol.ay, cgq.gs().a())
      .put(bol.az, cgt.A().a())
      .put(bol.aA, cfj.w().a())
      .put(bol.bw, cia.fJ().a())
      .put(bol.aB, cbe.u().a())
      .put(bol.aD, caj.u().a())
      .put(bol.aE, cbg.w().a())
      .put(bol.aF, cfl.u().a())
      .put(bol.aG, caj.u().a())
      .put(bol.aH, cbi.u().a())
      .put(bol.aI, cfm.u().a())
      .put(bol.aK, cfn.u().a())
      .put(bol.aL, cep.u().a())
      .put(bol.aM, ccu.u().a())
      .put(bol.aN, cfg.gr().a())
      .put(bol.aP, cdb.u().a())
      .put(bol.aQ, cbk.u().a())
      .put(bol.aU, cfr.w().a())
      .put(bol.aV, cbl.gl().a())
      .put(bol.aW, cep.u().a())
      .put(bol.aX, cft.w().a())
      .put(bol.aY, cch.gn().a())
      .put(bol.bc, ccr.gw().a())
      .put(bol.be, caj.u().a())
      .put(bol.bf, cbn.A().a())
      .put(bol.bg, cfu.u().a())
      .put(bol.bh, chn.gu().a())
      .put(bol.bi, cfv.w().a())
      .put(bol.bk, che.u().a())
      .put(bol.bj, boz.C().a())
      .put(bol.bm, cfw.w().a())
      .put(bol.bn, cdz.w().a())
      .put(bol.bo, cep.u().a())
      .put(bol.bq, cbp.gr().a())
      .put(bol.br, cfy.u().a())
      .put(bol.bs, cfz.gp().a())
      .put(bol.bt, ccy.u().a())
      .put(bol.bu, cfz.gp().a())
      .put(bol.bv, cgb.gv().a())
      .build();

   public static bqd a(bol<? extends box> $$0) {
      return b.get($$0);
   }

   public static boolean b(bol<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      kh.g.s().filter($$0 -> $$0.f() != bpa.h).filter($$0 -> !b((bol<?>)$$0)).map(kh.g::b).forEach($$0 -> ac.a("Entity " + $$0 + " has no attributes"));
   }
}
