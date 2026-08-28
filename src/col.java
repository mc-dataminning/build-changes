import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record col(String q, Predicate<jr<cgn>> r, Predicate<jr<cgn>> s, ImmutableSet<cwl> t, ImmutableSet<djm> u, @Nullable avz v) {
   public static final Predicate<jr<cgn>> a = $$0 -> $$0.a(axa.a);
   public static final col b = a("none", cgn.a, a, null);
   public static final col c = a("armorer", cgo.a, awa.BO);
   public static final col d = a("butcher", cgo.b, awa.BP);
   public static final col e = a("cartographer", cgo.c, awa.BQ);
   public static final col f = a("cleric", cgo.d, awa.BR);
   public static final col g = a("farmer", cgo.e, ImmutableSet.of(cwt.qb, cwt.qa, cwt.wl, cwt.sv), ImmutableSet.of(djo.cK), awa.BS);
   public static final col h = a("fisherman", cgo.f, awa.BT);
   public static final col i = a("fletcher", cgo.g, awa.BU);
   public static final col j = a("leatherworker", cgo.h, awa.BV);
   public static final col k = a("librarian", cgo.i, awa.BW);
   public static final col l = a("mason", cgo.j, awa.BX);
   public static final col m = a("nitwit", cgn.a, cgn.a, null);
   public static final col n = a("shepherd", cgo.k, awa.BY);
   public static final col o = a("toolsmith", cgo.l, awa.BZ);
   public static final col p = a("weaponsmith", cgo.m, awa.Ca);

   @Override
   public String toString() {
      return this.q;
   }

   private static col a(String $$0, akt<cgn> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static col a(String $$0, Predicate<jr<cgn>> $$1, Predicate<jr<cgn>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static col a(String $$0, akt<cgn> $$1, ImmutableSet<cwl> $$2, ImmutableSet<djm> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static col a(String $$0, Predicate<jr<cgn>> $$1, Predicate<jr<cgn>> $$2, ImmutableSet<cwl> $$3, ImmutableSet<djm> $$4, @Nullable avz $$5) {
      return ke.a(mb.x, aku.b($$0), new col($$0, $$1, $$2, $$3, $$4, $$5));
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

   public ImmutableSet<cwl> d() {
      return this.t;
   }

   public ImmutableSet<djm> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
