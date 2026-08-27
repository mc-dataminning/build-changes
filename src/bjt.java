import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bjt {
   private static final Map<bim<?>, bjt.a> a = Maps.newHashMap();

   private static <T extends bja> void a(bim<T> $$0, bjt.c $$1, dkj.a $$2, bjt.b<T> $$3) {
      bjt.a $$4 = a.put($$0, new bjt.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jb.h.b($$0));
      }
   }

   public static bjt.c a(bim<?> $$0) {
      bjt.a $$1 = a.get($$0);
      return $$1 == null ? bjt.c.c : $$1.b;
   }

   public static dkj.a b(@Nullable bim<?> $$0) {
      bjt.a $$1 = a.get($$0);
      return $$1 == null ? dkj.a.f : $$1.a;
   }

   public static <T extends bii> boolean a(bim<T> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      bjt.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bim.f, bjt.c.b, dkj.a.f, bvr::a);
      a(bim.r, bjt.c.b, dkj.a.f, bvm::c);
      a(bim.v, bjt.c.b, dkj.a.f, bvm::c);
      a(bim.y, bjt.c.b, dkj.a.f, byp::a);
      a(bim.V, bjt.c.b, dkj.a.f, byx::b);
      a(bim.aB, bjt.c.b, dkj.a.f, bvm::c);
      a(bim.aE, bjt.c.b, dkj.a.f, bvm::c);
      a(bim.aT, bjt.c.b, dkj.a.f, bvm::c);
      a(bim.bc, bjt.c.b, dkj.a.f, bvk::b);
      a(bim.g, bjt.c.a, dkj.a.f, buf::b);
      a(bim.i, bjt.c.a, dkj.a.f, bzb::c);
      a(bim.n, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.q, bjt.c.a, dkj.a.f, buk::b);
      a(bim.t, bjt.c.a, dkj.a.f, buk::b);
      a(bim.u, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.w, bjt.c.a, dkj.a.f, buk::b);
      a(bim.E, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.F, bjt.c.a, dkj.a.f, bys::b);
      a(bim.C, bjt.c.a, dkj.a.f, bja::a);
      a(bim.O, bjt.c.a, dkj.a.f, bvz::c);
      a(bim.Q, bjt.c.a, dkj.a.f, byv::b);
      a(bim.R, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.T, bjt.c.b, dkj.a.f, biq::a);
      a(bim.U, bjt.c.a, dkj.a.f, bwf::c);
      a(bim.Y, bjt.c.a, dkj.a.f, buk::b);
      a(bim.Z, bjt.c.a, dkj.a.f, byy::a);
      a(bim.ac, bjt.c.a, dkj.a.f, bja::a);
      a(bim.aj, bjt.c.a, dkj.a.f, buk::b);
      a(bim.al, bjt.c.a, dkj.a.f, bza::b);
      a(bim.ao, bjt.c.a, dkj.a.f, bux::c);
      a(bim.ap, bjt.c.a, dkj.a.f, buk::b);
      a(bim.aq, bjt.c.a, dkj.a.e, buy::c);
      a(bim.at, bjt.c.a, dkj.a.e, bva::c);
      a(bim.av, bjt.c.a, dkj.a.f, buk::b);
      a(bim.W, bjt.c.a, dkj.a.f, bzx::c);
      a(bim.aw, bjt.c.a, dkj.a.f, cad::b);
      a(bim.ay, bjt.c.a, dkj.a.f, bzc::b);
      a(bim.az, bjt.c.a, dkj.a.f, bvc::c);
      a(bim.aC, bjt.c.a, dkj.a.f, bve::c);
      a(bim.aF, bjt.c.a, dkj.a.f, buk::b);
      a(bim.aI, bjt.c.a, dkj.a.f, bzi::b);
      a(bim.aJ, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.aK, bjt.c.a, dkj.a.f, buk::b);
      a(bim.aL, bjt.c.a, dkj.a.f, bzk::c);
      a(bim.aO, bjt.c.a, dkj.a.f, bja::a);
      a(bim.aS, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.aU, bjt.c.a, dkj.a.f, bzn::a);
      a(bim.aV, bjt.c.d, dkj.a.f, bzo::c);
      a(bim.bd, bjt.c.a, dkj.a.f, bvl::c);
      a(bim.bf, bjt.c.a, dkj.a.f, bja::a);
      a(bim.bj, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.bk, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.bl, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.bn, bjt.c.a, dkj.a.f, bvn::c);
      a(bim.bp, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.bq, bjt.c.a, dkj.a.f, buk::b);
      a(bim.bs, bjt.c.a, dkj.a.f, bzw::b);
      a(bim.br, bjt.c.a, dkj.a.f, bzb::b);
      a(bim.m, bjt.c.a, dkj.a.f, buk::b);
      a(bim.A, bjt.c.b, dkj.a.f, byx::b);
      a(bim.G, bjt.c.c, dkj.a.f, bzb::b);
      a(bim.N, bjt.c.c, dkj.a.f, buu::c);
      a(bim.aa, bjt.c.c, dkj.a.f, bzb::b);
      a(bim.as, bjt.c.c, dkj.a.f, buk::b);
      a(bim.au, bjt.c.c, dkj.a.f, bja::a);
      a(bim.aD, bjt.c.c, dkj.a.f, bzb::b);
      a(bim.aG, bjt.c.c, dkj.a.f, bja::a);
      a(bim.ba, bjt.c.c, dkj.a.f, buk::b);
      a(bim.be, bjt.c.c, dkj.a.f, bzb::b);
      a(bim.bg, bjt.c.c, dkj.a.f, bzb::b);
      a(bim.bh, bjt.c.c, dkj.a.f, bja::a);
      a(bim.bi, bjt.c.c, dkj.a.f, bja::a);
   }

   static class a {
      final dkj.a a;
      final bjt.c b;
      final bjt.b<?> c;

      public a(dkj.a $$0, bjt.c $$1, bjt.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bii> {
      boolean test(bim<T> var1, cqb var2, bjc var3, gu var4, aru var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
