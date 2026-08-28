import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cml(String q, Predicate<jm<cet>> r, Predicate<jm<cet>> s, ImmutableSet<cuj> t, ImmutableSet<dfw> u, @Nullable avn v) {
   public static final Predicate<jm<cet>> a = $$0 -> $$0.a(awo.a);
   public static final cml b = a("none", cet.a, a, null);
   public static final cml c = a("armorer", ceu.a, avo.AZ);
   public static final cml d = a("butcher", ceu.b, avo.Ba);
   public static final cml e = a("cartographer", ceu.c, avo.Bb);
   public static final cml f = a("cleric", ceu.d, avo.Bc);
   public static final cml g = a("farmer", ceu.e, ImmutableSet.of(cur.pw, cur.pv, cur.vl, cur.ry), ImmutableSet.of(dfy.cC), avo.Bd);
   public static final cml h = a("fisherman", ceu.f, avo.Be);
   public static final cml i = a("fletcher", ceu.g, avo.Bf);
   public static final cml j = a("leatherworker", ceu.h, avo.Bg);
   public static final cml k = a("librarian", ceu.i, avo.Bh);
   public static final cml l = a("mason", ceu.j, avo.Bi);
   public static final cml m = a("nitwit", cet.a, cet.a, null);
   public static final cml n = a("shepherd", ceu.k, avo.Bj);
   public static final cml o = a("toolsmith", ceu.l, avo.Bk);
   public static final cml p = a("weaponsmith", ceu.m, avo.Bl);

   @Override
   public String toString() {
      return this.q;
   }

   private static cml a(String $$0, akp<cet> $$1, @Nullable avn $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cml a(String $$0, Predicate<jm<cet>> $$1, Predicate<jm<cet>> $$2, @Nullable avn $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cml a(String $$0, akp<cet> $$1, ImmutableSet<cuj> $$2, ImmutableSet<dfw> $$3, @Nullable avn $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cml a(String $$0, Predicate<jm<cet>> $$1, Predicate<jm<cet>> $$2, ImmutableSet<cuj> $$3, ImmutableSet<dfw> $$4, @Nullable avn $$5) {
      return jz.a(lt.x, akq.b($$0), new cml($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jm<cet>> b() {
      return this.r;
   }

   public Predicate<jm<cet>> c() {
      return this.s;
   }

   public ImmutableSet<cuj> d() {
      return this.t;
   }

   public ImmutableSet<dfw> e() {
      return this.u;
   }

   @Nullable
   public avn f() {
      return this.v;
   }
}
