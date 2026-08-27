import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bka {
   private static final Map<biu<?>, bka.a> a = Maps.newHashMap();

   private static <T extends bji> void a(biu<T> $$0, bka.c $$1, dks.a $$2, bka.b<T> $$3) {
      bka.a $$4 = a.put($$0, new bka.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jd.h.b($$0));
      }
   }

   public static bka.c a(biu<?> $$0) {
      bka.a $$1 = a.get($$0);
      return $$1 == null ? bka.c.c : $$1.b;
   }

   public static dks.a b(@Nullable biu<?> $$0) {
      bka.a $$1 = a.get($$0);
      return $$1 == null ? dks.a.f : $$1.a;
   }

   public static <T extends biq> boolean a(biu<T> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      bka.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(biu.f, bka.c.b, dks.a.f, bvy::a);
      a(biu.r, bka.c.b, dks.a.f, bvt::c);
      a(biu.v, bka.c.b, dks.a.f, bvt::c);
      a(biu.y, bka.c.b, dks.a.f, byw::a);
      a(biu.V, bka.c.b, dks.a.f, bze::b);
      a(biu.aB, bka.c.b, dks.a.f, bvt::c);
      a(biu.aE, bka.c.b, dks.a.f, bvt::c);
      a(biu.aT, bka.c.b, dks.a.f, bvt::c);
      a(biu.bc, bka.c.b, dks.a.f, bvr::b);
      a(biu.g, bka.c.a, dks.a.f, bum::b);
      a(biu.i, bka.c.a, dks.a.f, bzi::c);
      a(biu.n, bka.c.a, dks.a.f, bzi::b);
      a(biu.q, bka.c.a, dks.a.f, bur::b);
      a(biu.t, bka.c.a, dks.a.f, bur::b);
      a(biu.u, bka.c.a, dks.a.f, bzi::b);
      a(biu.w, bka.c.a, dks.a.f, bur::b);
      a(biu.E, bka.c.a, dks.a.f, bzi::b);
      a(biu.F, bka.c.a, dks.a.f, byz::b);
      a(biu.C, bka.c.a, dks.a.f, bji::a);
      a(biu.O, bka.c.a, dks.a.f, bwg::c);
      a(biu.Q, bka.c.a, dks.a.f, bzc::b);
      a(biu.R, bka.c.a, dks.a.f, bzi::b);
      a(biu.T, bka.c.b, dks.a.f, biy::a);
      a(biu.U, bka.c.a, dks.a.f, bwm::c);
      a(biu.Y, bka.c.a, dks.a.f, bur::b);
      a(biu.Z, bka.c.a, dks.a.f, bzf::a);
      a(biu.ac, bka.c.a, dks.a.f, bji::a);
      a(biu.aj, bka.c.a, dks.a.f, bur::b);
      a(biu.al, bka.c.a, dks.a.f, bzh::b);
      a(biu.ao, bka.c.a, dks.a.f, bve::c);
      a(biu.ap, bka.c.a, dks.a.f, bur::b);
      a(biu.aq, bka.c.a, dks.a.e, bvf::c);
      a(biu.at, bka.c.a, dks.a.e, bvh::c);
      a(biu.av, bka.c.a, dks.a.f, bur::b);
      a(biu.W, bka.c.a, dks.a.f, cae::c);
      a(biu.aw, bka.c.a, dks.a.f, cak::b);
      a(biu.ay, bka.c.a, dks.a.f, bzj::b);
      a(biu.az, bka.c.a, dks.a.f, bvj::c);
      a(biu.aC, bka.c.a, dks.a.f, bvl::c);
      a(biu.aF, bka.c.a, dks.a.f, bur::b);
      a(biu.aI, bka.c.a, dks.a.f, bzp::b);
      a(biu.aJ, bka.c.a, dks.a.f, bzi::b);
      a(biu.aK, bka.c.a, dks.a.f, bur::b);
      a(biu.aL, bka.c.a, dks.a.f, bzr::c);
      a(biu.aO, bka.c.a, dks.a.f, bji::a);
      a(biu.aS, bka.c.a, dks.a.f, bzi::b);
      a(biu.aU, bka.c.a, dks.a.f, bzu::a);
      a(biu.aV, bka.c.d, dks.a.f, bzv::c);
      a(biu.bd, bka.c.a, dks.a.f, bvs::c);
      a(biu.bf, bka.c.a, dks.a.f, bji::a);
      a(biu.bj, bka.c.a, dks.a.f, bzi::b);
      a(biu.bk, bka.c.a, dks.a.f, bzi::b);
      a(biu.bl, bka.c.a, dks.a.f, bzi::b);
      a(biu.bn, bka.c.a, dks.a.f, bvu::c);
      a(biu.bp, bka.c.a, dks.a.f, bzi::b);
      a(biu.bq, bka.c.a, dks.a.f, bur::b);
      a(biu.bs, bka.c.a, dks.a.f, cad::b);
      a(biu.br, bka.c.a, dks.a.f, bzi::b);
      a(biu.m, bka.c.a, dks.a.f, bur::b);
      a(biu.A, bka.c.b, dks.a.f, bze::b);
      a(biu.G, bka.c.c, dks.a.f, bzi::b);
      a(biu.N, bka.c.c, dks.a.f, bvb::c);
      a(biu.aa, bka.c.c, dks.a.f, bzi::b);
      a(biu.as, bka.c.c, dks.a.f, bur::b);
      a(biu.au, bka.c.c, dks.a.f, bji::a);
      a(biu.aD, bka.c.c, dks.a.f, bzi::b);
      a(biu.aG, bka.c.c, dks.a.f, bji::a);
      a(biu.ba, bka.c.c, dks.a.f, bur::b);
      a(biu.be, bka.c.c, dks.a.f, bzi::b);
      a(biu.bg, bka.c.c, dks.a.f, bzi::b);
      a(biu.bh, bka.c.c, dks.a.f, bji::a);
      a(biu.bi, bka.c.c, dks.a.f, bji::a);
   }

   static class a {
      final dks.a a;
      final bka.c b;
      final bka.b<?> c;

      public a(dks.a $$0, bka.c $$1, bka.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends biq> {
      boolean test(biu<T> var1, cqk var2, bjk var3, gw var4, asc var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
