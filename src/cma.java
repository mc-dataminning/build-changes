import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cma(String q, Predicate<jj<cei>> r, Predicate<jj<cei>> s, ImmutableSet<ctx> t, ImmutableSet<dfh> u, @Nullable avg v) {
   public static final Predicate<jj<cei>> a = $$0 -> $$0.a(awh.a);
   public static final cma b = a("none", cei.a, a, null);
   public static final cma c = a("armorer", cej.a, avh.AY);
   public static final cma d = a("butcher", cej.b, avh.AZ);
   public static final cma e = a("cartographer", cej.c, avh.Ba);
   public static final cma f = a("cleric", cej.d, avh.Bb);
   public static final cma g = a("farmer", cej.e, ImmutableSet.of(cuf.pw, cuf.pv, cuf.vl, cuf.ry), ImmutableSet.of(dfj.cC), avh.Bc);
   public static final cma h = a("fisherman", cej.f, avh.Bd);
   public static final cma i = a("fletcher", cej.g, avh.Be);
   public static final cma j = a("leatherworker", cej.h, avh.Bf);
   public static final cma k = a("librarian", cej.i, avh.Bg);
   public static final cma l = a("mason", cej.j, avh.Bh);
   public static final cma m = a("nitwit", cei.a, cei.a, null);
   public static final cma n = a("shepherd", cej.k, avh.Bi);
   public static final cma o = a("toolsmith", cej.l, avh.Bj);
   public static final cma p = a("weaponsmith", cej.m, avh.Bk);

   @Override
   public String toString() {
      return this.q;
   }

   private static cma a(String $$0, akj<cei> $$1, @Nullable avg $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cma a(String $$0, Predicate<jj<cei>> $$1, Predicate<jj<cei>> $$2, @Nullable avg $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cma a(String $$0, akj<cei> $$1, ImmutableSet<ctx> $$2, ImmutableSet<dfh> $$3, @Nullable avg $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cma a(String $$0, Predicate<jj<cei>> $$1, Predicate<jj<cei>> $$2, ImmutableSet<ctx> $$3, ImmutableSet<dfh> $$4, @Nullable avg $$5) {
      return jw.a(lq.x, new akk($$0), new cma($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jj<cei>> b() {
      return this.r;
   }

   public Predicate<jj<cei>> c() {
      return this.s;
   }

   public ImmutableSet<ctx> d() {
      return this.t;
   }

   public ImmutableSet<dfh> e() {
      return this.u;
   }

   @Nullable
   public avg f() {
      return this.v;
   }
}
