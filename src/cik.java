import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cik(String q, Predicate<il<cav>> r, Predicate<il<cav>> s, ImmutableSet<cqh> t, ImmutableSet<dac> u, @Nullable atx v) {
   public static final Predicate<il<cav>> a = $$0 -> $$0.a(auy.a);
   public static final cik b = a("none", cav.a, a, null);
   public static final cik c = a("armorer", caw.a, aty.Az);
   public static final cik d = a("butcher", caw.b, aty.AA);
   public static final cik e = a("cartographer", caw.c, aty.AB);
   public static final cik f = a("cleric", caw.d, aty.AC);
   public static final cik g = a("farmer", caw.e, ImmutableSet.of(cqp.pv, cqp.pu, cqp.vj, cqp.rx), ImmutableSet.of(dae.cC), aty.AD);
   public static final cik h = a("fisherman", caw.f, aty.AE);
   public static final cik i = a("fletcher", caw.g, aty.AF);
   public static final cik j = a("leatherworker", caw.h, aty.AG);
   public static final cik k = a("librarian", caw.i, aty.AH);
   public static final cik l = a("mason", caw.j, aty.AI);
   public static final cik m = a("nitwit", cav.a, cav.a, null);
   public static final cik n = a("shepherd", caw.k, aty.AJ);
   public static final cik o = a("toolsmith", caw.l, aty.AK);
   public static final cik p = a("weaponsmith", caw.m, aty.AL);

   @Override
   public String toString() {
      return this.q;
   }

   private static cik a(String $$0, ajg<cav> $$1, @Nullable atx $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cik a(String $$0, Predicate<il<cav>> $$1, Predicate<il<cav>> $$2, @Nullable atx $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cik a(String $$0, ajg<cav> $$1, ImmutableSet<cqh> $$2, ImmutableSet<dac> $$3, @Nullable atx $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cik a(String $$0, Predicate<il<cav>> $$1, Predicate<il<cav>> $$2, ImmutableSet<cqh> $$3, ImmutableSet<dac> $$4, @Nullable atx $$5) {
      return iy.a(ki.z, new ajh($$0), new cik($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<il<cav>> b() {
      return this.r;
   }

   public Predicate<il<cav>> c() {
      return this.s;
   }

   public ImmutableSet<cqh> d() {
      return this.t;
   }

   public ImmutableSet<dac> e() {
      return this.u;
   }

   @Nullable
   public atx f() {
      return this.v;
   }
}
