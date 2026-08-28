import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fos {
   private final Map<fot, aku> a = Maps.newHashMap();
   private final Set<fot> b = Sets.newHashSet();

   public fos a(fot $$0, aku $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fos b(fot $$0, aku $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fot> a() {
      return this.b.stream();
   }

   public fos a(fot $$0, fot $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fos b(fot $$0, fot $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aku a(fot $$0) {
      for (fot $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aku $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fos c(fot $$0, aku $$1) {
      fos $$2 = new fos();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fos a(dke $$0) {
      aku $$1 = J($$0);
      return b($$1);
   }

   public static fos b(dke $$0) {
      aku $$1 = J($$0);
      return a($$1);
   }

   public static fos a(aku $$0) {
      return new fos().a(fot.b, $$0);
   }

   public static fos b(aku $$0) {
      return new fos().a(fot.a, $$0);
   }

   public static fos c(dke $$0) {
      return d(fot.p, J($$0));
   }

   public static fos d(dke $$0) {
      return d(fot.i, J($$0));
   }

   public static fos e(dke $$0) {
      return new fos().a(fot.p, J($$0)).a(fot.q, a($$0, "_emissive"));
   }

   public static fos c(aku $$0) {
      return d(fot.p, $$0);
   }

   public static fos f(dke $$0) {
      return d(fot.r, J($$0));
   }

   public static fos g(dke $$0) {
      return new fos().a(fot.r, J($$0)).a(fot.q, a($$0, "_emissive"));
   }

   public static fos d(aku $$0) {
      return d(fot.r, $$0);
   }

   public static fos h(dke $$0) {
      return d(fot.t, J($$0));
   }

   public static fos e(aku $$0) {
      return d(fot.t, $$0);
   }

   public static fos i(dke $$0) {
      return d(fot.u, J($$0));
   }

   public static fos j(dke $$0) {
      return new fos().a(fot.Q, J($$0)).a(fot.z, a($$0, "_stem"));
   }

   public static fos f(aku $$0) {
      return d(fot.u, $$0);
   }

   public static fos k(dke $$0) {
      return d(fot.z, J($$0));
   }

   public static fos a(dke $$0, dke $$1) {
      return new fos().a(fot.z, J($$0)).a(fot.A, J($$1));
   }

   public static fos l(dke $$0) {
      return d(fot.v, J($$0));
   }

   public static fos m(dke $$0) {
      return d(fot.y, J($$0));
   }

   public static fos g(aku $$0) {
      return d(fot.B, $$0);
   }

   public static fos b(dke $$0, dke $$1) {
      return new fos().a(fot.w, J($$0)).a(fot.x, a($$1, "_top"));
   }

   public static fos d(fot $$0, aku $$1) {
      return new fos().a($$0, $$1);
   }

   public static fos n(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.d, a($$0, "_top"));
   }

   public static fos o(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.f, a($$0, "_top"));
   }

   public static fos p(dke $$0) {
      return new fos().a(fot.r, a($$0, "_plant")).a(fot.i, a($$0, "_side")).a(fot.f, a($$0, "_top"));
   }

   public static fos q(dke $$0) {
      return new fos().a(fot.i, J($$0)).a(fot.d, a($$0, "_top")).a(fot.c, J($$0));
   }

   public static fos a(aku $$0, aku $$1) {
      return new fos().a(fot.i, $$0).a(fot.d, $$1);
   }

   public static fos r(dke $$0) {
      return new fos().a(fot.b, J($$0)).a(fot.i, a($$0, "_side")).a(fot.f, a($$0, "_top"));
   }

   public static fos s(dke $$0) {
      return new fos().a(fot.b, J($$0)).a(fot.c, a($$0, "_particle"));
   }

   public static fos t(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.f, a($$0, "_top")).a(fot.e, a($$0, "_bottom"));
   }

   public static fos u(dke $$0) {
      aku $$1 = J($$0);
      return new fos().a(fot.s, $$1).a(fot.i, $$1).a(fot.f, a($$0, "_top")).a(fot.e, a($$0, "_bottom"));
   }

   public static fos v(dke $$0) {
      aku $$1 = J($$0);
      return new fos().a(fot.b, $$1).a(fot.s, $$1).a(fot.i, $$1).a(fot.d, a($$0, "_top"));
   }

   public static fos b(aku $$0, aku $$1) {
      return new fos().a(fot.f, $$0).a(fot.e, $$1);
   }

   public static fos w(dke $$0) {
      return new fos().a(fot.f, a($$0, "_top")).a(fot.e, a($$0, "_bottom"));
   }

   public static fos x(dke $$0) {
      return new fos().a(fot.c, J($$0));
   }

   public static fos h(aku $$0) {
      return new fos().a(fot.c, $$0);
   }

   public static fos y(dke $$0) {
      return new fos().a(fot.D, a($$0, "_0"));
   }

   public static fos z(dke $$0) {
      return new fos().a(fot.D, a($$0, "_1"));
   }

   public static fos A(dke $$0) {
      return new fos().a(fot.E, J($$0));
   }

   public static fos B(dke $$0) {
      return new fos().a(fot.H, J($$0));
   }

   public static fos i(aku $$0) {
      return new fos().a(fot.H, $$0);
   }

   public static fos a(dke $$0, String $$1, String $$2) {
      return new fos().a(fot.i, a($$0, $$1)).a(fot.f, a($$0, $$2)).a(fot.e, a($$0, "_bottom"));
   }

   public static fos a(dke $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fos().a(fot.g, a($$0, $$1)).a(fot.i, a($$0, $$2)).a(fot.f, a($$0, $$3)).a(fot.e, a($$0, $$4));
   }

   public static fos a(cxd $$0) {
      return new fos().a(fot.c, c($$0));
   }

   public static fos C(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.g, a($$0, "_front")).a(fot.h, a($$0, "_back"));
   }

   public static fos D(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.g, a($$0, "_front")).a(fot.f, a($$0, "_top")).a(fot.e, a($$0, "_bottom"));
   }

   public static fos E(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.g, a($$0, "_front")).a(fot.f, a($$0, "_top"));
   }

   public static fos F(dke $$0) {
      return new fos().a(fot.i, a($$0, "_side")).a(fot.g, a($$0, "_front")).a(fot.d, a($$0, "_end"));
   }

   public static fos G(dke $$0) {
      return new fos().a(fot.f, a($$0, "_top"));
   }

   public static fos c(dke $$0, dke $$1) {
      return new fos()
         .a(fot.c, a($$0, "_front"))
         .a(fot.o, J($$1))
         .a(fot.n, a($$0, "_top"))
         .a(fot.j, a($$0, "_front"))
         .a(fot.l, a($$0, "_side"))
         .a(fot.k, a($$0, "_side"))
         .a(fot.m, a($$0, "_front"));
   }

   public static fos d(dke $$0, dke $$1) {
      return new fos()
         .a(fot.c, a($$0, "_front"))
         .a(fot.o, J($$1))
         .a(fot.n, a($$0, "_top"))
         .a(fot.j, a($$0, "_front"))
         .a(fot.k, a($$0, "_front"))
         .a(fot.l, a($$0, "_side"))
         .a(fot.m, a($$0, "_side"));
   }

   public static fos a(String $$0) {
      return new fos()
         .a(fot.c, a(dkg.mI, $$0 + "_north"))
         .a(fot.e, a(dkg.mI, $$0 + "_bottom"))
         .a(fot.f, a(dkg.mI, $$0 + "_top"))
         .a(fot.j, a(dkg.mI, $$0 + "_north"))
         .a(fot.k, a(dkg.mI, $$0 + "_south"))
         .a(fot.l, a(dkg.mI, $$0 + "_east"))
         .a(fot.m, a(dkg.mI, $$0 + "_west"));
   }

   public static fos H(dke $$0) {
      return new fos().a(fot.L, a($$0, "_log_lit")).a(fot.D, a($$0, "_fire"));
   }

   public static fos a(dke $$0, boolean $$1) {
      return new fos()
         .a(fot.c, a(dkg.et, "_side"))
         .a(fot.e, a(dkg.et, "_bottom"))
         .a(fot.f, a(dkg.et, "_top"))
         .a(fot.i, a(dkg.et, "_side"))
         .a(fot.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fos j(aku $$0) {
      return new fos()
         .a(fot.c, a(dkg.fO, "_side"))
         .a(fot.i, a(dkg.fO, "_side"))
         .a(fot.f, a(dkg.fO, "_top"))
         .a(fot.e, a(dkg.fO, "_bottom"))
         .a(fot.N, a(dkg.fO, "_inner"))
         .a(fot.O, $$0);
   }

   public static fos a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fos()
         .a(fot.c, a(dkg.rx, "_bottom"))
         .a(fot.i, a(dkg.rx, "_side"))
         .a(fot.f, a(dkg.rx, "_top"))
         .a(fot.P, a(dkg.rx, $$1 + "_inner_top"))
         .a(fot.e, a(dkg.rx, "_bottom"));
   }

   public static fos b(cxd $$0) {
      return new fos().a(fot.I, c($$0));
   }

   public static fos I(dke $$0) {
      return new fos().a(fot.I, J($$0));
   }

   public static fos k(aku $$0) {
      return new fos().a(fot.I, $$0);
   }

   public static fos c(aku $$0, aku $$1) {
      return new fos().a(fot.I, $$0).a(fot.J, $$1);
   }

   public static fos a(aku $$0, aku $$1, aku $$2) {
      return new fos().a(fot.I, $$0).a(fot.J, $$1).a(fot.K, $$2);
   }

   public static aku J(dke $$0) {
      aku $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static aku a(dke $$0, String $$1) {
      aku $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aku c(cxd $$0) {
      aku $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static aku a(cxd $$0, String $$1) {
      aku $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
