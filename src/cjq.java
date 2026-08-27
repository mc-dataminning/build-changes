import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cjq(String q, Predicate<in<cbz>> r, Predicate<in<cbz>> s, ImmutableSet<crn> t, ImmutableSet<dch> u, @Nullable aun v) {
   public static final Predicate<in<cbz>> a = $$0 -> $$0.a(avo.a);
   public static final cjq b = a("none", cbz.a, a, null);
   public static final cjq c = a("armorer", cca.a, auo.AC);
   public static final cjq d = a("butcher", cca.b, auo.AD);
   public static final cjq e = a("cartographer", cca.c, auo.AE);
   public static final cjq f = a("cleric", cca.d, auo.AF);
   public static final cjq g = a("farmer", cca.e, ImmutableSet.of(crv.pv, crv.pu, crv.vj, crv.rx), ImmutableSet.of(dcj.cC), auo.AG);
   public static final cjq h = a("fisherman", cca.f, auo.AH);
   public static final cjq i = a("fletcher", cca.g, auo.AI);
   public static final cjq j = a("leatherworker", cca.h, auo.AJ);
   public static final cjq k = a("librarian", cca.i, auo.AK);
   public static final cjq l = a("mason", cca.j, auo.AL);
   public static final cjq m = a("nitwit", cbz.a, cbz.a, null);
   public static final cjq n = a("shepherd", cca.k, auo.AM);
   public static final cjq o = a("toolsmith", cca.l, auo.AN);
   public static final cjq p = a("weaponsmith", cca.m, auo.AO);

   @Override
   public String toString() {
      return this.q;
   }

   private static cjq a(String $$0, aju<cbz> $$1, @Nullable aun $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cjq a(String $$0, Predicate<in<cbz>> $$1, Predicate<in<cbz>> $$2, @Nullable aun $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cjq a(String $$0, aju<cbz> $$1, ImmutableSet<crn> $$2, ImmutableSet<dch> $$3, @Nullable aun $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cjq a(String $$0, Predicate<in<cbz>> $$1, Predicate<in<cbz>> $$2, ImmutableSet<crn> $$3, ImmutableSet<dch> $$4, @Nullable aun $$5) {
      return ja.a(kt.z, new ajv($$0), new cjq($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<in<cbz>> b() {
      return this.r;
   }

   public Predicate<in<cbz>> c() {
      return this.s;
   }

   public ImmutableSet<crn> d() {
      return this.t;
   }

   public ImmutableSet<dch> e() {
      return this.u;
   }

   @Nullable
   public aun f() {
      return this.v;
   }
}
