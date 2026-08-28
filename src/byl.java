import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class byl {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<bwo<? extends bxe>, byj> b = ImmutableMap.builder()
      .put(bwo.c, ckh.j().a())
      .put(bwo.e, ckk.q().a())
      .put(bwo.f, cmw.j().a())
      .put(bwo.h, ckn.gr().a())
      .put(bwo.k, cin.j().a())
      .put(bwo.l, civ.gF().a())
      .put(bwo.o, cnm.j().a())
      .put(bwo.q, cnn.gr().a())
      .put(bwo.u, cix.gH().a())
      .put(bwo.t, cks.q().a())
      .put(bwo.v, cno.j().a())
      .put(bwo.z, cja.q().a())
      .put(bwo.A, ciq.j().a())
      .put(bwo.C, cje.q().a())
      .put(bwo.D, cpi.m().a())
      .put(bwo.E, cnp.j().a())
      .put(bwo.H, cjh.gr().a())
      .put(bwo.I, clg.q().a())
      .put(bwo.K, cnr.j().a())
      .put(bwo.M, cns.j().a())
      .put(bwo.N, cnt.j().a())
      .put(bwo.O, cnu.j().a())
      .put(bwo.P, cma.m().a())
      .put(bwo.S, cnw.m().a())
      .put(bwo.r, cpa.j().a())
      .put(bwo.aa, cjj.q().a())
      .put(bwo.ab, ckv.gr().a())
      .put(bwo.ad, cnx.n().a())
      .put(bwo.ae, cny.j().a())
      .put(bwo.ag, bwv.gr().a())
      .put(bwo.ah, cld.t().a())
      .put(bwo.ai, cnz.q().a())
      .put(bwo.aj, cpl.t().a())
      .put(bwo.al, clh.gS().a())
      .put(bwo.am, cox.gs().a())
      .put(bwo.an, cob.m().a())
      .put(bwo.ap, cjk.j().a())
      .put(bwo.ax, clk.gD().a())
      .put(bwo.az, coc.j().a())
      .put(bwo.aE, cje.q().a())
      .put(bwo.aF, clg.q().a())
      .put(bwo.aI, cjm.q().a())
      .put(bwo.aN, cjn.gE().a())
      .put(bwo.aO, cjo.gD().a())
      .put(bwo.aP, cod.gu().a())
      .put(bwo.aQ, cjp.q().a())
      .put(bwo.aR, cpr.gv().a())
      .put(bwo.aS, cpu.n().a())
      .put(bwo.aT, cog.m().a())
      .put(bwo.bS, crc.fX().a())
      .put(bwo.aU, cjs.q().a())
      .put(bwo.aX, ciq.j().a())
      .put(bwo.aY, cju.t().a())
      .put(bwo.aZ, coi.j().a())
      .put(bwo.ba, ciq.j().a())
      .put(bwo.bb, cjw.q().a())
      .put(bwo.bc, coj.j().a())
      .put(bwo.be, cok.j().a())
      .put(bwo.bf, cnl.j().a())
      .put(bwo.bg, cln.q().a())
      .put(bwo.bh, cod.gu().a())
      .put(bwo.bj, clu.q().a())
      .put(bwo.bl, cjy.j().a())
      .put(bwo.bo, cop.m().a())
      .put(bwo.br, cjz.gr().a())
      .put(bwo.bs, cnl.j().a())
      .put(bwo.bt, cor.t().a())
      .put(bwo.bu, cla.x().a())
      .put(bwo.by, clk.gD().a())
      .put(bwo.bA, ciq.j().a())
      .put(bwo.bB, ckc.x().a())
      .put(bwo.bC, cos.j().a())
      .put(bwo.bD, cqo.gA().a())
      .put(bwo.bE, cot.m().a())
      .put(bwo.bG, cqf.j().a())
      .put(bwo.bF, bxg.E().a())
      .put(bwo.bI, cou.m().a())
      .put(bwo.bJ, cmu.m().a())
      .put(bwo.bK, cnl.j().a())
      .put(bwo.bM, cke.gE().a())
      .put(bwo.bN, cow.j().a())
      .put(bwo.bO, cox.gs().a())
      .put(bwo.bP, clr.q().a())
      .put(bwo.bQ, cox.gs().a())
      .put(bwo.bR, coz.gy().a())
      .build();

   public static byj a(bwo<? extends bxe> $$0) {
      return b.get($$0);
   }

   public static boolean b(bwo<?> $$0) {
      return b.containsKey($$0);
   }

   public static void a() {
      mf.f.s().filter($$0 -> $$0.f() != bxh.h).filter($$0 -> !b((bwo<?>)$$0)).map(mf.f::b).forEach($$0 -> af.b("Entity " + $$0 + " has no attributes"));
   }
}
