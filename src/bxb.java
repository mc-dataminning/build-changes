import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxb {
   private static final Map<bvq<?>, bxb.a> a = Maps.newHashMap();

   private static <T extends bwh> void a(bvq<T> $$0, bwz $$1, edp.a $$2, bxb.b<T> $$3) {
      bxb.a $$4 = a.put($$0, new bxb.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ma.f.b($$0));
      }
   }

   public static bwz a(bvq<?> $$0) {
      bxb.a $$1 = a.get($$0);
      return $$1 == null ? bxa.a : $$1.b;
   }

   public static boolean a(bvq<?> $$0, dhk $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static edp.a b(@Nullable bvq<?> $$0) {
      bxb.a $$1 = a.get($$0);
      return $$1 == null ? edp.a.f : $$1.a;
   }

   public static <T extends bvj> boolean a(bvq<T> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      bxb.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bvq.h, bxa.b, edp.a.f, cji::a);
      a(bvq.A, bxa.b, edp.a.f, ciy::c);
      a(bvq.I, bxa.b, edp.a.f, chv::b);
      a(bvq.L, bxa.b, edp.a.f, cmk::a);
      a(bvq.aj, bxa.b, edp.a.f, cms::b);
      a(bvq.aX, bxa.b, edp.a.f, ciy::c);
      a(bvq.ba, bxa.b, edp.a.f, ciy::c);
      a(bvq.br, bxa.b, edp.a.f, chv::b);
      a(bvq.bA, bxa.b, edp.a.f, ciw::b);
      a(bvq.e, bxa.d, edp.a.f, cjf::c);
      a(bvq.k, bxa.d, edp.a.f, chq::b);
      a(bvq.o, bxa.d, edp.a.f, cmw::c);
      a(bvq.q, bxa.d, edp.a.f, cmw::b);
      a(bvq.r, bxa.d, edp.a.f, cmw::c);
      a(bvq.v, bxa.d, edp.a.f, cmw::b);
      a(bvq.z, bxa.d, edp.a.f, chw::b);
      a(bvq.C, bxa.d, edp.a.f, chw::b);
      a(bvq.F, bxa.d, edp.a.f, cmw::b);
      a(bvq.J, bxa.d, edp.a.f, chw::b);
      a(bvq.O, bxa.d, edp.a.f, cmw::b);
      a(bvq.P, bxa.d, edp.a.f, cmn::b);
      a(bvq.Q, bxa.d, edp.a.f, bwh::a);
      a(bvq.ac, bxa.d, edp.a.f, cjq::c);
      a(bvq.ae, bxa.d, edp.a.f, cmq::b);
      a(bvq.af, bxa.d, edp.a.f, cmw::b);
      a(bvq.ah, bxa.b, edp.a.f, bvx::a);
      a(bvq.ai, bxa.d, edp.a.f, cjw::c);
      a(bvq.am, bxa.d, edp.a.f, chw::b);
      a(bvq.an, bxa.d, edp.a.f, cmt::a);
      a(bvq.aq, bxa.d, edp.a.f, bwh::a);
      a(bvq.ay, bxa.d, edp.a.f, chw::b);
      a(bvq.aA, bxa.d, edp.a.f, cmv::b);
      a(bvq.aF, bxa.d, edp.a.f, cij::c);
      a(bvq.aG, bxa.d, edp.a.f, chw::b);
      a(bvq.aJ, bxa.d, edp.a.e, cik::c);
      a(bvq.aP, bxa.d, edp.a.e, cim::c);
      a(bvq.aR, bxa.d, edp.a.f, chw::b);
      a(bvq.ak, bxa.d, edp.a.f, coe::c);
      a(bvq.aS, bxa.d, edp.a.f, cok::b);
      a(bvq.aU, bxa.d, edp.a.f, cmx::b);
      a(bvq.aV, bxa.d, edp.a.f, cio::c);
      a(bvq.aY, bxa.d, edp.a.f, ciq::c);
      a(bvq.bb, bxa.d, edp.a.f, chw::b);
      a(bvq.be, bxa.d, edp.a.f, cnd::b);
      a(bvq.bf, bxa.d, edp.a.f, cmw::b);
      a(bvq.bg, bxa.d, edp.a.f, ckg::c);
      a(bvq.bh, bxa.d, edp.a.f, cnf::c);
      a(bvq.bl, bxa.d, edp.a.f, bwh::a);
      a(bvq.bo, bxa.d, edp.a.f, cmw::b);
      a(bvq.bs, bxa.d, edp.a.f, cni::a);
      a(bvq.bt, bxa.c, edp.a.f, cnj::c);
      a(bvq.bB, bxa.d, edp.a.f, cix::c);
      a(bvq.bD, bxa.d, edp.a.f, bwh::a);
      a(bvq.bI, bxa.d, edp.a.f, cmw::b);
      a(bvq.bJ, bxa.d, edp.a.f, cmw::b);
      a(bvq.bK, bxa.d, edp.a.f, cmw::b);
      a(bvq.bM, bxa.d, edp.a.f, ciz::c);
      a(bvq.bN, bxa.d, edp.a.f, cmw::c);
      a(bvq.D, bxa.d, edp.a.f, cmw::b);
      a(bvq.E, bxa.d, edp.a.f, cmw::b);
      a(bvq.bO, bxa.d, edp.a.f, cmw::b);
      a(bvq.bP, bxa.d, edp.a.f, ckk::c);
      a(bvq.bR, bxa.d, edp.a.f, cnr::b);
      a(bvq.bQ, bxa.d, edp.a.f, cmw::b);
      a(bvq.u, bxa.d, edp.a.f, chw::b);
      a(bvq.N, bxa.b, edp.a.f, cms::b);
      a(bvq.T, bxa.a, edp.a.f, cmw::b);
      a(bvq.ab, bxa.a, edp.a.f, cig::c);
      a(bvq.ao, bxa.a, edp.a.f, cmw::b);
      a(bvq.aO, bxa.a, edp.a.f, chw::b);
      a(bvq.aQ, bxa.a, edp.a.f, bwh::a);
      a(bvq.aZ, bxa.d, edp.a.f, cmw::b);
      a(bvq.bc, bxa.a, edp.a.f, bwh::a);
      a(bvq.by, bxa.a, edp.a.f, chw::b);
      a(bvq.bC, bxa.a, edp.a.f, cmw::b);
      a(bvq.bE, bxa.a, edp.a.f, cmw::b);
      a(bvq.bF, bxa.d, edp.a.f, bwh::a);
      a(bvq.bG, bxa.a, edp.a.f, cmw::b);
   }

   static record a(edp.a a, bwz b, bxb.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bvj> {
      boolean test(bvq<T> var1, dhy var2, bvp var3, jh var4, bam var5);
   }
}
