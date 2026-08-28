import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cqr(wy q, Predicate<je<cij>> r, Predicate<je<cij>> s, ImmutableSet<cyz> t, ImmutableSet<dmf> u, @Nullable awm v) {
   public static final Predicate<je<cij>> a = $$0 -> $$0.a(axm.a);
   public static final alf<cqr> b = a("none");
   public static final alf<cqr> c = a("armorer");
   public static final alf<cqr> d = a("butcher");
   public static final alf<cqr> e = a("cartographer");
   public static final alf<cqr> f = a("cleric");
   public static final alf<cqr> g = a("farmer");
   public static final alf<cqr> h = a("fisherman");
   public static final alf<cqr> i = a("fletcher");
   public static final alf<cqr> j = a("leatherworker");
   public static final alf<cqr> k = a("librarian");
   public static final alf<cqr> l = a("mason");
   public static final alf<cqr> m = a("nitwit");
   public static final alf<cqr> n = a("shepherd");
   public static final alf<cqr> o = a("toolsmith");
   public static final alf<cqr> p = a("weaponsmith");

   private static alf<cqr> a(String $$0) {
      return alf.a(mg.aD, alg.b($$0));
   }

   private static cqr a(jr<cqr> $$0, alf<cqr> $$1, alf<cij> $$2, @Nullable awm $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cqr a(jr<cqr> $$0, alf<cqr> $$1, Predicate<je<cij>> $$2, Predicate<je<cij>> $$3, @Nullable awm $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cqr a(jr<cqr> $$0, alf<cqr> $$1, alf<cij> $$2, ImmutableSet<cyz> $$3, ImmutableSet<dmf> $$4, @Nullable awm $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cqr a(
      jr<cqr> $$0, alf<cqr> $$1, Predicate<je<cij>> $$2, Predicate<je<cij>> $$3, ImmutableSet<cyz> $$4, ImmutableSet<dmf> $$5, @Nullable awm $$6
   ) {
      return jr.a($$0, $$1, new cqr(wy.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cqr a(jr<cqr> $$0) {
      a($$0, b, cij.a, a, null);
      a($$0, c, cik.a, awn.Cd);
      a($$0, d, cik.b, awn.Ce);
      a($$0, e, cik.c, awn.Cf);
      a($$0, f, cik.d, awn.Cg);
      a($$0, g, cik.e, ImmutableSet.of(czh.qk, czh.qj, czh.ww, czh.sG), ImmutableSet.of(dmh.cN), awn.Ch);
      a($$0, h, cik.f, awn.Ci);
      a($$0, i, cik.g, awn.Cj);
      a($$0, j, cik.h, awn.Ck);
      a($$0, k, cik.i, awn.Cl);
      a($$0, l, cik.j, awn.Cm);
      a($$0, m, cij.a, cij.a, null);
      a($$0, n, cik.k, awn.Cn);
      a($$0, o, cik.l, awn.Co);
      return a($$0, p, cik.m, awn.Cp);
   }

   public wy a() {
      return this.q;
   }

   public Predicate<je<cij>> b() {
      return this.r;
   }

   public Predicate<je<cij>> c() {
      return this.s;
   }

   public ImmutableSet<cyz> d() {
      return this.t;
   }

   public ImmutableSet<dmf> e() {
      return this.u;
   }

   @Nullable
   public awm f() {
      return this.v;
   }
}
