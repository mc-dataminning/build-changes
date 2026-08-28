import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmo(String q, Predicate<ji<cex>> r, Predicate<ji<cex>> s, ImmutableSet<cul> t, ImmutableSet<dfa> u, @Nullable avz v) {
   public static final Predicate<ji<cex>> a = $$0 -> $$0.a(axa.a);
   public static final cmo b = a("none", cex.a, a, null);
   public static final cmo c = a("armorer", cey.a, awa.AV);
   public static final cmo d = a("butcher", cey.b, awa.AW);
   public static final cmo e = a("cartographer", cey.c, awa.AX);
   public static final cmo f = a("cleric", cey.d, awa.AY);
   public static final cmo g = a("farmer", cey.e, ImmutableSet.of(cut.pw, cut.pv, cut.vl, cut.ry), ImmutableSet.of(dfc.cC), awa.AZ);
   public static final cmo h = a("fisherman", cey.f, awa.Ba);
   public static final cmo i = a("fletcher", cey.g, awa.Bb);
   public static final cmo j = a("leatherworker", cey.h, awa.Bc);
   public static final cmo k = a("librarian", cey.i, awa.Bd);
   public static final cmo l = a("mason", cey.j, awa.Be);
   public static final cmo m = a("nitwit", cex.a, cex.a, null);
   public static final cmo n = a("shepherd", cey.k, awa.Bf);
   public static final cmo o = a("toolsmith", cey.l, awa.Bg);
   public static final cmo p = a("weaponsmith", cey.m, awa.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmo a(String $$0, ale<cex> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmo a(String $$0, Predicate<ji<cex>> $$1, Predicate<ji<cex>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmo a(String $$0, ale<cex> $$1, ImmutableSet<cul> $$2, ImmutableSet<dfa> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmo a(String $$0, Predicate<ji<cex>> $$1, Predicate<ji<cex>> $$2, ImmutableSet<cul> $$3, ImmutableSet<dfa> $$4, @Nullable avz $$5) {
      return jv.a(lp.z, new alf($$0), new cmo($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<cex>> b() {
      return this.r;
   }

   public Predicate<ji<cex>> c() {
      return this.s;
   }

   public ImmutableSet<cul> d() {
      return this.t;
   }

   public ImmutableSet<dfa> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
