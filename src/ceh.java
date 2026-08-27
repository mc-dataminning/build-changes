import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record ceh(String q, Predicate<ie<bwz>> r, Predicate<ie<bwz>> s, ImmutableSet<cmc> t, ImmutableSet<cvz> u, @Nullable arb v) {
   public static final Predicate<ie<bwz>> a = $$0 -> $$0.a(asb.a);
   public static final ceh b = a("none", bwz.a, a, null);
   public static final ceh c = a("armorer", bxa.a, arc.zO);
   public static final ceh d = a("butcher", bxa.b, arc.zP);
   public static final ceh e = a("cartographer", bxa.c, arc.zQ);
   public static final ceh f = a("cleric", bxa.d, arc.zR);
   public static final ceh g = a("farmer", bxa.e, ImmutableSet.of(cmk.pt, cmk.ps, cmk.ve, cmk.rv), ImmutableSet.of(cwb.cC), arc.zS);
   public static final ceh h = a("fisherman", bxa.f, arc.zT);
   public static final ceh i = a("fletcher", bxa.g, arc.zU);
   public static final ceh j = a("leatherworker", bxa.h, arc.zV);
   public static final ceh k = a("librarian", bxa.i, arc.zW);
   public static final ceh l = a("mason", bxa.j, arc.zX);
   public static final ceh m = a("nitwit", bwz.a, bwz.a, null);
   public static final ceh n = a("shepherd", bxa.k, arc.zY);
   public static final ceh o = a("toolsmith", bxa.l, arc.zZ);
   public static final ceh p = a("weaponsmith", bxa.m, arc.Aa);

   @Override
   public String toString() {
      return this.q;
   }

   private static ceh a(String $$0, ags<bwz> $$1, @Nullable arb $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static ceh a(String $$0, Predicate<ie<bwz>> $$1, Predicate<ie<bwz>> $$2, @Nullable arb $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static ceh a(String $$0, ags<bwz> $$1, ImmutableSet<cmc> $$2, ImmutableSet<cvz> $$3, @Nullable arb $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static ceh a(String $$0, Predicate<ie<bwz>> $$1, Predicate<ie<bwz>> $$2, ImmutableSet<cmc> $$3, ImmutableSet<cvz> $$4, @Nullable arb $$5) {
      return ir.a(kb.z, new agt($$0), new ceh($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ie<bwz>> b() {
      return this.r;
   }

   public Predicate<ie<bwz>> c() {
      return this.s;
   }

   public ImmutableSet<cmc> d() {
      return this.t;
   }

   public ImmutableSet<cvz> e() {
      return this.u;
   }

   @Nullable
   public arb f() {
      return this.v;
   }
}
