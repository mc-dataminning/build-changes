import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnf<T extends dnd> {
   private static final Logger S = LogUtils.getLogger();
   public static final dnf<dnz> a = a("furnace", dnf.b.a(dnz::new, dcx.cD));
   public static final dnf<dnk> b = a("chest", dnf.b.a(dnk::new, dcx.cv));
   public static final dnf<dow> c = a("trapped_chest", dnf.b.a(dow::new, dcx.gV));
   public static final dnf<dny> d = a("ender_chest", dnf.b.a(dny::new, dcx.fG));
   public static final dnf<doe> e = a("jukebox", dnf.b.a(doe::new, dcx.dT));
   public static final dnf<dnv> f = a("dispenser", dnf.b.a(dnv::new, dcx.aU));
   public static final dnf<dnw> g = a("dropper", dnf.b.a(dnw::new, dcx.hi));
   public static final dnf<don> h = a(
      "sign",
      dnf.b.a(
         don::new,
         dcx.cE,
         dcx.cF,
         dcx.cG,
         dcx.cH,
         dcx.cI,
         dcx.cJ,
         dcx.cK,
         dcx.cR,
         dcx.cS,
         dcx.cT,
         dcx.cU,
         dcx.cV,
         dcx.cW,
         dcx.cX,
         dcx.oW,
         dcx.oY,
         dcx.oX,
         dcx.oZ,
         dcx.cL,
         dcx.cY,
         dcx.cM,
         dcx.cZ
      )
   );
   public static final dnf<doa> i = a(
      "hanging_sign",
      dnf.b.a(
         doa::new,
         dcx.da,
         dcx.db,
         dcx.dc,
         dcx.dd,
         dcx.de,
         dcx.df,
         dcx.dg,
         dcx.dh,
         dcx.di,
         dcx.dj,
         dcx.dk,
         dcx.dl,
         dcx.dm,
         dcx.dn,
         dcx.do,
         dcx.dp,
         dcx.dq,
         dcx.dr,
         dcx.dt,
         dcx.du,
         dcx.ds,
         dcx.dv
      )
   );
   public static final dnf<dor> j = a("mob_spawner", dnf.b.a(dor::new, dcx.ct));
   public static final dnf<dpu> k = a("piston", dnf.b.a(dpu::new, dcx.bQ));
   public static final dnf<dng> l = a("brewing_stand", dnf.b.a(dng::new, dcx.fs));
   public static final dnf<dnx> m = a("enchanting_table", dnf.b.a(dnx::new, dcx.fr));
   public static final dnf<dou> n = a("end_portal", dnf.b.a(dou::new, dcx.fx));
   public static final dnf<dmy> o = a("beacon", dnf.b.a(dmy::new, dcx.fO));
   public static final dnf<dop> p = a(
      "skull", dnf.b.a(dop::new, dcx.gE, dcx.gF, dcx.gM, dcx.gN, dcx.gO, dcx.gP, dcx.gI, dcx.gJ, dcx.gG, dcx.gH, dcx.gK, dcx.gL, dcx.gQ, dcx.gR)
   );
   public static final dnf<dns> q = a("daylight_detector", dnf.b.a(dns::new, dcx.gZ));
   public static final dnf<doc> r = a("hopper", dnf.b.a(doc::new, dcx.hc));
   public static final dnf<dno> s = a("comparator", dnf.b.a(dno::new, dcx.gY));
   public static final dnf<dms> t = a(
      "banner",
      dnf.b.a(
         dms::new,
         dcx.iJ,
         dcx.iK,
         dcx.iL,
         dcx.iM,
         dcx.iN,
         dcx.iO,
         dcx.iP,
         dcx.iQ,
         dcx.iR,
         dcx.iS,
         dcx.iT,
         dcx.iU,
         dcx.iV,
         dcx.iW,
         dcx.iX,
         dcx.iY,
         dcx.iZ,
         dcx.ja,
         dcx.jb,
         dcx.jc,
         dcx.jd,
         dcx.je,
         dcx.jf,
         dcx.jg,
         dcx.jh,
         dcx.ji,
         dcx.jj,
         dcx.jk,
         dcx.jl,
         dcx.jm,
         dcx.jn,
         dcx.jo
      )
   );
   public static final dnf<dos> u = a("structure_block", dnf.b.a(dos::new, dcx.pa));
   public static final dnf<dot> v = a("end_gateway", dnf.b.a(dot::new, dcx.kF));
   public static final dnf<dnn> w = a("command_block", dnf.b.a(dnn::new, dcx.fN, dcx.kH, dcx.kG));
   public static final dnf<dom> x = a(
      "shulker_box",
      dnf.b.a(dom::new, dcx.kP, dcx.lf, dcx.lb, dcx.lc, dcx.kZ, dcx.kX, dcx.ld, dcx.kT, dcx.kY, dcx.kV, dcx.kS, dcx.kR, dcx.kW, dcx.la, dcx.le, dcx.kQ, dcx.kU)
   );
   public static final dnf<dmz> y = a(
      "bed", dnf.b.a(dmz::new, dcx.bn, dcx.bo, dcx.bk, dcx.bl, dcx.bi, dcx.bg, dcx.bm, dcx.bc, dcx.bh, dcx.be, dcx.bb, dcx.ba, dcx.bf, dcx.bj, dcx.aZ, dcx.bd)
   );
   public static final dnf<dnp> z = a("conduit", dnf.b.a(dnp::new, dcx.mX));
   public static final dnf<dmw> A = a("barrel", dnf.b.a(dmw::new, dcx.nU));
   public static final dnf<doq> B = a("smoker", dnf.b.a(doq::new, dcx.nV));
   public static final dnf<dnc> C = a("blast_furnace", dnf.b.a(dnc::new, dcx.nW));
   public static final dnf<dof> D = a("lectern", dnf.b.a(dof::new, dcx.oa));
   public static final dnf<dnb> E = a("bell", dnf.b.a(dnb::new, dcx.od));
   public static final dnf<dod> F = a("jigsaw", dnf.b.a(dod::new, dcx.pb));
   public static final dnf<dnj> G = a("campfire", dnf.b.a(dnj::new, dcx.og, dcx.oh));
   public static final dnf<dna> H = a("beehive", dnf.b.a(dna::new, dcx.pe, dcx.pf));
   public static final dnf<dok> I = a("sculk_sensor", dnf.b.a(dok::new, dcx.qQ));
   public static final dnf<dni> J = a("calibrated_sculk_sensor", dnf.b.a(dni::new, dcx.qR));
   public static final dnf<doj> K = a("sculk_catalyst", dnf.b.a(doj::new, dcx.qU));
   public static final dnf<dol> L = a("sculk_shrieker", dnf.b.a(dol::new, dcx.qV));
   public static final dnf<dnm> M = a("chiseled_bookshelf", dnf.b.a(dnm::new, dcx.cm));
   public static final dnf<dnh> N = a("brushable_block", dnf.b.a(dnh::new, dcx.J, dcx.M));
   public static final dnf<dnt> O = a("decorated_pot", dnf.b.a(dnt::new, dcx.tp));
   public static final dnf<dnr> P = a("crafter", dnf.b.a(dnr::new, dcx.tq));
   public static final dnf<dox> Q = a("trial_spawner", dnf.b.a(dox::new, dcx.tr));
   public static final dnf<dpg> R = a("vault", dnf.b.a(dpg::new, dcx.ts));
   private final dnf.a<? extends T> T;
   private final Set<dcv> U;
   private final Type<?> V;
   private final iv.c<dnf<?>> W = lc.k.f(this);

   @Nullable
   public static akf a(dnf<?> $$0) {
      return lc.k.b($$0);
   }

   private static <T extends dnd> dnf<T> a(String $$0, dnf.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         S.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(bfp.s, $$0);
      return ji.a(lc.k, $$0, $$1.a($$2));
   }

   public dnf(dnf.a<? extends T> $$0, Set<dcv> $$1, Type<?> $$2) {
      this.T = $$0;
      this.U = $$1;
      this.V = $$2;
   }

   @Nullable
   public T a(im $$0, dpy $$1) {
      return (T)this.T.create($$0, $$1);
   }

   public boolean a(dpy $$0) {
      return this.U.contains($$0.b());
   }

   @Nullable
   public iv.c<dnf<?>> a() {
      return this.W;
   }

   @Nullable
   public T a(cza $$0, im $$1) {
      dnd $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.r() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dnd> {
      T create(im var1, dpy var2);
   }

   public static final class b<T extends dnd> {
      private final dnf.a<? extends T> a;
      final Set<dcv> b;

      private b(dnf.a<? extends T> $$0, Set<dcv> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dnd> dnf.b<T> a(dnf.a<? extends T> $$0, dcv... $$1) {
         return new dnf.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dnf<T> a(Type<?> $$0) {
         return new dnf<>(this.a, this.b, $$0);
      }
   }
}
