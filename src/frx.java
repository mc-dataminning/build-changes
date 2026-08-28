import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class frx {
   private final Map<fry, alg> a = Maps.newHashMap();
   private final Set<fry> b = Sets.newHashSet();

   public frx a(fry $$0, alg $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public frx b(fry $$0, alg $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fry> a() {
      return this.b.stream();
   }

   public frx a(fry $$0, fry $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public frx b(fry $$0, fry $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alg a(fry $$0) {
      for (fry $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alg $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public frx c(fry $$0, alg $$1) {
      frx $$2 = new frx();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static frx a(dmm $$0) {
      alg $$1 = J($$0);
      return b($$1);
   }

   public static frx b(dmm $$0) {
      alg $$1 = J($$0);
      return a($$1);
   }

   public static frx a(alg $$0) {
      return new frx().a(fry.b, $$0);
   }

   public static frx b(alg $$0) {
      return new frx().a(fry.a, $$0);
   }

   public static frx c(dmm $$0) {
      return d(fry.p, J($$0));
   }

   public static frx d(dmm $$0) {
      return d(fry.i, J($$0));
   }

   public static frx e(dmm $$0) {
      return new frx().a(fry.p, J($$0)).a(fry.q, a($$0, "_emissive"));
   }

   public static frx c(alg $$0) {
      return d(fry.p, $$0);
   }

   public static frx f(dmm $$0) {
      return d(fry.r, J($$0));
   }

   public static frx g(dmm $$0) {
      return new frx().a(fry.r, J($$0)).a(fry.q, a($$0, "_emissive"));
   }

   public static frx d(alg $$0) {
      return d(fry.r, $$0);
   }

   public static frx h(dmm $$0) {
      return d(fry.t, J($$0));
   }

   public static frx e(alg $$0) {
      return d(fry.t, $$0);
   }

   public static frx i(dmm $$0) {
      return d(fry.u, J($$0));
   }

   public static frx j(dmm $$0) {
      return new frx().a(fry.Q, J($$0)).a(fry.z, a($$0, "_stem"));
   }

   public static frx f(alg $$0) {
      return d(fry.u, $$0);
   }

   public static frx k(dmm $$0) {
      return d(fry.z, J($$0));
   }

   public static frx a(dmm $$0, dmm $$1) {
      return new frx().a(fry.z, J($$0)).a(fry.A, J($$1));
   }

   public static frx l(dmm $$0) {
      return d(fry.v, J($$0));
   }

   public static frx m(dmm $$0) {
      return d(fry.y, J($$0));
   }

   public static frx g(alg $$0) {
      return d(fry.B, $$0);
   }

   public static frx b(dmm $$0, dmm $$1) {
      return new frx().a(fry.w, J($$0)).a(fry.x, a($$1, "_top"));
   }

   public static frx d(fry $$0, alg $$1) {
      return new frx().a($$0, $$1);
   }

   public static frx n(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.d, a($$0, "_top"));
   }

   public static frx o(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.f, a($$0, "_top"));
   }

   public static frx p(dmm $$0) {
      return new frx().a(fry.r, a($$0, "_plant")).a(fry.i, a($$0, "_side")).a(fry.f, a($$0, "_top"));
   }

   public static frx q(dmm $$0) {
      return new frx().a(fry.i, J($$0)).a(fry.d, a($$0, "_top")).a(fry.c, J($$0));
   }

   public static frx a(alg $$0, alg $$1) {
      return new frx().a(fry.i, $$0).a(fry.d, $$1);
   }

   public static frx r(dmm $$0) {
      return new frx().a(fry.b, J($$0)).a(fry.i, a($$0, "_side")).a(fry.f, a($$0, "_top"));
   }

   public static frx s(dmm $$0) {
      return new frx().a(fry.b, J($$0)).a(fry.c, a($$0, "_particle"));
   }

   public static frx t(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.f, a($$0, "_top")).a(fry.e, a($$0, "_bottom"));
   }

   public static frx u(dmm $$0) {
      alg $$1 = J($$0);
      return new frx().a(fry.s, $$1).a(fry.i, $$1).a(fry.f, a($$0, "_top")).a(fry.e, a($$0, "_bottom"));
   }

   public static frx v(dmm $$0) {
      alg $$1 = J($$0);
      return new frx().a(fry.b, $$1).a(fry.s, $$1).a(fry.i, $$1).a(fry.d, a($$0, "_top"));
   }

   public static frx b(alg $$0, alg $$1) {
      return new frx().a(fry.f, $$0).a(fry.e, $$1);
   }

   public static frx w(dmm $$0) {
      return new frx().a(fry.f, a($$0, "_top")).a(fry.e, a($$0, "_bottom"));
   }

   public static frx x(dmm $$0) {
      return new frx().a(fry.c, J($$0));
   }

   public static frx h(alg $$0) {
      return new frx().a(fry.c, $$0);
   }

   public static frx y(dmm $$0) {
      return new frx().a(fry.D, a($$0, "_0"));
   }

   public static frx z(dmm $$0) {
      return new frx().a(fry.D, a($$0, "_1"));
   }

   public static frx A(dmm $$0) {
      return new frx().a(fry.E, J($$0));
   }

   public static frx B(dmm $$0) {
      return new frx().a(fry.H, J($$0));
   }

   public static frx i(alg $$0) {
      return new frx().a(fry.H, $$0);
   }

   public static frx a(dmm $$0, String $$1, String $$2) {
      return new frx().a(fry.i, a($$0, $$1)).a(fry.f, a($$0, $$2)).a(fry.e, a($$0, "_bottom"));
   }

   public static frx a(dmm $$0, String $$1, String $$2, String $$3, String $$4) {
      return new frx().a(fry.g, a($$0, $$1)).a(fry.i, a($$0, $$2)).a(fry.f, a($$0, $$3)).a(fry.e, a($$0, $$4));
   }

   public static frx a(czg $$0) {
      return new frx().a(fry.c, c($$0));
   }

   public static frx C(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.g, a($$0, "_front")).a(fry.h, a($$0, "_back"));
   }

   public static frx D(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.g, a($$0, "_front")).a(fry.f, a($$0, "_top")).a(fry.e, a($$0, "_bottom"));
   }

   public static frx E(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.g, a($$0, "_front")).a(fry.f, a($$0, "_top"));
   }

   public static frx F(dmm $$0) {
      return new frx().a(fry.i, a($$0, "_side")).a(fry.g, a($$0, "_front")).a(fry.d, a($$0, "_end"));
   }

   public static frx G(dmm $$0) {
      return new frx().a(fry.f, a($$0, "_top"));
   }

   public static frx c(dmm $$0, dmm $$1) {
      return new frx()
         .a(fry.c, a($$0, "_front"))
         .a(fry.o, J($$1))
         .a(fry.n, a($$0, "_top"))
         .a(fry.j, a($$0, "_front"))
         .a(fry.l, a($$0, "_side"))
         .a(fry.k, a($$0, "_side"))
         .a(fry.m, a($$0, "_front"));
   }

   public static frx d(dmm $$0, dmm $$1) {
      return new frx()
         .a(fry.c, a($$0, "_front"))
         .a(fry.o, J($$1))
         .a(fry.n, a($$0, "_top"))
         .a(fry.j, a($$0, "_front"))
         .a(fry.k, a($$0, "_front"))
         .a(fry.l, a($$0, "_side"))
         .a(fry.m, a($$0, "_side"));
   }

   public static frx a(String $$0) {
      return new frx()
         .a(fry.c, a(dmo.mM, $$0 + "_north"))
         .a(fry.e, a(dmo.mM, $$0 + "_bottom"))
         .a(fry.f, a(dmo.mM, $$0 + "_top"))
         .a(fry.j, a(dmo.mM, $$0 + "_north"))
         .a(fry.k, a(dmo.mM, $$0 + "_south"))
         .a(fry.l, a(dmo.mM, $$0 + "_east"))
         .a(fry.m, a(dmo.mM, $$0 + "_west"));
   }

   public static frx H(dmm $$0) {
      return new frx().a(fry.L, a($$0, "_log_lit")).a(fry.D, a($$0, "_fire"));
   }

   public static frx a(dmm $$0, boolean $$1) {
      return new frx()
         .a(fry.c, a(dmo.ex, "_side"))
         .a(fry.e, a(dmo.ex, "_bottom"))
         .a(fry.f, a(dmo.ex, "_top"))
         .a(fry.i, a(dmo.ex, "_side"))
         .a(fry.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static frx j(alg $$0) {
      return new frx()
         .a(fry.c, a(dmo.fS, "_side"))
         .a(fry.i, a(dmo.fS, "_side"))
         .a(fry.f, a(dmo.fS, "_top"))
         .a(fry.e, a(dmo.fS, "_bottom"))
         .a(fry.N, a(dmo.fS, "_inner"))
         .a(fry.O, $$0);
   }

   public static frx a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new frx()
         .a(fry.c, a(dmo.rD, "_bottom"))
         .a(fry.i, a(dmo.rD, "_side"))
         .a(fry.f, a(dmo.rD, "_top"))
         .a(fry.P, a(dmo.rD, $$1 + "_inner_top"))
         .a(fry.e, a(dmo.rD, "_bottom"));
   }

   public static frx b(czg $$0) {
      return new frx().a(fry.I, c($$0));
   }

   public static frx I(dmm $$0) {
      return new frx().a(fry.I, J($$0));
   }

   public static frx k(alg $$0) {
      return new frx().a(fry.I, $$0);
   }

   public static frx c(alg $$0, alg $$1) {
      return new frx().a(fry.I, $$0).a(fry.J, $$1);
   }

   public static frx a(alg $$0, alg $$1, alg $$2) {
      return new frx().a(fry.I, $$0).a(fry.J, $$1).a(fry.K, $$2);
   }

   public static alg J(dmm $$0) {
      alg $$1 = mg.e.b($$0);
      return $$1.f("block/");
   }

   public static alg a(dmm $$0, String $$1) {
      alg $$2 = mg.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alg c(czg $$0) {
      alg $$1 = mg.g.b($$0);
      return $$1.f("item/");
   }

   public static alg a(czg $$0, String $$1) {
      alg $$2 = mg.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
