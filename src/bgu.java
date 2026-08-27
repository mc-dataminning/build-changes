import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bgu {
   private static final Map<bfn<?>, bgu.a> a = Maps.newHashMap();

   private static <T extends bgb> void a(bfn<T> $$0, bgu.c $$1, dhk.a $$2, bgu.b<T> $$3) {
      bgu.a $$4 = a.put($$0, new bgu.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jb.h.b($$0));
      }
   }

   public static bgu.c a(bfn<?> $$0) {
      bgu.a $$1 = a.get($$0);
      return $$1 == null ? bgu.c.c : $$1.b;
   }

   public static dhk.a b(@Nullable bfn<?> $$0) {
      bgu.a $$1 = a.get($$0);
      return $$1 == null ? dhk.a.f : $$1.a;
   }

   public static <T extends bfj> boolean a(bfn<T> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      bgu.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bfn.f, bgu.c.b, dhk.a.f, bss::a);
      a(bfn.r, bgu.c.b, dhk.a.f, bsn::c);
      a(bfn.v, bgu.c.b, dhk.a.f, bsn::c);
      a(bfn.y, bgu.c.b, dhk.a.f, bvq::a);
      a(bfn.V, bgu.c.b, dhk.a.f, bvy::b);
      a(bfn.aB, bgu.c.b, dhk.a.f, bsn::c);
      a(bfn.aE, bgu.c.b, dhk.a.f, bsn::c);
      a(bfn.aT, bgu.c.b, dhk.a.f, bsn::c);
      a(bfn.bc, bgu.c.b, dhk.a.f, bsl::b);
      a(bfn.g, bgu.c.a, dhk.a.f, brg::b);
      a(bfn.i, bgu.c.a, dhk.a.f, bwc::c);
      a(bfn.n, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.q, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.t, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.u, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.w, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.E, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.F, bgu.c.a, dhk.a.f, bvt::b);
      a(bfn.C, bgu.c.a, dhk.a.f, bgb::a);
      a(bfn.O, bgu.c.a, dhk.a.f, bta::c);
      a(bfn.Q, bgu.c.a, dhk.a.f, bvw::b);
      a(bfn.R, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.T, bgu.c.b, dhk.a.f, bfr::a);
      a(bfn.U, bgu.c.a, dhk.a.f, btg::c);
      a(bfn.Y, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.Z, bgu.c.a, dhk.a.f, bvz::a);
      a(bfn.ac, bgu.c.a, dhk.a.f, bgb::a);
      a(bfn.aj, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.al, bgu.c.a, dhk.a.f, bwb::b);
      a(bfn.ao, bgu.c.a, dhk.a.f, bry::c);
      a(bfn.ap, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.aq, bgu.c.a, dhk.a.e, brz::c);
      a(bfn.at, bgu.c.a, dhk.a.e, bsb::c);
      a(bfn.av, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.W, bgu.c.a, dhk.a.f, bwy::c);
      a(bfn.aw, bgu.c.a, dhk.a.f, bxe::b);
      a(bfn.ay, bgu.c.a, dhk.a.f, bwd::b);
      a(bfn.az, bgu.c.a, dhk.a.f, bsd::c);
      a(bfn.aC, bgu.c.a, dhk.a.f, bsf::c);
      a(bfn.aF, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.aI, bgu.c.a, dhk.a.f, bwj::b);
      a(bfn.aJ, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.aK, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.aL, bgu.c.a, dhk.a.f, bwl::c);
      a(bfn.aO, bgu.c.a, dhk.a.f, bgb::a);
      a(bfn.aS, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.aU, bgu.c.a, dhk.a.f, bwo::a);
      a(bfn.aV, bgu.c.d, dhk.a.f, bwp::c);
      a(bfn.bd, bgu.c.a, dhk.a.f, bsm::c);
      a(bfn.bf, bgu.c.a, dhk.a.f, bgb::a);
      a(bfn.bj, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.bk, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.bl, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.bn, bgu.c.a, dhk.a.f, bso::c);
      a(bfn.bp, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.bq, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.bs, bgu.c.a, dhk.a.f, bwx::b);
      a(bfn.br, bgu.c.a, dhk.a.f, bwc::b);
      a(bfn.m, bgu.c.a, dhk.a.f, brl::b);
      a(bfn.A, bgu.c.b, dhk.a.f, bvy::b);
      a(bfn.G, bgu.c.c, dhk.a.f, bwc::b);
      a(bfn.N, bgu.c.c, dhk.a.f, brv::c);
      a(bfn.aa, bgu.c.c, dhk.a.f, bwc::b);
      a(bfn.as, bgu.c.c, dhk.a.f, brl::b);
      a(bfn.au, bgu.c.c, dhk.a.f, bgb::a);
      a(bfn.aD, bgu.c.c, dhk.a.f, bwc::b);
      a(bfn.aG, bgu.c.c, dhk.a.f, bgb::a);
      a(bfn.ba, bgu.c.c, dhk.a.f, brl::b);
      a(bfn.be, bgu.c.c, dhk.a.f, bwc::b);
      a(bfn.bg, bgu.c.c, dhk.a.f, bwc::b);
      a(bfn.bh, bgu.c.c, dhk.a.f, bgb::a);
      a(bfn.bi, bgu.c.c, dhk.a.f, bgb::a);
   }

   static class a {
      final dhk.a a;
      final bgu.c b;
      final bgu.b<?> c;

      public a(dhk.a $$0, bgu.c $$1, bgu.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bfj> {
      boolean test(bfn<T> var1, cnb var2, bgd var3, gu var4, apf var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
