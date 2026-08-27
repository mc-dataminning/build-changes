import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class boz {
   private static final Map<bnu<?>, boz.a> a = Maps.newHashMap();

   private static <T extends boi> void a(bnu<T> $$0, boz.c $$1, dqo.a $$2, boz.b<T> $$3) {
      boz.a $$4 = a.put($$0, new boz.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kf.g.b($$0));
      }
   }

   public static boz.c a(bnu<?> $$0) {
      boz.a $$1 = a.get($$0);
      return $$1 == null ? boz.c.c : $$1.b;
   }

   public static dqo.a b(@Nullable bnu<?> $$0) {
      boz.a $$1 = a.get($$0);
      return $$1 == null ? dqo.a.f : $$1.a;
   }

   public static <T extends bno> boolean a(bnu<T> $$0, cwc $$1, bok $$2, hz $$3, awo $$4) {
      boz.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bnu.g, boz.c.b, dqo.a.f, cbd::a);
      a(bnu.t, boz.c.b, dqo.a.f, cav::c);
      a(bnu.x, boz.c.b, dqo.a.f, cav::c);
      a(bnu.A, boz.c.b, dqo.a.f, ceb::a);
      a(bnu.X, boz.c.b, dqo.a.f, cej::b);
      a(bnu.aD, boz.c.b, dqo.a.f, cav::c);
      a(bnu.aG, boz.c.b, dqo.a.f, cav::c);
      a(bnu.aV, boz.c.b, dqo.a.f, cav::c);
      a(bnu.be, boz.c.b, dqo.a.f, cat::b);
      a(bnu.d, boz.c.a, dqo.a.f, cba::c);
      a(bnu.h, boz.c.a, dqo.a.f, bzo::b);
      a(bnu.j, boz.c.a, dqo.a.f, cen::c);
      a(bnu.p, boz.c.a, dqo.a.f, cen::b);
      a(bnu.s, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.v, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.w, boz.c.a, dqo.a.f, cen::b);
      a(bnu.y, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.G, boz.c.a, dqo.a.f, cen::b);
      a(bnu.H, boz.c.a, dqo.a.f, cee::b);
      a(bnu.E, boz.c.a, dqo.a.f, boi::a);
      a(bnu.Q, boz.c.a, dqo.a.f, cbl::c);
      a(bnu.S, boz.c.a, dqo.a.f, ceh::b);
      a(bnu.T, boz.c.a, dqo.a.f, cen::b);
      a(bnu.V, boz.c.b, dqo.a.f, bny::a);
      a(bnu.W, boz.c.a, dqo.a.f, cbr::c);
      a(bnu.aa, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.ab, boz.c.a, dqo.a.f, cek::a);
      a(bnu.ae, boz.c.a, dqo.a.f, boi::a);
      a(bnu.al, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.an, boz.c.a, dqo.a.f, cem::b);
      a(bnu.aq, boz.c.a, dqo.a.f, cag::c);
      a(bnu.ar, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.as, boz.c.a, dqo.a.e, cah::c);
      a(bnu.av, boz.c.a, dqo.a.e, caj::c);
      a(bnu.ax, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.Y, boz.c.a, dqo.a.f, cfr::c);
      a(bnu.ay, boz.c.a, dqo.a.f, cfx::b);
      a(bnu.aA, boz.c.a, dqo.a.f, ceo::b);
      a(bnu.aB, boz.c.a, dqo.a.f, cal::c);
      a(bnu.aE, boz.c.a, dqo.a.f, can::c);
      a(bnu.aH, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.aK, boz.c.a, dqo.a.f, ceu::b);
      a(bnu.aL, boz.c.a, dqo.a.f, cen::b);
      a(bnu.aM, boz.c.a, dqo.a.f, ccb::c);
      a(bnu.aN, boz.c.a, dqo.a.f, cew::c);
      a(bnu.aQ, boz.c.a, dqo.a.f, boi::a);
      a(bnu.aU, boz.c.a, dqo.a.f, cen::b);
      a(bnu.aW, boz.c.a, dqo.a.f, cez::a);
      a(bnu.aX, boz.c.d, dqo.a.f, cfa::c);
      a(bnu.bf, boz.c.a, dqo.a.f, cau::c);
      a(bnu.bh, boz.c.a, dqo.a.f, boi::a);
      a(bnu.bm, boz.c.a, dqo.a.f, cen::b);
      a(bnu.bn, boz.c.a, dqo.a.f, cen::b);
      a(bnu.bo, boz.c.a, dqo.a.f, cen::b);
      a(bnu.bq, boz.c.a, dqo.a.f, caw::c);
      a(bnu.bs, boz.c.a, dqo.a.f, cen::b);
      a(bnu.bt, boz.c.a, dqo.a.f, ccf::c);
      a(bnu.bv, boz.c.a, dqo.a.f, cfi::b);
      a(bnu.bu, boz.c.a, dqo.a.f, cen::b);
      a(bnu.o, boz.c.a, dqo.a.f, bzt::b);
      a(bnu.C, boz.c.b, dqo.a.f, cej::b);
      a(bnu.I, boz.c.c, dqo.a.f, cen::b);
      a(bnu.P, boz.c.c, dqo.a.f, cad::c);
      a(bnu.ac, boz.c.c, dqo.a.f, cen::b);
      a(bnu.au, boz.c.c, dqo.a.f, bzt::b);
      a(bnu.aw, boz.c.c, dqo.a.f, boi::a);
      a(bnu.aF, boz.c.c, dqo.a.f, cen::b);
      a(bnu.aI, boz.c.c, dqo.a.f, boi::a);
      a(bnu.bc, boz.c.c, dqo.a.f, bzt::b);
      a(bnu.bg, boz.c.c, dqo.a.f, cen::b);
      a(bnu.bi, boz.c.c, dqo.a.f, cen::b);
      a(bnu.bj, boz.c.c, dqo.a.f, boi::a);
      a(bnu.bk, boz.c.c, dqo.a.f, boi::a);
   }

   static class a {
      final dqo.a a;
      final boz.c b;
      final boz.b<?> c;

      public a(dqo.a $$0, boz.c $$1, boz.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends bno> {
      boolean test(bnu<T> var1, cwc var2, bok var3, hz var4, awo var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
