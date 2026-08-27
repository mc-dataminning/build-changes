import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bls {
   private static final Map<bkm<?>, bls.a> a = Maps.newHashMap();

   private static <T extends bla> void a(bkm<T> $$0, bls.c $$1, dmf.a $$2, bls.b<T> $$3) {
      bls.a $$4 = a.put($$0, new bls.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jy.h.b($$0));
      }
   }

   public static bls.c a(bkm<?> $$0) {
      bls.a $$1 = a.get($$0);
      return $$1 == null ? bls.c.c : $$1.b;
   }

   public static dmf.a b(@Nullable bkm<?> $$0) {
      bls.a $$1 = a.get($$0);
      return $$1 == null ? dmf.a.f : $$1.a;
   }

   public static <T extends bki> boolean a(bkm<T> $$0, csh $$1, blc $$2, ht $$3, ato $$4) {
      bls.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bkm.f, bls.c.b, dmf.a.f, bxq::a);
      a(bkm.r, bls.c.b, dmf.a.f, bxl::c);
      a(bkm.v, bls.c.b, dmf.a.f, bxl::c);
      a(bkm.y, bls.c.b, dmf.a.f, cao::a);
      a(bkm.V, bls.c.b, dmf.a.f, caw::b);
      a(bkm.aB, bls.c.b, dmf.a.f, bxl::c);
      a(bkm.aE, bls.c.b, dmf.a.f, bxl::c);
      a(bkm.aT, bls.c.b, dmf.a.f, bxl::c);
      a(bkm.bc, bls.c.b, dmf.a.f, bxj::b);
      a(bkm.g, bls.c.a, dmf.a.f, bwe::b);
      a(bkm.i, bls.c.a, dmf.a.f, cba::c);
      a(bkm.n, bls.c.a, dmf.a.f, cba::b);
      a(bkm.q, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.t, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.u, bls.c.a, dmf.a.f, cba::b);
      a(bkm.w, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.E, bls.c.a, dmf.a.f, cba::b);
      a(bkm.F, bls.c.a, dmf.a.f, car::b);
      a(bkm.C, bls.c.a, dmf.a.f, bla::a);
      a(bkm.O, bls.c.a, dmf.a.f, bxy::c);
      a(bkm.Q, bls.c.a, dmf.a.f, cau::b);
      a(bkm.R, bls.c.a, dmf.a.f, cba::b);
      a(bkm.T, bls.c.b, dmf.a.f, bkq::a);
      a(bkm.U, bls.c.a, dmf.a.f, bye::c);
      a(bkm.Y, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.Z, bls.c.a, dmf.a.f, cax::a);
      a(bkm.ac, bls.c.a, dmf.a.f, bla::a);
      a(bkm.aj, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.al, bls.c.a, dmf.a.f, caz::b);
      a(bkm.ao, bls.c.a, dmf.a.f, bww::c);
      a(bkm.ap, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.aq, bls.c.a, dmf.a.e, bwx::c);
      a(bkm.at, bls.c.a, dmf.a.e, bwz::c);
      a(bkm.av, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.W, bls.c.a, dmf.a.f, cbw::c);
      a(bkm.aw, bls.c.a, dmf.a.f, ccc::b);
      a(bkm.ay, bls.c.a, dmf.a.f, cbb::b);
      a(bkm.az, bls.c.a, dmf.a.f, bxb::c);
      a(bkm.aC, bls.c.a, dmf.a.f, bxd::c);
      a(bkm.aF, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.aI, bls.c.a, dmf.a.f, cbh::b);
      a(bkm.aJ, bls.c.a, dmf.a.f, cba::b);
      a(bkm.aK, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.aL, bls.c.a, dmf.a.f, cbj::c);
      a(bkm.aO, bls.c.a, dmf.a.f, bla::a);
      a(bkm.aS, bls.c.a, dmf.a.f, cba::b);
      a(bkm.aU, bls.c.a, dmf.a.f, cbm::a);
      a(bkm.aV, bls.c.d, dmf.a.f, cbn::c);
      a(bkm.bd, bls.c.a, dmf.a.f, bxk::c);
      a(bkm.bf, bls.c.a, dmf.a.f, bla::a);
      a(bkm.bj, bls.c.a, dmf.a.f, cba::b);
      a(bkm.bk, bls.c.a, dmf.a.f, cba::b);
      a(bkm.bl, bls.c.a, dmf.a.f, cba::b);
      a(bkm.bn, bls.c.a, dmf.a.f, bxm::c);
      a(bkm.bp, bls.c.a, dmf.a.f, cba::b);
      a(bkm.bq, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.bs, bls.c.a, dmf.a.f, cbv::b);
      a(bkm.br, bls.c.a, dmf.a.f, cba::b);
      a(bkm.m, bls.c.a, dmf.a.f, bwj::b);
      a(bkm.A, bls.c.b, dmf.a.f, caw::b);
      a(bkm.G, bls.c.c, dmf.a.f, cba::b);
      a(bkm.N, bls.c.c, dmf.a.f, bwt::c);
      a(bkm.aa, bls.c.c, dmf.a.f, cba::b);
      a(bkm.as, bls.c.c, dmf.a.f, bwj::b);
      a(bkm.au, bls.c.c, dmf.a.f, bla::a);
      a(bkm.aD, bls.c.c, dmf.a.f, cba::b);
      a(bkm.aG, bls.c.c, dmf.a.f, bla::a);
      a(bkm.ba, bls.c.c, dmf.a.f, bwj::b);
      a(bkm.be, bls.c.c, dmf.a.f, cba::b);
      a(bkm.bg, bls.c.c, dmf.a.f, cba::b);
      a(bkm.bh, bls.c.c, dmf.a.f, bla::a);
      a(bkm.bi, bls.c.c, dmf.a.f, bla::a);
   }

   static class a {
      final dmf.a a;
      final bls.c b;
      final bls.b<?> c;

      public a(dmf.a $$0, bls.c $$1, bls.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bki> {
      boolean test(bkm<T> var1, csh var2, blc var3, ht var4, ato var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
