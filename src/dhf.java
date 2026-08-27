import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhf<T extends dhd> {
   private static final Logger R = LogUtils.getLogger();
   public static final dhf<dhz> a = a("furnace", dhf.b.a(dhz::new, cxa.cD));
   public static final dhf<dhk> b = a("chest", dhf.b.a(dhk::new, cxa.cv));
   public static final dhf<div> c = a("trapped_chest", dhf.b.a(div::new, cxa.gV));
   public static final dhf<dhy> d = a("ender_chest", dhf.b.a(dhy::new, cxa.fG));
   public static final dhf<die> e = a("jukebox", dhf.b.a(die::new, cxa.dT));
   public static final dhf<dhv> f = a("dispenser", dhf.b.a(dhv::new, cxa.aU));
   public static final dhf<dhw> g = a("dropper", dhf.b.a(dhw::new, cxa.hi));
   public static final dhf<dim> h = a(
      "sign",
      dhf.b.a(
         dim::new,
         cxa.cE,
         cxa.cF,
         cxa.cG,
         cxa.cH,
         cxa.cI,
         cxa.cJ,
         cxa.cK,
         cxa.cR,
         cxa.cS,
         cxa.cT,
         cxa.cU,
         cxa.cV,
         cxa.cW,
         cxa.cX,
         cxa.oW,
         cxa.oY,
         cxa.oX,
         cxa.oZ,
         cxa.cL,
         cxa.cY,
         cxa.cM,
         cxa.cZ
      )
   );
   public static final dhf<dia> i = a(
      "hanging_sign",
      dhf.b.a(
         dia::new,
         cxa.da,
         cxa.db,
         cxa.dc,
         cxa.dd,
         cxa.de,
         cxa.df,
         cxa.dg,
         cxa.dh,
         cxa.di,
         cxa.dj,
         cxa.dk,
         cxa.dl,
         cxa.dm,
         cxa.dn,
         cxa.do,
         cxa.dp,
         cxa.dq,
         cxa.dr,
         cxa.dt,
         cxa.du,
         cxa.ds,
         cxa.dv
      )
   );
   public static final dhf<diq> j = a("mob_spawner", dhf.b.a(diq::new, cxa.ct));
   public static final dhf<djl> k = a("piston", dhf.b.a(djl::new, cxa.bQ));
   public static final dhf<dhg> l = a("brewing_stand", dhf.b.a(dhg::new, cxa.fs));
   public static final dhf<dhx> m = a("enchanting_table", dhf.b.a(dhx::new, cxa.fr));
   public static final dhf<dit> n = a("end_portal", dhf.b.a(dit::new, cxa.fx));
   public static final dhf<dgy> o = a("beacon", dhf.b.a(dgy::new, cxa.fO));
   public static final dhf<dio> p = a(
      "skull", dhf.b.a(dio::new, cxa.gE, cxa.gF, cxa.gM, cxa.gN, cxa.gO, cxa.gP, cxa.gI, cxa.gJ, cxa.gG, cxa.gH, cxa.gK, cxa.gL, cxa.gQ, cxa.gR)
   );
   public static final dhf<dhs> q = a("daylight_detector", dhf.b.a(dhs::new, cxa.gZ));
   public static final dhf<dic> r = a("hopper", dhf.b.a(dic::new, cxa.hc));
   public static final dhf<dho> s = a("comparator", dhf.b.a(dho::new, cxa.gY));
   public static final dhf<dgt> t = a(
      "banner",
      dhf.b.a(
         dgt::new,
         cxa.iJ,
         cxa.iK,
         cxa.iL,
         cxa.iM,
         cxa.iN,
         cxa.iO,
         cxa.iP,
         cxa.iQ,
         cxa.iR,
         cxa.iS,
         cxa.iT,
         cxa.iU,
         cxa.iV,
         cxa.iW,
         cxa.iX,
         cxa.iY,
         cxa.iZ,
         cxa.ja,
         cxa.jb,
         cxa.jc,
         cxa.jd,
         cxa.je,
         cxa.jf,
         cxa.jg,
         cxa.jh,
         cxa.ji,
         cxa.jj,
         cxa.jk,
         cxa.jl,
         cxa.jm,
         cxa.jn,
         cxa.jo
      )
   );
   public static final dhf<dir> u = a("structure_block", dhf.b.a(dir::new, cxa.pa));
   public static final dhf<dis> v = a("end_gateway", dhf.b.a(dis::new, cxa.kF));
   public static final dhf<dhn> w = a("command_block", dhf.b.a(dhn::new, cxa.fN, cxa.kH, cxa.kG));
   public static final dhf<dil> x = a(
      "shulker_box",
      dhf.b.a(dil::new, cxa.kP, cxa.lf, cxa.lb, cxa.lc, cxa.kZ, cxa.kX, cxa.ld, cxa.kT, cxa.kY, cxa.kV, cxa.kS, cxa.kR, cxa.kW, cxa.la, cxa.le, cxa.kQ, cxa.kU)
   );
   public static final dhf<dgz> y = a(
      "bed", dhf.b.a(dgz::new, cxa.bn, cxa.bo, cxa.bk, cxa.bl, cxa.bi, cxa.bg, cxa.bm, cxa.bc, cxa.bh, cxa.be, cxa.bb, cxa.ba, cxa.bf, cxa.bj, cxa.aZ, cxa.bd)
   );
   public static final dhf<dhp> z = a("conduit", dhf.b.a(dhp::new, cxa.mX));
   public static final dhf<dgw> A = a("barrel", dhf.b.a(dgw::new, cxa.nU));
   public static final dhf<dip> B = a("smoker", dhf.b.a(dip::new, cxa.nV));
   public static final dhf<dhc> C = a("blast_furnace", dhf.b.a(dhc::new, cxa.nW));
   public static final dhf<dif> D = a("lectern", dhf.b.a(dif::new, cxa.oa));
   public static final dhf<dhb> E = a("bell", dhf.b.a(dhb::new, cxa.od));
   public static final dhf<did> F = a("jigsaw", dhf.b.a(did::new, cxa.pb));
   public static final dhf<dhj> G = a("campfire", dhf.b.a(dhj::new, cxa.og, cxa.oh));
   public static final dhf<dha> H = a("beehive", dhf.b.a(dha::new, cxa.pe, cxa.pf));
   public static final dhf<dij> I = a("sculk_sensor", dhf.b.a(dij::new, cxa.qQ));
   public static final dhf<dhi> J = a("calibrated_sculk_sensor", dhf.b.a(dhi::new, cxa.qR));
   public static final dhf<dii> K = a("sculk_catalyst", dhf.b.a(dii::new, cxa.qU));
   public static final dhf<dik> L = a("sculk_shrieker", dhf.b.a(dik::new, cxa.qV));
   public static final dhf<dhm> M = a("chiseled_bookshelf", dhf.b.a(dhm::new, cxa.cm));
   public static final dhf<dhh> N = a("brushable_block", dhf.b.a(dhh::new, cxa.J, cxa.M));
   public static final dhf<dht> O = a("decorated_pot", dhf.b.a(dht::new, cxa.tp));
   public static final dhf<dhr> P = a("crafter", dhf.b.a(dhr::new, cxa.tq));
   public static final dhf<diw> Q = a("trial_spawner", dhf.b.a(diw::new, cxa.tr));
   private final dhf.a<? extends T> S;
   private final Set<cwy> T;
   private final Type<?> U;
   private final ih.c<dhf<?>> V = kd.k.f(this);

   @Nullable
   public static ahh a(dhf<?> $$0) {
      return kd.k.b($$0);
   }

   private static <T extends dhd> dhf<T> a(String $$0, dhf.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         R.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bbw.s, $$0);
      return it.a(kd.k, $$0, $$1.a($$2));
   }

   public dhf(dhf.a<? extends T> $$0, Set<cwy> $$1, Type<?> $$2) {
      this.S = $$0;
      this.T = $$1;
      this.U = $$2;
   }

   @Nullable
   public T a(hx $$0, djp $$1) {
      return (T)this.S.create($$0, $$1);
   }

   public boolean a(djp $$0) {
      return this.T.contains($$0.b());
   }

   @Nullable
   public ih.c<dhf<?>> a() {
      return this.V;
   }

   @Nullable
   public T a(ctd $$0, hx $$1) {
      dhd $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.v() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dhd> {
      T create(hx var1, djp var2);
   }

   public static final class b<T extends dhd> {
      private final dhf.a<? extends T> a;
      final Set<cwy> b;

      private b(dhf.a<? extends T> $$0, Set<cwy> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dhd> dhf.b<T> a(dhf.a<? extends T> $$0, cwy... $$1) {
         return new dhf.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dhf<T> a(Type<?> $$0) {
         return new dhf<>(this.a, this.b, $$0);
      }
   }
}
