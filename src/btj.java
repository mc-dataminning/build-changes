import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class btj {
   private static final Map<bsb<?>, btj.a> a = Maps.newHashMap();

   private static <T extends bsq> void a(bsb<T> $$0, bth $$1, dyu.a $$2, btj.b<T> $$3) {
      btj.a $$4 = a.put($$0, new btj.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lh.g.b($$0));
      }
   }

   public static bth a(bsb<?> $$0) {
      btj.a $$1 = a.get($$0);
      return $$1 == null ? bti.a : $$1.b;
   }

   public static boolean a(bsb<?> $$0, dcd $$1, ir $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dyu.a b(@Nullable bsb<?> $$0) {
      btj.a $$1 = a.get($$0);
      return $$1 == null ? dyu.a.f : $$1.a;
   }

   public static <T extends brv> boolean a(bsb<T> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      btj.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bsb.g, bti.b, dyu.a.f, cfq::a);
      a(bsb.w, bti.b, dyu.a.f, cfg::c);
      a(bsb.A, bti.b, dyu.a.f, cfg::c);
      a(bsb.D, bti.b, dyu.a.f, ciq::a);
      a(bsb.aa, bti.b, dyu.a.f, ciy::b);
      a(bsb.aH, bti.b, dyu.a.f, cfg::c);
      a(bsb.aK, bti.b, dyu.a.f, cfg::c);
      a(bsb.ba, bti.b, dyu.a.f, cfg::c);
      a(bsb.bk, bti.b, dyu.a.f, cfe::b);
      a(bsb.c, bti.d, dyu.a.f, cfn::c);
      a(bsb.h, bti.d, dyu.a.f, cdy::b);
      a(bsb.i, bti.d, dyu.a.f, cdy::b);
      a(bsb.k, bti.d, dyu.a.f, cjd::c);
      a(bsb.n, bti.d, dyu.a.f, cjd::b);
      a(bsb.s, bti.d, dyu.a.f, cjd::b);
      a(bsb.v, bti.d, dyu.a.f, cee::b);
      a(bsb.y, bti.d, dyu.a.f, cee::b);
      a(bsb.z, bti.d, dyu.a.f, cjd::b);
      a(bsb.B, bti.d, dyu.a.f, cee::b);
      a(bsb.J, bti.d, dyu.a.f, cjd::b);
      a(bsb.K, bti.d, dyu.a.f, cit::b);
      a(bsb.H, bti.d, dyu.a.f, bsq::a);
      a(bsb.T, bti.d, dyu.a.f, cfy::c);
      a(bsb.V, bti.d, dyu.a.f, ciw::b);
      a(bsb.W, bti.d, dyu.a.f, cjd::b);
      a(bsb.Y, bti.b, dyu.a.f, bsg::a);
      a(bsb.Z, bti.d, dyu.a.f, cge::c);
      a(bsb.ad, bti.d, dyu.a.f, cee::b);
      a(bsb.ae, bti.d, dyu.a.f, ciz::a);
      a(bsb.ah, bti.d, dyu.a.f, bsq::a);
      a(bsb.ao, bti.d, dyu.a.f, cee::b);
      a(bsb.aq, bti.d, dyu.a.f, cjb::b);
      a(bsb.at, bti.d, dyu.a.f, cer::c);
      a(bsb.au, bti.d, dyu.a.f, cee::b);
      a(bsb.av, bti.d, dyu.a.e, ces::c);
      a(bsb.ay, bti.d, dyu.a.e, ceu::c);
      a(bsb.aA, bti.d, dyu.a.f, cee::b);
      a(bsb.ab, bti.d, dyu.a.f, cki::c);
      a(bsb.aB, bti.d, dyu.a.f, cko::b);
      a(bsb.aD, bti.d, dyu.a.f, cje::b);
      a(bsb.aF, bti.d, dyu.a.f, cew::c);
      a(bsb.bz, bti.d, dyu.a.f, cjd::b);
      a(bsb.aI, bti.d, dyu.a.f, cey::c);
      a(bsb.aL, bti.d, dyu.a.f, cee::b);
      a(bsb.aO, bti.d, dyu.a.f, cjl::b);
      a(bsb.aP, bti.d, dyu.a.f, cjd::b);
      a(bsb.aQ, bti.d, dyu.a.f, cgo::c);
      a(bsb.aR, bti.d, dyu.a.f, cjn::c);
      a(bsb.aS, bti.d, dyu.a.f, bsq::a);
      a(bsb.aV, bti.d, dyu.a.f, bsq::a);
      a(bsb.aZ, bti.d, dyu.a.f, cjd::b);
      a(bsb.bb, bti.d, dyu.a.f, cjq::a);
      a(bsb.bc, bti.c, dyu.a.f, cjr::c);
      a(bsb.bl, bti.d, dyu.a.f, cff::c);
      a(bsb.bn, bti.d, dyu.a.f, bsq::a);
      a(bsb.bs, bti.d, dyu.a.f, cju::a);
      a(bsb.bt, bti.d, dyu.a.f, cjd::b);
      a(bsb.bu, bti.d, dyu.a.f, cjd::b);
      a(bsb.bw, bti.d, dyu.a.f, cfh::c);
      a(bsb.by, bti.d, dyu.a.f, cjd::b);
      a(bsb.bA, bti.d, dyu.a.f, cgs::c);
      a(bsb.bC, bti.d, dyu.a.f, cjz::b);
      a(bsb.bB, bti.d, dyu.a.f, cjd::b);
      a(bsb.r, bti.d, dyu.a.f, cee::b);
      a(bsb.F, bti.b, dyu.a.f, ciy::b);
      a(bsb.bh, bti.d, dyu.a.f, bsq::a);
      a(bsb.aE, bti.d, dyu.a.f, bsq::a);
      a(bsb.L, bti.a, dyu.a.f, cjd::b);
      a(bsb.S, bti.a, dyu.a.f, ceo::c);
      a(bsb.af, bti.a, dyu.a.f, cjd::b);
      a(bsb.ax, bti.a, dyu.a.f, cee::b);
      a(bsb.az, bti.a, dyu.a.f, bsq::a);
      a(bsb.aJ, bti.d, dyu.a.f, cjd::b);
      a(bsb.aM, bti.a, dyu.a.f, bsq::a);
      a(bsb.bi, bti.a, dyu.a.f, cee::b);
      a(bsb.bm, bti.a, dyu.a.f, cjd::b);
      a(bsb.bo, bti.a, dyu.a.f, cjd::b);
      a(bsb.bp, bti.d, dyu.a.f, bsq::a);
      a(bsb.bq, bti.a, dyu.a.f, bsq::a);
   }

   static record a(dyu.a a, bth b, btj.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends brv> {
      boolean test(bsb<T> var1, dcp var2, bss var3, ir var4, ayt var5);
   }
}
