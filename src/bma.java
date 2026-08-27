import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bma {
   private static final Map<bku<?>, bma.a> a = Maps.newHashMap();

   private static <T extends bli> void a(bku<T> $$0, bma.c $$1, dmr.a $$2, bma.b<T> $$3) {
      bma.a $$4 = a.put($$0, new bma.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jy.h.b($$0));
      }
   }

   public static bma.c a(bku<?> $$0) {
      bma.a $$1 = a.get($$0);
      return $$1 == null ? bma.c.c : $$1.b;
   }

   public static dmr.a b(@Nullable bku<?> $$0) {
      bma.a $$1 = a.get($$0);
      return $$1 == null ? dmr.a.f : $$1.a;
   }

   public static <T extends bkq> boolean a(bku<T> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      bma.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bku.f, bma.c.b, dmr.a.f, bxy::a);
      a(bku.r, bma.c.b, dmr.a.f, bxt::c);
      a(bku.v, bma.c.b, dmr.a.f, bxt::c);
      a(bku.y, bma.c.b, dmr.a.f, caw::a);
      a(bku.V, bma.c.b, dmr.a.f, cbe::b);
      a(bku.aB, bma.c.b, dmr.a.f, bxt::c);
      a(bku.aE, bma.c.b, dmr.a.f, bxt::c);
      a(bku.aT, bma.c.b, dmr.a.f, bxt::c);
      a(bku.bc, bma.c.b, dmr.a.f, bxr::b);
      a(bku.g, bma.c.a, dmr.a.f, bwm::b);
      a(bku.i, bma.c.a, dmr.a.f, cbi::c);
      a(bku.n, bma.c.a, dmr.a.f, cbi::b);
      a(bku.q, bma.c.a, dmr.a.f, bwr::b);
      a(bku.t, bma.c.a, dmr.a.f, bwr::b);
      a(bku.u, bma.c.a, dmr.a.f, cbi::b);
      a(bku.w, bma.c.a, dmr.a.f, bwr::b);
      a(bku.E, bma.c.a, dmr.a.f, cbi::b);
      a(bku.F, bma.c.a, dmr.a.f, caz::b);
      a(bku.C, bma.c.a, dmr.a.f, bli::a);
      a(bku.O, bma.c.a, dmr.a.f, byg::c);
      a(bku.Q, bma.c.a, dmr.a.f, cbc::b);
      a(bku.R, bma.c.a, dmr.a.f, cbi::b);
      a(bku.T, bma.c.b, dmr.a.f, bky::a);
      a(bku.U, bma.c.a, dmr.a.f, bym::c);
      a(bku.Y, bma.c.a, dmr.a.f, bwr::b);
      a(bku.Z, bma.c.a, dmr.a.f, cbf::a);
      a(bku.ac, bma.c.a, dmr.a.f, bli::a);
      a(bku.aj, bma.c.a, dmr.a.f, bwr::b);
      a(bku.al, bma.c.a, dmr.a.f, cbh::b);
      a(bku.ao, bma.c.a, dmr.a.f, bxe::c);
      a(bku.ap, bma.c.a, dmr.a.f, bwr::b);
      a(bku.aq, bma.c.a, dmr.a.e, bxf::c);
      a(bku.at, bma.c.a, dmr.a.e, bxh::c);
      a(bku.av, bma.c.a, dmr.a.f, bwr::b);
      a(bku.W, bma.c.a, dmr.a.f, cce::c);
      a(bku.aw, bma.c.a, dmr.a.f, cck::b);
      a(bku.ay, bma.c.a, dmr.a.f, cbj::b);
      a(bku.az, bma.c.a, dmr.a.f, bxj::c);
      a(bku.aC, bma.c.a, dmr.a.f, bxl::c);
      a(bku.aF, bma.c.a, dmr.a.f, bwr::b);
      a(bku.aI, bma.c.a, dmr.a.f, cbp::b);
      a(bku.aJ, bma.c.a, dmr.a.f, cbi::b);
      a(bku.aK, bma.c.a, dmr.a.f, bwr::b);
      a(bku.aL, bma.c.a, dmr.a.f, cbr::c);
      a(bku.aO, bma.c.a, dmr.a.f, bli::a);
      a(bku.aS, bma.c.a, dmr.a.f, cbi::b);
      a(bku.aU, bma.c.a, dmr.a.f, cbu::a);
      a(bku.aV, bma.c.d, dmr.a.f, cbv::c);
      a(bku.bd, bma.c.a, dmr.a.f, bxs::c);
      a(bku.bf, bma.c.a, dmr.a.f, bli::a);
      a(bku.bj, bma.c.a, dmr.a.f, cbi::b);
      a(bku.bk, bma.c.a, dmr.a.f, cbi::b);
      a(bku.bl, bma.c.a, dmr.a.f, cbi::b);
      a(bku.bn, bma.c.a, dmr.a.f, bxu::c);
      a(bku.bp, bma.c.a, dmr.a.f, cbi::b);
      a(bku.bq, bma.c.a, dmr.a.f, bwr::b);
      a(bku.bs, bma.c.a, dmr.a.f, ccd::b);
      a(bku.br, bma.c.a, dmr.a.f, cbi::b);
      a(bku.m, bma.c.a, dmr.a.f, bwr::b);
      a(bku.A, bma.c.b, dmr.a.f, cbe::b);
      a(bku.G, bma.c.c, dmr.a.f, cbi::b);
      a(bku.N, bma.c.c, dmr.a.f, bxb::c);
      a(bku.aa, bma.c.c, dmr.a.f, cbi::b);
      a(bku.as, bma.c.c, dmr.a.f, bwr::b);
      a(bku.au, bma.c.c, dmr.a.f, bli::a);
      a(bku.aD, bma.c.c, dmr.a.f, cbi::b);
      a(bku.aG, bma.c.c, dmr.a.f, bli::a);
      a(bku.ba, bma.c.c, dmr.a.f, bwr::b);
      a(bku.be, bma.c.c, dmr.a.f, cbi::b);
      a(bku.bg, bma.c.c, dmr.a.f, cbi::b);
      a(bku.bh, bma.c.c, dmr.a.f, bli::a);
      a(bku.bi, bma.c.c, dmr.a.f, bli::a);
   }

   static class a {
      final dmr.a a;
      final bma.c b;
      final bma.b<?> c;

      public a(dmr.a $$0, bma.c $$1, bma.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bkq> {
      boolean test(bku<T> var1, csp var2, blk var3, ht var4, ats var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
