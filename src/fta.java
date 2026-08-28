import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fta {
   private final Map<ftb, alr> a = Maps.newHashMap();
   private final Set<ftb> b = Sets.newHashSet();

   public fta a(ftb $$0, alr $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fta b(ftb $$0, alr $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ftb> a() {
      return this.b.stream();
   }

   public fta a(ftb $$0, ftb $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fta b(ftb $$0, ftb $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alr a(ftb $$0) {
      for (ftb $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alr $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fta c(ftb $$0, alr $$1) {
      fta $$2 = new fta();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fta a(dno $$0) {
      alr $$1 = J($$0);
      return b($$1);
   }

   public static fta b(dno $$0) {
      alr $$1 = J($$0);
      return a($$1);
   }

   public static fta a(alr $$0) {
      return new fta().a(ftb.b, $$0);
   }

   public static fta b(alr $$0) {
      return new fta().a(ftb.a, $$0);
   }

   public static fta c(dno $$0) {
      return d(ftb.p, J($$0));
   }

   public static fta d(dno $$0) {
      return d(ftb.i, J($$0));
   }

   public static fta e(dno $$0) {
      return new fta().a(ftb.p, J($$0)).a(ftb.q, a($$0, "_emissive"));
   }

   public static fta c(alr $$0) {
      return d(ftb.p, $$0);
   }

   public static fta f(dno $$0) {
      return d(ftb.r, J($$0));
   }

   public static fta g(dno $$0) {
      return new fta().a(ftb.r, J($$0)).a(ftb.q, a($$0, "_emissive"));
   }

   public static fta d(alr $$0) {
      return d(ftb.r, $$0);
   }

   public static fta h(dno $$0) {
      return d(ftb.t, J($$0));
   }

   public static fta e(alr $$0) {
      return d(ftb.t, $$0);
   }

   public static fta i(dno $$0) {
      return d(ftb.u, J($$0));
   }

   public static fta j(dno $$0) {
      return new fta().a(ftb.Q, J($$0)).a(ftb.z, a($$0, "_stem"));
   }

   public static fta f(alr $$0) {
      return d(ftb.u, $$0);
   }

   public static fta k(dno $$0) {
      return d(ftb.z, J($$0));
   }

   public static fta a(dno $$0, dno $$1) {
      return new fta().a(ftb.z, J($$0)).a(ftb.A, J($$1));
   }

   public static fta l(dno $$0) {
      return d(ftb.v, J($$0));
   }

   public static fta m(dno $$0) {
      return d(ftb.y, J($$0));
   }

   public static fta g(alr $$0) {
      return d(ftb.B, $$0);
   }

   public static fta b(dno $$0, dno $$1) {
      return new fta().a(ftb.w, J($$0)).a(ftb.x, a($$1, "_top"));
   }

   public static fta d(ftb $$0, alr $$1) {
      return new fta().a($$0, $$1);
   }

   public static fta n(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.d, a($$0, "_top"));
   }

   public static fta o(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.f, a($$0, "_top"));
   }

   public static fta p(dno $$0) {
      return new fta().a(ftb.r, a($$0, "_plant")).a(ftb.i, a($$0, "_side")).a(ftb.f, a($$0, "_top"));
   }

   public static fta q(dno $$0) {
      return new fta().a(ftb.i, J($$0)).a(ftb.d, a($$0, "_top")).a(ftb.c, J($$0));
   }

   public static fta a(alr $$0, alr $$1) {
      return new fta().a(ftb.i, $$0).a(ftb.d, $$1);
   }

   public static fta r(dno $$0) {
      return new fta().a(ftb.b, J($$0)).a(ftb.i, a($$0, "_side")).a(ftb.f, a($$0, "_top"));
   }

   public static fta s(dno $$0) {
      return new fta().a(ftb.b, J($$0)).a(ftb.c, a($$0, "_particle"));
   }

   public static fta t(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.f, a($$0, "_top")).a(ftb.e, a($$0, "_bottom"));
   }

   public static fta u(dno $$0) {
      alr $$1 = J($$0);
      return new fta().a(ftb.s, $$1).a(ftb.i, $$1).a(ftb.f, a($$0, "_top")).a(ftb.e, a($$0, "_bottom"));
   }

   public static fta v(dno $$0) {
      alr $$1 = J($$0);
      return new fta().a(ftb.b, $$1).a(ftb.s, $$1).a(ftb.i, $$1).a(ftb.d, a($$0, "_top"));
   }

   public static fta b(alr $$0, alr $$1) {
      return new fta().a(ftb.f, $$0).a(ftb.e, $$1);
   }

   public static fta w(dno $$0) {
      return new fta().a(ftb.f, a($$0, "_top")).a(ftb.e, a($$0, "_bottom"));
   }

   public static fta x(dno $$0) {
      return new fta().a(ftb.c, J($$0));
   }

   public static fta h(alr $$0) {
      return new fta().a(ftb.c, $$0);
   }

   public static fta y(dno $$0) {
      return new fta().a(ftb.D, a($$0, "_0"));
   }

   public static fta z(dno $$0) {
      return new fta().a(ftb.D, a($$0, "_1"));
   }

   public static fta A(dno $$0) {
      return new fta().a(ftb.E, J($$0));
   }

   public static fta B(dno $$0) {
      return new fta().a(ftb.H, J($$0));
   }

   public static fta i(alr $$0) {
      return new fta().a(ftb.H, $$0);
   }

   public static fta a(dno $$0, String $$1, String $$2) {
      return new fta().a(ftb.i, a($$0, $$1)).a(ftb.f, a($$0, $$2)).a(ftb.e, a($$0, "_bottom"));
   }

   public static fta a(dno $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fta().a(ftb.g, a($$0, $$1)).a(ftb.i, a($$0, $$2)).a(ftb.f, a($$0, $$3)).a(ftb.e, a($$0, $$4));
   }

   public static fta a(dag $$0) {
      return new fta().a(ftb.c, c($$0));
   }

   public static fta C(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.g, a($$0, "_front")).a(ftb.h, a($$0, "_back"));
   }

   public static fta D(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.g, a($$0, "_front")).a(ftb.f, a($$0, "_top")).a(ftb.e, a($$0, "_bottom"));
   }

   public static fta E(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.g, a($$0, "_front")).a(ftb.f, a($$0, "_top"));
   }

   public static fta F(dno $$0) {
      return new fta().a(ftb.i, a($$0, "_side")).a(ftb.g, a($$0, "_front")).a(ftb.d, a($$0, "_end"));
   }

   public static fta G(dno $$0) {
      return new fta().a(ftb.f, a($$0, "_top"));
   }

   public static fta c(dno $$0, dno $$1) {
      return new fta()
         .a(ftb.c, a($$0, "_front"))
         .a(ftb.o, J($$1))
         .a(ftb.n, a($$0, "_top"))
         .a(ftb.j, a($$0, "_front"))
         .a(ftb.l, a($$0, "_side"))
         .a(ftb.k, a($$0, "_side"))
         .a(ftb.m, a($$0, "_front"));
   }

   public static fta d(dno $$0, dno $$1) {
      return new fta()
         .a(ftb.c, a($$0, "_front"))
         .a(ftb.o, J($$1))
         .a(ftb.n, a($$0, "_top"))
         .a(ftb.j, a($$0, "_front"))
         .a(ftb.k, a($$0, "_front"))
         .a(ftb.l, a($$0, "_side"))
         .a(ftb.m, a($$0, "_side"));
   }

   public static fta a(String $$0) {
      return new fta()
         .a(ftb.c, a(dnq.mM, $$0 + "_north"))
         .a(ftb.e, a(dnq.mM, $$0 + "_bottom"))
         .a(ftb.f, a(dnq.mM, $$0 + "_top"))
         .a(ftb.j, a(dnq.mM, $$0 + "_north"))
         .a(ftb.k, a(dnq.mM, $$0 + "_south"))
         .a(ftb.l, a(dnq.mM, $$0 + "_east"))
         .a(ftb.m, a(dnq.mM, $$0 + "_west"));
   }

   public static fta H(dno $$0) {
      return new fta().a(ftb.L, a($$0, "_log_lit")).a(ftb.D, a($$0, "_fire"));
   }

   public static fta a(dno $$0, boolean $$1) {
      return new fta()
         .a(ftb.c, a(dnq.ex, "_side"))
         .a(ftb.e, a(dnq.ex, "_bottom"))
         .a(ftb.f, a(dnq.ex, "_top"))
         .a(ftb.i, a(dnq.ex, "_side"))
         .a(ftb.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fta j(alr $$0) {
      return new fta()
         .a(ftb.c, a(dnq.fS, "_side"))
         .a(ftb.i, a(dnq.fS, "_side"))
         .a(ftb.f, a(dnq.fS, "_top"))
         .a(ftb.e, a(dnq.fS, "_bottom"))
         .a(ftb.N, a(dnq.fS, "_inner"))
         .a(ftb.O, $$0);
   }

   public static fta a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fta()
         .a(ftb.c, a(dnq.rD, "_bottom"))
         .a(ftb.i, a(dnq.rD, "_side"))
         .a(ftb.f, a(dnq.rD, "_top"))
         .a(ftb.P, a(dnq.rD, $$1 + "_inner_top"))
         .a(ftb.e, a(dnq.rD, "_bottom"));
   }

   public static fta b(dag $$0) {
      return new fta().a(ftb.I, c($$0));
   }

   public static fta I(dno $$0) {
      return new fta().a(ftb.I, J($$0));
   }

   public static fta k(alr $$0) {
      return new fta().a(ftb.I, $$0);
   }

   public static fta c(alr $$0, alr $$1) {
      return new fta().a(ftb.I, $$0).a(ftb.J, $$1);
   }

   public static fta a(alr $$0, alr $$1, alr $$2) {
      return new fta().a(ftb.I, $$0).a(ftb.J, $$1).a(ftb.K, $$2);
   }

   public static alr J(dno $$0) {
      alr $$1 = mh.e.b($$0);
      return $$1.f("block/");
   }

   public static alr a(dno $$0, String $$1) {
      alr $$2 = mh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alr c(dag $$0) {
      alr $$1 = mh.g.b($$0);
      return $$1.f("item/");
   }

   public static alr a(dag $$0, String $$1) {
      alr $$2 = mh.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
