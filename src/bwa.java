import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwa {
   private static final Map<bup<?>, bwa.a> a = Maps.newHashMap();

   private static <T extends bvg> void a(bup<T> $$0, bvy $$1, ebj.a $$2, bwa.b<T> $$3) {
      bwa.a $$4 = a.put($$0, new bwa.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lz.f.b($$0));
      }
   }

   public static bvy a(bup<?> $$0) {
      bwa.a $$1 = a.get($$0);
      return $$1 == null ? bvz.a : $$1.b;
   }

   public static boolean a(bup<?> $$0, dfi $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ebj.a b(@Nullable bup<?> $$0) {
      bwa.a $$1 = a.get($$0);
      return $$1 == null ? ebj.a.f : $$1.a;
   }

   public static <T extends bui> boolean a(bup<T> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      bwa.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bup.f, bvz.b, ebj.a.f, cih::a);
      a(bup.u, bvz.b, ebj.a.f, chx::c);
      a(bup.y, bvz.b, ebj.a.f, cgu::b);
      a(bup.B, bvz.b, ebj.a.f, clj::a);
      a(bup.Y, bvz.b, ebj.a.f, clr::b);
      a(bup.aF, bvz.b, ebj.a.f, chx::c);
      a(bup.aI, bvz.b, ebj.a.f, chx::c);
      a(bup.aX, bvz.b, ebj.a.f, cgu::b);
      a(bup.bg, bvz.b, ebj.a.f, chv::b);
      a(bup.c, bvz.d, ebj.a.f, cie::c);
      a(bup.g, bvz.d, ebj.a.f, cgp::b);
      a(bup.i, bvz.d, ebj.a.f, clv::c);
      a(bup.l, bvz.d, ebj.a.f, clv::b);
      a(bup.m, bvz.d, ebj.a.f, clv::c);
      a(bup.q, bvz.d, ebj.a.f, clv::b);
      a(bup.t, bvz.d, ebj.a.f, cgv::b);
      a(bup.w, bvz.d, ebj.a.f, cgv::b);
      a(bup.x, bvz.d, ebj.a.f, clv::b);
      a(bup.z, bvz.d, ebj.a.f, cgv::b);
      a(bup.H, bvz.d, ebj.a.f, clv::b);
      a(bup.I, bvz.d, ebj.a.f, clm::b);
      a(bup.F, bvz.d, ebj.a.f, bvg::a);
      a(bup.R, bvz.d, ebj.a.f, cip::c);
      a(bup.T, bvz.d, ebj.a.f, clp::b);
      a(bup.U, bvz.d, ebj.a.f, clv::b);
      a(bup.W, bvz.b, ebj.a.f, buw::a);
      a(bup.X, bvz.d, ebj.a.f, civ::c);
      a(bup.ab, bvz.d, ebj.a.f, cgv::b);
      a(bup.ac, bvz.d, ebj.a.f, cls::a);
      a(bup.af, bvz.d, ebj.a.f, bvg::a);
      a(bup.an, bvz.d, ebj.a.f, cgv::b);
      a(bup.ap, bvz.d, ebj.a.f, clu::b);
      a(bup.as, bvz.d, ebj.a.f, chi::c);
      a(bup.at, bvz.d, ebj.a.f, cgv::b);
      a(bup.au, bvz.d, ebj.a.e, chj::c);
      a(bup.ax, bvz.d, ebj.a.e, chl::c);
      a(bup.az, bvz.d, ebj.a.f, cgv::b);
      a(bup.Z, bvz.d, ebj.a.f, cmz::c);
      a(bup.aA, bvz.d, ebj.a.f, cnf::b);
      a(bup.aC, bvz.d, ebj.a.f, clw::b);
      a(bup.aD, bvz.d, ebj.a.f, chn::c);
      a(bup.aG, bvz.d, ebj.a.f, chp::c);
      a(bup.aJ, bvz.d, ebj.a.f, cgv::b);
      a(bup.aM, bvz.d, ebj.a.f, cmc::b);
      a(bup.aN, bvz.d, ebj.a.f, clv::b);
      a(bup.aO, bvz.d, ebj.a.f, cjf::c);
      a(bup.aP, bvz.d, ebj.a.f, cme::c);
      a(bup.aS, bvz.d, ebj.a.f, bvg::a);
      a(bup.aW, bvz.d, ebj.a.f, clv::b);
      a(bup.aY, bvz.d, ebj.a.f, cmh::a);
      a(bup.aZ, bvz.c, ebj.a.f, cmi::c);
      a(bup.bh, bvz.d, ebj.a.f, chw::c);
      a(bup.bj, bvz.d, ebj.a.f, bvg::a);
      a(bup.bo, bvz.d, ebj.a.f, clv::b);
      a(bup.bp, bvz.d, ebj.a.f, clv::b);
      a(bup.bq, bvz.d, ebj.a.f, clv::b);
      a(bup.bs, bvz.d, ebj.a.f, chy::c);
      a(bup.bt, bvz.d, ebj.a.f, clv::c);
      a(bup.bu, bvz.d, ebj.a.f, clv::b);
      a(bup.bv, bvz.d, ebj.a.f, cjj::c);
      a(bup.bx, bvz.d, ebj.a.f, cmq::b);
      a(bup.bw, bvz.d, ebj.a.f, clv::b);
      a(bup.p, bvz.d, ebj.a.f, cgv::b);
      a(bup.D, bvz.b, ebj.a.f, clr::b);
      a(bup.J, bvz.a, ebj.a.f, clv::b);
      a(bup.Q, bvz.a, ebj.a.f, chf::c);
      a(bup.ad, bvz.a, ebj.a.f, clv::b);
      a(bup.aw, bvz.a, ebj.a.f, cgv::b);
      a(bup.ay, bvz.a, ebj.a.f, bvg::a);
      a(bup.aH, bvz.d, ebj.a.f, clv::b);
      a(bup.aK, bvz.a, ebj.a.f, bvg::a);
      a(bup.be, bvz.a, ebj.a.f, cgv::b);
      a(bup.bi, bvz.a, ebj.a.f, clv::b);
      a(bup.bk, bvz.a, ebj.a.f, clv::b);
      a(bup.bl, bvz.d, ebj.a.f, bvg::a);
      a(bup.bm, bvz.a, ebj.a.f, clv::b);
   }

   static record a(ebj.a a, bvy b, bwa.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bui> {
      boolean test(bup<T> var1, dfw var2, buo var3, jh var4, azv var5);
   }
}
