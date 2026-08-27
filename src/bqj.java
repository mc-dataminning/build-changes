import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bqj {
   private static final Map<bpc<?>, bqj.a> a = Maps.newHashMap();

   private static <T extends bpq> void a(bpc<T> $$0, bqh $$1, dsm.a $$2, bqj.b<T> $$3) {
      bqj.a $$4 = a.put($$0, new bqj.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + ki.g.b($$0));
      }
   }

   public static bqh a(bpc<?> $$0) {
      bqj.a $$1 = a.get($$0);
      return $$1 == null ? bqi.a : $$1.b;
   }

   public static boolean a(bpc<?> $$0, cxc $$1, ib $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dsm.a b(@Nullable bpc<?> $$0) {
      bqj.a $$1 = a.get($$0);
      return $$1 == null ? dsm.a.f : $$1.a;
   }

   public static <T extends bow> boolean a(bpc<T> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      bqj.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bpc.g, bqi.b, dsm.a.f, ccn::a);
      a(bpc.u, bqi.b, dsm.a.f, ccf::c);
      a(bpc.y, bqi.b, dsm.a.f, ccf::c);
      a(bpc.B, bqi.b, dsm.a.f, cfm::a);
      a(bpc.Y, bqi.b, dsm.a.f, cfu::b);
      a(bpc.aE, bqi.b, dsm.a.f, ccf::c);
      a(bpc.aH, bqi.b, dsm.a.f, ccf::c);
      a(bpc.aW, bqi.b, dsm.a.f, ccf::c);
      a(bpc.bf, bqi.b, dsm.a.f, ccd::b);
      a(bpc.d, bqi.d, dsm.a.f, cck::c);
      a(bpc.h, bqi.d, dsm.a.f, cay::b);
      a(bpc.j, bqi.d, dsm.a.f, cfy::c);
      a(bpc.q, bqi.d, dsm.a.f, cfy::b);
      a(bpc.t, bqi.d, dsm.a.f, cbd::b);
      a(bpc.w, bqi.d, dsm.a.f, cbd::b);
      a(bpc.x, bqi.d, dsm.a.f, cfy::b);
      a(bpc.z, bqi.d, dsm.a.f, cbd::b);
      a(bpc.H, bqi.d, dsm.a.f, cfy::b);
      a(bpc.I, bqi.d, dsm.a.f, cfp::b);
      a(bpc.F, bqi.d, dsm.a.f, bpq::a);
      a(bpc.R, bqi.d, dsm.a.f, ccv::c);
      a(bpc.T, bqi.d, dsm.a.f, cfs::b);
      a(bpc.U, bqi.d, dsm.a.f, cfy::b);
      a(bpc.W, bqi.b, dsm.a.f, bpg::a);
      a(bpc.X, bqi.d, dsm.a.f, cdb::c);
      a(bpc.ab, bqi.d, dsm.a.f, cbd::b);
      a(bpc.ac, bqi.d, dsm.a.f, cfv::a);
      a(bpc.af, bqi.d, dsm.a.f, bpq::a);
      a(bpc.am, bqi.d, dsm.a.f, cbd::b);
      a(bpc.ao, bqi.d, dsm.a.f, cfx::b);
      a(bpc.ar, bqi.d, dsm.a.f, cbq::c);
      a(bpc.as, bqi.d, dsm.a.f, cbd::b);
      a(bpc.at, bqi.d, dsm.a.e, cbr::c);
      a(bpc.aw, bqi.d, dsm.a.e, cbt::c);
      a(bpc.ay, bqi.d, dsm.a.f, cbd::b);
      a(bpc.Z, bqi.d, dsm.a.f, chc::c);
      a(bpc.az, bqi.d, dsm.a.f, chi::b);
      a(bpc.aB, bqi.d, dsm.a.f, cfz::b);
      a(bpc.aC, bqi.d, dsm.a.f, cbv::c);
      a(bpc.aF, bqi.d, dsm.a.f, cbx::c);
      a(bpc.aI, bqi.d, dsm.a.f, cbd::b);
      a(bpc.aL, bqi.d, dsm.a.f, cgf::b);
      a(bpc.aM, bqi.d, dsm.a.f, cfy::b);
      a(bpc.aN, bqi.d, dsm.a.f, cdl::c);
      a(bpc.aO, bqi.d, dsm.a.f, cgh::c);
      a(bpc.aR, bqi.d, dsm.a.f, bpq::a);
      a(bpc.aV, bqi.d, dsm.a.f, cfy::b);
      a(bpc.aX, bqi.d, dsm.a.f, cgk::a);
      a(bpc.aY, bqi.c, dsm.a.f, cgl::c);
      a(bpc.bg, bqi.d, dsm.a.f, cce::c);
      a(bpc.bi, bqi.d, dsm.a.f, bpq::a);
      a(bpc.bn, bqi.d, dsm.a.f, cfy::b);
      a(bpc.bo, bqi.d, dsm.a.f, cfy::b);
      a(bpc.bp, bqi.d, dsm.a.f, cfy::b);
      a(bpc.br, bqi.d, dsm.a.f, ccg::c);
      a(bpc.bt, bqi.d, dsm.a.f, cfy::b);
      a(bpc.bu, bqi.d, dsm.a.f, cdp::c);
      a(bpc.bw, bqi.d, dsm.a.f, cgt::b);
      a(bpc.bv, bqi.d, dsm.a.f, cfy::b);
      a(bpc.p, bqi.d, dsm.a.f, cbd::b);
      a(bpc.D, bqi.b, dsm.a.f, cfu::b);
      a(bpc.J, bqi.a, dsm.a.f, cfy::b);
      a(bpc.Q, bqi.a, dsm.a.f, cbn::c);
      a(bpc.ad, bqi.a, dsm.a.f, cfy::b);
      a(bpc.av, bqi.a, dsm.a.f, cbd::b);
      a(bpc.ax, bqi.a, dsm.a.f, bpq::a);
      a(bpc.aG, bqi.d, dsm.a.f, cfy::b);
      a(bpc.aJ, bqi.a, dsm.a.f, bpq::a);
      a(bpc.bd, bqi.a, dsm.a.f, cbd::b);
      a(bpc.bh, bqi.a, dsm.a.f, cfy::b);
      a(bpc.bj, bqi.a, dsm.a.f, cfy::b);
      a(bpc.bk, bqi.d, dsm.a.f, bpq::a);
      a(bpc.bl, bqi.a, dsm.a.f, bpq::a);
   }

   static record a(dsm.a a, bqh b, bqj.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bow> {
      boolean test(bpc<T> var1, cxo var2, bps var3, ib var4, axd var5);
   }
}
