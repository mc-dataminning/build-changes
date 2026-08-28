import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bum {
   private static final Map<btb<?>, bum.a> a = Maps.newHashMap();

   private static <T extends bts> void a(btb<T> $$0, buk $$1, dxv.a $$2, bum.b<T> $$3) {
      bum.a $$4 = a.put($$0, new bum.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lp.g.b($$0));
      }
   }

   public static buk a(btb<?> $$0) {
      bum.a $$1 = a.get($$0);
      return $$1 == null ? bul.a : $$1.b;
   }

   public static boolean a(btb<?> $$0, dcc $$1, iz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dxv.a b(@Nullable btb<?> $$0) {
      bum.a $$1 = a.get($$0);
      return $$1 == null ? dxv.a.f : $$1.a;
   }

   public static <T extends bsv> boolean a(btb<T> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      bum.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(btb.f, bul.b, dxv.a.f, cgs::a);
      a(btb.u, bul.b, dxv.a.f, cgi::c);
      a(btb.y, bul.b, dxv.a.f, cgi::c);
      a(btb.B, bul.b, dxv.a.f, cjs::a);
      a(btb.Y, bul.b, dxv.a.f, cka::b);
      a(btb.aF, bul.b, dxv.a.f, cgi::c);
      a(btb.aI, bul.b, dxv.a.f, cgi::c);
      a(btb.aX, bul.b, dxv.a.f, cgi::c);
      a(btb.bg, bul.b, dxv.a.f, cgg::b);
      a(btb.c, bul.d, dxv.a.f, cgp::c);
      a(btb.g, bul.d, dxv.a.f, cfb::b);
      a(btb.i, bul.d, dxv.a.f, cke::c);
      a(btb.l, bul.d, dxv.a.f, cke::b);
      a(btb.q, bul.d, dxv.a.f, cke::b);
      a(btb.t, bul.d, dxv.a.f, cfg::b);
      a(btb.w, bul.d, dxv.a.f, cfg::b);
      a(btb.x, bul.d, dxv.a.f, cke::b);
      a(btb.z, bul.d, dxv.a.f, cfg::b);
      a(btb.H, bul.d, dxv.a.f, cke::b);
      a(btb.I, bul.d, dxv.a.f, cjv::b);
      a(btb.F, bul.d, dxv.a.f, bts::a);
      a(btb.R, bul.d, dxv.a.f, cha::c);
      a(btb.T, bul.d, dxv.a.f, cjy::b);
      a(btb.U, bul.d, dxv.a.f, cke::b);
      a(btb.W, bul.b, dxv.a.f, bti::a);
      a(btb.X, bul.d, dxv.a.f, chg::c);
      a(btb.ab, bul.d, dxv.a.f, cfg::b);
      a(btb.ac, bul.d, dxv.a.f, ckb::a);
      a(btb.af, bul.d, dxv.a.f, bts::a);
      a(btb.an, bul.d, dxv.a.f, cfg::b);
      a(btb.ap, bul.d, dxv.a.f, ckd::b);
      a(btb.as, bul.d, dxv.a.f, cft::c);
      a(btb.at, bul.d, dxv.a.f, cfg::b);
      a(btb.au, bul.d, dxv.a.e, cfu::c);
      a(btb.ax, bul.d, dxv.a.e, cfw::c);
      a(btb.az, bul.d, dxv.a.f, cfg::b);
      a(btb.Z, bul.d, dxv.a.f, cli::c);
      a(btb.aA, bul.d, dxv.a.f, clo::b);
      a(btb.aC, bul.d, dxv.a.f, ckf::b);
      a(btb.aD, bul.d, dxv.a.f, cfy::c);
      a(btb.aG, bul.d, dxv.a.f, cga::c);
      a(btb.aJ, bul.d, dxv.a.f, cfg::b);
      a(btb.aM, bul.d, dxv.a.f, ckl::b);
      a(btb.aN, bul.d, dxv.a.f, cke::b);
      a(btb.aO, bul.d, dxv.a.f, chq::c);
      a(btb.aP, bul.d, dxv.a.f, ckn::c);
      a(btb.aS, bul.d, dxv.a.f, bts::a);
      a(btb.aW, bul.d, dxv.a.f, cke::b);
      a(btb.aY, bul.d, dxv.a.f, ckq::a);
      a(btb.aZ, bul.c, dxv.a.f, ckr::c);
      a(btb.bh, bul.d, dxv.a.f, cgh::c);
      a(btb.bj, bul.d, dxv.a.f, bts::a);
      a(btb.bo, bul.d, dxv.a.f, cke::b);
      a(btb.bp, bul.d, dxv.a.f, cke::b);
      a(btb.bq, bul.d, dxv.a.f, cke::b);
      a(btb.bs, bul.d, dxv.a.f, cgj::c);
      a(btb.bu, bul.d, dxv.a.f, cke::b);
      a(btb.bv, bul.d, dxv.a.f, chu::c);
      a(btb.bx, bul.d, dxv.a.f, ckz::b);
      a(btb.bw, bul.d, dxv.a.f, cke::b);
      a(btb.p, bul.d, dxv.a.f, cfg::b);
      a(btb.D, bul.b, dxv.a.f, cka::b);
      a(btb.J, bul.a, dxv.a.f, cke::b);
      a(btb.Q, bul.a, dxv.a.f, cfq::c);
      a(btb.ad, bul.a, dxv.a.f, cke::b);
      a(btb.aw, bul.a, dxv.a.f, cfg::b);
      a(btb.ay, bul.a, dxv.a.f, bts::a);
      a(btb.aH, bul.d, dxv.a.f, cke::b);
      a(btb.aK, bul.a, dxv.a.f, bts::a);
      a(btb.be, bul.a, dxv.a.f, cfg::b);
      a(btb.bi, bul.a, dxv.a.f, cke::b);
      a(btb.bk, bul.a, dxv.a.f, cke::b);
      a(btb.bl, bul.d, dxv.a.f, bts::a);
      a(btb.bm, bul.a, dxv.a.f, bts::a);
   }

   static record a(dxv.a a, buk b, bum.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bsv> {
      boolean test(btb<T> var1, dco var2, btu var3, iz var4, azh var5);
   }
}
