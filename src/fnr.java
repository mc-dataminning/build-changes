import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fnr {
   private final Map<fns, aku> a = Maps.newHashMap();
   private final Set<fns> b = Sets.newHashSet();

   public fnr a(fns $$0, aku $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fnr b(fns $$0, aku $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fns> a() {
      return this.b.stream();
   }

   public fnr a(fns $$0, fns $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fnr b(fns $$0, fns $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aku a(fns $$0) {
      for (fns $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aku $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fnr c(fns $$0, aku $$1) {
      fnr $$2 = new fnr();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fnr a(djk $$0) {
      aku $$1 = J($$0);
      return b($$1);
   }

   public static fnr b(djk $$0) {
      aku $$1 = J($$0);
      return a($$1);
   }

   public static fnr a(aku $$0) {
      return new fnr().a(fns.b, $$0);
   }

   public static fnr b(aku $$0) {
      return new fnr().a(fns.a, $$0);
   }

   public static fnr c(djk $$0) {
      return d(fns.p, J($$0));
   }

   public static fnr d(djk $$0) {
      return d(fns.i, J($$0));
   }

   public static fnr e(djk $$0) {
      return new fnr().a(fns.p, J($$0)).a(fns.q, a($$0, "_emissive"));
   }

   public static fnr c(aku $$0) {
      return d(fns.p, $$0);
   }

   public static fnr f(djk $$0) {
      return d(fns.r, J($$0));
   }

   public static fnr g(djk $$0) {
      return new fnr().a(fns.r, J($$0)).a(fns.q, a($$0, "_emissive"));
   }

   public static fnr d(aku $$0) {
      return d(fns.r, $$0);
   }

   public static fnr h(djk $$0) {
      return d(fns.t, J($$0));
   }

   public static fnr e(aku $$0) {
      return d(fns.t, $$0);
   }

   public static fnr i(djk $$0) {
      return d(fns.u, J($$0));
   }

   public static fnr j(djk $$0) {
      return new fnr().a(fns.Q, J($$0)).a(fns.z, a($$0, "_stem"));
   }

   public static fnr f(aku $$0) {
      return d(fns.u, $$0);
   }

   public static fnr k(djk $$0) {
      return d(fns.z, J($$0));
   }

   public static fnr a(djk $$0, djk $$1) {
      return new fnr().a(fns.z, J($$0)).a(fns.A, J($$1));
   }

   public static fnr l(djk $$0) {
      return d(fns.v, J($$0));
   }

   public static fnr m(djk $$0) {
      return d(fns.y, J($$0));
   }

   public static fnr g(aku $$0) {
      return d(fns.B, $$0);
   }

   public static fnr b(djk $$0, djk $$1) {
      return new fnr().a(fns.w, J($$0)).a(fns.x, a($$1, "_top"));
   }

   public static fnr d(fns $$0, aku $$1) {
      return new fnr().a($$0, $$1);
   }

   public static fnr n(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.d, a($$0, "_top"));
   }

   public static fnr o(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.f, a($$0, "_top"));
   }

   public static fnr p(djk $$0) {
      return new fnr().a(fns.r, a($$0, "_plant")).a(fns.i, a($$0, "_side")).a(fns.f, a($$0, "_top"));
   }

   public static fnr q(djk $$0) {
      return new fnr().a(fns.i, J($$0)).a(fns.d, a($$0, "_top")).a(fns.c, J($$0));
   }

   public static fnr a(aku $$0, aku $$1) {
      return new fnr().a(fns.i, $$0).a(fns.d, $$1);
   }

   public static fnr r(djk $$0) {
      return new fnr().a(fns.b, J($$0)).a(fns.i, a($$0, "_side")).a(fns.f, a($$0, "_top"));
   }

   public static fnr s(djk $$0) {
      return new fnr().a(fns.b, J($$0)).a(fns.c, a($$0, "_particle"));
   }

   public static fnr t(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.f, a($$0, "_top")).a(fns.e, a($$0, "_bottom"));
   }

   public static fnr u(djk $$0) {
      aku $$1 = J($$0);
      return new fnr().a(fns.s, $$1).a(fns.i, $$1).a(fns.f, a($$0, "_top")).a(fns.e, a($$0, "_bottom"));
   }

   public static fnr v(djk $$0) {
      aku $$1 = J($$0);
      return new fnr().a(fns.b, $$1).a(fns.s, $$1).a(fns.i, $$1).a(fns.d, a($$0, "_top"));
   }

   public static fnr b(aku $$0, aku $$1) {
      return new fnr().a(fns.f, $$0).a(fns.e, $$1);
   }

   public static fnr w(djk $$0) {
      return new fnr().a(fns.f, a($$0, "_top")).a(fns.e, a($$0, "_bottom"));
   }

   public static fnr x(djk $$0) {
      return new fnr().a(fns.c, J($$0));
   }

   public static fnr h(aku $$0) {
      return new fnr().a(fns.c, $$0);
   }

   public static fnr y(djk $$0) {
      return new fnr().a(fns.D, a($$0, "_0"));
   }

   public static fnr z(djk $$0) {
      return new fnr().a(fns.D, a($$0, "_1"));
   }

   public static fnr A(djk $$0) {
      return new fnr().a(fns.E, J($$0));
   }

   public static fnr B(djk $$0) {
      return new fnr().a(fns.H, J($$0));
   }

   public static fnr i(aku $$0) {
      return new fnr().a(fns.H, $$0);
   }

   public static fnr a(djk $$0, String $$1, String $$2) {
      return new fnr().a(fns.i, a($$0, $$1)).a(fns.f, a($$0, $$2)).a(fns.e, a($$0, "_bottom"));
   }

   public static fnr a(djk $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fnr().a(fns.g, a($$0, $$1)).a(fns.i, a($$0, $$2)).a(fns.f, a($$0, $$3)).a(fns.e, a($$0, $$4));
   }

   public static fnr a(cwj $$0) {
      return new fnr().a(fns.c, c($$0));
   }

   public static fnr C(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.g, a($$0, "_front")).a(fns.h, a($$0, "_back"));
   }

   public static fnr D(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.g, a($$0, "_front")).a(fns.f, a($$0, "_top")).a(fns.e, a($$0, "_bottom"));
   }

   public static fnr E(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.g, a($$0, "_front")).a(fns.f, a($$0, "_top"));
   }

   public static fnr F(djk $$0) {
      return new fnr().a(fns.i, a($$0, "_side")).a(fns.g, a($$0, "_front")).a(fns.d, a($$0, "_end"));
   }

   public static fnr G(djk $$0) {
      return new fnr().a(fns.f, a($$0, "_top"));
   }

   public static fnr c(djk $$0, djk $$1) {
      return new fnr()
         .a(fns.c, a($$0, "_front"))
         .a(fns.o, J($$1))
         .a(fns.n, a($$0, "_top"))
         .a(fns.j, a($$0, "_front"))
         .a(fns.l, a($$0, "_side"))
         .a(fns.k, a($$0, "_side"))
         .a(fns.m, a($$0, "_front"));
   }

   public static fnr d(djk $$0, djk $$1) {
      return new fnr()
         .a(fns.c, a($$0, "_front"))
         .a(fns.o, J($$1))
         .a(fns.n, a($$0, "_top"))
         .a(fns.j, a($$0, "_front"))
         .a(fns.k, a($$0, "_front"))
         .a(fns.l, a($$0, "_side"))
         .a(fns.m, a($$0, "_side"));
   }

   public static fnr a(String $$0) {
      return new fnr()
         .a(fns.c, a(djm.mI, $$0 + "_north"))
         .a(fns.e, a(djm.mI, $$0 + "_bottom"))
         .a(fns.f, a(djm.mI, $$0 + "_top"))
         .a(fns.j, a(djm.mI, $$0 + "_north"))
         .a(fns.k, a(djm.mI, $$0 + "_south"))
         .a(fns.l, a(djm.mI, $$0 + "_east"))
         .a(fns.m, a(djm.mI, $$0 + "_west"));
   }

   public static fnr H(djk $$0) {
      return new fnr().a(fns.L, a($$0, "_log_lit")).a(fns.D, a($$0, "_fire"));
   }

   public static fnr a(djk $$0, boolean $$1) {
      return new fnr()
         .a(fns.c, a(djm.et, "_side"))
         .a(fns.e, a(djm.et, "_bottom"))
         .a(fns.f, a(djm.et, "_top"))
         .a(fns.i, a(djm.et, "_side"))
         .a(fns.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fnr j(aku $$0) {
      return new fnr()
         .a(fns.c, a(djm.fO, "_side"))
         .a(fns.i, a(djm.fO, "_side"))
         .a(fns.f, a(djm.fO, "_top"))
         .a(fns.e, a(djm.fO, "_bottom"))
         .a(fns.N, a(djm.fO, "_inner"))
         .a(fns.O, $$0);
   }

   public static fnr a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fnr()
         .a(fns.c, a(djm.rx, "_bottom"))
         .a(fns.i, a(djm.rx, "_side"))
         .a(fns.f, a(djm.rx, "_top"))
         .a(fns.P, a(djm.rx, $$1 + "_inner_top"))
         .a(fns.e, a(djm.rx, "_bottom"));
   }

   public static fnr b(cwj $$0) {
      return new fnr().a(fns.I, c($$0));
   }

   public static fnr I(djk $$0) {
      return new fnr().a(fns.I, J($$0));
   }

   public static fnr k(aku $$0) {
      return new fnr().a(fns.I, $$0);
   }

   public static fnr c(aku $$0, aku $$1) {
      return new fnr().a(fns.I, $$0).a(fns.J, $$1);
   }

   public static fnr a(aku $$0, aku $$1, aku $$2) {
      return new fnr().a(fns.I, $$0).a(fns.J, $$1).a(fns.K, $$2);
   }

   public static aku J(djk $$0) {
      aku $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static aku a(djk $$0, String $$1) {
      aku $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aku c(cwj $$0) {
      aku $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static aku a(cwj $$0, String $$1) {
      aku $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
