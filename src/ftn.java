import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ftn {
   private final Map<fto, ali> a = Maps.newHashMap();
   private final Set<fto> b = Sets.newHashSet();

   public ftn a(fto $$0, ali $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ftn b(fto $$0, ali $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fto> a() {
      return this.b.stream();
   }

   public ftn a(fto $$0, fto $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ftn b(fto $$0, fto $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ali a(fto $$0) {
      for (fto $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ali $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ftn c(fto $$0, ali $$1) {
      ftn $$2 = new ftn();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ftn a(dnc $$0) {
      ali $$1 = J($$0);
      return b($$1);
   }

   public static ftn b(dnc $$0) {
      ali $$1 = J($$0);
      return a($$1);
   }

   public static ftn a(ali $$0) {
      return new ftn().a(fto.b, $$0);
   }

   public static ftn b(ali $$0) {
      return new ftn().a(fto.a, $$0);
   }

   public static ftn c(dnc $$0) {
      return d(fto.p, J($$0));
   }

   public static ftn d(dnc $$0) {
      return d(fto.i, J($$0));
   }

   public static ftn e(dnc $$0) {
      return new ftn().a(fto.p, J($$0)).a(fto.q, a($$0, "_emissive"));
   }

   public static ftn c(ali $$0) {
      return d(fto.p, $$0);
   }

   public static ftn f(dnc $$0) {
      return d(fto.r, J($$0));
   }

   public static ftn g(dnc $$0) {
      return new ftn().a(fto.r, J($$0)).a(fto.q, a($$0, "_emissive"));
   }

   public static ftn d(ali $$0) {
      return d(fto.r, $$0);
   }

   public static ftn h(dnc $$0) {
      return d(fto.t, J($$0));
   }

   public static ftn e(ali $$0) {
      return d(fto.t, $$0);
   }

   public static ftn i(dnc $$0) {
      return d(fto.u, J($$0));
   }

   public static ftn j(dnc $$0) {
      return new ftn().a(fto.Q, J($$0)).a(fto.z, a($$0, "_stem"));
   }

   public static ftn f(ali $$0) {
      return d(fto.u, $$0);
   }

   public static ftn k(dnc $$0) {
      return d(fto.z, J($$0));
   }

   public static ftn a(dnc $$0, dnc $$1) {
      return new ftn().a(fto.z, J($$0)).a(fto.A, J($$1));
   }

   public static ftn l(dnc $$0) {
      return d(fto.v, J($$0));
   }

   public static ftn m(dnc $$0) {
      return d(fto.y, J($$0));
   }

   public static ftn g(ali $$0) {
      return d(fto.B, $$0);
   }

   public static ftn b(dnc $$0, dnc $$1) {
      return new ftn().a(fto.w, J($$0)).a(fto.x, a($$1, "_top"));
   }

   public static ftn d(fto $$0, ali $$1) {
      return new ftn().a($$0, $$1);
   }

   public static ftn n(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.d, a($$0, "_top"));
   }

   public static ftn o(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.f, a($$0, "_top"));
   }

   public static ftn p(dnc $$0) {
      return new ftn().a(fto.r, a($$0, "_plant")).a(fto.i, a($$0, "_side")).a(fto.f, a($$0, "_top"));
   }

   public static ftn q(dnc $$0) {
      return new ftn().a(fto.i, J($$0)).a(fto.d, a($$0, "_top")).a(fto.c, J($$0));
   }

   public static ftn a(ali $$0, ali $$1) {
      return new ftn().a(fto.i, $$0).a(fto.d, $$1);
   }

   public static ftn r(dnc $$0) {
      return new ftn().a(fto.b, J($$0)).a(fto.i, a($$0, "_side")).a(fto.f, a($$0, "_top"));
   }

   public static ftn s(dnc $$0) {
      return new ftn().a(fto.b, J($$0)).a(fto.c, a($$0, "_particle"));
   }

   public static ftn t(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.f, a($$0, "_top")).a(fto.e, a($$0, "_bottom"));
   }

   public static ftn u(dnc $$0) {
      ali $$1 = J($$0);
      return new ftn().a(fto.s, $$1).a(fto.i, $$1).a(fto.f, a($$0, "_top")).a(fto.e, a($$0, "_bottom"));
   }

   public static ftn v(dnc $$0) {
      ali $$1 = J($$0);
      return new ftn().a(fto.b, $$1).a(fto.s, $$1).a(fto.i, $$1).a(fto.d, a($$0, "_top"));
   }

   public static ftn b(ali $$0, ali $$1) {
      return new ftn().a(fto.f, $$0).a(fto.e, $$1);
   }

   public static ftn w(dnc $$0) {
      return new ftn().a(fto.f, a($$0, "_top")).a(fto.e, a($$0, "_bottom"));
   }

   public static ftn x(dnc $$0) {
      return new ftn().a(fto.c, J($$0));
   }

   public static ftn h(ali $$0) {
      return new ftn().a(fto.c, $$0);
   }

   public static ftn y(dnc $$0) {
      return new ftn().a(fto.D, a($$0, "_0"));
   }

   public static ftn z(dnc $$0) {
      return new ftn().a(fto.D, a($$0, "_1"));
   }

   public static ftn A(dnc $$0) {
      return new ftn().a(fto.E, J($$0));
   }

   public static ftn B(dnc $$0) {
      return new ftn().a(fto.H, J($$0));
   }

   public static ftn i(ali $$0) {
      return new ftn().a(fto.H, $$0);
   }

   public static ftn a(dnc $$0, String $$1, String $$2) {
      return new ftn().a(fto.i, a($$0, $$1)).a(fto.f, a($$0, $$2)).a(fto.e, a($$0, "_bottom"));
   }

   public static ftn a(dnc $$0, String $$1, String $$2, String $$3, String $$4) {
      return new ftn().a(fto.g, a($$0, $$1)).a(fto.i, a($$0, $$2)).a(fto.f, a($$0, $$3)).a(fto.e, a($$0, $$4));
   }

   public static ftn a(czu $$0) {
      return new ftn().a(fto.c, c($$0));
   }

   public static ftn C(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.g, a($$0, "_front")).a(fto.h, a($$0, "_back"));
   }

   public static ftn D(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.g, a($$0, "_front")).a(fto.f, a($$0, "_top")).a(fto.e, a($$0, "_bottom"));
   }

   public static ftn E(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.g, a($$0, "_front")).a(fto.f, a($$0, "_top"));
   }

   public static ftn F(dnc $$0) {
      return new ftn().a(fto.i, a($$0, "_side")).a(fto.g, a($$0, "_front")).a(fto.d, a($$0, "_end"));
   }

   public static ftn G(dnc $$0) {
      return new ftn().a(fto.f, a($$0, "_top"));
   }

   public static ftn c(dnc $$0, dnc $$1) {
      return new ftn()
         .a(fto.c, a($$0, "_front"))
         .a(fto.o, J($$1))
         .a(fto.n, a($$0, "_top"))
         .a(fto.j, a($$0, "_front"))
         .a(fto.l, a($$0, "_side"))
         .a(fto.k, a($$0, "_side"))
         .a(fto.m, a($$0, "_front"));
   }

   public static ftn d(dnc $$0, dnc $$1) {
      return new ftn()
         .a(fto.c, a($$0, "_front"))
         .a(fto.o, J($$1))
         .a(fto.n, a($$0, "_top"))
         .a(fto.j, a($$0, "_front"))
         .a(fto.k, a($$0, "_front"))
         .a(fto.l, a($$0, "_side"))
         .a(fto.m, a($$0, "_side"));
   }

   public static ftn a(String $$0) {
      return new ftn()
         .a(fto.c, a(dne.mM, $$0 + "_north"))
         .a(fto.e, a(dne.mM, $$0 + "_bottom"))
         .a(fto.f, a(dne.mM, $$0 + "_top"))
         .a(fto.j, a(dne.mM, $$0 + "_north"))
         .a(fto.k, a(dne.mM, $$0 + "_south"))
         .a(fto.l, a(dne.mM, $$0 + "_east"))
         .a(fto.m, a(dne.mM, $$0 + "_west"));
   }

   public static ftn H(dnc $$0) {
      return new ftn().a(fto.L, a($$0, "_log_lit")).a(fto.D, a($$0, "_fire"));
   }

   public static ftn a(dnc $$0, boolean $$1) {
      return new ftn()
         .a(fto.c, a(dne.ex, "_side"))
         .a(fto.e, a(dne.ex, "_bottom"))
         .a(fto.f, a(dne.ex, "_top"))
         .a(fto.i, a(dne.ex, "_side"))
         .a(fto.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static ftn j(ali $$0) {
      return new ftn()
         .a(fto.c, a(dne.fS, "_side"))
         .a(fto.i, a(dne.fS, "_side"))
         .a(fto.f, a(dne.fS, "_top"))
         .a(fto.e, a(dne.fS, "_bottom"))
         .a(fto.N, a(dne.fS, "_inner"))
         .a(fto.O, $$0);
   }

   public static ftn a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ftn()
         .a(fto.c, a(dne.rD, "_bottom"))
         .a(fto.i, a(dne.rD, "_side"))
         .a(fto.f, a(dne.rD, "_top"))
         .a(fto.P, a(dne.rD, $$1 + "_inner_top"))
         .a(fto.e, a(dne.rD, "_bottom"));
   }

   public static ftn b(czu $$0) {
      return new ftn().a(fto.I, c($$0));
   }

   public static ftn I(dnc $$0) {
      return new ftn().a(fto.I, J($$0));
   }

   public static ftn k(ali $$0) {
      return new ftn().a(fto.I, $$0);
   }

   public static ftn c(ali $$0, ali $$1) {
      return new ftn().a(fto.I, $$0).a(fto.J, $$1);
   }

   public static ftn a(ali $$0, ali $$1, ali $$2) {
      return new ftn().a(fto.I, $$0).a(fto.J, $$1).a(fto.K, $$2);
   }

   public static ali J(dnc $$0) {
      ali $$1 = mg.e.b($$0);
      return $$1.f("block/");
   }

   public static ali a(dnc $$0, String $$1) {
      ali $$2 = mg.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ali c(czu $$0) {
      ali $$1 = mg.g.b($$0);
      return $$1.f("item/");
   }

   public static ali a(czu $$0, String $$1) {
      ali $$2 = mg.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
