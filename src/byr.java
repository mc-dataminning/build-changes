import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class byr {
   private static final Map<bxe<?>, byr.a> a = Maps.newHashMap();

   private static <T extends bxy> void a(bxe<T> $$0, byp $$1, ehf.a $$2, byr.b<T> $$3) {
      byr.a $$4 = a.put($$0, new byr.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mh.f.b($$0));
      }
   }

   public static byp a(bxe<?> $$0) {
      byr.a $$1 = a.get($$0);
      return $$1 == null ? byq.a : $$1.b;
   }

   public static boolean a(bxe<?> $$0, dkc $$1, iw $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ehf.a b(@Nullable bxe<?> $$0) {
      byr.a $$1 = a.get($$0);
      return $$1 == null ? ehf.a.f : $$1.a;
   }

   public static <T extends bwv> boolean a(bxe<T> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      byr.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bxe.i, byq.b, ehf.a.f, clb::a);
      a(bxe.B, byq.b, ehf.a.f, cku::c);
      a(bxe.I, byq.b, ehf.a.f, cjl::b);
      a(bxe.L, byq.b, ehf.a.f, cop::a);
      a(bxe.aj, byq.b, ehf.a.f, cox::b);
      a(bxe.aY, byq.b, ehf.a.f, cku::c);
      a(bxe.bb, byq.b, ehf.a.f, cku::c);
      a(bxe.bs, byq.b, ehf.a.f, cjl::b);
      a(bxe.bB, byq.b, ehf.a.f, cks::b);
      a(bxe.f, byq.d, ehf.a.f, cky::c);
      a(bxe.l, byq.d, ehf.a.f, cjf::b);
      a(bxe.p, byq.d, ehf.a.f, cpb::c);
      a(bxe.r, byq.d, ehf.a.f, cpb::b);
      a(bxe.s, byq.d, ehf.a.f, cpb::c);
      a(bxe.u, byq.d, ehf.a.f, clg::c);
      a(bxe.w, byq.d, ehf.a.f, cpb::b);
      a(bxe.A, byq.d, ehf.a.f, cjm::b);
      a(bxe.D, byq.d, ehf.a.f, cjm::b);
      a(bxe.F, byq.d, ehf.a.f, cpb::b);
      a(bxe.J, byq.d, ehf.a.f, cjm::b);
      a(bxe.O, byq.d, ehf.a.f, cpb::b);
      a(bxe.P, byq.d, ehf.a.f, cos::b);
      a(bxe.Q, byq.d, ehf.a.f, bxy::a);
      a(bxe.ac, byq.d, ehf.a.f, clj::c);
      a(bxe.ae, byq.d, ehf.a.f, cov::b);
      a(bxe.af, byq.d, ehf.a.f, cpb::b);
      a(bxe.ah, byq.b, ehf.a.f, bxl::a);
      a(bxe.ai, byq.d, ehf.a.f, clr::c);
      a(bxe.am, byq.d, ehf.a.f, cjm::b);
      a(bxe.an, byq.d, ehf.a.f, coy::a);
      a(bxe.aq, byq.d, ehf.a.f, bxy::a);
      a(bxe.ay, byq.d, ehf.a.f, cjm::b);
      a(bxe.aA, byq.d, ehf.a.f, cpa::b);
      a(bxe.aF, byq.d, ehf.a.f, ckd::c);
      a(bxe.aG, byq.d, ehf.a.f, cjm::b);
      a(bxe.aJ, byq.d, ehf.a.e, cke::c);
      a(bxe.aP, byq.d, ehf.a.e, ckg::c);
      a(bxe.aR, byq.d, ehf.a.f, cjm::b);
      a(bxe.ak, byq.d, ehf.a.f, cqi::c);
      a(bxe.aS, byq.d, ehf.a.f, cqo::b);
      a(bxe.aU, byq.d, ehf.a.f, cpc::b);
      a(bxe.aV, byq.d, ehf.a.f, ckk::c);
      a(bxe.aZ, byq.d, ehf.a.f, ckm::c);
      a(bxe.bc, byq.d, ehf.a.f, cjm::b);
      a(bxe.bf, byq.d, ehf.a.f, cpi::b);
      a(bxe.bg, byq.d, ehf.a.f, cpb::b);
      a(bxe.bh, byq.d, ehf.a.f, cmb::c);
      a(bxe.bi, byq.d, ehf.a.f, cpk::c);
      a(bxe.bm, byq.d, ehf.a.f, bxy::a);
      a(bxe.bp, byq.d, ehf.a.f, cpb::b);
      a(bxe.bt, byq.d, ehf.a.f, cpn::a);
      a(bxe.bu, byq.c, ehf.a.f, cpo::c);
      a(bxe.bC, byq.d, ehf.a.f, ckt::c);
      a(bxe.bE, byq.d, ehf.a.f, bxy::a);
      a(bxe.bJ, byq.d, ehf.a.f, cpb::b);
      a(bxe.bK, byq.d, ehf.a.f, cpb::b);
      a(bxe.bL, byq.d, ehf.a.f, cpb::b);
      a(bxe.bN, byq.d, ehf.a.f, cmo::c);
      a(bxe.bO, byq.d, ehf.a.f, cpb::c);
      a(bxe.E, byq.d, ehf.a.f, cpb::b);
      a(bxe.bP, byq.d, ehf.a.f, cpb::b);
      a(bxe.bQ, byq.d, ehf.a.f, cmf::c);
      a(bxe.bS, byq.d, ehf.a.f, cpw::b);
      a(bxe.bR, byq.d, ehf.a.f, cpb::b);
      a(bxe.v, byq.d, ehf.a.f, cjm::b);
      a(bxe.N, byq.b, ehf.a.f, cox::b);
      a(bxe.T, byq.a, ehf.a.f, cpb::b);
      a(bxe.ab, byq.a, ehf.a.f, ckb::c);
      a(bxe.ao, byq.a, ehf.a.f, cpb::b);
      a(bxe.aO, byq.a, ehf.a.f, cjm::b);
      a(bxe.aQ, byq.a, ehf.a.f, bxy::a);
      a(bxe.ba, byq.d, ehf.a.f, cpb::b);
      a(bxe.bd, byq.a, ehf.a.f, bxy::a);
      a(bxe.bz, byq.a, ehf.a.f, cjm::b);
      a(bxe.bD, byq.a, ehf.a.f, cpb::b);
      a(bxe.bF, byq.a, ehf.a.f, cpb::b);
      a(bxe.bG, byq.d, ehf.a.f, bxy::a);
      a(bxe.bH, byq.a, ehf.a.f, cpb::b);
   }

   static record a(ehf.a a, byp b, byr.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwv> {
      boolean test(bxe<T> var1, dkq var2, bxd var3, iw var4, azz var5);
   }
}
