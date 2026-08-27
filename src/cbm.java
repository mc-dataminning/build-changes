import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbm(String q, Predicate<hg<buk>> r, Predicate<hg<buk>> s, ImmutableSet<cjc> t, ImmutableSet<csx> u, @Nullable ape v) {
   public static final Predicate<hg<buk>> a = $$0 -> $$0.a(aqe.a);
   public static final cbm b = a("none", buk.a, a, null);
   public static final cbm c = a("armorer", bul.a, apf.yO);
   public static final cbm d = a("butcher", bul.b, apf.yP);
   public static final cbm e = a("cartographer", bul.c, apf.yQ);
   public static final cbm f = a("cleric", bul.d, apf.yR);
   public static final cbm g = a("farmer", bul.e, ImmutableSet.of(cjk.oI, cjk.oH, cjk.ur, cjk.qK), ImmutableSet.of(csy.cC), apf.yS);
   public static final cbm h = a("fisherman", bul.f, apf.yT);
   public static final cbm i = a("fletcher", bul.g, apf.yU);
   public static final cbm j = a("leatherworker", bul.h, apf.yV);
   public static final cbm k = a("librarian", bul.i, apf.yW);
   public static final cbm l = a("mason", bul.j, apf.yX);
   public static final cbm m = a("nitwit", buk.a, buk.a, null);
   public static final cbm n = a("shepherd", bul.k, apf.yY);
   public static final cbm o = a("toolsmith", bul.l, apf.yZ);
   public static final cbm p = a("weaponsmith", bul.m, apf.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbm a(String $$0, aex<buk> $$1, @Nullable ape $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbm a(String $$0, Predicate<hg<buk>> $$1, Predicate<hg<buk>> $$2, @Nullable ape $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbm a(String $$0, aex<buk> $$1, ImmutableSet<cjc> $$2, ImmutableSet<csx> $$3, @Nullable ape $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbm a(String $$0, Predicate<hg<buk>> $$1, Predicate<hg<buk>> $$2, ImmutableSet<cjc> $$3, ImmutableSet<csx> $$4, @Nullable ape $$5) {
      return ht.a(jd.A, new aey($$0), new cbm($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<hg<buk>> b() {
      return this.r;
   }

   public Predicate<hg<buk>> c() {
      return this.s;
   }

   public ImmutableSet<cjc> d() {
      return this.t;
   }

   public ImmutableSet<csx> e() {
      return this.u;
   }

   @Nullable
   public ape f() {
      return this.v;
   }
}
