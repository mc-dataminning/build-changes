import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bwb {
   private static final Map<buq<?>, bwb.a> a = Maps.newHashMap();

   private static <T extends bvh> void a(buq<T> $$0, bvz $$1, ecq.a $$2, bwb.b<T> $$3) {
      bwb.a $$4 = a.put($$0, new bwb.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + mb.f.b($$0));
      }
   }

   public static bvz a(buq<?> $$0) {
      bwb.a $$1 = a.get($$0);
      return $$1 == null ? bwa.a : $$1.b;
   }

   public static boolean a(buq<?> $$0, dgj $$1, ji $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static ecq.a b(@Nullable buq<?> $$0) {
      bwb.a $$1 = a.get($$0);
      return $$1 == null ? ecq.a.f : $$1.a;
   }

   public static <T extends buj> boolean a(buq<T> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      bwb.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(buq.h, bwa.b, ecq.a.f, cii::a);
      a(buq.A, bwa.b, ecq.a.f, chy::c);
      a(buq.H, bwa.b, ecq.a.f, cgv::b);
      a(buq.K, bwa.b, ecq.a.f, clk::a);
      a(buq.ai, bwa.b, ecq.a.f, cls::b);
      a(buq.aW, bwa.b, ecq.a.f, chy::c);
      a(buq.aZ, bwa.b, ecq.a.f, chy::c);
      a(buq.bq, bwa.b, ecq.a.f, cgv::b);
      a(buq.bz, bwa.b, ecq.a.f, chw::b);
      a(buq.e, bwa.d, ecq.a.f, cif::c);
      a(buq.k, bwa.d, ecq.a.f, cgq::b);
      a(buq.o, bwa.d, ecq.a.f, clw::c);
      a(buq.q, bwa.d, ecq.a.f, clw::b);
      a(buq.r, bwa.d, ecq.a.f, clw::c);
      a(buq.v, bwa.d, ecq.a.f, clw::b);
      a(buq.z, bwa.d, ecq.a.f, cgw::b);
      a(buq.C, bwa.d, ecq.a.f, cgw::b);
      a(buq.E, bwa.d, ecq.a.f, clw::b);
      a(buq.I, bwa.d, ecq.a.f, cgw::b);
      a(buq.N, bwa.d, ecq.a.f, clw::b);
      a(buq.O, bwa.d, ecq.a.f, cln::b);
      a(buq.P, bwa.d, ecq.a.f, bvh::a);
      a(buq.ab, bwa.d, ecq.a.f, ciq::c);
      a(buq.ad, bwa.d, ecq.a.f, clq::b);
      a(buq.ae, bwa.d, ecq.a.f, clw::b);
      a(buq.ag, bwa.b, ecq.a.f, bux::a);
      a(buq.ah, bwa.d, ecq.a.f, ciw::c);
      a(buq.al, bwa.d, ecq.a.f, cgw::b);
      a(buq.am, bwa.d, ecq.a.f, clt::a);
      a(buq.ap, bwa.d, ecq.a.f, bvh::a);
      a(buq.ax, bwa.d, ecq.a.f, cgw::b);
      a(buq.az, bwa.d, ecq.a.f, clv::b);
      a(buq.aE, bwa.d, ecq.a.f, chj::c);
      a(buq.aF, bwa.d, ecq.a.f, cgw::b);
      a(buq.aI, bwa.d, ecq.a.e, chk::c);
      a(buq.aO, bwa.d, ecq.a.e, chm::c);
      a(buq.aQ, bwa.d, ecq.a.f, cgw::b);
      a(buq.aj, bwa.d, ecq.a.f, cnd::c);
      a(buq.aR, bwa.d, ecq.a.f, cnj::b);
      a(buq.aT, bwa.d, ecq.a.f, clx::b);
      a(buq.aU, bwa.d, ecq.a.f, cho::c);
      a(buq.aX, bwa.d, ecq.a.f, chq::c);
      a(buq.ba, bwa.d, ecq.a.f, cgw::b);
      a(buq.bd, bwa.d, ecq.a.f, cmd::b);
      a(buq.be, bwa.d, ecq.a.f, clw::b);
      a(buq.bf, bwa.d, ecq.a.f, cjg::c);
      a(buq.bg, bwa.d, ecq.a.f, cmf::c);
      a(buq.bk, bwa.d, ecq.a.f, bvh::a);
      a(buq.bn, bwa.d, ecq.a.f, clw::b);
      a(buq.br, bwa.d, ecq.a.f, cmi::a);
      a(buq.bs, bwa.c, ecq.a.f, cmj::c);
      a(buq.bA, bwa.d, ecq.a.f, chx::c);
      a(buq.bC, bwa.d, ecq.a.f, bvh::a);
      a(buq.bH, bwa.d, ecq.a.f, clw::b);
      a(buq.bI, bwa.d, ecq.a.f, clw::b);
      a(buq.bJ, bwa.d, ecq.a.f, clw::b);
      a(buq.bL, bwa.d, ecq.a.f, chz::c);
      a(buq.bM, bwa.d, ecq.a.f, clw::c);
      a(buq.D, bwa.d, ecq.a.f, clw::b);
      a(buq.bN, bwa.d, ecq.a.f, clw::b);
      a(buq.bO, bwa.d, ecq.a.f, cjk::c);
      a(buq.bQ, bwa.d, ecq.a.f, cmr::b);
      a(buq.bP, bwa.d, ecq.a.f, clw::b);
      a(buq.u, bwa.d, ecq.a.f, cgw::b);
      a(buq.M, bwa.b, ecq.a.f, cls::b);
      a(buq.S, bwa.a, ecq.a.f, clw::b);
      a(buq.aa, bwa.a, ecq.a.f, chg::c);
      a(buq.an, bwa.a, ecq.a.f, clw::b);
      a(buq.aN, bwa.a, ecq.a.f, cgw::b);
      a(buq.aP, bwa.a, ecq.a.f, bvh::a);
      a(buq.aY, bwa.d, ecq.a.f, clw::b);
      a(buq.bb, bwa.a, ecq.a.f, bvh::a);
      a(buq.bx, bwa.a, ecq.a.f, cgw::b);
      a(buq.bB, bwa.a, ecq.a.f, clw::b);
      a(buq.bD, bwa.a, ecq.a.f, clw::b);
      a(buq.bE, bwa.d, ecq.a.f, bvh::a);
      a(buq.bF, bwa.a, ecq.a.f, clw::b);
   }

   static record a(ecq.a a, bvz b, bwb.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends buj> {
      boolean test(buq<T> var1, dgx var2, bup var3, ji var4, azg var5);
   }
}
