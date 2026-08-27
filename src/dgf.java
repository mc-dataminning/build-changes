import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgf<T extends dgd> {
   private static final Logger R = LogUtils.getLogger();
   public static final dgf<dgz> a = a("furnace", dgf.b.a(dgz::new, cwb.cD));
   public static final dgf<dgk> b = a("chest", dgf.b.a(dgk::new, cwb.cv));
   public static final dgf<dhv> c = a("trapped_chest", dgf.b.a(dhv::new, cwb.gV));
   public static final dgf<dgy> d = a("ender_chest", dgf.b.a(dgy::new, cwb.fG));
   public static final dgf<dhe> e = a("jukebox", dgf.b.a(dhe::new, cwb.dT));
   public static final dgf<dgv> f = a("dispenser", dgf.b.a(dgv::new, cwb.aU));
   public static final dgf<dgw> g = a("dropper", dgf.b.a(dgw::new, cwb.hi));
   public static final dgf<dhm> h = a(
      "sign",
      dgf.b.a(
         dhm::new,
         cwb.cE,
         cwb.cF,
         cwb.cG,
         cwb.cH,
         cwb.cI,
         cwb.cJ,
         cwb.cK,
         cwb.cR,
         cwb.cS,
         cwb.cT,
         cwb.cU,
         cwb.cV,
         cwb.cW,
         cwb.cX,
         cwb.oW,
         cwb.oY,
         cwb.oX,
         cwb.oZ,
         cwb.cL,
         cwb.cY,
         cwb.cM,
         cwb.cZ
      )
   );
   public static final dgf<dha> i = a(
      "hanging_sign",
      dgf.b.a(
         dha::new,
         cwb.da,
         cwb.db,
         cwb.dc,
         cwb.dd,
         cwb.de,
         cwb.df,
         cwb.dg,
         cwb.dh,
         cwb.di,
         cwb.dj,
         cwb.dk,
         cwb.dl,
         cwb.dm,
         cwb.dn,
         cwb.do,
         cwb.dp,
         cwb.dq,
         cwb.dr,
         cwb.dt,
         cwb.du,
         cwb.ds,
         cwb.dv
      )
   );
   public static final dgf<dhq> j = a("mob_spawner", dgf.b.a(dhq::new, cwb.ct));
   public static final dgf<dil> k = a("piston", dgf.b.a(dil::new, cwb.bQ));
   public static final dgf<dgg> l = a("brewing_stand", dgf.b.a(dgg::new, cwb.fs));
   public static final dgf<dgx> m = a("enchanting_table", dgf.b.a(dgx::new, cwb.fr));
   public static final dgf<dht> n = a("end_portal", dgf.b.a(dht::new, cwb.fx));
   public static final dgf<dfy> o = a("beacon", dgf.b.a(dfy::new, cwb.fO));
   public static final dgf<dho> p = a(
      "skull", dgf.b.a(dho::new, cwb.gE, cwb.gF, cwb.gM, cwb.gN, cwb.gO, cwb.gP, cwb.gI, cwb.gJ, cwb.gG, cwb.gH, cwb.gK, cwb.gL, cwb.gQ, cwb.gR)
   );
   public static final dgf<dgs> q = a("daylight_detector", dgf.b.a(dgs::new, cwb.gZ));
   public static final dgf<dhc> r = a("hopper", dgf.b.a(dhc::new, cwb.hc));
   public static final dgf<dgo> s = a("comparator", dgf.b.a(dgo::new, cwb.gY));
   public static final dgf<dft> t = a(
      "banner",
      dgf.b.a(
         dft::new,
         cwb.iJ,
         cwb.iK,
         cwb.iL,
         cwb.iM,
         cwb.iN,
         cwb.iO,
         cwb.iP,
         cwb.iQ,
         cwb.iR,
         cwb.iS,
         cwb.iT,
         cwb.iU,
         cwb.iV,
         cwb.iW,
         cwb.iX,
         cwb.iY,
         cwb.iZ,
         cwb.ja,
         cwb.jb,
         cwb.jc,
         cwb.jd,
         cwb.je,
         cwb.jf,
         cwb.jg,
         cwb.jh,
         cwb.ji,
         cwb.jj,
         cwb.jk,
         cwb.jl,
         cwb.jm,
         cwb.jn,
         cwb.jo
      )
   );
   public static final dgf<dhr> u = a("structure_block", dgf.b.a(dhr::new, cwb.pa));
   public static final dgf<dhs> v = a("end_gateway", dgf.b.a(dhs::new, cwb.kF));
   public static final dgf<dgn> w = a("command_block", dgf.b.a(dgn::new, cwb.fN, cwb.kH, cwb.kG));
   public static final dgf<dhl> x = a(
      "shulker_box",
      dgf.b.a(dhl::new, cwb.kP, cwb.lf, cwb.lb, cwb.lc, cwb.kZ, cwb.kX, cwb.ld, cwb.kT, cwb.kY, cwb.kV, cwb.kS, cwb.kR, cwb.kW, cwb.la, cwb.le, cwb.kQ, cwb.kU)
   );
   public static final dgf<dfz> y = a(
      "bed", dgf.b.a(dfz::new, cwb.bn, cwb.bo, cwb.bk, cwb.bl, cwb.bi, cwb.bg, cwb.bm, cwb.bc, cwb.bh, cwb.be, cwb.bb, cwb.ba, cwb.bf, cwb.bj, cwb.aZ, cwb.bd)
   );
   public static final dgf<dgp> z = a("conduit", dgf.b.a(dgp::new, cwb.mX));
   public static final dgf<dfw> A = a("barrel", dgf.b.a(dfw::new, cwb.nU));
   public static final dgf<dhp> B = a("smoker", dgf.b.a(dhp::new, cwb.nV));
   public static final dgf<dgc> C = a("blast_furnace", dgf.b.a(dgc::new, cwb.nW));
   public static final dgf<dhf> D = a("lectern", dgf.b.a(dhf::new, cwb.oa));
   public static final dgf<dgb> E = a("bell", dgf.b.a(dgb::new, cwb.od));
   public static final dgf<dhd> F = a("jigsaw", dgf.b.a(dhd::new, cwb.pb));
   public static final dgf<dgj> G = a("campfire", dgf.b.a(dgj::new, cwb.og, cwb.oh));
   public static final dgf<dga> H = a("beehive", dgf.b.a(dga::new, cwb.pe, cwb.pf));
   public static final dgf<dhj> I = a("sculk_sensor", dgf.b.a(dhj::new, cwb.qQ));
   public static final dgf<dgi> J = a("calibrated_sculk_sensor", dgf.b.a(dgi::new, cwb.qR));
   public static final dgf<dhi> K = a("sculk_catalyst", dgf.b.a(dhi::new, cwb.qU));
   public static final dgf<dhk> L = a("sculk_shrieker", dgf.b.a(dhk::new, cwb.qV));
   public static final dgf<dgm> M = a("chiseled_bookshelf", dgf.b.a(dgm::new, cwb.cm));
   public static final dgf<dgh> N = a("brushable_block", dgf.b.a(dgh::new, cwb.J, cwb.M));
   public static final dgf<dgt> O = a("decorated_pot", dgf.b.a(dgt::new, cwb.tp));
   public static final dgf<dgr> P = a("crafter", dgf.b.a(dgr::new, cwb.tq));
   public static final dgf<dhw> Q = a("trial_spawner", dgf.b.a(dhw::new, cwb.tr));
   private final dgf.a<? extends T> S;
   private final Set<cvz> T;
   private final Type<?> U;
   private final ie.c<dgf<?>> V = kb.k.f(this);

   @Nullable
   public static agt a(dgf<?> $$0) {
      return kb.k.b($$0);
   }

   private static <T extends dgd> dgf<T> a(String $$0, dgf.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         R.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bbg.s, $$0);
      return ir.a(kb.k, $$0, $$1.a($$2));
   }

   public dgf(dgf.a<? extends T> $$0, Set<cvz> $$1, Type<?> $$2) {
      this.S = $$0;
      this.T = $$1;
      this.U = $$2;
   }

   @Nullable
   public T a(hv $$0, dip $$1) {
      return (T)this.S.create($$0, $$1);
   }

   public boolean a(dip $$0) {
      return this.T.contains($$0.b());
   }

   @Nullable
   public ie.c<dgf<?>> a() {
      return this.V;
   }

   @Nullable
   public T a(cse $$0, hv $$1) {
      dgd $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.v() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dgd> {
      T create(hv var1, dip var2);
   }

   public static final class b<T extends dgd> {
      private final dgf.a<? extends T> a;
      final Set<cvz> b;

      private b(dgf.a<? extends T> $$0, Set<cvz> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dgd> dgf.b<T> a(dgf.a<? extends T> $$0, cvz... $$1) {
         return new dgf.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dgf<T> a(Type<?> $$0) {
         return new dgf<>(this.a, this.b, $$0);
      }
   }
}
