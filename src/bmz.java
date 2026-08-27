import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bmz {
   private static final Map<blt<?>, bmz.a> a = Maps.newHashMap();

   private static <T extends bmh> void a(blt<T> $$0, bmz.c $$1, doj.a $$2, bmz.b<T> $$3) {
      bmz.a $$4 = a.put($$0, new bmz.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kd.g.b($$0));
      }
   }

   public static bmz.c a(blt<?> $$0) {
      bmz.a $$1 = a.get($$0);
      return $$1 == null ? bmz.c.c : $$1.b;
   }

   public static doj.a b(@Nullable blt<?> $$0) {
      bmz.a $$1 = a.get($$0);
      return $$1 == null ? doj.a.f : $$1.a;
   }

   public static <T extends blp> boolean a(blt<T> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      bmz.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(blt.f, bmz.c.b, doj.a.f, byz::a);
      a(blt.s, bmz.c.b, doj.a.f, byu::c);
      a(blt.w, bmz.c.b, doj.a.f, byu::c);
      a(blt.z, bmz.c.b, doj.a.f, cbx::a);
      a(blt.W, bmz.c.b, doj.a.f, ccf::b);
      a(blt.aC, bmz.c.b, doj.a.f, byu::c);
      a(blt.aF, bmz.c.b, doj.a.f, byu::c);
      a(blt.aU, bmz.c.b, doj.a.f, byu::c);
      a(blt.bd, bmz.c.b, doj.a.f, bys::b);
      a(blt.g, bmz.c.a, doj.a.f, bxn::b);
      a(blt.i, bmz.c.a, doj.a.f, ccj::c);
      a(blt.o, bmz.c.a, doj.a.f, ccj::b);
      a(blt.r, bmz.c.a, doj.a.f, bxs::b);
      a(blt.u, bmz.c.a, doj.a.f, bxs::b);
      a(blt.v, bmz.c.a, doj.a.f, ccj::b);
      a(blt.x, bmz.c.a, doj.a.f, bxs::b);
      a(blt.F, bmz.c.a, doj.a.f, ccj::b);
      a(blt.G, bmz.c.a, doj.a.f, cca::b);
      a(blt.D, bmz.c.a, doj.a.f, bmh::a);
      a(blt.P, bmz.c.a, doj.a.f, bzh::c);
      a(blt.R, bmz.c.a, doj.a.f, ccd::b);
      a(blt.S, bmz.c.a, doj.a.f, ccj::b);
      a(blt.U, bmz.c.b, doj.a.f, blx::a);
      a(blt.V, bmz.c.a, doj.a.f, bzn::c);
      a(blt.Z, bmz.c.a, doj.a.f, bxs::b);
      a(blt.aa, bmz.c.a, doj.a.f, ccg::a);
      a(blt.ad, bmz.c.a, doj.a.f, bmh::a);
      a(blt.ak, bmz.c.a, doj.a.f, bxs::b);
      a(blt.am, bmz.c.a, doj.a.f, cci::b);
      a(blt.ap, bmz.c.a, doj.a.f, byf::c);
      a(blt.aq, bmz.c.a, doj.a.f, bxs::b);
      a(blt.ar, bmz.c.a, doj.a.e, byg::c);
      a(blt.au, bmz.c.a, doj.a.e, byi::c);
      a(blt.aw, bmz.c.a, doj.a.f, bxs::b);
      a(blt.X, bmz.c.a, doj.a.f, cdl::c);
      a(blt.ax, bmz.c.a, doj.a.f, cdr::b);
      a(blt.az, bmz.c.a, doj.a.f, cck::b);
      a(blt.aA, bmz.c.a, doj.a.f, byk::c);
      a(blt.aD, bmz.c.a, doj.a.f, bym::c);
      a(blt.aG, bmz.c.a, doj.a.f, bxs::b);
      a(blt.aJ, bmz.c.a, doj.a.f, ccq::b);
      a(blt.aK, bmz.c.a, doj.a.f, ccj::b);
      a(blt.aL, bmz.c.a, doj.a.f, bzx::c);
      a(blt.aM, bmz.c.a, doj.a.f, ccs::c);
      a(blt.aP, bmz.c.a, doj.a.f, bmh::a);
      a(blt.aT, bmz.c.a, doj.a.f, ccj::b);
      a(blt.aV, bmz.c.a, doj.a.f, ccv::a);
      a(blt.aW, bmz.c.d, doj.a.f, ccw::c);
      a(blt.be, bmz.c.a, doj.a.f, byt::c);
      a(blt.bg, bmz.c.a, doj.a.f, bmh::a);
      a(blt.bl, bmz.c.a, doj.a.f, ccj::b);
      a(blt.bm, bmz.c.a, doj.a.f, ccj::b);
      a(blt.bn, bmz.c.a, doj.a.f, ccj::b);
      a(blt.bp, bmz.c.a, doj.a.f, byv::c);
      a(blt.br, bmz.c.a, doj.a.f, ccj::b);
      a(blt.bs, bmz.c.a, doj.a.f, cab::c);
      a(blt.bu, bmz.c.a, doj.a.f, cde::b);
      a(blt.bt, bmz.c.a, doj.a.f, ccj::b);
      a(blt.n, bmz.c.a, doj.a.f, bxs::b);
      a(blt.B, bmz.c.b, doj.a.f, ccf::b);
      a(blt.H, bmz.c.c, doj.a.f, ccj::b);
      a(blt.O, bmz.c.c, doj.a.f, byc::c);
      a(blt.ab, bmz.c.c, doj.a.f, ccj::b);
      a(blt.at, bmz.c.c, doj.a.f, bxs::b);
      a(blt.av, bmz.c.c, doj.a.f, bmh::a);
      a(blt.aE, bmz.c.c, doj.a.f, ccj::b);
      a(blt.aH, bmz.c.c, doj.a.f, bmh::a);
      a(blt.bb, bmz.c.c, doj.a.f, bxs::b);
      a(blt.bf, bmz.c.c, doj.a.f, ccj::b);
      a(blt.bh, bmz.c.c, doj.a.f, ccj::b);
      a(blt.bi, bmz.c.c, doj.a.f, bmh::a);
      a(blt.bj, bmz.c.c, doj.a.f, bmh::a);
   }

   static class a {
      final doj.a a;
      final bmz.c b;
      final bmz.b<?> c;

      public a(doj.a $$0, bmz.c $$1, bmz.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends blp> {
      boolean test(blt<T> var1, ctx var2, bmj var3, hx var4, aup var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
