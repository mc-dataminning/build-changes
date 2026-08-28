import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record col(String q, Predicate<jr<cgo>> r, Predicate<jr<cgo>> s, ImmutableSet<cwl> t, ImmutableSet<djm> u, @Nullable avz v) {
   public static final Predicate<jr<cgo>> a = $$0 -> $$0.a(axa.a);
   public static final col b = a("none", cgo.a, a, null);
   public static final col c = a("armorer", cgp.a, awa.BN);
   public static final col d = a("butcher", cgp.b, awa.BO);
   public static final col e = a("cartographer", cgp.c, awa.BP);
   public static final col f = a("cleric", cgp.d, awa.BQ);
   public static final col g = a("farmer", cgp.e, ImmutableSet.of(cwt.qb, cwt.qa, cwt.wl, cwt.sv), ImmutableSet.of(djo.cK), awa.BR);
   public static final col h = a("fisherman", cgp.f, awa.BS);
   public static final col i = a("fletcher", cgp.g, awa.BT);
   public static final col j = a("leatherworker", cgp.h, awa.BU);
   public static final col k = a("librarian", cgp.i, awa.BV);
   public static final col l = a("mason", cgp.j, awa.BW);
   public static final col m = a("nitwit", cgo.a, cgo.a, null);
   public static final col n = a("shepherd", cgp.k, awa.BX);
   public static final col o = a("toolsmith", cgp.l, awa.BY);
   public static final col p = a("weaponsmith", cgp.m, awa.BZ);

   @Override
   public String toString() {
      return this.q;
   }

   private static col a(String $$0, aku<cgo> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static col a(String $$0, Predicate<jr<cgo>> $$1, Predicate<jr<cgo>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static col a(String $$0, aku<cgo> $$1, ImmutableSet<cwl> $$2, ImmutableSet<djm> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static col a(String $$0, Predicate<jr<cgo>> $$1, Predicate<jr<cgo>> $$2, ImmutableSet<cwl> $$3, ImmutableSet<djm> $$4, @Nullable avz $$5) {
      return ke.a(mb.x, akv.b($$0), new col($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jr<cgo>> b() {
      return this.r;
   }

   public Predicate<jr<cgo>> c() {
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
