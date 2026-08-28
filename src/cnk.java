import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cnk(String q, Predicate<jn<cfq>> r, Predicate<jn<cfq>> s, ImmutableSet<cvk> t, ImmutableSet<dhj> u, @Nullable awd v) {
   public static final Predicate<jn<cfq>> a = $$0 -> $$0.a(axe.a);
   public static final cnk b = a("none", cfq.a, a, null);
   public static final cnk c = a("armorer", cfr.a, awe.Bf);
   public static final cnk d = a("butcher", cfr.b, awe.Bg);
   public static final cnk e = a("cartographer", cfr.c, awe.Bh);
   public static final cnk f = a("cleric", cfr.d, awe.Bi);
   public static final cnk g = a("farmer", cfr.e, ImmutableSet.of(cvt.px, cvt.pw, cvt.vn, cvt.rz), ImmutableSet.of(dhl.cC), awe.Bj);
   public static final cnk h = a("fisherman", cfr.f, awe.Bk);
   public static final cnk i = a("fletcher", cfr.g, awe.Bl);
   public static final cnk j = a("leatherworker", cfr.h, awe.Bm);
   public static final cnk k = a("librarian", cfr.i, awe.Bn);
   public static final cnk l = a("mason", cfr.j, awe.Bo);
   public static final cnk m = a("nitwit", cfq.a, cfq.a, null);
   public static final cnk n = a("shepherd", cfr.k, awe.Bp);
   public static final cnk o = a("toolsmith", cfr.l, awe.Bq);
   public static final cnk p = a("weaponsmith", cfr.m, awe.Br);

   @Override
   public String toString() {
      return this.q;
   }

   private static cnk a(String $$0, alb<cfq> $$1, @Nullable awd $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cnk a(String $$0, Predicate<jn<cfq>> $$1, Predicate<jn<cfq>> $$2, @Nullable awd $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cnk a(String $$0, alb<cfq> $$1, ImmutableSet<cvk> $$2, ImmutableSet<dhj> $$3, @Nullable awd $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cnk a(String $$0, Predicate<jn<cfq>> $$1, Predicate<jn<cfq>> $$2, ImmutableSet<cvk> $$3, ImmutableSet<dhj> $$4, @Nullable awd $$5) {
      return ka.a(lu.x, alc.b($$0), new cnk($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jn<cfq>> b() {
      return this.r;
   }

   public Predicate<jn<cfq>> c() {
      return this.s;
   }

   public ImmutableSet<cvk> d() {
      return this.t;
   }

   public ImmutableSet<dhj> e() {
      return this.u;
   }

   @Nullable
   public awd f() {
      return this.v;
   }
}
