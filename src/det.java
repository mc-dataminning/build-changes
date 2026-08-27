import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class det<T extends der> {
   private static final Logger Q = LogUtils.getLogger();
   public static final det<dfn> a = a("furnace", det.b.a(dfn::new, cuv.cD));
   public static final det<dey> b = a("chest", det.b.a(dey::new, cuv.cv));
   public static final det<dgj> c = a("trapped_chest", det.b.a(dgj::new, cuv.gV));
   public static final det<dfm> d = a("ender_chest", det.b.a(dfm::new, cuv.fG));
   public static final det<dfs> e = a("jukebox", det.b.a(dfs::new, cuv.dT));
   public static final det<dfj> f = a("dispenser", det.b.a(dfj::new, cuv.aU));
   public static final det<dfk> g = a("dropper", det.b.a(dfk::new, cuv.hi));
   public static final det<dga> h = a(
      "sign",
      det.b.a(
         dga::new,
         cuv.cE,
         cuv.cF,
         cuv.cG,
         cuv.cH,
         cuv.cI,
         cuv.cJ,
         cuv.cK,
         cuv.cR,
         cuv.cS,
         cuv.cT,
         cuv.cU,
         cuv.cV,
         cuv.cW,
         cuv.cX,
         cuv.oW,
         cuv.oY,
         cuv.oX,
         cuv.oZ,
         cuv.cL,
         cuv.cY,
         cuv.cM,
         cuv.cZ
      )
   );
   public static final det<dfo> i = a(
      "hanging_sign",
      det.b.a(
         dfo::new,
         cuv.da,
         cuv.db,
         cuv.dc,
         cuv.dd,
         cuv.de,
         cuv.df,
         cuv.dg,
         cuv.dh,
         cuv.di,
         cuv.dj,
         cuv.dk,
         cuv.dl,
         cuv.dm,
         cuv.dn,
         cuv.do,
         cuv.dp,
         cuv.dq,
         cuv.dr,
         cuv.dt,
         cuv.du,
         cuv.ds,
         cuv.dv
      )
   );
   public static final det<dge> j = a("mob_spawner", det.b.a(dge::new, cuv.ct));
   public static final det<dgs> k = a("piston", det.b.a(dgs::new, cuv.bQ));
   public static final det<deu> l = a("brewing_stand", det.b.a(deu::new, cuv.fs));
   public static final det<dfl> m = a("enchanting_table", det.b.a(dfl::new, cuv.fr));
   public static final det<dgh> n = a("end_portal", det.b.a(dgh::new, cuv.fx));
   public static final det<dem> o = a("beacon", det.b.a(dem::new, cuv.fO));
   public static final det<dgc> p = a(
      "skull", det.b.a(dgc::new, cuv.gE, cuv.gF, cuv.gM, cuv.gN, cuv.gO, cuv.gP, cuv.gI, cuv.gJ, cuv.gG, cuv.gH, cuv.gK, cuv.gL, cuv.gQ, cuv.gR)
   );
   public static final det<dfg> q = a("daylight_detector", det.b.a(dfg::new, cuv.gZ));
   public static final det<dfq> r = a("hopper", det.b.a(dfq::new, cuv.hc));
   public static final det<dfc> s = a("comparator", det.b.a(dfc::new, cuv.gY));
   public static final det<deh> t = a(
      "banner",
      det.b.a(
         deh::new,
         cuv.iJ,
         cuv.iK,
         cuv.iL,
         cuv.iM,
         cuv.iN,
         cuv.iO,
         cuv.iP,
         cuv.iQ,
         cuv.iR,
         cuv.iS,
         cuv.iT,
         cuv.iU,
         cuv.iV,
         cuv.iW,
         cuv.iX,
         cuv.iY,
         cuv.iZ,
         cuv.ja,
         cuv.jb,
         cuv.jc,
         cuv.jd,
         cuv.je,
         cuv.jf,
         cuv.jg,
         cuv.jh,
         cuv.ji,
         cuv.jj,
         cuv.jk,
         cuv.jl,
         cuv.jm,
         cuv.jn,
         cuv.jo
      )
   );
   public static final det<dgf> u = a("structure_block", det.b.a(dgf::new, cuv.pa));
   public static final det<dgg> v = a("end_gateway", det.b.a(dgg::new, cuv.kF));
   public static final det<dfb> w = a("command_block", det.b.a(dfb::new, cuv.fN, cuv.kH, cuv.kG));
   public static final det<dfz> x = a(
      "shulker_box",
      det.b.a(dfz::new, cuv.kP, cuv.lf, cuv.lb, cuv.lc, cuv.kZ, cuv.kX, cuv.ld, cuv.kT, cuv.kY, cuv.kV, cuv.kS, cuv.kR, cuv.kW, cuv.la, cuv.le, cuv.kQ, cuv.kU)
   );
   public static final det<den> y = a(
      "bed", det.b.a(den::new, cuv.bn, cuv.bo, cuv.bk, cuv.bl, cuv.bi, cuv.bg, cuv.bm, cuv.bc, cuv.bh, cuv.be, cuv.bb, cuv.ba, cuv.bf, cuv.bj, cuv.aZ, cuv.bd)
   );
   public static final det<dfd> z = a("conduit", det.b.a(dfd::new, cuv.mX));
   public static final det<dek> A = a("barrel", det.b.a(dek::new, cuv.nU));
   public static final det<dgd> B = a("smoker", det.b.a(dgd::new, cuv.nV));
   public static final det<deq> C = a("blast_furnace", det.b.a(deq::new, cuv.nW));
   public static final det<dft> D = a("lectern", det.b.a(dft::new, cuv.oa));
   public static final det<dep> E = a("bell", det.b.a(dep::new, cuv.od));
   public static final det<dfr> F = a("jigsaw", det.b.a(dfr::new, cuv.pb));
   public static final det<dex> G = a("campfire", det.b.a(dex::new, cuv.og, cuv.oh));
   public static final det<deo> H = a("beehive", det.b.a(deo::new, cuv.pe, cuv.pf));
   public static final det<dfx> I = a("sculk_sensor", det.b.a(dfx::new, cuv.qD));
   public static final det<dew> J = a("calibrated_sculk_sensor", det.b.a(dew::new, cuv.qE));
   public static final det<dfw> K = a("sculk_catalyst", det.b.a(dfw::new, cuv.qH));
   public static final det<dfy> L = a("sculk_shrieker", det.b.a(dfy::new, cuv.qI));
   public static final det<dfa> M = a("chiseled_bookshelf", det.b.a(dfa::new, cuv.cm));
   public static final det<dev> N = a("brushable_block", det.b.a(dev::new, cuv.J, cuv.M));
   public static final det<dfh> O = a("decorated_pot", det.b.a(dfh::new, cuv.so));
   public static final det<dff> P = a("crafter", det.b.a(dff::new, cuv.sp));
   private final det.a<? extends T> R;
   private final Set<cut> S;
   private final Type<?> T;
   private final ib.c<det<?>> U = jy.l.f(this);

   @Nullable
   public static agg a(det<?> $$0) {
      return jy.l.b($$0);
   }

   private static <T extends der> det<T> a(String $$0, det.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         Q.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(ban.s, $$0);
      return io.a(jy.l, $$0, $$1.a($$2));
   }

   public det(det.a<? extends T> $$0, Set<cut> $$1, Type<?> $$2) {
      this.R = $$0;
      this.S = $$1;
      this.T = $$2;
   }

   @Nullable
   public T a(ht $$0, dgw $$1) {
      return (T)this.R.create($$0, $$1);
   }

   public boolean a(dgw $$0) {
      return this.S.contains($$0.b());
   }

   @Nullable
   public ib.c<det<?>> a() {
      return this.U;
   }

   @Nullable
   public T a(cqy $$0, ht $$1) {
      der $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.u() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends der> {
      T create(ht var1, dgw var2);
   }

   public static final class b<T extends der> {
      private final det.a<? extends T> a;
      final Set<cut> b;

      private b(det.a<? extends T> $$0, Set<cut> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends der> det.b<T> a(det.a<? extends T> $$0, cut... $$1) {
         return new det.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public det<T> a(Type<?> $$0) {
         return new det<>(this.a, this.b, $$0);
      }
   }
}
