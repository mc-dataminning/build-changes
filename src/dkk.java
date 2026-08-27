import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkk<T extends dki> {
   private static final Logger S = LogUtils.getLogger();
   public static final dkk<dle> a = a("furnace", dkk.b.a(dle::new, dae.cD));
   public static final dkk<dkp> b = a("chest", dkk.b.a(dkp::new, dae.cv));
   public static final dkk<dma> c = a("trapped_chest", dkk.b.a(dma::new, dae.gV));
   public static final dkk<dld> d = a("ender_chest", dkk.b.a(dld::new, dae.fG));
   public static final dkk<dlj> e = a("jukebox", dkk.b.a(dlj::new, dae.dT));
   public static final dkk<dla> f = a("dispenser", dkk.b.a(dla::new, dae.aU));
   public static final dkk<dlb> g = a("dropper", dkk.b.a(dlb::new, dae.hi));
   public static final dkk<dlr> h = a(
      "sign",
      dkk.b.a(
         dlr::new,
         dae.cE,
         dae.cF,
         dae.cG,
         dae.cH,
         dae.cI,
         dae.cJ,
         dae.cK,
         dae.cR,
         dae.cS,
         dae.cT,
         dae.cU,
         dae.cV,
         dae.cW,
         dae.cX,
         dae.oW,
         dae.oY,
         dae.oX,
         dae.oZ,
         dae.cL,
         dae.cY,
         dae.cM,
         dae.cZ
      )
   );
   public static final dkk<dlf> i = a(
      "hanging_sign",
      dkk.b.a(
         dlf::new,
         dae.da,
         dae.db,
         dae.dc,
         dae.dd,
         dae.de,
         dae.df,
         dae.dg,
         dae.dh,
         dae.di,
         dae.dj,
         dae.dk,
         dae.dl,
         dae.dm,
         dae.dn,
         dae.do,
         dae.dp,
         dae.dq,
         dae.dr,
         dae.dt,
         dae.du,
         dae.ds,
         dae.dv
      )
   );
   public static final dkk<dlv> j = a("mob_spawner", dkk.b.a(dlv::new, dae.ct));
   public static final dkk<dmx> k = a("piston", dkk.b.a(dmx::new, dae.bQ));
   public static final dkk<dkl> l = a("brewing_stand", dkk.b.a(dkl::new, dae.fs));
   public static final dkk<dlc> m = a("enchanting_table", dkk.b.a(dlc::new, dae.fr));
   public static final dkk<dly> n = a("end_portal", dkk.b.a(dly::new, dae.fx));
   public static final dkk<dkd> o = a("beacon", dkk.b.a(dkd::new, dae.fO));
   public static final dkk<dlt> p = a(
      "skull", dkk.b.a(dlt::new, dae.gE, dae.gF, dae.gM, dae.gN, dae.gO, dae.gP, dae.gI, dae.gJ, dae.gG, dae.gH, dae.gK, dae.gL, dae.gQ, dae.gR)
   );
   public static final dkk<dkx> q = a("daylight_detector", dkk.b.a(dkx::new, dae.gZ));
   public static final dkk<dlh> r = a("hopper", dkk.b.a(dlh::new, dae.hc));
   public static final dkk<dkt> s = a("comparator", dkk.b.a(dkt::new, dae.gY));
   public static final dkk<djy> t = a(
      "banner",
      dkk.b.a(
         djy::new,
         dae.iJ,
         dae.iK,
         dae.iL,
         dae.iM,
         dae.iN,
         dae.iO,
         dae.iP,
         dae.iQ,
         dae.iR,
         dae.iS,
         dae.iT,
         dae.iU,
         dae.iV,
         dae.iW,
         dae.iX,
         dae.iY,
         dae.iZ,
         dae.ja,
         dae.jb,
         dae.jc,
         dae.jd,
         dae.je,
         dae.jf,
         dae.jg,
         dae.jh,
         dae.ji,
         dae.jj,
         dae.jk,
         dae.jl,
         dae.jm,
         dae.jn,
         dae.jo
      )
   );
   public static final dkk<dlw> u = a("structure_block", dkk.b.a(dlw::new, dae.pa));
   public static final dkk<dlx> v = a("end_gateway", dkk.b.a(dlx::new, dae.kF));
   public static final dkk<dks> w = a("command_block", dkk.b.a(dks::new, dae.fN, dae.kH, dae.kG));
   public static final dkk<dlq> x = a(
      "shulker_box",
      dkk.b.a(dlq::new, dae.kP, dae.lf, dae.lb, dae.lc, dae.kZ, dae.kX, dae.ld, dae.kT, dae.kY, dae.kV, dae.kS, dae.kR, dae.kW, dae.la, dae.le, dae.kQ, dae.kU)
   );
   public static final dkk<dke> y = a(
      "bed", dkk.b.a(dke::new, dae.bn, dae.bo, dae.bk, dae.bl, dae.bi, dae.bg, dae.bm, dae.bc, dae.bh, dae.be, dae.bb, dae.ba, dae.bf, dae.bj, dae.aZ, dae.bd)
   );
   public static final dkk<dku> z = a("conduit", dkk.b.a(dku::new, dae.mX));
   public static final dkk<dkb> A = a("barrel", dkk.b.a(dkb::new, dae.nU));
   public static final dkk<dlu> B = a("smoker", dkk.b.a(dlu::new, dae.nV));
   public static final dkk<dkh> C = a("blast_furnace", dkk.b.a(dkh::new, dae.nW));
   public static final dkk<dlk> D = a("lectern", dkk.b.a(dlk::new, dae.oa));
   public static final dkk<dkg> E = a("bell", dkk.b.a(dkg::new, dae.od));
   public static final dkk<dli> F = a("jigsaw", dkk.b.a(dli::new, dae.pb));
   public static final dkk<dko> G = a("campfire", dkk.b.a(dko::new, dae.og, dae.oh));
   public static final dkk<dkf> H = a("beehive", dkk.b.a(dkf::new, dae.pe, dae.pf));
   public static final dkk<dlo> I = a("sculk_sensor", dkk.b.a(dlo::new, dae.qQ));
   public static final dkk<dkn> J = a("calibrated_sculk_sensor", dkk.b.a(dkn::new, dae.qR));
   public static final dkk<dln> K = a("sculk_catalyst", dkk.b.a(dln::new, dae.qU));
   public static final dkk<dlp> L = a("sculk_shrieker", dkk.b.a(dlp::new, dae.qV));
   public static final dkk<dkr> M = a("chiseled_bookshelf", dkk.b.a(dkr::new, dae.cm));
   public static final dkk<dkm> N = a("brushable_block", dkk.b.a(dkm::new, dae.J, dae.M));
   public static final dkk<dky> O = a("decorated_pot", dkk.b.a(dky::new, dae.tp));
   public static final dkk<dkw> P = a("crafter", dkk.b.a(dkw::new, dae.tq));
   public static final dkk<dmb> Q = a("trial_spawner", dkk.b.a(dmb::new, dae.tr));
   public static final dkk<dmj> R = a("vault", dkk.b.a(dmj::new, dae.ts));
   private final dkk.a<? extends T> T;
   private final Set<dac> U;
   private final Type<?> V;
   private final il.c<dkk<?>> W = ki.k.f(this);

   @Nullable
   public static ajh a(dkk<?> $$0) {
      return ki.k.b($$0);
   }

   private static <T extends dki> dkk<T> a(String $$0, dkk.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(beh.s, $$0);
      return iy.a(ki.k, $$0, $$1.a($$2));
   }

   public dkk(dkk.a<? extends T> $$0, Set<dac> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(ib $$0, dnb $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dnb $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public il.c<dkk<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(cwh $$0, ib $$1) {
      dki $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dki> {
      T create(ib var1, dnb var2);
   }

   public static final class b<T extends dki> {
      private final dkk.a<? extends T> a;
      final Set<dac> b;

      private b(dkk.a<? extends T> $$0, Set<dac> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dki> dkk.b<T> a(dkk.a<? extends T> $$0, dac... $$1) {
         return new dkk.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dkk<T> a(Type<?> $$0) {
         return new dkk<>(this.a, this.b, $$0);
      }
   }
}
