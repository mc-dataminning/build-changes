import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqj<T extends dqh> {
   private static final Logger S = LogUtils.getLogger();
   public static final dqj<dre> a = a("furnace", dqj.b.a(dre::new, dga.cD));
   public static final dqj<dqo> b = a("chest", dqj.b.a(dqo::new, dga.cv));
   public static final dqj<dsb> c = a("trapped_chest", dqj.b.a(dsb::new, dga.gV));
   public static final dqj<drd> d = a("ender_chest", dqj.b.a(drd::new, dga.fG));
   public static final dqj<drj> e = a("jukebox", dqj.b.a(drj::new, dga.dT));
   public static final dqj<dra> f = a("dispenser", dqj.b.a(dra::new, dga.aU));
   public static final dqj<drb> g = a("dropper", dqj.b.a(drb::new, dga.hi));
   public static final dqj<drs> h = a(
      "sign",
      dqj.b.a(
         drs::new,
         dga.cE,
         dga.cF,
         dga.cG,
         dga.cH,
         dga.cI,
         dga.cJ,
         dga.cK,
         dga.cR,
         dga.cS,
         dga.cT,
         dga.cU,
         dga.cV,
         dga.cW,
         dga.cX,
         dga.oW,
         dga.oY,
         dga.oX,
         dga.oZ,
         dga.cL,
         dga.cY,
         dga.cM,
         dga.cZ
      )
   );
   public static final dqj<drf> i = a(
      "hanging_sign",
      dqj.b.a(
         drf::new,
         dga.da,
         dga.db,
         dga.dc,
         dga.dd,
         dga.de,
         dga.df,
         dga.dg,
         dga.dh,
         dga.di,
         dga.dj,
         dga.dk,
         dga.dl,
         dga.dm,
         dga.dn,
         dga.do,
         dga.dp,
         dga.dq,
         dga.dr,
         dga.dt,
         dga.du,
         dga.ds,
         dga.dv
      )
   );
   public static final dqj<drw> j = a("mob_spawner", dqj.b.a(drw::new, dga.ct));
   public static final dqj<dsy> k = a("piston", dqj.b.a(dsy::new, dga.bQ));
   public static final dqj<dqk> l = a("brewing_stand", dqj.b.a(dqk::new, dga.fs));
   public static final dqj<drc> m = a("enchanting_table", dqj.b.a(drc::new, dga.fr));
   public static final dqj<drz> n = a("end_portal", dqj.b.a(drz::new, dga.fx));
   public static final dqj<dqc> o = a("beacon", dqj.b.a(dqc::new, dga.fO));
   public static final dqj<dru> p = a(
      "skull", dqj.b.a(dru::new, dga.gE, dga.gF, dga.gM, dga.gN, dga.gO, dga.gP, dga.gI, dga.gJ, dga.gG, dga.gH, dga.gK, dga.gL, dga.gQ, dga.gR)
   );
   public static final dqj<dqw> q = a("daylight_detector", dqj.b.a(dqw::new, dga.gZ));
   public static final dqj<drh> r = a("hopper", dqj.b.a(drh::new, dga.hc));
   public static final dqj<dqs> s = a("comparator", dqj.b.a(dqs::new, dga.gY));
   public static final dqj<dpw> t = a(
      "banner",
      dqj.b.a(
         dpw::new,
         dga.iJ,
         dga.iK,
         dga.iL,
         dga.iM,
         dga.iN,
         dga.iO,
         dga.iP,
         dga.iQ,
         dga.iR,
         dga.iS,
         dga.iT,
         dga.iU,
         dga.iV,
         dga.iW,
         dga.iX,
         dga.iY,
         dga.iZ,
         dga.ja,
         dga.jb,
         dga.jc,
         dga.jd,
         dga.je,
         dga.jf,
         dga.jg,
         dga.jh,
         dga.ji,
         dga.jj,
         dga.jk,
         dga.jl,
         dga.jm,
         dga.jn,
         dga.jo
      )
   );
   public static final dqj<drx> u = a("structure_block", dqj.b.a(drx::new, dga.pa));
   public static final dqj<dry> v = a("end_gateway", dqj.b.a(dry::new, dga.kF));
   public static final dqj<dqr> w = a("command_block", dqj.b.a(dqr::new, dga.fN, dga.kH, dga.kG));
   public static final dqj<drr> x = a(
      "shulker_box",
      dqj.b.a(drr::new, dga.kP, dga.lf, dga.lb, dga.lc, dga.kZ, dga.kX, dga.ld, dga.kT, dga.kY, dga.kV, dga.kS, dga.kR, dga.kW, dga.la, dga.le, dga.kQ, dga.kU)
   );
   public static final dqj<dqd> y = a(
      "bed", dqj.b.a(dqd::new, dga.bn, dga.bo, dga.bk, dga.bl, dga.bi, dga.bg, dga.bm, dga.bc, dga.bh, dga.be, dga.bb, dga.ba, dga.bf, dga.bj, dga.aZ, dga.bd)
   );
   public static final dqj<dqt> z = a("conduit", dqj.b.a(dqt::new, dga.mX));
   public static final dqj<dqa> A = a("barrel", dqj.b.a(dqa::new, dga.nU));
   public static final dqj<drv> B = a("smoker", dqj.b.a(drv::new, dga.nV));
   public static final dqj<dqg> C = a("blast_furnace", dqj.b.a(dqg::new, dga.nW));
   public static final dqj<drk> D = a("lectern", dqj.b.a(drk::new, dga.oa));
   public static final dqj<dqf> E = a("bell", dqj.b.a(dqf::new, dga.od));
   public static final dqj<dri> F = a("jigsaw", dqj.b.a(dri::new, dga.pb));
   public static final dqj<dqn> G = a("campfire", dqj.b.a(dqn::new, dga.og, dga.oh));
   public static final dqj<dqe> H = a("beehive", dqj.b.a(dqe::new, dga.pe, dga.pf));
   public static final dqj<drp> I = a("sculk_sensor", dqj.b.a(drp::new, dga.qQ));
   public static final dqj<dqm> J = a("calibrated_sculk_sensor", dqj.b.a(dqm::new, dga.qR));
   public static final dqj<dro> K = a("sculk_catalyst", dqj.b.a(dro::new, dga.qU));
   public static final dqj<drq> L = a("sculk_shrieker", dqj.b.a(drq::new, dga.qV));
   public static final dqj<dqq> M = a("chiseled_bookshelf", dqj.b.a(dqq::new, dga.cm));
   public static final dqj<dql> N = a("brushable_block", dqj.b.a(dql::new, dga.J, dga.M));
   public static final dqj<dqx> O = a("decorated_pot", dqj.b.a(dqx::new, dga.tp));
   public static final dqj<dqv> P = a("crafter", dqj.b.a(dqv::new, dga.tq));
   public static final dqj<dsc> Q = a("trial_spawner", dqj.b.a(dsc::new, dga.tr));
   public static final dqj<dsk> R = a("vault", dqj.b.a(dsk::new, dga.ts));
   private final dqj.a<? extends T> T;
   private final Set<dfy> U;
   private final Type<?> V;
   private final jm.c<dqj<?>> W = lt.j.f(this);

   @Nullable
   public static akr a(dqj<?> $$0) {
      return lt.j.b($$0);
   }

   private static <T extends dqh> dqj<T> a(String $$0, dqj.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ad.a(bgr.s, $$0);
      return jz.a(lt.j, $$0, $$1.a($$2));
   }

   public dqj(dqj.a<? extends T> $$0, Set<dfy> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(jd $$0, dtc $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dtc $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public jm.c<dqj<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(dcc $$0, jd $$1) {
      dqh $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dqh> {
      T create(jd var1, dtc var2);
   }

   public static final class b<T extends dqh> {
      private final dqj.a<? extends T> a;
      final Set<dfy> b;

      private b(dqj.a<? extends T> $$0, Set<dfy> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dqh> dqj.b<T> a(dqj.a<? extends T> $$0, dfy... $$1) {
         return new dqj.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dqj<T> a(Type<?> $$0) {
         return new dqj<>(this.a, this.b, $$0);
      }
   }
}
