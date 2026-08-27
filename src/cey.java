import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cey(String q, Predicate<ih<bxp>> r, Predicate<ih<bxp>> s, ImmutableSet<cmt> t, ImmutableSet<cwq> u, @Nullable arr v) {
   public static final Predicate<ih<bxp>> a = $$0 -> $$0.a(asr.a);
   public static final cey b = a("none", bxp.a, a, null);
   public static final cey c = a("armorer", bxq.a, ars.zO);
   public static final cey d = a("butcher", bxq.b, ars.zP);
   public static final cey e = a("cartographer", bxq.c, ars.zQ);
   public static final cey f = a("cleric", bxq.d, ars.zR);
   public static final cey g = a("farmer", bxq.e, ImmutableSet.of(cnb.pt, cnb.ps, cnb.ve, cnb.rv), ImmutableSet.of(cws.cC), ars.zS);
   public static final cey h = a("fisherman", bxq.f, ars.zT);
   public static final cey i = a("fletcher", bxq.g, ars.zU);
   public static final cey j = a("leatherworker", bxq.h, ars.zV);
   public static final cey k = a("librarian", bxq.i, ars.zW);
   public static final cey l = a("mason", bxq.j, ars.zX);
   public static final cey m = a("nitwit", bxp.a, bxp.a, null);
   public static final cey n = a("shepherd", bxq.k, ars.zY);
   public static final cey o = a("toolsmith", bxq.l, ars.zZ);
   public static final cey p = a("weaponsmith", bxq.m, ars.Aa);

   @Override
   public String toString() {
      return this.q;
   }

   private static cey a(String $$0, ahf<bxp> $$1, @Nullable arr $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cey a(String $$0, Predicate<ih<bxp>> $$1, Predicate<ih<bxp>> $$2, @Nullable arr $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cey a(String $$0, ahf<bxp> $$1, ImmutableSet<cmt> $$2, ImmutableSet<cwq> $$3, @Nullable arr $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cey a(String $$0, Predicate<ih<bxp>> $$1, Predicate<ih<bxp>> $$2, ImmutableSet<cmt> $$3, ImmutableSet<cwq> $$4, @Nullable arr $$5) {
      return it.a(kd.z, new ahg($$0), new cey($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<ih<bxp>> b() {
      return this.r;
   }

   public Predicate<ih<bxp>> c() {
      return this.s;
   }

   public ImmutableSet<cmt> d() {
      return this.t;
   }

   public ImmutableSet<cwq> e() {
      return this.u;
   }

   @Nullable
   public arr f() {
      return this.v;
   }
}
