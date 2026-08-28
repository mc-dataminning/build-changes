import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bza {
   private static final Map<bxn<?>, bza.a> a = Maps.newHashMap();

   private static <T extends byh> void a(bxn<T> $$0, byy $$1, ehp.a $$2, bza.b<T> $$3) {
      bza.a $$4 = a.put($$0, new bza.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mh.f.b($$0));
      }
   }

   public static byy a(bxn<?> $$0) {
      bza.a $$1 = a.get($$0);
      return $$1 == null ? byz.a : $$1.b;
   }

   public static boolean a(bxn<?> $$0, dkm $$1, iw $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ehp.a b(@Nullable bxn<?> $$0) {
      bza.a $$1 = a.get($$0);
      return $$1 == null ? ehp.a.f : $$1.a;
   }

   public static <T extends bxe> boolean a(bxn<T> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      bza.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bxn.i, byz.b, ehp.a.f, clk::a);
      a(bxn.B, byz.b, ehp.a.f, cld::c);
      a(bxn.I, byz.b, ehp.a.f, cju::b);
      a(bxn.L, byz.b, ehp.a.f, coy::a);
      a(bxn.aj, byz.b, ehp.a.f, cpg::b);
      a(bxn.aY, byz.b, ehp.a.f, cld::c);
      a(bxn.bb, byz.b, ehp.a.f, cld::c);
      a(bxn.bs, byz.b, ehp.a.f, cju::b);
      a(bxn.bB, byz.b, ehp.a.f, clb::b);
      a(bxn.f, byz.d, ehp.a.f, clh::c);
      a(bxn.l, byz.d, ehp.a.f, cjo::b);
      a(bxn.p, byz.d, ehp.a.f, cpk::c);
      a(bxn.r, byz.d, ehp.a.f, cpk::b);
      a(bxn.s, byz.d, ehp.a.f, cpk::c);
      a(bxn.u, byz.d, ehp.a.f, clp::c);
      a(bxn.w, byz.d, ehp.a.f, cpk::b);
      a(bxn.A, byz.d, ehp.a.f, cjv::b);
      a(bxn.D, byz.d, ehp.a.f, cjv::b);
      a(bxn.F, byz.d, ehp.a.f, cpk::b);
      a(bxn.J, byz.d, ehp.a.f, cjv::b);
      a(bxn.O, byz.d, ehp.a.f, cpk::b);
      a(bxn.P, byz.d, ehp.a.f, cpb::b);
      a(bxn.Q, byz.d, ehp.a.f, byh::a);
      a(bxn.ac, byz.d, ehp.a.f, cls::c);
      a(bxn.ae, byz.d, ehp.a.f, cpe::b);
      a(bxn.af, byz.d, ehp.a.f, cpk::b);
      a(bxn.ah, byz.b, ehp.a.f, bxu::a);
      a(bxn.ai, byz.d, ehp.a.f, cma::c);
      a(bxn.am, byz.d, ehp.a.f, cjv::b);
      a(bxn.an, byz.d, ehp.a.f, cph::a);
      a(bxn.aq, byz.d, ehp.a.f, byh::a);
      a(bxn.ay, byz.d, ehp.a.f, cjv::b);
      a(bxn.aA, byz.d, ehp.a.f, cpj::b);
      a(bxn.aF, byz.d, ehp.a.f, ckm::c);
      a(bxn.aG, byz.d, ehp.a.f, cjv::b);
      a(bxn.aJ, byz.d, ehp.a.e, ckn::c);
      a(bxn.aP, byz.d, ehp.a.e, ckp::c);
      a(bxn.aR, byz.d, ehp.a.f, cjv::b);
      a(bxn.ak, byz.d, ehp.a.f, cqr::c);
      a(bxn.aS, byz.d, ehp.a.f, cqx::b);
      a(bxn.aU, byz.d, ehp.a.f, cpl::b);
      a(bxn.aV, byz.d, ehp.a.f, ckt::c);
      a(bxn.aZ, byz.d, ehp.a.f, ckv::c);
      a(bxn.bc, byz.d, ehp.a.f, cjv::b);
      a(bxn.bf, byz.d, ehp.a.f, cpr::b);
      a(bxn.bg, byz.d, ehp.a.f, cpk::b);
      a(bxn.bh, byz.d, ehp.a.f, cmk::c);
      a(bxn.bi, byz.d, ehp.a.f, cpt::c);
      a(bxn.bm, byz.d, ehp.a.f, byh::a);
      a(bxn.bp, byz.d, ehp.a.f, cpk::b);
      a(bxn.bt, byz.d, ehp.a.f, cpw::a);
      a(bxn.bu, byz.c, ehp.a.f, cpx::c);
      a(bxn.bC, byz.d, ehp.a.f, clc::c);
      a(bxn.bE, byz.d, ehp.a.f, byh::a);
      a(bxn.bJ, byz.d, ehp.a.f, cpk::b);
      a(bxn.bK, byz.d, ehp.a.f, cpk::b);
      a(bxn.bL, byz.d, ehp.a.f, cpk::b);
      a(bxn.bN, byz.d, ehp.a.f, cmx::c);
      a(bxn.bO, byz.d, ehp.a.f, cpk::c);
      a(bxn.E, byz.d, ehp.a.f, cpk::b);
      a(bxn.bP, byz.d, ehp.a.f, cpk::b);
      a(bxn.bQ, byz.d, ehp.a.f, cmo::c);
      a(bxn.bS, byz.d, ehp.a.f, cqf::b);
      a(bxn.bR, byz.d, ehp.a.f, cpk::b);
      a(bxn.v, byz.d, ehp.a.f, cjv::b);
      a(bxn.N, byz.b, ehp.a.f, cpg::b);
      a(bxn.T, byz.a, ehp.a.f, cpk::b);
      a(bxn.ab, byz.a, ehp.a.f, ckk::c);
      a(bxn.ao, byz.a, ehp.a.f, cpk::b);
      a(bxn.aO, byz.a, ehp.a.f, cjv::b);
      a(bxn.aQ, byz.a, ehp.a.f, byh::a);
      a(bxn.ba, byz.d, ehp.a.f, cpk::b);
      a(bxn.bd, byz.a, ehp.a.f, byh::a);
      a(bxn.bz, byz.a, ehp.a.f, cjv::b);
      a(bxn.bD, byz.a, ehp.a.f, cpk::b);
      a(bxn.bF, byz.a, ehp.a.f, cpk::b);
      a(bxn.bG, byz.d, ehp.a.f, byh::a);
      a(bxn.bH, byz.a, ehp.a.f, cpk::b);
   }

   static record a(ehp.a a, byy b, bza.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bxe> {
      boolean test(bxn<T> var1, dla var2, bxm var3, iw var4, bai var5);
   }
}
