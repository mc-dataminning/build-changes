import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cfg(String q, Predicate<ih<bxt>> r, Predicate<ih<bxt>> s, ImmutableSet<cnb> t, ImmutableSet<cwy> u, @Nullable ars v) {
   public static final Predicate<ih<bxt>> a = $$0 -> $$0.a(ass.a);
   public static final cfg b = a("none", bxt.a, a, null);
   public static final cfg c = a("armorer", bxu.a, art.Ad);
   public static final cfg d = a("butcher", bxu.b, art.Ae);
   public static final cfg e = a("cartographer", bxu.c, art.Af);
   public static final cfg f = a("cleric", bxu.d, art.Ag);
   public static final cfg g = a("farmer", bxu.e, ImmutableSet.of(cnj.pv, cnj.pu, cnj.vh, cnj.rx), ImmutableSet.of(cxa.cC), art.Ah);
   public static final cfg h = a("fisherman", bxu.f, art.Ai);
   public static final cfg i = a("fletcher", bxu.g, art.Aj);
   public static final cfg j = a("leatherworker", bxu.h, art.Ak);
   public static final cfg k = a("librarian", bxu.i, art.Al);
   public static final cfg l = a("mason", bxu.j, art.Am);
   public static final cfg m = a("nitwit", bxt.a, bxt.a, null);
   public static final cfg n = a("shepherd", bxu.k, art.An);
   public static final cfg o = a("toolsmith", bxu.l, art.Ao);
   public static final cfg p = a("weaponsmith", bxu.m, art.Ap);

   @Override
   public String toString() {
      return this.q;
   }

   private static cfg a(String $$0, ahg<bxt> $$1, @Nullable ars $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cfg a(String $$0, Predicate<ih<bxt>> $$1, Predicate<ih<bxt>> $$2, @Nullable ars $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cfg a(String $$0, ahg<bxt> $$1, ImmutableSet<cnb> $$2, ImmutableSet<cwy> $$3, @Nullable ars $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cfg a(String $$0, Predicate<ih<bxt>> $$1, Predicate<ih<bxt>> $$2, ImmutableSet<cnb> $$3, ImmutableSet<cwy> $$4, @Nullable ars $$5) {
      return it.a(kd.z, new ahh($$0), new cfg($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ih<bxt>> b() {
      return this.r;
   }

   public Predicate<ih<bxt>> c() {
      return this.s;
   }

   public ImmutableSet<cnb> d() {
      return this.t;
   }

   public ImmutableSet<cwy> e() {
      return this.u;
   }

   @Nullable
   public ars f() {
      return this.v;
   }
}
