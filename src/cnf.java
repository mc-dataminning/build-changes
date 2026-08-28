import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cnf(String q, Predicate<jn<cfl>> r, Predicate<jn<cfl>> s, ImmutableSet<cvg> t, ImmutableSet<dgv> u, @Nullable awc v) {
   public static final Predicate<jn<cfl>> a = $$0 -> $$0.a(axd.a);
   public static final cnf b = a("none", cfl.a, a, null);
   public static final cnf c = a("armorer", cfm.a, awd.Bf);
   public static final cnf d = a("butcher", cfm.b, awd.Bg);
   public static final cnf e = a("cartographer", cfm.c, awd.Bh);
   public static final cnf f = a("cleric", cfm.d, awd.Bi);
   public static final cnf g = a("farmer", cfm.e, ImmutableSet.of(cvo.px, cvo.pw, cvo.vn, cvo.rz), ImmutableSet.of(dgx.cC), awd.Bj);
   public static final cnf h = a("fisherman", cfm.f, awd.Bk);
   public static final cnf i = a("fletcher", cfm.g, awd.Bl);
   public static final cnf j = a("leatherworker", cfm.h, awd.Bm);
   public static final cnf k = a("librarian", cfm.i, awd.Bn);
   public static final cnf l = a("mason", cfm.j, awd.Bo);
   public static final cnf m = a("nitwit", cfl.a, cfl.a, null);
   public static final cnf n = a("shepherd", cfm.k, awd.Bp);
   public static final cnf o = a("toolsmith", cfm.l, awd.Bq);
   public static final cnf p = a("weaponsmith", cfm.m, awd.Br);

   @Override
   public String toString() {
      return this.q;
   }

   private static cnf a(String $$0, ala<cfl> $$1, @Nullable awc $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cnf a(String $$0, Predicate<jn<cfl>> $$1, Predicate<jn<cfl>> $$2, @Nullable awc $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cnf a(String $$0, ala<cfl> $$1, ImmutableSet<cvg> $$2, ImmutableSet<dgv> $$3, @Nullable awc $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cnf a(String $$0, Predicate<jn<cfl>> $$1, Predicate<jn<cfl>> $$2, ImmutableSet<cvg> $$3, ImmutableSet<dgv> $$4, @Nullable awc $$5) {
      return ka.a(lu.x, alb.b($$0), new cnf($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jn<cfl>> b() {
      return this.r;
   }

   public Predicate<jn<cfl>> c() {
      return this.s;
   }

   public ImmutableSet<cvg> d() {
      return this.t;
   }

   public ImmutableSet<dgv> e() {
      return this.u;
   }

   @Nullable
   public awc f() {
      return this.v;
   }
}
