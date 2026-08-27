import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cii(String q, Predicate<il<cau>> r, Predicate<il<cau>> s, ImmutableSet<cqf> t, ImmutableSet<daa> u, @Nullable atx v) {
   public static final Predicate<il<cau>> a = $$0 -> $$0.a(auy.a);
   public static final cii b = a("none", cau.a, a, null);
   public static final cii c = a("armorer", cav.a, aty.Au);
   public static final cii d = a("butcher", cav.b, aty.Av);
   public static final cii e = a("cartographer", cav.c, aty.Aw);
   public static final cii f = a("cleric", cav.d, aty.Ax);
   public static final cii g = a("farmer", cav.e, ImmutableSet.of(cqn.pv, cqn.pu, cqn.vi, cqn.rx), ImmutableSet.of(dac.cC), aty.Ay);
   public static final cii h = a("fisherman", cav.f, aty.Az);
   public static final cii i = a("fletcher", cav.g, aty.AA);
   public static final cii j = a("leatherworker", cav.h, aty.AB);
   public static final cii k = a("librarian", cav.i, aty.AC);
   public static final cii l = a("mason", cav.j, aty.AD);
   public static final cii m = a("nitwit", cau.a, cau.a, null);
   public static final cii n = a("shepherd", cav.k, aty.AE);
   public static final cii o = a("toolsmith", cav.l, aty.AF);
   public static final cii p = a("weaponsmith", cav.m, aty.AG);

   @Override
   public String toString() {
      return this.q;
   }

   private static cii a(String $$0, ajg<cau> $$1, @Nullable atx $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cii a(String $$0, Predicate<il<cau>> $$1, Predicate<il<cau>> $$2, @Nullable atx $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cii a(String $$0, ajg<cau> $$1, ImmutableSet<cqf> $$2, ImmutableSet<daa> $$3, @Nullable atx $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cii a(String $$0, Predicate<il<cau>> $$1, Predicate<il<cau>> $$2, ImmutableSet<cqf> $$3, ImmutableSet<daa> $$4, @Nullable atx $$5) {
      return iy.a(ki.z, new ajh($$0), new cii($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<il<cau>> b() {
      return this.r;
   }

   public Predicate<il<cau>> c() {
      return this.s;
   }

   public ImmutableSet<cqf> d() {
      return this.t;
   }

   public ImmutableSet<daa> e() {
      return this.u;
   }

   @Nullable
   public atx f() {
      return this.v;
   }
}
