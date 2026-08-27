import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bps {
   private static final Map<bol<?>, bps.a> a = Maps.newHashMap();

   private static <T extends boz> void a(bol<T> $$0, bpq $$1, drq.a $$2, bps.b<T> $$3) {
      bps.a $$4 = a.put($$0, new bps.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kh.g.b($$0));
      }
   }

   public static bpq a(bol<?> $$0) {
      bps.a $$1 = a.get($$0);
      return $$1 == null ? bpr.a : $$1.b;
   }

   public static boolean a(bol<?> $$0, cwh $$1, ib $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static drq.a b(@Nullable bol<?> $$0) {
      bps.a $$1 = a.get($$0);
      return $$1 == null ? drq.a.f : $$1.a;
   }

   public static <T extends bof> boolean a(bol<T> $$0, cwt $$1, bpb $$2, ib $$3, awt $$4) {
      bps.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bol.g, bpr.b, drq.a.f, cbw::a);
      a(bol.t, bpr.b, drq.a.f, cbo::c);
      a(bol.x, bpr.b, drq.a.f, cbo::c);
      a(bol.A, bpr.b, drq.a.f, ceu::a);
      a(bol.X, bpr.b, drq.a.f, cfc::b);
      a(bol.aD, bpr.b, drq.a.f, cbo::c);
      a(bol.aG, bpr.b, drq.a.f, cbo::c);
      a(bol.aV, bpr.b, drq.a.f, cbo::c);
      a(bol.be, bpr.b, drq.a.f, cbm::b);
      a(bol.d, bpr.d, drq.a.f, cbt::c);
      a(bol.h, bpr.d, drq.a.f, cah::b);
      a(bol.j, bpr.d, drq.a.f, cfg::c);
      a(bol.p, bpr.d, drq.a.f, cfg::b);
      a(bol.s, bpr.d, drq.a.f, cam::b);
      a(bol.v, bpr.d, drq.a.f, cam::b);
      a(bol.w, bpr.d, drq.a.f, cfg::b);
      a(bol.y, bpr.d, drq.a.f, cam::b);
      a(bol.G, bpr.d, drq.a.f, cfg::b);
      a(bol.H, bpr.d, drq.a.f, cex::b);
      a(bol.E, bpr.d, drq.a.f, boz::a);
      a(bol.Q, bpr.d, drq.a.f, cce::c);
      a(bol.S, bpr.d, drq.a.f, cfa::b);
      a(bol.T, bpr.d, drq.a.f, cfg::b);
      a(bol.V, bpr.b, drq.a.f, bop::a);
      a(bol.W, bpr.d, drq.a.f, cck::c);
      a(bol.aa, bpr.d, drq.a.f, cam::b);
      a(bol.ab, bpr.d, drq.a.f, cfd::a);
      a(bol.ae, bpr.d, drq.a.f, boz::a);
      a(bol.al, bpr.d, drq.a.f, cam::b);
      a(bol.an, bpr.d, drq.a.f, cff::b);
      a(bol.aq, bpr.d, drq.a.f, caz::c);
      a(bol.ar, bpr.d, drq.a.f, cam::b);
      a(bol.as, bpr.d, drq.a.e, cba::c);
      a(bol.av, bpr.d, drq.a.e, cbc::c);
      a(bol.ax, bpr.d, drq.a.f, cam::b);
      a(bol.Y, bpr.d, drq.a.f, cgk::c);
      a(bol.ay, bpr.d, drq.a.f, cgq::b);
      a(bol.aA, bpr.d, drq.a.f, cfh::b);
      a(bol.aB, bpr.d, drq.a.f, cbe::c);
      a(bol.aE, bpr.d, drq.a.f, cbg::c);
      a(bol.aH, bpr.d, drq.a.f, cam::b);
      a(bol.aK, bpr.d, drq.a.f, cfn::b);
      a(bol.aL, bpr.d, drq.a.f, cfg::b);
      a(bol.aM, bpr.d, drq.a.f, ccu::c);
      a(bol.aN, bpr.d, drq.a.f, cfp::c);
      a(bol.aQ, bpr.d, drq.a.f, boz::a);
      a(bol.aU, bpr.d, drq.a.f, cfg::b);
      a(bol.aW, bpr.d, drq.a.f, cfs::a);
      a(bol.aX, bpr.c, drq.a.f, cft::c);
      a(bol.bf, bpr.d, drq.a.f, cbn::c);
      a(bol.bh, bpr.d, drq.a.f, boz::a);
      a(bol.bm, bpr.d, drq.a.f, cfg::b);
      a(bol.bn, bpr.d, drq.a.f, cfg::b);
      a(bol.bo, bpr.d, drq.a.f, cfg::b);
      a(bol.bq, bpr.d, drq.a.f, cbp::c);
      a(bol.bs, bpr.d, drq.a.f, cfg::b);
      a(bol.bt, bpr.d, drq.a.f, ccy::c);
      a(bol.bv, bpr.d, drq.a.f, cgb::b);
      a(bol.bu, bpr.d, drq.a.f, cfg::b);
      a(bol.o, bpr.d, drq.a.f, cam::b);
      a(bol.C, bpr.b, drq.a.f, cfc::b);
      a(bol.I, bpr.a, drq.a.f, cfg::b);
      a(bol.P, bpr.a, drq.a.f, caw::c);
      a(bol.ac, bpr.a, drq.a.f, cfg::b);
      a(bol.au, bpr.a, drq.a.f, cam::b);
      a(bol.aw, bpr.a, drq.a.f, boz::a);
      a(bol.aF, bpr.d, drq.a.f, cfg::b);
      a(bol.aI, bpr.a, drq.a.f, boz::a);
      a(bol.bc, bpr.a, drq.a.f, cam::b);
      a(bol.bg, bpr.a, drq.a.f, cfg::b);
      a(bol.bi, bpr.a, drq.a.f, cfg::b);
      a(bol.bj, bpr.d, drq.a.f, boz::a);
      a(bol.bk, bpr.a, drq.a.f, boz::a);
   }

   static record a(drq.a a, bpq b, bps.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bof> {
      boolean test(bol<T> var1, cwt var2, bpb var3, ib var4, awt var5);
   }
}
