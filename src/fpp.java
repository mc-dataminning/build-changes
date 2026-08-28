import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fpp {
   private final Map<fpq, ald> a = Maps.newHashMap();
   private final Set<fpq> b = Sets.newHashSet();

   public fpp a(fpq $$0, ald $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fpp b(fpq $$0, ald $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fpq> a() {
      return this.b.stream();
   }

   public fpp a(fpq $$0, fpq $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fpp b(fpq $$0, fpq $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ald a(fpq $$0) {
      for (fpq $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ald $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fpp c(fpq $$0, ald $$1) {
      fpp $$2 = new fpp();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fpp a(dku $$0) {
      ald $$1 = J($$0);
      return b($$1);
   }

   public static fpp b(dku $$0) {
      ald $$1 = J($$0);
      return a($$1);
   }

   public static fpp a(ald $$0) {
      return new fpp().a(fpq.b, $$0);
   }

   public static fpp b(ald $$0) {
      return new fpp().a(fpq.a, $$0);
   }

   public static fpp c(dku $$0) {
      return d(fpq.p, J($$0));
   }

   public static fpp d(dku $$0) {
      return d(fpq.i, J($$0));
   }

   public static fpp e(dku $$0) {
      return new fpp().a(fpq.p, J($$0)).a(fpq.q, a($$0, "_emissive"));
   }

   public static fpp c(ald $$0) {
      return d(fpq.p, $$0);
   }

   public static fpp f(dku $$0) {
      return d(fpq.r, J($$0));
   }

   public static fpp g(dku $$0) {
      return new fpp().a(fpq.r, J($$0)).a(fpq.q, a($$0, "_emissive"));
   }

   public static fpp d(ald $$0) {
      return d(fpq.r, $$0);
   }

   public static fpp h(dku $$0) {
      return d(fpq.t, J($$0));
   }

   public static fpp e(ald $$0) {
      return d(fpq.t, $$0);
   }

   public static fpp i(dku $$0) {
      return d(fpq.u, J($$0));
   }

   public static fpp j(dku $$0) {
      return new fpp().a(fpq.Q, J($$0)).a(fpq.z, a($$0, "_stem"));
   }

   public static fpp f(ald $$0) {
      return d(fpq.u, $$0);
   }

   public static fpp k(dku $$0) {
      return d(fpq.z, J($$0));
   }

   public static fpp a(dku $$0, dku $$1) {
      return new fpp().a(fpq.z, J($$0)).a(fpq.A, J($$1));
   }

   public static fpp l(dku $$0) {
      return d(fpq.v, J($$0));
   }

   public static fpp m(dku $$0) {
      return d(fpq.y, J($$0));
   }

   public static fpp g(ald $$0) {
      return d(fpq.B, $$0);
   }

   public static fpp b(dku $$0, dku $$1) {
      return new fpp().a(fpq.w, J($$0)).a(fpq.x, a($$1, "_top"));
   }

   public static fpp d(fpq $$0, ald $$1) {
      return new fpp().a($$0, $$1);
   }

   public static fpp n(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.d, a($$0, "_top"));
   }

   public static fpp o(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.f, a($$0, "_top"));
   }

   public static fpp p(dku $$0) {
      return new fpp().a(fpq.r, a($$0, "_plant")).a(fpq.i, a($$0, "_side")).a(fpq.f, a($$0, "_top"));
   }

   public static fpp q(dku $$0) {
      return new fpp().a(fpq.i, J($$0)).a(fpq.d, a($$0, "_top")).a(fpq.c, J($$0));
   }

   public static fpp a(ald $$0, ald $$1) {
      return new fpp().a(fpq.i, $$0).a(fpq.d, $$1);
   }

   public static fpp r(dku $$0) {
      return new fpp().a(fpq.b, J($$0)).a(fpq.i, a($$0, "_side")).a(fpq.f, a($$0, "_top"));
   }

   public static fpp s(dku $$0) {
      return new fpp().a(fpq.b, J($$0)).a(fpq.c, a($$0, "_particle"));
   }

   public static fpp t(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.f, a($$0, "_top")).a(fpq.e, a($$0, "_bottom"));
   }

   public static fpp u(dku $$0) {
      ald $$1 = J($$0);
      return new fpp().a(fpq.s, $$1).a(fpq.i, $$1).a(fpq.f, a($$0, "_top")).a(fpq.e, a($$0, "_bottom"));
   }

   public static fpp v(dku $$0) {
      ald $$1 = J($$0);
      return new fpp().a(fpq.b, $$1).a(fpq.s, $$1).a(fpq.i, $$1).a(fpq.d, a($$0, "_top"));
   }

   public static fpp b(ald $$0, ald $$1) {
      return new fpp().a(fpq.f, $$0).a(fpq.e, $$1);
   }

   public static fpp w(dku $$0) {
      return new fpp().a(fpq.f, a($$0, "_top")).a(fpq.e, a($$0, "_bottom"));
   }

   public static fpp x(dku $$0) {
      return new fpp().a(fpq.c, J($$0));
   }

   public static fpp h(ald $$0) {
      return new fpp().a(fpq.c, $$0);
   }

   public static fpp y(dku $$0) {
      return new fpp().a(fpq.D, a($$0, "_0"));
   }

   public static fpp z(dku $$0) {
      return new fpp().a(fpq.D, a($$0, "_1"));
   }

   public static fpp A(dku $$0) {
      return new fpp().a(fpq.E, J($$0));
   }

   public static fpp B(dku $$0) {
      return new fpp().a(fpq.H, J($$0));
   }

   public static fpp i(ald $$0) {
      return new fpp().a(fpq.H, $$0);
   }

   public static fpp a(dku $$0, String $$1, String $$2) {
      return new fpp().a(fpq.i, a($$0, $$1)).a(fpq.f, a($$0, $$2)).a(fpq.e, a($$0, "_bottom"));
   }

   public static fpp a(dku $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fpp().a(fpq.g, a($$0, $$1)).a(fpq.i, a($$0, $$2)).a(fpq.f, a($$0, $$3)).a(fpq.e, a($$0, $$4));
   }

   public static fpp a(cxu $$0) {
      return new fpp().a(fpq.c, c($$0));
   }

   public static fpp C(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.g, a($$0, "_front")).a(fpq.h, a($$0, "_back"));
   }

   public static fpp D(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.g, a($$0, "_front")).a(fpq.f, a($$0, "_top")).a(fpq.e, a($$0, "_bottom"));
   }

   public static fpp E(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.g, a($$0, "_front")).a(fpq.f, a($$0, "_top"));
   }

   public static fpp F(dku $$0) {
      return new fpp().a(fpq.i, a($$0, "_side")).a(fpq.g, a($$0, "_front")).a(fpq.d, a($$0, "_end"));
   }

   public static fpp G(dku $$0) {
      return new fpp().a(fpq.f, a($$0, "_top"));
   }

   public static fpp c(dku $$0, dku $$1) {
      return new fpp()
         .a(fpq.c, a($$0, "_front"))
         .a(fpq.o, J($$1))
         .a(fpq.n, a($$0, "_top"))
         .a(fpq.j, a($$0, "_front"))
         .a(fpq.l, a($$0, "_side"))
         .a(fpq.k, a($$0, "_side"))
         .a(fpq.m, a($$0, "_front"));
   }

   public static fpp d(dku $$0, dku $$1) {
      return new fpp()
         .a(fpq.c, a($$0, "_front"))
         .a(fpq.o, J($$1))
         .a(fpq.n, a($$0, "_top"))
         .a(fpq.j, a($$0, "_front"))
         .a(fpq.k, a($$0, "_front"))
         .a(fpq.l, a($$0, "_side"))
         .a(fpq.m, a($$0, "_side"));
   }

   public static fpp a(String $$0) {
      return new fpp()
         .a(fpq.c, a(dkw.mI, $$0 + "_north"))
         .a(fpq.e, a(dkw.mI, $$0 + "_bottom"))
         .a(fpq.f, a(dkw.mI, $$0 + "_top"))
         .a(fpq.j, a(dkw.mI, $$0 + "_north"))
         .a(fpq.k, a(dkw.mI, $$0 + "_south"))
         .a(fpq.l, a(dkw.mI, $$0 + "_east"))
         .a(fpq.m, a(dkw.mI, $$0 + "_west"));
   }

   public static fpp H(dku $$0) {
      return new fpp().a(fpq.L, a($$0, "_log_lit")).a(fpq.D, a($$0, "_fire"));
   }

   public static fpp a(dku $$0, boolean $$1) {
      return new fpp()
         .a(fpq.c, a(dkw.et, "_side"))
         .a(fpq.e, a(dkw.et, "_bottom"))
         .a(fpq.f, a(dkw.et, "_top"))
         .a(fpq.i, a(dkw.et, "_side"))
         .a(fpq.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fpp j(ald $$0) {
      return new fpp()
         .a(fpq.c, a(dkw.fO, "_side"))
         .a(fpq.i, a(dkw.fO, "_side"))
         .a(fpq.f, a(dkw.fO, "_top"))
         .a(fpq.e, a(dkw.fO, "_bottom"))
         .a(fpq.N, a(dkw.fO, "_inner"))
         .a(fpq.O, $$0);
   }

   public static fpp a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fpp()
         .a(fpq.c, a(dkw.rz, "_bottom"))
         .a(fpq.i, a(dkw.rz, "_side"))
         .a(fpq.f, a(dkw.rz, "_top"))
         .a(fpq.P, a(dkw.rz, $$1 + "_inner_top"))
         .a(fpq.e, a(dkw.rz, "_bottom"));
   }

   public static fpp b(cxu $$0) {
      return new fpp().a(fpq.I, c($$0));
   }

   public static fpp I(dku $$0) {
      return new fpp().a(fpq.I, J($$0));
   }

   public static fpp k(ald $$0) {
      return new fpp().a(fpq.I, $$0);
   }

   public static fpp c(ald $$0, ald $$1) {
      return new fpp().a(fpq.I, $$0).a(fpq.J, $$1);
   }

   public static fpp a(ald $$0, ald $$1, ald $$2) {
      return new fpp().a(fpq.I, $$0).a(fpq.J, $$1).a(fpq.K, $$2);
   }

   public static ald J(dku $$0) {
      ald $$1 = md.e.b($$0);
      return $$1.f("block/");
   }

   public static ald a(dku $$0, String $$1) {
      ald $$2 = md.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ald c(cxu $$0) {
      ald $$1 = md.g.b($$0);
      return $$1.f("item/");
   }

   public static ald a(cxu $$0, String $$1) {
      ald $$2 = md.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
