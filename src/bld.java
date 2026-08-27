import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bld {
   private static final Map<bjx<?>, bld.a> a = Maps.newHashMap();

   private static <T extends bkl> void a(bjx<T> $$0, bld.c $$1, dlk.a $$2, bld.b<T> $$3) {
      bld.a $$4 = a.put($$0, new bld.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jy.h.b($$0));
      }
   }

   public static bld.c a(bjx<?> $$0) {
      bld.a $$1 = a.get($$0);
      return $$1 == null ? bld.c.c : $$1.b;
   }

   public static dlk.a b(@Nullable bjx<?> $$0) {
      bld.a $$1 = a.get($$0);
      return $$1 == null ? dlk.a.f : $$1.a;
   }

   public static <T extends bjt> boolean a(bjx<T> $$0, cro $$1, bkn $$2, ht $$3, ate $$4) {
      bld.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bjx.f, bld.c.b, dlk.a.f, bxb::a);
      a(bjx.r, bld.c.b, dlk.a.f, bww::c);
      a(bjx.v, bld.c.b, dlk.a.f, bww::c);
      a(bjx.y, bld.c.b, dlk.a.f, bzz::a);
      a(bjx.V, bld.c.b, dlk.a.f, cah::b);
      a(bjx.aB, bld.c.b, dlk.a.f, bww::c);
      a(bjx.aE, bld.c.b, dlk.a.f, bww::c);
      a(bjx.aT, bld.c.b, dlk.a.f, bww::c);
      a(bjx.bc, bld.c.b, dlk.a.f, bwu::b);
      a(bjx.g, bld.c.a, dlk.a.f, bvp::b);
      a(bjx.i, bld.c.a, dlk.a.f, cal::c);
      a(bjx.n, bld.c.a, dlk.a.f, cal::b);
      a(bjx.q, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.t, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.u, bld.c.a, dlk.a.f, cal::b);
      a(bjx.w, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.E, bld.c.a, dlk.a.f, cal::b);
      a(bjx.F, bld.c.a, dlk.a.f, cac::b);
      a(bjx.C, bld.c.a, dlk.a.f, bkl::a);
      a(bjx.O, bld.c.a, dlk.a.f, bxj::c);
      a(bjx.Q, bld.c.a, dlk.a.f, caf::b);
      a(bjx.R, bld.c.a, dlk.a.f, cal::b);
      a(bjx.T, bld.c.b, dlk.a.f, bkb::a);
      a(bjx.U, bld.c.a, dlk.a.f, bxp::c);
      a(bjx.Y, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.Z, bld.c.a, dlk.a.f, cai::a);
      a(bjx.ac, bld.c.a, dlk.a.f, bkl::a);
      a(bjx.aj, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.al, bld.c.a, dlk.a.f, cak::b);
      a(bjx.ao, bld.c.a, dlk.a.f, bwh::c);
      a(bjx.ap, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.aq, bld.c.a, dlk.a.e, bwi::c);
      a(bjx.at, bld.c.a, dlk.a.e, bwk::c);
      a(bjx.av, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.W, bld.c.a, dlk.a.f, cbh::c);
      a(bjx.aw, bld.c.a, dlk.a.f, cbn::b);
      a(bjx.ay, bld.c.a, dlk.a.f, cam::b);
      a(bjx.az, bld.c.a, dlk.a.f, bwm::c);
      a(bjx.aC, bld.c.a, dlk.a.f, bwo::c);
      a(bjx.aF, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.aI, bld.c.a, dlk.a.f, cas::b);
      a(bjx.aJ, bld.c.a, dlk.a.f, cal::b);
      a(bjx.aK, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.aL, bld.c.a, dlk.a.f, cau::c);
      a(bjx.aO, bld.c.a, dlk.a.f, bkl::a);
      a(bjx.aS, bld.c.a, dlk.a.f, cal::b);
      a(bjx.aU, bld.c.a, dlk.a.f, cax::a);
      a(bjx.aV, bld.c.d, dlk.a.f, cay::c);
      a(bjx.bd, bld.c.a, dlk.a.f, bwv::c);
      a(bjx.bf, bld.c.a, dlk.a.f, bkl::a);
      a(bjx.bj, bld.c.a, dlk.a.f, cal::b);
      a(bjx.bk, bld.c.a, dlk.a.f, cal::b);
      a(bjx.bl, bld.c.a, dlk.a.f, cal::b);
      a(bjx.bn, bld.c.a, dlk.a.f, bwx::c);
      a(bjx.bp, bld.c.a, dlk.a.f, cal::b);
      a(bjx.bq, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.bs, bld.c.a, dlk.a.f, cbg::b);
      a(bjx.br, bld.c.a, dlk.a.f, cal::b);
      a(bjx.m, bld.c.a, dlk.a.f, bvu::b);
      a(bjx.A, bld.c.b, dlk.a.f, cah::b);
      a(bjx.G, bld.c.c, dlk.a.f, cal::b);
      a(bjx.N, bld.c.c, dlk.a.f, bwe::c);
      a(bjx.aa, bld.c.c, dlk.a.f, cal::b);
      a(bjx.as, bld.c.c, dlk.a.f, bvu::b);
      a(bjx.au, bld.c.c, dlk.a.f, bkl::a);
      a(bjx.aD, bld.c.c, dlk.a.f, cal::b);
      a(bjx.aG, bld.c.c, dlk.a.f, bkl::a);
      a(bjx.ba, bld.c.c, dlk.a.f, bvu::b);
      a(bjx.be, bld.c.c, dlk.a.f, cal::b);
      a(bjx.bg, bld.c.c, dlk.a.f, cal::b);
      a(bjx.bh, bld.c.c, dlk.a.f, bkl::a);
      a(bjx.bi, bld.c.c, dlk.a.f, bkl::a);
   }

   static class a {
      final dlk.a a;
      final bld.c b;
      final bld.b<?> c;

      public a(dlk.a $$0, bld.c $$1, bld.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bjt> {
      boolean test(bjx<T> var1, cro var2, bkn var3, ht var4, ate var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
