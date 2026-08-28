import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fnu {
   private final Map<fnv, akv> a = Maps.newHashMap();
   private final Set<fnv> b = Sets.newHashSet();

   public fnu a(fnv $$0, akv $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fnu b(fnv $$0, akv $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fnv> a() {
      return this.b.stream();
   }

   public fnu a(fnv $$0, fnv $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fnu b(fnv $$0, fnv $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public akv a(fnv $$0) {
      for (fnv $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         akv $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fnu c(fnv $$0, akv $$1) {
      fnu $$2 = new fnu();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fnu a(djm $$0) {
      akv $$1 = J($$0);
      return b($$1);
   }

   public static fnu b(djm $$0) {
      akv $$1 = J($$0);
      return a($$1);
   }

   public static fnu a(akv $$0) {
      return new fnu().a(fnv.b, $$0);
   }

   public static fnu b(akv $$0) {
      return new fnu().a(fnv.a, $$0);
   }

   public static fnu c(djm $$0) {
      return d(fnv.p, J($$0));
   }

   public static fnu d(djm $$0) {
      return d(fnv.i, J($$0));
   }

   public static fnu e(djm $$0) {
      return new fnu().a(fnv.p, J($$0)).a(fnv.q, a($$0, "_emissive"));
   }

   public static fnu c(akv $$0) {
      return d(fnv.p, $$0);
   }

   public static fnu f(djm $$0) {
      return d(fnv.r, J($$0));
   }

   public static fnu g(djm $$0) {
      return new fnu().a(fnv.r, J($$0)).a(fnv.q, a($$0, "_emissive"));
   }

   public static fnu d(akv $$0) {
      return d(fnv.r, $$0);
   }

   public static fnu h(djm $$0) {
      return d(fnv.t, J($$0));
   }

   public static fnu e(akv $$0) {
      return d(fnv.t, $$0);
   }

   public static fnu i(djm $$0) {
      return d(fnv.u, J($$0));
   }

   public static fnu j(djm $$0) {
      return new fnu().a(fnv.Q, J($$0)).a(fnv.z, a($$0, "_stem"));
   }

   public static fnu f(akv $$0) {
      return d(fnv.u, $$0);
   }

   public static fnu k(djm $$0) {
      return d(fnv.z, J($$0));
   }

   public static fnu a(djm $$0, djm $$1) {
      return new fnu().a(fnv.z, J($$0)).a(fnv.A, J($$1));
   }

   public static fnu l(djm $$0) {
      return d(fnv.v, J($$0));
   }

   public static fnu m(djm $$0) {
      return d(fnv.y, J($$0));
   }

   public static fnu g(akv $$0) {
      return d(fnv.B, $$0);
   }

   public static fnu b(djm $$0, djm $$1) {
      return new fnu().a(fnv.w, J($$0)).a(fnv.x, a($$1, "_top"));
   }

   public static fnu d(fnv $$0, akv $$1) {
      return new fnu().a($$0, $$1);
   }

   public static fnu n(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.d, a($$0, "_top"));
   }

   public static fnu o(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.f, a($$0, "_top"));
   }

   public static fnu p(djm $$0) {
      return new fnu().a(fnv.r, a($$0, "_plant")).a(fnv.i, a($$0, "_side")).a(fnv.f, a($$0, "_top"));
   }

   public static fnu q(djm $$0) {
      return new fnu().a(fnv.i, J($$0)).a(fnv.d, a($$0, "_top")).a(fnv.c, J($$0));
   }

   public static fnu a(akv $$0, akv $$1) {
      return new fnu().a(fnv.i, $$0).a(fnv.d, $$1);
   }

   public static fnu r(djm $$0) {
      return new fnu().a(fnv.b, J($$0)).a(fnv.i, a($$0, "_side")).a(fnv.f, a($$0, "_top"));
   }

   public static fnu s(djm $$0) {
      return new fnu().a(fnv.b, J($$0)).a(fnv.c, a($$0, "_particle"));
   }

   public static fnu t(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.f, a($$0, "_top")).a(fnv.e, a($$0, "_bottom"));
   }

   public static fnu u(djm $$0) {
      akv $$1 = J($$0);
      return new fnu().a(fnv.s, $$1).a(fnv.i, $$1).a(fnv.f, a($$0, "_top")).a(fnv.e, a($$0, "_bottom"));
   }

   public static fnu v(djm $$0) {
      akv $$1 = J($$0);
      return new fnu().a(fnv.b, $$1).a(fnv.s, $$1).a(fnv.i, $$1).a(fnv.d, a($$0, "_top"));
   }

   public static fnu b(akv $$0, akv $$1) {
      return new fnu().a(fnv.f, $$0).a(fnv.e, $$1);
   }

   public static fnu w(djm $$0) {
      return new fnu().a(fnv.f, a($$0, "_top")).a(fnv.e, a($$0, "_bottom"));
   }

   public static fnu x(djm $$0) {
      return new fnu().a(fnv.c, J($$0));
   }

   public static fnu h(akv $$0) {
      return new fnu().a(fnv.c, $$0);
   }

   public static fnu y(djm $$0) {
      return new fnu().a(fnv.D, a($$0, "_0"));
   }

   public static fnu z(djm $$0) {
      return new fnu().a(fnv.D, a($$0, "_1"));
   }

   public static fnu A(djm $$0) {
      return new fnu().a(fnv.E, J($$0));
   }

   public static fnu B(djm $$0) {
      return new fnu().a(fnv.H, J($$0));
   }

   public static fnu i(akv $$0) {
      return new fnu().a(fnv.H, $$0);
   }

   public static fnu a(djm $$0, String $$1, String $$2) {
      return new fnu().a(fnv.i, a($$0, $$1)).a(fnv.f, a($$0, $$2)).a(fnv.e, a($$0, "_bottom"));
   }

   public static fnu a(djm $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fnu().a(fnv.g, a($$0, $$1)).a(fnv.i, a($$0, $$2)).a(fnv.f, a($$0, $$3)).a(fnv.e, a($$0, $$4));
   }

   public static fnu a(cwl $$0) {
      return new fnu().a(fnv.c, c($$0));
   }

   public static fnu C(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.g, a($$0, "_front")).a(fnv.h, a($$0, "_back"));
   }

   public static fnu D(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.g, a($$0, "_front")).a(fnv.f, a($$0, "_top")).a(fnv.e, a($$0, "_bottom"));
   }

   public static fnu E(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.g, a($$0, "_front")).a(fnv.f, a($$0, "_top"));
   }

   public static fnu F(djm $$0) {
      return new fnu().a(fnv.i, a($$0, "_side")).a(fnv.g, a($$0, "_front")).a(fnv.d, a($$0, "_end"));
   }

   public static fnu G(djm $$0) {
      return new fnu().a(fnv.f, a($$0, "_top"));
   }

   public static fnu c(djm $$0, djm $$1) {
      return new fnu()
         .a(fnv.c, a($$0, "_front"))
         .a(fnv.o, J($$1))
         .a(fnv.n, a($$0, "_top"))
         .a(fnv.j, a($$0, "_front"))
         .a(fnv.l, a($$0, "_side"))
         .a(fnv.k, a($$0, "_side"))
         .a(fnv.m, a($$0, "_front"));
   }

   public static fnu d(djm $$0, djm $$1) {
      return new fnu()
         .a(fnv.c, a($$0, "_front"))
         .a(fnv.o, J($$1))
         .a(fnv.n, a($$0, "_top"))
         .a(fnv.j, a($$0, "_front"))
         .a(fnv.k, a($$0, "_front"))
         .a(fnv.l, a($$0, "_side"))
         .a(fnv.m, a($$0, "_side"));
   }

   public static fnu a(String $$0) {
      return new fnu()
         .a(fnv.c, a(djo.mI, $$0 + "_north"))
         .a(fnv.e, a(djo.mI, $$0 + "_bottom"))
         .a(fnv.f, a(djo.mI, $$0 + "_top"))
         .a(fnv.j, a(djo.mI, $$0 + "_north"))
         .a(fnv.k, a(djo.mI, $$0 + "_south"))
         .a(fnv.l, a(djo.mI, $$0 + "_east"))
         .a(fnv.m, a(djo.mI, $$0 + "_west"));
   }

   public static fnu H(djm $$0) {
      return new fnu().a(fnv.L, a($$0, "_log_lit")).a(fnv.D, a($$0, "_fire"));
   }

   public static fnu a(djm $$0, boolean $$1) {
      return new fnu()
         .a(fnv.c, a(djo.et, "_side"))
         .a(fnv.e, a(djo.et, "_bottom"))
         .a(fnv.f, a(djo.et, "_top"))
         .a(fnv.i, a(djo.et, "_side"))
         .a(fnv.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fnu j(akv $$0) {
      return new fnu()
         .a(fnv.c, a(djo.fO, "_side"))
         .a(fnv.i, a(djo.fO, "_side"))
         .a(fnv.f, a(djo.fO, "_top"))
         .a(fnv.e, a(djo.fO, "_bottom"))
         .a(fnv.N, a(djo.fO, "_inner"))
         .a(fnv.O, $$0);
   }

   public static fnu a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fnu()
         .a(fnv.c, a(djo.rx, "_bottom"))
         .a(fnv.i, a(djo.rx, "_side"))
         .a(fnv.f, a(djo.rx, "_top"))
         .a(fnv.P, a(djo.rx, $$1 + "_inner_top"))
         .a(fnv.e, a(djo.rx, "_bottom"));
   }

   public static fnu b(cwl $$0) {
      return new fnu().a(fnv.I, c($$0));
   }

   public static fnu I(djm $$0) {
      return new fnu().a(fnv.I, J($$0));
   }

   public static fnu k(akv $$0) {
      return new fnu().a(fnv.I, $$0);
   }

   public static fnu c(akv $$0, akv $$1) {
      return new fnu().a(fnv.I, $$0).a(fnv.J, $$1);
   }

   public static fnu a(akv $$0, akv $$1, akv $$2) {
      return new fnu().a(fnv.I, $$0).a(fnv.J, $$1).a(fnv.K, $$2);
   }

   public static akv J(djm $$0) {
      akv $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static akv a(djm $$0, String $$1) {
      akv $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static akv c(cwl $$0) {
      akv $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static akv a(cwl $$0, String $$1) {
      akv $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
