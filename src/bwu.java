import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwu {
   private static final Map<bvi<?>, bwu.a> a = Maps.newHashMap();

   private static <T extends bwa> void a(bvi<T> $$0, bws $$1, edo.a $$2, bwu.b<T> $$3) {
      bwu.a $$4 = a.put($$0, new bwu.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bws a(bvi<?> $$0) {
      bwu.a $$1 = a.get($$0);
      return $$1 == null ? bwt.a : $$1.b;
   }

   public static boolean a(bvi<?> $$0, dhc $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static edo.a b(@Nullable bvi<?> $$0) {
      bwu.a $$1 = a.get($$0);
      return $$1 == null ? edo.a.f : $$1.a;
   }

   public static <T extends bva> boolean a(bvi<T> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      bwu.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bvi.h, bwt.b, edo.a.f, cje::a);
      a(bvi.A, bwt.b, edo.a.f, ciu::c);
      a(bvi.H, bwt.b, edo.a.f, cho::b);
      a(bvi.K, bwt.b, edo.a.f, cmg::a);
      a(bvi.ai, bwt.b, edo.a.f, cmo::b);
      a(bvi.aW, bwt.b, edo.a.f, ciu::c);
      a(bvi.aZ, bwt.b, edo.a.f, ciu::c);
      a(bvi.bq, bwt.b, edo.a.f, cho::b);
      a(bvi.bz, bwt.b, edo.a.f, cis::b);
      a(bvi.e, bwt.d, edo.a.f, cjb::c);
      a(bvi.k, bwt.d, edo.a.f, chj::b);
      a(bvi.o, bwt.d, edo.a.f, cms::c);
      a(bvi.q, bwt.d, edo.a.f, cms::b);
      a(bvi.r, bwt.d, edo.a.f, cms::c);
      a(bvi.v, bwt.d, edo.a.f, cms::b);
      a(bvi.z, bwt.d, edo.a.f, chp::b);
      a(bvi.C, bwt.d, edo.a.f, chp::b);
      a(bvi.E, bwt.d, edo.a.f, cms::b);
      a(bvi.I, bwt.d, edo.a.f, chp::b);
      a(bvi.N, bwt.d, edo.a.f, cms::b);
      a(bvi.O, bwt.d, edo.a.f, cmj::b);
      a(bvi.P, bwt.d, edo.a.f, bwa::a);
      a(bvi.ab, bwt.d, edo.a.f, cjm::c);
      a(bvi.ad, bwt.d, edo.a.f, cmm::b);
      a(bvi.ae, bwt.d, edo.a.f, cms::b);
      a(bvi.ag, bwt.b, edo.a.f, bvp::a);
      a(bvi.ah, bwt.d, edo.a.f, cjs::c);
      a(bvi.al, bwt.d, edo.a.f, chp::b);
      a(bvi.am, bwt.d, edo.a.f, cmp::a);
      a(bvi.ap, bwt.d, edo.a.f, bwa::a);
      a(bvi.ax, bwt.d, edo.a.f, chp::b);
      a(bvi.az, bwt.d, edo.a.f, cmr::b);
      a(bvi.aE, bwt.d, edo.a.f, cic::c);
      a(bvi.aF, bwt.d, edo.a.f, chp::b);
      a(bvi.aI, bwt.d, edo.a.e, cid::c);
      a(bvi.aO, bwt.d, edo.a.e, cif::c);
      a(bvi.aQ, bwt.d, edo.a.f, chp::b);
      a(bvi.aj, bwt.d, edo.a.f, cnz::c);
      a(bvi.aR, bwt.d, edo.a.f, cof::b);
      a(bvi.aT, bwt.d, edo.a.f, cmt::b);
      a(bvi.aU, bwt.d, edo.a.f, cij::c);
      a(bvi.aX, bwt.d, edo.a.f, cil::c);
      a(bvi.ba, bwt.d, edo.a.f, chp::b);
      a(bvi.bd, bwt.d, edo.a.f, cmz::b);
      a(bvi.be, bwt.d, edo.a.f, cms::b);
      a(bvi.bf, bwt.d, edo.a.f, ckc::c);
      a(bvi.bg, bwt.d, edo.a.f, cnb::c);
      a(bvi.bk, bwt.d, edo.a.f, bwa::a);
      a(bvi.bn, bwt.d, edo.a.f, cms::b);
      a(bvi.br, bwt.d, edo.a.f, cne::a);
      a(bvi.bs, bwt.c, edo.a.f, cnf::c);
      a(bvi.bA, bwt.d, edo.a.f, cit::c);
      a(bvi.bC, bwt.d, edo.a.f, bwa::a);
      a(bvi.bH, bwt.d, edo.a.f, cms::b);
      a(bvi.bI, bwt.d, edo.a.f, cms::b);
      a(bvi.bJ, bwt.d, edo.a.f, cms::b);
      a(bvi.bL, bwt.d, edo.a.f, civ::c);
      a(bvi.bM, bwt.d, edo.a.f, cms::c);
      a(bvi.D, bwt.d, edo.a.f, cms::b);
      a(bvi.bN, bwt.d, edo.a.f, cms::b);
      a(bvi.bO, bwt.d, edo.a.f, ckg::c);
      a(bvi.bQ, bwt.d, edo.a.f, cnn::b);
      a(bvi.bP, bwt.d, edo.a.f, cms::b);
      a(bvi.u, bwt.d, edo.a.f, chp::b);
      a(bvi.M, bwt.b, edo.a.f, cmo::b);
      a(bvi.S, bwt.a, edo.a.f, cms::b);
      a(bvi.aa, bwt.a, edo.a.f, chz::c);
      a(bvi.an, bwt.a, edo.a.f, cms::b);
      a(bvi.aN, bwt.a, edo.a.f, chp::b);
      a(bvi.aP, bwt.a, edo.a.f, bwa::a);
      a(bvi.aY, bwt.d, edo.a.f, cms::b);
      a(bvi.bb, bwt.a, edo.a.f, bwa::a);
      a(bvi.bx, bwt.a, edo.a.f, chp::b);
      a(bvi.bB, bwt.a, edo.a.f, cms::b);
      a(bvi.bD, bwt.a, edo.a.f, cms::b);
      a(bvi.bE, bwt.d, edo.a.f, bwa::a);
      a(bvi.bF, bwt.a, edo.a.f, cms::b);
   }

   static record a(edo.a a, bws b, bwu.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bva> {
      boolean test(bvi<T> var1, dhq var2, bvh var3, ji var4, azh var5);
   }
}
