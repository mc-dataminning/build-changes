import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxc {
   private static final Map<bvr<?>, bxc.a> a = Maps.newHashMap();

   private static <T extends bwi> void a(bvr<T> $$0, bxa $$1, edq.a $$2, bxc.b<T> $$3) {
      bxc.a $$4 = a.put($$0, new bxc.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ma.f.b($$0));
      }
   }

   public static bxa a(bvr<?> $$0) {
      bxc.a $$1 = a.get($$0);
      return $$1 == null ? bxb.a : $$1.b;
   }

   public static boolean a(bvr<?> $$0, dhl $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static edq.a b(@Nullable bvr<?> $$0) {
      bxc.a $$1 = a.get($$0);
      return $$1 == null ? edq.a.f : $$1.a;
   }

   public static <T extends bvk> boolean a(bvr<T> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      bxc.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bvr.h, bxb.b, edq.a.f, cjj::a);
      a(bvr.A, bxb.b, edq.a.f, ciz::c);
      a(bvr.I, bxb.b, edq.a.f, chw::b);
      a(bvr.L, bxb.b, edq.a.f, cml::a);
      a(bvr.aj, bxb.b, edq.a.f, cmt::b);
      a(bvr.aX, bxb.b, edq.a.f, ciz::c);
      a(bvr.ba, bxb.b, edq.a.f, ciz::c);
      a(bvr.br, bxb.b, edq.a.f, chw::b);
      a(bvr.bA, bxb.b, edq.a.f, cix::b);
      a(bvr.e, bxb.d, edq.a.f, cjg::c);
      a(bvr.k, bxb.d, edq.a.f, chr::b);
      a(bvr.o, bxb.d, edq.a.f, cmx::c);
      a(bvr.q, bxb.d, edq.a.f, cmx::b);
      a(bvr.r, bxb.d, edq.a.f, cmx::c);
      a(bvr.v, bxb.d, edq.a.f, cmx::b);
      a(bvr.z, bxb.d, edq.a.f, chx::b);
      a(bvr.C, bxb.d, edq.a.f, chx::b);
      a(bvr.F, bxb.d, edq.a.f, cmx::b);
      a(bvr.J, bxb.d, edq.a.f, chx::b);
      a(bvr.O, bxb.d, edq.a.f, cmx::b);
      a(bvr.P, bxb.d, edq.a.f, cmo::b);
      a(bvr.Q, bxb.d, edq.a.f, bwi::a);
      a(bvr.ac, bxb.d, edq.a.f, cjr::c);
      a(bvr.ae, bxb.d, edq.a.f, cmr::b);
      a(bvr.af, bxb.d, edq.a.f, cmx::b);
      a(bvr.ah, bxb.b, edq.a.f, bvy::a);
      a(bvr.ai, bxb.d, edq.a.f, cjx::c);
      a(bvr.am, bxb.d, edq.a.f, chx::b);
      a(bvr.an, bxb.d, edq.a.f, cmu::a);
      a(bvr.aq, bxb.d, edq.a.f, bwi::a);
      a(bvr.ay, bxb.d, edq.a.f, chx::b);
      a(bvr.aA, bxb.d, edq.a.f, cmw::b);
      a(bvr.aF, bxb.d, edq.a.f, cik::c);
      a(bvr.aG, bxb.d, edq.a.f, chx::b);
      a(bvr.aJ, bxb.d, edq.a.e, cil::c);
      a(bvr.aP, bxb.d, edq.a.e, cin::c);
      a(bvr.aR, bxb.d, edq.a.f, chx::b);
      a(bvr.ak, bxb.d, edq.a.f, cof::c);
      a(bvr.aS, bxb.d, edq.a.f, col::b);
      a(bvr.aU, bxb.d, edq.a.f, cmy::b);
      a(bvr.aV, bxb.d, edq.a.f, cip::c);
      a(bvr.aY, bxb.d, edq.a.f, cir::c);
      a(bvr.bb, bxb.d, edq.a.f, chx::b);
      a(bvr.be, bxb.d, edq.a.f, cne::b);
      a(bvr.bf, bxb.d, edq.a.f, cmx::b);
      a(bvr.bg, bxb.d, edq.a.f, ckh::c);
      a(bvr.bh, bxb.d, edq.a.f, cng::c);
      a(bvr.bl, bxb.d, edq.a.f, bwi::a);
      a(bvr.bo, bxb.d, edq.a.f, cmx::b);
      a(bvr.bs, bxb.d, edq.a.f, cnj::a);
      a(bvr.bt, bxb.c, edq.a.f, cnk::c);
      a(bvr.bB, bxb.d, edq.a.f, ciy::c);
      a(bvr.bD, bxb.d, edq.a.f, bwi::a);
      a(bvr.bI, bxb.d, edq.a.f, cmx::b);
      a(bvr.bJ, bxb.d, edq.a.f, cmx::b);
      a(bvr.bK, bxb.d, edq.a.f, cmx::b);
      a(bvr.bM, bxb.d, edq.a.f, cja::c);
      a(bvr.bN, bxb.d, edq.a.f, cmx::c);
      a(bvr.D, bxb.d, edq.a.f, cmx::b);
      a(bvr.E, bxb.d, edq.a.f, cmx::b);
      a(bvr.bO, bxb.d, edq.a.f, cmx::b);
      a(bvr.bP, bxb.d, edq.a.f, ckl::c);
      a(bvr.bR, bxb.d, edq.a.f, cns::b);
      a(bvr.bQ, bxb.d, edq.a.f, cmx::b);
      a(bvr.u, bxb.d, edq.a.f, chx::b);
      a(bvr.N, bxb.b, edq.a.f, cmt::b);
      a(bvr.T, bxb.a, edq.a.f, cmx::b);
      a(bvr.ab, bxb.a, edq.a.f, cih::c);
      a(bvr.ao, bxb.a, edq.a.f, cmx::b);
      a(bvr.aO, bxb.a, edq.a.f, chx::b);
      a(bvr.aQ, bxb.a, edq.a.f, bwi::a);
      a(bvr.aZ, bxb.d, edq.a.f, cmx::b);
      a(bvr.bc, bxb.a, edq.a.f, bwi::a);
      a(bvr.by, bxb.a, edq.a.f, chx::b);
      a(bvr.bC, bxb.a, edq.a.f, cmx::b);
      a(bvr.bE, bxb.a, edq.a.f, cmx::b);
      a(bvr.bF, bxb.d, edq.a.f, bwi::a);
      a(bvr.bG, bxb.a, edq.a.f, cmx::b);
   }

   static record a(edq.a a, bxa b, bxc.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bvk> {
      boolean test(bvr<T> var1, dhz var2, bvq var3, jh var4, bam var5);
   }
}
