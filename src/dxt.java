import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxt<T extends dxr> {
   private static final Logger V = LogUtils.getLogger();
   public static final dxt<dyr> a = a("furnace", dyr::new, dmt.cO);
   public static final dxt<dxz> b = a("chest", dxz::new, dmt.cG);
   public static final dxt<dzq> c = a("trapped_chest", dzq::new, dmt.hw);
   public static final dxt<dyp> d = a("ender_chest", dyp::new, dmt.gf);
   public static final dxt<dyw> e = a("jukebox", dyw::new, dmt.ek);
   public static final dxt<dym> f = a("dispenser", dym::new, dmt.bb);
   public static final dxt<dyn> g = a("dropper", dyn::new, dmt.hJ);
   public static final dxt<dzf> h = a(
      "sign",
      dzf::new,
      dmt.cP,
      dmt.cQ,
      dmt.cR,
      dmt.cS,
      dmt.cT,
      dmt.cU,
      dmt.cV,
      dmt.cW,
      dmt.dd,
      dmt.de,
      dmt.df,
      dmt.dg,
      dmt.dh,
      dmt.di,
      dmt.dj,
      dmt.dk,
      dmt.pC,
      dmt.pE,
      dmt.pD,
      dmt.pF,
      dmt.cX,
      dmt.dl,
      dmt.cY,
      dmt.dm
   );
   public static final dxt<dys> i = a(
      "hanging_sign",
      dys::new,
      dmt.dn,
      dmt.do,
      dmt.dp,
      dmt.dq,
      dmt.dr,
      dmt.ds,
      dmt.dt,
      dmt.du,
      dmt.dv,
      dmt.dw,
      dmt.dx,
      dmt.dy,
      dmt.dz,
      dmt.dA,
      dmt.dB,
      dmt.dC,
      dmt.dD,
      dmt.dE,
      dmt.dF,
      dmt.dG,
      dmt.dI,
      dmt.dJ,
      dmt.dH,
      dmt.dK
   );
   public static final dxt<dzj> j = a("mob_spawner", dzj::new, dmt.cD);
   public static final dxt<dyh> k = a("creaking_heart", dyh::new, dmt.cE);
   public static final dxt<eao> l = a("piston", eao::new, dmt.ca);
   public static final dxt<dxv> m = a("brewing_stand", dxv::new, dmt.fR);
   public static final dxt<dyo> n = a("enchanting_table", dyo::new, dmt.fQ);
   public static final dxt<dzo> o = a("end_portal", dzo::new, dmt.fW);
   public static final dxt<dxm> p = a("beacon", dxm::new, dmt.gn);
   public static final dxt<dzh> q = a(
      "skull", dzh::new, dmt.hf, dmt.hg, dmt.hn, dmt.ho, dmt.hp, dmt.hq, dmt.hj, dmt.hk, dmt.hh, dmt.hi, dmt.hl, dmt.hm, dmt.hr, dmt.hs
   );
   public static final dxt<dyi> r = a("daylight_detector", dyi::new, dmt.hA);
   public static final dxt<dyu> s = a("hopper", dyu::new, dmt.hD);
   public static final dxt<dyd> t = a("comparator", dyd::new, dmt.hz);
   public static final dxt<dxf> u = a(
      "banner",
      dxf::new,
      dmt.jl,
      dmt.jm,
      dmt.jn,
      dmt.jo,
      dmt.jp,
      dmt.jq,
      dmt.jr,
      dmt.js,
      dmt.jt,
      dmt.ju,
      dmt.jv,
      dmt.jw,
      dmt.jx,
      dmt.jy,
      dmt.jz,
      dmt.jA,
      dmt.jB,
      dmt.jC,
      dmt.jD,
      dmt.jE,
      dmt.jF,
      dmt.jG,
      dmt.jH,
      dmt.jI,
      dmt.jJ,
      dmt.jK,
      dmt.jL,
      dmt.jM,
      dmt.jN,
      dmt.jO,
      dmt.jP,
      dmt.jQ
   );
   public static final dxt<dzk> v = a("structure_block", dzk::new, dmt.pG);
   public static final dxt<dzn> w = a("end_gateway", dzn::new, dmt.ll);
   public static final dxt<dyc> x = a("command_block", dyc::new, dmt.gm, dmt.ln, dmt.lm);
   public static final dxt<dze> y = a(
      "shulker_box",
      dze::new,
      dmt.lv,
      dmt.lL,
      dmt.lH,
      dmt.lI,
      dmt.lF,
      dmt.lD,
      dmt.lJ,
      dmt.lz,
      dmt.lE,
      dmt.lB,
      dmt.ly,
      dmt.lx,
      dmt.lC,
      dmt.lG,
      dmt.lK,
      dmt.lw,
      dmt.lA
   );
   public static final dxt<dxn> z = a(
      "bed", dxn::new, dmt.bu, dmt.bv, dmt.br, dmt.bs, dmt.bp, dmt.bn, dmt.bt, dmt.bj, dmt.bo, dmt.bl, dmt.bi, dmt.bh, dmt.bm, dmt.bq, dmt.bg, dmt.bk
   );
   public static final dxt<dye> A = a("conduit", dye::new, dmt.nD);
   public static final dxt<dxj> B = a("barrel", dxj::new, dmt.oA);
   public static final dxt<dzi> C = a("smoker", dzi::new, dmt.oB);
   public static final dxt<dxq> D = a("blast_furnace", dxq::new, dmt.oC);
   public static final dxt<dyx> E = a("lectern", dyx::new, dmt.oG);
   public static final dxt<dxp> F = a("bell", dxp::new, dmt.oJ);
   public static final dxt<dyv> G = a("jigsaw", dyv::new, dmt.pH);
   public static final dxt<dxy> H = a("campfire", dxy::new, dmt.oM, dmt.oN);
   public static final dxt<dxo> I = a("beehive", dxo::new, dmt.pM, dmt.pN);
   public static final dxt<dzc> J = a("sculk_sensor", dzc::new, dmt.ry);
   public static final dxt<dxx> K = a("calibrated_sculk_sensor", dxx::new, dmt.rz);
   public static final dxt<dzb> L = a("sculk_catalyst", dzb::new, dmt.rC);
   public static final dxt<dzd> M = a("sculk_shrieker", dzd::new, dmt.rD);
   public static final dxt<dyb> N = a("chiseled_bookshelf", dyb::new, dmt.cw);
   public static final dxt<dxw> O = a("brushable_block", dxw::new, dmt.M, dmt.P);
   public static final dxt<dyj> P = a("decorated_pot", dyj::new, dmt.tZ);
   public static final dxt<dyg> Q = a("crafter", dyg::new, dmt.ua);
   public static final dxt<dzr> R = a("trial_spawner", dzr::new, dmt.ub);
   public static final dxt<eaa> S = a("vault", eaa::new, dmt.uc);
   public static final dxt<dzl> T = a("test_block", dzl::new, dmt.pI);
   public static final dxt<dzm> U = a("test_instance_block", dzm::new, dmt.pJ);
   private static final Set<dxt<?>> W = Set.of(x, E, h, i, j, R);
   private final dxt.a<? extends T> X;
   private final Set<dmr> Y;
   private final jf.c<dxt<?>> Z = mg.j.f(this);

   @Nullable
   public static alg a(dxt<?> $$0) {
      return mg.j.b($$0);
   }

   private static <T extends dxr> dxt<T> a(String $$0, dxt.a<? extends T> $$1, dmr... $$2) {
      if ($$2.length == 0) {
         V.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      ag.a(biz.s, $$0);
      return js.a(mg.j, $$0, new dxt<>($$1, Set.of($$2)));
   }

   private dxt(dxt.a<? extends T> $$0, Set<dmr> $$1) {
      this.X = $$0;
      this.Y = $$1;
   }

   @Nullable
   public T a(iv $$0, eat $$1) {
      return (T)this.X.create($$0, $$1);
   }

   public boolean a(eat $$0) {
      return this.Y.contains($$0.b());
   }

   @Deprecated
   public jf.c<dxt<?>> a() {
      return this.Z;
   }

   @Nullable
   public T a(diq $$0, iv $$1) {
      dxr $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.p() == this ? $$2 : null);
   }

   public boolean b() {
      return W.contains(this);
   }

   @FunctionalInterface
   interface a<T extends dxr> {
      T create(iv var1, eat var2);
   }
}
