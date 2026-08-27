import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bkc {
   private static final Map<biw<?>, bkc.a> a = Maps.newHashMap();

   private static <T extends bjk> void a(biw<T> $$0, bkc.c $$1, dku.a $$2, bkc.b<T> $$3) {
      bkc.a $$4 = a.put($$0, new bkc.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jd.h.b($$0));
      }
   }

   public static bkc.c a(biw<?> $$0) {
      bkc.a $$1 = a.get($$0);
      return $$1 == null ? bkc.c.c : $$1.b;
   }

   public static dku.a b(@Nullable biw<?> $$0) {
      bkc.a $$1 = a.get($$0);
      return $$1 == null ? dku.a.f : $$1.a;
   }

   public static <T extends bis> boolean a(biw<T> $$0, cqm $$1, bjm $$2, gw $$3, ase $$4) {
      bkc.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(biw.f, bkc.c.b, dku.a.f, bwa::a);
      a(biw.r, bkc.c.b, dku.a.f, bvv::c);
      a(biw.v, bkc.c.b, dku.a.f, bvv::c);
      a(biw.y, bkc.c.b, dku.a.f, byy::a);
      a(biw.V, bkc.c.b, dku.a.f, bzg::b);
      a(biw.aB, bkc.c.b, dku.a.f, bvv::c);
      a(biw.aE, bkc.c.b, dku.a.f, bvv::c);
      a(biw.aT, bkc.c.b, dku.a.f, bvv::c);
      a(biw.bc, bkc.c.b, dku.a.f, bvt::b);
      a(biw.g, bkc.c.a, dku.a.f, buo::b);
      a(biw.i, bkc.c.a, dku.a.f, bzk::c);
      a(biw.n, bkc.c.a, dku.a.f, bzk::b);
      a(biw.q, bkc.c.a, dku.a.f, but::b);
      a(biw.t, bkc.c.a, dku.a.f, but::b);
      a(biw.u, bkc.c.a, dku.a.f, bzk::b);
      a(biw.w, bkc.c.a, dku.a.f, but::b);
      a(biw.E, bkc.c.a, dku.a.f, bzk::b);
      a(biw.F, bkc.c.a, dku.a.f, bzb::b);
      a(biw.C, bkc.c.a, dku.a.f, bjk::a);
      a(biw.O, bkc.c.a, dku.a.f, bwi::c);
      a(biw.Q, bkc.c.a, dku.a.f, bze::b);
      a(biw.R, bkc.c.a, dku.a.f, bzk::b);
      a(biw.T, bkc.c.b, dku.a.f, bja::a);
      a(biw.U, bkc.c.a, dku.a.f, bwo::c);
      a(biw.Y, bkc.c.a, dku.a.f, but::b);
      a(biw.Z, bkc.c.a, dku.a.f, bzh::a);
      a(biw.ac, bkc.c.a, dku.a.f, bjk::a);
      a(biw.aj, bkc.c.a, dku.a.f, but::b);
      a(biw.al, bkc.c.a, dku.a.f, bzj::b);
      a(biw.ao, bkc.c.a, dku.a.f, bvg::c);
      a(biw.ap, bkc.c.a, dku.a.f, but::b);
      a(biw.aq, bkc.c.a, dku.a.e, bvh::c);
      a(biw.at, bkc.c.a, dku.a.e, bvj::c);
      a(biw.av, bkc.c.a, dku.a.f, but::b);
      a(biw.W, bkc.c.a, dku.a.f, cag::c);
      a(biw.aw, bkc.c.a, dku.a.f, cam::b);
      a(biw.ay, bkc.c.a, dku.a.f, bzl::b);
      a(biw.az, bkc.c.a, dku.a.f, bvl::c);
      a(biw.aC, bkc.c.a, dku.a.f, bvn::c);
      a(biw.aF, bkc.c.a, dku.a.f, but::b);
      a(biw.aI, bkc.c.a, dku.a.f, bzr::b);
      a(biw.aJ, bkc.c.a, dku.a.f, bzk::b);
      a(biw.aK, bkc.c.a, dku.a.f, but::b);
      a(biw.aL, bkc.c.a, dku.a.f, bzt::c);
      a(biw.aO, bkc.c.a, dku.a.f, bjk::a);
      a(biw.aS, bkc.c.a, dku.a.f, bzk::b);
      a(biw.aU, bkc.c.a, dku.a.f, bzw::a);
      a(biw.aV, bkc.c.d, dku.a.f, bzx::c);
      a(biw.bd, bkc.c.a, dku.a.f, bvu::c);
      a(biw.bf, bkc.c.a, dku.a.f, bjk::a);
      a(biw.bj, bkc.c.a, dku.a.f, bzk::b);
      a(biw.bk, bkc.c.a, dku.a.f, bzk::b);
      a(biw.bl, bkc.c.a, dku.a.f, bzk::b);
      a(biw.bn, bkc.c.a, dku.a.f, bvw::c);
      a(biw.bp, bkc.c.a, dku.a.f, bzk::b);
      a(biw.bq, bkc.c.a, dku.a.f, but::b);
      a(biw.bs, bkc.c.a, dku.a.f, caf::b);
      a(biw.br, bkc.c.a, dku.a.f, bzk::b);
      a(biw.m, bkc.c.a, dku.a.f, but::b);
      a(biw.A, bkc.c.b, dku.a.f, bzg::b);
      a(biw.G, bkc.c.c, dku.a.f, bzk::b);
      a(biw.N, bkc.c.c, dku.a.f, bvd::c);
      a(biw.aa, bkc.c.c, dku.a.f, bzk::b);
      a(biw.as, bkc.c.c, dku.a.f, but::b);
      a(biw.au, bkc.c.c, dku.a.f, bjk::a);
      a(biw.aD, bkc.c.c, dku.a.f, bzk::b);
      a(biw.aG, bkc.c.c, dku.a.f, bjk::a);
      a(biw.ba, bkc.c.c, dku.a.f, but::b);
      a(biw.be, bkc.c.c, dku.a.f, bzk::b);
      a(biw.bg, bkc.c.c, dku.a.f, bzk::b);
      a(biw.bh, bkc.c.c, dku.a.f, bjk::a);
      a(biw.bi, bkc.c.c, dku.a.f, bjk::a);
   }

   static class a {
      final dku.a a;
      final bkc.c b;
      final bkc.b<?> c;

      public a(dku.a $$0, bkc.c $$1, bkc.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bis> {
      boolean test(biw<T> var1, cqm var2, bjm var3, gw var4, ase var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
