import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cro(xc q, Predicate<jg<cjb>> r, Predicate<jg<cjb>> s, ImmutableSet<czw> t, ImmutableSet<dne> u, @Nullable awq v) {
   public static final Predicate<jg<cjb>> a = $$0 -> $$0.a(axq.a);
   public static final alj<cro> b = a("none");
   public static final alj<cro> c = a("armorer");
   public static final alj<cro> d = a("butcher");
   public static final alj<cro> e = a("cartographer");
   public static final alj<cro> f = a("cleric");
   public static final alj<cro> g = a("farmer");
   public static final alj<cro> h = a("fisherman");
   public static final alj<cro> i = a("fletcher");
   public static final alj<cro> j = a("leatherworker");
   public static final alj<cro> k = a("librarian");
   public static final alj<cro> l = a("mason");
   public static final alj<cro> m = a("nitwit");
   public static final alj<cro> n = a("shepherd");
   public static final alj<cro> o = a("toolsmith");
   public static final alj<cro> p = a("weaponsmith");

   private static alj<cro> a(String $$0) {
      return alj.a(mi.aD, alk.b($$0));
   }

   private static cro a(jt<cro> $$0, alj<cro> $$1, alj<cjb> $$2, @Nullable awq $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cro a(jt<cro> $$0, alj<cro> $$1, Predicate<jg<cjb>> $$2, Predicate<jg<cjb>> $$3, @Nullable awq $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cro a(jt<cro> $$0, alj<cro> $$1, alj<cjb> $$2, ImmutableSet<czw> $$3, ImmutableSet<dne> $$4, @Nullable awq $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cro a(
      jt<cro> $$0, alj<cro> $$1, Predicate<jg<cjb>> $$2, Predicate<jg<cjb>> $$3, ImmutableSet<czw> $$4, ImmutableSet<dne> $$5, @Nullable awq $$6
   ) {
      return jt.a($$0, $$1, new cro(xc.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cro a(jt<cro> $$0) {
      a($$0, b, cjb.a, a, null);
      a($$0, c, cjc.a, awr.Cd);
      a($$0, d, cjc.b, awr.Ce);
      a($$0, e, cjc.c, awr.Cf);
      a($$0, f, cjc.d, awr.Cg);
      a($$0, g, cjc.e, ImmutableSet.of(dae.qk, dae.qj, dae.ww, dae.sG), ImmutableSet.of(dng.cN), awr.Ch);
      a($$0, h, cjc.f, awr.Ci);
      a($$0, i, cjc.g, awr.Cj);
      a($$0, j, cjc.h, awr.Ck);
      a($$0, k, cjc.i, awr.Cl);
      a($$0, l, cjc.j, awr.Cm);
      a($$0, m, cjb.a, cjb.a, null);
      a($$0, n, cjc.k, awr.Cn);
      a($$0, o, cjc.l, awr.Co);
      return a($$0, p, cjc.m, awr.Cp);
   }

   public xc a() {
      return this.q;
   }

   public Predicate<jg<cjb>> b() {
      return this.r;
   }

   public Predicate<jg<cjb>> c() {
      return this.s;
   }

   public ImmutableSet<czw> d() {
      return this.t;
   }

   public ImmutableSet<dne> e() {
      return this.u;
   }

   @Nullable
   public awq f() {
      return this.v;
   }
}
