import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cok(String q, Predicate<jr<cgn>> r, Predicate<jr<cgn>> s, ImmutableSet<cwk> t, ImmutableSet<djl> u, @Nullable avz v) {
   public static final Predicate<jr<cgn>> a = $$0 -> $$0.a(axa.a);
   public static final cok b = a("none", cgn.a, a, null);
   public static final cok c = a("armorer", cgo.a, awa.BN);
   public static final cok d = a("butcher", cgo.b, awa.BO);
   public static final cok e = a("cartographer", cgo.c, awa.BP);
   public static final cok f = a("cleric", cgo.d, awa.BQ);
   public static final cok g = a("farmer", cgo.e, ImmutableSet.of(cws.qb, cws.qa, cws.wl, cws.sv), ImmutableSet.of(djn.cK), awa.BR);
   public static final cok h = a("fisherman", cgo.f, awa.BS);
   public static final cok i = a("fletcher", cgo.g, awa.BT);
   public static final cok j = a("leatherworker", cgo.h, awa.BU);
   public static final cok k = a("librarian", cgo.i, awa.BV);
   public static final cok l = a("mason", cgo.j, awa.BW);
   public static final cok m = a("nitwit", cgn.a, cgn.a, null);
   public static final cok n = a("shepherd", cgo.k, awa.BX);
   public static final cok o = a("toolsmith", cgo.l, awa.BY);
   public static final cok p = a("weaponsmith", cgo.m, awa.BZ);

   @Override
   public String toString() {
      return this.q;
   }

   private static cok a(String $$0, aku<cgn> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cok a(String $$0, Predicate<jr<cgn>> $$1, Predicate<jr<cgn>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cok a(String $$0, aku<cgn> $$1, ImmutableSet<cwk> $$2, ImmutableSet<djl> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cok a(String $$0, Predicate<jr<cgn>> $$1, Predicate<jr<cgn>> $$2, ImmutableSet<cwk> $$3, ImmutableSet<djl> $$4, @Nullable avz $$5) {
      return ke.a(mb.x, akv.b($$0), new cok($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jr<cgn>> b() {
      return this.r;
   }

   public Predicate<jr<cgn>> c() {
      return this.s;
   }

   public ImmutableSet<cwk> d() {
      return this.t;
   }

   public ImmutableSet<djl> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
