import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fre {
   private final Map<frf, alg> a = Maps.newHashMap();
   private final Set<frf> b = Sets.newHashSet();

   public fre a(frf $$0, alg $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fre b(frf $$0, alg $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<frf> a() {
      return this.b.stream();
   }

   public fre a(frf $$0, frf $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fre b(frf $$0, frf $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alg a(frf $$0) {
      for (frf $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alg $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fre c(frf $$0, alg $$1) {
      fre $$2 = new fre();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fre a(dma $$0) {
      alg $$1 = J($$0);
      return b($$1);
   }

   public static fre b(dma $$0) {
      alg $$1 = J($$0);
      return a($$1);
   }

   public static fre a(alg $$0) {
      return new fre().a(frf.b, $$0);
   }

   public static fre b(alg $$0) {
      return new fre().a(frf.a, $$0);
   }

   public static fre c(dma $$0) {
      return d(frf.p, J($$0));
   }

   public static fre d(dma $$0) {
      return d(frf.i, J($$0));
   }

   public static fre e(dma $$0) {
      return new fre().a(frf.p, J($$0)).a(frf.q, a($$0, "_emissive"));
   }

   public static fre c(alg $$0) {
      return d(frf.p, $$0);
   }

   public static fre f(dma $$0) {
      return d(frf.r, J($$0));
   }

   public static fre g(dma $$0) {
      return new fre().a(frf.r, J($$0)).a(frf.q, a($$0, "_emissive"));
   }

   public static fre d(alg $$0) {
      return d(frf.r, $$0);
   }

   public static fre h(dma $$0) {
      return d(frf.t, J($$0));
   }

   public static fre e(alg $$0) {
      return d(frf.t, $$0);
   }

   public static fre i(dma $$0) {
      return d(frf.u, J($$0));
   }

   public static fre j(dma $$0) {
      return new fre().a(frf.Q, J($$0)).a(frf.z, a($$0, "_stem"));
   }

   public static fre f(alg $$0) {
      return d(frf.u, $$0);
   }

   public static fre k(dma $$0) {
      return d(frf.z, J($$0));
   }

   public static fre a(dma $$0, dma $$1) {
      return new fre().a(frf.z, J($$0)).a(frf.A, J($$1));
   }

   public static fre l(dma $$0) {
      return d(frf.v, J($$0));
   }

   public static fre m(dma $$0) {
      return d(frf.y, J($$0));
   }

   public static fre g(alg $$0) {
      return d(frf.B, $$0);
   }

   public static fre b(dma $$0, dma $$1) {
      return new fre().a(frf.w, J($$0)).a(frf.x, a($$1, "_top"));
   }

   public static fre d(frf $$0, alg $$1) {
      return new fre().a($$0, $$1);
   }

   public static fre n(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.d, a($$0, "_top"));
   }

   public static fre o(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.f, a($$0, "_top"));
   }

   public static fre p(dma $$0) {
      return new fre().a(frf.r, a($$0, "_plant")).a(frf.i, a($$0, "_side")).a(frf.f, a($$0, "_top"));
   }

   public static fre q(dma $$0) {
      return new fre().a(frf.i, J($$0)).a(frf.d, a($$0, "_top")).a(frf.c, J($$0));
   }

   public static fre a(alg $$0, alg $$1) {
      return new fre().a(frf.i, $$0).a(frf.d, $$1);
   }

   public static fre r(dma $$0) {
      return new fre().a(frf.b, J($$0)).a(frf.i, a($$0, "_side")).a(frf.f, a($$0, "_top"));
   }

   public static fre s(dma $$0) {
      return new fre().a(frf.b, J($$0)).a(frf.c, a($$0, "_particle"));
   }

   public static fre t(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.f, a($$0, "_top")).a(frf.e, a($$0, "_bottom"));
   }

   public static fre u(dma $$0) {
      alg $$1 = J($$0);
      return new fre().a(frf.s, $$1).a(frf.i, $$1).a(frf.f, a($$0, "_top")).a(frf.e, a($$0, "_bottom"));
   }

   public static fre v(dma $$0) {
      alg $$1 = J($$0);
      return new fre().a(frf.b, $$1).a(frf.s, $$1).a(frf.i, $$1).a(frf.d, a($$0, "_top"));
   }

   public static fre b(alg $$0, alg $$1) {
      return new fre().a(frf.f, $$0).a(frf.e, $$1);
   }

   public static fre w(dma $$0) {
      return new fre().a(frf.f, a($$0, "_top")).a(frf.e, a($$0, "_bottom"));
   }

   public static fre x(dma $$0) {
      return new fre().a(frf.c, J($$0));
   }

   public static fre h(alg $$0) {
      return new fre().a(frf.c, $$0);
   }

   public static fre y(dma $$0) {
      return new fre().a(frf.D, a($$0, "_0"));
   }

   public static fre z(dma $$0) {
      return new fre().a(frf.D, a($$0, "_1"));
   }

   public static fre A(dma $$0) {
      return new fre().a(frf.E, J($$0));
   }

   public static fre B(dma $$0) {
      return new fre().a(frf.H, J($$0));
   }

   public static fre i(alg $$0) {
      return new fre().a(frf.H, $$0);
   }

   public static fre a(dma $$0, String $$1, String $$2) {
      return new fre().a(frf.i, a($$0, $$1)).a(frf.f, a($$0, $$2)).a(frf.e, a($$0, "_bottom"));
   }

   public static fre a(dma $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fre().a(frf.g, a($$0, $$1)).a(frf.i, a($$0, $$2)).a(frf.f, a($$0, $$3)).a(frf.e, a($$0, $$4));
   }

   public static fre a(cyu $$0) {
      return new fre().a(frf.c, c($$0));
   }

   public static fre C(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.g, a($$0, "_front")).a(frf.h, a($$0, "_back"));
   }

   public static fre D(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.g, a($$0, "_front")).a(frf.f, a($$0, "_top")).a(frf.e, a($$0, "_bottom"));
   }

   public static fre E(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.g, a($$0, "_front")).a(frf.f, a($$0, "_top"));
   }

   public static fre F(dma $$0) {
      return new fre().a(frf.i, a($$0, "_side")).a(frf.g, a($$0, "_front")).a(frf.d, a($$0, "_end"));
   }

   public static fre G(dma $$0) {
      return new fre().a(frf.f, a($$0, "_top"));
   }

   public static fre c(dma $$0, dma $$1) {
      return new fre()
         .a(frf.c, a($$0, "_front"))
         .a(frf.o, J($$1))
         .a(frf.n, a($$0, "_top"))
         .a(frf.j, a($$0, "_front"))
         .a(frf.l, a($$0, "_side"))
         .a(frf.k, a($$0, "_side"))
         .a(frf.m, a($$0, "_front"));
   }

   public static fre d(dma $$0, dma $$1) {
      return new fre()
         .a(frf.c, a($$0, "_front"))
         .a(frf.o, J($$1))
         .a(frf.n, a($$0, "_top"))
         .a(frf.j, a($$0, "_front"))
         .a(frf.k, a($$0, "_front"))
         .a(frf.l, a($$0, "_side"))
         .a(frf.m, a($$0, "_side"));
   }

   public static fre a(String $$0) {
      return new fre()
         .a(frf.c, a(dmc.mJ, $$0 + "_north"))
         .a(frf.e, a(dmc.mJ, $$0 + "_bottom"))
         .a(frf.f, a(dmc.mJ, $$0 + "_top"))
         .a(frf.j, a(dmc.mJ, $$0 + "_north"))
         .a(frf.k, a(dmc.mJ, $$0 + "_south"))
         .a(frf.l, a(dmc.mJ, $$0 + "_east"))
         .a(frf.m, a(dmc.mJ, $$0 + "_west"));
   }

   public static fre H(dma $$0) {
      return new fre().a(frf.L, a($$0, "_log_lit")).a(frf.D, a($$0, "_fire"));
   }

   public static fre a(dma $$0, boolean $$1) {
      return new fre()
         .a(frf.c, a(dmc.eu, "_side"))
         .a(frf.e, a(dmc.eu, "_bottom"))
         .a(frf.f, a(dmc.eu, "_top"))
         .a(frf.i, a(dmc.eu, "_side"))
         .a(frf.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fre j(alg $$0) {
      return new fre()
         .a(frf.c, a(dmc.fP, "_side"))
         .a(frf.i, a(dmc.fP, "_side"))
         .a(frf.f, a(dmc.fP, "_top"))
         .a(frf.e, a(dmc.fP, "_bottom"))
         .a(frf.N, a(dmc.fP, "_inner"))
         .a(frf.O, $$0);
   }

   public static fre a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fre()
         .a(frf.c, a(dmc.rA, "_bottom"))
         .a(frf.i, a(dmc.rA, "_side"))
         .a(frf.f, a(dmc.rA, "_top"))
         .a(frf.P, a(dmc.rA, $$1 + "_inner_top"))
         .a(frf.e, a(dmc.rA, "_bottom"));
   }

   public static fre b(cyu $$0) {
      return new fre().a(frf.I, c($$0));
   }

   public static fre I(dma $$0) {
      return new fre().a(frf.I, J($$0));
   }

   public static fre k(alg $$0) {
      return new fre().a(frf.I, $$0);
   }

   public static fre c(alg $$0, alg $$1) {
      return new fre().a(frf.I, $$0).a(frf.J, $$1);
   }

   public static fre a(alg $$0, alg $$1, alg $$2) {
      return new fre().a(frf.I, $$0).a(frf.J, $$1).a(frf.K, $$2);
   }

   public static alg J(dma $$0) {
      alg $$1 = mf.e.b($$0);
      return $$1.f("block/");
   }

   public static alg a(dma $$0, String $$1) {
      alg $$2 = mf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alg c(cyu $$0) {
      alg $$1 = mf.g.b($$0);
      return $$1.f("item/");
   }

   public static alg a(cyu $$0, String $$1) {
      alg $$2 = mf.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
