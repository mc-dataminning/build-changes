import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ftp {
   private final Map<ftq, alk> a = Maps.newHashMap();
   private final Set<ftq> b = Sets.newHashSet();

   public ftp a(ftq $$0, alk $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public ftp b(ftq $$0, alk $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<ftq> a() {
      return this.b.stream();
   }

   public ftp a(ftq $$0, ftq $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public ftp b(ftq $$0, ftq $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public alk a(ftq $$0) {
      for (ftq $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         alk $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public ftp c(ftq $$0, alk $$1) {
      ftp $$2 = new ftp();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static ftp a(dne $$0) {
      alk $$1 = J($$0);
      return b($$1);
   }

   public static ftp b(dne $$0) {
      alk $$1 = J($$0);
      return a($$1);
   }

   public static ftp a(alk $$0) {
      return new ftp().a(ftq.b, $$0);
   }

   public static ftp b(alk $$0) {
      return new ftp().a(ftq.a, $$0);
   }

   public static ftp c(dne $$0) {
      return d(ftq.p, J($$0));
   }

   public static ftp d(dne $$0) {
      return d(ftq.i, J($$0));
   }

   public static ftp e(dne $$0) {
      return new ftp().a(ftq.p, J($$0)).a(ftq.q, a($$0, "_emissive"));
   }

   public static ftp c(alk $$0) {
      return d(ftq.p, $$0);
   }

   public static ftp f(dne $$0) {
      return d(ftq.r, J($$0));
   }

   public static ftp g(dne $$0) {
      return new ftp().a(ftq.r, J($$0)).a(ftq.q, a($$0, "_emissive"));
   }

   public static ftp d(alk $$0) {
      return d(ftq.r, $$0);
   }

   public static ftp h(dne $$0) {
      return d(ftq.t, J($$0));
   }

   public static ftp e(alk $$0) {
      return d(ftq.t, $$0);
   }

   public static ftp i(dne $$0) {
      return d(ftq.u, J($$0));
   }

   public static ftp j(dne $$0) {
      return new ftp().a(ftq.Q, J($$0)).a(ftq.z, a($$0, "_stem"));
   }

   public static ftp f(alk $$0) {
      return d(ftq.u, $$0);
   }

   public static ftp k(dne $$0) {
      return d(ftq.z, J($$0));
   }

   public static ftp a(dne $$0, dne $$1) {
      return new ftp().a(ftq.z, J($$0)).a(ftq.A, J($$1));
   }

   public static ftp l(dne $$0) {
      return d(ftq.v, J($$0));
   }

   public static ftp m(dne $$0) {
      return d(ftq.y, J($$0));
   }

   public static ftp g(alk $$0) {
      return d(ftq.B, $$0);
   }

   public static ftp b(dne $$0, dne $$1) {
      return new ftp().a(ftq.w, J($$0)).a(ftq.x, a($$1, "_top"));
   }

   public static ftp d(ftq $$0, alk $$1) {
      return new ftp().a($$0, $$1);
   }

   public static ftp n(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.d, a($$0, "_top"));
   }

   public static ftp o(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.f, a($$0, "_top"));
   }

   public static ftp p(dne $$0) {
      return new ftp().a(ftq.r, a($$0, "_plant")).a(ftq.i, a($$0, "_side")).a(ftq.f, a($$0, "_top"));
   }

   public static ftp q(dne $$0) {
      return new ftp().a(ftq.i, J($$0)).a(ftq.d, a($$0, "_top")).a(ftq.c, J($$0));
   }

   public static ftp a(alk $$0, alk $$1) {
      return new ftp().a(ftq.i, $$0).a(ftq.d, $$1);
   }

   public static ftp r(dne $$0) {
      return new ftp().a(ftq.b, J($$0)).a(ftq.i, a($$0, "_side")).a(ftq.f, a($$0, "_top"));
   }

   public static ftp s(dne $$0) {
      return new ftp().a(ftq.b, J($$0)).a(ftq.c, a($$0, "_particle"));
   }

   public static ftp t(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.f, a($$0, "_top")).a(ftq.e, a($$0, "_bottom"));
   }

   public static ftp u(dne $$0) {
      alk $$1 = J($$0);
      return new ftp().a(ftq.s, $$1).a(ftq.i, $$1).a(ftq.f, a($$0, "_top")).a(ftq.e, a($$0, "_bottom"));
   }

   public static ftp v(dne $$0) {
      alk $$1 = J($$0);
      return new ftp().a(ftq.b, $$1).a(ftq.s, $$1).a(ftq.i, $$1).a(ftq.d, a($$0, "_top"));
   }

   public static ftp b(alk $$0, alk $$1) {
      return new ftp().a(ftq.f, $$0).a(ftq.e, $$1);
   }

   public static ftp w(dne $$0) {
      return new ftp().a(ftq.f, a($$0, "_top")).a(ftq.e, a($$0, "_bottom"));
   }

   public static ftp x(dne $$0) {
      return new ftp().a(ftq.c, J($$0));
   }

   public static ftp h(alk $$0) {
      return new ftp().a(ftq.c, $$0);
   }

   public static ftp y(dne $$0) {
      return new ftp().a(ftq.D, a($$0, "_0"));
   }

   public static ftp z(dne $$0) {
      return new ftp().a(ftq.D, a($$0, "_1"));
   }

   public static ftp A(dne $$0) {
      return new ftp().a(ftq.E, J($$0));
   }

   public static ftp B(dne $$0) {
      return new ftp().a(ftq.H, J($$0));
   }

   public static ftp i(alk $$0) {
      return new ftp().a(ftq.H, $$0);
   }

   public static ftp a(dne $$0, String $$1, String $$2) {
      return new ftp().a(ftq.i, a($$0, $$1)).a(ftq.f, a($$0, $$2)).a(ftq.e, a($$0, "_bottom"));
   }

   public static ftp a(dne $$0, String $$1, String $$2, String $$3, String $$4) {
      return new ftp().a(ftq.g, a($$0, $$1)).a(ftq.i, a($$0, $$2)).a(ftq.f, a($$0, $$3)).a(ftq.e, a($$0, $$4));
   }

   public static ftp a(czw $$0) {
      return new ftp().a(ftq.c, c($$0));
   }

   public static ftp C(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.g, a($$0, "_front")).a(ftq.h, a($$0, "_back"));
   }

   public static ftp D(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.g, a($$0, "_front")).a(ftq.f, a($$0, "_top")).a(ftq.e, a($$0, "_bottom"));
   }

   public static ftp E(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.g, a($$0, "_front")).a(ftq.f, a($$0, "_top"));
   }

   public static ftp F(dne $$0) {
      return new ftp().a(ftq.i, a($$0, "_side")).a(ftq.g, a($$0, "_front")).a(ftq.d, a($$0, "_end"));
   }

   public static ftp G(dne $$0) {
      return new ftp().a(ftq.f, a($$0, "_top"));
   }

   public static ftp c(dne $$0, dne $$1) {
      return new ftp()
         .a(ftq.c, a($$0, "_front"))
         .a(ftq.o, J($$1))
         .a(ftq.n, a($$0, "_top"))
         .a(ftq.j, a($$0, "_front"))
         .a(ftq.l, a($$0, "_side"))
         .a(ftq.k, a($$0, "_side"))
         .a(ftq.m, a($$0, "_front"));
   }

   public static ftp d(dne $$0, dne $$1) {
      return new ftp()
         .a(ftq.c, a($$0, "_front"))
         .a(ftq.o, J($$1))
         .a(ftq.n, a($$0, "_top"))
         .a(ftq.j, a($$0, "_front"))
         .a(ftq.k, a($$0, "_front"))
         .a(ftq.l, a($$0, "_side"))
         .a(ftq.m, a($$0, "_side"));
   }

   public static ftp a(String $$0) {
      return new ftp()
         .a(ftq.c, a(dng.mM, $$0 + "_north"))
         .a(ftq.e, a(dng.mM, $$0 + "_bottom"))
         .a(ftq.f, a(dng.mM, $$0 + "_top"))
         .a(ftq.j, a(dng.mM, $$0 + "_north"))
         .a(ftq.k, a(dng.mM, $$0 + "_south"))
         .a(ftq.l, a(dng.mM, $$0 + "_east"))
         .a(ftq.m, a(dng.mM, $$0 + "_west"));
   }

   public static ftp H(dne $$0) {
      return new ftp().a(ftq.L, a($$0, "_log_lit")).a(ftq.D, a($$0, "_fire"));
   }

   public static ftp a(dne $$0, boolean $$1) {
      return new ftp()
         .a(ftq.c, a(dng.ex, "_side"))
         .a(ftq.e, a(dng.ex, "_bottom"))
         .a(ftq.f, a(dng.ex, "_top"))
         .a(ftq.i, a(dng.ex, "_side"))
         .a(ftq.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static ftp j(alk $$0) {
      return new ftp()
         .a(ftq.c, a(dng.fS, "_side"))
         .a(ftq.i, a(dng.fS, "_side"))
         .a(ftq.f, a(dng.fS, "_top"))
         .a(ftq.e, a(dng.fS, "_bottom"))
         .a(ftq.N, a(dng.fS, "_inner"))
         .a(ftq.O, $$0);
   }

   public static ftp a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new ftp()
         .a(ftq.c, a(dng.rD, "_bottom"))
         .a(ftq.i, a(dng.rD, "_side"))
         .a(ftq.f, a(dng.rD, "_top"))
         .a(ftq.P, a(dng.rD, $$1 + "_inner_top"))
         .a(ftq.e, a(dng.rD, "_bottom"));
   }

   public static ftp b(czw $$0) {
      return new ftp().a(ftq.I, c($$0));
   }

   public static ftp I(dne $$0) {
      return new ftp().a(ftq.I, J($$0));
   }

   public static ftp k(alk $$0) {
      return new ftp().a(ftq.I, $$0);
   }

   public static ftp c(alk $$0, alk $$1) {
      return new ftp().a(ftq.I, $$0).a(ftq.J, $$1);
   }

   public static ftp a(alk $$0, alk $$1, alk $$2) {
      return new ftp().a(ftq.I, $$0).a(ftq.J, $$1).a(ftq.K, $$2);
   }

   public static alk J(dne $$0) {
      alk $$1 = mh.e.b($$0);
      return $$1.f("block/");
   }

   public static alk a(dne $$0, String $$1) {
      alk $$2 = mh.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static alk c(czw $$0) {
      alk $$1 = mh.g.b($$0);
      return $$1.f("item/");
   }

   public static alk a(czw $$0, String $$1) {
      alk $$2 = mh.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
