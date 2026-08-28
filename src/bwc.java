import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwc {
   private static final Map<bur<?>, bwc.a> a = Maps.newHashMap();

   private static <T extends bvi> void a(bur<T> $$0, bwa $$1, ecs.a $$2, bwc.b<T> $$3) {
      bwc.a $$4 = a.put($$0, new bwc.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bwa a(bur<?> $$0) {
      bwc.a $$1 = a.get($$0);
      return $$1 == null ? bwb.a : $$1.b;
   }

   public static boolean a(bur<?> $$0, dgl $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ecs.a b(@Nullable bur<?> $$0) {
      bwc.a $$1 = a.get($$0);
      return $$1 == null ? ecs.a.f : $$1.a;
   }

   public static <T extends buk> boolean a(bur<T> $$0, dgz $$1, buq $$2, ji $$3, azh $$4) {
      bwc.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bur.h, bwb.b, ecs.a.f, cij::a);
      a(bur.A, bwb.b, ecs.a.f, chz::c);
      a(bur.I, bwb.b, ecs.a.f, cgw::b);
      a(bur.L, bwb.b, ecs.a.f, cll::a);
      a(bur.aj, bwb.b, ecs.a.f, clt::b);
      a(bur.aX, bwb.b, ecs.a.f, chz::c);
      a(bur.ba, bwb.b, ecs.a.f, chz::c);
      a(bur.br, bwb.b, ecs.a.f, cgw::b);
      a(bur.bA, bwb.b, ecs.a.f, chx::b);
      a(bur.e, bwb.d, ecs.a.f, cig::c);
      a(bur.k, bwb.d, ecs.a.f, cgr::b);
      a(bur.o, bwb.d, ecs.a.f, clx::c);
      a(bur.q, bwb.d, ecs.a.f, clx::b);
      a(bur.r, bwb.d, ecs.a.f, clx::c);
      a(bur.v, bwb.d, ecs.a.f, clx::b);
      a(bur.z, bwb.d, ecs.a.f, cgx::b);
      a(bur.C, bwb.d, ecs.a.f, cgx::b);
      a(bur.F, bwb.d, ecs.a.f, clx::b);
      a(bur.J, bwb.d, ecs.a.f, cgx::b);
      a(bur.O, bwb.d, ecs.a.f, clx::b);
      a(bur.P, bwb.d, ecs.a.f, clo::b);
      a(bur.Q, bwb.d, ecs.a.f, bvi::a);
      a(bur.ac, bwb.d, ecs.a.f, cir::c);
      a(bur.ae, bwb.d, ecs.a.f, clr::b);
      a(bur.af, bwb.d, ecs.a.f, clx::b);
      a(bur.ah, bwb.b, ecs.a.f, buy::a);
      a(bur.ai, bwb.d, ecs.a.f, cix::c);
      a(bur.am, bwb.d, ecs.a.f, cgx::b);
      a(bur.an, bwb.d, ecs.a.f, clu::a);
      a(bur.aq, bwb.d, ecs.a.f, bvi::a);
      a(bur.ay, bwb.d, ecs.a.f, cgx::b);
      a(bur.aA, bwb.d, ecs.a.f, clw::b);
      a(bur.aF, bwb.d, ecs.a.f, chk::c);
      a(bur.aG, bwb.d, ecs.a.f, cgx::b);
      a(bur.aJ, bwb.d, ecs.a.e, chl::c);
      a(bur.aP, bwb.d, ecs.a.e, chn::c);
      a(bur.aR, bwb.d, ecs.a.f, cgx::b);
      a(bur.ak, bwb.d, ecs.a.f, cnf::c);
      a(bur.aS, bwb.d, ecs.a.f, cnl::b);
      a(bur.aU, bwb.d, ecs.a.f, cly::b);
      a(bur.aV, bwb.d, ecs.a.f, chp::c);
      a(bur.aY, bwb.d, ecs.a.f, chr::c);
      a(bur.bb, bwb.d, ecs.a.f, cgx::b);
      a(bur.be, bwb.d, ecs.a.f, cme::b);
      a(bur.bf, bwb.d, ecs.a.f, clx::b);
      a(bur.bg, bwb.d, ecs.a.f, cjh::c);
      a(bur.bh, bwb.d, ecs.a.f, cmg::c);
      a(bur.bl, bwb.d, ecs.a.f, bvi::a);
      a(bur.bo, bwb.d, ecs.a.f, clx::b);
      a(bur.bs, bwb.d, ecs.a.f, cmj::a);
      a(bur.bt, bwb.c, ecs.a.f, cmk::c);
      a(bur.bB, bwb.d, ecs.a.f, chy::c);
      a(bur.bD, bwb.d, ecs.a.f, bvi::a);
      a(bur.bI, bwb.d, ecs.a.f, clx::b);
      a(bur.bJ, bwb.d, ecs.a.f, clx::b);
      a(bur.bK, bwb.d, ecs.a.f, clx::b);
      a(bur.bM, bwb.d, ecs.a.f, cia::c);
      a(bur.bN, bwb.d, ecs.a.f, clx::c);
      a(bur.D, bwb.d, ecs.a.f, clx::b);
      a(bur.E, bwb.d, ecs.a.f, clx::b);
      a(bur.bO, bwb.d, ecs.a.f, clx::b);
      a(bur.bP, bwb.d, ecs.a.f, cjl::c);
      a(bur.bR, bwb.d, ecs.a.f, cms::b);
      a(bur.bQ, bwb.d, ecs.a.f, clx::b);
      a(bur.u, bwb.d, ecs.a.f, cgx::b);
      a(bur.N, bwb.b, ecs.a.f, clt::b);
      a(bur.T, bwb.a, ecs.a.f, clx::b);
      a(bur.ab, bwb.a, ecs.a.f, chh::c);
      a(bur.ao, bwb.a, ecs.a.f, clx::b);
      a(bur.aO, bwb.a, ecs.a.f, cgx::b);
      a(bur.aQ, bwb.a, ecs.a.f, bvi::a);
      a(bur.aZ, bwb.d, ecs.a.f, clx::b);
      a(bur.bc, bwb.a, ecs.a.f, bvi::a);
      a(bur.by, bwb.a, ecs.a.f, cgx::b);
      a(bur.bC, bwb.a, ecs.a.f, clx::b);
      a(bur.bE, bwb.a, ecs.a.f, clx::b);
      a(bur.bF, bwb.d, ecs.a.f, bvi::a);
      a(bur.bG, bwb.a, ecs.a.f, clx::b);
   }

   static record a(ecs.a a, bwa b, bwc.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends buk> {
      boolean test(bur<T> var1, dgz var2, buq var3, ji var4, azh var5);
   }
}
