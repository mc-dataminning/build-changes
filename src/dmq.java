import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmq<T extends dmo> {
   private static final Logger S = LogUtils.getLogger();
   public static final dmq<dnk> a = a("furnace", dmq.b.a(dnk::new, dcj.cD));
   public static final dmq<dmv> b = a("chest", dmq.b.a(dmv::new, dcj.cv));
   public static final dmq<doh> c = a("trapped_chest", dmq.b.a(doh::new, dcj.gV));
   public static final dmq<dnj> d = a("ender_chest", dmq.b.a(dnj::new, dcj.fG));
   public static final dmq<dnp> e = a("jukebox", dmq.b.a(dnp::new, dcj.dT));
   public static final dmq<dng> f = a("dispenser", dmq.b.a(dng::new, dcj.aU));
   public static final dmq<dnh> g = a("dropper", dmq.b.a(dnh::new, dcj.hi));
   public static final dmq<dny> h = a(
      "sign",
      dmq.b.a(
         dny::new,
         dcj.cE,
         dcj.cF,
         dcj.cG,
         dcj.cH,
         dcj.cI,
         dcj.cJ,
         dcj.cK,
         dcj.cR,
         dcj.cS,
         dcj.cT,
         dcj.cU,
         dcj.cV,
         dcj.cW,
         dcj.cX,
         dcj.oW,
         dcj.oY,
         dcj.oX,
         dcj.oZ,
         dcj.cL,
         dcj.cY,
         dcj.cM,
         dcj.cZ
      )
   );
   public static final dmq<dnl> i = a(
      "hanging_sign",
      dmq.b.a(
         dnl::new,
         dcj.da,
         dcj.db,
         dcj.dc,
         dcj.dd,
         dcj.de,
         dcj.df,
         dcj.dg,
         dcj.dh,
         dcj.di,
         dcj.dj,
         dcj.dk,
         dcj.dl,
         dcj.dm,
         dcj.dn,
         dcj.do,
         dcj.dp,
         dcj.dq,
         dcj.dr,
         dcj.dt,
         dcj.du,
         dcj.ds,
         dcj.dv
      )
   );
   public static final dmq<doc> j = a("mob_spawner", dmq.b.a(doc::new, dcj.ct));
   public static final dmq<dpe> k = a("piston", dmq.b.a(dpe::new, dcj.bQ));
   public static final dmq<dmr> l = a("brewing_stand", dmq.b.a(dmr::new, dcj.fs));
   public static final dmq<dni> m = a("enchanting_table", dmq.b.a(dni::new, dcj.fr));
   public static final dmq<dof> n = a("end_portal", dmq.b.a(dof::new, dcj.fx));
   public static final dmq<dmj> o = a("beacon", dmq.b.a(dmj::new, dcj.fO));
   public static final dmq<doa> p = a(
      "skull", dmq.b.a(doa::new, dcj.gE, dcj.gF, dcj.gM, dcj.gN, dcj.gO, dcj.gP, dcj.gI, dcj.gJ, dcj.gG, dcj.gH, dcj.gK, dcj.gL, dcj.gQ, dcj.gR)
   );
   public static final dmq<dnd> q = a("daylight_detector", dmq.b.a(dnd::new, dcj.gZ));
   public static final dmq<dnn> r = a("hopper", dmq.b.a(dnn::new, dcj.hc));
   public static final dmq<dmz> s = a("comparator", dmq.b.a(dmz::new, dcj.gY));
   public static final dmq<dmd> t = a(
      "banner",
      dmq.b.a(
         dmd::new,
         dcj.iJ,
         dcj.iK,
         dcj.iL,
         dcj.iM,
         dcj.iN,
         dcj.iO,
         dcj.iP,
         dcj.iQ,
         dcj.iR,
         dcj.iS,
         dcj.iT,
         dcj.iU,
         dcj.iV,
         dcj.iW,
         dcj.iX,
         dcj.iY,
         dcj.iZ,
         dcj.ja,
         dcj.jb,
         dcj.jc,
         dcj.jd,
         dcj.je,
         dcj.jf,
         dcj.jg,
         dcj.jh,
         dcj.ji,
         dcj.jj,
         dcj.jk,
         dcj.jl,
         dcj.jm,
         dcj.jn,
         dcj.jo
      )
   );
   public static final dmq<dod> u = a("structure_block", dmq.b.a(dod::new, dcj.pa));
   public static final dmq<doe> v = a("end_gateway", dmq.b.a(doe::new, dcj.kF));
   public static final dmq<dmy> w = a("command_block", dmq.b.a(dmy::new, dcj.fN, dcj.kH, dcj.kG));
   public static final dmq<dnx> x = a(
      "shulker_box",
      dmq.b.a(dnx::new, dcj.kP, dcj.lf, dcj.lb, dcj.lc, dcj.kZ, dcj.kX, dcj.ld, dcj.kT, dcj.kY, dcj.kV, dcj.kS, dcj.kR, dcj.kW, dcj.la, dcj.le, dcj.kQ, dcj.kU)
   );
   public static final dmq<dmk> y = a(
      "bed", dmq.b.a(dmk::new, dcj.bn, dcj.bo, dcj.bk, dcj.bl, dcj.bi, dcj.bg, dcj.bm, dcj.bc, dcj.bh, dcj.be, dcj.bb, dcj.ba, dcj.bf, dcj.bj, dcj.aZ, dcj.bd)
   );
   public static final dmq<dna> z = a("conduit", dmq.b.a(dna::new, dcj.mX));
   public static final dmq<dmh> A = a("barrel", dmq.b.a(dmh::new, dcj.nU));
   public static final dmq<dob> B = a("smoker", dmq.b.a(dob::new, dcj.nV));
   public static final dmq<dmn> C = a("blast_furnace", dmq.b.a(dmn::new, dcj.nW));
   public static final dmq<dnq> D = a("lectern", dmq.b.a(dnq::new, dcj.oa));
   public static final dmq<dmm> E = a("bell", dmq.b.a(dmm::new, dcj.od));
   public static final dmq<dno> F = a("jigsaw", dmq.b.a(dno::new, dcj.pb));
   public static final dmq<dmu> G = a("campfire", dmq.b.a(dmu::new, dcj.og, dcj.oh));
   public static final dmq<dml> H = a("beehive", dmq.b.a(dml::new, dcj.pe, dcj.pf));
   public static final dmq<dnv> I = a("sculk_sensor", dmq.b.a(dnv::new, dcj.qQ));
   public static final dmq<dmt> J = a("calibrated_sculk_sensor", dmq.b.a(dmt::new, dcj.qR));
   public static final dmq<dnu> K = a("sculk_catalyst", dmq.b.a(dnu::new, dcj.qU));
   public static final dmq<dnw> L = a("sculk_shrieker", dmq.b.a(dnw::new, dcj.qV));
   public static final dmq<dmx> M = a("chiseled_bookshelf", dmq.b.a(dmx::new, dcj.cm));
   public static final dmq<dms> N = a("brushable_block", dmq.b.a(dms::new, dcj.J, dcj.M));
   public static final dmq<dne> O = a("decorated_pot", dmq.b.a(dne::new, dcj.tp));
   public static final dmq<dnc> P = a("crafter", dmq.b.a(dnc::new, dcj.tq));
   public static final dmq<doi> Q = a("trial_spawner", dmq.b.a(doi::new, dcj.tr));
   public static final dmq<doq> R = a("vault", dmq.b.a(doq::new, dcj.ts));
   private final dmq.a<? extends T> T;
   private final Set<dch> U;
   private final Type<?> V;
   private final in.c<dmq<?>> W = kt.k.f(this);

   @Nullable
   public static ajv a(dmq<?> $$0) {
      return kt.k.b($$0);
   }

   private static <T extends dmo> dmq<T> a(String $$0, dmq.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bff.s, $$0);
      return ja.a(kt.k, $$0, $$1.a($$2));
   }

   public dmq(dmq.a<? extends T> $$0, Set<dch> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(id $$0, dpi $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dpi $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public in.c<dmq<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(cym $$0, id $$1) {
      dmo $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dmo> {
      T create(id var1, dpi var2);
   }

   public static final class b<T extends dmo> {
      private final dmq.a<? extends T> a;
      final Set<dch> b;

      private b(dmq.a<? extends T> $$0, Set<dch> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dmo> dmq.b<T> a(dmq.a<? extends T> $$0, dch... $$1) {
         return new dmq.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dmq<T> a(Type<?> $$0) {
         return new dmq<>(this.a, this.b, $$0);
      }
   }
}
