import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fsc {
   private final Map<fsd, alg> a = Maps.newHashMap();
   private final Set<fsd> b = Sets.newHashSet();

   public fsc a(fsd $$0, alg $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fsc b(fsd $$0, alg $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fsd> a() {
      return this.b.stream();
   }

   public fsc a(fsd $$0, fsd $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fsc b(fsd $$0, fsd $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alg a(fsd $$0) {
      for (fsd $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alg $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fsc c(fsd $$0, alg $$1) {
      fsc $$2 = new fsc();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fsc a(dmr $$0) {
      alg $$1 = J($$0);
      return b($$1);
   }

   public static fsc b(dmr $$0) {
      alg $$1 = J($$0);
      return a($$1);
   }

   public static fsc a(alg $$0) {
      return new fsc().a(fsd.b, $$0);
   }

   public static fsc b(alg $$0) {
      return new fsc().a(fsd.a, $$0);
   }

   public static fsc c(dmr $$0) {
      return d(fsd.p, J($$0));
   }

   public static fsc d(dmr $$0) {
      return d(fsd.i, J($$0));
   }

   public static fsc e(dmr $$0) {
      return new fsc().a(fsd.p, J($$0)).a(fsd.q, a($$0, "_emissive"));
   }

   public static fsc c(alg $$0) {
      return d(fsd.p, $$0);
   }

   public static fsc f(dmr $$0) {
      return d(fsd.r, J($$0));
   }

   public static fsc g(dmr $$0) {
      return new fsc().a(fsd.r, J($$0)).a(fsd.q, a($$0, "_emissive"));
   }

   public static fsc d(alg $$0) {
      return d(fsd.r, $$0);
   }

   public static fsc h(dmr $$0) {
      return d(fsd.t, J($$0));
   }

   public static fsc e(alg $$0) {
      return d(fsd.t, $$0);
   }

   public static fsc i(dmr $$0) {
      return d(fsd.u, J($$0));
   }

   public static fsc j(dmr $$0) {
      return new fsc().a(fsd.Q, J($$0)).a(fsd.z, a($$0, "_stem"));
   }

   public static fsc f(alg $$0) {
      return d(fsd.u, $$0);
   }

   public static fsc k(dmr $$0) {
      return d(fsd.z, J($$0));
   }

   public static fsc a(dmr $$0, dmr $$1) {
      return new fsc().a(fsd.z, J($$0)).a(fsd.A, J($$1));
   }

   public static fsc l(dmr $$0) {
      return d(fsd.v, J($$0));
   }

   public static fsc m(dmr $$0) {
      return d(fsd.y, J($$0));
   }

   public static fsc g(alg $$0) {
      return d(fsd.B, $$0);
   }

   public static fsc b(dmr $$0, dmr $$1) {
      return new fsc().a(fsd.w, J($$0)).a(fsd.x, a($$1, "_top"));
   }

   public static fsc d(fsd $$0, alg $$1) {
      return new fsc().a($$0, $$1);
   }

   public static fsc n(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.d, a($$0, "_top"));
   }

   public static fsc o(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.f, a($$0, "_top"));
   }

   public static fsc p(dmr $$0) {
      return new fsc().a(fsd.r, a($$0, "_plant")).a(fsd.i, a($$0, "_side")).a(fsd.f, a($$0, "_top"));
   }

   public static fsc q(dmr $$0) {
      return new fsc().a(fsd.i, J($$0)).a(fsd.d, a($$0, "_top")).a(fsd.c, J($$0));
   }

   public static fsc a(alg $$0, alg $$1) {
      return new fsc().a(fsd.i, $$0).a(fsd.d, $$1);
   }

   public static fsc r(dmr $$0) {
      return new fsc().a(fsd.b, J($$0)).a(fsd.i, a($$0, "_side")).a(fsd.f, a($$0, "_top"));
   }

   public static fsc s(dmr $$0) {
      return new fsc().a(fsd.b, J($$0)).a(fsd.c, a($$0, "_particle"));
   }

   public static fsc t(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.f, a($$0, "_top")).a(fsd.e, a($$0, "_bottom"));
   }

   public static fsc u(dmr $$0) {
      alg $$1 = J($$0);
      return new fsc().a(fsd.s, $$1).a(fsd.i, $$1).a(fsd.f, a($$0, "_top")).a(fsd.e, a($$0, "_bottom"));
   }

   public static fsc v(dmr $$0) {
      alg $$1 = J($$0);
      return new fsc().a(fsd.b, $$1).a(fsd.s, $$1).a(fsd.i, $$1).a(fsd.d, a($$0, "_top"));
   }

   public static fsc b(alg $$0, alg $$1) {
      return new fsc().a(fsd.f, $$0).a(fsd.e, $$1);
   }

   public static fsc w(dmr $$0) {
      return new fsc().a(fsd.f, a($$0, "_top")).a(fsd.e, a($$0, "_bottom"));
   }

   public static fsc x(dmr $$0) {
      return new fsc().a(fsd.c, J($$0));
   }

   public static fsc h(alg $$0) {
      return new fsc().a(fsd.c, $$0);
   }

   public static fsc y(dmr $$0) {
      return new fsc().a(fsd.D, a($$0, "_0"));
   }

   public static fsc z(dmr $$0) {
      return new fsc().a(fsd.D, a($$0, "_1"));
   }

   public static fsc A(dmr $$0) {
      return new fsc().a(fsd.E, J($$0));
   }

   public static fsc B(dmr $$0) {
      return new fsc().a(fsd.H, J($$0));
   }

   public static fsc i(alg $$0) {
      return new fsc().a(fsd.H, $$0);
   }

   public static fsc a(dmr $$0, String $$1, String $$2) {
      return new fsc().a(fsd.i, a($$0, $$1)).a(fsd.f, a($$0, $$2)).a(fsd.e, a($$0, "_bottom"));
   }

   public static fsc a(dmr $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fsc().a(fsd.g, a($$0, $$1)).a(fsd.i, a($$0, $$2)).a(fsd.f, a($$0, $$3)).a(fsd.e, a($$0, $$4));
   }

   public static fsc a(czj $$0) {
      return new fsc().a(fsd.c, c($$0));
   }

   public static fsc C(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.g, a($$0, "_front")).a(fsd.h, a($$0, "_back"));
   }

   public static fsc D(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.g, a($$0, "_front")).a(fsd.f, a($$0, "_top")).a(fsd.e, a($$0, "_bottom"));
   }

   public static fsc E(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.g, a($$0, "_front")).a(fsd.f, a($$0, "_top"));
   }

   public static fsc F(dmr $$0) {
      return new fsc().a(fsd.i, a($$0, "_side")).a(fsd.g, a($$0, "_front")).a(fsd.d, a($$0, "_end"));
   }

   public static fsc G(dmr $$0) {
      return new fsc().a(fsd.f, a($$0, "_top"));
   }

   public static fsc c(dmr $$0, dmr $$1) {
      return new fsc()
         .a(fsd.c, a($$0, "_front"))
         .a(fsd.o, J($$1))
         .a(fsd.n, a($$0, "_top"))
         .a(fsd.j, a($$0, "_front"))
         .a(fsd.l, a($$0, "_side"))
         .a(fsd.k, a($$0, "_side"))
         .a(fsd.m, a($$0, "_front"));
   }

   public static fsc d(dmr $$0, dmr $$1) {
      return new fsc()
         .a(fsd.c, a($$0, "_front"))
         .a(fsd.o, J($$1))
         .a(fsd.n, a($$0, "_top"))
         .a(fsd.j, a($$0, "_front"))
         .a(fsd.k, a($$0, "_front"))
         .a(fsd.l, a($$0, "_side"))
         .a(fsd.m, a($$0, "_side"));
   }

   public static fsc a(String $$0) {
      return new fsc()
         .a(fsd.c, a(dmt.mM, $$0 + "_north"))
         .a(fsd.e, a(dmt.mM, $$0 + "_bottom"))
         .a(fsd.f, a(dmt.mM, $$0 + "_top"))
         .a(fsd.j, a(dmt.mM, $$0 + "_north"))
         .a(fsd.k, a(dmt.mM, $$0 + "_south"))
         .a(fsd.l, a(dmt.mM, $$0 + "_east"))
         .a(fsd.m, a(dmt.mM, $$0 + "_west"));
   }

   public static fsc H(dmr $$0) {
      return new fsc().a(fsd.L, a($$0, "_log_lit")).a(fsd.D, a($$0, "_fire"));
   }

   public static fsc a(dmr $$0, boolean $$1) {
      return new fsc()
         .a(fsd.c, a(dmt.ex, "_side"))
         .a(fsd.e, a(dmt.ex, "_bottom"))
         .a(fsd.f, a(dmt.ex, "_top"))
         .a(fsd.i, a(dmt.ex, "_side"))
         .a(fsd.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fsc j(alg $$0) {
      return new fsc()
         .a(fsd.c, a(dmt.fS, "_side"))
         .a(fsd.i, a(dmt.fS, "_side"))
         .a(fsd.f, a(dmt.fS, "_top"))
         .a(fsd.e, a(dmt.fS, "_bottom"))
         .a(fsd.N, a(dmt.fS, "_inner"))
         .a(fsd.O, $$0);
   }

   public static fsc a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fsc()
         .a(fsd.c, a(dmt.rD, "_bottom"))
         .a(fsd.i, a(dmt.rD, "_side"))
         .a(fsd.f, a(dmt.rD, "_top"))
         .a(fsd.P, a(dmt.rD, $$1 + "_inner_top"))
         .a(fsd.e, a(dmt.rD, "_bottom"));
   }

   public static fsc b(czj $$0) {
      return new fsc().a(fsd.I, c($$0));
   }

   public static fsc I(dmr $$0) {
      return new fsc().a(fsd.I, J($$0));
   }

   public static fsc k(alg $$0) {
      return new fsc().a(fsd.I, $$0);
   }

   public static fsc c(alg $$0, alg $$1) {
      return new fsc().a(fsd.I, $$0).a(fsd.J, $$1);
   }

   public static fsc a(alg $$0, alg $$1, alg $$2) {
      return new fsc().a(fsd.I, $$0).a(fsd.J, $$1).a(fsd.K, $$2);
   }

   public static alg J(dmr $$0) {
      alg $$1 = mg.e.b($$0);
      return $$1.f("block/");
   }

   public static alg a(dmr $$0, String $$1) {
      alg $$2 = mg.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alg c(czj $$0) {
      alg $$1 = mg.g.b($$0);
      return $$1.f("item/");
   }

   public static alg a(czj $$0, String $$1) {
      alg $$2 = mg.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
