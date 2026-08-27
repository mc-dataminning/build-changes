import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cjj(String q, Predicate<il<cbu>> r, Predicate<il<cbu>> s, ImmutableSet<cre> t, ImmutableSet<dby> u, @Nullable aul v) {
   public static final Predicate<il<cbu>> a = $$0 -> $$0.a(avm.a);
   public static final cjj b = a("none", cbu.a, a, null);
   public static final cjj c = a("armorer", cbv.a, aum.AC);
   public static final cjj d = a("butcher", cbv.b, aum.AD);
   public static final cjj e = a("cartographer", cbv.c, aum.AE);
   public static final cjj f = a("cleric", cbv.d, aum.AF);
   public static final cjj g = a("farmer", cbv.e, ImmutableSet.of(crm.pv, crm.pu, crm.vj, crm.rx), ImmutableSet.of(dca.cC), aum.AG);
   public static final cjj h = a("fisherman", cbv.f, aum.AH);
   public static final cjj i = a("fletcher", cbv.g, aum.AI);
   public static final cjj j = a("leatherworker", cbv.h, aum.AJ);
   public static final cjj k = a("librarian", cbv.i, aum.AK);
   public static final cjj l = a("mason", cbv.j, aum.AL);
   public static final cjj m = a("nitwit", cbu.a, cbu.a, null);
   public static final cjj n = a("shepherd", cbv.k, aum.AM);
   public static final cjj o = a("toolsmith", cbv.l, aum.AN);
   public static final cjj p = a("weaponsmith", cbv.m, aum.AO);

   @Override
   public String toString() {
      return this.q;
   }

   private static cjj a(String $$0, ajs<cbu> $$1, @Nullable aul $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cjj a(String $$0, Predicate<il<cbu>> $$1, Predicate<il<cbu>> $$2, @Nullable aul $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cjj a(String $$0, ajs<cbu> $$1, ImmutableSet<cre> $$2, ImmutableSet<dby> $$3, @Nullable aul $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cjj a(String $$0, Predicate<il<cbu>> $$1, Predicate<il<cbu>> $$2, ImmutableSet<cre> $$3, ImmutableSet<dby> $$4, @Nullable aul $$5) {
      return iy.a(kr.z, new ajt($$0), new cjj($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<il<cbu>> b() {
      return this.r;
   }

   public Predicate<il<cbu>> c() {
      return this.s;
   }

   public ImmutableSet<cre> d() {
      return this.t;
   }

   public ImmutableSet<dby> e() {
      return this.u;
   }

   @Nullable
   public aul f() {
      return this.v;
   }
}
