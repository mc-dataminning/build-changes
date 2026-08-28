import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwt {
   private static final Map<bvi<?>, bwt.a> a = Maps.newHashMap();

   private static <T extends bvz> void a(bvi<T> $$0, bwr $$1, edj.a $$2, bwt.b<T> $$3) {
      bwt.a $$4 = a.put($$0, new bwt.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ma.f.b($$0));
      }
   }

   public static bwr a(bvi<?> $$0) {
      bwt.a $$1 = a.get($$0);
      return $$1 == null ? bws.a : $$1.b;
   }

   public static boolean a(bvi<?> $$0, dhc $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static edj.a b(@Nullable bvi<?> $$0) {
      bwt.a $$1 = a.get($$0);
      return $$1 == null ? edj.a.f : $$1.a;
   }

   public static <T extends bvb> boolean a(bvi<T> $$0, dhq $$1, bvh $$2, jh $$3, bac $$4) {
      bwt.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bvi.h, bws.b, edj.a.f, cja::a);
      a(bvi.A, bws.b, edj.a.f, ciq::c);
      a(bvi.I, bws.b, edj.a.f, chn::b);
      a(bvi.L, bws.b, edj.a.f, cmc::a);
      a(bvi.aj, bws.b, edj.a.f, cmk::b);
      a(bvi.aX, bws.b, edj.a.f, ciq::c);
      a(bvi.ba, bws.b, edj.a.f, ciq::c);
      a(bvi.br, bws.b, edj.a.f, chn::b);
      a(bvi.bA, bws.b, edj.a.f, cio::b);
      a(bvi.e, bws.d, edj.a.f, cix::c);
      a(bvi.k, bws.d, edj.a.f, chi::b);
      a(bvi.o, bws.d, edj.a.f, cmo::c);
      a(bvi.q, bws.d, edj.a.f, cmo::b);
      a(bvi.r, bws.d, edj.a.f, cmo::c);
      a(bvi.v, bws.d, edj.a.f, cmo::b);
      a(bvi.z, bws.d, edj.a.f, cho::b);
      a(bvi.C, bws.d, edj.a.f, cho::b);
      a(bvi.F, bws.d, edj.a.f, cmo::b);
      a(bvi.J, bws.d, edj.a.f, cho::b);
      a(bvi.O, bws.d, edj.a.f, cmo::b);
      a(bvi.P, bws.d, edj.a.f, cmf::b);
      a(bvi.Q, bws.d, edj.a.f, bvz::a);
      a(bvi.ac, bws.d, edj.a.f, cji::c);
      a(bvi.ae, bws.d, edj.a.f, cmi::b);
      a(bvi.af, bws.d, edj.a.f, cmo::b);
      a(bvi.ah, bws.b, edj.a.f, bvp::a);
      a(bvi.ai, bws.d, edj.a.f, cjo::c);
      a(bvi.am, bws.d, edj.a.f, cho::b);
      a(bvi.an, bws.d, edj.a.f, cml::a);
      a(bvi.aq, bws.d, edj.a.f, bvz::a);
      a(bvi.ay, bws.d, edj.a.f, cho::b);
      a(bvi.aA, bws.d, edj.a.f, cmn::b);
      a(bvi.aF, bws.d, edj.a.f, cib::c);
      a(bvi.aG, bws.d, edj.a.f, cho::b);
      a(bvi.aJ, bws.d, edj.a.e, cic::c);
      a(bvi.aP, bws.d, edj.a.e, cie::c);
      a(bvi.aR, bws.d, edj.a.f, cho::b);
      a(bvi.ak, bws.d, edj.a.f, cnw::c);
      a(bvi.aS, bws.d, edj.a.f, coc::b);
      a(bvi.aU, bws.d, edj.a.f, cmp::b);
      a(bvi.aV, bws.d, edj.a.f, cig::c);
      a(bvi.aY, bws.d, edj.a.f, cii::c);
      a(bvi.bb, bws.d, edj.a.f, cho::b);
      a(bvi.be, bws.d, edj.a.f, cmv::b);
      a(bvi.bf, bws.d, edj.a.f, cmo::b);
      a(bvi.bg, bws.d, edj.a.f, cjy::c);
      a(bvi.bh, bws.d, edj.a.f, cmx::c);
      a(bvi.bl, bws.d, edj.a.f, bvz::a);
      a(bvi.bo, bws.d, edj.a.f, cmo::b);
      a(bvi.bs, bws.d, edj.a.f, cna::a);
      a(bvi.bt, bws.c, edj.a.f, cnb::c);
      a(bvi.bB, bws.d, edj.a.f, cip::c);
      a(bvi.bD, bws.d, edj.a.f, bvz::a);
      a(bvi.bI, bws.d, edj.a.f, cmo::b);
      a(bvi.bJ, bws.d, edj.a.f, cmo::b);
      a(bvi.bK, bws.d, edj.a.f, cmo::b);
      a(bvi.bM, bws.d, edj.a.f, cir::c);
      a(bvi.bN, bws.d, edj.a.f, cmo::c);
      a(bvi.D, bws.d, edj.a.f, cmo::b);
      a(bvi.E, bws.d, edj.a.f, cmo::b);
      a(bvi.bO, bws.d, edj.a.f, cmo::b);
      a(bvi.bP, bws.d, edj.a.f, ckc::c);
      a(bvi.bR, bws.d, edj.a.f, cnj::b);
      a(bvi.bQ, bws.d, edj.a.f, cmo::b);
      a(bvi.u, bws.d, edj.a.f, cho::b);
      a(bvi.N, bws.b, edj.a.f, cmk::b);
      a(bvi.T, bws.a, edj.a.f, cmo::b);
      a(bvi.ab, bws.a, edj.a.f, chy::c);
      a(bvi.ao, bws.a, edj.a.f, cmo::b);
      a(bvi.aO, bws.a, edj.a.f, cho::b);
      a(bvi.aQ, bws.a, edj.a.f, bvz::a);
      a(bvi.aZ, bws.d, edj.a.f, cmo::b);
      a(bvi.bc, bws.a, edj.a.f, bvz::a);
      a(bvi.by, bws.a, edj.a.f, cho::b);
      a(bvi.bC, bws.a, edj.a.f, cmo::b);
      a(bvi.bE, bws.a, edj.a.f, cmo::b);
      a(bvi.bF, bws.d, edj.a.f, bvz::a);
      a(bvi.bG, bws.a, edj.a.f, cmo::b);
   }

   static record a(edj.a a, bwr b, bwt.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bvb> {
      boolean test(bvi<T> var1, dhq var2, bvh var3, jh var4, bac var5);
   }
}
