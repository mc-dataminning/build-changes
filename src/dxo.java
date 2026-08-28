import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxo<T extends dxm> {
   private static final Logger V = LogUtils.getLogger();
   public static final dxo<dym> a = a("furnace", dym::new, dmo.cO);
   public static final dxo<dxu> b = a("chest", dxu::new, dmo.cG);
   public static final dxo<dzl> c = a("trapped_chest", dzl::new, dmo.hw);
   public static final dxo<dyk> d = a("ender_chest", dyk::new, dmo.gf);
   public static final dxo<dyr> e = a("jukebox", dyr::new, dmo.ek);
   public static final dxo<dyh> f = a("dispenser", dyh::new, dmo.bb);
   public static final dxo<dyi> g = a("dropper", dyi::new, dmo.hJ);
   public static final dxo<dza> h = a(
      "sign",
      dza::new,
      dmo.cP,
      dmo.cQ,
      dmo.cR,
      dmo.cS,
      dmo.cT,
      dmo.cU,
      dmo.cV,
      dmo.cW,
      dmo.dd,
      dmo.de,
      dmo.df,
      dmo.dg,
      dmo.dh,
      dmo.di,
      dmo.dj,
      dmo.dk,
      dmo.pC,
      dmo.pE,
      dmo.pD,
      dmo.pF,
      dmo.cX,
      dmo.dl,
      dmo.cY,
      dmo.dm
   );
   public static final dxo<dyn> i = a(
      "hanging_sign",
      dyn::new,
      dmo.dn,
      dmo.do,
      dmo.dp,
      dmo.dq,
      dmo.dr,
      dmo.ds,
      dmo.dt,
      dmo.du,
      dmo.dv,
      dmo.dw,
      dmo.dx,
      dmo.dy,
      dmo.dz,
      dmo.dA,
      dmo.dB,
      dmo.dC,
      dmo.dD,
      dmo.dE,
      dmo.dF,
      dmo.dG,
      dmo.dI,
      dmo.dJ,
      dmo.dH,
      dmo.dK
   );
   public static final dxo<dze> j = a("mob_spawner", dze::new, dmo.cD);
   public static final dxo<dyc> k = a("creaking_heart", dyc::new, dmo.cE);
   public static final dxo<eaj> l = a("piston", eaj::new, dmo.ca);
   public static final dxo<dxq> m = a("brewing_stand", dxq::new, dmo.fR);
   public static final dxo<dyj> n = a("enchanting_table", dyj::new, dmo.fQ);
   public static final dxo<dzj> o = a("end_portal", dzj::new, dmo.fW);
   public static final dxo<dxh> p = a("beacon", dxh::new, dmo.gn);
   public static final dxo<dzc> q = a(
      "skull", dzc::new, dmo.hf, dmo.hg, dmo.hn, dmo.ho, dmo.hp, dmo.hq, dmo.hj, dmo.hk, dmo.hh, dmo.hi, dmo.hl, dmo.hm, dmo.hr, dmo.hs
   );
   public static final dxo<dyd> r = a("daylight_detector", dyd::new, dmo.hA);
   public static final dxo<dyp> s = a("hopper", dyp::new, dmo.hD);
   public static final dxo<dxy> t = a("comparator", dxy::new, dmo.hz);
   public static final dxo<dxa> u = a(
      "banner",
      dxa::new,
      dmo.jl,
      dmo.jm,
      dmo.jn,
      dmo.jo,
      dmo.jp,
      dmo.jq,
      dmo.jr,
      dmo.js,
      dmo.jt,
      dmo.ju,
      dmo.jv,
      dmo.jw,
      dmo.jx,
      dmo.jy,
      dmo.jz,
      dmo.jA,
      dmo.jB,
      dmo.jC,
      dmo.jD,
      dmo.jE,
      dmo.jF,
      dmo.jG,
      dmo.jH,
      dmo.jI,
      dmo.jJ,
      dmo.jK,
      dmo.jL,
      dmo.jM,
      dmo.jN,
      dmo.jO,
      dmo.jP,
      dmo.jQ
   );
   public static final dxo<dzf> v = a("structure_block", dzf::new, dmo.pG);
   public static final dxo<dzi> w = a("end_gateway", dzi::new, dmo.ll);
   public static final dxo<dxx> x = a("command_block", dxx::new, dmo.gm, dmo.ln, dmo.lm);
   public static final dxo<dyz> y = a(
      "shulker_box",
      dyz::new,
      dmo.lv,
      dmo.lL,
      dmo.lH,
      dmo.lI,
      dmo.lF,
      dmo.lD,
      dmo.lJ,
      dmo.lz,
      dmo.lE,
      dmo.lB,
      dmo.ly,
      dmo.lx,
      dmo.lC,
      dmo.lG,
      dmo.lK,
      dmo.lw,
      dmo.lA
   );
   public static final dxo<dxi> z = a(
      "bed", dxi::new, dmo.bu, dmo.bv, dmo.br, dmo.bs, dmo.bp, dmo.bn, dmo.bt, dmo.bj, dmo.bo, dmo.bl, dmo.bi, dmo.bh, dmo.bm, dmo.bq, dmo.bg, dmo.bk
   );
   public static final dxo<dxz> A = a("conduit", dxz::new, dmo.nD);
   public static final dxo<dxe> B = a("barrel", dxe::new, dmo.oA);
   public static final dxo<dzd> C = a("smoker", dzd::new, dmo.oB);
   public static final dxo<dxl> D = a("blast_furnace", dxl::new, dmo.oC);
   public static final dxo<dys> E = a("lectern", dys::new, dmo.oG);
   public static final dxo<dxk> F = a("bell", dxk::new, dmo.oJ);
   public static final dxo<dyq> G = a("jigsaw", dyq::new, dmo.pH);
   public static final dxo<dxt> H = a("campfire", dxt::new, dmo.oM, dmo.oN);
   public static final dxo<dxj> I = a("beehive", dxj::new, dmo.pM, dmo.pN);
   public static final dxo<dyx> J = a("sculk_sensor", dyx::new, dmo.ry);
   public static final dxo<dxs> K = a("calibrated_sculk_sensor", dxs::new, dmo.rz);
   public static final dxo<dyw> L = a("sculk_catalyst", dyw::new, dmo.rC);
   public static final dxo<dyy> M = a("sculk_shrieker", dyy::new, dmo.rD);
   public static final dxo<dxw> N = a("chiseled_bookshelf", dxw::new, dmo.cw);
   public static final dxo<dxr> O = a("brushable_block", dxr::new, dmo.M, dmo.P);
   public static final dxo<dye> P = a("decorated_pot", dye::new, dmo.tZ);
   public static final dxo<dyb> Q = a("crafter", dyb::new, dmo.ua);
   public static final dxo<dzm> R = a("trial_spawner", dzm::new, dmo.ub);
   public static final dxo<dzv> S = a("vault", dzv::new, dmo.uc);
   public static final dxo<dzg> T = a("test_block", dzg::new, dmo.pI);
   public static final dxo<dzh> U = a("test_instance_block", dzh::new, dmo.pJ);
   private static final Set<dxo<?>> W = Set.of(x, E, h, i, j, R);
   private final dxo.a<? extends T> X;
   private final Set<dmm> Y;
   private final jf.c<dxo<?>> Z = mg.j.f(this);

   @Nullable
   public static alg a(dxo<?> $$0) {
      return mg.j.b($$0);
   }

   private static <T extends dxm> dxo<T> a(String $$0, dxo.a<? extends T> $$1, dmm... $$2) {
      if ($$2.length == 0) {
         V.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      ag.a(biz.s, $$0);
      return js.a(mg.j, $$0, new dxo<>($$1, Set.of($$2)));
   }

   private dxo(dxo.a<? extends T> $$0, Set<dmm> $$1) {
      this.X = $$0;
      this.Y = $$1;
   }

   @Nullable
   public T a(iv $$0, eao $$1) {
      return (T)this.X.create($$0, $$1);
   }

   public boolean a(eao $$0) {
      return this.Y.contains($$0.b());
   }

   @Deprecated
   public jf.c<dxo<?>> a() {
      return this.Z;
   }

   @Nullable
   public T a(din $$0, iv $$1) {
      dxm $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.p() == this ? $$2 : null);
   }

   public boolean b() {
      return W.contains(this);
   }

   @FunctionalInterface
   interface a<T extends dxm> {
      T create(iv var1, eao var2);
   }
}
