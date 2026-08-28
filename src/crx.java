import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record crx(xg q, Predicate<jg<cjk>> r, Predicate<jg<cjk>> s, ImmutableSet<dag> t, ImmutableSet<dno> u, @Nullable awx v) {
   public static final Predicate<jg<cjk>> a = $$0 -> $$0.a(axx.a);
   public static final alq<crx> b = a("none");
   public static final alq<crx> c = a("armorer");
   public static final alq<crx> d = a("butcher");
   public static final alq<crx> e = a("cartographer");
   public static final alq<crx> f = a("cleric");
   public static final alq<crx> g = a("farmer");
   public static final alq<crx> h = a("fisherman");
   public static final alq<crx> i = a("fletcher");
   public static final alq<crx> j = a("leatherworker");
   public static final alq<crx> k = a("librarian");
   public static final alq<crx> l = a("mason");
   public static final alq<crx> m = a("nitwit");
   public static final alq<crx> n = a("shepherd");
   public static final alq<crx> o = a("toolsmith");
   public static final alq<crx> p = a("weaponsmith");

   private static alq<crx> a(String $$0) {
      return alq.a(mi.aD, alr.b($$0));
   }

   private static crx a(jt<crx> $$0, alq<crx> $$1, alq<cjk> $$2, @Nullable awx $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static crx a(jt<crx> $$0, alq<crx> $$1, Predicate<jg<cjk>> $$2, Predicate<jg<cjk>> $$3, @Nullable awx $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static crx a(jt<crx> $$0, alq<crx> $$1, alq<cjk> $$2, ImmutableSet<dag> $$3, ImmutableSet<dno> $$4, @Nullable awx $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static crx a(
      jt<crx> $$0, alq<crx> $$1, Predicate<jg<cjk>> $$2, Predicate<jg<cjk>> $$3, ImmutableSet<dag> $$4, ImmutableSet<dno> $$5, @Nullable awx $$6
   ) {
      return jt.a($$0, $$1, new crx(xg.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static crx a(jt<crx> $$0) {
      a($$0, b, cjk.a, a, null);
      a($$0, c, cjl.a, awy.Cd);
      a($$0, d, cjl.b, awy.Ce);
      a($$0, e, cjl.c, awy.Cf);
      a($$0, f, cjl.d, awy.Cg);
      a($$0, g, cjl.e, ImmutableSet.of(dao.qk, dao.qj, dao.ww, dao.sG), ImmutableSet.of(dnq.cN), awy.Ch);
      a($$0, h, cjl.f, awy.Ci);
      a($$0, i, cjl.g, awy.Cj);
      a($$0, j, cjl.h, awy.Ck);
      a($$0, k, cjl.i, awy.Cl);
      a($$0, l, cjl.j, awy.Cm);
      a($$0, m, cjk.a, cjk.a, null);
      a($$0, n, cjl.k, awy.Cn);
      a($$0, o, cjl.l, awy.Co);
      return a($$0, p, cjl.m, awy.Cp);
   }

   public xg a() {
      return this.q;
   }

   public Predicate<jg<cjk>> b() {
      return this.r;
   }

   public Predicate<jg<cjk>> c() {
      return this.s;
   }

   public ImmutableSet<dag> d() {
      return this.t;
   }

   public ImmutableSet<dno> e() {
      return this.u;
   }

   @Nullable
   public awx f() {
      return this.v;
   }
}
