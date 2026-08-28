import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxz {
   private static final Map<bwo<?>, bxz.a> a = Maps.newHashMap();

   private static <T extends bxg> void a(bwo<T> $$0, bxx $$1, egg.a $$2, bxz.b<T> $$3) {
      bxz.a $$4 = a.put($$0, new bxz.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mf.f.b($$0));
      }
   }

   public static bxx a(bwo<?> $$0) {
      bxz.a $$1 = a.get($$0);
      return $$1 == null ? bxy.a : $$1.b;
   }

   public static boolean a(bwo<?> $$0, djd $$1, iu $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static egg.a b(@Nullable bwo<?> $$0) {
      bxz.a $$1 = a.get($$0);
      return $$1 == null ? egg.a.f : $$1.a;
   }

   public static <T extends bwf> boolean a(bwo<T> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      bxz.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwo.h, bxy.b, egg.a.f, ckn::a);
      a(bwo.A, bxy.b, egg.a.f, ckd::c);
      a(bwo.H, bxy.b, egg.a.f, cit::b);
      a(bwo.K, bxy.b, egg.a.f, cnr::a);
      a(bwo.ai, bxy.b, egg.a.f, cnz::b);
      a(bwo.aX, bxy.b, egg.a.f, ckd::c);
      a(bwo.ba, bxy.b, egg.a.f, ckd::c);
      a(bwo.br, bxy.b, egg.a.f, cit::b);
      a(bwo.bA, bxy.b, egg.a.f, ckb::b);
      a(bwo.e, bxy.d, egg.a.f, ckk::c);
      a(bwo.k, bxy.d, egg.a.f, cin::b);
      a(bwo.o, bxy.d, egg.a.f, cod::c);
      a(bwo.q, bxy.d, egg.a.f, cod::b);
      a(bwo.r, bxy.d, egg.a.f, cod::c);
      a(bwo.v, bxy.d, egg.a.f, cod::b);
      a(bwo.z, bxy.d, egg.a.f, ciu::b);
      a(bwo.C, bxy.d, egg.a.f, ciu::b);
      a(bwo.E, bxy.d, egg.a.f, cod::b);
      a(bwo.I, bxy.d, egg.a.f, ciu::b);
      a(bwo.N, bxy.d, egg.a.f, cod::b);
      a(bwo.O, bxy.d, egg.a.f, cnu::b);
      a(bwo.P, bxy.d, egg.a.f, bxg::a);
      a(bwo.ab, bxy.d, egg.a.f, ckv::c);
      a(bwo.ad, bxy.d, egg.a.f, cnx::b);
      a(bwo.ae, bxy.d, egg.a.f, cod::b);
      a(bwo.ag, bxy.b, egg.a.f, bwv::a);
      a(bwo.ah, bxy.d, egg.a.f, cld::c);
      a(bwo.al, bxy.d, egg.a.f, ciu::b);
      a(bwo.am, bxy.d, egg.a.f, coa::a);
      a(bwo.ap, bxy.d, egg.a.f, bxg::a);
      a(bwo.ax, bxy.d, egg.a.f, ciu::b);
      a(bwo.az, bxy.d, egg.a.f, coc::b);
      a(bwo.aE, bxy.d, egg.a.f, cjl::c);
      a(bwo.aF, bxy.d, egg.a.f, ciu::b);
      a(bwo.aI, bxy.d, egg.a.e, cjm::c);
      a(bwo.aO, bxy.d, egg.a.e, cjo::c);
      a(bwo.aQ, bxy.d, egg.a.f, ciu::b);
      a(bwo.aj, bxy.d, egg.a.f, cpl::c);
      a(bwo.aR, bxy.d, egg.a.f, cpr::b);
      a(bwo.aT, bxy.d, egg.a.f, coe::b);
      a(bwo.aU, bxy.d, egg.a.f, cjs::c);
      a(bwo.aY, bxy.d, egg.a.f, cju::c);
      a(bwo.bb, bxy.d, egg.a.f, ciu::b);
      a(bwo.be, bxy.d, egg.a.f, cok::b);
      a(bwo.bf, bxy.d, egg.a.f, cod::b);
      a(bwo.bg, bxy.d, egg.a.f, cln::c);
      a(bwo.bh, bxy.d, egg.a.f, com::c);
      a(bwo.bl, bxy.d, egg.a.f, bxg::a);
      a(bwo.bo, bxy.d, egg.a.f, cod::b);
      a(bwo.bs, bxy.d, egg.a.f, coq::a);
      a(bwo.bt, bxy.c, egg.a.f, cor::c);
      a(bwo.bB, bxy.d, egg.a.f, ckc::c);
      a(bwo.bD, bxy.d, egg.a.f, bxg::a);
      a(bwo.bI, bxy.d, egg.a.f, cod::b);
      a(bwo.bJ, bxy.d, egg.a.f, cod::b);
      a(bwo.bK, bxy.d, egg.a.f, cod::b);
      a(bwo.bM, bxy.d, egg.a.f, cke::c);
      a(bwo.bN, bxy.d, egg.a.f, cod::c);
      a(bwo.D, bxy.d, egg.a.f, cod::b);
      a(bwo.bO, bxy.d, egg.a.f, cod::b);
      a(bwo.bP, bxy.d, egg.a.f, clr::c);
      a(bwo.bR, bxy.d, egg.a.f, coz::b);
      a(bwo.bQ, bxy.d, egg.a.f, cod::b);
      a(bwo.u, bxy.d, egg.a.f, ciu::b);
      a(bwo.M, bxy.b, egg.a.f, cnz::b);
      a(bwo.S, bxy.a, egg.a.f, cod::b);
      a(bwo.aa, bxy.a, egg.a.f, cjj::c);
      a(bwo.an, bxy.a, egg.a.f, cod::b);
      a(bwo.aN, bxy.a, egg.a.f, ciu::b);
      a(bwo.aP, bxy.a, egg.a.f, bxg::a);
      a(bwo.aZ, bxy.d, egg.a.f, cod::b);
      a(bwo.bc, bxy.a, egg.a.f, bxg::a);
      a(bwo.by, bxy.a, egg.a.f, ciu::b);
      a(bwo.bC, bxy.a, egg.a.f, cod::b);
      a(bwo.bE, bxy.a, egg.a.f, cod::b);
      a(bwo.bF, bxy.d, egg.a.f, bxg::a);
      a(bwo.bG, bxy.a, egg.a.f, cod::b);
   }

   static record a(egg.a a, bxx b, bxz.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwf> {
      boolean test(bwo<T> var1, djr var2, bwn var3, iu var4, azv var5);
   }
}
