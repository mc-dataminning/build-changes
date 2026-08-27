import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bmf {
   private static final Map<bkz<?>, bmf.a> a = Maps.newHashMap();

   private static <T extends bln> void a(bkz<T> $$0, bmf.c $$1, dmw.a $$2, bmf.b<T> $$3) {
      bmf.a $$4 = a.put($$0, new bmf.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kc.h.b($$0));
      }
   }

   public static bmf.c a(bkz<?> $$0) {
      bmf.a $$1 = a.get($$0);
      return $$1 == null ? bmf.c.c : $$1.b;
   }

   public static dmw.a b(@Nullable bkz<?> $$0) {
      bmf.a $$1 = a.get($$0);
      return $$1 == null ? dmw.a.f : $$1.a;
   }

   public static <T extends bkv> boolean a(bkz<T> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      bmf.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bkz.f, bmf.c.b, dmw.a.f, byd::a);
      a(bkz.r, bmf.c.b, dmw.a.f, bxy::c);
      a(bkz.v, bmf.c.b, dmw.a.f, bxy::c);
      a(bkz.y, bmf.c.b, dmw.a.f, cbb::a);
      a(bkz.V, bmf.c.b, dmw.a.f, cbj::b);
      a(bkz.aB, bmf.c.b, dmw.a.f, bxy::c);
      a(bkz.aE, bmf.c.b, dmw.a.f, bxy::c);
      a(bkz.aT, bmf.c.b, dmw.a.f, bxy::c);
      a(bkz.bc, bmf.c.b, dmw.a.f, bxw::b);
      a(bkz.g, bmf.c.a, dmw.a.f, bwr::b);
      a(bkz.i, bmf.c.a, dmw.a.f, cbn::c);
      a(bkz.n, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.q, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.t, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.u, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.w, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.E, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.F, bmf.c.a, dmw.a.f, cbe::b);
      a(bkz.C, bmf.c.a, dmw.a.f, bln::a);
      a(bkz.O, bmf.c.a, dmw.a.f, byl::c);
      a(bkz.Q, bmf.c.a, dmw.a.f, cbh::b);
      a(bkz.R, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.T, bmf.c.b, dmw.a.f, bld::a);
      a(bkz.U, bmf.c.a, dmw.a.f, byr::c);
      a(bkz.Y, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.Z, bmf.c.a, dmw.a.f, cbk::a);
      a(bkz.ac, bmf.c.a, dmw.a.f, bln::a);
      a(bkz.aj, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.al, bmf.c.a, dmw.a.f, cbm::b);
      a(bkz.ao, bmf.c.a, dmw.a.f, bxj::c);
      a(bkz.ap, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.aq, bmf.c.a, dmw.a.e, bxk::c);
      a(bkz.at, bmf.c.a, dmw.a.e, bxm::c);
      a(bkz.av, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.W, bmf.c.a, dmw.a.f, ccj::c);
      a(bkz.aw, bmf.c.a, dmw.a.f, ccp::b);
      a(bkz.ay, bmf.c.a, dmw.a.f, cbo::b);
      a(bkz.az, bmf.c.a, dmw.a.f, bxo::c);
      a(bkz.aC, bmf.c.a, dmw.a.f, bxq::c);
      a(bkz.aF, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.aI, bmf.c.a, dmw.a.f, cbu::b);
      a(bkz.aJ, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.aK, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.aL, bmf.c.a, dmw.a.f, cbw::c);
      a(bkz.aO, bmf.c.a, dmw.a.f, bln::a);
      a(bkz.aS, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.aU, bmf.c.a, dmw.a.f, cbz::a);
      a(bkz.aV, bmf.c.d, dmw.a.f, cca::c);
      a(bkz.bd, bmf.c.a, dmw.a.f, bxx::c);
      a(bkz.bf, bmf.c.a, dmw.a.f, bln::a);
      a(bkz.bj, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.bk, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.bl, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.bn, bmf.c.a, dmw.a.f, bxz::c);
      a(bkz.bp, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.bq, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.bs, bmf.c.a, dmw.a.f, cci::b);
      a(bkz.br, bmf.c.a, dmw.a.f, cbn::b);
      a(bkz.m, bmf.c.a, dmw.a.f, bww::b);
      a(bkz.A, bmf.c.b, dmw.a.f, cbj::b);
      a(bkz.G, bmf.c.c, dmw.a.f, cbn::b);
      a(bkz.N, bmf.c.c, dmw.a.f, bxg::c);
      a(bkz.aa, bmf.c.c, dmw.a.f, cbn::b);
      a(bkz.as, bmf.c.c, dmw.a.f, bww::b);
      a(bkz.au, bmf.c.c, dmw.a.f, bln::a);
      a(bkz.aD, bmf.c.c, dmw.a.f, cbn::b);
      a(bkz.aG, bmf.c.c, dmw.a.f, bln::a);
      a(bkz.ba, bmf.c.c, dmw.a.f, bww::b);
      a(bkz.be, bmf.c.c, dmw.a.f, cbn::b);
      a(bkz.bg, bmf.c.c, dmw.a.f, cbn::b);
      a(bkz.bh, bmf.c.c, dmw.a.f, bln::a);
      a(bkz.bi, bmf.c.c, dmw.a.f, bln::a);
   }

   static class a {
      final dmw.a a;
      final bmf.c b;
      final bmf.b<?> c;

      public a(dmw.a $$0, bmf.c $$1, bmf.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bkv> {
      boolean test(bkz<T> var1, csu var2, blp var3, hx var4, atw var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
