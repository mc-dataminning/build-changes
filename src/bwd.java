import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwd {
   private static final Map<bus<?>, bwd.a> a = Maps.newHashMap();

   private static <T extends bvj> void a(bus<T> $$0, bwb $$1, ecs.a $$2, bwd.b<T> $$3) {
      bwd.a $$4 = a.put($$0, new bwd.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bwb a(bus<?> $$0) {
      bwd.a $$1 = a.get($$0);
      return $$1 == null ? bwc.a : $$1.b;
   }

   public static boolean a(bus<?> $$0, dgl $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ecs.a b(@Nullable bus<?> $$0) {
      bwd.a $$1 = a.get($$0);
      return $$1 == null ? ecs.a.f : $$1.a;
   }

   public static <T extends bul> boolean a(bus<T> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      bwd.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bus.h, bwc.b, ecs.a.f, cik::a);
      a(bus.A, bwc.b, ecs.a.f, cia::c);
      a(bus.H, bwc.b, ecs.a.f, cgx::b);
      a(bus.K, bwc.b, ecs.a.f, clm::a);
      a(bus.ai, bwc.b, ecs.a.f, clu::b);
      a(bus.aW, bwc.b, ecs.a.f, cia::c);
      a(bus.aZ, bwc.b, ecs.a.f, cia::c);
      a(bus.bq, bwc.b, ecs.a.f, cgx::b);
      a(bus.bz, bwc.b, ecs.a.f, chy::b);
      a(bus.e, bwc.d, ecs.a.f, cih::c);
      a(bus.k, bwc.d, ecs.a.f, cgs::b);
      a(bus.o, bwc.d, ecs.a.f, cly::c);
      a(bus.q, bwc.d, ecs.a.f, cly::b);
      a(bus.r, bwc.d, ecs.a.f, cly::c);
      a(bus.v, bwc.d, ecs.a.f, cly::b);
      a(bus.z, bwc.d, ecs.a.f, cgy::b);
      a(bus.C, bwc.d, ecs.a.f, cgy::b);
      a(bus.E, bwc.d, ecs.a.f, cly::b);
      a(bus.I, bwc.d, ecs.a.f, cgy::b);
      a(bus.N, bwc.d, ecs.a.f, cly::b);
      a(bus.O, bwc.d, ecs.a.f, clp::b);
      a(bus.P, bwc.d, ecs.a.f, bvj::a);
      a(bus.ab, bwc.d, ecs.a.f, cis::c);
      a(bus.ad, bwc.d, ecs.a.f, cls::b);
      a(bus.ae, bwc.d, ecs.a.f, cly::b);
      a(bus.ag, bwc.b, ecs.a.f, buz::a);
      a(bus.ah, bwc.d, ecs.a.f, ciy::c);
      a(bus.al, bwc.d, ecs.a.f, cgy::b);
      a(bus.am, bwc.d, ecs.a.f, clv::a);
      a(bus.ap, bwc.d, ecs.a.f, bvj::a);
      a(bus.ax, bwc.d, ecs.a.f, cgy::b);
      a(bus.az, bwc.d, ecs.a.f, clx::b);
      a(bus.aE, bwc.d, ecs.a.f, chl::c);
      a(bus.aF, bwc.d, ecs.a.f, cgy::b);
      a(bus.aI, bwc.d, ecs.a.e, chm::c);
      a(bus.aO, bwc.d, ecs.a.e, cho::c);
      a(bus.aQ, bwc.d, ecs.a.f, cgy::b);
      a(bus.aj, bwc.d, ecs.a.f, cnf::c);
      a(bus.aR, bwc.d, ecs.a.f, cnl::b);
      a(bus.aT, bwc.d, ecs.a.f, clz::b);
      a(bus.aU, bwc.d, ecs.a.f, chq::c);
      a(bus.aX, bwc.d, ecs.a.f, chs::c);
      a(bus.ba, bwc.d, ecs.a.f, cgy::b);
      a(bus.bd, bwc.d, ecs.a.f, cmf::b);
      a(bus.be, bwc.d, ecs.a.f, cly::b);
      a(bus.bf, bwc.d, ecs.a.f, cji::c);
      a(bus.bg, bwc.d, ecs.a.f, cmh::c);
      a(bus.bk, bwc.d, ecs.a.f, bvj::a);
      a(bus.bn, bwc.d, ecs.a.f, cly::b);
      a(bus.br, bwc.d, ecs.a.f, cmk::a);
      a(bus.bs, bwc.c, ecs.a.f, cml::c);
      a(bus.bA, bwc.d, ecs.a.f, chz::c);
      a(bus.bC, bwc.d, ecs.a.f, bvj::a);
      a(bus.bH, bwc.d, ecs.a.f, cly::b);
      a(bus.bI, bwc.d, ecs.a.f, cly::b);
      a(bus.bJ, bwc.d, ecs.a.f, cly::b);
      a(bus.bL, bwc.d, ecs.a.f, cib::c);
      a(bus.bM, bwc.d, ecs.a.f, cly::c);
      a(bus.D, bwc.d, ecs.a.f, cly::b);
      a(bus.bN, bwc.d, ecs.a.f, cly::b);
      a(bus.bO, bwc.d, ecs.a.f, cjm::c);
      a(bus.bQ, bwc.d, ecs.a.f, cmt::b);
      a(bus.bP, bwc.d, ecs.a.f, cly::b);
      a(bus.u, bwc.d, ecs.a.f, cgy::b);
      a(bus.M, bwc.b, ecs.a.f, clu::b);
      a(bus.S, bwc.a, ecs.a.f, cly::b);
      a(bus.aa, bwc.a, ecs.a.f, chi::c);
      a(bus.an, bwc.a, ecs.a.f, cly::b);
      a(bus.aN, bwc.a, ecs.a.f, cgy::b);
      a(bus.aP, bwc.a, ecs.a.f, bvj::a);
      a(bus.aY, bwc.d, ecs.a.f, cly::b);
      a(bus.bb, bwc.a, ecs.a.f, bvj::a);
      a(bus.bx, bwc.a, ecs.a.f, cgy::b);
      a(bus.bB, bwc.a, ecs.a.f, cly::b);
      a(bus.bD, bwc.a, ecs.a.f, cly::b);
      a(bus.bE, bwc.d, ecs.a.f, bvj::a);
      a(bus.bF, bwc.a, ecs.a.f, cly::b);
   }

   static record a(ecs.a a, bwb b, bwd.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bul> {
      boolean test(bus<T> var1, dgz var2, bur var3, ji var4, azh var5);
   }
}
