import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cmi(String q, Predicate<ji<cer>> r, Predicate<ji<cer>> s, ImmutableSet<cuf> t, ImmutableSet<deu> u, @Nullable avv v) {
   public static final Predicate<ji<cer>> a = $$0 -> $$0.a(aww.a);
   public static final cmi b = a("none", cer.a, a, null);
   public static final cmi c = a("armorer", ces.a, avw.AV);
   public static final cmi d = a("butcher", ces.b, avw.AW);
   public static final cmi e = a("cartographer", ces.c, avw.AX);
   public static final cmi f = a("cleric", ces.d, avw.AY);
   public static final cmi g = a("farmer", ces.e, ImmutableSet.of(cun.pw, cun.pv, cun.vl, cun.ry), ImmutableSet.of(dew.cC), avw.AZ);
   public static final cmi h = a("fisherman", ces.f, avw.Ba);
   public static final cmi i = a("fletcher", ces.g, avw.Bb);
   public static final cmi j = a("leatherworker", ces.h, avw.Bc);
   public static final cmi k = a("librarian", ces.i, avw.Bd);
   public static final cmi l = a("mason", ces.j, avw.Be);
   public static final cmi m = a("nitwit", cer.a, cer.a, null);
   public static final cmi n = a("shepherd", ces.k, avw.Bf);
   public static final cmi o = a("toolsmith", ces.l, avw.Bg);
   public static final cmi p = a("weaponsmith", ces.m, avw.Bh);

   @Override
   public String toString() {
      return this.q;
   }

   private static cmi a(String $$0, ala<cer> $$1, @Nullable avv $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cmi a(String $$0, Predicate<ji<cer>> $$1, Predicate<ji<cer>> $$2, @Nullable avv $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cmi a(String $$0, ala<cer> $$1, ImmutableSet<cuf> $$2, ImmutableSet<deu> $$3, @Nullable avv $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cmi a(String $$0, Predicate<ji<cer>> $$1, Predicate<ji<cer>> $$2, ImmutableSet<cuf> $$3, ImmutableSet<deu> $$4, @Nullable avv $$5) {
      return jv.a(lp.z, new alb($$0), new cmi($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ji<cer>> b() {
      return this.r;
   }

   public Predicate<ji<cer>> c() {
      return this.s;
   }

   public ImmutableSet<cuf> d() {
      return this.t;
   }

   public ImmutableSet<deu> e() {
      return this.u;
   }

   @Nullable
   public avv f() {
      return this.v;
   }
}
