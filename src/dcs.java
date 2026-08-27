import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dcs<T extends dcq> {
   private static final Logger P = LogUtils.getLogger();
   public static final dcs<ddl> a = a("furnace", dcs.b.a(ddl::new, csr.cD));
   public static final dcs<dcx> b = a("chest", dcs.b.a(dcx::new, csr.cv));
   public static final dcs<deh> c = a("trapped_chest", dcs.b.a(deh::new, csr.gV));
   public static final dcs<ddk> d = a("ender_chest", dcs.b.a(ddk::new, csr.fG));
   public static final dcs<ddq> e = a("jukebox", dcs.b.a(ddq::new, csr.dT));
   public static final dcs<ddh> f = a("dispenser", dcs.b.a(ddh::new, csr.aU));
   public static final dcs<ddi> g = a("dropper", dcs.b.a(ddi::new, csr.hi));
   public static final dcs<ddy> h = a(
      "sign",
      dcs.b.a(
         ddy::new,
         csr.cE,
         csr.cF,
         csr.cG,
         csr.cH,
         csr.cI,
         csr.cJ,
         csr.cK,
         csr.cR,
         csr.cS,
         csr.cT,
         csr.cU,
         csr.cV,
         csr.cW,
         csr.cX,
         csr.oW,
         csr.oY,
         csr.oX,
         csr.oZ,
         csr.cL,
         csr.cY,
         csr.cM,
         csr.cZ
      )
   );
   public static final dcs<ddm> i = a(
      "hanging_sign",
      dcs.b.a(
         ddm::new,
         csr.da,
         csr.db,
         csr.dc,
         csr.dd,
         csr.de,
         csr.df,
         csr.dg,
         csr.dh,
         csr.di,
         csr.dj,
         csr.dk,
         csr.dl,
         csr.dm,
         csr.dn,
         csr.do,
         csr.dp,
         csr.dq,
         csr.dr,
         csr.dt,
         csr.du,
         csr.ds,
         csr.dv
      )
   );
   public static final dcs<dec> j = a("mob_spawner", dcs.b.a(dec::new, csr.ct));
   public static final dcs<dfa> k = a("piston", dcs.b.a(dfa::new, csr.bQ));
   public static final dcs<dct> l = a("brewing_stand", dcs.b.a(dct::new, csr.fs));
   public static final dcs<ddj> m = a("enchanting_table", dcs.b.a(ddj::new, csr.fr));
   public static final dcs<def> n = a("end_portal", dcs.b.a(def::new, csr.fx));
   public static final dcs<dcl> o = a("beacon", dcs.b.a(dcl::new, csr.fO));
   public static final dcs<dea> p = a(
      "skull", dcs.b.a(dea::new, csr.gE, csr.gF, csr.gM, csr.gN, csr.gO, csr.gP, csr.gI, csr.gJ, csr.gG, csr.gH, csr.gK, csr.gL, csr.gQ, csr.gR)
   );
   public static final dcs<dde> q = a("daylight_detector", dcs.b.a(dde::new, csr.gZ));
   public static final dcs<ddo> r = a("hopper", dcs.b.a(ddo::new, csr.hc));
   public static final dcs<ddb> s = a("comparator", dcs.b.a(ddb::new, csr.gY));
   public static final dcs<dcg> t = a(
      "banner",
      dcs.b.a(
         dcg::new,
         csr.iJ,
         csr.iK,
         csr.iL,
         csr.iM,
         csr.iN,
         csr.iO,
         csr.iP,
         csr.iQ,
         csr.iR,
         csr.iS,
         csr.iT,
         csr.iU,
         csr.iV,
         csr.iW,
         csr.iX,
         csr.iY,
         csr.iZ,
         csr.ja,
         csr.jb,
         csr.jc,
         csr.jd,
         csr.je,
         csr.jf,
         csr.jg,
         csr.jh,
         csr.ji,
         csr.jj,
         csr.jk,
         csr.jl,
         csr.jm,
         csr.jn,
         csr.jo
      )
   );
   public static final dcs<ded> u = a("structure_block", dcs.b.a(ded::new, csr.pa));
   public static final dcs<dee> v = a("end_gateway", dcs.b.a(dee::new, csr.kF));
   public static final dcs<dda> w = a("command_block", dcs.b.a(dda::new, csr.fN, csr.kH, csr.kG));
   public static final dcs<ddx> x = a(
      "shulker_box",
      dcs.b.a(ddx::new, csr.kP, csr.lf, csr.lb, csr.lc, csr.kZ, csr.kX, csr.ld, csr.kT, csr.kY, csr.kV, csr.kS, csr.kR, csr.kW, csr.la, csr.le, csr.kQ, csr.kU)
   );
   public static final dcs<dcm> y = a(
      "bed", dcs.b.a(dcm::new, csr.bn, csr.bo, csr.bk, csr.bl, csr.bi, csr.bg, csr.bm, csr.bc, csr.bh, csr.be, csr.bb, csr.ba, csr.bf, csr.bj, csr.aZ, csr.bd)
   );
   public static final dcs<ddc> z = a("conduit", dcs.b.a(ddc::new, csr.mX));
   public static final dcs<dcj> A = a("barrel", dcs.b.a(dcj::new, csr.nU));
   public static final dcs<deb> B = a("smoker", dcs.b.a(deb::new, csr.nV));
   public static final dcs<dcp> C = a("blast_furnace", dcs.b.a(dcp::new, csr.nW));
   public static final dcs<ddr> D = a("lectern", dcs.b.a(ddr::new, csr.oa));
   public static final dcs<dco> E = a("bell", dcs.b.a(dco::new, csr.od));
   public static final dcs<ddp> F = a("jigsaw", dcs.b.a(ddp::new, csr.pb));
   public static final dcs<dcw> G = a("campfire", dcs.b.a(dcw::new, csr.og, csr.oh));
   public static final dcs<dcn> H = a("beehive", dcs.b.a(dcn::new, csr.pe, csr.pf));
   public static final dcs<ddv> I = a("sculk_sensor", dcs.b.a(ddv::new, csr.qD));
   public static final dcs<dcv> J = a("calibrated_sculk_sensor", dcs.b.a(dcv::new, csr.qE));
   public static final dcs<ddu> K = a("sculk_catalyst", dcs.b.a(ddu::new, csr.qH));
   public static final dcs<ddw> L = a("sculk_shrieker", dcs.b.a(ddw::new, csr.qI));
   public static final dcs<dcz> M = a("chiseled_bookshelf", dcs.b.a(dcz::new, csr.cm));
   public static final dcs<dcu> N = a("brushable_block", dcs.b.a(dcu::new, csr.J, csr.M));
   public static final dcs<ddf> O = a("decorated_pot", dcs.b.a(ddf::new, csr.so));
   private final dcs.a<? extends T> Q;
   private final Set<csq> R;
   private final Type<?> S;
   private final hg.c<dcs<?>> T = jd.l.f(this);

   @Nullable
   public static aeu a(dcs<?> $$0) {
      return jd.l.b($$0);
   }

   private static <T extends dcq> dcs<T> a(String $$0, dcs.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         P.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(ays.s, $$0);
      return ht.a(jd.l, $$0, $$1.a($$2));
   }

   public dcs(dcs.a<? extends T> $$0, Set<csq> $$1, Type<?> $$2) {
      this.Q = $$0;
      this.R = $$1;
      this.S = $$2;
   }

   @Nullable
   public T a(gw $$0, dfe $$1) {
      return (T)this.Q.create($$0, $$1);
   }

   public boolean a(dfe $$0) {
      return this.R.contains($$0.b());
   }

   @Nullable
   public hg.c<dcs<?>> a() {
      return this.T;
   }

   @Nullable
   public T a(cow $$0, gw $$1) {
      dcq $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.u() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dcq> {
      T create(gw var1, dfe var2);
   }

   public static final class b<T extends dcq> {
      private final dcs.a<? extends T> a;
      final Set<csq> b;

      private b(dcs.a<? extends T> $$0, Set<csq> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dcq> dcs.b<T> a(dcs.a<? extends T> $$0, csq... $$1) {
         return new dcs.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public dcs<T> a(Type<?> $$0) {
         return new dcs<>(this.a, this.b, $$0);
      }
   }
}
