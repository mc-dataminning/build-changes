import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bmp {
   private static final Map<blj<?>, bmp.a> a = Maps.newHashMap();

   private static <T extends blx> void a(blj<T> $$0, bmp.c $$1, dny.a $$2, bmp.b<T> $$3) {
      bmp.a $$4 = a.put($$0, new bmp.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kb.g.b($$0));
      }
   }

   public static bmp.c a(blj<?> $$0) {
      bmp.a $$1 = a.get($$0);
      return $$1 == null ? bmp.c.c : $$1.b;
   }

   public static dny.a b(@Nullable blj<?> $$0) {
      bmp.a $$1 = a.get($$0);
      return $$1 == null ? dny.a.f : $$1.a;
   }

   public static <T extends blf> boolean a(blj<T> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      bmp.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(blj.f, bmp.c.b, dny.a.f, byp::a);
      a(blj.s, bmp.c.b, dny.a.f, byk::c);
      a(blj.w, bmp.c.b, dny.a.f, byk::c);
      a(blj.z, bmp.c.b, dny.a.f, cbn::a);
      a(blj.W, bmp.c.b, dny.a.f, cbv::b);
      a(blj.aC, bmp.c.b, dny.a.f, byk::c);
      a(blj.aF, bmp.c.b, dny.a.f, byk::c);
      a(blj.aU, bmp.c.b, dny.a.f, byk::c);
      a(blj.bd, bmp.c.b, dny.a.f, byi::b);
      a(blj.g, bmp.c.a, dny.a.f, bxd::b);
      a(blj.i, bmp.c.a, dny.a.f, cbz::c);
      a(blj.o, bmp.c.a, dny.a.f, cbz::b);
      a(blj.r, bmp.c.a, dny.a.f, bxi::b);
      a(blj.u, bmp.c.a, dny.a.f, bxi::b);
      a(blj.v, bmp.c.a, dny.a.f, cbz::b);
      a(blj.x, bmp.c.a, dny.a.f, bxi::b);
      a(blj.F, bmp.c.a, dny.a.f, cbz::b);
      a(blj.G, bmp.c.a, dny.a.f, cbq::b);
      a(blj.D, bmp.c.a, dny.a.f, blx::a);
      a(blj.P, bmp.c.a, dny.a.f, byx::c);
      a(blj.R, bmp.c.a, dny.a.f, cbt::b);
      a(blj.S, bmp.c.a, dny.a.f, cbz::b);
      a(blj.U, bmp.c.b, dny.a.f, bln::a);
      a(blj.V, bmp.c.a, dny.a.f, bzd::c);
      a(blj.Z, bmp.c.a, dny.a.f, bxi::b);
      a(blj.aa, bmp.c.a, dny.a.f, cbw::a);
      a(blj.ad, bmp.c.a, dny.a.f, blx::a);
      a(blj.ak, bmp.c.a, dny.a.f, bxi::b);
      a(blj.am, bmp.c.a, dny.a.f, cby::b);
      a(blj.ap, bmp.c.a, dny.a.f, bxv::c);
      a(blj.aq, bmp.c.a, dny.a.f, bxi::b);
      a(blj.ar, bmp.c.a, dny.a.e, bxw::c);
      a(blj.au, bmp.c.a, dny.a.e, bxy::c);
      a(blj.aw, bmp.c.a, dny.a.f, bxi::b);
      a(blj.X, bmp.c.a, dny.a.f, cdb::c);
      a(blj.ax, bmp.c.a, dny.a.f, cdh::b);
      a(blj.az, bmp.c.a, dny.a.f, cca::b);
      a(blj.aA, bmp.c.a, dny.a.f, bya::c);
      a(blj.aD, bmp.c.a, dny.a.f, byc::c);
      a(blj.aG, bmp.c.a, dny.a.f, bxi::b);
      a(blj.aJ, bmp.c.a, dny.a.f, ccg::b);
      a(blj.aK, bmp.c.a, dny.a.f, cbz::b);
      a(blj.aL, bmp.c.a, dny.a.f, bzn::c);
      a(blj.aM, bmp.c.a, dny.a.f, cci::c);
      a(blj.aP, bmp.c.a, dny.a.f, blx::a);
      a(blj.aT, bmp.c.a, dny.a.f, cbz::b);
      a(blj.aV, bmp.c.a, dny.a.f, ccl::a);
      a(blj.aW, bmp.c.d, dny.a.f, ccm::c);
      a(blj.be, bmp.c.a, dny.a.f, byj::c);
      a(blj.bg, bmp.c.a, dny.a.f, blx::a);
      a(blj.bl, bmp.c.a, dny.a.f, cbz::b);
      a(blj.bm, bmp.c.a, dny.a.f, cbz::b);
      a(blj.bn, bmp.c.a, dny.a.f, cbz::b);
      a(blj.bp, bmp.c.a, dny.a.f, byl::c);
      a(blj.br, bmp.c.a, dny.a.f, cbz::b);
      a(blj.bs, bmp.c.a, dny.a.f, bzr::c);
      a(blj.bu, bmp.c.a, dny.a.f, ccu::b);
      a(blj.bt, bmp.c.a, dny.a.f, cbz::b);
      a(blj.n, bmp.c.a, dny.a.f, bxi::b);
      a(blj.B, bmp.c.b, dny.a.f, cbv::b);
      a(blj.H, bmp.c.c, dny.a.f, cbz::b);
      a(blj.O, bmp.c.c, dny.a.f, bxs::c);
      a(blj.ab, bmp.c.c, dny.a.f, cbz::b);
      a(blj.at, bmp.c.c, dny.a.f, bxi::b);
      a(blj.av, bmp.c.c, dny.a.f, blx::a);
      a(blj.aE, bmp.c.c, dny.a.f, cbz::b);
      a(blj.aH, bmp.c.c, dny.a.f, blx::a);
      a(blj.bb, bmp.c.c, dny.a.f, bxi::b);
      a(blj.bf, bmp.c.c, dny.a.f, cbz::b);
      a(blj.bh, bmp.c.c, dny.a.f, cbz::b);
      a(blj.bi, bmp.c.c, dny.a.f, blx::a);
      a(blj.bj, bmp.c.c, dny.a.f, blx::a);
   }

   static class a {
      final dny.a a;
      final bmp.c b;
      final bmp.b<?> c;

      public a(dny.a $$0, bmp.c $$1, bmp.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends blf> {
      boolean test(blj<T> var1, ctn var2, blz var3, hv var4, auf var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
