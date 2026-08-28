import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cpd(String q, Predicate<jq<che>> r, Predicate<jq<che>> s, ImmutableSet<cxc> t, ImmutableSet<dkd> u, @Nullable awu v) {
   public static final Predicate<jq<che>> a = $$0 -> $$0.a(axv.a);
   public static final cpd b = a("none", che.a, a, null);
   public static final cpd c = a("armorer", chf.a, awv.BO);
   public static final cpd d = a("butcher", chf.b, awv.BP);
   public static final cpd e = a("cartographer", chf.c, awv.BQ);
   public static final cpd f = a("cleric", chf.d, awv.BR);
   public static final cpd g = a("farmer", chf.e, ImmutableSet.of(cxk.qb, cxk.qa, cxk.wl, cxk.sv), ImmutableSet.of(dkf.cK), awv.BS);
   public static final cpd h = a("fisherman", chf.f, awv.BT);
   public static final cpd i = a("fletcher", chf.g, awv.BU);
   public static final cpd j = a("leatherworker", chf.h, awv.BV);
   public static final cpd k = a("librarian", chf.i, awv.BW);
   public static final cpd l = a("mason", chf.j, awv.BX);
   public static final cpd m = a("nitwit", che.a, che.a, null);
   public static final cpd n = a("shepherd", chf.k, awv.BY);
   public static final cpd o = a("toolsmith", chf.l, awv.BZ);
   public static final cpd p = a("weaponsmith", chf.m, awv.Ca);

   @Override
   public String toString() {
      return this.q;
   }

   private static cpd a(String $$0, alo<che> $$1, @Nullable awu $$2) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2);
   }

   private static cpd a(String $$0, Predicate<jq<che>> $$1, Predicate<jq<che>> $$2, @Nullable awu $$3) {
      return a($$0, $$1, $$2, ImmutableSet.of(), ImmutableSet.of(), $$3);
   }

   private static cpd a(String $$0, alo<che> $$1, ImmutableSet<cxc> $$2, ImmutableSet<dkd> $$3, @Nullable awu $$4) {
      return a($$0, $$1x -> $$1x.a($$1), $$1x -> $$1x.a($$1), $$2, $$3, $$4);
   }

   private static cpd a(String $$0, Predicate<jq<che>> $$1, Predicate<jq<che>> $$2, ImmutableSet<cxc> $$3, ImmutableSet<dkd> $$4, @Nullable awu $$5) {
      return kd.a(ma.x, alp.b($$0), new cpd($$0, $$1, $$2, $$3, $$4, $$5));
   }

   public String a() {
      return this.q;
   }

   public Predicate<jq<che>> b() {
      return this.r;
   }

   public Predicate<jq<che>> c() {
      return this.s;
   }

   public ImmutableSet<cxc> d() {
      return this.t;
   }

   public ImmutableSet<dkd> e() {
      return this.u;
   }

   @Nullable
   public awu f() {
      return this.v;
   }
}
