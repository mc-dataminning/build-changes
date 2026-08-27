import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cbf(String q, Predicate<hg<bud>> r, Predicate<hg<bud>> s, ImmutableSet<civ> t, ImmutableSet<csq> u, @Nullable aoy v) {
   public static final Predicate<hg<bud>> a = $$0 -> $$0.a(apy.a);
   public static final cbf b = a("none", bud.a, a, null);
   public static final cbf c = a("armorer", bue.a, aoz.yO);
   public static final cbf d = a("butcher", bue.b, aoz.yP);
   public static final cbf e = a("cartographer", bue.c, aoz.yQ);
   public static final cbf f = a("cleric", bue.d, aoz.yR);
   public static final cbf g = a("farmer", bue.e, ImmutableSet.of(cjd.oI, cjd.oH, cjd.ur, cjd.qK), ImmutableSet.of(csr.cC), aoz.yS);
   public static final cbf h = a("fisherman", bue.f, aoz.yT);
   public static final cbf i = a("fletcher", bue.g, aoz.yU);
   public static final cbf j = a("leatherworker", bue.h, aoz.yV);
   public static final cbf k = a("librarian", bue.i, aoz.yW);
   public static final cbf l = a("mason", bue.j, aoz.yX);
   public static final cbf m = a("nitwit", bud.a, bud.a, null);
   public static final cbf n = a("shepherd", bue.k, aoz.yY);
   public static final cbf o = a("toolsmith", bue.l, aoz.yZ);
   public static final cbf p = a("weaponsmith", bue.m, aoz.za);

   @Override
   public String toString() {
      return this.q;
   }

   private static cbf a(String $$0, aet<bud> $$1, @Nullable aoy $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cbf a(String $$0, Predicate<hg<bud>> $$1, Predicate<hg<bud>> $$2, @Nullable aoy $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cbf a(String $$0, aet<bud> $$1, ImmutableSet<civ> $$2, ImmutableSet<csq> $$3, @Nullable aoy $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cbf a(String $$0, Predicate<hg<bud>> $$1, Predicate<hg<bud>> $$2, ImmutableSet<civ> $$3, ImmutableSet<csq> $$4, @Nullable aoy $$5) {
      return ht.a(jd.A, new aeu($$0), new cbf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<hg<bud>> b() {
      return this.r;
   }

   public Predicate<hg<bud>> c() {
      return this.s;
   }

   public ImmutableSet<civ> d() {
      return this.t;
   }

   public ImmutableSet<csq> e() {
      return this.u;
   }

   @Nullable
   public aoy f() {
      return this.v;
   }
}
