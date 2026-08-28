import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyq<T extends dyo> {
   private static final Logger V = LogUtils.getLogger();
   public static final dyq<dzo> a = a("furnace", dzo::new, dnq.cO);
   public static final dyq<dyw> b = a("chest", dyw::new, dnq.cG);
   public static final dyq<ean> c = a("trapped_chest", ean::new, dnq.hw);
   public static final dyq<dzm> d = a("ender_chest", dzm::new, dnq.gf);
   public static final dyq<dzt> e = a("jukebox", dzt::new, dnq.ek);
   public static final dyq<dzj> f = a("dispenser", dzj::new, dnq.bb);
   public static final dyq<dzk> g = a("dropper", dzk::new, dnq.hJ);
   public static final dyq<eac> h = a(
      "sign",
      eac::new,
      dnq.cP,
      dnq.cQ,
      dnq.cR,
      dnq.cS,
      dnq.cT,
      dnq.cU,
      dnq.cV,
      dnq.cW,
      dnq.dd,
      dnq.de,
      dnq.df,
      dnq.dg,
      dnq.dh,
      dnq.di,
      dnq.dj,
      dnq.dk,
      dnq.pC,
      dnq.pE,
      dnq.pD,
      dnq.pF,
      dnq.cX,
      dnq.dl,
      dnq.cY,
      dnq.dm
   );
   public static final dyq<dzp> i = a(
      "hanging_sign",
      dzp::new,
      dnq.dn,
      dnq.do,
      dnq.dp,
      dnq.dq,
      dnq.dr,
      dnq.ds,
      dnq.dt,
      dnq.du,
      dnq.dv,
      dnq.dw,
      dnq.dx,
      dnq.dy,
      dnq.dz,
      dnq.dA,
      dnq.dB,
      dnq.dC,
      dnq.dD,
      dnq.dE,
      dnq.dF,
      dnq.dG,
      dnq.dI,
      dnq.dJ,
      dnq.dH,
      dnq.dK
   );
   public static final dyq<eag> j = a("mob_spawner", eag::new, dnq.cD);
   public static final dyq<dze> k = a("creaking_heart", dze::new, dnq.cE);
   public static final dyq<ebl> l = a("piston", ebl::new, dnq.ca);
   public static final dyq<dys> m = a("brewing_stand", dys::new, dnq.fR);
   public static final dyq<dzl> n = a("enchanting_table", dzl::new, dnq.fQ);
   public static final dyq<eal> o = a("end_portal", eal::new, dnq.fW);
   public static final dyq<dyj> p = a("beacon", dyj::new, dnq.gn);
   public static final dyq<eae> q = a(
      "skull", eae::new, dnq.hf, dnq.hg, dnq.hn, dnq.ho, dnq.hp, dnq.hq, dnq.hj, dnq.hk, dnq.hh, dnq.hi, dnq.hl, dnq.hm, dnq.hr, dnq.hs
   );
   public static final dyq<dzf> r = a("daylight_detector", dzf::new, dnq.hA);
   public static final dyq<dzr> s = a("hopper", dzr::new, dnq.hD);
   public static final dyq<dza> t = a("comparator", dza::new, dnq.hz);
   public static final dyq<dyc> u = a(
      "banner",
      dyc::new,
      dnq.jl,
      dnq.jm,
      dnq.jn,
      dnq.jo,
      dnq.jp,
      dnq.jq,
      dnq.jr,
      dnq.js,
      dnq.jt,
      dnq.ju,
      dnq.jv,
      dnq.jw,
      dnq.jx,
      dnq.jy,
      dnq.jz,
      dnq.jA,
      dnq.jB,
      dnq.jC,
      dnq.jD,
      dnq.jE,
      dnq.jF,
      dnq.jG,
      dnq.jH,
      dnq.jI,
      dnq.jJ,
      dnq.jK,
      dnq.jL,
      dnq.jM,
      dnq.jN,
      dnq.jO,
      dnq.jP,
      dnq.jQ
   );
   public static final dyq<eah> v = a("structure_block", eah::new, dnq.pG);
   public static final dyq<eak> w = a("end_gateway", eak::new, dnq.ll);
   public static final dyq<dyz> x = a("command_block", dyz::new, dnq.gm, dnq.ln, dnq.lm);
   public static final dyq<eab> y = a(
      "shulker_box",
      eab::new,
      dnq.lv,
      dnq.lL,
      dnq.lH,
      dnq.lI,
      dnq.lF,
      dnq.lD,
      dnq.lJ,
      dnq.lz,
      dnq.lE,
      dnq.lB,
      dnq.ly,
      dnq.lx,
      dnq.lC,
      dnq.lG,
      dnq.lK,
      dnq.lw,
      dnq.lA
   );
   public static final dyq<dyk> z = a(
      "bed", dyk::new, dnq.bu, dnq.bv, dnq.br, dnq.bs, dnq.bp, dnq.bn, dnq.bt, dnq.bj, dnq.bo, dnq.bl, dnq.bi, dnq.bh, dnq.bm, dnq.bq, dnq.bg, dnq.bk
   );
   public static final dyq<dzb> A = a("conduit", dzb::new, dnq.nD);
   public static final dyq<dyg> B = a("barrel", dyg::new, dnq.oA);
   public static final dyq<eaf> C = a("smoker", eaf::new, dnq.oB);
   public static final dyq<dyn> D = a("blast_furnace", dyn::new, dnq.oC);
   public static final dyq<dzu> E = a("lectern", dzu::new, dnq.oG);
   public static final dyq<dym> F = a("bell", dym::new, dnq.oJ);
   public static final dyq<dzs> G = a("jigsaw", dzs::new, dnq.pH);
   public static final dyq<dyv> H = a("campfire", dyv::new, dnq.oM, dnq.oN);
   public static final dyq<dyl> I = a("beehive", dyl::new, dnq.pM, dnq.pN);
   public static final dyq<dzz> J = a("sculk_sensor", dzz::new, dnq.ry);
   public static final dyq<dyu> K = a("calibrated_sculk_sensor", dyu::new, dnq.rz);
   public static final dyq<dzy> L = a("sculk_catalyst", dzy::new, dnq.rC);
   public static final dyq<eaa> M = a("sculk_shrieker", eaa::new, dnq.rD);
   public static final dyq<dyy> N = a("chiseled_bookshelf", dyy::new, dnq.cw);
   public static final dyq<dyt> O = a("brushable_block", dyt::new, dnq.M, dnq.P);
   public static final dyq<dzg> P = a("decorated_pot", dzg::new, dnq.tZ);
   public static final dyq<dzd> Q = a("crafter", dzd::new, dnq.ua);
   public static final dyq<eao> R = a("trial_spawner", eao::new, dnq.ub);
   public static final dyq<eax> S = a("vault", eax::new, dnq.uc);
   public static final dyq<eai> T = a("test_block", eai::new, dnq.pI);
   public static final dyq<eaj> U = a("test_instance_block", eaj::new, dnq.pJ);
   private static final Set<dyq<?>> W = Set.of(x, E, h, i, j, R);
   private final dyq.a<? extends T> X;
   private final Set<dno> Y;
   private final jg.c<dyq<?>> Z = mh.j.f(this);

   @Nullable
   public static alr a(dyq<?> $$0) {
      return mh.j.b($$0);
   }

   private static <T extends dyo> dyq<T> a(String $$0, dyq.a<? extends T> $$1, dno... $$2) {
      if ($$2.length == 0) {
         V.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      ag.a(bjm.s, $$0);
      return jt.a(mh.j, $$0, new dyq<>($$1, Set.of($$2)));
   }

   private dyq(dyq.a<? extends T> $$0, Set<dno> $$1) {
      this.X = $$0;
      this.Y = $$1;
   }

   public T a(iw $$0, ebq $$1) {
      return (T)this.X.create($$0, $$1);
   }

   public boolean a(ebq $$0) {
      return this.Y.contains($$0.b());
   }

   @Deprecated
   public jg.c<dyq<?>> a() {
      return this.Z;
   }

   @Nullable
   public T a(djn $$0, iw $$1) {
      dyo $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.p() == this ? $$2 : null);
   }

   public boolean b() {
      return W.contains(this);
   }

   @FunctionalInterface
   interface a<T extends dyo> {
      T create(iw var1, ebq var2);
   }
}
