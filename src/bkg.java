import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bkg {
   private static final Map<bja<?>, bkg.a> a = Maps.newHashMap();

   private static <T extends bjo> void a(bja<T> $$0, bkg.c $$1, dkm.a $$2, bkg.b<T> $$3) {
      bkg.a $$4 = a.put($$0, new bkg.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jb.h.b($$0));
      }
   }

   public static bkg.c a(bja<?> $$0) {
      bkg.a $$1 = a.get($$0);
      return $$1 == null ? bkg.c.c : $$1.b;
   }

   public static dkm.a b(@Nullable bja<?> $$0) {
      bkg.a $$1 = a.get($$0);
      return $$1 == null ? dkm.a.f : $$1.a;
   }

   public static <T extends biw> boolean a(bja<T> $$0, cqq $$1, bjq $$2, gw $$3, ash $$4) {
      bkg.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bja.f, bkg.c.b, dkm.a.f, bwe::a);
      a(bja.r, bkg.c.b, dkm.a.f, bvz::c);
      a(bja.v, bkg.c.b, dkm.a.f, bvz::c);
      a(bja.y, bkg.c.b, dkm.a.f, bzc::a);
      a(bja.V, bkg.c.b, dkm.a.f, bzk::b);
      a(bja.aB, bkg.c.b, dkm.a.f, bvz::c);
      a(bja.aE, bkg.c.b, dkm.a.f, bvz::c);
      a(bja.aT, bkg.c.b, dkm.a.f, bvz::c);
      a(bja.bc, bkg.c.b, dkm.a.f, bvx::b);
      a(bja.g, bkg.c.a, dkm.a.f, bus::b);
      a(bja.i, bkg.c.a, dkm.a.f, bzo::c);
      a(bja.n, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.q, bkg.c.a, dkm.a.f, bux::b);
      a(bja.t, bkg.c.a, dkm.a.f, bux::b);
      a(bja.u, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.w, bkg.c.a, dkm.a.f, bux::b);
      a(bja.E, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.F, bkg.c.a, dkm.a.f, bzf::b);
      a(bja.C, bkg.c.a, dkm.a.f, bjo::a);
      a(bja.O, bkg.c.a, dkm.a.f, bwm::c);
      a(bja.Q, bkg.c.a, dkm.a.f, bzi::b);
      a(bja.R, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.T, bkg.c.b, dkm.a.f, bje::a);
      a(bja.U, bkg.c.a, dkm.a.f, bws::c);
      a(bja.Y, bkg.c.a, dkm.a.f, bux::b);
      a(bja.Z, bkg.c.a, dkm.a.f, bzl::a);
      a(bja.ac, bkg.c.a, dkm.a.f, bjo::a);
      a(bja.aj, bkg.c.a, dkm.a.f, bux::b);
      a(bja.al, bkg.c.a, dkm.a.f, bzn::b);
      a(bja.ao, bkg.c.a, dkm.a.f, bvk::c);
      a(bja.ap, bkg.c.a, dkm.a.f, bux::b);
      a(bja.aq, bkg.c.a, dkm.a.e, bvl::c);
      a(bja.at, bkg.c.a, dkm.a.e, bvn::c);
      a(bja.av, bkg.c.a, dkm.a.f, bux::b);
      a(bja.W, bkg.c.a, dkm.a.f, cak::c);
      a(bja.aw, bkg.c.a, dkm.a.f, caq::b);
      a(bja.ay, bkg.c.a, dkm.a.f, bzp::b);
      a(bja.az, bkg.c.a, dkm.a.f, bvp::c);
      a(bja.aC, bkg.c.a, dkm.a.f, bvr::c);
      a(bja.aF, bkg.c.a, dkm.a.f, bux::b);
      a(bja.aI, bkg.c.a, dkm.a.f, bzv::b);
      a(bja.aJ, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.aK, bkg.c.a, dkm.a.f, bux::b);
      a(bja.aL, bkg.c.a, dkm.a.f, bzx::c);
      a(bja.aO, bkg.c.a, dkm.a.f, bjo::a);
      a(bja.aS, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.aU, bkg.c.a, dkm.a.f, caa::a);
      a(bja.aV, bkg.c.d, dkm.a.f, cab::c);
      a(bja.bd, bkg.c.a, dkm.a.f, bvy::c);
      a(bja.bf, bkg.c.a, dkm.a.f, bjo::a);
      a(bja.bj, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.bk, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.bl, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.bn, bkg.c.a, dkm.a.f, bwa::c);
      a(bja.bp, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.bq, bkg.c.a, dkm.a.f, bux::b);
      a(bja.bs, bkg.c.a, dkm.a.f, caj::b);
      a(bja.br, bkg.c.a, dkm.a.f, bzo::b);
      a(bja.m, bkg.c.a, dkm.a.f, bux::b);
      a(bja.A, bkg.c.b, dkm.a.f, bzk::b);
      a(bja.G, bkg.c.c, dkm.a.f, bzo::b);
      a(bja.N, bkg.c.c, dkm.a.f, bvh::c);
      a(bja.aa, bkg.c.c, dkm.a.f, bzo::b);
      a(bja.as, bkg.c.c, dkm.a.f, bux::b);
      a(bja.au, bkg.c.c, dkm.a.f, bjo::a);
      a(bja.aD, bkg.c.c, dkm.a.f, bzo::b);
      a(bja.aG, bkg.c.c, dkm.a.f, bjo::a);
      a(bja.ba, bkg.c.c, dkm.a.f, bux::b);
      a(bja.be, bkg.c.c, dkm.a.f, bzo::b);
      a(bja.bg, bkg.c.c, dkm.a.f, bzo::b);
      a(bja.bh, bkg.c.c, dkm.a.f, bjo::a);
      a(bja.bi, bkg.c.c, dkm.a.f, bjo::a);
   }

   static class a {
      final dkm.a a;
      final bkg.c b;
      final bkg.b<?> c;

      public a(dkm.a $$0, bkg.c $$1, bkg.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends biw> {
      boolean test(bja<T> var1, cqq var2, bjq var3, gw var4, ash var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
