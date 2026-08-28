import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record coi(String q, Predicate<jq<cgo>> r, Predicate<jq<cgo>> s, ImmutableSet<cwi> t, ImmutableSet<diq> u, @Nullable awm v) {
   public static final Predicate<jq<cgo>> a = $$0 -> $$0.a(axn.a);
   public static final coi b = a("none", cgo.a, a, null);
   public static final coi c = a("armorer", cgp.a, awn.Bd);
   public static final coi d = a("butcher", cgp.b, awn.Be);
   public static final coi e = a("cartographer", cgp.c, awn.Bf);
   public static final coi f = a("cleric", cgp.d, awn.Bg);
   public static final coi g = a("farmer", cgp.e, ImmutableSet.of(cwq.px, cwq.pw, cwq.vD, cwq.rP), ImmutableSet.of(dis.cC), awn.Bh);
   public static final coi h = a("fisherman", cgp.f, awn.Bi);
   public static final coi i = a("fletcher", cgp.g, awn.Bj);
   public static final coi j = a("leatherworker", cgp.h, awn.Bk);
   public static final coi k = a("librarian", cgp.i, awn.Bl);
   public static final coi l = a("mason", cgp.j, awn.Bm);
   public static final coi m = a("nitwit", cgo.a, cgo.a, null);
   public static final coi n = a("shepherd", cgp.k, awn.Bn);
   public static final coi o = a("toolsmith", cgp.l, awn.Bo);
   public static final coi p = a("weaponsmith", cgp.m, awn.Bp);

   @Override
   public String toString() {
      return this.q;
   }

   private static coi a(String $$0, ali<cgo> $$1, @Nullable awm $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static coi a(String $$0, Predicate<jq<cgo>> $$1, Predicate<jq<cgo>> $$2, @Nullable awm $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static coi a(String $$0, ali<cgo> $$1, ImmutableSet<cwi> $$2, ImmutableSet<diq> $$3, @Nullable awm $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static coi a(String $$0, Predicate<jq<cgo>> $$1, Predicate<jq<cgo>> $$2, ImmutableSet<cwi> $$3, ImmutableSet<diq> $$4, @Nullable awm $$5) {
      return kd.a(lz.x, alj.b($$0), new coi($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<cgo>> b() {
      return this.r;
   }

   public Predicate<jq<cgo>> c() {
      return this.s;
   }

   public ImmutableSet<cwi> d() {
      return this.t;
   }

   public ImmutableSet<diq> e() {
      return this.u;
   }

   @Nullable
   public awm f() {
      return this.v;
   }
}
