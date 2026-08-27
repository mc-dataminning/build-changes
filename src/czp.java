import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class czp<T extends czn> {
   private static final Logger P = LogUtils.getLogger();
   public static final czp<dai> a = a("furnace", czp.b.a(dai::new, cpo.cD));
   public static final czp<czu> b = a("chest", czp.b.a(czu::new, cpo.cv));
   public static final czp<dbe> c = a("trapped_chest", czp.b.a(dbe::new, cpo.gV));
   public static final czp<dah> d = a("ender_chest", czp.b.a(dah::new, cpo.fG));
   public static final czp<dan> e = a("jukebox", czp.b.a(dan::new, cpo.dT));
   public static final czp<dae> f = a("dispenser", czp.b.a(dae::new, cpo.aU));
   public static final czp<daf> g = a("dropper", czp.b.a(daf::new, cpo.hi));
   public static final czp<dav> h = a(
      "sign",
      czp.b.a(
         dav::new,
         cpo.cE,
         cpo.cF,
         cpo.cG,
         cpo.cH,
         cpo.cI,
         cpo.cJ,
         cpo.cK,
         cpo.cR,
         cpo.cS,
         cpo.cT,
         cpo.cU,
         cpo.cV,
         cpo.cW,
         cpo.cX,
         cpo.oW,
         cpo.oY,
         cpo.oX,
         cpo.oZ,
         cpo.cL,
         cpo.cY,
         cpo.cM,
         cpo.cZ
      )
   );
   public static final czp<daj> i = a(
      "hanging_sign",
      czp.b.a(
         daj::new,
         cpo.da,
         cpo.db,
         cpo.dc,
         cpo.dd,
         cpo.de,
         cpo.df,
         cpo.dg,
         cpo.dh,
         cpo.di,
         cpo.dj,
         cpo.dk,
         cpo.dl,
         cpo.dm,
         cpo.dn,
         cpo.do,
         cpo.dp,
         cpo.dq,
         cpo.dr,
         cpo.dt,
         cpo.du,
         cpo.ds,
         cpo.dv
      )
   );
   public static final czp<daz> j = a("mob_spawner", czp.b.a(daz::new, cpo.ct));
   public static final czp<dbx> k = a("piston", czp.b.a(dbx::new, cpo.bQ));
   public static final czp<czq> l = a("brewing_stand", czp.b.a(czq::new, cpo.fs));
   public static final czp<dag> m = a("enchanting_table", czp.b.a(dag::new, cpo.fr));
   public static final czp<dbc> n = a("end_portal", czp.b.a(dbc::new, cpo.fx));
   public static final czp<czi> o = a("beacon", czp.b.a(czi::new, cpo.fO));
   public static final czp<dax> p = a(
      "skull", czp.b.a(dax::new, cpo.gE, cpo.gF, cpo.gM, cpo.gN, cpo.gO, cpo.gP, cpo.gI, cpo.gJ, cpo.gG, cpo.gH, cpo.gK, cpo.gL, cpo.gQ, cpo.gR)
   );
   public static final czp<dab> q = a("daylight_detector", czp.b.a(dab::new, cpo.gZ));
   public static final czp<dal> r = a("hopper", czp.b.a(dal::new, cpo.hc));
   public static final czp<czy> s = a("comparator", czp.b.a(czy::new, cpo.gY));
   public static final czp<czd> t = a(
      "banner",
      czp.b.a(
         czd::new,
         cpo.iJ,
         cpo.iK,
         cpo.iL,
         cpo.iM,
         cpo.iN,
         cpo.iO,
         cpo.iP,
         cpo.iQ,
         cpo.iR,
         cpo.iS,
         cpo.iT,
         cpo.iU,
         cpo.iV,
         cpo.iW,
         cpo.iX,
         cpo.iY,
         cpo.iZ,
         cpo.ja,
         cpo.jb,
         cpo.jc,
         cpo.jd,
         cpo.je,
         cpo.jf,
         cpo.jg,
         cpo.jh,
         cpo.ji,
         cpo.jj,
         cpo.jk,
         cpo.jl,
         cpo.jm,
         cpo.jn,
         cpo.jo
      )
   );
   public static final czp<dba> u = a("structure_block", czp.b.a(dba::new, cpo.pa));
   public static final czp<dbb> v = a("end_gateway", czp.b.a(dbb::new, cpo.kF));
   public static final czp<czx> w = a("command_block", czp.b.a(czx::new, cpo.fN, cpo.kH, cpo.kG));
   public static final czp<dau> x = a(
      "shulker_box",
      czp.b.a(dau::new, cpo.kP, cpo.lf, cpo.lb, cpo.lc, cpo.kZ, cpo.kX, cpo.ld, cpo.kT, cpo.kY, cpo.kV, cpo.kS, cpo.kR, cpo.kW, cpo.la, cpo.le, cpo.kQ, cpo.kU)
   );
   public static final czp<czj> y = a(
      "bed", czp.b.a(czj::new, cpo.bn, cpo.bo, cpo.bk, cpo.bl, cpo.bi, cpo.bg, cpo.bm, cpo.bc, cpo.bh, cpo.be, cpo.bb, cpo.ba, cpo.bf, cpo.bj, cpo.aZ, cpo.bd)
   );
   public static final czp<czz> z = a("conduit", czp.b.a(czz::new, cpo.mX));
   public static final czp<czg> A = a("barrel", czp.b.a(czg::new, cpo.nU));
   public static final czp<day> B = a("smoker", czp.b.a(day::new, cpo.nV));
   public static final czp<czm> C = a("blast_furnace", czp.b.a(czm::new, cpo.nW));
   public static final czp<dao> D = a("lectern", czp.b.a(dao::new, cpo.oa));
   public static final czp<czl> E = a("bell", czp.b.a(czl::new, cpo.od));
   public static final czp<dam> F = a("jigsaw", czp.b.a(dam::new, cpo.pb));
   public static final czp<czt> G = a("campfire", czp.b.a(czt::new, cpo.og, cpo.oh));
   public static final czp<czk> H = a("beehive", czp.b.a(czk::new, cpo.pe, cpo.pf));
   public static final czp<das> I = a("sculk_sensor", czp.b.a(das::new, cpo.qD));
   public static final czp<czs> J = a("calibrated_sculk_sensor", czp.b.a(czs::new, cpo.qE));
   public static final czp<dar> K = a("sculk_catalyst", czp.b.a(dar::new, cpo.qH));
   public static final czp<dat> L = a("sculk_shrieker", czp.b.a(dat::new, cpo.qI));
   public static final czp<czw> M = a("chiseled_bookshelf", czp.b.a(czw::new, cpo.cm));
   public static final czp<czr> N = a("brushable_block", czp.b.a(czr::new, cpo.J, cpo.M));
   public static final czp<dac> O = a("decorated_pot", czp.b.a(dac::new, cpo.so));
   private final czp.a<? extends T> Q;
   private final Set<cpn> R;
   private final Type<?> S;

   @Nullable
   public static acq a(czp<?> $$0) {
      return jb.l.b($$0);
   }

   private static <T extends czn> czp<T> a(String $$0, czp.b<T> $$1) {
      if ($$1.b.isEmpty()) {
         P.warn("Block entity type {} requires at least one valid block to be defined!", $$0);
      }

      Type<?> $$2 = ac.a(avw.l, $$0);
      return hr.a(jb.l, $$0, $$1.a($$2));
   }

   public czp(czp.a<? extends T> $$0, Set<cpn> $$1, Type<?> $$2) {
      this.Q = $$0;
      this.R = $$1;
      this.S = $$2;
   }

   @Nullable
   public T a(gu $$0, dcb $$1) {
      return (T)this.Q.create($$0, $$1);
   }

   public boolean a(dcb $$0) {
      return this.R.contains($$0.b());
   }

   @Nullable
   public T a(cls $$0, gu $$1) {
      czn $$2 = $$0.c_($$1);
      return (T)($$2 != null && $$2.u() == this ? $$2 : null);
   }

   @FunctionalInterface
   interface a<T extends czn> {
      T create(gu var1, dcb var2);
   }

   public static final class b<T extends czn> {
      private final czp.a<? extends T> a;
      final Set<cpn> b;

      private b(czp.a<? extends T> $$0, Set<cpn> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static <T extends czn> czp.b<T> a(czp.a<? extends T> $$0, cpn... $$1) {
         return new czp.b<>($$0, ImmutableSet.copyOf($$1));
      }

      public czp<T> a(Type<?> $$0) {
         return new czp<>(this.a, this.b, $$0);
      }
   }
}
