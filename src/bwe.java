import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwe {
   private static final Map<but<?>, bwe.a> a = Maps.newHashMap();

   private static <T extends bvk> void a(but<T> $$0, bwc $$1, ect.a $$2, bwe.b<T> $$3) {
      bwe.a $$4 = a.put($$0, new bwe.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bwc a(but<?> $$0) {
      bwe.a $$1 = a.get($$0);
      return $$1 == null ? bwd.a : $$1.b;
   }

   public static boolean a(but<?> $$0, dgm $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ect.a b(@Nullable but<?> $$0) {
      bwe.a $$1 = a.get($$0);
      return $$1 == null ? ect.a.f : $$1.a;
   }

   public static <T extends bum> boolean a(but<T> $$0, dha $$1, bus $$2, ji $$3, azh $$4) {
      bwe.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(but.h, bwd.b, ect.a.f, cil::a);
      a(but.A, bwd.b, ect.a.f, cib::c);
      a(but.H, bwd.b, ect.a.f, cgy::b);
      a(but.K, bwd.b, ect.a.f, cln::a);
      a(but.ai, bwd.b, ect.a.f, clv::b);
      a(but.aW, bwd.b, ect.a.f, cib::c);
      a(but.aZ, bwd.b, ect.a.f, cib::c);
      a(but.bq, bwd.b, ect.a.f, cgy::b);
      a(but.bz, bwd.b, ect.a.f, chz::b);
      a(but.e, bwd.d, ect.a.f, cii::c);
      a(but.k, bwd.d, ect.a.f, cgt::b);
      a(but.o, bwd.d, ect.a.f, clz::c);
      a(but.q, bwd.d, ect.a.f, clz::b);
      a(but.r, bwd.d, ect.a.f, clz::c);
      a(but.v, bwd.d, ect.a.f, clz::b);
      a(but.z, bwd.d, ect.a.f, cgz::b);
      a(but.C, bwd.d, ect.a.f, cgz::b);
      a(but.E, bwd.d, ect.a.f, clz::b);
      a(but.I, bwd.d, ect.a.f, cgz::b);
      a(but.N, bwd.d, ect.a.f, clz::b);
      a(but.O, bwd.d, ect.a.f, clq::b);
      a(but.P, bwd.d, ect.a.f, bvk::a);
      a(but.ab, bwd.d, ect.a.f, cit::c);
      a(but.ad, bwd.d, ect.a.f, clt::b);
      a(but.ae, bwd.d, ect.a.f, clz::b);
      a(but.ag, bwd.b, ect.a.f, bva::a);
      a(but.ah, bwd.d, ect.a.f, ciz::c);
      a(but.al, bwd.d, ect.a.f, cgz::b);
      a(but.am, bwd.d, ect.a.f, clw::a);
      a(but.ap, bwd.d, ect.a.f, bvk::a);
      a(but.ax, bwd.d, ect.a.f, cgz::b);
      a(but.az, bwd.d, ect.a.f, cly::b);
      a(but.aE, bwd.d, ect.a.f, chm::c);
      a(but.aF, bwd.d, ect.a.f, cgz::b);
      a(but.aI, bwd.d, ect.a.e, chn::c);
      a(but.aO, bwd.d, ect.a.e, chp::c);
      a(but.aQ, bwd.d, ect.a.f, cgz::b);
      a(but.aj, bwd.d, ect.a.f, cng::c);
      a(but.aR, bwd.d, ect.a.f, cnm::b);
      a(but.aT, bwd.d, ect.a.f, cma::b);
      a(but.aU, bwd.d, ect.a.f, chr::c);
      a(but.aX, bwd.d, ect.a.f, cht::c);
      a(but.ba, bwd.d, ect.a.f, cgz::b);
      a(but.bd, bwd.d, ect.a.f, cmg::b);
      a(but.be, bwd.d, ect.a.f, clz::b);
      a(but.bf, bwd.d, ect.a.f, cjj::c);
      a(but.bg, bwd.d, ect.a.f, cmi::c);
      a(but.bk, bwd.d, ect.a.f, bvk::a);
      a(but.bn, bwd.d, ect.a.f, clz::b);
      a(but.br, bwd.d, ect.a.f, cml::a);
      a(but.bs, bwd.c, ect.a.f, cmm::c);
      a(but.bA, bwd.d, ect.a.f, cia::c);
      a(but.bC, bwd.d, ect.a.f, bvk::a);
      a(but.bH, bwd.d, ect.a.f, clz::b);
      a(but.bI, bwd.d, ect.a.f, clz::b);
      a(but.bJ, bwd.d, ect.a.f, clz::b);
      a(but.bL, bwd.d, ect.a.f, cic::c);
      a(but.bM, bwd.d, ect.a.f, clz::c);
      a(but.D, bwd.d, ect.a.f, clz::b);
      a(but.bN, bwd.d, ect.a.f, clz::b);
      a(but.bO, bwd.d, ect.a.f, cjn::c);
      a(but.bQ, bwd.d, ect.a.f, cmu::b);
      a(but.bP, bwd.d, ect.a.f, clz::b);
      a(but.u, bwd.d, ect.a.f, cgz::b);
      a(but.M, bwd.b, ect.a.f, clv::b);
      a(but.S, bwd.a, ect.a.f, clz::b);
      a(but.aa, bwd.a, ect.a.f, chj::c);
      a(but.an, bwd.a, ect.a.f, clz::b);
      a(but.aN, bwd.a, ect.a.f, cgz::b);
      a(but.aP, bwd.a, ect.a.f, bvk::a);
      a(but.aY, bwd.d, ect.a.f, clz::b);
      a(but.bb, bwd.a, ect.a.f, bvk::a);
      a(but.bx, bwd.a, ect.a.f, cgz::b);
      a(but.bB, bwd.a, ect.a.f, clz::b);
      a(but.bD, bwd.a, ect.a.f, clz::b);
      a(but.bE, bwd.d, ect.a.f, bvk::a);
      a(but.bF, bwd.a, ect.a.f, clz::b);
   }

   static record a(ect.a a, bwc b, bwe.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bum> {
      boolean test(but<T> var1, dha var2, bus var3, ji var4, azh var5);
   }
}
