import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bjs {
   private static final Map<bim<?>, bjs.a> a = Maps.newHashMap();

   private static <T extends bja> void a(bim<T> $$0, bjs.c $$1, dki.a $$2, bjs.b<T> $$3) {
      bjs.a $$4 = a.put($$0, new bjs.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + jb.h.b($$0));
      }
   }

   public static bjs.c a(bim<?> $$0) {
      bjs.a $$1 = a.get($$0);
      return $$1 == null ? bjs.c.c : $$1.b;
   }

   public static dki.a b(@Nullable bim<?> $$0) {
      bjs.a $$1 = a.get($$0);
      return $$1 == null ? dki.a.f : $$1.a;
   }

   public static <T extends bii> boolean a(bim<T> $$0, cqa $$1, bjc $$2, gu $$3, aru $$4) {
      bjs.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bim.f, bjs.c.b, dki.a.f, bvq::a);
      a(bim.r, bjs.c.b, dki.a.f, bvl::c);
      a(bim.v, bjs.c.b, dki.a.f, bvl::c);
      a(bim.y, bjs.c.b, dki.a.f, byo::a);
      a(bim.V, bjs.c.b, dki.a.f, byw::b);
      a(bim.aB, bjs.c.b, dki.a.f, bvl::c);
      a(bim.aE, bjs.c.b, dki.a.f, bvl::c);
      a(bim.aT, bjs.c.b, dki.a.f, bvl::c);
      a(bim.bc, bjs.c.b, dki.a.f, bvj::b);
      a(bim.g, bjs.c.a, dki.a.f, bue::b);
      a(bim.i, bjs.c.a, dki.a.f, bza::c);
      a(bim.n, bjs.c.a, dki.a.f, bza::b);
      a(bim.q, bjs.c.a, dki.a.f, buj::b);
      a(bim.t, bjs.c.a, dki.a.f, buj::b);
      a(bim.u, bjs.c.a, dki.a.f, bza::b);
      a(bim.w, bjs.c.a, dki.a.f, buj::b);
      a(bim.E, bjs.c.a, dki.a.f, bza::b);
      a(bim.F, bjs.c.a, dki.a.f, byr::b);
      a(bim.C, bjs.c.a, dki.a.f, bja::a);
      a(bim.O, bjs.c.a, dki.a.f, bvy::c);
      a(bim.Q, bjs.c.a, dki.a.f, byu::b);
      a(bim.R, bjs.c.a, dki.a.f, bza::b);
      a(bim.T, bjs.c.b, dki.a.f, biq::a);
      a(bim.U, bjs.c.a, dki.a.f, bwe::c);
      a(bim.Y, bjs.c.a, dki.a.f, buj::b);
      a(bim.Z, bjs.c.a, dki.a.f, byx::a);
      a(bim.ac, bjs.c.a, dki.a.f, bja::a);
      a(bim.aj, bjs.c.a, dki.a.f, buj::b);
      a(bim.al, bjs.c.a, dki.a.f, byz::b);
      a(bim.ao, bjs.c.a, dki.a.f, buw::c);
      a(bim.ap, bjs.c.a, dki.a.f, buj::b);
      a(bim.aq, bjs.c.a, dki.a.e, bux::c);
      a(bim.at, bjs.c.a, dki.a.e, buz::c);
      a(bim.av, bjs.c.a, dki.a.f, buj::b);
      a(bim.W, bjs.c.a, dki.a.f, bzw::c);
      a(bim.aw, bjs.c.a, dki.a.f, cac::b);
      a(bim.ay, bjs.c.a, dki.a.f, bzb::b);
      a(bim.az, bjs.c.a, dki.a.f, bvb::c);
      a(bim.aC, bjs.c.a, dki.a.f, bvd::c);
      a(bim.aF, bjs.c.a, dki.a.f, buj::b);
      a(bim.aI, bjs.c.a, dki.a.f, bzh::b);
      a(bim.aJ, bjs.c.a, dki.a.f, bza::b);
      a(bim.aK, bjs.c.a, dki.a.f, buj::b);
      a(bim.aL, bjs.c.a, dki.a.f, bzj::c);
      a(bim.aO, bjs.c.a, dki.a.f, bja::a);
      a(bim.aS, bjs.c.a, dki.a.f, bza::b);
      a(bim.aU, bjs.c.a, dki.a.f, bzm::a);
      a(bim.aV, bjs.c.d, dki.a.f, bzn::c);
      a(bim.bd, bjs.c.a, dki.a.f, bvk::c);
      a(bim.bf, bjs.c.a, dki.a.f, bja::a);
      a(bim.bj, bjs.c.a, dki.a.f, bza::b);
      a(bim.bk, bjs.c.a, dki.a.f, bza::b);
      a(bim.bl, bjs.c.a, dki.a.f, bza::b);
      a(bim.bn, bjs.c.a, dki.a.f, bvm::c);
      a(bim.bp, bjs.c.a, dki.a.f, bza::b);
      a(bim.bq, bjs.c.a, dki.a.f, buj::b);
      a(bim.bs, bjs.c.a, dki.a.f, bzv::b);
      a(bim.br, bjs.c.a, dki.a.f, bza::b);
      a(bim.m, bjs.c.a, dki.a.f, buj::b);
      a(bim.A, bjs.c.b, dki.a.f, byw::b);
      a(bim.G, bjs.c.c, dki.a.f, bza::b);
      a(bim.N, bjs.c.c, dki.a.f, but::c);
      a(bim.aa, bjs.c.c, dki.a.f, bza::b);
      a(bim.as, bjs.c.c, dki.a.f, buj::b);
      a(bim.au, bjs.c.c, dki.a.f, bja::a);
      a(bim.aD, bjs.c.c, dki.a.f, bza::b);
      a(bim.aG, bjs.c.c, dki.a.f, bja::a);
      a(bim.ba, bjs.c.c, dki.a.f, buj::b);
      a(bim.be, bjs.c.c, dki.a.f, bza::b);
      a(bim.bg, bjs.c.c, dki.a.f, bza::b);
      a(bim.bh, bjs.c.c, dki.a.f, bja::a);
      a(bim.bi, bjs.c.c, dki.a.f, bja::a);
   }

   static class a {
      final dki.a a;
      final bjs.c b;
      final bjs.b<?> c;

      public a(dki.a $$0, bjs.c $$1, bjs.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bii> {
      boolean test(bim<T> var1, cqa var2, bjc var3, gu var4, aru var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
