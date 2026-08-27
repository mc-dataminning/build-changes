import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cgx(String q, Predicate<ij<bzk>> r, Predicate<ij<bzk>> s, ImmutableSet<cou> t, ImmutableSet<cyo> u, @Nullable atj v) {
   public static final Predicate<ij<bzk>> a = $$0 -> $$0.a(auj.a);
   public static final cgx b = a("none", bzk.a, a, null);
   public static final cgx c = a("armorer", bzl.a, atk.Ad);
   public static final cgx d = a("butcher", bzl.b, atk.Ae);
   public static final cgx e = a("cartographer", bzl.c, atk.Af);
   public static final cgx f = a("cleric", bzl.d, atk.Ag);
   public static final cgx g = a("farmer", bzl.e, ImmutableSet.of(cpc.pv, cpc.pu, cpc.vh, cpc.rx), ImmutableSet.of(cyq.cC), atk.Ah);
   public static final cgx h = a("fisherman", bzl.f, atk.Ai);
   public static final cgx i = a("fletcher", bzl.g, atk.Aj);
   public static final cgx j = a("leatherworker", bzl.h, atk.Ak);
   public static final cgx k = a("librarian", bzl.i, atk.Al);
   public static final cgx l = a("mason", bzl.j, atk.Am);
   public static final cgx m = a("nitwit", bzk.a, bzk.a, null);
   public static final cgx n = a("shepherd", bzl.k, atk.An);
   public static final cgx o = a("toolsmith", bzl.l, atk.Ao);
   public static final cgx p = a("weaponsmith", bzl.m, atk.Ap);

   @Override
   public String toString() {
      return this.q;
   }

   private static cgx a(String $$0, aix<bzk> $$1, @Nullable atj $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cgx a(String $$0, Predicate<ij<bzk>> $$1, Predicate<ij<bzk>> $$2, @Nullable atj $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cgx a(String $$0, aix<bzk> $$1, ImmutableSet<cou> $$2, ImmutableSet<cyo> $$3, @Nullable atj $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cgx a(String $$0, Predicate<ij<bzk>> $$1, Predicate<ij<bzk>> $$2, ImmutableSet<cou> $$3, ImmutableSet<cyo> $$4, @Nullable atj $$5) {
      return iv.a(kf.z, new aiy($$0), new cgx($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ij<bzk>> b() {
      return this.r;
   }

   public Predicate<ij<bzk>> c() {
      return this.s;
   }

   public ImmutableSet<cou> d() {
      return this.t;
   }

   public ImmutableSet<cyo> e() {
      return this.u;
   }

   @Nullable
   public atj f() {
      return this.v;
   }
}
