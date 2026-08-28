import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cof(String q, Predicate<jq<cgl>> r, Predicate<jq<cgl>> s, ImmutableSet<cwb> t, ImmutableSet<dij> u, @Nullable awn v) {
   public static final Predicate<jq<cgl>> a = $$0 -> $$0.a(axo.a);
   public static final cof b = a("none", cgl.a, a, null);
   public static final cof c = a("armorer", cgm.a, awo.Bd);
   public static final cof d = a("butcher", cgm.b, awo.Be);
   public static final cof e = a("cartographer", cgm.c, awo.Bf);
   public static final cof f = a("cleric", cgm.d, awo.Bg);
   public static final cof g = a("farmer", cgm.e, ImmutableSet.of(cwj.px, cwj.pw, cwj.vD, cwj.rP), ImmutableSet.of(dil.cC), awo.Bh);
   public static final cof h = a("fisherman", cgm.f, awo.Bi);
   public static final cof i = a("fletcher", cgm.g, awo.Bj);
   public static final cof j = a("leatherworker", cgm.h, awo.Bk);
   public static final cof k = a("librarian", cgm.i, awo.Bl);
   public static final cof l = a("mason", cgm.j, awo.Bm);
   public static final cof m = a("nitwit", cgl.a, cgl.a, null);
   public static final cof n = a("shepherd", cgm.k, awo.Bn);
   public static final cof o = a("toolsmith", cgm.l, awo.Bo);
   public static final cof p = a("weaponsmith", cgm.m, awo.Bp);

   @Override
   public String toString() {
      return this.q;
   }

   private static cof a(String $$0, alk<cgl> $$1, @Nullable awn $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cof a(String $$0, Predicate<jq<cgl>> $$1, Predicate<jq<cgl>> $$2, @Nullable awn $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cof a(String $$0, alk<cgl> $$1, ImmutableSet<cwb> $$2, ImmutableSet<dij> $$3, @Nullable awn $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cof a(String $$0, Predicate<jq<cgl>> $$1, Predicate<jq<cgl>> $$2, ImmutableSet<cwb> $$3, ImmutableSet<dij> $$4, @Nullable awn $$5) {
      return kd.a(lz.x, all.b($$0), new cof($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<cgl>> b() {
      return this.r;
   }

   public Predicate<jq<cgl>> c() {
      return this.s;
   }

   public ImmutableSet<cwb> d() {
      return this.t;
   }

   public ImmutableSet<dij> e() {
      return this.u;
   }

   @Nullable
   public awn f() {
      return this.v;
   }
}
