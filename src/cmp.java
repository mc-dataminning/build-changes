import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmp(String q, Predicate<ji<cey>> r, Predicate<ji<cey>> s, ImmutableSet<cum> t, ImmutableSet<dfb> u, @Nullable avz v) {
   public static final Predicate<ji<cey>> a = $$0 -> $$0.a(axa.a);
   public static final cmp b = a("none", cey.a, a, null);
   public static final cmp c = a("armorer", cez.a, awa.AV);
   public static final cmp d = a("butcher", cez.b, awa.AW);
   public static final cmp e = a("cartographer", cez.c, awa.AX);
   public static final cmp f = a("cleric", cez.d, awa.AY);
   public static final cmp g = a("farmer", cez.e, ImmutableSet.of(cuu.pw, cuu.pv, cuu.vl, cuu.ry), ImmutableSet.of(dfd.cC), awa.AZ);
   public static final cmp h = a("fisherman", cez.f, awa.Ba);
   public static final cmp i = a("fletcher", cez.g, awa.Bb);
   public static final cmp j = a("leatherworker", cez.h, awa.Bc);
   public static final cmp k = a("librarian", cez.i, awa.Bd);
   public static final cmp l = a("mason", cez.j, awa.Be);
   public static final cmp m = a("nitwit", cey.a, cey.a, null);
   public static final cmp n = a("shepherd", cez.k, awa.Bf);
   public static final cmp o = a("toolsmith", cez.l, awa.Bg);
   public static final cmp p = a("weaponsmith", cez.m, awa.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmp a(String $$0, ale<cey> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmp a(String $$0, Predicate<ji<cey>> $$1, Predicate<ji<cey>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmp a(String $$0, ale<cey> $$1, ImmutableSet<cum> $$2, ImmutableSet<dfb> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmp a(String $$0, Predicate<ji<cey>> $$1, Predicate<ji<cey>> $$2, ImmutableSet<cum> $$3, ImmutableSet<dfb> $$4, @Nullable avz $$5) {
      return jv.a(lp.z, new alf($$0), new cmp($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<cey>> b() {
      return this.r;
   }

   public Predicate<ji<cey>> c() {
      return this.s;
   }

   public ImmutableSet<cum> d() {
      return this.t;
   }

   public ImmutableSet<dfb> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
