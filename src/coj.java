import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record coj(String q, Predicate<jr<cgm>> r, Predicate<jr<cgm>> s, ImmutableSet<cwj> t, ImmutableSet<djk> u, @Nullable avy v) {
   public static final Predicate<jr<cgm>> a = $$0 -> $$0.a(awz.a);
   public static final coj b = a("none", cgm.a, a, null);
   public static final coj c = a("armorer", cgn.a, avz.BN);
   public static final coj d = a("butcher", cgn.b, avz.BO);
   public static final coj e = a("cartographer", cgn.c, avz.BP);
   public static final coj f = a("cleric", cgn.d, avz.BQ);
   public static final coj g = a("farmer", cgn.e, ImmutableSet.of(cwr.qb, cwr.qa, cwr.wl, cwr.sv), ImmutableSet.of(djm.cK), avz.BR);
   public static final coj h = a("fisherman", cgn.f, avz.BS);
   public static final coj i = a("fletcher", cgn.g, avz.BT);
   public static final coj j = a("leatherworker", cgn.h, avz.BU);
   public static final coj k = a("librarian", cgn.i, avz.BV);
   public static final coj l = a("mason", cgn.j, avz.BW);
   public static final coj m = a("nitwit", cgm.a, cgm.a, null);
   public static final coj n = a("shepherd", cgn.k, avz.BX);
   public static final coj o = a("toolsmith", cgn.l, avz.BY);
   public static final coj p = a("weaponsmith", cgn.m, avz.BZ);

   @Override
   public String toString() {
      return this.q;
   }

   private static coj a(String $$0, akt<cgm> $$1, @Nullable avy $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static coj a(String $$0, Predicate<jr<cgm>> $$1, Predicate<jr<cgm>> $$2, @Nullable avy $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static coj a(String $$0, akt<cgm> $$1, ImmutableSet<cwj> $$2, ImmutableSet<djk> $$3, @Nullable avy $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static coj a(String $$0, Predicate<jr<cgm>> $$1, Predicate<jr<cgm>> $$2, ImmutableSet<cwj> $$3, ImmutableSet<djk> $$4, @Nullable avy $$5) {
      return ke.a(mb.x, aku.b($$0), new coj($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jr<cgm>> b() {
      return this.r;
   }

   public Predicate<jr<cgm>> c() {
      return this.s;
   }

   public ImmutableSet<cwj> d() {
      return this.t;
   }

   public ImmutableSet<djk> e() {
      return this.u;
   }

   @Nullable
   public avy f() {
      return this.v;
   }
}
