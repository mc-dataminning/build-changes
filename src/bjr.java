import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bjr {
   private static final Map<bik<?>, bjr.a> a = Maps.newHashMap();

   private static <T extends biy> void a(bik<T> $$0, bjr.c $$1, dkh.a $$2, bjr.b<T> $$3) {
      bjr.a $$4 = a.put($$0, new bjr.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jc.h.b($$0));
      }
   }

   public static bjr.c a(bik<?> $$0) {
      bjr.a $$1 = a.get($$0);
      return $$1 == null ? bjr.c.c : $$1.b;
   }

   public static dkh.a b(@Nullable bik<?> $$0) {
      bjr.a $$1 = a.get($$0);
      return $$1 == null ? dkh.a.f : $$1.a;
   }

   public static <T extends big> boolean a(bik<T> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      bjr.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bik.f, bjr.c.b, dkh.a.f, bvp::a);
      a(bik.r, bjr.c.b, dkh.a.f, bvk::c);
      a(bik.v, bjr.c.b, dkh.a.f, bvk::c);
      a(bik.y, bjr.c.b, dkh.a.f, byn::a);
      a(bik.V, bjr.c.b, dkh.a.f, byv::b);
      a(bik.aB, bjr.c.b, dkh.a.f, bvk::c);
      a(bik.aE, bjr.c.b, dkh.a.f, bvk::c);
      a(bik.aT, bjr.c.b, dkh.a.f, bvk::c);
      a(bik.bc, bjr.c.b, dkh.a.f, bvi::b);
      a(bik.g, bjr.c.a, dkh.a.f, bud::b);
      a(bik.i, bjr.c.a, dkh.a.f, byz::c);
      a(bik.n, bjr.c.a, dkh.a.f, byz::b);
      a(bik.q, bjr.c.a, dkh.a.f, bui::b);
      a(bik.t, bjr.c.a, dkh.a.f, bui::b);
      a(bik.u, bjr.c.a, dkh.a.f, byz::b);
      a(bik.w, bjr.c.a, dkh.a.f, bui::b);
      a(bik.E, bjr.c.a, dkh.a.f, byz::b);
      a(bik.F, bjr.c.a, dkh.a.f, byq::b);
      a(bik.C, bjr.c.a, dkh.a.f, biy::a);
      a(bik.O, bjr.c.a, dkh.a.f, bvx::c);
      a(bik.Q, bjr.c.a, dkh.a.f, byt::b);
      a(bik.R, bjr.c.a, dkh.a.f, byz::b);
      a(bik.T, bjr.c.b, dkh.a.f, bio::a);
      a(bik.U, bjr.c.a, dkh.a.f, bwd::c);
      a(bik.Y, bjr.c.a, dkh.a.f, bui::b);
      a(bik.Z, bjr.c.a, dkh.a.f, byw::a);
      a(bik.ac, bjr.c.a, dkh.a.f, biy::a);
      a(bik.aj, bjr.c.a, dkh.a.f, bui::b);
      a(bik.al, bjr.c.a, dkh.a.f, byy::b);
      a(bik.ao, bjr.c.a, dkh.a.f, buv::c);
      a(bik.ap, bjr.c.a, dkh.a.f, bui::b);
      a(bik.aq, bjr.c.a, dkh.a.e, buw::c);
      a(bik.at, bjr.c.a, dkh.a.e, buy::c);
      a(bik.av, bjr.c.a, dkh.a.f, bui::b);
      a(bik.W, bjr.c.a, dkh.a.f, bzv::c);
      a(bik.aw, bjr.c.a, dkh.a.f, cab::b);
      a(bik.ay, bjr.c.a, dkh.a.f, bza::b);
      a(bik.az, bjr.c.a, dkh.a.f, bva::c);
      a(bik.aC, bjr.c.a, dkh.a.f, bvc::c);
      a(bik.aF, bjr.c.a, dkh.a.f, bui::b);
      a(bik.aI, bjr.c.a, dkh.a.f, bzg::b);
      a(bik.aJ, bjr.c.a, dkh.a.f, byz::b);
      a(bik.aK, bjr.c.a, dkh.a.f, bui::b);
      a(bik.aL, bjr.c.a, dkh.a.f, bzi::c);
      a(bik.aO, bjr.c.a, dkh.a.f, biy::a);
      a(bik.aS, bjr.c.a, dkh.a.f, byz::b);
      a(bik.aU, bjr.c.a, dkh.a.f, bzl::a);
      a(bik.aV, bjr.c.d, dkh.a.f, bzm::c);
      a(bik.bd, bjr.c.a, dkh.a.f, bvj::c);
      a(bik.bf, bjr.c.a, dkh.a.f, biy::a);
      a(bik.bj, bjr.c.a, dkh.a.f, byz::b);
      a(bik.bk, bjr.c.a, dkh.a.f, byz::b);
      a(bik.bl, bjr.c.a, dkh.a.f, byz::b);
      a(bik.bn, bjr.c.a, dkh.a.f, bvl::c);
      a(bik.bp, bjr.c.a, dkh.a.f, byz::b);
      a(bik.bq, bjr.c.a, dkh.a.f, bui::b);
      a(bik.bs, bjr.c.a, dkh.a.f, bzu::b);
      a(bik.br, bjr.c.a, dkh.a.f, byz::b);
      a(bik.m, bjr.c.a, dkh.a.f, bui::b);
      a(bik.A, bjr.c.b, dkh.a.f, byv::b);
      a(bik.G, bjr.c.c, dkh.a.f, byz::b);
      a(bik.N, bjr.c.c, dkh.a.f, bus::c);
      a(bik.aa, bjr.c.c, dkh.a.f, byz::b);
      a(bik.as, bjr.c.c, dkh.a.f, bui::b);
      a(bik.au, bjr.c.c, dkh.a.f, biy::a);
      a(bik.aD, bjr.c.c, dkh.a.f, byz::b);
      a(bik.aG, bjr.c.c, dkh.a.f, biy::a);
      a(bik.ba, bjr.c.c, dkh.a.f, bui::b);
      a(bik.be, bjr.c.c, dkh.a.f, byz::b);
      a(bik.bg, bjr.c.c, dkh.a.f, byz::b);
      a(bik.bh, bjr.c.c, dkh.a.f, biy::a);
      a(bik.bi, bjr.c.c, dkh.a.f, biy::a);
   }

   static class a {
      final dkh.a a;
      final bjr.c b;
      final bjr.b<?> c;

      public a(dkh.a $$0, bjr.c $$1, bjr.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends big> {
      boolean test(bik<T> var1, cpz var2, bja var3, gv var4, art var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
