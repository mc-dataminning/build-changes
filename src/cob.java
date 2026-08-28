import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cob(String q, Predicate<jq<cgh>> r, Predicate<jq<cgh>> s, ImmutableSet<cvx> t, ImmutableSet<die> u, @Nullable awk v) {
   public static final Predicate<jq<cgh>> a = $$0 -> $$0.a(axl.a);
   public static final cob b = a("none", cgh.a, a, null);
   public static final cob c = a("armorer", cgi.a, awl.Bd);
   public static final cob d = a("butcher", cgi.b, awl.Be);
   public static final cob e = a("cartographer", cgi.c, awl.Bf);
   public static final cob f = a("cleric", cgi.d, awl.Bg);
   public static final cob g = a("farmer", cgi.e, ImmutableSet.of(cwf.px, cwf.pw, cwf.vn, cwf.rz), ImmutableSet.of(dig.cC), awl.Bh);
   public static final cob h = a("fisherman", cgi.f, awl.Bi);
   public static final cob i = a("fletcher", cgi.g, awl.Bj);
   public static final cob j = a("leatherworker", cgi.h, awl.Bk);
   public static final cob k = a("librarian", cgi.i, awl.Bl);
   public static final cob l = a("mason", cgi.j, awl.Bm);
   public static final cob m = a("nitwit", cgh.a, cgh.a, null);
   public static final cob n = a("shepherd", cgi.k, awl.Bn);
   public static final cob o = a("toolsmith", cgi.l, awl.Bo);
   public static final cob p = a("weaponsmith", cgi.m, awl.Bp);

   @Override
   public String toString() {
      return this.q;
   }

   private static cob a(String $$0, alh<cgh> $$1, @Nullable awk $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cob a(String $$0, Predicate<jq<cgh>> $$1, Predicate<jq<cgh>> $$2, @Nullable awk $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cob a(String $$0, alh<cgh> $$1, ImmutableSet<cvx> $$2, ImmutableSet<die> $$3, @Nullable awk $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cob a(String $$0, Predicate<jq<cgh>> $$1, Predicate<jq<cgh>> $$2, ImmutableSet<cvx> $$3, ImmutableSet<die> $$4, @Nullable awk $$5) {
      return kd.a(ly.x, ali.b($$0), new cob($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<cgh>> b() {
      return this.r;
   }

   public Predicate<jq<cgh>> c() {
      return this.s;
   }

   public ImmutableSet<cvx> d() {
      return this.t;
   }

   public ImmutableSet<die> e() {
      return this.u;
   }

   @Nullable
   public awk f() {
      return this.v;
   }
}
