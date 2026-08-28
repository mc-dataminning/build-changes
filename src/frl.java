import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class frl {
   private final Map<frm, alg> a = Maps.newHashMap();
   private final Set<frm> b = Sets.newHashSet();

   public frl a(frm $$0, alg $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public frl b(frm $$0, alg $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<frm> a() {
      return this.b.stream();
   }

   public frl a(frm $$0, frm $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public frl b(frm $$0, frm $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alg a(frm $$0) {
      for (frm $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alg $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public frl c(frm $$0, alg $$1) {
      frl $$2 = new frl();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static frl a(dmf $$0) {
      alg $$1 = J($$0);
      return b($$1);
   }

   public static frl b(dmf $$0) {
      alg $$1 = J($$0);
      return a($$1);
   }

   public static frl a(alg $$0) {
      return new frl().a(frm.b, $$0);
   }

   public static frl b(alg $$0) {
      return new frl().a(frm.a, $$0);
   }

   public static frl c(dmf $$0) {
      return d(frm.p, J($$0));
   }

   public static frl d(dmf $$0) {
      return d(frm.i, J($$0));
   }

   public static frl e(dmf $$0) {
      return new frl().a(frm.p, J($$0)).a(frm.q, a($$0, "_emissive"));
   }

   public static frl c(alg $$0) {
      return d(frm.p, $$0);
   }

   public static frl f(dmf $$0) {
      return d(frm.r, J($$0));
   }

   public static frl g(dmf $$0) {
      return new frl().a(frm.r, J($$0)).a(frm.q, a($$0, "_emissive"));
   }

   public static frl d(alg $$0) {
      return d(frm.r, $$0);
   }

   public static frl h(dmf $$0) {
      return d(frm.t, J($$0));
   }

   public static frl e(alg $$0) {
      return d(frm.t, $$0);
   }

   public static frl i(dmf $$0) {
      return d(frm.u, J($$0));
   }

   public static frl j(dmf $$0) {
      return new frl().a(frm.Q, J($$0)).a(frm.z, a($$0, "_stem"));
   }

   public static frl f(alg $$0) {
      return d(frm.u, $$0);
   }

   public static frl k(dmf $$0) {
      return d(frm.z, J($$0));
   }

   public static frl a(dmf $$0, dmf $$1) {
      return new frl().a(frm.z, J($$0)).a(frm.A, J($$1));
   }

   public static frl l(dmf $$0) {
      return d(frm.v, J($$0));
   }

   public static frl m(dmf $$0) {
      return d(frm.y, J($$0));
   }

   public static frl g(alg $$0) {
      return d(frm.B, $$0);
   }

   public static frl b(dmf $$0, dmf $$1) {
      return new frl().a(frm.w, J($$0)).a(frm.x, a($$1, "_top"));
   }

   public static frl d(frm $$0, alg $$1) {
      return new frl().a($$0, $$1);
   }

   public static frl n(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.d, a($$0, "_top"));
   }

   public static frl o(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.f, a($$0, "_top"));
   }

   public static frl p(dmf $$0) {
      return new frl().a(frm.r, a($$0, "_plant")).a(frm.i, a($$0, "_side")).a(frm.f, a($$0, "_top"));
   }

   public static frl q(dmf $$0) {
      return new frl().a(frm.i, J($$0)).a(frm.d, a($$0, "_top")).a(frm.c, J($$0));
   }

   public static frl a(alg $$0, alg $$1) {
      return new frl().a(frm.i, $$0).a(frm.d, $$1);
   }

   public static frl r(dmf $$0) {
      return new frl().a(frm.b, J($$0)).a(frm.i, a($$0, "_side")).a(frm.f, a($$0, "_top"));
   }

   public static frl s(dmf $$0) {
      return new frl().a(frm.b, J($$0)).a(frm.c, a($$0, "_particle"));
   }

   public static frl t(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.f, a($$0, "_top")).a(frm.e, a($$0, "_bottom"));
   }

   public static frl u(dmf $$0) {
      alg $$1 = J($$0);
      return new frl().a(frm.s, $$1).a(frm.i, $$1).a(frm.f, a($$0, "_top")).a(frm.e, a($$0, "_bottom"));
   }

   public static frl v(dmf $$0) {
      alg $$1 = J($$0);
      return new frl().a(frm.b, $$1).a(frm.s, $$1).a(frm.i, $$1).a(frm.d, a($$0, "_top"));
   }

   public static frl b(alg $$0, alg $$1) {
      return new frl().a(frm.f, $$0).a(frm.e, $$1);
   }

   public static frl w(dmf $$0) {
      return new frl().a(frm.f, a($$0, "_top")).a(frm.e, a($$0, "_bottom"));
   }

   public static frl x(dmf $$0) {
      return new frl().a(frm.c, J($$0));
   }

   public static frl h(alg $$0) {
      return new frl().a(frm.c, $$0);
   }

   public static frl y(dmf $$0) {
      return new frl().a(frm.D, a($$0, "_0"));
   }

   public static frl z(dmf $$0) {
      return new frl().a(frm.D, a($$0, "_1"));
   }

   public static frl A(dmf $$0) {
      return new frl().a(frm.E, J($$0));
   }

   public static frl B(dmf $$0) {
      return new frl().a(frm.H, J($$0));
   }

   public static frl i(alg $$0) {
      return new frl().a(frm.H, $$0);
   }

   public static frl a(dmf $$0, String $$1, String $$2) {
      return new frl().a(frm.i, a($$0, $$1)).a(frm.f, a($$0, $$2)).a(frm.e, a($$0, "_bottom"));
   }

   public static frl a(dmf $$0, String $$1, String $$2, String $$3, String $$4) {
      return new frl().a(frm.g, a($$0, $$1)).a(frm.i, a($$0, $$2)).a(frm.f, a($$0, $$3)).a(frm.e, a($$0, $$4));
   }

   public static frl a(cyz $$0) {
      return new frl().a(frm.c, c($$0));
   }

   public static frl C(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.g, a($$0, "_front")).a(frm.h, a($$0, "_back"));
   }

   public static frl D(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.g, a($$0, "_front")).a(frm.f, a($$0, "_top")).a(frm.e, a($$0, "_bottom"));
   }

   public static frl E(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.g, a($$0, "_front")).a(frm.f, a($$0, "_top"));
   }

   public static frl F(dmf $$0) {
      return new frl().a(frm.i, a($$0, "_side")).a(frm.g, a($$0, "_front")).a(frm.d, a($$0, "_end"));
   }

   public static frl G(dmf $$0) {
      return new frl().a(frm.f, a($$0, "_top"));
   }

   public static frl c(dmf $$0, dmf $$1) {
      return new frl()
         .a(frm.c, a($$0, "_front"))
         .a(frm.o, J($$1))
         .a(frm.n, a($$0, "_top"))
         .a(frm.j, a($$0, "_front"))
         .a(frm.l, a($$0, "_side"))
         .a(frm.k, a($$0, "_side"))
         .a(frm.m, a($$0, "_front"));
   }

   public static frl d(dmf $$0, dmf $$1) {
      return new frl()
         .a(frm.c, a($$0, "_front"))
         .a(frm.o, J($$1))
         .a(frm.n, a($$0, "_top"))
         .a(frm.j, a($$0, "_front"))
         .a(frm.k, a($$0, "_front"))
         .a(frm.l, a($$0, "_side"))
         .a(frm.m, a($$0, "_side"));
   }

   public static frl a(String $$0) {
      return new frl()
         .a(frm.c, a(dmh.mM, $$0 + "_north"))
         .a(frm.e, a(dmh.mM, $$0 + "_bottom"))
         .a(frm.f, a(dmh.mM, $$0 + "_top"))
         .a(frm.j, a(dmh.mM, $$0 + "_north"))
         .a(frm.k, a(dmh.mM, $$0 + "_south"))
         .a(frm.l, a(dmh.mM, $$0 + "_east"))
         .a(frm.m, a(dmh.mM, $$0 + "_west"));
   }

   public static frl H(dmf $$0) {
      return new frl().a(frm.L, a($$0, "_log_lit")).a(frm.D, a($$0, "_fire"));
   }

   public static frl a(dmf $$0, boolean $$1) {
      return new frl()
         .a(frm.c, a(dmh.ex, "_side"))
         .a(frm.e, a(dmh.ex, "_bottom"))
         .a(frm.f, a(dmh.ex, "_top"))
         .a(frm.i, a(dmh.ex, "_side"))
         .a(frm.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static frl j(alg $$0) {
      return new frl()
         .a(frm.c, a(dmh.fS, "_side"))
         .a(frm.i, a(dmh.fS, "_side"))
         .a(frm.f, a(dmh.fS, "_top"))
         .a(frm.e, a(dmh.fS, "_bottom"))
         .a(frm.N, a(dmh.fS, "_inner"))
         .a(frm.O, $$0);
   }

   public static frl a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new frl()
         .a(frm.c, a(dmh.rD, "_bottom"))
         .a(frm.i, a(dmh.rD, "_side"))
         .a(frm.f, a(dmh.rD, "_top"))
         .a(frm.P, a(dmh.rD, $$1 + "_inner_top"))
         .a(frm.e, a(dmh.rD, "_bottom"));
   }

   public static frl b(cyz $$0) {
      return new frl().a(frm.I, c($$0));
   }

   public static frl I(dmf $$0) {
      return new frl().a(frm.I, J($$0));
   }

   public static frl k(alg $$0) {
      return new frl().a(frm.I, $$0);
   }

   public static frl c(alg $$0, alg $$1) {
      return new frl().a(frm.I, $$0).a(frm.J, $$1);
   }

   public static frl a(alg $$0, alg $$1, alg $$2) {
      return new frl().a(frm.I, $$0).a(frm.J, $$1).a(frm.K, $$2);
   }

   public static alg J(dmf $$0) {
      alg $$1 = mf.e.b($$0);
      return $$1.f("block/");
   }

   public static alg a(dmf $$0, String $$1) {
      alg $$2 = mf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alg c(cyz $$0) {
      alg $$1 = mf.g.b($$0);
      return $$1.f("item/");
   }

   public static alg a(cyz $$0, String $$1) {
      alg $$2 = mf.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
