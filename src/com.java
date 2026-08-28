import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record com(String q, Predicate<jr<cgp>> r, Predicate<jr<cgp>> s, ImmutableSet<cwm> t, ImmutableSet<djn> u, @Nullable avz v) {
   public static final Predicate<jr<cgp>> a = $$0 -> $$0.a(axa.a);
   public static final com b = a("none", cgp.a, a, null);
   public static final com c = a("armorer", cgq.a, awa.BN);
   public static final com d = a("butcher", cgq.b, awa.BO);
   public static final com e = a("cartographer", cgq.c, awa.BP);
   public static final com f = a("cleric", cgq.d, awa.BQ);
   public static final com g = a("farmer", cgq.e, ImmutableSet.of(cwu.qb, cwu.qa, cwu.wl, cwu.sv), ImmutableSet.of(djp.cK), awa.BR);
   public static final com h = a("fisherman", cgq.f, awa.BS);
   public static final com i = a("fletcher", cgq.g, awa.BT);
   public static final com j = a("leatherworker", cgq.h, awa.BU);
   public static final com k = a("librarian", cgq.i, awa.BV);
   public static final com l = a("mason", cgq.j, awa.BW);
   public static final com m = a("nitwit", cgp.a, cgp.a, null);
   public static final com n = a("shepherd", cgq.k, awa.BX);
   public static final com o = a("toolsmith", cgq.l, awa.BY);
   public static final com p = a("weaponsmith", cgq.m, awa.BZ);

   @Override
   public String toString() {
      return this.q;
   }

   private static com a(String $$0, aku<cgp> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static com a(String $$0, Predicate<jr<cgp>> $$1, Predicate<jr<cgp>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static com a(String $$0, aku<cgp> $$1, ImmutableSet<cwm> $$2, ImmutableSet<djn> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static com a(String $$0, Predicate<jr<cgp>> $$1, Predicate<jr<cgp>> $$2, ImmutableSet<cwm> $$3, ImmutableSet<djn> $$4, @Nullable avz $$5) {
      return ke.a(mb.x, akv.b($$0), new com($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jr<cgp>> b() {
      return this.r;
   }

   public Predicate<jr<cgp>> c() {
      return this.s;
   }

   public ImmutableSet<cwm> d() {
      return this.t;
   }

   public ImmutableSet<djn> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
