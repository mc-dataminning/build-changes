import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bjv {
   private static final Map<bip<?>, bjv.a> a = Maps.newHashMap();

   private static <T extends bjd> void a(bip<T> $$0, bjv.c $$1, dkn.a $$2, bjv.b<T> $$3) {
      bjv.a $$4 = a.put($$0, new bjv.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jd.h.b($$0));
      }
   }

   public static bjv.c a(bip<?> $$0) {
      bjv.a $$1 = a.get($$0);
      return $$1 == null ? bjv.c.c : $$1.b;
   }

   public static dkn.a b(@Nullable bip<?> $$0) {
      bjv.a $$1 = a.get($$0);
      return $$1 == null ? dkn.a.f : $$1.a;
   }

   public static <T extends bil> boolean a(bip<T> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      bjv.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bip.f, bjv.c.b, dkn.a.f, bvt::a);
      a(bip.r, bjv.c.b, dkn.a.f, bvo::c);
      a(bip.v, bjv.c.b, dkn.a.f, bvo::c);
      a(bip.y, bjv.c.b, dkn.a.f, byr::a);
      a(bip.V, bjv.c.b, dkn.a.f, byz::b);
      a(bip.aB, bjv.c.b, dkn.a.f, bvo::c);
      a(bip.aE, bjv.c.b, dkn.a.f, bvo::c);
      a(bip.aT, bjv.c.b, dkn.a.f, bvo::c);
      a(bip.bc, bjv.c.b, dkn.a.f, bvm::b);
      a(bip.g, bjv.c.a, dkn.a.f, buh::b);
      a(bip.i, bjv.c.a, dkn.a.f, bzd::c);
      a(bip.n, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.q, bjv.c.a, dkn.a.f, bum::b);
      a(bip.t, bjv.c.a, dkn.a.f, bum::b);
      a(bip.u, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.w, bjv.c.a, dkn.a.f, bum::b);
      a(bip.E, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.F, bjv.c.a, dkn.a.f, byu::b);
      a(bip.C, bjv.c.a, dkn.a.f, bjd::a);
      a(bip.O, bjv.c.a, dkn.a.f, bwb::c);
      a(bip.Q, bjv.c.a, dkn.a.f, byx::b);
      a(bip.R, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.T, bjv.c.b, dkn.a.f, bit::a);
      a(bip.U, bjv.c.a, dkn.a.f, bwh::c);
      a(bip.Y, bjv.c.a, dkn.a.f, bum::b);
      a(bip.Z, bjv.c.a, dkn.a.f, bza::a);
      a(bip.ac, bjv.c.a, dkn.a.f, bjd::a);
      a(bip.aj, bjv.c.a, dkn.a.f, bum::b);
      a(bip.al, bjv.c.a, dkn.a.f, bzc::b);
      a(bip.ao, bjv.c.a, dkn.a.f, buz::c);
      a(bip.ap, bjv.c.a, dkn.a.f, bum::b);
      a(bip.aq, bjv.c.a, dkn.a.e, bva::c);
      a(bip.at, bjv.c.a, dkn.a.e, bvc::c);
      a(bip.av, bjv.c.a, dkn.a.f, bum::b);
      a(bip.W, bjv.c.a, dkn.a.f, bzz::c);
      a(bip.aw, bjv.c.a, dkn.a.f, caf::b);
      a(bip.ay, bjv.c.a, dkn.a.f, bze::b);
      a(bip.az, bjv.c.a, dkn.a.f, bve::c);
      a(bip.aC, bjv.c.a, dkn.a.f, bvg::c);
      a(bip.aF, bjv.c.a, dkn.a.f, bum::b);
      a(bip.aI, bjv.c.a, dkn.a.f, bzk::b);
      a(bip.aJ, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.aK, bjv.c.a, dkn.a.f, bum::b);
      a(bip.aL, bjv.c.a, dkn.a.f, bzm::c);
      a(bip.aO, bjv.c.a, dkn.a.f, bjd::a);
      a(bip.aS, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.aU, bjv.c.a, dkn.a.f, bzp::a);
      a(bip.aV, bjv.c.d, dkn.a.f, bzq::c);
      a(bip.bd, bjv.c.a, dkn.a.f, bvn::c);
      a(bip.bf, bjv.c.a, dkn.a.f, bjd::a);
      a(bip.bj, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.bk, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.bl, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.bn, bjv.c.a, dkn.a.f, bvp::c);
      a(bip.bp, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.bq, bjv.c.a, dkn.a.f, bum::b);
      a(bip.bs, bjv.c.a, dkn.a.f, bzy::b);
      a(bip.br, bjv.c.a, dkn.a.f, bzd::b);
      a(bip.m, bjv.c.a, dkn.a.f, bum::b);
      a(bip.A, bjv.c.b, dkn.a.f, byz::b);
      a(bip.G, bjv.c.c, dkn.a.f, bzd::b);
      a(bip.N, bjv.c.c, dkn.a.f, buw::c);
      a(bip.aa, bjv.c.c, dkn.a.f, bzd::b);
      a(bip.as, bjv.c.c, dkn.a.f, bum::b);
      a(bip.au, bjv.c.c, dkn.a.f, bjd::a);
      a(bip.aD, bjv.c.c, dkn.a.f, bzd::b);
      a(bip.aG, bjv.c.c, dkn.a.f, bjd::a);
      a(bip.ba, bjv.c.c, dkn.a.f, bum::b);
      a(bip.be, bjv.c.c, dkn.a.f, bzd::b);
      a(bip.bg, bjv.c.c, dkn.a.f, bzd::b);
      a(bip.bh, bjv.c.c, dkn.a.f, bjd::a);
      a(bip.bi, bjv.c.c, dkn.a.f, bjd::a);
   }

   static class a {
      final dkn.a a;
      final bjv.c b;
      final bjv.b<?> c;

      public a(dkn.a $$0, bjv.c $$1, bjv.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bil> {
      boolean test(bip<T> var1, cqf var2, bjf var3, gw var4, arx var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
