import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bvi {
   private static final Map<bty<?>, bvi.a> a = Maps.newHashMap();

   private static <T extends bup> void a(bty<T> $$0, bvg $$1, eao.a $$2, bvi.b<T> $$3) {
      bvi.a $$4 = a.put($$0, new bvi.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lv.f.b($$0));
      }
   }

   public static bvg a(bty<?> $$0) {
      bvi.a $$1 = a.get($$0);
      return $$1 == null ? bvh.a : $$1.b;
   }

   public static boolean a(bty<?> $$0, dem $$1, jf $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static eao.a b(@Nullable bty<?> $$0) {
      bvi.a $$1 = a.get($$0);
      return $$1 == null ? eao.a.f : $$1.a;
   }

   public static <T extends btr> boolean a(bty<T> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      bvi.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bty.f, bvh.b, eao.a.f, chp::a);
      a(bty.u, bvh.b, eao.a.f, chf::c);
      a(bty.y, bvh.b, eao.a.f, cgc::b);
      a(bty.B, bvh.b, eao.a.f, ckr::a);
      a(bty.Y, bvh.b, eao.a.f, ckz::b);
      a(bty.aF, bvh.b, eao.a.f, chf::c);
      a(bty.aI, bvh.b, eao.a.f, chf::c);
      a(bty.aX, bvh.b, eao.a.f, cgc::b);
      a(bty.bg, bvh.b, eao.a.f, chd::b);
      a(bty.c, bvh.d, eao.a.f, chm::c);
      a(bty.g, bvh.d, eao.a.f, cfx::b);
      a(bty.i, bvh.d, eao.a.f, cld::c);
      a(bty.l, bvh.d, eao.a.f, cld::b);
      a(bty.m, bvh.d, eao.a.f, cld::c);
      a(bty.q, bvh.d, eao.a.f, cld::b);
      a(bty.t, bvh.d, eao.a.f, cgd::b);
      a(bty.w, bvh.d, eao.a.f, cgd::b);
      a(bty.x, bvh.d, eao.a.f, cld::b);
      a(bty.z, bvh.d, eao.a.f, cgd::b);
      a(bty.H, bvh.d, eao.a.f, cld::b);
      a(bty.I, bvh.d, eao.a.f, cku::b);
      a(bty.F, bvh.d, eao.a.f, bup::a);
      a(bty.R, bvh.d, eao.a.f, chx::c);
      a(bty.T, bvh.d, eao.a.f, ckx::b);
      a(bty.U, bvh.d, eao.a.f, cld::b);
      a(bty.W, bvh.b, eao.a.f, buf::a);
      a(bty.X, bvh.d, eao.a.f, cid::c);
      a(bty.ab, bvh.d, eao.a.f, cgd::b);
      a(bty.ac, bvh.d, eao.a.f, cla::a);
      a(bty.af, bvh.d, eao.a.f, bup::a);
      a(bty.an, bvh.d, eao.a.f, cgd::b);
      a(bty.ap, bvh.d, eao.a.f, clc::b);
      a(bty.as, bvh.d, eao.a.f, cgq::c);
      a(bty.at, bvh.d, eao.a.f, cgd::b);
      a(bty.au, bvh.d, eao.a.e, cgr::c);
      a(bty.ax, bvh.d, eao.a.e, cgt::c);
      a(bty.az, bvh.d, eao.a.f, cgd::b);
      a(bty.Z, bvh.d, eao.a.f, cmh::c);
      a(bty.aA, bvh.d, eao.a.f, cmn::b);
      a(bty.aC, bvh.d, eao.a.f, cle::b);
      a(bty.aD, bvh.d, eao.a.f, cgv::c);
      a(bty.aG, bvh.d, eao.a.f, cgx::c);
      a(bty.aJ, bvh.d, eao.a.f, cgd::b);
      a(bty.aM, bvh.d, eao.a.f, clk::b);
      a(bty.aN, bvh.d, eao.a.f, cld::b);
      a(bty.aO, bvh.d, eao.a.f, cin::c);
      a(bty.aP, bvh.d, eao.a.f, clm::c);
      a(bty.aS, bvh.d, eao.a.f, bup::a);
      a(bty.aW, bvh.d, eao.a.f, cld::b);
      a(bty.aY, bvh.d, eao.a.f, clp::a);
      a(bty.aZ, bvh.c, eao.a.f, clq::c);
      a(bty.bh, bvh.d, eao.a.f, che::c);
      a(bty.bj, bvh.d, eao.a.f, bup::a);
      a(bty.bo, bvh.d, eao.a.f, cld::b);
      a(bty.bp, bvh.d, eao.a.f, cld::b);
      a(bty.bq, bvh.d, eao.a.f, cld::b);
      a(bty.bs, bvh.d, eao.a.f, chg::c);
      a(bty.bt, bvh.d, eao.a.f, cld::c);
      a(bty.bu, bvh.d, eao.a.f, cld::b);
      a(bty.bv, bvh.d, eao.a.f, cir::c);
      a(bty.bx, bvh.d, eao.a.f, cly::b);
      a(bty.bw, bvh.d, eao.a.f, cld::b);
      a(bty.p, bvh.d, eao.a.f, cgd::b);
      a(bty.D, bvh.b, eao.a.f, ckz::b);
      a(bty.J, bvh.a, eao.a.f, cld::b);
      a(bty.Q, bvh.a, eao.a.f, cgn::c);
      a(bty.ad, bvh.a, eao.a.f, cld::b);
      a(bty.aw, bvh.a, eao.a.f, cgd::b);
      a(bty.ay, bvh.a, eao.a.f, bup::a);
      a(bty.aH, bvh.d, eao.a.f, cld::b);
      a(bty.aK, bvh.a, eao.a.f, bup::a);
      a(bty.be, bvh.a, eao.a.f, cgd::b);
      a(bty.bi, bvh.a, eao.a.f, cld::b);
      a(bty.bk, bvh.a, eao.a.f, cld::b);
      a(bty.bl, bvh.d, eao.a.f, bup::a);
      a(bty.bm, bvh.a, eao.a.f, cld::b);
   }

   static record a(eao.a a, bvg b, bvi.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends btr> {
      boolean test(bty<T> var1, dez var2, btx var3, jf var4, azn var5);
   }
}
