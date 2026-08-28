import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmm(String q, Predicate<ji<cev>> r, Predicate<ji<cev>> s, ImmutableSet<cuj> t, ImmutableSet<dey> u, @Nullable avy v) {
   public static final Predicate<ji<cev>> a = $$0 -> $$0.a(awz.a);
   public static final cmm b = a("none", cev.a, a, null);
   public static final cmm c = a("armorer", cew.a, avz.AV);
   public static final cmm d = a("butcher", cew.b, avz.AW);
   public static final cmm e = a("cartographer", cew.c, avz.AX);
   public static final cmm f = a("cleric", cew.d, avz.AY);
   public static final cmm g = a("farmer", cew.e, ImmutableSet.of(cur.pw, cur.pv, cur.vl, cur.ry), ImmutableSet.of(dfa.cC), avz.AZ);
   public static final cmm h = a("fisherman", cew.f, avz.Ba);
   public static final cmm i = a("fletcher", cew.g, avz.Bb);
   public static final cmm j = a("leatherworker", cew.h, avz.Bc);
   public static final cmm k = a("librarian", cew.i, avz.Bd);
   public static final cmm l = a("mason", cew.j, avz.Be);
   public static final cmm m = a("nitwit", cev.a, cev.a, null);
   public static final cmm n = a("shepherd", cew.k, avz.Bf);
   public static final cmm o = a("toolsmith", cew.l, avz.Bg);
   public static final cmm p = a("weaponsmith", cew.m, avz.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmm a(String $$0, ald<cev> $$1, @Nullable avy $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmm a(String $$0, Predicate<ji<cev>> $$1, Predicate<ji<cev>> $$2, @Nullable avy $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmm a(String $$0, ald<cev> $$1, ImmutableSet<cuj> $$2, ImmutableSet<dey> $$3, @Nullable avy $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmm a(String $$0, Predicate<ji<cev>> $$1, Predicate<ji<cev>> $$2, ImmutableSet<cuj> $$3, ImmutableSet<dey> $$4, @Nullable avy $$5) {
      return jv.a(lp.z, new ale($$0), new cmm($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<cev>> b() {
      return this.r;
   }

   public Predicate<ji<cev>> c() {
      return this.s;
   }

   public ImmutableSet<cuj> d() {
      return this.t;
   }

   public ImmutableSet<dey> e() {
      return this.u;
   }

   @Nullable
   public avy f() {
      return this.v;
   }
}
