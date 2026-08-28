import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmn(String q, Predicate<ji<cew>> r, Predicate<ji<cew>> s, ImmutableSet<cuk> t, ImmutableSet<dez> u, @Nullable avz v) {
   public static final Predicate<ji<cew>> a = $$0 -> $$0.a(axa.a);
   public static final cmn b = a("none", cew.a, a, null);
   public static final cmn c = a("armorer", cex.a, awa.AV);
   public static final cmn d = a("butcher", cex.b, awa.AW);
   public static final cmn e = a("cartographer", cex.c, awa.AX);
   public static final cmn f = a("cleric", cex.d, awa.AY);
   public static final cmn g = a("farmer", cex.e, ImmutableSet.of(cus.pw, cus.pv, cus.vl, cus.ry), ImmutableSet.of(dfb.cC), awa.AZ);
   public static final cmn h = a("fisherman", cex.f, awa.Ba);
   public static final cmn i = a("fletcher", cex.g, awa.Bb);
   public static final cmn j = a("leatherworker", cex.h, awa.Bc);
   public static final cmn k = a("librarian", cex.i, awa.Bd);
   public static final cmn l = a("mason", cex.j, awa.Be);
   public static final cmn m = a("nitwit", cew.a, cew.a, null);
   public static final cmn n = a("shepherd", cex.k, awa.Bf);
   public static final cmn o = a("toolsmith", cex.l, awa.Bg);
   public static final cmn p = a("weaponsmith", cex.m, awa.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmn a(String $$0, ale<cew> $$1, @Nullable avz $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmn a(String $$0, Predicate<ji<cew>> $$1, Predicate<ji<cew>> $$2, @Nullable avz $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmn a(String $$0, ale<cew> $$1, ImmutableSet<cuk> $$2, ImmutableSet<dez> $$3, @Nullable avz $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmn a(String $$0, Predicate<ji<cew>> $$1, Predicate<ji<cew>> $$2, ImmutableSet<cuk> $$3, ImmutableSet<dez> $$4, @Nullable avz $$5) {
      return jv.a(lp.z, new alf($$0), new cmn($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<cew>> b() {
      return this.r;
   }

   public Predicate<ji<cew>> c() {
      return this.s;
   }

   public ImmutableSet<cuk> d() {
      return this.t;
   }

   public ImmutableSet<dez> e() {
      return this.u;
   }

   @Nullable
   public avz f() {
      return this.v;
   }
}
