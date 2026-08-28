import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwc {
   private static final Map<bur<?>, bwc.a> a = Maps.newHashMap();

   private static <T extends bvi> void a(bur<T> $$0, bwa $$1, ecr.a $$2, bwc.b<T> $$3) {
      bwc.a $$4 = a.put($$0, new bwc.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bwa a(bur<?> $$0) {
      bwc.a $$1 = a.get($$0);
      return $$1 == null ? bwb.a : $$1.b;
   }

   public static boolean a(bur<?> $$0, dgk $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ecr.a b(@Nullable bur<?> $$0) {
      bwc.a $$1 = a.get($$0);
      return $$1 == null ? ecr.a.f : $$1.a;
   }

   public static <T extends buk> boolean a(bur<T> $$0, dgy $$1, buq $$2, ji $$3, azh $$4) {
      bwc.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bur.h, bwb.b, ecr.a.f, cij::a);
      a(bur.A, bwb.b, ecr.a.f, chz::c);
      a(bur.H, bwb.b, ecr.a.f, cgw::b);
      a(bur.K, bwb.b, ecr.a.f, cll::a);
      a(bur.ai, bwb.b, ecr.a.f, clt::b);
      a(bur.aW, bwb.b, ecr.a.f, chz::c);
      a(bur.aZ, bwb.b, ecr.a.f, chz::c);
      a(bur.bq, bwb.b, ecr.a.f, cgw::b);
      a(bur.bz, bwb.b, ecr.a.f, chx::b);
      a(bur.e, bwb.d, ecr.a.f, cig::c);
      a(bur.k, bwb.d, ecr.a.f, cgr::b);
      a(bur.o, bwb.d, ecr.a.f, clx::c);
      a(bur.q, bwb.d, ecr.a.f, clx::b);
      a(bur.r, bwb.d, ecr.a.f, clx::c);
      a(bur.v, bwb.d, ecr.a.f, clx::b);
      a(bur.z, bwb.d, ecr.a.f, cgx::b);
      a(bur.C, bwb.d, ecr.a.f, cgx::b);
      a(bur.E, bwb.d, ecr.a.f, clx::b);
      a(bur.I, bwb.d, ecr.a.f, cgx::b);
      a(bur.N, bwb.d, ecr.a.f, clx::b);
      a(bur.O, bwb.d, ecr.a.f, clo::b);
      a(bur.P, bwb.d, ecr.a.f, bvi::a);
      a(bur.ab, bwb.d, ecr.a.f, cir::c);
      a(bur.ad, bwb.d, ecr.a.f, clr::b);
      a(bur.ae, bwb.d, ecr.a.f, clx::b);
      a(bur.ag, bwb.b, ecr.a.f, buy::a);
      a(bur.ah, bwb.d, ecr.a.f, cix::c);
      a(bur.al, bwb.d, ecr.a.f, cgx::b);
      a(bur.am, bwb.d, ecr.a.f, clu::a);
      a(bur.ap, bwb.d, ecr.a.f, bvi::a);
      a(bur.ax, bwb.d, ecr.a.f, cgx::b);
      a(bur.az, bwb.d, ecr.a.f, clw::b);
      a(bur.aE, bwb.d, ecr.a.f, chk::c);
      a(bur.aF, bwb.d, ecr.a.f, cgx::b);
      a(bur.aI, bwb.d, ecr.a.e, chl::c);
      a(bur.aO, bwb.d, ecr.a.e, chn::c);
      a(bur.aQ, bwb.d, ecr.a.f, cgx::b);
      a(bur.aj, bwb.d, ecr.a.f, cne::c);
      a(bur.aR, bwb.d, ecr.a.f, cnk::b);
      a(bur.aT, bwb.d, ecr.a.f, cly::b);
      a(bur.aU, bwb.d, ecr.a.f, chp::c);
      a(bur.aX, bwb.d, ecr.a.f, chr::c);
      a(bur.ba, bwb.d, ecr.a.f, cgx::b);
      a(bur.bd, bwb.d, ecr.a.f, cme::b);
      a(bur.be, bwb.d, ecr.a.f, clx::b);
      a(bur.bf, bwb.d, ecr.a.f, cjh::c);
      a(bur.bg, bwb.d, ecr.a.f, cmg::c);
      a(bur.bk, bwb.d, ecr.a.f, bvi::a);
      a(bur.bn, bwb.d, ecr.a.f, clx::b);
      a(bur.br, bwb.d, ecr.a.f, cmj::a);
      a(bur.bs, bwb.c, ecr.a.f, cmk::c);
      a(bur.bA, bwb.d, ecr.a.f, chy::c);
      a(bur.bC, bwb.d, ecr.a.f, bvi::a);
      a(bur.bH, bwb.d, ecr.a.f, clx::b);
      a(bur.bI, bwb.d, ecr.a.f, clx::b);
      a(bur.bJ, bwb.d, ecr.a.f, clx::b);
      a(bur.bL, bwb.d, ecr.a.f, cia::c);
      a(bur.bM, bwb.d, ecr.a.f, clx::c);
      a(bur.D, bwb.d, ecr.a.f, clx::b);
      a(bur.bN, bwb.d, ecr.a.f, clx::b);
      a(bur.bO, bwb.d, ecr.a.f, cjl::c);
      a(bur.bQ, bwb.d, ecr.a.f, cms::b);
      a(bur.bP, bwb.d, ecr.a.f, clx::b);
      a(bur.u, bwb.d, ecr.a.f, cgx::b);
      a(bur.M, bwb.b, ecr.a.f, clt::b);
      a(bur.S, bwb.a, ecr.a.f, clx::b);
      a(bur.aa, bwb.a, ecr.a.f, chh::c);
      a(bur.an, bwb.a, ecr.a.f, clx::b);
      a(bur.aN, bwb.a, ecr.a.f, cgx::b);
      a(bur.aP, bwb.a, ecr.a.f, bvi::a);
      a(bur.aY, bwb.d, ecr.a.f, clx::b);
      a(bur.bb, bwb.a, ecr.a.f, bvi::a);
      a(bur.bx, bwb.a, ecr.a.f, cgx::b);
      a(bur.bB, bwb.a, ecr.a.f, clx::b);
      a(bur.bD, bwb.a, ecr.a.f, clx::b);
      a(bur.bE, bwb.d, ecr.a.f, bvi::a);
      a(bur.bF, bwb.a, ecr.a.f, clx::b);
   }

   static record a(ecr.a a, bwa b, bwc.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends buk> {
      boolean test(bur<T> var1, dgy var2, buq var3, ji var4, azh var5);
   }
}
