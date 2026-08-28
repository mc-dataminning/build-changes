import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cml(String q, Predicate<ji<ceu>> r, Predicate<ji<ceu>> s, ImmutableSet<cui> t, ImmutableSet<dex> u, @Nullable avy v) {
   public static final Predicate<ji<ceu>> a = $$0 -> $$0.a(awz.a);
   public static final cml b = a("none", ceu.a, a, null);
   public static final cml c = a("armorer", cev.a, avz.AV);
   public static final cml d = a("butcher", cev.b, avz.AW);
   public static final cml e = a("cartographer", cev.c, avz.AX);
   public static final cml f = a("cleric", cev.d, avz.AY);
   public static final cml g = a("farmer", cev.e, ImmutableSet.of(cuq.pw, cuq.pv, cuq.vl, cuq.ry), ImmutableSet.of(dez.cC), avz.AZ);
   public static final cml h = a("fisherman", cev.f, avz.Ba);
   public static final cml i = a("fletcher", cev.g, avz.Bb);
   public static final cml j = a("leatherworker", cev.h, avz.Bc);
   public static final cml k = a("librarian", cev.i, avz.Bd);
   public static final cml l = a("mason", cev.j, avz.Be);
   public static final cml m = a("nitwit", ceu.a, ceu.a, null);
   public static final cml n = a("shepherd", cev.k, avz.Bf);
   public static final cml o = a("toolsmith", cev.l, avz.Bg);
   public static final cml p = a("weaponsmith", cev.m, avz.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cml a(String $$0, ald<ceu> $$1, @Nullable avy $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cml a(String $$0, Predicate<ji<ceu>> $$1, Predicate<ji<ceu>> $$2, @Nullable avy $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cml a(String $$0, ald<ceu> $$1, ImmutableSet<cui> $$2, ImmutableSet<dex> $$3, @Nullable avy $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cml a(String $$0, Predicate<ji<ceu>> $$1, Predicate<ji<ceu>> $$2, ImmutableSet<cui> $$3, ImmutableSet<dex> $$4, @Nullable avy $$5) {
      return jv.a(lp.z, new ale($$0), new cml($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<ceu>> b() {
      return this.r;
   }

   public Predicate<ji<ceu>> c() {
      return this.s;
   }

   public ImmutableSet<cui> d() {
      return this.t;
   }

   public ImmutableSet<dex> e() {
      return this.u;
   }

   @Nullable
   public avy f() {
      return this.v;
   }
}
