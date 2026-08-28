import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fnv {
   private final Map<fnw, akv> a = Maps.newHashMap();
   private final Set<fnw> b = Sets.newHashSet();

   public fnv a(fnw $$0, akv $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fnv b(fnw $$0, akv $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fnw> a() {
      return this.b.stream();
   }

   public fnv a(fnw $$0, fnw $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fnv b(fnw $$0, fnw $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akv a(fnw $$0) {
      for (fnw $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akv $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fnv c(fnw $$0, akv $$1) {
      fnv $$2 = new fnv();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fnv a(djn $$0) {
      akv $$1 = J($$0);
      return b($$1);
   }

   public static fnv b(djn $$0) {
      akv $$1 = J($$0);
      return a($$1);
   }

   public static fnv a(akv $$0) {
      return new fnv().a(fnw.b, $$0);
   }

   public static fnv b(akv $$0) {
      return new fnv().a(fnw.a, $$0);
   }

   public static fnv c(djn $$0) {
      return d(fnw.p, J($$0));
   }

   public static fnv d(djn $$0) {
      return d(fnw.i, J($$0));
   }

   public static fnv e(djn $$0) {
      return new fnv().a(fnw.p, J($$0)).a(fnw.q, a($$0, "_emissive"));
   }

   public static fnv c(akv $$0) {
      return d(fnw.p, $$0);
   }

   public static fnv f(djn $$0) {
      return d(fnw.r, J($$0));
   }

   public static fnv g(djn $$0) {
      return new fnv().a(fnw.r, J($$0)).a(fnw.q, a($$0, "_emissive"));
   }

   public static fnv d(akv $$0) {
      return d(fnw.r, $$0);
   }

   public static fnv h(djn $$0) {
      return d(fnw.t, J($$0));
   }

   public static fnv e(akv $$0) {
      return d(fnw.t, $$0);
   }

   public static fnv i(djn $$0) {
      return d(fnw.u, J($$0));
   }

   public static fnv j(djn $$0) {
      return new fnv().a(fnw.Q, J($$0)).a(fnw.z, a($$0, "_stem"));
   }

   public static fnv f(akv $$0) {
      return d(fnw.u, $$0);
   }

   public static fnv k(djn $$0) {
      return d(fnw.z, J($$0));
   }

   public static fnv a(djn $$0, djn $$1) {
      return new fnv().a(fnw.z, J($$0)).a(fnw.A, J($$1));
   }

   public static fnv l(djn $$0) {
      return d(fnw.v, J($$0));
   }

   public static fnv m(djn $$0) {
      return d(fnw.y, J($$0));
   }

   public static fnv g(akv $$0) {
      return d(fnw.B, $$0);
   }

   public static fnv b(djn $$0, djn $$1) {
      return new fnv().a(fnw.w, J($$0)).a(fnw.x, a($$1, "_top"));
   }

   public static fnv d(fnw $$0, akv $$1) {
      return new fnv().a($$0, $$1);
   }

   public static fnv n(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.d, a($$0, "_top"));
   }

   public static fnv o(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.f, a($$0, "_top"));
   }

   public static fnv p(djn $$0) {
      return new fnv().a(fnw.r, a($$0, "_plant")).a(fnw.i, a($$0, "_side")).a(fnw.f, a($$0, "_top"));
   }

   public static fnv q(djn $$0) {
      return new fnv().a(fnw.i, J($$0)).a(fnw.d, a($$0, "_top")).a(fnw.c, J($$0));
   }

   public static fnv a(akv $$0, akv $$1) {
      return new fnv().a(fnw.i, $$0).a(fnw.d, $$1);
   }

   public static fnv r(djn $$0) {
      return new fnv().a(fnw.b, J($$0)).a(fnw.i, a($$0, "_side")).a(fnw.f, a($$0, "_top"));
   }

   public static fnv s(djn $$0) {
      return new fnv().a(fnw.b, J($$0)).a(fnw.c, a($$0, "_particle"));
   }

   public static fnv t(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.f, a($$0, "_top")).a(fnw.e, a($$0, "_bottom"));
   }

   public static fnv u(djn $$0) {
      akv $$1 = J($$0);
      return new fnv().a(fnw.s, $$1).a(fnw.i, $$1).a(fnw.f, a($$0, "_top")).a(fnw.e, a($$0, "_bottom"));
   }

   public static fnv v(djn $$0) {
      akv $$1 = J($$0);
      return new fnv().a(fnw.b, $$1).a(fnw.s, $$1).a(fnw.i, $$1).a(fnw.d, a($$0, "_top"));
   }

   public static fnv b(akv $$0, akv $$1) {
      return new fnv().a(fnw.f, $$0).a(fnw.e, $$1);
   }

   public static fnv w(djn $$0) {
      return new fnv().a(fnw.f, a($$0, "_top")).a(fnw.e, a($$0, "_bottom"));
   }

   public static fnv x(djn $$0) {
      return new fnv().a(fnw.c, J($$0));
   }

   public static fnv h(akv $$0) {
      return new fnv().a(fnw.c, $$0);
   }

   public static fnv y(djn $$0) {
      return new fnv().a(fnw.D, a($$0, "_0"));
   }

   public static fnv z(djn $$0) {
      return new fnv().a(fnw.D, a($$0, "_1"));
   }

   public static fnv A(djn $$0) {
      return new fnv().a(fnw.E, J($$0));
   }

   public static fnv B(djn $$0) {
      return new fnv().a(fnw.H, J($$0));
   }

   public static fnv i(akv $$0) {
      return new fnv().a(fnw.H, $$0);
   }

   public static fnv a(djn $$0, String $$1, String $$2) {
      return new fnv().a(fnw.i, a($$0, $$1)).a(fnw.f, a($$0, $$2)).a(fnw.e, a($$0, "_bottom"));
   }

   public static fnv a(djn $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fnv().a(fnw.g, a($$0, $$1)).a(fnw.i, a($$0, $$2)).a(fnw.f, a($$0, $$3)).a(fnw.e, a($$0, $$4));
   }

   public static fnv a(cwm $$0) {
      return new fnv().a(fnw.c, c($$0));
   }

   public static fnv C(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.g, a($$0, "_front")).a(fnw.h, a($$0, "_back"));
   }

   public static fnv D(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.g, a($$0, "_front")).a(fnw.f, a($$0, "_top")).a(fnw.e, a($$0, "_bottom"));
   }

   public static fnv E(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.g, a($$0, "_front")).a(fnw.f, a($$0, "_top"));
   }

   public static fnv F(djn $$0) {
      return new fnv().a(fnw.i, a($$0, "_side")).a(fnw.g, a($$0, "_front")).a(fnw.d, a($$0, "_end"));
   }

   public static fnv G(djn $$0) {
      return new fnv().a(fnw.f, a($$0, "_top"));
   }

   public static fnv c(djn $$0, djn $$1) {
      return new fnv()
         .a(fnw.c, a($$0, "_front"))
         .a(fnw.o, J($$1))
         .a(fnw.n, a($$0, "_top"))
         .a(fnw.j, a($$0, "_front"))
         .a(fnw.l, a($$0, "_side"))
         .a(fnw.k, a($$0, "_side"))
         .a(fnw.m, a($$0, "_front"));
   }

   public static fnv d(djn $$0, djn $$1) {
      return new fnv()
         .a(fnw.c, a($$0, "_front"))
         .a(fnw.o, J($$1))
         .a(fnw.n, a($$0, "_top"))
         .a(fnw.j, a($$0, "_front"))
         .a(fnw.k, a($$0, "_front"))
         .a(fnw.l, a($$0, "_side"))
         .a(fnw.m, a($$0, "_side"));
   }

   public static fnv a(String $$0) {
      return new fnv()
         .a(fnw.c, a(djp.mI, $$0 + "_north"))
         .a(fnw.e, a(djp.mI, $$0 + "_bottom"))
         .a(fnw.f, a(djp.mI, $$0 + "_top"))
         .a(fnw.j, a(djp.mI, $$0 + "_north"))
         .a(fnw.k, a(djp.mI, $$0 + "_south"))
         .a(fnw.l, a(djp.mI, $$0 + "_east"))
         .a(fnw.m, a(djp.mI, $$0 + "_west"));
   }

   public static fnv H(djn $$0) {
      return new fnv().a(fnw.L, a($$0, "_log_lit")).a(fnw.D, a($$0, "_fire"));
   }

   public static fnv a(djn $$0, boolean $$1) {
      return new fnv()
         .a(fnw.c, a(djp.et, "_side"))
         .a(fnw.e, a(djp.et, "_bottom"))
         .a(fnw.f, a(djp.et, "_top"))
         .a(fnw.i, a(djp.et, "_side"))
         .a(fnw.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fnv j(akv $$0) {
      return new fnv()
         .a(fnw.c, a(djp.fO, "_side"))
         .a(fnw.i, a(djp.fO, "_side"))
         .a(fnw.f, a(djp.fO, "_top"))
         .a(fnw.e, a(djp.fO, "_bottom"))
         .a(fnw.N, a(djp.fO, "_inner"))
         .a(fnw.O, $$0);
   }

   public static fnv a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fnv()
         .a(fnw.c, a(djp.rx, "_bottom"))
         .a(fnw.i, a(djp.rx, "_side"))
         .a(fnw.f, a(djp.rx, "_top"))
         .a(fnw.P, a(djp.rx, $$1 + "_inner_top"))
         .a(fnw.e, a(djp.rx, "_bottom"));
   }

   public static fnv b(cwm $$0) {
      return new fnv().a(fnw.I, c($$0));
   }

   public static fnv I(djn $$0) {
      return new fnv().a(fnw.I, J($$0));
   }

   public static fnv k(akv $$0) {
      return new fnv().a(fnw.I, $$0);
   }

   public static fnv c(akv $$0, akv $$1) {
      return new fnv().a(fnw.I, $$0).a(fnw.J, $$1);
   }

   public static fnv a(akv $$0, akv $$1, akv $$2) {
      return new fnv().a(fnw.I, $$0).a(fnw.J, $$1).a(fnw.K, $$2);
   }

   public static akv J(djn $$0) {
      akv $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static akv a(djn $$0, String $$1) {
      akv $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akv c(cwm $$0) {
      akv $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static akv a(cwm $$0, String $$1) {
      akv $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
