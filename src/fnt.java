import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fnt {
   private final Map<fnu, aku> a = Maps.newHashMap();
   private final Set<fnu> b = Sets.newHashSet();

   public fnt a(fnu $$0, aku $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fnt b(fnu $$0, aku $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fnu> a() {
      return this.b.stream();
   }

   public fnt a(fnu $$0, fnu $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fnt b(fnu $$0, fnu $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public aku a(fnu $$0) {
      for (fnu $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         aku $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fnt c(fnu $$0, aku $$1) {
      fnt $$2 = new fnt();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fnt a(djm $$0) {
      aku $$1 = J($$0);
      return b($$1);
   }

   public static fnt b(djm $$0) {
      aku $$1 = J($$0);
      return a($$1);
   }

   public static fnt a(aku $$0) {
      return new fnt().a(fnu.b, $$0);
   }

   public static fnt b(aku $$0) {
      return new fnt().a(fnu.a, $$0);
   }

   public static fnt c(djm $$0) {
      return d(fnu.p, J($$0));
   }

   public static fnt d(djm $$0) {
      return d(fnu.i, J($$0));
   }

   public static fnt e(djm $$0) {
      return new fnt().a(fnu.p, J($$0)).a(fnu.q, a($$0, "_emissive"));
   }

   public static fnt c(aku $$0) {
      return d(fnu.p, $$0);
   }

   public static fnt f(djm $$0) {
      return d(fnu.r, J($$0));
   }

   public static fnt g(djm $$0) {
      return new fnt().a(fnu.r, J($$0)).a(fnu.q, a($$0, "_emissive"));
   }

   public static fnt d(aku $$0) {
      return d(fnu.r, $$0);
   }

   public static fnt h(djm $$0) {
      return d(fnu.t, J($$0));
   }

   public static fnt e(aku $$0) {
      return d(fnu.t, $$0);
   }

   public static fnt i(djm $$0) {
      return d(fnu.u, J($$0));
   }

   public static fnt j(djm $$0) {
      return new fnt().a(fnu.Q, J($$0)).a(fnu.z, a($$0, "_stem"));
   }

   public static fnt f(aku $$0) {
      return d(fnu.u, $$0);
   }

   public static fnt k(djm $$0) {
      return d(fnu.z, J($$0));
   }

   public static fnt a(djm $$0, djm $$1) {
      return new fnt().a(fnu.z, J($$0)).a(fnu.A, J($$1));
   }

   public static fnt l(djm $$0) {
      return d(fnu.v, J($$0));
   }

   public static fnt m(djm $$0) {
      return d(fnu.y, J($$0));
   }

   public static fnt g(aku $$0) {
      return d(fnu.B, $$0);
   }

   public static fnt b(djm $$0, djm $$1) {
      return new fnt().a(fnu.w, J($$0)).a(fnu.x, a($$1, "_top"));
   }

   public static fnt d(fnu $$0, aku $$1) {
      return new fnt().a($$0, $$1);
   }

   public static fnt n(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.d, a($$0, "_top"));
   }

   public static fnt o(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.f, a($$0, "_top"));
   }

   public static fnt p(djm $$0) {
      return new fnt().a(fnu.r, a($$0, "_plant")).a(fnu.i, a($$0, "_side")).a(fnu.f, a($$0, "_top"));
   }

   public static fnt q(djm $$0) {
      return new fnt().a(fnu.i, J($$0)).a(fnu.d, a($$0, "_top")).a(fnu.c, J($$0));
   }

   public static fnt a(aku $$0, aku $$1) {
      return new fnt().a(fnu.i, $$0).a(fnu.d, $$1);
   }

   public static fnt r(djm $$0) {
      return new fnt().a(fnu.b, J($$0)).a(fnu.i, a($$0, "_side")).a(fnu.f, a($$0, "_top"));
   }

   public static fnt s(djm $$0) {
      return new fnt().a(fnu.b, J($$0)).a(fnu.c, a($$0, "_particle"));
   }

   public static fnt t(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.f, a($$0, "_top")).a(fnu.e, a($$0, "_bottom"));
   }

   public static fnt u(djm $$0) {
      aku $$1 = J($$0);
      return new fnt().a(fnu.s, $$1).a(fnu.i, $$1).a(fnu.f, a($$0, "_top")).a(fnu.e, a($$0, "_bottom"));
   }

   public static fnt v(djm $$0) {
      aku $$1 = J($$0);
      return new fnt().a(fnu.b, $$1).a(fnu.s, $$1).a(fnu.i, $$1).a(fnu.d, a($$0, "_top"));
   }

   public static fnt b(aku $$0, aku $$1) {
      return new fnt().a(fnu.f, $$0).a(fnu.e, $$1);
   }

   public static fnt w(djm $$0) {
      return new fnt().a(fnu.f, a($$0, "_top")).a(fnu.e, a($$0, "_bottom"));
   }

   public static fnt x(djm $$0) {
      return new fnt().a(fnu.c, J($$0));
   }

   public static fnt h(aku $$0) {
      return new fnt().a(fnu.c, $$0);
   }

   public static fnt y(djm $$0) {
      return new fnt().a(fnu.D, a($$0, "_0"));
   }

   public static fnt z(djm $$0) {
      return new fnt().a(fnu.D, a($$0, "_1"));
   }

   public static fnt A(djm $$0) {
      return new fnt().a(fnu.E, J($$0));
   }

   public static fnt B(djm $$0) {
      return new fnt().a(fnu.H, J($$0));
   }

   public static fnt i(aku $$0) {
      return new fnt().a(fnu.H, $$0);
   }

   public static fnt a(djm $$0, String $$1, String $$2) {
      return new fnt().a(fnu.i, a($$0, $$1)).a(fnu.f, a($$0, $$2)).a(fnu.e, a($$0, "_bottom"));
   }

   public static fnt a(djm $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fnt().a(fnu.g, a($$0, $$1)).a(fnu.i, a($$0, $$2)).a(fnu.f, a($$0, $$3)).a(fnu.e, a($$0, $$4));
   }

   public static fnt a(cwl $$0) {
      return new fnt().a(fnu.c, c($$0));
   }

   public static fnt C(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.g, a($$0, "_front")).a(fnu.h, a($$0, "_back"));
   }

   public static fnt D(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.g, a($$0, "_front")).a(fnu.f, a($$0, "_top")).a(fnu.e, a($$0, "_bottom"));
   }

   public static fnt E(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.g, a($$0, "_front")).a(fnu.f, a($$0, "_top"));
   }

   public static fnt F(djm $$0) {
      return new fnt().a(fnu.i, a($$0, "_side")).a(fnu.g, a($$0, "_front")).a(fnu.d, a($$0, "_end"));
   }

   public static fnt G(djm $$0) {
      return new fnt().a(fnu.f, a($$0, "_top"));
   }

   public static fnt c(djm $$0, djm $$1) {
      return new fnt()
         .a(fnu.c, a($$0, "_front"))
         .a(fnu.o, J($$1))
         .a(fnu.n, a($$0, "_top"))
         .a(fnu.j, a($$0, "_front"))
         .a(fnu.l, a($$0, "_side"))
         .a(fnu.k, a($$0, "_side"))
         .a(fnu.m, a($$0, "_front"));
   }

   public static fnt d(djm $$0, djm $$1) {
      return new fnt()
         .a(fnu.c, a($$0, "_front"))
         .a(fnu.o, J($$1))
         .a(fnu.n, a($$0, "_top"))
         .a(fnu.j, a($$0, "_front"))
         .a(fnu.k, a($$0, "_front"))
         .a(fnu.l, a($$0, "_side"))
         .a(fnu.m, a($$0, "_side"));
   }

   public static fnt a(String $$0) {
      return new fnt()
         .a(fnu.c, a(djo.mI, $$0 + "_north"))
         .a(fnu.e, a(djo.mI, $$0 + "_bottom"))
         .a(fnu.f, a(djo.mI, $$0 + "_top"))
         .a(fnu.j, a(djo.mI, $$0 + "_north"))
         .a(fnu.k, a(djo.mI, $$0 + "_south"))
         .a(fnu.l, a(djo.mI, $$0 + "_east"))
         .a(fnu.m, a(djo.mI, $$0 + "_west"));
   }

   public static fnt H(djm $$0) {
      return new fnt().a(fnu.L, a($$0, "_log_lit")).a(fnu.D, a($$0, "_fire"));
   }

   public static fnt a(djm $$0, boolean $$1) {
      return new fnt()
         .a(fnu.c, a(djo.et, "_side"))
         .a(fnu.e, a(djo.et, "_bottom"))
         .a(fnu.f, a(djo.et, "_top"))
         .a(fnu.i, a(djo.et, "_side"))
         .a(fnu.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fnt j(aku $$0) {
      return new fnt()
         .a(fnu.c, a(djo.fO, "_side"))
         .a(fnu.i, a(djo.fO, "_side"))
         .a(fnu.f, a(djo.fO, "_top"))
         .a(fnu.e, a(djo.fO, "_bottom"))
         .a(fnu.N, a(djo.fO, "_inner"))
         .a(fnu.O, $$0);
   }

   public static fnt a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fnt()
         .a(fnu.c, a(djo.rx, "_bottom"))
         .a(fnu.i, a(djo.rx, "_side"))
         .a(fnu.f, a(djo.rx, "_top"))
         .a(fnu.P, a(djo.rx, $$1 + "_inner_top"))
         .a(fnu.e, a(djo.rx, "_bottom"));
   }

   public static fnt b(cwl $$0) {
      return new fnt().a(fnu.I, c($$0));
   }

   public static fnt I(djm $$0) {
      return new fnt().a(fnu.I, J($$0));
   }

   public static fnt k(aku $$0) {
      return new fnt().a(fnu.I, $$0);
   }

   public static fnt c(aku $$0, aku $$1) {
      return new fnt().a(fnu.I, $$0).a(fnu.J, $$1);
   }

   public static fnt a(aku $$0, aku $$1, aku $$2) {
      return new fnt().a(fnu.I, $$0).a(fnu.J, $$1).a(fnu.K, $$2);
   }

   public static aku J(djm $$0) {
      aku $$1 = mb.e.b($$0);
      return $$1.f("block/");
   }

   public static aku a(djm $$0, String $$1) {
      aku $$2 = mb.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static aku c(cwl $$0) {
      aku $$1 = mb.g.b($$0);
      return $$1.f("item/");
   }

   public static aku a(cwl $$0, String $$1) {
      aku $$2 = mb.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
