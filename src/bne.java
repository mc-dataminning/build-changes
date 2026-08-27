import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bne {
   private static final Map<bly<?>, bne.a> a = Maps.newHashMap();

   private static <T extends bmm> void a(bly<T> $$0, bne.c $$1, dop.a $$2, bne.b<T> $$3) {
      bne.a $$4 = a.put($$0, new bne.a($$2, $$1, $$3));
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate registration for type " + kd.g.b($$0));
      }
   }

   public static bne.c a(bly<?> $$0) {
      bne.a $$1 = a.get($$0);
      return $$1 == null ? bne.c.c : $$1.b;
   }

   public static dop.a b(@Nullable bly<?> $$0) {
      bne.a $$1 = a.get($$0);
      return $$1 == null ? dop.a.f : $$1.a;
   }

   public static <T extends blu> boolean a(bly<T> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      bne.a $$5 = a.get($$0);
      return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
   }

   static {
      a(bly.f, bne.c.b, dop.a.f, bze::a);
      a(bly.s, bne.c.b, dop.a.f, byz::c);
      a(bly.w, bne.c.b, dop.a.f, byz::c);
      a(bly.z, bne.c.b, dop.a.f, ccc::a);
      a(bly.W, bne.c.b, dop.a.f, cck::b);
      a(bly.aC, bne.c.b, dop.a.f, byz::c);
      a(bly.aF, bne.c.b, dop.a.f, byz::c);
      a(bly.aU, bne.c.b, dop.a.f, byz::c);
      a(bly.bd, bne.c.b, dop.a.f, byx::b);
      a(bly.g, bne.c.a, dop.a.f, bxs::b);
      a(bly.i, bne.c.a, dop.a.f, cco::c);
      a(bly.o, bne.c.a, dop.a.f, cco::b);
      a(bly.r, bne.c.a, dop.a.f, bxx::b);
      a(bly.u, bne.c.a, dop.a.f, bxx::b);
      a(bly.v, bne.c.a, dop.a.f, cco::b);
      a(bly.x, bne.c.a, dop.a.f, bxx::b);
      a(bly.F, bne.c.a, dop.a.f, cco::b);
      a(bly.G, bne.c.a, dop.a.f, ccf::b);
      a(bly.D, bne.c.a, dop.a.f, bmm::a);
      a(bly.P, bne.c.a, dop.a.f, bzm::c);
      a(bly.R, bne.c.a, dop.a.f, cci::b);
      a(bly.S, bne.c.a, dop.a.f, cco::b);
      a(bly.U, bne.c.b, dop.a.f, bmc::a);
      a(bly.V, bne.c.a, dop.a.f, bzs::c);
      a(bly.Z, bne.c.a, dop.a.f, bxx::b);
      a(bly.aa, bne.c.a, dop.a.f, ccl::a);
      a(bly.ad, bne.c.a, dop.a.f, bmm::a);
      a(bly.ak, bne.c.a, dop.a.f, bxx::b);
      a(bly.am, bne.c.a, dop.a.f, ccn::b);
      a(bly.ap, bne.c.a, dop.a.f, byk::c);
      a(bly.aq, bne.c.a, dop.a.f, bxx::b);
      a(bly.ar, bne.c.a, dop.a.e, byl::c);
      a(bly.au, bne.c.a, dop.a.e, byn::c);
      a(bly.aw, bne.c.a, dop.a.f, bxx::b);
      a(bly.X, bne.c.a, dop.a.f, cdr::c);
      a(bly.ax, bne.c.a, dop.a.f, cdx::b);
      a(bly.az, bne.c.a, dop.a.f, ccp::b);
      a(bly.aA, bne.c.a, dop.a.f, byp::c);
      a(bly.aD, bne.c.a, dop.a.f, byr::c);
      a(bly.aG, bne.c.a, dop.a.f, bxx::b);
      a(bly.aJ, bne.c.a, dop.a.f, ccv::b);
      a(bly.aK, bne.c.a, dop.a.f, cco::b);
      a(bly.aL, bne.c.a, dop.a.f, cac::c);
      a(bly.aM, bne.c.a, dop.a.f, ccx::c);
      a(bly.aP, bne.c.a, dop.a.f, bmm::a);
      a(bly.aT, bne.c.a, dop.a.f, cco::b);
      a(bly.aV, bne.c.a, dop.a.f, cda::a);
      a(bly.aW, bne.c.d, dop.a.f, cdb::c);
      a(bly.be, bne.c.a, dop.a.f, byy::c);
      a(bly.bg, bne.c.a, dop.a.f, bmm::a);
      a(bly.bl, bne.c.a, dop.a.f, cco::b);
      a(bly.bm, bne.c.a, dop.a.f, cco::b);
      a(bly.bn, bne.c.a, dop.a.f, cco::b);
      a(bly.bp, bne.c.a, dop.a.f, bza::c);
      a(bly.br, bne.c.a, dop.a.f, cco::b);
      a(bly.bs, bne.c.a, dop.a.f, cag::c);
      a(bly.bu, bne.c.a, dop.a.f, cdj::b);
      a(bly.bt, bne.c.a, dop.a.f, cco::b);
      a(bly.n, bne.c.a, dop.a.f, bxx::b);
      a(bly.B, bne.c.b, dop.a.f, cck::b);
      a(bly.H, bne.c.c, dop.a.f, cco::b);
      a(bly.O, bne.c.c, dop.a.f, byh::c);
      a(bly.ab, bne.c.c, dop.a.f, cco::b);
      a(bly.at, bne.c.c, dop.a.f, bxx::b);
      a(bly.av, bne.c.c, dop.a.f, bmm::a);
      a(bly.aE, bne.c.c, dop.a.f, cco::b);
      a(bly.aH, bne.c.c, dop.a.f, bmm::a);
      a(bly.bb, bne.c.c, dop.a.f, bxx::b);
      a(bly.bf, bne.c.c, dop.a.f, cco::b);
      a(bly.bh, bne.c.c, dop.a.f, cco::b);
      a(bly.bi, bne.c.c, dop.a.f, bmm::a);
      a(bly.bj, bne.c.c, dop.a.f, bmm::a);
   }

   static class a {
      final dop.a a;
      final bne.c b;
      final bne.b<?> c;

      public a(dop.a $$0, bne.c $$1, bne.b<?> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface b<T extends blu> {
      boolean test(bly<T> var1, cud var2, bmo var3, hx var4, auu var5);
   }

   public static enum c {
      a,
      b,
      c,
      d;
   }
}
