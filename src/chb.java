import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record chb(String q, Predicate<ij<bzo>> r, Predicate<ij<bzo>> s, ImmutableSet<coy> t, ImmutableSet<cys> u, @Nullable atk v) {
   public static final Predicate<ij<bzo>> a = $$0 -> $$0.a(auk.a);
   public static final chb b = a("none", bzo.a, a, null);
   public static final chb c = a("armorer", bzp.a, atl.Ae);
   public static final chb d = a("butcher", bzp.b, atl.Af);
   public static final chb e = a("cartographer", bzp.c, atl.Ag);
   public static final chb f = a("cleric", bzp.d, atl.Ah);
   public static final chb g = a("farmer", bzp.e, ImmutableSet.of(cpg.pv, cpg.pu, cpg.vh, cpg.rx), ImmutableSet.of(cyu.cC), atl.Ai);
   public static final chb h = a("fisherman", bzp.f, atl.Aj);
   public static final chb i = a("fletcher", bzp.g, atl.Ak);
   public static final chb j = a("leatherworker", bzp.h, atl.Al);
   public static final chb k = a("librarian", bzp.i, atl.Am);
   public static final chb l = a("mason", bzp.j, atl.An);
   public static final chb m = a("nitwit", bzo.a, bzo.a, null);
   public static final chb n = a("shepherd", bzp.k, atl.Ao);
   public static final chb o = a("toolsmith", bzp.l, atl.Ap);
   public static final chb p = a("weaponsmith", bzp.m, atl.Aq);

   @Override
   public String toString() {
      return this.q;
   }

   private static chb a(String $$0, aix<bzo> $$1, @Nullable atk $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static chb a(String $$0, Predicate<ij<bzo>> $$1, Predicate<ij<bzo>> $$2, @Nullable atk $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static chb a(String $$0, aix<bzo> $$1, ImmutableSet<coy> $$2, ImmutableSet<cys> $$3, @Nullable atk $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static chb a(String $$0, Predicate<ij<bzo>> $$1, Predicate<ij<bzo>> $$2, ImmutableSet<coy> $$3, ImmutableSet<cys> $$4, @Nullable atk $$5) {
      return iv.a(kf.z, new aiy($$0), new chb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ij<bzo>> b() {
      return this.r;
   }

   public Predicate<ij<bzo>> c() {
      return this.s;
   }

   public ImmutableSet<coy> d() {
      return this.t;
   }

   public ImmutableSet<cys> e() {
      return this.u;
   }

   @Nullable
   public atk f() {
      return this.v;
   }
}
