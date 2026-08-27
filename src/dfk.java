import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfk<T extends dfi> {
   private static final Logger Q = LogUtils.getLogger();
   public static final dfk<dge> a = a("furnace", dfk.b.a(dge::new, cvh.cD));
   public static final dfk<dfp> b = a("chest", dfk.b.a(dfp::new, cvh.cv));
   public static final dfk<dha> c = a("trapped_chest", dfk.b.a(dha::new, cvh.gV));
   public static final dfk<dgd> d = a("ender_chest", dfk.b.a(dgd::new, cvh.fG));
   public static final dfk<dgj> e = a("jukebox", dfk.b.a(dgj::new, cvh.dT));
   public static final dfk<dga> f = a("dispenser", dfk.b.a(dga::new, cvh.aU));
   public static final dfk<dgb> g = a("dropper", dfk.b.a(dgb::new, cvh.hi));
   public static final dfk<dgr> h = a(
      "sign",
      dfk.b.a(
         dgr::new,
         cvh.cE,
         cvh.cF,
         cvh.cG,
         cvh.cH,
         cvh.cI,
         cvh.cJ,
         cvh.cK,
         cvh.cR,
         cvh.cS,
         cvh.cT,
         cvh.cU,
         cvh.cV,
         cvh.cW,
         cvh.cX,
         cvh.oW,
         cvh.oY,
         cvh.oX,
         cvh.oZ,
         cvh.cL,
         cvh.cY,
         cvh.cM,
         cvh.cZ
      )
   );
   public static final dfk<dgf> i = a(
      "hanging_sign",
      dfk.b.a(
         dgf::new,
         cvh.da,
         cvh.db,
         cvh.dc,
         cvh.dd,
         cvh.de,
         cvh.df,
         cvh.dg,
         cvh.dh,
         cvh.di,
         cvh.dj,
         cvh.dk,
         cvh.dl,
         cvh.dm,
         cvh.dn,
         cvh.do,
         cvh.dp,
         cvh.dq,
         cvh.dr,
         cvh.dt,
         cvh.du,
         cvh.ds,
         cvh.dv
      )
   );
   public static final dfk<dgv> j = a("mob_spawner", dfk.b.a(dgv::new, cvh.ct));
   public static final dfk<dhj> k = a("piston", dfk.b.a(dhj::new, cvh.bQ));
   public static final dfk<dfl> l = a("brewing_stand", dfk.b.a(dfl::new, cvh.fs));
   public static final dfk<dgc> m = a("enchanting_table", dfk.b.a(dgc::new, cvh.fr));
   public static final dfk<dgy> n = a("end_portal", dfk.b.a(dgy::new, cvh.fx));
   public static final dfk<dfd> o = a("beacon", dfk.b.a(dfd::new, cvh.fO));
   public static final dfk<dgt> p = a(
      "skull", dfk.b.a(dgt::new, cvh.gE, cvh.gF, cvh.gM, cvh.gN, cvh.gO, cvh.gP, cvh.gI, cvh.gJ, cvh.gG, cvh.gH, cvh.gK, cvh.gL, cvh.gQ, cvh.gR)
   );
   public static final dfk<dfx> q = a("daylight_detector", dfk.b.a(dfx::new, cvh.gZ));
   public static final dfk<dgh> r = a("hopper", dfk.b.a(dgh::new, cvh.hc));
   public static final dfk<dft> s = a("comparator", dfk.b.a(dft::new, cvh.gY));
   public static final dfk<dey> t = a(
      "banner",
      dfk.b.a(
         dey::new,
         cvh.iJ,
         cvh.iK,
         cvh.iL,
         cvh.iM,
         cvh.iN,
         cvh.iO,
         cvh.iP,
         cvh.iQ,
         cvh.iR,
         cvh.iS,
         cvh.iT,
         cvh.iU,
         cvh.iV,
         cvh.iW,
         cvh.iX,
         cvh.iY,
         cvh.iZ,
         cvh.ja,
         cvh.jb,
         cvh.jc,
         cvh.jd,
         cvh.je,
         cvh.jf,
         cvh.jg,
         cvh.jh,
         cvh.ji,
         cvh.jj,
         cvh.jk,
         cvh.jl,
         cvh.jm,
         cvh.jn,
         cvh.jo
      )
   );
   public static final dfk<dgw> u = a("structure_block", dfk.b.a(dgw::new, cvh.pa));
   public static final dfk<dgx> v = a("end_gateway", dfk.b.a(dgx::new, cvh.kF));
   public static final dfk<dfs> w = a("command_block", dfk.b.a(dfs::new, cvh.fN, cvh.kH, cvh.kG));
   public static final dfk<dgq> x = a(
      "shulker_box",
      dfk.b.a(dgq::new, cvh.kP, cvh.lf, cvh.lb, cvh.lc, cvh.kZ, cvh.kX, cvh.ld, cvh.kT, cvh.kY, cvh.kV, cvh.kS, cvh.kR, cvh.kW, cvh.la, cvh.le, cvh.kQ, cvh.kU)
   );
   public static final dfk<dfe> y = a(
      "bed", dfk.b.a(dfe::new, cvh.bn, cvh.bo, cvh.bk, cvh.bl, cvh.bi, cvh.bg, cvh.bm, cvh.bc, cvh.bh, cvh.be, cvh.bb, cvh.ba, cvh.bf, cvh.bj, cvh.aZ, cvh.bd)
   );
   public static final dfk<dfu> z = a("conduit", dfk.b.a(dfu::new, cvh.mX));
   public static final dfk<dfb> A = a("barrel", dfk.b.a(dfb::new, cvh.nU));
   public static final dfk<dgu> B = a("smoker", dfk.b.a(dgu::new, cvh.nV));
   public static final dfk<dfh> C = a("blast_furnace", dfk.b.a(dfh::new, cvh.nW));
   public static final dfk<dgk> D = a("lectern", dfk.b.a(dgk::new, cvh.oa));
   public static final dfk<dfg> E = a("bell", dfk.b.a(dfg::new, cvh.od));
   public static final dfk<dgi> F = a("jigsaw", dfk.b.a(dgi::new, cvh.pb));
   public static final dfk<dfo> G = a("campfire", dfk.b.a(dfo::new, cvh.og, cvh.oh));
   public static final dfk<dff> H = a("beehive", dfk.b.a(dff::new, cvh.pe, cvh.pf));
   public static final dfk<dgo> I = a("sculk_sensor", dfk.b.a(dgo::new, cvh.qQ));
   public static final dfk<dfn> J = a("calibrated_sculk_sensor", dfk.b.a(dfn::new, cvh.qR));
   public static final dfk<dgn> K = a("sculk_catalyst", dfk.b.a(dgn::new, cvh.qU));
   public static final dfk<dgp> L = a("sculk_shrieker", dfk.b.a(dgp::new, cvh.qV));
   public static final dfk<dfr> M = a("chiseled_bookshelf", dfk.b.a(dfr::new, cvh.cm));
   public static final dfk<dfm> N = a("brushable_block", dfk.b.a(dfm::new, cvh.J, cvh.M));
   public static final dfk<dfy> O = a("decorated_pot", dfk.b.a(dfy::new, cvh.tp));
   public static final dfk<dfw> P = a("crafter", dfk.b.a(dfw::new, cvh.tq));
   private final dfk.a<? extends T> R;
   private final Set<cvf> S;
   private final Type<?> T;
   private final ig.c<dfk<?>> U = kc.l.f(this);

   @Nullable
   public static agm a(dfk<?> $$0) {
      return kc.l.b($$0);
   }

   private static <T extends dfi> dfk<T> a(String $$0, dfk.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         Q.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bax.s, $$0);
      return is.a(kc.l, $$0, $$1.a($$2));
   }

   public dfk(dfk.a<? extends T> $$0, Set<cvf> $$1, Type<?> $$2) {
      this.R = $$0;
      this.S = $$1;
      this.T = $$2;
   }

   @Nullable
   public T a(hx $$0, dhn $$1) {
      return (T)this.R.create($$0, $$1);
   }

   public boolean a(dhn $$0) {
      return this.S.contains($$0.b());
   }

   @Nullable
   public ig.c<dfk<?>> a() {
      return this.U;
   }

   @Nullable
   public T a(crl $$0, hx $$1) {
      dfi $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.v() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dfi> {
      T create(hx var1, dhn var2);
   }

   public static final class b<T extends dfi> {
      private final dfk.a<? extends T> a;
      final Set<cvf> b;

      private b(dfk.a<? extends T> $$0, Set<cvf> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dfi> dfk.b<T> a(dfk.a<? extends T> $$0, cvf... $$1) {
         return new dfk.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dfk<T> a(Type<?> $$0) {
         return new dfk<>(this.a, this.b, $$0);
      }
   }
}
