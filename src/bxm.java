import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bxm {
   private static final Map<bwb<?>, bxm.a> a = Maps.newHashMap();

   private static <T extends bwt> void a(bwb<T> $$0, bxk $$1, eel.a $$2, bxm.b<T> $$3) {
      bxm.a $$4 = a.put($$0, new bxm.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + md.f.b($$0));
      }
   }

   public static bxk a(bwb<?> $$0) {
      bxm.a $$1 = a.get($$0);
      return $$1 == null ? bxl.a : $$1.b;
   }

   public static boolean a(bwb<?> $$0, dhs $$1, jj $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static eel.a b(@Nullable bwb<?> $$0) {
      bxm.a $$1 = a.get($$0);
      return $$1 == null ? eel.a.f : $$1.a;
   }

   public static <T extends bvs> boolean a(bwb<T> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      bxm.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bwb.h, bxl.b, eel.a.f, cjv::a);
      a(bwb.A, bxl.b, eel.a.f, cjl::c);
      a(bwb.H, bxl.b, eel.a.f, cif::b);
      a(bwb.K, bxl.b, eel.a.f, cmx::a);
      a(bwb.ai, bxl.b, eel.a.f, cnf::b);
      a(bwb.aW, bxl.b, eel.a.f, cjl::c);
      a(bwb.aZ, bxl.b, eel.a.f, cjl::c);
      a(bwb.bq, bxl.b, eel.a.f, cif::b);
      a(bwb.bz, bxl.b, eel.a.f, cjj::b);
      a(bwb.e, bxl.d, eel.a.f, cjs::c);
      a(bwb.k, bxl.d, eel.a.f, cia::b);
      a(bwb.o, bxl.d, eel.a.f, cnj::c);
      a(bwb.q, bxl.d, eel.a.f, cnj::b);
      a(bwb.r, bxl.d, eel.a.f, cnj::c);
      a(bwb.v, bxl.d, eel.a.f, cnj::b);
      a(bwb.z, bxl.d, eel.a.f, cig::b);
      a(bwb.C, bxl.d, eel.a.f, cig::b);
      a(bwb.E, bxl.d, eel.a.f, cnj::b);
      a(bwb.I, bxl.d, eel.a.f, cig::b);
      a(bwb.N, bxl.d, eel.a.f, cnj::b);
      a(bwb.O, bxl.d, eel.a.f, cna::b);
      a(bwb.P, bxl.d, eel.a.f, bwt::a);
      a(bwb.ab, bxl.d, eel.a.f, ckd::c);
      a(bwb.ad, bxl.d, eel.a.f, cnd::b);
      a(bwb.ae, bxl.d, eel.a.f, cnj::b);
      a(bwb.ag, bxl.b, eel.a.f, bwi::a);
      a(bwb.ah, bxl.d, eel.a.f, ckj::c);
      a(bwb.al, bxl.d, eel.a.f, cig::b);
      a(bwb.am, bxl.d, eel.a.f, cng::a);
      a(bwb.ap, bxl.d, eel.a.f, bwt::a);
      a(bwb.ax, bxl.d, eel.a.f, cig::b);
      a(bwb.az, bxl.d, eel.a.f, cni::b);
      a(bwb.aE, bxl.d, eel.a.f, cit::c);
      a(bwb.aF, bxl.d, eel.a.f, cig::b);
      a(bwb.aI, bxl.d, eel.a.e, ciu::c);
      a(bwb.aO, bxl.d, eel.a.e, ciw::c);
      a(bwb.aQ, bxl.d, eel.a.f, cig::b);
      a(bwb.aj, bxl.d, eel.a.f, cor::c);
      a(bwb.aR, bxl.d, eel.a.f, cox::b);
      a(bwb.aT, bxl.d, eel.a.f, cnk::b);
      a(bwb.aU, bxl.d, eel.a.f, cja::c);
      a(bwb.aX, bxl.d, eel.a.f, cjc::c);
      a(bwb.ba, bxl.d, eel.a.f, cig::b);
      a(bwb.bd, bxl.d, eel.a.f, cnq::b);
      a(bwb.be, bxl.d, eel.a.f, cnj::b);
      a(bwb.bf, bxl.d, eel.a.f, ckt::c);
      a(bwb.bg, bxl.d, eel.a.f, cns::c);
      a(bwb.bk, bxl.d, eel.a.f, bwt::a);
      a(bwb.bn, bxl.d, eel.a.f, cnj::b);
      a(bwb.br, bxl.d, eel.a.f, cnv::a);
      a(bwb.bs, bxl.c, eel.a.f, cnw::c);
      a(bwb.bA, bxl.d, eel.a.f, cjk::c);
      a(bwb.bC, bxl.d, eel.a.f, bwt::a);
      a(bwb.bH, bxl.d, eel.a.f, cnj::b);
      a(bwb.bI, bxl.d, eel.a.f, cnj::b);
      a(bwb.bJ, bxl.d, eel.a.f, cnj::b);
      a(bwb.bL, bxl.d, eel.a.f, cjm::c);
      a(bwb.bM, bxl.d, eel.a.f, cnj::c);
      a(bwb.D, bxl.d, eel.a.f, cnj::b);
      a(bwb.bN, bxl.d, eel.a.f, cnj::b);
      a(bwb.bO, bxl.d, eel.a.f, ckx::c);
      a(bwb.bQ, bxl.d, eel.a.f, coe::b);
      a(bwb.bP, bxl.d, eel.a.f, cnj::b);
      a(bwb.u, bxl.d, eel.a.f, cig::b);
      a(bwb.M, bxl.b, eel.a.f, cnf::b);
      a(bwb.S, bxl.a, eel.a.f, cnj::b);
      a(bwb.aa, bxl.a, eel.a.f, ciq::c);
      a(bwb.an, bxl.a, eel.a.f, cnj::b);
      a(bwb.aN, bxl.a, eel.a.f, cig::b);
      a(bwb.aP, bxl.a, eel.a.f, bwt::a);
      a(bwb.aY, bxl.d, eel.a.f, cnj::b);
      a(bwb.bb, bxl.a, eel.a.f, bwt::a);
      a(bwb.bx, bxl.a, eel.a.f, cig::b);
      a(bwb.bB, bxl.a, eel.a.f, cnj::b);
      a(bwb.bD, bxl.a, eel.a.f, cnj::b);
      a(bwb.bE, bxl.d, eel.a.f, bwt::a);
      a(bwb.bF, bxl.a, eel.a.f, cnj::b);
   }

   static record a(eel.a a, bxk b, bxm.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bvs> {
      boolean test(bwb<T> var1, dig var2, bwa var3, jj var4, azs var5);
   }
}
