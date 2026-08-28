import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwd {
   private static final Map<bus<?>, bwd.a> a = Maps.newHashMap();

   private static <T extends bvj> void a(bus<T> $$0, bwb $$1, ebq.a $$2, bwd.b<T> $$3) {
      bwd.a $$4 = a.put($$0, new bwd.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lz.f.b($$0));
      }
   }

   public static bwb a(bus<?> $$0) {
      bwd.a $$1 = a.get($$0);
      return $$1 == null ? bwc.a : $$1.b;
   }

   public static boolean a(bus<?> $$0, dfp $$1, jh $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ebq.a b(@Nullable bus<?> $$0) {
      bwd.a $$1 = a.get($$0);
      return $$1 == null ? ebq.a.f : $$1.a;
   }

   public static <T extends bul> boolean a(bus<T> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      bwd.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bus.h, bwc.b, ebq.a.f, cik::a);
      a(bus.A, bwc.b, ebq.a.f, cia::c);
      a(bus.G, bwc.b, ebq.a.f, cgx::b);
      a(bus.J, bwc.b, ebq.a.f, clm::a);
      a(bus.ah, bwc.b, ebq.a.f, clu::b);
      a(bus.aT, bwc.b, ebq.a.f, cia::c);
      a(bus.aW, bwc.b, ebq.a.f, cia::c);
      a(bus.bn, bwc.b, ebq.a.f, cgx::b);
      a(bus.bw, bwc.b, ebq.a.f, chy::b);
      a(bus.e, bwc.d, ebq.a.f, cih::c);
      a(bus.k, bwc.d, ebq.a.f, cgs::b);
      a(bus.o, bwc.d, ebq.a.f, cly::c);
      a(bus.q, bwc.d, ebq.a.f, cly::b);
      a(bus.r, bwc.d, ebq.a.f, cly::c);
      a(bus.v, bwc.d, ebq.a.f, cly::b);
      a(bus.z, bwc.d, ebq.a.f, cgy::b);
      a(bus.C, bwc.d, ebq.a.f, cgy::b);
      a(bus.D, bwc.d, ebq.a.f, cly::b);
      a(bus.H, bwc.d, ebq.a.f, cgy::b);
      a(bus.M, bwc.d, ebq.a.f, cly::b);
      a(bus.N, bwc.d, ebq.a.f, clp::b);
      a(bus.O, bwc.d, ebq.a.f, bvj::a);
      a(bus.aa, bwc.d, ebq.a.f, cis::c);
      a(bus.ac, bwc.d, ebq.a.f, cls::b);
      a(bus.ad, bwc.d, ebq.a.f, cly::b);
      a(bus.af, bwc.b, ebq.a.f, buz::a);
      a(bus.ag, bwc.d, ebq.a.f, ciy::c);
      a(bus.ak, bwc.d, ebq.a.f, cgy::b);
      a(bus.al, bwc.d, ebq.a.f, clv::a);
      a(bus.ao, bwc.d, ebq.a.f, bvj::a);
      a(bus.aw, bwc.d, ebq.a.f, cgy::b);
      a(bus.ay, bwc.d, ebq.a.f, clx::b);
      a(bus.aD, bwc.d, ebq.a.f, chl::c);
      a(bus.aE, bwc.d, ebq.a.f, cgy::b);
      a(bus.aH, bwc.d, ebq.a.e, chm::c);
      a(bus.aL, bwc.d, ebq.a.e, cho::c);
      a(bus.aN, bwc.d, ebq.a.f, cgy::b);
      a(bus.ai, bwc.d, ebq.a.f, cnc::c);
      a(bus.aO, bwc.d, ebq.a.f, cni::b);
      a(bus.aQ, bwc.d, ebq.a.f, clz::b);
      a(bus.aR, bwc.d, ebq.a.f, chq::c);
      a(bus.aU, bwc.d, ebq.a.f, chs::c);
      a(bus.aX, bwc.d, ebq.a.f, cgy::b);
      a(bus.ba, bwc.d, ebq.a.f, cmf::b);
      a(bus.bb, bwc.d, ebq.a.f, cly::b);
      a(bus.bc, bwc.d, ebq.a.f, cji::c);
      a(bus.bd, bwc.d, ebq.a.f, cmh::c);
      a(bus.bh, bwc.d, ebq.a.f, bvj::a);
      a(bus.bk, bwc.d, ebq.a.f, cly::b);
      a(bus.bo, bwc.d, ebq.a.f, cmk::a);
      a(bus.bp, bwc.c, ebq.a.f, cml::c);
      a(bus.bx, bwc.d, ebq.a.f, chz::c);
      a(bus.bz, bwc.d, ebq.a.f, bvj::a);
      a(bus.bE, bwc.d, ebq.a.f, cly::b);
      a(bus.bF, bwc.d, ebq.a.f, cly::b);
      a(bus.bG, bwc.d, ebq.a.f, cly::b);
      a(bus.bI, bwc.d, ebq.a.f, cib::c);
      a(bus.bJ, bwc.d, ebq.a.f, cly::c);
      a(bus.bK, bwc.d, ebq.a.f, cly::b);
      a(bus.bL, bwc.d, ebq.a.f, cjm::c);
      a(bus.bN, bwc.d, ebq.a.f, cmt::b);
      a(bus.bM, bwc.d, ebq.a.f, cly::b);
      a(bus.u, bwc.d, ebq.a.f, cgy::b);
      a(bus.L, bwc.b, ebq.a.f, clu::b);
      a(bus.R, bwc.a, ebq.a.f, cly::b);
      a(bus.Z, bwc.a, ebq.a.f, chi::c);
      a(bus.am, bwc.a, ebq.a.f, cly::b);
      a(bus.aK, bwc.a, ebq.a.f, cgy::b);
      a(bus.aM, bwc.a, ebq.a.f, bvj::a);
      a(bus.aV, bwc.d, ebq.a.f, cly::b);
      a(bus.aY, bwc.a, ebq.a.f, bvj::a);
      a(bus.bu, bwc.a, ebq.a.f, cgy::b);
      a(bus.by, bwc.a, ebq.a.f, cly::b);
      a(bus.bA, bwc.a, ebq.a.f, cly::b);
      a(bus.bB, bwc.d, ebq.a.f, bvj::a);
      a(bus.bC, bwc.a, ebq.a.f, cly::b);
   }

   static record a(ebq.a a, bwb b, bwd.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bul> {
      boolean test(bus<T> var1, dgd var2, bur var3, jh var4, azu var5);
   }
}
