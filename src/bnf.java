import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bnf {
   private static final Map<blz<?>, bnf.a> a = Maps.newHashMap();

   private static <T extends bmn> void a(blz<T> $$0, bnf.c $$1, doq.a $$2, bnf.b<T> $$3) {
      bnf.a $$4 = a.put($$0, new bnf.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kd.g.b($$0));
      }
   }

   public static bnf.c a(blz<?> $$0) {
      bnf.a $$1 = a.get($$0);
      return $$1 == null ? bnf.c.c : $$1.b;
   }

   public static doq.a b(@Nullable blz<?> $$0) {
      bnf.a $$1 = a.get($$0);
      return $$1 == null ? doq.a.f : $$1.a;
   }

   public static <T extends blv> boolean a(blz<T> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      bnf.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(blz.f, bnf.c.b, doq.a.f, bzf::a);
      a(blz.s, bnf.c.b, doq.a.f, bza::c);
      a(blz.w, bnf.c.b, doq.a.f, bza::c);
      a(blz.z, bnf.c.b, doq.a.f, ccd::a);
      a(blz.W, bnf.c.b, doq.a.f, ccl::b);
      a(blz.aC, bnf.c.b, doq.a.f, bza::c);
      a(blz.aF, bnf.c.b, doq.a.f, bza::c);
      a(blz.aU, bnf.c.b, doq.a.f, bza::c);
      a(blz.bd, bnf.c.b, doq.a.f, byy::b);
      a(blz.g, bnf.c.a, doq.a.f, bxt::b);
      a(blz.i, bnf.c.a, doq.a.f, ccp::c);
      a(blz.o, bnf.c.a, doq.a.f, ccp::b);
      a(blz.r, bnf.c.a, doq.a.f, bxy::b);
      a(blz.u, bnf.c.a, doq.a.f, bxy::b);
      a(blz.v, bnf.c.a, doq.a.f, ccp::b);
      a(blz.x, bnf.c.a, doq.a.f, bxy::b);
      a(blz.F, bnf.c.a, doq.a.f, ccp::b);
      a(blz.G, bnf.c.a, doq.a.f, ccg::b);
      a(blz.D, bnf.c.a, doq.a.f, bmn::a);
      a(blz.P, bnf.c.a, doq.a.f, bzn::c);
      a(blz.R, bnf.c.a, doq.a.f, ccj::b);
      a(blz.S, bnf.c.a, doq.a.f, ccp::b);
      a(blz.U, bnf.c.b, doq.a.f, bmd::a);
      a(blz.V, bnf.c.a, doq.a.f, bzt::c);
      a(blz.Z, bnf.c.a, doq.a.f, bxy::b);
      a(blz.aa, bnf.c.a, doq.a.f, ccm::a);
      a(blz.ad, bnf.c.a, doq.a.f, bmn::a);
      a(blz.ak, bnf.c.a, doq.a.f, bxy::b);
      a(blz.am, bnf.c.a, doq.a.f, cco::b);
      a(blz.ap, bnf.c.a, doq.a.f, byl::c);
      a(blz.aq, bnf.c.a, doq.a.f, bxy::b);
      a(blz.ar, bnf.c.a, doq.a.e, bym::c);
      a(blz.au, bnf.c.a, doq.a.e, byo::c);
      a(blz.aw, bnf.c.a, doq.a.f, bxy::b);
      a(blz.X, bnf.c.a, doq.a.f, cds::c);
      a(blz.ax, bnf.c.a, doq.a.f, cdy::b);
      a(blz.az, bnf.c.a, doq.a.f, ccq::b);
      a(blz.aA, bnf.c.a, doq.a.f, byq::c);
      a(blz.aD, bnf.c.a, doq.a.f, bys::c);
      a(blz.aG, bnf.c.a, doq.a.f, bxy::b);
      a(blz.aJ, bnf.c.a, doq.a.f, ccw::b);
      a(blz.aK, bnf.c.a, doq.a.f, ccp::b);
      a(blz.aL, bnf.c.a, doq.a.f, cad::c);
      a(blz.aM, bnf.c.a, doq.a.f, ccy::c);
      a(blz.aP, bnf.c.a, doq.a.f, bmn::a);
      a(blz.aT, bnf.c.a, doq.a.f, ccp::b);
      a(blz.aV, bnf.c.a, doq.a.f, cdb::a);
      a(blz.aW, bnf.c.d, doq.a.f, cdc::c);
      a(blz.be, bnf.c.a, doq.a.f, byz::c);
      a(blz.bg, bnf.c.a, doq.a.f, bmn::a);
      a(blz.bl, bnf.c.a, doq.a.f, ccp::b);
      a(blz.bm, bnf.c.a, doq.a.f, ccp::b);
      a(blz.bn, bnf.c.a, doq.a.f, ccp::b);
      a(blz.bp, bnf.c.a, doq.a.f, bzb::c);
      a(blz.br, bnf.c.a, doq.a.f, ccp::b);
      a(blz.bs, bnf.c.a, doq.a.f, cah::c);
      a(blz.bu, bnf.c.a, doq.a.f, cdk::b);
      a(blz.bt, bnf.c.a, doq.a.f, ccp::b);
      a(blz.n, bnf.c.a, doq.a.f, bxy::b);
      a(blz.B, bnf.c.b, doq.a.f, ccl::b);
      a(blz.H, bnf.c.c, doq.a.f, ccp::b);
      a(blz.O, bnf.c.c, doq.a.f, byi::c);
      a(blz.ab, bnf.c.c, doq.a.f, ccp::b);
      a(blz.at, bnf.c.c, doq.a.f, bxy::b);
      a(blz.av, bnf.c.c, doq.a.f, bmn::a);
      a(blz.aE, bnf.c.c, doq.a.f, ccp::b);
      a(blz.aH, bnf.c.c, doq.a.f, bmn::a);
      a(blz.bb, bnf.c.c, doq.a.f, bxy::b);
      a(blz.bf, bnf.c.c, doq.a.f, ccp::b);
      a(blz.bh, bnf.c.c, doq.a.f, ccp::b);
      a(blz.bi, bnf.c.c, doq.a.f, bmn::a);
      a(blz.bj, bnf.c.c, doq.a.f, bmn::a);
   }

   static class a {
      final doq.a a;
      final bnf.c b;
      final bnf.b<?> c;

      public a(doq.a $$0, bnf.c $$1, bnf.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends blv> {
      boolean test(blz<T> var1, cue var2, bmp var3, hx var4, auv var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
