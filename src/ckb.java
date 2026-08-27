import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record ckb(String q, Predicate<iv<cck>> r, Predicate<iv<cck>> s, ImmutableSet<cry> t, ImmutableSet<dcv> u, @Nullable auy v) {
   public static final Predicate<iv<cck>> a = $$0 -> $$0.a(avy.a);
   public static final ckb b = a("none", cck.a, a, null);
   public static final ckb c = a("armorer", ccl.a, auz.AJ);
   public static final ckb d = a("butcher", ccl.b, auz.AK);
   public static final ckb e = a("cartographer", ccl.c, auz.AL);
   public static final ckb f = a("cleric", ccl.d, auz.AM);
   public static final ckb g = a("farmer", ccl.e, ImmutableSet.of(csg.pw, csg.pv, csg.vl, csg.ry), ImmutableSet.of(dcx.cC), auz.AN);
   public static final ckb h = a("fisherman", ccl.f, auz.AO);
   public static final ckb i = a("fletcher", ccl.g, auz.AP);
   public static final ckb j = a("leatherworker", ccl.h, auz.AQ);
   public static final ckb k = a("librarian", ccl.i, auz.AR);
   public static final ckb l = a("mason", ccl.j, auz.AS);
   public static final ckb m = a("nitwit", cck.a, cck.a, null);
   public static final ckb n = a("shepherd", ccl.k, auz.AT);
   public static final ckb o = a("toolsmith", ccl.l, auz.AU);
   public static final ckb p = a("weaponsmith", ccl.m, auz.AV);

   @Override
   public String toString() {
      return this.q;
   }

   private static ckb a(String $$0, ake<cck> $$1, @Nullable auy $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static ckb a(String $$0, Predicate<iv<cck>> $$1, Predicate<iv<cck>> $$2, @Nullable auy $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static ckb a(String $$0, ake<cck> $$1, ImmutableSet<cry> $$2, ImmutableSet<dcv> $$3, @Nullable auy $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static ckb a(String $$0, Predicate<iv<cck>> $$1, Predicate<iv<cck>> $$2, ImmutableSet<cry> $$3, ImmutableSet<dcv> $$4, @Nullable auy $$5) {
      return ji.a(lc.z, new akf($$0), new ckb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<iv<cck>> b() {
      return this.r;
   }

   public Predicate<iv<cck>> c() {
      return this.s;
   }

   public ImmutableSet<cry> d() {
      return this.t;
   }

   public ImmutableSet<dcv> e() {
      return this.u;
   }

   @Nullable
   public auy f() {
      return this.v;
   }
}
