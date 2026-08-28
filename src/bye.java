import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bye {
   private static final Map<bwr<?>, bye.a> a = Maps.newHashMap();

   private static <T extends bxl> void a(bwr<T> $$0, byc $$1, egs.a $$2, bye.b<T> $$3) {
      bye.a $$4 = a.put($$0, new bye.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mg.f.b($$0));
      }
   }

   public static byc a(bwr<?> $$0) {
      bye.a $$1 = a.get($$0);
      return $$1 == null ? byd.a : $$1.b;
   }

   public static boolean a(bwr<?> $$0, djp $$1, iv $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static egs.a b(@Nullable bwr<?> $$0) {
      bye.a $$1 = a.get($$0);
      return $$1 == null ? egs.a.f : $$1.a;
   }

   public static <T extends bwi> boolean a(bwr<T> $$0, dkd $$1, bwq $$2, iv $$3, azv $$4) {
      bye.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwr.h, byd.b, egs.a.f, cko::a);
      a(bwr.A, byd.b, egs.a.f, ckh::c);
      a(bwr.H, byd.b, egs.a.f, ciy::b);
      a(bwr.K, byd.b, egs.a.f, cob::a);
      a(bwr.ai, byd.b, egs.a.f, coj::b);
      a(bwr.aX, byd.b, egs.a.f, ckh::c);
      a(bwr.ba, byd.b, egs.a.f, ckh::c);
      a(bwr.br, byd.b, egs.a.f, ciy::b);
      a(bwr.bA, byd.b, egs.a.f, ckf::b);
      a(bwr.e, byd.d, egs.a.f, ckl::c);
      a(bwr.k, byd.d, egs.a.f, cis::b);
      a(bwr.o, byd.d, egs.a.f, coo::c);
      a(bwr.q, byd.d, egs.a.f, coo::b);
      a(bwr.r, byd.d, egs.a.f, coo::c);
      a(bwr.t, byd.d, egs.a.f, ckt::c);
      a(bwr.v, byd.d, egs.a.f, coo::b);
      a(bwr.z, byd.d, egs.a.f, ciz::b);
      a(bwr.C, byd.d, egs.a.f, ciz::b);
      a(bwr.E, byd.d, egs.a.f, coo::b);
      a(bwr.I, byd.d, egs.a.f, ciz::b);
      a(bwr.N, byd.d, egs.a.f, coo::b);
      a(bwr.O, byd.d, egs.a.f, coe::b);
      a(bwr.P, byd.d, egs.a.f, bxl::a);
      a(bwr.ab, byd.d, egs.a.f, ckw::c);
      a(bwr.ad, byd.d, egs.a.f, coh::b);
      a(bwr.ae, byd.d, egs.a.f, coo::b);
      a(bwr.ag, byd.b, egs.a.f, bwy::a);
      a(bwr.ah, byd.d, egs.a.f, cle::c);
      a(bwr.al, byd.d, egs.a.f, ciz::b);
      a(bwr.am, byd.d, egs.a.f, cok::a);
      a(bwr.ap, byd.d, egs.a.f, bxl::a);
      a(bwr.ax, byd.d, egs.a.f, ciz::b);
      a(bwr.az, byd.d, egs.a.f, com::b);
      a(bwr.aE, byd.d, egs.a.f, cjq::c);
      a(bwr.aF, byd.d, egs.a.f, ciz::b);
      a(bwr.aI, byd.d, egs.a.e, cjr::c);
      a(bwr.aO, byd.d, egs.a.e, cjt::c);
      a(bwr.aQ, byd.d, egs.a.f, ciz::b);
      a(bwr.aj, byd.d, egs.a.f, cpv::c);
      a(bwr.aR, byd.d, egs.a.f, cqb::b);
      a(bwr.aT, byd.d, egs.a.f, cop::b);
      a(bwr.aU, byd.d, egs.a.f, cjx::c);
      a(bwr.aY, byd.d, egs.a.f, cjz::c);
      a(bwr.bb, byd.d, egs.a.f, ciz::b);
      a(bwr.be, byd.d, egs.a.f, cov::b);
      a(bwr.bf, byd.d, egs.a.f, coo::b);
      a(bwr.bg, byd.d, egs.a.f, clo::c);
      a(bwr.bh, byd.d, egs.a.f, cox::c);
      a(bwr.bl, byd.d, egs.a.f, bxl::a);
      a(bwr.bo, byd.d, egs.a.f, coo::b);
      a(bwr.bs, byd.d, egs.a.f, cpa::a);
      a(bwr.bt, byd.c, egs.a.f, cpb::c);
      a(bwr.bB, byd.d, egs.a.f, ckg::c);
      a(bwr.bD, byd.d, egs.a.f, bxl::a);
      a(bwr.bI, byd.d, egs.a.f, coo::b);
      a(bwr.bJ, byd.d, egs.a.f, coo::b);
      a(bwr.bK, byd.d, egs.a.f, coo::b);
      a(bwr.bM, byd.d, egs.a.f, cmb::c);
      a(bwr.bN, byd.d, egs.a.f, coo::c);
      a(bwr.D, byd.d, egs.a.f, coo::b);
      a(bwr.bO, byd.d, egs.a.f, coo::b);
      a(bwr.bP, byd.d, egs.a.f, cls::c);
      a(bwr.bR, byd.d, egs.a.f, cpj::b);
      a(bwr.bQ, byd.d, egs.a.f, coo::b);
      a(bwr.u, byd.d, egs.a.f, ciz::b);
      a(bwr.M, byd.b, egs.a.f, coj::b);
      a(bwr.S, byd.a, egs.a.f, coo::b);
      a(bwr.aa, byd.a, egs.a.f, cjo::c);
      a(bwr.an, byd.a, egs.a.f, coo::b);
      a(bwr.aN, byd.a, egs.a.f, ciz::b);
      a(bwr.aP, byd.a, egs.a.f, bxl::a);
      a(bwr.aZ, byd.d, egs.a.f, coo::b);
      a(bwr.bc, byd.a, egs.a.f, bxl::a);
      a(bwr.by, byd.a, egs.a.f, ciz::b);
      a(bwr.bC, byd.a, egs.a.f, coo::b);
      a(bwr.bE, byd.a, egs.a.f, coo::b);
      a(bwr.bF, byd.d, egs.a.f, bxl::a);
      a(bwr.bG, byd.a, egs.a.f, coo::b);
   }

   static record a(egs.a a, byc b, bye.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwi> {
      boolean test(bwr<T> var1, dkd var2, bwq var3, iv var4, azv var5);
   }
}
