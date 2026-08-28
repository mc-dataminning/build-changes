import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bvf {
   private static final Map<btv<?>, bvf.a> a = Maps.newHashMap();

   private static <T extends bum> void a(btv<T> $$0, bvd $$1, eak.a $$2, bvf.b<T> $$3) {
      bvf.a $$4 = a.put($$0, new bvf.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lu.f.b($$0));
      }
   }

   public static bvd a(btv<?> $$0) {
      bvf.a $$1 = a.get($$0);
      return $$1 == null ? bve.a : $$1.b;
   }

   public static boolean a(btv<?> $$0, dej $$1, je $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static eak.a b(@Nullable btv<?> $$0) {
      bvf.a $$1 = a.get($$0);
      return $$1 == null ? eak.a.f : $$1.a;
   }

   public static <T extends bto> boolean a(btv<T> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      bvf.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(btv.f, bve.b, eak.a.f, chm::a);
      a(btv.u, bve.b, eak.a.f, chc::c);
      a(btv.y, bve.b, eak.a.f, cfz::b);
      a(btv.B, bve.b, eak.a.f, cko::a);
      a(btv.Y, bve.b, eak.a.f, ckw::b);
      a(btv.aF, bve.b, eak.a.f, chc::c);
      a(btv.aI, bve.b, eak.a.f, chc::c);
      a(btv.aX, bve.b, eak.a.f, cfz::b);
      a(btv.bg, bve.b, eak.a.f, cha::b);
      a(btv.c, bve.d, eak.a.f, chj::c);
      a(btv.g, bve.d, eak.a.f, cfu::b);
      a(btv.i, bve.d, eak.a.f, cla::c);
      a(btv.l, bve.d, eak.a.f, cla::b);
      a(btv.m, bve.d, eak.a.f, cla::c);
      a(btv.q, bve.d, eak.a.f, cla::b);
      a(btv.t, bve.d, eak.a.f, cga::b);
      a(btv.w, bve.d, eak.a.f, cga::b);
      a(btv.x, bve.d, eak.a.f, cla::b);
      a(btv.z, bve.d, eak.a.f, cga::b);
      a(btv.H, bve.d, eak.a.f, cla::b);
      a(btv.I, bve.d, eak.a.f, ckr::b);
      a(btv.F, bve.d, eak.a.f, bum::a);
      a(btv.R, bve.d, eak.a.f, chu::c);
      a(btv.T, bve.d, eak.a.f, cku::b);
      a(btv.U, bve.d, eak.a.f, cla::b);
      a(btv.W, bve.b, eak.a.f, buc::a);
      a(btv.X, bve.d, eak.a.f, cia::c);
      a(btv.ab, bve.d, eak.a.f, cga::b);
      a(btv.ac, bve.d, eak.a.f, ckx::a);
      a(btv.af, bve.d, eak.a.f, bum::a);
      a(btv.an, bve.d, eak.a.f, cga::b);
      a(btv.ap, bve.d, eak.a.f, ckz::b);
      a(btv.as, bve.d, eak.a.f, cgn::c);
      a(btv.at, bve.d, eak.a.f, cga::b);
      a(btv.au, bve.d, eak.a.e, cgo::c);
      a(btv.ax, bve.d, eak.a.e, cgq::c);
      a(btv.az, bve.d, eak.a.f, cga::b);
      a(btv.Z, bve.d, eak.a.f, cme::c);
      a(btv.aA, bve.d, eak.a.f, cmk::b);
      a(btv.aC, bve.d, eak.a.f, clb::b);
      a(btv.aD, bve.d, eak.a.f, cgs::c);
      a(btv.aG, bve.d, eak.a.f, cgu::c);
      a(btv.aJ, bve.d, eak.a.f, cga::b);
      a(btv.aM, bve.d, eak.a.f, clh::b);
      a(btv.aN, bve.d, eak.a.f, cla::b);
      a(btv.aO, bve.d, eak.a.f, cik::c);
      a(btv.aP, bve.d, eak.a.f, clj::c);
      a(btv.aS, bve.d, eak.a.f, bum::a);
      a(btv.aW, bve.d, eak.a.f, cla::b);
      a(btv.aY, bve.d, eak.a.f, clm::a);
      a(btv.aZ, bve.c, eak.a.f, cln::c);
      a(btv.bh, bve.d, eak.a.f, chb::c);
      a(btv.bj, bve.d, eak.a.f, bum::a);
      a(btv.bo, bve.d, eak.a.f, cla::b);
      a(btv.bp, bve.d, eak.a.f, cla::b);
      a(btv.bq, bve.d, eak.a.f, cla::b);
      a(btv.bs, bve.d, eak.a.f, chd::c);
      a(btv.bt, bve.d, eak.a.f, cla::c);
      a(btv.bu, bve.d, eak.a.f, cla::b);
      a(btv.bv, bve.d, eak.a.f, cio::c);
      a(btv.bx, bve.d, eak.a.f, clv::b);
      a(btv.bw, bve.d, eak.a.f, cla::b);
      a(btv.p, bve.d, eak.a.f, cga::b);
      a(btv.D, bve.b, eak.a.f, ckw::b);
      a(btv.J, bve.a, eak.a.f, cla::b);
      a(btv.Q, bve.a, eak.a.f, cgk::c);
      a(btv.ad, bve.a, eak.a.f, cla::b);
      a(btv.aw, bve.a, eak.a.f, cga::b);
      a(btv.ay, bve.a, eak.a.f, bum::a);
      a(btv.aH, bve.d, eak.a.f, cla::b);
      a(btv.aK, bve.a, eak.a.f, bum::a);
      a(btv.be, bve.a, eak.a.f, cga::b);
      a(btv.bi, bve.a, eak.a.f, cla::b);
      a(btv.bk, bve.a, eak.a.f, cla::b);
      a(btv.bl, bve.d, eak.a.f, bum::a);
      a(btv.bm, bve.a, eak.a.f, cla::b);
   }

   static record a(eak.a a, bvd b, bvf.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bto> {
      boolean test(btv<T> var1, dew var2, btu var3, je var4, azl var5);
   }
}
