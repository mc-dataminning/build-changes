import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbc(String q, Predicate<he<bua>> r, Predicate<he<bua>> s, ImmutableSet<cis> t, ImmutableSet<csl> u, @Nullable aov v) {
   public static final Predicate<he<bua>> a = $$0 -> $$0.a(apv.a);
   public static final cbc b = a("none", bua.a, a, null);
   public static final cbc c = a("armorer", bub.a, aow.yO);
   public static final cbc d = a("butcher", bub.b, aow.yP);
   public static final cbc e = a("cartographer", bub.c, aow.yQ);
   public static final cbc f = a("cleric", bub.d, aow.yR);
   public static final cbc g = a("farmer", bub.e, ImmutableSet.of(cja.oI, cja.oH, cja.ur, cja.qK), ImmutableSet.of(csm.cC), aow.yS);
   public static final cbc h = a("fisherman", bub.f, aow.yT);
   public static final cbc i = a("fletcher", bub.g, aow.yU);
   public static final cbc j = a("leatherworker", bub.h, aow.yV);
   public static final cbc k = a("librarian", bub.i, aow.yW);
   public static final cbc l = a("mason", bub.j, aow.yX);
   public static final cbc m = a("nitwit", bua.a, bua.a, null);
   public static final cbc n = a("shepherd", bub.k, aow.yY);
   public static final cbc o = a("toolsmith", bub.l, aow.yZ);
   public static final cbc p = a("weaponsmith", bub.m, aow.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbc a(String $$0, aeq<bua> $$1, @Nullable aov $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbc a(String $$0, Predicate<he<bua>> $$1, Predicate<he<bua>> $$2, @Nullable aov $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbc a(String $$0, aeq<bua> $$1, ImmutableSet<cis> $$2, ImmutableSet<csl> $$3, @Nullable aov $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbc a(String $$0, Predicate<he<bua>> $$1, Predicate<he<bua>> $$2, ImmutableSet<cis> $$3, ImmutableSet<csl> $$4, @Nullable aov $$5) {
      return hr.a(jb.A, new aer($$0), new cbc($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<he<bua>> b() {
      return this.r;
   }

   public Predicate<he<bua>> c() {
      return this.s;
   }

   public ImmutableSet<cis> d() {
      return this.t;
   }

   public ImmutableSet<csl> e() {
      return this.u;
   }

   @Nullable
   public aov f() {
      return this.v;
   }
}
