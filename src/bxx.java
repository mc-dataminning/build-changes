import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxx {
   private static final Map<bwm<?>, bxx.a> a = Maps.newHashMap();

   private static <T extends bxe> void a(bwm<T> $$0, bxv $$1, efy.a $$2, bxx.b<T> $$3) {
      bxx.a $$4 = a.put($$0, new bxx.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mf.f.b($$0));
      }
   }

   public static bxv a(bwm<?> $$0) {
      bxx.a $$1 = a.get($$0);
      return $$1 == null ? bxw.a : $$1.b;
   }

   public static boolean a(bwm<?> $$0, diy $$1, iu $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static efy.a b(@Nullable bwm<?> $$0) {
      bxx.a $$1 = a.get($$0);
      return $$1 == null ? efy.a.f : $$1.a;
   }

   public static <T extends bwd> boolean a(bwm<T> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      bxx.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwm.h, bxw.b, efy.a.f, ckj::a);
      a(bwm.A, bxw.b, efy.a.f, cjz::c);
      a(bwm.H, bxw.b, efy.a.f, cir::b);
      a(bwm.K, bxw.b, efy.a.f, cnn::a);
      a(bwm.ai, bxw.b, efy.a.f, cnv::b);
      a(bwm.aX, bxw.b, efy.a.f, cjz::c);
      a(bwm.ba, bxw.b, efy.a.f, cjz::c);
      a(bwm.br, bxw.b, efy.a.f, cir::b);
      a(bwm.bA, bxw.b, efy.a.f, cjx::b);
      a(bwm.e, bxw.d, efy.a.f, ckg::c);
      a(bwm.k, bxw.d, efy.a.f, cil::b);
      a(bwm.o, bxw.d, efy.a.f, cnz::c);
      a(bwm.q, bxw.d, efy.a.f, cnz::b);
      a(bwm.r, bxw.d, efy.a.f, cnz::c);
      a(bwm.v, bxw.d, efy.a.f, cnz::b);
      a(bwm.z, bxw.d, efy.a.f, cis::b);
      a(bwm.C, bxw.d, efy.a.f, cis::b);
      a(bwm.E, bxw.d, efy.a.f, cnz::b);
      a(bwm.I, bxw.d, efy.a.f, cis::b);
      a(bwm.N, bxw.d, efy.a.f, cnz::b);
      a(bwm.O, bxw.d, efy.a.f, cnq::b);
      a(bwm.P, bxw.d, efy.a.f, bxe::a);
      a(bwm.ab, bxw.d, efy.a.f, ckr::c);
      a(bwm.ad, bxw.d, efy.a.f, cnt::b);
      a(bwm.ae, bxw.d, efy.a.f, cnz::b);
      a(bwm.ag, bxw.b, efy.a.f, bwt::a);
      a(bwm.ah, bxw.d, efy.a.f, ckz::c);
      a(bwm.al, bxw.d, efy.a.f, cis::b);
      a(bwm.am, bxw.d, efy.a.f, cnw::a);
      a(bwm.ap, bxw.d, efy.a.f, bxe::a);
      a(bwm.ax, bxw.d, efy.a.f, cis::b);
      a(bwm.az, bxw.d, efy.a.f, cny::b);
      a(bwm.aE, bxw.d, efy.a.f, cjh::c);
      a(bwm.aF, bxw.d, efy.a.f, cis::b);
      a(bwm.aI, bxw.d, efy.a.e, cji::c);
      a(bwm.aO, bxw.d, efy.a.e, cjk::c);
      a(bwm.aQ, bxw.d, efy.a.f, cis::b);
      a(bwm.aj, bxw.d, efy.a.f, cph::c);
      a(bwm.aR, bxw.d, efy.a.f, cpn::b);
      a(bwm.aT, bxw.d, efy.a.f, coa::b);
      a(bwm.aU, bxw.d, efy.a.f, cjo::c);
      a(bwm.aY, bxw.d, efy.a.f, cjq::c);
      a(bwm.bb, bxw.d, efy.a.f, cis::b);
      a(bwm.be, bxw.d, efy.a.f, cog::b);
      a(bwm.bf, bxw.d, efy.a.f, cnz::b);
      a(bwm.bg, bxw.d, efy.a.f, clj::c);
      a(bwm.bh, bxw.d, efy.a.f, coi::c);
      a(bwm.bl, bxw.d, efy.a.f, bxe::a);
      a(bwm.bo, bxw.d, efy.a.f, cnz::b);
      a(bwm.bs, bxw.d, efy.a.f, col::a);
      a(bwm.bt, bxw.c, efy.a.f, com::c);
      a(bwm.bB, bxw.d, efy.a.f, cjy::c);
      a(bwm.bD, bxw.d, efy.a.f, bxe::a);
      a(bwm.bI, bxw.d, efy.a.f, cnz::b);
      a(bwm.bJ, bxw.d, efy.a.f, cnz::b);
      a(bwm.bK, bxw.d, efy.a.f, cnz::b);
      a(bwm.bM, bxw.d, efy.a.f, cka::c);
      a(bwm.bN, bxw.d, efy.a.f, cnz::c);
      a(bwm.D, bxw.d, efy.a.f, cnz::b);
      a(bwm.bO, bxw.d, efy.a.f, cnz::b);
      a(bwm.bP, bxw.d, efy.a.f, cln::c);
      a(bwm.bR, bxw.d, efy.a.f, cov::b);
      a(bwm.bQ, bxw.d, efy.a.f, cnz::b);
      a(bwm.u, bxw.d, efy.a.f, cis::b);
      a(bwm.M, bxw.b, efy.a.f, cnv::b);
      a(bwm.S, bxw.a, efy.a.f, cnz::b);
      a(bwm.aa, bxw.a, efy.a.f, cjf::c);
      a(bwm.an, bxw.a, efy.a.f, cnz::b);
      a(bwm.aN, bxw.a, efy.a.f, cis::b);
      a(bwm.aP, bxw.a, efy.a.f, bxe::a);
      a(bwm.aZ, bxw.d, efy.a.f, cnz::b);
      a(bwm.bc, bxw.a, efy.a.f, bxe::a);
      a(bwm.by, bxw.a, efy.a.f, cis::b);
      a(bwm.bC, bxw.a, efy.a.f, cnz::b);
      a(bwm.bE, bxw.a, efy.a.f, cnz::b);
      a(bwm.bF, bxw.d, efy.a.f, bxe::a);
      a(bwm.bG, bxw.a, efy.a.f, cnz::b);
   }

   static record a(efy.a a, bxv b, bxx.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bwd> {
      boolean test(bwm<T> var1, djm var2, bwl var3, iu var4, azv var5);
   }
}
