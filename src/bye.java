import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bye {
   private static final Map<bwr<?>, bye.a> a = Maps.newHashMap();

   private static <T extends bxl> void a(bwr<T> $$0, byc $$1, egn.a $$2, bye.b<T> $$3) {
      bye.a $$4 = a.put($$0, new bye.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mg.f.b($$0));
      }
   }

   public static byc a(bwr<?> $$0) {
      bye.a $$1 = a.get($$0);
      return $$1 == null ? byd.a : $$1.b;
   }

   public static boolean a(bwr<?> $$0, djk $$1, iv $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static egn.a b(@Nullable bwr<?> $$0) {
      bye.a $$1 = a.get($$0);
      return $$1 == null ? egn.a.f : $$1.a;
   }

   public static <T extends bwi> boolean a(bwr<T> $$0, djy $$1, bwq $$2, iv $$3, azv $$4) {
      bye.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwr.h, byd.b, egn.a.f, ckr::a);
      a(bwr.A, byd.b, egn.a.f, ckh::c);
      a(bwr.H, byd.b, egn.a.f, ciy::b);
      a(bwr.K, byd.b, egn.a.f, cny::a);
      a(bwr.ai, byd.b, egn.a.f, cog::b);
      a(bwr.aX, byd.b, egn.a.f, ckh::c);
      a(bwr.ba, byd.b, egn.a.f, ckh::c);
      a(bwr.br, byd.b, egn.a.f, ciy::b);
      a(bwr.bA, byd.b, egn.a.f, ckf::b);
      a(bwr.e, byd.d, egn.a.f, cko::c);
      a(bwr.k, byd.d, egn.a.f, cis::b);
      a(bwr.o, byd.d, egn.a.f, cok::c);
      a(bwr.q, byd.d, egn.a.f, cok::b);
      a(bwr.r, byd.d, egn.a.f, cok::c);
      a(bwr.t, byd.d, egn.a.f, ckw::c);
      a(bwr.v, byd.d, egn.a.f, cok::b);
      a(bwr.z, byd.d, egn.a.f, ciz::b);
      a(bwr.C, byd.d, egn.a.f, ciz::b);
      a(bwr.E, byd.d, egn.a.f, cok::b);
      a(bwr.I, byd.d, egn.a.f, ciz::b);
      a(bwr.N, byd.d, egn.a.f, cok::b);
      a(bwr.O, byd.d, egn.a.f, cob::b);
      a(bwr.P, byd.d, egn.a.f, bxl::a);
      a(bwr.ab, byd.d, egn.a.f, ckz::c);
      a(bwr.ad, byd.d, egn.a.f, coe::b);
      a(bwr.ae, byd.d, egn.a.f, cok::b);
      a(bwr.ag, byd.b, egn.a.f, bwy::a);
      a(bwr.ah, byd.d, egn.a.f, clh::c);
      a(bwr.al, byd.d, egn.a.f, ciz::b);
      a(bwr.am, byd.d, egn.a.f, coh::a);
      a(bwr.ap, byd.d, egn.a.f, bxl::a);
      a(bwr.ax, byd.d, egn.a.f, ciz::b);
      a(bwr.az, byd.d, egn.a.f, coj::b);
      a(bwr.aE, byd.d, egn.a.f, cjq::c);
      a(bwr.aF, byd.d, egn.a.f, ciz::b);
      a(bwr.aI, byd.d, egn.a.e, cjr::c);
      a(bwr.aO, byd.d, egn.a.e, cjt::c);
      a(bwr.aQ, byd.d, egn.a.f, ciz::b);
      a(bwr.aj, byd.d, egn.a.f, cps::c);
      a(bwr.aR, byd.d, egn.a.f, cpy::b);
      a(bwr.aT, byd.d, egn.a.f, col::b);
      a(bwr.aU, byd.d, egn.a.f, cjx::c);
      a(bwr.aY, byd.d, egn.a.f, cjz::c);
      a(bwr.bb, byd.d, egn.a.f, ciz::b);
      a(bwr.be, byd.d, egn.a.f, cos::b);
      a(bwr.bf, byd.d, egn.a.f, cok::b);
      a(bwr.bg, byd.d, egn.a.f, clr::c);
      a(bwr.bh, byd.d, egn.a.f, cou::c);
      a(bwr.bl, byd.d, egn.a.f, bxl::a);
      a(bwr.bo, byd.d, egn.a.f, cok::b);
      a(bwr.bs, byd.d, egn.a.f, cox::a);
      a(bwr.bt, byd.c, egn.a.f, coy::c);
      a(bwr.bB, byd.d, egn.a.f, ckg::c);
      a(bwr.bD, byd.d, egn.a.f, bxl::a);
      a(bwr.bI, byd.d, egn.a.f, cok::b);
      a(bwr.bJ, byd.d, egn.a.f, cok::b);
      a(bwr.bK, byd.d, egn.a.f, cok::b);
      a(bwr.bM, byd.d, egn.a.f, cki::c);
      a(bwr.bN, byd.d, egn.a.f, cok::c);
      a(bwr.D, byd.d, egn.a.f, cok::b);
      a(bwr.bO, byd.d, egn.a.f, cok::b);
      a(bwr.bP, byd.d, egn.a.f, clv::c);
      a(bwr.bR, byd.d, egn.a.f, cpg::b);
      a(bwr.bQ, byd.d, egn.a.f, cok::b);
      a(bwr.u, byd.d, egn.a.f, ciz::b);
      a(bwr.M, byd.b, egn.a.f, cog::b);
      a(bwr.S, byd.a, egn.a.f, cok::b);
      a(bwr.aa, byd.a, egn.a.f, cjo::c);
      a(bwr.an, byd.a, egn.a.f, cok::b);
      a(bwr.aN, byd.a, egn.a.f, ciz::b);
      a(bwr.aP, byd.a, egn.a.f, bxl::a);
      a(bwr.aZ, byd.d, egn.a.f, cok::b);
      a(bwr.bc, byd.a, egn.a.f, bxl::a);
      a(bwr.by, byd.a, egn.a.f, ciz::b);
      a(bwr.bC, byd.a, egn.a.f, cok::b);
      a(bwr.bE, byd.a, egn.a.f, cok::b);
      a(bwr.bF, byd.d, egn.a.f, bxl::a);
      a(bwr.bG, byd.a, egn.a.f, cok::b);
   }

   static record a(egn.a a, byc b, bye.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwi> {
      boolean test(bwr<T> var1, djy var2, bwq var3, iv var4, azv var5);
   }
}
