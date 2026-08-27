import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dki<T extends dkg> {
   private static final Logger S = LogUtils.getLogger();
   public static final dki<dlc> a = a("furnace", dki.b.a(dlc::new, dac.cD));
   public static final dki<dkn> b = a("chest", dki.b.a(dkn::new, dac.cv));
   public static final dki<dly> c = a("trapped_chest", dki.b.a(dly::new, dac.gV));
   public static final dki<dlb> d = a("ender_chest", dki.b.a(dlb::new, dac.fG));
   public static final dki<dlh> e = a("jukebox", dki.b.a(dlh::new, dac.dT));
   public static final dki<dky> f = a("dispenser", dki.b.a(dky::new, dac.aU));
   public static final dki<dkz> g = a("dropper", dki.b.a(dkz::new, dac.hi));
   public static final dki<dlp> h = a(
      "sign",
      dki.b.a(
         dlp::new,
         dac.cE,
         dac.cF,
         dac.cG,
         dac.cH,
         dac.cI,
         dac.cJ,
         dac.cK,
         dac.cR,
         dac.cS,
         dac.cT,
         dac.cU,
         dac.cV,
         dac.cW,
         dac.cX,
         dac.oW,
         dac.oY,
         dac.oX,
         dac.oZ,
         dac.cL,
         dac.cY,
         dac.cM,
         dac.cZ
      )
   );
   public static final dki<dld> i = a(
      "hanging_sign",
      dki.b.a(
         dld::new,
         dac.da,
         dac.db,
         dac.dc,
         dac.dd,
         dac.de,
         dac.df,
         dac.dg,
         dac.dh,
         dac.di,
         dac.dj,
         dac.dk,
         dac.dl,
         dac.dm,
         dac.dn,
         dac.do,
         dac.dp,
         dac.dq,
         dac.dr,
         dac.dt,
         dac.du,
         dac.ds,
         dac.dv
      )
   );
   public static final dki<dlt> j = a("mob_spawner", dki.b.a(dlt::new, dac.ct));
   public static final dki<dmv> k = a("piston", dki.b.a(dmv::new, dac.bQ));
   public static final dki<dkj> l = a("brewing_stand", dki.b.a(dkj::new, dac.fs));
   public static final dki<dla> m = a("enchanting_table", dki.b.a(dla::new, dac.fr));
   public static final dki<dlw> n = a("end_portal", dki.b.a(dlw::new, dac.fx));
   public static final dki<dkb> o = a("beacon", dki.b.a(dkb::new, dac.fO));
   public static final dki<dlr> p = a(
      "skull", dki.b.a(dlr::new, dac.gE, dac.gF, dac.gM, dac.gN, dac.gO, dac.gP, dac.gI, dac.gJ, dac.gG, dac.gH, dac.gK, dac.gL, dac.gQ, dac.gR)
   );
   public static final dki<dkv> q = a("daylight_detector", dki.b.a(dkv::new, dac.gZ));
   public static final dki<dlf> r = a("hopper", dki.b.a(dlf::new, dac.hc));
   public static final dki<dkr> s = a("comparator", dki.b.a(dkr::new, dac.gY));
   public static final dki<djw> t = a(
      "banner",
      dki.b.a(
         djw::new,
         dac.iJ,
         dac.iK,
         dac.iL,
         dac.iM,
         dac.iN,
         dac.iO,
         dac.iP,
         dac.iQ,
         dac.iR,
         dac.iS,
         dac.iT,
         dac.iU,
         dac.iV,
         dac.iW,
         dac.iX,
         dac.iY,
         dac.iZ,
         dac.ja,
         dac.jb,
         dac.jc,
         dac.jd,
         dac.je,
         dac.jf,
         dac.jg,
         dac.jh,
         dac.ji,
         dac.jj,
         dac.jk,
         dac.jl,
         dac.jm,
         dac.jn,
         dac.jo
      )
   );
   public static final dki<dlu> u = a("structure_block", dki.b.a(dlu::new, dac.pa));
   public static final dki<dlv> v = a("end_gateway", dki.b.a(dlv::new, dac.kF));
   public static final dki<dkq> w = a("command_block", dki.b.a(dkq::new, dac.fN, dac.kH, dac.kG));
   public static final dki<dlo> x = a(
      "shulker_box",
      dki.b.a(dlo::new, dac.kP, dac.lf, dac.lb, dac.lc, dac.kZ, dac.kX, dac.ld, dac.kT, dac.kY, dac.kV, dac.kS, dac.kR, dac.kW, dac.la, dac.le, dac.kQ, dac.kU)
   );
   public static final dki<dkc> y = a(
      "bed", dki.b.a(dkc::new, dac.bn, dac.bo, dac.bk, dac.bl, dac.bi, dac.bg, dac.bm, dac.bc, dac.bh, dac.be, dac.bb, dac.ba, dac.bf, dac.bj, dac.aZ, dac.bd)
   );
   public static final dki<dks> z = a("conduit", dki.b.a(dks::new, dac.mX));
   public static final dki<djz> A = a("barrel", dki.b.a(djz::new, dac.nU));
   public static final dki<dls> B = a("smoker", dki.b.a(dls::new, dac.nV));
   public static final dki<dkf> C = a("blast_furnace", dki.b.a(dkf::new, dac.nW));
   public static final dki<dli> D = a("lectern", dki.b.a(dli::new, dac.oa));
   public static final dki<dke> E = a("bell", dki.b.a(dke::new, dac.od));
   public static final dki<dlg> F = a("jigsaw", dki.b.a(dlg::new, dac.pb));
   public static final dki<dkm> G = a("campfire", dki.b.a(dkm::new, dac.og, dac.oh));
   public static final dki<dkd> H = a("beehive", dki.b.a(dkd::new, dac.pe, dac.pf));
   public static final dki<dlm> I = a("sculk_sensor", dki.b.a(dlm::new, dac.qQ));
   public static final dki<dkl> J = a("calibrated_sculk_sensor", dki.b.a(dkl::new, dac.qR));
   public static final dki<dll> K = a("sculk_catalyst", dki.b.a(dll::new, dac.qU));
   public static final dki<dln> L = a("sculk_shrieker", dki.b.a(dln::new, dac.qV));
   public static final dki<dkp> M = a("chiseled_bookshelf", dki.b.a(dkp::new, dac.cm));
   public static final dki<dkk> N = a("brushable_block", dki.b.a(dkk::new, dac.J, dac.M));
   public static final dki<dkw> O = a("decorated_pot", dki.b.a(dkw::new, dac.tp));
   public static final dki<dku> P = a("crafter", dki.b.a(dku::new, dac.tq));
   public static final dki<dlz> Q = a("trial_spawner", dki.b.a(dlz::new, dac.tr));
   public static final dki<dmh> R = a("vault", dki.b.a(dmh::new, dac.ts));
   private final dki.a<? extends T> T;
   private final Set<daa> U;
   private final Type<?> V;
   private final il.c<dki<?>> W = ki.k.f(this);

   @Nullable
   public static ajh a(dki<?> $$0) {
      return ki.k.b($$0);
   }

   private static <T extends dkg> dki<T> a(String $$0, dki.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(beh.s, $$0);
      return iy.a(ki.k, $$0, $$1.a($$2));
   }

   public dki(dki.a<? extends T> $$0, Set<daa> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(ib $$0, dmz $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dmz $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public il.c<dki<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(cwf $$0, ib $$1) {
      dkg $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dkg> {
      T create(ib var1, dmz var2);
   }

   public static final class b<T extends dkg> {
      private final dki.a<? extends T> a;
      final Set<daa> b;

      private b(dki.a<? extends T> $$0, Set<daa> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dkg> dki.b<T> a(dki.a<? extends T> $$0, daa... $$1) {
         return new dki.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dki<T> a(Type<?> $$0) {
         return new dki<>(this.a, this.b, $$0);
      }
   }
}
