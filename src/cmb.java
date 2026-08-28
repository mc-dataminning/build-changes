import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmb(String q, Predicate<jj<cej>> r, Predicate<jj<cej>> s, ImmutableSet<cty> t, ImmutableSet<dfi> u, @Nullable avg v) {
   public static final Predicate<jj<cej>> a = $$0 -> $$0.a(awh.a);
   public static final cmb b = a("none", cej.a, a, null);
   public static final cmb c = a("armorer", cek.a, avh.AY);
   public static final cmb d = a("butcher", cek.b, avh.AZ);
   public static final cmb e = a("cartographer", cek.c, avh.Ba);
   public static final cmb f = a("cleric", cek.d, avh.Bb);
   public static final cmb g = a("farmer", cek.e, ImmutableSet.of(cug.pw, cug.pv, cug.vl, cug.ry), ImmutableSet.of(dfk.cC), avh.Bc);
   public static final cmb h = a("fisherman", cek.f, avh.Bd);
   public static final cmb i = a("fletcher", cek.g, avh.Be);
   public static final cmb j = a("leatherworker", cek.h, avh.Bf);
   public static final cmb k = a("librarian", cek.i, avh.Bg);
   public static final cmb l = a("mason", cek.j, avh.Bh);
   public static final cmb m = a("nitwit", cej.a, cej.a, null);
   public static final cmb n = a("shepherd", cek.k, avh.Bi);
   public static final cmb o = a("toolsmith", cek.l, avh.Bj);
   public static final cmb p = a("weaponsmith", cek.m, avh.Bk);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmb a(String $$0, akj<cej> $$1, @Nullable avg $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmb a(String $$0, Predicate<jj<cej>> $$1, Predicate<jj<cej>> $$2, @Nullable avg $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmb a(String $$0, akj<cej> $$1, ImmutableSet<cty> $$2, ImmutableSet<dfi> $$3, @Nullable avg $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmb a(String $$0, Predicate<jj<cej>> $$1, Predicate<jj<cej>> $$2, ImmutableSet<cty> $$3, ImmutableSet<dfi> $$4, @Nullable avg $$5) {
      return jw.a(lq.x, new akk($$0), new cmb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jj<cej>> b() {
      return this.r;
   }

   public Predicate<jj<cej>> c() {
      return this.s;
   }

   public ImmutableSet<cty> d() {
      return this.t;
   }

   public ImmutableSet<dfi> e() {
      return this.u;
   }

   @Nullable
   public avg f() {
      return this.v;
   }
}
