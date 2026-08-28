import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fqs {
   private final Map<fqt, ale> a = Maps.newHashMap();
   private final Set<fqt> b = Sets.newHashSet();

   public fqs a(fqt $$0, ale $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fqs b(fqt $$0, ale $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fqt> a() {
      return this.b.stream();
   }

   public fqs a(fqt $$0, fqt $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fqs b(fqt $$0, fqt $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ale a(fqt $$0) {
      for (fqt $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ale $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fqs c(fqt $$0, ale $$1) {
      fqs $$2 = new fqs();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fqs a(dlu $$0) {
      ale $$1 = J($$0);
      return b($$1);
   }

   public static fqs b(dlu $$0) {
      ale $$1 = J($$0);
      return a($$1);
   }

   public static fqs a(ale $$0) {
      return new fqs().a(fqt.b, $$0);
   }

   public static fqs b(ale $$0) {
      return new fqs().a(fqt.a, $$0);
   }

   public static fqs c(dlu $$0) {
      return d(fqt.p, J($$0));
   }

   public static fqs d(dlu $$0) {
      return d(fqt.i, J($$0));
   }

   public static fqs e(dlu $$0) {
      return new fqs().a(fqt.p, J($$0)).a(fqt.q, a($$0, "_emissive"));
   }

   public static fqs c(ale $$0) {
      return d(fqt.p, $$0);
   }

   public static fqs f(dlu $$0) {
      return d(fqt.r, J($$0));
   }

   public static fqs g(dlu $$0) {
      return new fqs().a(fqt.r, J($$0)).a(fqt.q, a($$0, "_emissive"));
   }

   public static fqs d(ale $$0) {
      return d(fqt.r, $$0);
   }

   public static fqs h(dlu $$0) {
      return d(fqt.t, J($$0));
   }

   public static fqs e(ale $$0) {
      return d(fqt.t, $$0);
   }

   public static fqs i(dlu $$0) {
      return d(fqt.u, J($$0));
   }

   public static fqs j(dlu $$0) {
      return new fqs().a(fqt.Q, J($$0)).a(fqt.z, a($$0, "_stem"));
   }

   public static fqs f(ale $$0) {
      return d(fqt.u, $$0);
   }

   public static fqs k(dlu $$0) {
      return d(fqt.z, J($$0));
   }

   public static fqs a(dlu $$0, dlu $$1) {
      return new fqs().a(fqt.z, J($$0)).a(fqt.A, J($$1));
   }

   public static fqs l(dlu $$0) {
      return d(fqt.v, J($$0));
   }

   public static fqs m(dlu $$0) {
      return d(fqt.y, J($$0));
   }

   public static fqs g(ale $$0) {
      return d(fqt.B, $$0);
   }

   public static fqs b(dlu $$0, dlu $$1) {
      return new fqs().a(fqt.w, J($$0)).a(fqt.x, a($$1, "_top"));
   }

   public static fqs d(fqt $$0, ale $$1) {
      return new fqs().a($$0, $$1);
   }

   public static fqs n(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.d, a($$0, "_top"));
   }

   public static fqs o(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.f, a($$0, "_top"));
   }

   public static fqs p(dlu $$0) {
      return new fqs().a(fqt.r, a($$0, "_plant")).a(fqt.i, a($$0, "_side")).a(fqt.f, a($$0, "_top"));
   }

   public static fqs q(dlu $$0) {
      return new fqs().a(fqt.i, J($$0)).a(fqt.d, a($$0, "_top")).a(fqt.c, J($$0));
   }

   public static fqs a(ale $$0, ale $$1) {
      return new fqs().a(fqt.i, $$0).a(fqt.d, $$1);
   }

   public static fqs r(dlu $$0) {
      return new fqs().a(fqt.b, J($$0)).a(fqt.i, a($$0, "_side")).a(fqt.f, a($$0, "_top"));
   }

   public static fqs s(dlu $$0) {
      return new fqs().a(fqt.b, J($$0)).a(fqt.c, a($$0, "_particle"));
   }

   public static fqs t(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.f, a($$0, "_top")).a(fqt.e, a($$0, "_bottom"));
   }

   public static fqs u(dlu $$0) {
      ale $$1 = J($$0);
      return new fqs().a(fqt.s, $$1).a(fqt.i, $$1).a(fqt.f, a($$0, "_top")).a(fqt.e, a($$0, "_bottom"));
   }

   public static fqs v(dlu $$0) {
      ale $$1 = J($$0);
      return new fqs().a(fqt.b, $$1).a(fqt.s, $$1).a(fqt.i, $$1).a(fqt.d, a($$0, "_top"));
   }

   public static fqs b(ale $$0, ale $$1) {
      return new fqs().a(fqt.f, $$0).a(fqt.e, $$1);
   }

   public static fqs w(dlu $$0) {
      return new fqs().a(fqt.f, a($$0, "_top")).a(fqt.e, a($$0, "_bottom"));
   }

   public static fqs x(dlu $$0) {
      return new fqs().a(fqt.c, J($$0));
   }

   public static fqs h(ale $$0) {
      return new fqs().a(fqt.c, $$0);
   }

   public static fqs y(dlu $$0) {
      return new fqs().a(fqt.D, a($$0, "_0"));
   }

   public static fqs z(dlu $$0) {
      return new fqs().a(fqt.D, a($$0, "_1"));
   }

   public static fqs A(dlu $$0) {
      return new fqs().a(fqt.E, J($$0));
   }

   public static fqs B(dlu $$0) {
      return new fqs().a(fqt.H, J($$0));
   }

   public static fqs i(ale $$0) {
      return new fqs().a(fqt.H, $$0);
   }

   public static fqs a(dlu $$0, String $$1, String $$2) {
      return new fqs().a(fqt.i, a($$0, $$1)).a(fqt.f, a($$0, $$2)).a(fqt.e, a($$0, "_bottom"));
   }

   public static fqs a(dlu $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fqs().a(fqt.g, a($$0, $$1)).a(fqt.i, a($$0, $$2)).a(fqt.f, a($$0, $$3)).a(fqt.e, a($$0, $$4));
   }

   public static fqs a(cyo $$0) {
      return new fqs().a(fqt.c, c($$0));
   }

   public static fqs C(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.g, a($$0, "_front")).a(fqt.h, a($$0, "_back"));
   }

   public static fqs D(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.g, a($$0, "_front")).a(fqt.f, a($$0, "_top")).a(fqt.e, a($$0, "_bottom"));
   }

   public static fqs E(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.g, a($$0, "_front")).a(fqt.f, a($$0, "_top"));
   }

   public static fqs F(dlu $$0) {
      return new fqs().a(fqt.i, a($$0, "_side")).a(fqt.g, a($$0, "_front")).a(fqt.d, a($$0, "_end"));
   }

   public static fqs G(dlu $$0) {
      return new fqs().a(fqt.f, a($$0, "_top"));
   }

   public static fqs c(dlu $$0, dlu $$1) {
      return new fqs()
         .a(fqt.c, a($$0, "_front"))
         .a(fqt.o, J($$1))
         .a(fqt.n, a($$0, "_top"))
         .a(fqt.j, a($$0, "_front"))
         .a(fqt.l, a($$0, "_side"))
         .a(fqt.k, a($$0, "_side"))
         .a(fqt.m, a($$0, "_front"));
   }

   public static fqs d(dlu $$0, dlu $$1) {
      return new fqs()
         .a(fqt.c, a($$0, "_front"))
         .a(fqt.o, J($$1))
         .a(fqt.n, a($$0, "_top"))
         .a(fqt.j, a($$0, "_front"))
         .a(fqt.k, a($$0, "_front"))
         .a(fqt.l, a($$0, "_side"))
         .a(fqt.m, a($$0, "_side"));
   }

   public static fqs a(String $$0) {
      return new fqs()
         .a(fqt.c, a(dlw.mI, $$0 + "_north"))
         .a(fqt.e, a(dlw.mI, $$0 + "_bottom"))
         .a(fqt.f, a(dlw.mI, $$0 + "_top"))
         .a(fqt.j, a(dlw.mI, $$0 + "_north"))
         .a(fqt.k, a(dlw.mI, $$0 + "_south"))
         .a(fqt.l, a(dlw.mI, $$0 + "_east"))
         .a(fqt.m, a(dlw.mI, $$0 + "_west"));
   }

   public static fqs H(dlu $$0) {
      return new fqs().a(fqt.L, a($$0, "_log_lit")).a(fqt.D, a($$0, "_fire"));
   }

   public static fqs a(dlu $$0, boolean $$1) {
      return new fqs()
         .a(fqt.c, a(dlw.et, "_side"))
         .a(fqt.e, a(dlw.et, "_bottom"))
         .a(fqt.f, a(dlw.et, "_top"))
         .a(fqt.i, a(dlw.et, "_side"))
         .a(fqt.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fqs j(ale $$0) {
      return new fqs()
         .a(fqt.c, a(dlw.fO, "_side"))
         .a(fqt.i, a(dlw.fO, "_side"))
         .a(fqt.f, a(dlw.fO, "_top"))
         .a(fqt.e, a(dlw.fO, "_bottom"))
         .a(fqt.N, a(dlw.fO, "_inner"))
         .a(fqt.O, $$0);
   }

   public static fqs a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fqs()
         .a(fqt.c, a(dlw.rz, "_bottom"))
         .a(fqt.i, a(dlw.rz, "_side"))
         .a(fqt.f, a(dlw.rz, "_top"))
         .a(fqt.P, a(dlw.rz, $$1 + "_inner_top"))
         .a(fqt.e, a(dlw.rz, "_bottom"));
   }

   public static fqs b(cyo $$0) {
      return new fqs().a(fqt.I, c($$0));
   }

   public static fqs I(dlu $$0) {
      return new fqs().a(fqt.I, J($$0));
   }

   public static fqs k(ale $$0) {
      return new fqs().a(fqt.I, $$0);
   }

   public static fqs c(ale $$0, ale $$1) {
      return new fqs().a(fqt.I, $$0).a(fqt.J, $$1);
   }

   public static fqs a(ale $$0, ale $$1, ale $$2) {
      return new fqs().a(fqt.I, $$0).a(fqt.J, $$1).a(fqt.K, $$2);
   }

   public static ale J(dlu $$0) {
      ale $$1 = mf.e.b($$0);
      return $$1.f("block/");
   }

   public static ale a(dlu $$0, String $$1) {
      ale $$2 = mf.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ale c(cyo $$0) {
      ale $$1 = mf.g.b($$0);
      return $$1.f("item/");
   }

   public static ale a(cyo $$0, String $$1) {
      ale $$2 = mf.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
