import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bva {
   private static final Map<btq<?>, bva.a> a = Maps.newHashMap();

   private static <T extends buh> void a(btq<T> $$0, buy $$1, dzw.a $$2, bva.b<T> $$3) {
      bva.a $$4 = a.put($$0, new bva.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lu.f.b($$0));
      }
   }

   public static buy a(btq<?> $$0) {
      bva.a $$1 = a.get($$0);
      return $$1 == null ? buz.a : $$1.b;
   }

   public static boolean a(btq<?> $$0, ddv $$1, je $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dzw.a b(@Nullable btq<?> $$0) {
      bva.a $$1 = a.get($$0);
      return $$1 == null ? dzw.a.f : $$1.a;
   }

   public static <T extends btj> boolean a(btq<T> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      bva.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(btq.f, buz.b, dzw.a.f, chh::a);
      a(btq.u, buz.b, dzw.a.f, cgx::c);
      a(btq.y, buz.b, dzw.a.f, cfu::b);
      a(btq.B, buz.b, dzw.a.f, ckj::a);
      a(btq.Y, buz.b, dzw.a.f, ckr::b);
      a(btq.aF, buz.b, dzw.a.f, cgx::c);
      a(btq.aI, buz.b, dzw.a.f, cgx::c);
      a(btq.aX, buz.b, dzw.a.f, cfu::b);
      a(btq.bg, buz.b, dzw.a.f, cgv::b);
      a(btq.c, buz.d, dzw.a.f, che::c);
      a(btq.g, buz.d, dzw.a.f, cfp::b);
      a(btq.i, buz.d, dzw.a.f, ckv::c);
      a(btq.l, buz.d, dzw.a.f, ckv::b);
      a(btq.m, buz.d, dzw.a.f, ckv::c);
      a(btq.q, buz.d, dzw.a.f, ckv::b);
      a(btq.t, buz.d, dzw.a.f, cfv::b);
      a(btq.w, buz.d, dzw.a.f, cfv::b);
      a(btq.x, buz.d, dzw.a.f, ckv::b);
      a(btq.z, buz.d, dzw.a.f, cfv::b);
      a(btq.H, buz.d, dzw.a.f, ckv::b);
      a(btq.I, buz.d, dzw.a.f, ckm::b);
      a(btq.F, buz.d, dzw.a.f, buh::a);
      a(btq.R, buz.d, dzw.a.f, chp::c);
      a(btq.T, buz.d, dzw.a.f, ckp::b);
      a(btq.U, buz.d, dzw.a.f, ckv::b);
      a(btq.W, buz.b, dzw.a.f, btx::a);
      a(btq.X, buz.d, dzw.a.f, chv::c);
      a(btq.ab, buz.d, dzw.a.f, cfv::b);
      a(btq.ac, buz.d, dzw.a.f, cks::a);
      a(btq.af, buz.d, dzw.a.f, buh::a);
      a(btq.an, buz.d, dzw.a.f, cfv::b);
      a(btq.ap, buz.d, dzw.a.f, cku::b);
      a(btq.as, buz.d, dzw.a.f, cgi::c);
      a(btq.at, buz.d, dzw.a.f, cfv::b);
      a(btq.au, buz.d, dzw.a.e, cgj::c);
      a(btq.ax, buz.d, dzw.a.e, cgl::c);
      a(btq.az, buz.d, dzw.a.f, cfv::b);
      a(btq.Z, buz.d, dzw.a.f, clz::c);
      a(btq.aA, buz.d, dzw.a.f, cmf::b);
      a(btq.aC, buz.d, dzw.a.f, ckw::b);
      a(btq.aD, buz.d, dzw.a.f, cgn::c);
      a(btq.aG, buz.d, dzw.a.f, cgp::c);
      a(btq.aJ, buz.d, dzw.a.f, cfv::b);
      a(btq.aM, buz.d, dzw.a.f, clc::b);
      a(btq.aN, buz.d, dzw.a.f, ckv::b);
      a(btq.aO, buz.d, dzw.a.f, cif::c);
      a(btq.aP, buz.d, dzw.a.f, cle::c);
      a(btq.aS, buz.d, dzw.a.f, buh::a);
      a(btq.aW, buz.d, dzw.a.f, ckv::b);
      a(btq.aY, buz.d, dzw.a.f, clh::a);
      a(btq.aZ, buz.c, dzw.a.f, cli::c);
      a(btq.bh, buz.d, dzw.a.f, cgw::c);
      a(btq.bj, buz.d, dzw.a.f, buh::a);
      a(btq.bo, buz.d, dzw.a.f, ckv::b);
      a(btq.bp, buz.d, dzw.a.f, ckv::b);
      a(btq.bq, buz.d, dzw.a.f, ckv::b);
      a(btq.bs, buz.d, dzw.a.f, cgy::c);
      a(btq.bt, buz.d, dzw.a.f, ckv::c);
      a(btq.bu, buz.d, dzw.a.f, ckv::b);
      a(btq.bv, buz.d, dzw.a.f, cij::c);
      a(btq.bx, buz.d, dzw.a.f, clq::b);
      a(btq.bw, buz.d, dzw.a.f, ckv::b);
      a(btq.p, buz.d, dzw.a.f, cfv::b);
      a(btq.D, buz.b, dzw.a.f, ckr::b);
      a(btq.J, buz.a, dzw.a.f, ckv::b);
      a(btq.Q, buz.a, dzw.a.f, cgf::c);
      a(btq.ad, buz.a, dzw.a.f, ckv::b);
      a(btq.aw, buz.a, dzw.a.f, cfv::b);
      a(btq.ay, buz.a, dzw.a.f, buh::a);
      a(btq.aH, buz.d, dzw.a.f, ckv::b);
      a(btq.aK, buz.a, dzw.a.f, buh::a);
      a(btq.be, buz.a, dzw.a.f, cfv::b);
      a(btq.bi, buz.a, dzw.a.f, ckv::b);
      a(btq.bk, buz.a, dzw.a.f, ckv::b);
      a(btq.bl, buz.d, dzw.a.f, buh::a);
      a(btq.bm, buz.a, dzw.a.f, ckv::b);
   }

   static record a(dzw.a a, buy b, bva.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends btj> {
      boolean test(btq<T> var1, dei var2, btp var3, je var4, azk var5);
   }
}
