import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class byp {
   private static final Map<bxc<?>, byp.a> a = Maps.newHashMap();

   private static <T extends bxw> void a(bxc<T> $$0, byn $$1, ehd.a $$2, byp.b<T> $$3) {
      byp.a $$4 = a.put($$0, new byp.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mg.f.b($$0));
      }
   }

   public static byn a(bxc<?> $$0) {
      byp.a $$1 = a.get($$0);
      return $$1 == null ? byo.a : $$1.b;
   }

   public static boolean a(bxc<?> $$0, dka $$1, iv $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ehd.a b(@Nullable bxc<?> $$0) {
      byp.a $$1 = a.get($$0);
      return $$1 == null ? ehd.a.f : $$1.a;
   }

   public static <T extends bwt> boolean a(bxc<T> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      byp.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bxc.i, byo.b, ehd.a.f, ckz::a);
      a(bxc.B, byo.b, ehd.a.f, cks::c);
      a(bxc.I, byo.b, ehd.a.f, cjj::b);
      a(bxc.L, byo.b, ehd.a.f, com::a);
      a(bxc.aj, byo.b, ehd.a.f, cov::b);
      a(bxc.aY, byo.b, ehd.a.f, cks::c);
      a(bxc.bb, byo.b, ehd.a.f, cks::c);
      a(bxc.bs, byo.b, ehd.a.f, cjj::b);
      a(bxc.bB, byo.b, ehd.a.f, ckq::b);
      a(bxc.f, byo.d, ehd.a.f, ckw::c);
      a(bxc.l, byo.d, ehd.a.f, cjd::b);
      a(bxc.p, byo.d, ehd.a.f, coz::c);
      a(bxc.r, byo.d, ehd.a.f, coz::b);
      a(bxc.s, byo.d, ehd.a.f, coz::c);
      a(bxc.u, byo.d, ehd.a.f, cle::c);
      a(bxc.w, byo.d, ehd.a.f, coz::b);
      a(bxc.A, byo.d, ehd.a.f, cjk::b);
      a(bxc.D, byo.d, ehd.a.f, cjk::b);
      a(bxc.F, byo.d, ehd.a.f, coz::b);
      a(bxc.J, byo.d, ehd.a.f, cjk::b);
      a(bxc.O, byo.d, ehd.a.f, coz::b);
      a(bxc.P, byo.d, ehd.a.f, coq::b);
      a(bxc.Q, byo.d, ehd.a.f, bxw::a);
      a(bxc.ac, byo.d, ehd.a.f, clh::c);
      a(bxc.ae, byo.d, ehd.a.f, cot::b);
      a(bxc.af, byo.d, ehd.a.f, coz::b);
      a(bxc.ah, byo.b, ehd.a.f, bxj::a);
      a(bxc.ai, byo.d, ehd.a.f, clp::c);
      a(bxc.am, byo.d, ehd.a.f, cjk::b);
      a(bxc.an, byo.d, ehd.a.f, cow::a);
      a(bxc.aq, byo.d, ehd.a.f, bxw::a);
      a(bxc.ay, byo.d, ehd.a.f, cjk::b);
      a(bxc.aA, byo.d, ehd.a.f, coy::b);
      a(bxc.aF, byo.d, ehd.a.f, ckb::c);
      a(bxc.aG, byo.d, ehd.a.f, cjk::b);
      a(bxc.aJ, byo.d, ehd.a.e, ckc::c);
      a(bxc.aP, byo.d, ehd.a.e, cke::c);
      a(bxc.aR, byo.d, ehd.a.f, cjk::b);
      a(bxc.ak, byo.d, ehd.a.f, cqg::c);
      a(bxc.aS, byo.d, ehd.a.f, cqm::b);
      a(bxc.aU, byo.d, ehd.a.f, cpa::b);
      a(bxc.aV, byo.d, ehd.a.f, cki::c);
      a(bxc.aZ, byo.d, ehd.a.f, ckk::c);
      a(bxc.bc, byo.d, ehd.a.f, cjk::b);
      a(bxc.bf, byo.d, ehd.a.f, cpg::b);
      a(bxc.bg, byo.d, ehd.a.f, coz::b);
      a(bxc.bh, byo.d, ehd.a.f, clz::c);
      a(bxc.bi, byo.d, ehd.a.f, cpi::c);
      a(bxc.bm, byo.d, ehd.a.f, bxw::a);
      a(bxc.bp, byo.d, ehd.a.f, coz::b);
      a(bxc.bt, byo.d, ehd.a.f, cpl::a);
      a(bxc.bu, byo.c, ehd.a.f, cpm::c);
      a(bxc.bC, byo.d, ehd.a.f, ckr::c);
      a(bxc.bE, byo.d, ehd.a.f, bxw::a);
      a(bxc.bJ, byo.d, ehd.a.f, coz::b);
      a(bxc.bK, byo.d, ehd.a.f, coz::b);
      a(bxc.bL, byo.d, ehd.a.f, coz::b);
      a(bxc.bN, byo.d, ehd.a.f, cmm::c);
      a(bxc.bO, byo.d, ehd.a.f, coz::c);
      a(bxc.E, byo.d, ehd.a.f, coz::b);
      a(bxc.bP, byo.d, ehd.a.f, coz::b);
      a(bxc.bQ, byo.d, ehd.a.f, cmd::c);
      a(bxc.bS, byo.d, ehd.a.f, cpu::b);
      a(bxc.bR, byo.d, ehd.a.f, coz::b);
      a(bxc.v, byo.d, ehd.a.f, cjk::b);
      a(bxc.N, byo.b, ehd.a.f, cov::b);
      a(bxc.T, byo.a, ehd.a.f, coz::b);
      a(bxc.ab, byo.a, ehd.a.f, cjz::c);
      a(bxc.ao, byo.a, ehd.a.f, coz::b);
      a(bxc.aO, byo.a, ehd.a.f, cjk::b);
      a(bxc.aQ, byo.a, ehd.a.f, bxw::a);
      a(bxc.ba, byo.d, ehd.a.f, coz::b);
      a(bxc.bd, byo.a, ehd.a.f, bxw::a);
      a(bxc.bz, byo.a, ehd.a.f, cjk::b);
      a(bxc.bD, byo.a, ehd.a.f, coz::b);
      a(bxc.bF, byo.a, ehd.a.f, coz::b);
      a(bxc.bG, byo.d, ehd.a.f, bxw::a);
      a(bxc.bH, byo.a, ehd.a.f, coz::b);
   }

   static record a(ehd.a a, byn b, byp.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwt> {
      boolean test(bxc<T> var1, dko var2, bxb var3, iv var4, azx var5);
   }
}
