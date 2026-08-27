import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbb(String q, Predicate<hf<btz>> r, Predicate<hf<btz>> s, ImmutableSet<cir> t, ImmutableSet<csk> u, @Nullable aot v) {
   public static final Predicate<hf<btz>> a = $$0 -> $$0.a(apt.a);
   public static final cbb b = a("none", btz.a, a, null);
   public static final cbb c = a("armorer", bua.a, aou.yJ);
   public static final cbb d = a("butcher", bua.b, aou.yK);
   public static final cbb e = a("cartographer", bua.c, aou.yL);
   public static final cbb f = a("cleric", bua.d, aou.yM);
   public static final cbb g = a("farmer", bua.e, ImmutableSet.of(ciz.oI, ciz.oH, ciz.ur, ciz.qK), ImmutableSet.of(csl.cC), aou.yN);
   public static final cbb h = a("fisherman", bua.f, aou.yO);
   public static final cbb i = a("fletcher", bua.g, aou.yP);
   public static final cbb j = a("leatherworker", bua.h, aou.yQ);
   public static final cbb k = a("librarian", bua.i, aou.yR);
   public static final cbb l = a("mason", bua.j, aou.yS);
   public static final cbb m = a("nitwit", btz.a, btz.a, null);
   public static final cbb n = a("shepherd", bua.k, aou.yT);
   public static final cbb o = a("toolsmith", bua.l, aou.yU);
   public static final cbb p = a("weaponsmith", bua.m, aou.yV);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbb a(String $$0, aeo<btz> $$1, @Nullable aot $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbb a(String $$0, Predicate<hf<btz>> $$1, Predicate<hf<btz>> $$2, @Nullable aot $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbb a(String $$0, aeo<btz> $$1, ImmutableSet<cir> $$2, ImmutableSet<csk> $$3, @Nullable aot $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbb a(String $$0, Predicate<hf<btz>> $$1, Predicate<hf<btz>> $$2, ImmutableSet<cir> $$3, ImmutableSet<csk> $$4, @Nullable aot $$5) {
      return hs.a(jc.A, new aep($$0), new cbb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<hf<btz>> b() {
      return this.r;
   }

   public Predicate<hf<btz>> c() {
      return this.s;
   }

   public ImmutableSet<cir> d() {
      return this.t;
   }

   public ImmutableSet<csk> e() {
      return this.u;
   }

   @Nullable
   public aot f() {
      return this.v;
   }
}
