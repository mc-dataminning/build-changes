import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bpd {
   private static final Map<bnw<?>, bpd.a> a = Maps.newHashMap();

   private static <T extends bok> void a(bnw<T> $$0, bpb $$1, dqv.a $$2, bpd.b<T> $$3) {
      bpd.a $$4 = a.put($$0, new bpd.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kf.g.b($$0));
      }
   }

   public static bpb a(bnw<?> $$0) {
      bpd.a $$1 = a.get($$0);
      return $$1 == null ? bpc.a : $$1.b;
   }

   public static boolean a(bnw<?> $$0, cvu $$1, hz $$2) {
      return a($$0).isSpawnPositionOk($$1, $$2, $$0);
   }

   public static dqv.a b(@Nullable bnw<?> $$0) {
      bpd.a $$1 = a.get($$0);
      return $$1 == null ? dqv.a.f : $$1.a;
   }

   public static <T extends bnq> boolean a(bnw<T> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      bpd.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bnw.g, bpc.b, dqv.a.f, cbh::a);
      a(bnw.t, bpc.b, dqv.a.f, caz::c);
      a(bnw.x, bpc.b, dqv.a.f, caz::c);
      a(bnw.A, bpc.b, dqv.a.f, cef::a);
      a(bnw.X, bpc.b, dqv.a.f, cen::b);
      a(bnw.aD, bpc.b, dqv.a.f, caz::c);
      a(bnw.aG, bpc.b, dqv.a.f, caz::c);
      a(bnw.aV, bpc.b, dqv.a.f, caz::c);
      a(bnw.be, bpc.b, dqv.a.f, cax::b);
      a(bnw.d, bpc.d, dqv.a.f, cbe::c);
      a(bnw.h, bpc.d, dqv.a.f, bzs::b);
      a(bnw.j, bpc.d, dqv.a.f, cer::c);
      a(bnw.p, bpc.d, dqv.a.f, cer::b);
      a(bnw.s, bpc.d, dqv.a.f, bzx::b);
      a(bnw.v, bpc.d, dqv.a.f, bzx::b);
      a(bnw.w, bpc.d, dqv.a.f, cer::b);
      a(bnw.y, bpc.d, dqv.a.f, bzx::b);
      a(bnw.G, bpc.d, dqv.a.f, cer::b);
      a(bnw.H, bpc.d, dqv.a.f, cei::b);
      a(bnw.E, bpc.d, dqv.a.f, bok::a);
      a(bnw.Q, bpc.d, dqv.a.f, cbp::c);
      a(bnw.S, bpc.d, dqv.a.f, cel::b);
      a(bnw.T, bpc.d, dqv.a.f, cer::b);
      a(bnw.V, bpc.b, dqv.a.f, boa::a);
      a(bnw.W, bpc.d, dqv.a.f, cbv::c);
      a(bnw.aa, bpc.d, dqv.a.f, bzx::b);
      a(bnw.ab, bpc.d, dqv.a.f, ceo::a);
      a(bnw.ae, bpc.d, dqv.a.f, bok::a);
      a(bnw.al, bpc.d, dqv.a.f, bzx::b);
      a(bnw.an, bpc.d, dqv.a.f, ceq::b);
      a(bnw.aq, bpc.d, dqv.a.f, cak::c);
      a(bnw.ar, bpc.d, dqv.a.f, bzx::b);
      a(bnw.as, bpc.d, dqv.a.e, cal::c);
      a(bnw.av, bpc.d, dqv.a.e, can::c);
      a(bnw.ax, bpc.d, dqv.a.f, bzx::b);
      a(bnw.Y, bpc.d, dqv.a.f, cfv::c);
      a(bnw.ay, bpc.d, dqv.a.f, cgb::b);
      a(bnw.aA, bpc.d, dqv.a.f, ces::b);
      a(bnw.aB, bpc.d, dqv.a.f, cap::c);
      a(bnw.aE, bpc.d, dqv.a.f, car::c);
      a(bnw.aH, bpc.d, dqv.a.f, bzx::b);
      a(bnw.aK, bpc.d, dqv.a.f, cey::b);
      a(bnw.aL, bpc.d, dqv.a.f, cer::b);
      a(bnw.aM, bpc.d, dqv.a.f, ccf::c);
      a(bnw.aN, bpc.d, dqv.a.f, cfa::c);
      a(bnw.aQ, bpc.d, dqv.a.f, bok::a);
      a(bnw.aU, bpc.d, dqv.a.f, cer::b);
      a(bnw.aW, bpc.d, dqv.a.f, cfd::a);
      a(bnw.aX, bpc.c, dqv.a.f, cfe::c);
      a(bnw.bf, bpc.d, dqv.a.f, cay::c);
      a(bnw.bh, bpc.d, dqv.a.f, bok::a);
      a(bnw.bm, bpc.d, dqv.a.f, cer::b);
      a(bnw.bn, bpc.d, dqv.a.f, cer::b);
      a(bnw.bo, bpc.d, dqv.a.f, cer::b);
      a(bnw.bq, bpc.d, dqv.a.f, cba::c);
      a(bnw.bs, bpc.d, dqv.a.f, cer::b);
      a(bnw.bt, bpc.d, dqv.a.f, ccj::c);
      a(bnw.bv, bpc.d, dqv.a.f, cfm::b);
      a(bnw.bu, bpc.d, dqv.a.f, cer::b);
      a(bnw.o, bpc.d, dqv.a.f, bzx::b);
      a(bnw.C, bpc.b, dqv.a.f, cen::b);
      a(bnw.I, bpc.a, dqv.a.f, cer::b);
      a(bnw.P, bpc.a, dqv.a.f, cah::c);
      a(bnw.ac, bpc.a, dqv.a.f, cer::b);
      a(bnw.au, bpc.a, dqv.a.f, bzx::b);
      a(bnw.aw, bpc.a, dqv.a.f, bok::a);
      a(bnw.aF, bpc.d, dqv.a.f, cer::b);
      a(bnw.aI, bpc.a, dqv.a.f, bok::a);
      a(bnw.bc, bpc.a, dqv.a.f, bzx::b);
      a(bnw.bg, bpc.a, dqv.a.f, cer::b);
      a(bnw.bi, bpc.a, dqv.a.f, cer::b);
      a(bnw.bj, bpc.d, dqv.a.f, bok::a);
      a(bnw.bk, bpc.a, dqv.a.f, bok::a);
   }

   static record a(dqv.a a, bpb b, bpd.b<?> c) {
   }

   @FunctionalInterface
   public interface b<T extends bnq> {
      boolean test(bnw<T> var1, cwg var2, bom var3, hz var4, awp var5);
   }
}
