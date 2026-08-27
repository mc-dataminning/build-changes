import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddb<T extends dcz> {
   private static final Logger P = LogUtils.getLogger();
   public static final ddb<ddu> a = a("furnace", ddb.b.a(ddu::new, cte.cD));
   public static final ddb<ddg> b = a("chest", ddb.b.a(ddg::new, cte.cv));
   public static final ddb<deq> c = a("trapped_chest", ddb.b.a(deq::new, cte.gV));
   public static final ddb<ddt> d = a("ender_chest", ddb.b.a(ddt::new, cte.fG));
   public static final ddb<ddz> e = a("jukebox", ddb.b.a(ddz::new, cte.dT));
   public static final ddb<ddq> f = a("dispenser", ddb.b.a(ddq::new, cte.aU));
   public static final ddb<ddr> g = a("dropper", ddb.b.a(ddr::new, cte.hi));
   public static final ddb<deh> h = a(
      "sign",
      ddb.b.a(
         deh::new,
         cte.cE,
         cte.cF,
         cte.cG,
         cte.cH,
         cte.cI,
         cte.cJ,
         cte.cK,
         cte.cR,
         cte.cS,
         cte.cT,
         cte.cU,
         cte.cV,
         cte.cW,
         cte.cX,
         cte.oW,
         cte.oY,
         cte.oX,
         cte.oZ,
         cte.cL,
         cte.cY,
         cte.cM,
         cte.cZ
      )
   );
   public static final ddb<ddv> i = a(
      "hanging_sign",
      ddb.b.a(
         ddv::new,
         cte.da,
         cte.db,
         cte.dc,
         cte.dd,
         cte.de,
         cte.df,
         cte.dg,
         cte.dh,
         cte.di,
         cte.dj,
         cte.dk,
         cte.dl,
         cte.dm,
         cte.dn,
         cte.do,
         cte.dp,
         cte.dq,
         cte.dr,
         cte.dt,
         cte.du,
         cte.ds,
         cte.dv
      )
   );
   public static final ddb<del> j = a("mob_spawner", ddb.b.a(del::new, cte.ct));
   public static final ddb<dez> k = a("piston", ddb.b.a(dez::new, cte.bQ));
   public static final ddb<ddc> l = a("brewing_stand", ddb.b.a(ddc::new, cte.fs));
   public static final ddb<dds> m = a("enchanting_table", ddb.b.a(dds::new, cte.fr));
   public static final ddb<deo> n = a("end_portal", ddb.b.a(deo::new, cte.fx));
   public static final ddb<dcu> o = a("beacon", ddb.b.a(dcu::new, cte.fO));
   public static final ddb<dej> p = a(
      "skull", ddb.b.a(dej::new, cte.gE, cte.gF, cte.gM, cte.gN, cte.gO, cte.gP, cte.gI, cte.gJ, cte.gG, cte.gH, cte.gK, cte.gL, cte.gQ, cte.gR)
   );
   public static final ddb<ddn> q = a("daylight_detector", ddb.b.a(ddn::new, cte.gZ));
   public static final ddb<ddx> r = a("hopper", ddb.b.a(ddx::new, cte.hc));
   public static final ddb<ddk> s = a("comparator", ddb.b.a(ddk::new, cte.gY));
   public static final ddb<dcp> t = a(
      "banner",
      ddb.b.a(
         dcp::new,
         cte.iJ,
         cte.iK,
         cte.iL,
         cte.iM,
         cte.iN,
         cte.iO,
         cte.iP,
         cte.iQ,
         cte.iR,
         cte.iS,
         cte.iT,
         cte.iU,
         cte.iV,
         cte.iW,
         cte.iX,
         cte.iY,
         cte.iZ,
         cte.ja,
         cte.jb,
         cte.jc,
         cte.jd,
         cte.je,
         cte.jf,
         cte.jg,
         cte.jh,
         cte.ji,
         cte.jj,
         cte.jk,
         cte.jl,
         cte.jm,
         cte.jn,
         cte.jo
      )
   );
   public static final ddb<dem> u = a("structure_block", ddb.b.a(dem::new, cte.pa));
   public static final ddb<den> v = a("end_gateway", ddb.b.a(den::new, cte.kF));
   public static final ddb<ddj> w = a("command_block", ddb.b.a(ddj::new, cte.fN, cte.kH, cte.kG));
   public static final ddb<deg> x = a(
      "shulker_box",
      ddb.b.a(deg::new, cte.kP, cte.lf, cte.lb, cte.lc, cte.kZ, cte.kX, cte.ld, cte.kT, cte.kY, cte.kV, cte.kS, cte.kR, cte.kW, cte.la, cte.le, cte.kQ, cte.kU)
   );
   public static final ddb<dcv> y = a(
      "bed", ddb.b.a(dcv::new, cte.bn, cte.bo, cte.bk, cte.bl, cte.bi, cte.bg, cte.bm, cte.bc, cte.bh, cte.be, cte.bb, cte.ba, cte.bf, cte.bj, cte.aZ, cte.bd)
   );
   public static final ddb<ddl> z = a("conduit", ddb.b.a(ddl::new, cte.mX));
   public static final ddb<dcs> A = a("barrel", ddb.b.a(dcs::new, cte.nU));
   public static final ddb<dek> B = a("smoker", ddb.b.a(dek::new, cte.nV));
   public static final ddb<dcy> C = a("blast_furnace", ddb.b.a(dcy::new, cte.nW));
   public static final ddb<dea> D = a("lectern", ddb.b.a(dea::new, cte.oa));
   public static final ddb<dcx> E = a("bell", ddb.b.a(dcx::new, cte.od));
   public static final ddb<ddy> F = a("jigsaw", ddb.b.a(ddy::new, cte.pb));
   public static final ddb<ddf> G = a("campfire", ddb.b.a(ddf::new, cte.og, cte.oh));
   public static final ddb<dcw> H = a("beehive", ddb.b.a(dcw::new, cte.pe, cte.pf));
   public static final ddb<dee> I = a("sculk_sensor", ddb.b.a(dee::new, cte.qD));
   public static final ddb<dde> J = a("calibrated_sculk_sensor", ddb.b.a(dde::new, cte.qE));
   public static final ddb<ded> K = a("sculk_catalyst", ddb.b.a(ded::new, cte.qH));
   public static final ddb<def> L = a("sculk_shrieker", ddb.b.a(def::new, cte.qI));
   public static final ddb<ddi> M = a("chiseled_bookshelf", ddb.b.a(ddi::new, cte.cm));
   public static final ddb<ddd> N = a("brushable_block", ddb.b.a(ddd::new, cte.J, cte.M));
   public static final ddb<ddo> O = a("decorated_pot", ddb.b.a(ddo::new, cte.so));
   private final ddb.a<? extends T> Q;
   private final Set<ctc> R;
   private final Type<?> S;
   private final he.c<ddb<?>> T = jb.l.f(this);

   @Nullable
   public static aez a(ddb<?> $$0) {
      return jb.l.b($$0);
   }

   private static <T extends dcz> ddb<T> a(String $$0, ddb.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         P.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(azd.s, $$0);
      return hq.a(jb.l, $$0, $$1.a($$2));
   }

   public ddb(ddb.a<? extends T> $$0, Set<ctc> $$1, Type<?> $$2) {
      this.Q = $$0;
      this.R = $$1;
      this.S = $$2;
   }

   @Nullable
   public T a(gw $$0, dfd $$1) {
      return (T)this.Q.create($$0, $$1);
   }

   public boolean a(dfd $$0) {
      return this.R.contains($$0.b());
   }

   @Nullable
   public he.c<ddb<?>> a() {
      return this.T;
   }

   @Nullable
   public T a(cph $$0, gw $$1) {
      dcz $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.u() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends dcz> {
      T create(gw var1, dfd var2);
   }

   public static final class b<T extends dcz> {
      private final ddb.a<? extends T> a;
      final Set<ctc> b;

      private b(ddb.a<? extends T> $$0, Set<ctc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends dcz> ddb.b<T> a(ddb.a<? extends T> $$0, ctc... $$1) {
         return new ddb.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public ddb<T> a(Type<?> $$0) {
         return new ddb<>(this.a, this.b, $$0);
      }
   }
}
