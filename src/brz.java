import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class brz {
   private static final Map<bqr<?>, brz.a> a = Maps.newHashMap();

   private static <T extends brg> void a(bqr<T> $$0, brx $$1, dvq.a $$2, brz.b<T> $$3) {
      brz.a $$4 = a.put($$0, new brz.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + lc.g.b($$0));
      }
   }

   public static brx a(bqr<?> $$0) {
      brz.a $$1 = a.get($$0);
      return $$1 == null ? bry.a : $$1.b;
   }

   public static boolean a(bqr<?> $$0, czx $$1, im $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dvq.a b(@Nullable bqr<?> $$0) {
      brz.a $$1 = a.get($$0);
      return $$1 == null ? dvq.a.f : $$1.a;
   }

   public static <T extends bql> boolean a(bqr<T> $$0, daj $$1, bri $$2, im $$3, ayd $$4) {
      brz.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bqr.f, bry.b, dvq.a.f, cef::a);
      a(bqr.u, bry.b, dvq.a.f, cdv::c);
      a(bqr.y, bry.b, dvq.a.f, cdv::c);
      a(bqr.B, bry.b, dvq.a.f, chf::a);
      a(bqr.Y, bry.b, dvq.a.f, chn::b);
      a(bqr.aE, bry.b, dvq.a.f, cdv::c);
      a(bqr.aH, bry.b, dvq.a.f, cdv::c);
      a(bqr.aW, bry.b, dvq.a.f, cdv::c);
      a(bqr.bf, bry.b, dvq.a.f, cdt::b);
      a(bqr.c, bry.d, dvq.a.f, cec::c);
      a(bqr.g, bry.d, dvq.a.f, cco::b);
      a(bqr.i, bry.d, dvq.a.f, chr::c);
      a(bqr.l, bry.d, dvq.a.f, chr::b);
      a(bqr.q, bry.d, dvq.a.f, chr::b);
      a(bqr.t, bry.d, dvq.a.f, cct::b);
      a(bqr.w, bry.d, dvq.a.f, cct::b);
      a(bqr.x, bry.d, dvq.a.f, chr::b);
      a(bqr.z, bry.d, dvq.a.f, cct::b);
      a(bqr.H, bry.d, dvq.a.f, chr::b);
      a(bqr.I, bry.d, dvq.a.f, chi::b);
      a(bqr.F, bry.d, dvq.a.f, brg::a);
      a(bqr.R, bry.d, dvq.a.f, cen::c);
      a(bqr.T, bry.d, dvq.a.f, chl::b);
      a(bqr.U, bry.d, dvq.a.f, chr::b);
      a(bqr.W, bry.b, dvq.a.f, bqw::a);
      a(bqr.X, bry.d, dvq.a.f, cet::c);
      a(bqr.ab, bry.d, dvq.a.f, cct::b);
      a(bqr.ac, bry.d, dvq.a.f, cho::a);
      a(bqr.af, bry.d, dvq.a.f, brg::a);
      a(bqr.am, bry.d, dvq.a.f, cct::b);
      a(bqr.ao, bry.d, dvq.a.f, chq::b);
      a(bqr.ar, bry.d, dvq.a.f, cdg::c);
      a(bqr.as, bry.d, dvq.a.f, cct::b);
      a(bqr.at, bry.d, dvq.a.e, cdh::c);
      a(bqr.aw, bry.d, dvq.a.e, cdj::c);
      a(bqr.ay, bry.d, dvq.a.f, cct::b);
      a(bqr.Z, bry.d, dvq.a.f, civ::c);
      a(bqr.az, bry.d, dvq.a.f, cjb::b);
      a(bqr.aB, bry.d, dvq.a.f, chs::b);
      a(bqr.aC, bry.d, dvq.a.f, cdl::c);
      a(bqr.aF, bry.d, dvq.a.f, cdn::c);
      a(bqr.aI, bry.d, dvq.a.f, cct::b);
      a(bqr.aL, bry.d, dvq.a.f, chy::b);
      a(bqr.aM, bry.d, dvq.a.f, chr::b);
      a(bqr.aN, bry.d, dvq.a.f, cfd::c);
      a(bqr.aO, bry.d, dvq.a.f, cia::c);
      a(bqr.aR, bry.d, dvq.a.f, brg::a);
      a(bqr.aV, bry.d, dvq.a.f, chr::b);
      a(bqr.aX, bry.d, dvq.a.f, cid::a);
      a(bqr.aY, bry.c, dvq.a.f, cie::c);
      a(bqr.bg, bry.d, dvq.a.f, cdu::c);
      a(bqr.bi, bry.d, dvq.a.f, brg::a);
      a(bqr.bn, bry.d, dvq.a.f, chr::b);
      a(bqr.bo, bry.d, dvq.a.f, chr::b);
      a(bqr.bp, bry.d, dvq.a.f, chr::b);
      a(bqr.br, bry.d, dvq.a.f, cdw::c);
      a(bqr.bt, bry.d, dvq.a.f, chr::b);
      a(bqr.bu, bry.d, dvq.a.f, cfh::c);
      a(bqr.bw, bry.d, dvq.a.f, cim::b);
      a(bqr.bv, bry.d, dvq.a.f, chr::b);
      a(bqr.p, bry.d, dvq.a.f, cct::b);
      a(bqr.D, bry.b, dvq.a.f, chn::b);
      a(bqr.J, bry.a, dvq.a.f, chr::b);
      a(bqr.Q, bry.a, dvq.a.f, cdd::c);
      a(bqr.ad, bry.a, dvq.a.f, chr::b);
      a(bqr.av, bry.a, dvq.a.f, cct::b);
      a(bqr.ax, bry.a, dvq.a.f, brg::a);
      a(bqr.aG, bry.d, dvq.a.f, chr::b);
      a(bqr.aJ, bry.a, dvq.a.f, brg::a);
      a(bqr.bd, bry.a, dvq.a.f, cct::b);
      a(bqr.bh, bry.a, dvq.a.f, chr::b);
      a(bqr.bj, bry.a, dvq.a.f, chr::b);
      a(bqr.bk, bry.d, dvq.a.f, brg::a);
      a(bqr.bl, bry.a, dvq.a.f, brg::a);
   }

   static record a(dvq.a a, brx b, brz.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bql> {
      boolean test(bqr<T> var1, daj var2, bri var3, im var4, ayd var5);
   }
}
