import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cqh(ww q, Predicate<je<cie>> r, Predicate<je<cie>> s, ImmutableSet<cyo> t, ImmutableSet<dlu> u, @Nullable awk v) {
   public static final Predicate<je<cie>> a = $$0 -> $$0.a(axk.a);
   public static final ald<cqh> b = a("none");
   public static final ald<cqh> c = a("armorer");
   public static final ald<cqh> d = a("butcher");
   public static final ald<cqh> e = a("cartographer");
   public static final ald<cqh> f = a("cleric");
   public static final ald<cqh> g = a("farmer");
   public static final ald<cqh> h = a("fisherman");
   public static final ald<cqh> i = a("fletcher");
   public static final ald<cqh> j = a("leatherworker");
   public static final ald<cqh> k = a("librarian");
   public static final ald<cqh> l = a("mason");
   public static final ald<cqh> m = a("nitwit");
   public static final ald<cqh> n = a("shepherd");
   public static final ald<cqh> o = a("toolsmith");
   public static final ald<cqh> p = a("weaponsmith");

   private static ald<cqh> a(String $$0) {
      return ald.a(mg.aD, ale.b($$0));
   }

   private static cqh a(jr<cqh> $$0, ald<cqh> $$1, ald<cie> $$2, @Nullable awk $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cqh a(jr<cqh> $$0, ald<cqh> $$1, Predicate<je<cie>> $$2, Predicate<je<cie>> $$3, @Nullable awk $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cqh a(jr<cqh> $$0, ald<cqh> $$1, ald<cie> $$2, ImmutableSet<cyo> $$3, ImmutableSet<dlu> $$4, @Nullable awk $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cqh a(
      jr<cqh> $$0, ald<cqh> $$1, Predicate<je<cie>> $$2, Predicate<je<cie>> $$3, ImmutableSet<cyo> $$4, ImmutableSet<dlu> $$5, @Nullable awk $$6
   ) {
      return jr.a($$0, $$1, new cqh(ww.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cqh a(jr<cqh> $$0) {
      a($$0, b, cie.a, a, null);
      a($$0, c, cif.a, awl.BX);
      a($$0, d, cif.b, awl.BY);
      a($$0, e, cif.c, awl.BZ);
      a($$0, f, cif.d, awl.Ca);
      a($$0, g, cif.e, ImmutableSet.of(cyw.qf, cyw.qe, cyw.wp, cyw.sz), ImmutableSet.of(dlw.cK), awl.Cb);
      a($$0, h, cif.f, awl.Cc);
      a($$0, i, cif.g, awl.Cd);
      a($$0, j, cif.h, awl.Ce);
      a($$0, k, cif.i, awl.Cf);
      a($$0, l, cif.j, awl.Cg);
      a($$0, m, cie.a, cie.a, null);
      a($$0, n, cif.k, awl.Ch);
      a($$0, o, cif.l, awl.Ci);
      return a($$0, p, cif.m, awl.Cj);
   }

   public ww a() {
      return this.q;
   }

   public Predicate<je<cie>> b() {
      return this.r;
   }

   public Predicate<je<cie>> c() {
      return this.s;
   }

   public ImmutableSet<cyo> d() {
      return this.t;
   }

   public ImmutableSet<dlu> e() {
      return this.u;
   }

   @Nullable
   public awk f() {
      return this.v;
   }
}
